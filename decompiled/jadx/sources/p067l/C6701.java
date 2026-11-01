package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97YR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6701 extends AbstractC21454 {

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f17379;

    public C6701(byte[] bArr) {
        this.f17379 = bArr;
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
        c17823.m40470("exec".getBytes(StandardCharsets.UTF_8));
        c17823.m40448(m48591() ? (byte) 1 : (byte) 0);
        c17823.m40449(this.f17379.length + 4);
        c17823.m40470(this.f17379);
        m48589(c10054);
    }
}
