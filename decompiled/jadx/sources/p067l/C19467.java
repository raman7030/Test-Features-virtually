package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩳۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19467 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C18125();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f59328;

    /* JADX INFO: renamed from: ᩹ */
    public int f59329;

    public C19467(Parcelable parcelable) {
        super(parcelable);
    }

    public C19467(Parcel parcel) {
        super(parcel, null);
        this.f59328 = parcel.readInt() != 0;
        this.f59329 = parcel.readInt();
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f59328 ? 1 : 0);
        parcel.writeInt(this.f59329);
    }
}
