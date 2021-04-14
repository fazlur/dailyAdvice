import java.util.ArrayList;

public class DailyAdviceTester {

    public static void main(String[] args) {
        DailyAdviceTester run = new DailyAdviceTester();
        run.go();

    }

    private void go(){
        ArrayList<AdviceModel> tester = new ArrayList<AdviceModel>();
        AdviceModel input1 = new AdviceModel("advice");
        tester.add(input1);
        for(int i = 0; i < tester.size(); i++){
            System.out.println("I am in tester: " + tester.get(i));
            System.out.println(input1.getAdvice());
        }

        AdviceGui gui = new AdviceGui();
        gui.writeAdvice();


    }
}
