package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14044 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public final C8009 f39612;

    /* JADX INFO: renamed from: ۤ */
    public C14714 f39613;

    public C14044(Main main, View view, C8009 c8009) {
        super(main, view);
        this.f39612 = c8009;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C14714 c14714;
        C11245 c11245M130;
        C8009 c8009 = this.f39612;
        if (c8009.f40549.m12191() || (c14714 = this.f39613) == null || (c11245M130 = c8009.f37526.m130()) == null || !c11245M130.m26088(c14714.mo27546())) {
            return false;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f47811;
        View view2 = this.f47808;
        C1898 c1898 = new C1898(abstractActivityC5549, view2, 8388611);
        C9702.m22649(view2);
        c1898.m50640();
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new C11010(this));
        c1898.m50639();
        return true;
    }
}
