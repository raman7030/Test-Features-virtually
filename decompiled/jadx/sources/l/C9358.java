package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1UG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9358 extends AbstractC2821 implements InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17824 f28412;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC0890 f28413;

    public C9358(AbstractC0890 abstractC0890, C17824 c17824) {
        super(2);
        this.f28413 = abstractC0890;
        this.f28412 = c17824;
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final void mo8714(AbstractC12138 abstractC12138) {
        String strMo3239;
        String strM13109 = abstractC12138.m13109();
        if (C22927.m51032(strM13109)) {
            return;
        }
        C17824 c17824 = this.f28412;
        AbstractC16412 abstractC16412 = C10769.f32418;
        Map map = (Map) c17824.get(abstractC16412);
        if (map == null) {
            map = new HashMap();
            c17824.put(abstractC16412, map);
        }
        if (m24169(abstractC12138) == null) {
            AbstractC0890 abstractC0890 = this.f28413;
            abstractC0890.mo3240();
            do {
                strMo3239 = abstractC0890.mo3239();
            } while (map.containsKey(strMo3239));
            map.put(strMo3239, strM13109);
            C15706.m37039(abstractC12138).mo13103(strMo3239);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24169(AbstractC12138 abstractC12138) {
        return (String) C15706.m37039(abstractC12138).mo13101();
    }
}
