package api;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.StudentService;
import vo.StudentVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

//    @PostMapping("/students")
//    public ResponseEntity addOrder(@RequestBody @Valid Student student) {
//        Optional<StudentPo> optionalProductPo = studentService.findById(student.getId());
//        if(!optionalProductPo.isPresent()){
//            return ResponseEntity.badRequest().build();
//        }
//        OrderPo orderPo = studentService.save(student, optionalProductPo.get());
//        return ResponseEntity.ok(getOrderVo(orderPo));
//    }
//    private StudentVo getOrderVo(StudentPo studentPo) {
//        return StudentPo.builder().id(studentPo.getId())
//                .name(studentPo.getName())
//                .build();
//    }

    @GetMapping("/students")
    public List<StudentVo> getOrders() {
//        List<StudentVo> studengVo = studentService.findAll()；
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
