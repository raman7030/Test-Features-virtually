package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EX */
/* JADX INFO: loaded from: classes4.dex */
public class C14587 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f44664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C17515 f44665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4488 f44666 = new C4488();

    public C14587(InterfaceC9922 interfaceC9922) {
        this.f44664 = interfaceC9922;
        if (interfaceC9922.mo14956() > 1) {
            Iterator it = interfaceC9922.mo21936().iterator();
            int i = 1;
            while (it.hasNext()) {
                int iMo12858 = ((InterfaceC4277) it.next()).mo12858();
                if (!this.f44666.mo2422(iMo12858)) {
                    if (iMo12858 == 1) {
                        this.f44666.mo2318(1, "android");
                    } else if (iMo12858 == 127) {
                        this.f44666.mo2318(127, "app");
                    } else {
                        C4488 c4488 = this.f44666;
                        StringBuilder sb = new StringBuilder("app");
                        i++;
                        sb.append(i);
                        c4488.mo2318(iMo12858, sb.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17515 m34848() {
        if (this.f44665 == null) {
            synchronized (this) {
                if (this.f44665 == null) {
                    this.f44665 = new C17515(this.f44664);
                }
            }
        }
        return this.f44665;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 m34846() {
        return this.f44664;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0748 m34845(int i) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        InterfaceC9922 interfaceC9922 = this.f44664;
        InterfaceC0748 interfaceC0748M34843 = m34843(interfaceC9922, i2, i3);
        return (interfaceC0748M34843 == null && i2 == 1 && !interfaceC9922.mo23369()) ? m34843(C11166.m27700(), i2, i3) : interfaceC0748M34843;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0748 m34843(InterfaceC9922 interfaceC9922, int i, int i2) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        return interfaceC0748;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo32239(int i, int i2) {
        int i3 = i2 >>> 24;
        int i4 = i3 & 255;
        int i5 = i2 >>> 16;
        int i6 = i5 & 255;
        int i7 = i2 & 65535;
        String strM34842 = m34842(i, this.f44664, i4, i6, i7);
        if (strM34842 == null && i4 == 1 && !this.f44664.mo23369()) {
            strM34842 = m34842(i, C11166.m27700(), i4, i6, i7);
        }
        return strM34842 == null ? new String(new char[]{"0123456789abcdef".charAt((i2 >>> 28) & 15), "0123456789abcdef".charAt(i3 & 15), "0123456789abcdef".charAt((i2 >>> 20) & 15), "0123456789abcdef".charAt(i5 & 15), "0123456789abcdef".charAt((i2 >>> 12) & 15), "0123456789abcdef".charAt((i2 >>> 8) & 15), "0123456789abcdef".charAt((i2 >>> 4) & 15), "0123456789abcdef".charAt(i2 & 15)}) : strM34842;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m34842(int i, InterfaceC9922 interfaceC9922, int i2, int i3, int i4) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i2) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i3) {
                        Iterator it = interfaceC0748.mo2872().iterator();
                        while (it.hasNext()) {
                            InterfaceC21211 interfaceC21211Mo2346 = ((InterfaceC7099) it.next()).mo2346(i4);
                            if (interfaceC21211Mo2346 != null) {
                                return m34844(i, i2) + interfaceC0748.getTypeName() + "/" + interfaceC21211Mo2346.mo29406();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34844(int i, int i2) {
        if (i != 1 && i == i2) {
            return "";
        }
        String str = (String) this.f44666.get(i2);
        if (str != null) {
            return str.concat(":");
        }
        return i2 == 1 ? "android:" : "";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m34847(int i) {
        return (String) this.f44666.get(i);
    }
}
