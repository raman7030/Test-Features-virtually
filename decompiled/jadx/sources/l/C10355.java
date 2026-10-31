package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1F8 */
/* JADX INFO: loaded from: classes3.dex */
public class C10355 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f31166;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C17515 f31167;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2727 f31168 = new C2727();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f31169 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8367 f31170 = new C8367();

    public C10355(InterfaceC9922 interfaceC9922) {
        this.f31166 = interfaceC9922;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17515 mo26163() {
        if (this.f31167 == null) {
            synchronized (this) {
                if (this.f31167 == null) {
                    this.f31167 = new C17515(this.f31166);
                }
            }
        }
        return this.f31167;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m26158(String str, C8238 c8238) {
        return C13843.computeIfAbsent(this.f31168, str, c8238);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26164(int i, String str) {
        this.f31170.mo21965(i, (Object) str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo26157(String str) {
        int iMo24837 = this.f31170.mo24837(-1, str);
        if (iMo24837 == -1 && str.equals("android")) {
            return 1;
        }
        return iMo24837;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo26156(int i, String str) {
        String str2;
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            if (str2 != null && !str2.isEmpty() && (i = this.f31170.mo24837(-1, str2)) == -1) {
                if (str2.equals("android")) {
                    i = 1;
                }
            }
            int iM26155 = m26155(this.f31166, i, strSubstring, strSubstring2);
            return (iM26155 == -1 && i == 1) ? m26155(C11166.m27700(), i, strSubstring, strSubstring2) : iM26155;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26155(InterfaceC9922 interfaceC9922, int i, String str, String str2) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (i == -1 || interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(str)) {
                        int iMo2867 = interfaceC0748.mo2867(new C14873(1, str2));
                        if (iMo2867 == -1) {
                            break;
                        }
                        return (interfaceC4277.mo12858() << 24) | (interfaceC0748.mo2870() << 16) | iMo2867;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m26165() {
        this.f31169.set(new ArrayList());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m26159() {
        ThreadLocal threadLocal = this.f31169;
        List list = (List) threadLocal.get();
        C11003.requireNonNull(list);
        List list2 = list;
        threadLocal.remove();
        return list2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26160(int i, int i2, int i3) {
        List list = (List) this.f31169.get();
        C11003.requireNonNull(list);
        list.add(new C24032(i, i2, i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26161(C4794 c4794, int i, int i2) {
        List list = (List) this.f31169.get();
        C11003.requireNonNull(list);
        if (c4794.mo5009() || c4794.mo5007() || c4794.mo5005()) {
            list.add(new C24032(c4794, i, i2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26162(C4794 c4794, C0874 c0874) {
        m26161(c4794, c0874.m22403(), c0874.m22402());
    }
}
