package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܶ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public final class C16848 extends AbstractC22885 {
    public volatile C16848 _immediate;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f49871;

    /* JADX INFO: renamed from: ۙ */
    public final C16848 f49872;

    /* JADX INFO: renamed from: ᩶ */
    public final Handler f49873;

    @Override // p067l.AbstractC22885, p067l.AbstractC5196
    public final String toString() {
        AbstractC22885 abstractC22885Mo38204;
        String str;
        int i = C11505.f32105;
        AbstractC22885 abstractC22885 = C5945.f14659;
        if (this == abstractC22885) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC22885Mo38204 = abstractC22885.mo38204();
            } catch (UnsupportedOperationException unused) {
                abstractC22885Mo38204 = null;
            }
            str = this == abstractC22885Mo38204 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f49873.toString();
        return this.f49871 ? C17588.m40053(string, ".immediate") : string;
    }

    public C16848(Handler handler, boolean z) {
        super(0);
        this.f49873 = handler;
        this.f49871 = z;
        this._immediate = z ? this : null;
        C16848 c16848 = this._immediate;
        if (c16848 == null) {
            c16848 = new C16848(handler, true);
            this._immediate = c16848;
        }
        this.f49872 = c16848;
    }

    public C16848(Handler handler) {
        this(handler, false);
    }

    @Override // p067l.AbstractC22885
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC22885 mo38204() {
        return this.f49872;
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo11136() {
        return (this.f49871 && C13045.m29864(Looper.myLooper(), this.f49873.getLooper())) ? false : true;
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable) {
        if (this.f49873.post(runnable)) {
            return;
        }
        C15526.m35321(interfaceC16436, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C11505.m26559().mo8227(interfaceC16436, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16848) && ((C16848) obj).f49873 == this.f49873;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f49873);
    }
}
