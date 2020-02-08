package Sheetz.dto;

import lombok.Data;

@Data

public class sheetzEmployeeInfoDto {
	private int empPrivNum;//사원증 고유 번호
	private String empName;//직원 성명
	private String empDepartment;//직원 부서
	private String empPass;//교육 이수 여부
}
