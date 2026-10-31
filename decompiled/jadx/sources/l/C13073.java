package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13073 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f39145;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11164[] f39146;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f39147;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f39148;

    public C13073(AbstractC11164[] abstractC11164Arr, long[] jArr, long j, long j2) {
        this.f39146 = abstractC11164Arr;
        this.f39145 = jArr;
        this.f39148 = j;
        this.f39147 = j2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m31683() {
        return this.f39148;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31682(long j) {
        if (j < 0 || j >= this.f39148) {
            throw new IndexOutOfBoundsException(C16014.m37865(j, "Match ordinal "));
        }
        long[] jArr = this.f39145;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            int i2 = (i + length) >>> 1;
            if (jArr[i2] <= j) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        return this.f39146[i].mo21899((int) (j - (i != 0 ? jArr[i - 1] : 0L)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3196 m31679(long j) {
        if (j < 0 || j >= this.f39148) {
            throw new IndexOutOfBoundsException(C16014.m37865(j, "Match ordinal "));
        }
        long[] jArr = this.f39145;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            int i2 = (i + length) >>> 1;
            if (jArr[i2] <= j) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        int i3 = (int) (j - (i != 0 ? jArr[i - 1] : 0L));
        return new C3196(this, i, i3, j, this.f39146[i].mo21899(i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31680(DataOutputStream dataOutputStream) throws IOException {
        AbstractC11164[] abstractC11164Arr = this.f39146;
        dataOutputStream.writeInt(abstractC11164Arr.length);
        for (AbstractC11164 abstractC11164 : abstractC11164Arr) {
            abstractC11164.mo21892(dataOutputStream, 0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31681(int i) {
        int iMo21899 = -1;
        for (AbstractC11164 abstractC11164 : this.f39146) {
            int iMo218910 = abstractC11164.mo21899(0);
            if ((iMo21899 >= 0 && ((long) iMo21899) + ((long) i) > iMo218910) || !abstractC11164.mo21894(i)) {
                return false;
            }
            iMo21899 = abstractC11164.mo21899(abstractC11164.mo21898() - 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m31678() {
        return this.f39147;
    }
}
