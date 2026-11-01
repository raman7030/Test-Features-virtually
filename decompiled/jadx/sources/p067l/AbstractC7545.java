package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۚܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 163F */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7545 {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f19796 = new HashMap();

    /* JADX INFO: renamed from: ᩶ */
    public final LinkedHashSet f19795 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f19797 = false;

    /* JADX INFO: renamed from: ܽ */
    public void mo17458() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17455() {
        this.f19797 = true;
        HashMap map = this.f19796;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.f19796.values().iterator();
                while (it.hasNext()) {
                    m17454(it.next());
                }
            }
        }
        LinkedHashSet linkedHashSet = this.f19795;
        if (linkedHashSet != null) {
            synchronized (linkedHashSet) {
                Iterator it2 = this.f19795.iterator();
                while (it2.hasNext()) {
                    m17454((Closeable) it2.next());
                }
            }
        }
        mo17458();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l.ᩳܺ֫] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX INFO: renamed from: ֫ */
    public final void m17456(C19615 c19615) {
        Object obj;
        synchronized (this.f19796) {
            obj = this.f19796.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj == null) {
                this.f19796.put("androidx.lifecycle.savedstate.vm.tag", c19615);
            }
        }
        if (obj != null) {
            c19615 = obj;
        }
        if (this.f19797) {
            m17454((Object) c19615);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m17457() {
        Object obj;
        HashMap map = this.f19796;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f19796.get("androidx.lifecycle.savedstate.vm.tag");
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17454(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
