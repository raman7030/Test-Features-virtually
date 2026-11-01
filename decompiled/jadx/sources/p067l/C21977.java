package p067l;

/* JADX INFO: renamed from: l.᩷ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes4.dex */
public final class C21977 {

    /* JADX INFO: renamed from: ֫ */
    public C8565 f69057;

    /* JADX INFO: renamed from: ۧ */
    public long f69058;

    /* JADX INFO: renamed from: ܽ */
    public C15940 f69059;

    /* JADX INFO: renamed from: ܿ */
    public long f69060;

    /* JADX INFO: renamed from: ᩳ */
    public Object f69061;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public synchronized void m49539(C8565 c8565) {
        c8565.f23022 = true;
        if (this.f69057 == c8565) {
            this.f69057 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49541() {
        long j = this.f69060 + 1;
        this.f69060 = j;
        this.f69058 = j;
        C8565 c8565 = this.f69057;
        if (c8565 != null) {
            c8565.f23022 = true;
            this.f69057 = null;
        }
        this.f69059 = null;
        this.f69061 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C15940 m49543() {
        return this.f69059;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m49544() {
        long j = this.f69060 + 1;
        this.f69060 = j;
        this.f69058 = j;
        C8565 c8565 = this.f69057;
        if (c8565 != null) {
            c8565.f23022 = true;
            this.f69057 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX INFO: renamed from: ֫ */
    public final C8565 m49540(C24320 c24320, InterfaceC21800 interfaceC21800, C9729 c9729, long j, int i, int i2, C2667 c2667, C15940 c15940, C16611 c16611) {
        C17952 c17952M36195;
        C13221 c13221M36190;
        C19294 c19294;
        C16611 c16612;
        C19294 c19295;
        C18623 c18623;
        C12826.requireNonNull(c24320, "program");
        C12826.requireNonNull(interfaceC21800, "textOwner");
        int length = c9729.length();
        C12826.checkFromToIndex(i, i2, length);
        synchronized (this) {
            long j2 = this.f69060 + 1;
            this.f69060 = j2;
            C15940 c15941 = this.f69059;
            if (c15941 != null && this.f69061 == interfaceC21800 && c15941.f46134 == c24320 && this.f69059.f46130 == j && this.f69059.f46136 == length) {
                c17952M36195 = this.f69059.m36195();
                c13221M36190 = this.f69059.m36190();
                c19294 = this.f69059.f46135;
                C12391 c12391M30235 = i != i2 ? c13221M36190.m30235(c24320, i) : null;
                C13221 c13221 = c13221M36190;
                C12391 c12391 = c12391M30235;
                if (c17952M36195 != null && c15940 != null && this.f69059 == c15940 && this.f69061 == interfaceC21800 && c15940.f46134 == c24320 && c16611 != null && c16611.m37663() == c15940.f46136 && c16611.m37665() == length) {
                    c17952M36195 = c15940.m36195();
                    if (!c16611.m37662() && c24320.m53669() && c24320.m53670()) {
                        c19294 = c15940.f46135 == null ? new C19294(c15940.f46132, c15940.f46128, c16611) : c15940.f46135.m43988(c16611);
                    }
                    c16612 = c16611;
                } else {
                    c16612 = null;
                }
                C17952 c17952 = c17952M36195;
                if (c19294 != null || c19294.f57642.m40867(c19294.f57640)) {
                    c19295 = c19294;
                } else {
                    c19295 = null;
                }
                c18623 = new C18623(this, j2, c24320, interfaceC21800, j, length, i, i2, c17952, c13221, c12391, c16612, c19295);
            } else {
                c17952M36195 = null;
                c13221M36190 = null;
                c19294 = null;
            }
            C13221 c13222 = c13221M36190;
            C12391 c12392 = c12391M30235;
            if (c17952M36195 != null) {
                c16612 = null;
            } else {
                c16612 = null;
            }
            C17952 c17953 = c17952M36195;
            if (c19294 != null) {
                c19295 = c19294;
            } else {
                c19295 = c19294;
            }
            c18623 = new C18623(this, j2, c24320, interfaceC21800, j, length, i, i2, c17953, c13222, c12392, c16612, c19295);
        }
        return m49537(c18623, c9729, c2667);
    }

    /* JADX INFO: renamed from: ֫ */
    private C8565 m49537(C18623 c18623, C9729 c9729, C2667 c2667) {
        C18623.m42372(c18623, this);
        C8565 c8565 = new C8565(this, c18623, c9729, c2667);
        synchronized (this) {
            if (this.f69060 != c8565.f23029) {
                c8565.f23022 = true;
                return c8565;
            }
            C8565 c8566 = this.f69057;
            if (c8566 != null) {
                c8566.f23022 = true;
                this.f69057 = null;
            }
            if (this.f69059 != null && (this.f69061 != c8565.f23016 || this.f69059.f46134 != c8565.f23018)) {
                this.f69059 = null;
                this.f69061 = null;
            }
            this.f69058 = c8565.f23029;
            this.f69057 = c8565;
            return c8565;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49542(C8565 c8565) {
        C15940 c15940;
        C12826.requireNonNull(c8565, "work");
        if (c8565.f23017 != this || (c15940 = c8565.f23025) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c8565.m19974()) {
            m49539(c8565);
            return false;
        }
        synchronized (this) {
            if (this.f69057 == c8565 && this.f69058 == c8565.f23029 && !c8565.f23022) {
                this.f69059 = c15940;
                this.f69061 = c8565.f23016;
                this.f69057 = null;
                return true;
            }
            return false;
        }
    }
}
