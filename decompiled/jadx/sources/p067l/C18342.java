package p067l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18342 extends AbstractC12979 {

    /* JADX INFO: renamed from: ֫ */
    public final int f54775;

    /* JADX INFO: renamed from: ۧ */
    public final int f54776;

    /* JADX INFO: renamed from: ܽ */
    public final int f54777;

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final long mo23860() {
        return 48L;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ۧ */
    public final long mo23867() {
        return 12L;
    }

    public C18342(int i, int i2, int i3) {
        this.f54775 = i;
        this.f54777 = i2;
        this.f54776 = i3;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ܽ */
    public final int mo23868() {
        return this.f54776;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ܽ */
    public final int mo23869(int i) {
        if (i < 0 || i >= this.f54776) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Start ordinal "));
        }
        return (i * this.f54777) + this.f54775;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ۧ */
    public final int mo23866(int i) {
        int iM41778 = m41778(i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE);
        if (iM41778 >= this.f54776) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return (iM41778 * this.f54777) + this.f54775;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23864(int i) {
        return this.f54776 <= 1 || this.f54777 >= i;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23865(AbstractC12979 abstractC12979) {
        if (!(abstractC12979 instanceof C18342)) {
            return false;
        }
        C18342 c18342 = (C18342) abstractC12979;
        return this.f54775 == c18342.f54775 && this.f54777 == c18342.f54777 && this.f54776 == c18342.f54776;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23863(byte[] bArr, int i, int i2, byte b, int i3) {
        int iM41778 = m41778(i);
        int iM41779 = m41778(i2);
        if (iM41778 >= iM41779) {
            return;
        }
        int i4 = this.f54775;
        int i5 = this.f54777;
        if (i5 == 1) {
            int i6 = ((i4 + iM41778) + i3) - i;
            Arrays.fill(bArr, i6, (iM41779 + i6) - iM41778, b);
        } else {
            while (iM41778 < iM41779) {
                bArr[((iM41778 * i5) + (i3 + i4)) - i] = b;
                iM41778++;
            }
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23861(int i, int i2, InterfaceC22997 interfaceC22997) {
        int iM41778 = m41778(i2);
        for (int iM41779 = m41778(i); iM41779 < iM41778; iM41779++) {
            interfaceC22997.mo6328(iM41779, (this.f54777 * iM41779) + this.f54775);
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final int mo23859(int i, int i2) {
        return Math.max(0, m41778(i2) - m41778(i));
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23862(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(3);
        long j = ((long) this.f54775) - ((long) i);
        int i2 = (int) j;
        if (j != i2) {
            throw new ArithmeticException();
        }
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeInt(this.f54777);
        dataOutputStream.writeInt(this.f54776);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public int m41778(int i) {
        long j = ((long) i) - ((long) this.f54775);
        if (j <= 0) {
            return 0;
        }
        int i2 = this.f54777;
        return (int) Math.min(this.f54776, ((j + ((long) i2)) - 1) / ((long) i2));
    }
}
