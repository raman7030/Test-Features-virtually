package l;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۚ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5344 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakHashMap f16663 = new WeakHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0404 m15288(AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        C2609<C0404> c2609 = (C2609) this.f16663.get(abstractC5698);
        if (c2609 == null) {
            return null;
        }
        for (C0404 c0404 : c2609) {
            if (c0404.f1859.f75215.mo3860().f20969 == enumC16761) {
                return c0404;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15289(AbstractC5144 abstractC5144, C23420 c23420) {
        AbstractC5698 abstractC5698 = c23420.f75215.mo3860().f20972;
        WeakHashMap weakHashMap = this.f16663;
        C2609 c2609M8239 = (C2609) weakHashMap.get(abstractC5698);
        if (c2609M8239 == null) {
            c2609M8239 = C2609.m8239();
        }
        C0404 c0404 = new C0404();
        c0404.f1860 = abstractC5144;
        c0404.f1859 = c23420;
        weakHashMap.put(abstractC5698, c2609M8239.m8246(c0404));
    }
}
