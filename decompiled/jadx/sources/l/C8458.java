package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;

/* JADX INFO: renamed from: l.۠᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8458 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f25873;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f25874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f25875;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5636 f25876;

    public C8458(ContextWrapper contextWrapper, Looper looper, Looper looper2, InterfaceC1402 interfaceC1402, C14185 c14185) {
        this.f25874 = contextWrapper.getApplicationContext();
        this.f25873 = c14185.mo33832(looper, null);
        this.f25876 = new C5636(this, c14185.mo33832(looper2, null), interfaceC1402);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22140() {
        if (this.f25875) {
            this.f25873.mo17760(new Runnable() { // from class: l.᩵᩹֫
                @Override // java.lang.Runnable
                public final void run() {
                    C8458 c8458 = this.f63794;
                    c8458.f25874.unregisterReceiver(c8458.f25876);
                }
            });
            this.f25875 = false;
        }
    }
}
