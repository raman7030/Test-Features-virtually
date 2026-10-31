package l;

/* JADX INFO: renamed from: l.۟۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7495 extends AbstractC0151 implements InterfaceC8907, InterfaceC20196 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18059 f23084;

    @Override // l.InterfaceC20196
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo20124() {
        return true;
    }

    @Override // l.InterfaceC20196
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23703 mo20125() {
        return null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C18059 m20123() {
        C18059 c18059 = this.f23084;
        if (c18059 != null) {
            return c18059;
        }
        C11233.m27804("job");
        throw null;
    }

    @Override // l.InterfaceC8907
    /* JADX INFO: renamed from: ܿ */
    public final void mo12010() {
        m20123().m42125(this);
    }

    @Override // l.C20697
    public final String toString() {
        return getClass().getSimpleName() + '@' + C11024.m27354(this) + "[job@" + C11024.m27354(m20123()) + ']';
    }

    public InterfaceC10318 getParent() {
        return m20123();
    }
}
