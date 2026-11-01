package p067l;

/* JADX INFO: renamed from: l.ᩳۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9WM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19435 extends AbstractC4012 {

    /* JADX INFO: renamed from: ᩶ */
    public static InterfaceC4410 f59184 = C13128.m30023(AbstractC19435.class.getName());

    /* JADX INFO: renamed from: ᩹ */
    public int f59185;

    /* JADX INFO: renamed from: ֫ */
    public abstract C16416 mo36588(C16416 c16416);

    /* JADX INFO: renamed from: ۧ */
    public abstract C16416 mo36589(C16416 c16416);

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo36590();

    public AbstractC19435(C10738 c10738) {
        super(c10738);
        this.f59185 = 0;
    }

    @Override // p067l.AbstractC4012
    public final String toString() {
        return mo7991() + " count: " + this.f59185;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC4410 interfaceC4410 = f59184;
        try {
            if (!m7986().m24720() && !m7986().m24711()) {
                int i = this.f59185;
                this.f59185 = i + 1;
                if (i < 3) {
                    interfaceC4410.mo9177("{}.run() JmDNS {}", mo7991(), mo36590());
                    C16416 c16416Mo36589 = mo36589(new C16416(0));
                    if (m7986().m24722()) {
                        c16416Mo36589 = mo36588(c16416Mo36589);
                    }
                    if (c16416Mo36589.m44912()) {
                        return;
                    }
                    m7986().m24698(c16416Mo36589);
                    return;
                }
                cancel();
                return;
            }
            cancel();
        } catch (Throwable th) {
            interfaceC4410.mo9178(mo7991() + ".run() exception ", th);
            m7986().m24724();
        }
    }
}
