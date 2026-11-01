package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܽ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GQ */
/* JADX INFO: loaded from: classes4.dex */
public class C17869 extends FrameLayout {

    /* JADX INFO: renamed from: ᩶֫ */
    public static final /* synthetic */ int f53349 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public final String f53350;

    /* JADX INFO: renamed from: ֨֫ */
    public final InterfaceC10020 f53351;

    /* JADX INFO: renamed from: ֫֫ */
    public final Drawable f53352;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f53353;

    /* JADX INFO: renamed from: ۗ */
    public final Formatter f53354;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f53355;

    /* JADX INFO: renamed from: ۙ */
    public final StringBuilder f53356;

    /* JADX INFO: renamed from: ۚ֫ */
    public final Drawable f53357;

    /* JADX INFO: renamed from: ۛ */
    public final View f53358;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f53359;

    /* JADX INFO: renamed from: ۟ */
    public final View f53360;

    /* JADX INFO: renamed from: ۠֫ */
    public int f53361;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f53362;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f53363;

    /* JADX INFO: renamed from: ۤ */
    public boolean f53364;

    /* JADX INFO: renamed from: ۧ֫ */
    public final String f53365;

    /* JADX INFO: renamed from: ۨ */
    public final View f53366;

    /* JADX INFO: renamed from: ۫ */
    public long f53367;

    /* JADX INFO: renamed from: ۬ */
    public final RunnableC6038 f53368;

    /* JADX INFO: renamed from: ܰ */
    public final TextView f53369;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f53370;

    /* JADX INFO: renamed from: ܶ֫ */
    public final RunnableC7712 f53371;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f53372;

    /* JADX INFO: renamed from: ܽ֫ */
    public final Drawable f53373;

    /* JADX INFO: renamed from: ܿ֫ */
    public final ImageView f53374;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final Drawable f53375;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final ImageView f53376;

    /* JADX INFO: renamed from: ᩵֫ */
    public final Drawable f53377;

    /* JADX INFO: renamed from: ᩶ */
    public final View f53378;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f53379;

    /* JADX INFO: renamed from: ᩸ */
    public final float f53380;

    /* JADX INFO: renamed from: ᩸֫ */
    public final CopyOnWriteArrayList f53381;

    /* JADX INFO: renamed from: ᩹ */
    public long f53382;

    /* JADX INFO: renamed from: ᩹֫ */
    public final View f53383;

    /* JADX INFO: renamed from: ᩺ */
    public final View f53384;

    /* JADX INFO: renamed from: ᩻֫ */
    public final View f53385;

    static {
        C18373.m41851("media3.ui");
    }

    public C17869(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17869(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53355 = OpenAuthTask.Duplex;
        this.f53370 = 0;
        this.f53361 = 200;
        this.f53367 = -9223372036854775807L;
        this.f53372 = true;
        this.f53379 = true;
        this.f53362 = true;
        this.f53363 = true;
        this.f53353 = false;
        int resourceId = R.layout.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C23976.f76169, i, 0);
            try {
                this.f53355 = typedArrayObtainStyledAttributes.getInt(19, OpenAuthTask.Duplex);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.MT_Protector);
                this.f53370 = typedArrayObtainStyledAttributes.getInt(8, 0);
                this.f53372 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                this.f53379 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                this.f53362 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                this.f53363 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                this.f53353 = typedArrayObtainStyledAttributes.getBoolean(18, false);
                this.f53361 = C5792.m12976(typedArrayObtainStyledAttributes.getInt(20, this.f53361), 16, 1000);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f53381 = new CopyOnWriteArrayList();
        new C23738();
        new C21727();
        StringBuilder sb = new StringBuilder();
        this.f53356 = sb;
        this.f53354 = new Formatter(sb, Locale.getDefault());
        ViewOnClickListenerC3788 viewOnClickListenerC3788 = new ViewOnClickListenerC3788(this);
        this.f53371 = new RunnableC7712(1, this);
        this.f53368 = new RunnableC6038(1, this);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC10020 interfaceC10020 = (InterfaceC10020) findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        if (interfaceC10020 != null) {
            this.f53351 = interfaceC10020;
        } else if (viewFindViewById != null) {
            C9271 c9271 = new C9271(context, null, 0, attributeSet, 0);
            c9271.setId(R.id.MT_Protector);
            c9271.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(c9271, iIndexOfChild);
            this.f53351 = c9271;
        } else {
            this.f53351 = null;
        }
        this.f53369 = (TextView) findViewById(R.id.MT_Protector);
        InterfaceC10020 interfaceC10021 = this.f53351;
        if (interfaceC10021 != null) {
            interfaceC10021.mo21461(viewOnClickListenerC3788);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f53384 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC3788);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f53366 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC3788);
        }
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        this.f53360 = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC3788);
        }
        View viewFindViewById5 = findViewById(R.id.MT_Protector);
        this.f53358 = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC3788);
        }
        View viewFindViewById6 = findViewById(R.id.MT_Protector);
        this.f53385 = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC3788);
        }
        View viewFindViewById7 = findViewById(R.id.MT_Protector);
        this.f53378 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC3788);
        }
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f53374 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC3788);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f53376 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC3788);
        }
        View viewFindViewById8 = findViewById(R.id.MT_Protector);
        this.f53383 = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setVisibility(8);
        }
        m40586(viewFindViewById8, false);
        Resources resources = context.getResources();
        resources.getInteger(R.integer.MT_Protector);
        this.f53380 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f53373 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f53375 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f53352 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f53357 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f53377 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f53365 = resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        this.f53350 = resources.getString(R.string.MT_Protector);
        this.f53382 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40603() {
        if (m40604()) {
            setVisibility(8);
            for (InterfaceC12506 interfaceC12506 : this.f53381) {
                getVisibility();
                interfaceC12506.m28805();
            }
            removeCallbacks(this.f53371);
            removeCallbacks(this.f53368);
            this.f53367 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m40604() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40595() {
        RunnableC6038 runnableC6038 = this.f53368;
        removeCallbacks(runnableC6038);
        int i = this.f53355;
        if (i > 0) {
            long j = i;
            this.f53367 = SystemClock.uptimeMillis() + j;
            if (this.f53364) {
                postDelayed(runnableC6038, j);
                return;
            }
            return;
        }
        this.f53367 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public void m40596() {
        boolean zIsAccessibilityFocused;
        if (m40604() && this.f53364) {
            String str = C5792.f14228;
            View view = this.f53384;
            boolean zIsFocused = false;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f53366;
            if (view2 != null) {
                zIsFocused = view2.isFocused();
                zIsAccessibilityFocused = view2.isAccessibilityFocused();
                view2.setVisibility(8);
            } else {
                zIsAccessibilityFocused = false;
            }
            if (zIsFocused && view != null) {
                view.requestFocus();
            }
            if (!zIsAccessibilityFocused || view == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m40599() {
        if (m40604() && this.f53364) {
            m40586(this.f53360, this.f53362);
            m40586(this.f53385, this.f53372);
            m40586(this.f53378, this.f53379);
            m40586(this.f53358, this.f53363);
            InterfaceC10020 interfaceC10020 = this.f53351;
            if (interfaceC10020 != null) {
                interfaceC10020.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m40601() {
        ImageView imageView;
        if (m40604() && this.f53364 && (imageView = this.f53374) != null) {
            if (this.f53370 == 0) {
                m40586((View) imageView, false);
                return;
            }
            m40586((View) imageView, true);
            imageView.setImageDrawable(this.f53373);
            imageView.setContentDescription(this.f53365);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public void m40589() {
        ImageView imageView;
        if (m40604() && this.f53364 && (imageView = this.f53376) != null) {
            if (!this.f53353) {
                m40586((View) imageView, false);
                return;
            }
            m40586((View) imageView, true);
            imageView.setImageDrawable(this.f53377);
            imageView.setContentDescription(this.f53350);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m40592() {
        if (m40604() && this.f53364) {
            boolean z = 0 != this.f53382;
            this.f53382 = 0L;
            TextView textView = this.f53369;
            if (textView != null && !this.f53359 && z) {
                textView.setText(C5792.m12996(this.f53356, this.f53354, 0L));
            }
            InterfaceC10020 interfaceC10020 = this.f53351;
            if (interfaceC10020 != null) {
                interfaceC10020.mo21460(0L);
                interfaceC10020.mo21467(0L);
            }
            removeCallbacks(this.f53371);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40586(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(false);
        view.setAlpha(this.f53380);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53364 = true;
        long j = this.f53367;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m40603();
            } else {
                postDelayed(this.f53368, jUptimeMillis);
            }
        } else if (m40604()) {
            m40595();
        }
        m40596();
        m40599();
        m40601();
        m40589();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53364 = false;
        removeCallbacks(this.f53371);
        removeCallbacks(this.f53368);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f53368);
        } else if (motionEvent.getAction() == 1) {
            m40595();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }
}
