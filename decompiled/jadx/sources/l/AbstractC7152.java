package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6B6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7152 implements Parcelable {
    public final Parcelable mSuperState;
    public static final AbstractC7152 EMPTY_STATE = new C22674(null);
    public static final Parcelable.Creator CREATOR = new C13501();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ AbstractC7152(C22674 c22674) {
        this();
    }

    public AbstractC7152() {
        this.mSuperState = null;
    }

    public AbstractC7152(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    public AbstractC7152(Parcel parcel) {
        this(parcel, null);
    }

    public AbstractC7152(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
