package l;

import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.ܳ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14734 implements InterfaceC10795 {
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

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        return ((UMModuleRegister.SHARE_EVENT_VALUE_HIGH >> C2164.m7146(i)) & 1) != 0 || (i >= 9 && i <= 13) || i == 133;
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
