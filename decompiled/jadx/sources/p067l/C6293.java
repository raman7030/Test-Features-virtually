package p067l;

import android.view.MenuItem;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ۘᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6293 implements InterfaceC8304, InterfaceC1583 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f15904;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15905;

    public /* synthetic */ C6293(Object obj, Object obj2) {
        this.f15904 = obj;
        this.f15905 = obj2;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnClickListenerC22924.m51224((ViewOnClickListenerC22924) this.f15904, (C18498) this.f15905, menuItem);
        return true;
    }

    @Override // p067l.InterfaceC8304
    /* JADX INFO: renamed from: ֫ */
    public void mo14294(String str, C19033 c19033) {
        C11245 c11245 = (C11245) this.f15904;
        Main main = (Main) this.f15905;
        if (ApplicationC21448.f67650.getBoolean("bookmark_swipe_pos_aware", false)) {
            c11245.m26086(main.m120().m47730());
        }
        if (c19033 != null) {
            if (main.m123(c19033.m43234(), str, c19033.m43235())) {
                c11245.m26095();
            }
        } else {
            c11245.m26095();
            final AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            final C18107 c18107M26079 = c11245.m26079();
            final boolean zMo25087 = abstractC17043M42109.mo25087();
            C7050.m16213(new Runnable() { // from class: l.᩵ᩴܳ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = zMo25087;
                    C18107 c18107 = c18107M26079;
                    AbstractC17043 abstractC17043 = abstractC17043M42109;
                    if (!z) {
                        c18107.m41279(abstractC17043.getName());
                    }
                    c18107.m41259(z ? abstractC17043.mo25505() : abstractC17043.getParent(), true);
                }
            }, 180L);
        }
    }
}
