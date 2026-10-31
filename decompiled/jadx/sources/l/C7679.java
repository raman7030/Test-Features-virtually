package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7679 implements InterfaceC10795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f23720;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f23721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C14028 f23722;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f23723;

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    public C7679(int i, InterfaceC10795 interfaceC10795, InterfaceC10795 interfaceC10796) {
        this.f23721 = i;
        this.f23720 = interfaceC10795;
        this.f23723 = interfaceC10796;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7679 m20568(InterfaceC10795 interfaceC10795) {
        return new C7679(2, interfaceC10795, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m20564(InterfaceC10795 interfaceC10795, InterfaceC10795 interfaceC10796, boolean z) {
        C7679 c7679 = new C7679(0, interfaceC10795, interfaceC10796);
        return z ? new C6268(c7679) : c7679;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m20567(InterfaceC10795 interfaceC10795, InterfaceC10795 interfaceC10796, boolean z) {
        C7679 c7679 = new C7679(1, interfaceC10795, interfaceC10796);
        return z ? new C6268(c7679) : c7679;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m20569(InterfaceC10795 interfaceC10795) {
        if (interfaceC10795 instanceof C6268) {
            ((C6268) interfaceC10795).f19410.m20565();
        } else if (interfaceC10795 instanceof C7679) {
            ((C7679) interfaceC10795).m20565();
        }
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        return m20565().mo2465(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14028 m20565() {
        C14028 c14028M20566;
        C14028 c14028 = this.f23722;
        if (c14028 != null) {
            return c14028;
        }
        synchronized (this) {
            c14028M20566 = this.f23722;
            if (c14028M20566 == null) {
                c14028M20566 = m20566(this);
                this.f23722 = c14028M20566;
            }
        }
        return c14028M20566;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14028 m20566(C7679 c7679) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = -2;
        arrayList.add(new C11913(c7679, -1, -2));
        while (!arrayList.isEmpty()) {
            C11913 c11913 = (C11913) C18566.m43105(arrayList, 1);
            InterfaceC10795 interfaceC10795 = c11913.f35613;
            if (interfaceC10795 instanceof C6268) {
                c11913.f35613 = ((C6268) interfaceC10795).f19410;
            }
            InterfaceC10795 interfaceC10796 = c11913.f35613;
            if (interfaceC10796 instanceof C7679) {
                C7679 c76710 = (C7679) interfaceC10796;
                InterfaceC10795 interfaceC10797 = c76710.f23720;
                int i = c76710.f23721;
                if (i == 2) {
                    c11913.f35613 = interfaceC10797;
                    int i2 = c11913.f35612;
                    c11913.f35612 = c11913.f35611;
                    c11913.f35611 = i2;
                } else {
                    int i3 = c11913.f35614;
                    if (i3 == 0) {
                        c11913.f35614 = 1;
                        arrayList.add(new C11913(c76710.f23723, c11913.f35612, c11913.f35611));
                    } else if (i3 == 1) {
                        c11913.f35614 = 2;
                        arrayList.add(new C11913(interfaceC10797, i == 0 ? size : c11913.f35612, i == 1 ? size : c11913.f35611));
                    } else {
                        C18473.m42953(arrayList, 1);
                    }
                }
            } else {
                size = arrayList2.size();
                arrayList2.add(new C23201(c11913.f35613, c11913.f35612, c11913.f35611));
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return new C14028(arrayList2, size);
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return m20568(this);
    }
}
