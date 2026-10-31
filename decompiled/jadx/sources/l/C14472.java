package l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C14472 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17295();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC2210 f44348;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f44349;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f44347 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6369 f44346 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C14472(Object obj, InterfaceC2210 interfaceC2210) {
        this.f44349 = obj;
        this.f44348 = interfaceC2210;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14472 m34568(MediaSession.Token token, InterfaceC2210 interfaceC2210) {
        if (token != null) {
            return new C14472(token, interfaceC2210);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f44349, i);
    }

    public final int hashCode() {
        Object obj = this.f44349;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14472)) {
            return false;
        }
        Object obj2 = ((C14472) obj).f44349;
        Object obj3 = this.f44349;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m34573() {
        return this.f44349;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2210 m34569() {
        InterfaceC2210 interfaceC2210;
        synchronized (this.f44347) {
            interfaceC2210 = this.f44348;
        }
        return interfaceC2210;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34570(InterfaceC2210 interfaceC2210) {
        synchronized (this.f44347) {
            this.f44348 = interfaceC2210;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6369 m34572() {
        InterfaceC6369 interfaceC6369;
        synchronized (this.f44347) {
            interfaceC6369 = this.f44346;
        }
        return interfaceC6369;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34571(InterfaceC6369 interfaceC6369) {
        synchronized (this.f44347) {
            this.f44346 = interfaceC6369;
        }
    }
}
