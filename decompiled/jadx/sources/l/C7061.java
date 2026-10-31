package l;

import com.alipay.sdk.m.w.a;
import java.nio.Buffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: l.ۜ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7061 extends AbstractC21173 {
    public static final C7061 a;

    static {
        int i = AbstractC17644.a;
        a = new C7061(a.D, new String[]{"UTF8", "unicode-1-1-utf-8"});
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new C14821(this);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new C23994(this);
    }

    public static final void l(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }
}
