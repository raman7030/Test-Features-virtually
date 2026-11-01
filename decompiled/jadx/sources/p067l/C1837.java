package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.᩶ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C1837 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C1942();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f67614;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f67614 ? (byte) 1 : (byte) 0);
    }
}
