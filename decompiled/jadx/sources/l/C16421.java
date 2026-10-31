package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16421 implements InterfaceC14304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18539 f50509;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5133 f50510;

    public C16421(C5133 c5133, C18539 c18539) {
        this.f50510 = c5133;
        this.f50509 = c18539;
    }

    @Override // l.InterfaceC14304
    public final Iterator iterator() {
        return new C10778(this);
    }
}
