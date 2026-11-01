package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16003 extends ComponentCallbacksC11117 {

    /* JADX INFO: renamed from: ᩶ */
    public Drawable f46349;

    /* JADX INFO: renamed from: ᩸ */
    public AtomicReference f46350;

    /* JADX INFO: renamed from: ᩹ */
    public final Bundle f46351;

    /* JADX INFO: renamed from: ֡ */
    public abstract boolean mo16322();

    /* JADX INFO: renamed from: ۖ */
    public boolean mo19366() {
        return false;
    }

    /* JADX INFO: renamed from: ۚ */
    public boolean mo36364() {
        return this instanceof C7089;
    }

    /* JADX INFO: renamed from: ۜ */
    public abstract String mo16323();

    /* JADX INFO: renamed from: ۡ */
    public C14146 mo19367() {
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo36368() {
        return !(this instanceof C7089);
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo16324();

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo16325();

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC20028 mo19371() {
        return null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo36374() {
    }

    /* JADX INFO: renamed from: ᩵ */
    public boolean mo19372() {
        return this instanceof C9842;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo16326();

    public AbstractC16003() {
        this.f46351 = new Bundle();
    }

    public AbstractC16003(int i) {
        super(i);
        this.f46351 = new Bundle();
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46350 = ((ActivityC18686) requireActivity()).f55795;
        if (bundle == null || !bundle.containsKey("stateDir")) {
            return;
        }
        try {
            m36373((C12828) bundle.getSerializable("stateDir"));
        } catch (IOException e) {
            ((ActivityC18686) requireActivity()).m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onResume() {
        super.onResume();
        this.f46350.set(getClass());
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onHiddenChanged(boolean z) {
        if (z || !isResumed()) {
            return;
        }
        this.f46350.set(getClass());
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo19364(ActivityC18686 activityC18686, boolean z, Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36370() {
        return !m36363() && mo36368();
    }

    /* JADX INFO: renamed from: ܿ */
    public final Drawable m36371() {
        if (this.f46349 == null) {
            this.f46349 = C7050.m16202(mo16324()).mutate();
        }
        return this.f46349;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo19363(C5946 c5946) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36367(String str) {
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", str);
        setArguments(arguments);
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m36365() {
        String string = requireArguments().getString("state");
        C12826.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m36363() {
        Bundle bundleRequireArguments = requireArguments();
        C12826.requireNonNull(bundleRequireArguments);
        return bundleRequireArguments.getBoolean("top", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo36362(byte[] bArr) {
        if (getArguments() != null) {
            throw new RuntimeException("Arguments is not null.");
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(parcelObtain);
        setArguments(bundle);
        parcelObtain.recycle();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12828 m36366(C12828 c12828) {
        return new C12828(c12828, m36365().concat(".dat"));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12828 m36369(C12828 c12828) {
        return new C12828(c12828, m36365().concat(".tat"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12828 m36359(C12828 c12828) {
        return new C12828(c12828, m36365().concat(".lit"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36373(C12828 c12828) {
        C12828 c12828M36359 = m36359(c12828);
        if (c12828M36359.m29398()) {
            byte[] bArrM29399 = c12828M36359.m29399();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrM29399, 0, bArrM29399.length);
            parcelObtain.setDataPosition(0);
            this.f46351.readFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36372(C12828 c12828) {
        C12828 c12828M36359 = m36359(c12828);
        Bundle bundle = this.f46351;
        if (bundle.isEmpty()) {
            c12828M36359.m29395();
            return;
        }
        c12828M36359.m29400();
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        c12828M36359.m29394(bArrMarshall);
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            C12828 c12828M42601 = ((ActivityC18686) requireActivity()).m42601();
            if (!this.f46351.isEmpty()) {
                bundle.putSerializable("stateDir", c12828M42601);
            }
            m36372(c12828M42601);
        } catch (IOException unused) {
        }
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onPause() {
        super.onPause();
        try {
            m36372(((ActivityC18686) requireActivity()).m42601());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36360(Consumer consumer) {
        ActivityC3069 activity = getActivity();
        if (activity != null) {
            consumer.accept((ActivityC18686) activity);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo19368(ActivityC18686 activityC18686) {
        if (!mo36368()) {
            throw new RuntimeException();
        }
        m36361(activityC18686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36361(ActivityC18686 activityC18686) {
        if (!mo36368()) {
            throw new RuntimeException();
        }
        activityC18686.m42589(this);
    }
}
