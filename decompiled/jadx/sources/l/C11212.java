package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۧ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11212 extends AbstractC12601 implements InterfaceC14242 {

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f33639 = C11321.m27961(C11212.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f33640;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final String f33641;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public byte[] f33642;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f33643;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23184[] f33644;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public long f33645;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C11212(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
        this.f33642 = new byte[16];
        this.f33641 = str;
    }

    @Override // l.AbstractC12601, l.InterfaceC1543
    /* JADX INFO: renamed from: ֫ */
    public final void mo5288(InterfaceC7578 interfaceC7578) {
        if (mo28213() && (interfaceC7578 instanceof InterfaceC4840)) {
            ((InterfaceC4840) interfaceC7578).mo8489(this.f33642);
        }
        super.mo5288(interfaceC7578);
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ */
    public final long mo7549() {
        return this.f33643;
    }

    @Override // l.InterfaceC14242
    public final long getSize() {
        return this.f33645;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final long m27781() {
        return this.f33645;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f33640;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final byte[] m27780() {
        return this.f33642;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        int iM5123;
        if (C1480.m5121(i, bArr) != 89) {
            throw new C17771("Structure size is not 89");
        }
        byte b = bArr[i + 2];
        byte b2 = bArr[i + 3];
        C1480.m5123(i + 4, bArr);
        C1480.m5127(i + 8, bArr);
        C1480.m5127(i + 16, bArr);
        this.f33643 = C1480.m5127(i + 24, bArr);
        C1480.m5127(i + 32, bArr);
        C1480.m5125(i + 40, bArr);
        this.f33645 = C1480.m5125(i + 48, bArr);
        this.f33640 = C1480.m5123(i + 56, bArr);
        byte[] bArr2 = this.f33642;
        System.arraycopy(bArr, i + 64, bArr2, 0, 16);
        int iM5124 = C1480.m5123(i + 80, bArr);
        int iM5125 = C1480.m5123(i + 84, bArr);
        int iMax = i + 88;
        if (iM5124 > 0 && iM5125 > 0) {
            LinkedList linkedList = new LinkedList();
            int iM10453 = m10453() + iM5124;
            do {
                iM5123 = C1480.m5123(iM10453, bArr);
                int iM5121 = C1480.m5121(iM10453 + 4, bArr);
                int iM5122 = C1480.m5121(iM10453 + 6, bArr);
                int iM5126 = C1480.m5121(iM10453 + 10, bArr);
                int iM5127 = C1480.m5123(iM10453 + 12, bArr);
                int i2 = iM5121 + iM10453;
                System.arraycopy(bArr, i2, new byte[iM5122], 0, iM5122);
                int iMax2 = Math.max(Math.max(iM10453 + 16, i2 + iM5122), iM5126 + iM10453 + iM5127);
                if (iM5123 > 0) {
                    iM10453 += iM5123;
                }
                iMax = Math.max(iMax, iMax2);
            } while (iM5123 > 0);
            this.f33644 = (InterfaceC23184[]) linkedList.toArray(new InterfaceC23184[0]);
        }
        InterfaceC2148 interfaceC2148 = f33639;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Opened " + this.f33641 + ": " + C12085.m29468(bArr2, 0, bArr2.length));
        }
        return iMax - i;
    }
}
