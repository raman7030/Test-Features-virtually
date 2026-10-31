package l;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16373 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f50368 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17079 f50369;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C10730 m38538(String str) {
        C10730 c10730;
        c10730 = (C10730) this.f50368.get(str);
        if (c10730 != null) {
            if (!(c10730.f32327 != null)) {
                while (!c10730.f32328.f52371) {
                    try {
                        if (c10730.f32326.await(1L, TimeUnit.SECONDS)) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } else {
            c10730 = new C10730(this.f50369);
            this.f50368.put(str, c10730);
        }
        return c10730;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38539() {
        this.f50368.clear();
    }

    public C16373(C17079 c17079) {
        this.f50369 = c17079;
    }
}
