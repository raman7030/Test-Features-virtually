package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۤۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10204 extends AbstractC20082 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f30663 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25613(C7381 c7381, C17176 c17176, String str, boolean z) {
        m46274(z);
        this.f30663 = str;
        super.mo9572(c7381, c17176);
        C16261 c16261 = new C16261();
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 98);
        c16261.m38245(c17176.f63918);
        byte[] bArr = C19356.f62660;
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256("subsystem".getBytes(charset));
        c16261.m38234(m46275() ? (byte) 1 : (byte) 0);
        c16261.m38256(C19356.m44592(this.f30663, charset));
        m46273(c8087);
    }
}
