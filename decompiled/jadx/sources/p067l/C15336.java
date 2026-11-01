package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܰۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes3.dex */
public final class C15336 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C24054();

    /* JADX INFO: renamed from: ᩸ */
    public String f43783;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f43783);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" curTab=");
        return C10965.m25286(sb, this.f43783, C0249l.f1198d);
    }
}
