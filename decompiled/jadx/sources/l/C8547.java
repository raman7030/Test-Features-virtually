package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes3.dex */
public class C8547 implements InterfaceC4350 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f26131;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f26132;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumSet f26133;

    public C8547(Set set) {
        this.f26132 = new HashMap();
        this.f26133 = EnumSet.copyOf((Collection) set);
        m22267(EnumC19873.DEPTH, -1);
        m22267(EnumC19873.LENGTH, -1);
        this.f26131 = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[Catch: NumberFormatException -> 0x00bf, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00bf, blocks: (B:29:0x008f, B:35:0x0098, B:37:0x00a0, B:38:0x00ab, B:40:0x00b3), top: B:50:0x008f }] */
    public C8547(C11781 c11781, EnumSet enumSet) {
        this(enumSet);
        String strM28824 = c11781.m28824("diags.showSource");
        if (strM28824 != null) {
            if (strM28824.equals("true")) {
                m22268(EnumC21989.SOURCE, true);
            } else if (strM28824.equals("false")) {
                m22268(EnumC21989.SOURCE, false);
            }
        }
        String strM28825 = c11781.m28824("diags.formatterOptions");
        if (strM28825 != null) {
            List listAsList = Arrays.asList(strM28825.split(","));
            if (listAsList.contains(ClassTransform.SHORT)) {
                m22268(EnumC21989.DETAILS, false);
                m22268(EnumC21989.SUBDIAGNOSTICS, false);
            }
            if (listAsList.contains("source")) {
                m22268(EnumC21989.SOURCE, true);
            }
            if (listAsList.contains("-source")) {
                m22268(EnumC21989.SOURCE, false);
            }
        }
        String strM28826 = c11781.m28824("diags.multilinePolicy");
        if (strM28826 != null) {
            if (strM28826.equals("disabled")) {
                m22268(EnumC21989.SUBDIAGNOSTICS, false);
            } else if (strM28826.startsWith("limit:")) {
                String[] strArrSplit = strM28826.substring(6).split(":");
                try {
                    int length = strArrSplit.length;
                    if (length == 1) {
                        if (!strArrSplit[0].equals("*")) {
                            m22267(EnumC19873.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    } else if (length == 2) {
                        if (!strArrSplit[1].equals("*")) {
                            m22267(EnumC19873.DEPTH, Integer.parseInt(strArrSplit[1]));
                        }
                        if (!strArrSplit[0].equals("*")) {
                            m22267(EnumC19873.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    }
                } catch (NumberFormatException unused) {
                    m22267(EnumC19873.DEPTH, -1);
                    m22267(EnumC19873.LENGTH, -1);
                }
            }
        }
        String strM28827 = c11781.m28824("diags.showCaret");
        if (strM28827 == null || !strM28827.equals("false")) {
            this.f26131 = true;
        } else {
            this.f26131 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22267(EnumC19873 enumC19873, int i) {
        if (i < -1) {
            i = -1;
        }
        this.f26132.put(enumC19873, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22268(EnumC21989 enumC21989, boolean z) {
        if (z) {
            this.f26133.add(enumC21989);
        } else {
            this.f26133.remove(enumC21989);
        }
    }
}
