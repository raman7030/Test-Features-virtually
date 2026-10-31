package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֡۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0432 extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new C19484();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Parcelable f1915;

    public C0432(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1915 = parcel.readParcelable(classLoader == null ? AbstractC17366.class.getClassLoader() : classLoader);
    }

    public C0432(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f1915, 0);
    }
}
