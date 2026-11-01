package p067l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C15619 extends AbstractC12979 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f44705;

    public C15619(int[] iArr) {
        this.f44705 = iArr;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ܽ */
    public final int mo23868() {
        return this.f44705.length;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ܽ */
    public final int mo23869(int i) {
        return this.f44705[i];
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ۧ */
    public final int mo23866(int i) {
        int i2 = i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE;
        int[] iArr = this.f44705;
        int iM43158 = C19013.m43158(i2, iArr);
        if (iM43158 >= iArr.length) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return iArr[iM43158];
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23864(int i) {
        int i2 = 1;
        while (true) {
            int[] iArr = this.f44705;
            if (i2 >= iArr.length) {
                return true;
            }
            if (((long) iArr[i2 - 1]) + ((long) i) > iArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23865(AbstractC12979 abstractC12979) {
        return (abstractC12979 instanceof C15619) && Arrays.equals(this.f44705, ((C15619) abstractC12979).f44705);
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23863(byte[] bArr, int i, int i2, byte b, int i3) {
        int[] iArr = this.f44705;
        int iM43158 = C19013.m43158(i2, iArr);
        for (int iM43159 = C19013.m43158(i, iArr); iM43159 < iM43158; iM43159++) {
            bArr[(iArr[iM43159] + i3) - i] = b;
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23861(int i, int i2, InterfaceC22997 interfaceC22997) {
        int[] iArr = this.f44705;
        int iM43158 = C19013.m43158(i2, iArr);
        for (int iM43159 = C19013.m43158(i, iArr); iM43159 < iM43158; iM43159++) {
            interfaceC22997.mo6328(iM43159, iArr[iM43159]);
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final int mo23859(int i, int i2) {
        int[] iArr = this.f44705;
        return Math.max(0, C19013.m43158(i2, iArr) - C19013.m43158(i, iArr));
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ۧ */
    public final long mo23867() {
        return ((long) this.f44705.length) * 4;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final long mo23860() {
        return (((long) this.f44705.length) * 4) + 48;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23862(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(1);
        int[] iArr = this.f44705;
        dataOutputStream.writeInt(iArr.length);
        for (int i2 : iArr) {
            long j = ((long) i2) - ((long) i);
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            dataOutputStream.writeInt(i3);
        }
    }
}
