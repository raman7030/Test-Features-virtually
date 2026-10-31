package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ۘܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4023 extends C6139 {
    public static final Parcelable.Creator CREATOR = new C2612();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f12769;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f12769);
    }

    public C4023(Parcel parcel) {
        super(parcel);
        this.f12769 = parcel.readString();
    }

    public C4023() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
