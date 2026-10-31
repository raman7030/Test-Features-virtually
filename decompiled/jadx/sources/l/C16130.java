package l;

import java.util.List;
import java.util.Vector;

/* JADX INFO: renamed from: l.ܺᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16130 implements InterfaceC15779 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18954 f49696;

    public C16130(C18954 c18954) {
        this.f49696 = c18954;
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3327(Object obj) {
        return ((C12029) obj).m29389();
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ۧ */
    public final String mo3328(Object obj) {
        return ((C12029) obj).m29391();
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ֫ */
    public final List mo3326(String str) {
        String strM39731 = AbstractC16891.m39731(str);
        C18954 c18954 = this.f49696;
        C1654 c1654M43746 = C18954.m43746(c18954);
        try {
            Vector<C12029> vectorM5586 = c1654M43746.m5586(strM39731);
            if (c18954.f59775 == null && vectorM5586.size() > 0) {
                C18954.m43744(c18954, c1654M43746, vectorM5586, strM39731);
            }
            for (C12029 c12029 : vectorM5586) {
                if (c12029.m29386().m5765()) {
                    String strM5595 = c1654M43746.m5595(C9523.m24393(strM39731, c12029.m29391()));
                    c12029.m29387(strM5595);
                    if (!strM5595.startsWith("/")) {
                        strM5595 = C9523.m24393(strM39731, strM5595);
                    }
                    try {
                        c12029.m29388(c1654M43746.m5594(strM5595));
                    } catch (C16532 e) {
                        int i = e.f50807;
                        if (i == 2) {
                            continue;
                        } else if (i != 10) {
                            throw e;
                        }
                    }
                }
            }
            C2998.m9138(c1654M43746);
            return vectorM5586;
        } catch (Throwable th) {
            C2998.m9138(c1654M43746);
            throw th;
        }
    }
}
