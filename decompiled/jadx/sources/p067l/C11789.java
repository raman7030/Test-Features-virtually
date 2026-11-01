package p067l;

import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ۢ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11789 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Class f32939;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Class f32940;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC10288 f32941;

    public C11789(Class cls, Class cls2, AbstractC10288 abstractC10288) {
        this.f32939 = cls;
        this.f32940 = cls2;
        this.f32941 = abstractC10288;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Class clsM41004 = c18020.m41004();
        if (clsM41004 == this.f32939 || clsM41004 == this.f32940) {
            return this.f32941;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f32940.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + this.f32939.getName() + ",adapter=" + this.f32941 + "]";
    }
}
