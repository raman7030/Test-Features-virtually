package p067l;

import java.net.InetAddress;
import java.util.Random;

/* JADX INFO: renamed from: l.᩹᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23793 extends AbstractC15351 {

    /* JADX INFO: renamed from: ۖ */
    public static InterfaceC4410 f75654 = C13128.m30023(AbstractC23793.class.getName());

    /* JADX INFO: renamed from: ۜ */
    public long f75655;

    /* JADX INFO: renamed from: ۡ */
    public InetAddress f75656;

    /* JADX INFO: renamed from: ۢ */
    public final int f75657;

    /* JADX INFO: renamed from: ܺ */
    public int f75658;

    /* JADX INFO: renamed from: ᩷ */
    public int f75659;

    /* JADX INFO: renamed from: ֫ */
    public abstract C16771 mo5053(C10738 c10738);

    /* JADX INFO: renamed from: ֫ */
    public abstract C21467 mo5054(boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5056(C19099 c19099);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo5057(C10738 c10738);

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo5058(C10738 c10738);

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo5059(AbstractC23793 abstractC23793);

    /* JADX INFO: renamed from: ᩴ */
    public abstract boolean mo5060();

    public AbstractC23793(String str, EnumC13420 enumC13420, EnumC8055 enumC8055, boolean z, int i) {
        super(str, enumC13420, enumC8055, z);
        this.f75658 = i;
        this.f75655 = System.currentTimeMillis();
        int iNextInt = new Random().nextInt(3);
        this.f75657 = iNextInt;
        this.f75659 = iNextInt + 80;
    }

    @Override // p067l.AbstractC15351
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC23793) && super.equals(obj) && mo5059((AbstractC23793) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52881(C13065 c13065) {
        try {
            for (AbstractC23793 abstractC23793 : c13065.m44909()) {
                if (equals(abstractC23793) && abstractC23793.f75658 > this.f75658 / 2) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            f75654.mo9178("suppressedBy() message " + c13065 + " exception ", (Throwable) e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m52879(int i) {
        return (((long) i) * ((long) this.f75658) * 10) + this.f75655;
    }

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34939(long j) {
        return m52879(100) <= j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m52886(long j) {
        return m52879(50) <= j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m52888(long j) {
        return m52879(this.f75659) <= j;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m52883() {
        int i = this.f75659 + 5;
        this.f75659 = i;
        if (i > 100) {
            this.f75659 = 100;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52885(AbstractC23793 abstractC23793) {
        this.f75655 = abstractC23793.f75655;
        this.f75658 = abstractC23793.f75658;
        this.f75659 = this.f75657 + 80;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m52889(long j) {
        this.f75655 = j;
        this.f75658 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52880(InetAddress inetAddress) {
        this.f75656 = inetAddress;
    }

    /* JADX INFO: renamed from: ܺ */
    public final InetAddress m52887() {
        return this.f75656;
    }

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public void mo5055(StringBuilder sb) {
        int iMax = (int) Math.max(0L, (m52879(100) - System.currentTimeMillis()) / 1000);
        sb.append(" ttl: '");
        sb.append(iMax);
        sb.append('/');
        sb.append(this.f75658);
        sb.append('\'');
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m52882() {
        return this.f75658;
    }

    /* JADX INFO: renamed from: ۡ */
    public final long m52884() {
        return this.f75655;
    }
}
