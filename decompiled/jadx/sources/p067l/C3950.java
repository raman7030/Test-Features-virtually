package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֫ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3950 {

    /* JADX INFO: renamed from: ֫ */
    public final int f8608;

    /* JADX INFO: renamed from: ۧ */
    public final String f8609;

    /* JADX INFO: renamed from: ܳ */
    public final String[] f8610;

    /* JADX INFO: renamed from: ܽ */
    public final String f8611;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f8612;

    /* JADX INFO: renamed from: ᩳ */
    public final String[] f8613;

    /* JADX INFO: renamed from: ᩻ */
    public final String[] f8614;

    public C3950(String str, int i, boolean z, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        this.f8611 = str;
        this.f8608 = i;
        this.f8612 = z;
        this.f8613 = strArr;
        this.f8610 = strArr2;
        this.f8614 = strArr3;
        this.f8609 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3950 m7867(String str) {
        C12826.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid fixed childrenSyntax target");
        }
        return new C3950(str, -1, false, new String[0], new String[0], new String[0], null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3950 m7866(int i, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
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
            C12826.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax include name is empty");
            }
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax include: ".concat(str2));
            }
        }
        return new C3950(null, i, z, (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), (String[]) arrayList3.toArray(new String[0]), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3950 m7868(C14677 c14677) throws IOException {
        String[] strArr;
        byte b = c14677.readByte();
        if (b == 0) {
            return null;
        }
        boolean z = true;
        if (b == 1) {
            return m7867(c14677.m33591());
        }
        if (b != 2 && b != 3 && b != 4 && b != 5) {
            throw new IOException(C20778.m46922(b, "Unknown childrenSyntax mode: "));
        }
        int iM33581 = c14677.m33581();
        boolean zM33585 = c14677.m33585();
        boolean z2 = b == 4 || b == 5;
        if (z2) {
            int iM33582 = c14677.m33581();
            if (iM33582 == 0) {
                throw new IOException("Dynamic childrenSyntax includes are empty");
            }
            String[] strArr2 = new String[iM33582];
            HashSet hashSet = new HashSet(iM33582);
            for (int i = 0; i < iM33582; i++) {
                String strM33591 = c14677.m33591();
                strArr2[i] = strM33591;
                if (strM33591.isEmpty()) {
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
        int iM33583 = c14677.m33581();
        if (b != 3 && b != 5) {
            z = false;
        }
        if (iM33583 == 0 && !z2 && !z) {
            throw new IOException("Dynamic childrenSyntax cases are empty");
        }
        String[] strArr3 = new String[iM33583];
        String[] strArr4 = new String[iM33583];
        HashSet hashSet2 = new HashSet(iM33583);
        for (int i2 = 0; i2 < iM33583; i2++) {
            strArr3[i2] = c14677.m33591();
            String strM33592 = c14677.m33591();
            strArr4[i2] = strM33592;
            if (strM33592.isEmpty()) {
                throw new IOException("childrenSyntax target is empty");
            }
            if (!hashSet2.add(m7865(strArr3[i2], zM33585))) {
                throw new IOException("Duplicate childrenSyntax selector: " + strArr3[i2]);
            }
        }
        String strM33593 = z ? c14677.m33591() : null;
        if (strM33593 == null || !strM33593.isEmpty()) {
            return new C3950(null, iM33581, zM33585, strArr, strArr3, strArr4, strM33593);
        }
        throw new IOException("childrenSyntax default target is empty");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7869(C11996 c11996, C3950 c3950) {
        if (c3950 != null) {
            String[] strArr = c3950.f8610;
            String str = c3950.f8609;
            String[] strArr2 = c3950.f8613;
            if (!c3950.m7879()) {
                c11996.writeByte(1);
                String str2 = c3950.f8611;
                C12826.requireNonNull(str2);
                c11996.m27443((CharSequence) str2);
                return;
            }
            boolean z = strArr2.length != 0;
            c11996.writeByte(z ? str == null ? 4 : 5 : str == null ? 2 : 3);
            c11996.mo15113(c3950.f8608);
            c11996.m27445(c3950.f8612);
            if (z) {
                c11996.mo15113(strArr2.length);
                for (String str3 : strArr2) {
                    c11996.m27443((CharSequence) str3);
                }
            }
            c11996.mo15113(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                c11996.m27443((CharSequence) strArr[i]);
                c11996.m27443((CharSequence) c3950.f8614[i]);
            }
            if (str != null) {
                c11996.m27443((CharSequence) str);
                return;
            }
            return;
        }
        c11996.writeByte(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7874(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("childrenSyntax: ");
        if (!m7879()) {
            String str2 = this.f8611;
            C12826.requireNonNull(str2);
            m7870(sb, str2);
            sb.append('\n');
            return;
        }
        sb.append("{\n");
        String str3 = str + '\t';
        sb.append(str3);
        sb.append("capture: ");
        sb.append(this.f8608);
        sb.append('\n');
        sb.append(str3);
        sb.append("ignoreCase: ");
        sb.append(this.f8612);
        sb.append('\n');
        int i = 0;
        for (String str4 : this.f8613) {
            sb.append(str3);
            sb.append("include: ");
            m7870(sb, str4);
            sb.append('\n');
        }
        while (true) {
            String[] strArr = this.f8610;
            if (i >= strArr.length) {
                break;
            }
            sb.append(str3);
            m7870(sb, strArr[i]);
            sb.append(" => ");
            m7870(sb, this.f8614[i]);
            sb.append('\n');
            i++;
        }
        String str5 = this.f8609;
        if (str5 != null) {
            sb.append(str3);
            sb.append("default => ");
            m7870(sb, str5);
            sb.append('\n');
        }
        sb.append(str);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7870(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(C11905.f33150.m30298(str));
        sb.append('\"');
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m7879() {
        return this.f8611 == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3950 m7873(C16689 c16689) {
        boolean z;
        if (m7879()) {
            String[] strArr = this.f8613;
            if (strArr.length != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = this.f8612;
                    if (i >= length) {
                        break;
                    }
                    String str = strArr[i];
                    c16689.m37808(str).m22810(linkedHashMap, z, str);
                    i++;
                }
                String[] strArr2 = this.f8610;
                HashSet hashSet = new HashSet(strArr2.length);
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    String strM7865 = m7865(strArr2[i2], z);
                    if (!hashSet.add(strM7865)) {
                        throw new IllegalArgumentException("Duplicate childrenSyntax selector: " + strArr2[i2]);
                    }
                    linkedHashMap.put(strM7865, new C15821(strArr2[i2], this.f8614[i2]));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (C15821 c15821 : linkedHashMap.values()) {
                    arrayList.add(c15821.f45801);
                    arrayList2.add(c15821.f45802);
                }
                return new C3950(null, this.f8608, this.f8612, new String[0], (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), this.f8609);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m7880() {
        return this.f8611;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7871() {
        return this.f8608;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m7877() {
        return this.f8612;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m7875() {
        return this.f8610.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m7872(int i) {
        return this.f8610[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m7876(int i) {
        return this.f8614[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m7878() {
        return this.f8609;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7865(String str, boolean z) {
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
