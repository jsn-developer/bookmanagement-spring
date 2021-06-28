package jp.co.solxyz.jsn.lessoons.spring.bookmangement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部署情報Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentEntity {

    /** ID */
    private int id;

    /** 値 */
    private String value;
}
