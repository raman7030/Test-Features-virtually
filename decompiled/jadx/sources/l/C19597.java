package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G7BL */
/* JADX INFO: loaded from: classes5.dex */
public class C19597 extends C16497 {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63286;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m45031(C17222 c17222) {
        try {
            if (this.f63286) {
                return;
            }
            this.f63286 = true;
            String strM11556 = m11556("remoteTaskId");
            C8381 c8381M21977 = C8381.m21977();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C18965.m43782(m11556("sourcePath")));
            linkedHashSet.add(C18965.m43782(m11556("targetPath")));
            c8381M21977.m21984(strM11556, this, c17222, new ArrayList(linkedHashSet), m45028(), c17222.m40526() ? m45032() : Collections.EMPTY_LIST, c17222.m40526() ? m45029() : Collections.EMPTY_LIST);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l.C16497, l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC3346 mo11549() {
        return null;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo11562() {
        return false;
    }

    @Override // l.C16497, l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        String strM11556 = m11556("remoteTaskId");
        C8381 c8381M21977 = C8381.m21977();
        C18891 c18891 = new C18891(strM11556, c8381M21977, false);
        this.f50699 = c18891;
        c18891.mo13495();
        c8381M21977.m21985(strM11556, this, (C18891) this.f50699);
        super.mo2782();
        c8381M21977.m21983(strM11556, this);
    }

    @Override // l.C16497, l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        C17222 c17222Mo2780 = super.mo2780();
        m45031(c17222Mo2780);
        return c17222Mo2780;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ܶ */
    public final void mo11546(String str) {
        super.mo11546(str);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC20250
    /* JADX INFO: renamed from: ۧ */
    public final void mo23259(CharSequence charSequence) {
        super.mo23259(charSequence);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final void mo11538(int i) {
        super.mo11538(i);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC20250
    /* JADX INFO: renamed from: ۧ */
    public final void mo23260(C20876 c20876) {
        super.mo23260(c20876);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC20250
    /* JADX INFO: renamed from: ֫ */
    public final void mo23258(long j) {
        super.mo23258(j);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.C16497, l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        super.mo2781(c17222);
        m45031(c17222);
    }

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m45028() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m11558("ARG_PATHS")) {
            linkedHashSet.add(C18965.m43784(str));
        }
        Iterator it = m45029().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C18965.m43782((String) it.next()));
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m45029() {
        Map mapM45030 = m45030();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m11558("ARG_PATHS")) {
            AbstractC1139 abstractC1139 = (AbstractC1139) mapM45030.get(C18965.m43784(str));
            if (abstractC1139 != null) {
                String strM3900 = abstractC1139.m3900();
                if (abstractC1139.m3888() && !strM3900.endsWith("/")) {
                    strM3900 = strM3900.concat("/");
                }
                linkedHashSet.add(strM3900);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    private ArrayList m45032() {
        Map mapM45030 = m45030();
        ArrayList arrayList = new ArrayList();
        for (String str : m11558("ARG_PATHS")) {
            String strM43784 = C18965.m43784(str);
            AbstractC1139 abstractC1139 = (AbstractC1139) mapM45030.get(strM43784);
            if (abstractC1139 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", strM43784);
                linkedHashMap.put("to", C18965.m43782(abstractC1139.m3900()));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    private Map m45030() {
        if (this.f50702 == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : m11558("ARG_PATHS")) {
            linkedHashMap.put(C18965.m43784(str), null);
        }
        for (AbstractC1139 abstractC1139 : this.f50702.m36248()) {
            String strM43784 = C18965.m43784(abstractC1139.m3910());
            if (linkedHashMap.containsKey(strM43784)) {
                linkedHashMap.put(strM43784, abstractC1139);
            }
        }
        for (AbstractC1139 abstractC11310 : this.f50702.m36244()) {
            String strM43785 = C18965.m43784(abstractC11310.m3910());
            if (linkedHashMap.containsKey(strM43785) && linkedHashMap.get(strM43785) == null) {
                linkedHashMap.put(strM43785, abstractC11310);
            }
        }
        return linkedHashMap;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        C17222 c17222M40517 = C17222.m40517(exc);
        m45031(c17222M40517);
        return c17222M40517;
    }
}
