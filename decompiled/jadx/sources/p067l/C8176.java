package p067l;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۛܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C8176 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        c24726.m54377((BigInteger) obj);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        try {
            return C8927.m20636(strM42644);
        } catch (NumberFormatException e) {
            StringBuilder sbM11879 = C5410.m11879("Failed parsing '", strM42644, "' as BigInteger; at path ");
            sbM11879.append(c18691.m42638());
            throw new C16322(sbM11879.toString(), e);
        }
    }
}
