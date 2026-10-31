package l;

/* JADX INFO: renamed from: l.᩶ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20091 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16040 f65055;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f65056 = true;

    public C20091(C16040 c16040) {
        this.f65055 = c16040;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46309() {
        synchronized (this) {
            this.f65055 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46310(String str) {
        synchronized (this) {
            if (this.f65055 != null) {
                C11955 c11955 = new C11955();
                c11955.m29155(str);
                this.f65055.m37918(c11955);
                this.f65056 = false;
                this.f65055 = null;
            }
        }
    }
}
