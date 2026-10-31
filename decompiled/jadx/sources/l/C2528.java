package l;

import android.graphics.Typeface;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.ۖ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2528 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f8015;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final LruCache f8016;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8017 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f8018;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f8019;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15932 f8020;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicIntegerArray f8021;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Typeface f8022;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8036(char c) {
        if ('a' > c || c > 'z') {
            return ('A' > c || c > 'Z') ? c + 4 : c - '\'';
        }
        return c - 'a';
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0007, B:8:0x0011), top: B:14:0x0005 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C2528 m8037(Typeface typeface) {
        LruCache lruCache;
        C2528 c2528;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
            lruCache = f8016;
            c2528 = (C2528) lruCache.get(typeface);
            if (c2528 == null) {
                c2528 = new C2528(typeface);
                lruCache.put(typeface, c2528);
            }
        } else {
            lruCache = f8016;
            c2528 = (C2528) lruCache.get(typeface);
            if (c2528 == null) {
                c2528 = new C2528(typeface);
                lruCache.put(typeface, c2528);
            }
        }
        throw th;
        return c2528;
    }

    static {
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        f8018 = charArray;
        f8015 = charArray.length;
        f8016 = new LruCache(8);
    }

    public C2528(Typeface typeface) {
        Typeface typeface2 = Typeface.MONOSPACE;
        C15932 c15932 = typeface2.equals(typeface) ? null : new C15932(typeface);
        int i = f8015;
        this.f8021 = new AtomicIntegerArray(i * i);
        this.f8022 = typeface;
        this.f8020 = c15932;
        this.f8019 = typeface2.equals(typeface);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8040(char c, char c2) {
        int i;
        int i2;
        if (!this.f8019) {
            if ('a' > c || c > 'z') {
                i = ('A' > c || c > 'Z') ? c + 4 : c - '\'';
            } else {
                i = c - 'a';
            }
            int i3 = i * f8015;
            if ('a' > c2 || c2 > 'z') {
                i2 = ('A' > c2 || c2 > 'Z') ? c2 + 4 : c2 - '\'';
            } else {
                i2 = c2 - 'a';
            }
            int i4 = i3 + i2;
            AtomicIntegerArray atomicIntegerArray = this.f8021;
            int i5 = atomicIntegerArray.get(i4);
            if (i5 == 0) {
                int i6 = 2;
                try {
                    if (this.f8020.m37709(c, c2)) {
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
