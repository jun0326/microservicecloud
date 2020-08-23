package cn.jun.springcloud.entity;

import lombok.*;
import lombok.experimental.Accessors;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
//@Getter
//@Setter
public class Dept implements Serializable{

    private Long deptno;
    private String dname;
    private String db_source;

    public static void main(String[] args) {
        Dept dept = new Dept().setDeptno(1L).setDb_source("小小").setDb_source("1");
        System.out.println(dept);
    }

}
