package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R69D */
/* JADX INFO: loaded from: classes4.dex */
public final class C9658 extends C11069 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f29252;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f29253;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f29254;

    @Override // l.C11069, l.AbstractC8246
    /* JADX INFO: renamed from: ܿ */
    public final void mo12088() {
    }

    public C9658(C1190 c1190, int i, InterfaceC8999 interfaceC8999) {
        int key;
        super(c1190, i, interfaceC8999);
        int iM4012 = c1190.m4012(i);
        this.f29253 = new ArrayList();
        boolean z = true;
        if (iM4012 >= 0) {
            key = 0;
            boolean z2 = true;
            for (InterfaceC18007 interfaceC18007 : interfaceC8999.mo8107()) {
                if (z2) {
                    key = interfaceC18007.getKey();
                    z2 = false;
                }
                C19536 c19536M15515 = c1190.m4014().m15515(new C19536(c1190.f4289, interfaceC18007.mo12019() + iM4012, "pswitch_"));
                if (c19536M15515.m44936()) {
                    c19536M15515.m44935(String.format("%s, 0x%x", c19536M15515.m44940(), Integer.valueOf(interfaceC18007.getKey())));
                } else {
                    c19536M15515.m44935(String.format("0x%x", Integer.valueOf(interfaceC18007.getKey())));
                }
                this.f29253.add(new C23768(c19536M15515));
            }
        } else {
            this.f29252 = true;
            key = 0;
            for (InterfaceC18007 interfaceC18008 : interfaceC8999.mo8107()) {
                if (z) {
                    key = interfaceC18008.getKey();
                    z = false;
                }
                this.f29253.add(new C6835(interfaceC18008.mo12019()));
            }
        }
        this.f29254 = key;
    }

    @Override // l.C11069, l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        if (this.f29252) {
            c3438 = new C8041(c3438);
        }
        c3438.getClass();
        c3438.write(".packed-switch ", 0, 15);
        int i = this.f29254;
        C20241.m46486(c3438, i);
        c3438.m10512();
        c3438.write(10);
        boolean z = this.f33244.f4289.f72438;
        for (AbstractC20947 abstractC20947 : this.f29253) {
            if (abstractC20947 instanceof C23768) {
                ((C23768) abstractC20947).f76937.m44938(c3438);
            } else {
                abstractC20947.mo18519(c3438);
            }
            String str = String.format("  #%08x", Integer.valueOf(i));
            c3438.write(str, 0, str.length());
            if (z) {
                m27459(c3438, i);
            }
            c3438.write(10);
            i++;
        }
        c3438.m10508();
        c3438.write(".end packed-switch", 0, 18);
        return true;
    }
}
