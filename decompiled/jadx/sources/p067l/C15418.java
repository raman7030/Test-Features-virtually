package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܰۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15418 implements InterfaceC9305 {

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f44085 = new ConcurrentMapC12768();

    @Override // p067l.InterfaceC9305
    /* JADX INFO: renamed from: ֫ */
    public final int mo21548(InterfaceC16954 interfaceC16954) {
        return ((C9384) interfaceC16954).f25635;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C9384) obj).f25635;
    }

    @Override // p067l.InterfaceC7964
    /* JADX INFO: renamed from: ܽ */
    public final int mo18431(Object obj) {
        C9384 c9384 = (C9384) obj;
        if (c9384 == null) {
            return -1;
        }
        return c9384.f25635;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9384 m35146(String str) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f44085;
        C9384 c9384 = (C9384) concurrentMapC12768.get(str);
        if (c9384 != null) {
            return c9384;
        }
        C9384 c9385 = new C9384(str);
        C9384 c9386 = (C9384) concurrentMapC12768.putIfAbsent(str, c9385);
        return c9386 == null ? c9385 : c9386;
    }

    @Override // p067l.InterfaceC9305
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo21549() {
        return this.f44085.size() > 65536;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C24136(this.f44085.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f44085.size();
    }
}
