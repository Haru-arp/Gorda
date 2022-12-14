package com.ssafy.gorda.dto.controllerdto.response;

import com.ssafy.gorda.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginUserResponseDto {

    private String userIdx;
    private String userAccount;
    private String userNickname;
    private double userAmount;
    private int userScore;
    private int userRole;

    public LoginUserResponseDto(User user) {

        this.userIdx = user.getUserIdx();
        this.userAccount = user.getUserAccount();
        this.userNickname = user.getUserNickname();
        this.userAmount = user.getUserAmount();
        this.userScore = user.getUserScore();
        this.userRole = user.getUserRole();

    }

}
