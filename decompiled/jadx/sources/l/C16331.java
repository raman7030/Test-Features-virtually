package l;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16331 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C22839();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f50280;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f50281;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Uri f50282;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10688 f50283;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f50284;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f50285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f50286;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7317 f50287;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f50288;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C16331(Parcel parcel) {
        String string = parcel.readString();
        String str = C3603.f11424;
        this.f50281 = string;
        this.f50282 = Uri.parse(parcel.readString());
        this.f50285 = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C15428) parcel.readParcelable(C15428.class.getClassLoader()));
        }
        this.f50284 = C20195.unmodifiableList(arrayList);
        this.f50280 = parcel.createByteArray();
        this.f50288 = parcel.readString();
        this.f50286 = parcel.createByteArray();
        this.f50287 = (C7317) parcel.readParcelable(C7317.class.getClassLoader());
        this.f50283 = (C10688) parcel.readParcelable(C10688.class.getClassLoader());
    }

    public final String toString() {
        return this.f50285 + ":" + this.f50281;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16331)) {
            return false;
        }
        C16331 c16331 = (C16331) obj;
        return this.f50281.equals(c16331.f50281) && this.f50282.equals(c16331.f50282) && C11003.equals(this.f50285, c16331.f50285) && this.f50284.equals(c16331.f50284) && Arrays.equals(this.f50280, c16331.f50280) && C11003.equals(this.f50288, c16331.f50288) && Arrays.equals(this.f50286, c16331.f50286) && C11003.equals(this.f50287, c16331.f50287) && C11003.equals(this.f50283, c16331.f50283);
    }

    public final int hashCode() {
        int iHashCode = (this.f50282.hashCode() + (this.f50281.hashCode() * 961)) * 31;
        String str = this.f50285;
        int iHashCode2 = (Arrays.hashCode(this.f50280) + ((this.f50284.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f50288;
        int iHashCode3 = (Arrays.hashCode(this.f50286) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        C7317 c7317 = this.f50287;
        int iHashCode4 = (iHashCode3 + (c7317 != null ? c7317.hashCode() : 0)) * 31;
        C10688 c10688 = this.f50283;
        return iHashCode4 + (c10688 != null ? c10688.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50281);
        parcel.writeString(this.f50282.toString());
        parcel.writeString(this.f50285);
        List list = this.f50284;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.f50280);
        parcel.writeString(this.f50288);
        parcel.writeByteArray(this.f50286);
        parcel.writeParcelable(this.f50287, 0);
        parcel.writeParcelable(this.f50283, 0);
    }
}
