package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97YR */
/* JADX INFO: loaded from: classes3.dex */
public final class C4559 extends AbstractC20082 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f14550;

    public C4559(byte[] bArr) {
        this.f14550 = bArr;
    }

    @Override // l.AbstractC20082
    /* JADX INFO: renamed from: ֫ */
    public final void mo9572(C7381 c7381, AbstractC19791 abstractC19791) {
        super.mo9572(c7381, abstractC19791);
        C16261 c16261 = new C16261();
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 98);
        c16261.m38245(abstractC19791.f63918);
        byte[] bArr = C19356.f62660;
        c16261.m38256("exec".getBytes(StandardCharsets.UTF_8));
        c16261.m38234(m46275() ? (byte) 1 : (byte) 0);
        c16261.m38235(this.f14550.length + 4);
        c16261.m38256(this.f14550);
        m46273(c8087);
    }
}
