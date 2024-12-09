import java.time.LocalDate;

public class test {

    public static void main(String[] args) {
        // A期間: 6月1日～6月30日
        LocalDate aStart = LocalDate.of(2024, 6, 1);
        LocalDate aEnd = LocalDate.of(2024, 6, 30);

        // B期間: 5月20日～7月20日
        LocalDate bStart = LocalDate.of(2024, 5, 20);
        LocalDate bEnd = LocalDate.of(2024, 7, 30);

        // 期間が重複しているか判定
        if (isOverlap(aStart, aEnd, bStart, bEnd)) {
            System.out.println("A期間とB期間は重複しています。");
        } else {
            System.out.println("A期間とB期間は重複していません。");
        }
    }

    // 期間が重複しているかを判定するメソッド
    public static boolean isOverlap(LocalDate aStart, LocalDate aEnd, LocalDate bStart, LocalDate bEnd) {
        // A期間の終了日がB期間の開始日より前か、B期間の終了日がA期間の開始日より前なら重複していない
        return !(aEnd.isBefore(bStart) || bEnd.isBefore(aStart));
    }
}
