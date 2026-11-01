package p067l;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۧ */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1805 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1315();

    /* JADX INFO: renamed from: ۗ */
    public final int f65412;

    /* JADX INFO: renamed from: ۙ */
    public ArrayList f65413;

    /* JADX INFO: renamed from: ۛ */
    public final float f65414;

    /* JADX INFO: renamed from: ۤ */
    public final long f65415;

    /* JADX INFO: renamed from: ۨ */
    public final int f65416;

    /* JADX INFO: renamed from: ۫ */
    public final Bundle f65417;

    /* JADX INFO: renamed from: ۬ */
    public final CharSequence f65418;

    /* JADX INFO: renamed from: ܰ */
    public final long f65419;

    /* JADX INFO: renamed from: ᩶ */
    public final long f65420;

    /* JADX INFO: renamed from: ᩸ */
    public final long f65421;

    /* JADX INFO: renamed from: ᩹ */
    public final long f65422;

    /* JADX INFO: renamed from: ᩺ */
    public PlaybackState f65423;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1805(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f65416 = i;
        this.f65415 = j;
        this.f65420 = j2;
        this.f65414 = f;
        this.f65421 = j3;
        this.f65412 = i2;
        this.f65418 = charSequence;
        this.f65419 = j4;
        this.f65413 = new ArrayList(arrayList);
        this.f65422 = j5;
        this.f65417 = bundle;
    }

    public C1805(Parcel parcel) {
        this.f65416 = parcel.readInt();
        this.f65415 = parcel.readLong();
        this.f65414 = parcel.readFloat();
        this.f65419 = parcel.readLong();
        this.f65420 = parcel.readLong();
        this.f65421 = parcel.readLong();
        this.f65418 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f65413 = parcel.createTypedArrayList(C1770.CREATOR);
        this.f65422 = parcel.readLong();
        this.f65417 = parcel.readBundle(C2015.class.getClassLoader());
        this.f65412 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f65416);
        sb.append(", position=");
        sb.append(this.f65415);
        sb.append(", buffered position=");
        sb.append(this.f65420);
        sb.append(", speed=");
        sb.append(this.f65414);
        sb.append(", updated=");
        sb.append(this.f65419);
        sb.append(", actions=");
        sb.append(this.f65421);
        sb.append(", error code=");
        sb.append(this.f65412);
        sb.append(", error message=");
        sb.append(this.f65418);
        sb.append(", custom actions=");
        sb.append(this.f65413);
        sb.append(", active item id=");
        return C17520.m39893(sb, this.f65422, C0249l.f1198d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f65416);
        parcel.writeLong(this.f65415);
        parcel.writeFloat(this.f65414);
        parcel.writeLong(this.f65419);
        parcel.writeLong(this.f65420);
        parcel.writeLong(this.f65421);
        TextUtils.writeToParcel(this.f65418, parcel, i);
        parcel.writeTypedList(this.f65413);
        parcel.writeLong(this.f65422);
        parcel.writeBundle(this.f65417);
        parcel.writeInt(this.f65412);
    }

    /* JADX INFO: renamed from: ֫ */
    public final PlaybackState m47021() {
        if (this.f65423 == null) {
            PlaybackState.Builder builderM24773 = C1280.m24773();
            C1280.m24778(builderM24773, this.f65416, this.f65415, this.f65414, this.f65419);
            C1280.m24790(builderM24773, this.f65420);
            C1280.m24779(builderM24773, this.f65421);
            C1280.m24781(builderM24773, this.f65418);
            Iterator it = this.f65413.iterator();
            while (it.hasNext()) {
                C1280.m24780(builderM24773, ((C1770) it.next()).m45588());
            }
            C1280.m24786(builderM24773, this.f65422);
            if (Build.VERSION.SDK_INT >= 22) {
                C1630.m39792(builderM24773, this.f65417);
            }
            this.f65423 = C1280.m24776(builderM24773);
        }
        return this.f65423;
    }
}
