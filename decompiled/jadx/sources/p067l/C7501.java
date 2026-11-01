package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ۚܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7501 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f19648;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC22924 f19649;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ String f19650;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ String f19651;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7501(ViewOnClickListenerC22924 viewOnClickListenerC22924, AbstractActivityC5549 abstractActivityC5549, String str, String str2, String str3) {
        super(abstractActivityC5549, -1);
        this.f19649 = viewOnClickListenerC22924;
        this.f19651 = str;
        this.f19650 = str2;
        this.f19648 = str3;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String str = this.f19650;
        ViewOnClickListenerC22924 viewOnClickListenerC22924 = this.f19649;
        String strM33346 = m33346();
        String str2 = this.f19651;
        if (!strM33346.startsWith(str2)) {
            m33337(C0708d.f2599O);
            return;
        }
        try {
            String str3 = str + "/" + str2 + C22999.m51348(strM33346.substring(str2.length()), viewOnClickListenerC22924.f72135.m47143(str)).m51374();
            if (viewOnClickListenerC22924.f72135.m47134(str3)) {
                m33349(R.string.MT_Protector);
                return;
            }
            try {
                viewOnClickListenerC22924.f72135.m47115(str3, this.f19648);
                viewOnClickListenerC22924.m51238();
                viewOnClickListenerC22924.m51239(str3);
                m33348();
            } catch (Exception e) {
                viewOnClickListenerC22924.f72130.m13320((Throwable) e);
            }
        } catch (Exception e2) {
            viewOnClickListenerC22924.f72130.m13320((Throwable) e2);
        }
    }
}
