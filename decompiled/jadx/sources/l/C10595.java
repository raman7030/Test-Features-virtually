package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10595 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19810 f31800;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12048 f31801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23294 f31804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f31805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31803 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f31802 = new LinkedHashMap();

    public C10595(C23294 c23294, AbstractC5144 abstractC5144, AbstractC19810 abstractC19810) {
        this.f31804 = c23294;
        this.f31805 = null;
        this.f31800 = abstractC19810;
        this.f31805 = abstractC5144;
        AbstractC10370 abstractC10370M30652 = c23294.f74798.f18880.m30652(c23294.f74833.m27204() + "SwitchMap" + c23294.f74833.m27204() + c23294.f74798.m17058(C18382.m42812(abstractC19810.f17560.f13890.mo16083())).toString().replace('/', '.').replace('.', c23294.f74833.m27204()));
        C14163 c14163M51648 = C23294.m51648(c23294);
        C12048 c12048 = new C12048(4120L, abstractC10370M30652, new C5138(c23294.f74821.f66452, c23294.f74821.f66505), c14163M51648);
        this.f31801 = c12048;
        c14163M51648.mo16101();
        c14163M51648.f42762.mo26382(c12048);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26607() {
        C23294 c23294 = this.f31804;
        C17013 c17013 = c23294.f74811;
        AbstractC5144 abstractC5144 = this.f31805;
        abstractC5144.getClass();
        c17013.f52172 = C7260.m19455(abstractC5144);
        C12048 c12048 = this.f31801;
        C5557 c5557M51654 = c23294.m51654((C14163) c12048.f17561);
        AbstractC10370 abstractC10370 = c23294.f74798.f18900;
        AbstractC19810 abstractC19810 = this.f31800;
        C18404 c18404M39958 = c23294.f74811.m39958(c23294.f74811.m39965(c23294.f74821.f66452), C2609.of((Object) c23294.f74811.m39911(c23294.f74811.m39928(c23294.f74811.m39954(c23294.m51617(abstractC5144, abstractC10370, abstractC19810.f17560, C2609.m8239()))), c23294.f74821.f66532)), null);
        c18404M39958.f16086 = new C5138(c23294.f74821.f66452, c23294.f74821.f66505);
        C18837 c18837 = new C18837();
        C3581 c3581M51617 = c23294.m51617(abstractC5144, c23294.f74798.f18868, abstractC19810.f17560, C2609.m8239());
        C2609 c2609M8246 = C2609.m8239().m8246(c23294.f74811.m39897(c23294.f74811.m39923(new C12048(8589934592L, c23294.f74798.f18906, c23294.f74821.f66449, c23294.f74821.f66475), (AbstractC12612) null), c23294.f74811.m39902(0L, C2609.m8239())));
        for (Map.Entry entry : this.f31802.entrySet()) {
            C21080 c21080M39941 = c23294.f74811.m39941((AbstractC12612) c23294.f74811.m39927(c12048, c23294.f74811.m39928((AbstractC12612) c23294.f74811.m39911(c23294.f74811.m39954((C12048) entry.getKey()), c3581M51617))), (AbstractC12612) c23294.f74811.m39943((Integer) entry.getValue()));
            c21080M39941.f16086 = c23294.f74821.f66452;
            C10496 c10496M39953 = c23294.f74811.m39953(c21080M39941);
            C17013 c17014 = c23294.f74811;
            C2735 c2735M39902 = c23294.f74811.m39902(0L, C2609.of((Object) c10496M39953));
            c17014.getClass();
            c18837.m43511(c17014.m39925(C2609.m8239(), c2735M39902, c2609M8246, (C2735) null));
        }
        c5557M51654.f17179 = c5557M51654.f17179.m8246(c23294.f74811.m39902(8L, c18837.m43517())).m8246(c23294.f74811.m39923(c12048, c18404M39958));
    }
}
