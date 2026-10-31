package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۚ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87V9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5679 extends C8501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f17533;

    static {
        byte[] bArr = C19356.f62660;
        f17533 = C19356.m44592("direct-streamlocal@openssh.com", StandardCharsets.UTF_8);
    }

    public C5679() {
        this.f63912 = f17533;
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
    }

    @Override // l.C8501, l.AbstractC19791
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8087 mo15984() {
        this.f63923.f22696.m46777().getClass();
        throw new RuntimeException("socketPath must be set");
    }
}
