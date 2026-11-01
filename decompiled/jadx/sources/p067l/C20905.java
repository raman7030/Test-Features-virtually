package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩵ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20905 extends AbstractC9165 {
    public static final Parcelable.Creator CREATOR = new C20234();

    /* JADX INFO: renamed from: ᩶ */
    public int f65652;

    /* JADX INFO: renamed from: ᩸ */
    public Parcelable f65653;

    /* JADX INFO: renamed from: ᩹ */
    public ClassLoader f65654;

    public C20905(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // p067l.AbstractC9165, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f65652);
        parcel.writeParcelable(this.f65653, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return C5410.m11876(this.f65652, C0249l.f1198d, sb);
    }

    public C20905(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C20905.class.getClassLoader() : classLoader;
        this.f65652 = parcel.readInt();
        this.f65653 = parcel.readParcelable(classLoader);
        this.f65654 = classLoader;
    }
}
