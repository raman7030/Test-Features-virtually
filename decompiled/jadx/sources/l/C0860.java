package l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0860 extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new C5094();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f3347;

    public C0860(Parcelable parcelable) {
        super(parcelable);
    }

    public C0860(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3347 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f3347));
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3347 + l.d;
    }
}
