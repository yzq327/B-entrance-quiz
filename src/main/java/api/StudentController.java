package api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vo.StudentVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class StudentController {

//    @PostMapping("/order/{id}")
//    public ResponseEntity addOrder(@PathVariable int id,
//                                   @RequestBody @Valid Order order) {
//        Optional<ProductPo> optionalProductPo = productService.findById(id);
//        if(!optionalProductPo.isPresent()){
//            return ResponseEntity.badRequest().build();
//        }
//        OrderPo orderPo = orderService.save(order, optionalProductPo.get());
//        return ResponseEntity.ok(getOrderVo(orderPo));
//    }
//    private OrderVo getOrderVo(OrderPo orderPo) {
//        return OrderVo.builder().id(orderPo.getId())
//                .name(orderPo.getName())
//                .amount(orderPo.getAmount())
//                .price(orderPo.getPrice())
//                .unit(orderPo.getUnit())
//                .build();
//    }

    @GetMapping("/orders")
    public List<StudentVo> getOrders() {
//        List<StudentVo> orderVos = orderService.findAll()；
        StudentVo studentVo1 = new StudentVo(1,"成吉思汗");
        StudentVo studentVo2 = new StudentVo(2,"鲁班七号");
        StudentVo studentVo3 = new StudentVo(3,"太乙真人");
        StudentVo studentVo4 = new StudentVo(4,"钟无艳");
        StudentVo studentVo5 = new StudentVo(5,"花木兰");
        StudentVo studentVo6 = new StudentVo(6,"雅典娜");
        StudentVo studentVo7 = new StudentVo(7,"芈月");
        StudentVo studentVo8 = new StudentVo(8,"白起");
        StudentVo studentVo9 = new StudentVo(9,"刘禅");
        StudentVo studentVo10 = new StudentVo(10,"庄周");
        StudentVo studentVo11 = new StudentVo(11,"马超");
        StudentVo studentVo12 = new StudentVo(12,"刘备");
        StudentVo studentVo13 = new StudentVo(13,"哪吒");
        StudentVo studentVo14 = new StudentVo(14,"大乔");
        StudentVo studentVo15 = new StudentVo(15,"蔡文姬");
        List<StudentVo>  orderPoshh = new ArrayList<>();
        orderPoshh.add(studentVo1);
        orderPoshh.add(studentVo2);
        orderPoshh.add(studentVo3);
        orderPoshh.add(studentVo4);
        orderPoshh.add(studentVo5);
        orderPoshh.add(studentVo6);
        orderPoshh.add(studentVo7);
        orderPoshh.add(studentVo8);
        orderPoshh.add(studentVo9);
        orderPoshh.add(studentVo10);
        orderPoshh.add(studentVo11);
        orderPoshh.add(studentVo12);
        orderPoshh.add(studentVo13);
        orderPoshh.add(studentVo14);
        orderPoshh.add(studentVo15);
        return orderPoshh;
    }

}
