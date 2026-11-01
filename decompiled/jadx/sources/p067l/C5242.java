package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5242 extends AbstractC21888 {
    public C5242(AbstractC11159 abstractC11159) {
        super(abstractC11159);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m11314(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Server name must not be null");
        }
        if (!str.startsWith("\\\\")) {
            str = "\\\\".concat(str);
        }
        C24569 c24569 = new C24569();
        c24569.m19736(str);
        C21336 c21336 = new C21336(this, c24569);
        c21336.m15040();
        return c21336.m15041();
    }
}
