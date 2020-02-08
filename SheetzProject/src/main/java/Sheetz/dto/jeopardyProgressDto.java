package Sheetz.dto;

import lombok.Data;

@Data
public class jeopardyProgressDto {
	private int jeoPrivNum;//사원증 고유 번호
	private int cat1;//category1 총합
	private int cat2;//category2 총합
	private int cat3;//category3 총합
	private int cat4;//category4 총합
	private int cat5;//category5 총합
}
