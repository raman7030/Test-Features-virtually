package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩸֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22555 extends AbstractC7782 implements InterfaceC7131 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21214 f71141;

    /* JADX INFO: renamed from: ۧ */
    public final C13167 f71142;

    public C22555(InterfaceC21214 interfaceC21214) {
        this.f71141 = interfaceC21214;
        this.f71142 = ((C11826) interfaceC21214).mo27092();
    }

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ۧ */
    public final Set mo16408() {
        Class[] clsArr = {C19320.class, C8591.class, C22673.class, C23875.class, C15157.class, C15966.class, C22003.class, C13955.class, C17307.class, C4568.class, C20662.class, C16636.class, C10603.class, C18649.class, C5238.class, C14625.class, C9123.class, C11274.class, C23343.class, C24684.class};
        HashSet hashSet = new HashSet(20);
        for (int i = 0; i < 20; i++) {
            Class cls = clsArr[i];
            C12826.requireNonNull(cls);
            if (!hashSet.add(cls)) {
                throw new IllegalArgumentException("duplicate element: " + cls);
            }
        }
        return C21562.unmodifiableSet(hashSet);
    }

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ֫ */
    public final void mo16407(AbstractC2555 abstractC2555) {
        abstractC2555.mo3758(this);
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17973(C19320 c19320) {
        mo17980(c19320);
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17961(C8591 c8591) {
        String str = C0655am.f2279aG + c8591.m20004();
        C13167 c13167 = this.f71142;
        c13167.m30161();
        c13167.m30163(str, m50544(c8591, str, Collections.EMPTY_MAP), false);
        mo17980(c8591);
        c13167.m30165("/" + str);
        c13167.m30161();
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17978(C23875 c23875) {
        C13167 c13167 = this.f71142;
        c13167.m30161();
        c13167.m30163("blockquote", m50544(c23875, "blockquote", Collections.EMPTY_MAP), false);
        c13167.m30161();
        mo17980(c23875);
        c13167.m30161();
        c13167.m30165("/blockquote");
        c13167.m30161();
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17969(C15966 c15966) {
        String strM36274 = c15966.m36274();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM36275 = c15966.m36275();
        if (strM36275 != null && !strM36275.isEmpty()) {
            int iIndexOf = strM36275.indexOf(" ");
            if (iIndexOf != -1) {
                strM36275 = strM36275.substring(0, iIndexOf);
            }
            linkedHashMap.put(Name.LABEL, "language-" + strM36275);
        }
        m50545(strM36274, c15966, linkedHashMap);
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17975(C22003 c22003) {
        C13167 c13167 = this.f71142;
        c13167.m30161();
        c13167.m30162(c22003.m49572());
        c13167.m30161();
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17966(C13955 c13955) {
        C13167 c13167 = this.f71142;
        c13167.m30161();
        c13167.m30163("hr", m50544(c13955, "hr", Collections.EMPTY_MAP), true);
        c13167.m30161();
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17971(C17307 c17307) {
        m50545(c17307.m39262(), c17307, Collections.EMPTY_MAP);
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17958(C4568 c4568) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM9644 = c4568.m9644();
        C7802 c7802 = ((C11826) this.f71141).f32998;
        if (c7802.f20485) {
            strM9644 = c7802.f20486.m51772(strM9644);
            linkedHashMap.put("rel", "nofollow");
        }
        linkedHashMap.put("href", strM9644);
        if (c4568.m9643() != null) {
            linkedHashMap.put("title", c4568.m9643());
        }
        LinkedHashMap linkedHashMapM50544 = m50544(c4568, C0655am.f2320av, linkedHashMap);
        C13167 c13167 = this.f71142;
        c13167.m30163(C0655am.f2320av, linkedHashMapM50544, false);
        mo17980(c4568);
        c13167.m30165("/a");
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17970(C16636 c16636) {
        int iIntValue = c16636.m37705() != null ? c16636.m37705().intValue() : 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iIntValue != 1) {
            linkedHashMap.put("start", String.valueOf(iIntValue));
        }
        m50546((AbstractC19991) c16636, "ol", m50544((AbstractC2555) c16636, "ol", (Map) linkedHashMap));
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17963(C10603 c10603) {
        String strM24392 = c10603.m24392();
        C16518 c16518 = new C16518();
        c16518.mo17963(c10603);
        String strM37478 = c16518.m37478();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7802 c7802 = ((C11826) this.f71141).f32998;
        if (c7802.f20485) {
            strM24392 = c7802.f20486.m51772(strM24392);
        }
        linkedHashMap.put("src", strM24392);
        linkedHashMap.put("alt", strM37478);
        if (c10603.m24391() != null) {
            linkedHashMap.put("title", c10603.m24391());
        }
        this.f71142.m30163("img", m50544(c10603, "img", linkedHashMap), true);
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17967(C14625 c14625) {
        this.f71142.m30166(c14625.m33421());
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17964(C11274 c11274) {
        this.f71142.m30162(c11274.m26198());
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17977(C23343 c23343) {
        this.f71142.m30162("\n");
    }

    @Override // p067l.AbstractC7782
    /* JADX INFO: renamed from: ۧ */
    public final void mo17980(AbstractC2555 abstractC2555) {
        AbstractC2555 abstractC2555M3754 = abstractC2555.m3754();
        while (abstractC2555M3754 != null) {
            AbstractC2555 abstractC2555M3765 = abstractC2555M3754.m3765();
            ((C11826) this.f71141).mo27093(abstractC2555M3754);
            abstractC2555M3754 = abstractC2555M3765;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50545(String str, AbstractC13147 abstractC13147, Map map) {
        C13167 c13167 = this.f71142;
        c13167.m30161();
        c13167.m30163("pre", m50544(abstractC13147, "pre", Collections.EMPTY_MAP), false);
        c13167.m30163("code", m50544(abstractC13147, "code", map), false);
        c13167.m30166(str);
        c13167.m30165("/code");
        c13167.m30165("/pre");
        c13167.m30161();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50546(AbstractC19991 abstractC19991, String str, LinkedHashMap linkedHashMap) {
        C13167 c13167 = this.f71142;
        c13167.m30161();
        c13167.m30163(str, linkedHashMap, false);
        c13167.m30161();
        mo17980(abstractC19991);
        c13167.m30161();
        c13167.m30165("/".concat(str));
        c13167.m30161();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17976(C22673 c22673) {
        boolean zM45366;
        AbstractC13147 abstractC13147Mo3768 = c22673.mo3768();
        if (abstractC13147Mo3768 != null) {
            AbstractC2555 abstractC2555Mo3768 = abstractC13147Mo3768.mo3768();
            if (abstractC2555Mo3768 instanceof AbstractC19991) {
                zM45366 = ((AbstractC19991) abstractC2555Mo3768).m45366();
            } else {
                zM45366 = false;
            }
        } else {
            zM45366 = false;
        }
        C13167 c13167 = this.f71142;
        if (!zM45366) {
            c13167.m30161();
            c13167.m30163(C0655am.f2322ax, m50544(c22673, C0655am.f2322ax, Collections.EMPTY_MAP), false);
        }
        mo17980(c22673);
        if (zM45366) {
            return;
        }
        c13167.m30165("/p");
        c13167.m30161();
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17959(C5238 c5238) {
        LinkedHashMap linkedHashMapM50544 = m50544(c5238, "strong", Collections.EMPTY_MAP);
        C13167 c13167 = this.f71142;
        c13167.m30163("strong", linkedHashMapM50544, false);
        mo17980(c5238);
        c13167.m30165("/strong");
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17962(C9123 c9123) {
        LinkedHashMap linkedHashMapM50544 = m50544(c9123, "code", Collections.EMPTY_MAP);
        C13167 c13167 = this.f71142;
        c13167.m30163("code", linkedHashMapM50544, false);
        c13167.m30166(c9123.m21065());
        c13167.m30165("/code");
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17968(C15157 c15157) {
        m50546((AbstractC19991) c15157, "ul", m50544(c15157, "ul", Collections.EMPTY_MAP));
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17972(C18649 c18649) {
        LinkedHashMap linkedHashMapM50544 = m50544(c18649, "em", Collections.EMPTY_MAP);
        C13167 c13167 = this.f71142;
        c13167.m30163("em", linkedHashMapM50544, false);
        mo17980(c18649);
        c13167.m30165("/em");
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17974(C20662 c20662) {
        LinkedHashMap linkedHashMapM50544 = m50544(c20662, "li", Collections.EMPTY_MAP);
        C13167 c13167 = this.f71142;
        c13167.m30163("li", linkedHashMapM50544, false);
        mo17980(c20662);
        c13167.m30165("/li");
        c13167.m30161();
    }

    @Override // p067l.AbstractC7782, p067l.InterfaceC11944
    /* JADX INFO: renamed from: ֫ */
    public final void mo17979(C24684 c24684) {
        LinkedHashMap linkedHashMapM50544 = m50544(c24684, "br", Collections.EMPTY_MAP);
        C13167 c13167 = this.f71142;
        c13167.m30163("br", linkedHashMapM50544, true);
        c13167.m30161();
    }

    /* JADX INFO: renamed from: ֫ */
    private LinkedHashMap m50544(AbstractC2555 abstractC2555, String str, Map map) {
        return ((C11826) this.f71141).mo27091(abstractC2555, str, map);
    }
}
