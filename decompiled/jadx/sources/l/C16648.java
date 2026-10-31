package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ܽ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16648 implements InterfaceC2343, InterfaceC14930, InterfaceC16610, InterfaceC23872, InterfaceC11918, InterfaceC20106 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51130;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51131;

    public /* synthetic */ C16648(int i, Object obj) {
        this.f51130 = i;
        this.f51131 = obj;
    }

    @Override // l.InterfaceC16610
    public C21610 onApplyWindowInsets(View view, C21610 c21610) {
        switch (this.f51130) {
            case 5:
                ActivityC16012.m37828((ActivityC16012) this.f51131, c21610);
                return c21610;
            default:
                return ((SearchView) this.f51131).lambda$setUpStatusBarSpacerInsetListener$5(view, c21610);
        }
    }

    @Override // l.InterfaceC11918
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC11918
    public void onGetPath(Bundle bundle, String str) {
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = (ViewOnClickListenerC7528) this.f51131;
        viewOnClickListenerC7528.m20191(new RunnableC7842(viewOnClickListenerC7528, str, bundle));
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f51130) {
            case 0:
                ((ActivityC17169) this.f51131).m40339(menuItem);
                break;
            default:
                C14507.m34634((C14507) this.f51131, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        AbstractC3817 abstractC3817;
        switch (this.f51130) {
            case 1:
                abstractC3817 = (C3964) this.f51131;
                break;
            case 2:
                abstractC3817 = (C18700) this.f51131;
                break;
            default:
                abstractC3817 = (C6938) this.f51131;
                break;
        }
        abstractC3817.mo11538(i);
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        C15063.m35605((C15063) this.f51131);
    }
}
