package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4710 implements InterfaceC6121 {
    @Override // l.InterfaceC6121
    /* JADX INFO: renamed from: ֫ */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        boolean zM24998 = true;
        c18906.m43647(true);
        C7073 c7073 = new C7073();
        C18514 c18514M44343 = c19220.m44343("parent");
        if (c18514M44343 != null) {
            String strM43026 = c18514M44343.m43026();
            Integer numM13803 = m13803(strM43026);
            if (numM13803 != null) {
                c7073.f21766 = numM13803.intValue();
                c7073.f21767 = 17;
            } else {
                zM24998 = C9896.m24998(strM43026, c7073);
            }
            if (!zM24998) {
                throw new C1580(C4860.m14172("Expected integer value: parent=\"", c18514M44343.m43026(), "\""), c18514M44343);
            }
            c18906.m43638(c7073.f21766);
        }
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            C19220 c19221 = (C19220) itM44337.next();
            m13804(c18906, c10355, c19221).m13997(m13802(c19221, c7073));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13802(C19220 c19220, C7073 c7073) throws C1580 {
        boolean zM24998;
        C18514 c18514M44343 = c19220.m44343("id");
        if (c18514M44343 == null) {
            return -1;
        }
        String strM43026 = c18514M44343.m43026();
        Integer numM13803 = m13803(strM43026);
        if (numM13803 != null) {
            c7073.f21766 = numM13803.intValue();
            c7073.f21767 = 17;
            zM24998 = true;
        } else {
            zM24998 = C9896.m24998(strM43026, c7073);
        }
        if (zM24998) {
            return c7073.f21766;
        }
        throw new C1580(C4860.m14172("Expected integer value: id=\"", c18514M44343.m43026(), "\""), c18514M44343);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m13803(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C9896.m24990(str)) {
            return Integer.valueOf(C9896.m24993(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4794 m13804(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        String strM44350 = c19220.m44350();
        strM44350.getClass();
        switch (strM44350) {
            case "dynamic-attribute":
                C4794 c4794M28795 = C11766.m28795(c18906, c10355, c19220);
                c4794M28795.m13998(8);
                return c4794M28795;
            case "fraction":
                return C11766.m28802(c18906, c10355, c19220);
            case "reference":
                return C11766.m28796(c18906, c19220, c10355, true);
            case "string":
                return C11766.m28800(c18906, c10355, c19220);
            case "bool":
                return C11766.m28801(c18906, c10355, c19220);
            case "attribute":
                return C11766.m28795(c18906, c10355, c19220);
            case "color":
                return C11766.m28803(c18906, c10355, c19220);
            case "dimen":
                return C11766.m28805(c18906, c10355, c19220);
            case "float":
                return C11766.m28804(c18906, c10355, c19220);
            case "dynamic-reference":
                C4794 c4794M28796 = C11766.m28796(c18906, c19220, c10355, false);
                c4794M28796.m13998(7);
                return c4794M28796;
            case "integer":
                return C11766.m28806(c18906, c10355, c19220);
            default:
                throw new C1580("Unknown tag <" + c19220.m44350() + ">", c19220);
        }
    }
}
