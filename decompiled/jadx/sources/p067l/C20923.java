package p067l;

import java.text.StringCharacterIterator;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20923 {

    /* JADX INFO: renamed from: ֫ */
    public String f65711;

    /* JADX INFO: renamed from: ۧ */
    public String f65712;

    /* JADX INFO: renamed from: ֫ */
    public final String m47226(String str) throws C17568 {
        if (!str.equals(this.f65712) || this.f65711 == null) {
            int i = 1;
            while (true) {
                if (i >= str.length()) {
                    i = -1;
                    break;
                }
                char cCharAt = str.charAt(i);
                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != ':' && cCharAt != '.' && cCharAt != '-' && cCharAt != '_') {
                    break;
                }
                i++;
            }
            if (str.length() > 2 && i > 1) {
                this.f65712 = str;
                this.f65711 = str.substring(1, i);
            } else {
                throw new C17568("No element name for the tag:\n\t".concat(str));
            }
        }
        return this.f65711;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0149 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final C4829 m47227(String str) throws C17568 {
        C4829 c4829 = new C4829();
        c4829.m10241(m47226(str));
        ArrayList arrayList = new ArrayList();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str.substring(m47226(str).length() + 2));
        C20252 c20252 = new C20252();
        c20252.m45751();
        char cFirst = stringCharacterIterator.first();
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        char c = '\"';
        while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
            if (cFirst == '\"' || cFirst == '\'') {
                if (c20252.m45749()) {
                    c20252.m45743();
                    sb2 = new StringBuilder(1024);
                    c = cFirst;
                } else if (c20252.m45747() && c == cFirst) {
                    arrayList.add(new C10864(sb.toString(), sb2.toString(), c));
                    c20252.m45751();
                } else {
                    if (!c20252.m45747() || c == cFirst) {
                        throw new C17568("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                    }
                    sb2.append(cFirst);
                }
            } else if (cFirst == '/') {
                if (c20252.m45747()) {
                    sb2.append(cFirst);
                } else if (c20252.m45745()) {
                    c20252.m45744();
                } else if (c20252.m45748()) {
                    throw new C17568("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
            } else if (cFirst != '=') {
                if (cFirst != '>') {
                    if (c20252.m45747()) {
                        sb2.append(cFirst);
                    } else if (c20252.m45748()) {
                        if (!Character.isWhitespace(cFirst)) {
                            throw new C17568("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                        }
                    } else if (!Character.isWhitespace(cFirst)) {
                        if (c20252.m45745()) {
                            c20252.m45746();
                            sb = new StringBuilder(255);
                            sb.append(cFirst);
                        } else if (c20252.m45742()) {
                            sb.append(cFirst);
                        }
                    }
                } else if (c20252.m45747()) {
                    sb2.append(cFirst);
                } else if (c20252.m45745()) {
                    c20252.m45744();
                } else if (c20252.m45748()) {
                    throw new C17568("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
            } else if (c20252.m45747()) {
                sb2.append(cFirst);
            } else {
                if (!c20252.m45742()) {
                    throw new C17568("Unexpected '" + cFirst + "' when parsing:\n\t" + str);
                }
                c20252.m45750();
            }
            cFirst = stringCharacterIterator.next();
        }
        if (!c20252.m45748()) {
            throw new C17568("Element did not complete normally.");
        }
        c4829.m10242(arrayList);
        c4829.m10243(str.charAt(str.lastIndexOf(62) - 1) == '/');
        return c4829;
    }
}
