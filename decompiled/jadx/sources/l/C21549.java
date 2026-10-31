package l;

import android.os.Build;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21549 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f69246;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21549(C16773 c16773) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f69246 = c16773;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        this.f69246.m39496(c16560, m25407());
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9841() {
        if (Build.VERSION.SDK_INT == 33 && C11083.m27510() && !C16999.m39883() && !C16999.m39886()) {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(this.f69246.m39741(), new String[0]);
            if (abstractC15440M39866 instanceof C12993) {
                String strM31565 = abstractC15440M39866.mo31566().m31565();
                return strM31565.equalsIgnoreCase("Android/data") || strM31565.equalsIgnoreCase("Android/obb");
            }
        }
        return false;
    }
}
