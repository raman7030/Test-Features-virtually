package p067l;

/* JADX INFO: renamed from: l.ۘ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6364 {

    /* JADX INFO: renamed from: ᩸ */
    public int f16484;

    /* JADX INFO: renamed from: ۧ */
    public void mo7() {
        this.f16484 = 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m14572() {
        return m14571(134217728);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m14573() {
        return m14571(4);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m14566() {
        return m14571(1);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m14565() {
        return m14571(536870912);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m14570() {
        return m14571(268435456);
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m14568() {
        return m14571(67108864);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m14569(int i) {
        this.f16484 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14567(int i) {
        this.f16484 = i | this.f16484;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m14571(int i) {
        return (this.f16484 & i) == i;
    }
}
