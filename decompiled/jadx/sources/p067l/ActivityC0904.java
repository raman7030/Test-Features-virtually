package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨ܿ */
/* JADX INFO: compiled from: V4WV */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0904 extends ActivityC3069 implements InterfaceC1254, InterfaceC1166, InterfaceC1990 {

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC1499 f7217;

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p067l.InterfaceC1254
    public final void onSupportActionModeFinished(AbstractC1018 abstractC1018) {
    }

    @Override // p067l.InterfaceC1254
    public final void onSupportActionModeStarted(AbstractC1018 abstractC1018) {
    }

    @Override // p067l.InterfaceC1254
    public final AbstractC1018 onWindowStartingSupportActionMode(InterfaceC1088 interfaceC1088) {
        return null;
    }

    public ActivityC0904() {
        getSavedStateRegistry().m38200("androidx:appcompat", new C0869(this));
        m54905(new C1114(this));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m6357().mo17342(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        m6357().mo17375(i);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m6357().mo17362();
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC1360 m6355() {
        return m6357().mo17369();
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return m6357().mo17374();
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void setContentView(int i) {
        m6354();
        m6357().mo17373(i);
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void setContentView(View view) {
        m6354();
        m6357().mo17348(view);
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m6354();
        m6357().mo17366(view, layoutParams);
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m6354();
        m6357().mo17349(view, layoutParams);
    }

    /* JADX INFO: renamed from: ۘ */
    private void m6354() {
        C8215.m18998(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C13045.m29867(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        C5755.m12836(getWindow().getDecorView(), this);
        C1745.m44684(getWindow().getDecorView(), this);
    }

    @Override // p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m6357().mo17347(configuration);
    }

    @Override // p067l.ActivityC3069, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m6357().mo17371();
    }

    @Override // p067l.ActivityC3069, android.app.Activity
    public void onStart() {
        super.onStart();
        m6357().mo17356();
    }

    @Override // p067l.ActivityC3069, android.app.Activity
    public void onStop() {
        super.onStop();
        m6357().mo17357();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return m6357().mo17343(i);
    }

    @Override // p067l.ActivityC3069, p067l.ActivityC2023, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM44859;
        if (!super.onMenuItemSelected(i, menuItem)) {
            AbstractC1360 abstractC1360M6355 = m6355();
            if (menuItem.getItemId() != 16908332 || abstractC1360M6355 == null || (abstractC1360M6355.mo28328() & 4) == 0 || (intentM44859 = C1748.m44859(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM44859)) {
                navigateUpTo(intentM44859);
                return true;
            }
            C1866 c1866M49550 = C1866.m49550(this);
            c1866M49550.m49551(this);
            c1866M49550.m49552();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // p067l.ActivityC3069, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m6357().mo17363();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m6357().mo17350(charSequence);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m6357().mo17360();
    }

    @Override // p067l.InterfaceC1166
    /* JADX INFO: renamed from: ۧ */
    public final Intent mo6356() {
        return C1748.m44859(this);
    }

    @Override // p067l.InterfaceC1990
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC1430 mo6358() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = (LayoutInflaterFactory2C1110) m6357();
        layoutInflaterFactory2C1110.getClass();
        return new C1219(layoutInflaterFactory2C1110);
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC1499 m6357() {
        if (this.f7217 == null) {
            int i = AbstractC1499.f42720;
            this.f7217 = new LayoutInflaterFactory2C1110(this, this);
        }
        return this.f7217;
    }

    @Override // p067l.ActivityC1086, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1360 abstractC1360M6355 = m6355();
        if (keyCode == 82 && abstractC1360M6355 != null && abstractC1360M6355.mo28323(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = C1256.f28490;
        return super.getResources();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC1360 abstractC1360M6355 = m6355();
        if (getWindow().hasFeature(0)) {
            if (abstractC1360M6355 == null || !abstractC1360M6355.mo28324()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC1360 abstractC1360M6355 = m6355();
        if (getWindow().hasFeature(0)) {
            if (abstractC1360M6355 == null || !abstractC1360M6355.mo28321()) {
                super.closeOptionsMenu();
            }
        }
    }
}
