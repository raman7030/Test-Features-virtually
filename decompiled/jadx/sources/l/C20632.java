package l;

/* JADX INFO: renamed from: l.᩷ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes4.dex */
public final class C20632 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6520 f66376;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f66377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14280 f66378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f66379;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f66380;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized void m47212(C6520 c6520) {
        c6520.f20144 = true;
        if (this.f66376 == c6520) {
            this.f66376 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47214() {
        long j = this.f66379 + 1;
        this.f66379 = j;
        this.f66377 = j;
        C6520 c6520 = this.f66376;
        if (c6520 != null) {
            c6520.f20144 = true;
            this.f66376 = null;
        }
        this.f66378 = null;
        this.f66380 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C14280 m47216() {
        return this.f66378;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47217() {
        long j = this.f66379 + 1;
        this.f66379 = j;
        this.f66377 = j;
        C6520 c6520 = this.f66376;
        if (c6520 != null) {
            c6520.f20144 = true;
            this.f66376 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6520 m47213(C23097 c23097, InterfaceC20445 interfaceC20445, C7744 c7744, long j, int i, int i2, C0314 c0314, C14280 c14280, C14986 c14986) {
        C16397 c16397M34062;
        C11419 c11419M34057;
        C17809 c17809;
        C14986 c14987;
        C17809 c178010;
        C17103 c17103;
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, "textOwner");
        int length = c7744.length();
        C11003.checkFromToIndex(i, i2, length);
        synchronized (this) {
            long j2 = this.f66379 + 1;
            this.f66379 = j2;
            C14280 c14281 = this.f66378;
            if (c14281 != null && this.f66380 == interfaceC20445 && c14281.f43042 == c23097 && this.f66378.f43038 == j && this.f66378.f43044 == length) {
                c16397M34062 = this.f66378.m34062();
                c11419M34057 = this.f66378.m34057();
                c17809 = this.f66378.f43043;
                C10545 c10545M28191 = i != i2 ? c11419M34057.m28191(c23097, i) : null;
                C11419 c11419 = c11419M34057;
                C10545 c10545 = c10545M28191;
                if (c16397M34062 != null && c14280 != null && this.f66378 == c14280 && this.f66380 == interfaceC20445 && c14280.f43042 == c23097 && c14986 != null && c14986.m35507() == c14280.f43044 && c14986.m35509() == length) {
                    c16397M34062 = c14280.m34062();
                    if (!c14986.m35506() && c23097.m51275() && c23097.m51276()) {
                        c17809 = c14280.f43043 == null ? new C17809(c14280.f43040, c14280.f43036, c14986) : c14280.f43043.m41742(c14986);
                    }
                    c14987 = c14986;
                } else {
                    c14987 = null;
                }
                C16397 c16397 = c16397M34062;
                if (c17809 != null || c17809.f54446.m38651(c17809.f54444)) {
                    c178010 = c17809;
                } else {
                    c178010 = null;
                }
                c17103 = new C17103(this, j2, c23097, interfaceC20445, j, length, i, i2, c16397, c11419, c10545, c14987, c178010);
            } else {
                c16397M34062 = null;
                c11419M34057 = null;
                c17809 = null;
            }
            C11419 c114110 = c11419M34057;
            C10545 c10546 = c10545M28191;
            if (c16397M34062 != null) {
                c14987 = null;
            } else {
                c14987 = null;
            }
            C16397 c16398 = c16397M34062;
            if (c17809 != null) {
                c178010 = c17809;
            } else {
                c178010 = c17809;
            }
            c17103 = new C17103(this, j2, c23097, interfaceC20445, j, length, i, i2, c16398, c114110, c10546, c14987, c178010);
        }
        return m47210(c17103, c7744, c0314);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6520 m47210(C17103 c17103, C7744 c7744, C0314 c0314) {
        C17103.m40127(c17103, this);
        C6520 c6520 = new C6520(this, c17103, c7744, c0314);
        synchronized (this) {
            if (this.f66379 != c6520.f20151) {
                c6520.f20144 = true;
                return c6520;
            }
            C6520 c6521 = this.f66376;
            if (c6521 != null) {
                c6521.f20144 = true;
                this.f66376 = null;
            }
            if (this.f66378 != null && (this.f66380 != c6520.f20138 || this.f66378.f43042 != c6520.f20140)) {
                this.f66378 = null;
                this.f66380 = null;
            }
            this.f66377 = c6520.f20151;
            this.f66376 = c6520;
            return c6520;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47215(C6520 c6520) {
        C14280 c14280;
        C11003.requireNonNull(c6520, "work");
        if (c6520.f20139 != this || (c14280 = c6520.f20147) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c6520.m18025()) {
            m47212(c6520);
            return false;
        }
        synchronized (this) {
            if (this.f66376 == c6520 && this.f66377 == c6520.f20151 && !c6520.f20144) {
                this.f66378 = c14280;
                this.f66380 = c6520.f20138;
                this.f66376 = null;
                return true;
            }
            return false;
        }
    }
}
