package l;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKQ */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC6876 extends Dialog implements InterfaceC23586, InterfaceC23103, InterfaceC22285 {
    public C20765 _lifecycleRegistry;
    public final C11815 onBackPressedDispatcher;
    public final C21580 savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC6876(Context context) {
        this(context, 0, 2, null);
        C11233.m27805(context, d.R);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18616() {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m18617(DialogC6876 dialogC6876) {
        C11233.m27805(dialogC6876, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C11233.m27805(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public /* synthetic */ DialogC6876(Context context, int i, int i2, C23289 c23289) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6876(Context context, int i) {
        super(context, i);
        C11233.m27805(context, d.R);
        this.savedStateRegistryController = new C21580(this);
        this.onBackPressedDispatcher = new C11815(new RunnableC21604(1, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C20765 m18614() {
        C20765 c20765 = this._lifecycleRegistry;
        if (c20765 != null) {
            return c20765;
        }
        C20765 c20766 = new C20765(this);
        this._lifecycleRegistry = c20766;
        return c20766;
    }

    @Override // l.InterfaceC22285
    public C15228 getSavedStateRegistry() {
        return this.savedStateRegistryController.m48747();
    }

    @Override // l.InterfaceC23586
    public AbstractC7379 getLifecycle() {
        return m18614();
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C11233.m27803(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m48750(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C11815 c11815 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C11233.m27803(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c11815.m28893(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m48748(bundle);
        m18614().m47438(EnumC22901.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m18614().m47438(EnumC22901.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m18614().m47438(EnumC22901.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // l.InterfaceC23103
    public final C11815 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m28892();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C11233.m27805(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C11233.m27805(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        C11233.m27799(window);
        View decorView = window.getDecorView();
        C11233.m27803(decorView, "window!!.decorView");
        C6152.m17066(decorView, this);
        Window window2 = getWindow();
        C11233.m27799(window2);
        View decorView2 = window2.getDecorView();
        C11233.m27803(decorView2, "window!!.decorView");
        C18207.m42423(decorView2, this);
        Window window3 = getWindow();
        C11233.m27799(window3);
        View decorView3 = window3.getDecorView();
        C11233.m27803(decorView3, "window!!.decorView");
        C3563.m10856(decorView3, this);
    }
}
