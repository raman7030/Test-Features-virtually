package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17346 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18052();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53136;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f53137;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53138;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f53139;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f53136);
        parcel.writeInt(this.f53138);
        parcel.writeInt(this.f53137 ? 1 : 0);
        int[] iArr = this.f53139;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f53139);
        } else {
            parcel.writeInt(0);
        }
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f53136 + ", mGapDir=" + this.f53138 + ", mHasUnwantedGapAfter=" + this.f53137 + ", mGapPerSpan=" + Arrays.toString(this.f53139) + '}';
    }
}
