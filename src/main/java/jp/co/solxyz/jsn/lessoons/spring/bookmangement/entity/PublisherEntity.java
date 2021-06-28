package jp.co.solxyz.jsn.lessoons.spring.bookmangement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 出版社のEntity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublisherEntity {

    /** ID */
    private int id;

    /** 値 */
    private String value;

}
