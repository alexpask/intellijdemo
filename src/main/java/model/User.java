package model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alexpask on 15/07/2017.
 */
@Data
@Slf4j
@NoArgsConstructor
public class User {
    private Long id;
    private String first;
    private String last;
    private Date dob;
    Boolean active;

    public void test() {

        val test = new ArrayList<String>();
        test.add("Hello world");
    }
}
