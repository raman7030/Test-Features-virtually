package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ᩳ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17912 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m41893(C6807 c6807) {
        Context context = c6807.getContext();
        if (!(context instanceof AbstractActivityC3346)) {
            return true;
        }
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) context;
        return (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) ? false : true;
    }
}
