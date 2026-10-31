package l;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AbstractFragmentC2801 extends Fragment implements InterfaceC18344, InterfaceC11289, InterfaceC16932, InterfaceC1906 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C17638 f8742;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13132 f8743;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ContextThemeWrapper f8744;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21146 f8747 = new C21146(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8746 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f8748 = new HandlerC23967(this);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Runnable f8745 = new RunnableC7034(this);

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void m8650();

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.MT_Protector;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.f8744 = contextThemeWrapper;
        C17638 c17638 = new C17638(contextThemeWrapper);
        this.f8742 = c17638;
        c17638.m41272((InterfaceC16932) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        m8650();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13132 c13132;
        ContextThemeWrapper contextThemeWrapper = this.f8744;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, C9878.f29902, C2958.m9017(contextThemeWrapper, R.attr.MT_Protector, android.R.attr.preferenceFragmentStyle), 0);
        this.f8746 = typedArrayObtainStyledAttributes.getResourceId(0, this.f8746);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f8744);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f8746, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!this.f8744.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c13132 = (C13132) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c13132 = (C13132) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c13132.setLayoutManager(new C6495(getActivity()));
            c13132.setAccessibilityDelegateCompat(new C23988(c13132));
        }
        this.f8743 = c13132;
        C21146 c21146 = this.f8747;
        c13132.addItemDecoration(c21146);
        c21146.m48099(drawable);
        if (dimensionPixelSize != -1) {
            c21146.m48098(dimensionPixelSize);
        }
        c21146.m48100(z);
        if (this.f8743.getParent() == null) {
            viewGroup2.addView(this.f8743);
        }
        this.f8748.post(this.f8745);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C7055 c7055M41278;
        super.onViewCreated(view, bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (c7055M41278 = this.f8742.m41278()) == null) {
            return;
        }
        c7055M41278.mo6891(bundle2);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f8742.m41273((InterfaceC18344) this);
        this.f8742.m41271((InterfaceC11289) this);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f8742.m41273((InterfaceC18344) null);
        this.f8742.m41271((InterfaceC11289) null);
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        Runnable runnable = this.f8745;
        Handler handler = this.f8748;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        this.f8743 = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C7055 c7055M41278 = this.f8742.m41278();
        if (c7055M41278 != null) {
            Bundle bundle2 = new Bundle();
            c7055M41278.mo6915(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8646() {
        C7055 c7055M41278 = this.f8742.m41278();
        if (c7055M41278 != null) {
            this.f8743.setAdapter(new C6328(c7055M41278));
            c7055M41278.mo6912();
        }
    }

    @Override // l.InterfaceC18344
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8649(C2095 c2095) {
        if (c2095.m6929() == null || !(getActivity() instanceof InterfaceC9151)) {
            return false;
        }
        return ((InterfaceC9151) getActivity()).m23534();
    }

    @Override // l.InterfaceC16932
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8647(C7055 c7055) {
        if (getActivity() instanceof InterfaceC16205) {
            ((InterfaceC16205) getActivity()).m38158();
        }
    }

    @Override // l.InterfaceC1906
    @Deprecated
    public final C2095 findPreference(String str) {
        C17638 c17638 = this.f8742;
        if (c17638 == null) {
            return null;
        }
        return c17638.m41267((CharSequence) str);
    }

    @Override // l.InterfaceC11289
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8648(AbstractC11079 abstractC11079) {
        DialogFragment dialogFragmentC4728;
        if (!(getActivity() instanceof InterfaceC9857 ? ((InterfaceC9857) getActivity()).m24926() : false) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC11079 instanceof C6845) {
                String strM6911 = abstractC11079.m6911();
                dialogFragmentC4728 = new DialogFragmentC20957();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM6911);
                dialogFragmentC4728.setArguments(bundle);
            } else if (abstractC11079 instanceof C19546) {
                String strM6912 = abstractC11079.m6911();
                dialogFragmentC4728 = new DialogFragmentC5434();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM6912);
                dialogFragmentC4728.setArguments(bundle2);
            } else if (abstractC11079 instanceof C22367) {
                String strM6913 = abstractC11079.m6911();
                dialogFragmentC4728 = new DialogFragmentC4728();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM6913);
                dialogFragmentC4728.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragmentC4728.setTargetFragment(this, 0);
            dialogFragmentC4728.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }
}
