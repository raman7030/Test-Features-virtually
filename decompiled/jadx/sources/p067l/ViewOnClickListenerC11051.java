package p067l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11051 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30602;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30603;

    public /* synthetic */ ViewOnClickListenerC11051(int i, Object obj) {
        this.f30602 = i;
        this.f30603 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f30602;
        Object obj = this.f30603;
        switch (i) {
            case 0:
                ((ActivityC4030) obj).f8826.m39755();
                break;
            case 1:
                C12096 c12096 = (C12096) obj;
                String string = ((TextView) view).getText().toString();
                int iM32508 = c12096.m32508();
                int iM32512 = c12096.m32512();
                if (iM32508 > iM32512) {
                    iM32512 = iM32508;
                    iM32508 = iM32512;
                }
                c12096.m32500().replace(iM32508, iM32512, string);
                c12096.mo27941(string.length() + iM32508);
                break;
            case 2:
                C4073.m8163((C4073) obj);
                break;
            case 3:
                int i2 = AbstractC8202.f21770;
                ((C24164) obj).m53442();
                break;
            default:
                int i3 = ActivityC8301.f22173;
                ((ActivityC8301) obj).finish();
                break;
        }
    }
}
