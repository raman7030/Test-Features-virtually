package p067l;

import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G7BL */
/* JADX INFO: loaded from: classes5.dex */
public class C20994 extends C18047 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f65904;

    /* JADX INFO: renamed from: ᩳ */
    private synchronized void m47326(C18736 c18736) {
        try {
            if (this.f65904) {
                return;
            }
            this.f65904 = true;
            String strM13492 = m13492("remoteTaskId");
            C10334 c10334M23948 = C10334.m23948();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C20393.m46049(m13492("sourcePath")));
            linkedHashSet.add(C20393.m46049(m13492("targetPath")));
            c10334M23948.m23955(strM13492, this, c18736, new ArrayList(linkedHashSet), m47323(), c18736.m42773() ? m47327() : Collections.EMPTY_LIST, c18736.m42773() ? m47324() : Collections.EMPTY_LIST);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p067l.C18047, p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC5549 mo13485() {
        return null;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo13498() {
        return false;
    }

    @Override // p067l.C18047, p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        String strM13492 = m13492("remoteTaskId");
        C10334 c10334M23948 = C10334.m23948();
        C20323 c20323 = new C20323(strM13492, c10334M23948, false);
        this.f53876 = c20323;
        c20323.mo15384();
        c10334M23948.m23956(strM13492, this, (C20323) this.f53876);
        super.mo5127();
        c10334M23948.m23954(strM13492, this);
    }

    @Override // p067l.C18047, p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        C18736 c18736Mo5125 = super.mo5125();
        m47326(c18736Mo5125);
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

    @Override // p067l.C18047, p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        super.mo5126(c18736);
        m47326(c18736);
    }

    /* JADX INFO: renamed from: ۛ֫ */
    private ArrayList m47323() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m13494("ARG_PATHS")) {
            linkedHashSet.add(C20393.m46051(str));
        }
        Iterator it = m47324().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C20393.m46049((String) it.next()));
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۨ֫ */
    private ArrayList m47324() {
        Map mapM47325 = m47325();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m13494("ARG_PATHS")) {
            AbstractC3451 abstractC3451 = (AbstractC3451) mapM47325.get(C20393.m46051(str));
            if (abstractC3451 != null) {
                String strM6141 = abstractC3451.m6141();
                if (abstractC3451.m6129() && !strM6141.endsWith("/")) {
                    strM6141 = strM6141.concat("/");
                }
                linkedHashSet.add(strM6141);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ᩺֫ */
    private ArrayList m47327() {
        Map mapM47325 = m47325();
        ArrayList arrayList = new ArrayList();
        for (String str : m13494("ARG_PATHS")) {
            String strM46051 = C20393.m46051(str);
            AbstractC3451 abstractC3451 = (AbstractC3451) mapM47325.get(strM46051);
            if (abstractC3451 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", strM46051);
                linkedHashMap.put("to", C20393.m46049(abstractC3451.m6141()));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ֫ */
    private Map m47325() {
        if (this.f53879 == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : m13494("ARG_PATHS")) {
            linkedHashMap.put(C20393.m46051(str), null);
        }
        for (AbstractC3451 abstractC3451 : this.f53879.m38409()) {
            String strM46051 = C20393.m46051(abstractC3451.m6151());
            if (linkedHashMap.containsKey(strM46051)) {
                linkedHashMap.put(strM46051, abstractC3451);
            }
        }
        for (AbstractC3451 abstractC3452 : this.f53879.m38405()) {
            String strM46052 = C20393.m46051(abstractC3452.m6151());
            if (linkedHashMap.containsKey(strM46052) && linkedHashMap.get(strM46052) == null) {
                linkedHashMap.put(strM46052, abstractC3452);
            }
        }
        return linkedHashMap;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final C18736 mo5458(Exception exc) {
        C18736 c18736M42764 = C18736.m42764(exc);
        m47326(c18736M42764);
        return c18736M42764;
    }
}
