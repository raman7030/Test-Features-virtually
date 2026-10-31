package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15928 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) {
        C2524 c2524 = (C2524) abstractC5366;
        if (c2524.f72265 == null) {
            c2524.f72265 = c2524.f8011.toByteArray();
        }
        return c2524.f72265.length;
    }

    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) throws IOException {
        C2524 c2524 = (C2524) abstractC5366;
        if (c2524.f72265 == null) {
            c2524.f72265 = c2524.f8011.toByteArray();
        }
        c15948.write(c2524.f72265);
    }
}
