package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20642 implements InterfaceC7941 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f66410;

    @Override // l.InterfaceC5119
    /* JADX INFO: renamed from: ֫ */
    public final C18274 mo11293(C18274 c18274, C21802 c21802) {
        return c18274;
    }

    public C20642(HashMap map) {
        this.f66410 = map;
    }

    @Override // l.InterfaceC0885
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo3235(C18274 c18274) {
        AbstractC8396 abstractC8396 = (AbstractC8396) this.f66410.get(c18274);
        return abstractC8396 != null ? abstractC8396 : c18274;
    }
}
