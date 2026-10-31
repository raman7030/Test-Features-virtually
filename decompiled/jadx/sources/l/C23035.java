package l;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.᩺ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23035 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7513 f74132;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10858 f74135;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7513 f74136;

    public C23035(C10858 c10858) {
        this.f74135 = c10858;
        this.f74134 = c10858.f32616;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51204(C11747 c11747) {
        if (this.f74133) {
            throw new IllegalStateException("Line builder is finished");
        }
        C7513 c7513 = this.f74136;
        if (c7513 != null && c7513.f23106 == 1024 && c7513 != null) {
            this.f74132 = C10858.m27141(this.f74132, c7513);
            this.f74136 = null;
        }
        if (this.f74136 == null) {
            this.f74136 = new C7513(8);
        }
        this.f74136.m20148(c11747);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51205() {
        C10858 c10858 = this.f74135;
        if (this.f74133) {
            return false;
        }
        this.f74133 = true;
        try {
            if (this.f74134 == c10858.f32616) {
                C7513 c7513 = this.f74136;
                if (c7513 != null) {
                    this.f74132 = C10858.m27141(this.f74132, c7513);
                    this.f74136 = null;
                }
                if (this.f74132 != null) {
                    c10858.f32615 = C10858.m27138(c10858.f32615, this.f74132);
                    c10858.f32616++;
                    this.f74136 = null;
                    this.f74132 = null;
                    return true;
                }
                this.f74136 = null;
                this.f74132 = null;
                return false;
            }
            throw new ConcurrentModificationException("Line table changed while building");
        } catch (Throwable th) {
            this.f74136 = null;
            this.f74132 = null;
            throw th;
        }
    }
}
