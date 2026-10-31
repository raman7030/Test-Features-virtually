package l;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19413 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9535();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f62799;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f62800;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float f62801;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f62802;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f62803;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Bundle f62804;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CharSequence f62805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f62806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f62807;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f62808;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f62809;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public PlaybackState f62810;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C19413(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f62803 = i;
        this.f62802 = j;
        this.f62807 = j2;
        this.f62801 = f;
        this.f62808 = j3;
        this.f62799 = i2;
        this.f62805 = charSequence;
        this.f62806 = j4;
        this.f62800 = new ArrayList(arrayList);
        this.f62809 = j5;
        this.f62804 = bundle;
    }

    public C19413(Parcel parcel) {
        this.f62803 = parcel.readInt();
        this.f62802 = parcel.readLong();
        this.f62801 = parcel.readFloat();
        this.f62806 = parcel.readLong();
        this.f62807 = parcel.readLong();
        this.f62808 = parcel.readLong();
        this.f62805 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f62800 = parcel.createTypedArrayList(C18707.CREATOR);
        this.f62809 = parcel.readLong();
        this.f62804 = parcel.readBundle(C23645.class.getClassLoader());
        this.f62799 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f62803);
        sb.append(", position=");
        sb.append(this.f62802);
        sb.append(", buffered position=");
        sb.append(this.f62807);
        sb.append(", speed=");
        sb.append(this.f62801);
        sb.append(", updated=");
        sb.append(this.f62806);
        sb.append(", actions=");
        sb.append(this.f62808);
        sb.append(", error code=");
        sb.append(this.f62799);
        sb.append(", error message=");
        sb.append(this.f62805);
        sb.append(", custom actions=");
        sb.append(this.f62800);
        sb.append(", active item id=");
        return C15942.m37718(sb, this.f62809, l.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62803);
        parcel.writeLong(this.f62802);
        parcel.writeFloat(this.f62801);
        parcel.writeLong(this.f62806);
        parcel.writeLong(this.f62807);
        parcel.writeLong(this.f62808);
        TextUtils.writeToParcel(this.f62805, parcel, i);
        parcel.writeTypedList(this.f62800);
        parcel.writeLong(this.f62809);
        parcel.writeBundle(this.f62804);
        parcel.writeInt(this.f62799);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PlaybackState m44727() {
        if (this.f62810 == null) {
            PlaybackState.Builder builderM22803 = C8829.m22803();
            C8829.m22808(builderM22803, this.f62803, this.f62802, this.f62801, this.f62806);
            C8829.m22820(builderM22803, this.f62807);
            C8829.m22809(builderM22803, this.f62808);
            C8829.m22811(builderM22803, this.f62805);
            Iterator it = this.f62800.iterator();
            while (it.hasNext()) {
                C8829.m22810(builderM22803, ((C18707) it.next()).m43322());
            }
            C8829.m22816(builderM22803, this.f62809);
            if (Build.VERSION.SDK_INT >= 22) {
                C15883.m37620(builderM22803, this.f62804);
            }
            this.f62810 = C8829.m22806(builderM22803);
        }
        return this.f62810;
    }
}
