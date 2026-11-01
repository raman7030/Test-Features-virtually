package p067l;

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
import bin.p000mt.plus.R;
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
public class C9823 extends FrameLayout {

    /* JADX INFO: renamed from: ᩺ۧ */
    public static final float[] f27166;

    /* JADX INFO: renamed from: ֡֫ */
    public final ImageView f27167;

    /* JADX INFO: renamed from: ֡ۧ */
    public final Drawable f27168;

    /* JADX INFO: renamed from: ֨֫ */
    public final C23738 f27169;

    /* JADX INFO: renamed from: ֨ۧ */
    public final ImageView f27170;

    /* JADX INFO: renamed from: ֫֫ */
    public long[] f27171;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f27172;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f27173;

    /* JADX INFO: renamed from: ۖۧ */
    public int f27174;

    /* JADX INFO: renamed from: ۗ */
    public final float f27175;

    /* JADX INFO: renamed from: ۗ֫ */
    public final TextView f27176;

    /* JADX INFO: renamed from: ۗۧ */
    public int f27177;

    /* JADX INFO: renamed from: ۘ֫ */
    public final Method f27178;

    /* JADX INFO: renamed from: ۘۧ */
    public final ImageView f27179;

    /* JADX INFO: renamed from: ۙ */
    public final float f27180;

    /* JADX INFO: renamed from: ۙ֫ */
    public InterfaceC3621 f27181;

    /* JADX INFO: renamed from: ۙۧ */
    public final InterfaceC10020 f27182;

    /* JADX INFO: renamed from: ۚ֫ */
    public final Drawable f27183;

    /* JADX INFO: renamed from: ۚۧ */
    public final String f27184;

    /* JADX INFO: renamed from: ۛ */
    public final Method f27185;

    /* JADX INFO: renamed from: ۛ֫ */
    public final String f27186;

    /* JADX INFO: renamed from: ۛۧ */
    public final CopyOnWriteArrayList f27187;

    /* JADX INFO: renamed from: ۜ֫ */
    public final String f27188;

    /* JADX INFO: renamed from: ۜۧ */
    public final View f27189;

    /* JADX INFO: renamed from: ۟ */
    public final Class f27190;

    /* JADX INFO: renamed from: ۟֫ */
    public final ImageView f27191;

    /* JADX INFO: renamed from: ۠֫ */
    public final Drawable f27192;

    /* JADX INFO: renamed from: ۠ۧ */
    public final Drawable f27193;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Drawable f27194;

    /* JADX INFO: renamed from: ۡۧ */
    public final int f27195;

    /* JADX INFO: renamed from: ۢ֫ */
    public final String f27196;

    /* JADX INFO: renamed from: ۢۧ */
    public final PopupWindow f27197;

    /* JADX INFO: renamed from: ۤ */
    public final Method f27198;

    /* JADX INFO: renamed from: ۤ֫ */
    public final Drawable f27199;

    /* JADX INFO: renamed from: ۤۧ */
    public final RunnableC8368 f27200;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean[] f27201;

    /* JADX INFO: renamed from: ۧۧ */
    public final Resources f27202;

    /* JADX INFO: renamed from: ۨ */
    public final C22091 f27203;

    /* JADX INFO: renamed from: ۨ֫ */
    public final Drawable f27204;

    /* JADX INFO: renamed from: ۨۧ */
    public final C21727 f27205;

    /* JADX INFO: renamed from: ۫ */
    public final Class f27206;

    /* JADX INFO: renamed from: ۫֫ */
    public final String f27207;

    /* JADX INFO: renamed from: ۫ۧ */
    public final C22809 f27208;

    /* JADX INFO: renamed from: ۬ */
    public final ViewOnClickListenerC24575 f27209;

    /* JADX INFO: renamed from: ۬֫ */
    public final ImageView f27210;

    /* JADX INFO: renamed from: ۬ۧ */
    public boolean f27211;

    /* JADX INFO: renamed from: ܰ */
    public final TextView f27212;

    /* JADX INFO: renamed from: ܰ֫ */
    public final Drawable f27213;

    /* JADX INFO: renamed from: ܳ֫ */
    public final Formatter f27214;

    /* JADX INFO: renamed from: ܳۧ */
    public final Method f27215;

    /* JADX INFO: renamed from: ܶ֫ */
    public final ImageView f27216;

    /* JADX INFO: renamed from: ܶۧ */
    public final String f27217;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f27218;

    /* JADX INFO: renamed from: ܺۧ */
    public boolean f27219;

    /* JADX INFO: renamed from: ܽ֫ */
    public final View f27220;

    /* JADX INFO: renamed from: ܽۧ */
    public final View f27221;

    /* JADX INFO: renamed from: ܿ֫ */
    public final StringBuilder f27222;

    /* JADX INFO: renamed from: ܿۧ */
    public boolean f27223;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final TextView f27224;

    /* JADX INFO: renamed from: ᩳۧ */
    public final TextView f27225;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final ImageView f27226;

    /* JADX INFO: renamed from: ᩴۧ */
    public final Drawable f27227;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f27228;

    /* JADX INFO: renamed from: ᩵ۧ */
    public final String f27229;

    /* JADX INFO: renamed from: ᩶ */
    public final C15857 f27230;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean[] f27231;

    /* JADX INFO: renamed from: ᩶ۧ */
    public final C19882 f27232;

    /* JADX INFO: renamed from: ᩷֫ */
    public final Drawable f27233;

    /* JADX INFO: renamed from: ᩷ۧ */
    public final C14849 f27234;

    /* JADX INFO: renamed from: ᩸ */
    public long[] f27235;

    /* JADX INFO: renamed from: ᩸֫ */
    public final C21894 f27236;

    /* JADX INFO: renamed from: ᩸ۧ */
    public final Drawable f27237;

    /* JADX INFO: renamed from: ᩹ */
    public final View f27238;

    /* JADX INFO: renamed from: ᩹֫ */
    public final View f27239;

    /* JADX INFO: renamed from: ᩹ۧ */
    public final String f27240;

    /* JADX INFO: renamed from: ᩺ */
    public long f27241;

    /* JADX INFO: renamed from: ᩺֫ */
    public final String f27242;

    /* JADX INFO: renamed from: ᩻֫ */
    public final ImageView f27243;

    /* JADX INFO: renamed from: ᩻ۧ */
    public final C17198 f27244;

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m22980(InterfaceC3117 interfaceC3117) {
        interfaceC3117.getClass();
        this.f27187.add(interfaceC3117);
    }

    static {
        C18373.m41851("media3.ui");
        f27166 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C9823(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9823(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9823(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) throws NoSuchMethodException {
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
        this.f27219 = true;
        this.f27174 = OpenAuthTask.Duplex;
        this.f27172 = 0;
        this.f27177 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C23976.f76171, i, 0);
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
                this.f27174 = typedArrayObtainStyledAttributes.getInt(32, this.f27174);
                this.f27172 = typedArrayObtainStyledAttributes.getInt(19, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.f27211 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                this.f27177 = C5792.m12976(typedArrayObtainStyledAttributes.getInt(38, this.f27177), 16, 1000);
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
        this.f27209 = new ViewOnClickListenerC24575(this);
        this.f27187 = new CopyOnWriteArrayList();
        this.f27169 = new C23738();
        this.f27205 = new C21727();
        StringBuilder sb = new StringBuilder();
        this.f27222 = sb;
        boolean z18 = z;
        this.f27214 = new Formatter(sb, Locale.getDefault());
        this.f27235 = new long[0];
        this.f27231 = new boolean[0];
        this.f27171 = new long[0];
        this.f27201 = new boolean[0];
        this.f27200 = new RunnableC8368(1, this);
        try {
            Method method6 = InterfaceC6324.class.getMethod("ܽ", cls2);
            try {
                method2 = InterfaceC6324.class.getMethod("᩸", null);
                method = method6;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = method6;
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.f27190 = InterfaceC6324.class;
        this.f27215 = method;
        this.f27178 = method2;
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
        this.f27206 = cls;
        this.f27185 = method4;
        this.f27198 = method5;
        this.f27212 = (TextView) findViewById(R.id.MT_Protector);
        this.f27176 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f27170 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f27209);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27243 = imageView2;
        int i19 = 1;
        ViewOnClickListenerC15934 viewOnClickListenerC15934 = new ViewOnClickListenerC15934(i19, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC15934);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27226 = imageView3;
        ViewOnClickListenerC15934 viewOnClickListenerC15935 = new ViewOnClickListenerC15934(i19, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC15935);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f27189 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f27209);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f27239 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.f27209);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f27238 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.f27209);
        }
        InterfaceC10020 interfaceC10020 = (InterfaceC10020) findViewById(R.id.MT_Protector);
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        if (interfaceC10020 != null) {
            this.f27182 = interfaceC10020;
            textView = null;
            z9 = z18;
        } else if (viewFindViewById4 != null) {
            z9 = z18;
            C9271 c9271 = new C9271(context, null, 0, attributeSet2, R.style.MT_Protector);
            c9271.setId(R.id.MT_Protector);
            c9271.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c9271, iIndexOfChild);
            this.f27182 = c9271;
            textView = null;
        } else {
            z9 = z18;
            textView = null;
            this.f27182 = null;
        }
        InterfaceC10020 interfaceC10021 = this.f27182;
        if (interfaceC10021 != null) {
            interfaceC10021.mo21461(this.f27209);
        }
        Resources resources = context.getResources();
        this.f27202 = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27216 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.f27209);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27210 = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            imageView5.setOnClickListener(this.f27209);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27167 = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            imageView6.setOnClickListener(this.f27209);
        }
        Typeface typefaceM14960 = C1059.m14960(context, R.font.MT_Protector);
        ImageView imageView7 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.f27221 = imageView7;
            this.f27225 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM14960);
            this.f27225 = textView2;
            this.f27221 = textView2;
        } else {
            this.f27225 = textView;
            this.f27221 = textView;
        }
        View view = this.f27221;
        if (view != null) {
            view.setOnClickListener(this.f27209);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            this.f27220 = imageView8;
            this.f27224 = null;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceM14960);
            this.f27224 = textView3;
            this.f27220 = textView3;
        } else {
            this.f27224 = null;
            this.f27220 = null;
        }
        View view2 = this.f27220;
        if (view2 != null) {
            view2.setOnClickListener(this.f27209);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27191 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.f27209);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.MT_Protector);
        this.f27179 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f27209);
        }
        this.f27175 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f27180 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.MT_Protector);
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            m22920((View) imageView11, false);
        }
        C22091 c22091 = new C22091(this);
        this.f27203 = c22091;
        c22091.m49747(z9);
        C17198 c17198 = new C17198(this, new String[]{resources.getString(R.string.MT_Protector), resources.getString(R.string.MT_Protector)}, new Drawable[]{resources.getDrawable(R.drawable.MT_Protector, context.getTheme()), resources.getDrawable(R.drawable.MT_Protector, context.getTheme())});
        this.f27244 = c17198;
        this.f27195 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
        C14849 c14849 = (C14849) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f27234 = c14849;
        c14849.setAdapter(c17198);
        c14849.setLayoutManager(new C8541(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) c14849, -2, -2, true);
        this.f27197 = popupWindow;
        if (Build.VERSION.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(this.f27209);
        this.f27228 = true;
        this.f27208 = new C22809(getResources());
        this.f27237 = resources.getDrawable(i5, context.getTheme());
        this.f27193 = resources.getDrawable(i4, context.getTheme());
        this.f27240 = resources.getString(R.string.MT_Protector);
        this.f27217 = resources.getString(R.string.MT_Protector);
        this.f27232 = new C19882(this);
        this.f27230 = new C15857(this);
        this.f27236 = new C21894(this, resources.getStringArray(R.array.MT_Protector), f27166);
        this.f27192 = resources.getDrawable(i11, context.getTheme());
        this.f27183 = resources.getDrawable(i12, context.getTheme());
        this.f27194 = resources.getDrawable(i17, context.getTheme());
        this.f27233 = resources.getDrawable(i18, context.getTheme());
        this.f27204 = resources.getDrawable(i10, context.getTheme());
        this.f27213 = resources.getDrawable(i6, context.getTheme());
        this.f27199 = resources.getDrawable(i2, context.getTheme());
        this.f27168 = resources.getDrawable(i8, context.getTheme());
        this.f27227 = resources.getDrawable(i3, context.getTheme());
        this.f27196 = resources.getString(R.string.MT_Protector);
        this.f27188 = resources.getString(R.string.MT_Protector);
        this.f27186 = resources.getString(R.string.MT_Protector);
        this.f27242 = resources.getString(R.string.MT_Protector);
        this.f27207 = resources.getString(R.string.MT_Protector);
        this.f27184 = resources.getString(R.string.MT_Protector);
        this.f27229 = resources.getString(R.string.MT_Protector);
        c22091.m49746(findViewById(R.id.MT_Protector), true);
        c22091.m49746(this.f27220, z3);
        c22091.m49746(this.f27221, z2);
        c22091.m49746(imageView5, z4);
        c22091.m49746(imageView6, z5);
        c22091.m49746(imageView10, z8);
        c22091.m49746(imageView, z6);
        c22091.m49746(imageView11, z7);
        c22091.m49746(imageView9, this.f27172 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ᩳ֨ۧ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                C9823.m22924(this.f57405, view3, i20, i21, i22, i23, i24, i25, i26, i27);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22981(InterfaceC3621 interfaceC3621) {
        C23877.m52960(Looper.myLooper() == Looper.getMainLooper());
        C23877.m52957(interfaceC3621 == null || interfaceC3621.mo6793() == Looper.getMainLooper());
        InterfaceC3621 interfaceC3622 = this.f27181;
        if (interfaceC3622 == interfaceC3621) {
            return;
        }
        ViewOnClickListenerC24575 viewOnClickListenerC24575 = this.f27209;
        if (interfaceC3622 != null) {
            interfaceC3622.mo6799(viewOnClickListenerC24575);
        }
        this.f27181 = interfaceC3621;
        if (interfaceC3621 != null) {
            interfaceC3621.mo6819(viewOnClickListenerC24575);
        }
        m22985();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22987(boolean z) {
        this.f27203.m49746(this.f27221, z);
        m22944();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22982(boolean z) {
        this.f27203.m49746(this.f27220, z);
        m22944();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m22978() {
        return this.f27174;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22979(int i) {
        this.f27174 = i;
        C22091 c22091 = this.f27203;
        if (c22091.m49752()) {
            c22091.m49755();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m22984() {
        this.f27203.m49747(false);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m22992() {
        this.f27203.m49749();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22986() {
        this.f27203.m49744();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22989() {
        this.f27203.m49750();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m22991() {
        return this.f27203.m49752();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m22990() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22988() {
        for (InterfaceC3117 interfaceC3117 : this.f27187) {
            getVisibility();
            interfaceC3117.mo5322();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m22985() {
        m22959();
        m22944();
        m22935();
        m22970();
        m22938();
        InterfaceC3621 interfaceC3621 = this.f27181;
        if (interfaceC3621 != null) {
            float f = interfaceC3621.mo6831().f11305;
            C21894 c21894 = this.f27236;
            c21894.m49358(f);
            String strM49357 = c21894.m49357();
            C17198 c17198 = this.f27244;
            c17198.m38950(0, strM49357);
            m22920(this.f27189, c17198.m38951());
        }
        m22917();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX INFO: renamed from: ܺ */
    public void m22959() {
        ImageView imageView;
        boolean z;
        if (m22990() && this.f27218 && (imageView = this.f27216) != null) {
            boolean zM13007 = C5792.m13007(this.f27181, this.f27219);
            Drawable drawable = zM13007 ? this.f27192 : this.f27183;
            int i = zM13007 ? R.string.MT_Protector : R.string.MT_Protector;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f27202.getString(i));
            InterfaceC3621 interfaceC3621 = this.f27181;
            if (interfaceC3621 != null) {
                z = true;
                if (!interfaceC3621.mo6821(1) || (interfaceC3621.mo6821(17) && interfaceC3621.mo6808().m15990())) {
                    z = false;
                }
            } else {
                z = false;
            }
            m22920(imageView, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ */
    public void m22944() {
        boolean zMo6821;
        boolean zMo6822;
        boolean zMo6823;
        boolean zMo6824;
        boolean zMo6825;
        if (m22990() && this.f27218) {
            InterfaceC3621 interfaceC3621 = this.f27181;
            if (interfaceC3621 != null) {
                zMo6822 = interfaceC3621.mo6821(5);
                zMo6823 = interfaceC3621.mo6821(7);
                zMo6824 = interfaceC3621.mo6821(11);
                zMo6825 = interfaceC3621.mo6821(12);
                zMo6821 = interfaceC3621.mo6821(9);
            } else {
                zMo6821 = false;
                zMo6822 = false;
                zMo6823 = false;
                zMo6824 = false;
                zMo6825 = false;
            }
            Resources resources = this.f27202;
            View view = this.f27221;
            if (zMo6824) {
                InterfaceC3621 interfaceC3622 = this.f27181;
                int iMo6828 = (int) ((interfaceC3622 != null ? interfaceC3622.mo6828() : 5000L) / 1000);
                TextView textView = this.f27225;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo6828));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo6828, Integer.valueOf(iMo6828)));
                }
            }
            View view2 = this.f27220;
            if (zMo6825) {
                InterfaceC3621 interfaceC3623 = this.f27181;
                int iMo6842 = (int) ((interfaceC3623 != null ? interfaceC3623.mo6842() : 15000L) / 1000);
                TextView textView2 = this.f27224;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo6842));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo6842, Integer.valueOf(iMo6842)));
                }
            }
            m22920(this.f27210, zMo6823);
            m22920(view, zMo6824);
            m22920(view2, zMo6825);
            m22920(this.f27167, zMo6821);
            InterfaceC10020 interfaceC10020 = this.f27182;
            if (interfaceC10020 != null) {
                interfaceC10020.setEnabled(zMo6822);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m22935() {
        ImageView imageView;
        if (m22990() && this.f27218 && (imageView = this.f27191) != null) {
            if (this.f27172 == 0) {
                m22920((View) imageView, false);
                return;
            }
            InterfaceC3621 interfaceC3621 = this.f27181;
            String str = this.f27186;
            Drawable drawable = this.f27204;
            if (interfaceC3621 == null || !interfaceC3621.mo6821(15)) {
                m22920((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m22920((View) imageView, true);
            int iMo6810 = interfaceC3621.mo6810();
            if (iMo6810 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo6810 == 1) {
                imageView.setImageDrawable(this.f27213);
                imageView.setContentDescription(this.f27242);
            } else {
                if (iMo6810 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f27199);
                imageView.setContentDescription(this.f27207);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵ */
    public void m22970() {
        ImageView imageView;
        if (m22990() && this.f27218 && (imageView = this.f27179) != null) {
            InterfaceC3621 interfaceC3621 = this.f27181;
            if (!this.f27203.m49748(imageView)) {
                m22920((View) imageView, false);
                return;
            }
            String str = this.f27229;
            Drawable drawable = this.f27227;
            if (interfaceC3621 == null || !interfaceC3621.mo6821(14)) {
                m22920((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m22920((View) imageView, true);
            if (interfaceC3621.mo6803()) {
                drawable = this.f27168;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC3621.mo6803()) {
                str = this.f27184;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ */
    public void m22938() {
        C19882 c19882 = this.f27232;
        c19882.getClass();
        List list = Collections.EMPTY_LIST;
        c19882.f18647 = list;
        C15857 c15857 = this.f27230;
        c15857.getClass();
        c15857.f18647 = list;
        InterfaceC3621 interfaceC3621 = this.f27181;
        ImageView imageView = this.f27170;
        if (interfaceC3621 != null && interfaceC3621.mo6821(30) && this.f27181.mo6821(29)) {
            C15690 c15690Mo6806 = this.f27181.mo6806();
            c15857.m35994(m22919(c15690Mo6806, 1));
            if (this.f27203.m49748(imageView)) {
                c19882.m45119(m22919(c15690Mo6806, 3));
            } else {
                c19882.m45119(AbstractC16192.m36872of());
            }
        }
        m22920(imageView, c19882.getItemCount() > 0);
        m22920(this.f27189, this.f27244.m38951());
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC16192 m22919(C15690 c15690, int i) {
        C4123 c4123 = new C4123();
        AbstractC16192 abstractC16192M35728 = c15690.m35728();
        for (int i2 = 0; i2 < abstractC16192M35728.size(); i2++) {
            C24408 c24408 = (C24408) abstractC16192M35728.get(i2);
            if (c24408.m53836() == i) {
                for (int i3 = 0; i3 < c24408.f77291; i3++) {
                    if (c24408.m53835(i3, false)) {
                        C10307 c10307M53833 = c24408.m53833(i3);
                        if ((c10307M53833.f28542 & 2) == 0) {
                            c4123.m18184(new C20553(c15690, i2, i3, this.f27208.m51010(c10307M53833)));
                        }
                    }
                }
            }
        }
        return c4123.m8329();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX INFO: renamed from: ֡ */
    public void m22917() {
        AbstractC6974 abstractC6974Mo6808;
        long jM12990;
        int i;
        long j;
        int i2;
        boolean z;
        boolean z2;
        InterfaceC3621 interfaceC3621 = this.f27181;
        if (interfaceC3621 == null) {
            return;
        }
        long j2 = 0;
        this.f27241 = 0L;
        if (interfaceC3621.mo6821(17)) {
            abstractC6974Mo6808 = interfaceC3621.mo6808();
        } else {
            abstractC6974Mo6808 = AbstractC6974.f18145;
        }
        long j3 = -9223372036854775807L;
        boolean z3 = false;
        if (!abstractC6974Mo6808.m15990()) {
            int iMo6811 = interfaceC3621.mo6811();
            i = 0;
            int i3 = iMo6811;
            j = 0;
            while (i3 <= iMo6811) {
                if (i3 == iMo6811) {
                    this.f27241 = C5792.m13013(j);
                }
                C21727 c21727 = this.f27205;
                abstractC6974Mo6808.m15986(i3, c21727);
                if (c21727.f68431 == j3) {
                    break;
                }
                int i4 = c21727.f68436;
                while (i4 <= c21727.f68428) {
                    C23738 c23738 = this.f27169;
                    abstractC6974Mo6808.mo15984(i4, c23738, z3);
                    C9224 c9224 = c23738.f75526;
                    c9224.getClass();
                    int i5 = c9224.f24955;
                    int i6 = 0;
                    while (i6 < i5) {
                        c23738.m52774(i6);
                        long j4 = c23738.f75530;
                        if (j4 >= j2) {
                            long[] jArr = this.f27235;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f27235 = Arrays.copyOf(jArr, length);
                                this.f27231 = Arrays.copyOf(this.f27231, length);
                            }
                            this.f27235[i] = C5792.m13013(j4 + j);
                            boolean[] zArr = this.f27231;
                            C15258 c15258M21246 = c23738.f75526.m21246(i6);
                            int i7 = c15258M21246.f43549;
                            if (i7 != -1) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= i7) {
                                        i2 = iMo6811;
                                        z = true;
                                        z2 = false;
                                        break;
                                    }
                                    i2 = iMo6811;
                                    int i9 = c15258M21246.f43551[i8];
                                    C15258 c15258 = c15258M21246;
                                    if (i9 == 0 || i9 == 1) {
                                        z2 = true;
                                        z = true;
                                        break;
                                    } else {
                                        i8++;
                                        iMo6811 = i2;
                                        c15258M21246 = c15258;
                                    }
                                }
                            } else {
                                z2 = true;
                                z = true;
                                i2 = iMo6811;
                            }
                            zArr[i] = z2 ^ z;
                            i++;
                        } else {
                            i2 = iMo6811;
                        }
                        i6++;
                        iMo6811 = i2;
                        j2 = 0;
                    }
                    i4++;
                    z3 = false;
                    j2 = 0;
                }
                j += c21727.f68431;
                i3++;
                z3 = false;
                iMo6811 = iMo6811;
                j2 = 0;
                j3 = -9223372036854775807L;
            }
        } else {
            if (interfaceC3621.mo6821(16)) {
                long jMo6825 = interfaceC3621.mo6825();
                if (jMo6825 != -9223372036854775807L) {
                    jM12990 = C5792.m12990(jMo6825);
                } else {
                    jM12990 = 0;
                }
            } else {
                jM12990 = 0;
            }
            i = 0;
            j = jM12990;
        }
        long jM13013 = C5792.m13013(j);
        TextView textView = this.f27212;
        if (textView != null) {
            textView.setText(C5792.m12996(this.f27222, this.f27214, jM13013));
        }
        InterfaceC10020 interfaceC10020 = this.f27182;
        if (interfaceC10020 != null) {
            interfaceC10020.mo21465(jM13013);
            long[] jArr2 = this.f27171;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.f27235;
            if (i10 > jArr3.length) {
                this.f27235 = Arrays.copyOf(jArr3, i10);
                this.f27231 = Arrays.copyOf(this.f27231, i10);
            }
            System.arraycopy(jArr2, 0, this.f27235, i, length2);
            System.arraycopy(this.f27201, 0, this.f27231, i, length2);
            interfaceC10020.mo21463(this.f27235, this.f27231, i10);
        }
        m22932();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public void m22932() {
        long jMo6826;
        long jMo6822;
        if (m22990() && this.f27218) {
            InterfaceC3621 interfaceC3621 = this.f27181;
            if (interfaceC3621 == null || !interfaceC3621.mo6821(16)) {
                jMo6826 = 0;
                jMo6822 = 0;
            } else {
                jMo6826 = interfaceC3621.mo6826() + this.f27241;
                jMo6822 = interfaceC3621.mo6822() + this.f27241;
            }
            TextView textView = this.f27176;
            if (textView != null && !this.f27223) {
                textView.setText(C5792.m12996(this.f27222, this.f27214, jMo6826));
            }
            InterfaceC10020 interfaceC10020 = this.f27182;
            if (interfaceC10020 != null) {
                interfaceC10020.mo21460(jMo6826);
                if (m22948(interfaceC3621)) {
                    jMo6822 = jMo6826;
                }
                interfaceC10020.mo21467(jMo6822);
            }
            RunnableC8368 runnableC8368 = this.f27200;
            removeCallbacks(runnableC8368);
            int iMo6835 = interfaceC3621 == null ? 1 : interfaceC3621.mo6835();
            if (interfaceC3621 != null && interfaceC3621.isPlaying()) {
                long jMin = Math.min(interfaceC10020 != null ? interfaceC10020.mo21459() : 1000L, 1000 - (jMo6826 % 1000));
                float f = interfaceC3621.mo6831().f11305;
                postDelayed(runnableC8368, C5792.m12992(f > 0.0f ? (long) (jMin / f) : 1000L, this.f27177, 1000L));
            } else {
                if (iMo6835 == 4 || iMo6835 == 1) {
                    return;
                }
                postDelayed(runnableC8368, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public static void m22950(C9823 c9823) {
        C17198 c17198 = c9823.f27244;
        C21894 c21894 = c9823.f27236;
        InterfaceC3621 interfaceC3621 = c9823.f27181;
        if (interfaceC3621 == null) {
            return;
        }
        c21894.m49358(interfaceC3621.mo6831().f11305);
        c17198.m38950(0, c21894.m49357());
        c9823.m22920(c9823.f27189, c17198.m38951());
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m22968() {
        C14849 c14849 = this.f27234;
        c14849.measure(0, 0);
        int width = getWidth();
        int i = this.f27195;
        int iMin = Math.min(c14849.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f27197;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), c14849.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m22928(AbstractC21283 abstractC21283, View view) {
        this.f27234.setAdapter(abstractC21283);
        m22968();
        this.f27228 = false;
        PopupWindow popupWindow = this.f27197;
        popupWindow.dismiss();
        this.f27228 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f27195;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22922(C9823 c9823, float f) {
        InterfaceC3621 interfaceC3621 = c9823.f27181;
        if (interfaceC3621 == null || !interfaceC3621.mo6821(13)) {
            return;
        }
        InterfaceC3621 interfaceC3622 = c9823.f27181;
        interfaceC3622.mo6800(new C4963(f, interfaceC3622.mo6831().f11303));
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m22993() {
        ImageView imageView = this.f27216;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22920(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f27175 : this.f27180);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22925(C9823 c9823, InterfaceC3621 interfaceC3621, long j) {
        if (interfaceC3621.mo6821(5)) {
            interfaceC3621.seekTo(j);
        }
        c9823.m22932();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22921(C9823 c9823) {
        String str = c9823.f27188;
        Drawable drawable = c9823.f27233;
        String str2 = c9823.f27196;
        Drawable drawable2 = c9823.f27194;
        boolean z = c9823.f27173;
        boolean z2 = !z;
        if (z == z2) {
            return;
        }
        c9823.f27173 = z2;
        ImageView imageView = c9823.f27243;
        if (imageView != null) {
            if (!z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = c9823.f27226;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m22923(C9823 c9823, int i) {
        View view = c9823.f27189;
        if (i == 0) {
            C21894 c21894 = c9823.f27236;
            view.getClass();
            c9823.m22928(c21894, view);
        } else {
            if (i == 1) {
                C15857 c15857 = c9823.f27230;
                view.getClass();
                c9823.m22928(c15857, view);
                return;
            }
            c9823.f27197.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22091 c22091 = this.f27203;
        c22091.m49754();
        this.f27218 = true;
        if (c22091.m49752()) {
            c22091.m49755();
        }
        m22985();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C22091 c22091 = this.f27203;
        c22091.m49753();
        this.f27218 = false;
        removeCallbacks(this.f27200);
        c22091.m49751();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m22983(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m22983(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC3621 interfaceC3621 = this.f27181;
        if (interfaceC3621 == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC3621.mo6835() != 4 && interfaceC3621.mo6821(12)) {
                    interfaceC3621.mo6832();
                }
            } else if (keyCode == 89 && interfaceC3621.mo6821(11)) {
                interfaceC3621.mo6836();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (!C5792.m13007(interfaceC3621, this.f27219)) {
                        if (interfaceC3621.mo6821(1)) {
                            interfaceC3621.pause();
                        }
                    } else {
                        C5792.m13006(interfaceC3621);
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            C5792.m13006(interfaceC3621);
                        } else if (keyCode == 127) {
                            String str = C5792.f14228;
                            if (interfaceC3621.mo6821(1)) {
                                interfaceC3621.pause();
                            }
                        }
                    } else if (interfaceC3621.mo6821(7)) {
                        interfaceC3621.mo6830();
                    }
                } else if (interfaceC3621.mo6821(9)) {
                    interfaceC3621.mo6829();
                }
            }
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f27203.m49745(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22924(C9823 c9823, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = c9823.f27195;
        PopupWindow popupWindow = c9823.f27197;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i10 == i11) && popupWindow.isShowing()) {
            c9823.m22968();
            popupWindow.update(view, (c9823.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[Catch: InvocationTargetException -> 0x0014, IllegalAccessException -> 0x0016, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0016, InvocationTargetException -> 0x0014, blocks: (B:4:0x0004, B:6:0x0008, B:16:0x001c, B:19:0x0032, B:21:0x0036, B:26:0x0045), top: B:32:0x0004 }] */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ۧ */
    public boolean m22948(InterfaceC3621 interfaceC3621) {
        boolean z;
        boolean z2;
        Object objInvoke;
        Class cls;
        if (interfaceC3621 != null) {
            try {
                Class cls2 = this.f27190;
                if (cls2 == null || !cls2.isAssignableFrom(interfaceC3621.getClass())) {
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
            if (interfaceC3621 == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method = this.f27198;
                method.getClass();
                objInvoke = method.invoke(interfaceC3621, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        Method method2 = this.f27178;
        method2.getClass();
        Object objInvoke2 = method2.invoke(interfaceC3621, null);
        objInvoke2.getClass();
        if (!((Boolean) objInvoke2).booleanValue()) {
            if (interfaceC3621 == null && (cls = this.f27206) != null && cls.isAssignableFrom(interfaceC3621.getClass())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method3 = this.f27198;
                method3.getClass();
                objInvoke = method3.invoke(interfaceC3621, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m22949(C9823 c9823, InterfaceC3621 interfaceC3621) {
        Class cls;
        return (interfaceC3621 == null || (cls = c9823.f27190) == null || !cls.isAssignableFrom(interfaceC3621.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22929(C9823 c9823, InterfaceC3621 interfaceC3621) {
        Class cls;
        return (interfaceC3621 == null || (cls = c9823.f27206) == null || !cls.isAssignableFrom(interfaceC3621.getClass())) ? false : true;
    }
}
