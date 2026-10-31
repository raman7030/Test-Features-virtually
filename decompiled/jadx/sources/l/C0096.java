package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7NK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0096 implements InterfaceC10855 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f1058 = Pattern.compile("^(//+)(?!noinspection|\\$NON-NLS-\\d+\\$)[^\\s/]");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f1059;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC7858 f1060;

    public C0096(String str, AbstractC7858 abstractC7858) {
        this.f1059 = str;
        this.f1060 = abstractC7858;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m1079(InterfaceC15086 interfaceC15086, final int i) {
        int i2;
        String string;
        if (!interfaceC15086.mo35700()) {
            return interfaceC15086.mo35701();
        }
        String strMo35701 = interfaceC15086.mo35701();
        if (interfaceC15086.mo35697() && this.f1060.mo21057()) {
            strMo35701 = C16757.m39433(i, strMo35701);
        }
        final ArrayList<String> arrayList = new ArrayList();
        Iterator itM31537 = C12970.m31537(strMo35701);
        while (true) {
            int i3 = 0;
            if (!itM31537.hasNext()) {
                break;
            }
            if (interfaceC15086.mo35696()) {
                AbstractC11581 abstractC11581M28473 = AbstractC11581.m28473();
                CharSequence charSequence = (CharSequence) itM31537.next();
                abstractC11581M28473.getClass();
                int length = charSequence.length();
                while (i3 < length && abstractC11581M28473.mo13300(charSequence.charAt(i3))) {
                    i3++;
                }
                do {
                    length--;
                    if (length <= i3) {
                        break;
                    }
                } while (abstractC11581M28473.mo13300(charSequence.charAt(length)));
                arrayList.add(charSequence.subSequence(i3, length + 1).toString());
            } else {
                AbstractC11581 abstractC11581M28474 = AbstractC11581.m28473();
                CharSequence charSequence2 = (CharSequence) itM31537.next();
                abstractC11581M28474.getClass();
                int length2 = charSequence2.length() - 1;
                while (true) {
                    if (length2 < 0) {
                        string = "";
                        break;
                    }
                    if (!abstractC11581M28474.mo13300(charSequence2.charAt(length2))) {
                        string = charSequence2.subSequence(0, length2 + 1).toString();
                        break;
                    }
                    length2--;
                }
                arrayList.add(string);
            }
        }
        if (!interfaceC15086.mo35696()) {
            return (String) C1682.m5681(interfaceC15086).orElseGet(new Supplier() { // from class: l.᩵֫ۖ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C0096.m1078(this.f60346, arrayList, i);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        for (String strM46305 : arrayList) {
            Matcher matcher = f1058.matcher(strM46305);
            if (matcher.find()) {
                int length3 = matcher.group(1).length();
                StringBuilder sb = new StringBuilder();
                sb.append(C10375.m26177(length3, "/"));
                sb.append(" ");
                strM46305 = C20087.m46305(length3, strM46305, sb);
            }
            if (strM46305.startsWith("// MOE:")) {
                arrayList2.add(strM46305);
            } else {
                while (strM46305.length() + i > 100) {
                    int i4 = 100 - i;
                    while (i4 >= 2 && !AbstractC11581.m28473().mo13300(strM46305.charAt(i4))) {
                        i4--;
                    }
                    if (i4 <= 2) {
                        break;
                    }
                    arrayList2.add(strM46305.substring(0, i4));
                    strM46305 = C20087.m46305(i4, strM46305, new StringBuilder("//"));
                }
                arrayList2.add(strM46305);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((String) arrayList2.get(0)).trim());
        String strM26177 = C10375.m26177(i, " ");
        for (i2 = 1; i2 < arrayList2.size(); i2++) {
            sb2.append(this.f1059);
            sb2.append(strM26177);
            sb2.append(((String) arrayList2.get(i2)).trim());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1078(C0096 c0096, ArrayList arrayList, int i) {
        String str = c0096.f1059;
        Iterator it = arrayList.iterator();
        int i2 = 1;
        if (it.hasNext()) {
            String strTrim = ((String) it.next()).trim();
            if (!strTrim.startsWith("/**")) {
                if (strTrim.startsWith("/*")) {
                    while (true) {
                        if (it.hasNext()) {
                            if (!((String) it.next()).trim().startsWith("*")) {
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(((String) arrayList.get(0)).trim());
            String strM26177 = C10375.m26177(i + 1, " ");
            while (i2 < arrayList.size()) {
                sb.append(str);
                sb.append(strM26177);
                String strTrim2 = ((String) arrayList.get(i2)).trim();
                if (!strTrim2.startsWith("*")) {
                    sb.append("* ");
                }
                sb.append(strTrim2);
                i2++;
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = -1;
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            int iMo25530 = AbstractC11581.m28473().mo13299().mo25530((CharSequence) arrayList.get(i4));
            if (iMo25530 >= 0 && (i3 == -1 || iMo25530 < i3)) {
                i3 = iMo25530;
            }
        }
        sb2.append((String) arrayList.get(0));
        while (i2 < arrayList.size()) {
            sb2.append(str);
            sb2.append(C10375.m26177(i, " "));
            if (((String) arrayList.get(i2)).length() >= i3) {
                sb2.append(((String) arrayList.get(i2)).substring(i3));
            } else {
                sb2.append((String) arrayList.get(i2));
            }
            i2++;
        }
        return sb2.toString();
    }
}
