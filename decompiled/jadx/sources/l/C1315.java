package l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q57Q */
/* JADX INFO: loaded from: classes2.dex */
public class C1315 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4720;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f4721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4722;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f4723;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4724;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized LinkedHashMap m4555() {
        return new LinkedHashMap(this.f4721);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo4557(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f4720;
        int i3 = this.f4724 + i2;
        i = i3 != 0 ? (i2 * 100) / i3 : 0;
        Locale locale = Locale.US;
        return "LruCache[maxSize=" + this.f4722 + ",hits=" + this.f4720 + ",misses=" + this.f4724 + ",hitRate=" + i + "%]";
    }

    public C1315(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4722 = i;
        this.f4721 = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4553(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f4721.get(obj);
            if (obj2 != null) {
                this.f4720++;
                return obj2;
            }
            this.f4724++;
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4554(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4723 += m4552(obj, obj2);
            objPut = this.f4721.put(obj, obj2);
            if (objPut != null) {
                this.f4723 -= m4552(obj, objPut);
            }
        }
        m4556(this.f4722);
        return objPut;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4556(int i) {
        while (true) {
            synchronized (this) {
                if (this.f4723 < 0 || (this.f4721.isEmpty() && this.f4723 != 0)) {
                    break;
                }
                if (this.f4723 > i && !this.f4721.isEmpty()) {
                    Map.Entry entry = (Map.Entry) this.f4721.entrySet().iterator().next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    this.f4721.remove(key);
                    this.f4723 -= m4552(key, value);
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4558(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object objRemove = this.f4721.remove(obj);
            if (objRemove != null) {
                this.f4723 -= m4552(obj, objRemove);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m4552(Object obj, Object obj2) {
        int iMo4557 = mo4557(obj, obj2);
        if (iMo4557 >= 0) {
            return iMo4557;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }
}
