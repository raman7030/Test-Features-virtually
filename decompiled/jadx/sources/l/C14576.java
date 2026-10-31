package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AKI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14576 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17399();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f44619;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] f44620;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f44621;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int[] f44622;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f44623;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f44624;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f44625;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f44626;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f44627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f44629;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f44630;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f44631;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f44632;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C14576(C18105 c18105) {
        int size = c18105.f51805.size();
        this.f44625 = new int[size * 6];
        if (!c18105.f51800) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f44627 = new ArrayList(size);
        this.f44622 = new int[size];
        this.f44620 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C11239 c11239 = (C11239) c18105.f51805.get(i2);
            int i3 = i + 1;
            this.f44625[i] = c11239.f33695;
            ArrayList arrayList = this.f44627;
            ComponentCallbacksC9205 componentCallbacksC9205 = c11239.f33700;
            arrayList.add(componentCallbacksC9205 != null ? componentCallbacksC9205.mWho : null);
            int[] iArr = this.f44625;
            iArr[i3] = c11239.f33698 ? 1 : 0;
            iArr[i + 2] = c11239.f33699;
            iArr[i + 3] = c11239.f33701;
            int i4 = i + 5;
            iArr[i + 4] = c11239.f33696;
            i += 6;
            iArr[i4] = c11239.f33702;
            this.f44622[i2] = c11239.f33703.ordinal();
            this.f44620[i2] = c11239.f33697.ordinal();
        }
        this.f44619 = c18105.f51813;
        this.f44624 = c18105.f51814;
        this.f44626 = c18105.f56360;
        this.f44629 = c18105.f51810;
        this.f44621 = c18105.f51807;
        this.f44630 = c18105.f51809;
        this.f44631 = c18105.f51811;
        this.f44628 = c18105.f51802;
        this.f44623 = c18105.f51812;
        this.f44632 = c18105.f51801;
    }

    public C14576(Parcel parcel) {
        this.f44625 = parcel.createIntArray();
        this.f44627 = parcel.createStringArrayList();
        this.f44622 = parcel.createIntArray();
        this.f44620 = parcel.createIntArray();
        this.f44619 = parcel.readInt();
        this.f44624 = parcel.readString();
        this.f44626 = parcel.readInt();
        this.f44629 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f44621 = (CharSequence) creator.createFromParcel(parcel);
        this.f44630 = parcel.readInt();
        this.f44631 = (CharSequence) creator.createFromParcel(parcel);
        this.f44628 = parcel.createStringArrayList();
        this.f44623 = parcel.createStringArrayList();
        this.f44632 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f44625);
        parcel.writeStringList(this.f44627);
        parcel.writeIntArray(this.f44622);
        parcel.writeIntArray(this.f44620);
        parcel.writeInt(this.f44619);
        parcel.writeString(this.f44624);
        parcel.writeInt(this.f44626);
        parcel.writeInt(this.f44629);
        TextUtils.writeToParcel(this.f44621, parcel, 0);
        parcel.writeInt(this.f44630);
        TextUtils.writeToParcel(this.f44631, parcel, 0);
        parcel.writeStringList(this.f44628);
        parcel.writeStringList(this.f44623);
        parcel.writeInt(this.f44632 ? 1 : 0);
    }
}
