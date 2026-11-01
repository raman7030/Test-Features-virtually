package p067l;

import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BK */
/* JADX INFO: loaded from: classes4.dex */
public class C10935 extends C11106 {

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f30307;

    /* JADX INFO: renamed from: ᩳ */
    private synchronized void m25201(C18736 c18736) {
        try {
            if (this.f30307) {
                return;
            }
            this.f30307 = true;
            String strM13492 = m13492("remoteTaskId");
            C10334 c10334M23948 = C10334.m23948();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C20393.m46049(m13492("sourcePath")));
            linkedHashSet.add(C20393.m46049(m13492("targetPath")));
            ArrayList arrayList = new ArrayList(linkedHashSet);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = m25200().iterator();
            while (it.hasNext()) {
                linkedHashSet2.add(C20393.m46049((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            List list = Collections.EMPTY_LIST;
            c10334M23948.m23955(strM13492, this, c18736, arrayList, arrayList2, list, c18736.m42773() ? m25200() : list);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p067l.C11106, p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC5549 mo13485() {
        return null;
    }

    @Override // p067l.C11106, p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        String strM13492 = m13492("remoteTaskId");
        C10334 c10334M23948 = C10334.m23948();
        C20323 c20323 = new C20323(strM13492, c10334M23948, m13471("replacedName") != null);
        this.f30795 = c20323;
        c10334M23948.m23956(strM13492, this, c20323);
        super.mo5127();
        c10334M23948.m23954(strM13492, this);
    }

    @Override // p067l.C11106, p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        C18736 c18736Mo5125 = super.mo5125();
        m25201(c18736Mo5125);
        return c18736Mo5125;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ܶ */
    public final void mo13482(String str) {
        super.mo13482(str);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC21614
    /* JADX INFO: renamed from: ۧ */
    public final void mo25203(CharSequence charSequence) {
        super.mo25203(charSequence);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final void mo13474(int i) {
        super.mo13474(i);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC21614
    /* JADX INFO: renamed from: ۧ */
    public final void mo25204(C22209 c22209) {
        super.mo25204(c22209);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC21614
    /* JADX INFO: renamed from: ֫ */
    public final void mo25202(long j) {
        super.mo25202(j);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.C11106, p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        super.mo5126(c18736);
        m25201(c18736);
    }

    /* JADX INFO: renamed from: ۛ֫ */
    private List m25200() {
        if (this.f30798 == null) {
            return Collections.EMPTY_LIST;
        }
        String strM46049 = C20393.m46049(m13492("targetPath"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m13494("ARG_PATHS")) {
            linkedHashSet.add(str);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (AbstractC3451 abstractC3451 : this.f30798.m38409()) {
            if (linkedHashSet.contains(abstractC3451.m6151()) && abstractC3451.m6134() != null) {
                String strM26403 = C11419.m26403(strM46049, String.valueOf(abstractC3451.m6134()));
                if (abstractC3451.m6129()) {
                    strM26403 = C17588.m40053(strM26403, "/");
                }
                linkedHashSet2.add(strM26403);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final C18736 mo5458(Exception exc) {
        C18736 c18736M42764 = C18736.m42764(exc);
        m25201(c18736M42764);
        return c18736M42764;
    }
}
