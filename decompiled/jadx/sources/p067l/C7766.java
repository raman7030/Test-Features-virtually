package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۚ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87V9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7766 extends C10448 {

    /* JADX INFO: renamed from: ۙ */
    public static final byte[] f20380;

    static {
        byte[] bArr = C20764.f65273;
        f20380 = C20764.m46886("direct-streamlocal@openssh.com", StandardCharsets.UTF_8);
    }

    public C7766() {
        this.f66549 = f20380;
        this.f66561 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66550 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66562 = 16384;
    }

    @Override // p067l.C10448, p067l.AbstractC21178
    /* JADX INFO: renamed from: ܿ */
    public final C10054 mo17919() {
        this.f66560.f25608.m49100().getClass();
        throw new RuntimeException("socketPath must be set");
    }
}
