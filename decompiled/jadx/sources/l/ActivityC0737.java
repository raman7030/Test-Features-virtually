package l;

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
public class ActivityC0737 extends ActivityC23809 implements InterfaceC2811, InterfaceC4222 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2777 = 0;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f2778;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f2779;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C22610 f2780 = C22610.m50581(new C19789(this));

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C20765 f2782 = new C20765(this);

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f2781 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۘ᩻֫] */
    public ActivityC0737() {
        getSavedStateRegistry().m36039("android:support:lifecycle", new InterfaceC8174() { // from class: l.ܺ᩻֫
            @Override // l.InterfaceC8174
            /* JADX INFO: renamed from: ֫ */
            public final Bundle mo1940() {
                int i = ActivityC0737.f2777;
                ActivityC0737 activityC0737 = this.f50013;
                activityC0737.m2842();
                activityC0737.f2782.m47438(EnumC22901.ON_STOP);
                return new Bundle();
            }
        });
        mo9143(new InterfaceC13041() { // from class: l.ۖ᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                this.f9112.f2780.m50586();
            }
        });
        m52495((C4266) new InterfaceC13041() { // from class: l.ۘ᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                this.f13809.f2780.m50586();
            }
        });
        m52496(new InterfaceC14678() { // from class: l.ᩴ᩻֫
            @Override // l.InterfaceC14678
            /* JADX INFO: renamed from: ֫ */
            public final void mo15594(ActivityC23809 activityC23809) {
                this.f60123.f2780.m50583();
            }
        });
    }

    @Override // l.ActivityC23809, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2780.m50586();
        super.onActivityResult(i, i2, intent);
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2782.m47438(EnumC22901.ON_CREATE);
        this.f2780.m50590();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM50582 = this.f2780.m50582(view, str, context, attributeSet);
        return viewM50582 == null ? super.onCreateView(view, str, context, attributeSet) : viewM50582;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM50582 = this.f2780.m50582(null, str, context, attributeSet);
        return viewM50582 == null ? super.onCreateView(str, context, attributeSet) : viewM50582;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2780.m50592();
        this.f2782.m47438(EnumC22901.ON_DESTROY);
    }

    @Override // l.ActivityC23809, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f2780.m50584(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2779 = false;
        this.f2780.m50591();
        this.f2782.m47438(EnumC22901.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2780.m50586();
    }

    @Override // android.app.Activity
    public void onResume() {
        C22610 c22610 = this.f2780;
        c22610.m50586();
        super.onResume();
        this.f2779 = true;
        c22610.m50593();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2782.m47438(EnumC22901.ON_RESUME);
        this.f2780.m50589();
    }

    @Override // android.app.Activity
    public void onStart() {
        C22610 c22610 = this.f2780;
        c22610.m50586();
        super.onStart();
        this.f2781 = false;
        if (!this.f2778) {
            this.f2778 = true;
            c22610.m50588();
        }
        c22610.m50593();
        this.f2782.m47438(EnumC22901.ON_START);
        c22610.m50594();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2781 = true;
        m2842();
        this.f2780.m50585();
        this.f2782.m47438(EnumC22901.ON_STOP);
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
        String str3 = str + EnumC0121.f1143;
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f2778);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2779);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2781);
        if (getApplication() != null) {
            AbstractC17050.m40019(this).mo40021(str3, fileDescriptor, printWriter, strArr);
        }
        this.f2780.m50587().m14867(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m2842() {
        while (m2841(this.f2780.m50587(), EnumC13728.CREATED)) {
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC5180 m2843() {
        return this.f2780.m50587();
    }

    @Override // l.ActivityC23809, android.app.Activity, l.InterfaceC2811
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2780.m50586();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2841(AbstractC5180 abstractC5180, EnumC13728 enumC13728) {
        boolean zM2841 = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 : abstractC5180.m14859()) {
            if (componentCallbacksC9205 != null) {
                if (componentCallbacksC9205.getHost() != null) {
                    zM2841 |= m2841(componentCallbacksC9205.getChildFragmentManager(), enumC13728);
                }
                C2772 c2772 = componentCallbacksC9205.mViewLifecycleOwner;
                if (c2772 != null && c2772.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
                    componentCallbacksC9205.mViewLifecycleOwner.m8565(enumC13728);
                    zM2841 = true;
                }
                if (componentCallbacksC9205.mLifecycleRegistry.mo19832().m33028(EnumC13728.STARTED)) {
                    componentCallbacksC9205.mLifecycleRegistry.m47437(enumC13728);
                    zM2841 = true;
                }
            }
        }
        return zM2841;
    }
}
