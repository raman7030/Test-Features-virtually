package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5702 implements InterfaceC9167 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Appendable f17576;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0056 f17577;

    public C5702(Appendable appendable, C0056 c0056) {
        this.f17576 = appendable;
        this.f17577 = c0056;
        c0056.m980();
    }

    @Override // l.InterfaceC9167
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo16112(AbstractC11347 abstractC11347, int i) {
        try {
            abstractC11347.mo7189(this.f17576, i, this.f17577);
        } catch (IOException e) {
            throw new C1468(e);
        }
    }

    @Override // l.InterfaceC9167
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16111(AbstractC11347 abstractC11347, int i) {
        if (abstractC11347.mo2915().equals("#text")) {
            return;
        }
        try {
            abstractC11347.mo7190(this.f17576, i, this.f17577);
        } catch (IOException e) {
            throw new C1468(e);
        }
    }
}
