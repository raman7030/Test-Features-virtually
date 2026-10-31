package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.DecimalFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10227 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۜܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f30721 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30722 = 0;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30723;

    /* JADX INFO: renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30724;

    /* JADX INFO: renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30725;

    /* JADX INFO: renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30727;

    /* JADX INFO: renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30728;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public int f30729;

    /* JADX INFO: renamed from: ֫ܿ, reason: not valid java name and contains not printable characters */
    public View f30730;

    /* JADX INFO: renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public C10809 f30731;

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public int f30733;

    /* JADX INFO: renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public View f30734;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public ImageView f30735;

    /* JADX INFO: renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public String f30736;

    /* JADX INFO: renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30737;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public String f30738;

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public C13547 f30739;

    /* JADX INFO: renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public View f30740;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public View f30741;

    /* JADX INFO: renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public FrameLayout f30742;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public C16431 f30744;

    /* JADX INFO: renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public boolean f30745;

    /* JADX INFO: renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public View f30746;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f30747;

    /* JADX INFO: renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public long f30748;

    /* JADX INFO: renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30749;

    /* JADX INFO: renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public View f30752;

    /* JADX INFO: renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public Future f30754;

    /* JADX INFO: renamed from: ۟ᩳ, reason: not valid java name and contains not printable characters */
    public C0289 f30755;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public C5157 f30756;

    /* JADX INFO: renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30757;

    /* JADX INFO: renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public View f30758;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f30759;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public ImageView f30760;

    /* JADX INFO: renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30761;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public TextView f30762;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public boolean f30763;

    /* JADX INFO: renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f30764;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public TextView f30765;

    /* JADX INFO: renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public View f30766;

    /* JADX INFO: renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    public int f30767;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public C19130 f30768;

    /* JADX INFO: renamed from: ۧܿ, reason: not valid java name and contains not printable characters */
    public TextView f30769;

    /* JADX INFO: renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30770;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public C4437 f30771;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public ProgressBar f30774;

    /* JADX INFO: renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC9603 f30775;

    /* JADX INFO: renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    public ViewGroup f30776;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public GestureDetectorOnGestureListenerC8816 f30777;

    /* JADX INFO: renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public C23713 f30778;

    /* JADX INFO: renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public TextView[] f30779;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public boolean f30780;

    /* JADX INFO: renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public boolean f30781;

    /* JADX INFO: renamed from: ܰᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30782;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public volatile int f30783;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public int f30784;

    /* JADX INFO: renamed from: ܳܿ, reason: not valid java name and contains not printable characters */
    public boolean f30785;

    /* JADX INFO: renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC4162 f30786;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public View f30787;

    /* JADX INFO: renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public boolean f30788;

    /* JADX INFO: renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public float f30789;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public View f30790;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public C22720 f30791;

    /* JADX INFO: renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30792;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public C14895 f30793;

    /* JADX INFO: renamed from: ܽܿ, reason: not valid java name and contains not printable characters */
    public View f30794;

    /* JADX INFO: renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public View f30795;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C3877 f30796;

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public Future f30797;

    /* JADX INFO: renamed from: ܿܿ, reason: not valid java name and contains not printable characters */
    public String f30798;

    /* JADX INFO: renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30799;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public volatile C15600 f30800;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public C15807 f30801;

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public long f30805;

    /* JADX INFO: renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public View f30806;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public String f30807;

    /* JADX INFO: renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public ProgressBar f30809;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30810;

    /* JADX INFO: renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public ImageView f30811;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public View f30814;

    /* JADX INFO: renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public View f30815;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public View f30816;

    /* JADX INFO: renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30817;

    /* JADX INFO: renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f30818;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public ViewGroup f30819;

    /* JADX INFO: renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public View f30820;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f30822;

    /* JADX INFO: renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30823;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public String f30825;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public C0991 f30826;

    /* JADX INFO: renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public C18635 f30827;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public final C15870 f30753 = new C15870();

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public C6404 f30808 = C6404.f19812;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30726 = false;

    /* JADX INFO: renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30803 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30802 = new ArrayList();

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public EnumC20811 f30732 = EnumC20811.NONE;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public List f30804 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final C19400 f30750 = new C19400();

    /* JADX INFO: renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public EnumC18694 f30772 = EnumC18694.NONE;

    /* JADX INFO: renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public final C19400 f30824 = new C19400();

    /* JADX INFO: renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public final C19400 f30773 = new C19400();

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final C19400 f30813 = new C19400();

    /* JADX INFO: renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public final C10516 f30821 = new C10516(new Runnable() { // from class: l.ܺ۬ۜ
        @Override // java.lang.Runnable
        public final void run() {
            this.f49241.m25848();
        }
    });

    /* JADX INFO: renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public final Runnable f30743 = new RunnableC13109(this);

    /* JADX INFO: renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    public final C2547 f30812 = new InterfaceC12632() { // from class: l.ۖ۬ۜ
        @Override // l.InterfaceC12632
        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void mo8063() {
            ActivityC10227.m25700(this.f8074);
        }
    };

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final RunnableC18836 f30751 = new RunnableC18836(1, this);

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ۘ */
    public final int mo7027() {
        return 2;
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "VideoPlayerActivity";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25700(ActivityC10227 activityC10227) {
        activityC10227.m25833();
        activityC10227.m25749();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25810(ActivityC10227 activityC10227) {
        if (activityC10227.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
            activityC10227.m25692(-9223372036854775807L, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25695(final AbstractActivityC3346 abstractActivityC3346, Intent intent, AbstractC13921 abstractC13921, final InterfaceC17889 interfaceC17889) {
        if (!m25817() || abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed() || !(abstractC13921 instanceof C2499)) {
            return;
        }
        Future futureSubmit = C1802.f6208.submit(new Callable() { // from class: l.ۢ۫ۜ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ActivityC10227.f30722;
                return Integer.valueOf(C19193.m44270(abstractActivityC3346, interfaceC17889.mo24433()));
            }
        });
        try {
            int iIntValue = ((Integer) futureSubmit.get(150L, TimeUnit.MILLISECONDS)).intValue();
            if (iIntValue == 0 || iIntValue == 1) {
                intent.putExtra("bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION", iIntValue);
            }
        } catch (InterruptedException unused) {
            futureSubmit.cancel(true);
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
            futureSubmit.cancel(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x04a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v48, types: [l.᩹۫ۜ] */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C2608 c2608;
        C10062 c10062;
        C2608 c2609;
        int iMax;
        int iM8232;
        C12404 c12404;
        InterfaceC15097 c16410;
        final InterfaceC15097 c9377;
        C23362 c23362;
        final InterfaceC15097 interfaceC15097;
        EnumC10788 enumC10788;
        Intent intent;
        int intExtra;
        int i = 0;
        this.f10581 = false;
        setTheme(C18080.m42142());
        super.onCreate(bundle);
        int i2 = 1;
        if (m25817() && (intent = getIntent()) != null && ((intExtra = intent.getIntExtra("bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION", -1)) == 0 || intExtra == 1)) {
            this.f30772 = EnumC18694.AUTO;
            if (getRequestedOrientation() != intExtra) {
                setRequestedOrientation(intExtra);
            }
        }
        m10241(R.layout.MT_Protector);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C4643 c4643 = new C4643(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c4643);
        m25847(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC10893(4, this));
        this.f30742 = (FrameLayout) m10241(R.id.MT_Protector);
        this.f30827 = (C18635) m10241(R.id.MT_Protector);
        this.f30769 = (TextView) m10241(R.id.MT_Protector);
        this.f30761 = (TextView) m25847(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        viewFindViewById.setBackground(new C22533(0));
        this.f30740 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        viewFindViewById2.setBackground(new C22533(0));
        this.f30811 = (ImageView) viewFindViewById2;
        this.f30820 = m10241(R.id.MT_Protector);
        this.f30814 = m10241(R.id.MT_Protector);
        this.f30760 = (ImageView) m10241(R.id.MT_Protector);
        this.f30790 = m10241(R.id.MT_Protector);
        this.f30794 = m10241(R.id.MT_Protector);
        this.f30806 = m10241(R.id.MT_Protector);
        this.f30809 = (ProgressBar) m10241(R.id.MT_Protector);
        this.f30725 = (TextView) m10241(R.id.MT_Protector);
        this.f30741 = m10241(R.id.MT_Protector);
        this.f30774 = (ProgressBar) m10241(R.id.MT_Protector);
        this.f30765 = (TextView) m10241(R.id.MT_Protector);
        this.f30735 = (ImageView) m10241(R.id.MT_Protector);
        this.f30819 = (ViewGroup) m10241(R.id.MT_Protector);
        this.f30740.setOnClickListener(new ViewOnClickListenerC13129(0, this));
        this.f30811.setOnClickListener(new ViewOnClickListenerC16637(0, this));
        this.f30752 = m10241(R.id.MT_Protector);
        this.f30787 = m10241(R.id.MT_Protector);
        this.f30795 = m25847(R.id.MT_Protector);
        this.f30734 = m25847(R.id.MT_Protector);
        this.f30816 = m25847(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f30730 = viewFindViewById3;
        if (viewFindViewById3 instanceof InterfaceC8051) {
            ((InterfaceC8051) viewFindViewById3).mo19495(new C7465(this));
        }
        this.f30815 = m25847(R.id.MT_Protector);
        this.f30766 = m25847(R.id.MT_Protector);
        this.f30815.setOnClickListener(new ViewOnClickListenerC17424(this, i2));
        this.f30766.setOnClickListener(new ViewOnClickListenerC15225(i, this));
        m25847(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۚ۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10227.m25764(this.f16714);
            }
        });
        this.f30761.setOnClickListener(new ViewOnClickListenerC2825(2, this));
        View viewM10241 = m10241(R.id.MT_Protector);
        this.f30758 = viewM10241;
        this.f30746 = viewM10241.findViewById(R.id.MT_Protector);
        this.f30758.setOnClickListener(new ViewOnClickListenerC20186(0, this));
        C9876.m24969(this.f30794);
        C9876.m24969(this.f30790);
        C9876.m24969(this.f30746);
        C21165.m48104(this.f30819);
        C21165.m48104(this.f30811);
        C21165.m48104(this.f30740);
        C2978 c2978 = (C2978) this.f30746.findViewById(R.id.switch4);
        final C2978 c2979 = (C2978) this.f30746.findViewById(R.id.switch5);
        C2978 c29710 = (C2978) this.f30746.findViewById(R.id.switch7);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("vpffs", false));
        c2979.setChecked(ApplicationC20075.f65008.getBoolean("vpsm", false));
        c29710.setChecked(m25817());
        c2978.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۙ۬ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC10227.m25713(this.f14827, c2979, z);
            }
        });
        c2979.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ۬ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC10227.m25798(this.f10219, z);
            }
        });
        if (c2978.isChecked()) {
            c2979.setEnabled(true);
        }
        m25774();
        c29710.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۫۬ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC10227.m25721(this.f37411, z);
            }
        });
        C2978 c29711 = (C2978) this.f30746.findViewById(R.id.switch1);
        c29711.setChecked(ApplicationC20075.f65008.getBoolean("vplp", false));
        c29711.setOnCheckedChangeListener(new C10308());
        C2978 c29712 = (C2978) this.f30746.findViewById(R.id.switch6);
        c29712.setChecked(ApplicationC20075.f65008.getBoolean("vpsp", false));
        c29712.setOnCheckedChangeListener(new C6074());
        C2978 c29713 = (C2978) this.f30746.findViewById(R.id.switch2);
        c29713.setChecked(ApplicationC20075.f65008.getBoolean("vpapn", false));
        c29713.setOnCheckedChangeListener(new C11719());
        TextView textView = (TextView) this.f30746.findViewById(R.id.MT_Protector);
        this.f30762 = textView;
        textView.setText(R.string.MT_Protector);
        TextView textView2 = (TextView) this.f30746.findViewById(R.id.MT_Protector);
        this.f30782 = textView2;
        textView2.setText(R.string.MT_Protector);
        this.f30737 = (TextView) this.f30746.findViewById(R.id.MT_Protector);
        m25833();
        this.f30746.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩺۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10227.m25806(this.f74080, view);
            }
        });
        this.f30746.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֨۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10227.m25811(this.f4109, view);
            }
        });
        this.f30746.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۠۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10227.m25766(this.f25193, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            m25802();
            C2978 c29714 = (C2978) this.f30746.findViewById(R.id.switch3);
            c29714.setChecked(ApplicationC20075.f65008.getBoolean("vpun", true));
            c29714.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܶ۬ۜ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ActivityC10227.m25770(this.f46793, z);
                }
            });
            if (ApplicationC20075.f65008.getBoolean("ins", false)) {
                c29714.setVisibility(0);
            }
            C17648.m41310(getWindow().getDecorView(), new C21597(this, c29714));
        }
        float[] fArr = {0.5f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f};
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        this.f30779 = new TextView[6];
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        for (int i3 = 0; i3 < 6; i3++) {
            TextView[] textViewArr = this.f30779;
            TextView textView3 = (TextView) this.f30746.findViewById(iArr[i3]);
            textViewArr[i3] = textView3;
            textView3.setBackground(new C22533());
            textView3.setText(decimalFormat.format(fArr[i3]));
            textView3.setTag(Float.valueOf(fArr[i3]));
            textView3.setOnClickListener(new ViewOnClickListenerC22302(i, this));
        }
        String stringExtra = getIntent().getStringExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN");
        this.f30798 = stringExtra;
        InterfaceC15097 c9315 = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            String str = this.f30798;
            C10062 c10063 = str == null ? null : (C10062) C2956.m9013("VideoPlayerUrlArguments:".concat(str));
            if (c10063 == null) {
                C21374.m48463(R.string.MT_Protector);
                finish();
                return;
            } else {
                this.f30785 = true;
                this.f30780 = c10063.m25253();
                c10062 = c10063;
                c2608 = null;
            }
        } else {
            C2608 c26010 = (C2608) C2956.m9013("VideoPlayerArguments");
            if (c26010 == null) {
                c26010 = C2608.m8231(this, "video/");
            }
            if (c26010 == null || c26010.m8233().isEmpty()) {
                c26010 = null;
            } else {
                int iM8233 = c26010.m8232();
                if (iM8233 < 0 || iM8233 >= c26010.m8233().size()) {
                    iM8233 = 0;
                }
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) c26010.m8233().get(iM8233);
                if (!C10062.m25249(interfaceC17889.getName())) {
                    List listM8233 = c26010.m8233();
                    ArrayList arrayList = new ArrayList(listM8233.size());
                    boolean z = false;
                    int size = 0;
                    for (int i4 = 0; i4 < listM8233.size(); i4++) {
                        InterfaceC17889 interfaceC178810 = (InterfaceC17889) listM8233.get(i4);
                        if (C10062.m25249(interfaceC178810.getName())) {
                            z = true;
                        } else {
                            if (i4 == iM8233) {
                                size = arrayList.size();
                            }
                            arrayList.add(interfaceC178810);
                        }
                    }
                    if (z) {
                        c2609 = new C2608(c26010.m8234(), arrayList, size);
                    } else if (iM8233 != c26010.m8232()) {
                        c26010 = new C2608(c26010.m8234(), listM8233, iM8233);
                    }
                } else if ((c26010.m8234() instanceof C2499) || (c26010.m8234() instanceof AbstractC3163)) {
                    c2609 = new C2608(c26010.m8234(), Collections.singletonList(interfaceC17889), 0);
                } else {
                    c26010 = null;
                }
                c26010 = c2609;
            }
            if (c26010 == null) {
                C21374.m48463(R.string.MT_Protector);
                finish();
                return;
            } else {
                c2608 = c26010;
                c10062 = null;
            }
        }
        C20988.m47796(this);
        this.f30827.m43228();
        ViewGroup viewGroup = this.f30742;
        View viewM43229 = this.f30827.m43229();
        if (viewM43229 != null) {
            ViewParent parent = viewM43229.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
                iMax = Math.max(0, viewGroup.indexOfChild(viewM43229));
            } else {
                iMax = 1;
            }
            viewM43229.setVisibility(8);
        } else {
            iMax = 1;
        }
        C0289 c0289 = new C0289(this, null);
        c0289.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c0289.setClickable(false);
        c0289.setFocusable(false);
        viewGroup.addView(c0289, iMax);
        this.f30755 = c0289;
        this.f30776 = viewGroup;
        this.f30767 = iMax;
        m25825(this.f30827.m43226());
        C0289 c02810 = this.f30755;
        if (c02810 != null) {
            c02810.m1634();
            c02810.m1637(new C22785(-855310, 0, 0, 1, -1342177280, null));
            c02810.m1635(0.04f);
            c02810.m1638();
        }
        this.f30777 = new GestureDetectorOnGestureListenerC8816(this);
        final GestureDetector gestureDetector = new GestureDetector(this, this.f30777);
        this.f30827.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩸۫ۜ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ActivityC10227.m25706(this.f69306, gestureDetector, motionEvent);
                return true;
            }
        });
        if (c10062 != null) {
            this.f30775 = new C5828(c10062, getString(R.string.MT_Protector));
            c12404 = null;
        } else {
            if (bundle == null || (iM8232 = bundle.getInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", c2608.m8232())) < 0 || iM8232 >= c2608.m8233().size()) {
                iM8232 = c2608.m8232();
            }
            c12404 = new C12404(iM8232, c2608.m8233());
            this.f30775 = c12404;
            this.f30780 = C10062.m25249(c12404.mo16334().getName());
        }
        if (this.f30780 && bundle != null) {
            Bundle bundle2 = bundle.getBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION");
            this.f30731 = (bundle2 == null || bundle2.getInt("schema", 0) != 1 || bundle2.getInt("matching_ordinal", -1) < 0) ? null : new C10809(bundle2.getInt("width", -1), bundle2.getInt("height", -1), bundle2.getInt("average_bitrate", -1), bundle2.getInt("peak_bitrate", -1), bundle2.getFloat("frame_rate", -1.0f), bundle2.getString("codecs"), bundle2.getString("sample_mime_type"), bundle2.getInt("matching_ordinal"));
        }
        if (this.f30775.size() <= 1) {
            this.f30766.setEnabled(false);
            this.f30815.setEnabled(false);
            this.f30766.setAlpha(0.33f);
            this.f30815.setAlpha(0.33f);
        }
        this.f30778 = C20892.m47730(this);
        this.f30826 = new C0991();
        if (c12404 != null) {
            if (this.f30780) {
                enumC10788 = EnumC10788.HLS_DIRECT;
            } else {
                enumC10788 = EnumC10788.NORMAL;
            }
            C16431 c16431 = new C16431(this, c2608.m8234(), c12404, enumC10788, this.f30778);
            this.f30744 = c16431;
            if (this.f30780 || !(c2608.m8234() instanceof AbstractC3163)) {
                c9315 = c16431;
            } else {
                C23713 c23713 = this.f30778;
                final C16431 c16432 = this.f30744;
                C11003.requireNonNull(c16432);
                c9315 = new C9315(c23713, (C22282) new InterfaceC15097() { // from class: l.᩹۫ۜ
                    @Override // l.InterfaceC15097
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC21449 mo6247() {
                        C16431 c16433 = c16432;
                        c16433.getClass();
                        return new C2881(c16433);
                    }
                }, (InterfaceC15097) this.f30744, new C3591(this, c23713));
            }
            this.f30744.m38735(new InterfaceC5982() { // from class: l.᩶۫ۜ
                @Override // java.util.function.IntConsumer
                public final void accept(int i5) {
                    ActivityC10227.m25701(this.f65284, i5);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final /* bridge */ /* synthetic */ void n(Object obj) {
                    mo16796((Integer) obj);
                }

                @Override // l.InterfaceC5982
                /* JADX INFO: renamed from: ܽ */
                public final /* synthetic */ void mo16796(Integer num) {
                    C10216.m25642((InterfaceC5982) this, num);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C10216.m25641((InterfaceC5982) this, intConsumer);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
        if (c10062 == null) {
            c16410 = new C10160();
        } else {
            c16410 = new C16410(c10062.m25254(), c10062.m25256());
        }
        this.f30764 = c16410;
        C18487 c18487 = new C18487(c9315, c16410, this.f30778);
        C7752 c7752 = new C7752(this);
        c7752.m20779();
        C19008 c19008 = new C19008();
        c19008.m43849();
        C16431 c16433 = this.f30744;
        InterfaceC20419 c15081 = c19008;
        if (c16433 != null) {
            c15081 = new C15081(c19008, c16433);
        }
        C22682 c22682 = new C22682(c18487, c15081);
        c22682.m50669(new C18069());
        if (this.f30780) {
            this.f30768 = new C19130(new RunnableC20699(5, this));
            C23713 c23714 = this.f30778;
            if (c23714 == null) {
                throw new IllegalStateException("Media cache session is missing");
            }
            final InterfaceC15097 interfaceC15098 = this.f30744;
            if (interfaceC15098 != null && c2608 != null) {
                if (c2608.m8234() instanceof AbstractC3163) {
                    c23362 = new C23362(c23714, interfaceC15098, new C22638(this, c23714), C20892.m47732(), EnumC16306.f50166, new C9915(), null);
                    final C16431 c16434 = this.f30744;
                    C11003.requireNonNull(c16434);
                    c9377 = new C9315(c23714, new InterfaceC15097() { // from class: l.᩹۫ۜ
                        @Override // l.InterfaceC15097
                        /* JADX INFO: renamed from: ֫ */
                        public final InterfaceC21449 mo6247() {
                            C16431 c16435 = c16434;
                            c16435.getClass();
                            return new C2881(c16435);
                        }
                    }, this.f30744, new C13834(this, c23714));
                } else {
                    c9377 = interfaceC15098;
                    interfaceC15097 = c9377;
                }
                InterfaceC21553 interfaceC21553 = new InterfaceC21553() { // from class: l.֫۫ۜ
                    @Override // l.InterfaceC21553
                    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final InterfaceC21449 mo6042(int i5) {
                        return ActivityC10227.m25690(this.f6246, interfaceC15098, c9377, interfaceC15097, i5);
                    }
                };
                this.f30747 = interfaceC15097;
                this.f30822 = c9377;
                C10264 c10264 = new C10264(interfaceC21553);
                c10264.m25997(new C12883(this.f30768, this.f30793));
                c10264.m25998((InterfaceC11058) new C18069());
                c22682.m50668(c10264);
            } else {
                interfaceC15098 = this.f30764;
                C11003.requireNonNull(interfaceC15098);
                C14895 c14895 = new C14895();
                this.f30793 = c14895;
                C23362 c23363 = new C23362(c23714, interfaceC15098, new InterfaceC23425() { // from class: l.᩺ۚۜ
                    @Override // l.InterfaceC23425
                    /* JADX INFO: renamed from: ֫ */
                    public final String mo10986(C3104 c3104) {
                        return C20892.m47724(c3104.f9711, interfaceC15098);
                    }
                }, C20892.m47732(), EnumC16306.f50168, new C9915(), c14895);
                c9377 = new C9377(c14895, new C9315(c23714, interfaceC15098, new InterfaceC23425() { // from class: l.۟۬ۜ
                    @Override // l.InterfaceC23425
                    /* JADX INFO: renamed from: ֫ */
                    public final String mo10986(C3104 c3104) {
                        int i5 = ActivityC10227.f30722;
                        return C20892.m47724(c3104.f9711, interfaceC15098);
                    }
                }), interfaceC15098);
                c23362 = c23363;
            }
            C23362 c23364 = c23362;
            interfaceC15097 = interfaceC15098;
            interfaceC15098 = c23364;
            InterfaceC21553 interfaceC21554 = new InterfaceC21553() { // from class: l.֫۫ۜ
                @Override // l.InterfaceC21553
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final InterfaceC21449 mo6042(int i5) {
                    return ActivityC10227.m25690(this.f6246, interfaceC15098, c9377, interfaceC15097, i5);
                }
            };
            this.f30747 = interfaceC15097;
            this.f30822 = c9377;
            C10264 c10265 = new C10264(interfaceC21554);
            c10265.m25997(new C12883(this.f30768, this.f30793));
            c10265.m25998((InterfaceC11058) new C18069());
            c22682.m50668(c10265);
        }
        C16155 c16155 = new C16155(this, c7752, c22682);
        c16155.m38084();
        c16155.m38085();
        InterfaceC4162 interfaceC4162M38081 = c16155.m38081();
        this.f30786 = interfaceC4162M38081;
        this.f30827.m43224(interfaceC4162M38081);
        this.f30795.setOnClickListener(new View.OnClickListener() { // from class: l.֡۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10227.m25789(this.f1908);
            }
        });
        this.f30786.mo4562(0);
        this.f30786.mo4587(new C13814(this));
        this.f30823 = true;
        C18635 c18635 = this.f30827;
        if (c18635 == null) {
            return;
        }
        RunnableC18836 runnableC18836 = this.f30751;
        c18635.removeCallbacks(runnableC18836);
        this.f30827.post(runnableC18836);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25706(ActivityC10227 activityC10227, GestureDetector gestureDetector, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = activityC10227.f30777;
            int i = gestureDetectorOnGestureListenerC8816.f26873;
            gestureDetectorOnGestureListenerC8816.f26873 = -1;
            gestureDetectorOnGestureListenerC8816.f26877 = false;
            ActivityC10227 activityC10228 = gestureDetectorOnGestureListenerC8816.f26874;
            boolean z = activityC10228.f30726;
            if (!z && !activityC10228.f30745 && i == 0) {
                m25756(activityC10228);
                ((AbstractC14702) activityC10228.f30786).seekTo(gestureDetectorOnGestureListenerC8816.f26876);
                activityC10228.m25734();
            } else if (!z && activityC10228.f30741.getVisibility() != 8) {
                activityC10228.f30741.setVisibility(8);
            }
            gestureDetectorOnGestureListenerC8816.m22785();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25701(ActivityC10227 activityC10227, int i) {
        if (i == -2) {
            activityC10227.f30741.setVisibility(8);
            activityC10227.f30726 = false;
        } else {
            if (i == -1) {
                activityC10227.f30726 = true;
                activityC10227.f30741.setVisibility(0);
                activityC10227.f30765.setVisibility(0);
                activityC10227.f30735.setVisibility(8);
                activityC10227.f30765.setText(R.string.MT_Protector);
                return;
            }
            activityC10227.f30774.setProgress(i * 10);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25789(ActivityC10227 activityC10227) {
        activityC10227.m25845();
        activityC10227.f30827.m43232();
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static void m25824(final ActivityC10227 activityC10227) {
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 != null) {
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1318;
            if (abstractC14702.m34999()) {
                if (activityC10227.f30785 && activityC10227.f30780) {
                    boolean z = activityC10227.f30745;
                    activityC10227.f30745 = true;
                    boolean zM35000 = abstractC14702.m35000();
                    activityC10227.f30727 = zM35000;
                    if (zM35000) {
                        activityC10227.f30757 = false;
                    } else if (interfaceC1318.mo4603() == 4) {
                        activityC10227.f30757 = true;
                    }
                    activityC10227.m25843(true);
                    if (!z) {
                        String str = activityC10227.f30825;
                        if (!TextUtils.isEmpty(str)) {
                            C22926.m51017(str);
                        }
                        activityC10227.m25820();
                        abstractC14702.mo4581();
                    }
                    activityC10227.m25787();
                    return;
                }
                if (activityC10227.f30788 || activityC10227.isFinishing() || activityC10227.isDestroyed()) {
                    return;
                }
                activityC10227.f30788 = true;
                String str2 = activityC10227.f30825;
                if (!TextUtils.isEmpty(str2)) {
                    C22926.m51017(str2);
                }
                activityC10227.f30825 = null;
                C10062.m25251(activityC10227.f30798);
                activityC10227.f30798 = null;
                InterfaceC4162 interfaceC4162 = activityC10227.f30786;
                if (interfaceC4162 != null) {
                    interfaceC4162.stop();
                    ((AbstractC14702) activityC10227.f30786).mo4573();
                }
                C19258 c19258BuildDialog = activityC10227.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡۫ۜ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = ActivityC10227.f30722;
                        this.f1863.finish();
                    }
                });
                c19258BuildDialog.m44428(false);
                c19258BuildDialog.m44438();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25843(boolean z) {
        View view = this.f30730;
        if (view != null) {
            boolean z2 = !z;
            view.setEnabled(z2);
            this.f30730.setVisibility(z ? 8 : 0);
            this.f30730.setFocusable(z2);
            this.f30730.setImportantForAccessibility(z ? 4 : 0);
        }
        View view2 = this.f30752;
        if (view2 != null) {
            view2.setVisibility(z ? 8 : 0);
        }
        View view3 = this.f30787;
        if (view3 != null) {
            view3.setVisibility(z ? 8 : 0);
        }
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            boolean z3 = !z;
            c18635.m43227(z3);
            this.f30827.m43225(z3);
        }
        View view4 = this.f30734;
        if (view4 != null) {
            view4.setVisibility(z ? 8 : 0);
        }
        View view5 = this.f30816;
        if (view5 != null) {
            view5.setVisibility(z ? 8 : 0);
        }
        View view6 = this.f30815;
        if (view6 != null) {
            view6.setVisibility(z ? 8 : 0);
        }
        View view7 = this.f30766;
        if (view7 != null) {
            view7.setVisibility(z ? 8 : 0);
        }
        if (z) {
            View view8 = this.f30806;
            if (view8 != null) {
                view8.setVisibility(8);
                this.f30806.setTranslationX(0.0f);
                this.f30806.setTranslationY(0.0f);
            }
            m25734();
            GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = this.f30777;
            if (gestureDetectorOnGestureListenerC8816 != null) {
                ActivityC10227 activityC10227 = gestureDetectorOnGestureListenerC8816.f26874;
                if (gestureDetectorOnGestureListenerC8816.f26873 == 0) {
                    gestureDetectorOnGestureListenerC8816.f26873 = -2;
                }
                m25756(activityC10227);
                activityC10227.m25734();
                this.f30777.m22785();
            }
        }
        m25787();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public void m25787() {
        View view = this.f30795;
        if (view == null) {
            return;
        }
        boolean z = this.f30757;
        view.setEnabled(!z);
        this.f30795.setAlpha(!z ? 1.0f : 0.33f);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25845() {
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 == null) {
            return;
        }
        if (this.f30745) {
            if (this.f30757) {
                return;
            }
            if (!C3603.m11031(interfaceC1318, true)) {
                ((AbstractC14702) interfaceC1318).mo4570(false);
                return;
            }
            if (!this.f30727) {
                C3603.m11030(interfaceC1318);
                return;
            }
            InterfaceC1318 interfaceC1319 = this.f30786;
            if (interfaceC1319 == null || this.f30757) {
                return;
            }
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1319;
            abstractC14702.mo4581();
            if (interfaceC1319.mo4603() == 1) {
                interfaceC1319.mo4584();
            }
            abstractC14702.mo4570(true);
            return;
        }
        if (!C3603.m11031(interfaceC1318, true)) {
            AbstractC14702 abstractC14703 = (AbstractC14702) interfaceC1318;
            if (abstractC14703.mo4589(1)) {
                abstractC14703.pause();
                return;
            }
            return;
        }
        C3603.m11030(interfaceC1318);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25725(ActivityC10227 activityC10227, C16134 c16134) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == null || !activityC10227.f30745 || !activityC10227.f30727 || c16134.f49707 != 1002 || activityC10227.f30759) {
            return false;
        }
        activityC10227.f30759 = true;
        boolean zMo4607 = interfaceC4162.mo4607();
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 != null && !activityC10227.f30757) {
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1318;
            abstractC14702.mo4581();
            interfaceC1318.mo4584();
            if (zMo4607) {
                abstractC14702.mo4570(true);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static boolean m25821(ActivityC10227 activityC10227) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (activityC10227.f30745 && !activityC10227.f30817 && interfaceC4162 != null) {
            C11902 c11902Mo4580 = interfaceC4162.mo4580();
            AbstractC20151 it = c11902Mo4580.f35552.values().iterator();
            while (it.hasNext()) {
                C12607 c12607 = (C12607) it.next();
                if (c12607.f38012.f39853 == 2 && !c12607.f38013.isEmpty()) {
                    activityC10227.f30817 = true;
                    activityC10227.f30731 = null;
                    boolean zMo4607 = interfaceC4162.mo4607();
                    interfaceC4162.mo4569(c11902Mo4580.mo29029().mo17262(2, false).mo17261(2).mo17266());
                    InterfaceC1318 interfaceC1318 = activityC10227.f30786;
                    if (interfaceC1318 != null && !activityC10227.f30757) {
                        if (activityC10227.f30727) {
                            ((AbstractC14702) interfaceC1318).mo4581();
                        }
                        interfaceC1318.mo4584();
                        if (zMo4607) {
                            ((AbstractC14702) interfaceC1318).mo4570(true);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static void m25750(final ActivityC10227 activityC10227) {
        if (activityC10227.f30724 || activityC10227.isFinishing() || activityC10227.isDestroyed()) {
            return;
        }
        activityC10227.f30724 = true;
        C19258 c19258BuildDialog = activityC10227.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ۫ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC10227.m25751(this.f16675);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1115(0, activityC10227));
        c19258BuildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.۠۫ۜ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityC10227.m25733(this.f25170);
            }
        });
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m25751(ActivityC10227 activityC10227) {
        activityC10227.f30724 = false;
        activityC10227.f30759 = false;
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null || activityC10227.f30757) {
            return;
        }
        if (activityC10227.f30727) {
            ((AbstractC14702) interfaceC1318).mo4581();
        }
        interfaceC1318.mo4584();
        ((AbstractC14702) interfaceC1318).mo4570(true);
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static void m25676(ActivityC10227 activityC10227) {
        if (activityC10227.f30810 || activityC10227.isFinishing() || activityC10227.isDestroyed()) {
            return;
        }
        activityC10227.f30810 = true;
        C19258 c19258BuildDialog = activityC10227.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2527(activityC10227, 0));
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m25733(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static void m25745(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25795(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25826(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStart() {
        C18635 c18635;
        super.onStart();
        C12437 c12437M10244 = m10244();
        c12437M10244.m30602(2);
        c12437M10244.m30599(7);
        boolean z = this.f30823;
        if (z) {
            if (!z || (c18635 = this.f30827) == null) {
                return;
            }
            RunnableC18836 runnableC18836 = this.f30751;
            c18635.removeCallbacks(runnableC18836);
            this.f30827.post(runnableC18836);
            return;
        }
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 != null) {
            if (this.f30745 && this.f30727) {
                ((AbstractC14702) interfaceC1318).mo4581();
                if (this.f30770) {
                    ((AbstractC14702) this.f30786).mo4570(true);
                    return;
                }
                return;
            }
            if (this.f30770) {
                ((AbstractC14702) interfaceC1318).mo4570(true);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            final View decorView = getWindow().getDecorView();
            decorView.post(new Runnable() { // from class: l.ۘ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ActivityC10227.f30722;
                    if (decorView.hasWindowFocus()) {
                        C12437 c12437M10244 = this.f12585.m10244();
                        c12437M10244.m30602(2);
                        c12437M10244.m30599(7);
                    }
                }
            });
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        this.f30749 = false;
        m25823();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        InterfaceC4162 interfaceC4162;
        super.onStop();
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.removeCallbacks(this.f30751);
        }
        m25820();
        if (this.f30754 != null) {
            this.f30823 = true;
            m25771(true);
        }
        GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = this.f30777;
        if (gestureDetectorOnGestureListenerC8816 != null) {
            gestureDetectorOnGestureListenerC8816.m22785();
        }
        InterfaceC4162 interfaceC4163 = this.f30786;
        if (interfaceC4163 != null) {
            int iMo4603 = interfaceC4163.mo4603();
            boolean z = (!this.f30786.mo4607() || iMo4603 == 1 || iMo4603 == 4) ? false : true;
            this.f30770 = z;
            if (z) {
                ((AbstractC14702) this.f30786).mo4570(false);
            }
        } else {
            this.f30770 = false;
        }
        if (!this.f30745 && (interfaceC4162 = this.f30786) != null && this.f30775 != null) {
            String str = this.f30825;
            long currentPosition = interfaceC4162.getCurrentPosition();
            long duration = this.f30786.getDuration();
            if (duration != -9223372036854775807L && !TextUtils.isEmpty(str)) {
                C22926.m51015(str, currentPosition, duration);
            }
        }
        if (isFinishing()) {
            m25672();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m25848() {
        this.f30770 = false;
        this.f30823 = false;
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.removeCallbacks(this.f30751);
        }
        GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = this.f30777;
        if (gestureDetectorOnGestureListenerC8816 != null) {
            gestureDetectorOnGestureListenerC8816.m22785();
        }
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 != null) {
            ((AbstractC14702) interfaceC1318).mo4570(false);
        }
        getWindow().clearFlags(128);
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C10809 c10809;
        super.onSaveInstanceState(bundle);
        InterfaceC9603 interfaceC9603 = this.f30775;
        if (interfaceC9603 != null) {
            bundle.putInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", interfaceC9603.mo16336());
        }
        if (this.f30780) {
            C10809 c108010 = this.f30731;
            if (this.f30786 != null) {
                List listM38760 = C16452.m38760(getResources(), this.f30786.mo4574());
                int iM38758 = C16452.m38758(listM38760, this.f30786.mo4580());
                if (iM38758 <= 0 || iM38758 > listM38760.size()) {
                    c10809 = null;
                } else {
                    int i = iM38758 - 1;
                    C7404 c7404 = (C7404) listM38760.get(i);
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C8353 c8353M19926 = ((C7404) listM38760.get(i3)).m19926();
                        C8353 c8353M19927 = c7404.m19926();
                        if (c8353M19926.f25633 == c8353M19927.f25633 && c8353M19926.f25609 == c8353M19927.f25609 && c8353M19926.f25623 == c8353M19927.f25623 && c8353M19926.f25615 == c8353M19927.f25615 && Float.compare(c8353M19926.f25596, c8353M19927.f25596) == 0 && TextUtils.equals(c8353M19926.f25619, c8353M19927.f25619) && TextUtils.equals(c8353M19926.f25614, c8353M19927.f25614)) {
                            i2++;
                        }
                    }
                    C8353 c8353M19928 = c7404.m19926();
                    c10809 = new C10809(c8353M19928.f25633, c8353M19928.f25609, c8353M19928.f25623, c8353M19928.f25615, c8353M19928.f25596, c8353M19928.f25619, c8353M19928.f25614, i2);
                }
                if (c10809 != null) {
                    c108010 = c10809;
                }
            }
            if (c108010 != null) {
                bundle.putBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION", c108010.m27025());
            }
        }
    }

    @Override // l.AbstractActivityC3346, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f30790.getVisibility() == 4) {
            this.f30811.setImageResource(R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m25728(ActivityC10227 activityC10227) {
        activityC10227.m25675();
        activityC10227.f30775.mo16332();
        activityC10227.m25692(-9223372036854775807L, false);
        activityC10227.f30827.m43232();
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static void m25735(ActivityC10227 activityC10227) {
        activityC10227.m25675();
        activityC10227.f30775.mo16332();
        activityC10227.m25692(-9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m25838(ActivityC10227 activityC10227) {
        activityC10227.m25675();
        activityC10227.f30775.mo16337();
        activityC10227.m25692(-9223372036854775807L, false);
        activityC10227.f30827.m43232();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25691(int i, Bitmap bitmap) {
        View view;
        if (i != this.f30733 || this.f30760 == null || (view = this.f30814) == null || view.getVisibility() != 0) {
            return;
        }
        if (bitmap == null && this.f30763) {
            m25734();
            m25830();
        } else {
            this.f30760.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25704(ActivityC10227 activityC10227, int i, C13547 c13547) {
        if (i != activityC10227.f30733) {
            return;
        }
        activityC10227.f30739 = c13547;
        View view = activityC10227.f30814;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        activityC10227.m25762(activityC10227.f30805, activityC10227.f30763);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7198 m25687(final ActivityC10227 activityC10227, long j, boolean z, final boolean z2) {
        InterfaceC9603 interfaceC9603;
        C12053 c12053M38733;
        C11881 c11881;
        C0991 c0991;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        C7198 c7198M25762 = null;
        if (interfaceC4162 == null || (interfaceC9603 = activityC10227.f30775) == null || activityC10227.f30814 == null || activityC10227.f30760 == null) {
            return null;
        }
        if (activityC10227.f30745) {
            activityC10227.m25734();
            return null;
        }
        InterfaceC17889 interfaceC17889Mo16334 = interfaceC9603.mo16334();
        if (activityC10227.f30780) {
            InterfaceC4162 interfaceC4163 = activityC10227.f30786;
            C19130 c19130 = activityC10227.f30768;
            InterfaceC15097 interfaceC15097 = activityC10227.f30747;
            InterfaceC15097 interfaceC15098 = activityC10227.f30822;
            C23713 c23713 = activityC10227.f30778;
            C0991 c0992 = activityC10227.f30826;
            if (interfaceC4163 == null || c19130 == null || interfaceC15097 == null || interfaceC15098 == null || c23713 == null || c0992 == null || Build.VERSION.SDK_INT < 23 || !c23713.m52289()) {
                activityC10227.m25734();
                return null;
            }
            C2196 c2196M44185 = c19130.m44185();
            if (c2196M44185 == null) {
                activityC10227.m25734();
                return null;
            }
            if (z2) {
                activityC10227.m25839();
                C0991 c0993 = activityC10227.f30826;
                if (c0993 == null) {
                    activityC10227.m25734();
                    return null;
                }
                C4437 c4437 = activityC10227.f30771;
                if (c4437 != null) {
                    c4437.m13184();
                }
                activityC10227.f30760.setImageBitmap(null);
                c0991 = c0993;
            } else {
                c0991 = c0992;
            }
            int i = activityC10227.f30729;
            long j2 = 1 + activityC10227.f30748;
            activityC10227.f30748 = j2;
            activityC10227.f30805 = j;
            activityC10227.f30763 = z;
            C2466 c2466 = new C2466(i, j2, activityC10227.f30733, j, z, c2196M44185, interfaceC15097, interfaceC15098, c23713, c0991, activityC10227.f30744);
            activityC10227.f30753.m37613(c2466);
            long jM7950 = c2466.m7950();
            boolean zM7946 = c2466.m7946();
            View view = activityC10227.f30814;
            if (view != null && activityC10227.f30760 != null && view.getVisibility() == 0) {
                c7198M25762 = activityC10227.m25762(jM7950, zM7946);
            }
            C7198 c7198M25846 = activityC10227.m25846();
            return c7198M25846 != null ? c7198M25846 : c7198M25762;
        }
        if (interfaceC17889Mo16334 != null) {
            C16431 c16431 = activityC10227.f30744;
            if (c16431 == null) {
                c12053M38733 = C12053.f36042;
            } else {
                c12053M38733 = c16431.m38733(interfaceC17889Mo16334);
            }
            long duration = interfaceC4162.getDuration();
            if (duration <= 0 || duration == -9223372036854775807L || c12053M38733.m29440()) {
                activityC10227.m25734();
                return null;
            }
            if (z && !c12053M38733.m29432()) {
                activityC10227.m25734();
                return null;
            }
            activityC10227.f30805 = j;
            activityC10227.f30763 = z;
            if (z2) {
                activityC10227.f30760.setImageBitmap(null);
            }
            C7198 c7198M25763 = activityC10227.m25762(j, z);
            activityC10227.f30814.setVisibility(0);
            if (c12053M38733.m29432()) {
                if (activityC10227.f30791 == null) {
                    activityC10227.f30791 = new C22720(activityC10227.getApplicationContext());
                }
                activityC10227.f30791.m50778(interfaceC17889Mo16334, c12053M38733, duration, activityC10227.f30733, new C1760(activityC10227));
                activityC10227.f30791.m50776(c7198M25763.m19281(), c7198M25763.m19280(), j);
                return c7198M25763;
            }
            activityC10227.f30760.setImageBitmap(null);
            C22720 c22720 = activityC10227.f30791;
            if (c22720 != null) {
                c22720.m50775();
                if (c12053M38733.m29437()) {
                    activityC10227.f30791.m50779();
                }
            }
            return c7198M25763;
        }
        final InterfaceC4162 interfaceC4164 = activityC10227.f30786;
        final C23713 c23714 = activityC10227.f30778;
        final InterfaceC15097 interfaceC15099 = activityC10227.f30764;
        final C0991 c0994 = activityC10227.f30826;
        C11197 c11197Mo4595 = interfaceC4164 == 0 ? null : ((AbstractC14702) interfaceC4164).mo4595();
        Uri uri = (c11197Mo4595 == null || (c11881 = c11197Mo4595.f33612) == null) ? null : c11881.f35426;
        long duration2 = interfaceC4164 == 0 ? -9223372036854775807L : interfaceC4164.getDuration();
        if (interfaceC4164 == 0 || c23714 == null || interfaceC15099 == null || c0994 == null || uri == null || duration2 <= 0 || duration2 == -9223372036854775807L || Build.VERSION.SDK_INT < 23 || !c23714.m52289()) {
            activityC10227.m25734();
            return null;
        }
        activityC10227.f30805 = j;
        activityC10227.f30763 = z;
        C15807 c15807 = activityC10227.f30801;
        if (c15807 != null) {
            return activityC10227.m25688(c15807, duration2, j, z, z2);
        }
        Future future = activityC10227.f30797;
        if (future == null || future.isDone()) {
            final int i2 = activityC10227.f30784 + 1;
            activityC10227.f30784 = i2;
            final int i3 = activityC10227.f30733;
            final Uri uri2 = uri;
            activityC10227.f30797 = C1802.f6208.submit(new Runnable() { // from class: l.ܿ۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = ActivityC10227.f30722;
                    final C15807 c15807M37444 = C15807.m37444(c23714, uri2, interfaceC15099, c0994);
                    final ActivityC10227 activityC10228 = this.f53122;
                    final int i5 = i2;
                    final int i6 = i3;
                    final InterfaceC4162 interfaceC4165 = interfaceC4164;
                    final boolean z3 = z2;
                    C4925.m14315(new Runnable() { // from class: l.ۡ۫ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC10227.m25702(activityC10228, i5, i6, c15807M37444, interfaceC4165, z3);
                        }
                    });
                }
            });
        }
        activityC10227.m25734();
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25702(ActivityC10227 activityC10227, int i, int i2, C15807 c15807, InterfaceC4162 interfaceC4162, boolean z) {
        activityC10227.f30797 = null;
        if (i == activityC10227.f30784 && i2 == activityC10227.f30733 && c15807 != null) {
            activityC10227.f30801 = c15807;
            activityC10227.m25688(c15807, interfaceC4162.getDuration(), activityC10227.f30805, activityC10227.f30763, z);
        } else if (c15807 != null) {
            c15807.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7198 m25688(C15807 c15807, long j, long j2, boolean z, boolean z2) {
        ImageView imageView;
        if (j <= 0 || j == -9223372036854775807L || this.f30814 == null || (imageView = this.f30760) == null) {
            return null;
        }
        if (z2) {
            imageView.setImageBitmap(null);
        }
        C7198 c7198M25762 = m25762(j2, z);
        this.f30814.setVisibility(0);
        if (this.f30791 == null) {
            this.f30791 = new C22720(getApplicationContext());
        }
        this.f30791.m50778((InterfaceC17889) null, c15807.m37445(), j, this.f30733, new C10933(this));
        this.f30791.m50776(c7198M25762.m19281(), c7198M25762.m19280(), j2);
        return c7198M25762;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7198 m25846() {
        C2466 c2466M37614;
        if (this.f30796 == null && !this.f30753.m37610() && (c2466M37614 = this.f30753.m37614()) != null) {
            C15600 c15600 = this.f30800;
            C15600 c15600M36762 = c15600 == null ? null : c15600.m36762(c2466M37614.m7943(), c2466M37614.m7950() * 1000);
            if (c15600M36762 != null) {
                return m25686(c2466M37614, c15600M36762);
            }
            final C3877 c3877 = new C3877(c2466M37614);
            this.f30796 = c3877;
            C1802.f6208.execute(new Runnable() { // from class: l.ܳ۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    final C15600 c15600M36759;
                    final C3877 c3878 = c3877;
                    int i = ActivityC10227.f30722;
                    try {
                        if (C3877.m11698(c3878, Thread.currentThread())) {
                            C2466 c2466M11700 = C3877.m11700(c3878);
                            c15600M36759 = C15600.m36759(c2466M11700.m7943(), c2466M11700.m7950() * 1000, c2466M11700.m7949(), c2466M11700.m7944(), c2466M11700.m7948(), c2466M11700.m7951(), c2466M11700.m7947());
                        } else {
                            c15600M36759 = null;
                        }
                        C3877.m11699(c3878);
                        final ActivityC10227 activityC10227 = this.f44503;
                        C4925.m14315(new Runnable() { // from class: l.ܺ۫ۜ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC10227.m25714(activityC10227, c3878, c15600M36759);
                            }
                        });
                    } catch (Throwable th) {
                        C3877.m11699(c3878);
                        throw th;
                    }
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25714(ActivityC10227 activityC10227, C3877 c3877, C15600 c15600) {
        if (activityC10227.f30796 != c3877) {
            return;
        }
        activityC10227.f30796 = null;
        C2466 c2466M11700 = C3877.m11700(c3877);
        boolean z = c2466M11700.m7952() == activityC10227.f30729 && c2466M11700.m7945() == activityC10227.f30733;
        boolean zM37611 = activityC10227.f30753.m37611(c2466M11700);
        if (c15600 != null && z) {
            activityC10227.f30800 = c15600;
            if (activityC10227.m25686(c2466M11700, c15600) != null) {
                return;
            }
        }
        if (c15600 == null && z && !zM37611) {
            activityC10227.m25691(c2466M11700.m7945(), (Bitmap) null);
        }
        activityC10227.m25846();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7198 m25686(C2466 c2466, C15600 c15600) {
        int iM7952 = c2466.m7952();
        int i = this.f30729;
        int iM7945 = c2466.m7945();
        int i2 = this.f30733;
        long jM7942 = c2466.m7942();
        long j = this.f30748;
        long jM37612 = this.f30753.m37612();
        if (iM7952 != i || iM7945 != i2 || jM7942 > j || jM7942 <= jM37612 || this.f30753.m37610() || this.f30814 == null || this.f30760 == null) {
            return null;
        }
        this.f30800 = c15600;
        C7198 c7198M25762 = m25762(this.f30805, this.f30763);
        this.f30814.setVisibility(0);
        if (this.f30771 == null) {
            this.f30771 = new C4437();
        }
        this.f30753.m37615(c2466);
        this.f30771.m13187(c15600, c2466.m7945(), new C16576(this, c2466));
        this.f30771.m13185(c7198M25762.m19281(), c7198M25762.m19280());
        return c7198M25762;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25841(C2466 c2466, int i, Bitmap bitmap) {
        if (this.f30753.m37609(c2466)) {
            boolean z = c2466.m7952() == this.f30729 && i == this.f30733;
            boolean z2 = c2466.m7942() == this.f30748;
            if (z && (bitmap != null || z2)) {
                m25691(i, bitmap);
            }
            m25846();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25711(ActivityC10227 activityC10227, C2466 c2466, int i, C13547 c13547) {
        int iM7952 = c2466.m7952();
        int i2 = activityC10227.f30729;
        int i3 = activityC10227.f30733;
        if (iM7952 == i2 && i == i3 && i == i3) {
            activityC10227.f30739 = c13547;
            View view = activityC10227.f30814;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            activityC10227.m25762(activityC10227.f30805, activityC10227.f30763);
        }
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m25839() {
        this.f30729++;
        this.f30753.m37608();
        C3877 c3877 = this.f30796;
        if (c3877 != null) {
            C3877.m11697(c3877);
            if (this.f30826 == C3877.m11700(c3877).m7951()) {
                this.f30826 = new C0991();
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25754(ActivityC10227 activityC10227) {
        activityC10227.f30800 = null;
        C4437 c4437 = activityC10227.f30771;
        activityC10227.f30771 = null;
        if (c4437 != null) {
            c4437.m13186(new RunnableC7281(1));
        }
        activityC10227.m25734();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public void m25734() {
        m25839();
        View view = this.f30814;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f30760;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C22720 c22720 = this.f30791;
        if (c22720 != null) {
            c22720.m50775();
        }
        C4437 c4437 = this.f30771;
        if (c4437 != null) {
            c4437.m13184();
        }
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static void m25788(ActivityC10227 activityC10227) {
        View view = activityC10227.f30806;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static void m25756(ActivityC10227 activityC10227) {
        View view = activityC10227.f30806;
        if (view != null) {
            view.setVisibility(8);
            activityC10227.f30806.setTranslationX(0.0f);
            activityC10227.f30806.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    private void m25820() {
        this.f30733++;
        this.f30808 = C6404.f19812;
        this.f30739 = null;
        View view = this.f30814;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f30760;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        Future future = this.f30797;
        this.f30797 = null;
        this.f30784++;
        if (future != null) {
            future.cancel(true);
        }
        C15807 c15807 = this.f30801;
        this.f30801 = null;
        C22720 c22720 = this.f30791;
        if (c22720 != null) {
            c22720.m50777(new RunnableC11222(1, c15807));
        } else if (c15807 != null) {
            c15807.close();
        }
        m25839();
        this.f30800 = null;
        C4437 c4437 = this.f30771;
        if (c4437 != null) {
            c4437.m13186(new RunnableC7281(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7198 m25762(long j, boolean z) {
        C8353 c8353M51437;
        char c;
        int iM6124;
        int iMax;
        View view;
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null) {
            c8353M51437 = null;
        } else {
            AbstractC4628 abstractC4628ListIterator = interfaceC4162.mo4574().m33608().listIterator(0);
            c8353M51437 = null;
            loop0: while (abstractC4628ListIterator.hasNext()) {
                C23190 c23190 = (C23190) abstractC4628ListIterator.next();
                if (c23190.m51440() == 2) {
                    for (int i = 0; i < c23190.f74548; i++) {
                        if (c23190.m51441(i)) {
                            c8353M51437 = c23190.m51437(i);
                            break loop0;
                        }
                        if (c8353M51437 == null && c23190.m51439(i, true)) {
                            c8353M51437 = c23190.m51437(i);
                        }
                    }
                }
            }
        }
        C13547 c13547 = this.f30739;
        C6404 c6404 = this.f30808;
        C13547 c13547M6125 = c8353M51437 == null ? null : C1841.m6125(c8353M51437.f25633, c8353M51437.f25609, c8353M51437.f25599, c8353M51437.f25636);
        if (c13547M6125 != null) {
            c13547 = c13547M6125;
        } else if (c13547 == null) {
            C13547 c13547M6126 = c6404 != null ? C1841.m6125(c6404.f19815, c6404.f19813, 0, c6404.f19814) : null;
            c13547 = c13547M6126 != null ? c13547M6126 : new C13547(16.0f, 9.0f);
        }
        int iM27878 = C11266.m27878(180.0f);
        int iM27879 = C11266.m27878(180.0f);
        if (iM27878 <= 0) {
            iM27878 = 16;
        }
        if (iM27879 <= 0) {
            iM27879 = 9;
        }
        float fM32599 = c13547.m32599();
        int iMax2 = Math.max(1, Math.round(iM27878 / fM32599));
        if (iMax2 > iM27879) {
            iM27878 = Math.max(1, Math.round(iM27879 * fM32599));
        } else {
            iM27879 = iMax2;
        }
        C7198 c7198 = new C7198(Math.max(1, iM27878), Math.max(1, iM27879));
        ViewGroup.LayoutParams layoutParams = this.f30814.getLayoutParams();
        layoutParams.width = c7198.m19281();
        layoutParams.height = c7198.m19280();
        this.f30814.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f30742;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f30742;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        if (z) {
            iM6124 = C1841.m6124(width, c7198.m19281());
            c = 1;
        } else {
            int iM19281 = c7198.m19281();
            InterfaceC4162 interfaceC4163 = this.f30786;
            View view2 = this.f30730;
            if (interfaceC4163 == null || view2 == null || view2.getWidth() <= 0) {
                c = 1;
                iM6124 = C1841.m6124(width, iM19281);
            } else {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f30742.getLocationInWindow(iArr2);
                int i2 = iArr[0] - iArr2[0];
                int width2 = view2.getWidth();
                long duration = interfaceC4163.getDuration();
                if (duration <= 0 || width2 <= 0) {
                    c = 1;
                    iM6124 = C1841.m6124(width, iM19281);
                } else {
                    c = 1;
                    iM6124 = Math.max(0, Math.min((Math.round(width2 * (Math.max(0L, Math.min(j, duration)) / duration)) + i2) - (iM19281 / 2), Math.max(0, width - iM19281)));
                }
            }
        }
        int iM19280 = c7198.m19280();
        int iM278710 = C11266.m27878(12.0f);
        if (z && (view = this.f30806) != null && view.getVisibility() == 0) {
            int iM25781 = iM19280 + iM278710 + m25781(width);
            int iMax3 = Math.max(0, iM278710);
            int i3 = height - iM25781;
            iMax = Math.max(iMax3, Math.min(i3 / 2, Math.max(iMax3, i3 - iMax3)));
        } else {
            View view3 = this.f30790;
            if (view3 == null || view3.getHeight() <= 0) {
                iMax = Math.max(iM278710, (height - iM19280) - C11266.m27878(96.0f));
            } else {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f30790.getLocationInWindow(iArr3);
                this.f30742.getLocationInWindow(iArr4);
                int i4 = iArr3[c] - iArr4[c];
                if (i4 > 0) {
                    iMax = Math.max(iM278710, (i4 - iM19280) - iM278710);
                } else {
                    iMax = Math.max(iM278710, (height - iM19280) - C11266.m27878(96.0f));
                }
            }
        }
        this.f30814.setTranslationX(iM6124);
        this.f30814.setTranslationY(iMax);
        if (z) {
            int iM19282 = c7198.m19280();
            View view4 = this.f30806;
            if (view4 != null && view4.getVisibility() == 0) {
                int iM278711 = C11266.m27878(12.0f);
                m25804(width);
                int measuredWidth = this.f30806.getMeasuredWidth();
                if (measuredWidth <= 0 && (measuredWidth = this.f30806.getWidth()) <= 0) {
                    measuredWidth = width;
                }
                int iMin = Math.min(iMax + iM19282 + iM278711, Math.max(iM278711, (height - m25781(width)) - iM278711));
                this.f30806.setTranslationX(C1841.m6124(width, measuredWidth));
                this.f30806.setTranslationY(iMin);
            }
        }
        return c7198;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public void m25830() {
        View view = this.f30806;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        FrameLayout frameLayout = this.f30742;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f30742;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        int iM27878 = C11266.m27878(12.0f);
        m25804(width);
        int measuredWidth = this.f30806.getMeasuredWidth();
        if (measuredWidth <= 0 && (measuredWidth = this.f30806.getWidth()) <= 0) {
            measuredWidth = width;
        }
        int iM25781 = m25781(width);
        this.f30806.setTranslationX(C1841.m6124(width, measuredWidth));
        View view2 = this.f30806;
        int iMax = Math.max(0, iM27878);
        int i = height - iM25781;
        view2.setTranslationY(Math.max(iMax, Math.min(i / 2, Math.max(iMax, i - iMax))));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m25781(int i) {
        m25804(i);
        int measuredHeight = this.f30806.getMeasuredHeight();
        return measuredHeight > 0 ? measuredHeight : Math.max(1, this.f30806.getHeight());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m25804(int i) {
        int iMakeMeasureSpec;
        int i2;
        View view = this.f30806;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        this.f30806.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m25825(int i) {
        ViewGroup viewGroupM43222;
        int childCount;
        C0289 c0289 = this.f30755;
        ViewGroup viewGroup = this.f30776;
        if (c0289 == null || viewGroup == null) {
            return;
        }
        if (i != 4 || (viewGroupM43222 = this.f30827.m43222()) == null) {
            viewGroupM43222 = viewGroup;
        }
        if (c0289.getParent() == viewGroupM43222) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c0289.getLayoutParams();
        ViewParent parent = c0289.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c0289);
        }
        if (viewGroupM43222 == viewGroup) {
            childCount = Math.min(this.f30767, viewGroupM43222.getChildCount());
        } else {
            childCount = viewGroupM43222.getChildCount();
        }
        viewGroupM43222.addView(c0289, childCount, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public void m25823() {
        int i;
        C0289 c0289 = this.f30755;
        if (c0289 == null) {
            return;
        }
        if (this.f30749) {
            i = 4;
        } else {
            if (m25817()) {
                String str = (String) C19400.m44676(this.f30750);
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, m25739())) {
                    i = 4;
                }
            }
            i = 0;
        }
        c0289.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m25684(ActivityC10227 activityC10227, List list) {
        C13048 c13048;
        ArrayList arrayList = activityC10227.f30802;
        if (!((AbstractCollection) list).isEmpty()) {
            ArrayList<C19811> arrayList2 = new ArrayList();
            AbstractC14545 abstractC14545 = (AbstractC14545) list;
            AbstractC4628 abstractC4628ListIterator = abstractC14545.listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                C19811 c19811 = (C19811) abstractC4628ListIterator.next();
                if (c19811.f63987 == null && c19811.f63992 != null && c19811.f63997 == -3.4028235E38f) {
                    arrayList2.add(c19811);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                for (C19811 c19812 : arrayList2) {
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            c13048 = (C13048) arrayList3.get(size);
                            if (c13048.f39066 == c19812) {
                                arrayList3.remove(size);
                                break;
                            }
                        } else {
                            int size2 = arrayList3.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    c13048 = null;
                                    break;
                                }
                                c13048 = (C13048) arrayList3.get(size2);
                                if (c13048.f39066.equals(c19812)) {
                                    arrayList3.remove(size2);
                                    break;
                                }
                            }
                        }
                    }
                    if (c13048 == null) {
                        int iM25678 = m25678(c19812);
                        int i = 0;
                        while (true) {
                            Iterator it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C13048 c13049 = (C13048) it.next();
                                int i2 = c13049.f39067;
                                if (i < c13049.f39068 + i2 && i2 < i + iM25678) {
                                    i++;
                                }
                            }
                        }
                        c13048 = new C13048(c19812, i, iM25678);
                    } else {
                        c13048.f39066 = c19812;
                        c13048.f39068 = m25678(c19812);
                    }
                    arrayList4.add(c13048);
                }
                arrayList.clear();
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(list.size());
                AbstractC4628 abstractC4628ListIterator2 = abstractC14545.listIterator(0);
                int i3 = 0;
                while (abstractC4628ListIterator2.hasNext()) {
                    C19811 c19813 = (C19811) abstractC4628ListIterator2.next();
                    if (c19813.f63987 == null && c19813.f63992 != null && c19813.f63997 == -3.4028235E38f) {
                        int i4 = i3 + 1;
                        float fMax = Math.max(0.0f, 0.955f - (((C13048) arrayList4.get(i3)).f39067 * 0.049999997f));
                        C21927 c21927M45556 = c19813.m45556();
                        c21927M45556.m49385(fMax, 0);
                        c21927M45556.m49386(2);
                        arrayList5.add(c21927M45556.m49383());
                        i3 = i4;
                    } else {
                        arrayList5.add(c19813);
                    }
                }
                return arrayList5;
            }
            arrayList.clear();
            return list;
        }
        arrayList.clear();
        return list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25678(C19811 c19811) {
        CharSequence charSequence = c19811.f63992;
        int i = 1;
        if (charSequence != null && charSequence.length() != 0) {
            int length = charSequence.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == '\n') {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    private void m25675() {
        if (this.f30745 || this.f30786 == null || this.f30775 == null) {
            return;
        }
        String str = this.f30825;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long duration = this.f30786.getDuration();
        if (duration == -9223372036854775807L) {
            return;
        }
        C22926.m51015(str, this.f30786.getCurrentPosition(), duration);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25692(long j, boolean z) {
        String strM25682;
        long jMax;
        C16431 c16431;
        if (this.f30786 == null || isFinishing() || isDestroyed()) {
            return;
        }
        this.f30745 = false;
        this.f30727 = false;
        this.f30757 = false;
        this.f30759 = false;
        this.f30817 = false;
        this.f30724 = false;
        m25843(false);
        this.f30823 = false;
        int iIncrementAndGet = this.f30803.incrementAndGet();
        this.f30783 = iIncrementAndGet;
        C11197 c11197Mo16333 = this.f30775.mo16333();
        InterfaceC17889 interfaceC17889Mo16334 = this.f30775.mo16334();
        if (interfaceC17889Mo16334 != null) {
            strM25682 = m25682(interfaceC17889Mo16334);
        } else {
            C11881 c11881 = c11197Mo16333.f33612;
            if (c11881 != null) {
                Object obj = c11881.f35422;
                if (obj instanceof String) {
                    strM25682 = (String) obj;
                }
            }
            throw new IllegalStateException("URL media item has no playback key");
        }
        String str = strM25682;
        if (j == -9223372036854775807L) {
            jMax = C22926.m51013(str);
        } else {
            jMax = Math.max(0L, j);
        }
        final C8110 c8110 = new C8110(iIncrementAndGet, c11197Mo16333, interfaceC17889Mo16334, jMax, str, z, (z || interfaceC17889Mo16334 == null || (c16431 = this.f30744) == null) ? null : c16431.m38743());
        List listM25793 = m25793(c8110.m21573());
        boolean zM25813 = m25813(c8110.m21573());
        this.f30792 = z;
        this.f30802.clear();
        m25827();
        m25771(false);
        m25815();
        if (z || c8110.m21569() == null) {
            m25699(c8110, C15164.m35863(c8110.m21572(), listM25793, zM25813));
        } else {
            this.f30754 = C1802.f6208.submit(new Runnable() { // from class: l.ᩴ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC10227.m25716(this.f59285, c8110);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m25815() {
        C16431 c16431 = this.f30744;
        if (c16431 != null) {
            c16431.m38739();
        }
        m25755();
        m25752();
        m25790();
        C19400.m44671(this.f30824);
        m25744();
        m25729();
        m25734();
        this.f30799 = true;
        InterfaceC4162 interfaceC4162 = this.f30786;
        m25742(interfaceC4162 != null ? interfaceC4162.mo4603() : 1);
        m25693((CharSequence) getString(R.string.MT_Protector));
        m25763((CharSequence) getString(R.string.MT_Protector));
        this.f30786.stop();
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static void m25740(ActivityC10227 activityC10227) {
        activityC10227.f30799 = false;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        activityC10227.m25742(interfaceC4162 == null ? 1 : interfaceC4162.mo4603());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m25742(int i) {
        int i2 = 0;
        if (this.f30799 && i != 1) {
            this.f30799 = false;
        }
        View view = this.f30820;
        if (view == null) {
            return;
        }
        if (!this.f30799 && i != 2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25716(final ActivityC10227 activityC10227, final C8110 c8110) {
        final C15164 c15164M35863;
        AbstractC13921 abstractC13921M21569 = c8110.m21569();
        InterfaceC17889 interfaceC17889M21568 = c8110.m21568();
        if (abstractC13921M21569 == null || interfaceC17889M21568 == null) {
            c15164M35863 = C15164.m35863(c8110.m21572(), Collections.EMPTY_LIST, false);
        } else {
            List listM41660 = Collections.EMPTY_LIST;
            try {
                listM41660 = C17781.m41660(interfaceC17889M21568, abstractC13921M21569);
                C1553 c1553M41661 = C17781.m41661(listM41660, interfaceC17889M21568, abstractC13921M21569.mo13919());
                c15164M35863 = m25689(c8110.m21572(), listM41660, c1553M41661, c1553M41661 == null ? EnumC20811.NONE : EnumC20811.AUTO, true);
            } catch (Exception unused) {
                c15164M35863 = C15164.m35863(c8110.m21572(), listM41660, false);
            }
        }
        C4925.m14315(new Runnable() { // from class: l.ᩳ۫ۜ
            @Override // java.lang.Runnable
            public final void run() {
                this.f56249.m25699(c8110, c15164M35863);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25699(C8110 c8110, C15164 c15164) {
        String strM21573;
        C14335 c14335M47297;
        int iM21571 = c8110.m21571();
        if (this.f30786 == null || isFinishing() || isDestroyed() || iM21571 != this.f30783) {
            return;
        }
        this.f30754 = null;
        if (!getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
            this.f30823 = true;
            return;
        }
        if (!c8110.m21574() && c8110.m21569() != null && (c14335M47297 = C20687.m47297((strM21573 = c8110.m21573()))) != null && c14335M47297.m34209() == EnumC6575.FILE) {
            String strM34208 = c14335M47297.m34208();
            if (TextUtils.isEmpty(strM34208)) {
                C20687.m47302(strM21573);
            } else {
                C1553 c1553M25685 = m25685(strM34208, c15164.m35865());
                if (c1553M25685 != null) {
                    c15164 = m25689(c15164.m35867(), c15164.m35865(), c1553M25685, EnumC20811.MANUAL, c15164.m35868());
                } else if (c15164.m35868()) {
                    C20687.m47302(strM21573);
                }
            }
        }
        String strM21574 = c8110.m21573();
        this.f30804 = c15164.m35865();
        this.f30723 = c15164.m35868();
        this.f30807 = strM21574;
        this.f30732 = c15164.m35864();
        this.f30738 = c15164.m35866();
        try {
            String strM21575 = c8110.m21573();
            C19400 c19400 = this.f30750;
            if (this.f30781 && !TextUtils.isEmpty(strM21575)) {
                this.f30736 = strM21575;
                this.f30781 = false;
            }
            if (!TextUtils.equals(strM21575, this.f30736)) {
                this.f30736 = null;
            }
            if (m25817()) {
                if (TextUtils.equals(strM21575, this.f30736)) {
                    strM21575 = null;
                }
                C19400.m44672(c19400, (Object) strM21575);
            } else {
                if (this.f30772 == EnumC18694.AUTO) {
                    this.f30772 = EnumC18694.NONE;
                    if (getRequestedOrientation() != -1) {
                        setRequestedOrientation(-1);
                    }
                }
                C19400.m44671(c19400);
            }
            String strM21576 = c8110.m21573();
            C19400.m44672(this.f30773, TextUtils.isEmpty(strM21576) ? null : new C5288(strM21576, c8110.m21574()));
            C19400.m44672(this.f30813, (Object) c8110.m21573());
            String strM21577 = c8110.m21573();
            if (c15164.m35864() == EnumC20811.MANUAL && !TextUtils.isEmpty(c15164.m35866())) {
                C19400.m44672(this.f30824, new C1054(strM21577, c15164.m35866()));
            } else {
                C19400.m44671(this.f30824);
            }
            m25820();
            if (c8110.m21570() > 0) {
                InterfaceC1318 interfaceC1318 = this.f30786;
                C11197 c11197M35867 = c15164.m35867();
                long jM21570 = c8110.m21570();
                AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1318;
                abstractC14702.getClass();
                abstractC14702.mo4563(jM21570, AbstractC14545.of((Object) c11197M35867));
            } else {
                ((AbstractC14702) this.f30786).m34996(c15164.m35867());
            }
            this.f30825 = c8110.m21573();
            this.f30786.mo4584();
            ((AbstractC14702) this.f30786).mo4570(true);
        } catch (Exception e) {
            this.f30799 = false;
            InterfaceC4162 interfaceC4162 = this.f30786;
            m25742(interfaceC4162 != null ? interfaceC4162.mo4603() : 1);
            this.f30732 = EnumC20811.NONE;
            this.f30738 = null;
            C19400.m44671(this.f30824);
            m25755();
            m25752();
            m25790();
            C21374.m48459((CharSequence) e.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m25771(boolean z) {
        Future future = this.f30754;
        this.f30754 = null;
        if (future != null) {
            future.cancel(true);
        }
        if (z) {
            this.f30783 = this.f30803.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    private void m25827() {
        this.f30732 = EnumC20811.NONE;
        this.f30738 = null;
        C19400.m44671(this.f30824);
        List list = Collections.EMPTY_LIST;
        this.f30804 = list;
        this.f30723 = false;
        this.f30807 = null;
        this.f30749 = false;
        C0289 c0289 = this.f30755;
        if (c0289 == null) {
            return;
        }
        c0289.m1636(list);
        c0289.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25818(ActivityC10227 activityC10227) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == null || activityC10227.f30732 == EnumC20811.NONE || activityC10227.f30792 || TextUtils.isEmpty(activityC10227.f30738)) {
            return false;
        }
        activityC10227.m25692(interfaceC4162.getCurrentPosition(), true);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25709(ActivityC10227 activityC10227, CharSequence charSequence, C11197 c11197) {
        if (!TextUtils.isEmpty(charSequence)) {
            activityC10227.f30769.setText(charSequence);
        } else {
            activityC10227.f30769.setText(c11197 == null ? null : c11197.f33614);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m25682(InterfaceC17889 interfaceC17889) {
        String path = interfaceC17889.getPath();
        C16431 c16431 = this.f30744;
        if (c16431 == null) {
            return path;
        }
        AbstractC13921 abstractC13921M38743 = c16431.m38743();
        if (!(abstractC13921M38743 instanceof AbstractC3163)) {
            return path;
        }
        return ((AbstractC3163) abstractC13921M38743).mo9688() + path;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m25681(C11197 c11197) {
        if (c11197 == null) {
            return null;
        }
        C11881 c11881 = c11197.f33612;
        if (c11881 != null) {
            Object obj = c11881.f35422;
            if (obj instanceof InterfaceC17889) {
                return m25682((InterfaceC17889) obj);
            }
            return obj instanceof String ? (String) obj : c11881.f35426.toString();
        }
        return c11197.f33614;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m25760(C11197 c11197) {
        if (c11197 == null) {
            return null;
        }
        C11881 c11881 = c11197.f33612;
        if (c11881 != null) {
            Object obj = c11881.f35422;
            if (obj instanceof InterfaceC17889) {
                return m25682((InterfaceC17889) obj);
            }
        }
        if (c11881 != null) {
            Object obj2 = c11881.f35422;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    private String m25739() {
        if (!TextUtils.isEmpty(this.f30825)) {
            return this.f30825;
        }
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null) {
            return null;
        }
        return m25760(interfaceC4162.mo4595());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25718(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30750, activityC10227.m25760(c11197), new C3938());
        activityC10227.m25823();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25698(C6404 c6404) {
        InterfaceC4162 interfaceC4162 = this.f30786;
        C19400 c19400 = this.f30750;
        String str = (String) C19400.m44676(c19400);
        if (interfaceC4162 == null || TextUtils.isEmpty(str) || !m25817() || !TextUtils.equals(str, m25739())) {
            return;
        }
        int i = c6404.f19815;
        int i2 = c6404.f19813;
        boolean z = false;
        int iM22973 = C8897.m22973(i, i2, 0, c6404.f19814);
        if (iM22973 == -1) {
            if (c6404.f19815 <= 0 || i2 <= 0) {
                return;
            }
            C19400.m44675(c19400);
            this.f30749 = false;
            m25823();
            return;
        }
        C19400.m44675(c19400);
        int i3 = getResources().getConfiguration().orientation;
        if (iM22973 != 0 ? !(iM22973 != 1 || i3 == 1) : i3 != 2) {
            z = true;
        }
        this.f30749 = z;
        this.f30772 = EnumC18694.AUTO;
        if (getRequestedOrientation() != iM22973) {
            setRequestedOrientation(iM22973);
        }
        if (this.f30749) {
            return;
        }
        m25823();
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    private void m25755() {
        C19400.m44671(this.f30750);
        this.f30749 = false;
        m25823();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m25805(ActivityC10227 activityC10227) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        C9876.m24966(activityC10227.f30794);
        C9876.m24966(activityC10227.f30790);
        C9876.m24966(activityC10227.f30746);
        C21165.m48103(activityC10227.f30819);
        C21165.m48103(activityC10227.f30811);
        C21165.m48103(activityC10227.f30740);
        C5157 c5157 = activityC10227.f30756;
        if (c5157 == null) {
            return;
        }
        int iM14744 = c5157.m14744();
        int iM14742 = activityC10227.f30756.m14742();
        int iM14743 = activityC10227.f30756.m14743();
        int iM14741 = activityC10227.f30756.m14741();
        if (iM14744 > 0) {
            C21165.m48102(-1, Math.max(C11266.m27878(20.0f), C11266.m27878(10.0f) + iM14744), -1, activityC10227.f30819);
            C9876.m24967(activityC10227.f30794, -1, iM14744, -1, -1);
        }
        if (iM14742 > 0) {
            C21165.m48102(iM14742, -1, -1, activityC10227.f30811);
            C9876.m24967(activityC10227.f30794, iM14742, -1, -1, -1);
            C9876.m24967(activityC10227.f30790, iM14742, -1, -1, -1);
            C9876.m24967(activityC10227.f30746, iM14742, -1, -1, -1);
        }
        if (iM14743 > 0) {
            C21165.m48102(-1, -1, iM14743, activityC10227.f30740);
            C9876.m24967(activityC10227.f30794, -1, -1, iM14743, -1);
            C9876.m24967(activityC10227.f30790, -1, -1, iM14743, -1);
            C9876.m24967(activityC10227.f30746, -1, -1, iM14743, -1);
        }
        if (iM14741 > 0) {
            C9876.m24967(activityC10227.f30790, -1, -1, -1, iM14741);
            C9876.m24967(activityC10227.f30746, -1, -1, -1, iM14741);
        }
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private void m25802() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (!ApplicationC20075.f65008.getBoolean("ins", false) || ApplicationC20075.f65008.getBoolean("vpun", true)) {
            if (Build.VERSION.SDK_INT >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } else {
            attributes.layoutInDisplayCutoutMode = 2;
        }
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25713(ActivityC10227 activityC10227, C2978 c2978, boolean z) {
        c2978.setEnabled(z);
        C22870.m50970(ApplicationC20075.f65008, "vpffs", z);
        activityC10227.m25774();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25712(ActivityC10227 activityC10227, C2978 c2978, C21610 c21610) {
        activityC10227.f30756 = c21610.m48833();
        boolean z = ApplicationC20075.f65008.getBoolean("ins", false);
        if (activityC10227.f30756 == null || z) {
            if (z) {
                C4925.m14315(new RunnableC19109(1, activityC10227));
            }
        } else {
            ApplicationC20075.f65008.edit().putBoolean("ins", true).apply();
            c2978.setVisibility(0);
            if (c2978.isChecked()) {
                c2978.setChecked(false);
            } else {
                activityC10227.m25802();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25796(ActivityC10227 activityC10227, View view) {
        activityC10227.f30786.mo4568(new C2730(((Float) view.getTag()).floatValue()));
        TextView[] textViewArr = activityC10227.f30779;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView = textViewArr[i];
            boolean z = textView == view;
            textView.setTextColor(z ? C21943.f70257 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25764(ActivityC10227 activityC10227) {
        activityC10227.f30827.m43231();
        activityC10227.f30746.scrollTo(0, 0);
        View view = activityC10227.f30746;
        view.setTranslationY(view.getHeight());
        activityC10227.f30758.setVisibility(0);
        View view2 = activityC10227.f30746;
        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
        activityC10227.m25693((CharSequence) null);
        activityC10227.m25763((CharSequence) null);
        activityC10227.f30821.m26422(activityC10227.f30812);
        ((RunnableC13109) activityC10227.f30743).run();
        float f = activityC10227.f30786.mo4599().f8510;
        for (TextView textView : activityC10227.f30779) {
            boolean z = Math.abs(((Float) textView.getTag()).floatValue() - f) < 0.001f;
            textView.setTextColor(z ? C21943.f70257 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25766(ActivityC10227 activityC10227, View view) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        c21282.m48300(8388661);
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.add(0, 1, 0, R.string.MT_Protector);
        int i = 0;
        while (i < 5) {
            int i2 = f30721[i];
            int i3 = i + 100;
            i++;
            c3060M48304.add(0, i3, i, activityC10227.getString(R.string.MT_Protector, Integer.valueOf(i2)));
        }
        c3060M48304.add(0, 200, 6, R.string.MT_Protector);
        c21282.m48302(new C1324(activityC10227));
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25723(ActivityC10227 activityC10227, MenuItem menuItem) {
        C10516 c10516 = activityC10227.f30821;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            c10516.m26420();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            c10516.m26421(f30721[i]);
            return true;
        }
        C17988 c17988 = new C17988(activityC10227, activityC10227);
        c17988.m5519(R.string.MT_Protector);
        c17988.m5523();
        c17988.m5525();
        c17988.m5520(activityC10227.getString(R.string.MT_Protector));
        int iM26425 = c10516.m26425();
        if (iM26425 > 0) {
            c17988.m5522(String.valueOf(iM26425));
            c17988.m5526();
        }
        c17988.m5527();
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m25799(boolean z) {
        this.f30821.m26424(this.f30812);
        C4925.m14324().removeCallbacks(this.f30743);
        View view = this.f30746;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), this.f30746.getHeight());
        objectAnimatorOfFloat.addListener(new C17282(this));
        if (z) {
            objectAnimatorOfFloat.setDuration(150L);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public void m25833() {
        TextView textView = this.f30737;
        if (textView == null) {
            return;
        }
        int iM26425 = this.f30821.m26425();
        if (iM26425 > 0) {
            textView.setText(getString(R.string.MT_Protector, Integer.valueOf(iM26425)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public void m25749() {
        Handler handlerM14324 = C4925.m14324();
        Runnable runnable = this.f30743;
        handlerM14324.removeCallbacks(runnable);
        long jM26423 = this.f30821.m26423();
        if (jM26423 <= 0) {
            return;
        }
        long j = jM26423 % 60000;
        C4925.m14324().postDelayed(runnable, j != 0 ? j : 60000L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25719(ActivityC10227 activityC10227, C12343 c12343, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null || itemId < 0 || itemId > c12343.m29947().size()) {
            return;
        }
        C14017 c14017Mo4574 = interfaceC1318.mo4574();
        if (!TextUtils.equals(c12343.m29946(), activityC10227.m25681(((AbstractC14702) interfaceC1318).mo4595()))) {
            activityC10227.m25844(c14017Mo4574);
            return;
        }
        if (itemId == 0) {
            activityC10227.f30731 = null;
            interfaceC1318.mo4569(interfaceC1318.mo4580().mo29029().mo17262(2, false).mo17261(2).mo17266());
            activityC10227.m25844(c14017Mo4574);
            return;
        }
        C7404 c7404 = (C7404) c12343.m29947().get(itemId - 1);
        for (C7404 c7405 : C16452.m38760(activityC10227.getResources(), c14017Mo4574)) {
            if (c7405.m19927() == c7404.m19927() && c7405.m19924().m51438().equals(c7404.m19924().m51438())) {
                activityC10227.f30731 = null;
                interfaceC1318.mo4569(C16452.m38761(interfaceC1318.mo4580(), c7404));
                activityC10227.m25844(c14017Mo4574);
                return;
            }
        }
        activityC10227.m25844(c14017Mo4574);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25842(C14017 c14017) {
        C7404 c7404;
        InterfaceC4162 interfaceC4162 = this.f30786;
        C10809 c10809 = this.f30731;
        if (!this.f30780 || interfaceC4162 == null || c10809 == null) {
            return;
        }
        Iterator it = C16452.m38760(getResources(), c14017).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c7404 = null;
                break;
            }
            c7404 = (C7404) it.next();
            if (C10809.m27023(c10809, c7404.m19926())) {
                if (i == c10809.m27024()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c7404 == null) {
            return;
        }
        this.f30731 = null;
        interfaceC4162.mo4569(C16452.m38761(interfaceC4162.mo4580(), c7404));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25844(C14017 c14017) {
        CharSequence text;
        if (this.f30780 && this.f30761 != null) {
            List listM38760 = C16452.m38760(getResources(), c14017);
            if (listM38760.size() >= 2) {
                InterfaceC4162 interfaceC4162 = this.f30786;
                int iM38758 = interfaceC4162 == null ? 0 : C16452.m38758(listM38760, interfaceC4162.mo4580());
                if (iM38758 > 0 && iM38758 <= listM38760.size()) {
                    text = ((C7404) listM38760.get(iM38758 - 1)).m19923();
                } else {
                    text = getText(R.string.MT_Protector);
                }
                this.f30761.setText(text);
                this.f30761.setContentDescription(getString(R.string.MT_Protector, text));
                this.f30761.setVisibility(0);
                return;
            }
            TextView textView = this.f30761;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f30761;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static void m25791(ActivityC10227 activityC10227) {
        TextView textView = activityC10227.f30761;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25708(final ActivityC10227 activityC10227, View view) {
        final C12343 c12343M29944;
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        int i = 0;
        C21282 c21282 = null;
        if (interfaceC1318 == null || !activityC10227.f30780) {
            c12343M29944 = C12343.m29944(null);
        } else {
            String strM25681 = activityC10227.m25681(((AbstractC14702) interfaceC1318).mo4595());
            List listM38760 = C16452.m38760(activityC10227.getResources(), interfaceC1318.mo4574());
            if (listM38760.size() < 2) {
                c12343M29944 = C12343.m29944(strM25681);
            } else {
                c12343M29944 = new C12343(strM25681, listM38760, C16452.m38758(listM38760, interfaceC1318.mo4580()), i);
            }
        }
        if (c12343M29944.m29947().size() >= 2) {
            c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48300(8388661);
            C3060 c3060M48304 = c21282.m48304();
            c3060M48304.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i2 = 0;
            while (i2 < c12343M29944.m29947().size()) {
                int i3 = i2 + 1;
                c3060M48304.add(0, i3, i3, ((C7404) c12343M29944.m29947().get(i2)).m19925()).setCheckable(true);
                i2 = i3;
            }
            c3060M48304.setGroupCheckable(0, true, true);
            int iM29945 = c12343M29944.m29945();
            if (iM29945 >= 0 && iM29945 < c3060M48304.size()) {
                c3060M48304.getItem(iM29945).setChecked(true);
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.ۜ۫ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10227.m25719(this.f20985, c12343M29944, menuItem);
                    return true;
                }
            });
        } else {
            InterfaceC4162 interfaceC4162 = activityC10227.f30786;
            activityC10227.m25844(interfaceC4162 == null ? C14017.f42393 : interfaceC4162.mo4574());
        }
        if (c21282 != null) {
            c21282.m48305();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m25806(final ActivityC10227 activityC10227, View view) {
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null) {
            return;
        }
        if (interfaceC1318.mo4574().m33610() && ((AbstractC14702) interfaceC1318).mo4595() != null) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        final C14459 c14459M25808 = activityC10227.m25808();
        if (!c14459M25808.m34523().isEmpty()) {
            C21282 c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48300(8388661);
            C3060 c3060M48304 = c21282.m48304();
            c3060M48304.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i = 0;
            while (i < c14459M25808.m34523().size()) {
                int i2 = i + 1;
                c3060M48304.add(0, i2, i2, ((C23632) c14459M25808.m34523().get(i)).m52118()).setCheckable(true);
                i = i2;
            }
            c3060M48304.setGroupCheckable(0, true, true);
            int iM34520 = c14459M25808.m34520();
            if (iM34520 >= 0 && iM34520 < c3060M48304.size()) {
                c3060M48304.getItem(iM34520).setChecked(true);
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.᩻۫ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10227.m25720(this.f76729, c14459M25808, menuItem);
                    return true;
                }
            });
            c21282.m48305();
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25720(ActivityC10227 activityC10227, C14459 c14459, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == 0 || itemId < 0 || itemId > c14459.m34523().size()) {
            return;
        }
        if (!TextUtils.equals(c14459.m34522(), activityC10227.m25681(((AbstractC14702) interfaceC4162).mo4595()))) {
            activityC10227.m25693((CharSequence) null);
            return;
        }
        if (itemId > 0) {
            C23632 c23632 = (C23632) c14459.m34523().get(itemId - 1);
            m25697(interfaceC4162, c23632);
            String strM34521 = c14459.m34521();
            if (!TextUtils.isEmpty(strM34521)) {
                C13588.m32669(c23632.m52121(), strM34521);
            }
            activityC10227.m25693(c23632.m52118());
            return;
        }
        activityC10227.m25744();
        String strM34522 = c14459.m34521();
        if (!TextUtils.isEmpty(strM34522)) {
            C13588.m32671(strM34522);
        }
        activityC10227.m25693((CharSequence) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m25772(ActivityC10227 activityC10227, C14017 c14017) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        String str = (String) C19400.m44676(activityC10227.f30813);
        if (interfaceC4162 != null && !TextUtils.isEmpty(str) && !c14017.m33610() && TextUtils.equals(str, activityC10227.f30825)) {
            C14459 c14459M25808 = activityC10227.m25808();
            if (TextUtils.equals(str, c14459M25808.m34521())) {
                if (c14459M25808.m34523().isEmpty()) {
                    activityC10227.m25752();
                    return false;
                }
                if (m25677(c14459M25808.m34523(), interfaceC4162.mo4580()) > 0) {
                    activityC10227.m25752();
                    return false;
                }
                int iM32667 = C13588.m32667(str);
                activityC10227.m25752();
                if (iM32667 >= 0) {
                    if (iM32667 >= c14459M25808.m34523().size()) {
                        C13588.m32671(str);
                        return false;
                    }
                    C23632 c23632 = (C23632) c14459M25808.m34523().get(iM32667);
                    m25697(interfaceC4162, c23632);
                    activityC10227.m25693(c23632.m52118());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static void m25831(ActivityC10227 activityC10227) {
        activityC10227.m25693((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25693(CharSequence charSequence) {
        CharSequence charSequenceM52118;
        TextView textView = this.f30762;
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (textView == null || interfaceC4162 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        Iterator it = m25794(interfaceC4162.mo4574()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM52118 = null;
                break;
            }
            C23632 c23632 = (C23632) it.next();
            if (c23632.m52120().m51442()) {
                charSequenceM52118 = c23632.m52118();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM52118)) {
            textView.setText(charSequenceM52118);
            return;
        }
        C14017 c14017Mo4574 = interfaceC4162.mo4574();
        if (c14017Mo4574.m33610()) {
            textView.setText(R.string.MT_Protector);
        } else if (!c14017Mo4574.m33609(1)) {
            textView.setText(R.string.MT_Protector);
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private C14459 m25808() {
        String strM25760;
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 == null) {
            return C14459.m34519(null, null);
        }
        C11197 c11197Mo4595 = ((AbstractC14702) interfaceC1318).mo4595();
        String strM25681 = m25681(c11197Mo4595);
        if (!TextUtils.isEmpty(this.f30825)) {
            strM25760 = this.f30825;
        } else {
            strM25760 = m25760(c11197Mo4595);
        }
        String str = strM25760;
        C14017 c14017Mo4574 = interfaceC1318.mo4574();
        if (c14017Mo4574.m33610()) {
            return C14459.m34519(strM25681, str);
        }
        List listM25794 = m25794(c14017Mo4574);
        if (listM25794.isEmpty()) {
            return C14459.m34519(strM25681, str);
        }
        return new C14459(strM25681, str, listM25794, m25677(listM25794, interfaceC1318.mo4580()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private List m25794(C14017 c14017) {
        ArrayList<C6699> arrayList = new ArrayList();
        AbstractC4628 abstractC4628ListIterator = c14017.m33608().listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            C23190 c23190 = (C23190) abstractC4628ListIterator.next();
            int iM51440 = c23190.m51440();
            int i = c23190.f74548;
            if (iM51440 == 1) {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (c23190.m51439(i2, true)) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C6699(c23190, arrayList2, c23190.m51437(((Integer) arrayList2.get(0)).intValue()), arrayList.size()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (C6699 c6699 : arrayList) {
            arrayList3.add(m25679(c6699.m18250(), false));
            arrayList4.add(m25679(c6699.m18250(), true));
        }
        HashMap mapM25683 = m25683(arrayList3);
        HashMap mapM25684 = m25683(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C6699 c66910 = (C6699) arrayList.get(i3);
            String str = (String) arrayList3.get(i3);
            String strM25803 = m25803(str);
            if (TextUtils.isEmpty(str) || ((Integer) C13843.getOrDefault(mapM25683, strM25803, 0)).intValue() > 1) {
                str = (String) arrayList4.get(i3);
                String strM25804 = m25803(str);
                if (TextUtils.isEmpty(str) || ((Integer) C13843.getOrDefault(mapM25684, strM25804, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c66910.m18249() + 1);
                }
            }
            arrayList5.add(new C23632(c66910.m18247(), c66910.m18248(), str, c66910.m18249()));
        }
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25679(C8353 c8353, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m25694(c8353.f25635, arrayList);
        m25694(m25782(c8353.f25603), arrayList);
        m25694(m25836(c8353.f25608), arrayList);
        int i = c8353.f25625;
        if (i > 0) {
            m25694(i + "ch", arrayList);
        }
        if (z) {
            String strSubstring = c8353.f25614;
            String upperCase = c8353.f25619;
            if (!TextUtils.isEmpty(strSubstring)) {
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    upperCase = null;
                } else {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                }
            } else if (TextUtils.isEmpty(upperCase)) {
                upperCase = null;
            }
            m25694(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m25782(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("und", str)) {
            return null;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String displayLanguage = localeForLanguageTag.getDisplayLanguage(Locale.getDefault());
        if (TextUtils.isEmpty(displayLanguage)) {
            displayLanguage = localeForLanguageTag.getDisplayLanguage(localeForLanguageTag);
        }
        return TextUtils.isEmpty(displayLanguage) ? str : displayLanguage;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m25836(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C3603.m11051(i));
        arrayList.remove("main");
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join("/", arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25697(InterfaceC4162 interfaceC4162, C23632 c23632) {
        interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(1, false).mo17261(1).mo17264(new C12607(c23632.m52120().m51438(), c23632.m52119())).mo17266());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25769(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30813, activityC10227.m25760(c11197), new C3938());
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    private void m25752() {
        C19400.m44671(this.f30813);
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    private void m25744() {
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null) {
            return;
        }
        C11902 c11902Mo4580 = interfaceC4162.mo4580();
        AbstractC20151 it = c11902Mo4580.f35552.values().iterator();
        while (it.hasNext()) {
            if (((C12607) it.next()).f38012.f39853 == 1) {
                interfaceC4162.mo4569(c11902Mo4580.mo29029().mo17262(1, false).mo17261(1).mo17266());
            }
        }
        if (!c11902Mo4580.f35559.contains(1)) {
            return;
        }
        interfaceC4162.mo4569(c11902Mo4580.mo29029().mo17262(1, false).mo17261(1).mo17266());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m25683(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strM25803 = m25803((String) it.next());
            if (!TextUtils.isEmpty(strM25803)) {
                map.put(strM25803, Integer.valueOf(((Integer) C13843.getOrDefault(map, strM25803, 0)).intValue() + 1));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m25803(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25694(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(strTrim)) {
                return;
            }
        }
        arrayList.add(strTrim);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25677(List list, C11902 c11902) {
        AbstractC20151 it = c11902.f35552.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C12607 c12607 = (C12607) it.next();
            if (c12607.f38012.f39853 == 1) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C23632) list.get(i)).m52120().m51438().equals(c12607.f38012)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25811(final ActivityC10227 activityC10227, View view) {
        final MenuItem item;
        int i;
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null) {
            return;
        }
        final C20105 c20105M25784 = activityC10227.m25784();
        List listM46358 = c20105M25784.m46358();
        if (!listM46358.isEmpty()) {
            final C21282 c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48300(8388661);
            C3060 c3060M48304 = c21282.m48304();
            C22090.m49677(c3060M48304);
            boolean[] zArr = new boolean[3];
            for (int i2 = 0; i2 < listM46358.size(); i2++) {
                C21516 c21516 = (C21516) listM46358.get(i2);
                int i3 = C3232.f10166[c21516.f69180.ordinal()];
                if (i3 != 1) {
                    i = 2;
                    if (i3 == 2) {
                        i = 0;
                    } else if (i3 == 3) {
                        i = 1;
                    } else if (i3 != 4) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    i = 0;
                }
                zArr[i] = true;
                c3060M48304.add(i, i2, i2, c21516.m48684()).setCheckable(true);
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (zArr[i4]) {
                    c3060M48304.setGroupCheckable(i4, true, true);
                }
            }
            int iM46360 = c20105M25784.m46360();
            if (iM46360 < 0 || iM46360 >= c3060M48304.size()) {
                item = null;
            } else {
                item = c3060M48304.getItem(iM46360);
                item.setChecked(true);
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.᩷۫ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10227.m25707(this.f67543, item, c21282, c20105M25784, menuItem);
                    return true;
                }
            });
            c21282.m48305();
            return;
        }
        if (((AbstractC14702) interfaceC1318).mo4595() != null && interfaceC1318.mo4574().m33610()) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25707(ActivityC10227 activityC10227, MenuItem menuItem, C21282 c21282, C20105 c20105, MenuItem menuItem2) {
        C14335 c14335;
        boolean z = false;
        if (menuItem != null) {
            c21282.m48304().findItem(menuItem.getItemId()).setChecked(false);
        }
        menuItem2.setChecked(true);
        int itemId = menuItem2.getItemId();
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == 0 || itemId < 0 || itemId >= c20105.m46358().size()) {
            return;
        }
        if (TextUtils.equals(c20105.m46361(), activityC10227.m25681(((AbstractC14702) interfaceC4162).mo4595()))) {
            activityC10227.m25790();
            C21516 c21516 = (C21516) c20105.m46358().get(itemId);
            if (c21516.m48683() != EnumC22221.FILE) {
                C19400.m44671(activityC10227.f30824);
            }
            String strM46359 = c20105.m46359();
            int i = C3232.f10166[c21516.m48683().ordinal()];
            if (i == 1) {
                if (!TextUtils.isEmpty(strM46359)) {
                    C20687.m47302(strM46359);
                }
                if (activityC10227.f30732 == EnumC20811.MANUAL && activityC10227.f30775 != null) {
                    List listM25793 = activityC10227.m25793(c20105.m46359());
                    InterfaceC17889 interfaceC17889Mo16334 = activityC10227.f30775.mo16334();
                    if (interfaceC17889Mo16334 == null) {
                        activityC10227.m25729();
                        activityC10227.m25763((CharSequence) null);
                        return;
                    }
                    C16431 c16431 = activityC10227.f30744;
                    if (c16431 != null && c16431.m38743().mo13919()) {
                        z = true;
                    }
                    C1553 c1553M41661 = C17781.m41661(listM25793, interfaceC17889Mo16334, z);
                    activityC10227.m25722(m25689(activityC10227.f30775.mo16333(), listM25793, c1553M41661, c1553M41661 == null ? EnumC20811.NONE : EnumC20811.AUTO, activityC10227.m25813(c20105.m46359())));
                    return;
                }
                activityC10227.m25729();
                activityC10227.m25763((CharSequence) null);
                return;
            }
            if (i == 2) {
                if (!TextUtils.isEmpty(strM46359)) {
                    C20687.m47299(strM46359, new C14335(EnumC6575.OFF, -1, null));
                }
                interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(3, true).mo17261(3).mo17266());
                activityC10227.m25763((CharSequence) activityC10227.getString(R.string.MT_Protector));
                return;
            }
            if (i == 3) {
                C4582 c4582M48685 = c21516.m48685();
                if (c4582M48685 == null) {
                    return;
                }
                if (!TextUtils.isEmpty(strM46359)) {
                    String strSubstring = activityC10227.f30738;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    if (TextUtils.isEmpty(strSubstring) || (!TextUtils.equals(activityC10227.f30738, c4582M48685.m13476()) && !TextUtils.equals(activityC10227.m25837(activityC10227.f30738), c4582M48685.m13475()))) {
                        c14335 = new C14335(EnumC6575.TRACK, c4582M48685.m13478(), null);
                    } else {
                        c14335 = new C14335(EnumC6575.FILE, -1, strSubstring);
                    }
                    C20687.m47299(strM46359, c14335);
                }
                m25696(interfaceC4162, c4582M48685);
                activityC10227.m25763(c4582M48685.m13474());
                return;
            }
            if (i != 4 || activityC10227.f30775 == null || c21516.m48682() == null) {
                return;
            }
            if (!TextUtils.isEmpty(strM46359)) {
                C20687.m47299(strM46359, new C14335(EnumC6575.FILE, -1, c21516.m48682().m5311().getName()));
            }
            activityC10227.m25722(m25689(activityC10227.f30775.mo16333(), activityC10227.m25793(c20105.m46359()), c21516.m48682(), EnumC20811.MANUAL, activityC10227.m25813(c20105.m46359())));
            return;
        }
        activityC10227.m25763((CharSequence) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25722(C15164 c15164) {
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null || this.f30775 == null || isFinishing() || isDestroyed()) {
            return;
        }
        int iIncrementAndGet = this.f30803.incrementAndGet();
        this.f30783 = iIncrementAndGet;
        InterfaceC17889 interfaceC17889Mo16334 = this.f30775.mo16334();
        if (interfaceC17889Mo16334 == null) {
            return;
        }
        String strM25682 = m25682(interfaceC17889Mo16334);
        long jMax = Math.max(0L, interfaceC4162.getCurrentPosition());
        this.f30792 = false;
        this.f30802.clear();
        m25827();
        m25771(false);
        m25815();
        m25699(new C8110(iIncrementAndGet, this.f30775.mo16333(), interfaceC17889Mo16334, jMax, strM25682, false, null), c15164);
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static void m25779(ActivityC10227 activityC10227) {
        activityC10227.m25763((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m25763(CharSequence charSequence) {
        CharSequence charSequenceM13474;
        String strM25760;
        TextView textView = this.f30782;
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (textView == null || interfaceC1318 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        if (interfaceC1318.mo4580().f35559.contains(3)) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        Iterator it = m25809(interfaceC1318.mo4574()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM13474 = null;
                break;
            }
            C4582 c4582 = (C4582) it.next();
            if (c4582.m13477().m51441(c4582.m13479())) {
                charSequenceM13474 = c4582.m13474();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM13474)) {
            textView.setText(charSequenceM13474);
            return;
        }
        if (this.f30732 == EnumC20811.MANUAL && !TextUtils.isEmpty(this.f30738)) {
            textView.setText(m25837(this.f30738));
            return;
        }
        C14017 c14017Mo4574 = interfaceC1318.mo4574();
        if (c14017Mo4574.m33610()) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (!c14017Mo4574.m33609(3)) {
            C11197 c11197Mo4595 = ((AbstractC14702) interfaceC1318).mo4595();
            if (!TextUtils.isEmpty(this.f30825)) {
                strM25760 = this.f30825;
            } else {
                strM25760 = m25760(c11197Mo4595);
            }
            if (m25793(strM25760).isEmpty()) {
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        textView.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    private C20105 m25784() {
        String strM25760;
        List<C4582> listM25809;
        int i;
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 == null) {
            return C20105.m46357(null, null);
        }
        C11197 c11197Mo4595 = ((AbstractC14702) interfaceC1318).mo4595();
        String strM25681 = m25681(c11197Mo4595);
        if (!TextUtils.isEmpty(this.f30825)) {
            strM25760 = this.f30825;
        } else {
            strM25760 = m25760(c11197Mo4595);
        }
        if (interfaceC1318.mo4574().m33610()) {
            listM25809 = Collections.EMPTY_LIST;
        } else {
            listM25809 = m25809(interfaceC1318.mo4574());
        }
        List<C1553> listM25793 = m25793(strM25760);
        if (!listM25793.isEmpty() && !TextUtils.isEmpty(this.f30738) && m25761(this.f30738, listM25809) != null) {
            ArrayList arrayList = new ArrayList(listM25793.size());
            for (C1553 c1553 : listM25793) {
                if (!TextUtils.equals(this.f30738, c1553.m5311().getPath())) {
                    arrayList.add(c1553);
                }
            }
            listM25793 = arrayList;
        }
        if (listM25809.isEmpty() && listM25793.isEmpty()) {
            return C20105.m46357(strM25681, strM25760);
        }
        ArrayList arrayList2 = new ArrayList(listM25793.size() + listM25809.size() + 2);
        arrayList2.add(new C21516(EnumC22221.AUTO, getString(R.string.MT_Protector), null, null));
        arrayList2.add(new C21516(EnumC22221.OFF, getString(R.string.MT_Protector), null, null));
        for (C4582 c4582 : listM25809) {
            arrayList2.add(new C21516(EnumC22221.TRACK, c4582.m13474(), c4582, null));
        }
        for (C1553 c1554 : listM25793) {
            arrayList2.add(new C21516(EnumC22221.FILE, c1554.m5311().mo36985(), null, c1554));
        }
        C11902 c11902Mo4580 = interfaceC1318.mo4580();
        if (!c11902Mo4580.f35559.contains(3)) {
            AbstractC20151 it = c11902Mo4580.f35552.values().iterator();
            loop3: while (true) {
                if (it.hasNext()) {
                    C12607 c12607 = (C12607) it.next();
                    if (c12607.f38012.f39853 == 3) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            C21516 c21516 = (C21516) arrayList2.get(i2);
                            C4582 c4582M48685 = c21516.m48685();
                            if (c21516.m48683() == EnumC22221.TRACK && c4582M48685 != null && c4582M48685.m13477().m51438().equals(c12607.f38012) && c12607.f38013.contains(Integer.valueOf(c4582M48685.m13479()))) {
                                i = i2;
                                break loop3;
                            }
                        }
                    }
                } else {
                    if (this.f30732 == EnumC20811.MANUAL && !TextUtils.isEmpty(this.f30738)) {
                        i = 0;
                        while (i < arrayList2.size()) {
                            C21516 c21517 = (C21516) arrayList2.get(i);
                            if (c21517.m48683() == EnumC22221.FILE && c21517.m48682() != null && TextUtils.equals(this.f30738, c21517.m48682().m5311().getPath())) {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                        break;
                    }
                    i = 0;
                    break;
                }
            }
        } else {
            i = 1;
        }
        return new C20105(i, strM25681, strM25760, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private List m25809(C14017 c14017) {
        ArrayList<C3171> arrayList = new ArrayList();
        AbstractC4628 abstractC4628ListIterator = c14017.m33608().listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            C23190 c23190 = (C23190) abstractC4628ListIterator.next();
            if (c23190.m51440() == 3) {
                for (int i = 0; i < c23190.f74548; i++) {
                    if (c23190.m51439(i, true)) {
                        arrayList.add(new C3171(c23190, i, c23190.m51437(i), arrayList.size()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (C3171 c3171 : arrayList) {
            arrayList2.add(m25758(c3171.m9722(), false));
            arrayList3.add(m25758(c3171.m9722(), true));
        }
        HashMap mapM25683 = m25683(arrayList2);
        HashMap mapM25684 = m25683(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C3171 c3172 = (C3171) arrayList.get(i2);
            String str = (String) arrayList2.get(i2);
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.MT_Protector) + " " + (c3172.m9725() + 1);
            } else if (((Integer) C13843.getOrDefault(mapM25683, m25803(str), 0)).intValue() > 1) {
                str = (String) arrayList3.get(i2);
                String strM25803 = m25803(str);
                if (TextUtils.isEmpty(str) || ((Integer) C13843.getOrDefault(mapM25684, strM25803, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c3172.m9725() + 1);
                }
            }
            arrayList4.add(new C4582(c3172.m9724(), c3172.m9723(), c3172.m9722().f25621, c3172.m9722().f25635, str, c3172.m9725()));
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m25758(C8353 c8353, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m25694(c8353.f25635, arrayList);
        m25694(m25782(c8353.f25603), arrayList);
        m25694(m25836(c8353.f25608), arrayList);
        if (z) {
            String strSubstring = c8353.f25614;
            String upperCase = c8353.f25619;
            if (!TextUtils.isEmpty(strSubstring)) {
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    upperCase = null;
                } else {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                }
            } else if (TextUtils.isEmpty(upperCase)) {
                upperCase = null;
            }
            m25694(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private List m25793(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f30807)) {
            return Collections.EMPTY_LIST;
        }
        return this.f30804;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m25813(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.f30807) && this.f30723;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15164 m25689(C11197 c11197, List list, C1553 c1553, EnumC20811 enumC20811, boolean z) {
        if (c1553 == null || enumC20811 == EnumC20811.NONE) {
            return C15164.m35863(c11197, list, z);
        }
        C22464 c22464M27766 = c11197.m27766();
        String path = c1553.m5311().getPath();
        C7647 c7647 = new C7647(new Uri.Builder().scheme("mt_media").path(path).build());
        c7647.m20454(c1553.m5312());
        c7647.m20452();
        c7647.m20453(c1553.m5311().mo36985());
        c7647.m20451(path);
        c22464M27766.m50398(Collections.singletonList(c7647.m20450()));
        return new C15164(c22464M27766.m50394(), list, z, enumC20811, c1553.m5311().getPath(), 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C1553 m25685(String str, List list) {
        boolean zEqualsIgnoreCase;
        C16431 c16431 = this.f30744;
        boolean z = c16431 != null && c16431.m38743().mo13919();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553 c1553 = (C1553) it.next();
            String name = c1553.m5311().getName();
            if (name == null || str == null) {
                zEqualsIgnoreCase = false;
            } else {
                zEqualsIgnoreCase = z ? name.equalsIgnoreCase(str) : name.equals(str);
            }
            if (zEqualsIgnoreCase) {
                return c1553;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25812(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30824, activityC10227.m25760(c11197), new C19461());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25797(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30773, activityC10227.m25760(c11197), new C18755());
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    private void m25790() {
        C19400.m44671(this.f30773);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25724(ActivityC10227 activityC10227, C14017 c14017) {
        C4582 c4582M25761;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        C19400 c19400 = activityC10227.f30824;
        C1054 c1054 = (C1054) C19400.m44676(c19400);
        if (interfaceC4162 == null || c1054 == null || c14017.m33610() || !TextUtils.equals(c1054.m3623(), activityC10227.f30825)) {
            return false;
        }
        if (!TextUtils.equals(c1054.m3623(), activityC10227.m25784().m46359())) {
            return false;
        }
        List listM25809 = activityC10227.m25809(c14017);
        if (listM25809.isEmpty() || (c4582M25761 = activityC10227.m25761(c1054.m3624(), listM25809)) == null) {
            return false;
        }
        C19400.m44671(c19400);
        m25696(interfaceC4162, c4582M25761);
        activityC10227.m25763(c4582M25761.m13474());
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m25800(ActivityC10227 activityC10227, C14017 c14017) {
        boolean zEqualsIgnoreCase;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        C5288 c5288 = (C5288) C19400.m44676(activityC10227.f30773);
        if (interfaceC4162 != null && c5288 != null && !c14017.m33610()) {
            String strM15216 = c5288.m15216();
            if (TextUtils.equals(strM15216, activityC10227.f30825) && TextUtils.equals(strM15216, activityC10227.m25784().m46359())) {
                C14335 c14335M47297 = C20687.m47297(strM15216);
                if (c14335M47297 == null) {
                    activityC10227.m25790();
                    return false;
                }
                int i = C3232.f10167[c14335M47297.m34209().ordinal()];
                if (i == 1) {
                    activityC10227.m25790();
                    interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(3, true).mo17261(3).mo17266());
                    activityC10227.m25763((CharSequence) activityC10227.getString(R.string.MT_Protector));
                    return true;
                }
                if (i == 2) {
                    int iM34207 = c14335M47297.m34207();
                    List listM25809 = activityC10227.m25809(c14017);
                    if (!listM25809.isEmpty()) {
                        activityC10227.m25790();
                        if (iM34207 < 0 || iM34207 >= listM25809.size()) {
                            C20687.m47302(strM15216);
                            return false;
                        }
                        C4582 c4582 = (C4582) listM25809.get(iM34207);
                        m25696(interfaceC4162, c4582);
                        activityC10227.m25763(c4582.m13474());
                        return true;
                    }
                } else {
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    String strM34208 = c14335M47297.m34208();
                    if (TextUtils.isEmpty(strM34208)) {
                        activityC10227.m25790();
                        C20687.m47302(strM15216);
                        return false;
                    }
                    if (c5288.m15217()) {
                        activityC10227.m25790();
                        return false;
                    }
                    String strSubstring = activityC10227.f30738;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    C16431 c16431 = activityC10227.f30744;
                    boolean z = c16431 != null && c16431.m38743().mo13919();
                    if (strSubstring == null || strM34208 == null) {
                        zEqualsIgnoreCase = false;
                    } else {
                        zEqualsIgnoreCase = z ? strSubstring.equalsIgnoreCase(strM34208) : strSubstring.equals(strM34208);
                    }
                    if (zEqualsIgnoreCase) {
                        activityC10227.m25790();
                        return false;
                    }
                    if (activityC10227.m25813(strM15216) && activityC10227.m25685(strM34208, activityC10227.m25793(strM15216)) == null) {
                        activityC10227.m25790();
                        C20687.m47302(strM15216);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C4582 m25761(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4582 c4582 = (C4582) it.next();
            if (TextUtils.equals(str, c4582.m13476())) {
                return c4582;
            }
        }
        String strM25837 = m25837(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C4582 c4583 = (C4582) it2.next();
            if (TextUtils.equals(strM25837, c4583.m13475())) {
                return c4583;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25696(InterfaceC4162 interfaceC4162, C4582 c4582) {
        interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(3, false).mo17261(3).mo17264(new C12607(c4582.m13477().m51438(), Collections.singletonList(Integer.valueOf(c4582.m13479())))).mo17266());
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    private void m25729() {
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null) {
            return;
        }
        C11902 c11902Mo4580 = interfaceC4162.mo4580();
        AbstractC20151 it = c11902Mo4580.f35552.values().iterator();
        while (it.hasNext()) {
            if (((C12607) it.next()).f38012.f39853 == 3) {
                interfaceC4162.mo4569(c11902Mo4580.mo29029().mo17262(3, false).mo17261(3).mo17266());
            }
        }
        if (!c11902Mo4580.f35559.contains(3)) {
            return;
        }
        interfaceC4162.mo4569(c11902Mo4580.mo29029().mo17262(3, false).mo17261(3).mo17266());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private String m25837(String str) {
        for (C1553 c1553 : this.f30804) {
            if (TextUtils.equals(str, c1553.m5311().getPath())) {
                return c1553.m5311().mo36985();
            }
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf >= 0 ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float yVelocity;
        boolean z;
        View view = this.f30758;
        if (view != null && view.getVisibility() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f30789 = motionEvent.getRawY();
                this.f30728 = false;
                if (this.f30818 == null) {
                    this.f30818 = VelocityTracker.obtain();
                }
                this.f30818.clear();
                this.f30818.addMovement(motionEvent);
            } else if (action == 1) {
                if (this.f30728) {
                    velocityTracker = this.f30818;
                    if (velocityTracker == null) {
                        this.f30728 = false;
                        View view2 = this.f30746;
                        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f30818.computeCurrentVelocity(1000);
                    yVelocity = this.f30818.getYVelocity();
                    float translationY = this.f30746.getTranslationY();
                    float height = this.f30746.getHeight();
                    if (yVelocity < 1000.0f || (yVelocity > -1000.0f && translationY > height * 0.4f)) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m25799(z);
                    } else {
                        ObjectAnimator.ofFloat(this.f30746, "translationY", translationY, 0.0f).start();
                    }
                    this.f30728 = false;
                    return true;
                }
            } else if (action == 2) {
                if (this.f30818 == null) {
                    this.f30789 = motionEvent.getRawY();
                    this.f30728 = false;
                    VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                    this.f30818 = velocityTrackerObtain;
                    velocityTrackerObtain.clear();
                }
                this.f30818.addMovement(motionEvent);
                if (!this.f30728 && motionEvent.getRawY() - this.f30789 > ViewConfiguration.get(this).getScaledTouchSlop() && !this.f30746.canScrollVertically(-1)) {
                    this.f30728 = true;
                    this.f30789 = motionEvent.getRawY();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (this.f30728) {
                    this.f30746.setTranslationY(Math.max((motionEvent.getRawY() - this.f30789) * 1.5f, 0.0f));
                    return true;
                }
            } else if (action == 3) {
                if (this.f30728) {
                    velocityTracker = this.f30818;
                    if (velocityTracker == null) {
                        this.f30728 = false;
                        View view3 = this.f30746;
                        ObjectAnimator.ofFloat(view3, "translationY", view3.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f30818.computeCurrentVelocity(1000);
                    yVelocity = this.f30818.getYVelocity();
                    float translationY2 = this.f30746.getTranslationY();
                    float height2 = this.f30746.getHeight();
                    if (yVelocity < 1000.0f) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m25799(z);
                    } else {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m25799(z);
                    }
                    this.f30728 = false;
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static void m25753(ActivityC10227 activityC10227) {
        activityC10227.m25799(false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m25783(ActivityC10227 activityC10227) {
        activityC10227.m25799(false);
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25730(ActivityC10227 activityC10227) {
        return activityC10227.f30790.getVisibility() == 4;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m25816(ActivityC10227 activityC10227) {
        if (activityC10227.f30790.getVisibility() == 4) {
            activityC10227.f30794.setVisibility(0);
            activityC10227.f30790.setVisibility(0);
            activityC10227.f30740.setVisibility(0);
            activityC10227.f30811.setImageResource(R.drawable.MT_Protector);
        } else {
            activityC10227.f30794.setVisibility(4);
            activityC10227.f30790.setVisibility(4);
            activityC10227.f30740.setVisibility(4);
            activityC10227.f30811.setImageResource(R.drawable.MT_Protector);
        }
        activityC10227.f30827.m43232();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m25743(ActivityC10227 activityC10227) {
        activityC10227.m25755();
        String strM25739 = activityC10227.m25739();
        if (!TextUtils.isEmpty(strM25739)) {
            activityC10227.f30736 = strM25739;
            activityC10227.f30781 = false;
        } else {
            activityC10227.f30781 = true;
        }
        if (activityC10227.getResources().getConfiguration().orientation == 1) {
            activityC10227.f30772 = EnumC18694.MANUAL;
            if (activityC10227.getRequestedOrientation() != 0) {
                activityC10227.setRequestedOrientation(0);
                return;
            }
            return;
        }
        activityC10227.f30772 = EnumC18694.MANUAL;
        if (activityC10227.getRequestedOrientation() != 1) {
            activityC10227.setRequestedOrientation(1);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m25847(int i) {
        View viewFindViewById = findViewById(i);
        viewFindViewById.setBackground(new C22533());
        return viewFindViewById;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC4927, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        InterfaceC1318 interfaceC1318;
        if (!this.f30745 || ((keyCode = keyEvent.getKeyCode()) != 90 && keyCode != 89 && keyCode != 87 && keyCode != 88 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 79 || keyCode2 == 85) {
                m25845();
            } else if (keyCode2 == 126) {
                InterfaceC4162 interfaceC4162 = this.f30786;
                if (interfaceC4162 != null && C3603.m11031((InterfaceC1318) interfaceC4162, true)) {
                    m25845();
                    return true;
                }
            } else if (keyCode2 == 127 && (interfaceC1318 = this.f30786) != null) {
                ((AbstractC14702) interfaceC1318).mo4570(false);
                return true;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        if (isFinishing() && !isChangingConfigurations()) {
            C10062.m25251(this.f30798);
            this.f30798 = null;
        }
        super.onDestroy();
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.removeCallbacks(this.f30751);
        }
        m25771(true);
        C2547 c2547 = this.f30812;
        C10516 c10516 = this.f30821;
        c10516.m26424(c2547);
        C4925.m14324().removeCallbacks(this.f30743);
        c10516.m26420();
        m25672();
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    private void m25672() {
        this.f30799 = false;
        C16431 c16431 = this.f30744;
        this.f30744 = null;
        final C16657 c16657 = c16431 == null ? null : new C16657(c16431);
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.m43224((InterfaceC1318) null);
        }
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 != null) {
            interfaceC4162.mo4591();
            this.f30786.mo12583();
            this.f30786 = null;
        }
        if (c16657 != null) {
            c16657.m39178();
        }
        m25755();
        this.f30736 = null;
        this.f30781 = false;
        this.f30772 = EnumC18694.NONE;
        m25752();
        m25790();
        m25827();
        this.f30825 = null;
        if (c16431 != null) {
            c16431.m38742();
            c16657.m39176();
        }
        C23713 c23713 = this.f30778;
        this.f30778 = null;
        final RunnableC7412 runnableC7412 = new RunnableC7412(6, c23713);
        this.f30733++;
        this.f30808 = C6404.f19812;
        this.f30739 = null;
        View view = this.f30814;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f30760;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C22720 c22720 = this.f30791;
        this.f30791 = null;
        Future future = this.f30797;
        this.f30797 = null;
        this.f30784++;
        if (future != null) {
            future.cancel(true);
        }
        final C15807 c15807 = this.f30801;
        this.f30801 = null;
        m25839();
        this.f30800 = null;
        C4437 c4437 = this.f30771;
        this.f30771 = null;
        int i = (c22720 == null ? 0 : 1) + (c4437 != null ? 1 : 0);
        if (i == 0) {
            if (c15807 != null) {
                c15807.close();
            }
            if (c16657 != null) {
                c16657.m39177();
            }
            runnableC7412.run();
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(i);
            Runnable runnable = new Runnable() { // from class: l.᩵۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ActivityC10227.f30722;
                    if (atomicInteger.decrementAndGet() != 0) {
                        return;
                    }
                    C15807 c15808 = c15807;
                    if (c15808 != null) {
                        c15808.close();
                    }
                    C16657 c16658 = c16657;
                    if (c16658 != null) {
                        c16658.m39177();
                    }
                    runnableC7412.run();
                }
            };
            if (c22720 != null) {
                c22720.m50777(runnable);
            }
            if (c4437 != null) {
                c4437.m13186(runnable);
            }
        }
        C19130 c19130 = this.f30768;
        this.f30768 = null;
        if (c19130 != null) {
            c19130.m44181();
        }
        C14895 c14895 = this.f30793;
        this.f30793 = null;
        if (c14895 != null) {
            c14895.close();
        }
        this.f30747 = null;
        this.f30822 = null;
        this.f30764 = null;
        C0991 c0991 = this.f30826;
        this.f30826 = null;
        if (c0991 != null) {
            c0991.close();
        }
        VelocityTracker velocityTracker = this.f30818;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30818 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC21449 m25690(ActivityC10227 activityC10227, InterfaceC15097 interfaceC15097, InterfaceC15097 interfaceC15098, InterfaceC15097 interfaceC15099, int i) {
        if (i == 4) {
            return interfaceC15097.mo6247();
        }
        if (i == 1) {
            return new C3026(interfaceC15098.mo6247(), activityC10227.f30768);
        }
        return interfaceC15099.mo6247();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m25774() {
        int i = 0;
        if (ApplicationC20075.f65008.getBoolean("vpffs", false)) {
            i = ApplicationC20075.f65008.getBoolean("vpsm", false) ? 3 : 4;
        }
        this.f30827.m43223(i);
        m25825(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25798(ActivityC10227 activityC10227, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "vpsm", z);
        activityC10227.m25774();
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25817() {
        return ApplicationC20075.f65008.getBoolean("vpao", false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25721(ActivityC10227 activityC10227, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "vpao", z);
        if (!z) {
            activityC10227.m25755();
            if (activityC10227.f30772 != EnumC18694.AUTO) {
                return;
            }
            activityC10227.f30772 = EnumC18694.NONE;
            if (activityC10227.getRequestedOrientation() != -1) {
                activityC10227.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        String strM25739 = activityC10227.m25739();
        if (!TextUtils.isEmpty(strM25739)) {
            if (!TextUtils.equals(strM25739, activityC10227.f30736)) {
                activityC10227.f30736 = null;
            }
            if (!TextUtils.equals(strM25739, activityC10227.f30736)) {
                C19400.m44673(activityC10227.f30750, strM25739);
                activityC10227.m25823();
            }
        }
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 != null) {
            activityC10227.m25698(interfaceC4162.mo4583());
        }
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static boolean m25727() {
        return ApplicationC20075.f65008.getBoolean("vplp", false);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean m25747() {
        return ApplicationC20075.f65008.getBoolean("vpapn", false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25770(ActivityC10227 activityC10227, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "vpun", z);
        activityC10227.m25802();
    }
}
