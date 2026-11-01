package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Y2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22118 extends AbstractC4012 {

    /* JADX INFO: renamed from: ۗ */
    public static InterfaceC4410 f69978 = C13128.m30023(AbstractC22118.class.getName());

    /* JADX INFO: renamed from: ۙ */
    public static int f69979 = C14760.f42088;

    /* JADX INFO: renamed from: ᩶ */
    public final int f69980;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC9396 f69981;

    /* JADX INFO: renamed from: ֫ */
    public abstract C16416 mo20144(C16416 c16416);

    /* JADX INFO: renamed from: ֫ */
    public abstract C16416 mo20145(C21467 c21467, C16416 c16416);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo20146();

    /* JADX INFO: renamed from: ܿ */
    public abstract C16416 mo20147();

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo20148();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo20149();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo20150();

    /* JADX INFO: renamed from: ۡ */
    public static int m49903() {
        return f69979;
    }

    public AbstractC22118(C10738 c10738, int i) {
        super(c10738);
        this.f69981 = null;
        this.f69980 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m49909() {
        return this.f69980;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49905(EnumC9396 enumC9396) {
        synchronized (m7986()) {
            m7986().m24704(this, enumC9396);
        }
        Iterator it = ((ConcurrentMapC12768) m7986().m24721()).values().iterator();
        while (it.hasNext()) {
            ((C21467) ((AbstractC12000) it.next())).m48644(this, enumC9396);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m49907() {
        synchronized (m7986()) {
            m7986().m24703(this);
        }
        Iterator it = ((ConcurrentMapC12768) m7986().m24721()).values().iterator();
        while (it.hasNext()) {
            ((C21467) ((AbstractC12000) it.next())).m48643(this);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C16416 c16416Mo20147 = mo20147();
        try {
            if (!mo20148()) {
                cancel();
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (m7986()) {
                if (m7986().m24719(this, this.f69981)) {
                    f69978.mo9187("{}.run() JmDNS {} {}", mo7991(), mo20150(), m7986().getName());
                    arrayList.add(m7986());
                    c16416Mo20147 = mo20144(c16416Mo20147);
                }
            }
            Iterator it = ((ConcurrentMapC12768) m7986().m24721()).values().iterator();
            while (it.hasNext()) {
                C21467 c21467 = (C21467) ((AbstractC12000) it.next());
                synchronized (c21467) {
                    if (c21467.m48652(this, this.f69981)) {
                        f69978.mo9187("{}.run() JmDNS {} {}", mo7991(), mo20150(), c21467.mo27470());
                        arrayList.add(c21467);
                        c16416Mo20147 = mo20145(c21467, c16416Mo20147);
                    }
                }
            }
            if (!c16416Mo20147.m44912()) {
                f69978.mo9187("{}.run() JmDNS {} #{}", mo7991(), mo20150(), this.f69981);
                m7986().m24698(c16416Mo20147);
                m49904(arrayList);
                mo20146();
                return;
            }
            m49904(arrayList);
            cancel();
        } catch (Throwable th) {
            f69978.mo9178(mo7991() + ".run() exception ", th);
            mo20149();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49904(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC5688 interfaceC5688 = (InterfaceC5688) it.next();
            synchronized (interfaceC5688) {
                interfaceC5688.mo12669(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final EnumC9396 m49906() {
        return this.f69981;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49908(EnumC9396 enumC9396) {
        this.f69981 = enumC9396;
    }
}
