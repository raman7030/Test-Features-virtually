package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۚ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5649 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f17436;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17437;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21605 f17439;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21605 f17440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17443;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f17438 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f17441 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f17442 = new RunnableC0709();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15938(Runnable runnable) {
        this.f17442 = runnable;
    }

    public C5649(C21605 c21605, C21605 c21606) {
        if (c21605 == c21606 || c21605.f69370 != c21606.f69370 || c21605.f69369 != c21606.f69369 || c21605.f69373 != c21606.f69373 || !c21605.f69374.equals(c21606.f69374) || c21606.f69375 <= c21605.f69375) {
            throw new IllegalArgumentException("Invalid recovery graph copy configuration");
        }
        this.f17440 = c21605;
        this.f17439 = c21606;
        this.f17437 = BasicLabelFormatter.MILLION;
        m15933();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5649 m15931(C21605 c21605, C21605 c21606) {
        return new C5649(c21605, c21606, 0);
    }

    public C5649(C21605 c21605, C21605 c21606, int i) {
        if (c21605 != null && c21606 != null && (c21605.f69369 != c21606.f69369 || c21605.f69373 != c21606.f69373)) {
            throw new IllegalArgumentException("Invalid session graph copy configuration");
        }
        this.f17440 = c21605;
        this.f17439 = c21606;
        this.f17437 = BasicLabelFormatter.MILLION;
        m15933();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15933() {
        C21605 c21605 = this.f17440;
        if (c21605 != null) {
            c21605.m48811();
        }
        try {
            C21605 c21606 = this.f17439;
            if (c21606 != null) {
                c21606.m48811();
            }
        } catch (Error | RuntimeException e) {
            if (c21605 != null) {
                c21605.m48812();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m15934(Object obj) {
        return this.f17441.get(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15937(Object obj, Object obj2) {
        this.f17441.put(obj, obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m15935(C11999 c11999) throws IOException {
        C21605 c21605;
        C21605 c21606 = c11999.f35930;
        int i = c11999.f35928;
        int i2 = c11999.f35927;
        C21605 c21607 = this.f17440;
        if (c21606 != c21607 || ((c21605 = this.f17439) != null && (i2 != c21605.f69369 || i != c21605.f69373))) {
            throw new IOException("History tree belongs to another recovery generation");
        }
        if (c21607 == null && c21605 == null) {
            return c11999;
        }
        IdentityHashMap identityHashMap = this.f17441;
        C11999 c119910 = (C11999) identityHashMap.get(c11999);
        if (c119910 != null) {
            return c119910;
        }
        m15936();
        C11999 c119911 = new C11999(m15932(c11999.f35929), i2, i, c21605);
        identityHashMap.put(c11999, c119911);
        return c119911;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m15932(AbstractC20466 abstractC20466) throws IOException {
        AbstractC20466 c23993;
        if (abstractC20466 == null) {
            return null;
        }
        IdentityHashMap identityHashMap = this.f17441;
        AbstractC20466 abstractC20467 = (AbstractC20466) identityHashMap.get(abstractC20466);
        if (abstractC20467 != null) {
            return abstractC20467;
        }
        m15936();
        boolean z = abstractC20466 instanceof C21877;
        Object obj = this.f17438;
        if (z) {
            C21877 c21877 = (C21877) abstractC20466;
            C8199 c8199 = c21877.f70059;
            if ((c8199 != null ? c8199.f25202 : null) != this.f17440) {
                throw new IOException("Text page belongs to another recovery generation");
            }
            Object objM49270 = c21877.m49270();
            c23993 = (C21877) identityHashMap.get(objM49270);
            if (c23993 == null) {
                m15936();
                C15525 c15525M49269 = c21877.m49269();
                C11002 c11002 = c15525M49269.f47458;
                try {
                    C21605 c21605 = this.f17439;
                    if (c21605 != null) {
                        c23993 = new C21877(obj, c21605.m48797(c11002));
                    } else {
                        int i = c21877.f65976;
                        char[] cArr = new char[i];
                        c11002.m27313(0, i, cArr, 0);
                        c23993 = new C21877(obj, c21877.m49263(), cArr, 0, i, null);
                    }
                    c15525M49269.close();
                    identityHashMap.put(objM49270, c23993);
                } catch (Throwable th) {
                    try {
                        c15525M49269.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } else {
            AbstractC20466[] abstractC20466Arr = ((C23993) abstractC20466).f77779;
            AbstractC20466[] abstractC20466Arr2 = new AbstractC20466[abstractC20466Arr.length];
            for (int i2 = 0; i2 < abstractC20466Arr.length; i2++) {
                abstractC20466Arr2[i2] = m15932(abstractC20466Arr[i2]);
            }
            c23993 = new C23993(obj, abstractC20466Arr2);
        }
        identityHashMap.put(abstractC20466, c23993);
        return c23993;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15936() {
        this.f17442.run();
        int i = this.f17436;
        if (i == this.f17437) {
            throw new C13842("Recovery graph copy object limit exceeded");
        }
        this.f17436 = i + 1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21605 c21605 = this.f17440;
        if (this.f17443) {
            return;
        }
        this.f17443 = true;
        this.f17441.clear();
        try {
            C21605 c21606 = this.f17439;
            if (c21606 != null) {
                c21606.m48812();
            }
        } finally {
            if (c21605 != null) {
                c21605.m48812();
            }
        }
    }
}
