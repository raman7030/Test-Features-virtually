package l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC23809 extends ActivityC4927 implements InterfaceC13207, InterfaceC4557, InterfaceC22285, InterfaceC23103, InterfaceC0567, InterfaceC2999, InterfaceC12876, InterfaceC10509, InterfaceC6275, InterfaceC19974 {

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77041 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f77042;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f77043;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2625 f77044;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12212 f77045;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f77046;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20765 f77047;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f77048;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f77049;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18871 f77050;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f77051;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f77052;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C3330 f77053;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f77054;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C21580 f77055;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ExecutorC14636 f77056;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17501 f77057;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC19619 f77058;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11815 f77059;

    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۗۧ] */
    public ActivityC23809() {
        C17501 c17501 = new C17501();
        this.f77057 = c17501;
        this.f77045 = new C12212(new RunnableC22934(1, this));
        C20765 c20765 = new C20765(this);
        this.f77047 = c20765;
        C21580 c21580 = new C21580(this);
        this.f77055 = c21580;
        this.f77059 = null;
        ExecutorC14636 executorC14636 = new ExecutorC14636(this);
        this.f77056 = executorC14636;
        this.f77050 = new C18871(executorC14636, new InterfaceC2123() { // from class: l.ۗۧ
            @Override // l.InterfaceC2123
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4049() {
                int i = ActivityC23809.f77041;
                this.f10045.reportFullyDrawn();
                return null;
            }
        });
        this.f77049 = new AtomicInteger();
        this.f77058 = new C11651(this);
        this.f77052 = new CopyOnWriteArrayList();
        this.f77054 = new CopyOnWriteArrayList();
        this.f77042 = new CopyOnWriteArrayList();
        this.f77046 = new CopyOnWriteArrayList();
        this.f77048 = new CopyOnWriteArrayList();
        this.f77043 = false;
        this.f77051 = false;
        int i = Build.VERSION.SDK_INT;
        c20765.mo19833(new C22939(this));
        c20765.mo19833(new C13766(this));
        c20765.mo19833(new C7417(this));
        c21580.m48749();
        C20970.m47788((InterfaceC22285) this);
        if (i <= 23) {
            c20765.mo19833(new C19577(this));
        }
        c21580.m48747().m36039("android:support:activity-result", new InterfaceC8174() { // from class: l.۬ۧ
            @Override // l.InterfaceC8174
            /* JADX INFO: renamed from: ֫ */
            public final Bundle mo1940() {
                return ActivityC23809.m52491(this.f39083);
            }
        });
        c17501.m40888(new InterfaceC14678() { // from class: l.۫ۧ
            @Override // l.InterfaceC14678
            /* JADX INFO: renamed from: ֫ */
            public final void mo15594(ActivityC23809 activityC23809) {
                ActivityC23809.m52490(this.f37020);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Bundle m52491(ActivityC23809 activityC23809) {
        Bundle bundle = new Bundle();
        activityC23809.f77058.m45062(bundle);
        return bundle;
    }

    @Override // l.ActivityC4927, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f77055.m48748(bundle);
        this.f77057.m40889(this);
        super.onCreate(bundle);
        int i = FragmentC13707.f40903;
        C5947.m16675(this);
    }

    @Override // l.ActivityC4927, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C20765 c20765 = this.f77047;
        if (c20765 != null) {
            c20765.m47437(EnumC13728.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f77055.m48750(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C18165 c18165;
        C3330 c3330 = this.f77053;
        if (c3330 == null && (c18165 = (C18165) getLastNonConfigurationInstance()) != null) {
            c3330 = c18165.f56474;
        }
        if (c3330 == null) {
            return null;
        }
        C18165 c18166 = new C18165();
        c18166.f56474 = c3330;
        return c18166;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m52498();
        this.f77056.m34929(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m52498();
        this.f77056.m34929(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m52498();
        this.f77056.m34929(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m52498();
        this.f77056.m34929(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52498() {
        C6152.m17066(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C11233.m27805(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        C3563.m10856(getWindow().getDecorView(), this);
        C18207.m42423(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        C11233.m27805(decorView2, "<this>");
        decorView2.setTag(R.id.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52496(InterfaceC14678 interfaceC14678) {
        this.f77057.m40888(interfaceC14678);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f77045.m29705(menu);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f77045.m29700(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f77045.m29704(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f77045.m29699(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // l.InterfaceC19974
    public final void addMenuProvider(InterfaceC11507 interfaceC11507) {
        this.f77045.m29701(interfaceC11507);
    }

    @Override // l.InterfaceC19974
    public final void removeMenuProvider(InterfaceC11507 interfaceC11507) {
        this.f77045.m29706(interfaceC11507);
    }

    @Override // l.ActivityC4927, l.InterfaceC23586
    public final AbstractC7379 getLifecycle() {
        return this.f77047;
    }

    @Override // l.InterfaceC13207
    public final C3330 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m52497();
        return this.f77053;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m52497() {
        if (this.f77053 == null) {
            C18165 c18165 = (C18165) getLastNonConfigurationInstance();
            if (c18165 != null) {
                this.f77053 = c18165.f56474;
            }
            if (this.f77053 == null) {
                this.f77053 = new C3330();
            }
        }
    }

    @Override // l.InterfaceC4557
    public final InterfaceC15323 getDefaultViewModelProviderFactory() {
        if (this.f77044 == null) {
            this.f77044 = new C2625(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f77044;
    }

    @Override // l.InterfaceC4557
    public final AbstractC7563 getDefaultViewModelCreationExtras() {
        C16344 c16344 = new C16344();
        if (getApplication() != null) {
            c16344.m20277().put(C8269.f25430, getApplication());
        }
        c16344.m20277().put(C20970.f67747, this);
        c16344.m20277().put(C20970.f67748, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c16344.m20277().put(C20970.f67746, getIntent().getExtras());
        }
        return c16344;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m28892();
    }

    @Override // l.InterfaceC23103
    public final C11815 getOnBackPressedDispatcher() {
        if (this.f77059 == null) {
            this.f77059 = new C11815(new RunnableC1937(this));
            this.f77047.mo19833(new C11110(this));
        }
        return this.f77059;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52490(ActivityC23809 activityC23809) {
        Bundle bundleM36036 = activityC23809.f77055.m48747().m36036("android:support:activity-result");
        if (bundleM36036 != null) {
            activityC23809.f77058.m45059(bundleM36036);
        }
    }

    @Override // l.InterfaceC22285
    public final C15228 getSavedStateRegistry() {
        return this.f77055.m48747();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f77058.m45061(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, l.InterfaceC2811
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f77058.m45061(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9741 m52494(AbstractC21735 abstractC21735, InterfaceC21030 interfaceC21030) {
        return this.f77058.m45057("activity_rq#" + this.f77049.getAndIncrement(), this, abstractC21735, interfaceC21030);
    }

    @Override // l.InterfaceC0567
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19619 mo2322() {
        return this.f77058;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f77052.iterator();
        while (it.hasNext()) {
            ((InterfaceC13041) it.next()).accept(configuration);
        }
    }

    @Override // l.InterfaceC2999
    /* JADX INFO: renamed from: ֫ */
    public final void mo9143(InterfaceC13041 interfaceC13041) {
        this.f77052.add(interfaceC13041);
    }

    @Override // l.InterfaceC2999
    /* JADX INFO: renamed from: ۜ */
    public final void mo9144(InterfaceC13041 interfaceC13041) {
        this.f77052.remove(interfaceC13041);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f77054.iterator();
        while (it.hasNext()) {
            ((InterfaceC13041) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // l.InterfaceC12876
    /* JADX INFO: renamed from: ܿ */
    public final void mo31308(InterfaceC13041 interfaceC13041) {
        this.f77054.add(interfaceC13041);
    }

    @Override // l.InterfaceC12876
    /* JADX INFO: renamed from: ܽ */
    public final void mo31307(InterfaceC13041 interfaceC13041) {
        this.f77054.remove(interfaceC13041);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f77042.iterator();
        while (it.hasNext()) {
            ((InterfaceC13041) it.next()).accept(intent);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52495(C4266 c4266) {
        this.f77042.add(c4266);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f77043) {
            return;
        }
        Iterator it = this.f77046.iterator();
        while (it.hasNext()) {
            ((InterfaceC13041) it.next()).accept(new C16858(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f77043 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f77043 = false;
            for (InterfaceC13041 interfaceC13041 : this.f77046) {
                C11233.m27805(configuration, "newConfig");
                interfaceC13041.accept(new C16858(z));
            }
        } catch (Throwable th) {
            this.f77043 = false;
            throw th;
        }
    }

    @Override // l.InterfaceC10509
    /* JADX INFO: renamed from: ᩻ */
    public final void mo26415(InterfaceC13041 interfaceC13041) {
        this.f77046.add(interfaceC13041);
    }

    @Override // l.InterfaceC10509
    /* JADX INFO: renamed from: ܳ */
    public final void mo26414(InterfaceC13041 interfaceC13041) {
        this.f77046.remove(interfaceC13041);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f77051) {
            return;
        }
        Iterator it = this.f77048.iterator();
        while (it.hasNext()) {
            ((InterfaceC13041) it.next()).accept(new C7686(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f77051 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f77051 = false;
            for (InterfaceC13041 interfaceC13041 : this.f77048) {
                C11233.m27805(configuration, "newConfig");
                interfaceC13041.accept(new C7686(z));
            }
        } catch (Throwable th) {
            this.f77051 = false;
            throw th;
        }
    }

    @Override // l.InterfaceC6275
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17288(InterfaceC13041 interfaceC13041) {
        this.f77048.add(interfaceC13041);
    }

    @Override // l.InterfaceC6275
    /* JADX INFO: renamed from: ۧ */
    public final void mo17287(InterfaceC13041 interfaceC13041) {
        this.f77048.remove(interfaceC13041);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (C10230.m25858()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f77050.m43577();
        } finally {
            Trace.endSection();
        }
    }
}
