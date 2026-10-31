package l;

/* JADX INFO: renamed from: l.ۖ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2195 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7212 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f7213;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC15599 f7214;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo7259() {
        this.f7213 = -1;
        this.f7212 = -1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m7252() {
        return this.f7213;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7253(int i) {
        this.f7213 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7250() {
        return this.f7212;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7251(int i) {
        this.f7212 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7249(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m7256() {
        return this.f7214 == EnumC15599.Doctype;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m7255() {
        return this.f7214 == EnumC15599.StartTag;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m7257() {
        return this.f7214 == EnumC15599.EndTag;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m7254() {
        return this.f7214 == EnumC15599.Comment;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m7258() {
        return this.f7214 == EnumC15599.EOF;
    }
}
