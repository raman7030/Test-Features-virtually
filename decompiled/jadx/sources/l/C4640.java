package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4640 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo13606(AbstractC5366 abstractC5366) {
        return ((C3229) abstractC5366).f18551.length + 1;
    }

    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) throws IOException {
        C3229 c3229 = (C3229) abstractC5366;
        c15948.write(c3229.f10163);
        c15948.write(c3229.f18551);
    }
}
