package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C21588 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c24726.m54383();
        } else {
            c24726.m54385(number.longValue());
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        try {
            return Long.valueOf(c18691.m42651());
        } catch (NumberFormatException e) {
            throw new C16322(e);
        }
    }
}
