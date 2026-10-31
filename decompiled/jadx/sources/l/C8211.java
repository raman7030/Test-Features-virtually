package l;

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
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8211 extends AbstractC12924 {

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25231 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final Matrix f25232;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public float f25233;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C19501 f25234;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public float f25235;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C5389 f25236;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0449 f25237;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public float f25238;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final Paint f25239;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25240;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public float f25241;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final OverScroller f25242;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Paint f25243;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public float f25244;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final float f25245;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19501 f25246;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public float f25247;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f25248;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f25249;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final float f25250;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f25251;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public float f25252;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f25253;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final RectF f25254;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f25255;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f25256;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Matrix f25257;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public float f25258;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f25259;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public float f25260;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f25261;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public float f25262;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC22375 f25263;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f25264;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f25265;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f25266;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final RectF f25267;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3047 f25268;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C14500 f25269;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C13794 f25270;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Matrix f25271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC18795 f25272;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public float f25273;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f25274;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20478 f25275;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public float f25276;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25277;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public float f25278;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25279;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public float f25280;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Paint f25281;

    public C8211(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25270 = new C13794(getResources().getDisplayMetrics().density);
        this.f25265 = new ArrayList(3);
        this.f25243 = new Paint(3);
        Paint paint = new Paint(1);
        this.f25239 = paint;
        Paint paint2 = new Paint(1);
        this.f25281 = paint2;
        this.f25263 = new RunnableC22375(3, this);
        this.f25271 = new Matrix();
        this.f25232 = new Matrix();
        this.f25257 = new Matrix();
        this.f25267 = new RectF();
        this.f25254 = new RectF();
        this.f25246 = new C19501();
        this.f25234 = new C19501();
        this.f25255 = -1;
        this.f25251 = -16777216;
        this.f25272 = EnumC18795.NONE;
        this.f25250 = getResources().getDisplayMetrics().density * 16.0f;
        this.f25242 = new OverScroller(context);
        this.f25269 = new C14500(this);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = getResources().getDisplayMetrics().density;
        this.f25245 = 14.5f * f;
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

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫ */
    public final void mo14781(C20478 c20478, int i) {
        if (c20478.m46921() < 0 || (c20478.m46921() > 0 && (i < 0 || i >= c20478.m46921()))) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo14790();
        this.f25279 = false;
        this.f25249 = 0.0f;
        m21714(0.0f);
        this.f25275 = c20478;
        if (c20478.m46921() == 0) {
            i = -1;
        }
        this.f25255 = i;
        if (i >= 0) {
            c20478.m46934(i);
        }
        m21709();
        m21708();
        invalidate();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫ */
    public final void mo14780(InterfaceC3047 interfaceC3047) {
        this.f25268 = interfaceC3047;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ۧ */
    public final int mo14785() {
        return this.f25255;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܳ */
    public final Bundle mo14787() {
        C0449 c0449M21712 = m21712(this.f25255);
        if (c0449M21712 == null) {
            return null;
        }
        C11739 c11739 = c0449M21712.f1944;
        if (!m21707(c0449M21712, c0449M21712.f1940)) {
            return null;
        }
        C5389 c5389 = this.f25236;
        if (c5389 != null && c5389.f16742 == c0449M21712 && c5389.f16743 == c0449M21712.f1940) {
            C1155 c1155 = c5389.f16744;
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putInt("width", c1155.f4175);
            bundle.putInt("height", c1155.f4173);
            bundle.putInt("orientation", c1155.f4174);
            C6094 c6094 = c1155.f4172;
            bundle.putDouble("relativeScale", c6094.f18676);
            bundle.putDouble("centerX", c6094.f18672);
            bundle.putDouble("centerY", c6094.f18673);
            bundle.putFloat("rotation", c6094.f18674);
            return bundle;
        }
        if (c0449M21712.f1941 == null || !c11739.m28720()) {
            return null;
        }
        int i = c0449M21712.f1948;
        int i2 = c0449M21712.f1939;
        int i3 = ((C15537) c0449M21712.f1941).f47871.f46663;
        C6094 c6094M28736 = c11739.m28736();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 1);
        bundle2.putInt("width", i);
        bundle2.putInt("height", i2);
        bundle2.putInt("orientation", i3);
        bundle2.putDouble("relativeScale", c6094M28736.f18676);
        bundle2.putDouble("centerX", c6094M28736.f18672);
        bundle2.putDouble("centerY", c6094M28736.f18673);
        bundle2.putFloat("rotation", c6094M28736.f18674);
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14784(Bundle bundle) {
        C1155 c1155 = null;
        this.f25236 = null;
        C0449 c0449M21712 = m21712(this.f25255);
        if (bundle != null) {
            try {
                if (bundle.getInt("version") == 1) {
                    int i = bundle.getInt("width");
                    int i2 = bundle.getInt("height");
                    int i3 = bundle.getInt("orientation");
                    if (i <= 0 || i2 <= 0 || i3 < 1 || i3 > 8) {
                        c1155 = null;
                    } else {
                        C6094 c6094 = new C6094(C19893.m45756(i, i2, i3), C19893.m45754(i, i2, i3), bundle.getDouble("relativeScale", Double.NaN), bundle.getDouble("centerX", Double.NaN), bundle.getDouble("centerY", Double.NaN), bundle.getFloat("rotation", Float.NaN));
                        if (c6094.m17004()) {
                            c1155 = new C1155(i, i2, i3, c6094);
                        } else {
                            c1155 = null;
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        if (c0449M21712 == null || !m21707(c0449M21712, c0449M21712.f1940) || c1155 == null) {
            return false;
        }
        if (c0449M21712.f1941 != null && !c1155.m3950(c0449M21712)) {
            return false;
        }
        this.f25236 = new C5389(c0449M21712, c1155);
        m21713();
        return true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m21713() {
        C5389 c5389 = this.f25236;
        if (c5389 == null) {
            return;
        }
        C1155 c1155 = c5389.f16744;
        C0449 c0449M21712 = m21712(this.f25255);
        if (c0449M21712 != null) {
            C11739 c11739 = c0449M21712.f1944;
            if (c5389.f16742 == c0449M21712) {
                long j = c5389.f16743;
                if (j == c0449M21712.f1940 && m21707(c0449M21712, j)) {
                    if (c0449M21712.f1941 == null) {
                        return;
                    }
                    if (!c1155.m3950(c0449M21712)) {
                        this.f25236 = null;
                        return;
                    } else {
                        if (c11739.m28720()) {
                            this.f25236 = null;
                            mo14778();
                            c11739.m28714(c1155.f4172);
                            invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.f25236 = null;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܽ */
    public final void mo14788(int i) {
        this.f25251 = i;
        invalidate();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14783(int i, long j, InterfaceC3212 interfaceC3212) {
        if (interfaceC3212 == null) {
            throw new IllegalArgumentException("Missing gallery renderer");
        }
        C15537 c15537 = (C15537) interfaceC3212;
        C15205 c15205 = c15537.f47871;
        int i2 = c15205.f46658;
        int i3 = c15205.f46659;
        int i4 = c15205.f46663;
        if (i2 <= 0 || i3 <= 0 || i4 < 1 || i4 > 8) {
            c15537.m36629();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C0449 c0449M21712 = m21712(i);
        if (!m21707(c0449M21712, j)) {
            c15537.m36629();
            return false;
        }
        int iM45756 = C19893.m45756(i2, i3, i4);
        int iM45754 = C19893.m45754(i2, i3, i4);
        C11739 c11739 = c0449M21712.f1944;
        float[] fArr = c0449M21712.f1946;
        if (c11739.m28719() != iM45756 || c11739.m28737() != iM45754) {
            if (i == this.f25255 && c11739.m28720()) {
                mo14778();
            } else if (i == this.f25255) {
                this.f25269.m34616();
            }
            c11739.m28713(iM45756, iM45754);
        }
        InterfaceC3212 interfaceC3213 = c0449M21712.f1941;
        c0449M21712.f1941 = interfaceC3212;
        c0449M21712.f1938 = false;
        removeCallbacks(this.f25263);
        c0449M21712.f1948 = i2;
        c0449M21712.f1939 = i3;
        C19893.m45751(i2, i3, i4, fArr);
        c0449M21712.f1943.setValues(fArr);
        if (interfaceC3213 != null && interfaceC3213 != interfaceC3212) {
            ((C15537) interfaceC3213).m36629();
        }
        m21713();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m21707(C0449 c0449, long j) {
        C20478 c20478;
        if (c0449 == null) {
            return false;
        }
        int i = c0449.f1949;
        if (c0449.f1940 != j || (c20478 = this.f25275) == null || i >= c20478.m46921()) {
            return false;
        }
        this.f25275.getClass();
        return ((long) i) + 1 == c0449.f1945;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo14786(int i) {
        C0449 c0449M21712 = m21712(i);
        if (c0449M21712 == null || !m21707(c0449M21712, c0449M21712.f1940)) {
            return false;
        }
        C5389 c5389 = this.f25236;
        if (c5389 != null && c5389.f16742 == c0449M21712) {
            this.f25236 = null;
        }
        long j = c0449M21712.f1940;
        InterfaceC3212 interfaceC3212 = c0449M21712.f1941;
        long j2 = this.f25274 + 1;
        this.f25274 = j2;
        c0449M21712.f1940 = j2;
        c0449M21712.f1941 = null;
        c0449M21712.f1938 = false;
        c0449M21712.f1947 = SystemClock.uptimeMillis();
        this.f25275.m46923(i, j);
        if (interfaceC3212 != null) {
            ((C15537) interfaceC3212).m36629();
        }
        this.f25275.m46927(i, c0449M21712.f1940);
        invalidate();
        return true;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫ */
    public final void mo14779(int i, int i2, long j) {
        C0449 c0449M21712 = m21712(i);
        if (c0449M21712 == null || c0449M21712.f1940 != j) {
            return;
        }
        c0449M21712.f1938 = true;
        c0449M21712.f1942 = i2;
        removeCallbacks(this.f25263);
        invalidate();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫ */
    public final void mo14778() {
        m21723();
        this.f25269.m34611();
        if (!this.f25279) {
            this.f25249 = 0.0f;
            m21714(0.0f);
            C11739 c11739M21733 = m21733();
            if (c11739M21733 != null) {
                c11739M21733.m28708();
            }
        }
        invalidate();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܿ */
    public final void mo14790() {
        removeCallbacks(this.f25263);
        this.f25236 = null;
        mo14778();
        C20478 c20478 = this.f25275;
        this.f25275 = null;
        this.f25255 = -1;
        ArrayList arrayList = this.f25265;
        ArrayList<C0449> arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        for (C0449 c0449 : arrayList2) {
            InterfaceC3212 interfaceC3212 = c0449.f1941;
            c0449.f1941 = null;
            if (c20478 != null) {
                c20478.m46923(c0449.f1949, c0449.f1940);
            }
            if (interfaceC3212 != null) {
                ((C15537) interfaceC3212).m36629();
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m21709() {
        if (this.f25275 == null || this.f25255 < 0) {
            return;
        }
        ArrayList arrayList = this.f25265;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0449 c0449 = (C0449) arrayList.get(size);
            if (Math.abs(c0449.f1949 - this.f25255) > 1) {
                arrayList.remove(size);
                C20478 c20478 = this.f25275;
                InterfaceC3212 interfaceC3212 = c0449.f1941;
                c0449.f1941 = null;
                if (c20478 != null) {
                    c20478.m46923(c0449.f1949, c0449.f1940);
                }
                if (interfaceC3212 != null) {
                    ((C15537) interfaceC3212).m36629();
                }
            }
        }
        m21710(this.f25255);
        m21710(this.f25255 - 1);
        m21710(this.f25255 + 1);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m21710(int i) {
        C20478 c20478 = this.f25275;
        if (c20478 == null || i < 0 || i >= c20478.m46921() || m21712(i) != null) {
            return;
        }
        this.f25275.getClass();
        long j = this.f25274 + 1;
        this.f25274 = j;
        C0449 c0449 = new C0449(((long) i) + 1, i, j);
        c0449.f1944.m28725(getWidth(), getHeight());
        this.f25265.add(c0449);
        this.f25275.m46927(i, c0449.f1940);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C0449 m21712(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f25265;
            if (i2 >= arrayList.size()) {
                return null;
            }
            if (((C0449) arrayList.get(i2)).f1949 == i) {
                return (C0449) arrayList.get(i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11739 m21733() {
        C0449 c0449M21712 = m21712(this.f25255);
        if (c0449M21712 == null) {
            return null;
        }
        return c0449M21712.f1944;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m21732() {
        return this.f25249;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m21722() {
        return this.f25261;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m21728(float f) {
        return 1.0f - (m21715(f) * 0.25f);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private float m21715(float f) {
        return Math.min(1.0f, f / Math.max(1.0f, getHeight() * 0.65f));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21731(int i) {
        int i2;
        C20478 c20478 = this.f25275;
        return c20478 != null && (i2 = this.f25255 + i) >= 0 && i2 < c20478.m46921();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21725(float f) {
        float fM52222 = this.f25249 + f;
        int i = fM52222 < 0.0f ? 1 : -1;
        float width = getWidth() + this.f25250;
        while (Math.abs(fM52222) >= width && m21731(i)) {
            fM52222 += i * width;
            m21716(this.f25255 + i);
            InterfaceC3047 interfaceC3047 = this.f25268;
            if (interfaceC3047 != null) {
                interfaceC3047.mo9337(this.f25255);
            }
        }
        if (!m21731(i) && Math.signum(f) == Math.signum(fM52222)) {
            float f2 = this.f25249;
            fM52222 = ((fM52222 - f2) * C23673.m52222(Math.abs(f2), getWidth())) + f2;
        }
        this.f25249 = Math.max(-width, Math.min(width, fM52222));
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m21716(int i) {
        C20478 c20478;
        boolean z = this.f25255 != i;
        if (z) {
            this.f25236 = null;
            C11739 c11739M21733 = m21733();
            if (c11739M21733 != null) {
                c11739M21733.m28735();
            }
        }
        this.f25255 = i;
        this.f25249 = 0.0f;
        if (z && (c20478 = this.f25275) != null) {
            c20478.m46934(i);
        }
        m21709();
        m21708();
        return z;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m21724() {
        this.f25249 = 0.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m21714(float f) {
        this.f25261 = f;
        InterfaceC3047 interfaceC3047 = this.f25268;
        if (interfaceC3047 != null) {
            interfaceC3047.mo9336(m21715(f));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21719(float f) {
        m21714(Math.max(0.0f, Math.min(getHeight(), this.f25261 + f)));
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21726(float f, float f2) {
        super.performClick();
        if (m21717(this.f25255)) {
            if (this.f25270.m33110(f, f2, getWidth() / 2.0f, getHeight() / 2.0f)) {
                InterfaceC3047 interfaceC3047 = this.f25268;
                if (interfaceC3047 != null) {
                    interfaceC3047.mo9338(this.f25255);
                    return;
                }
                return;
            }
        }
        InterfaceC3047 interfaceC3048 = this.f25268;
        if (interfaceC3048 != null) {
            interfaceC3048.mo9335();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m21717(int i) {
        C20478 c20478 = this.f25275;
        return c20478 != null && i >= 0 && c20478.m46932(i);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f25279) {
            return false;
        }
        super.performClick();
        if (this.f25268 == null) {
            return true;
        }
        if (m21717(this.f25255)) {
            this.f25268.mo9338(this.f25255);
            return true;
        }
        this.f25268.mo9335();
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m21708() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.MT_Protector));
        if (this.f25275 == null) {
            str = "";
        } else {
            str = " " + (this.f25255 + 1) + "/" + this.f25275.m46921();
        }
        sb.append(str);
        setContentDescription(sb.toString());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        mo14778();
        Iterator it = this.f25265.iterator();
        while (it.hasNext()) {
            ((C0449) it.next()).f1944.m28725(i, i2);
        }
        m21713();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo14778();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f25263);
        mo14778();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25255 < 0 || this.f25279) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f25236 = null;
        }
        C14500 c14500 = this.f25269;
        boolean zM34614 = c14500.m34614();
        c14500.m34612(motionEvent);
        if (zM34614 != c14500.m34614()) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList<C0449> arrayList;
        float f;
        float f2;
        RunnableC22375 runnableC22375 = this.f25263;
        removeCallbacks(runnableC22375);
        if (this.f25279) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float fM21715 = 1.0f - m21715(this.f25261);
        int iRound = Math.round(Color.alpha(this.f25251) * fM21715);
        int iSave = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawColor((iRound << 24) | (this.f25251 & 16777215));
        float f3 = this.f25261;
        boolean z = f3 > 0.0f;
        float fM21728 = z ? m21728(f3) : 1.0f;
        long jMin = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            arrayList = this.f25265;
            int size = arrayList.size();
            f = this.f25250;
            if (i >= size) {
                break;
            }
            C0449 c0449 = (C0449) arrayList.get(i);
            int i2 = c0449.f1949;
            C11739 c11739 = c0449.f1944;
            int i3 = this.f25255;
            boolean z2 = i2 == i3;
            float width = ((getWidth() + f) * (i2 - i3)) + this.f25249;
            boolean zIntersect = (!z || z2) && width < ((float) getWidth()) && ((float) getWidth()) + width > 0.0f;
            float width2 = getWidth();
            RunnableC22375 runnableC22376 = runnableC22375;
            float height = getHeight();
            int i4 = iSave;
            RectF rectF = this.f25267;
            float f4 = fM21715;
            rectF.set(0.0f, 0.0f, width2, height);
            if (zIntersect && !z) {
                zIntersect = rectF.intersect(width, 0.0f, getWidth() + width, getHeight());
            }
            if (c0449.f1941 != null && c11739.m28720()) {
                Matrix matrix = this.f25271;
                matrix.reset();
                if (z) {
                    matrix.setTranslate(0.0f, this.f25261);
                    matrix.preScale(fM21728, fM21728, getWidth() * 0.5f, getHeight() * 0.5f);
                }
                matrix.preTranslate(c11739.m28733() + width, c11739.m28706());
                matrix.preRotate(c11739.m28717());
                matrix.preScale(c11739.m28732(), c11739.m28732());
                matrix.preConcat(c0449.f1943);
                RectF rectF2 = this.f25254;
                rectF2.setEmpty();
                if (zIntersect) {
                    Matrix matrix2 = this.f25232;
                    if (matrix.invert(matrix2)) {
                        matrix2.mapRect(rectF2, rectF);
                    }
                }
                ((C15537) c0449.f1941).m36628(rectF2, c11739.m28732() * fM21728, z2);
                if (zIntersect) {
                    int iSave2 = canvas.save();
                    if (!z) {
                        canvas.clipRect(width, 0.0f, getWidth() + width, getHeight());
                    }
                    canvas.concat(matrix);
                    ((C15537) c0449.f1941).m36627(canvas, this.f25243);
                    canvas.restoreToCount(iSave2);
                }
            } else {
                if (zIntersect && !m21717(c0449.f1949)) {
                    int iSave3 = canvas.save();
                    if (z) {
                        f2 = 0.0f;
                        canvas.translate(0.0f, this.f25261);
                        canvas.scale(fM21728, fM21728, getWidth() * 0.5f, getHeight() * 0.5f);
                    } else {
                        f2 = 0.0f;
                    }
                    canvas.translate(width, f2);
                    if (!z) {
                        canvas.clipRect(0, 0, getWidth(), getHeight());
                    }
                    Paint paint = this.f25239;
                    paint.setColor(-3355444);
                    if (c0449.f1938) {
                        canvas.drawText(getResources().getString(c0449.f1942), getWidth() / 2.0f, getHeight() / 2.0f, paint);
                    } else {
                        long j = (jUptimeMillis - c0449.f1947) - 200;
                        if (j < 0) {
                            jMin = Math.min(jMin, -j);
                        } else {
                            float width3 = getWidth() / 2.0f;
                            float height2 = getHeight() / 2.0f;
                            int iRound2 = Math.round(Math.min(1.0f, j / 120.0f) * 255.0f * f4);
                            Paint paint2 = this.f25281;
                            paint2.setAlpha(iRound2);
                            float f5 = this.f25245;
                            canvas.drawArc(width3 - f5, height2 - f5, width3 + f5, height2 + f5, (((j % 900) * 360.0f) / 900.0f) - 90.0f, 240.0f, false, paint2);
                            jMin = 0;
                        }
                        canvas.restoreToCount(iSave3);
                    }
                    canvas.restoreToCount(iSave3);
                }
                i++;
                fM21728 = fM21728;
                runnableC22375 = runnableC22376;
                iSave = i4;
                fM21715 = f4;
                jUptimeMillis = jUptimeMillis;
            }
            jUptimeMillis = jUptimeMillis;
            i = i;
            fM21728 = fM21728;
            i++;
            fM21728 = fM21728;
            runnableC22375 = runnableC22376;
            iSave = i4;
            fM21715 = f4;
            jUptimeMillis = jUptimeMillis;
        }
        float f6 = fM21728;
        RunnableC22375 runnableC22377 = runnableC22375;
        int i5 = iSave;
        for (C0449 c04410 : arrayList) {
            if (!this.f25269.m34614()) {
                int i6 = c04410.f1949;
                if (m21717(i6) && (!z || i6 == this.f25255)) {
                    float width4 = ((getWidth() + f) * (i6 - this.f25255)) + this.f25249;
                    if (width4 < getWidth() && getWidth() + width4 > 0.0f) {
                        int iSave4 = canvas.save();
                        if (z) {
                            canvas.translate(0.0f, this.f25261);
                            canvas.scale(f6, f6, getWidth() / 2.0f, getHeight() / 2.0f);
                        }
                        canvas.clipRect(width4, 0.0f, getWidth() + width4, getHeight());
                        this.f25270.m33109(canvas, (getWidth() / 2.0f) + width4, getHeight() / 2.0f);
                        canvas.restoreToCount(iSave4);
                    }
                }
            }
        }
        canvas.restoreToCount(i5);
        if (jMin != C13132.FOREVER_NS && isAttachedToWindow() && getWindowVisibility() == 0 && isShown()) {
            if (jMin == 0) {
                postOnAnimation(runnableC22377);
            } else {
                postDelayed(runnableC22377, jMin);
            }
        }
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14789() {
        return this.f25272 != EnumC18795.NONE;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo14791() {
        return this.f25269.m34615();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo21718(RectF rectF) {
        float fM28717;
        float fMax;
        float f;
        float f2;
        C0449 c0449 = this.f25237;
        if (c0449 == null) {
            return 0.0f;
        }
        EnumC18795 enumC18795 = this.f25272;
        if (enumC18795 == EnumC18795.ZOOM && this.f25277) {
            f = this.f25262;
            f2 = this.f25247;
            fMax = this.f25235;
            fM28717 = this.f25280;
        } else {
            if (enumC18795 != EnumC18795.FLING) {
                return 0.0f;
            }
            C11739 c11739 = c0449.f1944;
            float fM28732 = c11739.m28732();
            fM28717 = c11739.m28717();
            float fM28728 = c11739.m28728();
            float fM28734 = c11739.m28734();
            OverScroller overScroller = this.f25242;
            float fMax2 = Math.max(fM28728, Math.min(fM28734, overScroller.getFinalX()));
            fMax = Math.max(c11739.m28716(), Math.min(c11739.m28722(), overScroller.getFinalY()));
            f = fM28732;
            f2 = fMax2;
        }
        Matrix matrix = this.f25257;
        matrix.setTranslate(f2, fMax);
        matrix.preRotate(fM28717);
        matrix.preScale(f, f);
        matrix.preConcat(this.f25237.f1943);
        Matrix matrix2 = this.f25232;
        if (!matrix.invert(matrix2)) {
            return 0.0f;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        matrix2.mapRect(rectF);
        return f;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m21723() {
        this.f25272 = EnumC18795.NONE;
        this.f25237 = null;
        this.f25242.forceFinished(true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21730(int i) {
        if (!m21731(i)) {
            i = 0;
        }
        if (i != 0) {
            this.f25236 = null;
        }
        this.f25256 = this.f25255 + i;
        m21706(EnumC18795.PAGE, (getWidth() + this.f25250) * (-i), 0.0f, 280);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21727(boolean z) {
        m21706(z ? EnumC18795.DISMISS : EnumC18795.RESTORE, 0.0f, z ? getHeight() : 0.0f, 220);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21721(boolean z) {
        m21706(z ? EnumC18795.TO_SCALE : EnumC18795.RESTORE, 0.0f, 0.0f, z ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 220);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21729(float f, float f2) {
        C11739 c11739M21733 = m21733();
        if (c11739M21733 == null || !c11739M21733.m28720()) {
            return;
        }
        float fM28732 = c11739M21733.m28732();
        float fM28733 = c11739M21733.m28733();
        float fM28706 = c11739M21733.m28706();
        float fM28726 = c11739M21733.m28726();
        if (fM28726 != c11739M21733.m28730()) {
            c11739M21733.m28709(fM28726, f, f2, f, f2);
        } else {
            c11739M21733.m28727();
        }
        float fM28734 = c11739M21733.m28732();
        float fM28735 = c11739M21733.m28733();
        float fM28707 = c11739M21733.m28706();
        c11739M21733.m28712(fM28732, fM28733, fM28706, false);
        m21706(EnumC18795.ZOOM, 0.0f, 0.0f, 300);
        this.f25262 = fM28734;
        this.f25247 = fM28735;
        this.f25235 = fM28707;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21720(float f, float f2) {
        C11739 c11739M21733 = m21733();
        if (c11739M21733 == null || !c11739M21733.m28720()) {
            m21721(false);
            return;
        }
        if (c11739M21733.m28717() != c11739M21733.m28731()) {
            m21721(false);
            return;
        }
        float fM28732 = c11739M21733.m28732();
        float fM28733 = c11739M21733.m28733();
        float fM28706 = c11739M21733.m28706();
        c11739M21733.m28724();
        boolean z = Math.abs(fM28732 - c11739M21733.m28732()) > 1.0E-4f;
        float fM28734 = c11739M21733.m28733();
        float fM28707 = c11739M21733.m28706();
        c11739M21733.m28712(fM28732, fM28733, fM28706, false);
        if (z) {
            m21721(false);
            return;
        }
        m21723();
        float f3 = fM28733 - fM28734;
        this.f25253 = f3;
        this.f25266 = fM28706 - fM28707;
        float f4 = 0.0f;
        float f5 = (Math.abs(f3) > 0.1f || c11739M21733.m28728() == c11739M21733.m28734()) ? 0.0f : f;
        if (Math.abs(this.f25266) <= 0.1f && c11739M21733.m28716() != c11739M21733.m28722()) {
            f4 = f2;
        }
        this.f25272 = EnumC18795.FLING;
        this.f25259 = SystemClock.uptimeMillis();
        this.f25246.m44915(Math.round(fM28734), f5, this.f25259);
        this.f25234.m44915(Math.round(fM28707), f4, this.f25259);
        this.f25237 = m21712(this.f25255);
        this.f25269.m34617();
        this.f25242.fling(Math.round(fM28734), Math.round(fM28707), Math.round(f5), Math.round(f4), Math.round(c11739M21733.m28728()), Math.round(c11739M21733.m28734()), Math.round(c11739M21733.m28716()), Math.round(c11739M21733.m28722()), m21705(f5, getWidth()), m21705(f4, getHeight()));
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m21705(float f, int i) {
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(Math.min(getResources().getDisplayMetrics().density * 24.0f, i * 0.04f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21706(EnumC18795 enumC18795, float f, float f2, int i) {
        m21723();
        this.f25272 = enumC18795;
        C0449 c0449M21712 = m21712(this.f25255);
        this.f25237 = c0449M21712;
        this.f25277 = c0449M21712 != null && c0449M21712.f1944.m28720();
        this.f25259 = SystemClock.uptimeMillis();
        this.f25240 = i;
        this.f25276 = this.f25249;
        this.f25244 = f;
        this.f25264 = this.f25261;
        this.f25252 = f2;
        if (this.f25277) {
            C11739 c11739 = this.f25237.f1944;
            this.f25273 = c11739.m28732();
            this.f25241 = c11739.m28733();
            this.f25238 = c11739.m28706();
            float fM28717 = c11739.m28717();
            this.f25278 = fM28717;
            float fM28731 = (enumC18795 == EnumC18795.TO_SCALE || enumC18795 == EnumC18795.ZOOM) ? fM28717 : c11739.m28731();
            this.f25280 = fM28731;
            c11739.m28710(this.f25273, fM28731, getWidth() * 0.5f, getHeight() * 0.5f, getWidth() * 0.5f, getHeight() * 0.5f, true);
            this.f25262 = c11739.m28732();
            this.f25247 = c11739.m28733();
            this.f25235 = c11739.m28706();
            float f3 = this.f25278;
            if (f3 != this.f25280) {
                double radians = Math.toRadians(f3);
                double radians2 = Math.toRadians(this.f25280);
                this.f25233 = this.f25241 + m21704(c11739, this.f25273, radians);
                this.f25248 = this.f25238 + m21711(c11739, this.f25273, radians);
                this.f25260 = this.f25247 + m21704(c11739, this.f25262, radians2);
                this.f25258 = this.f25235 + m21711(c11739, this.f25262, radians2);
            }
            c11739.m28711(this.f25273, this.f25278, this.f25241, this.f25238, false);
        }
        this.f25269.m34617();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f;
        float f2;
        InterfaceC3047 interfaceC3047;
        C0449 c0449;
        EnumC18795 enumC18795 = this.f25272;
        EnumC18795 enumC18796 = EnumC18795.NONE;
        if (enumC18795 == enumC18796) {
            return;
        }
        if (this.f25237 != m21712(this.f25255)) {
            mo14778();
            return;
        }
        EnumC18795 enumC18797 = this.f25272;
        EnumC18795 enumC18798 = EnumC18795.FLING;
        C14500 c14500 = this.f25269;
        if (enumC18797 == enumC18798) {
            OverScroller overScroller = this.f25242;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            float fMax = (this.f25253 == 0.0f && this.f25266 == 0.0f) ? 0.0f : Math.max(0.0f, 1.0f - ((SystemClock.uptimeMillis() - this.f25259) / 220.0f));
            C0449 c04410 = this.f25237;
            if (c04410 != null) {
                C11739 c11739 = c04410.f1944;
                long jUptimeMillis = SystemClock.uptimeMillis();
                float f3 = getResources().getDisplayMetrics().density;
                float f4 = fMax * fMax * fMax;
                c11739.m28712(c11739.m28732(), (this.f25253 * f4) + this.f25246.m44914(overScroller.getCurrX(), overScroller.getFinalX(), c11739.m28728(), c11739.m28734(), f3, jUptimeMillis), (this.f25266 * f4) + this.f25234.m44914(overScroller.getCurrY(), overScroller.getFinalY(), c11739.m28716(), c11739.m28722(), f3, jUptimeMillis), !zComputeScrollOffset && fMax == 0.0f);
            }
            if (zComputeScrollOffset || fMax > 0.0f) {
                postInvalidateOnAnimation();
                return;
            }
            this.f25272 = enumC18796;
            this.f25237 = null;
            c14500.m34613(false);
            return;
        }
        float fMin = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f25259) / this.f25240);
        float f5 = 1.0f - fMin;
        EnumC18795 enumC18799 = this.f25272;
        if (enumC18799 == EnumC18795.ZOOM) {
            f = (3.0f - (2.0f * fMin)) * fMin * fMin;
        } else {
            f = enumC18799 == EnumC18795.PAGE ? 1.0f - (f5 * f5) : 1.0f - ((f5 * f5) * f5);
        }
        this.f25249 = m21703(this.f25276, this.f25244, f);
        m21714(m21703(this.f25264, this.f25252, f));
        if (this.f25277 && (c0449 = this.f25237) != null && c0449.f1944.m28720()) {
            C11739 c117310 = this.f25237.f1944;
            float fM21703 = m21703(this.f25273, this.f25262, f);
            float f6 = this.f25278;
            float f7 = this.f25280;
            if (f6 != f7) {
                float fM21704 = m21703(f6, f7, f);
                double radians = Math.toRadians(fM21704);
                f2 = 1.0f;
                c117310.m28711(fM21703, fM21704, m21703(this.f25233, this.f25260, f) - m21704(c117310, fM21703, radians), m21703(this.f25248, this.f25258, f) - m21711(c117310, fM21703, radians), false);
            } else {
                f2 = 1.0f;
                c117310.m28712(fM21703, m21703(this.f25241, this.f25247, f), m21703(this.f25238, this.f25235, f), false);
            }
        } else {
            f2 = 1.0f;
        }
        invalidate();
        if (fMin < f2) {
            postInvalidateOnAnimation();
            return;
        }
        EnumC18795 enumC187910 = this.f25272;
        this.f25272 = enumC18796;
        this.f25237 = null;
        if (enumC187910 == EnumC18795.PAGE) {
            boolean zM21716 = m21716(this.f25256);
            c14500.m34613(false);
            if (!zM21716 || (interfaceC3047 = this.f25268) == null) {
                return;
            }
            interfaceC3047.mo9337(this.f25255);
            return;
        }
        c14500.m34613(enumC187910 == EnumC18795.TO_SCALE);
        if (enumC187910 == EnumC18795.DISMISS) {
            this.f25279 = true;
            InterfaceC3047 interfaceC3048 = this.f25268;
            if (interfaceC3048 != null) {
                interfaceC3048.onDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m21703(float f, float f2, float f3) {
        return C20382.m46695(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m21704(C11739 c11739, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c11739.m28719())) - (Math.sin(d) * ((double) c11739.m28737()))) * ((double) f) * 0.5d);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m21711(C11739 c11739, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c11739.m28737())) + (Math.sin(d) * ((double) c11739.m28719()))) * ((double) f) * 0.5d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(m21731(1) || m21731(-1));
        if (m21717(this.f25255)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (m21731(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (m21731(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2 = 0;
        if (this.f25279) {
            return false;
        }
        if (i == 4096) {
            i2 = 1;
        } else if (i == 8192) {
            i2 = -1;
        }
        if (i2 != 0 && m21731(i2)) {
            mo14778();
            m21730(i2);
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
        if (i2 != 0 && m21731(i2)) {
            mo14778();
            m21730(i2);
            return true;
        }
        if (i == 81 || i == 70 || i == 69) {
            mo14778();
            m21729(getWidth() / 2.0f, getHeight() / 2.0f);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
