package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.text.GetChars;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p016c0.C0094d;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0719o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.p066io.UncheckedIOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.᩹ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public class C23631 extends AbstractC3872 {

    /* JADX INFO: renamed from: ۠᩹ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f83025;

    /* JADX INFO: renamed from: ֡֫ */
    public FutureC5767 f75211;

    /* JADX INFO: renamed from: ۖ֫ */
    public C18366 f75214;

    /* JADX INFO: renamed from: ۘ֫ */
    public C25072 f75216;

    /* JADX INFO: renamed from: ۙ֫ */
    public String f75217;

    /* JADX INFO: renamed from: ۚ֫ */
    public volatile boolean f75218;

    /* JADX INFO: renamed from: ۛ */
    public long f75219;

    /* JADX INFO: renamed from: ۜ֫ */
    public DialogInterfaceC2564 f75220;

    /* JADX INFO: renamed from: ۟ */
    public C8331 f75221;

    /* JADX INFO: renamed from: ۠֫ */
    public C21070 f75222;

    /* JADX INFO: renamed from: ۢ֫ */
    public C15036 f75224;

    /* JADX INFO: renamed from: ۤ */
    public C6197 f75225;

    /* JADX INFO: renamed from: ۧ֫ */
    public C20279 f75226;

    /* JADX INFO: renamed from: ۨ */
    public String f75227;

    /* JADX INFO: renamed from: ۬֫ */
    public boolean f75228;

    /* JADX INFO: renamed from: ܰ */
    public C17143 f75229;

    /* JADX INFO: renamed from: ܳ֫ */
    public C22864 f75230;

    /* JADX INFO: renamed from: ܶ֫ */
    public C13693 f75231;

    /* JADX INFO: renamed from: ܽ֫ */
    public volatile boolean f75233;

    /* JADX INFO: renamed from: ܿ֫ */
    public C7741 f75234;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f75235;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C21050 f75236;

    /* JADX INFO: renamed from: ᩶֫ */
    public C24301 f75238;

    /* JADX INFO: renamed from: ᩷֫ */
    public ResultCallback f75239;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f75240;

    /* JADX INFO: renamed from: ᩹֫ */
    public C6456 f75241;

    /* JADX INFO: renamed from: ᩺ */
    public C14146 f75242;

    /* JADX INFO: renamed from: ᩻֫ */
    public Runnable f75243;

    /* JADX INFO: renamed from: ᩵֫ */
    public FutureC5767 f75237 = FutureC5767.m12882(null);

    /* JADX INFO: renamed from: ֨֫ */
    public C2943 f75212 = new C2943();

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC9749 f75213 = new C4185(this);

    /* JADX INFO: renamed from: ۗ֫ */
    public long f75215 = 0;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Object f75223 = new Object();

    /* JADX INFO: renamed from: ܺ֫ */
    public final C6724 f75232 = new C6724();

    static {
        ApplicationC14266.m56479(158);
        f83025 = new short[]{81, 25580, 25565, 25536, 25548, 25494, 25536, 25557, 25556, 25494, 25563, 25556, 25561, 25547, 25547, 9241, -12663, -12648, -12642, -12656, -12649, -12642, -12634, -12644, -12643, -12656, -12659, -12656, -12649, -12642, -25933, -18869, 23773, -12620, -12627, -12588, -12630, -12672, -12649, -12659, -12648, -12671};
    }

    /* JADX INFO: renamed from: ۬ */
    private native void m52534();

    /* JADX INFO: renamed from: ܳ */
    private native void m52536(boolean z);

    /* JADX INFO: renamed from: ܿ֫ */
    private native void m52545();

    @Override // p067l.ComponentCallbacksC11117
    public native void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

    /* JADX INFO: renamed from: ֫ */
    public static C10891 m52482(final C23631 c23631, final C24301 c24301) {
        c23631.getClass();
        final C6197 c6197 = (C6197) m52518(new Callable() { // from class: l.ᩳ۠ᩳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C23631 c23632 = this.f59123;
                c23632.getClass();
                final C6197 c6198 = new C6197(c23632, c24301);
                if (c23632.f75225 != null) {
                    throw new IllegalStateException("A save capture is already waiting");
                }
                c23632.f75225 = c6198;
                C14146 c14146 = c6198.f15601;
                if (c14146 != null) {
                    c14146.m32390(c6198.f15607);
                }
                C11249 c11249 = c6198.f15606;
                if (c11249 != null) {
                    c11249.m26115(c6198.f15609);
                }
                if (c23632.f75236 != null) {
                    FutureC5767 futureC5767M47483 = c23632.f75236.m47483();
                    c6198.f15605 = futureC5767M47483;
                    futureC5767M47483.m12887(new InterfaceC9988() { // from class: l.ۖܶᩳ
                        @Override // p067l.InterfaceC9988
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo6895(Object obj, Throwable th) {
                            c6198.m14046();
                        }
                    });
                }
                if (c23632.f75222 != null) {
                    C21070 c21070 = c23632.f75222;
                    c6198.f15612 = c21070;
                    FutureC5767 futureC5767M47551 = c21070.m47551();
                    c6198.f15610 = futureC5767M47551;
                    futureC5767M47551.m12887((InterfaceC9988) new C8979(1, c6198));
                }
                c6198.m14046();
                return c6198;
            }
        });
        try {
            try {
                return (C10891) c6197.f15608.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Exception) {
                    throw ((Exception) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        } catch (Throwable th) {
            m52518(new Callable() { // from class: l.ܿ۠ᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CancellationException cancellationException = new CancellationException("Saving observation ended");
                    C6197 c6198 = c6197;
                    c6198.m14045(cancellationException);
                    C10891 c10891 = c6198.f15599;
                    if (c10891 == null) {
                        return null;
                    }
                    c10891.close();
                    return null;
                }
            });
            throw th;
        }
    }

    public C23631() {
        setHasOptionsMenu(true);
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m52572() {
        this.f8386.remove("temp");
        C11249 c11249 = this.f8387;
        if (c11249 != null) {
            c11249.m26129(false);
        }
        mo7637("temp");
    }

    @Override // p067l.AbstractC3872, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f75233 = false;
        this.f75224 = ViewOnClickListenerC20541.m46373(this, new C12903(this));
        this.f75221 = ViewOnClickListenerC20541.m46367(this, new C10696(this));
        this.f75234 = C10423.m24115(this, new C24975(1, this));
        if (bundle != null) {
            this.f75215 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52489(C23631 c23631, int i) {
        if (i == 2) {
            c23631.m52511();
        }
    }

    @Override // p067l.AbstractC3872
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo7648() {
        return this.f8386.getBoolean("temp", false);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8387.m26119(this, view.findViewById(R.id.MT_Protector), (C14146) view.findViewById(R.id.MT_Protector));
        this.f8387.m26152(getResources().getBoolean(R.bool.MT_Protector));
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.MT_Protector);
        C12245 c12245 = new C12245((ActivityC17874) requireActivity());
        c12245.m28234(false);
        c12245.m28232();
        progressBar.setIndeterminateDrawable(c12245);
        this.f8387.m26120(this, progressBar);
        final TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f8387.m26121(this, textView);
        this.f8387.m26138(this, textView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ֨ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f57419.m52483(view2);
            }
        });
        textView2.setOnClickListener(new ViewOnClickListenerC4464(0, this));
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۠֨ᩳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C7050.m16211((CharSequence) textView.getText().toString());
                return true;
            }
        });
        C14146 c14146 = (C14146) view.findViewById(R.id.MT_Protector);
        this.f75242 = c14146;
        c14146.m32392(this.f75213);
        C14146 c14147 = this.f75242;
        C11249 c11249 = this.f8387;
        C12826.requireNonNull(c11249);
        c14147.m32399(new C20677(c11249));
        this.f75242.m32391(new C8328(this));
        this.f75227 = bundle == null ? null : bundle.getString("editSessionIdOnStart");
        this.f75219 = bundle == null ? 0L : bundle.getLong("editSessionMarkOnStart");
        InterfaceC24784 viewLifecycleOwner = getViewLifecycleOwner();
        C14146 c14148 = this.f75242;
        C12826.requireNonNull(c14148);
        this.f75232.m15372(viewLifecycleOwner, new C10696(c14148));
        this.f75241 = new C6456(view, this.f75242);
        C17143 c17143 = new C17143((ActivityC17874) requireActivity(), this.f75242, TextBundle.TEXT_ENTRY, new C19608(this, view));
        this.f75229 = c17143;
        c17143.m38844(getViewLifecycleOwner(), this.f75241, ActivityC10578.class);
        this.f75242.m32398(new C18937(this));
        this.f75242.m32394(new InterfaceC10005() { // from class: l.֡۠ᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i, int i2) {
                this.f4427.m52555();
            }
        });
        this.f75242.m32402(new C16254(this));
        m52538();
        m52555();
        this.f75228 = true;
        this.f75241.m14752();
        m52558(-1, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52492(C23631 c23631, View view) {
        int i;
        if (c23631.m52553() || c23631.m52532() || c23631.m52535()) {
            i = C16412.f48248;
        } else {
            C24301 c24301 = c23631.f75238;
            i = c24301 == null ? -1 : c24301.f76968;
        }
        if (i != -1 && !c23631.m52507()) {
            c23631.m52520(i);
        } else {
            c23631.m52483(view);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52497(C23631 c23631, C6495 c6495, RuntimeException runtimeException) {
        C14146 c14146;
        if (c23631.f75228 && (c14146 = c23631.f75242) != null && c14146.m32500() == c6495) {
            C18366 c18366 = c23631.f75214;
            if (c18366 != null) {
                c18366.m41848();
                c23631.f75214 = null;
            }
            c23631.m7650(true);
            c23631.f75242.m32471(true);
            c23631.f8383.m48823((Throwable) runtimeException);
        }
    }

    @Override // p067l.AbstractC3872, p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("editSessionIdOnStart", this.f75227);
        bundle.putLong("editSessionMarkOnStart", this.f75219);
        bundle.putLong("transFileTime", this.f75215);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m52485(final C6867 c6867) {
        C20671 c20671BuildDialog = ((ActivityC17874) requireActivity()).buildDialog();
        c20671BuildDialog.m46730(m52579());
        c20671BuildDialog.m46718(getString(R.string.MT_Protector, c6867.f17850.getName()));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22018(1, this, c6867));
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C23631 c23631 = this.f49336;
                c23631.f75242.m32520(true);
                c23631.m7638(true);
                c23631.m7636(c6867.f17850.mo25091());
            }
        });
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f75220;
        if (dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
        this.f75220 = dialogInterfaceC2564M46732;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m52520(int i) {
        ActivityC17874 activityC17874 = (ActivityC17874) requireActivity();
        C14146 c14146 = this.f75242;
        C13693 c13693 = this.f75231;
        int[] iArrM32433 = c14146.m32433();
        Charset charsetM37298 = C16412.m37298(i);
        new C22471(c14146, c13693, iArrM32433, activityC17874, charsetM37298, c14146.m32595().getBytes(charsetM37298).length).m22250();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m52521(C6867 c6867) {
        C20671 c20671BuildDialog = ((ActivityC17874) requireActivity()).buildDialog();
        c20671BuildDialog.m46730(m52579());
        int i = 0;
        c20671BuildDialog.m46718(getString(R.string.MT_Protector, c6867.f17850.getName()));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11170(i, this));
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10499(this, c6867, i));
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f75220;
        if (dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
        this.f75220 = dialogInterfaceC2564M46732;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM40675 = ((ActivityC17874) requireActivity()).m40675(R.layout.MT_Protector);
        if (viewM40675 == null) {
            viewM40675 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C12826.requireNonNull(viewM40675);
        }
        C7050.m16213(new RunnableC3439(1, this), 600L);
        C9269.f25170.m4066(getViewLifecycleOwner(), new C22550(1, this));
        return viewM40675;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52558(final int i, final boolean z, final boolean z2) {
        Point pointM32536;
        C21050 c21050;
        C14146 c14146;
        if (this.f75218) {
            return;
        }
        if (this.f75226 != null) {
            this.f75243 = new Runnable() { // from class: l.ۙ֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16728.m52558(i, z, z2);
                }
            };
            if (!this.f75228 || (c14146 = this.f75242) == null) {
                return;
            }
            c14146.m32476(true);
            this.f8387.m26123(this, true);
            return;
        }
        C21070 c21070 = this.f75222;
        if (c21070 != null) {
            this.f75243 = new Runnable() { // from class: l.ۗ֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12075.m52558(i, z, z2);
                }
            };
            c21070.m47545();
            return;
        }
        boolean zM7639 = m7639();
        this.f75235 = zM7639;
        if (!zM7639 && !z && !m7649().f17850.mo25094()) {
            this.f8383.m48823((Throwable) new FileNotFoundException(m7649().f17850.mo25505()));
            this.f75233 = true;
            return;
        }
        Point point = new Point();
        if (z2 && (c21050 = this.f75236) != null) {
            pointM32536 = c21050.m47486();
            point = this.f75236.m47487();
        } else if (z2 && this.f75228) {
            C14146 c14147 = this.f75242;
            pointM32536 = c14147.m32536(c14147.m32508());
            point.x = this.f75242.getScrollX();
            point.y = this.f75242.m32472();
        } else {
            pointM32536 = null;
        }
        final Point point2 = pointM32536;
        final Point point3 = point;
        C21050 c21051 = this.f75236;
        if (c21051 != null || this.f75231 != null) {
            if (c21051 != null) {
                C14146 c14148 = c21051.f66075;
                C14146 c14149 = this.f75242;
                if (c14148 != c14149 && this.f75228) {
                    if (this.f75230 == null) {
                        this.f75230 = c14149.m32603();
                    }
                    this.f8387.m26123(this, true);
                }
            }
            this.f75243 = new Runnable() { // from class: l.۬֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41446.m52568(z, i, point2, point3);
                }
            };
            m52543(false);
            return;
        }
        m52568(z, i, point2, point3);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onResume() {
        super.onResume();
        if (this.f75228) {
            ((ActivityC17874) requireActivity()).m12272(this.f75242);
            if (this.f75229.m38845() && this.f75228) {
                this.f75241.m14752();
            }
        }
        m52577();
        m52517();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m52577() {
        ActivityC3069 activity = getActivity();
        if (activity == null || !((ActivityC17874) activity).m40671()) {
            boolean z = ApplicationC21448.f67650.getBoolean("check_file_time", true);
            boolean z2 = ApplicationC21448.f67650.getBoolean("check_file_exists", true);
            if ((z2 || z) && isResumed() && !m7643() && m7646() && !m7639()) {
                C6867 c6867M7649 = m7649();
                AbstractC17043 abstractC17043 = c6867M7649.f17850;
                if (abstractC17043.getClass() == C16433.class) {
                    return;
                }
                boolean zMo25094 = abstractC17043.mo25094();
                Bundle bundle = this.f8386;
                if (!zMo25094) {
                    if (z2 && bundle.getBoolean("checkFileExists")) {
                        m52521(c6867M7649);
                        return;
                    }
                    return;
                }
                if (z) {
                    long j = bundle.getLong("fileTime", -1L);
                    if (j == -1 || abstractC17043.mo25091() == j) {
                        return;
                    }
                    m52485(c6867M7649);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m52573() {
        if (this.f75218) {
            return;
        }
        final InterfaceC22097 interfaceC22097M27247 = C11920.m27247(m7641(), C8685.m20115of(C19335.m44065().mo25505(), new String[0]));
        if (!C21879.m49338(interfaceC22097M27247) && this.f75231 == null && this.f75222 == null && this.f75226 == null) {
            final C16612 c16612M7640 = m7640();
            C4081.m8190().postDelayed(new Runnable() { // from class: l.۟ۖᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C23631 c23631 = this.f24899;
                    C16612 c16612 = c16612M7640;
                    C9907 c9907M37673 = c16612.m37673();
                    try {
                        if (c9907M37673 == null) {
                            return;
                        }
                        try {
                            c23631.m7647().mo25503();
                            C19335.m44070(c23631.m7641()).mo25503();
                            synchronized (c16612.f48813) {
                                C19335.m44066(c23631.m7641()).mo25503();
                            }
                            if (c23631.f8386.getBoolean("pageMode")) {
                                int iM7652 = c23631.m7652();
                                for (int i = 0; i < iM7652; i++) {
                                    C19335.m44068(c23631.m7641() + "-" + i).mo25503();
                                }
                            }
                            c9907M37673.close();
                        } catch (Error | RuntimeException e) {
                            c9907M37673.m23205(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c9907M37673.close();
                        throw th;
                    }
                }
            }, 500L);
            return;
        }
        this.f75218 = true;
        this.f75243 = null;
        C18366 c18366 = this.f75214;
        if (c18366 != null) {
            c18366.m41848();
            this.f75214 = null;
        }
        FutureC5767 futureC5767M12882 = FutureC5767.m12882(null);
        C21070 c21070 = this.f75222;
        if (c21070 != null) {
            futureC5767M12882 = c21070.m47551().m12888((InterfaceC16692) new C18545());
            this.f75222.m47545();
        }
        FutureC5767 futureC5767M12883 = (this.f75231 == null && this.f75236 == null) ? FutureC5767.m12882(null) : m52543(true);
        C20279 c20279 = this.f75226;
        FutureC5767 futureC5767M12884 = c20279 == null ? FutureC5767.m12882(null) : c20279.f62668;
        final C23731 c23731M52765 = C23731.m52765(interfaceC22097M27247);
        FutureC5767 futureC5767M12888 = this.f75237.m12888((InterfaceC16692) new C24420(6));
        FutureC5767 futureC5767M52768 = c23731M52765.m52768();
        C4081.m8190().removeCallbacksAndMessages(this.f8384);
        FutureC5767.m12875(futureC5767M12882, futureC5767M12883, futureC5767M12884, futureC5767M12888, futureC5767M52768, m7640().m37671()).m12897(new Runnable() { // from class: l.ܳ֨ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C24913.m54705(interfaceC22097M27247);
                    C23631 c23631 = this.f45945;
                    c23631.m7647().mo25503();
                    C19335.m44070(c23631.m7641()).mo25503();
                    C19335.m44066(c23631.m7641()).mo25503();
                    if (c23631.f8386.getBoolean("pageMode")) {
                        int iM7652 = c23631.m7652();
                        for (int i = 0; i < iM7652; i++) {
                            C19335.m44068(c23631.m7641() + "-" + i).mo25503();
                        }
                    }
                } catch (IOException e) {
                    throw new C15154(e);
                }
            }
        }, C4081.f8988).m12887(new InterfaceC9988() { // from class: l.᩻֨ᩳ
            @Override // p067l.InterfaceC9988
            /* JADX INFO: renamed from: ۧ */
            public final void mo6895(Object obj, Throwable th) {
                C21620 c21620;
                c23731M52765.m52769(th);
                if (th == null || (c21620 = this.f77819.f8383) == null) {
                    return;
                }
                c21620.m48823(th);
            }
        });
    }

    @Override // p067l.AbstractC3872
    /* JADX INFO: renamed from: ֫ */
    public final void mo7637(String... strArr) {
        final InterfaceC22097 interfaceC22097M27247 = C11920.m27247(m7641(), C8685.m20115of(C19335.m44065().mo25505(), new String[0]));
        if (!C21879.m49338(interfaceC22097M27247) && this.f75222 == null && this.f75231 == null) {
            AbstractC17043 abstractC17043M44066 = C19335.m44066(m7641());
            final C16612 c16612M7640 = m7640();
            final RunnableC10400 runnableC10400 = new RunnableC10400(abstractC17043M44066, this.f8386, c16612M7640.f48813);
            C4081.m8188(new Runnable() { // from class: l.ܰۖᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC10400 runnableC10401 = runnableC10400;
                    C9907 c9907M37673 = c16612M7640.m37673();
                    try {
                        if (c9907M37673 == null) {
                            return;
                        }
                        try {
                            runnableC10401.m24095();
                            c9907M37673.close();
                        } catch (IOException e) {
                            c9907M37673.m23205(e);
                            c9907M37673.close();
                        } catch (Error e2) {
                            e = e2;
                            c9907M37673.m23205(e);
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            c9907M37673.m23205(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c9907M37673.close();
                        throw th;
                    }
                }
            }, this.f8384, 200L);
            return;
        }
        if (this.f75218 || strArr.length == 0) {
            return;
        }
        final C2943 c2943 = new C2943();
        c2943.m4837(this.f8386, strArr);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7050.m16212(new Runnable() { // from class: l.᩸۠ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71782.m52487(interfaceC22097M27247, c2943);
                }
            });
            return;
        }
        C20279 c20279 = this.f75226;
        if (c20279 != null) {
            c20279.f62670.m4837(this.f8386, strArr);
        }
        m52487(interfaceC22097M27247, c2943);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m52487(final InterfaceC22097 interfaceC22097, final C2943 c2943) {
        FutureC5767 futureC5767M12882;
        if (this.f75218) {
            return;
        }
        if (this.f75222 != null) {
            this.f75212.m4838(c2943);
            futureC5767M12882 = this.f75222.m47551().m12888((InterfaceC16692) new C11841());
        } else {
            futureC5767M12882 = FutureC5767.m12882(Boolean.FALSE);
        }
        if (this.f75231 != null && this.f75236 == null && this.f75228) {
            return;
        }
        final C23731 c23731M52765 = C23731.m52765(interfaceC22097);
        final C8467 c8467 = C24560.f77765;
        this.f75237 = FutureC5767.m12875(this.f75237, futureC5767M12882.m12904(new InterfaceC22729() { // from class: l.ۛ֨ᩳ
            @Override // p067l.InterfaceC22729
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C23731 c23731 = c23731M52765;
                if (zBooleanValue) {
                    c23731.m52769((Throwable) null);
                    return FutureC5767.m12882(null);
                }
                FutureC5767 futureC5767M52768 = c23731.m52768();
                final C23631 c23631 = this.f20509;
                final InterfaceC22097 interfaceC22098 = interfaceC22097;
                final C2943 c2944 = c2943;
                final C8467 c8468 = c8467;
                return futureC5767M52768.m12897(new Runnable() { // from class: l.ܽ۠ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23631.m52504(c23631, interfaceC22098, c2944, c8468);
                    }
                }, c8468.f22724);
            }
        }).m12887(new InterfaceC9988() { // from class: l.ۨ֨ᩳ
            @Override // p067l.InterfaceC9988
            /* JADX INFO: renamed from: ۧ */
            public final void mo6895(Object obj, Throwable th) {
                C21620 c21620;
                c23731M52765.m52769((Throwable) null);
                if (th == null || (c21620 = this.f37038.f8383) == null) {
                    return;
                }
                c21620.m48823(th);
            }
        }));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52504(C23631 c23631, InterfaceC22097 interfaceC22097, C2943 c2943, C8467 c8467) {
        if (c23631.f75218) {
            return;
        }
        try {
            C13693.m31112(interfaceC22097, c2943, c8467);
        } catch (IOException e) {
            throw new C15154(e);
        }
    }

    @Override // p067l.AbstractC3872
    /* JADX INFO: renamed from: ֡ */
    public final void mo7634() {
        if (!C21879.m49338(C11920.m27247(m7641(), C8685.m20115of(C19335.m44065().mo25505(), new String[0]))) && this.f75222 == null && this.f75231 == null) {
            AbstractC17043 abstractC17043M44066 = C19335.m44066(m7641());
            C4081.m8190().removeCallbacksAndMessages(this.f8384);
            C16612 c16612M7640 = m7640();
            RunnableC10400 runnableC10400 = new RunnableC10400(abstractC17043M44066, this.f8386, c16612M7640.f48813);
            C9907 c9907M37673 = c16612M7640.m37673();
            try {
                if (c9907M37673 == null) {
                    return;
                }
                try {
                    runnableC10400.m24095();
                    c9907M37673.close();
                } catch (IOException e) {
                    c9907M37673.m23205(e);
                    c9907M37673.close();
                } catch (Error e2) {
                    e = e2;
                    c9907M37673.m23205(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    c9907M37673.m23205(e);
                    throw e;
                }
            } catch (Throwable th) {
                c9907M37673.close();
                throw th;
            }
        }
    }

    @Override // p067l.AbstractC3872, p067l.ComponentCallbacksC11117
    public final void onPause() {
        super.onPause();
        ((ActivityC17874) requireActivity()).m12270();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        C14146 c14146;
        C14146 c14147;
        C6197 c6197 = this.f75225;
        if (c6197 != null) {
            c6197.m14045(new CancellationException("Saving view was destroyed"));
        }
        this.f75211 = null;
        super.onDestroyView();
        if (this.f75222 == null && this.f75231 != null && this.f75236 == null) {
            m52543(true);
        }
        C21050 c21050 = this.f75236;
        if (c21050 != null) {
            c21050.m47482();
        }
        this.f75228 = false;
        this.f75243 = null;
        if (this.f75230 != null) {
            this.f75242.m32476(false);
            this.f75242.m32406(this.f75230);
            this.f75230 = null;
            if (this.f75236 == null && this.f75222 == null && this.f75226 == null) {
                this.f8387.m26123(this, false);
            }
        }
        C21070 c21070 = this.f75222;
        if (c21070 != null) {
            c21070.m47549();
        }
        C17143 c17143 = this.f75229;
        if (c17143 != null && (c21050 == null || c21050.f66075 != this.f75242)) {
            c17143.m38856();
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f75220;
        if (dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855()) {
            dialogInterfaceC2564.dismiss();
        }
        this.f75220 = null;
        C14146 c14148 = this.f75242;
        if (c14148 != null) {
            c14148.m32391((C8328) null);
            if (c21050 != null) {
                C14146 c14149 = c21050.f66075;
                C14146 c141410 = this.f75242;
                if (c14149 == c141410) {
                    c141410.m32402((InterfaceC20853) null);
                    this.f75242.m32399((InterfaceC16176) null);
                } else if (c21070 != null) {
                    c14146 = c21070.f66200;
                    c14147 = this.f75242;
                    if (c14146 == c14147) {
                        c14147.m32402((InterfaceC20853) null);
                        this.f75242.m32399((InterfaceC16176) null);
                    } else if (this.f75242.m32500() instanceof C6495) {
                        this.f75242.m32402((InterfaceC20853) null);
                        this.f75242.m32399((InterfaceC16176) null);
                        this.f75242.mo27932((CharSequence) "");
                    } else if (this.f75242.m32500().mo4005()) {
                        final C21620 c21620 = this.f8383;
                        m7640().m37672(this.f75242.m32500(), C4081.f8988).m12887(new InterfaceC9988() { // from class: l.ᩴ֨ᩳ
                            @Override // p067l.InterfaceC9988
                            /* JADX INFO: renamed from: ۧ */
                            public final void mo6895(Object obj, Throwable th) {
                                C21620 c21621;
                                if (th == null || (c21621 = c21620) == null) {
                                    return;
                                }
                                c21621.m48823(th);
                            }
                        });
                    }
                } else if (this.f75242.m32500() instanceof C6495) {
                    this.f75242.m32402((InterfaceC20853) null);
                    this.f75242.m32399((InterfaceC16176) null);
                    this.f75242.mo27932((CharSequence) "");
                } else if (this.f75242.m32500().mo4005()) {
                    final C21620 c21621 = this.f8383;
                    m7640().m37672(this.f75242.m32500(), C4081.f8988).m12887(new InterfaceC9988() { // from class: l.ᩴ֨ᩳ
                        @Override // p067l.InterfaceC9988
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo6895(Object obj, Throwable th) {
                            C21620 c21622;
                            if (th == null || (c21622 = c21621) == null) {
                                return;
                            }
                            c21622.m48823(th);
                        }
                    });
                }
            } else if (c21070 != null) {
                c14146 = c21070.f66200;
                c14147 = this.f75242;
                if (c14146 == c14147) {
                    c14147.m32402((InterfaceC20853) null);
                    this.f75242.m32399((InterfaceC16176) null);
                } else if (this.f75242.m32500() instanceof C6495) {
                    this.f75242.m32402((InterfaceC20853) null);
                    this.f75242.m32399((InterfaceC16176) null);
                    this.f75242.mo27932((CharSequence) "");
                } else if (this.f75242.m32500().mo4005()) {
                    final C21620 c21622 = this.f8383;
                    m7640().m37672(this.f75242.m32500(), C4081.f8988).m12887(new InterfaceC9988() { // from class: l.ᩴ֨ᩳ
                        @Override // p067l.InterfaceC9988
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo6895(Object obj, Throwable th) {
                            C21620 c21623;
                            if (th == null || (c21623 = c21622) == null) {
                                return;
                            }
                            c21623.m48823(th);
                        }
                    });
                }
            } else if (this.f75242.m32500() instanceof C6495) {
                this.f75242.m32402((InterfaceC20853) null);
                this.f75242.m32399((InterfaceC16176) null);
                this.f75242.mo27932((CharSequence) "");
            } else if (this.f75242.m32500().mo4005()) {
                final C21620 c21623 = this.f8383;
                m7640().m37672(this.f75242.m32500(), C4081.f8988).m12887(new InterfaceC9988() { // from class: l.ᩴ֨ᩳ
                    @Override // p067l.InterfaceC9988
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo6895(Object obj, Throwable th) {
                        C21620 c21624;
                        if (th == null || (c21624 = c21623) == null) {
                            return;
                        }
                        c21624.m48823(th);
                    }
                });
            }
        }
        this.f75216 = null;
        this.f75240 = 0;
        this.f75241 = null;
        this.f75242 = null;
        this.f75229 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52505(C23631 c23631, InterfaceMenuC1983 interfaceMenuC1983, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, Boolean bool) {
        C24301 c24301;
        interfaceMenuC1983.findItem(R.id.MT_Protector).setTitle(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector);
        boolean zBooleanValue = bool.booleanValue();
        int i = R.string.MT_Protector;
        if (zBooleanValue) {
            menuItem.setVisible(false);
            c23631.f8387.m26146(c23631.m52535());
            c23631.f8387.m26143(false);
            menuItem2.setTitle(R.string.MT_Protector);
        } else {
            menuItem.setVisible(true);
            menuItem.setTitle(R.string.MT_Protector);
            String lowerCase = c23631.m7649().m12210().toLowerCase();
            boolean zEquals = lowerCase.equals(".smali");
            boolean zEquals2 = lowerCase.equals(".jasm");
            c23631.f8387.m26146(zEquals || zEquals2);
            c23631.f8387.m26143(zEquals);
            if (!zEquals2) {
                i = R.string.MT_Protector;
            }
            menuItem2.setTitle(i);
        }
        if (bool.booleanValue() && (c24301 = c23631.f75238) != null && c24301.m53634() && c23631.f75238.f76967 > 0) {
            menuItem3.setVisible(true);
            C11249 c11249 = c23631.f8387;
            C14281 c14281 = c23631.f75238.f76966;
            c11249.m26148((c14281 == null || c14281.m32841() == null || !ActivityC17874.m40645()) ? false : true);
            return;
        }
        menuItem3.setVisible(false);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String name;
        C15036 c15036;
        int i = 1;
        if (this.f8387.m26151()) {
            return true;
        }
        this.f75242.m32507();
        int itemId = menuItem.getItemId();
        final int i2 = 0;
        z = false;
        boolean z = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f75242.m32501());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible("HTML".equalsIgnoreCase(this.f75229.m38855()) || "Markdown".equalsIgnoreCase(this.f75229.m38855()));
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (this.f75242.m32555() == null) {
                menuItemFindItem.setVisible(false);
            } else {
                menuItemFindItem.setVisible(true);
                if (C24414.m53850() && ApplicationC21448.f67649.getBoolean("cc", true)) {
                    z = true;
                }
                menuItemFindItem.setChecked(z);
            }
            this.f8387.m26140(this.f75242.m32438());
            this.f8387.m26150(this.f75242.m32578());
            if (m52542()) {
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C7991.m18505((GetChars) this.f75242.m32500()));
                return true;
            }
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(m52531());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!m7655()) {
                m52558(-1, false, true);
                return true;
            }
            C20671 c20671BuildDialog = ((ActivityC17874) requireActivity()).buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10618(i, this));
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC17874 activityC17874 = (ActivityC17874) requireActivity();
            if (!m7655()) {
                activityC17874.m40663(this);
                return true;
            }
            C20671 c20671BuildDialog2 = activityC17874.buildDialog();
            c20671BuildDialog2.m46730(m52579());
            c20671BuildDialog2.m46710(R.string.MT_Protector);
            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC16533(this, activityC17874, i2));
            c20671BuildDialog2.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22570(this, activityC17874, i2));
            c20671BuildDialog2.m46732();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f75229.m38857();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f75229.m38837(ActivityC10578.class);
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            m52572();
            m7654();
            DialogInterfaceOnClickListenerC12648.m29079(R.string.MT_Protector, (ActivityC17874) requireActivity(), "menu_keep_in_editor_tip");
            return true;
        }
        if (m7643()) {
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            int i3 = C16412.f48239;
            String[] strArr = new String[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                strArr[i4] = C16412.m37300(i4);
            }
            final int[] iArr = {this.f75238.f76968};
            C20671 c20671BuildDialog3 = ((ActivityC17874) requireActivity()).buildDialog();
            c20671BuildDialog3.m46727(R.string.MT_Protector);
            c20671BuildDialog3.m46723(strArr, this.f75238.f76968, new DialogInterfaceOnClickListenerC22573(i, iArr));
            c20671BuildDialog3.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    C23631.m52506(this.f5680, iArr, dialogInterface);
                }
            });
            c20671BuildDialog3.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog3.m46732();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC17874 activityC17875 = (ActivityC17874) requireActivity();
            if (!m7639() || (c15036 = this.f75224) == null) {
                m52561(activityC17875, (ResultCallback) null);
                return true;
            }
            this.f75239 = null;
            c15036.m34411(null, R.string.MT_Protector, m7649().f17850.getName(), Bundle.EMPTY);
            return true;
        }
        Bundle bundle = this.f8386;
        if (itemId == R.id.MT_Protector) {
            AbstractC17043 abstractC17043 = m7649().f17850;
            String string = bundle.getString("save_as_path");
            if (string == null) {
                string = abstractC17043.getParent();
            }
            this.f75239 = null;
            this.f75224.m34411(string, R.string.MT_Protector, abstractC17043.getName(), Bundle.EMPTY);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C6867 c6867M7649 = m7649();
            String string2 = bundle.getString("save_as_path");
            if (string2 == null) {
                string2 = c6867M7649.f17850.getParent();
            }
            C8331 c8331 = this.f75221;
            String str = c6867M7649.m12209() + "_plain" + c6867M7649.m12210();
            c8331.getClass();
            C8331.m19220(c8331, R.string.MT_Protector, string2, str, (String[]) null, 24);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            int i5 = C16412.f48239;
            String[] strArr2 = new String[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                strArr2[i6] = C16412.m37300(i6);
            }
            C20671 c20671BuildDialog4 = ((ActivityC17874) requireActivity()).buildDialog();
            c20671BuildDialog4.m46727(R.string.MT_Protector);
            c20671BuildDialog4.m46723(strArr2, this.f75238.f76968, new DialogInterface.OnClickListener() { // from class: l.᩺֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C23631.m52525(this.f75903, dialogInterface, i7);
                }
            });
            c20671BuildDialog4.m46736(R.string.MT_Protector, null);
            c20671BuildDialog4.m46732();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String[] strArr3 = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
            final String[] strArr4 = {"\r\n", "\r", "\n"};
            String strM32595 = this.f75242.m32595();
            strM32595.getClass();
            if (strM32595.equals("\r")) {
                i2 = 1;
            } else if (!strM32595.equals("\r\n")) {
                i2 = 2;
            }
            C20671 c20671BuildDialog5 = ((ActivityC17874) requireActivity()).buildDialog();
            c20671BuildDialog5.m46727(R.string.MT_Protector);
            c20671BuildDialog5.m46723(strArr3, i2, new DialogInterface.OnClickListener() { // from class: l.۫֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C23631 c23631 = this.f39149;
                    if (i7 != i2) {
                        c23631.f75242.m32563(strArr4[i7]);
                        c23631.f75242.m32520(true);
                    } else {
                        c23631.getClass();
                    }
                    dialogInterface.dismiss();
                }
            });
            c20671BuildDialog5.m46736(R.string.MT_Protector, null);
            c20671BuildDialog5.m46732();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C24301 c24301 = this.f75238;
            if (c24301 == null) {
                return true;
            }
            m52520(c24301.f76968);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C14146 c14146 = this.f75242;
            c14146.m32471(!c14146.m32505());
            this.f8387.m26154(this.f75242.m32505());
            this.f75229.m38854();
            if (!this.f75228) {
                return true;
            }
            this.f75241.m14752();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f75238.f76966.m32841() == null) {
                ((ActivityC17874) requireActivity()).m12253(R.string.MT_Protector, R.string.MT_Protector, false);
                return true;
            }
            ActivityC17874 activityC17876 = (ActivityC17874) requireActivity();
            int i7 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(activityC17876);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5805(this, menuItem, i2));
            c20671.m46732();
            return true;
        }
        try {
            if (itemId == R.id.MT_Protector) {
                C11996 c11996 = new C11996();
                String string3 = this.f75242.m32500().toString();
                C4397 c4397 = new C4397(this.f75238.f76966);
                c4397.m9151(this.f75238.f76970);
                c4397.m9153(this.f75238.f76969);
                c4397.m9150(string3);
                c4397.m9152(c11996);
                Intent intent = new Intent((ActivityC17874) requireActivity(), (Class<?>) ActivityC21269.class);
                intent.putExtra(AbstractC0213e.f989m, c11996.m27449());
                AbstractC17043 abstractC17044 = this.f75238.f76965;
                if (abstractC17044 != null) {
                    intent.putExtra("arscPath", abstractC17044.mo25505());
                }
                startActivity(intent);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (m7639()) {
                    C22682.m50793(R.string.MT_Protector);
                    return true;
                }
                C16689 c16689M26924 = C11721.m26924(this.f75242.m32500().toString(), (String) null);
                C11996 c11997 = new C11996();
                c11997.mo15113(C0719o.a.f2902h);
                c16689M26924.mo3914(c11997);
                String strM37815 = c16689M26924.m37815();
                C17853.f53280.m38684(strM37815 + ".mtsx.bin").m38654(c11997);
                Intent intent2 = new Intent((ActivityC17874) requireActivity(), (Class<?>) ActivityC17993.class);
                intent2.putExtra("syntaxName", c16689M26924.m37815());
                intent2.setData(C18524.m42109(m7649().f17850.mo25505() + "_preview", new String[0]).m38680());
                startActivity(intent2);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                ActivityC17874 activityC17877 = (ActivityC17874) requireActivity();
                InterfaceC9768 interfaceC9768M32500 = this.f75242.m32500();
                String strM32596 = this.f75242.m32595();
                boolean zM7639 = m7639();
                AbstractC17043 abstractC17045 = m7649().f17850;
                String strMo25505 = zM7639 ? null : abstractC17045.mo25505();
                String name2 = abstractC17045.getName();
                boolean zEqualsIgnoreCase = "Markdown".equalsIgnoreCase(this.f75229.m38855());
                boolean zM50539 = C22553.m50539(activityC17877);
                int iM32589 = zEqualsIgnoreCase ? this.f75242.m32589() : 0;
                boolean z2 = (zEqualsIgnoreCase || strMo25505 == null || (name = abstractC17045.getName()) == null || !".mhtml".equalsIgnoreCase(AbstractC17043.m38645(name))) ? false : true;
                new C24972(this, z2 ? this.f75238.f76968 : C16412.f48248, interfaceC9768M32500, strM32596, activityC17877, z2, zEqualsIgnoreCase, iM32589, name2, zM50539, strMo25505).m22250();
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                m52511();
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                new C4024((ActivityC17874) requireActivity(), C4024.m8029(this.f75242));
                return true;
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    this.f75229.m38851(menuItem);
                    return true;
                }
                if (m52542()) {
                    new C8879(this, (ActivityC17874) requireActivity(), m7641(), C17853.f53284.m38684("xmlTrans")).m22250();
                    return true;
                }
                if (!m52531()) {
                    throw new RuntimeException();
                }
                new C22291(this, (ActivityC17874) requireActivity(), m7641(), C17853.f53284.m38684("jsonTrans")).m22250();
                return true;
            }
            if (!C24414.m53856()) {
                C22682.m50793(R.string.MT_Protector);
                new ViewOnClickListenerC2424((ActivityC17874) requireActivity());
                return true;
            }
            if (!C24414.m53850()) {
                C22682.m50793(R.string.MT_Protector);
                return true;
            }
            if (this.f75242.m32555() == null) {
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC21448.f67649.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        } catch (Exception e) {
            m52484(e, (ActivityC17874) null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ */
    public void m52517() {
        if (this.f75215 == 0 || !isVisible() || m7643()) {
            return;
        }
        int i = 0;
        if (!this.f75228 || !this.f75233) {
            C7050.m16213(new RunnableC8487(i, this), 100L);
            return;
        }
        if (!m52542()) {
            if (m52531()) {
                AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("jsonTrans");
                if (!abstractC17043M38684.mo25094() || abstractC17043M38684.mo25091() == this.f75215) {
                    this.f75215 = 0L;
                    return;
                }
                try {
                    C22739 c22739M16894 = AbstractC7316.m16894(abstractC17043M38684.m38647(), EnumC15361.OrderedField);
                    if (m7641().equals(c22739M16894.m50890("<--id-c5skl23kjndf-->"))) {
                        C14201.m32673(c22739M16894, this.f75242);
                        this.f75242.m32409(false);
                    }
                } catch (Exception unused) {
                } finally {
                    this.f75215 = 0L;
                }
                return;
            }
            return;
        }
        AbstractC17043 abstractC17043M38685 = C17853.f53284.m38684("xmlTrans");
        if (!abstractC17043M38685.mo25094() || abstractC17043M38685.mo25091() == this.f75215) {
            this.f75215 = 0L;
            return;
        }
        try {
            C22739 c22739M16895 = AbstractC7316.m16894(abstractC17043M38685.m38647(), EnumC15361.OrderedField);
            if (m7641().equals(c22739M16895.m50890("<--id-c5skl23kjndf-->"))) {
                C7991.m18504(c22739M16895, this.f75242.m32500());
                this.f75242.m32409(false);
            }
        } catch (Exception unused2) {
        } finally {
            this.f75215 = 0L;
        }
    }

    /* JADX INFO: renamed from: ܽ֫ */
    private boolean m52542() {
        C14146 c14146 = this.f75242;
        return (c14146 != null && DocumentReader.RESERVED.equalsIgnoreCase(c14146.m32504())) || m7649().f17850.getName().toLowerCase().endsWith(".xml");
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private boolean m52531() {
        C14146 c14146 = this.f75242;
        return (c14146 != null && "json".equalsIgnoreCase(c14146.m32504())) || m7649().f17850.getName().toLowerCase().endsWith(".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛ */
    public void m52511() {
        if (!this.f75233) {
            C7050.m16213(new RunnableC11562(this, C11084.m25530(getViewLifecycleOwner())), 100L);
            return;
        }
        String lowerCase = m7649().m12210().toLowerCase();
        if (!m52535() && !lowerCase.equals(".jasm")) {
            if (lowerCase.equals(".smali")) {
                new C23436(this, (ActivityC17874) requireActivity()).m22250();
                return;
            }
            return;
        }
        new C21425(this, (ActivityC17874) requireActivity()).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52500(C23631 c23631, C14146 c14146, boolean z, AtomicBoolean atomicBoolean, Point point, Point point2, C13693 c13693, Throwable th) {
        if (c23631.f75228 && c23631.f75242 == c14146) {
            if (th != null) {
                Throwable cause = th;
                while ((cause instanceof C15154) && cause.getCause() != null) {
                    cause = cause.getCause();
                }
                if (cause instanceof CancellationException) {
                    return;
                }
                c23631.m7650(true);
                c23631.f75242.m32471(true);
                c23631.f8383.m48823(th);
                c23631.f75233 = true;
                return;
            }
            c23631.m52536(z);
            if (atomicBoolean.get()) {
                c23631.m52545();
            }
            if (z || point == null || point.x == -1) {
                return;
            }
            new C18525(c23631, c13693, point, point2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52568(final boolean z, final int i, final Point point, final Point point2) {
        C11249 c11249;
        String name;
        C13083 c13083M43428;
        final C5154 c5154;
        byte[] bArr;
        byte[] bArr2;
        if (this.f8387 != null && Looper.myLooper() == Looper.getMainLooper()) {
            this.f8387.m26116(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.f75228 && this.f75242 != null && this.f75229 != null && (c11249 = this.f8387) != null && ((!c11249.m26151() || this.f75230 != null) && !this.f75242.m32434() && this.f75222 == null && this.f75236 == null && this.f75231 == null && this.f75216 == null)) {
            final C8467 c8467 = C24560.f77765;
            final InterfaceC22097 interfaceC22097M20115of = C8685.m20115of(C19335.m44065().mo25505(), new String[0]);
            final String strM7641 = m7641();
            final C14146 c14146 = this.f75242;
            final C6867 c6867M7649 = m7649();
            final boolean zM7639 = m7639();
            boolean zM52553 = m52553();
            Bundle bundle = this.f8386;
            final boolean z2 = zM52553 || m52532() || m52535() || bundle.getBoolean("forceTryAXml") || bundle.getBoolean("forceTryClass");
            final InterfaceC22097 interfaceC22097M27247 = C11920.m27247(strM7641, interfaceC22097M20115of);
            boolean z3 = (C21879.m49338(interfaceC22097M27247) || m7647().mo25094()) ? false : true;
            final Bundle bundle2 = new Bundle(bundle);
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
            bundle2.putInt("textPageSize", C7050.f18355.getInt("text_page_size", 50000000));
            if (z3) {
                try {
                    C17143 c17143 = this.f75229;
                    if (bundle.getBoolean("forceTryAXml")) {
                        name = ".xml";
                    } else {
                        name = bundle.getBoolean("forceTryClass") ? ".class" : c6867M7649.f17850.getName();
                    }
                    c17143.m38838(name);
                    C5154 c5154M32591 = c14146.m32591();
                    C11996 c11996 = new C11996();
                    C11996 c11997 = new C11996();
                    this.f75229.m38849(c11996);
                    this.f75229.m38842(c11997);
                    byte[] bArrM27464 = c11996.m27464();
                    byte[] bArrM27465 = c11997.m27464();
                    c13083M43428 = zM7639 ? C19117.m43428() : null;
                    c5154 = c5154M32591;
                    bArr = bArrM27464;
                    bArr2 = bArrM27465;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            } else {
                c5154 = null;
                bArr = null;
                bArr2 = null;
                c13083M43428 = null;
            }
            C4081.m8190().removeCallbacksAndMessages(this.f8384);
            final FutureC5767 futureC5767M37671 = m7640().m37671();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(!z);
            final boolean z4 = z3;
            final byte[] bArr3 = bArr;
            final byte[] bArr4 = bArr2;
            final C13083 c13083 = c13083M43428;
            C21070 c21070 = new C21070(this, new InterfaceC20399() { // from class: l.֫۠ᩳ
                /* JADX WARN: Code duplicated, block: B:67:0x0116  */
                /* JADX WARN: Code duplicated, block: B:69:0x011a  */
                /* JADX WARN: Code duplicated, block: B:71:0x011e  */
                /* JADX WARN: Code duplicated, block: B:73:0x0121  */
                /* JADX WARN: Code duplicated, block: B:75:0x0129  */
                /* JADX WARN: Code duplicated, block: B:77:0x012c  */
                @Override // p067l.InterfaceC20399
                /* JADX INFO: renamed from: ֫ */
                public final C13693 mo7950(InterfaceC18588 interfaceC18588) throws Throwable {
                    String str;
                    C13693 c13693M49336;
                    C13693 c13693;
                    Throwable th;
                    C13693 c13694;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    boolean z5 = zM7639;
                    boolean z6 = z2;
                    futureC5767M37671.m12907();
                    boolean z7 = z4;
                    InterfaceC22097 interfaceC22097 = interfaceC22097M27247;
                    C8467 c8468 = c8467;
                    InterfaceC22097 interfaceC22098 = interfaceC22097M20115of;
                    String str2 = strM7641;
                    if (!z7 || C21879.m49338(interfaceC22097) || this.f8677.m7647().mo25094()) {
                        str = str2;
                        c13693M49336 = C21879.m49336(interfaceC22098, str, c8468, interfaceC18588);
                    } else {
                        str = str2;
                        c13693M49336 = C3614.m6779(interfaceC22097, bundle2, c5154, bArr3, bArr4, c13083, c8468, interfaceC18588);
                    }
                    C13693 c13695 = c13693M49336;
                    boolean z8 = z;
                    C6867 c6867 = c6867M7649;
                    int i3 = i;
                    try {
                        try {
                            if (!z8) {
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
                                c13695.m31124(C7050.f18355.getInt("text_page_size", 50000000));
                                InterfaceC22097 interfaceC22097M27248 = C11920.m27247(str, interfaceC22098);
                                Point point3 = point;
                                Point point4 = point2;
                                return c13695.m31123(interfaceC22097M27248, c6867, z5, z6, i3, point3 == null ? 0 : point4.x, point3 == null ? 0 : point4.y, c8468, interfaceC18588, (point3 == null || point3.x == -1) ? false : true);
                            }
                            Bundle bundleM46652 = c13695.f38632.f34416.f22201.m46652();
                            atomicBoolean2.set(bundleM46652.getBoolean("e2SourcePending"));
                            String string = bundleM46652.getString("filePath");
                            if (string == null) {
                                throw new IOException("Session source path is missing");
                            }
                            try {
                                return c13695.m31122(interfaceC22097, string.equals(c6867.f17850.mo25505()) ? c6867 : new C6867(C18524.m42109(string, new String[0])), bundleM46652.getBoolean("forceTryAXml") || bundleM46652.getBoolean("forceTryClass"), i3, c8468, interfaceC18588, true);
                            } catch (Error | Exception e2) {
                                th = e2;
                                c13694 = c13695;
                                try {
                                    c13694.m31120().m12907();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof RuntimeException)) {
                                    throw ((RuntimeException) th);
                                }
                                if (th instanceof Error) {
                                    throw ((Error) th);
                                }
                                throw new IOException("Session source reload failed", th);
                            }
                        } catch (Error | Exception e3) {
                            e = e3;
                            c13693 = interfaceC22097;
                            th = e;
                            c13694 = c13693;
                            c13694.m31120().m12907();
                            if (!(th instanceof IOException)) {
                                throw ((IOException) th);
                            }
                            if (!(th instanceof RuntimeException)) {
                                throw ((RuntimeException) th);
                            }
                            if (th instanceof Error) {
                                throw ((Error) th);
                            }
                            throw new IOException("Session source reload failed", th);
                        }
                    } catch (Error e4) {
                        e = e4;
                        c13693 = c13695;
                        th = e;
                        c13694 = c13693;
                        c13694.m31120().m12907();
                        if (!(th instanceof IOException)) {
                            throw ((IOException) th);
                        }
                        if (!(th instanceof RuntimeException)) {
                            throw ((RuntimeException) th);
                        }
                        if (th instanceof Error) {
                            throw ((Error) th);
                        }
                        throw new IOException("Session source reload failed", th);
                    } catch (Exception e5) {
                        e = e5;
                        c13693 = c13695;
                        th = e;
                        c13694 = c13693;
                        c13694.m31120().m12907();
                        if (!(th instanceof IOException)) {
                            throw ((IOException) th);
                        }
                        if (!(th instanceof RuntimeException)) {
                            throw ((RuntimeException) th);
                        }
                        if (th instanceof Error) {
                            throw ((Error) th);
                        }
                        throw new IOException("Session source reload failed", th);
                    }
                }
            }, 8388608);
            c21070.f66179 = z || point == null || point.x == -1;
            FutureC5767 futureC5767M52479 = m52479(c21070, c8467.f22724, interfaceC22097M27247);
            if (z && !z3) {
                c21070.m47546(strM7641, interfaceC22097M27247);
            }
            futureC5767M52479.m12887(new InterfaceC9988() { // from class: l.ۧ۠ᩳ
                @Override // p067l.InterfaceC9988
                /* JADX INFO: renamed from: ۧ */
                public final void mo6895(Object obj, Throwable th) {
                    C23631.m52500(this.f35693, c14146, z, atomicBoolean, point, point2, (C13693) obj, th);
                }
            });
            return;
        }
        throw new IllegalStateException("Fragment session loading requires an idle foreground view");
    }

    /* JADX INFO: renamed from: ֫ */
    private FutureC5767 m52479(C21070 c21070, Executor executor, InterfaceC22097 interfaceC22097) {
        C22864 c22864M32603 = this.f75230;
        if (c22864M32603 == null) {
            c22864M32603 = this.f75242.m32603();
        }
        c21070.f66193 = c22864M32603;
        this.f75230 = null;
        this.f75222 = c21070;
        this.f75211 = c21070.m47551();
        this.f8387.m26123(this, true);
        if (interfaceC22097 == null) {
            c21070.m47547(executor);
        } else {
            c21070.m47548(C23731.m52765(interfaceC22097), executor);
        }
        return c21070.m47551();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52566(C21070 c21070) {
        if (this.f75222 == c21070 && this.f75228 && this.f75242 == c21070.f66200) {
            this.f8387.m26144(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52567(C21070 c21070, C13693 c13693, boolean z) {
        if (this.f75222 != c21070) {
            return;
        }
        this.f75222 = null;
        if (z && c21070.m47550()) {
            this.f75231 = c13693;
            this.f75212.m4836(this.f8386);
            this.f75212 = new C2943();
            C18366 c18366 = new C18366(this, c13693, this.f75240);
            this.f75214 = c18366;
            c18366.m41847();
        }
        if (!z && c13693 != null && this.f75216 == c13693.f38631) {
            this.f75216 = null;
            this.f75240 = 0;
        }
        if (this.f75226 != null) {
            return;
        }
        this.f8387.m26123(this, false);
        m52547();
    }

    /* JADX INFO: renamed from: ܿ */
    private FutureC5767 m52543(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session close requires the main thread");
        }
        C21050 c21050 = this.f75236;
        if (c21050 != null) {
            return c21050.m47484();
        }
        C6197 c6197 = this.f75225;
        if (c6197 != null) {
            c6197.m14045(new CancellationException("Saving session is closing"));
        }
        C13693 c13693 = this.f75231;
        if (c13693 == null) {
            return FutureC5767.m12882(null);
        }
        C14146 c14146 = this.f75242;
        if (c14146 == null || this.f75229 == null || c14146.m32500() != c13693.f38639) {
            throw new IllegalStateException("Fragment session owner changed before close");
        }
        C18366 c18366 = this.f75214;
        if (c18366 != null) {
            c18366.m41848();
            this.f75214 = null;
        }
        FutureC5767 futureC5767 = new FutureC5767();
        this.f75211 = futureC5767;
        futureC5767.m12891((Throwable) new CancellationException("Saving session is closing"));
        this.f75236 = new C21050(this, c13693, this.f75240, this.f75238, z);
        if (z) {
            this.f8387.m26135(this);
        } else {
            this.f8387.m26123(this, true);
        }
        return this.f75236.m47484();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52570(C13693 c13693, C14146 c14146) {
        return this.f75228 && this.f75242 == c14146 && this.f75231 == c13693 && this.f75236 == null && this.f75222 == null && c14146.m32500() == c13693.f38639;
    }

    /* JADX INFO: renamed from: ۗ */
    public final C24301 m52571() {
        return this.f75238;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52564(C21050 c21050) {
        if (this.f75236 != c21050) {
            return;
        }
        C13693 c13693 = c21050.f66078;
        if (c13693.f38631.m55044() != null) {
            this.f8383.m48823((Throwable) c13693.f38631.m55044());
        }
        this.f75236 = null;
        if (this.f75231 == c13693) {
            this.f75231 = null;
        }
        if (this.f75216 == c13693.f38631) {
            this.f75216 = null;
            this.f75240 = 0;
        }
        if (this.f75226 != null) {
            return;
        }
        if (this.f75230 == null) {
            this.f8387.m26123(this, false);
        }
        m52547();
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m52547() {
        Runnable runnable = this.f75243;
        C14146 c14146 = this.f75242;
        if (runnable == null || !this.f75228) {
            this.f75243 = null;
        } else {
            C7050.m16212(new RunnableC20477(this, runnable, c14146, 1));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m52528(C23631 c23631, C14146 c14146, Runnable runnable) {
        if (c23631.f75243 != runnable) {
            return;
        }
        c23631.f75243 = null;
        try {
            try {
                if (c23631.f75228 && c23631.f75242 == c14146) {
                    runnable.run();
                }
                C6197 c6197 = c23631.f75225;
                if (c6197 != null) {
                    c6197.m14046();
                }
            } catch (Throwable th) {
                C6197 c6198 = c23631.f75225;
                if (c6198 != null) {
                    c6198.m14046();
                }
                throw th;
            }
        } catch (Error | RuntimeException e) {
            C6197 c6199 = c23631.f75225;
            if (c6199 != null) {
                c6199.m14045(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52565(C21050 c21050, Throwable th) {
        C21620 c21620;
        if (this.f75236 != c21050 || (c21620 = this.f8383) == null) {
            return;
        }
        c21620.m48823(th);
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m52557(final C13693 c13693, int i, C22864 c22864) {
        C14146 c14146;
        C14146 c14147;
        FutureC5767 futureC5767M32485;
        C14146 c14148 = this.f75242;
        if (c14148 != null) {
            InterfaceC9768 interfaceC9768M32500 = c14148.m32500();
            C6495 c6495 = c13693.f38639;
            if (interfaceC9768M32500 == c6495) {
                C12332 c12332 = c13693.f38632;
                C25072 c25072 = c13693.f38631;
                if (Looper.myLooper() == Looper.getMainLooper() && this.f75228 && (c14146 = this.f75242) != null && this.f75229 != null) {
                    InterfaceC9768 interfaceC9768M32501 = c14146.m32500();
                    if (interfaceC9768M32501 instanceof C6495) {
                        C6495 c6496 = (C6495) interfaceC9768M32501;
                        if (c25072.m55041(c6496.mo3999())) {
                            if (this.f75216 != null) {
                                throw new IllegalStateException("Fragment recovery is already bound");
                            }
                            if (i < 0) {
                                throw new IllegalArgumentException("Negative fragment state limit");
                            }
                            C8308 c8308 = c12332.f34416;
                            c8308.m19163(c6496.mo3999());
                            c6496.mo3999().m54768();
                            Bundle bundleM46652 = c8308.f22201.m46652();
                            C14146 c14149 = this.f75242;
                            C17143 c17143 = this.f75229;
                            c17143.m38840(c8308.f22199, c8308.f22198, c8308.f22195);
                            if (!this.f75228 || this.f75242 != c14149 || this.f75229 != c17143 || c14149.m32500() != c6496) {
                                throw new CancellationException("Fragment owner changed during restoration");
                            }
                            c8308.m19163(c6496.mo3999());
                            if (Looper.myLooper() == Looper.getMainLooper() && (c14147 = this.f75242) != null) {
                                InterfaceC9768 interfaceC9768M32502 = c14147.m32500();
                                if (interfaceC9768M32502 instanceof C6495) {
                                    C6495 c6497 = (C6495) interfaceC9768M32502;
                                    if (c25072.m55041(c6497.mo3999())) {
                                        if (this.f75216 != null) {
                                            throw new IllegalStateException("Fragment persistence is already bound");
                                        }
                                        if (i < 0) {
                                            throw new IllegalArgumentException("Negative fragment state limit");
                                        }
                                        c6497.mo3999().m54768();
                                        this.f75216 = c25072;
                                        this.f75240 = i;
                                        Bundle bundle = this.f8386;
                                        bundle.clear();
                                        bundle.putAll(bundleM46652);
                                        this.f75212.m4836(bundle);
                                        this.f75238 = c12332.f34415;
                                        this.f75235 = m7639();
                                        m52534();
                                        final C14146 c141410 = this.f75242;
                                        final C17143 c17144 = this.f75229;
                                        if (c22864 == null) {
                                            futureC5767M32485 = c141410.m32537(c6495);
                                        } else {
                                            futureC5767M32485 = c141410.m32485(c6495, c22864);
                                        }
                                        return futureC5767M32485.m12884(new Runnable() { // from class: l.۠۠ᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C23631 c23631 = this.f27772;
                                                if (c23631.f75228) {
                                                    C14146 c141411 = c23631.f75242;
                                                    C14146 c141412 = c141410;
                                                    if (c141411 == c141412 && c23631.f75229 == c17144 && c141412.m32500() == c13693.f38639) {
                                                        return;
                                                    }
                                                }
                                                throw new CancellationException("Fragment changed before its restored view was ready");
                                            }
                                        });
                                    }
                                }
                            }
                            throw new IllegalStateException("Session persistence requires the foreground fragment owner");
                        }
                    }
                }
                throw new IllegalStateException("Fragment recovery requires the foreground session owner");
            }
        }
        throw new IllegalStateException("Fragment recovery editable does not belong to its resource owner");
    }

    /* JADX INFO: renamed from: ܶ */
    public final InterfaceC20028 m52575() {
        C14146 c14146;
        C11249 c11249 = this.f8387;
        if (c11249 != null && !c11249.m26151() && this.f75228) {
            if (this.f75216 == null && ((c14146 = this.f75242) == null || !(c14146.m32500() instanceof C6495))) {
                C9907 c9907M37673 = m7640().m37673();
                if (c9907M37673 != null) {
                    C14146 c14147 = this.f75242;
                    C17143 c17143 = this.f75229;
                    try {
                        AbstractC17043 abstractC17043M7647 = m7647();
                        if (m7643()) {
                            abstractC17043M7647.mo25503();
                            c9907M37673.close();
                            return null;
                        }
                        if (c14147 == null || c17143 == null) {
                            throw new IllegalStateException("Legacy save view is unavailable");
                        }
                        return new C6672(this, c14147, c17143, c9907M37673, abstractC17043M7647);
                    } catch (Error | RuntimeException e) {
                        c9907M37673.m23205(e);
                        throw e;
                    }
                }
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("Fragment state capture requires the foreground thread");
                }
                if (!m7643()) {
                    C14146 c14148 = this.f75242;
                    C12826.requireNonNull(c14148);
                    InterfaceC9768 interfaceC9768M32500 = c14148.m32500();
                    if (!(interfaceC9768M32500 instanceof C6495)) {
                        throw new IllegalStateException("Fragment session owner changed before capture");
                    }
                    C6495 c6495 = (C6495) interfaceC9768M32500;
                    C25072 c25072 = this.f75216;
                    if (c25072 == null || !c25072.m55041(c6495.mo3999())) {
                        throw new IllegalStateException("Fragment session persistence is not bound");
                    }
                    C21620 c21620 = this.f8383;
                    C12826.requireNonNull(c21620);
                    try {
                        return new C5331(m52533(), c21620);
                    } catch (IOException | IllegalStateException e2) {
                        c21620.m48823(e2);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫ */
    public FutureC5767 m52533() {
        C14146 c14146 = this.f75242;
        C12826.requireNonNull(c14146);
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        if (!(interfaceC9768M32500 instanceof C6495)) {
            throw new IllegalStateException("Fragment session owner changed before capture");
        }
        C6495 c6495 = (C6495) interfaceC9768M32500;
        C25072 c25072 = this.f75216;
        if (c25072 == null || !c25072.m55041(c6495.mo3999())) {
            throw new IllegalStateException("Fragment session persistence is not bound");
        }
        C11996 c11996 = new C11996();
        C11996 c11997 = new C11996();
        this.f75229.m38849(c11996);
        this.f75229.m38842(c11997);
        FutureC5767 futureC5767M55040 = c25072.m55040(C15013.m34369(c14146, this.f8386, this.f75238, c11996.m27464(), c11997.m27464(), this.f75240, -1L, null));
        C24913 c24913Mo3999 = c6495.mo3999();
        C12826.requireNonNull(c24913Mo3999);
        return futureC5767M55040.m12904((InterfaceC22729) new C14363(1, c24913Mo3999));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52559(String str, boolean z) {
        C6867 c6867 = new C6867(C18524.m42109(str, new String[0]));
        ActivityC17874 activityC17874 = (ActivityC17874) requireActivity();
        ResultCallback resultCallback = this.f75239;
        this.f75239 = null;
        new C8013(this, activityC17874, c6867, z, resultCallback).m22250();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m52522(final ActivityC17874 activityC17874) {
        if (m7639() && this.f75224 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C0094d.f367A, true);
            this.f75239 = null;
            this.f75224.m34411(null, R.string.MT_Protector, m7649().f17850.getName(), bundle);
            return;
        }
        m52562(activityC17874, new Runnable() { // from class: l.ܺ۠ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C23631 c23631 = this.f52035;
                c23631.getClass();
                activityC17874.m40663(c23631);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52486(final ActivityC17874 activityC17874, boolean z) {
        View viewM12252 = activityC17874.m12252(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        checkBox.setChecked(z);
        final RunnableC4661 runnableC4661 = new RunnableC4661(this, checkBox, activityC17874);
        C20671 c20671BuildDialog = activityC17874.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f15050.m52562(activityC17874, runnableC4661);
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩴ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnableC4661.run();
            }
        };
        int i = R.string.MT_Protector;
        c20671BuildDialog.m46728(R.string.MT_Protector, onClickListener);
        Button buttonM3859 = c20671BuildDialog.m46732().m3859();
        if (!checkBox.isChecked()) {
            i = R.string.MT_Protector;
        }
        buttonM3859.setText(i);
        checkBox.setOnCheckedChangeListener(new C20755(buttonM3859, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52561(ActivityC17874 activityC17874, ResultCallback resultCallback) {
        if (m7655()) {
            new C13378(this, activityC17874, resultCallback).m22250();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52562(ActivityC17874 activityC17874, Runnable runnable) {
        if (!m7655()) {
            runnable.run();
        } else {
            C14146 c14146 = this.f75242;
            m52561(activityC17874, new C24106(this, c14146, c14146 == null ? null : c14146.m32500(), m7649().f17850.mo25505(), runnable));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m52518(Callable callable) {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        C7050.m16212(futureTask);
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = futureTask.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Exception) {
                        throw ((Exception) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[Catch: Error | RuntimeException -> 0x00cb, RuntimeException -> 0x00cd, TryCatch #2 {Error | RuntimeException -> 0x00cb, blocks: (B:50:0x00b0, B:52:0x00b6, B:54:0x00c3, B:55:0x00ca), top: B:64:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[Catch: Error | RuntimeException -> 0x00cb, RuntimeException -> 0x00cd, TryCatch #2 {Error | RuntimeException -> 0x00cb, blocks: (B:50:0x00b0, B:52:0x00b6, B:54:0x00c3, B:55:0x00ca), top: B:64:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX INFO: renamed from: ۧ */
    public static C10891 m52519(C23631 c23631, C24301 c24301) {
        C14146 c14146;
        InterfaceC9768 interfaceC9768M32500;
        C6867 c6867M7649;
        C13693 c13693;
        C16434 c16434M37344;
        C6495 c6495;
        if (c23631.f75228 && c23631.f75242 != null && c23631.f75236 == null && c23631.f75243 == null && !c23631.f8387.m26151()) {
            FutureC5767 futureC5767 = c23631.f75211;
            if (futureC5767 != null) {
                if (futureC5767.isDone()) {
                    if (((C13693) c23631.f75211.m12907()).f38639 != c23631.f75242.m32500()) {
                        throw new CancellationException("Saving content was replaced after loading");
                    }
                    if (c23631.f75233) {
                        if (!c23631.m7643()) {
                            throw new IllegalStateException("Cannot save failed editor content");
                        }
                        c14146 = c23631.f75242;
                        interfaceC9768M32500 = c14146.m32500();
                        if (interfaceC9768M32500 instanceof C6495) {
                            c6495 = (C6495) interfaceC9768M32500;
                            if (!c6495.mo3999().m54753().m16599()) {
                                if (c6495.mo3999().m54753().m16597() != EnumC2550.LOADING) {
                                    throw new IllegalStateException("Cannot save incomplete source text");
                                }
                            }
                        }
                        c6867M7649 = c23631.m7649();
                        if (c24301 == null) {
                            c24301 = c23631.f75238;
                        }
                        c13693 = c23631.f75231;
                        if (c13693 != null) {
                            c16434M37344 = C16434.m37344(interfaceC9768M32500, c14146.m32595(), c24301, -1, null);
                        } else {
                            c16434M37344 = C16434.m37344(interfaceC9768M32500, c14146.m32595(), c24301, -1, null);
                        }
                        if (c14146.m32500() == interfaceC9768M32500) {
                            throw new IllegalStateException("Editor changed during saving capture");
                        }
                        return new C10891(c23631, c14146, interfaceC9768M32500, c14146.m32594(), c6867M7649, c16434M37344);
                    }
                }
            } else if (c23631.f75233 && c23631.f75238 != null && c23631.f75242.m32600()) {
                if (!c23631.m7643()) {
                    throw new IllegalStateException("Cannot save failed editor content");
                }
                c14146 = c23631.f75242;
                interfaceC9768M32500 = c14146.m32500();
                if (interfaceC9768M32500 instanceof C6495) {
                    c6495 = (C6495) interfaceC9768M32500;
                    if (!c6495.mo3999().m54753().m16599()) {
                        if (c6495.mo3999().m54753().m16597() != EnumC2550.LOADING) {
                            throw new IllegalStateException("Cannot save incomplete source text");
                        }
                    }
                }
                c6867M7649 = c23631.m7649();
                if (c24301 == null) {
                    c24301 = c23631.f75238;
                }
                c13693 = c23631.f75231;
                if (c13693 != null || c13693.f38639 != interfaceC9768M32500) {
                    c16434M37344 = C16434.m37344(interfaceC9768M32500, c14146.m32595(), c24301, -1, null);
                } else {
                    c16434M37344 = C16434.m37346(c13693, c14146.m32595(), c24301);
                }
                try {
                    if (c14146.m32500() == interfaceC9768M32500) {
                        throw new IllegalStateException("Editor changed during saving capture");
                    }
                    return new C10891(c23631, c14146, interfaceC9768M32500, c14146.m32594(), c6867M7649, c16434M37344);
                } catch (Error | RuntimeException e) {
                    c16434M37344.close();
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m52530(C23631 c23631, C20279 c20279) {
        if (c23631.f75226 != c20279) {
            return;
        }
        c23631.f75226 = null;
        c20279.f62669.m52769((Throwable) null);
        c20279.f62668.m12889((Object) null);
        if (c23631.f75243 != null && c23631.f75228) {
            c23631.f75242.m32476(false);
            c23631.f8387.m26123(c23631, false);
        }
        c23631.m52547();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m52484(Exception exc, ActivityC17874 activityC17874) {
        int i;
        this.f8383.m48823((Throwable) exc);
        if (activityC17874 == null) {
            activityC17874 = (ActivityC17874) getActivity();
        }
        if (activityC17874 != null) {
            activityC17874.m40676();
            if (!isResumed()) {
                activityC17874.m40668(this);
            }
        }
        boolean z = exc instanceof C6496;
        C6724 c6724 = this.f75232;
        if (z) {
            int iM14914 = ((C6496) exc).m14914() - 1;
            if (iM14914 >= 0) {
                c6724.m15370(Integer.valueOf(iM14914));
                return;
            }
            return;
        }
        if (exc instanceof C3870) {
            int iM40851 = ((C3870) exc).m7629().m40851();
            if (iM40851 == -1 || (i = iM40851 - 1) < 0) {
                return;
            }
            c6724.m15370(Integer.valueOf(i));
            return;
        }
        if (exc instanceof C16299) {
            C16299 c16299 = (C16299) exc;
            C20699.m46760(c16299.f47904, c16299.f47908).m46768(this.f75242);
        } else if (exc instanceof C5962) {
            ((C5962) exc).m13373(this.f75242);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m52525(C23631 c23631, DialogInterface dialogInterface, int i) {
        C24301 c24301 = c23631.f75238;
        if (c24301.f76968 != i) {
            c24301.f76968 = i;
            c23631.f75242.m32520(true);
            c23631.m52555();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52506(C23631 c23631, int[] iArr, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (c23631.f75238.f76968 != iArr[0]) {
            if (!c23631.m7655()) {
                c23631.m52558(iArr[0], false, false);
                return;
            }
            C20671 c20671BuildDialog = ((ActivityC17874) c23631.requireActivity()).buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5805(c23631, iArr, 1));
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        if (r0.mo3999().m54732() != r10.f75219) goto L63;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m52569() {
        C17143 c17143 = this.f75229;
        if (c17143 != null && c17143.m38852()) {
            this.f75229.m38854();
            return true;
        }
        if (!m7639()) {
            if (mo7648()) {
                final ActivityC17874 activityC17874 = (ActivityC17874) requireActivity();
                int i = C9354.f25481[EnumC4543.m9604().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (m7655()) {
                            C20671 c20671BuildDialog = activityC17874.buildDialog();
                            c20671BuildDialog.m46730(m52579());
                            c20671BuildDialog.m46710(R.string.MT_Protector);
                            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ۠ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    ActivityC17874 activityC17875 = activityC17874;
                                    this.f23494.m52562(activityC17875, new RunnableC3319(0, activityC17875));
                                }
                            });
                            c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22216(1, activityC17874));
                            c20671BuildDialog.m46732();
                            return true;
                        }
                        if (activityC17874.m40667()) {
                            C22682.m50793(R.string.MT_Protector);
                            return true;
                        }
                        activityC17874.m40669(true);
                        return true;
                    }
                    if (i == 3) {
                        if (m7655()) {
                            m52486(activityC17874, true);
                            return true;
                        }
                        C20671 c20671BuildDialog2 = activityC17874.buildDialog();
                        c20671BuildDialog2.m46730(m52579());
                        c20671BuildDialog2.m46710(R.string.MT_Protector);
                        c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۠ᩳ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                this.f69922.m52572();
                                activityC17874.m40664(false);
                            }
                        });
                        c20671BuildDialog2.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢ۠ᩳ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                activityC17874.m40669(false);
                            }
                        });
                        c20671BuildDialog2.m46732();
                        return true;
                    }
                    if (i == 4) {
                        if (m7655()) {
                            m52486(activityC17874, false);
                            return true;
                        }
                        C20671 c20671BuildDialog3 = activityC17874.buildDialog();
                        c20671BuildDialog3.m46730(m52579());
                        c20671BuildDialog3.m46710(R.string.MT_Protector);
                        c20671BuildDialog3.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11170(1, activityC17874));
                        c20671BuildDialog3.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10499(this, activityC17874, 1));
                        c20671BuildDialog3.m46732();
                        return true;
                    }
                } else if (m7655()) {
                    C20671 c20671BuildDialog4 = activityC17874.buildDialog();
                    c20671BuildDialog4.m46730(m52579());
                    c20671BuildDialog4.m46710(R.string.MT_Protector);
                    c20671BuildDialog4.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ۠ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C23631 c23631 = this.f47261;
                            ActivityC17874 activityC17875 = activityC17874;
                            c23631.m52562(activityC17875, new RunnableC23556(1, c23631, activityC17875));
                        }
                    });
                    c20671BuildDialog4.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻۠ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            this.f79215.m52572();
                            activityC17874.m40664(false);
                        }
                    });
                    c20671BuildDialog4.m46732();
                    return true;
                }
            } else if (m7655()) {
                if (!m52507() || !m52576(this.f75242.m32361())) {
                    C14146 c14146 = this.f75242;
                    if (c14146 != null) {
                        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
                        if (interfaceC9768M32500 instanceof C6495) {
                            C6495 c6495 = (C6495) interfaceC9768M32500;
                            if (c6495.mo3999().m54755().toString().equals(this.f75227)) {
                            }
                        }
                    }
                }
                ActivityC17874 activityC17875 = (ActivityC17874) requireActivity();
                C20671 c20671BuildDialog5 = activityC17875.buildDialog();
                c20671BuildDialog5.m46730(m52579());
                c20671BuildDialog5.m46710(R.string.MT_Protector);
                c20671BuildDialog5.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13339(1, this, activityC17875));
                c20671BuildDialog5.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17183(2, activityC17875));
                c20671BuildDialog5.m46732();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺ */
    private boolean m52553() {
        C24301 c24301 = this.f75238;
        return c24301 != null && c24301.m53634();
    }

    /* JADX INFO: renamed from: ۨ */
    private boolean m52532() {
        C24301 c24301 = this.f75238;
        return c24301 != null && c24301.m53633();
    }

    /* JADX INFO: renamed from: ܰ */
    private boolean m52535() {
        C24301 c24301 = this.f75238;
        return c24301 != null && c24301.m53635();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ */
    public boolean m52513() {
        C24301 c24301 = this.f75238;
        if (c24301 != null) {
            return c24301.m53634() || this.f75238.m53633() || this.f75238.m53635();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m52579() {
        String str = this.f75217;
        if (str != null) {
            return str;
        }
        String string = this.f8386.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        if (string != null) {
            this.f75217 = string;
            return string;
        }
        try {
            String strM20011 = C8597.m20011(80, m7649().f17850.getName());
            this.f75217 = strM20011;
            return strM20011;
        } catch (Exception unused) {
            return "Error";
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public final String m52578() {
        if (!m7655()) {
            return m52579();
        }
        return "*" + m52579();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫֫ */
    public boolean m52507() {
        C15271 c15271;
        C13693 c13693 = this.f75231;
        return (c13693 == null || (c15271 = c13693.f38637) == null || c15271.m34768() <= 1) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52576(boolean z) {
        C15271 c15271;
        if (z) {
            return true;
        }
        C13693 c13693 = this.f75231;
        return (c13693 == null || (c15271 = c13693.f38637) == null || !c15271.m34764(c13693.f38640)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public FutureC5767 m52478(final int i, Runnable runnable) {
        FutureC5767 futureC5767 = new FutureC5767();
        final C13693 c13693 = this.f75231;
        if (!m52507() || i < 0 || i >= c13693.f38637.m34768() || c13693.f38637.m34763() || this.f75236 != null || this.f75222 != null || this.f8387.m26151()) {
            futureC5767.m12891((Throwable) new IllegalStateException("Text page is unavailable"));
            return futureC5767;
        }
        if (i == c13693.f38640) {
            if (runnable != null) {
                runnable.run();
            }
            futureC5767.m12889((Object) null);
            return futureC5767;
        }
        final C14146 c14146 = this.f75242;
        final C15271 c15271 = c13693.f38637;
        final int i2 = this.f75240;
        try {
            FutureC5767 futureC5767M52543 = m52543(false);
            final C21050 c21050 = this.f75236;
            C12826.requireNonNull(c21050);
            futureC5767M52543.m12904(new InterfaceC22729() { // from class: l.ܰ֨ᩳ
                @Override // p067l.InterfaceC22729
                public final Object apply(Object obj) {
                    return C23631.m52481(this.f43363, c14146, c21050, c13693, c15271, i, i2);
                }
            }).m12886(new C9158(this, c14146, runnable)).m12887((InterfaceC9988) new C14734(this, futureC5767, c14146));
            return futureC5767;
        } catch (RuntimeException e) {
            futureC5767.m12891((Throwable) e);
            return futureC5767;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ FutureC5767 m52481(C23631 c23631, C14146 c14146, C21050 c21050, C13693 c13693, final C15271 c15271, final int i, final int i2) {
        if (!c23631.f75228 || c23631.f75242 != c14146) {
            throw new CancellationException("Page view was destroyed");
        }
        final C20379 c20379M47485 = c21050.m47485();
        final C8467 c8467 = c13693.f38631.f79987;
        return c23631.m52479(new C21070(c23631, new InterfaceC20399() { // from class: l.ۚ۠ᩳ
            @Override // p067l.InterfaceC20399
            /* JADX INFO: renamed from: ֫ */
            public final C13693 mo7950(InterfaceC18588 interfaceC18588) throws Throwable {
                C20379 c20379 = c20379M47485;
                C15271 c15271M34752 = C15271.m34752(c15271.f43575);
                int i3 = i;
                C8467 c8468 = c8467;
                int i4 = i2;
                C13693 c13693M34759 = c15271M34752.m34759(i3, c8468, i4, interfaceC18588, true);
                try {
                    c13693M34759.m31127(c20379.m46005(), c20379.m46004(), c20379.m46003(), c8468, i4);
                    return c13693M34759;
                } catch (IOException | Error | RuntimeException e) {
                    c13693M34759.m31120().m12907();
                    throw e;
                }
            }
        }, i2), c8467.f22724, c15271.f43575);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52499(C23631 c23631, C14146 c14146, Runnable runnable) {
        if (!c23631.f75228 || c23631.f75242 != c14146) {
            throw new CancellationException("Page view was destroyed");
        }
        c23631.m52536(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52495(C23631 c23631, FutureC5767 futureC5767, C14146 c14146, Throwable th) {
        if (th == null) {
            futureC5767.m12889((Object) null);
            return;
        }
        if (c23631.f75228 && c23631.f75242 == c14146) {
            if (c23631.f75231 == null) {
                c23631.m7650(true);
            }
            c23631.f8383.m48823(th);
        }
        futureC5767.m12891(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫ */
    public void m52538() {
        StringBuilder sb = new StringBuilder();
        if (m7655()) {
            sb.append("*");
        }
        if (m52507()) {
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(this.f75231.f38640 + 1);
            sb.append("/");
            sb.append(this.f75231.f38637.m34768());
            sb.append(") ");
        }
        sb.append(m52579());
        this.f8387.m26114(sb.toString());
        this.f8387.m26113(m7655() ? C23223.f72972 : C23223.f72998);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻֫ */
    public void m52555() {
        StringBuilder sb = new StringBuilder();
        C14146 c14146 = this.f75242;
        if (c14146 != null) {
            int iM32508 = c14146.m32508();
            int iM32512 = c14146.m32512();
            Point pointM32536 = c14146.m32536(iM32508);
            sb.append(pointM32536.x);
            sb.append(':');
            sb.append(pointM32536.y);
            if (iM32508 != iM32512) {
                sb.append(" (");
                sb.append(Math.abs(iM32512 - iM32508));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
        }
        if (this.f75238 != null) {
            if (sb.length() > 0) {
                sb.append("   ");
            }
            if (this.f75238.m53634()) {
                sb.append("AXML");
            } else if (this.f75238.m53633()) {
                sb.append("ABX");
            } else {
                sb.append(C16412.m37300(this.f75238.f76968));
            }
        }
        if (sb.length() == 0) {
            this.f8387.m26133("...");
        } else {
            this.f8387.m26133(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m52483(View view) {
        final int i;
        String strM37300;
        int i2 = 0;
        if (m52507() && view.getId() == R.id.MT_Protector) {
            int iM34768 = this.f75231.f38637.m34768();
            CharSequence[] charSequenceArr = new CharSequence[iM34768];
            while (i2 < iM34768) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = String.valueOf(i3);
                i2 = i3;
            }
            C20671 c20671BuildDialog = ((ActivityC17874) requireActivity()).buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46723(charSequenceArr, this.f75231.f38640, new DialogInterface.OnClickListener() { // from class: l.᩹֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    C23631.m52491(this.f73063, dialogInterface, i4);
                }
            });
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46732();
            return;
        }
        C6867 c6867M7649 = m7649();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        int i4 = 1;
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c6867M7649.f17850.mo25505()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        if (m52553()) {
            i = C16412.f48248;
            strM37300 = "AXML";
        } else if (m52532()) {
            i = C16412.f48248;
            strM37300 = "ABX";
        } else if (m52535()) {
            i = C16412.f48248;
            strM37300 = "Class";
        } else {
            C24301 c24301 = this.f75238;
            i = c24301 == null ? -1 : c24301.f76968;
            strM37300 = i == -1 ? "?" : C16412.m37300(i);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) strM37300).append((CharSequence) "\n");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) "\n");
        String[] strArr = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
        String strM32595 = this.f75242.m32595();
        strM32595.getClass();
        if (strM32595.equals("\r")) {
            i2 = 1;
        } else if (!strM32595.equals("\r\n")) {
            i2 = 2;
        }
        spannableStringBuilderAppend.append((CharSequence) strArr[i2]);
        C20671 c20671BuildDialog2 = ((ActivityC17874) requireActivity()).buildDialog();
        c20671BuildDialog2.m46730(m52579());
        c20671BuildDialog2.m46718(spannableStringBuilder);
        c20671BuildDialog2.m46736(R.string.MT_Protector, null);
        c20671BuildDialog2.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶֨ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C23631.m52524(this.f66745, i);
            }
        });
        c20671BuildDialog2.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19782(i4, this));
        ((TextView) c20671BuildDialog2.m46732().m3846(android.R.id.message)).setTextIsSelectable(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52491(C23631 c23631, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        c23631.m52478(i, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m52524(C23631 c23631, int i) {
        if (i != -1) {
            c23631.m52520(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52563(ActivityC17874 activityC17874, DialogInterfaceC1814 dialogInterfaceC1814) {
        C15388 c15388 = new C15388(this, activityC17874, activityC17874, dialogInterfaceC1814);
        c15388.m33344(R.string.MT_Protector);
        c15388.m33354(40);
        String string = this.f8386.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        c15388.m33336((CharSequence) string);
        c15388.m33367();
        c15388.m33352(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52560(ActivityC17874 activityC17874) {
        if (m7655()) {
            if (m7639() && this.f75224 == null) {
                activityC17874.m40668(this);
            }
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(activityC17874);
            c20671.m46730(m52579());
            c20671.m46710(R.string.MT_Protector);
            int i2 = 1;
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC16533(this, activityC17874, i2));
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22570(this, activityC17874, i2));
            c20671.m46732();
            return;
        }
        activityC17874.m40663(this);
    }

    /* JADX INFO: renamed from: ֨ */
    public final C14281 m52556() {
        C14281 c14281 = this.f75238.f76966;
        C12826.requireNonNull(c14281);
        return c14281;
    }

    /* JADX INFO: renamed from: ۠ */
    public final Map m52574() {
        Map map = this.f75238.f76970;
        C12826.requireNonNull(map);
        return map;
    }

    @Override // p067l.ComponentCallbacksC11117, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8387.m26152(getResources().getBoolean(R.bool.MT_Protector));
    }
}
