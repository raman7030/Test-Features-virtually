package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5285 extends C21852 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ActivityC13332 f12431;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5285(ActivityC13332 activityC13332) {
        super(true);
        this.f12431 = activityC13332;
    }

    @Override // p067l.C21852, p067l.InterfaceC22523
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11428(View view, String str) {
        if (str.startsWith("action://points-redemption/")) {
            try {
                int i = Integer.parseInt(str.substring(27));
                ActivityC13332 activityC13332 = this.f12431;
                C6724 c6724 = ActivityC13332.f37438;
                C14002 c14002 = new C14002(activityC13332, activityC13332, i);
                c14002.m33344(R.string.MT_Protector);
                c14002.m33342(R.string.MT_Protector);
                c14002.m33336((CharSequence) String.valueOf(i));
                c14002.m33362(2);
                c14002.m33354(4);
                c14002.m33367();
                c14002.m33352(true);
            } catch (Exception unused) {
            }
            return true;
        }
        return super.mo11428(view, str);
    }
}
