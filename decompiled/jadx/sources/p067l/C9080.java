package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.Buffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: l.ۜ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9080 extends AbstractC22492 {

    /* JADX INFO: renamed from: a */
    public static final C9080 f24616a;

    static {
        int i = AbstractC19138.f57143a;
        f24616a = new C9080(C0233a.f1077D, new String[]{"UTF8", "unicode-1-1-utf-8"});
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new C16455(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new C25173(this);
    }

    /* JADX INFO: renamed from: l */
    public static final void m21000l(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }
}
