package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܶ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4GC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC15091 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f46094;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3633();

    public AbstractRunnableC15091(String str, Object... objArr) {
        byte[] bArr = C20032.f64884;
        this.f46094 = String.format(Locale.US, str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f46094);
        try {
            mo3633();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
