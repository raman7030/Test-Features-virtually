package l;

import android.view.MenuItem;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۘᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4129 implements InterfaceC6245, InterfaceC14930 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13090;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13091;

    public /* synthetic */ C4129(Object obj, Object obj2) {
        this.f13090 = obj;
        this.f13091 = obj2;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnClickListenerC21628.m48876((ViewOnClickListenerC21628) this.f13090, (C16971) this.f13091, menuItem);
        return true;
    }

    @Override // l.InterfaceC6245
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo12404(String str, C17534 c17534) {
        C9340 c9340 = (C9340) this.f13090;
        Main main = (Main) this.f13091;
        if (ApplicationC20075.f65010.getBoolean("bookmark_swipe_pos_aware", false)) {
            c9340.m24077(main.m122().m45426());
        }
        if (c17534 != null) {
            if (main.m125(c17534.m40974(), str, c17534.m40975())) {
                c9340.m24086();
            }
        } else {
            c9340.m24086();
            final AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
            final C16560 c16560M24070 = c9340.m24070();
            final boolean zMo23113 = abstractC15440M39866.mo23113();
            C4925.m14316(new Runnable() { // from class: l.᩵ᩴܳ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = zMo23113;
                    C16560 c16560 = c16560M24070;
                    AbstractC15440 abstractC15440 = abstractC15440M39866;
                    if (!z) {
                        c16560.m39053(abstractC15440.getName());
                    }
                    c16560.m39033(z ? abstractC15440.mo23554() : abstractC15440.getParent(), true);
                }
            }, 180L);
        }
    }
}
