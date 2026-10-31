package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20353 extends C3524 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3419 f65719;

    public C20353(C3419 c3419) {
        this.f65719 = c3419;
    }

    @Override // l.InterfaceC6325
    /* JADX INFO: renamed from: ֫ */
    public final Boolean mo17595(C2609 c2609) {
        if (c2609.m8245() < 2) {
            return Boolean.FALSE;
        }
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            InterfaceC10559 interfaceC10559 = (InterfaceC10559) it.next();
            C3419 c3419 = this.f65719;
            c3419.m10381();
            c3419.f10795.println(interfaceC10559.toString());
        }
        return Boolean.TRUE;
    }
}
