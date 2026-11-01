package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17506 extends AbstractC20209 {
    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final int mo15481(AbstractC7468 abstractC7468) {
        C4767 c4767 = (C4767) abstractC7468;
        if (c4767.f74989 == null) {
            c4767.f74989 = c4767.f10802.toByteArray();
        }
        return c4767.f74989.length;
    }

    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final void mo15482(AbstractC7468 abstractC7468, C17525 c17525) throws IOException {
        C4767 c4767 = (C4767) abstractC7468;
        if (c4767.f74989 == null) {
            c4767.f74989 = c4767.f10802.toByteArray();
        }
        c17525.write(c4767.f74989);
    }
}
