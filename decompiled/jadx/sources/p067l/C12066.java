package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۤۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12066 extends AbstractC21454 {

    /* JADX INFO: renamed from: ᩳ */
    public String f33624 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m27635(C9383 c9383, C18692 c18692, String str, boolean z) {
        m48590(z);
        this.f33624 = str;
        super.mo11615(c9383, c18692);
        C17823 c17823 = new C17823();
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 98);
        c17823.m40459(c18692.f66555);
        byte[] bArr = C20764.f65273;
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470("subsystem".getBytes(charset));
        c17823.m40448(m48591() ? (byte) 1 : (byte) 0);
        c17823.m40470(C20764.m46886(this.f33624, charset));
        m48589(c10054);
    }
}
