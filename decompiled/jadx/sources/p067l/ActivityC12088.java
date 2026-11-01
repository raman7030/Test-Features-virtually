package p067l;

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
import bin.p000mt.plus.R;
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
public class ActivityC12088 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۜܿ */
    public static final int[] f33682 = {15, 30, 45, 60, 90};

    /* JADX INFO: renamed from: ᩻ܿ */
    public static final /* synthetic */ int f33683 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public boolean f33684;

    /* JADX INFO: renamed from: ֡ܽ */
    public boolean f33685;

    /* JADX INFO: renamed from: ֡ᩳ */
    public TextView f33686;

    /* JADX INFO: renamed from: ֨ܽ */
    public boolean f33688;

    /* JADX INFO: renamed from: ֨ᩳ */
    public boolean f33689;

    /* JADX INFO: renamed from: ֫ܽ */
    public int f33690;

    /* JADX INFO: renamed from: ֫ܿ */
    public View f33691;

    /* JADX INFO: renamed from: ֫ᩳ */
    public C12641 f33692;

    /* JADX INFO: renamed from: ۖܽ */
    public int f33694;

    /* JADX INFO: renamed from: ۖᩳ */
    public View f33695;

    /* JADX INFO: renamed from: ۗۧ */
    public ImageView f33696;

    /* JADX INFO: renamed from: ۗܽ */
    public String f33697;

    /* JADX INFO: renamed from: ۗᩳ */
    public TextView f33698;

    /* JADX INFO: renamed from: ۘۧ */
    public String f33699;

    /* JADX INFO: renamed from: ۘܽ */
    public C15243 f33700;

    /* JADX INFO: renamed from: ۘᩳ */
    public View f33701;

    /* JADX INFO: renamed from: ۙۧ */
    public View f33702;

    /* JADX INFO: renamed from: ۙܽ */
    public FrameLayout f33703;

    /* JADX INFO: renamed from: ۚۧ */
    public C17984 f33705;

    /* JADX INFO: renamed from: ۚܽ */
    public boolean f33706;

    /* JADX INFO: renamed from: ۚᩳ */
    public View f33707;

    /* JADX INFO: renamed from: ۛۧ */
    public InterfaceC16716 f33708;

    /* JADX INFO: renamed from: ۛܽ */
    public long f33709;

    /* JADX INFO: renamed from: ۛᩳ */
    public boolean f33710;

    /* JADX INFO: renamed from: ۜᩳ */
    public View f33713;

    /* JADX INFO: renamed from: ۟ܽ */
    public Future f33715;

    /* JADX INFO: renamed from: ۟ᩳ */
    public C2643 f33716;

    /* JADX INFO: renamed from: ۠ۧ */
    public C1098 f33717;

    /* JADX INFO: renamed from: ۠ܽ */
    public boolean f33718;

    /* JADX INFO: renamed from: ۠ᩳ */
    public View f33719;

    /* JADX INFO: renamed from: ۡۧ */
    public boolean f33720;

    /* JADX INFO: renamed from: ۡܽ */
    public ImageView f33721;

    /* JADX INFO: renamed from: ۡᩳ */
    public TextView f33722;

    /* JADX INFO: renamed from: ۢۧ */
    public TextView f33723;

    /* JADX INFO: renamed from: ۢܽ */
    public boolean f33724;

    /* JADX INFO: renamed from: ۢᩳ */
    public InterfaceC16716 f33725;

    /* JADX INFO: renamed from: ۤۧ */
    public TextView f33726;

    /* JADX INFO: renamed from: ۤܽ */
    public View f33727;

    /* JADX INFO: renamed from: ۤᩳ */
    public int f33728;

    /* JADX INFO: renamed from: ۧܽ */
    public C20549 f33729;

    /* JADX INFO: renamed from: ۧܿ */
    public TextView f33730;

    /* JADX INFO: renamed from: ۧᩳ */
    public boolean f33731;

    /* JADX INFO: renamed from: ۨۧ */
    public C6585 f33732;

    /* JADX INFO: renamed from: ۫ۧ */
    public ProgressBar f33735;

    /* JADX INFO: renamed from: ۫ܽ */
    public InterfaceC11495 f33736;

    /* JADX INFO: renamed from: ۫ᩳ */
    public ViewGroup f33737;

    /* JADX INFO: renamed from: ۬ۧ */
    public GestureDetectorOnGestureListenerC10747 f33738;

    /* JADX INFO: renamed from: ۬ܽ */
    public C24905 f33739;

    /* JADX INFO: renamed from: ۬ᩳ */
    public TextView[] f33740;

    /* JADX INFO: renamed from: ܰۧ */
    public boolean f33741;

    /* JADX INFO: renamed from: ܰܽ */
    public boolean f33742;

    /* JADX INFO: renamed from: ܰᩳ */
    public TextView f33743;

    /* JADX INFO: renamed from: ܳۧ */
    public volatile int f33744;

    /* JADX INFO: renamed from: ܳܽ */
    public int f33745;

    /* JADX INFO: renamed from: ܳܿ */
    public boolean f33746;

    /* JADX INFO: renamed from: ܳᩳ */
    public InterfaceC6324 f33747;

    /* JADX INFO: renamed from: ܶۧ */
    public View f33748;

    /* JADX INFO: renamed from: ܶܽ */
    public boolean f33749;

    /* JADX INFO: renamed from: ܶᩳ */
    public float f33750;

    /* JADX INFO: renamed from: ܺۧ */
    public View f33751;

    /* JADX INFO: renamed from: ܺܽ */
    public C23961 f33752;

    /* JADX INFO: renamed from: ܺᩳ */
    public boolean f33753;

    /* JADX INFO: renamed from: ܽܽ */
    public C16524 f33754;

    /* JADX INFO: renamed from: ܽܿ */
    public View f33755;

    /* JADX INFO: renamed from: ܽᩳ */
    public View f33756;

    /* JADX INFO: renamed from: ܿۧ */
    public C6053 f33757;

    /* JADX INFO: renamed from: ܿܽ */
    public Future f33758;

    /* JADX INFO: renamed from: ܿܿ */
    public String f33759;

    /* JADX INFO: renamed from: ܿᩳ */
    public boolean f33760;

    /* JADX INFO: renamed from: ᩳۧ */
    public volatile C17194 f33761;

    /* JADX INFO: renamed from: ᩳܽ */
    public C17391 f33762;

    /* JADX INFO: renamed from: ᩴܽ */
    public long f33766;

    /* JADX INFO: renamed from: ᩴᩳ */
    public View f33767;

    /* JADX INFO: renamed from: ᩵ۧ */
    public String f33768;

    /* JADX INFO: renamed from: ᩵ᩳ */
    public ProgressBar f33770;

    /* JADX INFO: renamed from: ᩶ۧ */
    public boolean f33771;

    /* JADX INFO: renamed from: ᩶ܽ */
    public ImageView f33772;

    /* JADX INFO: renamed from: ᩷ܽ */
    public View f33775;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public View f33776;

    /* JADX INFO: renamed from: ᩸ۧ */
    public View f33777;

    /* JADX INFO: renamed from: ᩸ܽ */
    public boolean f33778;

    /* JADX INFO: renamed from: ᩸ᩳ */
    public VelocityTracker f33779;

    /* JADX INFO: renamed from: ᩹ۧ */
    public ViewGroup f33780;

    /* JADX INFO: renamed from: ᩹ܽ */
    public View f33781;

    /* JADX INFO: renamed from: ᩺ۧ */
    public InterfaceC16716 f33783;

    /* JADX INFO: renamed from: ᩺ܽ */
    public boolean f33784;

    /* JADX INFO: renamed from: ᩻ۧ */
    public String f33786;

    /* JADX INFO: renamed from: ᩻ܽ */
    public C3310 f33787;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public C20079 f33788;

    /* JADX INFO: renamed from: ۟ۧ */
    public final C17451 f33714 = new C17451();

    /* JADX INFO: renamed from: ᩵ܽ */
    public C8454 f33769 = C8454.f22684;

    /* JADX INFO: renamed from: ֨ۧ */
    public boolean f33687 = false;

    /* JADX INFO: renamed from: ᩳᩳ */
    public final AtomicInteger f33764 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳܿ */
    public final ArrayList f33763 = new ArrayList();

    /* JADX INFO: renamed from: ۖۧ */
    public EnumC22147 f33693 = EnumC22147.NONE;

    /* JADX INFO: renamed from: ᩴۧ */
    public List f33765 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۜۧ */
    public final C20806 f33711 = new C20806();

    /* JADX INFO: renamed from: ۨܽ */
    public EnumC20135 f33733 = EnumC20135.NONE;

    /* JADX INFO: renamed from: ᩺ᩳ */
    public final C20806 f33785 = new C20806();

    /* JADX INFO: renamed from: ۨᩳ */
    public final C20806 f33734 = new C20806();

    /* JADX INFO: renamed from: ᩷ۧ */
    public final C20806 f33774 = new C20806();

    /* JADX INFO: renamed from: ᩹ᩳ */
    public final C12363 f33782 = new C12363(new Runnable() { // from class: l.ܺ۬ۜ
        @Override // java.lang.Runnable
        public final void run() {
            this.f52388.m27870();
        }
    });

    /* JADX INFO: renamed from: ۙᩳ */
    public final Runnable f33704 = new RunnableC14827(this);

    /* JADX INFO: renamed from: ᩶ᩳ */
    public final C4789 f33773 = new InterfaceC14374() { // from class: l.ۖ۬ۜ
        @Override // p067l.InterfaceC14374
        /* JADX INFO: renamed from: ֫ */
        public final void mo10094() {
            ActivityC12088.m27722(this.f10864);
        }
    };

    /* JADX INFO: renamed from: ۜܽ */
    public final RunnableC20270 f33712 = new RunnableC20270(1, this);

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ۘ */
    public final int mo9138() {
        return 2;
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "VideoPlayerActivity";
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27722(ActivityC12088 activityC12088) {
        activityC12088.m27855();
        activityC12088.m27771();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m27832(ActivityC12088 activityC12088) {
        if (activityC12088.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
            activityC12088.m27714(-9223372036854775807L, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27717(final AbstractActivityC5549 abstractActivityC5549, Intent intent, AbstractC15599 abstractC15599, final InterfaceC19370 interfaceC19370) {
        if (!m27839() || abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed() || !(abstractC15599 instanceof C4744)) {
            return;
        }
        Future futureSubmit = C4081.f8987.submit(new Callable() { // from class: l.ۢ۫ۜ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ActivityC12088.f33683;
                return Integer.valueOf(C20609.m46565(abstractActivityC5549, interfaceC19370.mo26445()));
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
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C4847 c4847;
        C11931 c11931;
        C4847 c4848;
        int iMax;
        int iM10273;
        C14157 c14157;
        InterfaceC16716 c17964;
        final InterfaceC16716 c11280;
        C24571 c24571;
        final InterfaceC16716 interfaceC16716;
        EnumC12621 enumC12621;
        Intent intent;
        int intExtra;
        int i = 0;
        this.f13389 = false;
        setTheme(C19552.m44401());
        super.onCreate(bundle);
        int i2 = 1;
        if (m27839() && (intent = getIntent()) != null && ((intExtra = intent.getIntExtra("bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION", -1)) == 0 || intExtra == 1)) {
            this.f33733 = EnumC20135.AUTO;
            if (getRequestedOrientation() != intExtra) {
                setRequestedOrientation(intExtra);
            }
        }
        m12277(R.layout.MT_Protector);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C6781 c6781 = new C6781(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c6781);
        m27869(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC12721(4, this));
        this.f33703 = (FrameLayout) m12277(R.id.MT_Protector);
        this.f33788 = (C20079) m12277(R.id.MT_Protector);
        this.f33730 = (TextView) m12277(R.id.MT_Protector);
        this.f33722 = (TextView) m27869(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        viewFindViewById.setBackground(new C23784(0));
        this.f33701 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        viewFindViewById2.setBackground(new C23784(0));
        this.f33772 = (ImageView) viewFindViewById2;
        this.f33781 = m12277(R.id.MT_Protector);
        this.f33775 = m12277(R.id.MT_Protector);
        this.f33721 = (ImageView) m12277(R.id.MT_Protector);
        this.f33751 = m12277(R.id.MT_Protector);
        this.f33755 = m12277(R.id.MT_Protector);
        this.f33767 = m12277(R.id.MT_Protector);
        this.f33770 = (ProgressBar) m12277(R.id.MT_Protector);
        this.f33686 = (TextView) m12277(R.id.MT_Protector);
        this.f33702 = m12277(R.id.MT_Protector);
        this.f33735 = (ProgressBar) m12277(R.id.MT_Protector);
        this.f33726 = (TextView) m12277(R.id.MT_Protector);
        this.f33696 = (ImageView) m12277(R.id.MT_Protector);
        this.f33780 = (ViewGroup) m12277(R.id.MT_Protector);
        this.f33701.setOnClickListener(new ViewOnClickListenerC14846(0, this));
        this.f33772.setOnClickListener(new ViewOnClickListenerC18180(0, this));
        this.f33713 = m12277(R.id.MT_Protector);
        this.f33748 = m12277(R.id.MT_Protector);
        this.f33756 = m27869(R.id.MT_Protector);
        this.f33695 = m27869(R.id.MT_Protector);
        this.f33777 = m27869(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f33691 = viewFindViewById3;
        if (viewFindViewById3 instanceof InterfaceC10020) {
            ((InterfaceC10020) viewFindViewById3).mo21461(new C9463(this));
        }
        this.f33776 = m27869(R.id.MT_Protector);
        this.f33727 = m27869(R.id.MT_Protector);
        this.f33776.setOnClickListener(new ViewOnClickListenerC18928(this, i2));
        this.f33727.setOnClickListener(new ViewOnClickListenerC16838(i, this));
        m27869(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۚ۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC12088.m27786(this.f19552);
            }
        });
        this.f33722.setOnClickListener(new ViewOnClickListenerC5054(2, this));
        View viewM12277 = m12277(R.id.MT_Protector);
        this.f33719 = viewM12277;
        this.f33707 = viewM12277.findViewById(R.id.MT_Protector);
        this.f33719.setOnClickListener(new ViewOnClickListenerC21553(0, this));
        C11755.m26984(this.f33755);
        C11755.m26984(this.f33751);
        C11755.m26984(this.f33707);
        C22484.m50434(this.f33780);
        C22484.m50434(this.f33772);
        C22484.m50434(this.f33701);
        C0990 c0990 = (C0990) this.f33707.findViewById(R.id.switch4);
        final C0990 c0991 = (C0990) this.f33707.findViewById(R.id.switch5);
        C0990 c0992 = (C0990) this.f33707.findViewById(R.id.switch7);
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("vpffs", false));
        c0991.setChecked(ApplicationC21448.f67649.getBoolean("vpsm", false));
        c0992.setChecked(m27839());
        c0990.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۙ۬ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC12088.m27735(this.f17657, c0991, z);
            }
        });
        c0991.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ۬ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC12088.m27820(this.f13028, z);
            }
        });
        if (c0990.isChecked()) {
            c0991.setEnabled(true);
        }
        m27796();
        c0992.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۫۬ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ActivityC12088.m27743(this.f40428, z);
            }
        });
        C0990 c0993 = (C0990) this.f33707.findViewById(R.id.switch1);
        c0993.setChecked(ApplicationC21448.f67649.getBoolean("vplp", false));
        c0993.setOnCheckedChangeListener(new C12165());
        C0990 c0994 = (C0990) this.f33707.findViewById(R.id.switch6);
        c0994.setChecked(ApplicationC21448.f67649.getBoolean("vpsp", false));
        c0994.setOnCheckedChangeListener(new C8141());
        C0990 c0995 = (C0990) this.f33707.findViewById(R.id.switch2);
        c0995.setChecked(ApplicationC21448.f67649.getBoolean("vpapn", false));
        c0995.setOnCheckedChangeListener(new C13506());
        TextView textView = (TextView) this.f33707.findViewById(R.id.MT_Protector);
        this.f33723 = textView;
        textView.setText(R.string.MT_Protector);
        TextView textView2 = (TextView) this.f33707.findViewById(R.id.MT_Protector);
        this.f33743 = textView2;
        textView2.setText(R.string.MT_Protector);
        this.f33698 = (TextView) this.f33707.findViewById(R.id.MT_Protector);
        m27855();
        this.f33707.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩺۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC12088.m27828(this.f76819, view);
            }
        });
        this.f33707.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֨۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC12088.m27833(this.f6878, view);
            }
        });
        this.f33707.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۠۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC12088.m27788(this.f28104, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            m27824();
            C0990 c0996 = (C0990) this.f33707.findViewById(R.id.switch3);
            c0996.setChecked(ApplicationC21448.f67649.getBoolean("vpun", true));
            c0996.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܶ۬ۜ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ActivityC12088.m27792(this.f49917, z);
                }
            });
            if (ApplicationC21448.f67649.getBoolean("ins", false)) {
                c0996.setVisibility(0);
            }
            C1717.m43556(getWindow().getDecorView(), new C22894(this, c0996));
        }
        float[] fArr = {0.5f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f};
        int[] iArr = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};
        this.f33740 = new TextView[6];
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        for (int i3 = 0; i3 < 6; i3++) {
            TextView[] textViewArr = this.f33740;
            TextView textView3 = (TextView) this.f33707.findViewById(iArr[i3]);
            textViewArr[i3] = textView3;
            textView3.setBackground(new C23784());
            textView3.setText(decimalFormat.format(fArr[i3]));
            textView3.setTag(Float.valueOf(fArr[i3]));
            textView3.setOnClickListener(new ViewOnClickListenerC23564(i, this));
        }
        String stringExtra = getIntent().getStringExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN");
        this.f33759 = stringExtra;
        InterfaceC16716 c11221 = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            String str = this.f33759;
            C11931 c11932 = str == null ? null : (C11931) C5178.m11081("VideoPlayerUrlArguments:".concat(str));
            if (c11932 == null) {
                C22682.m50799(R.string.MT_Protector);
                finish();
                return;
            } else {
                this.f33746 = true;
                this.f33741 = c11932.m27270();
                c11931 = c11932;
                c4847 = null;
            }
        } else {
            C4847 c4849 = (C4847) C5178.m11081("VideoPlayerArguments");
            if (c4849 == null) {
                c4849 = C4847.m10272(this, "video/");
            }
            if (c4849 == null || c4849.m10274().isEmpty()) {
                c4849 = null;
            } else {
                int iM10274 = c4849.m10273();
                if (iM10274 < 0 || iM10274 >= c4849.m10274().size()) {
                    iM10274 = 0;
                }
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) c4849.m10274().get(iM10274);
                if (!C11931.m27266(interfaceC19370.getName())) {
                    List listM10274 = c4849.m10274();
                    ArrayList arrayList = new ArrayList(listM10274.size());
                    boolean z = false;
                    int size = 0;
                    for (int i4 = 0; i4 < listM10274.size(); i4++) {
                        InterfaceC19370 interfaceC19371 = (InterfaceC19370) listM10274.get(i4);
                        if (C11931.m27266(interfaceC19371.getName())) {
                            z = true;
                        } else {
                            if (i4 == iM10274) {
                                size = arrayList.size();
                            }
                            arrayList.add(interfaceC19371);
                        }
                    }
                    if (z) {
                        c4848 = new C4847(c4849.m10275(), arrayList, size);
                    } else if (iM10274 != c4849.m10273()) {
                        c4849 = new C4847(c4849.m10275(), listM10274, iM10274);
                    }
                } else if ((c4849.m10275() instanceof C4744) || (c4849.m10275() instanceof AbstractC5375)) {
                    c4848 = new C4847(c4849.m10275(), Collections.singletonList(interfaceC19370), 0);
                } else {
                    c4849 = null;
                }
                c4849 = c4848;
            }
            if (c4849 == null) {
                C22682.m50799(R.string.MT_Protector);
                finish();
                return;
            } else {
                c4847 = c4849;
                c11931 = null;
            }
        }
        C1883.m50126(this);
        this.f33788.m45494();
        ViewGroup viewGroup = this.f33703;
        View viewM45495 = this.f33788.m45495();
        if (viewM45495 != null) {
            ViewParent parent = viewM45495.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
                iMax = Math.max(0, viewGroup.indexOfChild(viewM45495));
            } else {
                iMax = 1;
            }
            viewM45495.setVisibility(8);
        } else {
            iMax = 1;
        }
        C2643 c2643 = new C2643(this, null);
        c2643.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c2643.setClickable(false);
        c2643.setFocusable(false);
        viewGroup.addView(c2643, iMax);
        this.f33716 = c2643;
        this.f33737 = viewGroup;
        this.f33728 = iMax;
        m27847(this.f33788.m45492());
        C2643 c2644 = this.f33716;
        if (c2644 != null) {
            c2644.m4034();
            c2644.m4037(new C24023(-855310, 0, 0, 1, -1342177280, null));
            c2644.m4035(0.04f);
            c2644.m4038();
        }
        this.f33738 = new GestureDetectorOnGestureListenerC10747(this);
        final GestureDetector gestureDetector = new GestureDetector(this, this.f33738);
        this.f33788.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩸۫ۜ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ActivityC12088.m27728(this.f72008, gestureDetector, motionEvent);
                return true;
            }
        });
        if (c11931 != null) {
            this.f33736 = new C7907(c11931, getString(R.string.MT_Protector));
            c14157 = null;
        } else {
            if (bundle == null || (iM10273 = bundle.getInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", c4847.m10273())) < 0 || iM10273 >= c4847.m10274().size()) {
                iM10273 = c4847.m10273();
            }
            c14157 = new C14157(iM10273, c4847.m10274());
            this.f33736 = c14157;
            this.f33741 = C11931.m27266(c14157.mo18259().getName());
        }
        if (this.f33741 && bundle != null) {
            Bundle bundle2 = bundle.getBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION");
            this.f33692 = (bundle2 == null || bundle2.getInt("schema", 0) != 1 || bundle2.getInt("matching_ordinal", -1) < 0) ? null : new C12641(bundle2.getInt("width", -1), bundle2.getInt("height", -1), bundle2.getInt("average_bitrate", -1), bundle2.getInt("peak_bitrate", -1), bundle2.getFloat("frame_rate", -1.0f), bundle2.getString("codecs"), bundle2.getString("sample_mime_type"), bundle2.getInt("matching_ordinal"));
        }
        if (this.f33736.size() <= 1) {
            this.f33727.setEnabled(false);
            this.f33776.setEnabled(false);
            this.f33727.setAlpha(0.33f);
            this.f33776.setAlpha(0.33f);
        }
        this.f33739 = C22224.m50060(this);
        this.f33787 = new C3310();
        if (c14157 != null) {
            if (this.f33741) {
                enumC12621 = EnumC12621.HLS_DIRECT;
            } else {
                enumC12621 = EnumC12621.NORMAL;
            }
            C17984 c17984 = new C17984(this, c4847.m10275(), c14157, enumC12621, this.f33739);
            this.f33705 = c17984;
            if (this.f33741 || !(c4847.m10275() instanceof AbstractC5375)) {
                c11221 = c17984;
            } else {
                C24905 c24905 = this.f33739;
                final C17984 c17985 = this.f33705;
                C12826.requireNonNull(c17985);
                c11221 = new C11221(c24905, (C23545) new InterfaceC16716() { // from class: l.᩹۫ۜ
                    @Override // p067l.InterfaceC16716
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC22753 mo8449() {
                        C17984 c17986 = c17985;
                        c17986.getClass();
                        return new C5106(c17986);
                    }
                }, (InterfaceC16716) this.f33705, new C5781(this, c24905));
            }
            this.f33705.m40960(new InterfaceC8054() { // from class: l.᩶۫ۜ
                @Override // java.util.function.IntConsumer
                public final void accept(int i5) {
                    ActivityC12088.m27723(this.f67927, i5);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
                    mo18722((Integer) obj);
                }

                @Override // p067l.InterfaceC8054
                /* JADX INFO: renamed from: ܽ */
                public final /* synthetic */ void mo18722(Integer num) {
                    C12078.m27664((InterfaceC8054) this, num);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C12078.m27663((InterfaceC8054) this, intConsumer);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
        }
        if (c11931 == null) {
            c17964 = new C12024();
        } else {
            c17964 = new C17964(c11931.m27271(), c11931.m27273());
        }
        this.f33725 = c17964;
        C19938 c19938 = new C19938(c11221, c17964, this.f33739);
        C9736 c9736 = new C9736(this);
        c9736.m22760();
        C20434 c20434 = new C20434();
        c20434.m46117();
        C17984 c17986 = this.f33705;
        InterfaceC21775 c16701 = c20434;
        if (c17986 != null) {
            c16701 = new C16701(c20434, c17986);
        }
        C23925 c23925 = new C23925(c19938, c16701);
        c23925.m52995(new C19541());
        if (this.f33741) {
            this.f33729 = new C20549(new RunnableC22041(5, this));
            C24905 c24906 = this.f33739;
            if (c24906 == null) {
                throw new IllegalStateException("Media cache session is missing");
            }
            final InterfaceC16716 interfaceC16717 = this.f33705;
            if (interfaceC16717 != null && c4847 != null) {
                if (c4847.m10275() instanceof AbstractC5375) {
                    c24571 = new C24571(c24906, interfaceC16717, new C23883(this, c24906), C22224.m50062(), EnumC17865.f53333, new C11792(), null);
                    final C17984 c17987 = this.f33705;
                    C12826.requireNonNull(c17987);
                    c11280 = new C11221(c24906, new InterfaceC16716() { // from class: l.᩹۫ۜ
                        @Override // p067l.InterfaceC16716
                        /* JADX INFO: renamed from: ֫ */
                        public final InterfaceC22753 mo8449() {
                            C17984 c17988 = c17987;
                            c17988.getClass();
                            return new C5106(c17988);
                        }
                    }, this.f33705, new C15516(this, c24906));
                } else {
                    c11280 = interfaceC16717;
                    interfaceC16716 = c11280;
                }
                InterfaceC22852 interfaceC22852 = new InterfaceC22852() { // from class: l.֫۫ۜ
                    @Override // p067l.InterfaceC22852
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC22753 mo8240(int i5) {
                        return ActivityC12088.m27712(this.f9026, interfaceC16717, c11280, interfaceC16716, i5);
                    }
                };
                this.f33708 = interfaceC16716;
                this.f33783 = c11280;
                C12123 c12123 = new C12123(interfaceC22852);
                c12123.m28019(new C14612(this.f33729, this.f33754));
                c12123.m28020((InterfaceC12878) new C19541());
                c23925.m52994(c12123);
            } else {
                interfaceC16717 = this.f33725;
                C12826.requireNonNull(interfaceC16717);
                C16524 c16524 = new C16524();
                this.f33754 = c16524;
                C24571 c24572 = new C24571(c24906, interfaceC16717, new InterfaceC24631() { // from class: l.᩺ۚۜ
                    @Override // p067l.InterfaceC24631
                    /* JADX INFO: renamed from: ֫ */
                    public final String mo12962(C5318 c5318) {
                        return C22224.m50054(c5318.f12514, interfaceC16717);
                    }
                }, C22224.m50062(), EnumC17865.f53335, new C11792(), c16524);
                c11280 = new C11280(c16524, new C11221(c24906, interfaceC16717, new InterfaceC24631() { // from class: l.۟۬ۜ
                    @Override // p067l.InterfaceC24631
                    /* JADX INFO: renamed from: ֫ */
                    public final String mo12962(C5318 c5318) {
                        int i5 = ActivityC12088.f33683;
                        return C22224.m50054(c5318.f12514, interfaceC16717);
                    }
                }), interfaceC16717);
                c24571 = c24572;
            }
            C24571 c24573 = c24571;
            interfaceC16716 = interfaceC16717;
            interfaceC16717 = c24573;
            InterfaceC22852 interfaceC22853 = new InterfaceC22852() { // from class: l.֫۫ۜ
                @Override // p067l.InterfaceC22852
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC22753 mo8240(int i5) {
                    return ActivityC12088.m27712(this.f9026, interfaceC16717, c11280, interfaceC16716, i5);
                }
            };
            this.f33708 = interfaceC16716;
            this.f33783 = c11280;
            C12123 c12124 = new C12123(interfaceC22853);
            c12124.m28019(new C14612(this.f33729, this.f33754));
            c12124.m28020((InterfaceC12878) new C19541());
            c23925.m52994(c12124);
        }
        C17722 c17722 = new C17722(this, c9736, c23925);
        c17722.m40276();
        c17722.m40277();
        InterfaceC6324 interfaceC6324M40273 = c17722.m40273();
        this.f33747 = interfaceC6324M40273;
        this.f33788.m45490(interfaceC6324M40273);
        this.f33756.setOnClickListener(new View.OnClickListener() { // from class: l.֡۬ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC12088.m27811(this.f4684);
            }
        });
        this.f33747.mo6794(0);
        this.f33747.mo6819(new C15497(this));
        this.f33784 = true;
        C20079 c20079 = this.f33788;
        if (c20079 == null) {
            return;
        }
        RunnableC20270 runnableC20270 = this.f33712;
        c20079.removeCallbacks(runnableC20270);
        this.f33788.post(runnableC20270);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27728(ActivityC12088 activityC12088, GestureDetector gestureDetector, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            GestureDetectorOnGestureListenerC10747 gestureDetectorOnGestureListenerC10747 = activityC12088.f33738;
            int i = gestureDetectorOnGestureListenerC10747.f29798;
            gestureDetectorOnGestureListenerC10747.f29798 = -1;
            gestureDetectorOnGestureListenerC10747.f29802 = false;
            ActivityC12088 activityC12089 = gestureDetectorOnGestureListenerC10747.f29799;
            boolean z = activityC12089.f33687;
            if (!z && !activityC12089.f33706 && i == 0) {
                m27778(activityC12089);
                ((AbstractC16341) activityC12089.f33747).seekTo(gestureDetectorOnGestureListenerC10747.f29801);
                activityC12089.m27756();
            } else if (!z && activityC12089.f33702.getVisibility() != 8) {
                activityC12089.f33702.setVisibility(8);
            }
            gestureDetectorOnGestureListenerC10747.m24755();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27723(ActivityC12088 activityC12088, int i) {
        if (i == -2) {
            activityC12088.f33702.setVisibility(8);
            activityC12088.f33687 = false;
        } else {
            if (i == -1) {
                activityC12088.f33687 = true;
                activityC12088.f33702.setVisibility(0);
                activityC12088.f33726.setVisibility(0);
                activityC12088.f33696.setVisibility(8);
                activityC12088.f33726.setText(R.string.MT_Protector);
                return;
            }
            activityC12088.f33735.setProgress(i * 10);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public static /* synthetic */ void m27811(ActivityC12088 activityC12088) {
        activityC12088.m27867();
        activityC12088.f33788.m45498();
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public static void m27846(final ActivityC12088 activityC12088) {
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        if (interfaceC3621 != null) {
            AbstractC16341 abstractC16341 = (AbstractC16341) interfaceC3621;
            if (abstractC16341.m37146()) {
                if (activityC12088.f33746 && activityC12088.f33741) {
                    boolean z = activityC12088.f33706;
                    activityC12088.f33706 = true;
                    boolean zM37147 = abstractC16341.m37147();
                    activityC12088.f33688 = zM37147;
                    if (zM37147) {
                        activityC12088.f33718 = false;
                    } else if (interfaceC3621.mo6835() == 4) {
                        activityC12088.f33718 = true;
                    }
                    activityC12088.m27865(true);
                    if (!z) {
                        String str = activityC12088.f33786;
                        if (!TextUtils.isEmpty(str)) {
                            C24157.m53408(str);
                        }
                        activityC12088.m27842();
                        abstractC16341.mo6813();
                    }
                    activityC12088.m27809();
                    return;
                }
                if (activityC12088.f33749 || activityC12088.isFinishing() || activityC12088.isDestroyed()) {
                    return;
                }
                activityC12088.f33749 = true;
                String str2 = activityC12088.f33786;
                if (!TextUtils.isEmpty(str2)) {
                    C24157.m53408(str2);
                }
                activityC12088.f33786 = null;
                C11931.m27268(activityC12088.f33759);
                activityC12088.f33759 = null;
                InterfaceC6324 interfaceC6324 = activityC12088.f33747;
                if (interfaceC6324 != null) {
                    interfaceC6324.stop();
                    ((AbstractC16341) activityC12088.f33747).mo6805();
                }
                C20671 c20671BuildDialog = activityC12088.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡۫ۜ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = ActivityC12088.f33683;
                        this.f4640.finish();
                    }
                });
                c20671BuildDialog.m46722(false);
                c20671BuildDialog.m46732();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27865(boolean z) {
        View view = this.f33691;
        if (view != null) {
            boolean z2 = !z;
            view.setEnabled(z2);
            this.f33691.setVisibility(z ? 8 : 0);
            this.f33691.setFocusable(z2);
            this.f33691.setImportantForAccessibility(z ? 4 : 0);
        }
        View view2 = this.f33713;
        if (view2 != null) {
            view2.setVisibility(z ? 8 : 0);
        }
        View view3 = this.f33748;
        if (view3 != null) {
            view3.setVisibility(z ? 8 : 0);
        }
        C20079 c20079 = this.f33788;
        if (c20079 != null) {
            boolean z3 = !z;
            c20079.m45493(z3);
            this.f33788.m45491(z3);
        }
        View view4 = this.f33695;
        if (view4 != null) {
            view4.setVisibility(z ? 8 : 0);
        }
        View view5 = this.f33777;
        if (view5 != null) {
            view5.setVisibility(z ? 8 : 0);
        }
        View view6 = this.f33776;
        if (view6 != null) {
            view6.setVisibility(z ? 8 : 0);
        }
        View view7 = this.f33727;
        if (view7 != null) {
            view7.setVisibility(z ? 8 : 0);
        }
        if (z) {
            View view8 = this.f33767;
            if (view8 != null) {
                view8.setVisibility(8);
                this.f33767.setTranslationX(0.0f);
                this.f33767.setTranslationY(0.0f);
            }
            m27756();
            GestureDetectorOnGestureListenerC10747 gestureDetectorOnGestureListenerC10747 = this.f33738;
            if (gestureDetectorOnGestureListenerC10747 != null) {
                ActivityC12088 activityC12088 = gestureDetectorOnGestureListenerC10747.f29799;
                if (gestureDetectorOnGestureListenerC10747.f29798 == 0) {
                    gestureDetectorOnGestureListenerC10747.f29798 = -2;
                }
                m27778(activityC12088);
                activityC12088.m27756();
                this.f33738.m24755();
            }
        }
        m27809();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ֫ */
    public void m27809() {
        View view = this.f33756;
        if (view == null) {
            return;
        }
        boolean z = this.f33718;
        view.setEnabled(!z);
        this.f33756.setAlpha(!z ? 1.0f : 0.33f);
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m27867() {
        InterfaceC3621 interfaceC3621 = this.f33747;
        if (interfaceC3621 == null) {
            return;
        }
        if (this.f33706) {
            if (this.f33718) {
                return;
            }
            if (!C5792.m13007(interfaceC3621, true)) {
                ((AbstractC16341) interfaceC3621).mo6802(false);
                return;
            }
            if (!this.f33688) {
                C5792.m13006(interfaceC3621);
                return;
            }
            InterfaceC3621 interfaceC3622 = this.f33747;
            if (interfaceC3622 == null || this.f33718) {
                return;
            }
            AbstractC16341 abstractC16341 = (AbstractC16341) interfaceC3622;
            abstractC16341.mo6813();
            if (interfaceC3622.mo6835() == 1) {
                interfaceC3622.mo6816();
            }
            abstractC16341.mo6802(true);
            return;
        }
        if (!C5792.m13007(interfaceC3621, true)) {
            AbstractC16341 abstractC16342 = (AbstractC16341) interfaceC3621;
            if (abstractC16342.mo6821(1)) {
                abstractC16342.pause();
                return;
            }
            return;
        }
        C5792.m13006(interfaceC3621);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27747(ActivityC12088 activityC12088, C17702 c17702) {
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        if (interfaceC6324 == null || !activityC12088.f33706 || !activityC12088.f33688 || c17702.f52873 != 1002 || activityC12088.f33720) {
            return false;
        }
        activityC12088.f33720 = true;
        boolean zMo6839 = interfaceC6324.mo6839();
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        if (interfaceC3621 != null && !activityC12088.f33718) {
            AbstractC16341 abstractC16341 = (AbstractC16341) interfaceC3621;
            abstractC16341.mo6813();
            interfaceC3621.mo6816();
            if (zMo6839) {
                abstractC16341.mo6802(true);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public static boolean m27843(ActivityC12088 activityC12088) {
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        if (activityC12088.f33706 && !activityC12088.f33778 && interfaceC6324 != null) {
            C13680 c13680Mo6812 = interfaceC6324.mo6812();
            AbstractC21520 it = c13680Mo6812.f38562.values().iterator();
            while (it.hasNext()) {
                C14350 c14350 = (C14350) it.next();
                if (c14350.f41039.f42920 == 2 && !c14350.f41040.isEmpty()) {
                    activityC12088.f33778 = true;
                    activityC12088.f33692 = null;
                    boolean zMo6839 = interfaceC6324.mo6839();
                    interfaceC6324.mo6801(c13680Mo6812.mo31081().mo19200(2, false).mo19199(2).mo19204());
                    InterfaceC3621 interfaceC3621 = activityC12088.f33747;
                    if (interfaceC3621 != null && !activityC12088.f33718) {
                        if (activityC12088.f33688) {
                            ((AbstractC16341) interfaceC3621).mo6813();
                        }
                        interfaceC3621.mo6816();
                        if (zMo6839) {
                            ((AbstractC16341) interfaceC3621).mo6802(true);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠֫ */
    public static void m27772(final ActivityC12088 activityC12088) {
        if (activityC12088.f33685 || activityC12088.isFinishing() || activityC12088.isDestroyed()) {
            return;
        }
        activityC12088.f33685 = true;
        C20671 c20671BuildDialog = activityC12088.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ۫ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC12088.m27773(this.f19514);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3428(0, activityC12088));
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.۠۫ۜ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityC12088.m27755(this.f28081);
            }
        });
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m27773(ActivityC12088 activityC12088) {
        activityC12088.f33685 = false;
        activityC12088.f33720 = false;
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        if (interfaceC3621 == null || activityC12088.f33718) {
            return;
        }
        if (activityC12088.f33688) {
            ((AbstractC16341) interfaceC3621).mo6813();
        }
        interfaceC3621.mo6816();
        ((AbstractC16341) interfaceC3621).mo6802(true);
    }

    /* JADX INFO: renamed from: ֨֫ */
    public static void m27698(ActivityC12088 activityC12088) {
        if (activityC12088.f33771 || activityC12088.isFinishing() || activityC12088.isDestroyed()) {
            return;
        }
        activityC12088.f33771 = true;
        C20671 c20671BuildDialog = activityC12088.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4770(activityC12088, 0));
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ۘ */
    public static void m27755(ActivityC12088 activityC12088) {
        C11931.m27268(activityC12088.f33759);
        activityC12088.f33759 = null;
        activityC12088.finish();
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public static void m27767(ActivityC12088 activityC12088) {
        C11931.m27268(activityC12088.f33759);
        activityC12088.f33759 = null;
        activityC12088.finish();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m27817(ActivityC12088 activityC12088) {
        C11931.m27268(activityC12088.f33759);
        activityC12088.f33759 = null;
        activityC12088.finish();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m27848(ActivityC12088 activityC12088) {
        C11931.m27268(activityC12088.f33759);
        activityC12088.f33759 = null;
        activityC12088.finish();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStart() {
        C20079 c20079;
        super.onStart();
        C1459 c1459M12280 = m12280();
        c1459M12280.m32667(2);
        c1459M12280.m32664(7);
        boolean z = this.f33784;
        if (z) {
            if (!z || (c20079 = this.f33788) == null) {
                return;
            }
            RunnableC20270 runnableC20270 = this.f33712;
            c20079.removeCallbacks(runnableC20270);
            this.f33788.post(runnableC20270);
            return;
        }
        InterfaceC3621 interfaceC3621 = this.f33747;
        if (interfaceC3621 != null) {
            if (this.f33706 && this.f33688) {
                ((AbstractC16341) interfaceC3621).mo6813();
                if (this.f33731) {
                    ((AbstractC16341) this.f33747).mo6802(true);
                    return;
                }
                return;
            }
            if (this.f33731) {
                ((AbstractC16341) interfaceC3621).mo6802(true);
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
                    int i = ActivityC12088.f33683;
                    if (decorView.hasWindowFocus()) {
                        C1459 c1459M12280 = this.f15393.m12280();
                        c1459M12280.m32667(2);
                        c1459M12280.m32664(7);
                    }
                }
            });
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC0904, p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        this.f33710 = false;
        m27845();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStop() {
        InterfaceC6324 interfaceC6324;
        super.onStop();
        C20079 c20079 = this.f33788;
        if (c20079 != null) {
            c20079.removeCallbacks(this.f33712);
        }
        m27842();
        if (this.f33715 != null) {
            this.f33784 = true;
            m27793(true);
        }
        GestureDetectorOnGestureListenerC10747 gestureDetectorOnGestureListenerC10747 = this.f33738;
        if (gestureDetectorOnGestureListenerC10747 != null) {
            gestureDetectorOnGestureListenerC10747.m24755();
        }
        InterfaceC6324 interfaceC6325 = this.f33747;
        if (interfaceC6325 != null) {
            int iMo6835 = interfaceC6325.mo6835();
            boolean z = (!this.f33747.mo6839() || iMo6835 == 1 || iMo6835 == 4) ? false : true;
            this.f33731 = z;
            if (z) {
                ((AbstractC16341) this.f33747).mo6802(false);
            }
        } else {
            this.f33731 = false;
        }
        if (!this.f33706 && (interfaceC6324 = this.f33747) != null && this.f33736 != null) {
            String str = this.f33786;
            long currentPosition = interfaceC6324.getCurrentPosition();
            long duration = this.f33747.getDuration();
            if (duration != -9223372036854775807L && !TextUtils.isEmpty(str)) {
                C24157.m53406(str, currentPosition, duration);
            }
        }
        if (isFinishing()) {
            m27694();
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public final void m27870() {
        this.f33731 = false;
        this.f33784 = false;
        C20079 c20079 = this.f33788;
        if (c20079 != null) {
            c20079.removeCallbacks(this.f33712);
        }
        GestureDetectorOnGestureListenerC10747 gestureDetectorOnGestureListenerC10747 = this.f33738;
        if (gestureDetectorOnGestureListenerC10747 != null) {
            gestureDetectorOnGestureListenerC10747.m24755();
        }
        InterfaceC3621 interfaceC3621 = this.f33747;
        if (interfaceC3621 != null) {
            ((AbstractC16341) interfaceC3621).mo6802(false);
        }
        getWindow().clearFlags(128);
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C12641 c12641;
        super.onSaveInstanceState(bundle);
        InterfaceC11495 interfaceC11495 = this.f33736;
        if (interfaceC11495 != null) {
            bundle.putInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", interfaceC11495.mo18261());
        }
        if (this.f33741) {
            C12641 c12642 = this.f33692;
            if (this.f33747 != null) {
                List listM40985 = C18004.m40985(getResources(), this.f33747.mo6806());
                int iM40983 = C18004.m40983(listM40985, this.f33747.mo6812());
                if (iM40983 <= 0 || iM40983 > listM40985.size()) {
                    c12641 = null;
                } else {
                    int i = iM40983 - 1;
                    C9405 c9405 = (C9405) listM40985.get(i);
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C10307 c10307M21900 = ((C9405) listM40985.get(i3)).m21900();
                        C10307 c10307M21901 = c9405.m21900();
                        if (c10307M21900.f28547 == c10307M21901.f28547 && c10307M21900.f28523 == c10307M21901.f28523 && c10307M21900.f28537 == c10307M21901.f28537 && c10307M21900.f28529 == c10307M21901.f28529 && Float.compare(c10307M21900.f28510, c10307M21901.f28510) == 0 && TextUtils.equals(c10307M21900.f28533, c10307M21901.f28533) && TextUtils.equals(c10307M21900.f28528, c10307M21901.f28528)) {
                            i2++;
                        }
                    }
                    C10307 c10307M21902 = c9405.m21900();
                    c12641 = new C12641(c10307M21902.f28547, c10307M21902.f28523, c10307M21902.f28537, c10307M21902.f28529, c10307M21902.f28510, c10307M21902.f28533, c10307M21902.f28528, i2);
                }
                if (c12641 != null) {
                    c12642 = c12641;
                }
            }
            if (c12642 != null) {
                bundle.putBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION", c12642.m29070());
            }
        }
    }

    @Override // p067l.AbstractActivityC5549, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f33751.getVisibility() == 4) {
            this.f33772.setImageResource(R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m27750(ActivityC12088 activityC12088) {
        activityC12088.m27697();
        activityC12088.f33736.mo18257();
        activityC12088.m27714(-9223372036854775807L, false);
        activityC12088.f33788.m45498();
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public static void m27757(ActivityC12088 activityC12088) {
        activityC12088.m27697();
        activityC12088.f33736.mo18257();
        activityC12088.m27714(-9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m27860(ActivityC12088 activityC12088) {
        activityC12088.m27697();
        activityC12088.f33736.mo18262();
        activityC12088.m27714(-9223372036854775807L, false);
        activityC12088.f33788.m45498();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m27713(int i, Bitmap bitmap) {
        View view;
        if (i != this.f33694 || this.f33721 == null || (view = this.f33775) == null || view.getVisibility() != 0) {
            return;
        }
        if (bitmap == null && this.f33724) {
            m27756();
            m27852();
        } else {
            this.f33721.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27726(ActivityC12088 activityC12088, int i, C15243 c15243) {
        if (i != activityC12088.f33694) {
            return;
        }
        activityC12088.f33700 = c15243;
        View view = activityC12088.f33775;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        activityC12088.m27784(activityC12088.f33766, activityC12088.f33724);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static C9209 m27709(final ActivityC12088 activityC12088, long j, boolean z, final boolean z2) {
        InterfaceC11495 interfaceC11495;
        C13823 c13823M40958;
        C13660 c13660;
        C3310 c3310;
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        C9209 c9209M27784 = null;
        if (interfaceC6324 == null || (interfaceC11495 = activityC12088.f33736) == null || activityC12088.f33775 == null || activityC12088.f33721 == null) {
            return null;
        }
        if (activityC12088.f33706) {
            activityC12088.m27756();
            return null;
        }
        InterfaceC19370 interfaceC19370Mo18259 = interfaceC11495.mo18259();
        if (activityC12088.f33741) {
            InterfaceC6324 interfaceC6325 = activityC12088.f33747;
            C20549 c20549 = activityC12088.f33729;
            InterfaceC16716 interfaceC16716 = activityC12088.f33708;
            InterfaceC16716 interfaceC16717 = activityC12088.f33783;
            C24905 c24905 = activityC12088.f33739;
            C3310 c3311 = activityC12088.f33787;
            if (interfaceC6325 == null || c20549 == null || interfaceC16716 == null || interfaceC16717 == null || c24905 == null || c3311 == null || Build.VERSION.SDK_INT < 23 || !c24905.m54692()) {
                activityC12088.m27756();
                return null;
            }
            C4455 c4455M46479 = c20549.m46479();
            if (c4455M46479 == null) {
                activityC12088.m27756();
                return null;
            }
            if (z2) {
                activityC12088.m27861();
                C3310 c3312 = activityC12088.f33787;
                if (c3312 == null) {
                    activityC12088.m27756();
                    return null;
                }
                C6585 c6585 = activityC12088.f33732;
                if (c6585 != null) {
                    c6585.m15065();
                }
                activityC12088.f33721.setImageBitmap(null);
                c3310 = c3312;
            } else {
                c3310 = c3311;
            }
            int i = activityC12088.f33690;
            long j2 = 1 + activityC12088.f33709;
            activityC12088.f33709 = j2;
            activityC12088.f33766 = j;
            activityC12088.f33724 = z;
            C4712 c4712 = new C4712(i, j2, activityC12088.f33694, j, z, c4455M46479, interfaceC16716, interfaceC16717, c24905, c3310, activityC12088.f33705);
            activityC12088.f33714.m39785(c4712);
            long jM9998 = c4712.m9998();
            boolean zM9994 = c4712.m9994();
            View view = activityC12088.f33775;
            if (view != null && activityC12088.f33721 != null && view.getVisibility() == 0) {
                c9209M27784 = activityC12088.m27784(jM9998, zM9994);
            }
            C9209 c9209M27868 = activityC12088.m27868();
            return c9209M27868 != null ? c9209M27868 : c9209M27784;
        }
        if (interfaceC19370Mo18259 != null) {
            C17984 c17984 = activityC12088.f33705;
            if (c17984 == null) {
                c13823M40958 = C13823.f39053;
            } else {
                c13823M40958 = c17984.m40958(interfaceC19370Mo18259);
            }
            long duration = interfaceC6324.getDuration();
            if (duration <= 0 || duration == -9223372036854775807L || c13823M40958.m31502()) {
                activityC12088.m27756();
                return null;
            }
            if (z && !c13823M40958.m31494()) {
                activityC12088.m27756();
                return null;
            }
            activityC12088.f33766 = j;
            activityC12088.f33724 = z;
            if (z2) {
                activityC12088.f33721.setImageBitmap(null);
            }
            C9209 c9209M27785 = activityC12088.m27784(j, z);
            activityC12088.f33775.setVisibility(0);
            if (c13823M40958.m31494()) {
                if (activityC12088.f33752 == null) {
                    activityC12088.f33752 = new C23961(activityC12088.getApplicationContext());
                }
                activityC12088.f33752.m53104(interfaceC19370Mo18259, c13823M40958, duration, activityC12088.f33694, new C4041(activityC12088));
                activityC12088.f33752.m53102(c9209M27785.m21228(), c9209M27785.m21227(), j);
                return c9209M27785;
            }
            activityC12088.f33721.setImageBitmap(null);
            C23961 c23961 = activityC12088.f33752;
            if (c23961 != null) {
                c23961.m53101();
                if (c13823M40958.m31499()) {
                    activityC12088.f33752.m53105();
                }
            }
            return c9209M27785;
        }
        final InterfaceC6324 interfaceC6326 = activityC12088.f33747;
        final C24905 c24906 = activityC12088.f33739;
        final InterfaceC16716 interfaceC16718 = activityC12088.f33725;
        final C3310 c3313 = activityC12088.f33787;
        C13010 c13010Mo6827 = interfaceC6326 == 0 ? null : ((AbstractC16341) interfaceC6326).mo6827();
        Uri uri = (c13010Mo6827 == null || (c13660 = c13010Mo6827.f36611) == null) ? null : c13660.f38436;
        long duration2 = interfaceC6326 == 0 ? -9223372036854775807L : interfaceC6326.getDuration();
        if (interfaceC6326 == 0 || c24906 == null || interfaceC16718 == null || c3313 == null || uri == null || duration2 <= 0 || duration2 == -9223372036854775807L || Build.VERSION.SDK_INT < 23 || !c24906.m54692()) {
            activityC12088.m27756();
            return null;
        }
        activityC12088.f33766 = j;
        activityC12088.f33724 = z;
        C17391 c17391 = activityC12088.f33762;
        if (c17391 != null) {
            return activityC12088.m27710(c17391, duration2, j, z, z2);
        }
        Future future = activityC12088.f33758;
        if (future == null || future.isDone()) {
            final int i2 = activityC12088.f33745 + 1;
            activityC12088.f33745 = i2;
            final int i3 = activityC12088.f33694;
            final Uri uri2 = uri;
            activityC12088.f33758 = C4081.f8987.submit(new Runnable() { // from class: l.ܿ۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = ActivityC12088.f33683;
                    final C17391 c17391M39616 = C17391.m39616(c24906, uri2, interfaceC16718, c3313);
                    final ActivityC12088 activityC12089 = this.f56306;
                    final int i5 = i2;
                    final int i6 = i3;
                    final InterfaceC6324 interfaceC6327 = interfaceC6326;
                    final boolean z3 = z2;
                    C7050.m16212(new Runnable() { // from class: l.ۡ۫ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC12088.m27724(activityC12089, i5, i6, c17391M39616, interfaceC6327, z3);
                        }
                    });
                }
            });
        }
        activityC12088.m27756();
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27724(ActivityC12088 activityC12088, int i, int i2, C17391 c17391, InterfaceC6324 interfaceC6324, boolean z) {
        activityC12088.f33758 = null;
        if (i == activityC12088.f33745 && i2 == activityC12088.f33694 && c17391 != null) {
            activityC12088.f33762 = c17391;
            activityC12088.m27710(c17391, interfaceC6324.getDuration(), activityC12088.f33766, activityC12088.f33724, z);
        } else if (c17391 != null) {
            c17391.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C9209 m27710(C17391 c17391, long j, long j2, boolean z, boolean z2) {
        ImageView imageView;
        if (j <= 0 || j == -9223372036854775807L || this.f33775 == null || (imageView = this.f33721) == null) {
            return null;
        }
        if (z2) {
            imageView.setImageBitmap(null);
        }
        C9209 c9209M27784 = m27784(j2, z);
        this.f33775.setVisibility(0);
        if (this.f33752 == null) {
            this.f33752 = new C23961(getApplicationContext());
        }
        this.f33752.m53104((InterfaceC19370) null, c17391.m39617(), j, this.f33694, new C12759(this));
        this.f33752.m53102(c9209M27784.m21228(), c9209M27784.m21227(), j2);
        return c9209M27784;
    }

    /* JADX INFO: renamed from: ܰ */
    public final C9209 m27868() {
        C4712 c4712M39786;
        if (this.f33757 == null && !this.f33714.m39782() && (c4712M39786 = this.f33714.m39786()) != null) {
            C17194 c17194 = this.f33761;
            C17194 c17194M38923 = c17194 == null ? null : c17194.m38923(c4712M39786.m9991(), c4712M39786.m9998() * 1000);
            if (c17194M38923 != null) {
                return m27708(c4712M39786, c17194M38923);
            }
            final C6053 c6053 = new C6053(c4712M39786);
            this.f33757 = c6053;
            C4081.f8987.execute(new Runnable() { // from class: l.ܳ۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    final C17194 c17194M38920;
                    final C6053 c6054 = c6053;
                    int i = ActivityC12088.f33683;
                    try {
                        if (C6053.m13634(c6054, Thread.currentThread())) {
                            C4712 c4712M13636 = C6053.m13636(c6054);
                            c17194M38920 = C17194.m38920(c4712M13636.m9991(), c4712M13636.m9998() * 1000, c4712M13636.m9997(), c4712M13636.m9992(), c4712M13636.m9996(), c4712M13636.m9999(), c4712M13636.m9995());
                        } else {
                            c17194M38920 = null;
                        }
                        C6053.m13635(c6054);
                        final ActivityC12088 activityC12088 = this.f47609;
                        C7050.m16212(new Runnable() { // from class: l.ܺ۫ۜ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC12088.m27736(activityC12088, c6054, c17194M38920);
                            }
                        });
                    } catch (Throwable th) {
                        C6053.m13635(c6054);
                        throw th;
                    }
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27736(ActivityC12088 activityC12088, C6053 c6053, C17194 c17194) {
        if (activityC12088.f33757 != c6053) {
            return;
        }
        activityC12088.f33757 = null;
        C4712 c4712M13636 = C6053.m13636(c6053);
        boolean z = c4712M13636.m10000() == activityC12088.f33690 && c4712M13636.m9993() == activityC12088.f33694;
        boolean zM39783 = activityC12088.f33714.m39783(c4712M13636);
        if (c17194 != null && z) {
            activityC12088.f33761 = c17194;
            if (activityC12088.m27708(c4712M13636, c17194) != null) {
                return;
            }
        }
        if (c17194 == null && z && !zM39783) {
            activityC12088.m27713(c4712M13636.m9993(), (Bitmap) null);
        }
        activityC12088.m27868();
    }

    /* JADX INFO: renamed from: ֫ */
    private C9209 m27708(C4712 c4712, C17194 c17194) {
        int iM10000 = c4712.m10000();
        int i = this.f33690;
        int iM9993 = c4712.m9993();
        int i2 = this.f33694;
        long jM9990 = c4712.m9990();
        long j = this.f33709;
        long jM39784 = this.f33714.m39784();
        if (iM10000 != i || iM9993 != i2 || jM9990 > j || jM9990 <= jM39784 || this.f33714.m39782() || this.f33775 == null || this.f33721 == null) {
            return null;
        }
        this.f33761 = c17194;
        C9209 c9209M27784 = m27784(this.f33766, this.f33724);
        this.f33775.setVisibility(0);
        if (this.f33732 == null) {
            this.f33732 = new C6585();
        }
        this.f33714.m39787(c4712);
        this.f33732.m15068(c17194, c4712.m9993(), new C18122(this, c4712));
        this.f33732.m15066(c9209M27784.m21228(), c9209M27784.m21227());
        return c9209M27784;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27863(C4712 c4712, int i, Bitmap bitmap) {
        if (this.f33714.m39781(c4712)) {
            boolean z = c4712.m10000() == this.f33690 && i == this.f33694;
            boolean z2 = c4712.m9990() == this.f33709;
            if (z && (bitmap != null || z2)) {
                m27713(i, bitmap);
            }
            m27868();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27733(ActivityC12088 activityC12088, C4712 c4712, int i, C15243 c15243) {
        int iM10000 = c4712.m10000();
        int i2 = activityC12088.f33690;
        int i3 = activityC12088.f33694;
        if (iM10000 == i2 && i == i3 && i == i3) {
            activityC12088.f33700 = c15243;
            View view = activityC12088.f33775;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            activityC12088.m27784(activityC12088.f33766, activityC12088.f33724);
        }
    }

    /* JADX INFO: renamed from: ᩻֫ */
    private void m27861() {
        this.f33690++;
        this.f33714.m39780();
        C6053 c6053 = this.f33757;
        if (c6053 != null) {
            C6053.m13633(c6053);
            if (this.f33787 == C6053.m13636(c6053).m9999()) {
                this.f33787 = new C3310();
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static /* synthetic */ void m27776(ActivityC12088 activityC12088) {
        activityC12088.f33761 = null;
        C6585 c6585 = activityC12088.f33732;
        activityC12088.f33732 = null;
        if (c6585 != null) {
            c6585.m15067(new RunnableC9288(1));
        }
        activityC12088.m27756();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ֫ */
    public void m27756() {
        m27861();
        View view = this.f33775;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f33721;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C23961 c23961 = this.f33752;
        if (c23961 != null) {
            c23961.m53101();
        }
        C6585 c6585 = this.f33732;
        if (c6585 != null) {
            c6585.m15065();
        }
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public static void m27810(ActivityC12088 activityC12088) {
        View view = activityC12088.f33767;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public static void m27778(ActivityC12088 activityC12088) {
        View view = activityC12088.f33767;
        if (view != null) {
            view.setVisibility(8);
            activityC12088.f33767.setTranslationX(0.0f);
            activityC12088.f33767.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: ᩵֫ */
    private void m27842() {
        this.f33694++;
        this.f33769 = C8454.f22684;
        this.f33700 = null;
        View view = this.f33775;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f33721;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        Future future = this.f33758;
        this.f33758 = null;
        this.f33745++;
        if (future != null) {
            future.cancel(true);
        }
        C17391 c17391 = this.f33762;
        this.f33762 = null;
        C23961 c23961 = this.f33752;
        if (c23961 != null) {
            c23961.m53103(new RunnableC13034(1, c17391));
        } else if (c17391 != null) {
            c17391.close();
        }
        m27861();
        this.f33761 = null;
        C6585 c6585 = this.f33732;
        if (c6585 != null) {
            c6585.m15067(new RunnableC9288(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public C9209 m27784(long j, boolean z) {
        C10307 c10307M53833;
        char c;
        int iM8322;
        int iMax;
        View view;
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (interfaceC6324 == null) {
            c10307M53833 = null;
        } else {
            AbstractC6767 abstractC6767ListIterator = interfaceC6324.mo6806().m35728().listIterator(0);
            c10307M53833 = null;
            loop0: while (abstractC6767ListIterator.hasNext()) {
                C24408 c24408 = (C24408) abstractC6767ListIterator.next();
                if (c24408.m53836() == 2) {
                    for (int i = 0; i < c24408.f77291; i++) {
                        if (c24408.m53837(i)) {
                            c10307M53833 = c24408.m53833(i);
                            break loop0;
                        }
                        if (c10307M53833 == null && c24408.m53835(i, true)) {
                            c10307M53833 = c24408.m53833(i);
                        }
                    }
                }
            }
        }
        C15243 c15243 = this.f33700;
        C8454 c8454 = this.f33769;
        C15243 c15243M8323 = c10307M53833 == null ? null : C4118.m8323(c10307M53833.f28547, c10307M53833.f28523, c10307M53833.f28513, c10307M53833.f28550);
        if (c15243M8323 != null) {
            c15243 = c15243M8323;
        } else if (c15243 == null) {
            C15243 c15243M8324 = c8454 != null ? C4118.m8323(c8454.f22687, c8454.f22685, 0, c8454.f22686) : null;
            c15243 = c15243M8324 != null ? c15243M8324 : new C15243(16.0f, 9.0f);
        }
        int iM29939 = C13076.m29939(180.0f);
        int iM299310 = C13076.m29939(180.0f);
        if (iM29939 <= 0) {
            iM29939 = 16;
        }
        if (iM299310 <= 0) {
            iM299310 = 9;
        }
        float fM34702 = c15243.m34702();
        int iMax2 = Math.max(1, Math.round(iM29939 / fM34702));
        if (iMax2 > iM299310) {
            iM29939 = Math.max(1, Math.round(iM299310 * fM34702));
        } else {
            iM299310 = iMax2;
        }
        C9209 c9209 = new C9209(Math.max(1, iM29939), Math.max(1, iM299310));
        ViewGroup.LayoutParams layoutParams = this.f33775.getLayoutParams();
        layoutParams.width = c9209.m21228();
        layoutParams.height = c9209.m21227();
        this.f33775.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f33703;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f33703;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        if (z) {
            iM8322 = C4118.m8322(width, c9209.m21228());
            c = 1;
        } else {
            int iM21228 = c9209.m21228();
            InterfaceC6324 interfaceC6325 = this.f33747;
            View view2 = this.f33691;
            if (interfaceC6325 == null || view2 == null || view2.getWidth() <= 0) {
                c = 1;
                iM8322 = C4118.m8322(width, iM21228);
            } else {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f33703.getLocationInWindow(iArr2);
                int i2 = iArr[0] - iArr2[0];
                int width2 = view2.getWidth();
                long duration = interfaceC6325.getDuration();
                if (duration <= 0 || width2 <= 0) {
                    c = 1;
                    iM8322 = C4118.m8322(width, iM21228);
                } else {
                    c = 1;
                    iM8322 = Math.max(0, Math.min((Math.round(width2 * (Math.max(0L, Math.min(j, duration)) / duration)) + i2) - (iM21228 / 2), Math.max(0, width - iM21228)));
                }
            }
        }
        int iM21227 = c9209.m21227();
        int iM299311 = C13076.m29939(12.0f);
        if (z && (view = this.f33767) != null && view.getVisibility() == 0) {
            int iM27803 = iM21227 + iM299311 + m27803(width);
            int iMax3 = Math.max(0, iM299311);
            int i3 = height - iM27803;
            iMax = Math.max(iMax3, Math.min(i3 / 2, Math.max(iMax3, i3 - iMax3)));
        } else {
            View view3 = this.f33751;
            if (view3 == null || view3.getHeight() <= 0) {
                iMax = Math.max(iM299311, (height - iM21227) - C13076.m29939(96.0f));
            } else {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f33751.getLocationInWindow(iArr3);
                this.f33703.getLocationInWindow(iArr4);
                int i4 = iArr3[c] - iArr4[c];
                if (i4 > 0) {
                    iMax = Math.max(iM299311, (i4 - iM21227) - iM299311);
                } else {
                    iMax = Math.max(iM299311, (height - iM21227) - C13076.m29939(96.0f));
                }
            }
        }
        this.f33775.setTranslationX(iM8322);
        this.f33775.setTranslationY(iMax);
        if (z) {
            int iM21229 = c9209.m21227();
            View view4 = this.f33767;
            if (view4 != null && view4.getVisibility() == 0) {
                int iM299312 = C13076.m29939(12.0f);
                m27826(width);
                int measuredWidth = this.f33767.getMeasuredWidth();
                if (measuredWidth <= 0 && (measuredWidth = this.f33767.getWidth()) <= 0) {
                    measuredWidth = width;
                }
                int iMin = Math.min(iMax + iM21229 + iM299312, Math.max(iM299312, (height - m27803(width)) - iM299312));
                this.f33767.setTranslationX(C4118.m8322(width, measuredWidth));
                this.f33767.setTranslationY(iMin);
            }
        }
        return c9209;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸֫ */
    public void m27852() {
        View view = this.f33767;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        FrameLayout frameLayout = this.f33703;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f33703;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        int iM29939 = C13076.m29939(12.0f);
        m27826(width);
        int measuredWidth = this.f33767.getMeasuredWidth();
        if (measuredWidth <= 0 && (measuredWidth = this.f33767.getWidth()) <= 0) {
            measuredWidth = width;
        }
        int iM27803 = m27803(width);
        this.f33767.setTranslationX(C4118.m8322(width, measuredWidth));
        View view2 = this.f33767;
        int iMax = Math.max(0, iM29939);
        int i = height - iM27803;
        view2.setTranslationY(Math.max(iMax, Math.min(i / 2, Math.max(iMax, i - iMax))));
    }

    /* JADX INFO: renamed from: ܳ */
    private int m27803(int i) {
        m27826(i);
        int measuredHeight = this.f33767.getMeasuredHeight();
        return measuredHeight > 0 ? measuredHeight : Math.max(1, this.f33767.getHeight());
    }

    /* JADX INFO: renamed from: ܿ */
    private void m27826(int i) {
        int iMakeMeasureSpec;
        int i2;
        View view = this.f33767;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        this.f33767.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m27847(int i) {
        ViewGroup viewGroupM45488;
        int childCount;
        C2643 c2643 = this.f33716;
        ViewGroup viewGroup = this.f33737;
        if (c2643 == null || viewGroup == null) {
            return;
        }
        if (i != 4 || (viewGroupM45488 = this.f33788.m45488()) == null) {
            viewGroupM45488 = viewGroup;
        }
        if (c2643.getParent() == viewGroupM45488) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c2643.getLayoutParams();
        ViewParent parent = c2643.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c2643);
        }
        if (viewGroupM45488 == viewGroup) {
            childCount = Math.min(this.f33728, viewGroupM45488.getChildCount());
        } else {
            childCount = viewGroupM45488.getChildCount();
        }
        viewGroupM45488.addView(c2643, childCount, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX INFO: renamed from: ᩶֫ */
    public void m27845() {
        int i;
        C2643 c2643 = this.f33716;
        if (c2643 == null) {
            return;
        }
        if (this.f33710) {
            i = 4;
        } else {
            if (m27839()) {
                String str = (String) C20806.m46970(this.f33711);
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, m27761())) {
                    i = 4;
                }
            }
            i = 0;
        }
        c2643.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static List m27706(ActivityC12088 activityC12088, List list) {
        C14769 c14769;
        ArrayList arrayList = activityC12088.f33763;
        if (!((AbstractCollection) list).isEmpty()) {
            ArrayList<C21196> arrayList2 = new ArrayList();
            AbstractC16192 abstractC16192 = (AbstractC16192) list;
            AbstractC6767 abstractC6767ListIterator = abstractC16192.listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                C21196 c21196 = (C21196) abstractC6767ListIterator.next();
                if (c21196.f66624 == null && c21196.f66629 != null && c21196.f66634 == -3.4028235E38f) {
                    arrayList2.add(c21196);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                for (C21196 c21197 : arrayList2) {
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            c14769 = (C14769) arrayList3.get(size);
                            if (c14769.f42111 == c21197) {
                                arrayList3.remove(size);
                                break;
                            }
                        } else {
                            int size2 = arrayList3.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    c14769 = null;
                                    break;
                                }
                                c14769 = (C14769) arrayList3.get(size2);
                                if (c14769.f42111.equals(c21197)) {
                                    arrayList3.remove(size2);
                                    break;
                                }
                            }
                        }
                    }
                    if (c14769 == null) {
                        int iM27700 = m27700(c21197);
                        int i = 0;
                        while (true) {
                            Iterator it = arrayList4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C14769 c147610 = (C14769) it.next();
                                int i2 = c147610.f42112;
                                if (i < c147610.f42113 + i2 && i2 < i + iM27700) {
                                    i++;
                                }
                            }
                        }
                        c14769 = new C14769(c21197, i, iM27700);
                    } else {
                        c14769.f42111 = c21197;
                        c14769.f42113 = m27700(c21197);
                    }
                    arrayList4.add(c14769);
                }
                arrayList.clear();
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(list.size());
                AbstractC6767 abstractC6767ListIterator2 = abstractC16192.listIterator(0);
                int i3 = 0;
                while (abstractC6767ListIterator2.hasNext()) {
                    C21196 c21198 = (C21196) abstractC6767ListIterator2.next();
                    if (c21198.f66624 == null && c21198.f66629 != null && c21198.f66634 == -3.4028235E38f) {
                        int i4 = i3 + 1;
                        float fMax = Math.max(0.0f, 0.955f - (((C14769) arrayList4.get(i3)).f42112 * 0.049999997f));
                        C23207 c23207M47867 = c21198.m47867();
                        c23207M47867.m51722(fMax, 0);
                        c23207M47867.m51723(2);
                        arrayList5.add(c23207M47867.m51720());
                        i3 = i4;
                    } else {
                        arrayList5.add(c21198);
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

    /* JADX INFO: renamed from: ֫ */
    public static int m27700(C21196 c21196) {
        CharSequence charSequence = c21196.f66629;
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

    /* JADX INFO: renamed from: ֨֫ */
    private void m27697() {
        if (this.f33706 || this.f33747 == null || this.f33736 == null) {
            return;
        }
        String str = this.f33786;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long duration = this.f33747.getDuration();
        if (duration == -9223372036854775807L) {
            return;
        }
        C24157.m53406(str, this.f33747.getCurrentPosition(), duration);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27714(long j, boolean z) {
        String strM27704;
        long jMax;
        C17984 c17984;
        if (this.f33747 == null || isFinishing() || isDestroyed()) {
            return;
        }
        this.f33706 = false;
        this.f33688 = false;
        this.f33718 = false;
        this.f33720 = false;
        this.f33778 = false;
        this.f33685 = false;
        m27865(false);
        this.f33784 = false;
        int iIncrementAndGet = this.f33764.incrementAndGet();
        this.f33744 = iIncrementAndGet;
        C13010 c13010Mo18258 = this.f33736.mo18258();
        InterfaceC19370 interfaceC19370Mo18259 = this.f33736.mo18259();
        if (interfaceC19370Mo18259 != null) {
            strM27704 = m27704(interfaceC19370Mo18259);
        } else {
            C13660 c13660 = c13010Mo18258.f36611;
            if (c13660 != null) {
                Object obj = c13660.f38432;
                if (obj instanceof String) {
                    strM27704 = (String) obj;
                }
            }
            throw new IllegalStateException("URL media item has no playback key");
        }
        String str = strM27704;
        if (j == -9223372036854775807L) {
            jMax = C24157.m53404(str);
        } else {
            jMax = Math.max(0L, j);
        }
        final C10076 c10076 = new C10076(iIncrementAndGet, c13010Mo18258, interfaceC19370Mo18259, jMax, str, z, (z || interfaceC19370Mo18259 == null || (c17984 = this.f33705) == null) ? null : c17984.m40968());
        List listM27815 = m27815(c10076.m23541());
        boolean zM27835 = m27835(c10076.m23541());
        this.f33753 = z;
        this.f33763.clear();
        m27849();
        m27793(false);
        m27837();
        if (z || c10076.m23537() == null) {
            m27721(c10076, C16780.m38021(c10076.m23540(), listM27815, zM27835));
        } else {
            this.f33715 = C4081.f8987.submit(new Runnable() { // from class: l.ᩴ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC12088.m27738(this.f62507, c10076);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m27837() {
        C17984 c17984 = this.f33705;
        if (c17984 != null) {
            c17984.m40964();
        }
        m27777();
        m27774();
        m27812();
        C20806.m46965(this.f33785);
        m27766();
        m27751();
        m27756();
        this.f33760 = true;
        InterfaceC6324 interfaceC6324 = this.f33747;
        m27764(interfaceC6324 != null ? interfaceC6324.mo6835() : 1);
        m27715((CharSequence) getString(R.string.MT_Protector));
        m27785((CharSequence) getString(R.string.MT_Protector));
        this.f33747.stop();
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public static void m27762(ActivityC12088 activityC12088) {
        activityC12088.f33760 = false;
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        activityC12088.m27764(interfaceC6324 == null ? 1 : interfaceC6324.mo6835());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public void m27764(int i) {
        int i2 = 0;
        if (this.f33760 && i != 1) {
            this.f33760 = false;
        }
        View view = this.f33781;
        if (view == null) {
            return;
        }
        if (!this.f33760 && i != 2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27738(final ActivityC12088 activityC12088, final C10076 c10076) {
        final C16780 c16780M38021;
        AbstractC15599 abstractC15599M23537 = c10076.m23537();
        InterfaceC19370 interfaceC19370M23536 = c10076.m23536();
        if (abstractC15599M23537 == null || interfaceC19370M23536 == null) {
            c16780M38021 = C16780.m38021(c10076.m23540(), Collections.EMPTY_LIST, false);
        } else {
            List listM43906 = Collections.EMPTY_LIST;
            try {
                listM43906 = C19267.m43906(interfaceC19370M23536, abstractC15599M23537);
                C3844 c3844M43907 = C19267.m43907(listM43906, interfaceC19370M23536, abstractC15599M23537.mo15799());
                c16780M38021 = m27711(c10076.m23540(), listM43906, c3844M43907, c3844M43907 == null ? EnumC22147.NONE : EnumC22147.AUTO, true);
            } catch (Exception unused) {
                c16780M38021 = C16780.m38021(c10076.m23540(), listM43906, false);
            }
        }
        C7050.m16212(new Runnable() { // from class: l.ᩳ۫ۜ
            @Override // java.lang.Runnable
            public final void run() {
                this.f59451.m27721(c10076, c16780M38021);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m27721(C10076 c10076, C16780 c16780) {
        String strM23541;
        C15992 c15992M49624;
        int iM23539 = c10076.m23539();
        if (this.f33747 == null || isFinishing() || isDestroyed() || iM23539 != this.f33744) {
            return;
        }
        this.f33715 = null;
        if (!getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
            this.f33784 = true;
            return;
        }
        if (!c10076.m23542() && c10076.m23537() != null && (c15992M49624 = C22029.m49624((strM23541 = c10076.m23541()))) != null && c15992M49624.m36342() == EnumC8617.FILE) {
            String strM36341 = c15992M49624.m36341();
            if (TextUtils.isEmpty(strM36341)) {
                C22029.m49629(strM23541);
            } else {
                C3844 c3844M27707 = m27707(strM36341, c16780.m38023());
                if (c3844M27707 != null) {
                    c16780 = m27711(c16780.m38025(), c16780.m38023(), c3844M27707, EnumC22147.MANUAL, c16780.m38026());
                } else if (c16780.m38026()) {
                    C22029.m49629(strM23541);
                }
            }
        }
        String strM23542 = c10076.m23541();
        this.f33765 = c16780.m38023();
        this.f33684 = c16780.m38026();
        this.f33768 = strM23542;
        this.f33693 = c16780.m38022();
        this.f33699 = c16780.m38024();
        try {
            String strM23543 = c10076.m23541();
            C20806 c20806 = this.f33711;
            if (this.f33742 && !TextUtils.isEmpty(strM23543)) {
                this.f33697 = strM23543;
                this.f33742 = false;
            }
            if (!TextUtils.equals(strM23543, this.f33697)) {
                this.f33697 = null;
            }
            if (m27839()) {
                if (TextUtils.equals(strM23543, this.f33697)) {
                    strM23543 = null;
                }
                C20806.m46966(c20806, (Object) strM23543);
            } else {
                if (this.f33733 == EnumC20135.AUTO) {
                    this.f33733 = EnumC20135.NONE;
                    if (getRequestedOrientation() != -1) {
                        setRequestedOrientation(-1);
                    }
                }
                C20806.m46965(c20806);
            }
            String strM23544 = c10076.m23541();
            C20806.m46966(this.f33734, TextUtils.isEmpty(strM23544) ? null : new C7394(strM23544, c10076.m23542()));
            C20806.m46966(this.f33774, (Object) c10076.m23541());
            String strM23545 = c10076.m23541();
            if (c16780.m38022() == EnumC22147.MANUAL && !TextUtils.isEmpty(c16780.m38024())) {
                C20806.m46966(this.f33785, new C3370(strM23545, c16780.m38024()));
            } else {
                C20806.m46965(this.f33785);
            }
            m27842();
            if (c10076.m23538() > 0) {
                InterfaceC3621 interfaceC3621 = this.f33747;
                C13010 c13010M38025 = c16780.m38025();
                long jM23538 = c10076.m23538();
                AbstractC16341 abstractC16341 = (AbstractC16341) interfaceC3621;
                abstractC16341.getClass();
                abstractC16341.mo6795(jM23538, AbstractC16192.m36873of((Object) c13010M38025));
            } else {
                ((AbstractC16341) this.f33747).m37143(c16780.m38025());
            }
            this.f33786 = c10076.m23541();
            this.f33747.mo6816();
            ((AbstractC16341) this.f33747).mo6802(true);
        } catch (Exception e) {
            this.f33760 = false;
            InterfaceC6324 interfaceC6324 = this.f33747;
            m27764(interfaceC6324 != null ? interfaceC6324.mo6835() : 1);
            this.f33693 = EnumC22147.NONE;
            this.f33699 = null;
            C20806.m46965(this.f33785);
            m27777();
            m27774();
            m27812();
            C22682.m50795((CharSequence) e.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m27793(boolean z) {
        Future future = this.f33715;
        this.f33715 = null;
        if (future != null) {
            future.cancel(true);
        }
        if (z) {
            this.f33744 = this.f33764.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: ᩷֫ */
    private void m27849() {
        this.f33693 = EnumC22147.NONE;
        this.f33699 = null;
        C20806.m46965(this.f33785);
        List list = Collections.EMPTY_LIST;
        this.f33765 = list;
        this.f33684 = false;
        this.f33768 = null;
        this.f33710 = false;
        C2643 c2643 = this.f33716;
        if (c2643 == null) {
            return;
        }
        c2643.m4036(list);
        c2643.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public static boolean m27840(ActivityC12088 activityC12088) {
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        if (interfaceC6324 == null || activityC12088.f33693 == EnumC22147.NONE || activityC12088.f33753 || TextUtils.isEmpty(activityC12088.f33699)) {
            return false;
        }
        activityC12088.m27714(interfaceC6324.getCurrentPosition(), true);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27731(ActivityC12088 activityC12088, CharSequence charSequence, C13010 c13010) {
        if (!TextUtils.isEmpty(charSequence)) {
            activityC12088.f33730.setText(charSequence);
        } else {
            activityC12088.f33730.setText(c13010 == null ? null : c13010.f36613);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m27704(InterfaceC19370 interfaceC19370) {
        String path = interfaceC19370.getPath();
        C17984 c17984 = this.f33705;
        if (c17984 == null) {
            return path;
        }
        AbstractC15599 abstractC15599M40968 = c17984.m40968();
        if (!(abstractC15599M40968 instanceof AbstractC5375)) {
            return path;
        }
        return ((AbstractC5375) abstractC15599M40968).mo11732() + path;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m27703(C13010 c13010) {
        if (c13010 == null) {
            return null;
        }
        C13660 c13660 = c13010.f36611;
        if (c13660 != null) {
            Object obj = c13660.f38432;
            if (obj instanceof InterfaceC19370) {
                return m27704((InterfaceC19370) obj);
            }
            return obj instanceof String ? (String) obj : c13660.f38436.toString();
        }
        return c13010.f36613;
    }

    /* JADX INFO: renamed from: ۧ */
    private String m27782(C13010 c13010) {
        if (c13010 == null) {
            return null;
        }
        C13660 c13660 = c13010.f36611;
        if (c13660 != null) {
            Object obj = c13660.f38432;
            if (obj instanceof InterfaceC19370) {
                return m27704((InterfaceC19370) obj);
            }
        }
        if (c13660 != null) {
            Object obj2 = c13660.f38432;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    private String m27761() {
        if (!TextUtils.isEmpty(this.f33786)) {
            return this.f33786;
        }
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (interfaceC6324 == null) {
            return null;
        }
        return m27782(interfaceC6324.mo6827());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27740(ActivityC12088 activityC12088, C13010 c13010) {
        C20806.m46968(activityC12088.f33711, activityC12088.m27782(c13010), new C6111());
        activityC12088.m27845();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m27720(C8454 c8454) {
        InterfaceC6324 interfaceC6324 = this.f33747;
        C20806 c20806 = this.f33711;
        String str = (String) C20806.m46970(c20806);
        if (interfaceC6324 == null || TextUtils.isEmpty(str) || !m27839() || !TextUtils.equals(str, m27761())) {
            return;
        }
        int i = c8454.f22687;
        int i2 = c8454.f22685;
        boolean z = false;
        int iM24944 = C10824.m24944(i, i2, 0, c8454.f22686);
        if (iM24944 == -1) {
            if (c8454.f22687 <= 0 || i2 <= 0) {
                return;
            }
            C20806.m46969(c20806);
            this.f33710 = false;
            m27845();
            return;
        }
        C20806.m46969(c20806);
        int i3 = getResources().getConfiguration().orientation;
        if (iM24944 != 0 ? !(iM24944 != 1 || i3 == 1) : i3 != 2) {
            z = true;
        }
        this.f33710 = z;
        this.f33733 = EnumC20135.AUTO;
        if (getRequestedOrientation() != iM24944) {
            setRequestedOrientation(iM24944);
        }
        if (this.f33710) {
            return;
        }
        m27845();
    }

    /* JADX INFO: renamed from: ۢ֫ */
    private void m27777() {
        C20806.m46965(this.f33711);
        this.f33710 = false;
        m27845();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m27827(ActivityC12088 activityC12088) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        C11755.m26981(activityC12088.f33755);
        C11755.m26981(activityC12088.f33751);
        C11755.m26981(activityC12088.f33707);
        C22484.m50433(activityC12088.f33780);
        C22484.m50433(activityC12088.f33772);
        C22484.m50433(activityC12088.f33701);
        C1098 c1098 = activityC12088.f33717;
        if (c1098 == null) {
            return;
        }
        int iM16652 = c1098.m16652();
        int iM16650 = activityC12088.f33717.m16650();
        int iM16651 = activityC12088.f33717.m16651();
        int iM16649 = activityC12088.f33717.m16649();
        if (iM16652 > 0) {
            C22484.m50432(-1, Math.max(C13076.m29939(20.0f), C13076.m29939(10.0f) + iM16652), -1, activityC12088.f33780);
            C11755.m26982(activityC12088.f33755, -1, iM16652, -1, -1);
        }
        if (iM16650 > 0) {
            C22484.m50432(iM16650, -1, -1, activityC12088.f33772);
            C11755.m26982(activityC12088.f33755, iM16650, -1, -1, -1);
            C11755.m26982(activityC12088.f33751, iM16650, -1, -1, -1);
            C11755.m26982(activityC12088.f33707, iM16650, -1, -1, -1);
        }
        if (iM16651 > 0) {
            C22484.m50432(-1, -1, iM16651, activityC12088.f33701);
            C11755.m26982(activityC12088.f33755, -1, -1, iM16651, -1);
            C11755.m26982(activityC12088.f33751, -1, -1, iM16651, -1);
            C11755.m26982(activityC12088.f33707, -1, -1, iM16651, -1);
        }
        if (iM16649 > 0) {
            C11755.m26982(activityC12088.f33751, -1, -1, -1, iM16649);
            C11755.m26982(activityC12088.f33707, -1, -1, -1, iM16649);
        }
    }

    /* JADX INFO: renamed from: ܽ֫ */
    private void m27824() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (!ApplicationC21448.f67649.getBoolean("ins", false) || ApplicationC21448.f67649.getBoolean("vpun", true)) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m27735(ActivityC12088 activityC12088, C0990 c0990, boolean z) {
        c0990.setEnabled(z);
        C24104.m53360(ApplicationC21448.f67649, "vpffs", z);
        activityC12088.m27796();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27734(ActivityC12088 activityC12088, C0990 c0990, C1914 c1914) {
        activityC12088.f33717 = c1914.m51181();
        boolean z = ApplicationC21448.f67649.getBoolean("ins", false);
        if (activityC12088.f33717 == null || z) {
            if (z) {
                C7050.m16212(new RunnableC20529(1, activityC12088));
            }
        } else {
            ApplicationC21448.f67649.edit().putBoolean("ins", true).apply();
            c0990.setVisibility(0);
            if (c0990.isChecked()) {
                c0990.setChecked(false);
            } else {
                activityC12088.m27824();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m27818(ActivityC12088 activityC12088, View view) {
        activityC12088.f33747.mo6800(new C4963(((Float) view.getTag()).floatValue()));
        TextView[] textViewArr = activityC12088.f33740;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView = textViewArr[i];
            boolean z = textView == view;
            textView.setTextColor(z ? C23223.f72969 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27786(ActivityC12088 activityC12088) {
        activityC12088.f33788.m45497();
        activityC12088.f33707.scrollTo(0, 0);
        View view = activityC12088.f33707;
        view.setTranslationY(view.getHeight());
        activityC12088.f33719.setVisibility(0);
        View view2 = activityC12088.f33707;
        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
        activityC12088.m27715((CharSequence) null);
        activityC12088.m27785((CharSequence) null);
        activityC12088.f33782.m28455(activityC12088.f33773);
        ((RunnableC14827) activityC12088.f33704).run();
        float f = activityC12088.f33747.mo6831().f11305;
        for (TextView textView : activityC12088.f33740) {
            boolean z = Math.abs(((Float) textView.getTag()).floatValue() - f) < 0.001f;
            textView.setTextColor(z ? C23223.f72969 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27788(ActivityC12088 activityC12088, View view) {
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        c1898.m50634(8388661);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, 1, 0, R.string.MT_Protector);
        int i = 0;
        while (i < 5) {
            int i2 = f33682[i];
            int i3 = i + 100;
            i++;
            c0994M50638.add(0, i3, i, activityC12088.getString(R.string.MT_Protector, Integer.valueOf(i2)));
        }
        c0994M50638.add(0, 200, 6, R.string.MT_Protector);
        c1898.m50636(new C3627(activityC12088));
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27745(ActivityC12088 activityC12088, MenuItem menuItem) {
        C12363 c12363 = activityC12088.f33782;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            c12363.m28453();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            c12363.m28454(f33682[i]);
            return true;
        }
        C19464 c19464 = new C19464(activityC12088, activityC12088);
        c19464.m7749(R.string.MT_Protector);
        c19464.m7753();
        c19464.m7755();
        c19464.m7750(activityC12088.getString(R.string.MT_Protector));
        int iM28458 = c12363.m28458();
        if (iM28458 > 0) {
            c19464.m7752(String.valueOf(iM28458));
            c19464.m7756();
        }
        c19464.m7757();
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m27821(boolean z) {
        this.f33782.m28457(this.f33773);
        C7050.m16221().removeCallbacks(this.f33704);
        View view = this.f33707;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), this.f33707.getHeight());
        objectAnimatorOfFloat.addListener(new C18793(this));
        if (z) {
            objectAnimatorOfFloat.setDuration(150L);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹֫ */
    public void m27855() {
        TextView textView = this.f33698;
        if (textView == null) {
            return;
        }
        int iM28458 = this.f33782.m28458();
        if (iM28458 > 0) {
            textView.setText(getString(R.string.MT_Protector, Integer.valueOf(iM28458)));
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠֫ */
    public void m27771() {
        Handler handlerM16221 = C7050.m16221();
        Runnable runnable = this.f33704;
        handlerM16221.removeCallbacks(runnable);
        long jM28456 = this.f33782.m28456();
        if (jM28456 <= 0) {
            return;
        }
        long j = jM28456 % 60000;
        C7050.m16221().postDelayed(runnable, j != 0 ? j : 60000L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27741(ActivityC12088 activityC12088, C14099 c14099, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        if (interfaceC3621 == null || itemId < 0 || itemId > c14099.m32007().size()) {
            return;
        }
        C15690 c15690Mo6806 = interfaceC3621.mo6806();
        if (!TextUtils.equals(c14099.m32006(), activityC12088.m27703(((AbstractC16341) interfaceC3621).mo6827()))) {
            activityC12088.m27866(c15690Mo6806);
            return;
        }
        if (itemId == 0) {
            activityC12088.f33692 = null;
            interfaceC3621.mo6801(interfaceC3621.mo6812().mo31081().mo19200(2, false).mo19199(2).mo19204());
            activityC12088.m27866(c15690Mo6806);
            return;
        }
        C9405 c9405 = (C9405) c14099.m32007().get(itemId - 1);
        for (C9405 c9406 : C18004.m40985(activityC12088.getResources(), c15690Mo6806)) {
            if (c9406.m21901() == c9405.m21901() && c9406.m21898().m53834().equals(c9405.m21898().m53834())) {
                activityC12088.f33692 = null;
                interfaceC3621.mo6801(C18004.m40986(interfaceC3621.mo6812(), c9405));
                activityC12088.m27866(c15690Mo6806);
                return;
            }
        }
        activityC12088.m27866(c15690Mo6806);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27864(C15690 c15690) {
        C9405 c9405;
        InterfaceC6324 interfaceC6324 = this.f33747;
        C12641 c12641 = this.f33692;
        if (!this.f33741 || interfaceC6324 == null || c12641 == null) {
            return;
        }
        Iterator it = C18004.m40985(getResources(), c15690).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c9405 = null;
                break;
            }
            c9405 = (C9405) it.next();
            if (C12641.m29068(c12641, c9405.m21900())) {
                if (i == c12641.m29069()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c9405 == null) {
            return;
        }
        this.f33692 = null;
        interfaceC6324.mo6801(C18004.m40986(interfaceC6324.mo6812(), c9405));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27866(C15690 c15690) {
        CharSequence text;
        if (this.f33741 && this.f33722 != null) {
            List listM40985 = C18004.m40985(getResources(), c15690);
            if (listM40985.size() >= 2) {
                InterfaceC6324 interfaceC6324 = this.f33747;
                int iM40983 = interfaceC6324 == null ? 0 : C18004.m40983(listM40985, interfaceC6324.mo6812());
                if (iM40983 > 0 && iM40983 <= listM40985.size()) {
                    text = ((C9405) listM40985.get(iM40983 - 1)).m21897();
                } else {
                    text = getText(R.string.MT_Protector);
                }
                this.f33722.setText(text);
                this.f33722.setContentDescription(getString(R.string.MT_Protector, text));
                this.f33722.setVisibility(0);
                return;
            }
            TextView textView = this.f33722;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f33722;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public static void m27813(ActivityC12088 activityC12088) {
        TextView textView = activityC12088.f33722;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27730(final ActivityC12088 activityC12088, View view) {
        final C14099 c14099M32004;
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        int i = 0;
        C1898 c1898 = null;
        if (interfaceC3621 == null || !activityC12088.f33741) {
            c14099M32004 = C14099.m32004(null);
        } else {
            String strM27703 = activityC12088.m27703(((AbstractC16341) interfaceC3621).mo6827());
            List listM40985 = C18004.m40985(activityC12088.getResources(), interfaceC3621.mo6806());
            if (listM40985.size() < 2) {
                c14099M32004 = C14099.m32004(strM27703);
            } else {
                c14099M32004 = new C14099(strM27703, listM40985, C18004.m40983(listM40985, interfaceC3621.mo6812()), i);
            }
        }
        if (c14099M32004.m32007().size() >= 2) {
            c1898 = new C1898(view.getContext(), view, 0);
            c1898.m50634(8388661);
            C0994 c0994M50638 = c1898.m50638();
            c0994M50638.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i2 = 0;
            while (i2 < c14099M32004.m32007().size()) {
                int i3 = i2 + 1;
                c0994M50638.add(0, i3, i3, ((C9405) c14099M32004.m32007().get(i2)).m21899()).setCheckable(true);
                i2 = i3;
            }
            c0994M50638.setGroupCheckable(0, true, true);
            int iM32005 = c14099M32004.m32005();
            if (iM32005 >= 0 && iM32005 < c0994M50638.size()) {
                c0994M50638.getItem(iM32005).setChecked(true);
            }
            c1898.m50636(new InterfaceC1583() { // from class: l.ۜ۫ۜ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC12088.m27741(this.f23860, c14099M32004, menuItem);
                    return true;
                }
            });
        } else {
            InterfaceC6324 interfaceC6324 = activityC12088.f33747;
            activityC12088.m27866(interfaceC6324 == null ? C15690.f45476 : interfaceC6324.mo6806());
        }
        if (c1898 != null) {
            c1898.m50639();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m27828(final ActivityC12088 activityC12088, View view) {
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        if (interfaceC3621 == null) {
            return;
        }
        if (interfaceC3621.mo6806().m35730() && ((AbstractC16341) interfaceC3621).mo6827() != null) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        final C16110 c16110M27830 = activityC12088.m27830();
        if (!c16110M27830.m36657().isEmpty()) {
            C1898 c1898 = new C1898(view.getContext(), view, 0);
            c1898.m50634(8388661);
            C0994 c0994M50638 = c1898.m50638();
            c0994M50638.add(0, 0, 0, R.string.MT_Protector).setCheckable(true);
            int i = 0;
            while (i < c16110M27830.m36657().size()) {
                int i2 = i + 1;
                c0994M50638.add(0, i2, i2, ((C24828) c16110M27830.m36657().get(i)).m54521()).setCheckable(true);
                i = i2;
            }
            c0994M50638.setGroupCheckable(0, true, true);
            int iM36654 = c16110M27830.m36654();
            if (iM36654 >= 0 && iM36654 < c0994M50638.size()) {
                c0994M50638.getItem(iM36654).setChecked(true);
            }
            c1898.m50636(new InterfaceC1583() { // from class: l.᩻۫ۜ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC12088.m27742(this.f79479, c16110M27830, menuItem);
                    return true;
                }
            });
            c1898.m50639();
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m27742(ActivityC12088 activityC12088, C16110 c16110, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        if (interfaceC6324 == 0 || itemId < 0 || itemId > c16110.m36657().size()) {
            return;
        }
        if (!TextUtils.equals(c16110.m36656(), activityC12088.m27703(((AbstractC16341) interfaceC6324).mo6827()))) {
            activityC12088.m27715((CharSequence) null);
            return;
        }
        if (itemId > 0) {
            C24828 c24828 = (C24828) c16110.m36657().get(itemId - 1);
            m27719(interfaceC6324, c24828);
            String strM36655 = c16110.m36655();
            if (!TextUtils.isEmpty(strM36655)) {
                C15282.m34781(c24828.m54524(), strM36655);
            }
            activityC12088.m27715(c24828.m54521());
            return;
        }
        activityC12088.m27766();
        String strM36656 = c16110.m36655();
        if (!TextUtils.isEmpty(strM36656)) {
            C15282.m34783(strM36656);
        }
        activityC12088.m27715((CharSequence) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m27794(ActivityC12088 activityC12088, C15690 c15690) {
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        String str = (String) C20806.m46970(activityC12088.f33774);
        if (interfaceC6324 != null && !TextUtils.isEmpty(str) && !c15690.m35730() && TextUtils.equals(str, activityC12088.f33786)) {
            C16110 c16110M27830 = activityC12088.m27830();
            if (TextUtils.equals(str, c16110M27830.m36655())) {
                if (c16110M27830.m36657().isEmpty()) {
                    activityC12088.m27774();
                    return false;
                }
                if (m27699(c16110M27830.m36657(), interfaceC6324.mo6812()) > 0) {
                    activityC12088.m27774();
                    return false;
                }
                int iM34779 = C15282.m34779(str);
                activityC12088.m27774();
                if (iM34779 >= 0) {
                    if (iM34779 >= c16110M27830.m36657().size()) {
                        C15282.m34783(str);
                        return false;
                    }
                    C24828 c24828 = (C24828) c16110M27830.m36657().get(iM34779);
                    m27719(interfaceC6324, c24828);
                    activityC12088.m27715(c24828.m54521());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public static void m27853(ActivityC12088 activityC12088) {
        activityC12088.m27715((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m27715(CharSequence charSequence) {
        CharSequence charSequenceM54521;
        TextView textView = this.f33723;
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (textView == null || interfaceC6324 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        Iterator it = m27816(interfaceC6324.mo6806()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM54521 = null;
                break;
            }
            C24828 c24828 = (C24828) it.next();
            if (c24828.m54523().m53838()) {
                charSequenceM54521 = c24828.m54521();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM54521)) {
            textView.setText(charSequenceM54521);
            return;
        }
        C15690 c15690Mo6806 = interfaceC6324.mo6806();
        if (c15690Mo6806.m35730()) {
            textView.setText(R.string.MT_Protector);
        } else if (!c15690Mo6806.m35729(1)) {
            textView.setText(R.string.MT_Protector);
        } else {
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private C16110 m27830() {
        String strM27782;
        InterfaceC3621 interfaceC3621 = this.f33747;
        if (interfaceC3621 == null) {
            return C16110.m36653(null, null);
        }
        C13010 c13010Mo6827 = ((AbstractC16341) interfaceC3621).mo6827();
        String strM27703 = m27703(c13010Mo6827);
        if (!TextUtils.isEmpty(this.f33786)) {
            strM27782 = this.f33786;
        } else {
            strM27782 = m27782(c13010Mo6827);
        }
        String str = strM27782;
        C15690 c15690Mo6806 = interfaceC3621.mo6806();
        if (c15690Mo6806.m35730()) {
            return C16110.m36653(strM27703, str);
        }
        List listM27816 = m27816(c15690Mo6806);
        if (listM27816.isEmpty()) {
            return C16110.m36653(strM27703, str);
        }
        return new C16110(strM27703, str, listM27816, m27699(listM27816, interfaceC3621.mo6812()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ */
    private List m27816(C15690 c15690) {
        ArrayList<C8735> arrayList = new ArrayList();
        AbstractC6767 abstractC6767ListIterator = c15690.m35728().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            C24408 c24408 = (C24408) abstractC6767ListIterator.next();
            int iM53836 = c24408.m53836();
            int i = c24408.f77291;
            if (iM53836 == 1) {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (c24408.m53835(i2, true)) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C8735(c24408, arrayList2, c24408.m53833(((Integer) arrayList2.get(0)).intValue()), arrayList.size()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (C8735 c8735 : arrayList) {
            arrayList3.add(m27701(c8735.m20198(), false));
            arrayList4.add(m27701(c8735.m20198(), true));
        }
        HashMap mapM27705 = m27705(arrayList3);
        HashMap mapM27706 = m27705(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C8735 c8736 = (C8735) arrayList.get(i3);
            String str = (String) arrayList3.get(i3);
            String strM27825 = m27825(str);
            if (TextUtils.isEmpty(str) || ((Integer) C15525.getOrDefault(mapM27705, strM27825, 0)).intValue() > 1) {
                str = (String) arrayList4.get(i3);
                String strM27826 = m27825(str);
                if (TextUtils.isEmpty(str) || ((Integer) C15525.getOrDefault(mapM27706, strM27826, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c8736.m20197() + 1);
                }
            }
            arrayList5.add(new C24828(c8736.m20195(), c8736.m20196(), str, c8736.m20197()));
        }
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: ֫ */
    public static String m27701(C10307 c10307, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m27716(c10307.f28549, arrayList);
        m27716(m27804(c10307.f28517), arrayList);
        m27716(m27858(c10307.f28522), arrayList);
        int i = c10307.f28539;
        if (i > 0) {
            m27716(i + "ch", arrayList);
        }
        if (z) {
            String strSubstring = c10307.f28528;
            String upperCase = c10307.f28533;
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
            m27716(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m27804(String str) {
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

    /* JADX INFO: renamed from: ᩻ */
    public static String m27858(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C5792.m13027(i));
        arrayList.remove("main");
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join("/", arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27719(InterfaceC6324 interfaceC6324, C24828 c24828) {
        interfaceC6324.mo6801(interfaceC6324.mo6812().mo31081().mo19200(1, false).mo19199(1).mo19202(new C14350(c24828.m54523().m53834(), c24828.m54522())).mo19204());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27791(ActivityC12088 activityC12088, C13010 c13010) {
        C20806.m46968(activityC12088.f33774, activityC12088.m27782(c13010), new C6111());
    }

    /* JADX INFO: renamed from: ۡ֫ */
    private void m27774() {
        C20806.m46965(this.f33774);
    }

    /* JADX INFO: renamed from: ۜ֫ */
    private void m27766() {
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (interfaceC6324 == null) {
            return;
        }
        C13680 c13680Mo6812 = interfaceC6324.mo6812();
        AbstractC21520 it = c13680Mo6812.f38562.values().iterator();
        while (it.hasNext()) {
            if (((C14350) it.next()).f41039.f42920 == 1) {
                interfaceC6324.mo6801(c13680Mo6812.mo31081().mo19200(1, false).mo19199(1).mo19204());
            }
        }
        if (!c13680Mo6812.f38569.contains(1)) {
            return;
        }
        interfaceC6324.mo6801(c13680Mo6812.mo31081().mo19200(1, false).mo19199(1).mo19204());
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m27705(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strM27825 = m27825((String) it.next());
            if (!TextUtils.isEmpty(strM27825)) {
                map.put(strM27825, Integer.valueOf(((Integer) C15525.getOrDefault(map, strM27825, 0)).intValue() + 1));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m27825(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27716(String str, ArrayList arrayList) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m27699(List list, C13680 c13680) {
        AbstractC21520 it = c13680.f38562.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C14350 c14350 = (C14350) it.next();
            if (c14350.f41039.f42920 == 1) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C24828) list.get(i)).m54523().m53834().equals(c14350.f41039)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ᩳ */
    public static void m27833(final ActivityC12088 activityC12088, View view) {
        final MenuItem item;
        int i;
        InterfaceC3621 interfaceC3621 = activityC12088.f33747;
        if (interfaceC3621 == null) {
            return;
        }
        final C21476 c21476M27806 = activityC12088.m27806();
        List listM48674 = c21476M27806.m48674();
        if (!listM48674.isEmpty()) {
            final C1898 c1898 = new C1898(view.getContext(), view, 0);
            c1898.m50634(8388661);
            C0994 c0994M50638 = c1898.m50638();
            C1938.m52015(c0994M50638);
            boolean[] zArr = new boolean[3];
            for (int i2 = 0; i2 < listM48674.size(); i2++) {
                C22817 c22817 = (C22817) listM48674.get(i2);
                int i3 = C5440.f12973[c22817.f71876.ordinal()];
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
                c0994M50638.add(i, i2, i2, c22817.m51021()).setCheckable(true);
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (zArr[i4]) {
                    c0994M50638.setGroupCheckable(i4, true, true);
                }
            }
            int iM48676 = c21476M27806.m48676();
            if (iM48676 < 0 || iM48676 >= c0994M50638.size()) {
                item = null;
            } else {
                item = c0994M50638.getItem(iM48676);
                item.setChecked(true);
            }
            c1898.m50636(new InterfaceC1583() { // from class: l.᩷۫ۜ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC12088.m27729(this.f70229, item, c1898, c21476M27806, menuItem);
                    return true;
                }
            });
            c1898.m50639();
            return;
        }
        if (((AbstractC16341) interfaceC3621).mo6827() != null && interfaceC3621.mo6806().m35730()) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m27729(ActivityC12088 activityC12088, MenuItem menuItem, C1898 c1898, C21476 c21476, MenuItem menuItem2) {
        C15992 c15992;
        boolean z = false;
        if (menuItem != null) {
            c1898.m50638().findItem(menuItem.getItemId()).setChecked(false);
        }
        menuItem2.setChecked(true);
        int itemId = menuItem2.getItemId();
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        if (interfaceC6324 == 0 || itemId < 0 || itemId >= c21476.m48674().size()) {
            return;
        }
        if (TextUtils.equals(c21476.m48677(), activityC12088.m27703(((AbstractC16341) interfaceC6324).mo6827()))) {
            activityC12088.m27812();
            C22817 c22817 = (C22817) c21476.m48674().get(itemId);
            if (c22817.m51020() != EnumC23487.FILE) {
                C20806.m46965(activityC12088.f33785);
            }
            String strM48675 = c21476.m48675();
            int i = C5440.f12973[c22817.m51020().ordinal()];
            if (i == 1) {
                if (!TextUtils.isEmpty(strM48675)) {
                    C22029.m49629(strM48675);
                }
                if (activityC12088.f33693 == EnumC22147.MANUAL && activityC12088.f33736 != null) {
                    List listM27815 = activityC12088.m27815(c21476.m48675());
                    InterfaceC19370 interfaceC19370Mo18259 = activityC12088.f33736.mo18259();
                    if (interfaceC19370Mo18259 == null) {
                        activityC12088.m27751();
                        activityC12088.m27785((CharSequence) null);
                        return;
                    }
                    C17984 c17984 = activityC12088.f33705;
                    if (c17984 != null && c17984.m40968().mo15799()) {
                        z = true;
                    }
                    C3844 c3844M43907 = C19267.m43907(listM27815, interfaceC19370Mo18259, z);
                    activityC12088.m27744(m27711(activityC12088.f33736.mo18258(), listM27815, c3844M43907, c3844M43907 == null ? EnumC22147.NONE : EnumC22147.AUTO, activityC12088.m27835(c21476.m48675())));
                    return;
                }
                activityC12088.m27751();
                activityC12088.m27785((CharSequence) null);
                return;
            }
            if (i == 2) {
                if (!TextUtils.isEmpty(strM48675)) {
                    C22029.m49626(strM48675, new C15992(EnumC8617.OFF, -1, null));
                }
                interfaceC6324.mo6801(interfaceC6324.mo6812().mo31081().mo19200(3, true).mo19199(3).mo19204());
                activityC12088.m27785((CharSequence) activityC12088.getString(R.string.MT_Protector));
                return;
            }
            if (i == 3) {
                C6723 c6723M51022 = c22817.m51022();
                if (c6723M51022 == null) {
                    return;
                }
                if (!TextUtils.isEmpty(strM48675)) {
                    String strSubstring = activityC12088.f33699;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    if (TextUtils.isEmpty(strSubstring) || (!TextUtils.equals(activityC12088.f33699, c6723M51022.m15365()) && !TextUtils.equals(activityC12088.m27859(activityC12088.f33699), c6723M51022.m15364()))) {
                        c15992 = new C15992(EnumC8617.TRACK, c6723M51022.m15367(), null);
                    } else {
                        c15992 = new C15992(EnumC8617.FILE, -1, strSubstring);
                    }
                    C22029.m49626(strM48675, c15992);
                }
                m27718(interfaceC6324, c6723M51022);
                activityC12088.m27785(c6723M51022.m15363());
                return;
            }
            if (i != 4 || activityC12088.f33736 == null || c22817.m51019() == null) {
                return;
            }
            if (!TextUtils.isEmpty(strM48675)) {
                C22029.m49626(strM48675, new C15992(EnumC8617.FILE, -1, c22817.m51019().m7540().getName()));
            }
            activityC12088.m27744(m27711(activityC12088.f33736.mo18258(), activityC12088.m27815(c21476.m48675()), c22817.m51019(), EnumC22147.MANUAL, activityC12088.m27835(c21476.m48675())));
            return;
        }
        activityC12088.m27785((CharSequence) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27744(C16780 c16780) {
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (interfaceC6324 == null || this.f33736 == null || isFinishing() || isDestroyed()) {
            return;
        }
        int iIncrementAndGet = this.f33764.incrementAndGet();
        this.f33744 = iIncrementAndGet;
        InterfaceC19370 interfaceC19370Mo18259 = this.f33736.mo18259();
        if (interfaceC19370Mo18259 == null) {
            return;
        }
        String strM27704 = m27704(interfaceC19370Mo18259);
        long jMax = Math.max(0L, interfaceC6324.getCurrentPosition());
        this.f33753 = false;
        this.f33763.clear();
        m27849();
        m27793(false);
        m27837();
        m27721(new C10076(iIncrementAndGet, this.f33736.mo18258(), interfaceC19370Mo18259, jMax, strM27704, false, null), c16780);
    }

    /* JADX INFO: renamed from: ۬֫ */
    public static void m27801(ActivityC12088 activityC12088) {
        activityC12088.m27785((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m27785(CharSequence charSequence) {
        CharSequence charSequenceM15363;
        String strM27782;
        TextView textView = this.f33743;
        InterfaceC3621 interfaceC3621 = this.f33747;
        if (textView == null || interfaceC3621 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        if (interfaceC3621.mo6812().f38569.contains(3)) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        Iterator it = m27831(interfaceC3621.mo6806()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequenceM15363 = null;
                break;
            }
            C6723 c6723 = (C6723) it.next();
            if (c6723.m15366().m53837(c6723.m15368())) {
                charSequenceM15363 = c6723.m15363();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequenceM15363)) {
            textView.setText(charSequenceM15363);
            return;
        }
        if (this.f33693 == EnumC22147.MANUAL && !TextUtils.isEmpty(this.f33699)) {
            textView.setText(m27859(this.f33699));
            return;
        }
        C15690 c15690Mo6806 = interfaceC3621.mo6806();
        if (c15690Mo6806.m35730()) {
            textView.setText(R.string.MT_Protector);
            return;
        }
        if (!c15690Mo6806.m35729(3)) {
            C13010 c13010Mo6827 = ((AbstractC16341) interfaceC3621).mo6827();
            if (!TextUtils.isEmpty(this.f33786)) {
                strM27782 = this.f33786;
            } else {
                strM27782 = m27782(c13010Mo6827);
            }
            if (m27815(strM27782).isEmpty()) {
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        textView.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ֫ */
    private C21476 m27806() {
        String strM27782;
        List<C6723> listM27831;
        int i;
        InterfaceC3621 interfaceC3621 = this.f33747;
        if (interfaceC3621 == null) {
            return C21476.m48673(null, null);
        }
        C13010 c13010Mo6827 = ((AbstractC16341) interfaceC3621).mo6827();
        String strM27703 = m27703(c13010Mo6827);
        if (!TextUtils.isEmpty(this.f33786)) {
            strM27782 = this.f33786;
        } else {
            strM27782 = m27782(c13010Mo6827);
        }
        if (interfaceC3621.mo6806().m35730()) {
            listM27831 = Collections.EMPTY_LIST;
        } else {
            listM27831 = m27831(interfaceC3621.mo6806());
        }
        List<C3844> listM27815 = m27815(strM27782);
        if (!listM27815.isEmpty() && !TextUtils.isEmpty(this.f33699) && m27783(this.f33699, listM27831) != null) {
            ArrayList arrayList = new ArrayList(listM27815.size());
            for (C3844 c3844 : listM27815) {
                if (!TextUtils.equals(this.f33699, c3844.m7540().getPath())) {
                    arrayList.add(c3844);
                }
            }
            listM27815 = arrayList;
        }
        if (listM27831.isEmpty() && listM27815.isEmpty()) {
            return C21476.m48673(strM27703, strM27782);
        }
        ArrayList arrayList2 = new ArrayList(listM27815.size() + listM27831.size() + 2);
        arrayList2.add(new C22817(EnumC23487.AUTO, getString(R.string.MT_Protector), null, null));
        arrayList2.add(new C22817(EnumC23487.OFF, getString(R.string.MT_Protector), null, null));
        for (C6723 c6723 : listM27831) {
            arrayList2.add(new C22817(EnumC23487.TRACK, c6723.m15363(), c6723, null));
        }
        for (C3844 c3845 : listM27815) {
            arrayList2.add(new C22817(EnumC23487.FILE, c3845.m7540().mo39151(), null, c3845));
        }
        C13680 c13680Mo6812 = interfaceC3621.mo6812();
        if (!c13680Mo6812.f38569.contains(3)) {
            AbstractC21520 it = c13680Mo6812.f38562.values().iterator();
            loop3: while (true) {
                if (it.hasNext()) {
                    C14350 c14350 = (C14350) it.next();
                    if (c14350.f41039.f42920 == 3) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            C22817 c22817 = (C22817) arrayList2.get(i2);
                            C6723 c6723M51022 = c22817.m51022();
                            if (c22817.m51020() == EnumC23487.TRACK && c6723M51022 != null && c6723M51022.m15366().m53834().equals(c14350.f41039) && c14350.f41040.contains(Integer.valueOf(c6723M51022.m15368()))) {
                                i = i2;
                                break loop3;
                            }
                        }
                    }
                } else {
                    if (this.f33693 == EnumC22147.MANUAL && !TextUtils.isEmpty(this.f33699)) {
                        i = 0;
                        while (i < arrayList2.size()) {
                            C22817 c22818 = (C22817) arrayList2.get(i);
                            if (c22818.m51020() == EnumC23487.FILE && c22818.m51019() != null && TextUtils.equals(this.f33699, c22818.m51019().m7540().getPath())) {
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
        return new C21476(i, strM27703, strM27782, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ */
    private List m27831(C15690 c15690) {
        ArrayList<C5382> arrayList = new ArrayList();
        AbstractC6767 abstractC6767ListIterator = c15690.m35728().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            C24408 c24408 = (C24408) abstractC6767ListIterator.next();
            if (c24408.m53836() == 3) {
                for (int i = 0; i < c24408.f77291; i++) {
                    if (c24408.m53835(i, true)) {
                        arrayList.add(new C5382(c24408, i, c24408.m53833(i), arrayList.size()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (C5382 c5382 : arrayList) {
            arrayList2.add(m27780(c5382.m11766(), false));
            arrayList3.add(m27780(c5382.m11766(), true));
        }
        HashMap mapM27705 = m27705(arrayList2);
        HashMap mapM27706 = m27705(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C5382 c5383 = (C5382) arrayList.get(i2);
            String str = (String) arrayList2.get(i2);
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.MT_Protector) + " " + (c5383.m11769() + 1);
            } else if (((Integer) C15525.getOrDefault(mapM27705, m27825(str), 0)).intValue() > 1) {
                str = (String) arrayList3.get(i2);
                String strM27825 = m27825(str);
                if (TextUtils.isEmpty(str) || ((Integer) C15525.getOrDefault(mapM27706, strM27825, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector) + " " + (c5383.m11769() + 1);
                }
            }
            arrayList4.add(new C6723(c5383.m11768(), c5383.m11767(), c5383.m11766().f28535, c5383.m11766().f28549, str, c5383.m11769()));
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX INFO: renamed from: ۧ */
    public static String m27780(C10307 c10307, boolean z) {
        ArrayList arrayList = new ArrayList(4);
        m27716(c10307.f28549, arrayList);
        m27716(m27804(c10307.f28517), arrayList);
        m27716(m27858(c10307.f28522), arrayList);
        if (z) {
            String strSubstring = c10307.f28528;
            String upperCase = c10307.f28533;
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
            m27716(upperCase, arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join(" · ", arrayList);
    }

    /* JADX INFO: renamed from: ܽ */
    private List m27815(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f33768)) {
            return Collections.EMPTY_LIST;
        }
        return this.f33765;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m27835(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.f33768) && this.f33684;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16780 m27711(C13010 c13010, List list, C3844 c3844, EnumC22147 enumC22147, boolean z) {
        if (c3844 == null || enumC22147 == EnumC22147.NONE) {
            return C16780.m38021(c13010, list, z);
        }
        C23718 c23718M29828 = c13010.m29828();
        String path = c3844.m7540().getPath();
        C9636 c9636 = new C9636(new Uri.Builder().scheme("mt_media").path(path).build());
        c9636.m22434(c3844.m7541());
        c9636.m22432();
        c9636.m22433(c3844.m7540().mo39151());
        c9636.m22431(path);
        c23718M29828.m52739(Collections.singletonList(c9636.m22430()));
        return new C16780(c23718M29828.m52735(), list, z, enumC22147, c3844.m7540().getPath(), 0);
    }

    /* JADX INFO: renamed from: ֫ */
    private C3844 m27707(String str, List list) {
        boolean zEqualsIgnoreCase;
        C17984 c17984 = this.f33705;
        boolean z = c17984 != null && c17984.m40968().mo15799();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3844 c3844 = (C3844) it.next();
            String name = c3844.m7540().getName();
            if (name == null || str == null) {
                zEqualsIgnoreCase = false;
            } else {
                zEqualsIgnoreCase = z ? name.equalsIgnoreCase(str) : name.equals(str);
            }
            if (zEqualsIgnoreCase) {
                return c3844;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m27834(ActivityC12088 activityC12088, C13010 c13010) {
        C20806.m46968(activityC12088.f33785, activityC12088.m27782(c13010), new C20864());
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m27819(ActivityC12088 activityC12088, C13010 c13010) {
        C20806.m46968(activityC12088.f33734, activityC12088.m27782(c13010), new C20193());
    }

    /* JADX INFO: renamed from: ܺ֫ */
    private void m27812() {
        C20806.m46965(this.f33734);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27746(ActivityC12088 activityC12088, C15690 c15690) {
        C6723 c6723M27783;
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        C20806 c20806 = activityC12088.f33785;
        C3370 c3370 = (C3370) C20806.m46970(c20806);
        if (interfaceC6324 == null || c3370 == null || c15690.m35730() || !TextUtils.equals(c3370.m5894(), activityC12088.f33786)) {
            return false;
        }
        if (!TextUtils.equals(c3370.m5894(), activityC12088.m27806().m48675())) {
            return false;
        }
        List listM27831 = activityC12088.m27831(c15690);
        if (listM27831.isEmpty() || (c6723M27783 = activityC12088.m27783(c3370.m5895(), listM27831)) == null) {
            return false;
        }
        C20806.m46965(c20806);
        m27718(interfaceC6324, c6723M27783);
        activityC12088.m27785(c6723M27783.m15363());
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m27822(ActivityC12088 activityC12088, C15690 c15690) {
        boolean zEqualsIgnoreCase;
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        C7394 c7394 = (C7394) C20806.m46970(activityC12088.f33734);
        if (interfaceC6324 != null && c7394 != null && !c15690.m35730()) {
            String strM17119 = c7394.m17119();
            if (TextUtils.equals(strM17119, activityC12088.f33786) && TextUtils.equals(strM17119, activityC12088.m27806().m48675())) {
                C15992 c15992M49624 = C22029.m49624(strM17119);
                if (c15992M49624 == null) {
                    activityC12088.m27812();
                    return false;
                }
                int i = C5440.f12974[c15992M49624.m36342().ordinal()];
                if (i == 1) {
                    activityC12088.m27812();
                    interfaceC6324.mo6801(interfaceC6324.mo6812().mo31081().mo19200(3, true).mo19199(3).mo19204());
                    activityC12088.m27785((CharSequence) activityC12088.getString(R.string.MT_Protector));
                    return true;
                }
                if (i == 2) {
                    int iM36340 = c15992M49624.m36340();
                    List listM27831 = activityC12088.m27831(c15690);
                    if (!listM27831.isEmpty()) {
                        activityC12088.m27812();
                        if (iM36340 < 0 || iM36340 >= listM27831.size()) {
                            C22029.m49629(strM17119);
                            return false;
                        }
                        C6723 c6723 = (C6723) listM27831.get(iM36340);
                        m27718(interfaceC6324, c6723);
                        activityC12088.m27785(c6723.m15363());
                        return true;
                    }
                } else {
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    String strM36341 = c15992M49624.m36341();
                    if (TextUtils.isEmpty(strM36341)) {
                        activityC12088.m27812();
                        C22029.m49629(strM17119);
                        return false;
                    }
                    if (c7394.m17120()) {
                        activityC12088.m27812();
                        return false;
                    }
                    String strSubstring = activityC12088.f33699;
                    if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = null;
                    } else {
                        int iLastIndexOf = strSubstring.lastIndexOf(47);
                        if (iLastIndexOf >= 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf + 1);
                        }
                    }
                    C17984 c17984 = activityC12088.f33705;
                    boolean z = c17984 != null && c17984.m40968().mo15799();
                    if (strSubstring == null || strM36341 == null) {
                        zEqualsIgnoreCase = false;
                    } else {
                        zEqualsIgnoreCase = z ? strSubstring.equalsIgnoreCase(strM36341) : strSubstring.equals(strM36341);
                    }
                    if (zEqualsIgnoreCase) {
                        activityC12088.m27812();
                        return false;
                    }
                    if (activityC12088.m27835(strM17119) && activityC12088.m27707(strM36341, activityC12088.m27815(strM17119)) == null) {
                        activityC12088.m27812();
                        C22029.m49629(strM17119);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private C6723 m27783(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6723 c6723 = (C6723) it.next();
            if (TextUtils.equals(str, c6723.m15365())) {
                return c6723;
            }
        }
        String strM27859 = m27859(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C6723 c6724 = (C6723) it2.next();
            if (TextUtils.equals(strM27859, c6724.m15364())) {
                return c6724;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27718(InterfaceC6324 interfaceC6324, C6723 c6723) {
        interfaceC6324.mo6801(interfaceC6324.mo6812().mo31081().mo19200(3, false).mo19199(3).mo19202(new C14350(c6723.m15366().m53834(), Collections.singletonList(Integer.valueOf(c6723.m15368())))).mo19204());
    }

    /* JADX INFO: renamed from: ۖ֫ */
    private void m27751() {
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (interfaceC6324 == null) {
            return;
        }
        C13680 c13680Mo6812 = interfaceC6324.mo6812();
        AbstractC21520 it = c13680Mo6812.f38562.values().iterator();
        while (it.hasNext()) {
            if (((C14350) it.next()).f41039.f42920 == 3) {
                interfaceC6324.mo6801(c13680Mo6812.mo31081().mo19200(3, false).mo19199(3).mo19204());
            }
        }
        if (!c13680Mo6812.f38569.contains(3)) {
            return;
        }
        interfaceC6324.mo6801(c13680Mo6812.mo31081().mo19200(3, false).mo19199(3).mo19204());
    }

    /* JADX INFO: renamed from: ᩻ */
    private String m27859(String str) {
        for (C3844 c3844 : this.f33765) {
            if (TextUtils.equals(str, c3844.m7540().getPath())) {
                return c3844.m7540().mo39151();
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
        View view = this.f33719;
        if (view != null && view.getVisibility() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f33750 = motionEvent.getRawY();
                this.f33689 = false;
                if (this.f33779 == null) {
                    this.f33779 = VelocityTracker.obtain();
                }
                this.f33779.clear();
                this.f33779.addMovement(motionEvent);
            } else if (action == 1) {
                if (this.f33689) {
                    velocityTracker = this.f33779;
                    if (velocityTracker == null) {
                        this.f33689 = false;
                        View view2 = this.f33707;
                        ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f33779.computeCurrentVelocity(1000);
                    yVelocity = this.f33779.getYVelocity();
                    float translationY = this.f33707.getTranslationY();
                    float height = this.f33707.getHeight();
                    if (yVelocity < 1000.0f || (yVelocity > -1000.0f && translationY > height * 0.4f)) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m27821(z);
                    } else {
                        ObjectAnimator.ofFloat(this.f33707, "translationY", translationY, 0.0f).start();
                    }
                    this.f33689 = false;
                    return true;
                }
            } else if (action == 2) {
                if (this.f33779 == null) {
                    this.f33750 = motionEvent.getRawY();
                    this.f33689 = false;
                    VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                    this.f33779 = velocityTrackerObtain;
                    velocityTrackerObtain.clear();
                }
                this.f33779.addMovement(motionEvent);
                if (!this.f33689 && motionEvent.getRawY() - this.f33750 > ViewConfiguration.get(this).getScaledTouchSlop() && !this.f33707.canScrollVertically(-1)) {
                    this.f33689 = true;
                    this.f33750 = motionEvent.getRawY();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (this.f33689) {
                    this.f33707.setTranslationY(Math.max((motionEvent.getRawY() - this.f33750) * 1.5f, 0.0f));
                    return true;
                }
            } else if (action == 3) {
                if (this.f33689) {
                    velocityTracker = this.f33779;
                    if (velocityTracker == null) {
                        this.f33689 = false;
                        View view3 = this.f33707;
                        ObjectAnimator.ofFloat(view3, "translationY", view3.getTranslationY(), 0.0f).start();
                        return true;
                    }
                    velocityTracker.addMovement(motionEvent);
                    this.f33779.computeCurrentVelocity(1000);
                    yVelocity = this.f33779.getYVelocity();
                    float translationY2 = this.f33707.getTranslationY();
                    float height2 = this.f33707.getHeight();
                    if (yVelocity < 1000.0f) {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m27821(z);
                    } else {
                        if (yVelocity >= 1000.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m27821(z);
                    }
                    this.f33689 = false;
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public static void m27775(ActivityC12088 activityC12088) {
        activityC12088.m27821(false);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m27805(ActivityC12088 activityC12088) {
        activityC12088.m27821(false);
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public static boolean m27752(ActivityC12088 activityC12088) {
        return activityC12088.f33751.getVisibility() == 4;
    }

    /* JADX INFO: renamed from: ᩴ */
    public static void m27838(ActivityC12088 activityC12088) {
        if (activityC12088.f33751.getVisibility() == 4) {
            activityC12088.f33755.setVisibility(0);
            activityC12088.f33751.setVisibility(0);
            activityC12088.f33701.setVisibility(0);
            activityC12088.f33772.setImageResource(R.drawable.MT_Protector);
        } else {
            activityC12088.f33755.setVisibility(4);
            activityC12088.f33751.setVisibility(4);
            activityC12088.f33701.setVisibility(4);
            activityC12088.f33772.setImageResource(R.drawable.MT_Protector);
        }
        activityC12088.f33788.m45498();
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m27765(ActivityC12088 activityC12088) {
        activityC12088.m27777();
        String strM27761 = activityC12088.m27761();
        if (!TextUtils.isEmpty(strM27761)) {
            activityC12088.f33697 = strM27761;
            activityC12088.f33742 = false;
        } else {
            activityC12088.f33742 = true;
        }
        if (activityC12088.getResources().getConfiguration().orientation == 1) {
            activityC12088.f33733 = EnumC20135.MANUAL;
            if (activityC12088.getRequestedOrientation() != 0) {
                activityC12088.setRequestedOrientation(0);
                return;
            }
            return;
        }
        activityC12088.f33733 = EnumC20135.MANUAL;
        if (activityC12088.getRequestedOrientation() != 1) {
            activityC12088.setRequestedOrientation(1);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final View m27869(int i) {
        View viewFindViewById = findViewById(i);
        viewFindViewById.setBackground(new C23784());
        return viewFindViewById;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC1086, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        InterfaceC3621 interfaceC3621;
        if (!this.f33706 || ((keyCode = keyEvent.getKeyCode()) != 90 && keyCode != 89 && keyCode != 87 && keyCode != 88 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 79 || keyCode2 == 85) {
                m27867();
            } else if (keyCode2 == 126) {
                InterfaceC6324 interfaceC6324 = this.f33747;
                if (interfaceC6324 != null && C5792.m13007((InterfaceC3621) interfaceC6324, true)) {
                    m27867();
                    return true;
                }
            } else if (keyCode2 == 127 && (interfaceC3621 = this.f33747) != null) {
                ((AbstractC16341) interfaceC3621).mo6802(false);
                return true;
            }
        }
        return true;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        if (isFinishing() && !isChangingConfigurations()) {
            C11931.m27268(this.f33759);
            this.f33759 = null;
        }
        super.onDestroy();
        C20079 c20079 = this.f33788;
        if (c20079 != null) {
            c20079.removeCallbacks(this.f33712);
        }
        m27793(true);
        C4789 c4789 = this.f33773;
        C12363 c12363 = this.f33782;
        c12363.m28457(c4789);
        C7050.m16221().removeCallbacks(this.f33704);
        c12363.m28453();
        m27694();
    }

    /* JADX INFO: renamed from: ֡֫ */
    private void m27694() {
        this.f33760 = false;
        C17984 c17984 = this.f33705;
        this.f33705 = null;
        final C18199 c18199 = c17984 == null ? null : new C18199(c17984);
        C20079 c20079 = this.f33788;
        if (c20079 != null) {
            c20079.m45490((InterfaceC3621) null);
        }
        InterfaceC6324 interfaceC6324 = this.f33747;
        if (interfaceC6324 != null) {
            interfaceC6324.mo6823();
            this.f33747.mo14457();
            this.f33747 = null;
        }
        if (c18199 != null) {
            c18199.m41407();
        }
        m27777();
        this.f33697 = null;
        this.f33742 = false;
        this.f33733 = EnumC20135.NONE;
        m27774();
        m27812();
        m27849();
        this.f33786 = null;
        if (c17984 != null) {
            c17984.m40967();
            c18199.m41405();
        }
        C24905 c24905 = this.f33739;
        this.f33739 = null;
        final RunnableC9413 runnableC9413 = new RunnableC9413(6, c24905);
        this.f33694++;
        this.f33769 = C8454.f22684;
        this.f33700 = null;
        View view = this.f33775;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f33721;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C23961 c23961 = this.f33752;
        this.f33752 = null;
        Future future = this.f33758;
        this.f33758 = null;
        this.f33745++;
        if (future != null) {
            future.cancel(true);
        }
        final C17391 c17391 = this.f33762;
        this.f33762 = null;
        m27861();
        this.f33761 = null;
        C6585 c6585 = this.f33732;
        this.f33732 = null;
        int i = (c23961 == null ? 0 : 1) + (c6585 != null ? 1 : 0);
        if (i == 0) {
            if (c17391 != null) {
                c17391.close();
            }
            if (c18199 != null) {
                c18199.m41406();
            }
            runnableC9413.run();
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(i);
            Runnable runnable = new Runnable() { // from class: l.᩵۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ActivityC12088.f33683;
                    if (atomicInteger.decrementAndGet() != 0) {
                        return;
                    }
                    C17391 c17392 = c17391;
                    if (c17392 != null) {
                        c17392.close();
                    }
                    C18199 c181910 = c18199;
                    if (c181910 != null) {
                        c181910.m41406();
                    }
                    runnableC9413.run();
                }
            };
            if (c23961 != null) {
                c23961.m53103(runnable);
            }
            if (c6585 != null) {
                c6585.m15067(runnable);
            }
        }
        C20549 c20549 = this.f33729;
        this.f33729 = null;
        if (c20549 != null) {
            c20549.m46475();
        }
        C16524 c16524 = this.f33754;
        this.f33754 = null;
        if (c16524 != null) {
            c16524.close();
        }
        this.f33708 = null;
        this.f33783 = null;
        this.f33725 = null;
        C3310 c3310 = this.f33787;
        this.f33787 = null;
        if (c3310 != null) {
            c3310.close();
        }
        VelocityTracker velocityTracker = this.f33779;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33779 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ InterfaceC22753 m27712(ActivityC12088 activityC12088, InterfaceC16716 interfaceC16716, InterfaceC16716 interfaceC16717, InterfaceC16716 interfaceC16718, int i) {
        if (i == 4) {
            return interfaceC16716.mo8449();
        }
        if (i == 1) {
            return new C5244(interfaceC16717.mo8449(), activityC12088.f33729);
        }
        return interfaceC16718.mo8449();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private void m27796() {
        int i = 0;
        if (ApplicationC21448.f67649.getBoolean("vpffs", false)) {
            i = ApplicationC21448.f67649.getBoolean("vpsm", false) ? 3 : 4;
        }
        this.f33788.m45489(i);
        m27847(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m27820(ActivityC12088 activityC12088, boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "vpsm", z);
        activityC12088.m27796();
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public static boolean m27839() {
        return ApplicationC21448.f67649.getBoolean("vpao", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27743(ActivityC12088 activityC12088, boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "vpao", z);
        if (!z) {
            activityC12088.m27777();
            if (activityC12088.f33733 != EnumC20135.AUTO) {
                return;
            }
            activityC12088.f33733 = EnumC20135.NONE;
            if (activityC12088.getRequestedOrientation() != -1) {
                activityC12088.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        String strM27761 = activityC12088.m27761();
        if (!TextUtils.isEmpty(strM27761)) {
            if (!TextUtils.equals(strM27761, activityC12088.f33697)) {
                activityC12088.f33697 = null;
            }
            if (!TextUtils.equals(strM27761, activityC12088.f33697)) {
                C20806.m46967(activityC12088.f33711, strM27761);
                activityC12088.m27845();
            }
        }
        InterfaceC6324 interfaceC6324 = activityC12088.f33747;
        if (interfaceC6324 != null) {
            activityC12088.m27720(interfaceC6324.mo6815());
        }
    }

    /* JADX INFO: renamed from: ֫֫ */
    public static boolean m27749() {
        return ApplicationC21448.f67649.getBoolean("vplp", false);
    }

    /* JADX INFO: renamed from: ۟ */
    public static boolean m27769() {
        return ApplicationC21448.f67649.getBoolean("vpapn", false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27792(ActivityC12088 activityC12088, boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "vpun", z);
        activityC12088.m27824();
    }
}
