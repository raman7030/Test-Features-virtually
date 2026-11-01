package p067l;

import bin.p000mt.plus.R;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩹ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23509 implements InterfaceC4595, InterfaceC20295, InterfaceC9544, InterfaceC24274 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f74901;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f74902;

    public /* synthetic */ C23509(int i, Object obj) {
        this.f74901 = i;
        this.f74902 = obj;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        switch (this.f74901) {
            case 0:
                ((InterfaceC12781) this.f74902).mo24770(i);
                break;
            default:
                ((C13909) this.f74902).mo13474(i);
                break;
        }
    }

    @Override // p067l.InterfaceC24274
    /* JADX INFO: renamed from: ֫ */
    public int mo4456(String str, boolean z) {
        return ((HashSet) this.f74902).contains(str) ? 1 : 2;
    }

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        C8823 c8823 = (C8823) this.f74902;
        return c8823.m9012().getString(R.string.MT_Protector, Integer.valueOf(c8823.m13265().getInt(c8823.m9037(), 10)));
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        C18010.m40989((C18107) this.f74902, abstractC17043);
    }
}
