package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EX */
/* JADX INFO: loaded from: classes4.dex */
public class C16232 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 f47772;

    /* JADX INFO: renamed from: ۧ */
    public volatile C19015 f47773;

    /* JADX INFO: renamed from: ܽ */
    public final C6634 f47774 = new C6634();

    public C16232(InterfaceC11799 interfaceC11799) {
        this.f47772 = interfaceC11799;
        if (interfaceC11799.mo16866() > 1) {
            Iterator it = interfaceC11799.mo23906().iterator();
            int i = 1;
            while (it.hasNext()) {
                int iMo14722 = ((InterfaceC6434) it.next()).mo14722();
                if (!this.f47774.mo4793(iMo14722)) {
                    if (iMo14722 == 1) {
                        this.f47774.mo4686(1, "android");
                    } else if (iMo14722 == 127) {
                        this.f47774.mo4686(127, "app");
                    } else {
                        C6634 c6634 = this.f47774;
                        StringBuilder sb = new StringBuilder("app");
                        i++;
                        sb.append(i);
                        c6634.mo4686(iMo14722, sb.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19015 m36999() {
        if (this.f47773 == null) {
            synchronized (this) {
                if (this.f47773 == null) {
                    this.f47773 = new C19015(this.f47772);
                }
            }
        }
        return this.f47773;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 m36997() {
        return this.f47772;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3080 m36996(int i) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        InterfaceC11799 interfaceC11799 = this.f47772;
        InterfaceC3080 interfaceC3080M36994 = m36994(interfaceC11799, i2, i3);
        return (interfaceC3080M36994 == null && i2 == 1 && !interfaceC11799.mo25314()) ? m36994(C12981.m29762(), i2, i3) : interfaceC3080M36994;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC3080 m36994(InterfaceC11799 interfaceC11799, int i, int i2) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.mo5199() == i2) {
                        return interfaceC3080;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo34338(int i, int i2) {
        int i3 = i2 >>> 24;
        int i4 = i3 & 255;
        int i5 = i2 >>> 16;
        int i6 = i5 & 255;
        int i7 = i2 & 65535;
        String strM36993 = m36993(i, this.f47772, i4, i6, i7);
        if (strM36993 == null && i4 == 1 && !this.f47772.mo25314()) {
            strM36993 = m36993(i, C12981.m29762(), i4, i6, i7);
        }
        return strM36993 == null ? new String(new char[]{"0123456789abcdef".charAt((i2 >>> 28) & 15), "0123456789abcdef".charAt(i3 & 15), "0123456789abcdef".charAt((i2 >>> 20) & 15), "0123456789abcdef".charAt(i5 & 15), "0123456789abcdef".charAt((i2 >>> 12) & 15), "0123456789abcdef".charAt((i2 >>> 8) & 15), "0123456789abcdef".charAt((i2 >>> 4) & 15), "0123456789abcdef".charAt(i2 & 15)}) : strM36993;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m36993(int i, InterfaceC11799 interfaceC11799, int i2, int i3, int i4) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i2) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.mo5199() == i3) {
                        Iterator it = interfaceC3080.mo5201().iterator();
                        while (it.hasNext()) {
                            InterfaceC22528 interfaceC22528Mo4717 = ((InterfaceC9116) it.next()).mo4717(i4);
                            if (interfaceC22528Mo4717 != null) {
                                return m36995(i, i2) + interfaceC3080.getTypeName() + "/" + interfaceC22528Mo4717.mo31468();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m36995(int i, int i2) {
        if (i != 1 && i == i2) {
            return "";
        }
        String str = (String) this.f47774.get(i2);
        if (str != null) {
            return str.concat(":");
        }
        return i2 == 1 ? "android:" : "";
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m36998(int i) {
        return (String) this.f47774.get(i);
    }
}
