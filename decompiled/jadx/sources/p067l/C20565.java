package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩵֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20565 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C19894();

    /* JADX INFO: renamed from: ᩸ */
    public int f63575;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f63575);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return C5410.m11876(this.f63575, C0249l.f1198d, sb);
    }
}
