package l;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C13190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39449 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f39450 = Math.max(1L, X931RNG.BLOCK128_RESEED_MAX);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39451;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m32015(C12485 c12485) {
        return (Bitmap) this.f39449.get(c12485);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32017(C12485 c12485, Bitmap bitmap) {
        LinkedHashMap linkedHashMap = this.f39449;
        Bitmap bitmap2 = (Bitmap) linkedHashMap.put(c12485, bitmap);
        if (bitmap2 != null) {
            this.f39451 -= (long) Math.max(1, bitmap2.getAllocationByteCount());
        }
        this.f39451 += (long) Math.max(1, bitmap.getAllocationByteCount());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (this.f39451 > this.f39450 && it.hasNext()) {
            this.f39451 -= (long) Math.max(1, ((Bitmap) ((Map.Entry) it.next()).getValue()).getAllocationByteCount());
            it.remove();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m32014(int i, int i2, long j) {
        LinkedHashMap linkedHashMap = this.f39449;
        long j2 = C13132.FOREVER_NS;
        C12485 c12485 = null;
        for (C12485 c12486 : linkedHashMap.keySet()) {
            if (c12486.f37516 == i && c12486.f37515 == i2) {
                long jAbs = Math.abs(c12486.f37514 - j);
                if (jAbs < j2 || (jAbs == j2 && c12485 != null && c12486.f37514 < c12485.f37514)) {
                    c12485 = c12486;
                    j2 = jAbs;
                }
            }
        }
        if (c12485 == null) {
            return null;
        }
        return (Bitmap) linkedHashMap.get(c12485);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32016() {
        this.f39449.clear();
        this.f39451 = 0L;
    }
}
