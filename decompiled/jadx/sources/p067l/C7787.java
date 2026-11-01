package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7787 implements InterfaceC11081 {

    /* JADX INFO: renamed from: ᩸ */
    public final Appendable f20422;

    /* JADX INFO: renamed from: ᩹ */
    public final C2421 f20423;

    public C7787(Appendable appendable, C2421 c2421) {
        this.f20422 = appendable;
        this.f20423 = c2421;
        c2421.m3375();
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ۧ */
    public final void mo18031(AbstractC13152 abstractC13152, int i) {
        try {
            abstractC13152.mo9268(this.f20422, i, this.f20423);
        } catch (IOException e) {
            throw new C3763(e);
        }
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ֫ */
    public final void mo18030(AbstractC13152 abstractC13152, int i) {
        if (abstractC13152.mo5244().equals("#text")) {
            return;
        }
        try {
            abstractC13152.mo9269(this.f20422, i, this.f20423);
        } catch (IOException e) {
            throw new C3763(e);
        }
    }
}
