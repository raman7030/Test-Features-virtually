package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9973 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C16677 c16677 = new C16677();
        c16677.f49066 = null;
        c16677.f49064 = new ArrayList();
        c16677.f49068 = new ArrayList();
        c16677.f49070 = parcel.createStringArrayList();
        c16677.f49071 = parcel.createStringArrayList();
        c16677.f49069 = (C16221[]) parcel.createTypedArray(C16221.CREATOR);
        c16677.f49065 = parcel.readInt();
        c16677.f49066 = parcel.readString();
        c16677.f49064 = parcel.createStringArrayList();
        c16677.f49068 = parcel.createTypedArrayList(C8846.CREATOR);
        c16677.f49067 = parcel.createTypedArrayList(C5950.CREATOR);
        return c16677;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C16677[i];
    }
}
