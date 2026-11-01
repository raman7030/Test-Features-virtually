package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18080 extends IOException {

    /* JADX INFO: renamed from: ᩸ */
    public final int f53986;

    public C18080(int i, String str) {
        super(m41134(i, str));
        this.f53986 = i;
    }

    public C18080(String str, Exception exc) {
        super(m41134(4, str), exc);
        this.f53986 = 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m41134(int i, String str) {
        String[] strArrM29239 = C12717.m29239(i);
        if (strArrM29239 == null) {
            return C17588.m40053(str, " (UNKNOW SFTP ERROR CODE)");
        }
        StringBuilder sbM21133 = C9179.m21133(str, " (");
        sbM21133.append(strArrM29239[0]);
        sbM21133.append(": ");
        return C10965.m25286(sbM21133, strArrM29239[1], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
