package p067l;

/* JADX INFO: renamed from: l.ۖ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4454 {

    /* JADX INFO: renamed from: ֫ */
    public int f9997 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f9998;

    /* JADX INFO: renamed from: ܽ */
    public EnumC17193 f9999;

    /* JADX INFO: renamed from: ᩻ */
    public void mo9338() {
        this.f9998 = -1;
        this.f9997 = -1;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m9331() {
        return this.f9998;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9332(int i) {
        this.f9998 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m9329() {
        return this.f9997;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9330(int i) {
        this.f9997 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9328(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m9335() {
        return this.f9999 == EnumC17193.Doctype;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m9334() {
        return this.f9999 == EnumC17193.StartTag;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m9336() {
        return this.f9999 == EnumC17193.EndTag;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m9333() {
        return this.f9999 == EnumC17193.Comment;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m9337() {
        return this.f9999 == EnumC17193.EOF;
    }
}
