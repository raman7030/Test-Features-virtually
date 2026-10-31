package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ۙ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4917 extends C6139 {
    public static final Parcelable.Creator CREATOR = new C20440();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15509;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f15509);
    }

    public C4917(Parcel parcel) {
        super(parcel);
        this.f15509 = parcel.readInt();
    }

    public C4917(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.f15509 = i;
    }
}
