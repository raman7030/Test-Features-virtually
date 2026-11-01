package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.֡᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3069 extends ActivityC2023 implements InterfaceC0981, InterfaceC1051 {

    /* JADX INFO: renamed from: ۖ֫ */
    public static final /* synthetic */ int f5551 = 0;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f5552;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f5553;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C23857 f5554 = C23857.m52923(new C21176(this));

    /* JADX INFO: renamed from: ᩷֫ */
    public final C22103 f5556 = new C22103(this);

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f5555 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۘ᩻֫] */
    public ActivityC3069() {
        getSavedStateRegistry().m38200("android:support:lifecycle", new InterfaceC10137() { // from class: l.ܺ᩻֫
            @Override // p067l.InterfaceC10137
            /* JADX INFO: renamed from: ֫ */
            public final Bundle mo4332() {
                int i = ActivityC3069.f5551;
                ActivityC3069 activityC3069 = this.f53182;
                activityC3069.m5171();
                activityC3069.f5556.m49766(EnumC24133.ON_STOP);
                return new Bundle();
            }
        });
        mo11194(new InterfaceC1489() { // from class: l.ۖ᩻֫
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                this.f11912.f5554.m52928();
            }
        });
        m54904((C6423) new InterfaceC1489() { // from class: l.ۘ᩻֫
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                this.f16626.f5554.m52928();
            }
        });
        m54905(new InterfaceC1570() { // from class: l.ᩴ᩻֫
            @Override // p067l.InterfaceC1570
            /* JADX INFO: renamed from: ֫ */
            public final void mo17505(ActivityC2023 activityC2023) {
                this.f63357.f5554.m52925();
            }
        });
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f5554.m52928();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5556.m49766(EnumC24133.ON_CREATE);
        this.f5554.m52932();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM52924 = this.f5554.m52924(view, str, context, attributeSet);
        return viewM52924 == null ? super.onCreateView(view, str, context, attributeSet) : viewM52924;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM52924 = this.f5554.m52924(null, str, context, attributeSet);
        return viewM52924 == null ? super.onCreateView(str, context, attributeSet) : viewM52924;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f5554.m52934();
        this.f5556.m49766(EnumC24133.ON_DESTROY);
    }

    @Override // p067l.ActivityC2023, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f5554.m52926(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f5553 = false;
        this.f5554.m52933();
        this.f5556.m49766(EnumC24133.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f5554.m52928();
    }

    @Override // android.app.Activity
    public void onResume() {
        C23857 c23857 = this.f5554;
        c23857.m52928();
        super.onResume();
        this.f5553 = true;
        c23857.m52935();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f5556.m49766(EnumC24133.ON_RESUME);
        this.f5554.m52931();
    }

    @Override // android.app.Activity
    public void onStart() {
        C23857 c23857 = this.f5554;
        c23857.m52928();
        super.onStart();
        this.f5555 = false;
        if (!this.f5552) {
            this.f5552 = true;
            c23857.m52930();
        }
        c23857.m52935();
        this.f5556.m49766(EnumC24133.ON_START);
        c23857.m52936();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f5555 = true;
        m5171();
        this.f5554.m52927();
        this.f5556.m49766(EnumC24133.ON_STOP);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + EnumC2483.f3919;
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f5552);
        printWriter.print(" mResumed=");
        printWriter.print(this.f5553);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5555);
        if (getApplication() != null) {
            AbstractC18572.m42264(this).mo42266(str3, fileDescriptor, printWriter, strArr);
        }
        this.f5554.m52929().m16777(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m5171() {
        while (m5170(this.f5554.m52929(), EnumC15415.CREATED)) {
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC7291 m5172() {
        return this.f5554.m52929();
    }

    @Override // p067l.ActivityC2023, android.app.Activity, p067l.InterfaceC0981
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f5554.m52928();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m5170(AbstractC7291 abstractC7291, EnumC15415 enumC15415) {
        boolean zM5170 = false;
        for (ComponentCallbacksC11117 componentCallbacksC11117 : abstractC7291.m16769()) {
            if (componentCallbacksC11117 != null) {
                if (componentCallbacksC11117.getHost() != null) {
                    zM5170 |= m5170(componentCallbacksC11117.getChildFragmentManager(), enumC15415);
                }
                C5003 c5003 = componentCallbacksC11117.mViewLifecycleOwner;
                if (c5003 != null && c5003.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
                    componentCallbacksC11117.mViewLifecycleOwner.m10628(enumC15415);
                    zM5170 = true;
                }
                if (componentCallbacksC11117.mLifecycleRegistry.mo21805().m35142(EnumC15415.STARTED)) {
                    componentCallbacksC11117.mLifecycleRegistry.m49765(enumC15415);
                    zM5170 = true;
                }
            }
        }
        return zM5170;
    }
}
