package p067l;

/* JADX INFO: renamed from: l.۟۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9492 extends AbstractC2512 implements InterfaceC10834, InterfaceC21563 {

    /* JADX INFO: renamed from: ۙ */
    public C19532 f25996;

    @Override // p067l.InterfaceC21563
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22100() {
        return true;
    }

    @Override // p067l.InterfaceC21563
    /* JADX INFO: renamed from: ᩳ */
    public final C24896 mo22101() {
        return null;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C19532 m22099() {
        C19532 c19532 = this.f25996;
        if (c19532 != null) {
            return c19532;
        }
        C13045.m29866("job");
        throw null;
    }

    @Override // p067l.InterfaceC10834
    /* JADX INFO: renamed from: ܿ */
    public final void mo13934() {
        m22099().m44377(this);
    }

    @Override // p067l.C22039
    public final String toString() {
        return getClass().getSimpleName() + '@' + C12846.m29416(this) + "[job@" + C12846.m29416(m22099()) + ']';
    }

    public InterfaceC12175 getParent() {
        return m22099();
    }
}
