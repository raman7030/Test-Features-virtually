package p067l;

/* JADX INFO: renamed from: l.ᩴᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBGH */
/* JADX INFO: loaded from: classes4.dex */
public class C20376 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f62989;

    public C20376() {
        this.f62989 = true;
    }

    public C20376(boolean z) {
        this.f62989 = z;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo22326() {
        this.f62989 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m46002() {
        return !this.f62989;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46000() {
        return this.f62989;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m46001() {
        if (!this.f62989) {
            throw new C21047("immutable instance", null);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m45999() {
        if (this.f62989) {
            throw new C21047("mutable instance", null);
        }
    }
}
