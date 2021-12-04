package by.bsuir.wt.lab2.main;

import java.util.List;
import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import by.bsuir.wt.lab2.entity.criteria.SearchCriteria.Oven;
import by.bsuir.wt.lab2.entity.criteria.SearchCriteria.TabletPC;
import by.bsuir.wt.lab2.entity.criteria.SearchCriteria.VacuumCleaner;
import by.bsuir.wt.lab2.service.ApplianceService;
import by.bsuir.wt.lab2.service.ServiceFactory;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();
        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.PRICE.toString(), 15);
        List<Appliance> appliances = service.find(criteriaOven);

        int i;
        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        System.out.println();
        criteriaOven.add(Oven.DEPTH.toString(), 80);
        appliances = service.find(criteriaOven);

        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        System.out.println();
        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
        appliances = service.find(criteriaTabletPC);

        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        System.out.println();
        System.out.println("Vacuum cleaners:");
        appliances = service.find(new Criteria(VacuumCleaner.class.getSimpleName()));

        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        System.out.println("Cheapest appliance:");
        PrintApplianceInfo.print(service.findCheapest(""));
        System.out.println("Cheapest oven:");
        PrintApplianceInfo.print(service.findCheapest(Oven.class.getSimpleName()));
    }
}
