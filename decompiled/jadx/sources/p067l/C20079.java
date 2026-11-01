package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ᩴ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes4.dex */
public class C20079 extends FrameLayout {

    /* JADX INFO: renamed from: ֫֫ */
    public int f61017;

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean f61018;

    /* JADX INFO: renamed from: ۗ */
    public final C7930 f61019;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f61020;

    /* JADX INFO: renamed from: ۙ */
    public final ViewOnClickListenerC4656 f61021;

    /* JADX INFO: renamed from: ۛ */
    public boolean f61022;

    /* JADX INFO: renamed from: ۜ֫ */
    public final Method f61023;

    /* JADX INFO: renamed from: ۟ */
    public final Class f61024;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C2643 f61025;

    /* JADX INFO: renamed from: ۢ֫ */
    public final View f61026;

    /* JADX INFO: renamed from: ۤ */
    public boolean f61027;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Object f61028;

    /* JADX INFO: renamed from: ۨ */
    public int f61029;

    /* JADX INFO: renamed from: ۫ */
    public boolean f61030;

    /* JADX INFO: renamed from: ۬ */
    public final C9823 f61031;

    /* JADX INFO: renamed from: ܰ */
    public final TextView f61032;

    /* JADX INFO: renamed from: ܳ֫ */
    public final FrameLayout f61033;

    /* JADX INFO: renamed from: ܺ֫ */
    public final View f61034;

    /* JADX INFO: renamed from: ܽ֫ */
    public final ImageView f61035;

    /* JADX INFO: renamed from: ܿ֫ */
    public final Handler f61036;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f61037;

    /* JADX INFO: renamed from: ᩶ */
    public final View f61038;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f61039;

    /* JADX INFO: renamed from: ᩸ */
    public int f61040;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f61041;

    /* JADX INFO: renamed from: ᩺ */
    public Drawable f61042;

    /* JADX INFO: renamed from: ᩻֫ */
    public InterfaceC3621 f61043;

    public C20079(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20079(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        Class<InterfaceC6324> cls;
        Object objNewProxyInstance;
        Method method;
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        super(context, attributeSet, i);
        ViewOnClickListenerC4656 viewOnClickListenerC4656 = new ViewOnClickListenerC4656(this);
        this.f61021 = viewOnClickListenerC4656;
        this.f61036 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f61019 = null;
            this.f61026 = null;
            this.f61034 = null;
            this.f61018 = false;
            this.f61035 = null;
            this.f61041 = null;
            this.f61025 = null;
            this.f61038 = null;
            this.f61032 = null;
            this.f61031 = null;
            this.f61033 = null;
            this.f61024 = null;
            this.f61023 = null;
            this.f61028 = null;
            ImageView imageView = new ImageView(context);
            if (Build.VERSION.SDK_INT >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.MT_Protector, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.MT_Protector, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.MT_Protector, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.MT_Protector));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C23976.f76170, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.MT_Protector);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                int i15 = typedArrayObtainStyledAttributes.getInt(38, OpenAuthTask.Duplex);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f61037 = typedArrayObtainStyledAttributes.getBoolean(16, this.f61037);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i6 = i14;
                z3 = z11;
                i4 = i11;
                z = z8;
                i5 = i15;
                i8 = color;
                z6 = z9;
                i3 = i13;
                i10 = i12;
                i2 = integer;
                i9 = resourceId2;
                z5 = zHasValue;
                i7 = resourceId;
                z4 = z12;
                z2 = z10;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 0;
            i3 = 1;
            z = true;
            i4 = 1;
            i5 = OpenAuthTask.Duplex;
            z2 = true;
            z3 = true;
            z4 = true;
            i6 = 0;
            i7 = R.layout.MT_Protector;
            i8 = 0;
            z5 = false;
            i9 = 0;
            i10 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        C7930 c7930 = (C7930) findViewById(R.id.MT_Protector);
        this.f61019 = c7930;
        if (c7930 != null) {
            c7930.m18336(i6);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f61026 = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (c7930 != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f61034 = new TextureView(context);
            } else {
                if (i3 == 3) {
                    try {
                        int i16 = C21381.f67435;
                        this.f61034 = (View) C21381.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i3 == 4) {
                    try {
                        int i17 = C17158.f51100;
                        this.f61034 = (View) C17158.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                } else {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        C17395.m39620(surfaceView);
                    }
                    this.f61034 = surfaceView;
                }
                this.f61034.setLayoutParams(layoutParams);
                this.f61034.setOnClickListener(viewOnClickListenerC4656);
                this.f61034.setClickable(false);
                c7930.addView(this.f61034, 0);
            }
            z7 = false;
            this.f61034.setLayoutParams(layoutParams);
            this.f61034.setOnClickListener(viewOnClickListenerC4656);
            this.f61034.setClickable(false);
            c7930.addView(this.f61034, 0);
        } else {
            this.f61034 = null;
            z7 = false;
        }
        this.f61018 = z7;
        this.f61033 = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f61035 = (ImageView) findViewById(R.id.MT_Protector);
        this.f61017 = i10;
        try {
            cls = InterfaceC6324.class;
            method = cls.getMethod("֫", InterfaceC17543.class);
            objNewProxyInstance = Proxy.newProxyInstance(InterfaceC17543.class.getClassLoader(), new Class[]{InterfaceC17543.class}, new InvocationHandler() { // from class: l.ۢ۠ۧ
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    C20079.m45459(this.f31650, method2, objArr);
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f61024 = cls;
        this.f61023 = method;
        this.f61028 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f61041 = imageView2;
        this.f61040 = (!z || i4 == 0 || imageView2 == null) ? 0 : i4;
        if (i9 != 0) {
            this.f61042 = C0886.m5548(getContext(), i9);
        }
        C2643 c2643 = (C2643) findViewById(R.id.MT_Protector);
        this.f61025 = c2643;
        if (c2643 != null) {
            boolean zIsInEditMode = c2643.isInEditMode();
            C24023 c24023 = C24023.f76300;
            if (!zIsInEditMode && (captioningManager2 = (CaptioningManager) c2643.getContext().getSystemService("captioning")) != null && captioningManager2.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager2.getUserStyle();
                c24023 = new C24023(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
            }
            c2643.m4037(c24023);
            float fontScale = 1.0f;
            if (!c2643.isInEditMode() && (captioningManager = (CaptioningManager) c2643.getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                fontScale = captioningManager.getFontScale();
            }
            c2643.m4035(fontScale * 0.0533f);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f61038 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f61039 = i2;
        TextView textView = (TextView) findViewById(R.id.MT_Protector);
        this.f61032 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C9823 c9823 = (C9823) findViewById(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        if (c9823 != null) {
            this.f61031 = c9823;
        } else if (viewFindViewById3 != null) {
            C9823 c9824 = new C9823(context, null, 0, attributeSet);
            this.f61031 = c9824;
            c9824.setId(R.id.MT_Protector);
            c9824.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c9824, iIndexOfChild);
        } else {
            this.f61031 = null;
        }
        C9823 c9825 = this.f61031;
        this.f61029 = c9825 != null ? i5 : 0;
        this.f61022 = z2;
        this.f61030 = z3;
        this.f61027 = z4;
        this.f61020 = z6 && c9825 != null;
        if (c9825 != null) {
            c9825.m22989();
            this.f61031.m22980(this.f61021);
        }
        if (z6) {
            setClickable(true);
        }
        m45481();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45459(C20079 c20079, Method method, Object[] objArr) {
        if (method.getName().equals("onImageAvailable")) {
            c20079.f61036.post(new RunnableC10691(0, c20079, (Bitmap) objArr[1]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45490(InterfaceC3621 interfaceC3621) {
        C23877.m52960(Looper.myLooper() == Looper.getMainLooper());
        C23877.m52957(interfaceC3621 == null || interfaceC3621.mo6793() == Looper.getMainLooper());
        InterfaceC3621 interfaceC3622 = this.f61043;
        if (interfaceC3622 == interfaceC3621) {
            return;
        }
        Method method = this.f61023;
        Class cls = this.f61024;
        View view = this.f61034;
        ViewOnClickListenerC4656 viewOnClickListenerC4656 = this.f61021;
        if (interfaceC3622 != null) {
            interfaceC3622.mo6799(viewOnClickListenerC4656);
            if (interfaceC3622.mo6821(27)) {
                if (view instanceof TextureView) {
                    interfaceC3622.mo6818((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC3622.mo6817((SurfaceView) view);
                }
            }
            if (cls != null && cls.isAssignableFrom(interfaceC3622.getClass())) {
                try {
                    method.getClass();
                    method.invoke(interfaceC3622, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        C2643 c2643 = this.f61025;
        if (c2643 != null) {
            c2643.m4036((List) null);
        }
        this.f61043 = interfaceC3621;
        if (m45457()) {
            this.f61031.m22981(interfaceC3621);
        }
        m45464();
        TextView textView = this.f61032;
        if (textView != null) {
            InterfaceC3621 interfaceC3623 = this.f61043;
            if (interfaceC3623 != null) {
                interfaceC3623.mo6804();
            }
            textView.setVisibility(8);
        }
        m45480(true);
        if (interfaceC3621 != null) {
            AbstractC16341 abstractC16341 = (AbstractC16341) interfaceC3621;
            if (abstractC16341.mo6821(27)) {
                if (view instanceof TextureView) {
                    interfaceC3621.mo6797((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC3621.mo6796((SurfaceView) view);
                }
                if (!abstractC16341.mo6821(30) || interfaceC3621.mo6806().m35732()) {
                    m45462();
                }
            }
            if (c2643 != null && abstractC16341.mo6821(28)) {
                c2643.m4036(interfaceC3621.mo6837().f16655);
            }
            interfaceC3621.mo6819(viewOnClickListenerC4656);
            if (cls != null && cls.isAssignableFrom(interfaceC3621.getClass())) {
                try {
                    method.getClass();
                    Object obj = this.f61028;
                    obj.getClass();
                    method.invoke(interfaceC3621, obj);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
            m45477(false);
            return;
        }
        m45497();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f61034;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45489(int i) {
        C7930 c7930 = this.f61019;
        C23877.m52958(c7930);
        c7930.m18336(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45492() {
        C7930 c7930 = this.f61019;
        C23877.m52958(c7930);
        return c7930.m18334();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC3621 interfaceC3621 = this.f61043;
        if (interfaceC3621 != null && interfaceC3621.mo6821(16) && this.f61043.mo6840()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C9823 c9823 = this.f61031;
        if (z && m45457() && !c9823.m22991()) {
            m45477(true);
            return true;
        }
        if ((m45457() && c9823.m22983(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m45477(true);
            return true;
        }
        if (z && m45457()) {
            m45477(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m45496() {
        C9823 c9823 = this.f61031;
        return c9823 != null && c9823.m22991();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m45498() {
        boolean zM45469 = m45469();
        if (m45457()) {
            int i = zM45469 ? 0 : this.f61029;
            C9823 c9823 = this.f61031;
            c9823.m22979(i);
            c9823.m22992();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45497() {
        C9823 c9823 = this.f61031;
        if (c9823 != null) {
            c9823.m22986();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m45494() {
        C9823 c9823 = this.f61031;
        C23877.m52958(c9823);
        c9823.m22984();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45493(boolean z) {
        C9823 c9823 = this.f61031;
        C23877.m52958(c9823);
        c9823.m22987(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45491(boolean z) {
        C9823 c9823 = this.f61031;
        C23877.m52958(c9823);
        c9823.m22982(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final FrameLayout m45488() {
        return this.f61033;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2643 m45495() {
        return this.f61025;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m45474();
        return super.performClick();
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m45457() || this.f61043 == null) {
            return false;
        }
        m45477(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: ֡ */
    private boolean m45457() {
        if (!this.f61020) {
            return false;
        }
        C23877.m52958(this.f61031);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public void m45474() {
        if (!m45457() || this.f61043 == null) {
            return;
        }
        C9823 c9823 = this.f61031;
        if (!c9823.m22991()) {
            m45477(true);
        } else if (this.f61022) {
            c9823.m22986();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m45477(boolean z) {
        if (!(m45471() && this.f61027) && m45457()) {
            C9823 c9823 = this.f61031;
            boolean z2 = c9823.m22991() && c9823.m22978() <= 0;
            boolean zM45469 = m45469();
            if ((z || z2 || zM45469) && m45457()) {
                c9823.m22979(zM45469 ? 0 : this.f61029);
                c9823.m22992();
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private boolean m45469() {
        InterfaceC3621 interfaceC3621 = this.f61043;
        if (interfaceC3621 == null) {
            return true;
        }
        int iMo6835 = interfaceC3621.mo6835();
        if (!this.f61030) {
            return false;
        }
        if (this.f61043.mo6821(17) && this.f61043.mo6808().m15990()) {
            return false;
        }
        if (iMo6835 != 1 && iMo6835 != 4) {
            InterfaceC3621 interfaceC3622 = this.f61043;
            interfaceC3622.getClass();
            if (interfaceC3622.mo6839()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ */
    public boolean m45471() {
        InterfaceC3621 interfaceC3621 = this.f61043;
        return interfaceC3621 != null && interfaceC3621.mo6821(16) && this.f61043.mo6840() && this.f61043.mo6839();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m45480(boolean z) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC3621 interfaceC3621 = this.f61043;
        boolean zM45460 = false;
        boolean z2 = (interfaceC3621 == null || !interfaceC3621.mo6821(30) || interfaceC3621.mo6806().m35730()) ? false : true;
        boolean z3 = this.f61037;
        ImageView imageView = this.f61041;
        View view = this.f61026;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m45485();
        }
        if (z2) {
            InterfaceC3621 interfaceC3622 = this.f61043;
            boolean z4 = interfaceC3622 != null && interfaceC3622.mo6821(30) && interfaceC3622.mo6806().m35731(2);
            boolean zM45467 = m45467();
            if (!z4 && !zM45467) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m45485();
            }
            ImageView imageView2 = this.f61035;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM45467 && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m45483();
                }
            } else if (z4 && !zM45467 && z5) {
                m45485();
            }
            if (!z4 && !zM45467 && this.f61040 != 0) {
                C23877.m52958(imageView);
                if (interfaceC3621 != null && interfaceC3621.mo6821(18) && (bArr = interfaceC3621.mo6834().f56813) != null) {
                    zM45460 = m45460(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM45460 || m45460(this.f61042)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m45460(Drawable drawable) {
        ImageView imageView = this.f61041;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f61040 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                C7930 c7930 = this.f61019;
                if (c7930 != null) {
                    c7930.m18335(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public boolean m45467() {
        InterfaceC3621 interfaceC3621 = this.f61043;
        return interfaceC3621 != null && this.f61028 != null && interfaceC3621.mo6821(30) && interfaceC3621.mo6806().m35731(4);
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m45483() {
        Drawable drawable;
        C7930 c7930;
        ImageView imageView = this.f61035;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f61017 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (c7930 = this.f61019) != null) {
            c7930.m18335(width);
        }
        imageView.setScaleType(scaleType);
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m45466(C20079 c20079) {
        ImageView imageView = c20079.f61035;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public void m45485() {
        ImageView imageView = this.f61035;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45458(C20079 c20079, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c20079.getResources(), bitmap);
        ImageView imageView = c20079.f61035;
        if (imageView != null) {
            imageView.setImageDrawable(bitmapDrawable);
            c20079.m45483();
        }
        InterfaceC3621 interfaceC3621 = c20079.f61043;
        if (interfaceC3621 != null && interfaceC3621.mo6821(30) && interfaceC3621.mo6806().m35731(2)) {
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            c20079.m45483();
        }
        View view = c20079.f61026;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: ۘ */
    public void m45464() {
        boolean z;
        View view = this.f61038;
        if (view != null) {
            InterfaceC3621 interfaceC3621 = this.f61043;
            if (interfaceC3621 == null || interfaceC3621.mo6835() != 2) {
                z = false;
            } else {
                z = true;
                int i = this.f61039;
                if (i != 2 && (i != 1 || !this.f61043.mo6839())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static void m45482(C20079 c20079) {
        TextView textView = c20079.f61032;
        if (textView != null) {
            InterfaceC3621 interfaceC3621 = c20079.f61043;
            if (interfaceC3621 != null) {
                interfaceC3621.mo6804();
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ */
    public void m45481() {
        C9823 c9823 = this.f61031;
        if (c9823 == null || !this.f61020) {
            setContentDescription(null);
        } else if (c9823.m22991()) {
            setContentDescription(this.f61022 ? getResources().getString(R.string.MT_Protector) : null);
        } else {
            setContentDescription(getResources().getString(R.string.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public static void m45465(C20079 c20079) {
        if (c20079.m45471() && c20079.f61027) {
            c20079.m45497();
        } else {
            c20079.m45477(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public void m45462() {
        InterfaceC3621 interfaceC3621 = this.f61043;
        C8454 c8454Mo6815 = interfaceC3621 != null ? interfaceC3621.mo6815() : C8454.f22684;
        int i = c8454Mo6815.f22687;
        int i2 = c8454Mo6815.f22685;
        float f = this.f61018 ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * c8454Mo6815.f22686) / i2;
        C7930 c7930 = this.f61019;
        if (c7930 != null) {
            c7930.m18335(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
