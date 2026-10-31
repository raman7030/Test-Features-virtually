package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.ۡ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8736 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C9442();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26596;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Parcelable f26597;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f26598;

    public C8736(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f26596 = parcel.readInt();
        this.f26598 = parcel.readInt();
        this.f26597 = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f26596);
        parcel.writeInt(this.f26598);
        parcel.writeParcelable(this.f26597, i);
    }
}
