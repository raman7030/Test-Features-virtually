package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AKI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16221 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18904();

    /* JADX INFO: renamed from: ֫֫ */
    public final int f47727;

    /* JADX INFO: renamed from: ۗ */
    public final int[] f47728;

    /* JADX INFO: renamed from: ۙ */
    public final CharSequence f47729;

    /* JADX INFO: renamed from: ۛ */
    public final int[] f47730;

    /* JADX INFO: renamed from: ۟ */
    public final ArrayList f47731;

    /* JADX INFO: renamed from: ۤ */
    public final String f47732;

    /* JADX INFO: renamed from: ۨ */
    public final int[] f47733;

    /* JADX INFO: renamed from: ۫ */
    public final int f47734;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f47735;

    /* JADX INFO: renamed from: ܰ */
    public final ArrayList f47736;

    /* JADX INFO: renamed from: ᩶ */
    public final int f47737;

    /* JADX INFO: renamed from: ᩸ */
    public final int f47738;

    /* JADX INFO: renamed from: ᩹ */
    public final CharSequence f47739;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f47740;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C16221(C19575 c19575) {
        int size = c19575.f54986.size();
        this.f47733 = new int[size * 6];
        if (!c19575.f54981) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f47735 = new ArrayList(size);
        this.f47730 = new int[size];
        this.f47728 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13050 c13050 = (C13050) c19575.f54986.get(i2);
            int i3 = i + 1;
            this.f47733[i] = c13050.f36695;
            ArrayList arrayList = this.f47735;
            ComponentCallbacksC11117 componentCallbacksC11117 = c13050.f36700;
            arrayList.add(componentCallbacksC11117 != null ? componentCallbacksC11117.mWho : null);
            int[] iArr = this.f47733;
            iArr[i3] = c13050.f36698 ? 1 : 0;
            iArr[i + 2] = c13050.f36699;
            iArr[i + 3] = c13050.f36701;
            int i4 = i + 5;
            iArr[i + 4] = c13050.f36696;
            i += 6;
            iArr[i4] = c13050.f36702;
            this.f47730[i2] = c13050.f36703.ordinal();
            this.f47728[i2] = c13050.f36697.ordinal();
        }
        this.f47727 = c19575.f54994;
        this.f47732 = c19575.f54995;
        this.f47734 = c19575.f59573;
        this.f47737 = c19575.f54991;
        this.f47729 = c19575.f54988;
        this.f47738 = c19575.f54990;
        this.f47739 = c19575.f54992;
        this.f47736 = c19575.f54983;
        this.f47731 = c19575.f54993;
        this.f47740 = c19575.f54982;
    }

    public C16221(Parcel parcel) {
        this.f47733 = parcel.createIntArray();
        this.f47735 = parcel.createStringArrayList();
        this.f47730 = parcel.createIntArray();
        this.f47728 = parcel.createIntArray();
        this.f47727 = parcel.readInt();
        this.f47732 = parcel.readString();
        this.f47734 = parcel.readInt();
        this.f47737 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f47729 = (CharSequence) creator.createFromParcel(parcel);
        this.f47738 = parcel.readInt();
        this.f47739 = (CharSequence) creator.createFromParcel(parcel);
        this.f47736 = parcel.createStringArrayList();
        this.f47731 = parcel.createStringArrayList();
        this.f47740 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f47733);
        parcel.writeStringList(this.f47735);
        parcel.writeIntArray(this.f47730);
        parcel.writeIntArray(this.f47728);
        parcel.writeInt(this.f47727);
        parcel.writeString(this.f47732);
        parcel.writeInt(this.f47734);
        parcel.writeInt(this.f47737);
        TextUtils.writeToParcel(this.f47729, parcel, 0);
        parcel.writeInt(this.f47738);
        TextUtils.writeToParcel(this.f47739, parcel, 0);
        parcel.writeStringList(this.f47736);
        parcel.writeStringList(this.f47731);
        parcel.writeInt(this.f47740 ? 1 : 0);
    }
}
