package l;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: renamed from: l.ܿ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C17672 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        c23525.m51984(((Currency) obj).getCurrencyCode());
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        String strM40399 = c17175.m40399();
        try {
            return Currency.getInstance(strM40399);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM9834 = C3200.m9834("Failed parsing '", strM40399, "' as Currency; at path ");
            sbM9834.append(c17175.m40393());
            throw new C14682(sbM9834.toString(), e);
        }
    }
}
