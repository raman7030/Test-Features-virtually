package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10970 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C21505 f30384 = new C21505();

    /* JADX INFO: renamed from: ܽ */
    public final C20539 f30387 = C20539.m46358(new C11641[16]);

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f30386 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f30385 = new HashMap();

    static {
        for (int i = 0; i < 128; i++) {
            if ((48 > i || i > 57) && ((65 > i || i > 90) && ((97 > i || i > 122) && i != 36 && i != 95 && i != 45))) {
                f30384.mo11023((char) i);
            }
        }
        for (int i2 = 0; i2 < 78; i2++) {
            f30384.mo11023("（）［］｛｝〈〉《》「」『』【】〔〕〖〗〘〙「」『』“”‘’。！？，、；：…—－·～｜＼／＊＃＆％＠＋－＝＜＞� \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a\u200b\u200c\u200d\u2028\u2029 \u205f\u3000\ufeff".charAt(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m25325(CharSequence charSequence) {
        C20539 c20539 = this.f30387;
        c20539.clear();
        HashSet hashSet = this.f30386;
        hashSet.clear();
        HashMap map = this.f30385;
        map.clear();
        c20539.addAll(m25318(0, charSequence.length(), charSequence));
        InterfaceC12631 interfaceC12631ListIterator = c20539.listIterator(0);
        while (interfaceC12631ListIterator.hasNext()) {
            C11641 c11641 = (C11641) interfaceC12631ListIterator.next();
            ((C22370) C15525.computeIfAbsent(map, c11641, new C8958())).f70590++;
            if (c11641.m26751()) {
                hashSet.add(c11641);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m25324(int i, int i2, int i3, CharSequence charSequence) {
        int iMin;
        int i4;
        int i5;
        int iM25319 = m25319(i, charSequence);
        int iM25316 = m25316(i + i3, charSequence);
        int i6 = i + i2;
        C20539 c20539 = this.f30387;
        C11641[] c11641Arr = (C11641[]) c20539.m46362();
        int size = c20539.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = size;
        while (i8 < i9) {
            int iM21912 = C9417.m21912(i9, i8, 2, i8);
            if (c11641Arr[iM21912].f32483 < iM25319) {
                i8 = iM21912 + 1;
            } else {
                i9 = iM21912;
            }
        }
        if (i8 >= size) {
            i8 = -(size + 1);
        } else if (c11641Arr[i8].f32483 > i6) {
            i8 = -(i8 + 1);
        }
        HashSet<C11641> hashSet = new HashSet();
        HashMap map = this.f30385;
        if (i8 >= 0) {
            C11641[] c11641Arr2 = (C11641[]) c20539.m46362();
            int size2 = c20539.size();
            int i10 = i8;
            while (i10 < size2) {
                C11641 c11641 = c11641Arr2[i10];
                C11641[] c11641Arr3 = c11641Arr2;
                if (c11641.f32483 > i6) {
                    break;
                }
                int i11 = i7 + 1;
                if (c11641.m26751()) {
                    hashSet.add(c11641);
                }
                C22370 c22370 = (C22370) map.get(c11641);
                if (c22370 != null) {
                    i4 = i6;
                    int i12 = c22370.f70590;
                    i5 = i11;
                    if (i12 <= 1) {
                        map.remove(c11641);
                    } else {
                        c22370.f70590 = i12 - 1;
                    }
                } else {
                    i4 = i6;
                    i5 = i11;
                }
                i10++;
                c11641Arr2 = c11641Arr3;
                i6 = i4;
                i7 = i5;
            }
            if (i7 > 0) {
                c20539.mo7734(i8, i7 + i8);
            }
        }
        if (i8 < 0) {
            i8 = (-i8) - 1;
        }
        if (i2 != i3) {
            int i13 = i3 - i2;
            C11641[] c11641Arr4 = (C11641[]) c20539.m46362();
            int size3 = c20539.size();
            for (int i14 = i8; i14 < size3; i14++) {
                c11641Arr4[i14].m26750(i13);
            }
        }
        int length = charSequence.length();
        HashSet hashSet2 = this.f30386;
        if (iM25319 < length && iM25319 < (iMin = Math.min(iM25316, charSequence.length()))) {
            ArrayList<C11641> arrayListM25318 = m25318(iM25319, iMin, charSequence);
            c20539.addAll(i8, arrayListM25318);
            for (C11641 c11642 : arrayListM25318) {
                C22370 c22371 = (C22370) C15525.computeIfAbsent(map, c11642, new C8958());
                int i15 = c22371.f70590 + 1;
                c22371.f70590 = i15;
                if (c11642.m26751() && i15 == 1 && !hashSet.remove(c11642)) {
                    hashSet2.add(c11642);
                }
            }
        }
        for (C11641 c11643 : hashSet) {
            if (!map.containsKey(c11643)) {
                hashSet2.remove(c11643);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m25320(int i, CharSequence charSequence) {
        int iM25319 = m25319(i, charSequence);
        return i - iM25319 > 100 ? "" : charSequence.subSequence(iM25319, i).toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m25321(int i, CharSequence charSequence) {
        int iM25316 = m25316(i, charSequence);
        return iM25316 - i > 100 ? "" : charSequence.subSequence(i, iM25316).toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25317(InterfaceC9768 interfaceC9768, int i) {
        return m25316(i, interfaceC9768);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m25319(int i, CharSequence charSequence) {
        if (i <= 0) {
            return 0;
        }
        do {
            i--;
            if (i < 0) {
                return 0;
            }
        } while (!f30384.mo11024(charSequence.charAt(i)));
        return i + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25316(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return charSequence.length();
        }
        while (i < charSequence.length()) {
            if (f30384.mo11024(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m25318(int i, int i2, CharSequence charSequence) {
        C21505 c21505;
        ArrayList arrayList = new ArrayList(Math.max(1, (i2 - i) / 5));
        if (charSequence != null && i < i2) {
            while (i < i2) {
                while (true) {
                    c21505 = f30384;
                    if (i >= i2 || !c21505.mo11024(charSequence.charAt(i))) {
                        break;
                    }
                    i++;
                }
                if (i >= i2) {
                    break;
                }
                int i3 = i;
                while (i3 < i2 && !c21505.mo11024(charSequence.charAt(i3))) {
                    i3++;
                }
                arrayList.add(new C11641(charSequence.subSequence(i, i3).toString(), i, i3));
                i = i3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19157 m25323() {
        return C7480.parallelStream(this.f30386);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25322(C11641 c11641) {
        C22370 c22370 = (C22370) this.f30385.get(c11641);
        if (c22370 != null) {
            return c22370.f70590;
        }
        return 0;
    }
}
