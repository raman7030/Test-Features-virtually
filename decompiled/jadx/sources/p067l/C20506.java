package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C20506 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        c24726.m54376((Boolean) obj);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        EnumC16008 enumC16008M42643 = c18691.m42643();
        if (enumC16008M42643 == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        if (enumC16008M42643 == EnumC16008.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(c18691.m42644()));
        }
        return Boolean.valueOf(c18691.m42646());
    }
}
