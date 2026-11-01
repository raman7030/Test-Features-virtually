package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G20T */
/* JADX INFO: loaded from: classes2.dex */
public final class C8846 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24939();

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f24018;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f24019;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C8846(Parcel parcel) {
        this.f24018 = parcel.createStringArrayList();
        this.f24019 = parcel.createTypedArrayList(C16221.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f24018);
        parcel.writeTypedList(this.f24019);
    }
}
