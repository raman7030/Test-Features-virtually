package p067l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳۧ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1560 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1700();

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC0952 f47449;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f47450;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f47448 = new Object();

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC8422 f47447 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1560(Object obj, InterfaceC0952 interfaceC0952) {
        this.f47450 = obj;
        this.f47449 = interfaceC0952;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1560 m36709(MediaSession.Token token, InterfaceC0952 interfaceC0952) {
        if (token != null) {
            return new C1560(token, interfaceC0952);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f47450, i);
    }

    public final int hashCode() {
        Object obj = this.f47450;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1560)) {
            return false;
        }
        Object obj2 = ((C1560) obj).f47450;
        Object obj3 = this.f47450;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m36714() {
        return this.f47450;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0952 m36710() {
        InterfaceC0952 interfaceC0952;
        synchronized (this.f47448) {
            interfaceC0952 = this.f47449;
        }
        return interfaceC0952;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36711(InterfaceC0952 interfaceC0952) {
        synchronized (this.f47448) {
            this.f47449 = interfaceC0952;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8422 m36713() {
        InterfaceC8422 interfaceC8422;
        synchronized (this.f47448) {
            interfaceC8422 = this.f47447;
        }
        return interfaceC8422;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36712(InterfaceC8422 interfaceC8422) {
        synchronized (this.f47448) {
            this.f47447 = interfaceC8422;
        }
    }
}
