package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes4.dex */
public final class C19660 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13625 f59789;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19660(C13625 c13625, String str) {
        super(str);
        this.f59789 = c13625;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f59789) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (true) {
                    long j = this.f59789.f70530;
                    C13625 c13625 = this.f59789;
                    if (jCurrentTimeMillis < j + c13625.f70533) {
                        c13625.wait((c13625.f70530 + this.f59789.f70533) - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        c13625.f70533 = 0L;
                        c13625.close();
                    }
                }
            }
        } catch (IOException | InterruptedException unused) {
        }
    }
}
