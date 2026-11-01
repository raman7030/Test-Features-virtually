package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6ZZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7697 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20193;

    /* JADX INFO: renamed from: ۧ */
    public final List f20194;

    /* JADX INFO: renamed from: ܽ */
    public final int f20195;

    /* JADX INFO: renamed from: ܿ */
    public final List f20196;

    /* JADX INFO: renamed from: ᩳ */
    public final C13259 f20197;

    /* JADX INFO: renamed from: ֫ */
    public static C7697 m17823(C13259 c13259) {
        return new C7697(Collections.singletonList(c13259.pattern()), Collections.EMPTY_LIST, c13259.flags(), c13259);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7697 m17822(ArrayList arrayList, ArrayList arrayList2, int i) {
        C13259 c13259M30303;
        if (arrayList.size() != arrayList2.size() + 1) {
            throw new IllegalArgumentException("Regex template fragments and variables differ");
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C12826.requireNonNull(obj);
            arrayList3.add(obj);
        }
        List listUnmodifiableList = C21562.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        for (Object obj2 : arrayList2) {
            C12826.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        List listUnmodifiableList2 = C21562.unmodifiableList(arrayList4);
        if (!listUnmodifiableList2.isEmpty()) {
            long size = ((long) listUnmodifiableList2.size()) * ((long) 8);
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                size += (long) ((String) it.next()).length();
                if (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    break;
                }
            }
            if (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                throw new IllegalArgumentException("Dynamic regex template exceeds the size limit");
            }
        }
        if (listUnmodifiableList2.isEmpty()) {
            c13259M30303 = C9038.m20911(i, (String) listUnmodifiableList.get(0));
        } else {
            c13259M30303 = C13259.m30303(i, m17821(listUnmodifiableList, false));
            if (C13259.m30303(i, m17821(listUnmodifiableList, true)).matcher((CharSequence) "").groupCount() != listUnmodifiableList2.size() + c13259M30303.matcher((CharSequence) "").groupCount()) {
                throw new IllegalArgumentException("var() must appear in a regex atom position");
            }
        }
        return new C7697(listUnmodifiableList, listUnmodifiableList2, i, c13259M30303);
    }

    public C7697(List list, List list2, int i, C13259 c13259) {
        this.f20194 = list;
        this.f20196 = list2;
        this.f20193 = i;
        this.f20197 = c13259;
        this.f20195 = c13259.matcher("").groupCount();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17829(C11996 c11996) {
        c11996.mo15113(this.f20193);
        List list = this.f20196;
        c11996.mo15113(list.size());
        List list2 = this.f20194;
        int i = 0;
        c11996.m27443((CharSequence) list2.get(0));
        while (i < list.size()) {
            c11996.m27443((CharSequence) list.get(i));
            i++;
            c11996.m27443((CharSequence) list2.get(i));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C13259 m17834() {
        return this.f20197;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9235 m17836() {
        return m17833() ? C9235.f24999 : this.f20197.m30308();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m17831() {
        return this.f20195;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m17833() {
        return !this.f20196.isEmpty();
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m17835() {
        return this.f20196;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17826() {
        return this.f20193;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17828(StringBuilder sb) {
        int i = 0;
        boolean z = false;
        while (true) {
            List list = this.f20194;
            if (i >= list.size()) {
                break;
            }
            String str = (String) list.get(i);
            if (!str.isEmpty()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append('/');
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '\n') {
                        sb.append("\\n");
                    } else if (cCharAt == '\r') {
                        sb.append("\\r");
                    } else if (cCharAt == '/') {
                        sb.append("\\/");
                    } else {
                        sb.append(cCharAt);
                    }
                }
                sb.append('/');
                z = true;
            }
            List list2 = this.f20196;
            if (i < list2.size()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append("var(\"");
                sb.append(C15693.m35742((String) list2.get(i)));
                sb.append("\")");
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        sb.append("/(?=)/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m17821(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(z ? "(\\Qx\\E)" : "(?:\\Qx\\E)");
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m17832(CharSequence charSequence, int[] iArr, int[] iArr2) {
        return m17825(charSequence, iArr, iArr2) >= 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m17827(CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        int iM17825 = m17825(charSequence, iArr, iArr2);
        if (iM17825 < 0) {
            throw new IllegalArgumentException("Expanded regex exceeds the size limit");
        }
        StringBuilder sb = new StringBuilder(iM17825);
        List list = this.f20194;
        int i2 = 0;
        sb.append((String) list.get(0));
        while (i2 < iArr2.length) {
            int i3 = iArr2[i2] << 1;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            sb.append("(?:\\Q");
            while (i4 < i5) {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                    sb.append("\\E\\\\E\\Q");
                    i4 = i;
                } else {
                    sb.append(cCharAt);
                }
                i4++;
            }
            sb.append("\\E)");
            i2++;
            sb.append((String) list.get(i2));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17830(String str, CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        m17824(charSequence, iArr, iArr2);
        List list = this.f20194;
        int iM17820 = m17820(0, str, (String) list.get(0));
        if (iM17820 >= 0) {
            int i2 = 0;
            while (i2 < iArr2.length) {
                int iM17821 = m17820(iM17820, str, "(?:\\Q");
                if (iM17821 >= 0) {
                    int i3 = iArr2[i2] << 1;
                    int i4 = iArr[i3];
                    int i5 = iArr[i3 + 1];
                    while (i4 < i5) {
                        char cCharAt = charSequence.charAt(i4);
                        if (cCharAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                            iM17821 = m17820(iM17821, str, "\\E\\\\E\\Q");
                            if (iM17821 >= 0) {
                                i4 = i;
                                i4++;
                            }
                        } else if (iM17821 < str.length()) {
                            int i6 = iM17821 + 1;
                            if (str.charAt(iM17821) == cCharAt) {
                                iM17821 = i6;
                                i4++;
                            }
                        }
                    }
                    int iM17822 = m17820(iM17821, str, "\\E)");
                    if (iM17822 >= 0) {
                        i2++;
                        iM17820 = m17820(iM17822, str, (String) list.get(i2));
                        if (iM17820 < 0) {
                        }
                    }
                }
            }
            if (iM17820 == str.length()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17824(CharSequence charSequence, int[] iArr, int[] iArr2) {
        if (iArr2.length != this.f20196.size() || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid regex template bindings");
        }
        for (int i : iArr2) {
            if (i < 0 || i >= iArr.length / 2) {
                throw new IllegalArgumentException("Invalid regex template binding slot");
            }
            int i2 = i << 1;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 < 0 || i4 < i3 || i4 > charSequence.length()) {
                throw new IllegalArgumentException("Invalid regex template binding range");
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m17825(CharSequence charSequence, int[] iArr, int[] iArr2) {
        m17824(charSequence, iArr, iArr2);
        long length = ((long) iArr2.length) * ((long) 8);
        Iterator it = this.f20194.iterator();
        while (it.hasNext()) {
            length += (long) ((String) it.next()).length();
            if (length > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                return -1;
            }
        }
        for (int i : iArr2) {
            int i2 = i << 1;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            length += (long) (i4 - i3);
            if (length > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                return -1;
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 < i4) {
                    if (charSequence.charAt(i3) == '\\' && charSequence.charAt(i5) == 'E') {
                        length += (long) 5;
                        if (length > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                            return -1;
                        }
                        i3 = i5;
                    }
                    i3++;
                }
            }
        }
        return (int) length;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m17820(int i, String str, String str2) {
        int length = str2.length() + i;
        if (i < 0 || length < i || length > str.length() || !str.regionMatches(i, str2, 0, str2.length())) {
            return -1;
        }
        return length;
    }
}
