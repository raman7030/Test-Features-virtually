package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W403 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18230 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3109 f56649;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f56650;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4314 f56648 = new C4314();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3109 f56647 = new C11175();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18230 m42469(C2903 c2903) {
        C4314 c4314 = f56648;
        C18230 c18230 = (C18230) c2903.m8838(c4314);
        if (c18230 != null) {
            return c18230;
        }
        C18230 c18231 = new C18230();
        c18231.f56650 = new HashMap();
        c2903.m8841(c4314, c18231);
        c18231.f56649 = f56647;
        return c18231;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42473(InterfaceC16818 interfaceC16818) {
        HashMap map = this.f56650;
        InterfaceC3109 interfaceC3109 = this.f56649;
        if (interfaceC3109 == f56647) {
            interfaceC16818.mo6082();
            return;
        }
        C18837 c18837 = (C18837) map.get(interfaceC3109);
        if (c18837 == null) {
            InterfaceC3109 interfaceC31010 = this.f56649;
            C18837 c18838 = new C18837();
            map.put(interfaceC31010, c18838);
            c18837 = c18838;
        }
        c18837.m43511(interfaceC16818);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42472(AbstractC5144 abstractC5144) {
        HashMap map = this.f56650;
        C18837 c18837 = (C18837) map.get(abstractC5144);
        if (c18837 != null) {
            Iterator it = c18837.iterator();
            while (it.hasNext()) {
                ((InterfaceC16818) it.next()).mo6082();
            }
            map.remove(abstractC5144);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3109 m42470() {
        InterfaceC3109 interfaceC3109 = this.f56649;
        this.f56649 = f56647;
        return interfaceC3109;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3109 m42471(InterfaceC3109 interfaceC3109) {
        InterfaceC3109 interfaceC31010 = this.f56649;
        this.f56649 = interfaceC3109;
        return interfaceC31010;
    }
}
