package p067l;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: renamed from: l.ܿ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C19164 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        c24726.m54386(((Currency) obj).getCurrencyCode());
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        String strM42644 = c18691.m42644();
        try {
            return Currency.getInstance(strM42644);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM11879 = C5410.m11879("Failed parsing '", strM42644, "' as Currency; at path ");
            sbM11879.append(c18691.m42638());
            throw new C16322(sbM11879.toString(), e);
        }
    }
}
