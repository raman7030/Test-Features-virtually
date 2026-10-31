package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3069 extends C20500 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11536 f9628;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3069(ActivityC11536 activityC11536) {
        super(true);
        this.f9628 = activityC11536;
    }

    @Override // l.C20500, l.InterfaceC21206
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo9386(View view, String str) {
        if (str.startsWith("action://points-redemption/")) {
            try {
                int i = Integer.parseInt(str.substring(27));
                ActivityC11536 activityC11536 = this.f9628;
                C4583 c4583 = ActivityC11536.f34441;
                C12241 c12241 = new C12241(activityC11536, activityC11536, i);
                c12241.m31258(R.string.MT_Protector);
                c12241.m31256(R.string.MT_Protector);
                c12241.m31250((CharSequence) String.valueOf(i));
                c12241.m31276(2);
                c12241.m31268(4);
                c12241.m31281();
                c12241.m31266(true);
            } catch (Exception unused) {
            }
            return true;
        }
        return super.mo9386(view, str);
    }
}
