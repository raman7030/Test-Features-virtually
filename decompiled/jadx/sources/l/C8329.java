package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes3.dex */
public final class C8329 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1273();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IntentSender f25543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f25544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Intent f25545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f25546;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C8329(IntentSender intentSender, Intent intent, int i, int i2) {
        C11233.m27805(intentSender, "intentSender");
        this.f25543 = intentSender;
        this.f25545 = intent;
        this.f25546 = i;
        this.f25544 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C11233.m27805(parcel, "dest");
        parcel.writeParcelable(this.f25543, i);
        parcel.writeParcelable(this.f25545, i);
        parcel.writeInt(this.f25546);
        parcel.writeInt(this.f25544);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final IntentSender m21934() {
        return this.f25543;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Intent m21931() {
        return this.f25545;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m21932() {
        return this.f25546;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m21933() {
        return this.f25544;
    }
}
