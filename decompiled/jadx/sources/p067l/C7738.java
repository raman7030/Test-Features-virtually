package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۚ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QD */
/* JADX INFO: loaded from: classes2.dex */
public final class C7738 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public int f20282;

    /* JADX INFO: renamed from: ۙ */
    public final int f20283;

    /* JADX INFO: renamed from: ۫ */
    public final C22902 f20285;

    /* JADX INFO: renamed from: ۬ */
    public final C22902 f20286;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f20289;

    /* JADX INFO: renamed from: ۤ */
    public final Object f20284 = new Object();

    /* JADX INFO: renamed from: ᩶ */
    public final IdentityHashMap f20287 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩸ */
    public Runnable f20288 = new RunnableC3043();

    /* JADX INFO: renamed from: ֫ */
    public final void m17859(Runnable runnable) {
        this.f20288 = runnable;
    }

    public C7738(C22902 c22902, C22902 c22903) {
        if (c22902 == c22903 || c22902.f72073 != c22903.f72073 || c22902.f72072 != c22903.f72072 || c22902.f72076 != c22903.f72076 || !c22902.f72077.equals(c22903.f72077) || c22903.f72078 <= c22902.f72078) {
            throw new IllegalArgumentException("Invalid recovery graph copy configuration");
        }
        this.f20286 = c22902;
        this.f20285 = c22903;
        this.f20283 = BasicLabelFormatter.MILLION;
        m17854();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7738 m17852(C22902 c22902, C22902 c22903) {
        return new C7738(c22902, c22903, 0);
    }

    public C7738(C22902 c22902, C22902 c22903, int i) {
        if (c22902 != null && c22903 != null && (c22902.f72072 != c22903.f72072 || c22902.f72076 != c22903.f72076)) {
            throw new IllegalArgumentException("Invalid session graph copy configuration");
        }
        this.f20286 = c22902;
        this.f20285 = c22903;
        this.f20283 = BasicLabelFormatter.MILLION;
        m17854();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17854() {
        C22902 c22902 = this.f20286;
        if (c22902 != null) {
            c22902.m51158();
        }
        try {
            C22902 c22903 = this.f20285;
            if (c22903 != null) {
                c22903.m51158();
            }
        } catch (Error | RuntimeException e) {
            if (c22902 != null) {
                c22902.m51159();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m17855(Object obj) {
        return this.f20287.get(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17858(Object obj, Object obj2) {
        this.f20287.put(obj, obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m17856(C13773 c13773) throws IOException {
        C22902 c22902;
        C22902 c22903 = c13773.f38940;
        int i = c13773.f38938;
        int i2 = c13773.f38937;
        C22902 c22904 = this.f20286;
        if (c22903 != c22904 || ((c22902 = this.f20285) != null && (i2 != c22902.f72072 || i != c22902.f72076))) {
            throw new IOException("History tree belongs to another recovery generation");
        }
        if (c22904 == null && c22902 == null) {
            return c13773;
        }
        IdentityHashMap identityHashMap = this.f20287;
        C13773 c13774 = (C13773) identityHashMap.get(c13773);
        if (c13774 != null) {
            return c13774;
        }
        m17857();
        C13773 c13775 = new C13773(m17853(c13773.f38939), i2, i, c22902);
        identityHashMap.put(c13773, c13775);
        return c13775;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21820 m17853(AbstractC21820 abstractC21820) throws IOException {
        AbstractC21820 c25172;
        if (abstractC21820 == null) {
            return null;
        }
        IdentityHashMap identityHashMap = this.f20287;
        AbstractC21820 abstractC21821 = (AbstractC21820) identityHashMap.get(abstractC21820);
        if (abstractC21821 != null) {
            return abstractC21821;
        }
        m17857();
        boolean z = abstractC21820 instanceof C23161;
        Object obj = this.f20284;
        if (z) {
            C23161 c23161 = (C23161) abstractC21820;
            C10161 c10161 = c23161.f72769;
            if ((c10161 != null ? c10161.f28112 : null) != this.f20286) {
                throw new IOException("Text page belongs to another recovery generation");
            }
            Object objM51622 = c23161.m51622();
            c25172 = (C23161) identityHashMap.get(objM51622);
            if (c25172 == null) {
                m17857();
                C17124 c17124M51621 = c23161.m51621();
                C12825 c12825 = c17124M51621.f50590;
                try {
                    C22902 c22902 = this.f20285;
                    if (c22902 != null) {
                        c25172 = new C23161(obj, c22902.m51144(c12825));
                    } else {
                        int i = c23161.f68652;
                        char[] cArr = new char[i];
                        c12825.m29375(0, i, cArr, 0);
                        c25172 = new C23161(obj, c23161.m51615(), cArr, 0, i, null);
                    }
                    c17124M51621.close();
                    identityHashMap.put(objM51622, c25172);
                } catch (Throwable th) {
                    try {
                        c17124M51621.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } else {
            AbstractC21820[] abstractC21820Arr = ((C25172) abstractC21820).f80530;
            AbstractC21820[] abstractC21820Arr2 = new AbstractC21820[abstractC21820Arr.length];
            for (int i2 = 0; i2 < abstractC21820Arr.length; i2++) {
                abstractC21820Arr2[i2] = m17853(abstractC21820Arr[i2]);
            }
            c25172 = new C25172(obj, abstractC21820Arr2);
        }
        identityHashMap.put(abstractC21820, c25172);
        return c25172;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17857() {
        this.f20288.run();
        int i = this.f20282;
        if (i == this.f20283) {
            throw new C15524("Recovery graph copy object limit exceeded");
        }
        this.f20282 = i + 1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C22902 c22902 = this.f20286;
        if (this.f20289) {
            return;
        }
        this.f20289 = true;
        this.f20287.clear();
        try {
            C22902 c22903 = this.f20285;
            if (c22903 != null) {
                c22903.m51159();
            }
        } finally {
            if (c22902 != null) {
                c22902.m51159();
            }
        }
    }
}
