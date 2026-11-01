package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֨ۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0885 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C1095();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f6120;

    public C0885(Parcelable parcelable) {
        super(parcelable);
    }

    public C0885(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6120 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f6120));
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f6120 + C0249l.f1198d;
    }
}
