package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes.dex */
public final class C24232 extends AbstractC4406 {

    /* JADX INFO: renamed from: ۧ */
    public final Map f76799;

    public C24232(Map map) {
        super(2);
        this.f76799 = map;
    }

    @Override // p067l.AbstractC4406
    /* JADX INFO: renamed from: ֫ */
    public final void mo9167(InterfaceC5655 interfaceC5655, C14174 c14174) {
        c14174.m32654(new C12163(this, interfaceC5655));
        c14174.m32652(new C8139(this, interfaceC5655));
        c14174.m32651();
    }

    @Override // p067l.AbstractC4406
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9480 mo9166(String str) {
        return (AbstractC9480) this.f76799.get(str);
    }
}
