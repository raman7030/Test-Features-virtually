package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩳۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17991 extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new C16579();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f56131;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f56132;

    public C17991(Parcelable parcelable) {
        super(parcelable);
    }

    public C17991(Parcel parcel) {
        super(parcel, null);
        this.f56131 = parcel.readInt() != 0;
        this.f56132 = parcel.readInt();
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f56131 ? 1 : 0);
        parcel.writeInt(this.f56132);
    }
}
