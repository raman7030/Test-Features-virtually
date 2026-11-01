package p067l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ܽ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18191 implements InterfaceC4595, InterfaceC1583, InterfaceC1666, InterfaceC2026, InterfaceC13696, InterfaceC21477 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54312;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f54313;

    public /* synthetic */ C18191(int i, Object obj) {
        this.f54312 = i;
        this.f54313 = obj;
    }

    @Override // p067l.InterfaceC1666
    public C1914 onApplyWindowInsets(View view, C1914 c1914) {
        switch (this.f54312) {
            case 5:
                ActivityC17586.m40014((ActivityC17586) this.f54313, c1914);
                return c1914;
            default:
                return ((SearchView) this.f54313).lambda$setUpStatusBarSpacerInsetListener$5(view, c1914);
        }
    }

    @Override // p067l.InterfaceC13696
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC13696
    public void onGetPath(Bundle bundle, String str) {
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = (ViewOnClickListenerC9523) this.f54313;
        viewOnClickListenerC9523.m22167(new RunnableC9821(viewOnClickListenerC9523, str, bundle));
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f54312) {
            case 0:
                ((ActivityC18686) this.f54313).m42584(menuItem);
                break;
            default:
                C16156.m36775((C16156) this.f54313, menuItem);
                break;
        }
        return true;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        AbstractC5996 abstractC5996;
        switch (this.f54312) {
            case 1:
                abstractC5996 = (C6136) this.f54313;
                break;
            case 2:
                abstractC5996 = (C20141) this.f54313;
                break;
            default:
                abstractC5996 = (C8963) this.f54313;
                break;
        }
        abstractC5996.mo13474(i);
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        C16684.m37763((C16684) this.f54313);
    }
}
