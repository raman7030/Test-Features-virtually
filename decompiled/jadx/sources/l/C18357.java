package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18357 extends C4065 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Map f57046;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C19643 f57047;

    public C18357() {
        throw null;
    }

    public C18357(InterfaceC21725 interfaceC21725, InterfaceC4454 interfaceC4454, C15036 c15036, Map map) {
        super(interfaceC21725, interfaceC4454, c15036);
        this.f57046 = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42784(C19643 c19643) {
        this.f57047 = c19643;
        m12221();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // l.C4065
    /* JADX INFO: renamed from: ۧ */
    public final C8353 mo12206(C8353 c8353) {
        C19643 c19643;
        C19643 c19644 = this.f57047;
        if (c19644 == null) {
            c19644 = c8353.f25602;
        }
        if (c19644 != null && (c19643 = (C19643) this.f57046.get(c19644.f63386)) != null) {
            c19644 = c19643;
        }
        C23896 c23896 = c8353.f25612;
        if (c23896 == null) {
            c23896 = null;
        } else {
            int iM52639 = c23896.m52639();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iM52639) {
                    i2 = -1;
                    break;
                }
                InterfaceC14723 interfaceC14723M52640 = c23896.m52640(i2);
                if ((interfaceC14723M52640 instanceof C9689) && "com.apple.streaming.transportStreamTimestamp".equals(((C9689) interfaceC14723M52640).f29300)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (iM52639 == 1) {
                    c23896 = null;
                } else {
                    InterfaceC14723[] interfaceC14723Arr = new InterfaceC14723[iM52639 - 1];
                    while (i < iM52639) {
                        if (i != i2) {
                            interfaceC14723Arr[i < i2 ? i : i - 1] = c23896.m52640(i);
                        }
                        i++;
                    }
                    c23896 = new C23896(interfaceC14723Arr);
                }
            }
        }
        if (c19644 != c8353.f25602 || c23896 != c8353.f25612) {
            C1297 c1297M21948 = c8353.m21948();
            c1297M21948.m4447(c19644);
            c1297M21948.m4449(c23896);
            c8353 = c1297M21948.m4440();
        }
        return super.mo12206(c8353);
    }
}
