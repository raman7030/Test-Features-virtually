package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.۠֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes3.dex */
public class C7844 extends FrameLayout {

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final float[] f24250;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24251;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f24252;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C22485 f24253;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final ImageView f24254;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long[] f24255;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f24256;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f24257;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public int f24258;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f24259;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final TextView f24260;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public int f24261;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final Method f24262;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final ImageView f24263;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f24264;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1318 f24265;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8051 f24266;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24267;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final String f24268;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Method f24269;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final String f24270;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f24271;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final String f24272;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final View f24273;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Class f24274;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24275;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24276;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f24277;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24278;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final int f24279;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final String f24280;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f24281;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f24282;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24283;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final RunnableC6312 f24284;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean[] f24285;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final Resources f24286;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20752 f24287;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24288;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public final C20369 f24289;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Class f24290;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final String f24291;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public final C21507 f24292;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC23366 f24293;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24294;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public boolean f24295;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f24296;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24297;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final Formatter f24298;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final Method f24299;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24300;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final String f24301;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f24302;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public boolean f24303;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final View f24304;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final View f24305;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f24306;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f24307;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final TextView f24308;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final TextView f24309;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24310;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f24311;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f24312;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final String f24313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14193 f24314;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean[] f24315;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final C18428 f24316;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Drawable f24317;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final C13132 f24318;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long[] f24319;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final C20545 f24320;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f24321;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f24322;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final View f24323;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public final String f24324;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f24325;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final String f24326;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final ImageView f24327;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public final C15604 f24328;

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21015(InterfaceC0788 interfaceC0788) {
        interfaceC0788.getClass();
        this.f24271.add(interfaceC0788);
    }

    static {
        C16840.m39615("media3.ui");
        f24250 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C7844(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7844(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7844(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) throws NoSuchMethodException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z8;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls;
        Method method5;
        boolean z9;
        TextView textView;
        super(context, attributeSet, i);
        Class<?> cls2 = Boolean.TYPE;
        this.f24303 = true;
        this.f24258 = OpenAuthTask.Duplex;
        this.f24256 = 0;
        this.f24261 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C22736.f73444, i, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.MT_Protector);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.MT_Protector);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.MT_Protector);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.MT_Protector);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.MT_Protector);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.MT_Protector);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.MT_Protector);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.MT_Protector);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.MT_Protector);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.MT_Protector);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.MT_Protector);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.MT_Protector);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.MT_Protector);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.MT_Protector);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.MT_Protector);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.MT_Protector);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.MT_Protector);
                this.f24258 = typedArrayObtainStyledAttributes.getInt(32, this.f24258);
                this.f24256 = typedArrayObtainStyledAttributes.getInt(19, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.f24295 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                this.f24261 = C3603.m11000(typedArrayObtainStyledAttributes.getInt(38, this.f24261), 16, 1000);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i10 = resourceId10;
                z = z17;
                i12 = resourceId3;
                i13 = resourceId4;
                i14 = resourceId5;
                i15 = resourceId6;
                i16 = resourceId7;
                i17 = resourceId8;
                i18 = resourceId9;
                z8 = z14;
                i2 = resourceId12;
                i8 = resourceId13;
                i3 = resourceId14;
                i4 = resourceId16;
                i9 = resourceId17;
                z2 = z10;
                z3 = z11;
                z4 = z12;
                z5 = z13;
                i7 = resourceId;
                z6 = z15;
                z7 = z16;
                i11 = resourceId2;
                i6 = resourceId11;
                i5 = resourceId15;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = R.drawable.MT_Protector;
            i3 = R.drawable.MT_Protector;
            i4 = R.drawable.MT_Protector;
            i5 = R.drawable.MT_Protector;
            i6 = R.drawable.MT_Protector;
            i7 = R.layout.MT_Protector;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
            i8 = R.drawable.MT_Protector;
            i9 = R.drawable.MT_Protector;
            i10 = R.drawable.MT_Protector;
            z6 = false;
            z7 = false;
            i11 = R.drawable.MT_Protector;
            i12 = R.drawable.MT_Protector;
            i13 = R.drawable.MT_Protector;
            i14 = R.drawable.MT_Protector;
            i15 = R.drawable.MT_Protector;
            i16 = R.drawable.MT_Protector;
            i17 = R.drawable.MT_Protector;
            i18 = R.drawable.MT_Protector;
            z8 = false;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        this.f24293 = new ViewOnClickListenerC23366(this);
        this.f24271 = new CopyOnWriteArrayList();
        this.f24253 = new C22485();
        this.f24289 = new C20369();
        StringBuilder sb = new StringBuilder();
        this.f24306 = sb;
        boolean z18 = z;
        this.f24298 = new Formatter(sb, Locale.getDefault());
        this.f24319 = new long[0];
        this.f24315 = new boolean[0];
        this.f24255 = new long[0];
        this.f24285 = new boolean[0];
        this.f24284 = new RunnableC6312(1, this);
        try {
            Method method6 = InterfaceC4162.class.getMethod("ܽ", cls2);
            try {
                method2 = InterfaceC4162.class.getMethod("᩸", null);
                method = method6;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = method6;
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.f24274 = InterfaceC4162.class;
        this.f24299 = method;
        this.f24262 = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method4 = cls.getMethod("setScrubbingModeEnabled", cls2);
                method3 = null;
                try {
                    method5 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method5 = method3;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
                method4 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method3 = null;
            method4 = null;
            cls = null;
        }
        this.f24290 = cls;
        this.f24269 = method4;
        this.f24282 = method5;
        this.f24296 = (TextView) findViewById(R.id.MT_Protector);
        this.f24260 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f24254 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f24293);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24327 = imageView2;
        int i19 = 1;
        ViewOnClickListenerC14274 viewOnClickListenerC14274 = new ViewOnClickListenerC14274(i19, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC14274);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24310 = imageView3;
        ViewOnClickListenerC14274 viewOnClickListenerC14275 = new ViewOnClickListenerC14274(i19, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC14275);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f24273 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f24293);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f24323 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.f24293);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f24322 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.f24293);
        }
        InterfaceC8051 interfaceC8051 = (InterfaceC8051) findViewById(R.id.MT_Protector);
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        if (interfaceC8051 != null) {
            this.f24266 = interfaceC8051;
            textView = null;
            z9 = z18;
        } else if (viewFindViewById4 != null) {
            z9 = z18;
            C7263 c7263 = new C7263(context, null, 0, attributeSet2, R.style.MT_Protector);
            c7263.setId(R.id.MT_Protector);
            c7263.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c7263, iIndexOfChild);
            this.f24266 = c7263;
            textView = null;
        } else {
            z9 = z18;
            textView = null;
            this.f24266 = null;
        }
        InterfaceC8051 interfaceC8052 = this.f24266;
        if (interfaceC8052 != null) {
            interfaceC8052.mo19495(this.f24293);
        }
        Resources resources = context.getResources();
        this.f24286 = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24300 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.f24293);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24294 = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            imageView5.setOnClickListener(this.f24293);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24251 = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            imageView6.setOnClickListener(this.f24293);
        }
        Typeface typefaceM13096 = C4369.m13096(context, R.font.MT_Protector);
        ImageView imageView7 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.f24305 = imageView7;
            this.f24309 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM13096);
            this.f24309 = textView2;
            this.f24305 = textView2;
        } else {
            this.f24309 = textView;
            this.f24305 = textView;
        }
        View view = this.f24305;
        if (view != null) {
            view.setOnClickListener(this.f24293);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            this.f24304 = imageView8;
            this.f24308 = null;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceM13096);
            this.f24308 = textView3;
            this.f24304 = textView3;
        } else {
            this.f24308 = null;
            this.f24304 = null;
        }
        View view2 = this.f24304;
        if (view2 != null) {
            view2.setOnClickListener(this.f24293);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24275 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.f24293);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24263 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f24293);
        }
        this.f24259 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f24264 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.MT_Protector);
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            m20955((View) imageView11, false);
        }
        C20752 c20752 = new C20752(this);
        this.f24287 = c20752;
        c20752.m47420(z9);
        C15604 c15604 = new C15604(this, new String[]{resources.getString(R.string.MT_Protector), resources.getString(R.string.MT_Protector)}, new Drawable[]{resources.getDrawable(R.drawable.MT_Protector, context.getTheme()), resources.getDrawable(R.drawable.MT_Protector, context.getTheme())});
        this.f24328 = c15604;
        this.f24279 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
        C13132 c13132 = (C13132) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f24318 = c13132;
        c13132.setAdapter(c15604);
        c13132.setLayoutManager(new C6495(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) c13132, -2, -2, true);
        this.f24281 = popupWindow;
        if (Build.VERSION.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(this.f24293);
        this.f24312 = true;
        this.f24292 = new C21507(getResources());
        this.f24321 = resources.getDrawable(i5, context.getTheme());
        this.f24277 = resources.getDrawable(i4, context.getTheme());
        this.f24324 = resources.getString(R.string.MT_Protector);
        this.f24301 = resources.getString(R.string.MT_Protector);
        this.f24316 = new C18428(this);
        this.f24314 = new C14193(this);
        this.f24320 = new C20545(this, resources.getStringArray(R.array.MT_Protector), f24250);
        this.f24276 = resources.getDrawable(i11, context.getTheme());
        this.f24267 = resources.getDrawable(i12, context.getTheme());
        this.f24278 = resources.getDrawable(i17, context.getTheme());
        this.f24317 = resources.getDrawable(i18, context.getTheme());
        this.f24288 = resources.getDrawable(i10, context.getTheme());
        this.f24297 = resources.getDrawable(i6, context.getTheme());
        this.f24283 = resources.getDrawable(i2, context.getTheme());
        this.f24252 = resources.getDrawable(i8, context.getTheme());
        this.f24311 = resources.getDrawable(i3, context.getTheme());
        this.f24280 = resources.getString(R.string.MT_Protector);
        this.f24272 = resources.getString(R.string.MT_Protector);
        this.f24270 = resources.getString(R.string.MT_Protector);
        this.f24326 = resources.getString(R.string.MT_Protector);
        this.f24291 = resources.getString(R.string.MT_Protector);
        this.f24268 = resources.getString(R.string.MT_Protector);
        this.f24313 = resources.getString(R.string.MT_Protector);
        c20752.m47419(findViewById(R.id.MT_Protector), true);
        c20752.m47419(this.f24304, z3);
        c20752.m47419(this.f24305, z2);
        c20752.m47419(imageView5, z4);
        c20752.m47419(imageView6, z5);
        c20752.m47419(imageView10, z8);
        c20752.m47419(imageView, z6);
        c20752.m47419(imageView11, z7);
        c20752.m47419(imageView9, this.f24256 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ᩳ֨ۧ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                C7844.m20959(this.f54214, view3, i20, i21, i22, i23, i24, i25, i26, i27);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21016(InterfaceC1318 interfaceC1318) {
        C22632.m50634(Looper.myLooper() == Looper.getMainLooper());
        C22632.m50631(interfaceC1318 == null || interfaceC1318.mo4561() == Looper.getMainLooper());
        InterfaceC1318 interfaceC1319 = this.f24265;
        if (interfaceC1319 == interfaceC1318) {
            return;
        }
        ViewOnClickListenerC23366 viewOnClickListenerC23366 = this.f24293;
        if (interfaceC1319 != null) {
            interfaceC1319.mo4567(viewOnClickListenerC23366);
        }
        this.f24265 = interfaceC1318;
        if (interfaceC1318 != null) {
            interfaceC1318.mo4587(viewOnClickListenerC23366);
        }
        m21020();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21022(boolean z) {
        this.f24287.m47419(this.f24305, z);
        m20979();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21017(boolean z) {
        this.f24287.m47419(this.f24304, z);
        m20979();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21013() {
        return this.f24258;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21014(int i) {
        this.f24258 = i;
        C20752 c20752 = this.f24287;
        if (c20752.m47425()) {
            c20752.m47428();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m21019() {
        this.f24287.m47420(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21027() {
        this.f24287.m47422();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21021() {
        this.f24287.m47417();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21024() {
        this.f24287.m47423();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21026() {
        return this.f24287.m47425();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m21025() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21023() {
        for (InterfaceC0788 interfaceC0788 : this.f24271) {
            getVisibility();
            interfaceC0788.mo2993();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m21020() {
        m20994();
        m20979();
        m20970();
        m21005();
        m20973();
        InterfaceC1318 interfaceC1318 = this.f24265;
        if (interfaceC1318 != null) {
            float f = interfaceC1318.mo4599().f8510;
            C20545 c20545 = this.f24320;
            c20545.m47035(f);
            String strM47034 = c20545.m47034();
            C15604 c15604 = this.f24328;
            c15604.m36789(0, strM47034);
            m20955(this.f24273, c15604.m36790());
        }
        m20952();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m20994() {
        ImageView imageView;
        boolean z;
        if (m21025() && this.f24302 && (imageView = this.f24300) != null) {
            boolean zM11031 = C3603.m11031(this.f24265, this.f24303);
            Drawable drawable = zM11031 ? this.f24276 : this.f24267;
            int i = zM11031 ? R.string.MT_Protector : R.string.MT_Protector;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f24286.getString(i));
            InterfaceC1318 interfaceC1318 = this.f24265;
            if (interfaceC1318 != null) {
                z = true;
                if (!interfaceC1318.mo4589(1) || (interfaceC1318.mo4589(17) && interfaceC1318.mo4576().m14110())) {
                    z = false;
                }
            } else {
                z = false;
            }
            m20955(imageView, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void m20979() {
        boolean zMo4589;
        boolean zMo45810;
        boolean zMo45811;
        boolean zMo45812;
        boolean zMo45813;
        if (m21025() && this.f24302) {
            InterfaceC1318 interfaceC1318 = this.f24265;
            if (interfaceC1318 != null) {
                zMo45810 = interfaceC1318.mo4589(5);
                zMo45811 = interfaceC1318.mo4589(7);
                zMo45812 = interfaceC1318.mo4589(11);
                zMo45813 = interfaceC1318.mo4589(12);
                zMo4589 = interfaceC1318.mo4589(9);
            } else {
                zMo4589 = false;
                zMo45810 = false;
                zMo45811 = false;
                zMo45812 = false;
                zMo45813 = false;
            }
            Resources resources = this.f24286;
            View view = this.f24305;
            if (zMo45812) {
                InterfaceC1318 interfaceC1319 = this.f24265;
                int iMo4596 = (int) ((interfaceC1319 != null ? interfaceC1319.mo4596() : 5000L) / 1000);
                TextView textView = this.f24309;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo4596));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo4596, Integer.valueOf(iMo4596)));
                }
            }
            View view2 = this.f24304;
            if (zMo45813) {
                InterfaceC1318 interfaceC13110 = this.f24265;
                int iMo4610 = (int) ((interfaceC13110 != null ? interfaceC13110.mo4610() : 15000L) / 1000);
                TextView textView2 = this.f24308;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo4610));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo4610, Integer.valueOf(iMo4610)));
                }
            }
            m20955(this.f24294, zMo45811);
            m20955(view, zMo45812);
            m20955(view2, zMo45813);
            m20955(this.f24251, zMo4589);
            InterfaceC8051 interfaceC8051 = this.f24266;
            if (interfaceC8051 != null) {
                interfaceC8051.setEnabled(zMo45810);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m20970() {
        ImageView imageView;
        if (m21025() && this.f24302 && (imageView = this.f24275) != null) {
            if (this.f24256 == 0) {
                m20955((View) imageView, false);
                return;
            }
            InterfaceC1318 interfaceC1318 = this.f24265;
            String str = this.f24270;
            Drawable drawable = this.f24288;
            if (interfaceC1318 == null || !interfaceC1318.mo4589(15)) {
                m20955((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m20955((View) imageView, true);
            int iMo4578 = interfaceC1318.mo4578();
            if (iMo4578 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo4578 == 1) {
                imageView.setImageDrawable(this.f24297);
                imageView.setContentDescription(this.f24326);
            } else {
                if (iMo4578 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f24283);
                imageView.setContentDescription(this.f24291);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m21005() {
        ImageView imageView;
        if (m21025() && this.f24302 && (imageView = this.f24263) != null) {
            InterfaceC1318 interfaceC1318 = this.f24265;
            if (!this.f24287.m47421(imageView)) {
                m20955((View) imageView, false);
                return;
            }
            String str = this.f24313;
            Drawable drawable = this.f24311;
            if (interfaceC1318 == null || !interfaceC1318.mo4589(14)) {
                m20955((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m20955((View) imageView, true);
            if (interfaceC1318.mo4571()) {
                drawable = this.f24252;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC1318.mo4571()) {
                str = this.f24268;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m20973() {
        C18428 c18428 = this.f24316;
        c18428.getClass();
        List list = Collections.EMPTY_LIST;
        c18428.f15815 = list;
        C14193 c14193 = this.f24314;
        c14193.getClass();
        c14193.f15815 = list;
        InterfaceC1318 interfaceC1318 = this.f24265;
        ImageView imageView = this.f24254;
        if (interfaceC1318 != null && interfaceC1318.mo4589(30) && this.f24265.mo4589(29)) {
            C14017 c14017Mo4574 = this.f24265.mo4574();
            c14193.m33862(m20954(c14017Mo4574, 1));
            if (this.f24287.m47421(imageView)) {
                c18428.m42846(m20954(c14017Mo4574, 3));
            } else {
                c18428.m42846(AbstractC14545.of());
            }
        }
        m20955(imageView, c18428.getItemCount() > 0);
        m20955(this.f24273, this.f24328.m36790());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC14545 m20954(C14017 c14017, int i) {
        C1846 c1846 = new C1846();
        AbstractC14545 abstractC14545M33608 = c14017.m33608();
        for (int i2 = 0; i2 < abstractC14545M33608.size(); i2++) {
            C23190 c23190 = (C23190) abstractC14545M33608.get(i2);
            if (c23190.m51440() == i) {
                for (int i3 = 0; i3 < c23190.f74548; i3++) {
                    if (c23190.m51439(i3, false)) {
                        C8353 c8353M51437 = c23190.m51437(i3);
                        if ((c8353M51437.f25628 & 2) == 0) {
                            c1846.m16264(new C19134(c14017, i2, i3, this.f24292.m48673(c8353M51437)));
                        }
                    }
                }
            }
        }
        return c1846.m6131();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public void m20952() {
        AbstractC4846 abstractC4846Mo4576;
        long jM11014;
        int i;
        long j;
        int i2;
        boolean z;
        boolean z2;
        InterfaceC1318 interfaceC1318 = this.f24265;
        if (interfaceC1318 == null) {
            return;
        }
        long j2 = 0;
        this.f24325 = 0L;
        if (interfaceC1318.mo4589(17)) {
            abstractC4846Mo4576 = interfaceC1318.mo4576();
        } else {
            abstractC4846Mo4576 = AbstractC4846.f15313;
        }
        long j3 = -9223372036854775807L;
        boolean z3 = false;
        if (!abstractC4846Mo4576.m14110()) {
            int iMo4579 = interfaceC1318.mo4579();
            i = 0;
            int i3 = iMo4579;
            j = 0;
            while (i3 <= iMo4579) {
                if (i3 == iMo4579) {
                    this.f24325 = C3603.m11037(j);
                }
                C20369 c20369 = this.f24289;
                abstractC4846Mo4576.m14106(i3, c20369);
                if (c20369.f65755 == j3) {
                    break;
                }
                int i4 = c20369.f65760;
                while (i4 <= c20369.f65752) {
                    C22485 c22485 = this.f24253;
                    abstractC4846Mo4576.mo14104(i4, c22485, z3);
                    C7214 c7214 = c22485.f72800;
                    c7214.getClass();
                    int i5 = c7214.f22070;
                    int i6 = 0;
                    while (i6 < i5) {
                        c22485.m50433(i6);
                        long j4 = c22485.f72804;
                        if (j4 >= j2) {
                            long[] jArr = this.f24319;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f24319 = Arrays.copyOf(jArr, length);
                                this.f24315 = Arrays.copyOf(this.f24315, length);
                            }
                            this.f24319[i] = C3603.m11037(j4 + j);
                            boolean[] zArr = this.f24315;
                            C13563 c13563M19298 = c22485.f72800.m19298(i6);
                            int i7 = c13563M19298.f40471;
                            if (i7 != -1) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= i7) {
                                        i2 = iMo4579;
                                        z = true;
                                        z2 = false;
                                        break;
                                    }
                                    i2 = iMo4579;
                                    int i9 = c13563M19298.f40473[i8];
                                    C13563 c13563 = c13563M19298;
                                    if (i9 == 0 || i9 == 1) {
                                        z2 = true;
                                        z = true;
                                        break;
                                    } else {
                                        i8++;
                                        iMo4579 = i2;
                                        c13563M19298 = c13563;
                                    }
                                }
                            } else {
                                z2 = true;
                                z = true;
                                i2 = iMo4579;
                            }
                            zArr[i] = z2 ^ z;
                            i++;
                        } else {
                            i2 = iMo4579;
                        }
                        i6++;
                        iMo4579 = i2;
                        j2 = 0;
                    }
                    i4++;
                    z3 = false;
                    j2 = 0;
                }
                j += c20369.f65755;
                i3++;
                z3 = false;
                iMo4579 = iMo4579;
                j2 = 0;
                j3 = -9223372036854775807L;
            }
        } else {
            if (interfaceC1318.mo4589(16)) {
                long jMo4593 = interfaceC1318.mo4593();
                if (jMo4593 != -9223372036854775807L) {
                    jM11014 = C3603.m11014(jMo4593);
                } else {
                    jM11014 = 0;
                }
            } else {
                jM11014 = 0;
            }
            i = 0;
            j = jM11014;
        }
        long jM11037 = C3603.m11037(j);
        TextView textView = this.f24296;
        if (textView != null) {
            textView.setText(C3603.m11020(this.f24306, this.f24298, jM11037));
        }
        InterfaceC8051 interfaceC8051 = this.f24266;
        if (interfaceC8051 != null) {
            interfaceC8051.mo19499(jM11037);
            long[] jArr2 = this.f24255;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.f24319;
            if (i10 > jArr3.length) {
                this.f24319 = Arrays.copyOf(jArr3, i10);
                this.f24315 = Arrays.copyOf(this.f24315, i10);
            }
            System.arraycopy(jArr2, 0, this.f24319, i, length2);
            System.arraycopy(this.f24285, 0, this.f24315, i, length2);
            interfaceC8051.mo19497(this.f24319, this.f24315, i10);
        }
        m20967();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m20967() {
        long jMo4594;
        long jMo4590;
        if (m21025() && this.f24302) {
            InterfaceC1318 interfaceC1318 = this.f24265;
            if (interfaceC1318 == null || !interfaceC1318.mo4589(16)) {
                jMo4594 = 0;
                jMo4590 = 0;
            } else {
                jMo4594 = interfaceC1318.mo4594() + this.f24325;
                jMo4590 = interfaceC1318.mo4590() + this.f24325;
            }
            TextView textView = this.f24260;
            if (textView != null && !this.f24307) {
                textView.setText(C3603.m11020(this.f24306, this.f24298, jMo4594));
            }
            InterfaceC8051 interfaceC8051 = this.f24266;
            if (interfaceC8051 != null) {
                interfaceC8051.mo19494(jMo4594);
                if (m20983(interfaceC1318)) {
                    jMo4590 = jMo4594;
                }
                interfaceC8051.mo19501(jMo4590);
            }
            RunnableC6312 runnableC6312 = this.f24284;
            removeCallbacks(runnableC6312);
            int iMo4603 = interfaceC1318 == null ? 1 : interfaceC1318.mo4603();
            if (interfaceC1318 != null && interfaceC1318.isPlaying()) {
                long jMin = Math.min(interfaceC8051 != null ? interfaceC8051.mo19493() : 1000L, 1000 - (jMo4594 % 1000));
                float f = interfaceC1318.mo4599().f8510;
                postDelayed(runnableC6312, C3603.m11016(f > 0.0f ? (long) (jMin / f) : 1000L, this.f24261, 1000L));
            } else {
                if (iMo4603 == 4 || iMo4603 == 1) {
                    return;
                }
                postDelayed(runnableC6312, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static void m20985(C7844 c7844) {
        C15604 c15604 = c7844.f24328;
        C20545 c20545 = c7844.f24320;
        InterfaceC1318 interfaceC1318 = c7844.f24265;
        if (interfaceC1318 == null) {
            return;
        }
        c20545.m47035(interfaceC1318.mo4599().f8510);
        c15604.m36789(0, c20545.m47034());
        c7844.m20955(c7844.f24273, c15604.m36790());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m21003() {
        C13132 c13132 = this.f24318;
        c13132.measure(0, 0);
        int width = getWidth();
        int i = this.f24279;
        int iMin = Math.min(c13132.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f24281;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), c13132.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m20963(AbstractC19902 abstractC19902, View view) {
        this.f24318.setAdapter(abstractC19902);
        m21003();
        this.f24312 = false;
        PopupWindow popupWindow = this.f24281;
        popupWindow.dismiss();
        this.f24312 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f24279;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20957(C7844 c7844, float f) {
        InterfaceC1318 interfaceC1318 = c7844.f24265;
        if (interfaceC1318 == null || !interfaceC1318.mo4589(13)) {
            return;
        }
        InterfaceC1318 interfaceC1319 = c7844.f24265;
        interfaceC1319.mo4568(new C2730(f, interfaceC1319.mo4599().f8508));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m21028() {
        ImageView imageView = this.f24300;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20955(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f24259 : this.f24264);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20960(C7844 c7844, InterfaceC1318 interfaceC1318, long j) {
        if (interfaceC1318.mo4589(5)) {
            interfaceC1318.seekTo(j);
        }
        c7844.m20967();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20956(C7844 c7844) {
        String str = c7844.f24272;
        Drawable drawable = c7844.f24317;
        String str2 = c7844.f24280;
        Drawable drawable2 = c7844.f24278;
        boolean z = c7844.f24257;
        boolean z2 = !z;
        if (z == z2) {
            return;
        }
        c7844.f24257 = z2;
        ImageView imageView = c7844.f24327;
        if (imageView != null) {
            if (!z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = c7844.f24310;
        if (imageView2 == null) {
            return;
        }
        if (!z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20958(C7844 c7844, int i) {
        View view = c7844.f24273;
        if (i == 0) {
            C20545 c20545 = c7844.f24320;
            view.getClass();
            c7844.m20963(c20545, view);
        } else {
            if (i == 1) {
                C14193 c14193 = c7844.f24314;
                view.getClass();
                c7844.m20963(c14193, view);
                return;
            }
            c7844.f24281.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C20752 c20752 = this.f24287;
        c20752.m47427();
        this.f24302 = true;
        if (c20752.m47425()) {
            c20752.m47428();
        }
        m21020();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20752 c20752 = this.f24287;
        c20752.m47426();
        this.f24302 = false;
        removeCallbacks(this.f24284);
        c20752.m47424();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m21018(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21018(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC1318 interfaceC1318 = this.f24265;
        if (interfaceC1318 == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC1318.mo4603() != 4 && interfaceC1318.mo4589(12)) {
                    interfaceC1318.mo4600();
                }
            } else if (keyCode == 89 && interfaceC1318.mo4589(11)) {
                interfaceC1318.mo4604();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (!C3603.m11031(interfaceC1318, this.f24303)) {
                        if (interfaceC1318.mo4589(1)) {
                            interfaceC1318.pause();
                        }
                    } else {
                        C3603.m11030(interfaceC1318);
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            C3603.m11030(interfaceC1318);
                        } else if (keyCode == 127) {
                            String str = C3603.f11424;
                            if (interfaceC1318.mo4589(1)) {
                                interfaceC1318.pause();
                            }
                        }
                    } else if (interfaceC1318.mo4589(7)) {
                        interfaceC1318.mo4598();
                    }
                } else if (interfaceC1318.mo4589(9)) {
                    interfaceC1318.mo4597();
                }
            }
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f24287.m47418(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20959(C7844 c7844, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = c7844.f24279;
        PopupWindow popupWindow = c7844.f24281;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i10 == i11) && popupWindow.isShowing()) {
            c7844.m21003();
            popupWindow.update(view, (c7844.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[Catch: InvocationTargetException -> 0x0014, IllegalAccessException -> 0x0016, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0016, InvocationTargetException -> 0x0014, blocks: (B:4:0x0004, B:6:0x0008, B:16:0x001c, B:19:0x0032, B:21:0x0036, B:26:0x0045), top: B:32:0x0004 }] */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m20983(InterfaceC1318 interfaceC1318) {
        boolean z;
        boolean z2;
        Object objInvoke;
        Class cls;
        if (interfaceC1318 != null) {
            try {
                Class cls2 = this.f24274;
                if (cls2 == null || !cls2.isAssignableFrom(interfaceC1318.getClass())) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (IllegalAccessException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } else {
            z = false;
        }
        if (!z) {
            if (interfaceC1318 == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method = this.f24282;
                method.getClass();
                objInvoke = method.invoke(interfaceC1318, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        Method method2 = this.f24262;
        method2.getClass();
        Object objInvoke2 = method2.invoke(interfaceC1318, null);
        objInvoke2.getClass();
        if (!((Boolean) objInvoke2).booleanValue()) {
            if (interfaceC1318 == null && (cls = this.f24290) != null && cls.isAssignableFrom(interfaceC1318.getClass())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method3 = this.f24282;
                method3.getClass();
                objInvoke = method3.invoke(interfaceC1318, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20984(C7844 c7844, InterfaceC1318 interfaceC1318) {
        Class cls;
        return (interfaceC1318 == null || (cls = c7844.f24274) == null || !cls.isAssignableFrom(interfaceC1318.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20964(C7844 c7844, InterfaceC1318 interfaceC1318) {
        Class cls;
        return (interfaceC1318 == null || (cls = c7844.f24290) == null || !cls.isAssignableFrom(interfaceC1318.getClass())) ? false : true;
    }
}
