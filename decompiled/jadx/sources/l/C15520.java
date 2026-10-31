package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ܶ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15520 extends C6139 {
    public static final Parcelable.Creator CREATOR = new C8466();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f47441;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f47441 ? 1 : 0);
    }

    public C15520(Parcel parcel) {
        super(parcel);
        this.f47441 = parcel.readInt() == 1;
    }

    public C15520() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
