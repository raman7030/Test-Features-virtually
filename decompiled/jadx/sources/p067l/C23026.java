package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩸ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes.dex */
public final class C23026 {

    /* JADX INFO: renamed from: ֫ */
    public static final Charset f72410 = Charset.forName(C0233a.f1077D);

    /* JADX INFO: renamed from: ֫ */
    public static void m51409(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM33191 = C14536.m33191("size=", " offset=", j);
            sbM33191.append(j2);
            sbM33191.append(" byteCount=");
            sbM33191.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM33191.toString());
        }
    }
}
