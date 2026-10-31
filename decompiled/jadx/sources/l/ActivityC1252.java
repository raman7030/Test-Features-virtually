package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4WV */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC1252 extends ActivityC0737 implements InterfaceC8308, InterfaceC6526, InterfaceC23145 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC13246 f4447;

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // l.InterfaceC8308
    public final void onSupportActionModeFinished(AbstractC3557 abstractC3557) {
    }

    @Override // l.InterfaceC8308
    public final void onSupportActionModeStarted(AbstractC3557 abstractC3557) {
    }

    @Override // l.InterfaceC8308
    public final AbstractC3557 onWindowStartingSupportActionMode(InterfaceC4968 interfaceC4968) {
        return null;
    }

    public ActivityC1252() {
        getSavedStateRegistry().m36039("androidx:appcompat", new C0546(this));
        m52496(new C5486(this));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m4113().mo15431(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        m4113().mo15464(i);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m4113().mo15451();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC10446 m4111() {
        return m4113().mo15458();
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return m4113().mo15463();
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void setContentView(int i) {
        m4110();
        m4113().mo15462(i);
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void setContentView(View view) {
        m4110();
        m4113().mo15437(view);
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4110();
        m4113().mo15455(view, layoutParams);
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4110();
        m4113().mo15438(view, layoutParams);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m4110() {
        C6152.m17066(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C11233.m27805(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        C3563.m10856(getWindow().getDecorView(), this);
        C18207.m42423(getWindow().getDecorView(), this);
    }

    @Override // l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4113().mo15436(configuration);
    }

    @Override // l.ActivityC0737, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m4113().mo15460();
    }

    @Override // l.ActivityC0737, android.app.Activity
    public void onStart() {
        super.onStart();
        m4113().mo15445();
    }

    @Override // l.ActivityC0737, android.app.Activity
    public void onStop() {
        super.onStop();
        m4113().mo15446();
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return m4113().mo15432(i);
    }

    @Override // l.ActivityC0737, l.ActivityC23809, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM42600;
        if (!super.onMenuItemSelected(i, menuItem)) {
            AbstractC10446 abstractC10446M4111 = m4111();
            if (menuItem.getItemId() != 16908332 || abstractC10446M4111 == null || (abstractC10446M4111.mo26299() & 4) == 0 || (intentM42600 = C18270.m42600(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM42600)) {
                navigateUpTo(intentM42600);
                return true;
            }
            C20638 c20638M47223 = C20638.m47223(this);
            c20638M47223.m47224(this);
            c20638M47223.m47225();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // l.ActivityC0737, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m4113().mo15452();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m4113().mo15439(charSequence);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m4113().mo15449();
    }

    @Override // l.InterfaceC6526
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Intent mo4112() {
        return C18270.m42600(this);
    }

    @Override // l.InterfaceC23145
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11857 mo4114() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = (LayoutInflaterFactory2C5402) m4113();
        layoutInflaterFactory2C5402.getClass();
        return new C7602(layoutInflaterFactory2C5402);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC13246 m4113() {
        if (this.f4447 == null) {
            int i = AbstractC13246.f39656;
            this.f4447 = new LayoutInflaterFactory2C5402(this, this);
        }
        return this.f4447;
    }

    @Override // l.ActivityC4927, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC10446 abstractC10446M4111 = m4111();
        if (keyCode == 82 && abstractC10446M4111 != null && abstractC10446M4111.mo26294(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = C8350.f25576;
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
        AbstractC10446 abstractC10446M4111 = m4111();
        if (getWindow().hasFeature(0)) {
            if (abstractC10446M4111 == null || !abstractC10446M4111.mo26295()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC10446 abstractC10446M4111 = m4111();
        if (getWindow().hasFeature(0)) {
            if (abstractC10446M4111 == null || !abstractC10446M4111.mo26292()) {
                super.closeOptionsMenu();
            }
        }
    }
}
