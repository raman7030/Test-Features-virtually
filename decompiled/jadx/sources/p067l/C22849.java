package p067l;

import android.os.Build;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C22849 extends AbstractC11994 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C18310 f71948;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22849(C18310 c18310) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f71948 = c18310;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        this.f71948.m41732(c18107, m27427());
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo11888() {
        if (Build.VERSION.SDK_INT == 33 && C12902.m29572() && !C18524.m42126() && !C18524.m42129()) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(this.f71948.m41982(), new String[0]);
            if (abstractC17043M42109 instanceof C14717) {
                String strM33650 = abstractC17043M42109.mo33651().m33650();
                return strM33650.equalsIgnoreCase("Android/data") || strM33650.equalsIgnoreCase("Android/obb");
            }
        }
        return false;
    }
}
