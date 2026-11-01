package p067l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C43V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10392 implements InterfaceC23133 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f28753 = false;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC17096 f28754;

    @Override // p067l.InterfaceC23133
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo24091(InterfaceC17096 interfaceC17096) {
        if (this.f28753) {
            throw new IllegalStateException("Cannot call init more than once.");
        }
        this.f28754 = interfaceC17096;
        this.f28753 = true;
    }

    @Override // p067l.InterfaceC23133
    /* JADX INFO: renamed from: ֫ */
    public final Set mo24090() {
        InterfaceC21792 interfaceC21792 = (InterfaceC21792) getClass().getAnnotation(InterfaceC21792.class);
        return interfaceC21792 == null ? Collections.EMPTY_SET : m24089(interfaceC21792.value(), false, "option value", "@SupportedOptions");
    }

    @Override // p067l.InterfaceC23133
    /* JADX INFO: renamed from: ۧ */
    public final Set mo24092() {
        boolean z;
        InterfaceC23803 interfaceC23803 = (InterfaceC23803) getClass().getAnnotation(InterfaceC23803.class);
        synchronized (this) {
            z = this.f28753;
        }
        if (interfaceC23803 != null) {
            return m24089(interfaceC23803.value(), z && ((C3606) this.f28754).m6756().compareTo(EnumC5698.RELEASE_8) <= 0, "annotation type", "@SupportedAnnotationTypes");
        }
        if (z) {
            ((C3606) this.f28754).m6761().m43229(EnumC8400.WARNING, "No SupportedAnnotationTypes annotation found on " + getClass().getName() + ", returning an empty set.");
        }
        return Collections.EMPTY_SET;
    }

    @Override // p067l.InterfaceC23133
    /* JADX INFO: renamed from: ܽ */
    public final EnumC5698 mo24093() {
        boolean z;
        InterfaceC7039 interfaceC7039 = (InterfaceC7039) getClass().getAnnotation(InterfaceC7039.class);
        if (interfaceC7039 != null) {
            return interfaceC7039.value();
        }
        EnumC5698 enumC5698 = EnumC5698.RELEASE_6;
        synchronized (this) {
            z = this.f28753;
        }
        if (z) {
            ((C3606) this.f28754).m6761().m43229(EnumC8400.WARNING, "No SupportedSourceVersion annotation found on " + getClass().getName() + ", returning " + enumC5698 + ".");
        }
        return enumC5698;
    }

    /* JADX INFO: renamed from: ֫ */
    private Set m24089(String[] strArr, boolean z, String str, String str2) {
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
                    z3 = this.f28753;
                }
                if (z3) {
                    C19029 c19029M6761 = ((C3606) this.f28754).m6761();
                    EnumC8400 enumC8400 = EnumC8400.WARNING;
                    StringBuilder sbM12525 = C5633.m12525("Duplicate ", str, " ``", strSubstring, "'' for processor ");
                    sbM12525.append(getClass().getName());
                    sbM12525.append(" in its ");
                    sbM12525.append(str2);
                    sbM12525.append("annotation.");
                    c19029M6761.m43229(enumC8400, sbM12525.toString());
                }
            }
        }
        return C21562.unmodifiableSet(hashSet);
    }
}
