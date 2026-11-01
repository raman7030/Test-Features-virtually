package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C15365 {

    /* JADX INFO: renamed from: ۧ */
    public final C21237 f43899;

    /* JADX INFO: renamed from: ܳ */
    public final C20151 f43900;

    /* JADX INFO: renamed from: ᩷ */
    public static final C7320 f43897 = C7320.f19161;

    /* JADX INFO: renamed from: ۜ */
    public static final C22073 f43896 = C22073.m49662();

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f43902 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public int f43904 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f43901 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֫ */
    public int f43898 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f43903 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final void m35012(InterfaceC14025 interfaceC14025) {
        if (interfaceC14025 instanceof C12014) {
            this.f43898++;
        } else if (interfaceC14025 instanceof EnumC9506) {
            int i = this.f43898 - 1;
            this.f43898 = i;
            if (i < 0) {
                throw new AssertionError();
            }
        }
        this.f43902.add(interfaceC14025);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35010(List list) {
        AbstractC6767 abstractC6767ListIterator = ((AbstractC16192) list).listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            m35012((InterfaceC14025) abstractC6767ListIterator.next());
        }
    }

    public C15365(C21237 c21237, C20151 c20151) {
        this.f43899 = c21237;
        this.f43900 = c20151;
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC23413 m35017() {
        return this.f43899;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m35030() {
        return this.f43898;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35008(int i) {
        if (this.f43898 != i) {
            throw new C2625(m35006(String.format("saw %d unclosed ops", Integer.valueOf(this.f43898))));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20732 m35006(String str) {
        int i = this.f43901;
        C21237 c21237 = this.f43899;
        return C20732.m46812(c21237.m47977(i), c21237.m47973(i), str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35028(int i) {
        if (i > this.f43901) {
            AbstractC16192 abstractC16192M47978 = this.f43899.m47978();
            int size = abstractC16192M47978.size();
            this.f43901 = i;
            int i2 = this.f43904;
            if (i2 >= size || i <= ((InterfaceC22743) abstractC16192M47978.get(i2)).mo50894().getPosition()) {
                return;
            }
            int i3 = this.f43904;
            this.f43904 = i3 + 1;
            throw new C2625(m35006("did not generate token \"" + ((InterfaceC22743) abstractC16192M47978.get(i3)).mo50894().getText() + "\""));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m35015() {
        C21237 c21237 = this.f43899;
        int length = c21237.m47974().length() + 1;
        if (length > this.f43901) {
            AbstractC16192 abstractC16192M47978 = c21237.m47978();
            int size = abstractC16192M47978.size();
            while (true) {
                int i = this.f43904;
                if (i >= size || length <= ((InterfaceC22743) abstractC16192M47978.get(i)).mo50894().getPosition()) {
                    break;
                }
                int i2 = this.f43904;
                this.f43904 = i2 + 1;
                m35012(C4638.m9790((InterfaceC22743) abstractC16192M47978.get(i2), EnumC17377.IMAGINARY, f43897, C18189.empty()));
            }
        }
        this.f43901 = length;
        m35008(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35011(AbstractC10002 abstractC10002) {
        m35012(C12014.m27504(abstractC10002));
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m35021() {
        m35012(EnumC9506.m22110());
    }

    /* JADX INFO: renamed from: ܽ */
    public final C18189 m35023(int i) {
        AbstractC16192 abstractC16192M47978 = this.f43899.m47978();
        int i2 = this.f43904 + i;
        if (i2 < abstractC16192M47978.size()) {
            return C18189.m41402of(((InterfaceC22743) abstractC16192M47978.get(i2)).mo50894().mo37859());
        }
        return C18189.empty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22743 m35018(int i) {
        AbstractC16192 abstractC16192M47978 = this.f43899.m47978();
        int i2 = this.f43904 + i;
        if (i2 < abstractC16192M47978.size()) {
            return (InterfaceC22743) abstractC16192M47978.get(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 m35005(int i, C11849 c11849) {
        AbstractC16192 abstractC16192M47978 = this.f43899.m47978();
        boolean z = ((InterfaceC22743) abstractC16192M47978.get(this.f43904)).mo50894().getPosition() == i;
        Object obj = abstractC16192M47978.get(this.f43904);
        if (!z) {
            throw new IllegalStateException(C12229.m28208("Expected the current token to be at position %s, found: %s", Integer.valueOf(i), obj));
        }
        C4123 c4123 = new C4123();
        for (int i2 = this.f43904; i2 < abstractC16192M47978.size(); i2++) {
            InterfaceC16706 interfaceC16706Mo50894 = ((InterfaceC22743) abstractC16192M47978.get(i2)).mo50894();
            if (!c11849.apply(interfaceC16706Mo50894)) {
                break;
            }
            c4123.m18184(interfaceC16706Mo50894);
        }
        return c4123.m8329();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35020(String str) {
        m35009(str, EnumC17377.IMAGINARY, f43897, C18189.empty());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35009(String str, EnumC17377 enumC17377, AbstractC10002 abstractC10002, C18189 c18189) {
        AbstractC16192 abstractC16192M47978 = this.f43899.m47978();
        if (str.equals(m35023(0).orElse(null))) {
            int i = this.f43904;
            this.f43904 = i + 1;
            m35012(C4638.m9790((InterfaceC22743) abstractC16192M47978.get(i), EnumC17377.REAL, abstractC10002, c18189));
        } else if (enumC17377.m39422()) {
            throw new C2625(m35006(String.format("expected token: '%s'; generated %s instead", m35023(0).orElse(null), str)));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35025(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            m35009(str.substring(i, i2), EnumC17377.REAL, f43897, C18189.empty());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m35022() {
        m35012(C22073.m49662());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35007() {
        m35014(EnumC24754.UNIFIED, "", f43897);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35024() {
        m35014(EnumC24754.INDEPENDENT, "", f43897);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m35029() {
        m35014(EnumC24754.FORCED, "", f43897);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35019() {
        m35014(EnumC24754.UNIFIED, " ", f43897);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35027() {
        m35014(EnumC24754.INDEPENDENT, " ", f43897);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35014(EnumC24754 enumC24754, String str, AbstractC10002 abstractC10002) {
        m35012(C16036.m36479(enumC24754, str, abstractC10002, C18189.empty()));
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m35016() {
        int i = this.f43903;
        if (i == -1) {
            this.f43903 = this.f43904;
            return;
        }
        if (this.f43904 == i) {
            return;
        }
        C21237 c21237 = this.f43899;
        this.f43900.m45596((InterfaceC22743) c21237.m47978().get(this.f43903), (InterfaceC22743) c21237.m47978().get(this.f43904 - 1));
        this.f43903 = this.f43904;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35013(AbstractC24083 abstractC24083) {
        int index;
        InterfaceC22743 interfaceC22743 = (InterfaceC22743) this.f43899.m47978().get(this.f43904);
        AbstractC6767 abstractC6767ListIterator = interfaceC22743.mo50895().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            InterfaceC16706 interfaceC16706 = (InterfaceC16706) abstractC6767ListIterator.next();
            if (interfaceC16706.getIndex() >= 0) {
                index = interfaceC16706.getIndex();
                this.f43900.m45594(index, abstractC24083);
            }
        }
        index = interfaceC22743.mo50894().getIndex();
        this.f43900.m45594(index, abstractC24083);
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC16192 m35026() {
        AbstractC16192 abstractC16192M36874of;
        m35016();
        C10595 c10595M24388 = C10595.m24388();
        ArrayList arrayList = this.f43902;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC14025 interfaceC14025 = (InterfaceC14025) arrayList.get(i);
            if (interfaceC14025 instanceof C4638) {
                C4638 c4638 = (C4638) interfaceC14025;
                InterfaceC22743 interfaceC22743M9795 = c4638.m9795();
                int i2 = i;
                while (i2 > 0 && (arrayList.get(i2 - 1) instanceof C12014)) {
                    i2--;
                }
                int i3 = i;
                do {
                    i3++;
                    if (i3 >= size) {
                        break;
                    }
                } while (arrayList.get(i3) instanceof EnumC9506);
                if (c4638.m9798().m39422()) {
                    AbstractC6767 abstractC6767ListIterator = interfaceC22743M9795.mo50895().listIterator(0);
                    boolean z = false;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean zMo37857 = false;
                    while (abstractC6767ListIterator.hasNext()) {
                        InterfaceC16706 interfaceC16706 = (InterfaceC16706) abstractC6767ListIterator.next();
                        if (interfaceC16706.mo37856()) {
                            i4++;
                        } else if (interfaceC16706.mo37858()) {
                            int position = interfaceC16706.getPosition();
                            c10595M24388.put(Integer.valueOf(i2), C16036.m36480(interfaceC16706.mo37854() ? EnumC24754.FORCED : EnumC24754.UNIFIED, position == 0 || this.f43899.m47974().charAt(position + (-1)) == '\n' ? C7320.f19160 : c4638.m9796()));
                            c10595M24388.m24389(interfaceC16706.mo37857() ? AbstractC16192.m36873of((Object) C10673.m24560(interfaceC16706)) : AbstractC16192.m36874of((Object) C10673.m24560(interfaceC16706), (Object) C16036.m36480(EnumC24754.FORCED, C7320.f19161)), Integer.valueOf(i2));
                            zMo37857 = interfaceC16706.mo37857();
                            if (interfaceC16706.mo37855()) {
                                c10595M24388.put(Integer.valueOf(i2), C16036.m36480(EnumC24754.FORCED, C7320.f19161));
                            }
                            z = interfaceC16706.mo37854() || (interfaceC16706.mo37857() && !interfaceC16706.mo37855());
                            i4 = 0;
                            z2 = true;
                        }
                    }
                    if (z && i4 > 1) {
                        this.f43900.m45594(interfaceC22743M9795.mo50894().getIndex(), AbstractC24083.f76468);
                    }
                    C22073 c22073 = f43896;
                    if (z2 && i4 > 0) {
                        Integer numValueOf = Integer.valueOf(i2);
                        int i5 = C16036.f46417;
                        c10595M24388.put(numValueOf, C16036.m36480(EnumC24754.FORCED, C7320.f19161));
                    } else if (zMo37857) {
                        c10595M24388.put(Integer.valueOf(i2), c22073);
                    }
                    AbstractC6767 abstractC6767ListIterator2 = interfaceC22743M9795.mo50896().listIterator(0);
                    while (abstractC6767ListIterator2.hasNext()) {
                        InterfaceC16706 interfaceC16707 = (InterfaceC16706) abstractC6767ListIterator2.next();
                        if (interfaceC16707.mo37858()) {
                            boolean z3 = interfaceC16707.mo37855() || (interfaceC16707.mo37857() && c4638.m9800().isPresent());
                            if (z3) {
                                c10595M24388.put(Integer.valueOf(i3), C16036.m36480(EnumC24754.FORCED, (AbstractC10002) c4638.m9800().orElse(C7320.f19161)));
                            } else {
                                c10595M24388.put(Integer.valueOf(i3), c22073);
                            }
                            Integer numValueOf2 = Integer.valueOf(i3);
                            if (interfaceC16707.mo37857()) {
                                abstractC16192M36874of = AbstractC16192.m36873of((Object) C10673.m24560(interfaceC16707));
                            } else {
                                C10673 c10673M24560 = C10673.m24560(interfaceC16707);
                                int i6 = C16036.f46417;
                                abstractC16192M36874of = AbstractC16192.m36874of((Object) c10673M24560, (Object) C16036.m36480(EnumC24754.FORCED, C7320.f19161));
                            }
                            c10595M24388.m24389(abstractC16192M36874of, numValueOf2);
                            if (z3) {
                                c10595M24388.put(Integer.valueOf(i3), C16036.m36480(EnumC24754.FORCED, f43897));
                            }
                        }
                    }
                } else {
                    AbstractC6767 abstractC6767ListIterator3 = interfaceC22743M9795.mo50895().listIterator(0);
                    int i7 = 0;
                    boolean zMo37858 = false;
                    while (abstractC6767ListIterator3.hasNext()) {
                        InterfaceC16706 interfaceC16708 = (InterfaceC16706) abstractC6767ListIterator3.next();
                        if (interfaceC16708.mo37856()) {
                            i7++;
                        } else if (interfaceC16708.mo37858()) {
                            zMo37858 = interfaceC16708.mo37858();
                            i7 = 0;
                        }
                        if (zMo37858 && i7 > 0) {
                            Integer numValueOf3 = Integer.valueOf(i2);
                            int i8 = C16036.f46417;
                            c10595M24388.put(numValueOf3, C16036.m36480(EnumC24754.FORCED, C7320.f19161));
                        }
                        c10595M24388.put(Integer.valueOf(i2), C10673.m24560(interfaceC16708));
                    }
                    AbstractC6767 abstractC6767ListIterator4 = interfaceC22743M9795.mo50896().listIterator(0);
                    while (abstractC6767ListIterator4.hasNext()) {
                        c10595M24388.put(Integer.valueOf(i3), C10673.m24560((InterfaceC16706) abstractC6767ListIterator4.next()));
                    }
                }
            }
        }
        int i9 = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        boolean z4 = false;
        for (int i10 = 0; i10 < size; i10++) {
            for (InterfaceC14025 interfaceC14026 : c10595M24388.get((Object) Integer.valueOf(i10))) {
                if (!z4 || !(interfaceC14026 instanceof C22073)) {
                    c4123.m18184(interfaceC14026);
                    z4 = (interfaceC14026 instanceof C16036) && ((C16036) interfaceC14026).m36483();
                }
            }
            Object obj = (InterfaceC14025) arrayList.get(i10);
            if (!z4 || (!(obj instanceof C22073) && (!(obj instanceof C16036) || ((C16036) obj).m36484() != 0 || !" ".equals(((AbstractC5979) obj).m13406())))) {
                c4123.m18184(obj);
                if (!(obj instanceof C12014)) {
                    z4 = (obj instanceof C16036) && ((C16036) obj).m36483();
                }
            }
        }
        for (InterfaceC14025 interfaceC14027 : c10595M24388.get((Object) Integer.valueOf(size))) {
            if (!z4 || !(interfaceC14027 instanceof C22073)) {
                c4123.m18184(interfaceC14027);
                z4 = (interfaceC14027 instanceof C16036) && ((C16036) interfaceC14027).m36483();
            }
        }
        return c4123.m8329();
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f43899, "input");
        c10888M40057.m25084(this.f43902, "ops");
        c10888M40057.m25084(this.f43900, "output");
        c10888M40057.m25085("tokenI", this.f43904);
        c10888M40057.m25085("inputPosition", this.f43901);
        return c10888M40057.toString();
    }
}
