package p067l;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ۜܽ */
/* JADX INFO: compiled from: 8AKQ */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC1183 extends Dialog implements InterfaceC24784, InterfaceC1988, InterfaceC23548 {
    public C22103 _lifecycleRegistry;
    public final C1428 onBackPressedDispatcher;
    public final C22878 savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC1183(Context context) {
        this(context, 0, 2, null);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m20565() {
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m20566(DialogC1183 dialogC1183) {
        C13045.m29867(dialogC1183, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C13045.m29867(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public /* synthetic */ DialogC1183(Context context, int i, int i2, C24503 c24503) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1183(Context context, int i) {
        super(context, i);
        C13045.m29867(context, C0708d.f2602R);
        this.savedStateRegistryController = new C22878(this);
        this.onBackPressedDispatcher = new C1428(new RunnableC22901(1, this));
    }

    /* JADX INFO: renamed from: ֫ */
    private final C22103 m20563() {
        C22103 c22103 = this._lifecycleRegistry;
        if (c22103 != null) {
            return c22103;
        }
        C22103 c22104 = new C22103(this);
        this._lifecycleRegistry = c22104;
        return c22104;
    }

    @Override // p067l.InterfaceC23548
    public C16841 getSavedStateRegistry() {
        return this.savedStateRegistryController.m51093();
    }

    @Override // p067l.InterfaceC24784
    public AbstractC9381 getLifecycle() {
        return m20563();
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C13045.m29865(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m51096(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C1428 c1428 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C13045.m29865(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c1428.m30942(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m51094(bundle);
        m20563().m49766(EnumC24133.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m20563().m49766(EnumC24133.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m20563().m49766(EnumC24133.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // p067l.InterfaceC1988
    public final C1428 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m30941();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C13045.m29867(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C13045.m29867(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        C13045.m29861(window);
        View decorView = window.getDecorView();
        C13045.m29865(decorView, "window!!.decorView");
        C8215.m18998(decorView, this);
        Window window2 = getWindow();
        C13045.m29861(window2);
        View decorView2 = window2.getDecorView();
        C13045.m29865(decorView2, "window!!.decorView");
        C1745.m44684(decorView2, this);
        Window window3 = getWindow();
        C13045.m29861(window3);
        View decorView3 = window3.getDecorView();
        C13045.m29865(decorView3, "window!!.decorView");
        C5755.m12836(decorView3, this);
    }
}
