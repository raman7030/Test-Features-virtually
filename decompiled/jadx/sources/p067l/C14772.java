package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.۬ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C14772 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C5385();

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f42114;

    public C14772(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f42114 = z;
    }

    public C14772(Parcel parcel) {
        super(parcel);
        this.f42114 = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f42114 ? (byte) 1 : (byte) 0);
    }
}
