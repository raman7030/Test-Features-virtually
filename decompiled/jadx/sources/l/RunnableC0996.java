package l;

import android.widget.CheckBox;
import android.widget.RadioButton;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0996 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f3708;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC22163 f3710;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3711;

    public /* synthetic */ RunnableC0996(DialogInterfaceOnClickListenerC22163 dialogInterfaceOnClickListenerC22163, boolean z, boolean z2, C16560 c16560) {
        this.f3710 = dialogInterfaceOnClickListenerC22163;
        this.f3711 = z;
        this.f3709 = z2;
        this.f3708 = c16560;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnClickListenerC22163 dialogInterfaceOnClickListenerC22163 = this.f3710;
        AbstractC3577 abstractC3577 = dialogInterfaceOnClickListenerC22163.f71932;
        String str = dialogInterfaceOnClickListenerC22163.f71934;
        CheckBox checkBox = dialogInterfaceOnClickListenerC22163.f71931;
        RadioButton[] radioButtonArr = dialogInterfaceOnClickListenerC22163.f71929;
        CheckBox checkBox2 = dialogInterfaceOnClickListenerC22163.f71928;
        if (this.f3711) {
            checkBox2.setVisibility(0);
            Integer numM20121 = C7489.m20121(dialogInterfaceOnClickListenerC22163.f71933);
            if (numM20121 != null) {
                checkBox2.setChecked(true);
                radioButtonArr[C7489.m20112(numM20121.intValue())].callOnClick();
                checkBox.setChecked(C7489.m20122(numM20121.intValue()));
                return;
            }
            if (this.f3709) {
                HashMap map = C19890.f64282;
                if (map.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num = (Integer) map.get(str);
                    C11003.requireNonNull(num);
                    int iIntValue = num.intValue();
                    radioButtonArr[C7489.m20112(iIntValue)].callOnClick();
                    checkBox.setChecked(C7489.m20122(iIntValue));
                    return;
                }
            }
            if (abstractC3577 != null) {
                HashMap map2 = abstractC3577.f11355;
                if (map2.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num2 = (Integer) map2.get(str);
                    C11003.requireNonNull(num2);
                    int iIntValue2 = num2.intValue();
                    radioButtonArr[C7489.m20112(iIntValue2)].callOnClick();
                    checkBox.setChecked(C7489.m20122(iIntValue2));
                    return;
                }
            }
            checkBox2.setChecked(false);
        } else {
            checkBox2.setVisibility(8);
            checkBox2.setChecked(false);
        }
        C16560 c16560 = this.f3708;
        radioButtonArr[c16560.m39064() ? C19890.f64283 : C19890.f64285].callOnClick();
        checkBox.setChecked(c16560.m39064() ? C19890.f64284 : C19890.f64281);
    }
}
