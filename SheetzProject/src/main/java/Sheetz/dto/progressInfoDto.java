package Sheetz.dto;
import lombok.Data;

@Data
public class progressInfoDto {
	private int progPrivNum;//사원증 고유 번호
	private String progDate;//최근 날짜
	private String progJeopardy;//jeopardy 완료 여부
	private String progSimul;//simulation 완료 여부
	private String progChat;//chatbot 완료 여부
}
