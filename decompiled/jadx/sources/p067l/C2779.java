package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֡۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2779 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C20886();

    /* JADX INFO: renamed from: ᩸ */
    public Parcelable f4691;

    public C2779(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4691 = parcel.readParcelable(classLoader == null ? AbstractC18873.class.getClassLoader() : classLoader);
    }

    public C2779(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f4691, 0);
    }
}
