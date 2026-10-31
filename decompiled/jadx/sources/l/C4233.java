package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: l.ۘ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4233 extends C6139 {
    public static final Parcelable.Creator CREATOR = new C2822();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13727;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f13728;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f13729;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f13727);
        parcel.writeInt(this.f13729);
        parcel.writeInt(this.f13728);
    }

    public C4233(Parcel parcel) {
        super(parcel);
        this.f13727 = parcel.readInt();
        this.f13729 = parcel.readInt();
        this.f13728 = parcel.readInt();
    }

    public C4233() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
