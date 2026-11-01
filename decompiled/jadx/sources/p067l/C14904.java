package p067l;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C14904 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f42513 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ۧ */
    public final long f42514 = Math.max(1L, X931RNG.BLOCK128_RESEED_MAX);

    /* JADX INFO: renamed from: ܽ */
    public long f42515;

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m34113(C14234 c14234) {
        return (Bitmap) this.f42513.get(c14234);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34115(C14234 c14234, Bitmap bitmap) {
        LinkedHashMap linkedHashMap = this.f42513;
        Bitmap bitmap2 = (Bitmap) linkedHashMap.put(c14234, bitmap);
        if (bitmap2 != null) {
            this.f42515 -= (long) Math.max(1, bitmap2.getAllocationByteCount());
        }
        this.f42515 += (long) Math.max(1, bitmap.getAllocationByteCount());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (this.f42515 > this.f42514 && it.hasNext()) {
            this.f42515 -= (long) Math.max(1, ((Bitmap) ((Map.Entry) it.next()).getValue()).getAllocationByteCount());
            it.remove();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m34112(int i, int i2, long j) {
        LinkedHashMap linkedHashMap = this.f42513;
        long j2 = C14849.FOREVER_NS;
        C14234 c14234 = null;
        for (C14234 c14235 : linkedHashMap.keySet()) {
            if (c14235.f40539 == i && c14235.f40538 == i2) {
                long jAbs = Math.abs(c14235.f40537 - j);
                if (jAbs < j2 || (jAbs == j2 && c14234 != null && c14235.f40537 < c14234.f40537)) {
                    c14234 = c14235;
                    j2 = jAbs;
                }
            }
        }
        if (c14234 == null) {
            return null;
        }
        return (Bitmap) linkedHashMap.get(c14234);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34114() {
        this.f42513.clear();
        this.f42515 = 0L;
    }
}
