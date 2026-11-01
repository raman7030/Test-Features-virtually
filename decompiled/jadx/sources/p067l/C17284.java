package p067l;

import java.util.Date;

/* JADX INFO: renamed from: l.ܺۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WA10 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17284 extends AbstractC11883 {

    /* JADX INFO: renamed from: ܶ֫ */
    public int f51515;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f51516;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f51517;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f51518;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    public C17284(int i, int i2, int i3, int i4, String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 45, str);
        this.f51517 = i4;
        int i5 = i & 3;
        this.f51515 = i5;
        if (i5 == 3) {
            this.f51515 = 2;
        }
        int i6 = i2 & 1;
        if (i6 != 0 && (i2 & 2) != 0) {
            this.f51515 |= 64;
        } else if (i2 == 0) {
            this.f51515 |= 16;
        } else if ((i2 & 2) == 0) {
            this.f51515 |= 32;
        } else if (i6 == 0) {
            this.f51515 |= 48;
        } else {
            this.f51515 |= 16;
        }
        this.f51515 &= -2;
        this.f51516 = 22;
        if ((i3 & 64) == 64) {
            if ((i3 & 16) == 16) {
                this.f51518 = 18;
                return;
            } else {
                this.f51518 = 2;
                return;
            }
        }
        if ((i3 & 16) != 16) {
            this.f51518 = 1;
        } else if ((i3 & 32) == 32) {
            this.f51518 = 16;
        } else {
            this.f51518 = 17;
        }
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        long j = 0;
        C3775.m7364(j, i, bArr);
        C3775.m7364(this.f51515, i + 2, bArr);
        C3775.m7364(this.f51516, i + 4, bArr);
        C3775.m7364(this.f51517, i + 6, bArr);
        C3775.m7366(j, i + 8, bArr);
        C3775.m7364(this.f51518, i + 12, bArr);
        C3775.m7366(j, i + 14, bArr);
        int i2 = i + 18;
        int i3 = 0;
        while (i3 < 8) {
            bArr[i2] = 0;
            i3++;
            i2++;
        }
        return i2 - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int i2;
        if (m30259()) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + m30241(this.f37152, i2, bArr)) - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        sb.append(C13854.m31529(0, 2));
        sb.append(",desiredAccess=0x");
        C20458.m46154(this.f51515, 4, ",searchAttributes=0x", sb);
        C20458.m46154(this.f51516, 4, ",fileAttributes=0x", sb);
        sb.append(C13854.m31529(this.f51517, 4));
        sb.append(",creationTime=");
        sb.append(new Date(0));
        sb.append(",openFunction=0x");
        C20458.m46154(this.f51518, 2, ",allocationSize=0,fileName=", sb);
        return new String(C10965.m25286(sb, this.f37152, "]"));
    }
}
