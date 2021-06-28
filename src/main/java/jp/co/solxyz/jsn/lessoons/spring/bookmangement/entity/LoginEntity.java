package jp.co.solxyz.jsn.lessoons.spring.bookmangement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ログインデータのEntity
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginEntity {

    /** ユーザーID */
    private String userid;

    /** パスワード */
    private String password;
}
