package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ܳܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16249 extends C8203 {
    public static final Parcelable.Creator CREATOR = new C18932();

    /* JADX INFO: renamed from: ᩸ */
    public String f47805;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f47805);
    }

    public C16249(Parcel parcel) {
        super(parcel);
        this.f47805 = parcel.readString();
    }

    public C16249() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
