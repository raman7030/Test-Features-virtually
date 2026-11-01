package p067l;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩹ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class C23267 extends C15928 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Bundle f73117;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C11868 f73118;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractServiceC16599 f73119;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f73120;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23267(AbstractServiceC16599 abstractServiceC16599, Object obj, C11868 c11868, String str, Bundle bundle) {
        super(obj);
        this.f73119 = abstractServiceC16599;
        this.f73118 = c11868;
        this.f73120 = str;
        this.f73117 = bundle;
    }

    @Override // p067l.C15928
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11032() {
        Bundle bundle = this.f73117;
        C0977 c0977 = this.f73119.f48755;
        C11868 c11868 = this.f73118;
        InterfaceC7212 interfaceC7212 = c11868.f33073;
        if (c0977.getOrDefault(((C3188) interfaceC7212).f6126.getBinder(), null) != c11868) {
            int i = AbstractServiceC16599.f48751;
            return;
        }
        if ((m36045() & 1) != 0) {
            int i2 = AbstractServiceC16599.f48751;
        }
        try {
            ((C3188) interfaceC7212).m5488(this.f73120, null, bundle);
        } catch (RemoteException unused) {
        }
    }
}
