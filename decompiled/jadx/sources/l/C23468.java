package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1VH */
/* JADX INFO: loaded from: classes.dex */
public final class C23468 extends AbstractC2821 implements InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17824 f75302;

    public C23468(C17824 c17824) {
        super(2);
        this.f75302 = c17824;
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final void mo8714(AbstractC12138 abstractC12138) {
        String strM24169;
        String strM13109 = abstractC12138.m13109();
        if (C22927.m51032(strM13109) || (strM24169 = C9358.m24169(abstractC12138)) == null) {
            return;
        }
        C17824 c17824 = this.f75302;
        AbstractC16412 abstractC16412 = C10769.f32418;
        Map map = (Map) c17824.get(abstractC16412);
        if (map == null) {
            map = new HashMap();
            c17824.put(abstractC16412, map);
        }
        String str = (String) map.get(strM24169);
        if (str == null || (C15706.m37039(abstractC12138) instanceof C20647) || strM13109.compareTo(str) < 0) {
            map.put(strM24169, strM13109);
        }
    }
}
