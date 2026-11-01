package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C14881 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Character ch = (Character) obj;
        c24726.m54386(ch == null ? null : String.valueOf(ch));
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        if (strM42644.length() == 1) {
            return Character.valueOf(strM42644.charAt(0));
        }
        StringBuilder sbM11879 = C5410.m11879("Expecting character, got: ", strM42644, "; at ");
        sbM11879.append(c18691.m42638());
        throw new C16322(sbM11879.toString());
    }
}
