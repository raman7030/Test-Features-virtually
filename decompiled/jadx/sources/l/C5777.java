package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۛۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9WB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5777 implements InterfaceC17065 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f17757 = C11321.m27961(C5777.class);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17758 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MessageDigest f17759;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f17760;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17761;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17762;

    public C5777(byte[] bArr, int i) {
        this.f17759 = C4324.m12979();
        this.f17760 = bArr;
        this.f17761 = 0;
        InterfaceC2148 interfaceC2148 = f17757;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("macSigningKey:");
            interfaceC2148.mo7101(C12085.m29468(bArr, 0, bArr.length));
        }
    }

    public C5777(byte[] bArr) {
        this.f17759 = C4324.m12979();
        this.f17760 = bArr;
    }

    public C5777(byte[] bArr, Object obj) {
        this.f17759 = C4324.m12979();
        this.f17760 = bArr;
        this.f17761 = 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16246(byte[] bArr, int i, int i2) {
        InterfaceC2148 interfaceC2148 = f17757;
        if (interfaceC2148.mo7099()) {
            StringBuilder sb = new StringBuilder("update: ");
            C5834.m16344(sb, this.f17762, " ", i, ":");
            sb.append(i2);
            interfaceC2148.mo7101(sb.toString());
            interfaceC2148.mo7101(C12085.m29468(bArr, i, Math.min(i2, 256)));
        }
        if (i2 == 0) {
            return;
        }
        this.f17759.update(bArr, i, i2);
        this.f17762++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m16249() {
        byte[] bArrDigest = this.f17759.digest();
        InterfaceC2148 interfaceC2148 = f17757;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("digest: ");
            interfaceC2148.mo7101(C12085.m29468(bArrDigest, 0, bArrDigest.length));
        }
        this.f17762 = 0;
        return bArrDigest;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16247(byte[] bArr, int i, int i2, InterfaceC13927 interfaceC13927, InterfaceC13927 interfaceC13928) {
        InterfaceC2148 interfaceC2148 = f17757;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Signing with seq " + this.f17761);
        }
        ((AbstractC11422) interfaceC13927).m28229(this.f17761);
        if (interfaceC13928 != null) {
            ((AbstractC11422) interfaceC13928).m28229(this.f17761 + 1);
        }
        try {
            try {
                byte[] bArr2 = this.f17760;
                m16246(bArr2, 0, bArr2.length);
                int i3 = i + 14;
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i3 + i4] = 0;
                }
                C1480.m5124(this.f17761, i3, bArr);
                m16246(bArr, i, i2);
                System.arraycopy(m16249(), 0, bArr, i3, 8);
            } catch (Exception e) {
                interfaceC2148.mo7091("Signature failed", (Throwable) e);
            }
        } finally {
            this.f17761 += 2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16248(byte[] bArr, int i, int i2, InterfaceC13927 interfaceC13927) {
        AbstractC11422 abstractC11422 = (AbstractC11422) interfaceC13927;
        int i3 = abstractC11422.f34162 & 4;
        InterfaceC2148 interfaceC2148 = f17757;
        if (i3 == 0) {
            interfaceC2148.mo7104("Expected signed response, but is not signed");
            return false;
        }
        byte[] bArr2 = this.f17760;
        m16246(bArr2, 0, bArr2.length);
        m16246(bArr, 4, 14);
        byte[] bArr3 = new byte[8];
        C1480.m5124(abstractC11422.m28227(), 0, bArr3);
        m16246(bArr3, 0, 8);
        if (abstractC11422.mo10463() == 46) {
            C0172 c0172 = (C0172) abstractC11422;
            m16246(bArr, 26, (abstractC11422.f34147 - c0172.m1303()) - 22);
            m16246(c0172.m1307(), c0172.m1310(), c0172.m1303());
        } else {
            m16246(bArr, 26, abstractC11422.f34147 - 22);
        }
        byte[] bArrM16249 = m16249();
        for (int i4 = 0; i4 < 8; i4++) {
            if (bArrM16249[i4] != bArr[i4 + 18]) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("signature verification failure");
                    interfaceC2148.mo7088("Expect: ".concat(C12085.m29468(bArrM16249, 0, 8)));
                    interfaceC2148.mo7088("Have: ".concat(C12085.m29468(bArr, 18, 8)));
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        byte[] bArr = this.f17760;
        return "MacSigningKey=".concat(C12085.m29468(bArr, 0, bArr.length));
    }
}
