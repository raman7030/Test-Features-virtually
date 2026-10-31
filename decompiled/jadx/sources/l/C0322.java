package l;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.֡ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S5C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0322 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C19374();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[][] f1704;

    public C0322(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f1704 = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C1734) {
                this.f1704[i] = ((C1734) drawable).f5989.m52914();
            } else {
                this.f1704[i] = null;
            }
        }
    }

    public C0322(Parcel parcel) {
        super(parcel);
        this.f1704 = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f1704;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }

    public C0322(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f1704 = new long[][]{jArr};
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        long[][] jArr = this.f1704;
        parcel.writeInt(jArr.length);
        for (long[] jArr2 : jArr) {
            parcel.writeLongArray(jArr2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1731(Drawable drawable, int i) {
        long[] jArr = this.f1704[i];
        if (jArr == null || !(drawable instanceof C1734)) {
            return;
        }
        C1734 c1734 = (C1734) drawable;
        c1734.m5786(c1734.f5989.m52901(jArr, c1734.f5999));
    }
}
