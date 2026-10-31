package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19147 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C18441();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f60344;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f60344);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return C3200.m9831(this.f60344, l.d, sb);
    }
}
