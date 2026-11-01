package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6B6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9165 implements Parcelable {
    public final Parcelable mSuperState;
    public static final AbstractC9165 EMPTY_STATE = new C23917(null);
    public static final Parcelable.Creator CREATOR = new C15199();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ AbstractC9165(C23917 c23917) {
        this();
    }

    public AbstractC9165() {
        this.mSuperState = null;
    }

    public AbstractC9165(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    public AbstractC9165(Parcel parcel) {
        this(parcel, null);
    }

    public AbstractC9165(Parcel parcel, ClassLoader classLoader) {
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
