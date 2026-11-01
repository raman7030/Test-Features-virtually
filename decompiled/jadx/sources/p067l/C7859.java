package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۛۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9WB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7859 implements InterfaceC18587 {

    /* JADX INFO: renamed from: ܳ */
    public static final InterfaceC4410 f20604 = C13128.m30022(C7859.class);

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f20605 = 0;

    /* JADX INFO: renamed from: ֫ */
    public MessageDigest f20606;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f20607;

    /* JADX INFO: renamed from: ܽ */
    public int f20608;

    /* JADX INFO: renamed from: ᩳ */
    public int f20609;

    public C7859(byte[] bArr, int i) {
        this.f20606 = C6478.m14843();
        this.f20607 = bArr;
        this.f20608 = 0;
        InterfaceC4410 interfaceC4410 = f20604;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("macSigningKey:");
            interfaceC4410.mo9196(C13854.m31530(bArr, 0, bArr.length));
        }
    }

    public C7859(byte[] bArr) {
        this.f20606 = C6478.m14843();
        this.f20607 = bArr;
    }

    public C7859(byte[] bArr, Object obj) {
        this.f20606 = C6478.m14843();
        this.f20607 = bArr;
        this.f20608 = 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18166(byte[] bArr, int i, int i2) {
        InterfaceC4410 interfaceC4410 = f20604;
        if (interfaceC4410.mo9194()) {
            StringBuilder sb = new StringBuilder("update: ");
            C7913.m18269(sb, this.f20609, " ", i, ":");
            sb.append(i2);
            interfaceC4410.mo9196(sb.toString());
            interfaceC4410.mo9196(C13854.m31530(bArr, i, Math.min(i2, 256)));
        }
        if (i2 == 0) {
            return;
        }
        this.f20606.update(bArr, i, i2);
        this.f20609++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m18169() {
        byte[] bArrDigest = this.f20606.digest();
        InterfaceC4410 interfaceC4410 = f20604;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("digest: ");
            interfaceC4410.mo9196(C13854.m31530(bArrDigest, 0, bArrDigest.length));
        }
        this.f20609 = 0;
        return bArrDigest;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18167(byte[] bArr, int i, int i2, InterfaceC15605 interfaceC15605, InterfaceC15605 interfaceC15606) {
        InterfaceC4410 interfaceC4410 = f20604;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Signing with seq " + this.f20608);
        }
        ((AbstractC13224) interfaceC15605).m30273(this.f20608);
        if (interfaceC15606 != null) {
            ((AbstractC13224) interfaceC15606).m30273(this.f20608 + 1);
        }
        try {
            try {
                byte[] bArr2 = this.f20607;
                m18166(bArr2, 0, bArr2.length);
                int i3 = i + 14;
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i3 + i4] = 0;
                }
                C3775.m7366(this.f20608, i3, bArr);
                m18166(bArr, i, i2);
                System.arraycopy(m18169(), 0, bArr, i3, 8);
            } catch (Exception e) {
                interfaceC4410.mo9186("Signature failed", (Throwable) e);
            }
        } finally {
            this.f20608 += 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18168(byte[] bArr, int i, int i2, InterfaceC15605 interfaceC15605) {
        AbstractC13224 abstractC13224 = (AbstractC13224) interfaceC15605;
        int i3 = abstractC13224.f37158 & 4;
        InterfaceC4410 interfaceC4410 = f20604;
        if (i3 == 0) {
            interfaceC4410.mo9199("Expected signed response, but is not signed");
            return false;
        }
        byte[] bArr2 = this.f20607;
        m18166(bArr2, 0, bArr2.length);
        m18166(bArr, 4, 14);
        byte[] bArr3 = new byte[8];
        C3775.m7366(abstractC13224.m30271(), 0, bArr3);
        m18166(bArr3, 0, 8);
        if (abstractC13224.mo12502() == 46) {
            C2532 c2532 = (C2532) abstractC13224;
            m18166(bArr, 26, (abstractC13224.f37143 - c2532.m3711()) - 22);
            m18166(c2532.m3715(), c2532.m3718(), c2532.m3711());
        } else {
            m18166(bArr, 26, abstractC13224.f37143 - 22);
        }
        byte[] bArrM18169 = m18169();
        for (int i4 = 0; i4 < 8; i4++) {
            if (bArrM18169[i4] != bArr[i4 + 18]) {
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("signature verification failure");
                    interfaceC4410.mo9183("Expect: ".concat(C13854.m31530(bArrM18169, 0, 8)));
                    interfaceC4410.mo9183("Have: ".concat(C13854.m31530(bArr, 18, 8)));
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        byte[] bArr = this.f20607;
        return "MacSigningKey=".concat(C13854.m31530(bArr, 0, bArr.length));
    }
}
