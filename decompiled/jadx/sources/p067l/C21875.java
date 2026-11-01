package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩷֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P98B */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21875 implements InterfaceC20295, InterfaceC9311 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f68811;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f68812;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f68813;

    public /* synthetic */ C21875(Object obj, Object obj2, Object obj3) {
        this.f68812 = obj;
        this.f68813 = obj2;
        this.f68811 = obj3;
    }

    @Override // p067l.InterfaceC9311
    /* JADX INFO: renamed from: ֫ */
    public void mo12963(C12073 c12073) {
        String name;
        String name2;
        C12073 c12074 = (C12073) this.f68812;
        C4697 c4697 = (C4697) this.f68813;
        C18107 c18107 = (C18107) this.f68811;
        c12073.m27641();
        AbstractC17043 abstractC17043M27644 = c12074.m27644();
        AbstractC17043 abstractC17043M27645 = c12073.m27644();
        boolean zM41290 = c4697.m9969().m41290();
        if (abstractC17043M27644.getName().equals(abstractC17043M27645.getName())) {
            int i = R.string.MT_Protector;
            name = C7050.m16203(zM41290 ? R.string.MT_Protector : R.string.MT_Protector, abstractC17043M27644.getName());
            if (!zM41290) {
                i = R.string.MT_Protector;
            }
            name2 = C7050.m16203(i, abstractC17043M27645.getName());
        } else {
            name = abstractC17043M27644.getName();
            name2 = abstractC17043M27645.getName();
        }
        C9315 c9315 = new C9315(c12074.m27644(), c12073.m27644(), name, name2, c4697.m9970(), c18107.m41270());
        if (!zM41290) {
            c9315.m21562();
        }
        C9352.m21683(c4697.m9969(), c9315);
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f68812;
        C7816 c7816 = (C7816) this.f68813;
        InterfaceC7796 interfaceC7796 = (InterfaceC7796) this.f68811;
        C11245.m26044(interfaceC19370, OpenAuthTask.Duplex);
        c7816.m18085(interfaceC7796, abstractC17043, false);
    }
}
