package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: l.ᩳۧ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C1735 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1665();

    /* JADX INFO: renamed from: ᩸ */
    public ResultReceiver f59345;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f59345.writeToParcel(parcel, i);
    }
}
