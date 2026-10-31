package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۚܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 163F */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5447 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f16955 = new HashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f16954 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f16956 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo15547() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15544() {
        this.f16956 = true;
        HashMap map = this.f16955;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.f16955.values().iterator();
                while (it.hasNext()) {
                    m15543(it.next());
                }
            }
        }
        LinkedHashSet linkedHashSet = this.f16954;
        if (linkedHashSet != null) {
            synchronized (linkedHashSet) {
                Iterator it2 = this.f16954.iterator();
                while (it2.hasNext()) {
                    m15543((Closeable) it2.next());
                }
            }
        }
        mo15547();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l.ᩳܺ֫] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15545(C18147 c18147) {
        Object obj;
        synchronized (this.f16955) {
            obj = this.f16955.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj == null) {
                this.f16955.put("androidx.lifecycle.savedstate.vm.tag", c18147);
            }
        }
        if (obj != null) {
            c18147 = obj;
        }
        if (this.f16956) {
            m15543((Object) c18147);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m15546() {
        Object obj;
        HashMap map = this.f16955;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f16955.get("androidx.lifecycle.savedstate.vm.tag");
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15543(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
