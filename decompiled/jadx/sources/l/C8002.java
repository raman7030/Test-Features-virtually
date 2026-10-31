package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes3.dex */
public final class C8002 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C15056 c15056 = new C15056();
        c15056.f45948 = null;
        c15056.f45946 = new ArrayList();
        c15056.f45950 = new ArrayList();
        c15056.f45952 = parcel.createStringArrayList();
        c15056.f45953 = parcel.createStringArrayList();
        c15056.f45951 = (C14576[]) parcel.createTypedArray(C14576.CREATOR);
        c15056.f45947 = parcel.readInt();
        c15056.f45948 = parcel.readString();
        c15056.f45946 = parcel.createStringArrayList();
        c15056.f45950 = parcel.createTypedArrayList(C6816.CREATOR);
        c15056.f45949 = parcel.createTypedArrayList(C3769.CREATOR);
        return c15056;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C15056[i];
    }
}
