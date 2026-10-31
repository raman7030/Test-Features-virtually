package l;

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
import bin.mt.plus.R;
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
public class C18635 extends FrameLayout {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f57794;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean f57795;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5852 f57796;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f57797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC2407 f57798;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f57799;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Method f57800;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Class f57801;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C0289 f57802;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final View f57803;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f57804;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Object f57805;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f57806;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f57807;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7844 f57808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f57809;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final FrameLayout f57810;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final View f57811;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f57812;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final Handler f57813;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f57814;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f57815;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f57816;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f57817;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f57818;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Drawable f57819;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1318 f57820;

    public C18635(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18635(Context context, AttributeSet attributeSet, int i) {
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
        Class<InterfaceC4162> cls;
        Object objNewProxyInstance;
        Method method;
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        super(context, attributeSet, i);
        ViewOnClickListenerC2407 viewOnClickListenerC2407 = new ViewOnClickListenerC2407(this);
        this.f57798 = viewOnClickListenerC2407;
        this.f57813 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f57796 = null;
            this.f57803 = null;
            this.f57811 = null;
            this.f57795 = false;
            this.f57812 = null;
            this.f57818 = null;
            this.f57802 = null;
            this.f57815 = null;
            this.f57809 = null;
            this.f57808 = null;
            this.f57810 = null;
            this.f57801 = null;
            this.f57800 = null;
            this.f57805 = null;
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
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C22736.f73443, i, 0);
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
                this.f57814 = typedArrayObtainStyledAttributes.getBoolean(16, this.f57814);
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
        C5852 c5852 = (C5852) findViewById(R.id.MT_Protector);
        this.f57796 = c5852;
        if (c5852 != null) {
            c5852.m16411(i6);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f57803 = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (c5852 != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f57811 = new TextureView(context);
            } else {
                if (i3 == 3) {
                    try {
                        int i16 = C20005.f64793;
                        this.f57811 = (View) C20005.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i3 == 4) {
                    try {
                        int i17 = C15561.f47968;
                        this.f57811 = (View) C15561.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                } else {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        C15811.m37448(surfaceView);
                    }
                    this.f57811 = surfaceView;
                }
                this.f57811.setLayoutParams(layoutParams);
                this.f57811.setOnClickListener(viewOnClickListenerC2407);
                this.f57811.setClickable(false);
                c5852.addView(this.f57811, 0);
            }
            z7 = false;
            this.f57811.setLayoutParams(layoutParams);
            this.f57811.setOnClickListener(viewOnClickListenerC2407);
            this.f57811.setClickable(false);
            c5852.addView(this.f57811, 0);
        } else {
            this.f57811 = null;
            z7 = false;
        }
        this.f57795 = z7;
        this.f57810 = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f57812 = (ImageView) findViewById(R.id.MT_Protector);
        this.f57794 = i10;
        try {
            cls = InterfaceC4162.class;
            method = cls.getMethod("֫", InterfaceC15967.class);
            objNewProxyInstance = Proxy.newProxyInstance(InterfaceC15967.class.getClassLoader(), new Class[]{InterfaceC15967.class}, new InvocationHandler() { // from class: l.ۢ۠ۧ
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    C18635.m43193(this.f28701, method2, objArr);
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f57801 = cls;
        this.f57800 = method;
        this.f57805 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f57818 = imageView2;
        this.f57817 = (!z || i4 == 0 || imageView2 == null) ? 0 : i4;
        if (i9 != 0) {
            this.f57819 = C0881.m3234(getContext(), i9);
        }
        C0289 c0289 = (C0289) findViewById(R.id.MT_Protector);
        this.f57802 = c0289;
        if (c0289 != null) {
            boolean zIsInEditMode = c0289.isInEditMode();
            C22785 c22785 = C22785.f73570;
            if (!zIsInEditMode && (captioningManager2 = (CaptioningManager) c0289.getContext().getSystemService("captioning")) != null && captioningManager2.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager2.getUserStyle();
                c22785 = new C22785(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
            }
            c0289.m1637(c22785);
            float fontScale = 1.0f;
            if (!c0289.isInEditMode() && (captioningManager = (CaptioningManager) c0289.getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                fontScale = captioningManager.getFontScale();
            }
            c0289.m1635(fontScale * 0.0533f);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f57815 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f57816 = i2;
        TextView textView = (TextView) findViewById(R.id.MT_Protector);
        this.f57809 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C7844 c7844 = (C7844) findViewById(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        if (c7844 != null) {
            this.f57808 = c7844;
        } else if (viewFindViewById3 != null) {
            C7844 c7845 = new C7844(context, null, 0, attributeSet);
            this.f57808 = c7845;
            c7845.setId(R.id.MT_Protector);
            c7845.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c7845, iIndexOfChild);
        } else {
            this.f57808 = null;
        }
        C7844 c7846 = this.f57808;
        this.f57806 = c7846 != null ? i5 : 0;
        this.f57799 = z2;
        this.f57807 = z3;
        this.f57804 = z4;
        this.f57797 = z6 && c7846 != null;
        if (c7846 != null) {
            c7846.m21024();
            this.f57808.m21015(this.f57798);
        }
        if (z6) {
            setClickable(true);
        }
        m43215();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43193(C18635 c18635, Method method, Object[] objArr) {
        if (method.getName().equals("onImageAvailable")) {
            c18635.f57813.post(new RunnableC8757(0, c18635, (Bitmap) objArr[1]));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43224(InterfaceC1318 interfaceC1318) {
        C22632.m50634(Looper.myLooper() == Looper.getMainLooper());
        C22632.m50631(interfaceC1318 == null || interfaceC1318.mo4561() == Looper.getMainLooper());
        InterfaceC1318 interfaceC1319 = this.f57820;
        if (interfaceC1319 == interfaceC1318) {
            return;
        }
        Method method = this.f57800;
        Class cls = this.f57801;
        View view = this.f57811;
        ViewOnClickListenerC2407 viewOnClickListenerC2407 = this.f57798;
        if (interfaceC1319 != null) {
            interfaceC1319.mo4567(viewOnClickListenerC2407);
            if (interfaceC1319.mo4589(27)) {
                if (view instanceof TextureView) {
                    interfaceC1319.mo4586((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC1319.mo4585((SurfaceView) view);
                }
            }
            if (cls != null && cls.isAssignableFrom(interfaceC1319.getClass())) {
                try {
                    method.getClass();
                    method.invoke(interfaceC1319, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        C0289 c0289 = this.f57802;
        if (c0289 != null) {
            c0289.m1636((List) null);
        }
        this.f57820 = interfaceC1318;
        if (m43191()) {
            this.f57808.m21016(interfaceC1318);
        }
        m43198();
        TextView textView = this.f57809;
        if (textView != null) {
            InterfaceC1318 interfaceC13110 = this.f57820;
            if (interfaceC13110 != null) {
                interfaceC13110.mo4572();
            }
            textView.setVisibility(8);
        }
        m43214(true);
        if (interfaceC1318 != null) {
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1318;
            if (abstractC14702.mo4589(27)) {
                if (view instanceof TextureView) {
                    interfaceC1318.mo4565((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC1318.mo4564((SurfaceView) view);
                }
                if (!abstractC14702.mo4589(30) || interfaceC1318.mo4574().m33612()) {
                    m43196();
                }
            }
            if (c0289 != null && abstractC14702.mo4589(28)) {
                c0289.m1636(interfaceC1318.mo4605().f13839);
            }
            interfaceC1318.mo4587(viewOnClickListenerC2407);
            if (cls != null && cls.isAssignableFrom(interfaceC1318.getClass())) {
                try {
                    method.getClass();
                    Object obj = this.f57805;
                    obj.getClass();
                    method.invoke(interfaceC1318, obj);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
            m43211(false);
            return;
        }
        m43231();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f57811;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43223(int i) {
        C5852 c5852 = this.f57796;
        C22632.m50632(c5852);
        c5852.m16411(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43226() {
        C5852 c5852 = this.f57796;
        C22632.m50632(c5852);
        return c5852.m16409();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC1318 interfaceC1318 = this.f57820;
        if (interfaceC1318 != null && interfaceC1318.mo4589(16) && this.f57820.mo4608()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C7844 c7844 = this.f57808;
        if (z && m43191() && !c7844.m21026()) {
            m43211(true);
            return true;
        }
        if ((m43191() && c7844.m21018(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m43211(true);
            return true;
        }
        if (z && m43191()) {
            m43211(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m43230() {
        C7844 c7844 = this.f57808;
        return c7844 != null && c7844.m21026();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m43232() {
        boolean zM43203 = m43203();
        if (m43191()) {
            int i = zM43203 ? 0 : this.f57806;
            C7844 c7844 = this.f57808;
            c7844.m21014(i);
            c7844.m21027();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43231() {
        C7844 c7844 = this.f57808;
        if (c7844 != null) {
            c7844.m21021();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m43228() {
        C7844 c7844 = this.f57808;
        C22632.m50632(c7844);
        c7844.m21019();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43227(boolean z) {
        C7844 c7844 = this.f57808;
        C22632.m50632(c7844);
        c7844.m21022(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43225(boolean z) {
        C7844 c7844 = this.f57808;
        C22632.m50632(c7844);
        c7844.m21017(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FrameLayout m43222() {
        return this.f57810;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0289 m43229() {
        return this.f57802;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m43208();
        return super.performClick();
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m43191() || this.f57820 == null) {
            return false;
        }
        m43211(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m43191() {
        if (!this.f57797) {
            return false;
        }
        C22632.m50632(this.f57808);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m43208() {
        if (!m43191() || this.f57820 == null) {
            return;
        }
        C7844 c7844 = this.f57808;
        if (!c7844.m21026()) {
            m43211(true);
        } else if (this.f57799) {
            c7844.m21021();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m43211(boolean z) {
        if (!(m43205() && this.f57804) && m43191()) {
            C7844 c7844 = this.f57808;
            boolean z2 = c7844.m21026() && c7844.m21013() <= 0;
            boolean zM43203 = m43203();
            if ((z || z2 || zM43203) && m43191()) {
                c7844.m21014(zM43203 ? 0 : this.f57806);
                c7844.m21027();
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m43203() {
        InterfaceC1318 interfaceC1318 = this.f57820;
        if (interfaceC1318 == null) {
            return true;
        }
        int iMo4603 = interfaceC1318.mo4603();
        if (!this.f57807) {
            return false;
        }
        if (this.f57820.mo4589(17) && this.f57820.mo4576().m14110()) {
            return false;
        }
        if (iMo4603 != 1 && iMo4603 != 4) {
            InterfaceC1318 interfaceC1319 = this.f57820;
            interfaceC1319.getClass();
            if (interfaceC1319.mo4607()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean m43205() {
        InterfaceC1318 interfaceC1318 = this.f57820;
        return interfaceC1318 != null && interfaceC1318.mo4589(16) && this.f57820.mo4608() && this.f57820.mo4607();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m43214(boolean z) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC1318 interfaceC1318 = this.f57820;
        boolean zM43194 = false;
        boolean z2 = (interfaceC1318 == null || !interfaceC1318.mo4589(30) || interfaceC1318.mo4574().m33610()) ? false : true;
        boolean z3 = this.f57814;
        ImageView imageView = this.f57818;
        View view = this.f57803;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m43219();
        }
        if (z2) {
            InterfaceC1318 interfaceC1319 = this.f57820;
            boolean z4 = interfaceC1319 != null && interfaceC1319.mo4589(30) && interfaceC1319.mo4574().m33611(2);
            boolean zM43201 = m43201();
            if (!z4 && !zM43201) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m43219();
            }
            ImageView imageView2 = this.f57812;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM43201 && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m43217();
                }
            } else if (z4 && !zM43201 && z5) {
                m43219();
            }
            if (!z4 && !zM43201 && this.f57817 != 0) {
                C22632.m50632(imageView);
                if (interfaceC1318 != null && interfaceC1318.mo4589(18) && (bArr = interfaceC1318.mo4602().f53623) != null) {
                    zM43194 = m43194(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM43194 || m43194(this.f57819)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m43194(Drawable drawable) {
        ImageView imageView = this.f57818;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f57817 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                C5852 c5852 = this.f57796;
                if (c5852 != null) {
                    c5852.m16410(width);
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
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m43201() {
        InterfaceC1318 interfaceC1318 = this.f57820;
        return interfaceC1318 != null && this.f57805 != null && interfaceC1318.mo4589(30) && interfaceC1318.mo4574().m33611(4);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m43217() {
        Drawable drawable;
        C5852 c5852;
        ImageView imageView = this.f57812;
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
        if (this.f57794 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (c5852 = this.f57796) != null) {
            c5852.m16410(width);
        }
        imageView.setScaleType(scaleType);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m43200(C18635 c18635) {
        ImageView imageView = c18635.f57812;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m43219() {
        ImageView imageView = this.f57812;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43192(C18635 c18635, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c18635.getResources(), bitmap);
        ImageView imageView = c18635.f57812;
        if (imageView != null) {
            imageView.setImageDrawable(bitmapDrawable);
            c18635.m43217();
        }
        InterfaceC1318 interfaceC1318 = c18635.f57820;
        if (interfaceC1318 != null && interfaceC1318.mo4589(30) && interfaceC1318.mo4574().m33611(2)) {
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            c18635.m43217();
        }
        View view = c18635.f57803;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m43198() {
        boolean z;
        View view = this.f57815;
        if (view != null) {
            InterfaceC1318 interfaceC1318 = this.f57820;
            if (interfaceC1318 == null || interfaceC1318.mo4603() != 2) {
                z = false;
            } else {
                z = true;
                int i = this.f57816;
                if (i != 2 && (i != 1 || !this.f57820.mo4607())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m43216(C18635 c18635) {
        TextView textView = c18635.f57809;
        if (textView != null) {
            InterfaceC1318 interfaceC1318 = c18635.f57820;
            if (interfaceC1318 != null) {
                interfaceC1318.mo4572();
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m43215() {
        C7844 c7844 = this.f57808;
        if (c7844 == null || !this.f57797) {
            setContentDescription(null);
        } else if (c7844.m21026()) {
            setContentDescription(this.f57799 ? getResources().getString(R.string.MT_Protector) : null);
        } else {
            setContentDescription(getResources().getString(R.string.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m43199(C18635 c18635) {
        if (c18635.m43205() && c18635.f57804) {
            c18635.m43231();
        } else {
            c18635.m43211(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m43196() {
        InterfaceC1318 interfaceC1318 = this.f57820;
        C6404 c6404Mo4583 = interfaceC1318 != null ? interfaceC1318.mo4583() : C6404.f19812;
        int i = c6404Mo4583.f19815;
        int i2 = c6404Mo4583.f19813;
        float f = this.f57795 ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * c6404Mo4583.f19814) / i2;
        C5852 c5852 = this.f57796;
        if (c5852 != null) {
            c5852.m16410(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
