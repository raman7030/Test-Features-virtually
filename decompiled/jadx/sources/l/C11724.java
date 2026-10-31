package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11724 extends C3963 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28619(String str, String str2) {
        C22061.m49621(str, str2);
        Map mapM38561 = this.f12589;
        if (mapM38561 == null) {
            mapM38561 = C16374.m38561();
            this.f12589 = mapM38561;
        }
        AbstractC11437 abstractC11437 = (AbstractC11437) ((C16374) mapM38561).get(str);
        AbstractC11437 abstractC11438 = abstractC11437;
        if (abstractC11437 == null) {
            int i = AbstractC6079.f18650;
            C22061.m49620(4, "expectedSize");
            C12429 c12429 = new C12429(4);
            c12429.f37422 = new Object[AbstractC6079.m16986(4)];
            Map mapM38562 = this.f12589;
            if (mapM38562 == null) {
                mapM38562 = C16374.m38561();
                this.f12589 = mapM38562;
            }
            ((C16374) mapM38562).put(str, c12429);
            abstractC11438 = c12429;
        }
        abstractC11438.mo6130(str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13839 m28618() {
        Map map = this.f12589;
        if (map == null) {
            return C0146.f1273;
        }
        Collection collectionEntrySet = ((C16374) map).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return C0146.f1273;
        }
        C22766<Map.Entry> c22766 = (C22766) collectionEntrySet;
        C6785 c6785 = new C6785(c22766.f73516.size());
        int size = 0;
        for (Map.Entry entry : c22766) {
            Object key = entry.getKey();
            AbstractC6079 abstractC6079CopyOf = AbstractC6079.copyOf((Collection) ((C12429) entry.getValue()).mo30595());
            if (!abstractC6079CopyOf.isEmpty()) {
                c6785.mo18428(key, abstractC6079CopyOf);
                size += abstractC6079CopyOf.size();
            }
        }
        return new C13839(c6785.mo18430(), size);
    }
}
