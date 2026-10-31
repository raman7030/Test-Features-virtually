package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C43V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8442 implements InterfaceC21848 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25840 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15496 f25841;

    @Override // l.InterfaceC21848
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void mo22122(InterfaceC15496 interfaceC15496) {
        if (this.f25840) {
            throw new IllegalStateException("Cannot call init more than once.");
        }
        this.f25841 = interfaceC15496;
        this.f25840 = true;
    }

    @Override // l.InterfaceC21848
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set mo22121() {
        InterfaceC20437 interfaceC20437 = (InterfaceC20437) getClass().getAnnotation(InterfaceC20437.class);
        return interfaceC20437 == null ? Collections.EMPTY_SET : m22120(interfaceC20437.value(), false, "option value", "@SupportedOptions");
    }

    @Override // l.InterfaceC21848
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Set mo22123() {
        boolean z;
        InterfaceC22553 interfaceC22553 = (InterfaceC22553) getClass().getAnnotation(InterfaceC22553.class);
        synchronized (this) {
            z = this.f25840;
        }
        if (interfaceC22553 != null) {
            return m22120(interfaceC22553.value(), z && ((C1302) this.f25841).m4524().compareTo(EnumC3503.RELEASE_8) <= 0, "annotation type", "@SupportedAnnotationTypes");
        }
        if (z) {
            ((C1302) this.f25841).m4529().m40970(EnumC6346.WARNING, "No SupportedAnnotationTypes annotation found on " + getClass().getName() + ", returning an empty set.");
        }
        return Collections.EMPTY_SET;
    }

    @Override // l.InterfaceC21848
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC3503 mo22124() {
        boolean z;
        InterfaceC4914 interfaceC4914 = (InterfaceC4914) getClass().getAnnotation(InterfaceC4914.class);
        if (interfaceC4914 != null) {
            return interfaceC4914.value();
        }
        EnumC3503 enumC3503 = EnumC3503.RELEASE_6;
        synchronized (this) {
            z = this.f25840;
        }
        if (z) {
            ((C1302) this.f25841).m4529().m40970(EnumC6346.WARNING, "No SupportedSourceVersion annotation found on " + getClass().getName() + ", returning " + enumC3503 + ".");
        }
        return enumC3503;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Set m22120(String[] strArr, boolean z, String str, String str2) {
        String strSubstring;
        boolean z2;
        boolean z3;
        int iIndexOf;
        HashSet hashSet = new HashSet();
        for (String str3 : strArr) {
            if (!z || (iIndexOf = str3.indexOf(47)) == -1) {
                strSubstring = str3;
                z2 = false;
            } else {
                strSubstring = str3.substring(iIndexOf + 1);
                z2 = true;
            }
            if (!hashSet.add(strSubstring) && !z2) {
                synchronized (this) {
                    z3 = this.f25840;
                }
                if (z3) {
                    C17530 c17530M4529 = ((C1302) this.f25841).m4529();
                    EnumC6346 enumC6346 = EnumC6346.WARNING;
                    StringBuilder sbM10501 = C3435.m10501("Duplicate ", str, " ``", strSubstring, "'' for processor ");
                    sbM10501.append(getClass().getName());
                    sbM10501.append(" in its ");
                    sbM10501.append(str2);
                    sbM10501.append("annotation.");
                    c17530M4529.m40970(enumC6346, sbM10501.toString());
                }
            }
        }
        return C20195.unmodifiableSet(hashSet);
    }
}
