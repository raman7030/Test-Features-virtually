package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3024 extends AbstractC20539 {
    public C3024(AbstractC9250 abstractC9250) {
        super(abstractC9250);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m9272(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Server name must not be null");
        }
        if (!str.startsWith("\\\\")) {
            str = "\\\\".concat(str);
        }
        C23360 c23360 = new C23360();
        c23360.m17789(str);
        C19958 c19958 = new C19958(this, c23360);
        c19958.m13159();
        return c19958.m13160();
    }
}
