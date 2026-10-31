package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7602 implements InterfaceC11857 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f23491;

    public C7602(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f23491 = layoutInflaterFactory2C5402;
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context mo20350() {
        return this.f23491.m15459();
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Drawable mo20354() {
        C22733 c22733M50795 = C22733.m50795(this.f23491.m15459(), (AttributeSet) null, new int[]{R.attr.MT_Protector});
        Drawable drawableM50815 = c22733M50795.m50815(0);
        c22733M50795.m50813();
        return drawableM50815;
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo20353() {
        AbstractC10446 abstractC10446Mo15458 = this.f23491.mo15458();
        return (abstractC10446Mo15458 == null || (abstractC10446Mo15458.mo26299() & 4) == 0) ? false : true;
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20352(Drawable drawable, int i) {
        AbstractC10446 abstractC10446Mo15458 = this.f23491.mo15458();
        if (abstractC10446Mo15458 != null) {
            abstractC10446Mo15458.mo26289(drawable);
            abstractC10446Mo15458.mo26288(i);
        }
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20351(int i) {
        AbstractC10446 abstractC10446Mo15458 = this.f23491.mo15458();
        if (abstractC10446Mo15458 != null) {
            abstractC10446Mo15458.mo26288(0);
        }
    }
}
