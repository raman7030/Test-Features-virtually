package l;

import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ۢ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C9912 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f29981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f29982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f29983;

    public C9912(Class cls, Class cls2, AbstractC8333 abstractC8333) {
        this.f29981 = cls;
        this.f29982 = cls2;
        this.f29983 = abstractC8333;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class clsM38778 = c16469.m38778();
        if (clsM38778 == this.f29981 || clsM38778 == this.f29982) {
            return this.f29983;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f29982.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + this.f29981.getName() + ",adapter=" + this.f29983 + "]";
    }
}
