package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6ZZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17349;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f17350;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17351;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f17352;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11459 f17353;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5606 m15902(C11459 c11459) {
        return new C5606(Collections.singletonList(c11459.pattern()), Collections.EMPTY_LIST, c11459.flags(), c11459);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5606 m15901(ArrayList arrayList, ArrayList arrayList2, int i) {
        C11459 c11459M28259;
        if (arrayList.size() != arrayList2.size() + 1) {
            throw new IllegalArgumentException("Regex template fragments and variables differ");
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C11003.requireNonNull(obj);
            arrayList3.add(obj);
        }
        List listUnmodifiableList = C20195.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        for (Object obj2 : arrayList2) {
            C11003.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        List listUnmodifiableList2 = C20195.unmodifiableList(arrayList4);
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
            c11459M28259 = C7017.m18954(i, (String) listUnmodifiableList.get(0));
        } else {
            c11459M28259 = C11459.m28259(i, m15900(listUnmodifiableList, false));
            if (C11459.m28259(i, m15900(listUnmodifiableList, true)).matcher((CharSequence) "").groupCount() != listUnmodifiableList2.size() + c11459M28259.matcher((CharSequence) "").groupCount()) {
                throw new IllegalArgumentException("var() must appear in a regex atom position");
            }
        }
        return new C5606(listUnmodifiableList, listUnmodifiableList2, i, c11459M28259);
    }

    public C5606(List list, List list2, int i, C11459 c11459) {
        this.f17350 = list;
        this.f17352 = list2;
        this.f17349 = i;
        this.f17353 = c11459;
        this.f17351 = c11459.matcher("").groupCount();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15908(C10130 c10130) {
        c10130.mo13231(this.f17349);
        List list = this.f17352;
        c10130.mo13231(list.size());
        List list2 = this.f17350;
        int i = 0;
        c10130.m25423((CharSequence) list2.get(0));
        while (i < list.size()) {
            c10130.m25423((CharSequence) list.get(i));
            i++;
            c10130.m25423((CharSequence) list2.get(i));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11459 m15913() {
        return this.f17353;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7225 m15915() {
        return m15912() ? C7225.f22115 : this.f17353.m28264();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15910() {
        return this.f17351;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m15912() {
        return !this.f17352.isEmpty();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m15914() {
        return this.f17352;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15905() {
        return this.f17349;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15907(StringBuilder sb) {
        int i = 0;
        boolean z = false;
        while (true) {
            List list = this.f17350;
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
            List list2 = this.f17352;
            if (i < list2.size()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append("var(\"");
                sb.append(C14020.m33622((String) list2.get(i)));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15900(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(z ? "(\\Qx\\E)" : "(?:\\Qx\\E)");
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15911(CharSequence charSequence, int[] iArr, int[] iArr2) {
        return m15904(charSequence, iArr, iArr2) >= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m15906(CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        int iM15904 = m15904(charSequence, iArr, iArr2);
        if (iM15904 < 0) {
            throw new IllegalArgumentException("Expanded regex exceeds the size limit");
        }
        StringBuilder sb = new StringBuilder(iM15904);
        List list = this.f17350;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15909(String str, CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        m15903(charSequence, iArr, iArr2);
        List list = this.f17350;
        int iM15899 = m15899(0, str, (String) list.get(0));
        if (iM15899 >= 0) {
            int i2 = 0;
            while (i2 < iArr2.length) {
                int iM158910 = m15899(iM15899, str, "(?:\\Q");
                if (iM158910 >= 0) {
                    int i3 = iArr2[i2] << 1;
                    int i4 = iArr[i3];
                    int i5 = iArr[i3 + 1];
                    while (i4 < i5) {
                        char cCharAt = charSequence.charAt(i4);
                        if (cCharAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                            iM158910 = m15899(iM158910, str, "\\E\\\\E\\Q");
                            if (iM158910 >= 0) {
                                i4 = i;
                                i4++;
                            }
                        } else if (iM158910 < str.length()) {
                            int i6 = iM158910 + 1;
                            if (str.charAt(iM158910) == cCharAt) {
                                iM158910 = i6;
                                i4++;
                            }
                        }
                    }
                    int iM158911 = m15899(iM158910, str, "\\E)");
                    if (iM158911 >= 0) {
                        i2++;
                        iM15899 = m15899(iM158911, str, (String) list.get(i2));
                        if (iM15899 < 0) {
                        }
                    }
                }
            }
            if (iM15899 == str.length()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15903(CharSequence charSequence, int[] iArr, int[] iArr2) {
        if (iArr2.length != this.f17352.size() || (iArr.length & 1) != 0) {
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m15904(CharSequence charSequence, int[] iArr, int[] iArr2) {
        m15903(charSequence, iArr, iArr2);
        long length = ((long) iArr2.length) * ((long) 8);
        Iterator it = this.f17350.iterator();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15899(int i, String str, String str2) {
        int length = str2.length() + i;
        if (i < 0 || length < i || length > str.length() || !str.regionMatches(i, str2, 0, str2.length())) {
            return -1;
        }
        return length;
    }
}
