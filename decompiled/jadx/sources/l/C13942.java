package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C13942 extends AbstractC11164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f41624;

    public C13942(int[] iArr) {
        this.f41624 = iArr;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ܽ */
    public final int mo21898() {
        return this.f41624.length;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ܽ */
    public final int mo21899(int i) {
        return this.f41624[i];
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ۧ */
    public final int mo21896(int i) {
        int i2 = i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE;
        int[] iArr = this.f41624;
        int iM40900 = C17513.m40900(i2, iArr);
        if (iM40900 >= iArr.length) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return iArr[iM40900];
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21894(int i) {
        int i2 = 1;
        while (true) {
            int[] iArr = this.f41624;
            if (i2 >= iArr.length) {
                return true;
            }
            if (((long) iArr[i2 - 1]) + ((long) i) > iArr[i2]) {
                return false;
            }
            i2++;
        }
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21895(AbstractC11164 abstractC11164) {
        return (abstractC11164 instanceof C13942) && Arrays.equals(this.f41624, ((C13942) abstractC11164).f41624);
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final void mo21893(byte[] bArr, int i, int i2, byte b, int i3) {
        int[] iArr = this.f41624;
        int iM40900 = C17513.m40900(i2, iArr);
        for (int iM40901 = C17513.m40900(i, iArr); iM40901 < iM40900; iM40901++) {
            bArr[(iArr[iM40901] + i3) - i] = b;
        }
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final void mo21891(int i, int i2, InterfaceC21705 interfaceC21705) {
        int[] iArr = this.f41624;
        int iM40900 = C17513.m40900(i2, iArr);
        for (int iM40901 = C17513.m40900(i, iArr); iM40901 < iM40900; iM40901++) {
            interfaceC21705.mo4084(iM40901, iArr[iM40901]);
        }
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final int mo21889(int i, int i2) {
        int[] iArr = this.f41624;
        return Math.max(0, C17513.m40900(i2, iArr) - C17513.m40900(i, iArr));
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ۧ */
    public final long mo21897() {
        return ((long) this.f41624.length) * 4;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final long mo21890() {
        return (((long) this.f41624.length) * 4) + 48;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final void mo21892(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(1);
        int[] iArr = this.f41624;
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
