package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18854 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C19525();

    /* JADX INFO: renamed from: ۙ */
    public int f56320;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f56321;

    /* JADX INFO: renamed from: ᩸ */
    public int f56322;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f56323;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56320);
        parcel.writeInt(this.f56322);
        parcel.writeInt(this.f56321 ? 1 : 0);
        int[] iArr = this.f56323;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f56323);
        } else {
            parcel.writeInt(0);
        }
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f56320 + ", mGapDir=" + this.f56322 + ", mHasUnwantedGapAfter=" + this.f56321 + ", mGapPerSpan=" + Arrays.toString(this.f56323) + '}';
    }
}
