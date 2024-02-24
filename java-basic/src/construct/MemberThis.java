package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this는 구분을 위해 사용하는 것
        // 명확하게 작성을 하기위해 this를 작성해도되나, 코딩 스타일에 따라... (생략하는게 깔끔하긴 함)
        // IDE에서 색깔로 구분을 해주기 때문.
        nameField = nameParameter;
    }
}
