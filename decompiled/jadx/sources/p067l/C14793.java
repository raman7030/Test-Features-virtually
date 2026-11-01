package p067l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C14793 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f42193;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12979[] f42194;

    /* JADX INFO: renamed from: ܽ */
    public final long f42195;

    /* JADX INFO: renamed from: ᩳ */
    public final long f42196;

    public C14793(AbstractC12979[] abstractC12979Arr, long[] jArr, long j, long j2) {
        this.f42194 = abstractC12979Arr;
        this.f42193 = jArr;
        this.f42196 = j;
        this.f42195 = j2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m33771() {
        return this.f42196;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33770(long j) {
        if (j < 0 || j >= this.f42196) {
            throw new IndexOutOfBoundsException(C17588.m40051(j, "Match ordinal "));
        }
        long[] jArr = this.f42193;
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
        return this.f42194[i].mo23869((int) (j - (i != 0 ? jArr[i - 1] : 0L)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5406 m33767(long j) {
        if (j < 0 || j >= this.f42196) {
            throw new IndexOutOfBoundsException(C17588.m40051(j, "Match ordinal "));
        }
        long[] jArr = this.f42193;
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
        return new C5406(this, i, i3, j, this.f42194[i].mo23869(i3));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33768(DataOutputStream dataOutputStream) throws IOException {
        AbstractC12979[] abstractC12979Arr = this.f42194;
        dataOutputStream.writeInt(abstractC12979Arr.length);
        for (AbstractC12979 abstractC12979 : abstractC12979Arr) {
            abstractC12979.mo23862(dataOutputStream, 0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33769(int i) {
        int iMo23869 = -1;
        for (AbstractC12979 abstractC12979 : this.f42194) {
            int iMo238610 = abstractC12979.mo23869(0);
            if ((iMo23869 >= 0 && ((long) iMo23869) + ((long) i) > iMo238610) || !abstractC12979.mo23864(i)) {
                return false;
            }
            iMo23869 = abstractC12979.mo23869(abstractC12979.mo23868() - 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m33766() {
        return this.f42195;
    }
}
