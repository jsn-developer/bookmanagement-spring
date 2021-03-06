package jp.co.solxyz.jsn.lessoons.spring.bookmangement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 書籍データのEntity
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    /** ID */
    private String id;

    /** 書籍名 */
    private String name;

    /** 価格 */
    private long price;

}
