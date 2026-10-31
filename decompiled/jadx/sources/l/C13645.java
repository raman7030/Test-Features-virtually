package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13645 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C22818();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f40702;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f40702);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" curTab=");
        return C9045.m23341(sb, this.f40702, l.d);
    }
}
