package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String storeId;
    private String menuId;
    private Integer qty;
    private String status;
    private String address;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
