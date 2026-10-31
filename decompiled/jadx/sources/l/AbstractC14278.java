package l;

/* JADX INFO: renamed from: l.ܳۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB9P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14278 implements InterfaceC0601, Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16395 f43029;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21480 f43030;

    /* JADX INFO: renamed from: ֡ */
    public boolean mo29530() {
        return false;
    }

    /* JADX INFO: renamed from: ֨ */
    public abstract boolean mo29531();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo29533(InterfaceC17101 interfaceC17101);

    /* JADX INFO: renamed from: ۘ */
    public abstract C20069 mo29535();

    /* JADX INFO: renamed from: ۚ */
    public boolean mo29536() {
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public abstract C3135 mo29537();

    /* JADX INFO: renamed from: ۠ */
    public abstract AbstractC15834 mo29538();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo29539(AbstractC2988 abstractC2988);

    /* JADX INFO: renamed from: ܺ */
    public abstract AbstractC15834 mo29542();

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo29543();

    /* JADX INFO: renamed from: ᩵ */
    public abstract boolean mo29544();

    public AbstractC14278(C21480 c21480, C16395 c16395) {
        if (c16395 == null) {
            throw new NullPointerException("block == null");
        }
        this.f43029 = c16395;
        this.f43030 = c21480;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12122 m34037(C1018 c1018, C16395 c16395) {
        return new C12122(c1018, c16395);
    }

    @Override // 
    public AbstractC14278 clone() {
        try {
            return (AbstractC14278) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21480 m34042() {
        return this.f43030;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34041(C21480 c21480) {
        this.f43030 = c21480;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16395 m34044() {
        return this.f43029;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34043(int i) {
        C21480 c21480 = this.f43030;
        return c21480 != null && c21480.m48652() == i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34038(int i) {
        C21480 c21480 = this.f43030;
        if (c21480 != null) {
            this.f43030 = c21480.m48646(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34040(C18658 c18658) {
        if (c18658 != this.f43030.m48653()) {
            if (c18658 == null || !c18658.equals(this.f43030.m48653())) {
                this.f43030 = C21480.m48636(this.f43030.m48652(), this.f43030.getType(), c18658);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34039(AbstractC2988 abstractC2988) {
        C21480 c21480 = this.f43030;
        this.f43030 = abstractC2988.mo9123(c21480);
        this.f43029.m38618().m47179(this, c21480);
        mo29539(abstractC2988);
    }

    /* JADX INFO: renamed from: ܳ */
    public C21480 mo29540() {
        C21480 c21480 = this.f43030;
        if (c21480 == null || c21480.m48653() == null) {
            return null;
        }
        return this.f43030;
    }
}
