package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7NK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2459 implements InterfaceC12685 {

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f3832 = Pattern.compile("^(//+)(?!noinspection|\\$NON-NLS-\\d+\\$)[^\\s/]");

    /* JADX INFO: renamed from: ۧ */
    public final String f3833;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC9836 f3834;

    public C2459(String str, AbstractC9836 abstractC9836) {
        this.f3833 = str;
        this.f3834 = abstractC9836;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m3475(InterfaceC16706 interfaceC16706, final int i) {
        int i2;
        String string;
        if (!interfaceC16706.mo37858()) {
            return interfaceC16706.mo37859();
        }
        String strMo37859 = interfaceC16706.mo37859();
        if (interfaceC16706.mo37855() && this.f3834.mo23022()) {
            strMo37859 = C18294.m41669(i, strMo37859);
        }
        final ArrayList<String> arrayList = new ArrayList();
        Iterator itM33622 = C14695.m33622(strMo37859);
        while (true) {
            int i3 = 0;
            if (!itM33622.hasNext()) {
                break;
            }
            if (interfaceC16706.mo37854()) {
                AbstractC13375 abstractC13375M30519 = AbstractC13375.m30519();
                CharSequence charSequence = (CharSequence) itM33622.next();
                abstractC13375M30519.getClass();
                int length = charSequence.length();
                while (i3 < length && abstractC13375M30519.mo15183(charSequence.charAt(i3))) {
                    i3++;
                }
                do {
                    length--;
                    if (length <= i3) {
                        break;
                    }
                } while (abstractC13375M30519.mo15183(charSequence.charAt(length)));
                arrayList.add(charSequence.subSequence(i3, length + 1).toString());
            } else {
                AbstractC13375 abstractC13375M305110 = AbstractC13375.m30519();
                CharSequence charSequence2 = (CharSequence) itM33622.next();
                abstractC13375M305110.getClass();
                int length2 = charSequence2.length() - 1;
                while (true) {
                    if (length2 < 0) {
                        string = "";
                        break;
                    }
                    if (!abstractC13375M305110.mo15183(charSequence2.charAt(length2))) {
                        string = charSequence2.subSequence(0, length2 + 1).toString();
                        break;
                    }
                    length2--;
                }
                arrayList.add(string);
            }
        }
        if (!interfaceC16706.mo37854()) {
            return (String) C3967.m7911(interfaceC16706).orElseGet(new Supplier() { // from class: l.᩵֫ۖ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C2459.m3474(this.f63577, arrayList, i);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        for (String strM48621 : arrayList) {
            Matcher matcher = f3832.matcher(strM48621);
            if (matcher.find()) {
                int length3 = matcher.group(1).length();
                StringBuilder sb = new StringBuilder();
                sb.append(C12229.m28206(length3, "/"));
                sb.append(" ");
                strM48621 = C21459.m48621(length3, strM48621, sb);
            }
            if (strM48621.startsWith("// MOE:")) {
                arrayList2.add(strM48621);
            } else {
                while (strM48621.length() + i > 100) {
                    int i4 = 100 - i;
                    while (i4 >= 2 && !AbstractC13375.m30519().mo15183(strM48621.charAt(i4))) {
                        i4--;
                    }
                    if (i4 <= 2) {
                        break;
                    }
                    arrayList2.add(strM48621.substring(0, i4));
                    strM48621 = C21459.m48621(i4, strM48621, new StringBuilder("//"));
                }
                arrayList2.add(strM48621);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((String) arrayList2.get(0)).trim());
        String strM28206 = C12229.m28206(i, " ");
        for (i2 = 1; i2 < arrayList2.size(); i2++) {
            sb2.append(this.f3833);
            sb2.append(strM28206);
            sb2.append(((String) arrayList2.get(i2)).trim());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m3474(C2459 c2459, ArrayList arrayList, int i) {
        String str = c2459.f3833;
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
            String strM28206 = C12229.m28206(i + 1, " ");
            while (i2 < arrayList.size()) {
                sb.append(str);
                sb.append(strM28206);
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
            int iMo27549 = AbstractC13375.m30519().mo15182().mo27549((CharSequence) arrayList.get(i4));
            if (iMo27549 >= 0 && (i3 == -1 || iMo27549 < i3)) {
                i3 = iMo27549;
            }
        }
        sb2.append((String) arrayList.get(0));
        while (i2 < arrayList.size()) {
            sb2.append(str);
            sb2.append(C12229.m28206(i, " "));
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
