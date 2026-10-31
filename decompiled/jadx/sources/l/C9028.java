package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C9028 extends AbstractC9049 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13260 f27392;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f27393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC9734 f27394;

    public C9028(EnumC9734 enumC9734) {
        C13260 c13260 = new C13260();
        this.f27392 = c13260;
        this.f27393 = new ArrayList();
        C11003.requireNonNull(enumC9734);
        this.f27394 = enumC9734;
        c13260.m32181(true);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C9028 m23280() {
        return new C9028(EnumC9734.ERROR);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23277(EnumC9734 enumC9734) {
        return new C9028(enumC9734);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23278(byte[] bArr) {
        return m23279(bArr, EnumC9734.ERROR);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23279(byte[] bArr, EnumC9734 enumC9734) {
        return m23276(new C23326(bArr), enumC9734);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23276(AbstractC9049 abstractC9049, EnumC9734 enumC9734) {
        C9028 c9028 = new C9028(enumC9734);
        boolean zMo3391 = abstractC9049.mo14959().mo3391();
        C13260 c13260 = c9028.f27392;
        c13260.m32181(zMo3391);
        for (InterfaceC4277 interfaceC4277 : abstractC9049.mo21936()) {
            C8322 c8322M23281 = c9028.m23281(interfaceC4277.mo12858(), interfaceC4277.getPackageName());
            c8322M23281.m21922(interfaceC4277.mo12848());
            for (InterfaceC9216 interfaceC9216 : interfaceC4277.mo12855()) {
                c8322M23281.m21919(interfaceC9216.mo23657(), interfaceC9216.getPackageName());
            }
            for (InterfaceC16270 interfaceC16270 : interfaceC4277.mo12845()) {
                C0560 c0560M21917 = c8322M23281.m21917(interfaceC16270.getName(), interfaceC16270.mo12339());
                for (InterfaceC2866 interfaceC2866 : interfaceC16270.mo12337()) {
                    c0560M21917.m2308(interfaceC2866.mo8776(), new C15859(interfaceC2866.mo8775()));
                }
            }
            for (InterfaceC19094 interfaceC19094 : interfaceC4277.mo12857()) {
                C15376 c15376M21923 = c8322M23281.m21923();
                for (InterfaceC19800 interfaceC19800 : interfaceC19094.mo43981()) {
                    c15376M21923.m36411(interfaceC19800.mo45543(), interfaceC19800.mo45542());
                }
            }
            for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                C20317 c20317M21925 = c8322M23281.m21925(interfaceC0748.mo2870(), interfaceC0748.getTypeName());
                c20317M21925.m46624(interfaceC0748.mo2878());
                C18955 c18955 = new C18955();
                ArrayList<InterfaceC7099> arrayList = new ArrayList(interfaceC0748.mo2871());
                Iterator it = interfaceC0748.mo2872().iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC7099) it.next());
                }
                Collections.sort(arrayList, C8200.comparing(new C7680(1)));
                for (InterfaceC7099 interfaceC7099 : arrayList) {
                    if (c18955.add(interfaceC7099.mo18742())) {
                        C2678 c2678M46608 = c20317M21925.m46608(interfaceC7099.mo18743());
                        c2678M46608.m8397(interfaceC7099.mo2345());
                        c2678M46608.m8395(interfaceC7099.mo2349());
                        for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                            c20317M21925.m46611(interfaceC21211.mo47883(), interfaceC21211.mo29406(), true);
                            c2678M46608.m8392(interfaceC21211.mo47883()).m43645(interfaceC21211);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C20317 c20317 : c8322M23281.mo12850()) {
                for (int iMo2871 = c20317.mo2871() - 1; iMo2871 >= 0; iMo2871--) {
                    if (!c20317.mo2877(iMo2871).mo18746().iterator().hasNext()) {
                        c20317.m46626(iMo2871);
                    }
                }
                if (c20317.mo2871() == 0) {
                    arrayList2.add(Integer.valueOf(c20317.mo2870()));
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c8322M23281.m21918(((Integer) it2.next()).intValue());
            }
        }
        c13260.m32187();
        return c9028;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8322 m23281(int i, String str) {
        ArrayList<C8322> arrayList = this.f27393;
        for (C8322 c8322 : arrayList) {
            if (c8322.mo12858() == i) {
                if (!c8322.getPackageName().equals(str)) {
                    EnumC9734 enumC9734 = EnumC9734.MERGE;
                    EnumC9734 enumC9735 = this.f27394;
                    if (enumC9735 != enumC9734) {
                        if (enumC9735 == EnumC9734.ERROR) {
                            throw new RuntimeException(String.format("There is already a package with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c8322.getPackageName(), str));
                        }
                        if (enumC9735 == EnumC9734.CREATE) {
                            break;
                        }
                    }
                }
                return c8322;
            }
        }
        C8322 c8323 = new C8322(this, i, str);
        arrayList.add(c8323);
        return c8323;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m23285() {
        C13260 c13260 = this.f27392;
        c13260.m32183();
        Iterator it = m23370().iterator();
        while (it.hasNext()) {
            ((C8322) it.next()).m21926();
        }
        c13260.m32188();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23282(OutputStream outputStream) throws IOException {
        C10130 c10130 = new C10130();
        m23283(c10130, (C19277) null);
        c10130.m25421(outputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23283(InterfaceC4485 interfaceC4485, C19277 c19277) {
        ArrayList<C11850> arrayList = new ArrayList();
        Iterator it = m23370().iterator();
        int size = 0;
        while (it.hasNext()) {
            C11850 c11850 = new C11850((C8322) it.next());
            arrayList.add(c11850);
            size += c11850.f35370.size();
        }
        interfaceC4485.mo13229((short) 2);
        interfaceC4485.mo13229((short) 12);
        long position = interfaceC4485.getPosition();
        interfaceC4485.mo13232();
        interfaceC4485.writeInt(size);
        this.f27392.m32180(interfaceC4485, true, c19277);
        for (C11850 c11851 : arrayList) {
            c11851.f35371.m21921(interfaceC4485, c19277, c11851);
        }
        long position2 = interfaceC4485.getPosition();
        interfaceC4485.seek(position);
        interfaceC4485.writeInt((int) ((position2 - position) + 4));
        interfaceC4485.seek(position2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19277 m23287() {
        int iM32185 = this.f27392.m32185();
        for (C8322 c8322 : m23370()) {
            c8322.getClass();
            HashMap map = new HashMap();
            int iM46625 = 0;
            int iMax = 1;
            for (C20317 c20317 : c8322.mo12850()) {
                String typeName = c20317.getTypeName();
                Integer num = (Integer) map.get(typeName);
                int iIntValue = num == null ? 1 : num.intValue() + 1;
                map.put(typeName, Integer.valueOf(iIntValue));
                iMax = Math.max(iMax, iIntValue);
                iM46625 += c20317.m46625();
            }
            iM32185 = C23202.m51496(iMax, 3, iM46625, iM32185);
        }
        return new C19277(iM32185);
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC12743 mo14959() {
        return this.f27392;
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ᩻ۧ */
    public final C13260 mo14959() {
        return this.f27392;
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۚ */
    public final int mo14956() {
        return this.f27393.size();
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۢ */
    public final C8322 mo14957(int i) {
        return (C8322) this.f27393.get(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23284() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f27393;
            if (i >= arrayList.size()) {
                return;
            }
            if (((C8322) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8322 m23286() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f27393;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((C8322) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                return (C8322) arrayList.get(i);
            }
            i++;
        }
    }
}
