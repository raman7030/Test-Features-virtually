package l;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes2.dex */
public final class C6918 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23851();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Intent f21358;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f21359;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C6918(Intent intent, int i) {
        this.f21359 = i;
        this.f21358 = intent;
    }

    public C6918(Parcel parcel) {
        this.f21359 = parcel.readInt();
        this.f21358 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18710() {
        return this.f21359;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Intent m18709() {
        return this.f21358;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f21359;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f21358);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21359);
        Intent intent = this.f21358;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
