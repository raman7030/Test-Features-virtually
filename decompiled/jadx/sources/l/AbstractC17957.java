package l;

/* JADX INFO: renamed from: l.ᩳۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9WM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17957 extends AbstractC1729 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f55987 = C11321.m27962(AbstractC17957.class.getName());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f55988;

    /* JADX INFO: renamed from: ֫ */
    public abstract C14780 mo34455(C14780 c14780);

    /* JADX INFO: renamed from: ۧ */
    public abstract C14780 mo34456(C14780 c14780);

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo34457();

    public AbstractC17957(C8806 c8806) {
        super(c8806);
        this.f55988 = 0;
    }

    @Override // l.AbstractC1729
    public final String toString() {
        return mo5781() + " count: " + this.f55988;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC2148 interfaceC2148 = f55987;
        try {
            if (!m5776().m22750() && !m5776().m22741()) {
                int i = this.f55988;
                this.f55988 = i + 1;
                if (i < 3) {
                    interfaceC2148.mo7082("{}.run() JmDNS {}", mo5781(), mo34457());
                    C14780 c14780Mo34456 = mo34456(new C14780(0));
                    if (m5776().m22752()) {
                        c14780Mo34456 = mo34455(c14780Mo34456);
                    }
                    if (c14780Mo34456.m42651()) {
                        return;
                    }
                    m5776().m22728(c14780Mo34456);
                    return;
                }
                cancel();
                return;
            }
            cancel();
        } catch (Throwable th) {
            interfaceC2148.mo7083(mo5781() + ".run() exception ", th);
            m5776().m22754();
        }
    }
}
