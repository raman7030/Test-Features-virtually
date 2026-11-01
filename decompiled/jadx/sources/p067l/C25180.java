package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩻᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FL */
/* JADX INFO: loaded from: classes2.dex */
public final class C25180 extends C18158 {

    /* JADX INFO: renamed from: ۜ */
    public byte f80545;

    /* JADX INFO: renamed from: ܳ */
    public EnumC23366 f80546;

    /* JADX INFO: renamed from: ܿ */
    public long f80547;

    /* JADX INFO: renamed from: ᩷ */
    public EnumSet f80548;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f80549;

    public C25180() {
    }

    public C25180(EnumC23366 enumC23366, EnumSet enumSet, EnumSet enumSet2) {
        super(enumC23366, EnumC24036.SMB2_SESSION_SETUP);
        this.f80546 = enumC23366;
        this.f80545 = (byte) C16873.m38438(enumSet);
        this.f80547 = C16873.m38438(enumSet2);
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        c2460.m28111(this.f54223);
        this.f80546.m52019();
        c2460.m28100((byte) 0);
        c2460.m28100(this.f80545);
        c2460.m28113(this.f80547 & 255);
        c2460.m3477();
        c2460.m28111(88);
        byte[] bArr = this.f80549;
        c2460.m28111(bArr != null ? bArr.length : 0);
        c2460.m28118(0L);
        byte[] bArr2 = this.f80549;
        if (bArr2 != null) {
            c2460.m28102(bArr2.length, bArr2);
        }
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ۧ */
    public final void mo9145(C2460 c2460) throws C14862 {
        byte[] bArr;
        c2460.m28125();
        this.f80548 = C16873.m38439(c2460.m28125(), EnumC16462.class);
        int iM28125 = c2460.m28125();
        int iM28126 = c2460.m28125();
        if (iM28126 > 0) {
            c2460.m28122(iM28125);
            bArr = new byte[iM28126];
            c2460.m28112(iM28126, bArr);
        } else {
            bArr = new byte[0];
        }
        this.f80549 = bArr;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumSet m55246() {
        return this.f80548;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55244(byte[] bArr) {
        this.f80549 = bArr;
    }

    /* JADX INFO: renamed from: ۜ */
    public final byte[] m55245() {
        return this.f80549;
    }
}
