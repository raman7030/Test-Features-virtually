package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAOF */
/* JADX INFO: loaded from: classes2.dex */
public class C0539 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f2205 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2206 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f2207;

    public C0539(String str) {
        this.f2207 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2276(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(a.h);
        char c = str2.indexOf(34) != -1 ? '\'' : '\"';
        sb.append(c);
        m2274(c, str2, sb);
        sb.append(c);
        this.f2205.add(sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2278(C0539 c0539) {
        this.f2206.add(c0539);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2274(int i, String str, StringBuilder sb) {
        String str2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t' || cCharAt == '\n') {
                if (i == -1) {
                    sb.append(cCharAt);
                } else {
                    sb.append("&#");
                    sb.append((int) cCharAt);
                    sb.append(';');
                }
            } else if (cCharAt == '\r') {
                sb.append("&#");
                sb.append((int) cCharAt);
                sb.append(';');
            } else if (cCharAt == '\"') {
                if (cCharAt == i) {
                    if (cCharAt == '\"') {
                        str2 = "&quot;";
                    } else {
                        str2 = "&apos;";
                    }
                    sb.append(str2);
                } else {
                    sb.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt != '\'') {
                if (cCharAt >= ' ' && cCharAt < 127) {
                    sb.append(cCharAt);
                } else if (C10753.m26952(cCharAt)) {
                    sb.append(cCharAt);
                } else {
                    sb.append("&#");
                    sb.append((int) cCharAt);
                    sb.append(l.b);
                }
            } else if (cCharAt == i) {
                if (cCharAt == '\"') {
                    str2 = "&quot;";
                } else {
                    str2 = "&apos;";
                }
                sb.append(str2);
            } else {
                sb.append(cCharAt);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo2277(sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad A[LOOP:8: B:30:0x00ab->B:31:0x00ad, LOOP_END] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2277(StringBuilder sb, int i) {
        int i2;
        int i3;
        ArrayList<String> arrayList = this.f2205;
        String str = this.f2207;
        ArrayList<C0539> arrayList2 = this.f2206;
        if (i == -1) {
            sb.append('<');
            sb.append(str);
            for (String str2 : arrayList) {
                sb.append(' ');
                sb.append(str2);
            }
            if (arrayList2.isEmpty()) {
                sb.append(" />");
                return;
            }
            sb.append(">");
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C0539) it.next()).mo2277(sb, -1);
            }
            sb.append("</");
            sb.append(str);
            sb.append('>');
            return;
        }
        for (int i4 = 0; i4 < i; i4++) {
            sb.append(' ');
        }
        sb.append('<');
        sb.append(str);
        if (arrayList.size() == 1) {
            if (((String) arrayList.get(0)).length() + str.length() + i < 60) {
                sb.append(' ');
                sb.append((String) arrayList.get(0));
            } else {
                for (String str3 : arrayList) {
                    sb.append('\n');
                    i2 = i + 4;
                    for (i3 = 0; i3 < i2; i3++) {
                        sb.append(' ');
                    }
                    sb.append(str3);
                }
            }
        } else {
            while (r5.hasNext()) {
                sb.append('\n');
                i2 = i + 4;
                while (i3 < i2) {
                    sb.append(' ');
                }
                sb.append(str3);
            }
        }
        if (arrayList2.isEmpty()) {
            sb.append(" />");
            return;
        }
        sb.append(">");
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (((C0539) it2.next()) instanceof C19591) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((C0539) it3.next()).mo2277(sb, -1);
                }
                sb.append("</");
                sb.append(str);
                sb.append('>');
            }
        }
        for (C0539 c0539 : arrayList2) {
            sb.append('\n');
            c0539.mo2277(sb, i + 4);
        }
        sb.append('\n');
        for (int i5 = 0; i5 < i; i5++) {
            sb.append(' ');
        }
        sb.append("</");
        sb.append(str);
        sb.append('>');
    }
}
