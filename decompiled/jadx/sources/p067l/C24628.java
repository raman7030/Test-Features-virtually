package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes.dex */
public final class C24628 implements InterfaceC9915 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ HashMap f77969;

    @Override // p067l.InterfaceC7233
    /* JADX INFO: renamed from: ֫ */
    public final C19736 mo13240(C19736 c19736, C23089 c23089) {
        return c19736;
    }

    public C24628(HashMap map) {
        this.f77969 = map;
    }

    @Override // p067l.InterfaceC3209
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo5549(C19736 c19736) {
        AbstractC10348 abstractC10348 = (AbstractC10348) this.f77969.get(c19736);
        return abstractC10348 == null ? c19736 : abstractC10348.clone();
    }
}
