package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6778 extends AbstractC20209 {
    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final int mo15481(AbstractC7468 abstractC7468) {
        return ((C5437) abstractC7468).f21407.length + 1;
    }

    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final void mo15482(AbstractC7468 abstractC7468, C17525 c17525) throws IOException {
        C5437 c5437 = (C5437) abstractC7468;
        c17525.write(c5437.f12970);
        c17525.write(c5437.f21407);
    }
}
