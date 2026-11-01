package p067l;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17889 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24074();

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f53452;

    /* JADX INFO: renamed from: ۙ */
    public final String f53453;

    /* JADX INFO: renamed from: ۛ */
    public final Uri f53454;

    /* JADX INFO: renamed from: ۤ */
    public final C12526 f53455;

    /* JADX INFO: renamed from: ۫ */
    public final List f53456;

    /* JADX INFO: renamed from: ۬ */
    public final String f53457;

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f53458;

    /* JADX INFO: renamed from: ᩸ */
    public final C9322 f53459;

    /* JADX INFO: renamed from: ᩹ */
    public final String f53460;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C17889(Parcel parcel) {
        String string = parcel.readString();
        String str = C5792.f14228;
        this.f53453 = string;
        this.f53454 = Uri.parse(parcel.readString());
        this.f53457 = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C17031) parcel.readParcelable(C17031.class.getClassLoader()));
        }
        this.f53456 = C21562.unmodifiableList(arrayList);
        this.f53452 = parcel.createByteArray();
        this.f53460 = parcel.readString();
        this.f53458 = parcel.createByteArray();
        this.f53459 = (C9322) parcel.readParcelable(C9322.class.getClassLoader());
        this.f53455 = (C12526) parcel.readParcelable(C12526.class.getClassLoader());
    }

    public final String toString() {
        return this.f53457 + ":" + this.f53453;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17889)) {
            return false;
        }
        C17889 c17889 = (C17889) obj;
        return this.f53453.equals(c17889.f53453) && this.f53454.equals(c17889.f53454) && C12826.equals(this.f53457, c17889.f53457) && this.f53456.equals(c17889.f53456) && Arrays.equals(this.f53452, c17889.f53452) && C12826.equals(this.f53460, c17889.f53460) && Arrays.equals(this.f53458, c17889.f53458) && C12826.equals(this.f53459, c17889.f53459) && C12826.equals(this.f53455, c17889.f53455);
    }

    public final int hashCode() {
        int iHashCode = (this.f53454.hashCode() + (this.f53453.hashCode() * 961)) * 31;
        String str = this.f53457;
        int iHashCode2 = (Arrays.hashCode(this.f53452) + ((this.f53456.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f53460;
        int iHashCode3 = (Arrays.hashCode(this.f53458) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        C9322 c9322 = this.f53459;
        int iHashCode4 = (iHashCode3 + (c9322 != null ? c9322.hashCode() : 0)) * 31;
        C12526 c12526 = this.f53455;
        return iHashCode4 + (c12526 != null ? c12526.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f53453);
        parcel.writeString(this.f53454.toString());
        parcel.writeString(this.f53457);
        List list = this.f53456;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.f53452);
        parcel.writeString(this.f53460);
        parcel.writeByteArray(this.f53458);
        parcel.writeParcelable(this.f53459, 0);
        parcel.writeParcelable(this.f53455, 0);
    }
}
