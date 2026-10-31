package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֫ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1664 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f5828;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5829;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String[] f5830;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f5831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f5832;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] f5833;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String[] f5834;

    public C1664(String str, int i, boolean z, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        this.f5831 = str;
        this.f5828 = i;
        this.f5832 = z;
        this.f5833 = strArr;
        this.f5830 = strArr2;
        this.f5834 = strArr3;
        this.f5829 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1664 m5637(String str) {
        C11003.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid fixed childrenSyntax target");
        }
        return new C1664(str, -1, false, new String[0], new String[0], new String[0], null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1664 m5636(int i, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        if (i < 0 || i > 65535 || arrayList2.size() != arrayList3.size() || ((arrayList.isEmpty() && arrayList2.isEmpty() && str == null) || arrayList.size() > 65535 || arrayList2.size() > 65535)) {
            throw new IllegalArgumentException("Invalid dynamic childrenSyntax");
        }
        if (str != null && str.isEmpty()) {
            throw new IllegalArgumentException("Invalid childrenSyntax default target");
        }
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C11003.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax include name is empty");
            }
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax include: ".concat(str2));
            }
        }
        return new C1664(null, i, z, (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), (String[]) arrayList3.toArray(new String[0]), str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1664 m5638(C12951 c12951) throws IOException {
        String[] strArr;
        byte b = c12951.readByte();
        if (b == 0) {
            return null;
        }
        boolean z = true;
        if (b == 1) {
            return m5637(c12951.m31504());
        }
        if (b != 2 && b != 3 && b != 4 && b != 5) {
            throw new IOException(C19370.m44628(b, "Unknown childrenSyntax mode: "));
        }
        int iM31494 = c12951.m31494();
        boolean zM31498 = c12951.m31498();
        boolean z2 = b == 4 || b == 5;
        if (z2) {
            int iM31495 = c12951.m31494();
            if (iM31495 == 0) {
                throw new IOException("Dynamic childrenSyntax includes are empty");
            }
            String[] strArr2 = new String[iM31495];
            HashSet hashSet = new HashSet(iM31495);
            for (int i = 0; i < iM31495; i++) {
                String strM31504 = c12951.m31504();
                strArr2[i] = strM31504;
                if (strM31504.isEmpty()) {
                    throw new IOException("childrenSyntax include name is empty");
                }
                if (!hashSet.add(strArr2[i])) {
                    throw new IOException("Duplicate childrenSyntax include: " + strArr2[i]);
                }
            }
            strArr = strArr2;
        } else {
            strArr = new String[0];
        }
        int iM31496 = c12951.m31494();
        if (b != 3 && b != 5) {
            z = false;
        }
        if (iM31496 == 0 && !z2 && !z) {
            throw new IOException("Dynamic childrenSyntax cases are empty");
        }
        String[] strArr3 = new String[iM31496];
        String[] strArr4 = new String[iM31496];
        HashSet hashSet2 = new HashSet(iM31496);
        for (int i2 = 0; i2 < iM31496; i2++) {
            strArr3[i2] = c12951.m31504();
            String strM31505 = c12951.m31504();
            strArr4[i2] = strM31505;
            if (strM31505.isEmpty()) {
                throw new IOException("childrenSyntax target is empty");
            }
            if (!hashSet2.add(m5635(strArr3[i2], zM31498))) {
                throw new IOException("Duplicate childrenSyntax selector: " + strArr3[i2]);
            }
        }
        String strM31506 = z ? c12951.m31504() : null;
        if (strM31506 == null || !strM31506.isEmpty()) {
            return new C1664(null, iM31494, zM31498, strArr, strArr3, strArr4, strM31506);
        }
        throw new IOException("childrenSyntax default target is empty");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5639(C10130 c10130, C1664 c1664) {
        if (c1664 != null) {
            String[] strArr = c1664.f5830;
            String str = c1664.f5829;
            String[] strArr2 = c1664.f5833;
            if (!c1664.m5649()) {
                c10130.writeByte(1);
                String str2 = c1664.f5831;
                C11003.requireNonNull(str2);
                c10130.m25423((CharSequence) str2);
                return;
            }
            boolean z = strArr2.length != 0;
            c10130.writeByte(z ? str == null ? 4 : 5 : str == null ? 2 : 3);
            c10130.mo13231(c1664.f5828);
            c10130.m25425(c1664.f5832);
            if (z) {
                c10130.mo13231(strArr2.length);
                for (String str3 : strArr2) {
                    c10130.m25423((CharSequence) str3);
                }
            }
            c10130.mo13231(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                c10130.m25423((CharSequence) strArr[i]);
                c10130.m25423((CharSequence) c1664.f5834[i]);
            }
            if (str != null) {
                c10130.m25423((CharSequence) str);
                return;
            }
            return;
        }
        c10130.writeByte(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5644(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("childrenSyntax: ");
        if (!m5649()) {
            String str2 = this.f5831;
            C11003.requireNonNull(str2);
            m5640(sb, str2);
            sb.append('\n');
            return;
        }
        sb.append("{\n");
        String str3 = str + '\t';
        sb.append(str3);
        sb.append("capture: ");
        sb.append(this.f5828);
        sb.append('\n');
        sb.append(str3);
        sb.append("ignoreCase: ");
        sb.append(this.f5832);
        sb.append('\n');
        int i = 0;
        for (String str4 : this.f5833) {
            sb.append(str3);
            sb.append("include: ");
            m5640(sb, str4);
            sb.append('\n');
        }
        while (true) {
            String[] strArr = this.f5830;
            if (i >= strArr.length) {
                break;
            }
            sb.append(str3);
            m5640(sb, strArr[i]);
            sb.append(" => ");
            m5640(sb, this.f5834[i]);
            sb.append('\n');
            i++;
        }
        String str5 = this.f5829;
        if (str5 != null) {
            sb.append(str3);
            sb.append("default => ");
            m5640(sb, str5);
            sb.append('\n');
        }
        sb.append(str);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5640(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(C10035.f30192.m28254(str));
        sb.append('\"');
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m5649() {
        return this.f5831 == null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1664 m5643(C15068 c15068) {
        boolean z;
        if (m5649()) {
            String[] strArr = this.f5833;
            if (strArr.length != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = this.f5832;
                    if (i >= length) {
                        break;
                    }
                    String str = strArr[i];
                    c15068.m35650(str).m20829(linkedHashMap, z, str);
                    i++;
                }
                String[] strArr2 = this.f5830;
                HashSet hashSet = new HashSet(strArr2.length);
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    String strM5635 = m5635(strArr2[i2], z);
                    if (!hashSet.add(strM5635)) {
                        throw new IllegalArgumentException("Duplicate childrenSyntax selector: " + strArr2[i2]);
                    }
                    linkedHashMap.put(strM5635, new C14154(strArr2[i2], this.f5834[i2]));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (C14154 c14154 : linkedHashMap.values()) {
                    arrayList.add(c14154.f42712);
                    arrayList2.add(c14154.f42713);
                }
                return new C1664(null, this.f5828, this.f5832, new String[0], (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), this.f5829);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m5650() {
        return this.f5831;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5641() {
        return this.f5828;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m5647() {
        return this.f5832;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m5645() {
        return this.f5830.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m5642(int i) {
        return this.f5830[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m5646(int i) {
        return this.f5834[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m5648() {
        return this.f5829;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5635(String str, boolean z) {
        if (!z) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = Character.toLowerCase(Character.toUpperCase(charArray[i]));
        }
        return new String(charArray);
    }
}
