package p067l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩵ */
/* JADX INFO: compiled from: Q57Q */
/* JADX INFO: loaded from: classes2.dex */
public class C0907 {

    /* JADX INFO: renamed from: ֫ */
    public int f7491;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f7492;

    /* JADX INFO: renamed from: ܽ */
    public int f7493;

    /* JADX INFO: renamed from: ܿ */
    public int f7494;

    /* JADX INFO: renamed from: ᩳ */
    public int f7495;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized LinkedHashMap m6787() {
        return new LinkedHashMap(this.f7492);
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo6789(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f7491;
        int i3 = this.f7495 + i2;
        i = i3 != 0 ? (i2 * 100) / i3 : 0;
        Locale locale = Locale.US;
        return "LruCache[maxSize=" + this.f7493 + ",hits=" + this.f7491 + ",misses=" + this.f7495 + ",hitRate=" + i + "%]";
    }

    public C0907(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f7493 = i;
        this.f7492 = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m6785(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f7492.get(obj);
            if (obj2 != null) {
                this.f7491++;
                return obj2;
            }
            this.f7495++;
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m6786(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f7494 += m6784(obj, obj2);
            objPut = this.f7492.put(obj, obj2);
            if (objPut != null) {
                this.f7494 -= m6784(obj, objPut);
            }
        }
        m6788(this.f7493);
        return objPut;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6788(int i) {
        while (true) {
            synchronized (this) {
                if (this.f7494 < 0 || (this.f7492.isEmpty() && this.f7494 != 0)) {
                    break;
                }
                if (this.f7494 > i && !this.f7492.isEmpty()) {
                    Map.Entry entry = (Map.Entry) this.f7492.entrySet().iterator().next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    this.f7492.remove(key);
                    this.f7494 -= m6784(key, value);
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6790(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object objRemove = this.f7492.remove(obj);
            if (objRemove != null) {
                this.f7494 -= m6784(obj, objRemove);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private int m6784(Object obj, Object obj2) {
        int iMo6789 = mo6789(obj, obj2);
        if (iMo6789 >= 0) {
            return iMo6789;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }
}
