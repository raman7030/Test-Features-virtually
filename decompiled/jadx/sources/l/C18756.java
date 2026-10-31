package l;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6N1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18756 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f59260;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f59261 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Float m43427(String str) {
        return str.length() <= 128 ? (Float) this.f59261.get(str) : null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m43428() {
        this.f59261.clear();
        this.f59260 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m43429(String str, Float f) {
        if (str.length() > 128) {
            return;
        }
        if (this.f59261.put(str, f) == null) {
            this.f59260 += str.length();
        }
        Iterator it = this.f59261.keySet().iterator();
        while (true) {
            if (this.f59261.size() <= 1024 && this.f59260 <= 32768) {
                return;
            }
            this.f59260 -= ((String) it.next()).length();
            it.remove();
        }
    }
}
