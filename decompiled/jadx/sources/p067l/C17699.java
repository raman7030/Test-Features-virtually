package p067l;

import java.util.List;
import java.util.Vector;

/* JADX INFO: renamed from: l.ܺᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17699 implements InterfaceC17365 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20383 f52862;

    public C17699(C20383 c20383) {
        this.f52862 = c20383;
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5646(Object obj) {
        return ((C13801) obj).m31451();
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ۧ */
    public final String mo5647(Object obj) {
        return ((C13801) obj).m31453();
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ֫ */
    public final List mo5645(String str) {
        String strM41972 = AbstractC18422.m41972(str);
        C20383 c20383 = this.f52862;
        C3940 c3940M46013 = C20383.m46013(c20383);
        try {
            Vector<C13801> vectorM7816 = c3940M46013.m7816(strM41972);
            if (c20383.f63004 == null && vectorM7816.size() > 0) {
                C20383.m46011(c20383, c3940M46013, vectorM7816, strM41972);
            }
            for (C13801 c13801 : vectorM7816) {
                if (c13801.m31448().m7975()) {
                    String strM7825 = c3940M46013.m7825(C11419.m26403(strM41972, c13801.m31453()));
                    c13801.m31449(strM7825);
                    if (!strM7825.startsWith("/")) {
                        strM7825 = C11419.m26403(strM41972, strM7825);
                    }
                    try {
                        c13801.m31450(c3940M46013.m7824(strM7825));
                    } catch (C18080 e) {
                        int i = e.f53986;
                        if (i == 2) {
                            continue;
                        } else if (i != 10) {
                            throw e;
                        }
                    }
                }
            }
            C5218.m11189(c3940M46013);
            return vectorM7816;
        } catch (Throwable th) {
            C5218.m11189(c3940M46013);
            throw th;
        }
    }
}
