package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46Z2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7805 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f24113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f24114;

    public C7805(List list, List list2) {
        if (list.isEmpty() || list.size() != list2.size() || list.size() > 65535) {
            throw new IllegalArgumentException("Invalid childrenSyntax mapping");
        }
        int i = 0;
        this.f24113 = (String[]) list.toArray(new String[0]);
        this.f24114 = (String[]) list2.toArray(new String[0]);
        HashSet hashSet = new HashSet(list.size());
        while (true) {
            String[] strArr = this.f24113;
            if (i >= strArr.length) {
                return;
            }
            String str = strArr[i];
            C11003.requireNonNull(str);
            String str2 = this.f24114[i];
            C11003.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax mapping target is empty");
            }
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax mapping selector: ".concat(str));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7805 m20826(ArrayList arrayList, ArrayList arrayList2) {
        return new C7805(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7805 m20827(C12951 c12951) throws IOException {
        int iM31494 = c12951.m31494();
        String[] strArr = new String[iM31494];
        String[] strArr2 = new String[iM31494];
        for (int i = 0; i < iM31494; i++) {
            strArr[i] = c12951.m31504();
            strArr2[i] = c12951.m31504();
        }
        try {
            return new C7805(C22870.m50968(strArr), C22870.m50968(strArr2));
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20830(C10130 c10130) {
        String[] strArr = this.f24113;
        c10130.mo13231(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            c10130.m25423((CharSequence) strArr[i]);
            c10130.m25423((CharSequence) this.f24114[i]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20829(LinkedHashMap linkedHashMap, boolean z, String str) {
        String[] strArr = this.f24113;
        HashSet hashSet = new HashSet(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String strM5635 = C1664.m5635(strArr[i], z);
            if (!hashSet.add(strM5635)) {
                StringBuilder sbM9834 = C3200.m9834("Duplicate childrenSyntax selector in mapping \"", str, "\": ");
                sbM9834.append(strArr[i]);
                throw new IllegalArgumentException(sbM9834.toString());
            }
            linkedHashMap.put(strM5635, new C14154(strArr[i], this.f24114[i]));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20828(StringBuilder sb) {
        sb.append("{\n");
        int i = 0;
        while (true) {
            String[] strArr = this.f24113;
            if (i >= strArr.length) {
                sb.append("");
                sb.append("}\n");
                return;
            }
            sb.append("\t");
            String str = strArr[i];
            sb.append('\"');
            C5801 c5801 = C10035.f30192;
            sb.append(c5801.m28254(str));
            sb.append('\"');
            sb.append(" => ");
            String str2 = this.f24114[i];
            sb.append('\"');
            sb.append(c5801.m28254(str2));
            sb.append('\"');
            sb.append('\n');
            i++;
        }
    }
}
