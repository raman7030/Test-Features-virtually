package p067l;

import android.graphics.Typeface;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.ۖ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4771 {

    /* JADX INFO: renamed from: ۜ */
    public static final int f10806;

    /* JADX INFO: renamed from: ܳ */
    public static final LruCache f10807;

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f10808 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public static final char[] f10809;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f10810;

    /* JADX INFO: renamed from: ۧ */
    public final C17510 f10811;

    /* JADX INFO: renamed from: ܽ */
    public final AtomicIntegerArray f10812;

    /* JADX INFO: renamed from: ᩳ */
    public final Typeface f10813;

    /* JADX INFO: renamed from: ֫ */
    public static int m10066(char c) {
        if ('a' > c || c > 'z') {
            return ('A' > c || c > 'Z') ? c + 4 : c - '\'';
        }
        return c - 'a';
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0007, B:8:0x0011), top: B:14:0x0005 }] */
    /* JADX INFO: renamed from: ֫ */
    public static synchronized C4771 m10067(Typeface typeface) {
        LruCache lruCache;
        C4771 c4771;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
            lruCache = f10807;
            c4771 = (C4771) lruCache.get(typeface);
            if (c4771 == null) {
                c4771 = new C4771(typeface);
                lruCache.put(typeface, c4771);
            }
        } else {
            lruCache = f10807;
            c4771 = (C4771) lruCache.get(typeface);
            if (c4771 == null) {
                c4771 = new C4771(typeface);
                lruCache.put(typeface, c4771);
            }
        }
        throw th;
        return c4771;
    }

    static {
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        f10809 = charArray;
        f10806 = charArray.length;
        f10807 = new LruCache(8);
    }

    public C4771(Typeface typeface) {
        Typeface typeface2 = Typeface.MONOSPACE;
        C17510 c17510 = typeface2.equals(typeface) ? null : new C17510(typeface);
        int i = f10806;
        this.f10812 = new AtomicIntegerArray(i * i);
        this.f10813 = typeface;
        this.f10811 = c17510;
        this.f10810 = typeface2.equals(typeface);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10070(char c, char c2) {
        int i;
        int i2;
        if (!this.f10810) {
            if ('a' > c || c > 'z') {
                i = ('A' > c || c > 'Z') ? c + 4 : c - '\'';
            } else {
                i = c - 'a';
            }
            int i3 = i * f10806;
            if ('a' > c2 || c2 > 'z') {
                i2 = ('A' > c2 || c2 > 'Z') ? c2 + 4 : c2 - '\'';
            } else {
                i2 = c2 - 'a';
            }
            int i4 = i3 + i2;
            AtomicIntegerArray atomicIntegerArray = this.f10812;
            int i5 = atomicIntegerArray.get(i4);
            if (i5 == 0) {
                int i6 = 2;
                try {
                    if (this.f10811.m39884(c, c2)) {
                        i6 = 1;
                    }
                } catch (RuntimeException unused) {
                }
                if (!atomicIntegerArray.compareAndSet(i4, 0, i6)) {
                    i6 = atomicIntegerArray.get(i4);
                }
                return i6 == 1;
            }
            if (i5 != 1) {
                return false;
            }
        }
        return true;
    }
}
