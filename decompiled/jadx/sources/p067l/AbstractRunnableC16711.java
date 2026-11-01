package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܶ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4GC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC16711 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final String f49214;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5904();

    public AbstractRunnableC16711(String str, Object... objArr) {
        byte[] bArr = C21407.f67526;
        this.f49214 = String.format(Locale.US, str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f49214);
        try {
            mo5904();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
