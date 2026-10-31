package l;

import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M37V */
/* JADX INFO: loaded from: classes4.dex */
public final class C11049 extends C1876 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f33222;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC8932 f33223;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f33224;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 m27434(C10242 c10242) {
        String strM25965;
        ArrayList arrayList;
        AbstractC8932 c18104;
        AbstractC8932 abstractC8932M27433;
        ArrayList arrayList2;
        if (this.f33223 == null) {
            if (c10242 == null) {
                strM25965 = this.f6385;
            } else {
                strM25965 = c10242.m25965(this.f6386, new C23853(2, this));
            }
            this.f33222 = strM25965;
            this.f33224 = 0;
            ArrayList arrayList3 = null;
            if (strM25965.charAt(0) == '<') {
                this.f33224++;
                arrayList = new ArrayList();
                while (this.f33222.charAt(this.f33224) != '>') {
                    int iIndexOf = this.f33222.indexOf(":", this.f33224);
                    String strSubstring = this.f33222.substring(this.f33224, iIndexOf);
                    int i = iIndexOf + 1;
                    this.f33224 = i;
                    if (this.f33222.charAt(i) != ':') {
                        abstractC8932M27433 = m27433();
                        arrayList2 = null;
                    } else {
                        abstractC8932M27433 = null;
                        arrayList2 = null;
                    }
                    while (this.f33222.charAt(this.f33224) == ':') {
                        this.f33224++;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(m27433());
                    }
                    arrayList.add(new C6815(strSubstring, abstractC8932M27433, arrayList2));
                }
                this.f33224++;
            } else {
                arrayList = null;
            }
            if (strM25965.charAt(this.f33224) == '(') {
                ArrayList arrayListM27432 = m27432(')');
                AbstractC8932 abstractC8932M27434 = m27433();
                while (this.f33224 < strM25965.length() && strM25965.charAt(this.f33224) == '^') {
                    this.f33224++;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(m27433());
                }
                c18104 = new C14575(arrayList, arrayListM27432, abstractC8932M27434, arrayList3);
            } else {
                AbstractC8932 abstractC8932M27435 = m27433();
                if (arrayList == null && this.f33224 == strM25965.length()) {
                    c18104 = abstractC8932M27435;
                } else {
                    while (this.f33224 < strM25965.length()) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(m27433());
                    }
                    c18104 = new C18104(arrayList, abstractC8932M27435, arrayList3);
                }
            }
            this.f33223 = c18104;
        }
        return this.f33223;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC8932 m27433() {
        char cCharAt;
        char cCharAt2 = this.f33222.charAt(this.f33224);
        if (cCharAt2 == '*') {
            this.f33224++;
            return new C9638(EnumC20927.UNBOUNDED, null);
        }
        if (cCharAt2 == '+') {
            this.f33224++;
            return new C9638(EnumC20927.EXTENDS, m27433());
        }
        if (cCharAt2 == '-') {
            this.f33224++;
            return new C9638(EnumC20927.SUPER, m27433());
        }
        if (cCharAt2 == 'F') {
            this.f33224++;
            return new C23748(ClassTransform.FLOAT);
        }
        if (cCharAt2 == 'L') {
            this.f33224++;
            StringBuilder sb = new StringBuilder();
            C17398 c17398 = null;
            ArrayList arrayListM27432 = null;
            do {
                cCharAt = this.f33222.charAt(this.f33224);
                if (cCharAt == '.' || cCharAt == ';') {
                    this.f33224++;
                    C17398 c17399 = new C17398(c17398, sb.toString(), arrayListM27432);
                    sb.setLength(0);
                    arrayListM27432 = null;
                    c17398 = c17399;
                } else if (cCharAt == '<') {
                    arrayListM27432 = m27432('>');
                } else {
                    this.f33224++;
                    sb.append(cCharAt);
                }
            } while (cCharAt != ';');
            return c17398;
        }
        if (cCharAt2 == 'V') {
            this.f33224++;
            return new C23748(ClassTransform.VOID);
        }
        if (cCharAt2 == 'I') {
            this.f33224++;
            return new C23748(ClassTransform.INTEGER);
        }
        if (cCharAt2 == 'J') {
            this.f33224++;
            return new C23748(ClassTransform.LONG);
        }
        if (cCharAt2 == 'S') {
            this.f33224++;
            return new C23748(ClassTransform.SHORT);
        }
        if (cCharAt2 == 'T') {
            int i = this.f33224 + 1;
            this.f33224 = i;
            int iIndexOf = this.f33222.indexOf(59, i);
            C23748 c23748 = new C23748(this.f33222.substring(this.f33224, iIndexOf));
            this.f33224 = iIndexOf + 1;
            return c23748;
        }
        if (cCharAt2 == 'Z') {
            this.f33224++;
            return new C23748(ClassTransform.BOOLEAN);
        }
        if (cCharAt2 != '[') {
            switch (cCharAt2) {
                case 'B':
                    this.f33224++;
                    return new C23748(ClassTransform.BYTE);
                case 'C':
                    this.f33224++;
                    return new C23748(ClassTransform.CHARACTER);
                case 'D':
                    this.f33224++;
                    return new C23748(ClassTransform.DOUBLE);
                default:
                    throw new IllegalStateException(this.f33222.substring(0, this.f33224) + "!" + this.f33222.charAt(this.f33224) + "!" + this.f33222.substring(this.f33224 + 1));
            }
        }
        this.f33224++;
        return new C16692(m27433());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m27432(char c) {
        this.f33224++;
        ArrayList arrayList = new ArrayList();
        while (this.f33222.charAt(this.f33224) != c) {
            arrayList.add(m27433());
        }
        this.f33224++;
        return arrayList;
    }
}
