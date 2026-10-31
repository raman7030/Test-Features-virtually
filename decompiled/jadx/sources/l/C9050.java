package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9050 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C20135 f27447 = new C20135();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19119 f27450 = C19119.m44064(new C9756[16]);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f27449 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f27448 = new HashMap();

    static {
        for (int i = 0; i < 128; i++) {
            if ((48 > i || i > 57) && ((65 > i || i > 90) && ((97 > i || i > 122) && i != 36 && i != 95 && i != 45))) {
                f27447.mo8955((char) i);
            }
        }
        for (int i2 = 0; i2 < 78; i2++) {
            f27447.mo8955("（）［］｛｝〈〉《》「」『』【】〔〕〖〗〘〙「」『』“”‘’。！？，、；：…—－·～｜＼／＊＃＆％＠＋－＝＜＞� \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a\u200b\u200c\u200d\u2028\u2029 \u205f\u3000\ufeff".charAt(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23380(CharSequence charSequence) {
        C19119 c19119 = this.f27450;
        c19119.clear();
        HashSet hashSet = this.f27449;
        hashSet.clear();
        HashMap map = this.f27448;
        map.clear();
        c19119.addAll(m23373(0, charSequence.length(), charSequence));
        InterfaceC10798 interfaceC10798ListIterator = c19119.listIterator(0);
        while (interfaceC10798ListIterator.hasNext()) {
            C9756 c9756 = (C9756) interfaceC10798ListIterator.next();
            ((C21045) C13843.computeIfAbsent(map, c9756, new C6933())).f67905++;
            if (c9756.m24737()) {
                hashSet.add(c9756);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23379(int i, int i2, int i3, CharSequence charSequence) {
        int iMin;
        int i4;
        int i5;
        int iM23374 = m23374(i, charSequence);
        int iM23371 = m23371(i + i3, charSequence);
        int i6 = i + i2;
        C19119 c19119 = this.f27450;
        C9756[] c9756Arr = (C9756[]) c19119.m44068();
        int size = c19119.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = size;
        while (i8 < i9) {
            int iM19938 = C7416.m19938(i9, i8, 2, i8);
            if (c9756Arr[iM19938].f29532 < iM23374) {
                i8 = iM19938 + 1;
            } else {
                i9 = iM19938;
            }
        }
        if (i8 >= size) {
            i8 = -(size + 1);
        } else if (c9756Arr[i8].f29532 > i6) {
            i8 = -(i8 + 1);
        }
        HashSet<C9756> hashSet = new HashSet();
        HashMap map = this.f27448;
        if (i8 >= 0) {
            C9756[] c9756Arr2 = (C9756[]) c19119.m44068();
            int size2 = c19119.size();
            int i10 = i8;
            while (i10 < size2) {
                C9756 c9756 = c9756Arr2[i10];
                C9756[] c9756Arr3 = c9756Arr2;
                if (c9756.f29532 > i6) {
                    break;
                }
                int i11 = i7 + 1;
                if (c9756.m24737()) {
                    hashSet.add(c9756);
                }
                C21045 c21045 = (C21045) map.get(c9756);
                if (c21045 != null) {
                    i4 = i6;
                    int i12 = c21045.f67905;
                    i5 = i11;
                    if (i12 <= 1) {
                        map.remove(c9756);
                    } else {
                        c21045.f67905 = i12 - 1;
                    }
                } else {
                    i4 = i6;
                    i5 = i11;
                }
                i10++;
                c9756Arr2 = c9756Arr3;
                i6 = i4;
                i7 = i5;
            }
            if (i7 > 0) {
                c19119.mo5504(i8, i7 + i8);
            }
        }
        if (i8 < 0) {
            i8 = (-i8) - 1;
        }
        if (i2 != i3) {
            int i13 = i3 - i2;
            C9756[] c9756Arr4 = (C9756[]) c19119.m44068();
            int size3 = c19119.size();
            for (int i14 = i8; i14 < size3; i14++) {
                c9756Arr4[i14].m24736(i13);
            }
        }
        int length = charSequence.length();
        HashSet hashSet2 = this.f27449;
        if (iM23374 < length && iM23374 < (iMin = Math.min(iM23371, charSequence.length()))) {
            ArrayList<C9756> arrayListM23373 = m23373(iM23374, iMin, charSequence);
            c19119.addAll(i8, arrayListM23373);
            for (C9756 c9757 : arrayListM23373) {
                C21045 c21046 = (C21045) C13843.computeIfAbsent(map, c9757, new C6933());
                int i15 = c21046.f67905 + 1;
                c21046.f67905 = i15;
                if (c9757.m24737() && i15 == 1 && !hashSet.remove(c9757)) {
                    hashSet2.add(c9757);
                }
            }
        }
        for (C9756 c9758 : hashSet) {
            if (!map.containsKey(c9758)) {
                hashSet2.remove(c9758);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23375(int i, CharSequence charSequence) {
        int iM23374 = m23374(i, charSequence);
        return i - iM23374 > 100 ? "" : charSequence.subSequence(iM23374, i).toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m23376(int i, CharSequence charSequence) {
        int iM23371 = m23371(i, charSequence);
        return iM23371 - i > 100 ? "" : charSequence.subSequence(i, iM23371).toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23372(InterfaceC7785 interfaceC7785, int i) {
        return m23371(i, interfaceC7785);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m23374(int i, CharSequence charSequence) {
        if (i <= 0) {
            return 0;
        }
        do {
            i--;
            if (i < 0) {
                return 0;
            }
        } while (!f27447.mo8956(charSequence.charAt(i)));
        return i + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23371(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return charSequence.length();
        }
        while (i < charSequence.length()) {
            if (f27447.mo8956(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23373(int i, int i2, CharSequence charSequence) {
        C20135 c20135;
        ArrayList arrayList = new ArrayList(Math.max(1, (i2 - i) / 5));
        if (charSequence != null && i < i2) {
            while (i < i2) {
                while (true) {
                    c20135 = f27447;
                    if (i >= i2 || !c20135.mo8956(charSequence.charAt(i))) {
                        break;
                    }
                    i++;
                }
                if (i >= i2) {
                    break;
                }
                int i3 = i;
                while (i3 < i2 && !c20135.mo8956(charSequence.charAt(i3))) {
                    i3++;
                }
                arrayList.add(new C9756(charSequence.subSequence(i, i3).toString(), i, i3));
                i = i3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17664 m23378() {
        return C5378.parallelStream(this.f27449);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23377(C9756 c9756) {
        C21045 c21045 = (C21045) this.f27448.get(c9756);
        if (c21045 != null) {
            return c21045.f67905;
        }
        return 0;
    }
}
