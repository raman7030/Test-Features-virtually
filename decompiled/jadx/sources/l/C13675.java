package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13675 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19854 f40818;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18711 f40819;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C5210 f40816 = C5210.f16320;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C20733 f40815 = C20733.m47335();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40821 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f40823 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f40820 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f40817 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40822 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32897(InterfaceC12265 interfaceC12265) {
        if (interfaceC12265 instanceof C10149) {
            this.f40817++;
        } else if (interfaceC12265 instanceof EnumC7510) {
            int i = this.f40817 - 1;
            this.f40817 = i;
            if (i < 0) {
                throw new AssertionError();
            }
        }
        this.f40821.add(interfaceC12265);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32895(List list) {
        AbstractC4628 abstractC4628ListIterator = ((AbstractC14545) list).listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            m32897((InterfaceC12265) abstractC4628ListIterator.next());
        }
    }

    public C13675(C19854 c19854, C18711 c18711) {
        this.f40818 = c19854;
        this.f40819 = c18711;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22143 m32902() {
        return this.f40818;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m32915() {
        return this.f40817;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32893(int i) {
        if (this.f40817 != i) {
            throw new C0270(m32891(String.format("saw %d unclosed ops", Integer.valueOf(this.f40817))));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19322 m32891(String str) {
        int i = this.f40820;
        C19854 c19854 = this.f40818;
        return C19322.m44518(c19854.m45666(i), c19854.m45662(i), str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32913(int i) {
        if (i > this.f40820) {
            AbstractC14545 abstractC14545M45667 = this.f40818.m45667();
            int size = abstractC14545M45667.size();
            this.f40820 = i;
            int i2 = this.f40823;
            if (i2 >= size || i <= ((InterfaceC21438) abstractC14545M45667.get(i2)).mo48557().getPosition()) {
                return;
            }
            int i3 = this.f40823;
            this.f40823 = i3 + 1;
            throw new C0270(m32891("did not generate token \"" + ((InterfaceC21438) abstractC14545M45667.get(i3)).mo48557().getText() + "\""));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m32900() {
        C19854 c19854 = this.f40818;
        int length = c19854.m45663().length() + 1;
        if (length > this.f40820) {
            AbstractC14545 abstractC14545M45667 = c19854.m45667();
            int size = abstractC14545M45667.size();
            while (true) {
                int i = this.f40823;
                if (i >= size || length <= ((InterfaceC21438) abstractC14545M45667.get(i)).mo48557().getPosition()) {
                    break;
                }
                int i2 = this.f40823;
                this.f40823 = i2 + 1;
                m32897(C2388.m7729((InterfaceC21438) abstractC14545M45667.get(i2), EnumC15792.IMAGINARY, f40816, C16646.empty()));
            }
        }
        this.f40820 = length;
        m32893(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32896(AbstractC8032 abstractC8032) {
        m32897(C10149.m25485(abstractC8032));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32906() {
        m32897(EnumC7510.m20134());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16646 m32908(int i) {
        AbstractC14545 abstractC14545M45667 = this.f40818.m45667();
        int i2 = this.f40823 + i;
        if (i2 < abstractC14545M45667.size()) {
            return C16646.of(((InterfaceC21438) abstractC14545M45667.get(i2)).mo48557().mo35701());
        }
        return C16646.empty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21438 m32903(int i) {
        AbstractC14545 abstractC14545M45667 = this.f40818.m45667();
        int i2 = this.f40823 + i;
        if (i2 < abstractC14545M45667.size()) {
            return (InterfaceC21438) abstractC14545M45667.get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m32890(int i, C9976 c9976) {
        AbstractC14545 abstractC14545M45667 = this.f40818.m45667();
        boolean z = ((InterfaceC21438) abstractC14545M45667.get(this.f40823)).mo48557().getPosition() == i;
        Object obj = abstractC14545M45667.get(this.f40823);
        if (!z) {
            throw new IllegalStateException(C10375.m26179("Expected the current token to be at position %s, found: %s", Integer.valueOf(i), obj));
        }
        C1846 c1846 = new C1846();
        for (int i2 = this.f40823; i2 < abstractC14545M45667.size(); i2++) {
            InterfaceC15086 interfaceC15086Mo48557 = ((InterfaceC21438) abstractC14545M45667.get(i2)).mo48557();
            if (!c9976.apply(interfaceC15086Mo48557)) {
                break;
            }
            c1846.m16264(interfaceC15086Mo48557);
        }
        return c1846.m6131();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32905(String str) {
        m32894(str, EnumC15792.IMAGINARY, f40816, C16646.empty());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32894(String str, EnumC15792 enumC15792, AbstractC8032 abstractC8032, C16646 c16646) {
        AbstractC14545 abstractC14545M45667 = this.f40818.m45667();
        if (str.equals(m32908(0).orElse(null))) {
            int i = this.f40823;
            this.f40823 = i + 1;
            m32897(C2388.m7729((InterfaceC21438) abstractC14545M45667.get(i), EnumC15792.REAL, abstractC8032, c16646));
        } else if (enumC15792.m37252()) {
            throw new C0270(m32891(String.format("expected token: '%s'; generated %s instead", m32908(0).orElse(null), str)));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32910(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            m32894(str.substring(i, i2), EnumC15792.REAL, f40816, C16646.empty());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m32907() {
        m32897(C20733.m47335());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32892() {
        m32899(EnumC23554.UNIFIED, "", f40816);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32909() {
        m32899(EnumC23554.INDEPENDENT, "", f40816);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32914() {
        m32899(EnumC23554.FORCED, "", f40816);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32904() {
        m32899(EnumC23554.UNIFIED, " ", f40816);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32912() {
        m32899(EnumC23554.INDEPENDENT, " ", f40816);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32899(EnumC23554 enumC23554, String str, AbstractC8032 abstractC8032) {
        m32897(C14381.m34345(enumC23554, str, abstractC8032, C16646.empty()));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m32901() {
        int i = this.f40822;
        if (i == -1) {
            this.f40822 = this.f40823;
            return;
        }
        if (this.f40823 == i) {
            return;
        }
        C19854 c19854 = this.f40818;
        this.f40819.m43329((InterfaceC21438) c19854.m45667().get(this.f40822), (InterfaceC21438) c19854.m45667().get(this.f40823 - 1));
        this.f40822 = this.f40823;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32898(AbstractC22848 abstractC22848) {
        int index;
        InterfaceC21438 interfaceC21438 = (InterfaceC21438) this.f40818.m45667().get(this.f40823);
        AbstractC4628 abstractC4628ListIterator = interfaceC21438.mo48558().listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            InterfaceC15086 interfaceC15086 = (InterfaceC15086) abstractC4628ListIterator.next();
            if (interfaceC15086.getIndex() >= 0) {
                index = interfaceC15086.getIndex();
                this.f40819.m43327(index, abstractC22848);
            }
        }
        index = interfaceC21438.mo48557().getIndex();
        this.f40819.m43327(index, abstractC22848);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m32911() {
        AbstractC14545 abstractC14545Of;
        m32901();
        C8656 c8656M22419 = C8656.m22419();
        ArrayList arrayList = this.f40821;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC12265 interfaceC12265 = (InterfaceC12265) arrayList.get(i);
            if (interfaceC12265 instanceof C2388) {
                C2388 c2388 = (C2388) interfaceC12265;
                InterfaceC21438 interfaceC21438M7734 = c2388.m7734();
                int i2 = i;
                while (i2 > 0 && (arrayList.get(i2 - 1) instanceof C10149)) {
                    i2--;
                }
                int i3 = i;
                do {
                    i3++;
                    if (i3 >= size) {
                        break;
                    }
                } while (arrayList.get(i3) instanceof EnumC7510);
                if (c2388.m7737().m37252()) {
                    AbstractC4628 abstractC4628ListIterator = interfaceC21438M7734.mo48558().listIterator(0);
                    boolean z = false;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean zMo35699 = false;
                    while (abstractC4628ListIterator.hasNext()) {
                        InterfaceC15086 interfaceC15086 = (InterfaceC15086) abstractC4628ListIterator.next();
                        if (interfaceC15086.mo35698()) {
                            i4++;
                        } else if (interfaceC15086.mo35700()) {
                            int position = interfaceC15086.getPosition();
                            c8656M22419.put(Integer.valueOf(i2), C14381.m34346(interfaceC15086.mo35696() ? EnumC23554.FORCED : EnumC23554.UNIFIED, position == 0 || this.f40818.m45663().charAt(position + (-1)) == '\n' ? C5210.f16319 : c2388.m7735()));
                            c8656M22419.m22420(interfaceC15086.mo35699() ? AbstractC14545.of((Object) C8738.m22591(interfaceC15086)) : AbstractC14545.of((Object) C8738.m22591(interfaceC15086), (Object) C14381.m34346(EnumC23554.FORCED, C5210.f16320)), Integer.valueOf(i2));
                            zMo35699 = interfaceC15086.mo35699();
                            if (interfaceC15086.mo35697()) {
                                c8656M22419.put(Integer.valueOf(i2), C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                            }
                            z = interfaceC15086.mo35696() || (interfaceC15086.mo35699() && !interfaceC15086.mo35697());
                            i4 = 0;
                            z2 = true;
                        }
                    }
                    if (z && i4 > 1) {
                        this.f40819.m43327(interfaceC21438M7734.mo48557().getIndex(), AbstractC22848.f73736);
                    }
                    C20733 c20733 = f40815;
                    if (z2 && i4 > 0) {
                        Integer numValueOf = Integer.valueOf(i2);
                        int i5 = C14381.f43326;
                        c8656M22419.put(numValueOf, C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                    } else if (zMo35699) {
                        c8656M22419.put(Integer.valueOf(i2), c20733);
                    }
                    AbstractC4628 abstractC4628ListIterator2 = interfaceC21438M7734.mo48559().listIterator(0);
                    while (abstractC4628ListIterator2.hasNext()) {
                        InterfaceC15086 interfaceC15087 = (InterfaceC15086) abstractC4628ListIterator2.next();
                        if (interfaceC15087.mo35700()) {
                            boolean z3 = interfaceC15087.mo35697() || (interfaceC15087.mo35699() && c2388.m7739().isPresent());
                            if (z3) {
                                c8656M22419.put(Integer.valueOf(i3), C14381.m34346(EnumC23554.FORCED, (AbstractC8032) c2388.m7739().orElse(C5210.f16320)));
                            } else {
                                c8656M22419.put(Integer.valueOf(i3), c20733);
                            }
                            Integer numValueOf2 = Integer.valueOf(i3);
                            if (interfaceC15087.mo35699()) {
                                abstractC14545Of = AbstractC14545.of((Object) C8738.m22591(interfaceC15087));
                            } else {
                                C8738 c8738M22591 = C8738.m22591(interfaceC15087);
                                int i6 = C14381.f43326;
                                abstractC14545Of = AbstractC14545.of((Object) c8738M22591, (Object) C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                            }
                            c8656M22419.m22420(abstractC14545Of, numValueOf2);
                            if (z3) {
                                c8656M22419.put(Integer.valueOf(i3), C14381.m34346(EnumC23554.FORCED, f40816));
                            }
                        }
                    }
                } else {
                    AbstractC4628 abstractC4628ListIterator3 = interfaceC21438M7734.mo48558().listIterator(0);
                    int i7 = 0;
                    boolean zMo35700 = false;
                    while (abstractC4628ListIterator3.hasNext()) {
                        InterfaceC15086 interfaceC15088 = (InterfaceC15086) abstractC4628ListIterator3.next();
                        if (interfaceC15088.mo35698()) {
                            i7++;
                        } else if (interfaceC15088.mo35700()) {
                            zMo35700 = interfaceC15088.mo35700();
                            i7 = 0;
                        }
                        if (zMo35700 && i7 > 0) {
                            Integer numValueOf3 = Integer.valueOf(i2);
                            int i8 = C14381.f43326;
                            c8656M22419.put(numValueOf3, C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                        }
                        c8656M22419.put(Integer.valueOf(i2), C8738.m22591(interfaceC15088));
                    }
                    AbstractC4628 abstractC4628ListIterator4 = interfaceC21438M7734.mo48559().listIterator(0);
                    while (abstractC4628ListIterator4.hasNext()) {
                        c8656M22419.put(Integer.valueOf(i3), C8738.m22591((InterfaceC15086) abstractC4628ListIterator4.next()));
                    }
                }
            }
        }
        int i9 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        boolean z4 = false;
        for (int i10 = 0; i10 < size; i10++) {
            for (InterfaceC12265 interfaceC12266 : c8656M22419.get((Object) Integer.valueOf(i10))) {
                if (!z4 || !(interfaceC12266 instanceof C20733)) {
                    c1846.m16264(interfaceC12266);
                    z4 = (interfaceC12266 instanceof C14381) && ((C14381) interfaceC12266).m34349();
                }
            }
            Object obj = (InterfaceC12265) arrayList.get(i10);
            if (!z4 || (!(obj instanceof C20733) && (!(obj instanceof C14381) || ((C14381) obj).m34350() != 0 || !" ".equals(((AbstractC3799) obj).m11470())))) {
                c1846.m16264(obj);
                if (!(obj instanceof C10149)) {
                    z4 = (obj instanceof C14381) && ((C14381) obj).m34349();
                }
            }
        }
        for (InterfaceC12265 interfaceC12267 : c8656M22419.get((Object) Integer.valueOf(size))) {
            if (!z4 || !(interfaceC12267 instanceof C20733)) {
                c1846.m16264(interfaceC12267);
                z4 = (interfaceC12267 instanceof C14381) && ((C14381) interfaceC12267).m34349();
            }
        }
        return c1846.m6131();
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f40818, "input");
        c8964M37871.m23110(this.f40821, "ops");
        c8964M37871.m23110(this.f40819, "output");
        c8964M37871.m23111("tokenI", this.f40823);
        c8964M37871.m23111("inputPosition", this.f40820);
        return c8964M37871.toString();
    }
}
