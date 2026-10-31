package l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܰۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes3.dex */
public class FragmentC13707 extends Fragment {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40903 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC10181 f40904;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m32957(EnumC22901.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC10181 interfaceC10181 = this.f40904;
        if (interfaceC10181 != null) {
            interfaceC10181.onStart();
        }
        m32957(EnumC22901.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC10181 interfaceC10181 = this.f40904;
        if (interfaceC10181 != null) {
            interfaceC10181.mo13306();
        }
        m32957(EnumC22901.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m32957(EnumC22901.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m32957(EnumC22901.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m32957(EnumC22901.ON_DESTROY);
        this.f40904 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m32957(EnumC22901 enumC22901) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C11233.m27803(activity, "activity");
            C5947.m16676(activity, enumC22901);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32958(C4536 c4536) {
        this.f40904 = c4536;
    }
}
