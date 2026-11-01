package p067l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۧ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13025 extends AbstractC14345 implements InterfaceC15904 {

    /* JADX INFO: renamed from: ܶ֫ */
    public static final InterfaceC4410 f36638 = C13128.m30022(C13025.class);

    /* JADX INFO: renamed from: ֡֫ */
    public int f36639;

    /* JADX INFO: renamed from: ֨֫ */
    public final String f36640;

    /* JADX INFO: renamed from: ۚ֫ */
    public byte[] f36641;

    /* JADX INFO: renamed from: ۠֫ */
    public long f36642;

    /* JADX INFO: renamed from: ᩴ֫ */
    public InterfaceC24403[] f36643;

    /* JADX INFO: renamed from: ᩵֫ */
    public long f36644;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C13025(String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
        this.f36641 = new byte[16];
        this.f36640 = str;
    }

    @Override // p067l.AbstractC14345, p067l.InterfaceC3835
    /* JADX INFO: renamed from: ֫ */
    public final void mo7517(InterfaceC9571 interfaceC9571) {
        if (mo30257() && (interfaceC9571 instanceof InterfaceC6969)) {
            ((InterfaceC6969) interfaceC9571).mo10536(this.f36641);
        }
        super.mo7517(interfaceC9571);
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return this.f36642;
    }

    @Override // p067l.InterfaceC15904
    public final long getSize() {
        return this.f36644;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final long m29843() {
        return this.f36644;
    }

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return this.f36639;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final byte[] m29842() {
        return this.f36641;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        int iM7365;
        if (C3775.m7363(i, bArr) != 89) {
            throw new C19258("Structure size is not 89");
        }
        byte b = bArr[i + 2];
        byte b2 = bArr[i + 3];
        C3775.m7365(i + 4, bArr);
        C3775.m7369(i + 8, bArr);
        C3775.m7369(i + 16, bArr);
        this.f36642 = C3775.m7369(i + 24, bArr);
        C3775.m7369(i + 32, bArr);
        C3775.m7367(i + 40, bArr);
        this.f36644 = C3775.m7367(i + 48, bArr);
        this.f36639 = C3775.m7365(i + 56, bArr);
        byte[] bArr2 = this.f36641;
        System.arraycopy(bArr, i + 64, bArr2, 0, 16);
        int iM7366 = C3775.m7365(i + 80, bArr);
        int iM7367 = C3775.m7365(i + 84, bArr);
        int iMax = i + 88;
        if (iM7366 > 0 && iM7367 > 0) {
            LinkedList linkedList = new LinkedList();
            int iM12492 = m12492() + iM7366;
            do {
                iM7365 = C3775.m7365(iM12492, bArr);
                int iM7363 = C3775.m7363(iM12492 + 4, bArr);
                int iM7364 = C3775.m7363(iM12492 + 6, bArr);
                int iM7368 = C3775.m7363(iM12492 + 10, bArr);
                int iM7369 = C3775.m7365(iM12492 + 12, bArr);
                int i2 = iM7363 + iM12492;
                System.arraycopy(bArr, i2, new byte[iM7364], 0, iM7364);
                int iMax2 = Math.max(Math.max(iM12492 + 16, i2 + iM7364), iM7368 + iM12492 + iM7369);
                if (iM7365 > 0) {
                    iM12492 += iM7365;
                }
                iMax = Math.max(iMax, iMax2);
            } while (iM7365 > 0);
            this.f36643 = (InterfaceC24403[]) linkedList.toArray(new InterfaceC24403[0]);
        }
        InterfaceC4410 interfaceC4410 = f36638;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Opened " + this.f36640 + ": " + C13854.m31530(bArr2, 0, bArr2.length));
        }
        return iMax - i;
    }
}
