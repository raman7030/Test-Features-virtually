package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܶ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15235 extends AbstractC21587 {
    public volatile C15235 _immediate;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f46747;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15235 f46748;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f46749;

    @Override // l.AbstractC21587, l.AbstractC2975
    public final String toString() {
        AbstractC21587 abstractC21587Mo36043;
        String str;
        int i = C9613.f29157;
        AbstractC21587 abstractC21587 = C3763.f11853;
        if (this == abstractC21587) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC21587Mo36043 = abstractC21587.mo36043();
            } catch (UnsupportedOperationException unused) {
                abstractC21587Mo36043 = null;
            }
            str = this == abstractC21587Mo36043 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f46749.toString();
        return this.f46747 ? C16014.m37867(string, ".immediate") : string;
    }

    public C15235(Handler handler, boolean z) {
        super(0);
        this.f46749 = handler;
        this.f46747 = z;
        this._immediate = z ? this : null;
        C15235 c15235 = this._immediate;
        if (c15235 == null) {
            c15235 = new C15235(handler, true);
            this._immediate = c15235;
        }
        this.f46748 = c15235;
    }

    public C15235(Handler handler) {
        this(handler, false);
    }

    @Override // l.AbstractC21587
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC21587 mo36043() {
        return this.f46748;
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo9084() {
        return (this.f46747 && C11233.m27802(Looper.myLooper(), this.f46749.getLooper())) ? false : true;
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        if (this.f46749.post(runnable)) {
            return;
        }
        C13844.m33203(interfaceC14801, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C9613.m24546().mo6030(interfaceC14801, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15235) && ((C15235) obj).f46749 == this.f46749;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f46749);
    }
}
