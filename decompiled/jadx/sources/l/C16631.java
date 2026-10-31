package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S515 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16631 extends AbstractC9597 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17337 f51072;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13828 f51073;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17337 f51074;

    public C16631(C17337 c17337, C17337 c17338, AbstractC13828 abstractC13828) {
        this.f51074 = c17337;
        this.f51072 = c17338;
        this.f51073 = abstractC13828;
    }

    public C16631(C17337 c17337, C17337 c17338, C17337 c17339) {
        this.f51074 = c17337;
        this.f51072 = c17338;
        this.f51073 = new C23001(c17339);
    }

    public C16631(C17337 c17337, C17337 c17338, InterfaceC21699 interfaceC21699, C17337 c17339) {
        AbstractC13828 c11713;
        this.f51074 = c17337;
        this.f51072 = c17338;
        if (interfaceC21699 != null) {
            c11713 = new C11713(c17339, interfaceC21699);
        } else {
            c11713 = new C23001(c17339);
        }
        this.f51073 = c11713;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ֫ */
    public final int mo14555() {
        return this.f51074.m40667().f49185;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ܽ */
    public final int mo14557() {
        return this.f51072.m40667().f49185 - this.f51074.m40667().f49185;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ۧ */
    public final List mo14556() {
        return AbstractC14545.of((Object) this.f51073);
    }
}
