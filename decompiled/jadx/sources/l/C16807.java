package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C16807 extends AbstractC11164 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f51593;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f51594;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f51595;

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final long mo21890() {
        return 48L;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ۧ */
    public final long mo21897() {
        return 12L;
    }

    public C16807(int i, int i2, int i3) {
        this.f51593 = i;
        this.f51595 = i2;
        this.f51594 = i3;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ܽ */
    public final int mo21898() {
        return this.f51594;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ܽ */
    public final int mo21899(int i) {
        if (i < 0 || i >= this.f51594) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Start ordinal "));
        }
        return (i * this.f51595) + this.f51593;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ۧ */
    public final int mo21896(int i) {
        int iM39542 = m39542(i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE);
        if (iM39542 >= this.f51594) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return (iM39542 * this.f51595) + this.f51593;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21894(int i) {
        return this.f51594 <= 1 || this.f51595 >= i;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21895(AbstractC11164 abstractC11164) {
        if (!(abstractC11164 instanceof C16807)) {
            return false;
        }
        C16807 c16807 = (C16807) abstractC11164;
        return this.f51593 == c16807.f51593 && this.f51595 == c16807.f51595 && this.f51594 == c16807.f51594;
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final void mo21893(byte[] bArr, int i, int i2, byte b, int i3) {
        int iM39542 = m39542(i);
        int iM39543 = m39542(i2);
        if (iM39542 >= iM39543) {
            return;
        }
        int i4 = this.f51593;
        int i5 = this.f51595;
        if (i5 == 1) {
            int i6 = ((i4 + iM39542) + i3) - i;
            Arrays.fill(bArr, i6, (iM39543 + i6) - iM39542, b);
        } else {
            while (iM39542 < iM39543) {
                bArr[((iM39542 * i5) + (i3 + i4)) - i] = b;
                iM39542++;
            }
        }
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final void mo21891(int i, int i2, InterfaceC21705 interfaceC21705) {
        int iM39542 = m39542(i2);
        for (int iM39543 = m39542(i); iM39543 < iM39542; iM39543++) {
            interfaceC21705.mo4084(iM39543, (this.f51595 * iM39543) + this.f51593);
        }
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final int mo21889(int i, int i2) {
        return Math.max(0, m39542(i2) - m39542(i));
    }

    @Override // l.AbstractC11164
    /* JADX INFO: renamed from: ֫ */
    public final void mo21892(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(3);
        long j = ((long) this.f51593) - ((long) i);
        int i2 = (int) j;
        if (j != i2) {
            throw new ArithmeticException();
        }
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeInt(this.f51595);
        dataOutputStream.writeInt(this.f51594);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int m39542(int i) {
        long j = ((long) i) - ((long) this.f51593);
        if (j <= 0) {
            return 0;
        }
        int i2 = this.f51595;
        return (int) Math.min(this.f51594, ((j + ((long) i2)) - 1) / ((long) i2));
    }
}
