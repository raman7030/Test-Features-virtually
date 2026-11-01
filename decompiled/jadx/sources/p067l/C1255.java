package p067l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۠ᩳ */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1255 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0905();

    /* JADX INFO: renamed from: ۙ */
    public final IntentSender f28457;

    /* JADX INFO: renamed from: ᩶ */
    public final int f28458;

    /* JADX INFO: renamed from: ᩸ */
    public final Intent f28459;

    /* JADX INFO: renamed from: ᩹ */
    public final int f28460;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1255(IntentSender intentSender, Intent intent, int i, int i2) {
        C13045.m29867(intentSender, "intentSender");
        this.f28457 = intentSender;
        this.f28459 = intent;
        this.f28460 = i;
        this.f28458 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C13045.m29867(parcel, "dest");
        parcel.writeParcelable(this.f28457, i);
        parcel.writeParcelable(this.f28459, i);
        parcel.writeInt(this.f28460);
        parcel.writeInt(this.f28458);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final IntentSender m23904() {
        return this.f28457;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Intent m23901() {
        return this.f28459;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m23902() {
        return this.f28460;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m23903() {
        return this.f28458;
    }
}
