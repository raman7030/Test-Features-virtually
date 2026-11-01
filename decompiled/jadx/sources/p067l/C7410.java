package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7410 extends C6508 {

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f19388;

    public C7410(C5876 c5876, char[] cArr, int i) {
        super(c5876, cArr, i);
        this.f19388 = new HashMap();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final HashMap m17127() {
        return this.f19388;
    }

    @Override // p067l.C6508
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7217 mo14928(int i, int i2, EnumC2522 enumC2522) {
        char[] cArrM31650 = m31650(i, i2);
        InterfaceC7217 interfaceC7217Mo14928 = super.mo14928(i, i2, enumC2522);
        this.f19388.put(interfaceC7217Mo14928, new C3386(i, i2, new String(cArrM31650)));
        return interfaceC7217Mo14928;
    }
}
