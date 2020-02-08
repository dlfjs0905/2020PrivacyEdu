package Sheetz.dto;

import lombok.Data;//getter, setter 메소드를 어노테이션들을 이용해서 자동으로 만들어주는 라이브러리

@Data
public class userInfoDto {
	private int userInfoNum;//사원증 고유 번호
	private String userPassword;//직원 비밀번호
}
