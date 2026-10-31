package l;

/* JADX INFO: renamed from: l.ۘ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4165 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f13585;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4165 f13586;

    public AbstractC4165(int i, AbstractC4165 abstractC4165) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C9810.m24843(this);
        }
        this.f13585 = i;
        this.f13586 = abstractC4165;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo5447(String str, boolean z) {
        AbstractC4165 abstractC4165 = this.f13586;
        if (abstractC4165 != null) {
            return abstractC4165.mo5447(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo5446(int i, C23214 c23214, String str, boolean z) {
        if (this.f13585 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC4165 abstractC4165 = this.f13586;
        if (abstractC4165 != null) {
            return abstractC4165.mo5446(i, c23214, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo12600(C16864 c16864) {
        AbstractC4165 abstractC4165 = this.f13586;
        if (abstractC4165 != null) {
            abstractC4165.mo12600(c16864);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo12599() {
        AbstractC4165 abstractC4165 = this.f13586;
        if (abstractC4165 != null) {
            abstractC4165.mo12599();
        }
    }
}
