public class ClassLoaderPractice {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderPractice.class.getClassLoader();

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());  // 부모가 있긴 있는데, Native 코드로 구현돼있어서 안보임.

        // 클래스 읽어줘 -> 최고조상에게 부탁 -> 그다음 -> 그다음 ... -> 본인 -> 못읽으면 -> ClassNotFoundException 발생
        // 보통 의존성 추가 안했을 때 발생함

        // 링크

        // Prepare : 메모리 준비 과정

        // Resolve : 심볼릭 레퍼런스 -> 실제 레퍼런스로 교체 (Optional) - 사용할 때 발생할 수도 있음.

        // 아래의 참조는 링크 과정에서는 "심볼릭 레퍼런스"형태로 관리된다.
        // 즉, 실제 레퍼런스를 갖고있지 않다. (논리적 레퍼런스)
        // Resolve 하여 심볼릭 레퍼런스를 실제 레퍼런스로 교체하는데, 클래스 로더 상에서 수행될 수도 있고, 아닐 수도 있다.
        SymbolicReference symbolicReference = new SymbolicReference();

    }

    // static 필드는 클래스 로더에서 전부 초기화 된다. (할당)
    static String name = "kim";

}
