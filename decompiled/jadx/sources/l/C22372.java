package l;

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
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
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
public class C22372 extends AbstractC1582 {

    /* JADX INFO: renamed from: ۠᩹ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f72485;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f72486;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C16832 f72489;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C23888 f72491;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public String f72492;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f72493;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f72494;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f72495;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6273 f72496;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C19677 f72497;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C13328 f72499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4028 f72500;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C18845 f72501;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f72502;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f72503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15545 f72504;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C21565 f72505;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C11915 f72506;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f72508;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C5652 f72509;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f72510;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C19656 f72511;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C23077 f72513;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public ResultCallback f72514;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f72515;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C4301 f72516;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12392 f72517;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public Runnable f72518;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f72512 = FutureC3575.m10905(null);

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C0604 f72487 = new C0604();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7765 f72488 = new C1911(this);

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public long f72490 = 0;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Object f72498 = new Object();

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C4583 f72507 = new C4583();

    static {
        ApplicationC12518.m30701(158);
        f72485 = new short[]{81, 25580, 25565, 25536, 25548, 25494, 25536, 25557, 25556, 25494, 25563, 25556, 25561, 25547, 25547, 9241, -12663, -12648, -12642, -12656, -12649, -12642, -12634, -12644, -12643, -12656, -12659, -12656, -12649, -12642, -25933, -18869, 23773, -12620, -12627, -12588, -12630, -12672, -12649, -12659, -12648, -12671};
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private native void m50194();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private native void m50196(boolean z);

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private native void m50205();

    @Override // l.ComponentCallbacksC9205
    public native void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8967 m50142(final C22372 c22372, final C23077 c23077) {
        c22372.getClass();
        final C4028 c4028 = (C4028) m50178(new Callable() { // from class: l.ᩳ۠ᩳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C22372 c22373 = this.f55926;
                c22373.getClass();
                final C4028 c4029 = new C4028(c22373, c23077);
                if (c22373.f72500 != null) {
                    throw new IllegalStateException("A save capture is already waiting");
                }
                c22373.f72500 = c4029;
                C12392 c12392 = c4029.f12786;
                if (c12392 != null) {
                    c12392.m30326(c4029.f12792);
                }
                C9344 c9344 = c4029.f12791;
                if (c9344 != null) {
                    c9344.m24106(c4029.f12794);
                }
                if (c22373.f72511 != null) {
                    FutureC3575 futureC3575M45186 = c22373.f72511.m45186();
                    c4029.f12790 = futureC3575M45186;
                    futureC3575M45186.m10910(new InterfaceC8017() { // from class: l.ۖܶᩳ
                        @Override // l.InterfaceC8017
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo4663(Object obj, Throwable th) {
                            c4029.m12126();
                        }
                    });
                }
                if (c22373.f72497 != null) {
                    C19677 c19677 = c22373.f72497;
                    c4029.f12797 = c19677;
                    FutureC3575 futureC3575M45254 = c19677.m45254();
                    c4029.f12795 = futureC3575M45254;
                    futureC3575M45254.m10910((InterfaceC8017) new C6955(1, c4029));
                }
                c4029.m12126();
                return c4029;
            }
        });
        try {
            try {
                return (C8967) c4028.f12793.get();
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
            m50178(new Callable() { // from class: l.ܿ۠ᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CancellationException cancellationException = new CancellationException("Saving observation ended");
                    C4028 c4029 = c4028;
                    c4029.m12125(cancellationException);
                    C8967 c8967 = c4029.f12784;
                    if (c8967 == null) {
                        return null;
                    }
                    c8967.close();
                    return null;
                }
            });
            throw th;
        }
    }

    public C22372() {
        setHasOptionsMenu(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50232() {
        this.f5606.remove("temp");
        C9344 c9344 = this.f5607;
        if (c9344 != null) {
            c9344.m24120(false);
        }
        mo5408("temp");
    }

    @Override // l.AbstractC1582, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72508 = false;
        this.f72499 = ViewOnClickListenerC19121.m44079(this, new C11084(this));
        this.f72496 = ViewOnClickListenerC19121.m44073(this, new C8762(this));
        this.f72509 = C8474.m22146(this, new C23786(1, this));
        if (bundle != null) {
            this.f72490 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50149(C22372 c22372, int i) {
        if (i == 2) {
            c22372.m50171();
        }
    }

    @Override // l.AbstractC1582
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo5419() {
        return this.f5606.getBoolean("temp", false);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f5607.m24110(this, view.findViewById(R.id.MT_Protector), (C12392) view.findViewById(R.id.MT_Protector));
        this.f5607.m24143(getResources().getBoolean(R.bool.MT_Protector));
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.MT_Protector);
        C10392 c10392 = new C10392((ActivityC16315) requireActivity());
        c10392.m26205(false);
        c10392.m26203();
        progressBar.setIndeterminateDrawable(c10392);
        this.f5607.m24111(this, progressBar);
        final TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f5607.m24112(this, textView);
        this.f5607.m24129(this, textView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ֨ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f54228.m50143(view2);
            }
        });
        textView2.setOnClickListener(new ViewOnClickListenerC2205(0, this));
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۠֨ᩳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C4925.m14314((CharSequence) textView.getText().toString());
                return true;
            }
        });
        C12392 c12392 = (C12392) view.findViewById(R.id.MT_Protector);
        this.f72517 = c12392;
        c12392.m30328(this.f72488);
        C12392 c12393 = this.f72517;
        C9344 c9344 = this.f5607;
        C11003.requireNonNull(c9344);
        c12393.m30335(new C19264(c9344));
        this.f72517.m30327(new C6270(this));
        this.f72502 = bundle == null ? null : bundle.getString("editSessionIdOnStart");
        this.f72494 = bundle == null ? 0L : bundle.getLong("editSessionMarkOnStart");
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        C12392 c12394 = this.f72517;
        C11003.requireNonNull(c12394);
        this.f72507.m13483(viewLifecycleOwner, new C8762(c12394));
        this.f72516 = new C4301(view, this.f72517);
        C15545 c15545 = new C15545((ActivityC16315) requireActivity(), this.f72517, TextBundle.TEXT_ENTRY, new C18139(this, view));
        this.f72504 = c15545;
        c15545.m36683(getViewLifecycleOwner(), this.f72516, ActivityC8638.class);
        this.f72517.m30334(new C17433(this));
        this.f72517.m30330(new InterfaceC8035() { // from class: l.֡۠ᩳ
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo1646(int i, int i2) {
                this.f1650.m50215();
            }
        });
        this.f72517.m30338(new C14610(this));
        m50198();
        m50215();
        this.f72503 = true;
        this.f72516.m12888();
        m50218(-1, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50152(C22372 c22372, View view) {
        int i;
        if (c22372.m50213() || c22372.m50192() || c22372.m50195()) {
            i = C14776.f45134;
        } else {
            C23077 c23077 = c22372.f72513;
            i = c23077 == null ? -1 : c23077.f74223;
        }
        if (i != -1 && !c22372.m50167()) {
            c22372.m50180(i);
        } else {
            c22372.m50143(view);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50157(C22372 c22372, C4342 c4342, RuntimeException runtimeException) {
        C12392 c12392;
        if (c22372.f72503 && (c12392 = c22372.f72517) != null && c12392.m30436() == c4342) {
            C16832 c16832 = c22372.f72489;
            if (c16832 != null) {
                c16832.m39612();
                c22372.f72489 = null;
            }
            c22372.m5421(true);
            c22372.f72517.m30407(true);
            c22372.f5603.m46502((Throwable) runtimeException);
        }
    }

    @Override // l.AbstractC1582, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("editSessionIdOnStart", this.f72502);
        bundle.putLong("editSessionMarkOnStart", this.f72494);
        bundle.putLong("transFileTime", this.f72490);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50145(final C4733 c4733) {
        C19258 c19258BuildDialog = ((ActivityC16315) requireActivity()).buildDialog();
        c19258BuildDialog.m44436(m50239());
        c19258BuildDialog.m44424(getString(R.string.MT_Protector, c4733.f15019.getName()));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20675(1, this, c4733));
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22372 c22372 = this.f46216;
                c22372.f72517.m30456(true);
                c22372.m5409(true);
                c22372.m5407(c4733.f15019.mo23117());
            }
        });
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f72495;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        this.f72495 = dialogInterfaceC0206M44438;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50180(int i) {
        ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
        C12392 c12392 = this.f72517;
        C11915 c11915 = this.f72506;
        int[] iArrM30369 = c12392.m30369();
        Charset charsetM35151 = C14776.m35151(i);
        new C21151(c12392, c11915, iArrM30369, activityC16315, charsetM35151, c12392.m30531().getBytes(charsetM35151).length).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m50181(C4733 c4733) {
        C19258 c19258BuildDialog = ((ActivityC16315) requireActivity()).buildDialog();
        c19258BuildDialog.m44436(m50239());
        int i = 0;
        c19258BuildDialog.m44424(getString(R.string.MT_Protector, c4733.f15019.getName()));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9261(i, this));
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8555(this, c4733, i));
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f72495;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        this.f72495 = dialogInterfaceC0206M44438;
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM38460 = ((ActivityC16315) requireActivity()).m38460(R.layout.MT_Protector);
        if (viewM38460 == null) {
            viewM38460 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C11003.requireNonNull(viewM38460);
        }
        C4925.m14316(new RunnableC1126(1, this), 600L);
        C7261.f22281.m1668(getViewLifecycleOwner(), new C21235(1, this));
        return viewM38460;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50218(final int i, final boolean z, final boolean z2) {
        Point pointM30472;
        C19656 c19656;
        C12392 c12392;
        if (this.f72493) {
            return;
        }
        if (this.f72501 != null) {
            this.f72518 = new Runnable() { // from class: l.ۙ֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13913.m50218(i, z, z2);
                }
            };
            if (!this.f72503 || (c12392 = this.f72517) == null) {
                return;
            }
            c12392.m30412(true);
            this.f5607.m24114(this, true);
            return;
        }
        C19677 c19677 = this.f72497;
        if (c19677 != null) {
            this.f72518 = new Runnable() { // from class: l.ۗ֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9277.m50218(i, z, z2);
                }
            };
            c19677.m45248();
            return;
        }
        boolean zM5410 = m5410();
        this.f72510 = zM5410;
        if (!zM5410 && !z && !m5420().f15019.mo23120()) {
            this.f5603.m46502((Throwable) new FileNotFoundException(m5420().f15019.mo23554()));
            this.f72508 = true;
            return;
        }
        Point point = new Point();
        if (z2 && (c19656 = this.f72511) != null) {
            pointM30472 = c19656.m45189();
            point = this.f72511.m45190();
        } else if (z2 && this.f72503) {
            C12392 c12393 = this.f72517;
            pointM30472 = c12393.m30472(c12393.m30444());
            point.x = this.f72517.getScrollX();
            point.y = this.f72517.m30408();
        } else {
            pointM30472 = null;
        }
        final Point point2 = pointM30472;
        final Point point3 = point;
        C19656 c19657 = this.f72511;
        if (c19657 != null || this.f72506 != null) {
            if (c19657 != null) {
                C12392 c12394 = c19657.f63452;
                C12392 c12395 = this.f72517;
                if (c12394 != c12395 && this.f72503) {
                    if (this.f72505 == null) {
                        this.f72505 = c12395.m30539();
                    }
                    this.f5607.m24114(this, true);
                }
            }
            this.f72518 = new Runnable() { // from class: l.۬֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38406.m50228(z, i, point2, point3);
                }
            };
            m50203(false);
            return;
        }
        m50228(z, i, point2, point3);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        if (this.f72503) {
            ((ActivityC16315) requireActivity()).m10236(this.f72517);
            if (this.f72504.m36684() && this.f72503) {
                this.f72516.m12888();
            }
        }
        m50237();
        m50177();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m50237() {
        ActivityC0737 activity = getActivity();
        if (activity == null || !((ActivityC16315) activity).m38456()) {
            boolean z = ApplicationC20075.f65010.getBoolean("check_file_time", true);
            boolean z2 = ApplicationC20075.f65010.getBoolean("check_file_exists", true);
            if ((z2 || z) && isResumed() && !m5414() && m5417() && !m5410()) {
                C4733 c4733M5420 = m5420();
                AbstractC15440 abstractC15440 = c4733M5420.f15019;
                if (abstractC15440.getClass() == C14798.class) {
                    return;
                }
                boolean zMo23120 = abstractC15440.mo23120();
                Bundle bundle = this.f5606;
                if (!zMo23120) {
                    if (z2 && bundle.getBoolean("checkFileExists")) {
                        m50181(c4733M5420);
                        return;
                    }
                    return;
                }
                if (z) {
                    long j = bundle.getLong("fileTime", -1L);
                    if (j == -1 || abstractC15440.mo23117() == j) {
                        return;
                    }
                    m50145(c4733M5420);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50233() {
        if (this.f72493) {
            return;
        }
        final InterfaceC20758 interfaceC20758M25230 = C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (!C20529.m47015(interfaceC20758M25230) && this.f72506 == null && this.f72497 == null && this.f72501 == null) {
            final C14987 c14987M5411 = m5411();
            C1802.m5993().postDelayed(new Runnable() { // from class: l.۟ۖᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C22372 c22372 = this.f22020;
                    C14987 c14987 = c14987M5411;
                    C7932 c7932M35517 = c14987.m35517();
                    try {
                        if (c7932M35517 == null) {
                            return;
                        }
                        try {
                            c22372.m5418().mo23552();
                            C17852.m41824(c22372.m5412()).mo23552();
                            synchronized (c14987.f45700) {
                                C17852.m41820(c22372.m5412()).mo23552();
                            }
                            if (c22372.f5606.getBoolean("pageMode")) {
                                int iM5423 = c22372.m5423();
                                for (int i = 0; i < iM5423; i++) {
                                    C17852.m41822(c22372.m5412() + "-" + i).mo23552();
                                }
                            }
                            c7932M35517.close();
                        } catch (Error | RuntimeException e) {
                            c7932M35517.m21239(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c7932M35517.close();
                        throw th;
                    }
                }
            }, 500L);
            return;
        }
        this.f72493 = true;
        this.f72518 = null;
        C16832 c16832 = this.f72489;
        if (c16832 != null) {
            c16832.m39612();
            this.f72489 = null;
        }
        FutureC3575 futureC3575M10905 = FutureC3575.m10905(null);
        C19677 c19677 = this.f72497;
        if (c19677 != null) {
            futureC3575M10905 = c19677.m45254().m10911((InterfaceC15071) new C17021());
            this.f72497.m45248();
        }
        FutureC3575 futureC3575M10906 = (this.f72506 == null && this.f72511 == null) ? FutureC3575.m10905(null) : m50203(true);
        C18845 c18845 = this.f72501;
        FutureC3575 futureC3575M10907 = c18845 == null ? FutureC3575.m10905(null) : c18845.f59440;
        final C22477 c22477M50424 = C22477.m50424(interfaceC20758M25230);
        FutureC3575 futureC3575M10911 = this.f72512.m10911((InterfaceC15071) new C23202(6));
        FutureC3575 futureC3575M50427 = c22477M50424.m50427();
        C1802.m5993().removeCallbacksAndMessages(this.f5604);
        FutureC3575.m10898(futureC3575M10905, futureC3575M10906, futureC3575M10907, futureC3575M10911, futureC3575M50427, m5411().m35515()).m10920(new Runnable() { // from class: l.ܳ֨ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C23721.m52302(interfaceC20758M25230);
                    C22372 c22372 = this.f42858;
                    c22372.m5418().mo23552();
                    C17852.m41824(c22372.m5412()).mo23552();
                    C17852.m41820(c22372.m5412()).mo23552();
                    if (c22372.f5606.getBoolean("pageMode")) {
                        int iM5423 = c22372.m5423();
                        for (int i = 0; i < iM5423; i++) {
                            C17852.m41822(c22372.m5412() + "-" + i).mo23552();
                        }
                    }
                } catch (IOException e) {
                    throw new C13452(e);
                }
            }
        }, C1802.f6209).m10910(new InterfaceC8017() { // from class: l.᩻֨ᩳ
            @Override // l.InterfaceC8017
            /* JADX INFO: renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C20256 c20256;
                c22477M50424.m50428(th);
                if (th == null || (c20256 = this.f75073.f5603) == null) {
                    return;
                }
                c20256.m46502(th);
            }
        });
    }

    @Override // l.AbstractC1582
    /* JADX INFO: renamed from: ֫ */
    public final void mo5408(String... strArr) {
        final InterfaceC20758 interfaceC20758M25230 = C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (!C20529.m47015(interfaceC20758M25230) && this.f72497 == null && this.f72506 == null) {
            AbstractC15440 abstractC15440M41820 = C17852.m41820(m5412());
            final C14987 c14987M5411 = m5411();
            final RunnableC8450 runnableC8450 = new RunnableC8450(abstractC15440M41820, this.f5606, c14987M5411.f45700);
            C1802.m5991(new Runnable() { // from class: l.ܰۖᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC8450 runnableC8451 = runnableC8450;
                    C7932 c7932M35517 = c14987M5411.m35517();
                    try {
                        if (c7932M35517 == null) {
                            return;
                        }
                        try {
                            runnableC8451.m22126();
                            c7932M35517.close();
                        } catch (IOException e) {
                            c7932M35517.m21239(e);
                            c7932M35517.close();
                        } catch (Error e2) {
                            e = e2;
                            c7932M35517.m21239(e);
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            c7932M35517.m21239(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        c7932M35517.close();
                        throw th;
                    }
                }
            }, this.f5604, 200L);
            return;
        }
        if (this.f72493 || strArr.length == 0) {
            return;
        }
        final C0604 c0604 = new C0604();
        c0604.m2481(this.f5606, strArr);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new Runnable() { // from class: l.᩸۠ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69084.m50147(interfaceC20758M25230, c0604);
                }
            });
            return;
        }
        C18845 c18845 = this.f72501;
        if (c18845 != null) {
            c18845.f59442.m2481(this.f5606, strArr);
        }
        m50147(interfaceC20758M25230, c0604);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50147(final InterfaceC20758 interfaceC20758, final C0604 c0604) {
        FutureC3575 futureC3575M10905;
        if (this.f72493) {
            return;
        }
        if (this.f72497 != null) {
            this.f72487.m2482(c0604);
            futureC3575M10905 = this.f72497.m45254().m10911((InterfaceC15071) new C9967());
        } else {
            futureC3575M10905 = FutureC3575.m10905(Boolean.FALSE);
        }
        if (this.f72506 != null && this.f72511 == null && this.f72503) {
            return;
        }
        final C22477 c22477M50424 = C22477.m50424(interfaceC20758);
        final C6417 c6417 = C23350.f75019;
        this.f72512 = FutureC3575.m10898(this.f72512, futureC3575M10905.m10927(new InterfaceC21423() { // from class: l.ۛ֨ᩳ
            @Override // l.InterfaceC21423
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C22477 c22477 = c22477M50424;
                if (zBooleanValue) {
                    c22477.m50428((Throwable) null);
                    return FutureC3575.m10905(null);
                }
                FutureC3575 futureC3575M50427 = c22477.m50427();
                final C22372 c22372 = this.f17664;
                final InterfaceC20758 interfaceC20759 = interfaceC20758;
                final C0604 c0605 = c0604;
                final C6417 c6418 = c6417;
                return futureC3575M50427.m10920(new Runnable() { // from class: l.ܽ۠ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22372.m50164(c22372, interfaceC20759, c0605, c6418);
                    }
                }, c6418.f19852);
            }
        }).m10910(new InterfaceC8017() { // from class: l.ۨ֨ᩳ
            @Override // l.InterfaceC8017
            /* JADX INFO: renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C20256 c20256;
                c22477M50424.m50428((Throwable) null);
                if (th == null || (c20256 = this.f34041.f5603) == null) {
                    return;
                }
                c20256.m46502(th);
            }
        }));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50164(C22372 c22372, InterfaceC20758 interfaceC20758, C0604 c0604, C6417 c6417) {
        if (c22372.f72493) {
            return;
        }
        try {
            C11915.m29060(interfaceC20758, c0604, c6417);
        } catch (IOException e) {
            throw new C13452(e);
        }
    }

    @Override // l.AbstractC1582
    /* JADX INFO: renamed from: ֡ */
    public final void mo5405() {
        if (!C20529.m47015(C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]))) && this.f72497 == null && this.f72506 == null) {
            AbstractC15440 abstractC15440M41820 = C17852.m41820(m5412());
            C1802.m5993().removeCallbacksAndMessages(this.f5604);
            C14987 c14987M5411 = m5411();
            RunnableC8450 runnableC8450 = new RunnableC8450(abstractC15440M41820, this.f5606, c14987M5411.f45700);
            C7932 c7932M35517 = c14987M5411.m35517();
            try {
                if (c7932M35517 == null) {
                    return;
                }
                try {
                    runnableC8450.m22126();
                    c7932M35517.close();
                } catch (IOException e) {
                    c7932M35517.m21239(e);
                    c7932M35517.close();
                } catch (Error e2) {
                    e = e2;
                    c7932M35517.m21239(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    c7932M35517.m21239(e);
                    throw e;
                }
            } catch (Throwable th) {
                c7932M35517.close();
                throw th;
            }
        }
    }

    @Override // l.AbstractC1582, l.ComponentCallbacksC9205
    public final void onPause() {
        super.onPause();
        ((ActivityC16315) requireActivity()).m10234();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        C12392 c12392;
        C12392 c12393;
        C4028 c4028 = this.f72500;
        if (c4028 != null) {
            c4028.m12125(new CancellationException("Saving view was destroyed"));
        }
        this.f72486 = null;
        super.onDestroyView();
        if (this.f72497 == null && this.f72506 != null && this.f72511 == null) {
            m50203(true);
        }
        C19656 c19656 = this.f72511;
        if (c19656 != null) {
            c19656.m45185();
        }
        this.f72503 = false;
        this.f72518 = null;
        if (this.f72505 != null) {
            this.f72517.m30412(false);
            this.f72517.m30342(this.f72505);
            this.f72505 = null;
            if (this.f72511 == null && this.f72497 == null && this.f72501 == null) {
                this.f5607.m24114(this, false);
            }
        }
        C19677 c19677 = this.f72497;
        if (c19677 != null) {
            c19677.m45252();
        }
        C15545 c15545 = this.f72504;
        if (c15545 != null && (c19656 == null || c19656.f63452 != this.f72517)) {
            c15545.m36695();
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f72495;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        this.f72495 = null;
        C12392 c12394 = this.f72517;
        if (c12394 != null) {
            c12394.m30327((C6270) null);
            if (c19656 != null) {
                C12392 c12395 = c19656.f63452;
                C12392 c12396 = this.f72517;
                if (c12395 == c12396) {
                    c12396.m30338((InterfaceC19449) null);
                    this.f72517.m30335((InterfaceC14528) null);
                } else if (c19677 != null) {
                    c12392 = c19677.f63579;
                    c12393 = this.f72517;
                    if (c12392 == c12393) {
                        c12393.m30338((InterfaceC19449) null);
                        this.f72517.m30335((InterfaceC14528) null);
                    } else if (this.f72517.m30436() instanceof C4342) {
                        this.f72517.m30338((InterfaceC19449) null);
                        this.f72517.m30335((InterfaceC14528) null);
                        this.f72517.mo25910((CharSequence) "");
                    } else if (this.f72517.m30436().mo1607()) {
                        final C20256 c20256 = this.f5603;
                        m5411().m35516(this.f72517.m30436(), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ᩴ֨ᩳ
                            @Override // l.InterfaceC8017
                            /* JADX INFO: renamed from: ۧ */
                            public final void mo4663(Object obj, Throwable th) {
                                C20256 c20257;
                                if (th == null || (c20257 = c20256) == null) {
                                    return;
                                }
                                c20257.m46502(th);
                            }
                        });
                    }
                } else if (this.f72517.m30436() instanceof C4342) {
                    this.f72517.m30338((InterfaceC19449) null);
                    this.f72517.m30335((InterfaceC14528) null);
                    this.f72517.mo25910((CharSequence) "");
                } else if (this.f72517.m30436().mo1607()) {
                    final C20256 c20257 = this.f5603;
                    m5411().m35516(this.f72517.m30436(), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ᩴ֨ᩳ
                        @Override // l.InterfaceC8017
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo4663(Object obj, Throwable th) {
                            C20256 c20258;
                            if (th == null || (c20258 = c20257) == null) {
                                return;
                            }
                            c20258.m46502(th);
                        }
                    });
                }
            } else if (c19677 != null) {
                c12392 = c19677.f63579;
                c12393 = this.f72517;
                if (c12392 == c12393) {
                    c12393.m30338((InterfaceC19449) null);
                    this.f72517.m30335((InterfaceC14528) null);
                } else if (this.f72517.m30436() instanceof C4342) {
                    this.f72517.m30338((InterfaceC19449) null);
                    this.f72517.m30335((InterfaceC14528) null);
                    this.f72517.mo25910((CharSequence) "");
                } else if (this.f72517.m30436().mo1607()) {
                    final C20256 c20258 = this.f5603;
                    m5411().m35516(this.f72517.m30436(), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ᩴ֨ᩳ
                        @Override // l.InterfaceC8017
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo4663(Object obj, Throwable th) {
                            C20256 c20259;
                            if (th == null || (c20259 = c20258) == null) {
                                return;
                            }
                            c20259.m46502(th);
                        }
                    });
                }
            } else if (this.f72517.m30436() instanceof C4342) {
                this.f72517.m30338((InterfaceC19449) null);
                this.f72517.m30335((InterfaceC14528) null);
                this.f72517.mo25910((CharSequence) "");
            } else if (this.f72517.m30436().mo1607()) {
                final C20256 c20259 = this.f5603;
                m5411().m35516(this.f72517.m30436(), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ᩴ֨ᩳ
                    @Override // l.InterfaceC8017
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo4663(Object obj, Throwable th) {
                        C20256 c202510;
                        if (th == null || (c202510 = c20259) == null) {
                            return;
                        }
                        c202510.m46502(th);
                    }
                });
            }
        }
        this.f72491 = null;
        this.f72515 = 0;
        this.f72516 = null;
        this.f72517 = null;
        this.f72504 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50165(C22372 c22372, InterfaceMenuC23000 interfaceMenuC23000, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, Boolean bool) {
        C23077 c23077;
        interfaceMenuC23000.findItem(R.id.MT_Protector).setTitle(bool.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector);
        boolean zBooleanValue = bool.booleanValue();
        int i = R.string.MT_Protector;
        if (zBooleanValue) {
            menuItem.setVisible(false);
            c22372.f5607.m24137(c22372.m50195());
            c22372.f5607.m24134(false);
            menuItem2.setTitle(R.string.MT_Protector);
        } else {
            menuItem.setVisible(true);
            menuItem.setTitle(R.string.MT_Protector);
            String lowerCase = c22372.m5420().m10174().toLowerCase();
            boolean zEquals = lowerCase.equals(".smali");
            boolean zEquals2 = lowerCase.equals(".jasm");
            c22372.f5607.m24137(zEquals || zEquals2);
            c22372.f5607.m24134(zEquals);
            if (!zEquals2) {
                i = R.string.MT_Protector;
            }
            menuItem2.setTitle(i);
        }
        if (bool.booleanValue() && (c23077 = c22372.f72513) != null && c23077.m51241() && c22372.f72513.f74222 > 0) {
            menuItem3.setVisible(true);
            C9344 c9344 = c22372.f5607;
            C12534 c12534 = c22372.f72513.f74221;
            c9344.m24139((c12534 == null || c12534.m30769() == null || !ActivityC16315.m38430()) ? false : true);
            return;
        }
        menuItem3.setVisible(false);
    }

    @Override // l.ComponentCallbacksC9205
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String name;
        C13328 c13328;
        int i = 1;
        if (this.f5607.m24142()) {
            return true;
        }
        this.f72517.m30443();
        int itemId = menuItem.getItemId();
        final int i2 = 0;
        z = false;
        boolean z = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f72517.m30437());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible("HTML".equalsIgnoreCase(this.f72504.m36694()) || "Markdown".equalsIgnoreCase(this.f72504.m36694()));
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (this.f72517.m30491() == null) {
                menuItemFindItem.setVisible(false);
            } else {
                menuItemFindItem.setVisible(true);
                if (C23196.m51454() && ApplicationC20075.f65008.getBoolean("cc", true)) {
                    z = true;
                }
                menuItemFindItem.setChecked(z);
            }
            this.f5607.m24131(this.f72517.m30374());
            this.f5607.m24141(this.f72517.m30514());
            if (m50202()) {
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C5916.m16579((GetChars) this.f72517.m30436()));
                return true;
            }
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(m50191());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!m5426()) {
                m50218(-1, false, true);
                return true;
            }
            C19258 c19258BuildDialog = ((ActivityC16315) requireActivity()).buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8680(i, this));
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
            if (!m5426()) {
                activityC16315.m38448(this);
                return true;
            }
            C19258 c19258BuildDialog2 = activityC16315.buildDialog();
            c19258BuildDialog2.m44436(m50239());
            c19258BuildDialog2.m44416(R.string.MT_Protector);
            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14904(this, activityC16315, i2));
            c19258BuildDialog2.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21256(this, activityC16315, i2));
            c19258BuildDialog2.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f72504.m36696();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f72504.m36676(ActivityC8638.class);
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            m50232();
            m5425();
            DialogInterfaceOnClickListenerC10816.m27034(R.string.MT_Protector, (ActivityC16315) requireActivity(), "menu_keep_in_editor_tip");
            return true;
        }
        if (m5414()) {
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            int i3 = C14776.f45125;
            String[] strArr = new String[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                strArr[i4] = C14776.m35153(i4);
            }
            final int[] iArr = {this.f72513.f74223};
            C19258 c19258BuildDialog3 = ((ActivityC16315) requireActivity()).buildDialog();
            c19258BuildDialog3.m44433(R.string.MT_Protector);
            c19258BuildDialog3.m44429(strArr, this.f72513.f74223, new DialogInterfaceOnClickListenerC21259(i, iArr));
            c19258BuildDialog3.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    C22372.m50166(this.f2908, iArr, dialogInterface);
                }
            });
            c19258BuildDialog3.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog3.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC16315 activityC16316 = (ActivityC16315) requireActivity();
            if (!m5410() || (c13328 = this.f72499) == null) {
                m50221(activityC16316, (ResultCallback) null);
                return true;
            }
            this.f72514 = null;
            c13328.m32311(null, R.string.MT_Protector, m5420().f15019.getName(), Bundle.EMPTY);
            return true;
        }
        Bundle bundle = this.f5606;
        if (itemId == R.id.MT_Protector) {
            AbstractC15440 abstractC15440 = m5420().f15019;
            String string = bundle.getString("save_as_path");
            if (string == null) {
                string = abstractC15440.getParent();
            }
            this.f72514 = null;
            this.f72499.m32311(string, R.string.MT_Protector, abstractC15440.getName(), Bundle.EMPTY);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C4733 c4733M5420 = m5420();
            String string2 = bundle.getString("save_as_path");
            if (string2 == null) {
                string2 = c4733M5420.f15019.getParent();
            }
            C6273 c6273 = this.f72496;
            String str = c4733M5420.m10173() + "_plain" + c4733M5420.m10174();
            c6273.getClass();
            C6273.m17282(c6273, R.string.MT_Protector, string2, str, (String[]) null, 24);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            int i5 = C14776.f45125;
            String[] strArr2 = new String[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                strArr2[i6] = C14776.m35153(i6);
            }
            C19258 c19258BuildDialog4 = ((ActivityC16315) requireActivity()).buildDialog();
            c19258BuildDialog4.m44433(R.string.MT_Protector);
            c19258BuildDialog4.m44429(strArr2, this.f72513.f74223, new DialogInterface.OnClickListener() { // from class: l.᩺֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C22372.m50185(this.f73178, dialogInterface, i7);
                }
            });
            c19258BuildDialog4.m44442(R.string.MT_Protector, null);
            c19258BuildDialog4.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String[] strArr3 = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
            final String[] strArr4 = {"\r\n", "\r", "\n"};
            String strM30531 = this.f72517.m30531();
            strM30531.getClass();
            if (strM30531.equals("\r")) {
                i2 = 1;
            } else if (!strM30531.equals("\r\n")) {
                i2 = 2;
            }
            C19258 c19258BuildDialog5 = ((ActivityC16315) requireActivity()).buildDialog();
            c19258BuildDialog5.m44433(R.string.MT_Protector);
            c19258BuildDialog5.m44429(strArr3, i2, new DialogInterface.OnClickListener() { // from class: l.۫֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C22372 c22372 = this.f36138;
                    if (i7 != i2) {
                        c22372.f72517.m30499(strArr4[i7]);
                        c22372.f72517.m30456(true);
                    } else {
                        c22372.getClass();
                    }
                    dialogInterface.dismiss();
                }
            });
            c19258BuildDialog5.m44442(R.string.MT_Protector, null);
            c19258BuildDialog5.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C23077 c23077 = this.f72513;
            if (c23077 == null) {
                return true;
            }
            m50180(c23077.f74223);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C12392 c12392 = this.f72517;
            c12392.m30407(!c12392.m30441());
            this.f5607.m24145(this.f72517.m30441());
            this.f72504.m36693();
            if (!this.f72503) {
                return true;
            }
            this.f72516.m12888();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f72513.f74221.m30769() == null) {
                ((ActivityC16315) requireActivity()).m10217(R.string.MT_Protector, R.string.MT_Protector, false);
                return true;
            }
            ActivityC16315 activityC16317 = (ActivityC16315) requireActivity();
            int i7 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC16317);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3616(this, menuItem, i2));
            c19258.m44438();
            return true;
        }
        try {
            if (itemId == R.id.MT_Protector) {
                C10130 c10130 = new C10130();
                String string3 = this.f72517.m30436().toString();
                C2134 c2134 = new C2134(this.f72513.f74221);
                c2134.m7056(this.f72513.f74225);
                c2134.m7058(this.f72513.f74224);
                c2134.m7055(string3);
                c2134.m7057(c10130);
                Intent intent = new Intent((ActivityC16315) requireActivity(), (Class<?>) ActivityC19887.class);
                intent.putExtra(e.m, c10130.m25429());
                AbstractC15440 abstractC15441 = this.f72513.f74220;
                if (abstractC15441 != null) {
                    intent.putExtra("arscPath", abstractC15441.mo23554());
                }
                startActivity(intent);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (m5410()) {
                    C21374.m48457(R.string.MT_Protector);
                    return true;
                }
                C15068 c15068M24909 = C9840.m24909(this.f72517.m30436().toString(), (String) null);
                C10130 c10131 = new C10130();
                c10131.mo13231(o.a.h);
                c15068M24909.mo1516(c10131);
                String strM35657 = c15068M24909.m35657();
                C16293.f50113.m36526(strM35657 + ".mtsx.bin").m36496(c10131);
                Intent intent2 = new Intent((ActivityC16315) requireActivity(), (Class<?>) ActivityC16440.class);
                intent2.putExtra("syntaxName", c15068M24909.m35657());
                intent2.setData(C16999.m39866(m5420().f15019.mo23554() + "_preview", new String[0]).m36522());
                startActivity(intent2);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                ActivityC16315 activityC16318 = (ActivityC16315) requireActivity();
                InterfaceC7785 interfaceC7785M30436 = this.f72517.m30436();
                String strM30532 = this.f72517.m30531();
                boolean zM5410 = m5410();
                AbstractC15440 abstractC15442 = m5420().f15019;
                String strMo23554 = zM5410 ? null : abstractC15442.mo23554();
                String name2 = abstractC15442.getName();
                boolean zEqualsIgnoreCase = "Markdown".equalsIgnoreCase(this.f72504.m36694());
                boolean zM48208 = C21238.m48208(activityC16318);
                int iM30525 = zEqualsIgnoreCase ? this.f72517.m30525() : 0;
                boolean z2 = (zEqualsIgnoreCase || strMo23554 == null || (name = abstractC15442.getName()) == null || !".mhtml".equalsIgnoreCase(AbstractC15440.m36487(name))) ? false : true;
                new C23783(this, z2 ? this.f72513.f74223 : C14776.f45134, interfaceC7785M30436, strM30532, activityC16318, z2, zEqualsIgnoreCase, iM30525, name2, zM48208, strMo23554).m20274();
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                m50171();
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                new C1742((ActivityC16315) requireActivity(), C1742.m5819(this.f72517));
                return true;
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    this.f72504.m36690(menuItem);
                    return true;
                }
                if (m50202()) {
                    new C6850(this, (ActivityC16315) requireActivity(), m5412(), C16293.f50117.m36526("xmlTrans")).m20274();
                    return true;
                }
                if (!m50191()) {
                    throw new RuntimeException();
                }
                new C20962(this, (ActivityC16315) requireActivity(), m5412(), C16293.f50117.m36526("jsonTrans")).m20274();
                return true;
            }
            if (!C23196.m51460()) {
                C21374.m48457(R.string.MT_Protector);
                new ViewOnClickListenerC0059((ActivityC16315) requireActivity());
                return true;
            }
            if (!C23196.m51454()) {
                C21374.m48457(R.string.MT_Protector);
                return true;
            }
            if (this.f72517.m30491() == null) {
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC20075.f65008.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        } catch (Exception e) {
            m50144(e, (ActivityC16315) null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m50177() {
        if (this.f72490 == 0 || !isVisible() || m5414()) {
            return;
        }
        int i = 0;
        if (!this.f72503 || !this.f72508) {
            C4925.m14316(new RunnableC6438(i, this), 100L);
            return;
        }
        if (!m50202()) {
            if (m50191()) {
                AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("jsonTrans");
                if (!abstractC15440M36526.mo23120() || abstractC15440M36526.mo23117() == this.f72490) {
                    this.f72490 = 0L;
                    return;
                }
                try {
                    C21434 c21434M14984 = AbstractC5206.m14984(abstractC15440M36526.m36489(), EnumC13671.OrderedField);
                    if (m5412().equals(c21434M14984.m48553("<--id-c5skl23kjndf-->"))) {
                        C12450.m30608(c21434M14984, this.f72517);
                        this.f72517.m30345(false);
                    }
                } catch (Exception unused) {
                } finally {
                    this.f72490 = 0L;
                }
                return;
            }
            return;
        }
        AbstractC15440 abstractC15440M36527 = C16293.f50117.m36526("xmlTrans");
        if (!abstractC15440M36527.mo23120() || abstractC15440M36527.mo23117() == this.f72490) {
            this.f72490 = 0L;
            return;
        }
        try {
            C21434 c21434M14985 = AbstractC5206.m14984(abstractC15440M36527.m36489(), EnumC13671.OrderedField);
            if (m5412().equals(c21434M14985.m48553("<--id-c5skl23kjndf-->"))) {
                C5916.m16578(c21434M14985, this.f72517.m30436());
                this.f72517.m30345(false);
            }
        } catch (Exception unused2) {
        } finally {
            this.f72490 = 0L;
        }
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private boolean m50202() {
        C12392 c12392 = this.f72517;
        return (c12392 != null && DocumentReader.RESERVED.equalsIgnoreCase(c12392.m30440())) || m5420().f15019.getName().toLowerCase().endsWith(".xml");
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private boolean m50191() {
        C12392 c12392 = this.f72517;
        return (c12392 != null && "json".equalsIgnoreCase(c12392.m30440())) || m5420().f15019.getName().toLowerCase().endsWith(".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public void m50171() {
        if (!this.f72508) {
            C4925.m14316(new RunnableC9673(this, C9170.m23579(getViewLifecycleOwner())), 100L);
            return;
        }
        String lowerCase = m5420().m10174().toLowerCase();
        if (!m50195() && !lowerCase.equals(".jasm")) {
            if (lowerCase.equals(".smali")) {
                new C22167(this, (ActivityC16315) requireActivity()).m20274();
                return;
            }
            return;
        }
        new C20051(this, (ActivityC16315) requireActivity()).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50160(C22372 c22372, C12392 c12392, boolean z, AtomicBoolean atomicBoolean, Point point, Point point2, C11915 c11915, Throwable th) {
        if (c22372.f72503 && c22372.f72517 == c12392) {
            if (th != null) {
                Throwable cause = th;
                while ((cause instanceof C13452) && cause.getCause() != null) {
                    cause = cause.getCause();
                }
                if (cause instanceof CancellationException) {
                    return;
                }
                c22372.m5421(true);
                c22372.f72517.m30407(true);
                c22372.f5603.m46502(th);
                c22372.f72508 = true;
                return;
            }
            c22372.m50196(z);
            if (atomicBoolean.get()) {
                c22372.m50205();
            }
            if (z || point == null || point.x == -1) {
                return;
            }
            new C17000(c22372, c11915, point, point2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50228(final boolean z, final int i, final Point point, final Point point2) {
        C9344 c9344;
        String name;
        C11273 c11273M41182;
        final C2931 c2931;
        byte[] bArr;
        byte[] bArr2;
        if (this.f5607 != null && Looper.myLooper() == Looper.getMainLooper()) {
            this.f5607.m24107(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.f72503 && this.f72517 != null && this.f72504 != null && (c9344 = this.f5607) != null && ((!c9344.m24142() || this.f72505 != null) && !this.f72517.m30370() && this.f72497 == null && this.f72511 == null && this.f72506 == null && this.f72491 == null)) {
            final C6417 c6417 = C23350.f75019;
            final InterfaceC20758 interfaceC20758Of = C6646.of(C17852.m41819().mo23554(), new String[0]);
            final String strM5412 = m5412();
            final C12392 c12392 = this.f72517;
            final C4733 c4733M5420 = m5420();
            final boolean zM5410 = m5410();
            boolean zM50213 = m50213();
            Bundle bundle = this.f5606;
            final boolean z2 = zM50213 || m50192() || m50195() || bundle.getBoolean("forceTryAXml") || bundle.getBoolean("forceTryClass");
            final InterfaceC20758 interfaceC20758M25230 = C10050.m25230(strM5412, interfaceC20758Of);
            boolean z3 = (C20529.m47015(interfaceC20758M25230) || m5418().mo23120()) ? false : true;
            final Bundle bundle2 = new Bundle(bundle);
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
            bundle2.putInt("textPageSize", C4925.f15523.getInt("text_page_size", 50000000));
            if (z3) {
                try {
                    C15545 c15545 = this.f72504;
                    if (bundle.getBoolean("forceTryAXml")) {
                        name = ".xml";
                    } else {
                        name = bundle.getBoolean("forceTryClass") ? ".class" : c4733M5420.f15019.getName();
                    }
                    c15545.m36677(name);
                    C2931 c2931M30527 = c12392.m30527();
                    C10130 c10130 = new C10130();
                    C10130 c10131 = new C10130();
                    this.f72504.m36688(c10130);
                    this.f72504.m36681(c10131);
                    byte[] bArrM25444 = c10130.m25444();
                    byte[] bArrM25445 = c10131.m25444();
                    c11273M41182 = zM5410 ? C17622.m41182() : null;
                    c2931 = c2931M30527;
                    bArr = bArrM25444;
                    bArr2 = bArrM25445;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            } else {
                c2931 = null;
                bArr = null;
                bArr2 = null;
                c11273M41182 = null;
            }
            C1802.m5993().removeCallbacksAndMessages(this.f5604);
            final FutureC3575 futureC3575M35515 = m5411().m35515();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(!z);
            final boolean z4 = z3;
            final byte[] bArr3 = bArr;
            final byte[] bArr4 = bArr2;
            final C11273 c11273 = c11273M41182;
            C19677 c19677 = new C19677(this, new InterfaceC18971() { // from class: l.֫۠ᩳ
                /* JADX WARN: Code duplicated, block: B:67:0x0116  */
                /* JADX WARN: Code duplicated, block: B:69:0x011a  */
                /* JADX WARN: Code duplicated, block: B:71:0x011e  */
                /* JADX WARN: Code duplicated, block: B:73:0x0121  */
                /* JADX WARN: Code duplicated, block: B:75:0x0129  */
                /* JADX WARN: Code duplicated, block: B:77:0x012c  */
                @Override // l.InterfaceC18971
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final C11915 mo5717(InterfaceC17066 interfaceC17066) throws Throwable {
                    String str;
                    C11915 c11915M47013;
                    C11915 c11915;
                    Throwable th;
                    C11915 c11916;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    boolean z5 = zM5410;
                    boolean z6 = z2;
                    futureC3575M35515.m10930();
                    boolean z7 = z4;
                    InterfaceC20758 interfaceC20758 = interfaceC20758M25230;
                    C6417 c6418 = c6417;
                    InterfaceC20758 interfaceC20759 = interfaceC20758Of;
                    String str2 = strM5412;
                    if (!z7 || C20529.m47015(interfaceC20758) || this.f5898.m5418().mo23120()) {
                        str = str2;
                        c11915M47013 = C20529.m47013(interfaceC20759, str, c6418, interfaceC17066);
                    } else {
                        str = str2;
                        c11915M47013 = C1310.m4547(interfaceC20758, bundle2, c2931, bArr3, bArr4, c11273, c6418, interfaceC17066);
                    }
                    C11915 c11917 = c11915M47013;
                    boolean z8 = z;
                    C4733 c4733 = c4733M5420;
                    int i3 = i;
                    try {
                        try {
                            if (!z8) {
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                c11917.m29072(C4925.f15523.getInt("text_page_size", 50000000));
                                InterfaceC20758 interfaceC20758M25231 = C10050.m25230(str, interfaceC20759);
                                Point point3 = point;
                                Point point4 = point2;
                                return c11917.m29071(interfaceC20758M25231, c4733, z5, z6, i3, point3 == null ? 0 : point4.x, point3 == null ? 0 : point4.y, c6418, interfaceC17066, (point3 == null || point3.x == -1) ? false : true);
                            }
                            Bundle bundleM44358 = c11917.f35623.f31452.f19337.m44358();
                            atomicBoolean2.set(bundleM44358.getBoolean("e2SourcePending"));
                            String string = bundleM44358.getString("filePath");
                            if (string == null) {
                                throw new IOException("Session source path is missing");
                            }
                            try {
                                return c11917.m29070(interfaceC20758, string.equals(c4733.f15019.mo23554()) ? c4733 : new C4733(C16999.m39866(string, new String[0])), bundleM44358.getBoolean("forceTryAXml") || bundleM44358.getBoolean("forceTryClass"), i3, c6418, interfaceC17066, true);
                            } catch (Error | Exception e2) {
                                th = e2;
                                c11916 = c11917;
                                try {
                                    c11916.m29068().m10930();
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
                            c11915 = interfaceC20758;
                            th = e;
                            c11916 = c11915;
                            c11916.m29068().m10930();
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
                        c11915 = c11917;
                        th = e;
                        c11916 = c11915;
                        c11916.m29068().m10930();
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
                        c11915 = c11917;
                        th = e;
                        c11916 = c11915;
                        c11916.m29068().m10930();
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
            c19677.f63558 = z || point == null || point.x == -1;
            FutureC3575 futureC3575M50139 = m50139(c19677, c6417.f19852, interfaceC20758M25230);
            if (z && !z3) {
                c19677.m45249(strM5412, interfaceC20758M25230);
            }
            futureC3575M50139.m10910(new InterfaceC8017() { // from class: l.ۧ۠ᩳ
                @Override // l.InterfaceC8017
                /* JADX INFO: renamed from: ۧ */
                public final void mo4663(Object obj, Throwable th) {
                    C22372.m50160(this.f32716, c12392, z, atomicBoolean, point, point2, (C11915) obj, th);
                }
            });
            return;
        }
        throw new IllegalStateException("Fragment session loading requires an idle foreground view");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private FutureC3575 m50139(C19677 c19677, Executor executor, InterfaceC20758 interfaceC20758) {
        C21565 c21565M30539 = this.f72505;
        if (c21565M30539 == null) {
            c21565M30539 = this.f72517.m30539();
        }
        c19677.f63572 = c21565M30539;
        this.f72505 = null;
        this.f72497 = c19677;
        this.f72486 = c19677.m45254();
        this.f5607.m24114(this, true);
        if (interfaceC20758 == null) {
            c19677.m45250(executor);
        } else {
            c19677.m45251(C22477.m50424(interfaceC20758), executor);
        }
        return c19677.m45254();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50226(C19677 c19677) {
        if (this.f72497 == c19677 && this.f72503 && this.f72517 == c19677.f63579) {
            this.f5607.m24135(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50227(C19677 c19677, C11915 c11915, boolean z) {
        if (this.f72497 != c19677) {
            return;
        }
        this.f72497 = null;
        if (z && c19677.m45253()) {
            this.f72506 = c11915;
            this.f72487.m2480(this.f5606);
            this.f72487 = new C0604();
            C16832 c16832 = new C16832(this, c11915, this.f72515);
            this.f72489 = c16832;
            c16832.m39611();
        }
        if (!z && c11915 != null && this.f72491 == c11915.f35622) {
            this.f72491 = null;
            this.f72515 = 0;
        }
        if (this.f72501 != null) {
            return;
        }
        this.f5607.m24114(this, false);
        m50207();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private FutureC3575 m50203(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session close requires the main thread");
        }
        C19656 c19656 = this.f72511;
        if (c19656 != null) {
            return c19656.m45187();
        }
        C4028 c4028 = this.f72500;
        if (c4028 != null) {
            c4028.m12125(new CancellationException("Saving session is closing"));
        }
        C11915 c11915 = this.f72506;
        if (c11915 == null) {
            return FutureC3575.m10905(null);
        }
        C12392 c12392 = this.f72517;
        if (c12392 == null || this.f72504 == null || c12392.m30436() != c11915.f35630) {
            throw new IllegalStateException("Fragment session owner changed before close");
        }
        C16832 c16832 = this.f72489;
        if (c16832 != null) {
            c16832.m39612();
            this.f72489 = null;
        }
        FutureC3575 futureC3575 = new FutureC3575();
        this.f72486 = futureC3575;
        futureC3575.m10914((Throwable) new CancellationException("Saving session is closing"));
        this.f72511 = new C19656(this, c11915, this.f72515, this.f72513, z);
        if (z) {
            this.f5607.m24126(this);
        } else {
            this.f5607.m24114(this, true);
        }
        return this.f72511.m45187();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50230(C11915 c11915, C12392 c12392) {
        return this.f72503 && this.f72517 == c12392 && this.f72506 == c11915 && this.f72511 == null && this.f72497 == null && c12392.m30436() == c11915.f35630;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23077 m50231() {
        return this.f72513;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50224(C19656 c19656) {
        if (this.f72511 != c19656) {
            return;
        }
        C11915 c11915 = c19656.f63455;
        if (c11915.f35622.m52635() != null) {
            this.f5603.m46502((Throwable) c11915.f35622.m52635());
        }
        this.f72511 = null;
        if (this.f72506 == c11915) {
            this.f72506 = null;
        }
        if (this.f72491 == c11915.f35622) {
            this.f72491 = null;
            this.f72515 = 0;
        }
        if (this.f72501 != null) {
            return;
        }
        if (this.f72505 == null) {
            this.f5607.m24114(this, false);
        }
        m50207();
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m50207() {
        Runnable runnable = this.f72518;
        C12392 c12392 = this.f72517;
        if (runnable == null || !this.f72503) {
            this.f72518 = null;
        } else {
            C4925.m14315(new RunnableC19053(this, runnable, c12392, 1));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50188(C22372 c22372, C12392 c12392, Runnable runnable) {
        if (c22372.f72518 != runnable) {
            return;
        }
        c22372.f72518 = null;
        try {
            try {
                if (c22372.f72503 && c22372.f72517 == c12392) {
                    runnable.run();
                }
                C4028 c4028 = c22372.f72500;
                if (c4028 != null) {
                    c4028.m12126();
                }
            } catch (Throwable th) {
                C4028 c4029 = c22372.f72500;
                if (c4029 != null) {
                    c4029.m12126();
                }
                throw th;
            }
        } catch (Error | RuntimeException e) {
            C4028 c40210 = c22372.f72500;
            if (c40210 != null) {
                c40210.m12125(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50225(C19656 c19656, Throwable th) {
        C20256 c20256;
        if (this.f72511 != c19656 || (c20256 = this.f5603) == null) {
            return;
        }
        c20256.m46502(th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m50217(final C11915 c11915, int i, C21565 c21565) {
        C12392 c12392;
        C12392 c12393;
        FutureC3575 futureC3575M30421;
        C12392 c12394 = this.f72517;
        if (c12394 != null) {
            InterfaceC7785 interfaceC7785M30436 = c12394.m30436();
            C4342 c4342 = c11915.f35630;
            if (interfaceC7785M30436 == c4342) {
                C10483 c10483 = c11915.f35623;
                C23888 c23888 = c11915.f35622;
                if (Looper.myLooper() == Looper.getMainLooper() && this.f72503 && (c12392 = this.f72517) != null && this.f72504 != null) {
                    InterfaceC7785 interfaceC7785M30437 = c12392.m30436();
                    if (interfaceC7785M30437 instanceof C4342) {
                        C4342 c4343 = (C4342) interfaceC7785M30437;
                        if (c23888.m52632(c4343.mo1601())) {
                            if (this.f72491 != null) {
                                throw new IllegalStateException("Fragment recovery is already bound");
                            }
                            if (i < 0) {
                                throw new IllegalArgumentException("Negative fragment state limit");
                            }
                            C6249 c6249 = c10483.f31452;
                            c6249.m17225(c4343.mo1601());
                            c4343.mo1601().m52365();
                            Bundle bundleM44358 = c6249.f19337.m44358();
                            C12392 c12395 = this.f72517;
                            C15545 c15545 = this.f72504;
                            c15545.m36679(c6249.f19335, c6249.f19334, c6249.f19331);
                            if (!this.f72503 || this.f72517 != c12395 || this.f72504 != c15545 || c12395.m30436() != c4343) {
                                throw new CancellationException("Fragment owner changed during restoration");
                            }
                            c6249.m17225(c4343.mo1601());
                            if (Looper.myLooper() == Looper.getMainLooper() && (c12393 = this.f72517) != null) {
                                InterfaceC7785 interfaceC7785M30438 = c12393.m30436();
                                if (interfaceC7785M30438 instanceof C4342) {
                                    C4342 c4344 = (C4342) interfaceC7785M30438;
                                    if (c23888.m52632(c4344.mo1601())) {
                                        if (this.f72491 != null) {
                                            throw new IllegalStateException("Fragment persistence is already bound");
                                        }
                                        if (i < 0) {
                                            throw new IllegalArgumentException("Negative fragment state limit");
                                        }
                                        c4344.mo1601().m52365();
                                        this.f72491 = c23888;
                                        this.f72515 = i;
                                        Bundle bundle = this.f5606;
                                        bundle.clear();
                                        bundle.putAll(bundleM44358);
                                        this.f72487.m2480(bundle);
                                        this.f72513 = c10483.f31451;
                                        this.f72510 = m5410();
                                        m50194();
                                        final C12392 c12396 = this.f72517;
                                        final C15545 c15546 = this.f72504;
                                        if (c21565 == null) {
                                            futureC3575M30421 = c12396.m30473(c4342);
                                        } else {
                                            futureC3575M30421 = c12396.m30421(c4342, c21565);
                                        }
                                        return futureC3575M30421.m10907(new Runnable() { // from class: l.۠۠ᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C22372 c22372 = this.f24859;
                                                if (c22372.f72503) {
                                                    C12392 c12397 = c22372.f72517;
                                                    C12392 c12398 = c12396;
                                                    if (c12397 == c12398 && c22372.f72504 == c15546 && c12398.m30436() == c11915.f35630) {
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

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18581 m50235() {
        C12392 c12392;
        C9344 c9344 = this.f5607;
        if (c9344 != null && !c9344.m24142() && this.f72503) {
            if (this.f72491 == null && ((c12392 = this.f72517) == null || !(c12392.m30436() instanceof C4342))) {
                C7932 c7932M35517 = m5411().m35517();
                if (c7932M35517 != null) {
                    C12392 c12393 = this.f72517;
                    C15545 c15545 = this.f72504;
                    try {
                        AbstractC15440 abstractC15440M5418 = m5418();
                        if (m5414()) {
                            abstractC15440M5418.mo23552();
                            c7932M35517.close();
                            return null;
                        }
                        if (c12393 == null || c15545 == null) {
                            throw new IllegalStateException("Legacy save view is unavailable");
                        }
                        return new C4528(this, c12393, c15545, c7932M35517, abstractC15440M5418);
                    } catch (Error | RuntimeException e) {
                        c7932M35517.m21239(e);
                        throw e;
                    }
                }
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("Fragment state capture requires the foreground thread");
                }
                if (!m5414()) {
                    C12392 c12394 = this.f72517;
                    C11003.requireNonNull(c12394);
                    InterfaceC7785 interfaceC7785M30436 = c12394.m30436();
                    if (!(interfaceC7785M30436 instanceof C4342)) {
                        throw new IllegalStateException("Fragment session owner changed before capture");
                    }
                    C4342 c4342 = (C4342) interfaceC7785M30436;
                    C23888 c23888 = this.f72491;
                    if (c23888 == null || !c23888.m52632(c4342.mo1601())) {
                        throw new IllegalStateException("Fragment session persistence is not bound");
                    }
                    C20256 c20256 = this.f5603;
                    C11003.requireNonNull(c20256);
                    try {
                        return new C3117(m50193(), c20256);
                    } catch (IOException | IllegalStateException e2) {
                        c20256.m46502(e2);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FutureC3575 m50193() {
        C12392 c12392 = this.f72517;
        C11003.requireNonNull(c12392);
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        if (!(interfaceC7785M30436 instanceof C4342)) {
            throw new IllegalStateException("Fragment session owner changed before capture");
        }
        C4342 c4342 = (C4342) interfaceC7785M30436;
        C23888 c23888 = this.f72491;
        if (c23888 == null || !c23888.m52632(c4342.mo1601())) {
            throw new IllegalStateException("Fragment session persistence is not bound");
        }
        C10130 c10130 = new C10130();
        C10130 c10131 = new C10130();
        this.f72504.m36688(c10130);
        this.f72504.m36681(c10131);
        FutureC3575 futureC3575M52631 = c23888.m52631(C13304.m32268(c12392, this.f5606, this.f72513, c10130.m25444(), c10131.m25444(), this.f72515, -1L, null));
        C23721 c23721Mo1601 = c4342.mo1601();
        C11003.requireNonNull(c23721Mo1601);
        return futureC3575M52631.m10927((InterfaceC21423) new C12620(1, c23721Mo1601));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50219(String str, boolean z) {
        C4733 c4733 = new C4733(C16999.m39866(str, new String[0]));
        ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
        ResultCallback resultCallback = this.f72514;
        this.f72514 = null;
        new C5939(this, activityC16315, c4733, z, resultCallback).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m50182(final ActivityC16315 activityC16315) {
        if (m5410() && this.f72499 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(d.A, true);
            this.f72514 = null;
            this.f72499.m32311(null, R.string.MT_Protector, m5420().f15019.getName(), bundle);
            return;
        }
        m50222(activityC16315, new Runnable() { // from class: l.ܺ۠ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C22372 c22372 = this.f48897;
                c22372.getClass();
                activityC16315.m38448(c22372);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50146(final ActivityC16315 activityC16315, boolean z) {
        View viewM10216 = activityC16315.m10216(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        checkBox.setChecked(z);
        final RunnableC2412 runnableC2412 = new RunnableC2412(this, checkBox, activityC16315);
        C19258 c19258BuildDialog = activityC16315.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f12243.m50222(activityC16315, runnableC2412);
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩴ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnableC2412.run();
            }
        };
        int i = R.string.MT_Protector;
        c19258BuildDialog.m44434(R.string.MT_Protector, onClickListener);
        Button buttonM1446 = c19258BuildDialog.m44438().m1446();
        if (!checkBox.isChecked()) {
            i = R.string.MT_Protector;
        }
        buttonM1446.setText(i);
        checkBox.setOnCheckedChangeListener(new C19346(buttonM1446, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50221(ActivityC16315 activityC16315, ResultCallback resultCallback) {
        if (m5426()) {
            new C11584(this, activityC16315, resultCallback).m20274();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50222(ActivityC16315 activityC16315, Runnable runnable) {
        if (!m5426()) {
            runnable.run();
        } else {
            C12392 c12392 = this.f72517;
            m50221(activityC16315, new C22872(this, c12392, c12392 == null ? null : c12392.m30436(), m5420().f15019.mo23554(), runnable));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m50178(Callable callable) {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        C4925.m14315(futureTask);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8967 m50179(C22372 c22372, C23077 c23077) {
        C12392 c12392;
        InterfaceC7785 interfaceC7785M30436;
        C4733 c4733M5420;
        C11915 c11915;
        C14799 c14799M35197;
        C4342 c4342;
        if (c22372.f72503 && c22372.f72517 != null && c22372.f72511 == null && c22372.f72518 == null && !c22372.f5607.m24142()) {
            FutureC3575 futureC3575 = c22372.f72486;
            if (futureC3575 != null) {
                if (futureC3575.isDone()) {
                    if (((C11915) c22372.f72486.m10930()).f35630 != c22372.f72517.m30436()) {
                        throw new CancellationException("Saving content was replaced after loading");
                    }
                    if (c22372.f72508) {
                        if (!c22372.m5414()) {
                            throw new IllegalStateException("Cannot save failed editor content");
                        }
                        c12392 = c22372.f72517;
                        interfaceC7785M30436 = c12392.m30436();
                        if (interfaceC7785M30436 instanceof C4342) {
                            c4342 = (C4342) interfaceC7785M30436;
                            if (!c4342.mo1601().m52350().m14691()) {
                                if (c4342.mo1601().m52350().m14689() != EnumC0191.LOADING) {
                                    throw new IllegalStateException("Cannot save incomplete source text");
                                }
                            }
                        }
                        c4733M5420 = c22372.m5420();
                        if (c23077 == null) {
                            c23077 = c22372.f72513;
                        }
                        c11915 = c22372.f72506;
                        if (c11915 != null) {
                            c14799M35197 = C14799.m35197(interfaceC7785M30436, c12392.m30531(), c23077, -1, null);
                        } else {
                            c14799M35197 = C14799.m35197(interfaceC7785M30436, c12392.m30531(), c23077, -1, null);
                        }
                        if (c12392.m30436() == interfaceC7785M30436) {
                            throw new IllegalStateException("Editor changed during saving capture");
                        }
                        return new C8967(c22372, c12392, interfaceC7785M30436, c12392.m30530(), c4733M5420, c14799M35197);
                    }
                }
            } else if (c22372.f72508 && c22372.f72513 != null && c22372.f72517.m30536()) {
                if (!c22372.m5414()) {
                    throw new IllegalStateException("Cannot save failed editor content");
                }
                c12392 = c22372.f72517;
                interfaceC7785M30436 = c12392.m30436();
                if (interfaceC7785M30436 instanceof C4342) {
                    c4342 = (C4342) interfaceC7785M30436;
                    if (!c4342.mo1601().m52350().m14691()) {
                        if (c4342.mo1601().m52350().m14689() != EnumC0191.LOADING) {
                            throw new IllegalStateException("Cannot save incomplete source text");
                        }
                    }
                }
                c4733M5420 = c22372.m5420();
                if (c23077 == null) {
                    c23077 = c22372.f72513;
                }
                c11915 = c22372.f72506;
                if (c11915 != null || c11915.f35630 != interfaceC7785M30436) {
                    c14799M35197 = C14799.m35197(interfaceC7785M30436, c12392.m30531(), c23077, -1, null);
                } else {
                    c14799M35197 = C14799.m35199(c11915, c12392.m30531(), c23077);
                }
                try {
                    if (c12392.m30436() == interfaceC7785M30436) {
                        throw new IllegalStateException("Editor changed during saving capture");
                    }
                    return new C8967(c22372, c12392, interfaceC7785M30436, c12392.m30530(), c4733M5420, c14799M35197);
                } catch (Error | RuntimeException e) {
                    c14799M35197.close();
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50190(C22372 c22372, C18845 c18845) {
        if (c22372.f72501 != c18845) {
            return;
        }
        c22372.f72501 = null;
        c18845.f59441.m50428((Throwable) null);
        c18845.f59440.m10912((Object) null);
        if (c22372.f72518 != null && c22372.f72503) {
            c22372.f72517.m30412(false);
            c22372.f5607.m24114(c22372, false);
        }
        c22372.m50207();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50144(Exception exc, ActivityC16315 activityC16315) {
        int i;
        this.f5603.m46502((Throwable) exc);
        if (activityC16315 == null) {
            activityC16315 = (ActivityC16315) getActivity();
        }
        if (activityC16315 != null) {
            activityC16315.m38461();
            if (!isResumed()) {
                activityC16315.m38453(this);
            }
        }
        boolean z = exc instanceof C4343;
        C4583 c4583 = this.f72507;
        if (z) {
            int iM13050 = ((C4343) exc).m13050() - 1;
            if (iM13050 >= 0) {
                c4583.m13481(Integer.valueOf(iM13050));
                return;
            }
            return;
        }
        if (exc instanceof C1580) {
            int iM38634 = ((C1580) exc).m5400().m38634();
            if (iM38634 == -1 || (i = iM38634 - 1) < 0) {
                return;
            }
            c4583.m13481(Integer.valueOf(i));
            return;
        }
        if (exc instanceof C14658) {
            C14658 c14658 = (C14658) exc;
            C19287.m44466(c14658.f44794, c14658.f44798).m44474(this.f72517);
        } else if (exc instanceof C3781) {
            ((C3781) exc).m11437(this.f72517);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50185(C22372 c22372, DialogInterface dialogInterface, int i) {
        C23077 c23077 = c22372.f72513;
        if (c23077.f74223 != i) {
            c23077.f74223 = i;
            c22372.f72517.m30456(true);
            c22372.m50215();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50166(C22372 c22372, int[] iArr, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (c22372.f72513.f74223 != iArr[0]) {
            if (!c22372.m5426()) {
                c22372.m50218(iArr[0], false, false);
                return;
            }
            C19258 c19258BuildDialog = ((ActivityC16315) c22372.requireActivity()).buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3616(c22372, iArr, 1));
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        if (r0.mo1601().m52329() != r10.f72494) goto L63;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m50229() {
        C15545 c15545 = this.f72504;
        if (c15545 != null && c15545.m36691()) {
            this.f72504.m36693();
            return true;
        }
        if (!m5410()) {
            if (mo5419()) {
                final ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
                int i = C7350.f22568[EnumC2288.m7536().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (m5426()) {
                            C19258 c19258BuildDialog = activityC16315.buildDialog();
                            c19258BuildDialog.m44436(m50239());
                            c19258BuildDialog.m44416(R.string.MT_Protector);
                            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ۠ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    ActivityC16315 activityC16316 = activityC16315;
                                    this.f20618.m50222(activityC16316, new RunnableC1000(0, activityC16316));
                                }
                            });
                            c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20883(1, activityC16315));
                            c19258BuildDialog.m44438();
                            return true;
                        }
                        if (activityC16315.m38452()) {
                            C21374.m48457(R.string.MT_Protector);
                            return true;
                        }
                        activityC16315.m38454(true);
                        return true;
                    }
                    if (i == 3) {
                        if (m5426()) {
                            m50146(activityC16315, true);
                            return true;
                        }
                        C19258 c19258BuildDialog2 = activityC16315.buildDialog();
                        c19258BuildDialog2.m44436(m50239());
                        c19258BuildDialog2.m44416(R.string.MT_Protector);
                        c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷۠ᩳ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                this.f67238.m50232();
                                activityC16315.m38449(false);
                            }
                        });
                        c19258BuildDialog2.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢ۠ᩳ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                activityC16315.m38454(false);
                            }
                        });
                        c19258BuildDialog2.m44438();
                        return true;
                    }
                    if (i == 4) {
                        if (m5426()) {
                            m50146(activityC16315, false);
                            return true;
                        }
                        C19258 c19258BuildDialog3 = activityC16315.buildDialog();
                        c19258BuildDialog3.m44436(m50239());
                        c19258BuildDialog3.m44416(R.string.MT_Protector);
                        c19258BuildDialog3.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9261(1, activityC16315));
                        c19258BuildDialog3.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8555(this, activityC16315, 1));
                        c19258BuildDialog3.m44438();
                        return true;
                    }
                } else if (m5426()) {
                    C19258 c19258BuildDialog4 = activityC16315.buildDialog();
                    c19258BuildDialog4.m44436(m50239());
                    c19258BuildDialog4.m44416(R.string.MT_Protector);
                    c19258BuildDialog4.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ۠ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C22372 c22372 = this.f44168;
                            ActivityC16315 activityC16316 = activityC16315;
                            c22372.m50222(activityC16316, new RunnableC22293(1, c22372, activityC16316));
                        }
                    });
                    c19258BuildDialog4.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻۠ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            this.f76469.m50232();
                            activityC16315.m38449(false);
                        }
                    });
                    c19258BuildDialog4.m44438();
                    return true;
                }
            } else if (m5426()) {
                if (!m50167() || !m50236(this.f72517.m30297())) {
                    C12392 c12392 = this.f72517;
                    if (c12392 != null) {
                        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
                        if (interfaceC7785M30436 instanceof C4342) {
                            C4342 c4342 = (C4342) interfaceC7785M30436;
                            if (c4342.mo1601().m52352().toString().equals(this.f72502)) {
                            }
                        }
                    }
                }
                ActivityC16315 activityC16316 = (ActivityC16315) requireActivity();
                C19258 c19258BuildDialog5 = activityC16316.buildDialog();
                c19258BuildDialog5.m44436(m50239());
                c19258BuildDialog5.m44416(R.string.MT_Protector);
                c19258BuildDialog5.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11543(1, this, activityC16316));
                c19258BuildDialog5.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15588(2, activityC16316));
                c19258BuildDialog5.m44438();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m50213() {
        C23077 c23077 = this.f72513;
        return c23077 != null && c23077.m51241();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m50192() {
        C23077 c23077 = this.f72513;
        return c23077 != null && c23077.m51240();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m50195() {
        C23077 c23077 = this.f72513;
        return c23077 != null && c23077.m51242();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean m50173() {
        C23077 c23077 = this.f72513;
        if (c23077 != null) {
            return c23077.m51241() || this.f72513.m51240() || this.f72513.m51242();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m50239() {
        String str = this.f72492;
        if (str != null) {
            return str;
        }
        String string = this.f5606.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        if (string != null) {
            this.f72492 = string;
            return string;
        }
        try {
            String strM18061 = C6554.m18061(80, m5420().f15019.getName());
            this.f72492 = strM18061;
            return strM18061;
        } catch (Exception unused) {
            return "Error";
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m50238() {
        if (!m5426()) {
            return m50239();
        }
        return "*" + m50239();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean m50167() {
        C13576 c13576;
        C11915 c11915 = this.f72506;
        return (c11915 == null || (c13576 = c11915.f35628) == null || c13576.m32656() <= 1) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50236(boolean z) {
        C13576 c13576;
        if (z) {
            return true;
        }
        C11915 c11915 = this.f72506;
        return (c11915 == null || (c13576 = c11915.f35628) == null || !c13576.m32652(c11915.f35631)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 m50138(final int i, Runnable runnable) {
        FutureC3575 futureC3575 = new FutureC3575();
        final C11915 c11915 = this.f72506;
        if (!m50167() || i < 0 || i >= c11915.f35628.m32656() || c11915.f35628.m32651() || this.f72511 != null || this.f72497 != null || this.f5607.m24142()) {
            futureC3575.m10914((Throwable) new IllegalStateException("Text page is unavailable"));
            return futureC3575;
        }
        if (i == c11915.f35631) {
            if (runnable != null) {
                runnable.run();
            }
            futureC3575.m10912((Object) null);
            return futureC3575;
        }
        final C12392 c12392 = this.f72517;
        final C13576 c13576 = c11915.f35628;
        final int i2 = this.f72515;
        try {
            FutureC3575 futureC3575M50203 = m50203(false);
            final C19656 c19656 = this.f72511;
            C11003.requireNonNull(c19656);
            futureC3575M50203.m10927(new InterfaceC21423() { // from class: l.ܰ֨ᩳ
                @Override // l.InterfaceC21423
                public final Object apply(Object obj) {
                    return C22372.m50141(this.f40293, c12392, c19656, c11915, c13576, i, i2);
                }
            }).m10909(new C7144(this, c12392, runnable)).m10910((InterfaceC8017) new C13011(this, futureC3575, c12392));
            return futureC3575;
        } catch (RuntimeException e) {
            futureC3575.m10914((Throwable) e);
            return futureC3575;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC3575 m50141(C22372 c22372, C12392 c12392, C19656 c19656, C11915 c11915, final C13576 c13576, final int i, final int i2) {
        if (!c22372.f72503 || c22372.f72517 != c12392) {
            throw new CancellationException("Page view was destroyed");
        }
        final C18950 c18950M45188 = c19656.m45188();
        final C6417 c6417 = c11915.f35622.f77236;
        return c22372.m50139(new C19677(c22372, new InterfaceC18971() { // from class: l.ۚ۠ᩳ
            @Override // l.InterfaceC18971
            /* JADX INFO: renamed from: ֫ */
            public final C11915 mo5717(InterfaceC17066 interfaceC17066) throws Throwable {
                C18950 c18950 = c18950M45188;
                C13576 c13576M32640 = C13576.m32640(c13576.f40498);
                int i3 = i;
                C6417 c6418 = c6417;
                int i4 = i2;
                C11915 c11915M32647 = c13576M32640.m32647(i3, c6418, i4, interfaceC17066, true);
                try {
                    c11915M32647.m29075(c18950.m43738(), c18950.m43737(), c18950.m43736(), c6418, i4);
                    return c11915M32647;
                } catch (IOException | Error | RuntimeException e) {
                    c11915M32647.m29068().m10930();
                    throw e;
                }
            }
        }, i2), c6417.f19852, c13576.f40498);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50159(C22372 c22372, C12392 c12392, Runnable runnable) {
        if (!c22372.f72503 || c22372.f72517 != c12392) {
            throw new CancellationException("Page view was destroyed");
        }
        c22372.m50196(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50155(C22372 c22372, FutureC3575 futureC3575, C12392 c12392, Throwable th) {
        if (th == null) {
            futureC3575.m10912((Object) null);
            return;
        }
        if (c22372.f72503 && c22372.f72517 == c12392) {
            if (c22372.f72506 == null) {
                c22372.m5421(true);
            }
            c22372.f5603.m46502(th);
        }
        futureC3575.m10914(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m50198() {
        StringBuilder sb = new StringBuilder();
        if (m5426()) {
            sb.append("*");
        }
        if (m50167()) {
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(this.f72506.f35631 + 1);
            sb.append("/");
            sb.append(this.f72506.f35628.m32656());
            sb.append(") ");
        }
        sb.append(m50239());
        this.f5607.m24105(sb.toString());
        this.f5607.m24104(m5426() ? C21943.f70260 : C21943.f70287);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public void m50215() {
        StringBuilder sb = new StringBuilder();
        C12392 c12392 = this.f72517;
        if (c12392 != null) {
            int iM30444 = c12392.m30444();
            int iM30448 = c12392.m30448();
            Point pointM30472 = c12392.m30472(iM30444);
            sb.append(pointM30472.x);
            sb.append(':');
            sb.append(pointM30472.y);
            if (iM30444 != iM30448) {
                sb.append(" (");
                sb.append(Math.abs(iM30448 - iM30444));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
        }
        if (this.f72513 != null) {
            if (sb.length() > 0) {
                sb.append("   ");
            }
            if (this.f72513.m51241()) {
                sb.append("AXML");
            } else if (this.f72513.m51240()) {
                sb.append("ABX");
            } else {
                sb.append(C14776.m35153(this.f72513.f74223));
            }
        }
        if (sb.length() == 0) {
            this.f5607.m24124("...");
        } else {
            this.f5607.m24124(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50143(View view) {
        final int i;
        String strM35153;
        int i2 = 0;
        if (m50167() && view.getId() == R.id.MT_Protector) {
            int iM32656 = this.f72506.f35628.m32656();
            CharSequence[] charSequenceArr = new CharSequence[iM32656];
            while (i2 < iM32656) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = String.valueOf(i3);
                i2 = i3;
            }
            C19258 c19258BuildDialog = ((ActivityC16315) requireActivity()).buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44429(charSequenceArr, this.f72506.f35631, new DialogInterface.OnClickListener() { // from class: l.᩹֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    C22372.m50151(this.f70352, dialogInterface, i4);
                }
            });
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44438();
            return;
        }
        C4733 c4733M5420 = m5420();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        int i4 = 1;
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c4733M5420.f15019.mo23554()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        if (m50213()) {
            i = C14776.f45134;
            strM35153 = "AXML";
        } else if (m50192()) {
            i = C14776.f45134;
            strM35153 = "ABX";
        } else if (m50195()) {
            i = C14776.f45134;
            strM35153 = "Class";
        } else {
            C23077 c23077 = this.f72513;
            i = c23077 == null ? -1 : c23077.f74223;
            strM35153 = i == -1 ? "?" : C14776.m35153(i);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) strM35153).append((CharSequence) "\n");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector));
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) "\n");
        String[] strArr = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
        String strM30531 = this.f72517.m30531();
        strM30531.getClass();
        if (strM30531.equals("\r")) {
            i2 = 1;
        } else if (!strM30531.equals("\r\n")) {
            i2 = 2;
        }
        spannableStringBuilderAppend.append((CharSequence) strArr[i2]);
        C19258 c19258BuildDialog2 = ((ActivityC16315) requireActivity()).buildDialog();
        c19258BuildDialog2.m44436(m50239());
        c19258BuildDialog2.m44424(spannableStringBuilder);
        c19258BuildDialog2.m44442(R.string.MT_Protector, null);
        c19258BuildDialog2.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶֨ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C22372.m50184(this.f64108, i);
            }
        });
        c19258BuildDialog2.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18322(i4, this));
        ((TextView) c19258BuildDialog2.m44438().m1433(android.R.id.message)).setTextIsSelectable(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50151(C22372 c22372, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        c22372.m50138(i, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50184(C22372 c22372, int i) {
        if (i != -1) {
            c22372.m50180(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50223(ActivityC16315 activityC16315, DialogInterfaceC19598 dialogInterfaceC19598) {
        C13699 c13699 = new C13699(this, activityC16315, activityC16315, dialogInterfaceC19598);
        c13699.m31258(R.string.MT_Protector);
        c13699.m31268(40);
        String string = this.f5606.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        c13699.m31250((CharSequence) string);
        c13699.m31281();
        c13699.m31266(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50220(ActivityC16315 activityC16315) {
        if (m5426()) {
            if (m5410() && this.f72499 == null) {
                activityC16315.m38453(this);
            }
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC16315);
            c19258.m44436(m50239());
            c19258.m44416(R.string.MT_Protector);
            int i2 = 1;
            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14904(this, activityC16315, i2));
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21256(this, activityC16315, i2));
            c19258.m44438();
            return;
        }
        activityC16315.m38448(this);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12534 m50216() {
        C12534 c12534 = this.f72513.f74221;
        C11003.requireNonNull(c12534);
        return c12534;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Map m50234() {
        Map map = this.f72513.f74225;
        C11003.requireNonNull(map);
        return map;
    }

    @Override // l.ComponentCallbacksC9205, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5607.m24143(getResources().getBoolean(R.bool.MT_Protector));
    }
}
