package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RM */
/* JADX INFO: loaded from: classes5.dex */
public final class C21986 implements InterfaceC9915 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ HashMap f69090;

    @Override // p067l.InterfaceC7233
    /* JADX INFO: renamed from: ֫ */
    public final C19736 mo13240(C19736 c19736, C23089 c23089) {
        return c19736;
    }

    public C21986(HashMap map) {
        this.f69090 = map;
    }

    @Override // p067l.InterfaceC3209
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo5549(C19736 c19736) {
        AbstractC10348 abstractC10348 = (AbstractC10348) this.f69090.get(c19736);
        return abstractC10348 != null ? abstractC10348 : c19736;
    }
}
