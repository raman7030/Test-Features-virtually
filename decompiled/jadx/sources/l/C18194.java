package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18194 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11844 f56576;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18194(C11844 c11844, String str) {
        super(str);
        this.f56576 = c11844;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f56576) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (true) {
                    long j = this.f56576.f67845;
                    C11844 c11844 = this.f56576;
                    if (jCurrentTimeMillis < j + c11844.f67848) {
                        c11844.wait((c11844.f67845 + this.f56576.f67848) - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        c11844.f67848 = 0L;
                        c11844.close();
                    }
                }
            }
        } catch (IOException | InterruptedException unused) {
        }
    }
}
