package p067l;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.֡ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S5C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2674 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C20781();

    /* JADX INFO: renamed from: ᩸ */
    public final long[][] f4480;

    public C2674(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f4480 = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C4016) {
                this.f4480[i] = ((C4016) drawable).f8766.m55478();
            } else {
                this.f4480[i] = null;
            }
        }
    }

    public C2674(Parcel parcel) {
        super(parcel);
        this.f4480 = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f4480;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }

    public C2674(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f4480 = new long[][]{jArr};
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        long[][] jArr = this.f4480;
        parcel.writeInt(jArr.length);
        for (long[] jArr2 : jArr) {
            parcel.writeLongArray(jArr2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4129(Drawable drawable, int i) {
        long[] jArr = this.f4480[i];
        if (jArr == null || !(drawable instanceof C4016)) {
            return;
        }
        C4016 c4016 = (C4016) drawable;
        c4016.m7996(c4016.f8766.m55465(jArr, c4016.f8776));
    }
}
