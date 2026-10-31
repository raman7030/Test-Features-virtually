package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20056 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C22172();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64973;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f64973 ? (byte) 1 : (byte) 0);
    }
}
