package _04_builder._02_after;


import java.time.LocalDate;

/**
 * Director
 *      - 복잡한 객체를 만드는 구체적인 과정을 숨길 수 있음.
 *
 */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

     public TourPlan cancunTrip() {
         return tourPlanBuilder.title("칸쿤 여행")
                 .nightsAndDays(2, 3)
                 .startDate(LocalDate.of(2023, 10, 9))
                 .whereToStay("리조트")
                 .addPlan(0, "체크인하고 짐 풀기")
                 .addPlan(0, "저녁 식사")
                 .getPlan();
     }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }

}