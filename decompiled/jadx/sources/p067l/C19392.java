package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.ᩳ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19392 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m44141(C8838 c8838) {
        Context context = c8838.getContext();
        if (!(context instanceof AbstractActivityC5549)) {
            return true;
        }
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) context;
        return (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) ? false : true;
    }
}
