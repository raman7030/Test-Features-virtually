package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1F8 */
/* JADX INFO: loaded from: classes3.dex */
public class C12210 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 f34128;

    /* JADX INFO: renamed from: ۧ */
    public volatile C19015 f34129;

    /* JADX INFO: renamed from: ܽ */
    public final C0977 f34130 = new C0977();

    /* JADX INFO: renamed from: ܿ */
    public final ThreadLocal f34131 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩳ */
    public final C10321 f34132 = new C10321();

    public C12210(InterfaceC11799 interfaceC11799) {
        this.f34128 = interfaceC11799;
    }

    /* JADX INFO: renamed from: ۧ */
    public C19015 mo28190() {
        if (this.f34129 == null) {
            synchronized (this) {
                if (this.f34129 == null) {
                    this.f34129 = new C19015(this.f34128);
                }
            }
        }
        return this.f34129;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m28185(String str, C10198 c10198) {
        return C15525.computeIfAbsent(this.f34130, str, c10198);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28191(int i, String str) {
        this.f34132.mo23936(i, (Object) str);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo28184(String str) {
        int iMo26852 = this.f34132.mo26852(-1, str);
        if (iMo26852 == -1 && str.equals("android")) {
            return 1;
        }
        return iMo26852;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo28183(int i, String str) {
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
            if (str2 != null && !str2.isEmpty() && (i = this.f34132.mo26852(-1, str2)) == -1) {
                if (str2.equals("android")) {
                    i = 1;
                }
            }
            int iM28182 = m28182(this.f34128, i, strSubstring, strSubstring2);
            return (iM28182 == -1 && i == 1) ? m28182(C12981.m29762(), i, strSubstring, strSubstring2) : iM28182;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28182(InterfaceC11799 interfaceC11799, int i, String str, String str2) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (i == -1 || interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.getTypeName().equals(str)) {
                        int iMo5196 = interfaceC3080.mo5196(new C16503(1, str2));
                        if (iMo5196 == -1) {
                            break;
                        }
                        return (interfaceC6434.mo14722() << 24) | (interfaceC3080.mo5199() << 16) | iMo5196;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m28192() {
        this.f34131.set(new ArrayList());
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m28186() {
        ThreadLocal threadLocal = this.f34131;
        List list = (List) threadLocal.get();
        C12826.requireNonNull(list);
        List list2 = list;
        threadLocal.remove();
        return list2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28187(int i, int i2, int i3) {
        List list = (List) this.f34131.get();
        C12826.requireNonNull(list);
        list.add(new C25209(i, i2, i3));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28188(C6925 c6925, int i, int i2) {
        List list = (List) this.f34131.get();
        C12826.requireNonNull(list);
        if (c6925.mo7252() || c6925.mo7250() || c6925.mo7248()) {
            list.add(new C25209(c6925, i, i2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28189(C6925 c6925, C3199 c3199) {
        m28188(c6925, c3199.m24372(), c3199.m24371());
    }
}
