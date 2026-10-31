package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes.dex */
public final class C23422 implements InterfaceC7941 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f75223;

    @Override // l.InterfaceC5119
    /* JADX INFO: renamed from: ֫ */
    public final C18274 mo11293(C18274 c18274, C21802 c21802) {
        return c18274;
    }

    public C23422(HashMap map) {
        this.f75223 = map;
    }

    @Override // l.InterfaceC0885
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo3235(C18274 c18274) {
        AbstractC8396 abstractC8396 = (AbstractC8396) this.f75223.get(c18274);
        return abstractC8396 == null ? c18274 : abstractC8396.clone();
    }
}
