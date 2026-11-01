package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes.dex */
public final class C23683 extends C17401 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20271 f75390;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21672 f75391;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Set f75392;

    public C23683(C21672 c21672, Set set, C20271 c20271) {
        this.f75391 = c21672;
        this.f75392 = set;
        this.f75390 = c20271;
    }

    @Override // p067l.C17401, p067l.InterfaceC19414
    public final EnumC18072 preVisitDirectory(Object obj, InterfaceC16730 interfaceC16730) {
        if (C21672.m48876(this.f75391, ((InterfaceC22097) obj).getFileName())) {
            return EnumC18072.CONTINUE;
        }
        return EnumC18072.SKIP_SUBTREE;
    }

    @Override // p067l.C17401, p067l.InterfaceC19414
    public final EnumC18072 visitFile(Object obj, InterfaceC16730 interfaceC16730) {
        InterfaceC22097 interfaceC22097 = (InterfaceC22097) obj;
        if (interfaceC16730.isRegularFile()) {
            if (this.f75392.contains(AbstractC22343.m50160(interfaceC22097.getFileName().toString()))) {
                C21672 c21672 = this.f75391;
                C13625 c13625 = c21672.f68257;
                InterfaceC22097 interfaceC22098 = c21672.f68254;
                int i = AbstractC14215.f40494;
                this.f75390.m45777(new C5498(c13625, interfaceC22097, interfaceC22098, 0));
            }
        }
        return EnumC18072.CONTINUE;
    }
}
