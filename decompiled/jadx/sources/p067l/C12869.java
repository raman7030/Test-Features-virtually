package p067l;

import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M37V */
/* JADX INFO: loaded from: classes4.dex */
public final class C12869 extends C4151 {

    /* JADX INFO: renamed from: ܽ */
    public String f36223;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC10857 f36224;

    /* JADX INFO: renamed from: ᩳ */
    public int f36225;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10857 m29496(C12102 c12102) {
        String strM27987;
        ArrayList arrayList;
        AbstractC10857 c19574;
        AbstractC10857 abstractC10857M29495;
        ArrayList arrayList2;
        if (this.f36224 == null) {
            if (c12102 == null) {
                strM27987 = this.f9167;
            } else {
                strM27987 = c12102.m27987(this.f9168, new C25038(2, this));
            }
            this.f36223 = strM27987;
            this.f36225 = 0;
            ArrayList arrayList3 = null;
            if (strM27987.charAt(0) == '<') {
                this.f36225++;
                arrayList = new ArrayList();
                while (this.f36223.charAt(this.f36225) != '>') {
                    int iIndexOf = this.f36223.indexOf(":", this.f36225);
                    String strSubstring = this.f36223.substring(this.f36225, iIndexOf);
                    int i = iIndexOf + 1;
                    this.f36225 = i;
                    if (this.f36223.charAt(i) != ':') {
                        abstractC10857M29495 = m29495();
                        arrayList2 = null;
                    } else {
                        abstractC10857M29495 = null;
                        arrayList2 = null;
                    }
                    while (this.f36223.charAt(this.f36225) == ':') {
                        this.f36225++;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(m29495());
                    }
                    arrayList.add(new C8845(strSubstring, abstractC10857M29495, arrayList2));
                }
                this.f36225++;
            } else {
                arrayList = null;
            }
            if (strM27987.charAt(this.f36225) == '(') {
                ArrayList arrayListM29494 = m29494(')');
                AbstractC10857 abstractC10857M29496 = m29495();
                while (this.f36225 < strM27987.length() && strM27987.charAt(this.f36225) == '^') {
                    this.f36225++;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(m29495());
                }
                c19574 = new C16220(arrayList, arrayListM29494, abstractC10857M29496, arrayList3);
            } else {
                AbstractC10857 abstractC10857M29497 = m29495();
                if (arrayList == null && this.f36225 == strM27987.length()) {
                    c19574 = abstractC10857M29497;
                } else {
                    while (this.f36225 < strM27987.length()) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(m29495());
                    }
                    c19574 = new C19574(arrayList, abstractC10857M29497, arrayList3);
                }
            }
            this.f36224 = c19574;
        }
        return this.f36224;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC10857 m29495() {
        char cCharAt;
        char cCharAt2 = this.f36223.charAt(this.f36225);
        if (cCharAt2 == '*') {
            this.f36225++;
            return new C11528(EnumC22257.UNBOUNDED, null);
        }
        if (cCharAt2 == '+') {
            this.f36225++;
            return new C11528(EnumC22257.EXTENDS, m29495());
        }
        if (cCharAt2 == '-') {
            this.f36225++;
            return new C11528(EnumC22257.SUPER, m29495());
        }
        if (cCharAt2 == 'F') {
            this.f36225++;
            return new C24938(ClassTransform.FLOAT);
        }
        if (cCharAt2 == 'L') {
            this.f36225++;
            StringBuilder sb = new StringBuilder();
            C18903 c18903 = null;
            ArrayList arrayListM29494 = null;
            do {
                cCharAt = this.f36223.charAt(this.f36225);
                if (cCharAt == '.' || cCharAt == ';') {
                    this.f36225++;
                    C18903 c18904 = new C18903(c18903, sb.toString(), arrayListM29494);
                    sb.setLength(0);
                    arrayListM29494 = null;
                    c18903 = c18904;
                } else if (cCharAt == '<') {
                    arrayListM29494 = m29494('>');
                } else {
                    this.f36225++;
                    sb.append(cCharAt);
                }
            } while (cCharAt != ';');
            return c18903;
        }
        if (cCharAt2 == 'V') {
            this.f36225++;
            return new C24938(ClassTransform.VOID);
        }
        if (cCharAt2 == 'I') {
            this.f36225++;
            return new C24938(ClassTransform.INTEGER);
        }
        if (cCharAt2 == 'J') {
            this.f36225++;
            return new C24938(ClassTransform.LONG);
        }
        if (cCharAt2 == 'S') {
            this.f36225++;
            return new C24938(ClassTransform.SHORT);
        }
        if (cCharAt2 == 'T') {
            int i = this.f36225 + 1;
            this.f36225 = i;
            int iIndexOf = this.f36223.indexOf(59, i);
            C24938 c24938 = new C24938(this.f36223.substring(this.f36225, iIndexOf));
            this.f36225 = iIndexOf + 1;
            return c24938;
        }
        if (cCharAt2 == 'Z') {
            this.f36225++;
            return new C24938(ClassTransform.BOOLEAN);
        }
        if (cCharAt2 != '[') {
            switch (cCharAt2) {
                case 'B':
                    this.f36225++;
                    return new C24938(ClassTransform.BYTE);
                case 'C':
                    this.f36225++;
                    return new C24938(ClassTransform.CHARACTER);
                case 'D':
                    this.f36225++;
                    return new C24938(ClassTransform.DOUBLE);
                default:
                    throw new IllegalStateException(this.f36223.substring(0, this.f36225) + "!" + this.f36223.charAt(this.f36225) + "!" + this.f36223.substring(this.f36225 + 1));
            }
        }
        this.f36225++;
        return new C18232(m29495());
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m29494(char c) {
        this.f36225++;
        ArrayList arrayList = new ArrayList();
        while (this.f36223.charAt(this.f36225) != c) {
            arrayList.add(m29495());
        }
        this.f36225++;
        return arrayList;
    }
}
