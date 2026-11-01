package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ۙ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7042 extends C8203 {
    public static final Parcelable.Creator CREATOR = new C21795();

    /* JADX INFO: renamed from: ᩸ */
    public int f18342;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f18342);
    }

    public C7042(Parcel parcel) {
        super(parcel);
        this.f18342 = parcel.readInt();
    }

    public C7042(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.f18342 = i;
    }
}
