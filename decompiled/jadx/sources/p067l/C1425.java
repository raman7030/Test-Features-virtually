package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܳ */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C1425 extends AbstractC1360 {

    /* JADX INFO: renamed from: ֫ */
    public final C0976 f38079;

    /* JADX INFO: renamed from: ۜ */
    public final Window.Callback f38080;

    /* JADX INFO: renamed from: ۧ */
    public boolean f38081;

    /* JADX INFO: renamed from: ܽ */
    public final C1145 f38083;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f38085;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f38086;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f38082 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public final Runnable f38084 = new RunnableC1005(this);

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ۧ */
    public final void mo28325(boolean z) {
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܳ */
    public final void mo28327() {
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ᩳ */
    public final void mo28332(boolean z) {
    }

    public C1425(C1326 c1326, CharSequence charSequence, Window.Callback callback) {
        C1495 c1495 = new C1495(this);
        c1326.getClass();
        C0976 c0976 = new C0976(c1326, false);
        this.f38079 = c0976;
        callback.getClass();
        this.f38080 = callback;
        c0976.mo4546(callback);
        c1326.setOnMenuItemClickListener(c1495);
        c0976.mo4547(charSequence);
        this.f38083 = new C1145(this);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ᩳ */
    public final Context mo28331() {
        return this.f38079.getContext();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28318(Drawable drawable) {
        this.f38079.mo4544(drawable);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28317(int i) {
        this.f38079.mo4552(i);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28319(CharSequence charSequence) {
        this.f38079.mo4547(charSequence);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܽ */
    public final void mo28329(boolean z) {
        int i = z ? 4 : 0;
        C0976 c0976 = this.f38079;
        c0976.mo4543((i & 4) | (c0976.mo4551() & (-5)));
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܽ */
    public final int mo28328() {
        return this.f38079.mo4551();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo28324() {
        return this.f38079.mo4555();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28321() {
        return this.f38079.mo4553();
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo28330() {
        C0976 c0976 = this.f38079;
        C1326 c1326M10483 = c0976.m10483();
        Runnable runnable = this.f38084;
        c1326M10483.removeCallbacks(runnable);
        C1326 c1326M10484 = c0976.m10483();
        int i = C1717.f57146;
        c1326M10484.postOnAnimation(runnable);
        return true;
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo28326() {
        C0976 c0976 = this.f38079;
        if (!c0976.mo4559()) {
            return false;
        }
        c0976.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m30829() {
        Window.Callback callback = this.f38080;
        Menu menuM30828 = m30828();
        C0994 c0994 = menuM30828 instanceof C0994 ? (C0994) menuM30828 : null;
        if (c0994 != null) {
            c0994.stopDispatchingItemsChanged();
        }
        try {
            menuM30828.clear();
            if (!callback.onCreatePanelMenu(0, menuM30828) || !callback.onPreparePanel(0, null, menuM30828)) {
                menuM30828.clear();
            }
        } finally {
            if (c0994 != null) {
                c0994.startDispatchingItemsChanged();
            }
        }
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28323(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo28324();
        }
        return true;
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28322(int i, KeyEvent keyEvent) {
        Menu menuM30828 = m30828();
        if (menuM30828 == null) {
            return false;
        }
        menuM30828.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM30828.performShortcut(i, keyEvent, 0);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ᩻ */
    public final void mo28333() {
        this.f38079.m10483().removeCallbacks(this.f38084);
    }

    @Override // p067l.AbstractC1360
    /* JADX INFO: renamed from: ֫ */
    public final void mo28320(boolean z) {
        if (z == this.f38081) {
            return;
        }
        this.f38081 = z;
        ArrayList arrayList = this.f38082;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1465) arrayList.get(i)).m32868();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private Menu m30828() {
        boolean z = this.f38085;
        C0976 c0976 = this.f38079;
        if (!z) {
            c0976.m10481(new C1460(this), new C1355(this));
            this.f38085 = true;
        }
        return c0976.m10482();
    }
}
