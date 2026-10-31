package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܽ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GQ */
/* JADX INFO: loaded from: classes4.dex */
public class C16310 extends FrameLayout {

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50182 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final String f50183;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8051 f50184;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50185;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f50186;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Formatter f50187;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f50188;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f50189;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50190;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f50191;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f50192;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f50193;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f50194;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f50195;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f50196;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f50197;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f50198;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View f50199;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f50200;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RunnableC3861 f50201;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f50202;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f50203;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC5622 f50204;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f50205;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50206;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f50207;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50208;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f50209;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50210;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f50211;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f50212;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f50213;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f50214;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f50215;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final View f50216;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final View f50217;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final View f50218;

    static {
        C16840.m39615("media3.ui");
    }

    public C16310(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16310(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50188 = OpenAuthTask.Duplex;
        this.f50203 = 0;
        this.f50194 = 200;
        this.f50200 = -9223372036854775807L;
        this.f50205 = true;
        this.f50212 = true;
        this.f50195 = true;
        this.f50196 = true;
        this.f50186 = false;
        int resourceId = R.layout.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C22736.f73442, i, 0);
            try {
                this.f50188 = typedArrayObtainStyledAttributes.getInt(19, OpenAuthTask.Duplex);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.MT_Protector);
                this.f50203 = typedArrayObtainStyledAttributes.getInt(8, 0);
                this.f50205 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                this.f50212 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                this.f50195 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                this.f50196 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                this.f50186 = typedArrayObtainStyledAttributes.getBoolean(18, false);
                this.f50194 = C3603.m11000(typedArrayObtainStyledAttributes.getInt(20, this.f50194), 16, 1000);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f50214 = new CopyOnWriteArrayList();
        new C22485();
        new C20369();
        StringBuilder sb = new StringBuilder();
        this.f50189 = sb;
        this.f50187 = new Formatter(sb, Locale.getDefault());
        ViewOnClickListenerC1494 viewOnClickListenerC1494 = new ViewOnClickListenerC1494(this);
        this.f50204 = new RunnableC5622(1, this);
        this.f50201 = new RunnableC3861(1, this);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC8051 interfaceC8051 = (InterfaceC8051) findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        if (interfaceC8051 != null) {
            this.f50184 = interfaceC8051;
        } else if (viewFindViewById != null) {
            C7263 c7263 = new C7263(context, null, 0, attributeSet, 0);
            c7263.setId(R.id.MT_Protector);
            c7263.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(c7263, iIndexOfChild);
            this.f50184 = c7263;
        } else {
            this.f50184 = null;
        }
        this.f50202 = (TextView) findViewById(R.id.MT_Protector);
        InterfaceC8051 interfaceC8052 = this.f50184;
        if (interfaceC8052 != null) {
            interfaceC8052.mo19495(viewOnClickListenerC1494);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f50217 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC1494);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f50199 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC1494);
        }
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        this.f50193 = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC1494);
        }
        View viewFindViewById5 = findViewById(R.id.MT_Protector);
        this.f50191 = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC1494);
        }
        View viewFindViewById6 = findViewById(R.id.MT_Protector);
        this.f50218 = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC1494);
        }
        View viewFindViewById7 = findViewById(R.id.MT_Protector);
        this.f50211 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC1494);
        }
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f50207 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC1494);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f50209 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC1494);
        }
        View viewFindViewById8 = findViewById(R.id.MT_Protector);
        this.f50216 = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setVisibility(8);
        }
        m38371(viewFindViewById8, false);
        Resources resources = context.getResources();
        resources.getInteger(R.integer.MT_Protector);
        this.f50213 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f50206 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f50208 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f50185 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f50190 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f50210 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f50198 = resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        this.f50183 = resources.getString(R.string.MT_Protector);
        this.f50215 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38388() {
        if (m38389()) {
            setVisibility(8);
            for (InterfaceC10667 interfaceC10667 : this.f50214) {
                getVisibility();
                interfaceC10667.m26766();
            }
            removeCallbacks(this.f50204);
            removeCallbacks(this.f50201);
            this.f50200 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38389() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38380() {
        RunnableC3861 runnableC3861 = this.f50201;
        removeCallbacks(runnableC3861);
        int i = this.f50188;
        if (i > 0) {
            long j = i;
            this.f50200 = SystemClock.uptimeMillis() + j;
            if (this.f50197) {
                postDelayed(runnableC3861, j);
                return;
            }
            return;
        }
        this.f50200 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m38381() {
        boolean zIsAccessibilityFocused;
        if (m38389() && this.f50197) {
            String str = C3603.f11424;
            View view = this.f50217;
            boolean zIsFocused = false;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f50199;
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m38384() {
        if (m38389() && this.f50197) {
            m38371(this.f50193, this.f50195);
            m38371(this.f50218, this.f50205);
            m38371(this.f50211, this.f50212);
            m38371(this.f50191, this.f50196);
            InterfaceC8051 interfaceC8051 = this.f50184;
            if (interfaceC8051 != null) {
                interfaceC8051.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m38386() {
        ImageView imageView;
        if (m38389() && this.f50197 && (imageView = this.f50207) != null) {
            if (this.f50203 == 0) {
                m38371((View) imageView, false);
                return;
            }
            m38371((View) imageView, true);
            imageView.setImageDrawable(this.f50206);
            imageView.setContentDescription(this.f50198);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m38374() {
        ImageView imageView;
        if (m38389() && this.f50197 && (imageView = this.f50209) != null) {
            if (!this.f50186) {
                m38371((View) imageView, false);
                return;
            }
            m38371((View) imageView, true);
            imageView.setImageDrawable(this.f50210);
            imageView.setContentDescription(this.f50183);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m38377() {
        if (m38389() && this.f50197) {
            boolean z = 0 != this.f50215;
            this.f50215 = 0L;
            TextView textView = this.f50202;
            if (textView != null && !this.f50192 && z) {
                textView.setText(C3603.m11020(this.f50189, this.f50187, 0L));
            }
            InterfaceC8051 interfaceC8051 = this.f50184;
            if (interfaceC8051 != null) {
                interfaceC8051.mo19494(0L);
                interfaceC8051.mo19501(0L);
            }
            removeCallbacks(this.f50204);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38371(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(false);
        view.setAlpha(this.f50213);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50197 = true;
        long j = this.f50200;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m38388();
            } else {
                postDelayed(this.f50201, jUptimeMillis);
            }
        } else if (m38389()) {
            m38380();
        }
        m38381();
        m38384();
        m38386();
        m38374();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50197 = false;
        removeCallbacks(this.f50204);
        removeCallbacks(this.f50201);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f50201);
        } else if (motionEvent.getAction() == 1) {
            m38380();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }
}
