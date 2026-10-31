package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes.dex */
public class C21863 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C21863 f70026 = new C15511(null, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC8457 f70027;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14163 f70028;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16384 f70029;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16384 f70030;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m49254() {
        return !(this instanceof C15511);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m49250() {
        C14163 c14163;
        while (true) {
            c14163 = this.f70028;
            if (c14163.f17564.mo7078()) {
                break;
            } else {
                c14163.mo16101();
            }
        }
        InterfaceC8457 interfaceC8457 = this.f70027;
        if (interfaceC8457 != null) {
            this.f70027 = null;
            interfaceC8457.mo4895(c14163);
        }
    }

    public C21863(C14163 c14163, InterfaceC8457 interfaceC8457) {
        this.f70028 = c14163;
        this.f70027 = interfaceC8457;
    }

    /* JADX INFO: renamed from: ܽ */
    public C16384 mo36582() {
        m49250();
        return this.f70029;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49252(C16384 c16384) {
        C12171.m29644(this.f70029);
        this.f70029 = c16384;
    }

    /* JADX INFO: renamed from: ᩳ */
    public C16384 mo36583() {
        m49250();
        return this.f70030;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49253(C16384 c16384) {
        C12171.m29644(this.f70030);
        this.f70030 = c16384;
    }

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashSet mo36580() {
        m49250();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C14163 c14163 = this.f70028;
        c14163.mo16101();
        for (AbstractC5698 abstractC5698 : c14163.f42762.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC5698.f17559 == EnumC1296.f4571) {
                AbstractC10370 abstractC10370 = abstractC5698.f17562;
                if (abstractC10370 != abstractC10370.f31203.f37517.f18842 && (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                    linkedHashSet.add((C3581) abstractC5698);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashSet mo36581() {
        m49250();
        LinkedHashSet<C3581> linkedHashSetMo36580 = mo36580();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C3581 c3581 : linkedHashSetMo36580) {
            if (c3581.f11370 != null) {
                linkedHashSet.add(c3581);
            }
        }
        return linkedHashSet;
    }

    public String toString() {
        return "Annotation type for: " + this.f70028;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C21863 m49251() {
        return f70026;
    }
}
