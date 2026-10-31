package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public class C23063 extends AbstractC12669 {
    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return Integer.valueOf(abstractC4308.mo3258().ordinal());
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12688(C0779 c0779, Object obj) {
        return Integer.valueOf(System.identityHashCode(c0779));
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        return Integer.valueOf(((Integer) c5138.f16077.mo2962(this, (Object) null)).intValue() + 12);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public /* bridge */ /* synthetic */ Object mo2142(C8541 c8541, Object obj) {
        return mo6246(c8541);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7394(C10658 c10658, Object obj) {
        int iOrdinal = EnumC9454.METHOD.ordinal();
        for (C2609 c2609 = c10658.f32059; c2609.f8241 != null; c2609 = c2609.f8241) {
            iOrdinal = (iOrdinal << 5) + ((Integer) ((AbstractC4308) c2609.f8240).mo2962(this, (Object) null)).intValue();
        }
        return Integer.valueOf(((Integer) c10658.f32060.mo2962(this, (Object) null)).intValue() + (iOrdinal << 5));
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return 0;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        int iHashCode = c19831.f64065.hashCode();
        AbstractC4308 abstractC4308 = c19831.f64066;
        if (abstractC4308 != null) {
            iHashCode = (iHashCode * 127) + ((Integer) abstractC4308.mo2962(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        int iHashCode = c19955.f13890.mo16083().hashCode() + (((Integer) c19955.mo4958().mo2962(this, (Object) null)).intValue() * 127);
        Iterator it = c19955.mo12938().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 127) + ((Integer) ((AbstractC4308) it.next()).mo2962(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    /* JADX INFO: renamed from: ֫ */
    public Integer mo6246(C8541 c8541) {
        return Integer.valueOf(System.identityHashCode(c8541));
    }
}
