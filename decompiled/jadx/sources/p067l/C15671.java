package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܰᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4D5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15671 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f44805;

    /* JADX INFO: renamed from: ۧ */
    public static final Charset f44806;

    /* JADX INFO: renamed from: ܽ */
    public static final Charset f44807;

    /* JADX INFO: renamed from: ֫ */
    public static int m35600(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m35601(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Charset.forName("US-ASCII");
        f44807 = Charset.forName(C0233a.f1077D);
        f44806 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f44805 = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC9303.m21516(false, 0, 0, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35602(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
