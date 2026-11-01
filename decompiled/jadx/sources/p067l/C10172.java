package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10172 extends AbstractC14651 {

    /* JADX INFO: renamed from: ᩳۧ */
    public static final /* synthetic */ int f28141 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public final Matrix f28142;

    /* JADX INFO: renamed from: ֨֫ */
    public float f28143;

    /* JADX INFO: renamed from: ֫֫ */
    public final C20902 f28144;

    /* JADX INFO: renamed from: ֫ۧ */
    public float f28145;

    /* JADX INFO: renamed from: ۖ֫ */
    public C7490 f28146;

    /* JADX INFO: renamed from: ۗ */
    public C2795 f28147;

    /* JADX INFO: renamed from: ۗ֫ */
    public float f28148;

    /* JADX INFO: renamed from: ۘ֫ */
    public final Paint f28149;

    /* JADX INFO: renamed from: ۙ */
    public int f28150;

    /* JADX INFO: renamed from: ۙ֫ */
    public float f28151;

    /* JADX INFO: renamed from: ۚ֫ */
    public final OverScroller f28152;

    /* JADX INFO: renamed from: ۛ */
    public final Paint f28153;

    /* JADX INFO: renamed from: ۛ֫ */
    public float f28154;

    /* JADX INFO: renamed from: ۜ֫ */
    public final float f28155;

    /* JADX INFO: renamed from: ۟ */
    public final C20902 f28156;

    /* JADX INFO: renamed from: ۟֫ */
    public float f28157;

    /* JADX INFO: renamed from: ۠֫ */
    public float f28158;

    /* JADX INFO: renamed from: ۡ֫ */
    public float f28159;

    /* JADX INFO: renamed from: ۢ֫ */
    public final float f28160;

    /* JADX INFO: renamed from: ۤ */
    public int f28161;

    /* JADX INFO: renamed from: ۤ֫ */
    public float f28162;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f28163;

    /* JADX INFO: renamed from: ۧۧ */
    public final RectF f28164;

    /* JADX INFO: renamed from: ۨ */
    public int f28165;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f28166;

    /* JADX INFO: renamed from: ۫ */
    public final Matrix f28167;

    /* JADX INFO: renamed from: ۫֫ */
    public float f28168;

    /* JADX INFO: renamed from: ۬ */
    public long f28169;

    /* JADX INFO: renamed from: ۬֫ */
    public float f28170;

    /* JADX INFO: renamed from: ܰ */
    public float f28171;

    /* JADX INFO: renamed from: ܰ֫ */
    public float f28172;

    /* JADX INFO: renamed from: ܳ֫ */
    public final RunnableC23634 f28173;

    /* JADX INFO: renamed from: ܶ֫ */
    public float f28174;

    /* JADX INFO: renamed from: ܺ֫ */
    public final ArrayList f28175;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f28176;

    /* JADX INFO: renamed from: ܽۧ */
    public final RectF f28177;

    /* JADX INFO: renamed from: ܿ֫ */
    public InterfaceC5264 f28178;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C16149 f28179;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final C15478 f28180;

    /* JADX INFO: renamed from: ᩵֫ */
    public final Matrix f28181;

    /* JADX INFO: renamed from: ᩶ */
    public EnumC20231 f28182;

    /* JADX INFO: renamed from: ᩶֫ */
    public float f28183;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f28184;

    /* JADX INFO: renamed from: ᩸ */
    public C21831 f28185;

    /* JADX INFO: renamed from: ᩸֫ */
    public float f28186;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f28187;

    /* JADX INFO: renamed from: ᩹֫ */
    public float f28188;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f28189;

    /* JADX INFO: renamed from: ᩺֫ */
    public float f28190;

    /* JADX INFO: renamed from: ᩻֫ */
    public final Paint f28191;

    public C10172(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28180 = new C15478(getResources().getDisplayMetrics().density);
        this.f28175 = new ArrayList(3);
        this.f28153 = new Paint(3);
        Paint paint = new Paint(1);
        this.f28149 = paint;
        Paint paint2 = new Paint(1);
        this.f28191 = paint2;
        this.f28173 = new RunnableC23634(3, this);
        this.f28181 = new Matrix();
        this.f28142 = new Matrix();
        this.f28167 = new Matrix();
        this.f28177 = new RectF();
        this.f28164 = new RectF();
        this.f28156 = new C20902();
        this.f28144 = new C20902();
        this.f28165 = -1;
        this.f28161 = -16777216;
        this.f28182 = EnumC20231.NONE;
        this.f28160 = getResources().getDisplayMetrics().density * 16.0f;
        this.f28152 = new OverScroller(context);
        this.f28179 = new C16149(this);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = getResources().getDisplayMetrics().density;
        this.f28155 = 14.5f * f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.MT_Protector});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            paint2.setColor(color);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f * 3.0f);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            setFocusable(true);
            setClickable(true);
            setImportantForAccessibility(1);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16689(C21831 c21831, int i) {
        if (c21831.m49244() < 0 || (c21831.m49244() > 0 && (i < 0 || i >= c21831.m49244()))) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo16698();
        this.f28189 = false;
        this.f28159 = 0.0f;
        m23683(0.0f);
        this.f28185 = c21831;
        if (c21831.m49244() == 0) {
            i = -1;
        }
        this.f28165 = i;
        if (i >= 0) {
            c21831.m49257(i);
        }
        m23678();
        m23677();
        invalidate();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16688(InterfaceC5264 interfaceC5264) {
        this.f28178 = interfaceC5264;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ۧ */
    public final int mo16693() {
        return this.f28165;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܳ */
    public final Bundle mo16695() {
        C2795 c2795M23681 = m23681(this.f28165);
        if (c2795M23681 == null) {
            return null;
        }
        C13525 c13525 = c2795M23681.f4720;
        if (!m23676(c2795M23681, c2795M23681.f4716)) {
            return null;
        }
        C7490 c7490 = this.f28146;
        if (c7490 != null && c7490.f19580 == c2795M23681 && c7490.f19581 == c2795M23681.f4716) {
            C3466 c3466 = c7490.f19582;
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putInt("width", c3466.f6944);
            bundle.putInt("height", c3466.f6942);
            bundle.putInt("orientation", c3466.f6943);
            C8160 c8160 = c3466.f6941;
            bundle.putDouble("relativeScale", c8160.f21532);
            bundle.putDouble("centerX", c8160.f21528);
            bundle.putDouble("centerY", c8160.f21529);
            bundle.putFloat("rotation", c8160.f21530);
            return bundle;
        }
        if (c2795M23681.f4717 == null || !c13525.m30768()) {
            return null;
        }
        int i = c2795M23681.f4724;
        int i2 = c2795M23681.f4715;
        int i3 = ((C17135) c2795M23681.f4717).f51003.f49788;
        C8160 c8160M30784 = c13525.m30784();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 1);
        bundle2.putInt("width", i);
        bundle2.putInt("height", i2);
        bundle2.putInt("orientation", i3);
        bundle2.putDouble("relativeScale", c8160M30784.f21532);
        bundle2.putDouble("centerX", c8160M30784.f21528);
        bundle2.putDouble("centerY", c8160M30784.f21529);
        bundle2.putFloat("rotation", c8160M30784.f21530);
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16692(Bundle bundle) {
        C3466 c3466 = null;
        this.f28146 = null;
        C2795 c2795M23681 = m23681(this.f28165);
        if (bundle != null) {
            try {
                if (bundle.getInt("version") == 1) {
                    int i = bundle.getInt("width");
                    int i2 = bundle.getInt("height");
                    int i3 = bundle.getInt("orientation");
                    if (i <= 0 || i2 <= 0 || i3 < 1 || i3 > 8) {
                        c3466 = null;
                    } else {
                        C8160 c8160 = new C8160(C21274.m48067(i, i2, i3), C21274.m48065(i, i2, i3), bundle.getDouble("relativeScale", Double.NaN), bundle.getDouble("centerX", Double.NaN), bundle.getDouble("centerY", Double.NaN), bundle.getFloat("rotation", Float.NaN));
                        if (c8160.m18935()) {
                            c3466 = new C3466(i, i2, i3, c8160);
                        } else {
                            c3466 = null;
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        if (c2795M23681 == null || !m23676(c2795M23681, c2795M23681.f4716) || c3466 == null) {
            return false;
        }
        if (c2795M23681.f4717 != null && !c3466.m6191(c2795M23681)) {
            return false;
        }
        this.f28146 = new C7490(c2795M23681, c3466);
        m23682();
        return true;
    }

    /* JADX INFO: renamed from: ܺ */
    private void m23682() {
        C7490 c7490 = this.f28146;
        if (c7490 == null) {
            return;
        }
        C3466 c3466 = c7490.f19582;
        C2795 c2795M23681 = m23681(this.f28165);
        if (c2795M23681 != null) {
            C13525 c13525 = c2795M23681.f4720;
            if (c7490.f19580 == c2795M23681) {
                long j = c7490.f19581;
                if (j == c2795M23681.f4716 && m23676(c2795M23681, j)) {
                    if (c2795M23681.f4717 == null) {
                        return;
                    }
                    if (!c3466.m6191(c2795M23681)) {
                        this.f28146 = null;
                        return;
                    } else {
                        if (c13525.m30768()) {
                            this.f28146 = null;
                            mo16686();
                            c13525.m30762(c3466.f6941);
                            invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.f28146 = null;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܽ */
    public final void mo16696(int i) {
        this.f28161 = i;
        invalidate();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16691(int i, long j, InterfaceC5421 interfaceC5421) {
        if (interfaceC5421 == null) {
            throw new IllegalArgumentException("Missing gallery renderer");
        }
        C17135 c17135 = (C17135) interfaceC5421;
        C16819 c16819 = c17135.f51003;
        int i2 = c16819.f49783;
        int i3 = c16819.f49784;
        int i4 = c16819.f49788;
        if (i2 <= 0 || i3 <= 0 || i4 < 1 || i4 > 8) {
            c17135.m38790();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C2795 c2795M23681 = m23681(i);
        if (!m23676(c2795M23681, j)) {
            c17135.m38790();
            return false;
        }
        int iM48067 = C21274.m48067(i2, i3, i4);
        int iM48065 = C21274.m48065(i2, i3, i4);
        C13525 c13525 = c2795M23681.f4720;
        float[] fArr = c2795M23681.f4722;
        if (c13525.m30767() != iM48067 || c13525.m30785() != iM48065) {
            if (i == this.f28165 && c13525.m30768()) {
                mo16686();
            } else if (i == this.f28165) {
                this.f28179.m36757();
            }
            c13525.m30761(iM48067, iM48065);
        }
        InterfaceC5421 interfaceC5422 = c2795M23681.f4717;
        c2795M23681.f4717 = interfaceC5421;
        c2795M23681.f4714 = false;
        removeCallbacks(this.f28173);
        c2795M23681.f4724 = i2;
        c2795M23681.f4715 = i3;
        C21274.m48062(i2, i3, i4, fArr);
        c2795M23681.f4719.setValues(fArr);
        if (interfaceC5422 != null && interfaceC5422 != interfaceC5421) {
            ((C17135) interfaceC5422).m38790();
        }
        m23682();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m23676(C2795 c2795, long j) {
        C21831 c21831;
        if (c2795 == null) {
            return false;
        }
        int i = c2795.f4725;
        if (c2795.f4716 != j || (c21831 = this.f28185) == null || i >= c21831.m49244()) {
            return false;
        }
        this.f28185.getClass();
        return ((long) i) + 1 == c2795.f4721;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16694(int i) {
        C2795 c2795M23681 = m23681(i);
        if (c2795M23681 == null || !m23676(c2795M23681, c2795M23681.f4716)) {
            return false;
        }
        C7490 c7490 = this.f28146;
        if (c7490 != null && c7490.f19580 == c2795M23681) {
            this.f28146 = null;
        }
        long j = c2795M23681.f4716;
        InterfaceC5421 interfaceC5421 = c2795M23681.f4717;
        long j2 = this.f28184 + 1;
        this.f28184 = j2;
        c2795M23681.f4716 = j2;
        c2795M23681.f4717 = null;
        c2795M23681.f4714 = false;
        c2795M23681.f4723 = SystemClock.uptimeMillis();
        this.f28185.m49246(i, j);
        if (interfaceC5421 != null) {
            ((C17135) interfaceC5421).m38790();
        }
        this.f28185.m49250(i, c2795M23681.f4716);
        invalidate();
        return true;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16687(int i, int i2, long j) {
        C2795 c2795M23681 = m23681(i);
        if (c2795M23681 == null || c2795M23681.f4716 != j) {
            return;
        }
        c2795M23681.f4714 = true;
        c2795M23681.f4718 = i2;
        removeCallbacks(this.f28173);
        invalidate();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16686() {
        m23692();
        this.f28179.m36752();
        if (!this.f28189) {
            this.f28159 = 0.0f;
            m23683(0.0f);
            C13525 c13525M23702 = m23702();
            if (c13525M23702 != null) {
                c13525M23702.m30756();
            }
        }
        invalidate();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܿ */
    public final void mo16698() {
        removeCallbacks(this.f28173);
        this.f28146 = null;
        mo16686();
        C21831 c21831 = this.f28185;
        this.f28185 = null;
        this.f28165 = -1;
        ArrayList arrayList = this.f28175;
        ArrayList<C2795> arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        for (C2795 c2795 : arrayList2) {
            InterfaceC5421 interfaceC5421 = c2795.f4717;
            c2795.f4717 = null;
            if (c21831 != null) {
                c21831.m49246(c2795.f4725, c2795.f4716);
            }
            if (interfaceC5421 != null) {
                ((C17135) interfaceC5421).m38790();
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ */
    private void m23678() {
        if (this.f28185 == null || this.f28165 < 0) {
            return;
        }
        ArrayList arrayList = this.f28175;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2795 c2795 = (C2795) arrayList.get(size);
            if (Math.abs(c2795.f4725 - this.f28165) > 1) {
                arrayList.remove(size);
                C21831 c21831 = this.f28185;
                InterfaceC5421 interfaceC5421 = c2795.f4717;
                c2795.f4717 = null;
                if (c21831 != null) {
                    c21831.m49246(c2795.f4725, c2795.f4716);
                }
                if (interfaceC5421 != null) {
                    ((C17135) interfaceC5421).m38790();
                }
            }
        }
        m23679(this.f28165);
        m23679(this.f28165 - 1);
        m23679(this.f28165 + 1);
    }

    /* JADX INFO: renamed from: ۜ */
    private void m23679(int i) {
        C21831 c21831 = this.f28185;
        if (c21831 == null || i < 0 || i >= c21831.m49244() || m23681(i) != null) {
            return;
        }
        this.f28185.getClass();
        long j = this.f28184 + 1;
        this.f28184 = j;
        C2795 c2795 = new C2795(((long) i) + 1, i, j);
        c2795.f4720.m30773(getWidth(), getHeight());
        this.f28175.add(c2795);
        this.f28185.m49250(i, c2795.f4716);
    }

    /* JADX INFO: renamed from: ܳ */
    private C2795 m23681(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f28175;
            if (i2 >= arrayList.size()) {
                return null;
            }
            if (((C2795) arrayList.get(i2)).f4725 == i) {
                return (C2795) arrayList.get(i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C13525 m23702() {
        C2795 c2795M23681 = m23681(this.f28165);
        if (c2795M23681 == null) {
            return null;
        }
        return c2795M23681.f4720;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final float m23701() {
        return this.f28159;
    }

    /* JADX INFO: renamed from: ۜ */
    public final float m23691() {
        return this.f28171;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m23697(float f) {
        return 1.0f - (m23684(f) * 0.25f);
    }

    /* JADX INFO: renamed from: ᩳ */
    private float m23684(float f) {
        return Math.min(1.0f, f / Math.max(1.0f, getHeight() * 0.65f));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m23700(int i) {
        int i2;
        C21831 c21831 = this.f28185;
        return c21831 != null && (i2 = this.f28165 + i) >= 0 && i2 < c21831.m49244();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23694(float f) {
        float fM54625 = this.f28159 + f;
        int i = fM54625 < 0.0f ? 1 : -1;
        float width = getWidth() + this.f28160;
        while (Math.abs(fM54625) >= width && m23700(i)) {
            fM54625 += i * width;
            m23685(this.f28165 + i);
            InterfaceC5264 interfaceC5264 = this.f28178;
            if (interfaceC5264 != null) {
                interfaceC5264.mo11379(this.f28165);
            }
        }
        if (!m23700(i) && Math.signum(f) == Math.signum(fM54625)) {
            float f2 = this.f28159;
            fM54625 = ((fM54625 - f2) * C24867.m54625(Math.abs(f2), getWidth())) + f2;
        }
        this.f28159 = Math.max(-width, Math.min(width, fM54625));
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m23685(int i) {
        C21831 c21831;
        boolean z = this.f28165 != i;
        if (z) {
            this.f28146 = null;
            C13525 c13525M23702 = m23702();
            if (c13525M23702 != null) {
                c13525M23702.m30783();
            }
        }
        this.f28165 = i;
        this.f28159 = 0.0f;
        if (z && (c21831 = this.f28185) != null) {
            c21831.m49257(i);
        }
        m23678();
        m23677();
        return z;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m23693() {
        this.f28159 = 0.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m23683(float f) {
        this.f28171 = f;
        InterfaceC5264 interfaceC5264 = this.f28178;
        if (interfaceC5264 != null) {
            interfaceC5264.mo11378(m23684(f));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23688(float f) {
        m23683(Math.max(0.0f, Math.min(getHeight(), this.f28171 + f)));
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23695(float f, float f2) {
        super.performClick();
        if (m23686(this.f28165)) {
            if (this.f28180.m35226(f, f2, getWidth() / 2.0f, getHeight() / 2.0f)) {
                InterfaceC5264 interfaceC5264 = this.f28178;
                if (interfaceC5264 != null) {
                    interfaceC5264.mo11380(this.f28165);
                    return;
                }
                return;
            }
        }
        InterfaceC5264 interfaceC5265 = this.f28178;
        if (interfaceC5265 != null) {
            interfaceC5265.mo11377();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m23686(int i) {
        C21831 c21831 = this.f28185;
        return c21831 != null && i >= 0 && c21831.m49255(i);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f28189) {
            return false;
        }
        super.performClick();
        if (this.f28178 == null) {
            return true;
        }
        if (m23686(this.f28165)) {
            this.f28178.mo11380(this.f28165);
            return true;
        }
        this.f28178.mo11377();
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    private void m23677() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.MT_Protector));
        if (this.f28185 == null) {
            str = "";
        } else {
            str = " " + (this.f28165 + 1) + "/" + this.f28185.m49244();
        }
        sb.append(str);
        setContentDescription(sb.toString());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        mo16686();
        Iterator it = this.f28175.iterator();
        while (it.hasNext()) {
            ((C2795) it.next()).f4720.m30773(i, i2);
        }
        m23682();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo16686();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f28173);
        mo16686();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28165 < 0 || this.f28189) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f28146 = null;
        }
        C16149 c16149 = this.f28179;
        boolean zM36755 = c16149.m36755();
        c16149.m36753(motionEvent);
        if (zM36755 != c16149.m36755()) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList<C2795> arrayList;
        float f;
        float f2;
        RunnableC23634 runnableC23634 = this.f28173;
        removeCallbacks(runnableC23634);
        if (this.f28189) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float fM23684 = 1.0f - m23684(this.f28171);
        int iRound = Math.round(Color.alpha(this.f28161) * fM23684);
        int iSave = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawColor((iRound << 24) | (this.f28161 & 16777215));
        float f3 = this.f28171;
        boolean z = f3 > 0.0f;
        float fM23697 = z ? m23697(f3) : 1.0f;
        long jMin = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            arrayList = this.f28175;
            int size = arrayList.size();
            f = this.f28160;
            if (i >= size) {
                break;
            }
            C2795 c2795 = (C2795) arrayList.get(i);
            int i2 = c2795.f4725;
            C13525 c13525 = c2795.f4720;
            int i3 = this.f28165;
            boolean z2 = i2 == i3;
            float width = ((getWidth() + f) * (i2 - i3)) + this.f28159;
            boolean zIntersect = (!z || z2) && width < ((float) getWidth()) && ((float) getWidth()) + width > 0.0f;
            float width2 = getWidth();
            RunnableC23634 runnableC23635 = runnableC23634;
            float height = getHeight();
            int i4 = iSave;
            RectF rectF = this.f28177;
            float f4 = fM23684;
            rectF.set(0.0f, 0.0f, width2, height);
            if (zIntersect && !z) {
                zIntersect = rectF.intersect(width, 0.0f, getWidth() + width, getHeight());
            }
            if (c2795.f4717 != null && c13525.m30768()) {
                Matrix matrix = this.f28181;
                matrix.reset();
                if (z) {
                    matrix.setTranslate(0.0f, this.f28171);
                    matrix.preScale(fM23697, fM23697, getWidth() * 0.5f, getHeight() * 0.5f);
                }
                matrix.preTranslate(c13525.m30781() + width, c13525.m30754());
                matrix.preRotate(c13525.m30765());
                matrix.preScale(c13525.m30780(), c13525.m30780());
                matrix.preConcat(c2795.f4719);
                RectF rectF2 = this.f28164;
                rectF2.setEmpty();
                if (zIntersect) {
                    Matrix matrix2 = this.f28142;
                    if (matrix.invert(matrix2)) {
                        matrix2.mapRect(rectF2, rectF);
                    }
                }
                ((C17135) c2795.f4717).m38789(rectF2, c13525.m30780() * fM23697, z2);
                if (zIntersect) {
                    int iSave2 = canvas.save();
                    if (!z) {
                        canvas.clipRect(width, 0.0f, getWidth() + width, getHeight());
                    }
                    canvas.concat(matrix);
                    ((C17135) c2795.f4717).m38788(canvas, this.f28153);
                    canvas.restoreToCount(iSave2);
                }
            } else {
                if (zIntersect && !m23686(c2795.f4725)) {
                    int iSave3 = canvas.save();
                    if (z) {
                        f2 = 0.0f;
                        canvas.translate(0.0f, this.f28171);
                        canvas.scale(fM23697, fM23697, getWidth() * 0.5f, getHeight() * 0.5f);
                    } else {
                        f2 = 0.0f;
                    }
                    canvas.translate(width, f2);
                    if (!z) {
                        canvas.clipRect(0, 0, getWidth(), getHeight());
                    }
                    Paint paint = this.f28149;
                    paint.setColor(-3355444);
                    if (c2795.f4714) {
                        canvas.drawText(getResources().getString(c2795.f4718), getWidth() / 2.0f, getHeight() / 2.0f, paint);
                    } else {
                        long j = (jUptimeMillis - c2795.f4723) - 200;
                        if (j < 0) {
                            jMin = Math.min(jMin, -j);
                        } else {
                            float width3 = getWidth() / 2.0f;
                            float height2 = getHeight() / 2.0f;
                            int iRound2 = Math.round(Math.min(1.0f, j / 120.0f) * 255.0f * f4);
                            Paint paint2 = this.f28191;
                            paint2.setAlpha(iRound2);
                            float f5 = this.f28155;
                            canvas.drawArc(width3 - f5, height2 - f5, width3 + f5, height2 + f5, (((j % 900) * 360.0f) / 900.0f) - 90.0f, 240.0f, false, paint2);
                            jMin = 0;
                        }
                        canvas.restoreToCount(iSave3);
                    }
                    canvas.restoreToCount(iSave3);
                }
                i++;
                fM23697 = fM23697;
                runnableC23634 = runnableC23635;
                iSave = i4;
                fM23684 = f4;
                jUptimeMillis = jUptimeMillis;
            }
            jUptimeMillis = jUptimeMillis;
            i = i;
            fM23697 = fM23697;
            i++;
            fM23697 = fM23697;
            runnableC23634 = runnableC23635;
            iSave = i4;
            fM23684 = f4;
            jUptimeMillis = jUptimeMillis;
        }
        float f6 = fM23697;
        RunnableC23634 runnableC23636 = runnableC23634;
        int i5 = iSave;
        for (C2795 c2796 : arrayList) {
            if (!this.f28179.m36755()) {
                int i6 = c2796.f4725;
                if (m23686(i6) && (!z || i6 == this.f28165)) {
                    float width4 = ((getWidth() + f) * (i6 - this.f28165)) + this.f28159;
                    if (width4 < getWidth() && getWidth() + width4 > 0.0f) {
                        int iSave4 = canvas.save();
                        if (z) {
                            canvas.translate(0.0f, this.f28171);
                            canvas.scale(f6, f6, getWidth() / 2.0f, getHeight() / 2.0f);
                        }
                        canvas.clipRect(width4, 0.0f, getWidth() + width4, getHeight());
                        this.f28180.m35225(canvas, (getWidth() / 2.0f) + width4, getHeight() / 2.0f);
                        canvas.restoreToCount(iSave4);
                    }
                }
            }
        }
        canvas.restoreToCount(i5);
        if (jMin != C14849.FOREVER_NS && isAttachedToWindow() && getWindowVisibility() == 0 && isShown()) {
            if (jMin == 0) {
                postOnAnimation(runnableC23636);
            } else {
                postDelayed(runnableC23636, jMin);
            }
        }
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16697() {
        return this.f28182 != EnumC20231.NONE;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo16699() {
        return this.f28179.m36756();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final float mo23687(RectF rectF) {
        float fM30765;
        float fMax;
        float f;
        float f2;
        C2795 c2795 = this.f28147;
        if (c2795 == null) {
            return 0.0f;
        }
        EnumC20231 enumC20231 = this.f28182;
        if (enumC20231 == EnumC20231.ZOOM && this.f28187) {
            f = this.f28172;
            f2 = this.f28157;
            fMax = this.f28145;
            fM30765 = this.f28190;
        } else {
            if (enumC20231 != EnumC20231.FLING) {
                return 0.0f;
            }
            C13525 c13525 = c2795.f4720;
            float fM30780 = c13525.m30780();
            fM30765 = c13525.m30765();
            float fM30776 = c13525.m30776();
            float fM30782 = c13525.m30782();
            OverScroller overScroller = this.f28152;
            float fMax2 = Math.max(fM30776, Math.min(fM30782, overScroller.getFinalX()));
            fMax = Math.max(c13525.m30764(), Math.min(c13525.m30770(), overScroller.getFinalY()));
            f = fM30780;
            f2 = fMax2;
        }
        Matrix matrix = this.f28167;
        matrix.setTranslate(f2, fMax);
        matrix.preRotate(fM30765);
        matrix.preScale(f, f);
        matrix.preConcat(this.f28147.f4719);
        Matrix matrix2 = this.f28142;
        if (!matrix.invert(matrix2)) {
            return 0.0f;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        matrix2.mapRect(rectF);
        return f;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m23692() {
        this.f28182 = EnumC20231.NONE;
        this.f28147 = null;
        this.f28152.forceFinished(true);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m23699(int i) {
        if (!m23700(i)) {
            i = 0;
        }
        if (i != 0) {
            this.f28146 = null;
        }
        this.f28166 = this.f28165 + i;
        m23675(EnumC20231.PAGE, (getWidth() + this.f28160) * (-i), 0.0f, 280);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23696(boolean z) {
        m23675(z ? EnumC20231.DISMISS : EnumC20231.RESTORE, 0.0f, z ? getHeight() : 0.0f, 220);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23690(boolean z) {
        m23675(z ? EnumC20231.TO_SCALE : EnumC20231.RESTORE, 0.0f, 0.0f, z ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 220);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23698(float f, float f2) {
        C13525 c13525M23702 = m23702();
        if (c13525M23702 == null || !c13525M23702.m30768()) {
            return;
        }
        float fM30780 = c13525M23702.m30780();
        float fM30781 = c13525M23702.m30781();
        float fM30754 = c13525M23702.m30754();
        float fM30774 = c13525M23702.m30774();
        if (fM30774 != c13525M23702.m30778()) {
            c13525M23702.m30757(fM30774, f, f2, f, f2);
        } else {
            c13525M23702.m30775();
        }
        float fM30782 = c13525M23702.m30780();
        float fM30783 = c13525M23702.m30781();
        float fM30755 = c13525M23702.m30754();
        c13525M23702.m30760(fM30780, fM30781, fM30754, false);
        m23675(EnumC20231.ZOOM, 0.0f, 0.0f, 300);
        this.f28172 = fM30782;
        this.f28157 = fM30783;
        this.f28145 = fM30755;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23689(float f, float f2) {
        C13525 c13525M23702 = m23702();
        if (c13525M23702 == null || !c13525M23702.m30768()) {
            m23690(false);
            return;
        }
        if (c13525M23702.m30765() != c13525M23702.m30779()) {
            m23690(false);
            return;
        }
        float fM30780 = c13525M23702.m30780();
        float fM30781 = c13525M23702.m30781();
        float fM30754 = c13525M23702.m30754();
        c13525M23702.m30772();
        boolean z = Math.abs(fM30780 - c13525M23702.m30780()) > 1.0E-4f;
        float fM30782 = c13525M23702.m30781();
        float fM30755 = c13525M23702.m30754();
        c13525M23702.m30760(fM30780, fM30781, fM30754, false);
        if (z) {
            m23690(false);
            return;
        }
        m23692();
        float f3 = fM30781 - fM30782;
        this.f28163 = f3;
        this.f28176 = fM30754 - fM30755;
        float f4 = 0.0f;
        float f5 = (Math.abs(f3) > 0.1f || c13525M23702.m30776() == c13525M23702.m30782()) ? 0.0f : f;
        if (Math.abs(this.f28176) <= 0.1f && c13525M23702.m30764() != c13525M23702.m30770()) {
            f4 = f2;
        }
        this.f28182 = EnumC20231.FLING;
        this.f28169 = SystemClock.uptimeMillis();
        this.f28156.m47213(Math.round(fM30782), f5, this.f28169);
        this.f28144.m47213(Math.round(fM30755), f4, this.f28169);
        this.f28147 = m23681(this.f28165);
        this.f28179.m36758();
        this.f28152.fling(Math.round(fM30782), Math.round(fM30755), Math.round(f5), Math.round(f4), Math.round(c13525M23702.m30776()), Math.round(c13525M23702.m30782()), Math.round(c13525M23702.m30764()), Math.round(c13525M23702.m30770()), m23674(f5, getWidth()), m23674(f4, getHeight()));
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m23674(float f, int i) {
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(Math.min(getResources().getDisplayMetrics().density * 24.0f, i * 0.04f));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23675(EnumC20231 enumC20231, float f, float f2, int i) {
        m23692();
        this.f28182 = enumC20231;
        C2795 c2795M23681 = m23681(this.f28165);
        this.f28147 = c2795M23681;
        this.f28187 = c2795M23681 != null && c2795M23681.f4720.m30768();
        this.f28169 = SystemClock.uptimeMillis();
        this.f28150 = i;
        this.f28186 = this.f28159;
        this.f28154 = f;
        this.f28174 = this.f28171;
        this.f28162 = f2;
        if (this.f28187) {
            C13525 c13525 = this.f28147.f4720;
            this.f28183 = c13525.m30780();
            this.f28151 = c13525.m30781();
            this.f28148 = c13525.m30754();
            float fM30765 = c13525.m30765();
            this.f28188 = fM30765;
            float fM30779 = (enumC20231 == EnumC20231.TO_SCALE || enumC20231 == EnumC20231.ZOOM) ? fM30765 : c13525.m30779();
            this.f28190 = fM30779;
            c13525.m30758(this.f28183, fM30779, getWidth() * 0.5f, getHeight() * 0.5f, getWidth() * 0.5f, getHeight() * 0.5f, true);
            this.f28172 = c13525.m30780();
            this.f28157 = c13525.m30781();
            this.f28145 = c13525.m30754();
            float f3 = this.f28188;
            if (f3 != this.f28190) {
                double radians = Math.toRadians(f3);
                double radians2 = Math.toRadians(this.f28190);
                this.f28143 = this.f28151 + m23673(c13525, this.f28183, radians);
                this.f28158 = this.f28148 + m23680(c13525, this.f28183, radians);
                this.f28170 = this.f28157 + m23673(c13525, this.f28172, radians2);
                this.f28168 = this.f28145 + m23680(c13525, this.f28172, radians2);
            }
            c13525.m30759(this.f28183, this.f28188, this.f28151, this.f28148, false);
        }
        this.f28179.m36758();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f;
        float f2;
        InterfaceC5264 interfaceC5264;
        C2795 c2795;
        EnumC20231 enumC20231 = this.f28182;
        EnumC20231 enumC20232 = EnumC20231.NONE;
        if (enumC20231 == enumC20232) {
            return;
        }
        if (this.f28147 != m23681(this.f28165)) {
            mo16686();
            return;
        }
        EnumC20231 enumC20233 = this.f28182;
        EnumC20231 enumC20234 = EnumC20231.FLING;
        C16149 c16149 = this.f28179;
        if (enumC20233 == enumC20234) {
            OverScroller overScroller = this.f28152;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            float fMax = (this.f28163 == 0.0f && this.f28176 == 0.0f) ? 0.0f : Math.max(0.0f, 1.0f - ((SystemClock.uptimeMillis() - this.f28169) / 220.0f));
            C2795 c2796 = this.f28147;
            if (c2796 != null) {
                C13525 c13525 = c2796.f4720;
                long jUptimeMillis = SystemClock.uptimeMillis();
                float f3 = getResources().getDisplayMetrics().density;
                float f4 = fMax * fMax * fMax;
                c13525.m30760(c13525.m30780(), (this.f28163 * f4) + this.f28156.m47212(overScroller.getCurrX(), overScroller.getFinalX(), c13525.m30776(), c13525.m30782(), f3, jUptimeMillis), (this.f28176 * f4) + this.f28144.m47212(overScroller.getCurrY(), overScroller.getFinalY(), c13525.m30764(), c13525.m30770(), f3, jUptimeMillis), !zComputeScrollOffset && fMax == 0.0f);
            }
            if (zComputeScrollOffset || fMax > 0.0f) {
                postInvalidateOnAnimation();
                return;
            }
            this.f28182 = enumC20232;
            this.f28147 = null;
            c16149.m36754(false);
            return;
        }
        float fMin = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f28169) / this.f28150);
        float f5 = 1.0f - fMin;
        EnumC20231 enumC20235 = this.f28182;
        if (enumC20235 == EnumC20231.ZOOM) {
            f = (3.0f - (2.0f * fMin)) * fMin * fMin;
        } else {
            f = enumC20235 == EnumC20231.PAGE ? 1.0f - (f5 * f5) : 1.0f - ((f5 * f5) * f5);
        }
        this.f28159 = m23672(this.f28186, this.f28154, f);
        m23683(m23672(this.f28174, this.f28162, f));
        if (this.f28187 && (c2795 = this.f28147) != null && c2795.f4720.m30768()) {
            C13525 c13526 = this.f28147.f4720;
            float fM23672 = m23672(this.f28183, this.f28172, f);
            float f6 = this.f28188;
            float f7 = this.f28190;
            if (f6 != f7) {
                float fM23673 = m23672(f6, f7, f);
                double radians = Math.toRadians(fM23673);
                f2 = 1.0f;
                c13526.m30759(fM23672, fM23673, m23672(this.f28143, this.f28170, f) - m23673(c13526, fM23672, radians), m23672(this.f28158, this.f28168, f) - m23680(c13526, fM23672, radians), false);
            } else {
                f2 = 1.0f;
                c13526.m30760(fM23672, m23672(this.f28151, this.f28157, f), m23672(this.f28148, this.f28145, f), false);
            }
        } else {
            f2 = 1.0f;
        }
        invalidate();
        if (fMin < f2) {
            postInvalidateOnAnimation();
            return;
        }
        EnumC20231 enumC20236 = this.f28182;
        this.f28182 = enumC20232;
        this.f28147 = null;
        if (enumC20236 == EnumC20231.PAGE) {
            boolean zM23685 = m23685(this.f28166);
            c16149.m36754(false);
            if (!zM23685 || (interfaceC5264 = this.f28178) == null) {
                return;
            }
            interfaceC5264.mo11379(this.f28165);
            return;
        }
        c16149.m36754(enumC20236 == EnumC20231.TO_SCALE);
        if (enumC20236 == EnumC20231.DISMISS) {
            this.f28189 = true;
            InterfaceC5264 interfaceC5265 = this.f28178;
            if (interfaceC5265 != null) {
                interfaceC5265.onDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m23672(float f, float f2, float f3) {
        return C21740.m49018(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m23673(C13525 c13525, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c13525.m30767())) - (Math.sin(d) * ((double) c13525.m30785()))) * ((double) f) * 0.5d);
    }

    /* JADX INFO: renamed from: ۧ */
    public static float m23680(C13525 c13525, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c13525.m30785())) + (Math.sin(d) * ((double) c13525.m30767()))) * ((double) f) * 0.5d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(m23700(1) || m23700(-1));
        if (m23686(this.f28165)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (m23700(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (m23700(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2 = 0;
        if (this.f28189) {
            return false;
        }
        if (i == 4096) {
            i2 = 1;
        } else if (i == 8192) {
            i2 = -1;
        }
        if (i2 != 0 && m23700(i2)) {
            mo16686();
            m23699(i2);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        if (i == 22) {
            i2 = 1;
        } else {
            i2 = i == 21 ? -1 : 0;
        }
        if (i2 != 0 && m23700(i2)) {
            mo16686();
            m23699(i2);
            return true;
        }
        if (i == 81 || i == 70 || i == 69) {
            mo16686();
            m23698(getWidth() / 2.0f, getHeight() / 2.0f);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
