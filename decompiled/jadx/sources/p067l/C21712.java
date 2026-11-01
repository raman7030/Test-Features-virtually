package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes5.dex */
public final class C21712 extends C5718 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5618 f68395;

    public C21712(C5618 c5618) {
        this.f68395 = c5618;
    }

    @Override // p067l.InterfaceC8380
    /* JADX INFO: renamed from: ֫ */
    public final Boolean mo19535(C4848 c4848) {
        if (c4848.m10289() < 2) {
            return Boolean.FALSE;
        }
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            InterfaceC12404 interfaceC12404 = (InterfaceC12404) it.next();
            C5618 c5618 = this.f68395;
            c5618.m12420();
            c5618.f13601.println(interfaceC12404.toString());
        }
        return Boolean.TRUE;
    }
}
