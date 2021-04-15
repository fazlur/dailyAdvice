import advice.app.view.AdviceView;
import advice.domain.AdviceModel;

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

    }
}
