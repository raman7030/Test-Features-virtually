package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۗۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5360 extends AbstractC21454 {

    /* JADX INFO: renamed from: ۜ */
    public String f12636 = "vt100";

    /* JADX INFO: renamed from: ᩳ */
    public int f12639 = 80;

    /* JADX INFO: renamed from: ᩻ */
    public int f12641 = 24;

    /* JADX INFO: renamed from: ᩷ */
    public int f12640 = 640;

    /* JADX INFO: renamed from: ܳ */
    public int f12637 = 480;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f12638 = C20764.f65273;

    /* JADX INFO: renamed from: ֫ */
    public final void m11614(String str) {
        this.f12636 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11613(int i, int i2, int i3, int i4) {
        this.f12639 = i;
        this.f12641 = i2;
        this.f12640 = i3;
        this.f12637 = i4;
    }

    @Override // p067l.AbstractC21454
    /* JADX INFO: renamed from: ֫ */
    public final void mo11615(C9383 c9383, AbstractC21178 abstractC21178) {
        super.mo11615(c9383, abstractC21178);
        C17823 c17823 = new C17823();
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 98);
        c17823.m40459(abstractC21178.f66555);
        byte[] bArr = C20764.f65273;
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470("pty-req".getBytes(charset));
        c17823.m40448(m48591() ? (byte) 1 : (byte) 0);
        c17823.m40470(C20764.m46886(this.f12636, charset));
        c17823.m40459(this.f12639);
        c17823.m40459(this.f12641);
        c17823.m40459(this.f12640);
        c17823.m40459(this.f12637);
        c17823.m40470(this.f12638);
        m48589(c10054);
    }
}
