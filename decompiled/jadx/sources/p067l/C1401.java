package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۧ᩹ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes4.dex */
public final class C1401 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C0946();

    /* JADX INFO: renamed from: ᩸ */
    public SparseArray f36789;

    public C1401(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f36789 = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f36789.append(iArr[i2], parcelableArray[i2]);
        }
    }

    public C1401(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f36789;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f36789.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f36789.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
