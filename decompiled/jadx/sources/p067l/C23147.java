package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes.dex */
public class C23147 {

    /* JADX INFO: renamed from: ܿ */
    public static final C23147 f72736 = new C17110(null, null);

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC10406 f72737;

    /* JADX INFO: renamed from: ۧ */
    public final C15828 f72738;

    /* JADX INFO: renamed from: ܽ */
    public C17939 f72739;

    /* JADX INFO: renamed from: ᩳ */
    public C17939 f72740;

    /* JADX INFO: renamed from: ܿ */
    public boolean m51605() {
        return !(this instanceof C17110);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m51601() {
        C15828 c15828;
        while (true) {
            c15828 = this.f72738;
            if (c15828.f20410.mo9173()) {
                break;
            } else {
                c15828.mo18020();
            }
        }
        InterfaceC10406 interfaceC10406 = this.f72737;
        if (interfaceC10406 != null) {
            this.f72737 = null;
            interfaceC10406.mo7134(c15828);
        }
    }

    public C23147(C15828 c15828, InterfaceC10406 interfaceC10406) {
        this.f72738 = c15828;
        this.f72737 = interfaceC10406;
    }

    /* JADX INFO: renamed from: ܽ */
    public C17939 mo38741() {
        m51601();
        return this.f72739;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51603(C17939 c17939) {
        C1446.m31706(this.f72739);
        this.f72739 = c17939;
    }

    /* JADX INFO: renamed from: ᩳ */
    public C17939 mo38742() {
        m51601();
        return this.f72740;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51604(C17939 c17939) {
        C1446.m31706(this.f72740);
        this.f72740 = c17939;
    }

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashSet mo38739() {
        m51601();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C15828 c15828 = this.f72738;
        c15828.mo18020();
        for (AbstractC7783 abstractC7783 : c15828.f45850.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (abstractC7783.f20405 == EnumC3600.f7343) {
                AbstractC12224 abstractC12224 = abstractC7783.f20408;
                if (abstractC12224 != abstractC12224.f34165.f40540.f21700 && (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                    linkedHashSet.add((C5771) abstractC7783);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashSet mo38740() {
        m51601();
        LinkedHashSet<C5771> linkedHashSetMo38739 = mo38739();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5771 c5771 : linkedHashSetMo38739) {
            if (c5771.f14175 != null) {
                linkedHashSet.add(c5771);
            }
        }
        return linkedHashSet;
    }

    public String toString() {
        return "Annotation type for: " + this.f72738;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C23147 m51602() {
        return f72736;
    }
}
