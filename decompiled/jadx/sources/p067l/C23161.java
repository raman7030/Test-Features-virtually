package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes.dex */
public final class C23161 extends AbstractC21820 {

    /* JADX INFO: renamed from: ۜ */
    public final C12825 f72767;

    /* JADX INFO: renamed from: ܳ */
    public final int f72768;

    /* JADX INFO: renamed from: ᩷ */
    public final C10161 f72769;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f72770;

    public C23161(Object obj, final int i, final char[] cArr, final int i2, final int i3, C22902 c22902) {
        super(0, obj);
        int i4 = 0;
        boolean z = true;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            char c = cArr[i5];
            i4 = c == '\n' ? i4 + 1 : i4;
            if (c > 255) {
                z = false;
            }
        }
        this.f72768 = i;
        this.f72770 = z;
        this.f68652 = i3;
        this.f68653 = i4;
        if (c22902 == null) {
            this.f72769 = null;
            this.f72767 = new C12825(i, cArr, i2, i3, i4, z);
        } else {
            this.f72769 = c22902.m51143(i3, i4, z, new Supplier() { // from class: l.֨᩹ᩳ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C23161.m51613(this.f7861, i, cArr, i2, i3);
                }
            });
            this.f72767 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C12825 m51613(C23161 c23161, int i, char[] cArr, int i2, int i3) {
        return new C12825(i, cArr, i2, i3, c23161.f68653, c23161.f72770);
    }

    public C23161(Object obj, C10161 c10161) {
        super(0, obj);
        this.f72769 = c10161;
        this.f72767 = null;
        this.f72768 = c10161.f28113;
        this.f72770 = c10161.f28117;
        this.f68652 = c10161.f28116;
        this.f68653 = c10161.f28114;
    }

    public C23161(Object obj, C12825 c12825) {
        super(0, obj);
        this.f72769 = null;
        this.f72767 = c12825;
        this.f72768 = c12825.m29377();
        this.f72770 = c12825.m29381();
        this.f68652 = c12825.m29383();
        this.f68653 = c12825.m29382();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51615() {
        return this.f72768;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m51619() {
        return this.f72770;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m51622() {
        C10161 c10161 = this.f72769;
        return c10161 == null ? this.f72767 : c10161;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17124 m51621() {
        C12825 c12825 = this.f72767;
        if (c12825 != null) {
            return new C17124(c12825, null);
        }
        C10161 c10161 = this.f72769;
        return new C17124(null, c10161.f28112.f72073.m6163(c10161));
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m51614(int i) {
        C12825 c12825 = this.f72767;
        if (c12825 != null) {
            return c12825.m29372(i);
        }
        C17124 c17124M51621 = m51621();
        try {
            char cM29372 = c17124M51621.f50590.m29372(i);
            c17124M51621.close();
            return cM29372;
        } catch (Throwable th) {
            try {
                c17124M51621.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51617(char[] cArr, int i, int i2) {
        C12825 c12825 = this.f72767;
        if (c12825 != null) {
            c12825.m29375(0, i, cArr, i2);
            return;
        }
        C17124 c17124M51621 = m51621();
        try {
            c17124M51621.f50590.m29375(0, i, cArr, i2);
            c17124M51621.close();
        } catch (Throwable th) {
            try {
                c17124M51621.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23161 m51616(Object obj, final int i, final int i2, final char[] cArr, final int i3) {
        C17124 c17124M51621 = m51621();
        try {
            final C12825 c12825 = c17124M51621.f50590;
            C10161 c10161 = this.f72769;
            if (c10161 != null) {
                int iM29378 = this.f68653 - (c12825.m29378(i2) - c12825.m29378(i));
                boolean z = this.f72770;
                for (int i4 = 0; i4 < i3; i4++) {
                    char c = cArr[i4];
                    if (c == '\n') {
                        iM29378++;
                    }
                    if (c > 255) {
                        z = false;
                    }
                }
                C23161 c23161 = new C23161(obj, c10161.f28112.m51143((this.f68652 - (i2 - i)) + i3, iM29378, z, new Supplier() { // from class: l.۠᩹ᩳ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return c12825.m29379(i, i2, cArr, i3);
                    }
                }));
                c17124M51621.close();
                return c23161;
            }
            C23161 c23162 = new C23161(obj, c12825.m29379(i, i2, cArr, i3));
            c17124M51621.close();
            return c23162;
        } catch (Throwable th) {
            try {
                c17124M51621.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m51618(int i) {
        C12825 c12825 = this.f72767;
        if (c12825 != null) {
            return c12825.m29378(i);
        }
        C17124 c17124M51621 = m51621();
        try {
            int iM29378 = c17124M51621.f50590.m29378(i);
            c17124M51621.close();
            return iM29378;
        } catch (Throwable th) {
            try {
                c17124M51621.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m51620(int i) {
        C12825 c12825 = this.f72767;
        if (c12825 != null) {
            return c12825.m29380(i);
        }
        C17124 c17124M51621 = m51621();
        try {
            int iM29380 = c17124M51621.f50590.m29380(i);
            c17124M51621.close();
            return iM29380;
        } catch (Throwable th) {
            try {
                c17124M51621.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
