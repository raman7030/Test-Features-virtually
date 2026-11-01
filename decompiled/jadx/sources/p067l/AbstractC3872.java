package p067l;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.֫ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB3L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3872 extends ComponentCallbacksC11117 {

    /* JADX INFO: renamed from: ۗ */
    public C13992 f8381;

    /* JADX INFO: renamed from: ۙ */
    public C16612 f8382;

    /* JADX INFO: renamed from: ۫ */
    public C21620 f8383;

    /* JADX INFO: renamed from: ۬ */
    public final Object f8384;

    /* JADX INFO: renamed from: ᩶ */
    public Drawable f8385;

    /* JADX INFO: renamed from: ᩸ */
    public final Bundle f8386;

    /* JADX INFO: renamed from: ᩹ */
    public C11249 f8387;

    /* JADX INFO: renamed from: ֡ */
    public abstract void mo7634();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7637(String... strArr);

    /* JADX INFO: renamed from: ܺ */
    public abstract boolean mo7648();

    public AbstractC3872() {
        super(R.layout.MT_Protector);
        this.f8384 = new Object();
        this.f8386 = new Bundle();
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8383 = (C21620) new C6874((ActivityC17874) ((C23631) this).requireActivity()).m15765(C21620.class);
        this.f8381 = (C13992) new C6874(requireActivity()).m15765(C13992.class);
        this.f8387 = (C11249) new C6874(this).m15765(C11249.class);
        if (bundle != null) {
            try {
                m7653();
                return;
            } catch (IOException e) {
                m7650(true);
                Bundle bundle2 = this.f8386;
                if (!bundle2.containsKey("filePath")) {
                    bundle2.putString("filePath", "untitled");
                }
                this.f8383.m48823((Throwable) e);
            }
        }
        this.f8387.m26129(mo7648());
    }

    /* JADX INFO: renamed from: ܿ */
    public final Drawable m7651() {
        if (this.f8385 == null) {
            this.f8385 = C7050.m16202(this.f8386.getInt("sideIconType", 0) == 0 ? R.drawable.MT_Protector : R.drawable.MT_Protector).mutate();
        }
        return this.f8385;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7644(String str) {
        String string = UUID.randomUUID().toString();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", string);
        setArguments(arguments);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m7641() {
        String string = requireArguments().getString("state");
        C12826.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m7642() {
        Bundle bundleRequireArguments = requireArguments();
        C12826.requireNonNull(bundleRequireArguments);
        return bundleRequireArguments.getBoolean("top", false);
    }

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17043 m7647() {
        return C19335.m44068(m7641());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7635(int i) {
        Bundle bundle = this.f8386;
        if (i != bundle.getInt("sideIconType", 0)) {
            bundle.putInt("sideIconType", i);
            this.f8385 = null;
            m7654();
            mo7637("sideIconType");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m7652() {
        int i = this.f8386.getInt("pageCount", -1);
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7646() {
        return this.f8386.getString("filePath") != null;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m7639() {
        String string = this.f8386.getString("filePath");
        return string == null || string.equals("untitled");
    }

    /* JADX INFO: renamed from: ܽ */
    public final C6867 m7649() {
        String string = this.f8386.getString("filePath");
        C12826.requireNonNull(string);
        return new C6867(C18524.m42109(string, new String[0]));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7638(boolean z) {
        return m7633("changed", z);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7650(boolean z) {
        m7633(C0708d.f2599O, z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7645(boolean z) {
        m7633("checkFileExists", z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7636(long j) {
        Bundle bundle = this.f8386;
        if (bundle.getLong("fileTime") != j) {
            bundle.putLong("fileTime", j);
            mo7637("fileTime");
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m7643() {
        return this.f8386.getBoolean(C0708d.f2599O);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m7655() {
        return this.f8386.getBoolean("changed");
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m7633(String str, boolean z) {
        Bundle bundle = this.f8386;
        if (bundle.getBoolean(str) == z) {
            return false;
        }
        bundle.putBoolean(str, z);
        mo7637(str);
        return true;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m7654() {
        ActivityC3069 activity = ((C23631) this).getActivity();
        if (activity != null) {
            ((ActivityC17874) activity).m40665();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m7653() {
        InterfaceC22097 interfaceC22097M27247 = C11920.m27247(m7641(), C8685.m20115of(C19335.m44065().mo25505(), new String[0]));
        if (C21879.m49338(interfaceC22097M27247)) {
            try {
                this.f8386.clear();
                this.f8386.putAll(C11150.m25680(interfaceC22097M27247));
            } catch (IOException e) {
                if (!this.f8386.containsKey("filePath")) {
                    this.f8386.putString("filePath", "untitled");
                }
                C21620 c21620 = this.f8383;
                if (c21620 != null) {
                    c21620.m48823((Throwable) e);
                }
            }
            C11249 c11249 = this.f8387;
            if (c11249 != null) {
                c11249.m26129(mo7648());
                return;
            }
            return;
        }
        synchronized (m7640().f48813) {
            AbstractC17043 abstractC17043M44066 = C19335.m44066(m7641());
            if (abstractC17043M44066.mo25094()) {
                byte[] bArrM38664 = abstractC17043M44066.m38664();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArrM38664, 0, bArrM38664.length);
                parcelObtain.setDataPosition(0);
                this.f8386.readFromParcel(parcelObtain);
                parcelObtain.recycle();
                C11249 c112410 = this.f8387;
                if (c112410 != null) {
                    c112410.m26129(mo7648());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final C16612 m7640() {
        if (this.f8382 == null) {
            this.f8382 = C16612.m37667(C11920.m27247(m7641(), C8685.m20115of(C19335.m44065().mo25505(), new String[0])));
        }
        return this.f8382;
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo7634();
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onPause() {
        super.onPause();
        mo7637(new String[0]);
    }
}
