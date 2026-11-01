package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes.dex */
public final class C23502 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C22832();

    /* JADX INFO: renamed from: ۗ */
    public int f74890;

    /* JADX INFO: renamed from: ۙ */
    public int f74891;

    /* JADX INFO: renamed from: ᩶ */
    public int f74892;

    /* JADX INFO: renamed from: ᩸ */
    public int f74893;

    /* JADX INFO: renamed from: ᩹ */
    public int f74894;

    public C23502(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f74890 = 0;
        this.f74890 = parcel.readInt();
        this.f74894 = parcel.readInt();
        this.f74892 = parcel.readInt();
        this.f74891 = parcel.readInt();
        this.f74893 = parcel.readInt();
    }

    public C23502(Parcelable parcelable) {
        super(parcelable);
        this.f74890 = 0;
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f74890);
        parcel.writeInt(this.f74894);
        parcel.writeInt(this.f74892);
        parcel.writeInt(this.f74891);
        parcel.writeInt(this.f74893);
    }
}
