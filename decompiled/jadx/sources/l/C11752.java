package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11752 extends AbstractC10446 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2706 f35080;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Window.Callback f35081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f35082;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6107 f35084;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f35086;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f35087;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f35083 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Runnable f35085 = new RunnableC3285(this);

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ۧ */
    public final void mo26296(boolean z) {
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ܳ */
    public final void mo26298() {
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ᩳ */
    public final void mo26303(boolean z) {
    }

    public C11752(C9762 c9762, CharSequence charSequence, Window.Callback callback) {
        C13162 c13162 = new C13162(this);
        c9762.getClass();
        C2706 c2706 = new C2706(c9762, false);
        this.f35080 = c2706;
        callback.getClass();
        this.f35081 = callback;
        c2706.mo2179(callback);
        c9762.setOnMenuItemClickListener(c13162);
        c2706.mo2180(charSequence);
        this.f35084 = new C6107(this);
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ᩳ */
    public final Context mo26302() {
        return this.f35080.getContext();
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final void mo26289(Drawable drawable) {
        this.f35080.mo2177(drawable);
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final void mo26288(int i) {
        this.f35080.mo2185(i);
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final void mo26290(CharSequence charSequence) {
        this.f35080.mo2180(charSequence);
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ܽ */
    public final void mo26300(boolean z) {
        int i = z ? 4 : 0;
        C2706 c2706 = this.f35080;
        c2706.mo2176((i & 4) | (c2706.mo2184() & (-5)));
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ܽ */
    public final int mo26299() {
        return this.f35080.mo2184();
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo26295() {
        return this.f35080.mo2188();
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26292() {
        return this.f35080.mo2186();
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo26301() {
        C2706 c2706 = this.f35080;
        C9762 c9762M8437 = c2706.m8437();
        Runnable runnable = this.f35085;
        c9762M8437.removeCallbacks(runnable);
        C9762 c9762M8438 = c2706.m8437();
        int i = C17648.f53953;
        c9762M8438.postOnAnimation(runnable);
        return true;
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo26297() {
        C2706 c2706 = this.f35080;
        if (!c2706.mo2192()) {
            return false;
        }
        c2706.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28782() {
        Window.Callback callback = this.f35081;
        Menu menuM28781 = m28781();
        C3060 c3060 = menuM28781 instanceof C3060 ? (C3060) menuM28781 : null;
        if (c3060 != null) {
            c3060.stopDispatchingItemsChanged();
        }
        try {
            menuM28781.clear();
            if (!callback.onCreatePanelMenu(0, menuM28781) || !callback.onPreparePanel(0, null, menuM28781)) {
                menuM28781.clear();
            }
        } finally {
            if (c3060 != null) {
                c3060.startDispatchingItemsChanged();
            }
        }
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26294(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo26295();
        }
        return true;
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26293(int i, KeyEvent keyEvent) {
        Menu menuM28781 = m28781();
        if (menuM28781 == null) {
            return false;
        }
        menuM28781.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM28781.performShortcut(i, keyEvent, 0);
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ᩻ */
    public final void mo26304() {
        this.f35080.m8437().removeCallbacks(this.f35085);
    }

    @Override // l.AbstractC10446
    /* JADX INFO: renamed from: ֫ */
    public final void mo26291(boolean z) {
        if (z == this.f35082) {
            return;
        }
        this.f35082 = z;
        ArrayList arrayList = this.f35083;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC12562) arrayList.get(i)).m30793();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private Menu m28781() {
        boolean z = this.f35086;
        C2706 c2706 = this.f35080;
        if (!z) {
            c2706.m8435(new C12457(this), new C10341(this));
            this.f35086 = true;
        }
        return c2706.m8436();
    }
}
