package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15374 extends AbstractC15594 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f47089 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f47090;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f47091;

    public C15374(String str) {
        this.f47090 = str.split("\n", -1);
        this.f47091 = str.length() * 8;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        boolean z;
        InterfaceC2190 interfaceC2190Mo12420 = interfaceC18418.mo12420();
        boolean z2 = interfaceC2190Mo12420.mo7223() instanceof C22630;
        HashMap map = this.f47089;
        if (z2 || (interfaceC2190Mo12420.mo7223() instanceof C19249)) {
            map.put(interfaceC2190Mo12420.mo7223(), interfaceC2190Mo12420);
        }
        if (c19662.mo44151() < 4) {
            String strTrim = c19662.getLine().m38335().toString().substring(c19662.mo44153()).trim();
            C19954 c19954M38337 = c19662.getLine().m38337();
            if (c19954M38337 != null) {
                String str = strTrim.startsWith("$$") ? "$$" : strTrim.startsWith("\\[") ? "\\]" : null;
                if (str != null) {
                    if (strTrim.length() <= 4 || !strTrim.endsWith(str)) {
                        z = false;
                    } else {
                        int length = strTrim.length() - 2;
                        int i = 0;
                        while (length > 0) {
                            length--;
                            if (strTrim.charAt(length) != '\\') {
                                break;
                            }
                            i++;
                        }
                        if (i % 2 != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z || strTrim.equals("$$") || strTrim.equals("\\[")) {
                        if (!z) {
                            int iM46028 = c19954M38337.m46028();
                            ArrayList<InterfaceC2190> arrayList = new ArrayList();
                            for (AbstractC0197 abstractC0197Mo7223 = interfaceC2190Mo12420.mo7223(); abstractC0197Mo7223 != null; abstractC0197Mo7223 = abstractC0197Mo7223.mo1355()) {
                                if ((abstractC0197Mo7223 instanceof C22630) || (abstractC0197Mo7223 instanceof C19249)) {
                                    InterfaceC2190 interfaceC2190 = (InterfaceC2190) map.get(abstractC0197Mo7223);
                                    if (interfaceC2190 != null) {
                                        arrayList.add(0, interfaceC2190);
                                    }
                                }
                            }
                            int i2 = iM46028 + 1;
                            loop2: while (true) {
                                String[] strArr = this.f47090;
                                if (i2 >= strArr.length) {
                                    break;
                                }
                                int length2 = this.f47091 - (strArr[i2].length() + 1);
                                this.f47091 = length2;
                                if (length2 < 0) {
                                    break;
                                }
                                C21726 c21726 = new C21726(strArr[i2], interfaceC2190Mo12420);
                                for (InterfaceC2190 interfaceC2191 : arrayList) {
                                    if (!(interfaceC2191.mo7223() instanceof C19249) || !c21726.mo44149()) {
                                        C14721 c14721Mo7216 = interfaceC2191.mo7216(c21726);
                                        if (!C12354.m29972(c14721Mo7216)) {
                                            break loop2;
                                        }
                                        c21726.m49052(c14721Mo7216);
                                    }
                                }
                                if (!strArr[i2].substring(c21726.getIndex()).trim().equals(str)) {
                                    i2++;
                                }
                            }
                        }
                        C21073 c21073 = new C21073(new C8320(str, strTrim, z));
                        c21073.m47974(c19662.mo44153());
                        return c21073;
                    }
                }
            }
        }
        return null;
    }
}
