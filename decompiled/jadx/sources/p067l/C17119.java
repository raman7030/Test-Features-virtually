package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ܶ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17119 extends C8203 {
    public static final Parcelable.Creator CREATOR = new C10415();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f50573;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50573 ? 1 : 0);
    }

    public C17119(Parcel parcel) {
        super(parcel);
        this.f50573 = parcel.readInt() == 1;
    }

    public C17119() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
