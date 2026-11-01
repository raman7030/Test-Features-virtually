package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17644 {

    /* JADX INFO: renamed from: ֫ */
    public final C19577 f52706;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8848 f52707;

    /* JADX INFO: renamed from: ܽ */
    public final C6836 f52708;

    /* JADX INFO: renamed from: ܿ */
    public final int f52709;

    /* JADX INFO: renamed from: ᩳ */
    public final int f52710;

    /* JADX INFO: renamed from: ֫ */
    public abstract C22930 mo25213(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo25214(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ۧ */
    public abstract C22930 mo25215(int i);

    public AbstractC17644(int i, int i2, InterfaceC8848 interfaceC8848, C6836 c6836) {
        this.f52710 = i;
        this.f52709 = i2;
        this.f52707 = interfaceC8848;
        this.f52708 = c6836;
        this.f52706 = new C19577(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC8848 m40171() {
        Iterator it = this.f52707.mo8421().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            C19577 c19577 = this.f52706;
            if (zHasNext) {
                C23600 c23600 = (C23600) it.next();
                int i3 = c23600.f75121;
                int i4 = c23600.f75123;
                int i5 = i3 - i4;
                int i6 = 0;
                while (i6 < i5) {
                    C22930 c22930Mo25213 = mo25213(i4 + i6);
                    C22930 c22930Mo25215 = mo25215(c23600.f75124 + i6);
                    int i7 = c22930Mo25213.f72163;
                    int i8 = c22930Mo25215.f72163;
                    int i9 = c22930Mo25213.f72164;
                    int i10 = c22930Mo25215.f72164;
                    mo25214(i, i7, i2, i8);
                    c19577.m43009(i7, i8, i9, i10);
                    i6++;
                    i = i9;
                    i2 = i10;
                }
            } else {
                mo25214(i, this.f52710, i2, this.f52709);
                return C24941.m54812(c19577.m44486());
            }
        }
    }
}
