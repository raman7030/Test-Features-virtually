package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ۘ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6392 extends C8203 {
    public static final Parcelable.Creator CREATOR = new C5051();

    /* JADX INFO: renamed from: ᩶ */
    public int f16540;

    /* JADX INFO: renamed from: ᩸ */
    public int f16541;

    /* JADX INFO: renamed from: ᩹ */
    public int f16542;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f16540);
        parcel.writeInt(this.f16542);
        parcel.writeInt(this.f16541);
    }

    public C6392(Parcel parcel) {
        super(parcel);
        this.f16540 = parcel.readInt();
        this.f16542 = parcel.readInt();
        this.f16541 = parcel.readInt();
    }

    public C6392() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
