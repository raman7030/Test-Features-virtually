package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes.dex */
public final class C23005 extends AbstractC2143 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f74060;

    public C23005(Map map) {
        super(2);
        this.f74060 = map;
    }

    @Override // l.AbstractC2143
    /* JADX INFO: renamed from: ֫ */
    public final void mo7072(InterfaceC3458 interfaceC3458, C12422 c12422) {
        c12422.m30590(new C10306(this, interfaceC3458));
        c12422.m30588(new C6072(this, interfaceC3458));
        c12422.m30587();
    }

    @Override // l.AbstractC2143
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7483 mo7071(String str) {
        return (AbstractC7483) this.f74060.get(str);
    }
}
