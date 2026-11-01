package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;

/* JADX INFO: renamed from: l.۠᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10407 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20664 f28786;

    /* JADX INFO: renamed from: ۧ */
    public final Context f28787;

    /* JADX INFO: renamed from: ܽ */
    public boolean f28788;

    /* JADX INFO: renamed from: ᩳ */
    public final C7725 f28789;

    public C10407(ContextWrapper contextWrapper, Looper looper, Looper looper2, InterfaceC3701 interfaceC3701, C15849 c15849) {
        this.f28787 = contextWrapper.getApplicationContext();
        this.f28786 = c15849.mo35964(looper, null);
        this.f28789 = new C7725(this, c15849.mo35964(looper2, null), interfaceC3701);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24109() {
        if (this.f28788) {
            this.f28786.mo19707(new Runnable() { // from class: l.᩵᩹֫
                @Override // java.lang.Runnable
                public final void run() {
                    C10407 c10407 = this.f66429;
                    c10407.f28787.unregisterReceiver(c10407.f28789);
                }
            });
            this.f28788 = false;
        }
    }
}
