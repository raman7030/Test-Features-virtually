package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0485 extends AbstractC4203 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f2094;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2141(C5138 c5138, Object obj) {
        return (Void) c5138.f16077.mo2962(this, (Set) obj);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2142(C8541 c8541, Object obj) {
        Set set = (Set) obj;
        if ((c8541.f13890.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !set.add(c8541)) {
            return null;
        }
        c8541.mo12939().mo2962(this, set);
        return null;
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2143(C15014 c15014, Object obj) {
        Set set = (Set) obj;
        if (!set.add(c15014)) {
            return null;
        }
        c15014.mo12939().mo2962(this, set);
        c15014.f26106.mo2962(this, set);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2144(C19831 c19831, Object obj) {
        c19831.f64066.mo2962(this, (Set) obj);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2145(C19955 c19955, Object obj) {
        final Set set = (Set) obj;
        if (c19955.mo5146()) {
            C19846.forEach(this.f2094.m17565(c19955), new Consumer() { // from class: l.ᩴܶ֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj2) {
                    ((AbstractC4308) obj2).mo2962(this.f59404, set);
                }
            });
            return null;
        }
        C19846.forEach(c19955.mo12934(), new Consumer() { // from class: l.᩵ܶ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj2) {
                ((AbstractC4308) obj2).mo2962(this.f63112, set);
            }
        });
        return null;
    }

    public C0485(C6319 c6319) {
        this.f2094 = c6319;
    }
}
