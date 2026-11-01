package p067l;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17929 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f53541 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18600 f53542;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C12566 m40755(String str) {
        C12566 c12566;
        c12566 = (C12566) this.f53541.get(str);
        if (c12566 != null) {
            if (!(c12566.f35301 != null)) {
                while (!c12566.f35302.f55553) {
                    try {
                        if (c12566.f35300.await(1L, TimeUnit.SECONDS)) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } else {
            c12566 = new C12566(this.f53542);
            this.f53541.put(str, c12566);
        }
        return c12566;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m40756() {
        this.f53541.clear();
    }

    public C17929(C18600 c18600) {
        this.f53542 = c18600;
    }
}
