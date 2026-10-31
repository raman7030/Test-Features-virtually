package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19436 extends AbstractC12669 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0384 f62869;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f62871 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f62872 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f62870 = new LinkedHashMap();

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo12688(C0779 c0779, Object obj) {
        m44777(c0779);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        return (Void) c5138.f16077.mo2962(this, (Object) null);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 abstractC4308M1868 = this.f62869.m1868(c8541);
        if (abstractC4308M1868.m12913(EnumC9454.UNDETVAR)) {
            m44777((C0779) abstractC4308M1868);
        }
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        return (Void) c19831.f64066.mo2962(this, (Object) null);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        c19955.mo4958().mo2962(this, (Object) null);
        Iterator it = c19955.mo12938().iterator();
        while (it.hasNext()) {
            ((AbstractC4308) it.next()).mo2962(this, (Object) null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44777(C0779 c0779) {
        EnumC19125[] enumC19125Arr;
        int i;
        Iterator it;
        ?? M8244;
        C0779 c07710 = c0779;
        AbstractC4308 abstractC4308 = c07710.f14167;
        if (this.f62872.add(abstractC4308)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singleton(abstractC4308));
            LinkedHashMap linkedHashMap = this.f62870;
            Set set = (Set) C13843.getOrDefault(linkedHashMap, abstractC4308, linkedHashSet);
            EnumC19125[] enumC19125ArrValues = EnumC19125.values();
            int length = enumC19125ArrValues.length;
            char c = 0;
            int i2 = 0;
            while (i2 < length) {
                EnumC19125 enumC19125 = enumC19125ArrValues[i2];
                EnumC19125[] enumC19125Arr2 = new EnumC19125[1];
                enumC19125Arr2[c] = enumC19125;
                Iterator it2 = c07710.m2963(enumC19125Arr2).iterator();
                while (it2.hasNext()) {
                    AbstractC4308 abstractC4309 = (AbstractC4308) it2.next();
                    C0384 c0384 = this.f62869;
                    AbstractC4308 abstractC4308M1868 = c0384.m1868(abstractC4309);
                    if (abstractC4308M1868.m12913(EnumC9454.UNDETVAR)) {
                        C0779 c07711 = (C0779) c0384.m1868(abstractC4309);
                        EnumC19125[] enumC19125ArrValues2 = EnumC19125.values();
                        int length2 = enumC19125ArrValues2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                enumC19125Arr = enumC19125ArrValues;
                                i = length;
                                it = it2;
                                set.add(abstractC4309);
                                this.f62871.add(abstractC4309);
                                break;
                            }
                            enumC19125Arr = enumC19125ArrValues;
                            EnumC19125 enumC19126 = enumC19125ArrValues2[i3];
                            i = length;
                            int i4 = 1;
                            it = it2;
                            C2609 c2609M2963 = c07710.m2963(enumC19126);
                            if (enumC19126 == enumC19125) {
                                M8244 = c2609M2963;
                                i4 = 1;
                                M8244 = c2609M2963.m8244(C2609.of((Object) abstractC4309));
                            }
                            M8244 = c2609M2963;
                            EnumC19125[] enumC19125Arr3 = new EnumC19125[i4];
                            enumC19125Arr3[0] = enumC19126;
                            C2609 c2609M2964 = c07711.m2963(enumC19125Arr3);
                            ?? M8245 = c2609M2964;
                            if (enumC19126 == enumC19125.mo7226()) {
                                M8245 = c2609M2964.m8244(C2609.of((Object) abstractC4308));
                            }
                            if (!M8244.containsAll(M8245) || !M8245.containsAll(M8244)) {
                                abstractC4308M1868.mo2962(this, (Object) null);
                                break;
                            }
                            i3++;
                            c07710 = c0779;
                            enumC19125ArrValues = enumC19125Arr;
                            length = i;
                            it2 = it;
                        }
                    } else {
                        abstractC4308M1868.mo2962(this, (Object) null);
                        enumC19125Arr = enumC19125ArrValues;
                        i = length;
                        it = it2;
                    }
                    c07710 = c0779;
                    enumC19125ArrValues = enumC19125Arr;
                    length = i;
                    it2 = it;
                }
                i2++;
                c = 0;
                c07710 = c0779;
            }
            linkedHashMap.put(abstractC4308, set);
        }
    }

    public C19436(C0384 c0384) {
        this.f62869 = c0384;
    }
}
