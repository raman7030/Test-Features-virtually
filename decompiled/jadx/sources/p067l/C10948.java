package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WAJD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10948 {
    /* JADX INFO: renamed from: ֫ */
    public static C24143 m25219(C23708 c23708, C17652 c17652) {
        C8050 c8050M7243;
        C14260 c14260M52719 = c23708.m52719();
        C15660 c15660M52724 = c23708.m52724();
        C24143 c24143M25218 = m25218(c15660M52724);
        C5407 c5407 = (C5407) c15660M52724.m35585("EnclosingMethod");
        C8050 c8050M7238 = null;
        if (c5407 == null) {
            c8050M7243 = null;
        } else {
            C14260 c14260M11874 = c5407.m11874();
            C21637 c21637M11875 = c5407.m11875();
            if (c21637M11875 == null) {
                c8050M7243 = C3750.m7239(c14260M11874);
            } else {
                c8050M7243 = C3750.m7243(new C23648(c14260M11874, c21637M11875));
            }
        }
        try {
            C24143 c24143M25217 = m25217(c14260M52719, c15660M52724, c8050M7243 == null);
            if (c24143M25217 != null) {
                C24143 c24143 = new C24143();
                c24143.m53387(c24143M25218);
                c24143.m53387(c24143M25217);
                c24143.mo22326();
                c24143M25218 = c24143;
            }
        } catch (C3611 e) {
            c17652.f52729.println("warning: " + e.getMessage());
        }
        if (c8050M7243 != null) {
            c24143M25218 = C24143.m53385(c24143M25218, c8050M7243);
        }
        if ((c23708.m52717() & 8192) == 0) {
            return c24143M25218;
        }
        C14260 c14260M527110 = c23708.m52719();
        C19665 c19665M52723 = c23708.m52723();
        int size = c19665M52723.size();
        C8050 c8050 = new C8050(c14260M527110, EnumC13415.EMBEDDED);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            InterfaceC13650 interfaceC13650M56518get = c19665M52723.m56518get(i);
            C16805 c16805 = (C16805) interfaceC13650M56518get.getAttributes().m35585("AnnotationDefault");
            if (c16805 != null) {
                c8050.m18702(new C9391(interfaceC13650M56518get.mo12301().getName(), c16805.m38082()));
                z = true;
            }
        }
        if (z) {
            c8050.mo22326();
            c8050M7238 = C3750.m7238(c8050);
        }
        return c8050M7238 != null ? C24143.m53385(c24143M25218, c8050M7238) : c24143M25218;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24143 m25218(C15660 c15660) {
        C24143 c24143M37086;
        C9430 c9430 = (C9430) c15660.m35585("RuntimeVisibleAnnotations");
        C24182 c24182 = (C24182) c15660.m35585("RuntimeInvisibleAnnotations");
        if (c9430 == null) {
            if (c24182 == null) {
                c24143M37086 = C24143.f76578;
            } else {
                c24143M37086 = c24182.m37086();
            }
        } else if (c24182 == null) {
            c24143M37086 = c9430.m37086();
        } else {
            C24143 c24143M37087 = c9430.m37086();
            C24143 c24143M37088 = c24182.m37086();
            C24143 c24143 = new C24143();
            c24143.m53387(c24143M37087);
            c24143.m53387(c24143M37088);
            c24143.mo22326();
            c24143M37086 = c24143;
        }
        C12940 c12940 = (C12940) c15660.m35585("Signature");
        C8050 c8050M7240 = c12940 == null ? null : C3750.m7240(c12940.m29665());
        C18303 c18303 = (C18303) c15660.m35585("SourceDebugExtension");
        C8050 c8050M7246 = c18303 != null ? C3750.m7246(c18303.m41681()) : null;
        if (c8050M7240 != null) {
            c24143M37086 = C24143.m53385(c24143M37086, c8050M7240);
        }
        return c8050M7246 != null ? C24143.m53385(c24143M37086, c8050M7246) : c24143M37086;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24143 m25217(C14260 c14260, C15660 c15660, boolean z) {
        C14124 c14124 = (C14124) c15660.m35585("InnerClasses");
        if (c14124 != null) {
            C10928 c10928M32145 = c14124.m32145();
            int size = c10928M32145.size();
            ArrayList arrayList = new ArrayList();
            C11599 c11599 = null;
            for (int i = 0; i < size; i++) {
                C11599 c11599M56516get = c10928M32145.m56516get(i);
                C14260 c14260M26696 = c11599M56516get.m26696();
                if (c14260M26696.equals(c14260)) {
                    c11599 = c11599M56516get;
                } else if (c14260.equals(c11599M56516get.m26698())) {
                    arrayList.add(c14260M26696.m32771());
                }
            }
            int size2 = arrayList.size();
            if (c11599 != null || size2 != 0) {
                C24143 c24143 = new C24143();
                if (c11599 != null) {
                    c24143.m53386(C3750.m7241(c11599.m26697(), c11599.m26695()));
                    if (z) {
                        if (c11599.m26698() == null) {
                            throw new C3611("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c14260.mo4819() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        c24143.m53386(C3750.m7239(c11599.m26698()));
                    }
                }
                if (size2 != 0) {
                    C15600 c15600 = new C15600(size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        c15600.m43243(i2, (C9566) arrayList.get(i2));
                    }
                    c15600.mo22326();
                    c24143.m53386(C3750.m7242(c15600));
                }
                c24143.mo22326();
                return c24143;
            }
        }
        return null;
    }
}
