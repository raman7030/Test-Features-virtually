package l;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C18102 implements InterfaceC4968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6379 f56353;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f56354;

    public C18102(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402, C6379 c6379) {
        this.f56354 = layoutInflaterFactory2C5402;
        this.f56353 = c6379;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m42223(AbstractC3557 abstractC3557, Menu menu) {
        return this.f56353.m17699(abstractC3557, menu);
    }

    @Override // l.InterfaceC4968
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14424(AbstractC3557 abstractC3557, Menu menu) {
        C17648.m41339(this.f56354.f16848);
        return this.f56353.mo14424(abstractC3557, menu);
    }

    @Override // l.InterfaceC4968
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14425(AbstractC3557 abstractC3557, MenuItem menuItem) {
        return this.f56353.mo14425(abstractC3557, menuItem);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.۠ܿ] */
    @Override // l.InterfaceC4968
    /* JADX INFO: renamed from: ֫ */
    public final void mo14423(AbstractC3557 abstractC3557) {
        this.f56353.mo14423(abstractC3557);
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f56354;
        if (layoutInflaterFactory2C5402.f16820 != null) {
            layoutInflaterFactory2C5402.f16823.getDecorView().removeCallbacks(layoutInflaterFactory2C5402.f16857);
        }
        if (layoutInflaterFactory2C5402.f16840 != null) {
            C15530 c15530 = layoutInflaterFactory2C5402.f16834;
            if (c15530 != null) {
                c15530.m36598();
            }
            C15530 c15530M41298 = C17648.m41298(layoutInflaterFactory2C5402.f16840);
            c15530M41298.m36599(0.0f);
            layoutInflaterFactory2C5402.f16834 = c15530M41298;
            c15530M41298.m36602(new C16690(this));
        }
        ?? r0 = layoutInflaterFactory2C5402.f16854;
        if (r0 != 0) {
            r0.onSupportActionModeFinished(layoutInflaterFactory2C5402.f16832);
        }
        layoutInflaterFactory2C5402.f16832 = null;
        C17648.m41339(layoutInflaterFactory2C5402.f16848);
        layoutInflaterFactory2C5402.m15447();
    }
}
