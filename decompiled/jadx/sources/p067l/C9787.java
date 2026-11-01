package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46Z2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9787 {

    /* JADX INFO: renamed from: ֫ */
    public final String[] f27030;

    /* JADX INFO: renamed from: ۧ */
    public final String[] f27031;

    public C9787(List list, List list2) {
        if (list.isEmpty() || list.size() != list2.size() || list.size() > 65535) {
            throw new IllegalArgumentException("Invalid childrenSyntax mapping");
        }
        int i = 0;
        this.f27030 = (String[]) list.toArray(new String[0]);
        this.f27031 = (String[]) list2.toArray(new String[0]);
        HashSet hashSet = new HashSet(list.size());
        while (true) {
            String[] strArr = this.f27030;
            if (i >= strArr.length) {
                return;
            }
            String str = strArr[i];
            C12826.requireNonNull(str);
            String str2 = this.f27031[i];
            C12826.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax mapping target is empty");
            }
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax mapping selector: ".concat(str));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9787 m22807(ArrayList arrayList, ArrayList arrayList2) {
        return new C9787(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9787 m22808(C14677 c14677) throws IOException {
        int iM33581 = c14677.m33581();
        String[] strArr = new String[iM33581];
        String[] strArr2 = new String[iM33581];
        for (int i = 0; i < iM33581; i++) {
            strArr[i] = c14677.m33591();
            strArr2[i] = c14677.m33591();
        }
        try {
            return new C9787(C24104.m53358(strArr), C24104.m53358(strArr2));
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22811(C11996 c11996) {
        String[] strArr = this.f27030;
        c11996.mo15113(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            c11996.m27443((CharSequence) strArr[i]);
            c11996.m27443((CharSequence) this.f27031[i]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22810(LinkedHashMap linkedHashMap, boolean z, String str) {
        String[] strArr = this.f27030;
        HashSet hashSet = new HashSet(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String strM7865 = C3950.m7865(strArr[i], z);
            if (!hashSet.add(strM7865)) {
                StringBuilder sbM11879 = C5410.m11879("Duplicate childrenSyntax selector in mapping \"", str, "\": ");
                sbM11879.append(strArr[i]);
                throw new IllegalArgumentException(sbM11879.toString());
            }
            linkedHashMap.put(strM7865, new C15821(strArr[i], this.f27031[i]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22809(StringBuilder sb) {
        sb.append("{\n");
        int i = 0;
        while (true) {
            String[] strArr = this.f27030;
            if (i >= strArr.length) {
                sb.append("");
                sb.append("}\n");
                return;
            }
            sb.append("\t");
            String str = strArr[i];
            sb.append('\"');
            C7881 c7881 = C11905.f33150;
            sb.append(c7881.m30298(str));
            sb.append('\"');
            sb.append(" => ");
            String str2 = this.f27031[i];
            sb.append('\"');
            sb.append(c7881.m30298(str2));
            sb.append('\"');
            sb.append('\n');
            i++;
        }
    }
}
