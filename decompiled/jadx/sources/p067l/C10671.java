package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.ۡ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10671 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C11342();

    /* JADX INFO: renamed from: ᩶ */
    public int f29521;

    /* JADX INFO: renamed from: ᩸ */
    public Parcelable f29522;

    /* JADX INFO: renamed from: ᩹ */
    public int f29523;

    public C10671(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f29521 = parcel.readInt();
        this.f29523 = parcel.readInt();
        this.f29522 = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f29521);
        parcel.writeInt(this.f29523);
        parcel.writeParcelable(this.f29522, i);
    }
}
