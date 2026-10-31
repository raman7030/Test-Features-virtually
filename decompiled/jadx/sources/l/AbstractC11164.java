package l;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11164 {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo21889(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo21890();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21891(int i, int i2, InterfaceC21705 interfaceC21705);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21892(DataOutputStream dataOutputStream, int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo21894(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo21895(AbstractC11164 abstractC11164);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo21896(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract long mo21897();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo21898();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo21899(int i);

    /* JADX INFO: renamed from: ֫ */
    public void mo21893(final byte[] bArr, final int i, int i2, final byte b, final int i3) {
        mo21891(i, i2, new InterfaceC21705() { // from class: l.֫ᩳܳ
            @Override // l.InterfaceC21705
            /* JADX INFO: renamed from: ֫ */
            public final void mo4084(int i4, int i5) {
                bArr[(i3 + i5) - i] = b;
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11164 m27686(int i, int[] iArr) {
        if (i <= 0 || i > iArr.length) {
            throw new IllegalArgumentException("Empty start index");
        }
        int i2 = iArr[0];
        long j = i == 1 ? 1L : ((long) iArr[1]) - ((long) i2);
        int i3 = (j <= 0 || j > 2147483647L) ? -1 : (int) j;
        boolean z = i3 > 0;
        int i4 = 1;
        while (i4 < i) {
            int i5 = iArr[i4];
            if (i5 <= i2) {
                throw new IllegalArgumentException("Start index must be strictly sorted");
            }
            z &= ((long) i5) - ((long) i2) == ((long) i3);
            i4++;
            i2 = i5;
        }
        if (z && i >= 3) {
            return m27688(iArr[0], i3, i);
        }
        long j2 = ((long) iArr[i - 1]) - ((long) iArr[0]);
        long j3 = j2 + 1;
        long j4 = (j2 + 64) >>> 6;
        long j5 = 8 * j4;
        if (i > 64 && j3 <= 2147483647L && j5 < ((long) i) * 4) {
            long[] jArr = new long[(int) j4];
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i6] - iArr[0];
                int i8 = i7 >>> 6;
                jArr[i8] = jArr[i8] | (1 << (i7 & 63));
            }
            return new C8299(iArr[0], i, jArr);
        }
        return new C13942(Arrays.copyOf(iArr, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16807 m27688(int i, int i2, int i3) {
        if (i3 > 0 && i2 > 0) {
            if ((((long) i2) * ((long) (i3 - 1))) + ((long) i) <= 2147483647L) {
                return new C16807(i, i2, i3);
            }
        }
        throw new IllegalArgumentException("Invalid stride index");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27689(int i, int i2, int i3, InterfaceC21705 interfaceC21705) {
        long j = (((long) i) - ((long) i3)) + 1;
        mo21891(j <= -2147483648L ? Integer.MIN_VALUE : (int) j, i2, interfaceC21705);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11164 m27687(DataInput dataInput, int i, C17307 c17307) {
        int unsignedByte = dataInput.readUnsignedByte();
        int i2 = 0;
        try {
            if (unsignedByte == 1) {
                int i3 = dataInput.readInt();
                if (i3 <= 0 || i3 > 65536) {
                    throw C17513.m40912("Invalid sparse start count");
                }
                c17307.m40619((((long) i3) * 4) + 48);
                int[] iArr = new int[i3];
                int i4 = Integer.MIN_VALUE;
                while (i2 < i3) {
                    long j = ((long) i) + ((long) dataInput.readInt());
                    int i5 = (int) j;
                    if (j != i5) {
                        throw new ArithmeticException();
                    }
                    if (i2 != 0 && i5 <= i4) {
                        throw C17513.m40912("Sparse starts are not sorted");
                    }
                    iArr[i2] = i5;
                    i2++;
                    i4 = i5;
                }
                return new C13942(iArr);
            }
            if (unsignedByte != 2) {
                if (unsignedByte != 3) {
                    throw C17513.m40912("Unknown start index tag " + unsignedByte);
                }
                long j2 = ((long) i) + ((long) dataInput.readInt());
                int i6 = (int) j2;
                if (j2 != i6) {
                    throw new ArithmeticException();
                }
                int i7 = dataInput.readInt();
                int i8 = dataInput.readInt();
                c17307.m40619(48L);
                return m27688(i6, i7, i8);
            }
            long j3 = ((long) i) + ((long) dataInput.readInt());
            int i9 = (int) j3;
            long j4 = i9;
            if (j3 != j4) {
                throw new ArithmeticException();
            }
            int i10 = dataInput.readInt();
            int i11 = dataInput.readInt();
            if (i10 <= 0 || i10 > 2048 || i11 <= 0 || i11 > 65536) {
                throw C17513.m40912("Invalid bitmap start index");
            }
            long j5 = i10;
            c17307.m40619((8 * j5) + 64);
            long[] jArr = new long[i10];
            int iBitCount = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                long j6 = dataInput.readLong();
                jArr[i12] = j6;
                iBitCount += Long.bitCount(j6);
            }
            if (iBitCount != i11 || jArr[0] == 0 || jArr[i10 - 1] == 0 || (j4 + (j5 << 6)) - 1 > 2147483647L) {
                throw C17513.m40912("Non-canonical bitmap start index");
            }
            return new C8299(i9, i11, jArr);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            throw C17513.m40912("Invalid start index payload");
        }
    }
}
