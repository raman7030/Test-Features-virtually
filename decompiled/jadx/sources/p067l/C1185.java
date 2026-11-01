package p067l;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜᩳ */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1185 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2025();

    /* JADX INFO: renamed from: ᩸ */
    public final Intent f24239;

    /* JADX INFO: renamed from: ᩹ */
    public final int f24240;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1185(Intent intent, int i) {
        this.f24240 = i;
        this.f24239 = intent;
    }

    public C1185(Parcel parcel) {
        this.f24240 = parcel.readInt();
        this.f24239 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20659() {
        return this.f24240;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Intent m20658() {
        return this.f24239;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f24240;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f24239);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24240);
        Intent intent = this.f24239;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
