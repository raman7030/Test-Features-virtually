package p067l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ᩴᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20368 extends C23050 {

    /* JADX INFO: renamed from: ۜ */
    public double f62963;

    /* JADX INFO: renamed from: ۢ */
    public boolean f62964;

    /* JADX INFO: renamed from: ܳ */
    public int f62965;

    /* JADX INFO: renamed from: ܽ */
    public final LinkedList f62966;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC22380 f62967;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC22380 f62968;

    /* JADX INFO: renamed from: ᩷ */
    public int f62969;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC22380 f62970;

    public C20368() {
        super("Data");
        this.f62966 = new LinkedList();
        this.f62969 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22380 m45971(AbstractC5050 abstractC5050, int i, int i2) {
        int iMo10770 = abstractC5050.mo10770();
        int i3 = this.f62969;
        if (iMo10770 != i3) {
            throw new C4274("Tried to queue " + abstractC5050.mo10770() + " channel data to a " + i3 + " channel port.");
        }
        return new C6286(this, abstractC5050, i, i2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m45976() {
        AbstractC22380 abstractC22380 = this.f62970;
        if (abstractC22380 != null) {
            abstractC22380.getClass();
            this.f62970 = null;
        }
        AbstractC22380 abstractC22381 = this.f62967;
        if (abstractC22381 != null) {
            abstractC22381.getClass();
            this.f62967 = null;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m45978() {
        return this.f62968 != null || this.f62966.size() > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m45970(double d) {
        if (this.f62968 == null) {
            synchronized (this.f62966) {
                AbstractC22380 abstractC22380 = (AbstractC22380) this.f62966.remove();
                this.f62968 = abstractC22380;
                this.f62965 = abstractC22380.f32500;
                abstractC22380.f32502 = abstractC22380.f32501;
            }
        }
        this.f62963 = this.f62968.f70606.mo10769(this.f62965, d);
        double dMo10768 = this.f62968.f70606.mo10768(this.f62965);
        int i = this.f62965 + 1;
        this.f62965 = i;
        AbstractC22380 abstractC22381 = this.f62968;
        if (i >= abstractC22381.f32500 + abstractC22381.f32503) {
            int i2 = abstractC22381.f32502;
            if (i2 > 0) {
                abstractC22381.f32502 = i2 - 1;
                abstractC22381.getClass();
            } else {
                if (this.f62966.size() == 0) {
                    AbstractC22380 abstractC22382 = this.f62968;
                    if (abstractC22382.f32502 < 0) {
                        abstractC22382.getClass();
                    }
                }
                this.f62968.getClass();
                this.f62967 = this.f62968;
                this.f62968 = null;
            }
            AbstractC22380 abstractC22383 = this.f62968;
            this.f62965 = abstractC22383.f32500;
            this.f62970 = abstractC22383;
        }
        this.f62964 = true;
        return dMo10768;
    }

    /* JADX INFO: renamed from: ܳ */
    public final double m45975() {
        return this.f62963;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45977() {
        synchronized (this.f62966) {
            this.f62966.clear();
            this.f62968 = null;
            this.f62964 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45972(AbstractC5050 abstractC5050, int i, int i2, C22559 c22559) {
        AbstractC22380 abstractC22380M45971 = m45971(abstractC5050, i, i2);
        abstractC22380M45971.f32501 = -1;
        m51435(c22559, abstractC22380M45971);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45973(C22559 c22559) {
        m51435(c22559, new C4945(this));
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m45974() {
        return this.f62964;
    }
}
