package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes.dex */
public final class C23543 extends AbstractC20722 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC21972 f75595 = new C16487();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20846 f75596;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f75597;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12918 f75598;

    public C23543(C12918 c12918, int i, C20846 c20846) {
        this.f75598 = c12918;
        this.f75597 = i;
        this.f75596 = c20846;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC21972 interfaceC21972;
        String type;
        C18729 c18729M11939 = this.f75598.m31418().m11939(this.f75597);
        int iM43360 = c18729M11939.m43360();
        C20846 c20846 = this.f75596;
        int iMo3818 = c20846.mo3818();
        InterfaceC21972[] interfaceC21972Arr = new InterfaceC21972[iMo3818];
        InterfaceC21972 interfaceC21973 = f75595;
        Arrays.fill(interfaceC21972Arr, interfaceC21973);
        C16611 c16611 = c20846.f67492;
        C0259 c0259 = new C0259(c16611.mo3565(), c16611.m39128(), new C14370(this, c18729M11939, c18729M11939.m43368()));
        int i = 0;
        if (!EnumC15657.STATIC.m36866(c16611.f51042)) {
            interfaceC21972Arr[0] = new C17899(this);
            i = 1;
        }
        while (c0259.hasNext()) {
            interfaceC21972Arr[i] = (InterfaceC21972) c0259.next();
            i++;
        }
        if (i < iMo3818) {
            int i2 = iMo3818 - 1;
            while (true) {
                i--;
                if (i <= -1 || ((type = (interfaceC21972 = interfaceC21972Arr[i]).getType()) != null && ((type.equals("J") || type.equals("D")) && (i2 = i2 - 1) == i))) {
                    break;
                }
                interfaceC21972Arr[i2] = interfaceC21972;
                interfaceC21972Arr[i] = interfaceC21973;
                i2--;
            }
        }
        int iM43364 = c18729M11939.m43364();
        c18729M11939.m43359();
        return new C17193(this, this.f75598, iM43364, iM43360, interfaceC21972Arr);
    }

    @Override // l.AbstractC20722
    /* JADX INFO: renamed from: ۧ */
    public final Iterator mo18118() {
        C18729 c18729M11939 = this.f75598.m31418().m11939(this.f75597);
        c18729M11939.m43354();
        return new C14370(this, c18729M11939, c18729M11939.m43368());
    }
}
