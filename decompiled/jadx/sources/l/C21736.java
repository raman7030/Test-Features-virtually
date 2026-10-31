package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩸ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes.dex */
public final class C21736 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f69703 = Charset.forName(a.D);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49060(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM31106 = C12803.m31106("size=", " offset=", j);
            sbM31106.append(j2);
            sbM31106.append(" byteCount=");
            sbM31106.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM31106.toString());
        }
    }
}
