package p067l;

import android.widget.CheckBox;
import android.widget.RadioButton;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3315 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C18107 f6483;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ boolean f6484;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnClickListenerC23432 f6485;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f6486;

    public /* synthetic */ RunnableC3315(DialogInterfaceOnClickListenerC23432 dialogInterfaceOnClickListenerC23432, boolean z, boolean z2, C18107 c18107) {
        this.f6485 = dialogInterfaceOnClickListenerC23432;
        this.f6486 = z;
        this.f6484 = z2;
        this.f6483 = c18107;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnClickListenerC23432 dialogInterfaceOnClickListenerC23432 = this.f6485;
        AbstractC5769 abstractC5769 = dialogInterfaceOnClickListenerC23432.f74654;
        String str = dialogInterfaceOnClickListenerC23432.f74656;
        CheckBox checkBox = dialogInterfaceOnClickListenerC23432.f74653;
        RadioButton[] radioButtonArr = dialogInterfaceOnClickListenerC23432.f74651;
        CheckBox checkBox2 = dialogInterfaceOnClickListenerC23432.f74650;
        if (this.f6486) {
            checkBox2.setVisibility(0);
            Integer numM22097 = C9486.m22097(dialogInterfaceOnClickListenerC23432.f74655);
            if (numM22097 != null) {
                checkBox2.setChecked(true);
                radioButtonArr[C9486.m22088(numM22097.intValue())].callOnClick();
                checkBox.setChecked(C9486.m22098(numM22097.intValue()));
                return;
            }
            if (this.f6484) {
                HashMap map = C21272.f66918;
                if (map.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num = (Integer) map.get(str);
                    C12826.requireNonNull(num);
                    int iIntValue = num.intValue();
                    radioButtonArr[C9486.m22088(iIntValue)].callOnClick();
                    checkBox.setChecked(C9486.m22098(iIntValue));
                    return;
                }
            }
            if (abstractC5769 != null) {
                HashMap map2 = abstractC5769.f14160;
                if (map2.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num2 = (Integer) map2.get(str);
                    C12826.requireNonNull(num2);
                    int iIntValue2 = num2.intValue();
                    radioButtonArr[C9486.m22088(iIntValue2)].callOnClick();
                    checkBox.setChecked(C9486.m22098(iIntValue2));
                    return;
                }
            }
            checkBox2.setChecked(false);
        } else {
            checkBox2.setVisibility(8);
            checkBox2.setChecked(false);
        }
        C18107 c18107 = this.f6483;
        radioButtonArr[c18107.m41290() ? C21272.f66919 : C21272.f66921].callOnClick();
        checkBox.setChecked(c18107.m41290() ? C21272.f66920 : C21272.f66917);
    }
}
