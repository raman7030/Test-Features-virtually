package p067l;

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
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻ܽ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC2023 extends ActivityC1086 implements InterfaceC14920, InterfaceC6699, InterfaceC23548, InterfaceC1988, InterfaceC0870, InterfaceC0991, InterfaceC1481, InterfaceC1363, InterfaceC1153, InterfaceC1833 {

    /* JADX INFO: renamed from: ᩻֫ */
    public static final /* synthetic */ int f79792 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public final CopyOnWriteArrayList f79793;

    /* JADX INFO: renamed from: ۗ */
    public boolean f79794;

    /* JADX INFO: renamed from: ۙ */
    public C4863 f79795;

    /* JADX INFO: renamed from: ۛ */
    public final C1448 f79796;

    /* JADX INFO: renamed from: ۟ */
    public final CopyOnWriteArrayList f79797;

    /* JADX INFO: renamed from: ۤ */
    public final C22103 f79798;

    /* JADX INFO: renamed from: ۧ֫ */
    public final CopyOnWriteArrayList f79799;

    /* JADX INFO: renamed from: ۨ */
    public final AtomicInteger f79800;

    /* JADX INFO: renamed from: ۫ */
    public final C1778 f79801;

    /* JADX INFO: renamed from: ۬ */
    public boolean f79802;

    /* JADX INFO: renamed from: ܰ */
    public final CopyOnWriteArrayList f79803;

    /* JADX INFO: renamed from: ܳ֫ */
    public C5533 f79804;

    /* JADX INFO: renamed from: ܽ֫ */
    public final CopyOnWriteArrayList f79805;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C22878 f79806;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final ExecutorC1568 f79807;

    /* JADX INFO: renamed from: ᩶ */
    public final C1710 f79808;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC1815 f79809;

    /* JADX INFO: renamed from: ᩺ */
    public C1428 f79810;

    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۗۧ] */
    public ActivityC2023() {
        C1710 c1710 = new C1710();
        this.f79808 = c1710;
        this.f79796 = new C1448(new RunnableC24165(1, this));
        C22103 c22103 = new C22103(this);
        this.f79798 = c22103;
        C22878 c22878 = new C22878(this);
        this.f79806 = c22878;
        this.f79810 = null;
        ExecutorC1568 executorC1568 = new ExecutorC1568(this);
        this.f79807 = executorC1568;
        this.f79801 = new C1778(executorC1568, new InterfaceC4387() { // from class: l.ۗۧ
            @Override // p067l.InterfaceC4387
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6293() {
                int i = ActivityC2023.f79792;
                this.f12849.reportFullyDrawn();
                return null;
            }
        });
        this.f79800 = new AtomicInteger();
        this.f79809 = new C1420(this);
        this.f79803 = new CopyOnWriteArrayList();
        this.f79805 = new CopyOnWriteArrayList();
        this.f79793 = new CopyOnWriteArrayList();
        this.f79797 = new CopyOnWriteArrayList();
        this.f79799 = new CopyOnWriteArrayList();
        this.f79794 = false;
        this.f79802 = false;
        int i = Build.VERSION.SDK_INT;
        c22103.mo21806(new C1980(this));
        c22103.mo21806(new C1525(this));
        c22103.mo21806(new C1210(this));
        c22878.m51095();
        C22298.m50118((InterfaceC23548) this);
        if (i <= 23) {
            c22103.mo21806(new C1813(this));
        }
        c22878.m51093().m38200("android:support:activity-result", new InterfaceC10137() { // from class: l.۬ۧ
            @Override // p067l.InterfaceC10137
            /* JADX INFO: renamed from: ֫ */
            public final Bundle mo4332() {
                return ActivityC2023.m54900(this.f42131);
            }
        });
        c1710.m43146(new InterfaceC1570() { // from class: l.۫ۧ
            @Override // p067l.InterfaceC1570
            /* JADX INFO: renamed from: ֫ */
            public final void mo17505(ActivityC2023 activityC2023) {
                ActivityC2023.m54899(this.f40036);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ Bundle m54900(ActivityC2023 activityC2023) {
        Bundle bundle = new Bundle();
        activityC2023.f79809.m47358(bundle);
        return bundle;
    }

    @Override // p067l.ActivityC1086, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f79806.m51094(bundle);
        this.f79808.m43147(this);
        super.onCreate(bundle);
        int i = FragmentC15395.f43984;
        C8020.m18601(this);
    }

    @Override // p067l.ActivityC1086, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C22103 c22103 = this.f79798;
        if (c22103 != null) {
            c22103.m49765(EnumC15415.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f79806.m51096(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1743 c1743;
        C5533 c5533 = this.f79804;
        if (c5533 == null && (c1743 = (C1743) getLastNonConfigurationInstance()) != null) {
            c5533 = c1743.f59688;
        }
        if (c5533 == null) {
            return null;
        }
        C1743 c1744 = new C1743();
        c1744.f59688 = c5533;
        return c1744;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m54907();
        this.f79807.m37076(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m54907();
        this.f79807.m37076(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m54907();
        this.f79807.m37076(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m54907();
        this.f79807.m37076(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m54907() {
        C8215.m18998(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C13045.m29867(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        C5755.m12836(getWindow().getDecorView(), this);
        C1745.m44684(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        C13045.m29867(decorView2, "<this>");
        decorView2.setTag(R.id.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54905(InterfaceC1570 interfaceC1570) {
        this.f79808.m43146(interfaceC1570);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f79796.m31767(menu);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f79796.m31762(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f79796.m31766(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f79796.m31761(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // p067l.InterfaceC1833
    public final void addMenuProvider(InterfaceC1413 interfaceC1413) {
        this.f79796.m31763(interfaceC1413);
    }

    @Override // p067l.InterfaceC1833
    public final void removeMenuProvider(InterfaceC1413 interfaceC1413) {
        this.f79796.m31768(interfaceC1413);
    }

    @Override // p067l.ActivityC1086, p067l.InterfaceC24784
    public final AbstractC9381 getLifecycle() {
        return this.f79798;
    }

    @Override // p067l.InterfaceC14920
    public final C5533 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m54906();
        return this.f79804;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m54906() {
        if (this.f79804 == null) {
            C1743 c1743 = (C1743) getLastNonConfigurationInstance();
            if (c1743 != null) {
                this.f79804 = c1743.f59688;
            }
            if (this.f79804 == null) {
                this.f79804 = new C5533();
            }
        }
    }

    @Override // p067l.InterfaceC6699
    public final InterfaceC16931 getDefaultViewModelProviderFactory() {
        if (this.f79795 == null) {
            this.f79795 = new C4863(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f79795;
    }

    @Override // p067l.InterfaceC6699
    public final AbstractC9556 getDefaultViewModelCreationExtras() {
        C17901 c17901 = new C17901();
        if (getApplication() != null) {
            c17901.m22254().put(C10227.f28340, getApplication());
        }
        c17901.m22254().put(C22298.f70433, this);
        c17901.m22254().put(C22298.f70434, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c17901.m22254().put(C22298.f70432, getIntent().getExtras());
        }
        return c17901;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m30941();
    }

    @Override // p067l.InterfaceC1988
    public final C1428 getOnBackPressedDispatcher() {
        if (this.f79810 == null) {
            this.f79810 = new C1428(new RunnableC0938(this));
            this.f79798.mo21806(new C1393(this));
        }
        return this.f79810;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54899(ActivityC2023 activityC2023) {
        Bundle bundleM38197 = activityC2023.f79806.m51093().m38197("android:support:activity-result");
        if (bundleM38197 != null) {
            activityC2023.f79809.m47355(bundleM38197);
        }
    }

    @Override // p067l.InterfaceC23548
    public final C16841 getSavedStateRegistry() {
        return this.f79806.m51093();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f79809.m47357(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, p067l.InterfaceC0981
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f79809.m47357(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1325 m54903(AbstractC1920 abstractC1920, InterfaceC1885 interfaceC1885) {
        return this.f79809.m47353("activity_rq#" + this.f79800.getAndIncrement(), this, abstractC1920, interfaceC1885);
    }

    @Override // p067l.InterfaceC0870
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1815 mo4693() {
        return this.f79809;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f79803.iterator();
        while (it.hasNext()) {
            ((InterfaceC1489) it.next()).accept(configuration);
        }
    }

    @Override // p067l.InterfaceC0991
    /* JADX INFO: renamed from: ֫ */
    public final void mo11194(InterfaceC1489 interfaceC1489) {
        this.f79803.add(interfaceC1489);
    }

    @Override // p067l.InterfaceC0991
    /* JADX INFO: renamed from: ۜ */
    public final void mo11195(InterfaceC1489 interfaceC1489) {
        this.f79803.remove(interfaceC1489);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f79805.iterator();
        while (it.hasNext()) {
            ((InterfaceC1489) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // p067l.InterfaceC1481
    /* JADX INFO: renamed from: ܿ */
    public final void mo33394(InterfaceC1489 interfaceC1489) {
        this.f79805.add(interfaceC1489);
    }

    @Override // p067l.InterfaceC1481
    /* JADX INFO: renamed from: ܽ */
    public final void mo33393(InterfaceC1489 interfaceC1489) {
        this.f79805.remove(interfaceC1489);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f79793.iterator();
        while (it.hasNext()) {
            ((InterfaceC1489) it.next()).accept(intent);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54904(C6423 c6423) {
        this.f79793.add(c6423);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f79794) {
            return;
        }
        Iterator it = this.f79797.iterator();
        while (it.hasNext()) {
            ((InterfaceC1489) it.next()).accept(new C1678(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f79794 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f79794 = false;
            for (InterfaceC1489 interfaceC1489 : this.f79797) {
                C13045.m29867(configuration, "newConfig");
                interfaceC1489.accept(new C1678(z));
            }
        } catch (Throwable th) {
            this.f79794 = false;
            throw th;
        }
    }

    @Override // p067l.InterfaceC1363
    /* JADX INFO: renamed from: ᩻ */
    public final void mo28448(InterfaceC1489 interfaceC1489) {
        this.f79797.add(interfaceC1489);
    }

    @Override // p067l.InterfaceC1363
    /* JADX INFO: renamed from: ܳ */
    public final void mo28447(InterfaceC1489 interfaceC1489) {
        this.f79797.remove(interfaceC1489);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f79802) {
            return;
        }
        Iterator it = this.f79799.iterator();
        while (it.hasNext()) {
            ((InterfaceC1489) it.next()).accept(new C1223(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f79802 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f79802 = false;
            for (InterfaceC1489 interfaceC1489 : this.f79799) {
                C13045.m29867(configuration, "newConfig");
                interfaceC1489.accept(new C1223(z));
            }
        } catch (Throwable th) {
            this.f79802 = false;
            throw th;
        }
    }

    @Override // p067l.InterfaceC1153
    /* JADX INFO: renamed from: ᩳ */
    public final void mo19226(InterfaceC1489 interfaceC1489) {
        this.f79799.add(interfaceC1489);
    }

    @Override // p067l.InterfaceC1153
    /* JADX INFO: renamed from: ۧ */
    public final void mo19225(InterfaceC1489 interfaceC1489) {
        this.f79799.remove(interfaceC1489);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (C12091.m27880()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f79801.m45843();
        } finally {
            Trace.endSection();
        }
    }
}
