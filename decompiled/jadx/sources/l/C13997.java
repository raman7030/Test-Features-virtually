package l;

import com.alipay.sdk.m.w.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܰᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4D5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13997 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41722;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Charset f41723;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Charset f41724;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33480(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33481(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Charset.forName("US-ASCII");
        f41724 = Charset.forName(a.D);
        f41723 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f41722 = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC7297.m19548(false, 0, 0, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33482(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
