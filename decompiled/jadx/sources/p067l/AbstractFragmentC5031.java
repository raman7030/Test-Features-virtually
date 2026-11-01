package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AbstractFragmentC5031 extends Fragment implements InterfaceC19803, InterfaceC13098, InterfaceC18461, InterfaceC4180 {

    /* JADX INFO: renamed from: ۗ */
    public C19132 f11536;

    /* JADX INFO: renamed from: ۙ */
    public C14849 f11537;

    /* JADX INFO: renamed from: ۫ */
    public ContextThemeWrapper f11538;

    /* JADX INFO: renamed from: ᩸ */
    public final C22466 f11541 = new C22466(this);

    /* JADX INFO: renamed from: ᩶ */
    public int f11540 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩹ */
    public final Handler f11542 = new HandlerC25147(this);

    /* JADX INFO: renamed from: ۬ */
    public final Runnable f11539 = new RunnableC9054(this);

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public abstract void m10710();

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
        this.f11538 = contextThemeWrapper;
        C19132 c19132 = new C19132(contextThemeWrapper);
        this.f11536 = c19132;
        c19132.m43518((InterfaceC18461) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        m10710();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C14849 c14849;
        ContextThemeWrapper contextThemeWrapper = this.f11538;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, C11757.f32859, C0989.m11085(contextThemeWrapper, R.attr.MT_Protector, android.R.attr.preferenceFragmentStyle), 0);
        this.f11540 = typedArrayObtainStyledAttributes.getResourceId(0, this.f11540);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f11538);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f11540, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!this.f11538.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c14849 = (C14849) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c14849 = (C14849) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c14849.setLayoutManager(new C8541(getActivity()));
            c14849.setAccessibilityDelegateCompat(new C25167(c14849));
        }
        this.f11537 = c14849;
        C22466 c22466 = this.f11541;
        c14849.addItemDecoration(c22466);
        c22466.m50429(drawable);
        if (dimensionPixelSize != -1) {
            c22466.m50428(dimensionPixelSize);
        }
        c22466.m50430(z);
        if (this.f11537.getParent() == null) {
            viewGroup2.addView(this.f11537);
        }
        this.f11542.post(this.f11539);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C9074 c9074M43524;
        super.onViewCreated(view, bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (c9074M43524 = this.f11536.m43524()) == null) {
            return;
        }
        c9074M43524.mo9017(bundle2);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f11536.m43519((InterfaceC19803) this);
        this.f11536.m43517((InterfaceC13098) this);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f11536.m43519((InterfaceC19803) null);
        this.f11536.m43517((InterfaceC13098) null);
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        Runnable runnable = this.f11539;
        Handler handler = this.f11542;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        this.f11537 = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C9074 c9074M43524 = this.f11536.m43524();
        if (c9074M43524 != null) {
            Bundle bundle2 = new Bundle();
            c9074M43524.mo9041(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10706() {
        C9074 c9074M43524 = this.f11536.m43524();
        if (c9074M43524 != null) {
            this.f11537.setAdapter(new C8383(c9074M43524));
            c9074M43524.mo9038();
        }
    }

    @Override // p067l.InterfaceC19803
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10709(C4360 c4360) {
        if (c4360.m9055() == null || !(getActivity() instanceof InterfaceC11066)) {
            return false;
        }
        return ((InterfaceC11066) getActivity()).m25485();
    }

    @Override // p067l.InterfaceC18461
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo10707(C9074 c9074) {
        if (getActivity() instanceof InterfaceC17770) {
            ((InterfaceC17770) getActivity()).m40370();
        }
    }

    @Override // p067l.InterfaceC4180
    @Deprecated
    public final C4360 findPreference(String str) {
        C19132 c19132 = this.f11536;
        if (c19132 == null) {
            return null;
        }
        return c19132.m43513((CharSequence) str);
    }

    @Override // p067l.InterfaceC13098
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo10708(AbstractC12898 abstractC12898) {
        DialogFragment dialogFragmentC6862;
        if (!(getActivity() instanceof InterfaceC11737 ? ((InterfaceC11737) getActivity()).m26941() : false) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC12898 instanceof C8874) {
                String strM9037 = abstractC12898.m9037();
                dialogFragmentC6862 = new DialogFragmentC22286();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM9037);
                dialogFragmentC6862.setArguments(bundle);
            } else if (abstractC12898 instanceof C20945) {
                String strM9038 = abstractC12898.m9037();
                dialogFragmentC6862 = new DialogFragmentC7533();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM9038);
                dialogFragmentC6862.setArguments(bundle2);
            } else if (abstractC12898 instanceof C23626) {
                String strM9039 = abstractC12898.m9037();
                dialogFragmentC6862 = new DialogFragmentC6862();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM9039);
                dialogFragmentC6862.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            dialogFragmentC6862.setTargetFragment(this, 0);
            dialogFragmentC6862.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }
}
