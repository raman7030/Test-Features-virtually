package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܰۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13731 implements InterfaceC7299 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f41006 = new ConcurrentMapC10942();

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ֫ */
    public final int mo19580(InterfaceC15347 interfaceC15347) {
        return ((C7382) interfaceC15347).f22723;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ܳ */
    public final int mo8575(Object obj) {
        return ((C7382) obj).f22723;
    }

    @Override // l.InterfaceC5888
    /* JADX INFO: renamed from: ܽ */
    public final int mo16505(Object obj) {
        C7382 c7382 = (C7382) obj;
        if (c7382 == null) {
            return -1;
        }
        return c7382.f22723;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7382 m33032(String str) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f41006;
        C7382 c7382 = (C7382) concurrentMapC10942.get(str);
        if (c7382 != null) {
            return c7382;
        }
        C7382 c7383 = new C7382(str);
        C7382 c7384 = (C7382) concurrentMapC10942.putIfAbsent(str, c7383);
        return c7384 == null ? c7383 : c7384;
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo19581() {
        return this.f41006.size() > 65536;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8571() {
        return new C22904(this.f41006.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f41006.size();
    }
}
