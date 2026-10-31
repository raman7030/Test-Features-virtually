package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16532 extends IOException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f50807;

    public C16532(int i, String str) {
        super(m38908(i, str));
        this.f50807 = i;
    }

    public C16532(String str, Exception exc) {
        super(m38908(4, str), exc);
        this.f50807 = 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38908(int i, String str) {
        String[] strArrM27194 = C10889.m27194(i);
        if (strArrM27194 == null) {
            return C16014.m37867(str, " (UNKNOW SFTP ERROR CODE)");
        }
        StringBuilder sbM19190 = C7166.m19190(str, " (");
        sbM19190.append(strArrM27194[0]);
        sbM19190.append(": ");
        return C9045.m23341(sbM19190, strArrM27194[1], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
