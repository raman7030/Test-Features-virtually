package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C10949 extends AbstractC10969 {

    /* JADX INFO: renamed from: ۙ */
    public final C14971 f30328;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f30329;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC11620 f30330;

    public C10949(EnumC11620 enumC11620) {
        C14971 c14971 = new C14971();
        this.f30328 = c14971;
        this.f30329 = new ArrayList();
        C12826.requireNonNull(enumC11620);
        this.f30330 = enumC11620;
        c14971.m34280(true);
    }

    /* JADX INFO: renamed from: ᩵ */
    public static C10949 m25224() {
        return new C10949(EnumC11620.ERROR);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10949 m25221(EnumC11620 enumC11620) {
        return new C10949(enumC11620);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10949 m25222(byte[] bArr) {
        return m25223(bArr, EnumC11620.ERROR);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10949 m25223(byte[] bArr, EnumC11620 enumC11620) {
        return m25220(new C24538(bArr), enumC11620);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10949 m25220(AbstractC10969 abstractC10969, EnumC11620 enumC11620) {
        C10949 c10949 = new C10949(enumC11620);
        boolean zMo5710 = abstractC10969.mo16869().mo5710();
        C14971 c14971 = c10949.f30328;
        c14971.m34280(zMo5710);
        for (InterfaceC6434 interfaceC6434 : abstractC10969.mo23906()) {
            C10278 c10278M25225 = c10949.m25225(interfaceC6434.mo14722(), interfaceC6434.getPackageName());
            c10278M25225.m23892(interfaceC6434.mo14712());
            for (InterfaceC11128 interfaceC11128 : interfaceC6434.mo14719()) {
                c10278M25225.m23889(interfaceC11128.mo25656(), interfaceC11128.getPackageName());
            }
            for (InterfaceC17832 interfaceC17832 : interfaceC6434.mo14709()) {
                C2901 c2901M23887 = c10278M25225.m23887(interfaceC17832.getName(), interfaceC17832.mo14244());
                for (InterfaceC5093 interfaceC5093 : interfaceC17832.mo14242()) {
                    c2901M23887.m4676(interfaceC5093.mo10843(), new C17441(interfaceC5093.mo10842()));
                }
            }
            for (InterfaceC20516 interfaceC20516 : interfaceC6434.mo14721()) {
                C16982 c16982M23893 = c10278M25225.m23893();
                for (InterfaceC21187 interfaceC21187 : interfaceC20516.mo46275()) {
                    c16982M23893.m38569(interfaceC21187.mo47854(), interfaceC21187.mo47853());
                }
            }
            for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                C21678 c21678M23895 = c10278M25225.m23895(interfaceC3080.mo5199(), interfaceC3080.getTypeName());
                c21678M23895.m48947(interfaceC3080.mo5207());
                C1782 c1782 = new C1782();
                ArrayList<InterfaceC9116> arrayList = new ArrayList(interfaceC3080.mo5200());
                Iterator it = interfaceC3080.mo5201().iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC9116) it.next());
                }
                Collections.sort(arrayList, C10162.comparing(new C9668(1)));
                for (InterfaceC9116 interfaceC9116 : arrayList) {
                    if (c1782.add(interfaceC9116.mo20692())) {
                        C4914 c4914M48931 = c21678M23895.m48931(interfaceC9116.mo20693());
                        c4914M48931.m10443(interfaceC9116.mo4716());
                        c4914M48931.m10441(interfaceC9116.mo4720());
                        for (InterfaceC22528 interfaceC22528 : interfaceC9116.mo20696()) {
                            c21678M23895.m48934(interfaceC22528.mo50213(), interfaceC22528.mo31468(), true);
                            c4914M48931.m10438(interfaceC22528.mo50213()).m45911(interfaceC22528);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C21678 c21678 : c10278M25225.mo14714()) {
                for (int iMo5200 = c21678.mo5200() - 1; iMo5200 >= 0; iMo5200--) {
                    if (!c21678.mo5206(iMo5200).mo20696().iterator().hasNext()) {
                        c21678.m48949(iMo5200);
                    }
                }
                if (c21678.mo5200() == 0) {
                    arrayList2.add(Integer.valueOf(c21678.mo5199()));
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c10278M25225.m23888(((Integer) it2.next()).intValue());
            }
        }
        c14971.m34286();
        return c10949;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10278 m25225(int i, String str) {
        ArrayList<C10278> arrayList = this.f30329;
        for (C10278 c10278 : arrayList) {
            if (c10278.mo14722() == i) {
                if (!c10278.getPackageName().equals(str)) {
                    EnumC11620 enumC11620 = EnumC11620.MERGE;
                    EnumC11620 enumC11621 = this.f30330;
                    if (enumC11621 != enumC11620) {
                        if (enumC11621 == EnumC11620.ERROR) {
                            throw new RuntimeException(String.format("There is already a package with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c10278.getPackageName(), str));
                        }
                        if (enumC11621 == EnumC11620.CREATE) {
                            break;
                        }
                    }
                }
                return c10278;
            }
        }
        C10278 c10279 = new C10278(this, i, str);
        arrayList.add(c10279);
        return c10279;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m25229() {
        C14971 c14971 = this.f30328;
        c14971.m34282();
        Iterator it = m25315().iterator();
        while (it.hasNext()) {
            ((C10278) it.next()).m23896();
        }
        c14971.m34287();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25226(OutputStream outputStream) throws IOException {
        C11996 c11996 = new C11996();
        m25227(c11996, (C20689) null);
        c11996.m27441(outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25227(InterfaceC6631 interfaceC6631, C20689 c20689) {
        ArrayList<C13631> arrayList = new ArrayList();
        Iterator it = m25315().iterator();
        int size = 0;
        while (it.hasNext()) {
            C13631 c13631 = new C13631((C10278) it.next());
            arrayList.add(c13631);
            size += c13631.f38375.size();
        }
        interfaceC6631.mo15111((short) 2);
        interfaceC6631.mo15111((short) 12);
        long position = interfaceC6631.getPosition();
        interfaceC6631.mo15114();
        interfaceC6631.writeInt(size);
        this.f30328.m34279(interfaceC6631, true, c20689);
        for (C13631 c13632 : arrayList) {
            c13632.f38376.m23891(interfaceC6631, c20689, c13632);
        }
        long position2 = interfaceC6631.getPosition();
        interfaceC6631.seek(position);
        interfaceC6631.writeInt((int) ((position2 - position) + 4));
        interfaceC6631.seek(position2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C20689 m25231() {
        int iM34284 = this.f30328.m34284();
        for (C10278 c10278 : m25315()) {
            c10278.getClass();
            HashMap map = new HashMap();
            int iM48948 = 0;
            int iMax = 1;
            for (C21678 c21678 : c10278.mo14714()) {
                String typeName = c21678.getTypeName();
                Integer num = (Integer) map.get(typeName);
                int iIntValue = num == null ? 1 : num.intValue() + 1;
                map.put(typeName, Integer.valueOf(iIntValue));
                iMax = Math.max(iMax, iIntValue);
                iM48948 += c21678.m48948();
            }
            iM34284 = C24420.m53892(iMax, 3, iM48948, iM34284);
        }
        return new C20689(iM34284);
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC14480 mo16869() {
        return this.f30328;
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩻ۧ */
    public final C14971 mo16869() {
        return this.f30328;
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۚ */
    public final int mo16866() {
        return this.f30329.size();
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۢ */
    public final C10278 mo16867(int i) {
        return (C10278) this.f30329.get(i);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m25228() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f30329;
            if (i >= arrayList.size()) {
                return;
            }
            if (((C10278) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10278 m25230() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f30329;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((C10278) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                return (C10278) arrayList.get(i);
            }
            i++;
        }
    }
}
