package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ܳܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14605 extends C6139 {
    public static final Parcelable.Creator CREATOR = new C17428();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f44699;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f44699);
    }

    public C14605(Parcel parcel) {
        super(parcel);
        this.f44699 = parcel.readString();
    }

    public C14605() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
