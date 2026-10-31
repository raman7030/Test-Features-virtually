package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21051 extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new C6939();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67909;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f67910;

    public C21051(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f67909 = parcel.readInt();
        this.f67910 = parcel.readInt() != 0;
    }

    public C21051(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f67909);
        parcel.writeInt(this.f67910 ? 1 : 0);
    }
}
