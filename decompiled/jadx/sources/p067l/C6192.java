package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ۘܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6192 extends C8203 {
    public static final Parcelable.Creator CREATOR = new C4851();

    /* JADX INFO: renamed from: ᩸ */
    public String f15584;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f15584);
    }

    public C6192(Parcel parcel) {
        super(parcel);
        this.f15584 = parcel.readString();
    }

    public C6192() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
