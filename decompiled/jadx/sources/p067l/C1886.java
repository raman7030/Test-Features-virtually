package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩷ᩴ */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1886 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C1186();

    /* JADX INFO: renamed from: ᩸ */
    public int f70593;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f70594;

    public C1886(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f70593 = parcel.readInt();
        this.f70594 = parcel.readInt() != 0;
    }

    public C1886(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f70593);
        parcel.writeInt(this.f70594 ? 1 : 0);
    }
}
