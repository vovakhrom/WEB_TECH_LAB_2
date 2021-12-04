package by.bsuir.wt.lab2.service.impl;

import by.bsuir.wt.lab2.dao.ApplianceDAO;
import by.bsuir.wt.lab2.dao.DAOFactory;
import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import by.bsuir.wt.lab2.service.ApplianceService;
import by.bsuir.wt.lab2.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();


        return applianceDAO.find(criteria);
    }

    @Override
    public Appliance findCheapest(String groupName) {
        List<Appliance> appliances;
        if(groupName.equals("")){
            appliances=find(new Criteria(""));
        }else {
            appliances=find(new Criteria(groupName));
        }
        if(appliances==null){
            return null;
        }
        int indexOfMin=0;
        double min=appliances.get(0).getPrice();
        for (int i = 1; i <appliances.size(); i++) {
            if(appliances.get(i).getPrice()<min){
                min=appliances.get(i).getPrice();
                indexOfMin=i;
            }
        }
        return appliances.get(indexOfMin);
    }
}
