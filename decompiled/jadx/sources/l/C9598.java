package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final class C9598 extends AbstractC4203 {
    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        return (Boolean) c5138.f16077.mo2962(this, (Void) obj);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        return Boolean.valueOf((c8541.f13890.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0);
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2143(C15014 c15014, Object obj) {
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        return (Boolean) c19831.f64066.mo2962(this, (Void) obj);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        Void r3 = (Void) obj;
        if ((c19955 instanceof C7835) || (c19955 instanceof C5843)) {
            return Boolean.FALSE;
        }
        Iterator it = c19955.mo12934().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((AbstractC4308) it.next()).mo2962(this, r3)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
