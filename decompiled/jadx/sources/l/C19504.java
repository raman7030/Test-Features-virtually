package l;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes5.dex */
public final class C19504 extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new C18798();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Parcelable f63036;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ClassLoader f63037;

    public C19504(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f63035);
        parcel.writeParcelable(this.f63036, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return C3200.m9831(this.f63035, l.d, sb);
    }

    public C19504(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C19504.class.getClassLoader() : classLoader;
        this.f63035 = parcel.readInt();
        this.f63036 = parcel.readParcelable(classLoader);
        this.f63037 = classLoader;
    }
}
