package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G20T */
/* JADX INFO: loaded from: classes2.dex */
public final class C6816 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23749();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f21141;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f21142;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C6816(Parcel parcel) {
        this.f21141 = parcel.createStringArrayList();
        this.f21142 = parcel.createTypedArrayList(C14576.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f21141);
        parcel.writeTypedList(this.f21142);
    }
}
