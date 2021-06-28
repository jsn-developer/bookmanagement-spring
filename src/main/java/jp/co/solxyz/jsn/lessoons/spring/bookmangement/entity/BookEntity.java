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

    private String id;

    private String name;

    private long price;
}
