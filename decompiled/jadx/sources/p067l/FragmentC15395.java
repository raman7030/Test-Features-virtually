package p067l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܰۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes3.dex */
public class FragmentC15395 extends Fragment {

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f43984 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC12044 f43985;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m35071(EnumC24133.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC12044 interfaceC12044 = this.f43985;
        if (interfaceC12044 != null) {
            interfaceC12044.onStart();
        }
        m35071(EnumC24133.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC12044 interfaceC12044 = this.f43985;
        if (interfaceC12044 != null) {
            interfaceC12044.mo15194();
        }
        m35071(EnumC24133.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m35071(EnumC24133.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m35071(EnumC24133.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m35071(EnumC24133.ON_DESTROY);
        this.f43985 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m35071(EnumC24133 enumC24133) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C13045.m29865(activity, "activity");
            C8020.m18602(activity, enumC24133);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35072(C6679 c6679) {
        this.f43985 = c6679;
    }
}
