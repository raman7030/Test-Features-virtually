package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.۬ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C13051 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C3174();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f39069;

    public C13051(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f39069 = z;
    }

    public C13051(Parcel parcel) {
        super(parcel);
        this.f39069 = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f39069 ? (byte) 1 : (byte) 0);
    }
}
