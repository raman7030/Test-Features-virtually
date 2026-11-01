package p067l;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6N1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20194 {

    /* JADX INFO: renamed from: ֫ */
    public int f62483;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f62484 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Float m45694(String str) {
        return str.length() <= 128 ? (Float) this.f62484.get(str) : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m45695() {
        this.f62484.clear();
        this.f62483 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m45696(String str, Float f) {
        if (str.length() > 128) {
            return;
        }
        if (this.f62484.put(str, f) == null) {
            this.f62483 += str.length();
        }
        Iterator it = this.f62484.keySet().iterator();
        while (true) {
            if (this.f62484.size() <= 1024 && this.f62483 <= 32768) {
                return;
            }
            this.f62483 -= ((String) it.next()).length();
            it.remove();
        }
    }
}
