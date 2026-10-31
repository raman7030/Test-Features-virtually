package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes.dex */
public final class C21877 extends AbstractC20466 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11002 f70057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f70058;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8199 f70059;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f70060;

    public C21877(Object obj, final int i, final char[] cArr, final int i2, final int i3, C21605 c21605) {
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
        this.f70058 = i;
        this.f70060 = z;
        this.f65976 = i3;
        this.f65977 = i4;
        if (c21605 == null) {
            this.f70059 = null;
            this.f70057 = new C11002(i, cArr, i2, i3, i4, z);
        } else {
            this.f70059 = c21605.m48796(i3, i4, z, new Supplier() { // from class: l.֨᩹ᩳ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C21877.m49261(this.f5090, i, cArr, i2, i3);
                }
            });
            this.f70057 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11002 m49261(C21877 c21877, int i, char[] cArr, int i2, int i3) {
        return new C11002(i, cArr, i2, i3, c21877.f65977, c21877.f70060);
    }

    public C21877(Object obj, C8199 c8199) {
        super(0, obj);
        this.f70059 = c8199;
        this.f70057 = null;
        this.f70058 = c8199.f25203;
        this.f70060 = c8199.f25207;
        this.f65976 = c8199.f25206;
        this.f65977 = c8199.f25204;
    }

    public C21877(Object obj, C11002 c11002) {
        super(0, obj);
        this.f70059 = null;
        this.f70057 = c11002;
        this.f70058 = c11002.m27315();
        this.f70060 = c11002.m27319();
        this.f65976 = c11002.m27321();
        this.f65977 = c11002.m27320();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49263() {
        return this.f70058;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49267() {
        return this.f70060;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m49270() {
        C8199 c8199 = this.f70059;
        return c8199 == null ? this.f70057 : c8199;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15525 m49269() {
        C11002 c11002 = this.f70057;
        if (c11002 != null) {
            return new C15525(c11002, null);
        }
        C8199 c8199 = this.f70059;
        return new C15525(null, c8199.f25202.f69370.m3922(c8199));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m49262(int i) {
        C11002 c11002 = this.f70057;
        if (c11002 != null) {
            return c11002.m27310(i);
        }
        C15525 c15525M49269 = m49269();
        try {
            char cM27310 = c15525M49269.f47458.m27310(i);
            c15525M49269.close();
            return cM27310;
        } catch (Throwable th) {
            try {
                c15525M49269.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49265(char[] cArr, int i, int i2) {
        C11002 c11002 = this.f70057;
        if (c11002 != null) {
            c11002.m27313(0, i, cArr, i2);
            return;
        }
        C15525 c15525M49269 = m49269();
        try {
            c15525M49269.f47458.m27313(0, i, cArr, i2);
            c15525M49269.close();
        } catch (Throwable th) {
            try {
                c15525M49269.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21877 m49264(Object obj, final int i, final int i2, final char[] cArr, final int i3) {
        C15525 c15525M49269 = m49269();
        try {
            final C11002 c11002 = c15525M49269.f47458;
            C8199 c8199 = this.f70059;
            if (c8199 != null) {
                int iM27316 = this.f65977 - (c11002.m27316(i2) - c11002.m27316(i));
                boolean z = this.f70060;
                for (int i4 = 0; i4 < i3; i4++) {
                    char c = cArr[i4];
                    if (c == '\n') {
                        iM27316++;
                    }
                    if (c > 255) {
                        z = false;
                    }
                }
                C21877 c21877 = new C21877(obj, c8199.f25202.m48796((this.f65976 - (i2 - i)) + i3, iM27316, z, new Supplier() { // from class: l.۠᩹ᩳ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return c11002.m27317(i, i2, cArr, i3);
                    }
                }));
                c15525M49269.close();
                return c21877;
            }
            C21877 c21878 = new C21877(obj, c11002.m27317(i, i2, cArr, i3));
            c15525M49269.close();
            return c21878;
        } catch (Throwable th) {
            try {
                c15525M49269.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49266(int i) {
        C11002 c11002 = this.f70057;
        if (c11002 != null) {
            return c11002.m27316(i);
        }
        C15525 c15525M49269 = m49269();
        try {
            int iM27316 = c15525M49269.f47458.m27316(i);
            c15525M49269.close();
            return iM27316;
        } catch (Throwable th) {
            try {
                c15525M49269.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m49268(int i) {
        C11002 c11002 = this.f70057;
        if (c11002 != null) {
            return c11002.m27318(i);
        }
        C15525 c15525M49269 = m49269();
        try {
            int iM27318 = c15525M49269.f47458.m27318(i);
            c15525M49269.close();
            return iM27318;
        } catch (Throwable th) {
            try {
                c15525M49269.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
