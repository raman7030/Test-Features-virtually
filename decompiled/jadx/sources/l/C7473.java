package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public class C7473 extends ViewGroup implements InterfaceC16685 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23014 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f23015;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f23016;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public EnumC10296 f23017;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f23018;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f23019;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f23020;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14127 f23021;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final float[] f23022;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f23023;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f23024;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Object f23025;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12412 f23026;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f23027;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Path f23028;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C6062 f23029;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23030;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C4701 f23031;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12392 f23032;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f23033;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public RunnableC4196 f23034;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12412 f23035;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f23036;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f23037;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f23038;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f23039;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f23040;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f23041;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f23042;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f23043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f23044;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f23045;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f23046;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4651 f23047;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f23048;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f23049;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public ArrayList f23050;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C12392 f23051;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f23052;

    public C7473(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7473(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23035 = new C12412();
        this.f23026 = new C12412();
        C6062 c6062 = new C6062();
        c6062.f18575 = -1;
        c6062.f18574 = -1;
        c6062.f18577 = -1;
        c6062.f18576 = -1;
        this.f23029 = c6062;
        this.f23025 = new Object();
        this.f23033 = new AtomicInteger();
        this.f23047 = new C4651(this);
        this.f23028 = new Path();
        this.f23022 = new float[4];
        this.f23031 = new C4701();
        this.f23041 = true;
        this.f23040 = new C5242(Boolean.TRUE);
        this.f23046 = true;
        this.f23017 = EnumC10296.DO_NOT_IGNORE;
        this.f23030 = false;
        this.f23045 = false;
        this.f23037 = true;
        this.f23027 = true;
        this.f23023 = 300;
        setMotionEventSplittingEnabled(false);
        C12392 c12392 = new C12392(context, null);
        this.f23032 = c12392;
        C12392 c12393 = new C12392(context, null);
        this.f23051 = c12393;
        addView(c12392);
        addView(c12393);
        c12392.m30313(new C22290(this, true));
        c12393.m30313(new C22290(this, false));
        c12392.m30446();
        c12393.m30446();
        c12392.m30461();
        c12393.m30461();
        c12392.m30419();
        c12393.m30419();
        this.f23049 = C21943.m49424(-13158601, -1309);
        this.f23044 = C21943.m49424(-9803710, -332368);
        C12392.m30142(c12392, c12393);
        C22686 c22686 = c12392.f37245;
        C22686 c22687 = c12393.f37245;
        c22686.f73268 = 0;
        c22687.f73268 = 0;
        c22686.f73278 = true;
        c22687.f73278 = true;
        c22686.f73264 = true;
        c22687.f73264 = true;
        c22686.f73286 = true;
        c22687.f73286 = true;
        c22686.f73240 = true;
        c22687.f73240 = true;
        c22686.f73235 = true;
        c22687.f73235 = true;
        boolean z = this.f23045;
        c22686.f73291 = z;
        c22687.f73291 = true;
        c22686.f73277 = 0;
        c22687.f73277 = 0;
        c22686.f73254 = 1.0f;
        c22687.f73254 = 1.0f;
        boolean z2 = this.f23037;
        c22686.f73243 = z2;
        c22687.f73243 = z2;
        if (z) {
            int intrinsicHeight = c22686.f73231.getIntrinsicHeight() * 2;
            c22687.f73259 = intrinsicHeight;
            c22686.f73259 = intrinsicHeight;
        }
        int i2 = c22686.f73287;
        int iAlpha = (i2 & 16777215) | (((int) (Color.alpha(i2) * 0.5f)) << 24);
        c22687.f73287 = iAlpha;
        c22686.f73287 = iAlpha;
        c22686.f73253 = new C8179(this);
        c22687.f73253 = new C15233(this);
        c12392.m30321(new C4236(3, this));
        c12393.m30321(new C1909(this));
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: l.ۘ۫ᩳ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                C7473.m20026(this.f12574, view, z3);
            }
        };
        c12392.setOnFocusChangeListener(onFocusChangeListener);
        c12393.setOnFocusChangeListener(onFocusChangeListener);
        c12392.m30330(new InterfaceC8035() { // from class: l.ᩴ۫ᩳ
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫ */
            public final void mo1646(int i3, int i4) {
                C7473.m20046(this.f59276, i3, i4);
            }
        });
        c12393.m30330(new InterfaceC8035() { // from class: l.᩵۫ᩳ
            @Override // l.InterfaceC8035
            /* JADX INFO: renamed from: ֫ */
            public final void mo1646(int i3, int i4) {
                C7473.m20024(this.f62961, i3, i4);
            }
        });
        c12392.f37299 = new C22995(this, true);
        c12393.f37299 = new C22995(this, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20025(C7473 c7473, int i, int i2, int i3) {
        if (c7473.f23027) {
            C12392 c12392 = c7473.f23032;
            C12392 c12393 = c7473.f23051;
            if (c12392.isFocused() || c12392.isPressed()) {
                if (i == i3) {
                    c12393.m30392(i2, c12393.m30408());
                    c7473.invalidate();
                    return;
                }
                C4651 c4651 = c7473.f23047;
                if (c4651.m13619(c12392, c12393, true)) {
                    float fM24484 = c12392.f37245.m24484();
                    float fM13620 = (c4651.m13620(c12392) - ((c4651.f14750 * fM24484) - i3)) / fM24484;
                    int i4 = c4651.f14751;
                    int i5 = c4651.f14752;
                    i3 = (int) (((((i4 - i5) * fM13620) + i5) * fM24484) - c4651.m13620(c12393));
                }
                c12393.m30392(i2, i3);
                c7473.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20047(C7473 c7473, int i, int i2, int i3) {
        if (c7473.f23027) {
            C12392 c12392 = c7473.f23051;
            C12392 c12393 = c7473.f23032;
            if (c12392.isFocused() || c12392.isPressed()) {
                if (i == i3) {
                    c12393.m30392(i2, c12393.m30408());
                    c7473.invalidate();
                    return;
                }
                C4651 c4651 = c7473.f23047;
                if (c4651.m13619(c12392, c12393, false)) {
                    float fM24484 = c12392.f37245.m24484();
                    float fM13620 = (c4651.m13620(c12392) - ((c4651.f14750 * fM24484) - i3)) / fM24484;
                    int i4 = c4651.f14751;
                    int i5 = c4651.f14752;
                    i3 = (int) (((((i4 - i5) * fM13620) + i5) * fM24484) - c4651.m13620(c12393));
                }
                c12393.m30392(i2, i3);
                c7473.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20026(C7473 c7473, View view, boolean z) {
        if (z) {
            boolean z2 = view == c7473.f23032;
            if (c7473.f23041 != z2) {
                c7473.f23041 = z2;
                c7473.f23040.mo1669(Boolean.valueOf(z2));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20046(C7473 c7473, int i, int i2) {
        C12392 c12392 = c7473.f23051;
        if (c7473.f23037 && c7473.f23041) {
            c7473.m20022(i, i2, true);
            c12392.invalidate();
        } else if (c7473.f23045) {
            c12392.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20024(C7473 c7473, int i, int i2) {
        C12392 c12392 = c7473.f23032;
        if (c7473.f23037 && !c7473.f23041) {
            c7473.m20022(i, i2, false);
            c12392.invalidate();
        } else if (c7473.f23045) {
            c12392.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m20022(int i, int i2, boolean z) {
        int iM20043;
        int iM20044;
        List list = this.f23019;
        if (list == null) {
            return;
        }
        C12392 c12392 = this.f23051;
        C12392 c12393 = this.f23032;
        C12392 c12394 = z ? c12393 : c12392;
        if (!z) {
            c12392 = c12393;
        }
        int length = c12394.m30436().length();
        int length2 = c12392.m30436().length();
        if (i == i2) {
            iM20043 = m20043(z, i, length, length2, list);
            iM20044 = iM20043;
        } else {
            iM20043 = m20043(z, i, length, length2, list);
            iM20044 = m20043(z, i2, length, length2, list);
        }
        c12392.mo25922(iM20043, iM20044);
        c12392.m30404();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[RETURN] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m20043(boolean z, int i, int i2, int i3, List list) {
        InterfaceC18813 interfaceC18813;
        int iMo15483;
        int iMo15478;
        InterfaceC18813 interfaceC18814;
        int iMo15484;
        List listMo2067;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC18813 interfaceC18815 = (InterfaceC18813) list.get(i4);
            int iMo15479 = interfaceC18815.mo15478(z);
            int iMo15485 = interfaceC18815.mo15483(z);
            if (iMo15479 > i || (i == i2 && iMo15479 == i && iMo15479 == iMo15485)) {
                if (i4 > 0 && (i = (i - interfaceC18814.mo15483(z)) + (iMo15484 = (interfaceC18814 = (InterfaceC18813) list.get(i4 - 1)).mo15483(!z))) < iMo15484) {
                    i = iMo15484;
                }
                int i5 = i4 + 1;
                if (i5 < size && i > (iMo15478 = ((InterfaceC18813) list.get(i5)).mo15478(!z))) {
                    i = iMo15478;
                }
                if (i > i3) {
                    return i3;
                }
                return i;
            }
            if (iMo15485 > i || (i == i2 && iMo15485 == i)) {
                boolean z2 = !z;
                int iMo154710 = interfaceC18815.mo15478(z2);
                int iMo15486 = interfaceC18815.mo15483(z2);
                int iM20043 = i - iMo15479;
                if ((interfaceC18815 instanceof InterfaceC0467) && (listMo2067 = ((InterfaceC0467) interfaceC18815).mo2067()) != null) {
                    iM20043 = m20043(z, iM20043, interfaceC18815.mo15483(z) - interfaceC18815.mo15478(z), iMo15486 - iMo154710, listMo2067);
                }
                int i6 = iM20043 + iMo154710;
                if (i6 < iMo154710) {
                    return iMo154710;
                }
                return i6 > iMo15486 ? iMo15486 : i6;
            }
        }
        if (size > 0 && i >= (iMo15483 = (interfaceC18813 = (InterfaceC18813) list.get(size - 1)).mo15483(z))) {
            i = (i - iMo15483) + interfaceC18813.mo15483(!z);
        }
        if (i < 0) {
            return 0;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m20078() {
        return this.f23045;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m20097(boolean z) {
        if (this.f23045 != z) {
            this.f23045 = z;
            C22686 c22686 = this.f23032.f37245;
            c22686.f73291 = z;
            C12392 c12392 = this.f23051;
            if (z) {
                C22686 c22687 = c12392.f37245;
                int intrinsicHeight = c22686.f73231.getIntrinsicHeight() * 2;
                c22687.f73259 = intrinsicHeight;
                c22686.f73259 = intrinsicHeight;
            } else {
                C22686 c22688 = c12392.f37245;
                int intrinsicHeight2 = c22686.f73231.getIntrinsicHeight() * 3;
                c22688.f73259 = intrinsicHeight2;
                c22686.f73259 = intrinsicHeight2;
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20084(boolean z) {
        this.f23027 = z;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20061() {
        return this.f23027;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20067(ActivityC1748 activityC1748, C19013 c19013) {
        this.f23040.m1668(activityC1748, new C4052(1, c19013));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20069(C10130 c10130) {
        c10130.writeInt(631841030);
        c10130.m25425(this.f23041);
        c10130.m25425(this.f23046);
        c10130.writeByte(this.f23017.ordinal());
        c10130.mo13231(8454);
        c10130.m25425(this.f23030);
        c10130.m25425(this.f23045);
        c10130.m25425(this.f23037);
        c10130.mo13231(8454);
        c10130.m25425(this.f23027);
        if (this.f23019 == null) {
            c10130.writeByte(0);
        } else {
            c10130.m25425(true);
            c10130.writeInt(this.f23019.size());
            Iterator it = this.f23019.iterator();
            while (it.hasNext()) {
                ((InterfaceC0467) it.next()).mo15479(c10130);
            }
        }
        this.f23032.m30331(c10130, true);
        this.f23051.m30331(c10130, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20071(C12951 c12951, AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        C22124.m49722((InterfaceC20008) c12951, 631841030);
        List list = null;
        m20044((List) null);
        this.f23041 = c12951.m31498();
        C5242 c5242 = this.f23040;
        boolean zBooleanValue = ((Boolean) c5242.m1662()).booleanValue();
        boolean z = this.f23041;
        if (zBooleanValue != z) {
            c5242.mo1664(Boolean.valueOf(z));
        }
        this.f23046 = c12951.m31498();
        this.f23017 = EnumC10296.values()[c12951.readByte() & 255];
        boolean zM31497 = c12951.m31497(8454);
        C12392 c12392 = this.f23051;
        C12392 c12393 = this.f23032;
        if (zM31497) {
            m20088(c12951.m31498());
            m20097(c12951.m31498());
            boolean zM31498 = c12951.m31498();
            this.f23037 = zM31498;
            c12393.f37245.f73243 = zM31498;
            c12392.f37245.f73243 = zM31498;
            invalidate();
        }
        if (c12951.m31497(8454)) {
            this.f23027 = c12951.m31498();
        }
        boolean zM31499 = c12951.m31498();
        if (zM31499) {
            int i = c12951.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C5407(c12951));
            }
            list = arrayList;
        }
        c12393.mo25896(c12951);
        c12392.mo25896(c12951);
        if (zM31499) {
            m20044(list);
        } else {
            m20049();
        }
        m20038();
        if (this.f23041) {
            if (c12392.isFocused()) {
                post(new RunnableC17872(c12393, 1));
            }
        } else if (c12393.isFocused()) {
            post(new RunnableC17872(c12392, 1));
        }
        m20057();
        if (abstractC15440 != null) {
            c12393.m30336(abstractC15440);
        }
        if (abstractC15441 != null) {
            c12392.m30336(abstractC15441);
        }
        m20057();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0201  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x022f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20033(C7473 c7473, boolean z, C20736 c20736, int i, int i2, int i3, Canvas canvas, Paint paint, C22686 c22686) {
        Paint paint2;
        InterfaceC0467 interfaceC0467;
        int i4;
        int i5;
        C15859 c15859;
        C7473 c7474;
        C15859 c158510;
        float f;
        float f2;
        float f3;
        float fM9786;
        int i6;
        float f4;
        int i7;
        float f5;
        InterfaceC0467 interfaceC0468;
        int iMo15478;
        int iMo15483;
        boolean z2 = z;
        int i8 = c7473.f23044;
        C12392 c12392 = c7473.f23051;
        C12392 c12393 = c7473.f23032;
        AbstractC3179 abstractC3179 = c7473.m20064(z).f37258;
        List list = c7473.f23019;
        if (list == null || !c7473.m20064(z).m30505()) {
            return;
        }
        C12412 c12412 = z2 ? c7473.f23035 : c7473.f23026;
        C12392 c12392M20064 = c7473.m20064(z);
        c12412.getClass();
        C15859 c158511 = c12412.f37382;
        InterfaceC7785 interfaceC7785M30436 = c12392M20064.m30436();
        c12412.f37390 = interfaceC7785M30436;
        c12412.f37389 = interfaceC7785M30436.mo26548();
        c12412.f37384 = list;
        C11003.requireNonNull(c22686);
        c12412.f37383 = c22686;
        C11003.requireNonNull(c20736);
        c12412.f37387 = c20736;
        c12412.f37385 = i;
        c12412.f37388 = i2;
        c158511.clear();
        if (c7473.f23045) {
            boolean z3 = c7473.f23041;
            C12392 c12394 = z3 ? c12393 : c12392;
            int length = c12394.m30436().length();
            int iM30444 = c12394.m30444();
            if (iM30444 != c12394.m30448()) {
                paint2 = paint;
                interfaceC0467 = null;
            } else {
                if (z2) {
                    c12392 = c12393;
                }
                int size = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 <= size) {
                        if (i9 == size) {
                            iMo15483 = length;
                            iMo15478 = iMo15483;
                            interfaceC0468 = null;
                        } else {
                            interfaceC0468 = (InterfaceC0467) list.get(i9);
                            iMo15478 = interfaceC0468.mo15478(z3);
                            iMo15483 = interfaceC0468.mo15483(z3);
                        }
                        if (iMo15478 > iM30444 || (iM30444 == length && iMo15478 == iM30444 && iMo15478 == iMo15483)) {
                            if (z3 != z2 && i9 > 0) {
                                InterfaceC0467 interfaceC0469 = (InterfaceC0467) list.get(i9 - 1);
                                iM30444 = (iM30444 - interfaceC0469.mo15483(z3)) + interfaceC0469.mo15483(z2);
                            }
                            int iM9790 = c12392.f37258.m9790(iM30444);
                            if (iM9790 >= c12412.f37385 && iM9790 <= c12412.f37388) {
                                int iM47366 = c20736.m47366(iM9790);
                                int iM47365 = c20736.m47365(iM9790);
                                float fM9787 = abstractC3179.m9786(iM47366);
                                float fM9788 = abstractC3179.m9786(iM47365 + 1);
                                paint2 = paint;
                                paint2.setColor(i8);
                                canvas.drawRect(0.0f, fM9787, i3, fM9788, paint);
                                c158511.add((int) fM9787);
                                c158511.add((int) fM9788);
                                c158511.add(-1);
                                c158511.add(0);
                            }
                            interfaceC0467 = null;
                        } else if (interfaceC0468 == null || (iMo15483 <= iM30444 && !(iM30444 == length && iMo15483 == iM30444))) {
                            i9++;
                            size = size;
                        } else {
                            paint2 = paint;
                            interfaceC0467 = interfaceC0468;
                        }
                    }
                    paint2 = paint;
                    interfaceC0467 = null;
                }
            }
        } else {
            paint2 = paint;
            interfaceC0467 = null;
        }
        int iM47357 = c12412.f37387.m47357(c12412.f37385);
        int iM47358 = c12412.f37387.m47357(c12412.f37388) + 1;
        float fM24491 = c12412.f37383.m24491() / 16.0f;
        Iterator it = list.iterator();
        while (true) {
            C7473 c7475 = c7473;
            Paint paint3 = paint2;
            while (it.hasNext()) {
                InterfaceC0467 interfaceC04610 = (InterfaceC0467) it.next();
                int iMo2065 = z2 ? interfaceC04610.mo2065() : interfaceC04610.mo2068();
                Iterator it2 = it;
                int iMo2063 = z2 ? interfaceC04610.mo2063() : interfaceC04610.mo2072();
                if (iMo2063 >= iM47357) {
                    if (iMo2065 > iM47358) {
                        i4 = iM47357;
                        i5 = iM47358;
                        c158510 = c158511;
                    } else {
                        i5 = iM47358;
                        EnumC3240 enumC3240M9913 = EnumC3240.m9913(interfaceC04610);
                        i4 = iM47357;
                        int iM47367 = c20736.m47367(iMo2065, (iMo2065 - iM47357) + i);
                        c158510 = c158511;
                        if (iM47367 == -1) {
                            if (iMo2065 == c20736.m47368().f35064 + 1) {
                                iM47367 = c20736.size();
                            }
                        }
                        if (c7475.f23045) {
                            f = 0.0f;
                        } else {
                            if (z2) {
                                C22686 c22687 = c12412.f37383;
                                f2 = i3 - (c22687.f73254 * c22687.f73245);
                                f3 = 0.0f;
                            } else {
                                C22686 c22688 = c12412.f37383;
                                f = c22688.f73254 * c22688.f73245;
                            }
                            fM9786 = abstractC3179.m9786(iM47367);
                            if (iMo2065 == iMo2063) {
                                if (iM47367 == 0) {
                                    f5 = fM9786 + fM24491 + fM24491;
                                } else if (iM47367 == c20736.size()) {
                                    f4 = (fM9786 - fM24491) - fM24491;
                                } else {
                                    f5 = fM9786 + fM24491;
                                    fM9786 -= fM24491;
                                }
                                float f6 = fM9786;
                                fM9786 = f5;
                                f4 = f6;
                            } else {
                                i6 = 1;
                                while (true) {
                                    iM47367++;
                                    if (iM47367 > i2 || c20736.m47357(iM47367) >= iMo2063) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                f4 = fM9786;
                                fM9786 = (c12412.f37383.m24484() * i6) + fM9786;
                            }
                            if (interfaceC04610 == interfaceC0467) {
                                paint3.setColor(i8);
                            } else {
                                paint3.setColor(enumC3240M9913.f10198);
                            }
                            canvas.drawRect(f3, f4, f2, fM9786, paint3);
                            c158510.add((int) f4);
                            c158510.add((int) fM9786);
                            c158510.add(enumC3240M9913.ordinal());
                            if (interfaceC04610.mo2067() == null) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            c158510.add(i7);
                            z2 = z;
                            paint2 = paint;
                            c158511 = c158510;
                            iM47358 = i5;
                            iM47357 = i4;
                            it = it2;
                        }
                        f2 = i3;
                        f3 = f;
                        fM9786 = abstractC3179.m9786(iM47367);
                        if (iMo2065 == iMo2063) {
                            if (iM47367 == 0) {
                                f5 = fM9786 + fM24491 + fM24491;
                            } else if (iM47367 == c20736.size()) {
                                f4 = (fM9786 - fM24491) - fM24491;
                            } else {
                                f5 = fM9786 + fM24491;
                                fM9786 -= fM24491;
                            }
                            float f7 = fM9786;
                            fM9786 = f5;
                            f4 = f7;
                        } else {
                            i6 = 1;
                            while (true) {
                                iM47367++;
                                if (iM47367 > i2) {
                                    break;
                                }
                                break;
                                break;
                                i6++;
                            }
                            f4 = fM9786;
                            fM9786 = (c12412.f37383.m24484() * i6) + fM9786;
                        }
                        if (interfaceC04610 == interfaceC0467) {
                            paint3.setColor(i8);
                        } else {
                            paint3.setColor(enumC3240M9913.f10198);
                        }
                        canvas.drawRect(f3, f4, f2, fM9786, paint3);
                        c158510.add((int) f4);
                        c158510.add((int) fM9786);
                        c158510.add(enumC3240M9913.ordinal());
                        if (interfaceC04610.mo2067() == null) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        c158510.add(i7);
                        z2 = z;
                        paint2 = paint;
                        c158511 = c158510;
                        iM47358 = i5;
                        iM47357 = i4;
                        it = it2;
                    }
                    c7474 = c7475;
                    c15859 = c158510;
                } else {
                    i4 = iM47357;
                    i5 = iM47358;
                    c15859 = c158511;
                    c7474 = c7473;
                    paint3 = paint;
                }
                z2 = z;
                c7475 = c7474;
                c158511 = c15859;
                iM47358 = i5;
                iM47357 = i4;
                it = it2;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01b5 A[PHI: r19 r21
      0x01b5: PHI (r19v6 int) = (r19v5 int), (r19v9 int) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r21v9 java.util.List) = (r21v8 java.util.List), (r21v12 java.util.List) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7 A[PHI: r19 r21
      0x01b7: PHI (r19v8 int) = (r19v5 int), (r19v9 int) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r21v11 java.util.List) = (r21v8 java.util.List), (r21v12 java.util.List) binds: [B:86:0x01b3, B:83:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20032(C7473 c7473, boolean z, C20736 c20736, int i, int i2, float f, float f2, boolean z2, Canvas canvas, Paint paint, InterfaceC10961 interfaceC10961, C22686 c22686) {
        int i3;
        InterfaceC0467 interfaceC0467;
        List list;
        List listMo2067;
        int iM47367;
        boolean z3;
        int iMo15485;
        int iMo15486;
        int iMo15489;
        int i4;
        List list2;
        boolean z4;
        float f3;
        int iMo2068;
        int iMo2072;
        C20736 c20737 = c20736;
        int i5 = i;
        int i6 = i2;
        AbstractC3179 abstractC3179 = c7473.m20064(z).f37258;
        List list3 = c7473.f23019;
        if (list3 == null || !c7473.m20064(z).m30505()) {
            return;
        }
        C12412 c12412 = z ? c7473.f23035 : c7473.f23026;
        if (c12412.f37384 != list3 || c12412.f37383 != c22686 || c12412.f37387 != c20737 || c12412.f37385 != i5 || c12412.f37388 != i6) {
            c7473.f23032.postInvalidate();
            c7473.f23051.postInvalidate();
            c7473.postInvalidate();
            return;
        }
        C15859 c15859 = c12412.f37382;
        EnumC3240[] enumC3240ArrValues = EnumC3240.values();
        int i7 = 0;
        for (int size = c15859.size(); i7 < size; size = size) {
            int i8 = c15859.getInt(i7);
            int i9 = c15859.getInt(i7 + 1);
            int i10 = c15859.getInt(i7 + 2);
            if (i10 < 0) {
                paint.setColor(c7473.f23049);
            } else {
                EnumC3240 enumC3240 = enumC3240ArrValues[i10];
                paint.setColor(c15859.getInt(i7 + 3) != 0 ? enumC3240.f10199 : enumC3240.f10198);
            }
            canvas.drawRect(f, i8, f2, i9, paint);
            i7 += 4;
        }
        C15859 c158510 = c22686.f73252;
        float fM24484 = c22686.m24484();
        int iM47357 = c12412.f37387.m47357(c12412.f37385);
        int iM47358 = c12412.f37387.m47357(c12412.f37388);
        int i11 = i5;
        while (iM47357 <= iM47358) {
            int i12 = 1;
            int size2 = list3.size() - 1;
            int i13 = 0;
            while (true) {
                if (i13 > size2) {
                    i3 = iM47358;
                    interfaceC0467 = null;
                    break;
                }
                int i14 = (i13 + size2) >>> i12;
                interfaceC0467 = (InterfaceC0467) list3.get(i14);
                if (z) {
                    iMo2068 = interfaceC0467.mo2065();
                    iMo2072 = interfaceC0467.mo2063();
                } else {
                    iMo2068 = interfaceC0467.mo2068();
                    iMo2072 = interfaceC0467.mo2072();
                }
                i3 = iM47358;
                int i15 = iMo2072;
                if (iM47357 < iMo2068) {
                    size2 = i14 - 1;
                } else if (iM47357 < i15) {
                    break;
                } else {
                    i13 = i14 + 1;
                }
                i12 = 1;
                iM47358 = i3;
            }
            if (interfaceC0467 == null || (listMo2067 = interfaceC0467.mo2067()) == null || (iM47367 = c20737.m47367(iM47357, i11)) == -1) {
                list = list3;
            } else {
                int iM47366 = c20737.m47366(iM47367);
                int iMin = Math.min(c20737.m47365(iM47367), i6);
                if (iM47366 < i5) {
                    iM47366 = i5;
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i16 = iMin + 1;
                float fM9786 = abstractC3179.m9786(iM47366);
                int size3 = c20736.size();
                C13862 c13862M47359 = c20736.m47359();
                while (iM47366 <= iMin) {
                    int i17 = (int) fM9786;
                    int iM50687 = (!z2 || z3) ? 0 : c22686.m50687();
                    C11747 c11747M33216 = c13862M47359.m33216(iM47366);
                    C13862 c13862 = c13862M47359;
                    int i18 = c11747M33216.f35062;
                    int i19 = iMin;
                    int i20 = c11747M33216.f35063;
                    int i21 = i16;
                    if (iM47366 < size3 - 1 && c20737.m47357(iM47366 + 1) != c11747M33216.f35064) {
                        i20++;
                    }
                    int size4 = listMo2067.size();
                    float fM46370 = 0.0f;
                    int i22 = i18;
                    int i23 = 0;
                    while (i23 < size4) {
                        InterfaceC18813 interfaceC18813 = (InterfaceC18813) listMo2067.get(i23);
                        if (z) {
                            iMo15485 = interfaceC18813.mo15487() + interfaceC0467.mo15487();
                            iMo15486 = interfaceC0467.mo15487();
                            iMo15489 = interfaceC18813.mo15477();
                        } else {
                            iMo15485 = interfaceC18813.mo15485() + interfaceC0467.mo15485();
                            iMo15486 = interfaceC0467.mo15485();
                            iMo15489 = interfaceC18813.mo15489();
                        }
                        List list4 = listMo2067;
                        int i24 = iMo15485;
                        int i25 = size4;
                        int i26 = iMo15489 + iMo15486;
                        if (i26 <= i18 || i20 <= i24) {
                            i4 = i18;
                            list2 = list3;
                        } else {
                            int iMax = Math.max(i24, i18);
                            int iMin2 = Math.min(i26, i20);
                            if (z) {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC18813.mo15487() == interfaceC18813.mo15477()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC18813.mo15485() == interfaceC18813.mo15489()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            C20113 c20113 = (C20113) interfaceC10961;
                            fM46370 += c20113.m46370(i22, fM46370, iMax);
                            float f4 = iM50687;
                            float f5 = fM46370 + f4;
                            if (z4) {
                                float f6 = fM24484 / 16.0f;
                                float f7 = (int) (f5 - f6);
                                f3 = (f6 * 2.0f) + f7;
                                f5 = f7;
                            } else {
                                if (iMin2 == i20) {
                                    f3 = f2;
                                } else {
                                    fM46370 += c20113.m46370(iMax, fM46370, iMin2);
                                    f3 = fM46370 + f4;
                                    i22 = iMin2;
                                }
                                if (f5 >= f3 && f3 >= f && f5 <= f2) {
                                    c158510.add(i17);
                                    c158510.add(Float.floatToRawIntBits(f5));
                                    c158510.add(Float.floatToRawIntBits(f3));
                                    c158510.add(EnumC3240.m9914(interfaceC18813).f10198);
                                }
                            }
                            i22 = iMax;
                            if (f5 >= f3) {
                            }
                        }
                        i23++;
                        i18 = i4;
                        size4 = i25;
                        list3 = list2;
                        listMo2067 = list4;
                    }
                    iM47366++;
                    fM9786 = abstractC3179.m9786(iM47366);
                    z3 = false;
                    c20737 = c20736;
                    c13862M47359 = c13862;
                    iMin = i19;
                    i16 = i21;
                }
                list = list3;
                i11 = i16;
            }
            iM47357++;
            iM47358 = i3;
            c20737 = c20736;
            i5 = i;
            i6 = i2;
            list3 = list;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20031(C7473 c7473, boolean z, C20736 c20736, float f, float f2, float f3, float f4, Canvas canvas, Paint paint, C22686 c22686) {
        float f5;
        float f6;
        int iM47366;
        int iM47365;
        List<InterfaceC0467> list = c7473.f23019;
        if (list == null || !c7473.m20064(z).m30505() || c20736.isEmpty()) {
            return;
        }
        int i = (int) (f4 - f2);
        int size = c20736.size();
        float f7 = c22686.f29068 * 3.0f;
        if (z && !c7473.f23045) {
            f6 = c22686.f73289 + f;
            f5 = f;
        } else {
            f5 = f3 - c22686.f73289;
            f6 = f3;
        }
        for (InterfaceC0467 interfaceC0467 : list) {
            int iMo2065 = z ? interfaceC0467.mo2065() : interfaceC0467.mo2068();
            int iMo2063 = z ? interfaceC0467.mo2063() : interfaceC0467.mo2072();
            int iM47348 = c20736.m47348(iMo2065);
            if (iM47348 == -1) {
                if (iMo2065 == c20736.m47368().f35064 + 1) {
                    iM47366 = c20736.size();
                }
            } else {
                iM47366 = c20736.m47366(iM47348);
            }
            int iM47349 = c20736.m47348(iMo2063);
            if (iM47349 == -1) {
                if (iMo2063 == c20736.m47368().f35064 + 1) {
                    iM47365 = c20736.size();
                }
            } else {
                iM47365 = c20736.m47365(iM47349);
            }
            float f8 = i;
            float f9 = size;
            float f10 = (iM47366 * f8) / f9;
            float f11 = (iM47365 * f8) / f9;
            float f12 = f8 - f7;
            if (f10 > f12) {
                f10 = f12;
            }
            if (f11 - f10 < f7) {
                f11 = f10 + f7;
            }
            paint.setColor(EnumC3240.m9913(interfaceC0467).f10197);
            canvas.drawRect(f5, f2 + f10, f6, f2 + f11, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C12392 c12392 = this.f23032;
        C12392 c12393 = this.f23051;
        C12392.m30208(c12392, c12393);
        C22686 c22686 = c12392.f37245;
        c12393.computeScroll();
        c12393.f37192 = true;
        this.f23024 = true;
        try {
            super.dispatchDraw(canvas);
            this.f23024 = false;
            c12393.f37192 = false;
            List list = this.f23019;
            boolean zM20036 = m20036(list);
            this.f23039 = zM20036;
            C1539 c1539 = c22686.f73269;
            if (this.f23045) {
                int bottom = c12392.getBottom();
                int top = c12393.getTop();
                c1539.setColor(C7191.m19274((C21943.f70274 & 16777215) | (-1610612736), C21943.f70259));
                canvas.drawRect(0.0f, bottom, getWidth(), top, c1539);
                c1539.setColor(C21943.f70274);
                canvas.drawRect(0.0f, bottom + 2, getWidth(), top - 2, c1539);
            } else {
                if (zM20036) {
                    C12412 c12412 = this.f23035;
                    int iM47357 = c12412.f37387.m47357(c12412.f37385);
                    C12412 c12413 = this.f23026;
                    int iM47358 = c12413.f37387.m47357(c12413.f37385);
                    int iM47359 = c12412.f37387.m47357(c12412.f37388) + 1;
                    int iM473510 = c12413.f37387.m47357(c12413.f37388) + 1;
                    float width = getWidth() / 2.0f;
                    C22686 c22687 = c12412.f37383;
                    float f = width - (c22687.f73254 * c22687.f73245);
                    C22686 c22688 = c12413.f37383;
                    float f2 = (c22688.f73254 * c22688.f73245) + width;
                    float f3 = c22686.f73245 / 2.0f;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
                        if (interfaceC0467.mo2063() >= iM47357 || interfaceC0467.mo2072() >= iM47358) {
                            if (interfaceC0467.mo2065() <= iM47359 || interfaceC0467.mo2068() <= iM473510) {
                                EnumC3240 enumC3240M9913 = EnumC3240.m9913(interfaceC0467);
                                Iterator it2 = it;
                                Path path = this.f23028;
                                path.reset();
                                int i = iM47357;
                                float[] fArr = this.f23022;
                                int i2 = iM47358;
                                int i3 = iM47359;
                                if (c12412.m30579(interfaceC0467, true, fArr, 0) && c12413.m30579(interfaceC0467, false, fArr, 2)) {
                                    int paddingTop = c12392.getPaddingTop() - c12392.m30408();
                                    int paddingTop2 = c12393.getPaddingTop() - c12393.m30408();
                                    float f4 = paddingTop;
                                    float f5 = fArr[0] + f4;
                                    fArr[0] = f5;
                                    fArr[1] = fArr[1] + f4;
                                    float f6 = paddingTop2;
                                    fArr[2] = fArr[2] + f6;
                                    fArr[3] = fArr[3] + f6;
                                    path.moveTo(f, f5);
                                    path.lineTo(f, fArr[1]);
                                    if (Math.abs(fArr[1] - fArr[3]) <= 1.0f) {
                                        path.lineTo(f2, fArr[3]);
                                    } else {
                                        float f7 = fArr[3];
                                        path.cubicTo(f + f3, fArr[1], f2 - f3, f7, f2, f7);
                                    }
                                    path.lineTo(f2, fArr[2]);
                                    if (Math.abs(fArr[2] - fArr[0]) <= 1.0f) {
                                        path.lineTo(f, fArr[0]);
                                    } else {
                                        float f8 = fArr[0];
                                        path.cubicTo(f2 - f3, fArr[2], f + f3, f8, f, f8);
                                    }
                                    path.close();
                                    c1539.setColor(enumC3240M9913.f10198);
                                    canvas.drawPath(path, c1539);
                                }
                                it = it2;
                                iM47357 = i;
                                iM47358 = i2;
                                iM47359 = i3;
                            }
                        }
                    }
                }
                if (this.f23030 || !zM20036) {
                }
                C4651 c4651 = this.f23047;
                Paint paint = c4651.f14754;
                paint.setColor(C21943.f70257);
                C7473 c7473 = c4651.f14753;
                C12392 c12394 = c7473.f23051;
                C12392 c12395 = c7473.f23032;
                if (c7473.f23045) {
                    float top2 = c12395.getTop() + ((int) c4651.m13620(c12395));
                    canvas.drawLine(0.0f, top2, c7473.getWidth(), top2, paint);
                    float top3 = c12394.getTop() + ((int) c4651.m13620(c12394));
                    canvas.drawLine(0.0f, top3, c7473.getWidth(), top3, paint);
                    return;
                }
                float fM13620 = (int) c4651.m13620(c12395);
                canvas.drawLine(0.0f, fM13620, c7473.getWidth(), fM13620, paint);
                return;
            }
            if (this.f23030) {
            }
        } catch (Throwable th) {
            this.f23024 = false;
            c12393.f37192 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20029(C7473 c7473, C12412 c12412, boolean z) {
        c12412.f37386 = z;
        if (c7473.f23024 || c7473.f23039 == c7473.m20036(c7473.f23019)) {
            return;
        }
        super.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20036(List list) {
        if (list == null) {
            return false;
        }
        C12392 c12392 = this.f23032;
        if (!c12392.m30505()) {
            return false;
        }
        C12392 c12393 = this.f23051;
        return c12393.m30505() && this.f23035.m30580(c12392, list) && this.f23026.m30580(c12393, list);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m20037(C7473 c7473) {
        return c7473.f23032.m30505() && c7473.f23051.m30505();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0108 */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20082(final boolean z) {
        if (!C10975.m27285()) {
            post(new RunnableC5357(0, this));
            return;
        }
        if (this.f23016) {
            this.f23015 = true;
            return;
        }
        if (m20055()) {
            return;
        }
        boolean z2 = this.f23019 == null;
        synchronized (this.f23029) {
            if (!z2) {
                try {
                    C6062 c6062 = this.f23029;
                    if (c6062.f18575 == -1 && c6062.f18577 == -1) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        throw th;
                    }
                }
            }
            int i = z2 ? 0 : this.f23029.f18575;
            int iM30526 = z2 ? this.f23032.m30526() : this.f23029.f18574;
            int i2 = z2 ? 0 : this.f23029.f18577;
            int iM30527 = z2 ? this.f23051.m30526() : this.f23029.f18576;
            final InterfaceC7785 interfaceC7785M30436 = this.f23032.m30436();
            final InterfaceC7785 interfaceC7785M30437 = this.f23051.m30436();
            final C7744 c7744Mo26562 = interfaceC7785M30436.mo26562();
            try {
                final C7744 c7744Mo26563 = interfaceC7785M30437.mo26562();
                final int i3 = this.f23033.get();
                final int iM20767 = c7744Mo26562.m20767();
                final int iM20768 = c7744Mo26563.m20767();
                final List list = this.f23019;
                try {
                    final C13822 c13822M20021 = m20021(list, c7744Mo26562, c7744Mo26563, i, iM30526, i2, iM30527);
                    final EnumC10296 enumC10296 = this.f23017;
                    final boolean z3 = this.f23046;
                    final C14127 c14127 = this.f23021;
                    this.f23016 = true;
                    interfaceC7785M30436.setReadOnly(true);
                    interfaceC7785M30437.setReadOnly(true);
                    Runnable runnable = new Runnable() { // from class: l.֨۫ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7473.m20027(this.f4095, c7744Mo26562, c7744Mo26563, c13822M20021, enumC10296, z3, c14127, interfaceC7785M30436, interfaceC7785M30437, i3, list, iM20767, iM20768, z);
                        }
                    };
                    if (z) {
                        runnable.run();
                        return;
                    }
                    try {
                        C1802.f6208.execute(runnable);
                    } catch (RuntimeException e) {
                        this.f23016 = false;
                        c7744Mo26562.close();
                        c7744Mo26563.close();
                        interfaceC7785M30436.setReadOnly(false);
                        interfaceC7785M30437.setReadOnly(false);
                        throw e;
                    }
                } catch (Error | RuntimeException e2) {
                    c7744Mo26562.close();
                    c7744Mo26563.close();
                    throw e2;
                }
            } catch (Error | RuntimeException e3) {
                c7744Mo26562.close();
                throw e3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20027(final C7473 c7473, C7744 c7744, C7744 c7745, final C13822 c13822, final EnumC10296 enumC10296, final boolean z, final InterfaceC13117 interfaceC13117, final InterfaceC7785 interfaceC7785, final InterfaceC7785 interfaceC7786, final int i, final List list, final int i2, final int i3, boolean z2) {
        try {
            try {
                C15172 c15172M35874 = C15172.m35874(c7744);
                try {
                    C15172 c15172M35875 = C15172.m35874(c7745);
                    try {
                        final ArrayList<InterfaceC0467> arrayListM20019 = m20019(c15172M35874.range(c13822.f41235, c13822.f41231), c15172M35875.range(c13822.f41236, c13822.f41234), enumC10296, z, interfaceC13117, new C4701());
                        for (InterfaceC0467 interfaceC0467 : arrayListM20019) {
                            interfaceC0467.mo2071(interfaceC0467.mo2065() + c13822.f41233);
                            interfaceC0467.mo2064(interfaceC0467.mo2063() + c13822.f41233);
                            interfaceC0467.mo15486(interfaceC0467.mo15487() + c13822.f41235);
                            interfaceC0467.mo15484(interfaceC0467.mo15477() + c13822.f41235);
                            interfaceC0467.mo2060(interfaceC0467.mo2068() + c13822.f41232);
                            interfaceC0467.mo2073(interfaceC0467.mo2072() + c13822.f41232);
                            interfaceC0467.mo15482(interfaceC0467.mo15485() + c13822.f41236);
                            interfaceC0467.mo15480(interfaceC0467.mo15489() + c13822.f41236);
                        }
                        c15172M35875.close();
                        try {
                            try {
                                c15172M35874.close();
                                c7745.close();
                                c7744.close();
                                interfaceC7785.setReadOnly(false);
                                interfaceC7786.setReadOnly(false);
                                Runnable runnable = new Runnable() { // from class: l.ܺ۫ᩳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7473.m20028(this.f49227, enumC10296, z, interfaceC13117, i, list, interfaceC7785, interfaceC7786, i2, i3, c13822, arrayListM20019);
                                    }
                                };
                                if (z2) {
                                    runnable.run();
                                } else {
                                    c7473.post(runnable);
                                }
                            } catch (Throwable th) {
                                interfaceC7785.setReadOnly(false);
                                interfaceC7786.setReadOnly(false);
                                throw th;
                            }
                        } catch (Error | RuntimeException e) {
                            c7473.post(new RunnableC23951(2, c7473));
                            throw e;
                        }
                    } catch (Throwable th2) {
                        try {
                            c15172M35875.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        c15172M35874.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                try {
                    c7744.close();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            try {
                c7745.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20045(C7473 c7473) {
        c7473.f23016 = false;
        c7473.f23015 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20028(C7473 c7473, EnumC10296 enumC10296, boolean z, InterfaceC13117 interfaceC13117, int i, List list, InterfaceC7785 interfaceC7785, InterfaceC7785 interfaceC7786, int i2, int i3, C13822 c13822, ArrayList arrayList) {
        try {
            if (c7473.f23017 == enumC10296 && c7473.f23046 == z && c7473.f23021 == interfaceC13117 && i == c7473.f23033.get() && c7473.f23019 == list && !c7473.m20055() && interfaceC7785 == c7473.f23032.m30436() && interfaceC7786 == c7473.f23051.m30436() && i2 == interfaceC7785.mo26548() && i3 == interfaceC7786.mo26548()) {
                List listM20020 = m20020(list, c13822, arrayList);
                synchronized (c7473.f23029) {
                    C6062 c6062 = c7473.f23029;
                    c6062.f18576 = -1;
                    c6062.f18577 = -1;
                    c6062.f18574 = -1;
                    c6062.f18575 = -1;
                }
                c7473.m20044(listM20020);
                c7473.invalidate();
                boolean z2 = c7473.f23041;
                C12392 c12392M20064 = c7473.m20064(z2);
                c7473.m20022(c12392M20064.m30444(), c12392M20064.m30448(), z2);
                c7473.m20058();
            } else if (!c7473.m20055()) {
                c7473.f23015 = true;
            }
            c7473.f23016 = false;
            if (c7473.f23015) {
                c7473.f23015 = false;
                c7473.post(new RunnableC2535(0, c7473));
            }
        } catch (Throwable th) {
            c7473.f23016 = false;
            if (c7473.f23015) {
                c7473.f23015 = false;
                c7473.post(new RunnableC2535(0, c7473));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13822 m20021(List list, C7744 c7744, C7744 c7745, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iMo2072;
        int i8;
        int i9;
        int size = list == null ? 0 : list.size();
        int iM20765 = i == -1 ? -1 : c7744.m20765(i);
        int iM20766 = i2 == -1 ? -1 : c7744.m20765(i2) + 1;
        int iM20767 = i3 == -1 ? -1 : c7745.m20765(i3);
        int iM20768 = i4 == -1 ? -1 : c7745.m20765(i4) + 1;
        int i10 = 0;
        int i11 = size;
        while (i10 < i11) {
            int i12 = (i10 + i11) >>> 1;
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i12);
            if ((iM20765 == -1 || interfaceC0467.mo2063() < iM20765) && (iM20767 == -1 || interfaceC0467.mo2072() < iM20767)) {
                i10 = i12 + 1;
            } else {
                i11 = i12;
            }
        }
        int iMax = Math.max(-1, i10 - 2);
        int i13 = 0;
        int i14 = size;
        while (i13 < i14) {
            int i15 = (i13 + i14) >>> 1;
            InterfaceC0467 interfaceC0468 = (InterfaceC0467) list.get(i15);
            if ((iM20766 == -1 || interfaceC0468.mo2065() > iM20766) && (iM20768 == -1 || interfaceC0468.mo2068() > iM20768)) {
                i14 = i15;
            } else {
                i13 = i15 + 1;
            }
        }
        int iMin = Math.min(size, i13 + 1);
        if (iMax >= 0) {
            InterfaceC0467 interfaceC0469 = (InterfaceC0467) list.get(iMax);
            int iMo15477 = interfaceC0469.mo15477();
            int iMo15489 = interfaceC0469.mo15489();
            int iMo2063 = interfaceC0469.mo2063();
            iMo2072 = interfaceC0469.mo2072();
            i5 = iMo15477;
            i6 = iMo15489;
            i7 = iMo2063;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            iMo2072 = 0;
        }
        int length = c7744.length();
        int length2 = c7745.length();
        if (iMin < size) {
            InterfaceC0467 interfaceC04610 = (InterfaceC0467) list.get(iMin);
            int iMo15487 = interfaceC04610.mo15487();
            int iMo15485 = interfaceC04610.mo15485();
            if (iMo15487 != c7744.length()) {
                iMo15487--;
            }
            if (iMo15485 != c7745.length()) {
                iMo15485--;
            }
            i9 = iMo15485;
            i8 = iMo15487;
        } else {
            i8 = length;
            i9 = length2;
        }
        return new C13822(iMax, iMin, i5, i8, i6, i9, i7, iMo2072);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m20020(List list, C13822 c13822, ArrayList arrayList) {
        if (list == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((list.size() + (arrayList.size() + (c13822.f41230 + 1))) - c13822.f41229);
        for (int i = 0; i <= c13822.f41230; i++) {
            arrayList2.add((InterfaceC0467) list.get(i));
        }
        arrayList2.addAll(arrayList);
        for (int i2 = c13822.f41229; i2 < list.size(); i2++) {
            arrayList2.add((InterfaceC0467) list.get(i2));
        }
        return arrayList2;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f23032.invalidate();
        this.f23051.invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m20075() {
        return this.f23030;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20088(boolean z) {
        if (this.f23030 != z) {
            this.f23030 = z;
            super.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20070(EnumC10296 enumC10296) {
        if (this.f23017 == enumC10296) {
            return;
        }
        C11003.requireNonNull(enumC10296);
        this.f23017 = enumC10296;
        if (this.f23032.m30526() > 0 || this.f23051.m30526() > 0) {
            m20049();
            invalidate();
            m20058();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC10296 m20080() {
        return this.f23017;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20092(boolean z) {
        if (this.f23046 == z) {
            return;
        }
        this.f23046 = z;
        if (this.f23032.m30526() > 0 || this.f23051.m30526() > 0) {
            m20049();
            invalidate();
            m20058();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m20060() {
        return this.f23046;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20072(C14127 c14127) {
        this.f23021 = c14127;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20044(List list) {
        this.f23019 = list;
        this.f23033.incrementAndGet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12392 m20064(boolean z) {
        return z ? this.f23032 : this.f23051;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12392 m20096() {
        return this.f23032;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12392 m20077() {
        return this.f23051;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20076() {
        return this.f23032.m30441() && this.f23051.m30441();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20090(boolean z) {
        this.f23032.m30407(z);
        this.f23051.m30407(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20081() {
        boolean z;
        synchronized (this.f23025) {
            if (this.f23036) {
                z = false;
            } else {
                this.f23036 = true;
                this.f23052 = false;
                this.f23048 = false;
                this.f23033.incrementAndGet();
                z = true;
            }
        }
        if (z) {
            this.f23032.m30346(true, false);
            this.f23051.m30346(true, false);
            this.f23032.m30485();
            this.f23051.m30485();
            this.f23032.m30438();
            this.f23051.m30438();
        }
        C1802.m5993().removeCallbacksAndMessages(this.f23029);
        synchronized (this.f23029) {
            C6062 c6062 = this.f23029;
            c6062.f18576 = -1;
            c6062.f18577 = -1;
            c6062.f18574 = -1;
            c6062.f18575 = -1;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20091() {
        synchronized (this.f23025) {
            if (this.f23036) {
                this.f23036 = false;
                if (this.f23043 || m20039()) {
                    m20065();
                }
                this.f23032.m30439();
                this.f23051.m30439();
                if (!this.f23032.m30493()) {
                    this.f23032.m30371();
                }
                if (!this.f23051.m30493()) {
                    this.f23051.m30371();
                }
                if (this.f23048 || m20039()) {
                    return;
                }
                this.f23032.m30346(false, false);
                this.f23051.m30346(false, false);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private boolean m20055() {
        boolean z;
        synchronized (this.f23025) {
            z = this.f23036;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z2 = this.f23045;
        C12392 c12392 = this.f23051;
        C12392 c12393 = this.f23032;
        if (z2) {
            int iM27878 = C11266.m27878(2.5f);
            int i7 = i6 / 2;
            c12393.layout(0, 0, i5, i7 - iM27878);
            c12392.layout(0, i7 + iM27878, i5, i6);
            return;
        }
        int i8 = i5 / 2;
        c12393.layout(0, 0, i8, i6);
        c12392.layout(i8, 0, i5, i6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20066(CharSequence charSequence, CharSequence charSequence2, AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        C12392 c12392 = this.f23032;
        if (c12392.m30493()) {
            return;
        }
        C12392 c12393 = this.f23051;
        if (c12393.m30493()) {
            return;
        }
        m20048();
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        InterfaceC7785 interfaceC7785M30437 = c12393.m30436();
        this.f23043 = false;
        this.f23050 = null;
        try {
            if (C10975.m27285()) {
                c12392.m30337(abstractC15440, charSequence);
                m20034(interfaceC7785M30436, interfaceC7785M30437);
                if (m20039()) {
                    m20065();
                    return;
                }
                c12393.m30337(abstractC15441, charSequence2);
            } else {
                this.f23043 = true;
                m20044((List) null);
                m20038();
                if (!new C1062(new C9591(this)).m3632(c12392, charSequence, abstractC15440, c12393, charSequence2, abstractC15441)) {
                    m20065();
                    return;
                }
            }
            m20034(interfaceC7785M30436, interfaceC7785M30437);
            if (m20039()) {
                m20065();
                return;
            }
            InterfaceC7785 interfaceC7785M30438 = c12392.m30436();
            InterfaceC7785 interfaceC7785M30439 = c12393.m30436();
            interfaceC7785M30438.setReadOnly(true);
            interfaceC7785M30439.setReadOnly(true);
            this.f23018 = interfaceC7785M30438;
            this.f23020 = interfaceC7785M30439;
            C7744 c7744Mo26562 = interfaceC7785M30438.mo26562();
            try {
                C7744 c7744Mo26563 = interfaceC7785M30439.mo26562();
                try {
                    this.f23038 = c7744Mo26562.m20767();
                    this.f23042 = c7744Mo26563.m20767();
                    this.f23050 = m20063(c7744Mo26562, c7744Mo26563);
                    c7744Mo26563.close();
                    c7744Mo26562.close();
                    m20057();
                    if (m20039()) {
                        m20065();
                    }
                } catch (Throwable th) {
                    try {
                        c7744Mo26563.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c7744Mo26562.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            m20034(interfaceC7785M30436, interfaceC7785M30437);
            m20065();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20034(InterfaceC7785 interfaceC7785, InterfaceC7785 interfaceC7786) {
        if (this.f23043) {
            return;
        }
        if (this.f23032.m30436() == interfaceC7785 && this.f23051.m30436() == interfaceC7786) {
            return;
        }
        this.f23043 = true;
        m20044((List) null);
        m20038();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20065() {
        this.f23048 = true;
        this.f23043 = false;
        this.f23050 = null;
        try {
            this.f23032.m30308();
            this.f23051.m30308();
        } finally {
            m20048();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m20048() {
        InterfaceC7785 interfaceC7785 = this.f23018;
        InterfaceC7785 interfaceC7786 = this.f23020;
        this.f23020 = null;
        this.f23018 = null;
        if (interfaceC7785 != null) {
            interfaceC7785.setReadOnly(false);
            interfaceC7786.setReadOnly(false);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m20085() {
        this.f23032.m30386();
        this.f23051.m30386();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m20094() {
        return this.f23032.m30370() || this.f23051.m30370();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20089() {
        C12392 c12392 = this.f23032;
        try {
            InterfaceC7785 interfaceC7785 = this.f23018;
            InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
            C12392 c12393 = this.f23051;
            if (interfaceC7785 == interfaceC7785M30436 && this.f23020 == c12393.m30436() && this.f23038 == this.f23018.mo26548() && this.f23042 == this.f23020.mo26548()) {
                m20044(this.f23050);
            } else {
                m20044((List) null);
                post(new RunnableC23516(1, this));
            }
            this.f23050 = null;
            this.f23043 = false;
            c12392.m30360();
            c12393.m30360();
            boolean zM30437 = c12392.m30437();
            boolean zM30438 = c12393.m30437();
            if (zM30437 && !zM30438) {
                c12393.m30382(true);
            } else if (!zM30437 && zM30438) {
                c12392.m30382(true);
            }
            invalidate();
            m20058();
        } finally {
            m20048();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20087() {
        this.f23052 = true;
        this.f23031.m13774();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m20039() {
        return this.f23052 || this.f23032.m30493() || this.f23051.m30493();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m20057() {
        if (C10975.m27285()) {
            return;
        }
        boolean z = false;
        while (m20094()) {
            if (m20039()) {
                this.f23032.m30462();
                this.f23051.m30462();
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
                z = true;
                this.f23052 = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m20093() {
        return this.f23041;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12392 m20095() {
        return this.f23041 ? this.f23032 : this.f23051;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m20083() {
        List list = this.f23019;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20062(int i, boolean z) {
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i3);
            int iMo15478 = interfaceC0467.mo15478(z);
            int iMo15483 = interfaceC0467.mo15483(z);
            if (i < iMo15478) {
                size = i3 - 1;
            } else {
                if (i <= iMo15483 && (i != iMo15483 || iMo15478 >= iMo15483)) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m20086() {
        InterfaceC0467 interfaceC0467;
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = this.f23041;
        int iM30444 = (z ? this.f23032 : this.f23051).m30444();
        int i = 0;
        while (true) {
            if (i >= this.f23019.size()) {
                interfaceC0467 = null;
                break;
            }
            interfaceC0467 = (InterfaceC0467) this.f23019.get(i);
            if (interfaceC0467.mo15478(z) > iM30444) {
                break;
            } else {
                i++;
            }
        }
        if (interfaceC0467 == null) {
            interfaceC0467 = (InterfaceC0467) this.f23019.get(0);
        }
        m20035(z, (InterfaceC18813) interfaceC0467, true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20074() {
        InterfaceC0467 interfaceC0467;
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = this.f23041;
        int iM30444 = (z ? this.f23032 : this.f23051).m30444();
        int size = this.f23019.size() - 1;
        while (true) {
            if (size < 0) {
                interfaceC0467 = null;
                break;
            }
            interfaceC0467 = (InterfaceC0467) this.f23019.get(size);
            if (interfaceC0467.mo15483(z) < iM30444) {
                break;
            } else {
                size--;
            }
        }
        if (interfaceC0467 == null) {
            interfaceC0467 = (InterfaceC0467) C7166.m19188(1, this.f23019);
            this.f23019.size();
        }
        m20035(z, (InterfaceC18813) interfaceC0467, true);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m20079() {
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        boolean z = this.f23041;
        C12392 c12392 = z ? this.f23032 : this.f23051;
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        m20035(z, (InterfaceC18813) this.f23019.get(0), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20035(boolean z, InterfaceC18813 interfaceC18813, boolean z2) {
        int iMo15478 = interfaceC18813.mo15478(z);
        C12392 c12392 = z ? this.f23032 : this.f23051;
        if (c12392.m30505()) {
            c12392.m30400();
            c12392.mo25919(iMo15478);
            c12392.m30404();
            int iM13620 = (int) this.f23047.m13620(c12392);
            int iM24484 = (int) (c12392.f37245.m24484() * c12392.f37258.m9790(iMo15478));
            if (z2) {
                c12392.m30411(0, c12392.m30521(iM24484 - iM13620));
            } else {
                c12392.scrollTo(0, c12392.m30521(iM24484 - iM13620));
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m20049() {
        C12392 c12392 = this.f23032;
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        C12392 c12393 = this.f23051;
        InterfaceC7785 interfaceC7785M30437 = c12393.m30436();
        interfaceC7785M30436.setReadOnly(true);
        interfaceC7785M30437.setReadOnly(true);
        try {
            C7744 c7744Mo26562 = interfaceC7785M30436.mo26562();
            try {
                C7744 c7744Mo26563 = interfaceC7785M30437.mo26562();
                try {
                    ArrayList arrayListM20063 = m20063(c7744Mo26562, c7744Mo26563);
                    if (interfaceC7785M30436 == c12392.m30436() && interfaceC7785M30437 == c12393.m30436() && c7744Mo26562.m20767() == interfaceC7785M30436.mo26548() && c7744Mo26563.m20767() == interfaceC7785M30437.mo26548()) {
                        m20044(arrayListM20063);
                    } else {
                        m20044((List) null);
                        post(new RunnableC0417(0, this));
                    }
                    c7744Mo26563.close();
                    c7744Mo26562.close();
                    interfaceC7785M30436.setReadOnly(false);
                    interfaceC7785M30437.setReadOnly(false);
                } catch (Throwable th) {
                    try {
                        c7744Mo26563.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c7744Mo26562.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            interfaceC7785M30436.setReadOnly(false);
            interfaceC7785M30437.setReadOnly(false);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m20063(C7744 c7744, C7744 c7745) {
        C15172 c15172M35874 = C15172.m35874(c7744);
        try {
            C15172 c15172M35875 = C15172.m35874(c7745);
            try {
                ArrayList arrayListM20019 = m20019(c15172M35874.range(0, c15172M35874.length()), c15172M35875.range(0, c15172M35875.length()), this.f23017, this.f23046, this.f23021, this.f23031);
                c15172M35875.close();
                c15172M35874.close();
                return arrayListM20019;
            } catch (Throwable th) {
                try {
                    c15172M35875.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c15172M35874.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20019(CharSequence charSequence, CharSequence charSequence2, EnumC10296 enumC10296, boolean z, InterfaceC13117 interfaceC13117, C4701 c4701) {
        EnumC5491 enumC5491;
        if (!z) {
            C11720 c11720 = new C11720(charSequence);
            charSequence2 = new C11720(charSequence2);
            charSequence = c11720;
        }
        int i = C20174.f65303[enumC10296.ordinal()];
        if (i == 1) {
            enumC5491 = EnumC5491.DEFAULT;
        } else if (i == 2) {
            enumC5491 = EnumC5491.TRIM_WHITESPACES;
        } else if (i == 3 || i == 4) {
            enumC5491 = EnumC5491.IGNORE_WHITESPACES;
        } else {
            throw new RuntimeException();
        }
        int i2 = 0;
        boolean z2 = enumC10296 == EnumC10296.IGNORE_WHITESPACES_AND_EMPTY_LINES;
        c4701.m13777();
        ArrayList arrayListM2298 = C0551.m2298(charSequence, charSequence2, C15283.m36291(charSequence), C15283.m36291(charSequence2), enumC5491, EnumC21719.WORDS, c4701);
        if (!c4701.m13776()) {
            if (interfaceC13117 != null) {
                Iterator it = arrayListM2298.iterator();
                while (it.hasNext()) {
                    InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
                    String strSubstring = TextUtils.substring(charSequence, interfaceC0467.mo15487(), interfaceC0467.mo15477());
                    String strSubstring2 = TextUtils.substring(charSequence2, interfaceC0467.mo15485(), interfaceC0467.mo15489());
                    InterfaceC10798 interfaceC10798ListIterator = ((C19119) ((C14127) interfaceC13117).f42611).listIterator(0);
                    while (interfaceC10798ListIterator.hasNext()) {
                        C12164 c12164 = (C12164) interfaceC10798ListIterator.next();
                        c12164.m29615reset((CharSequence) strSubstring);
                        if (c12164.matches()) {
                            c12164.m29615reset((CharSequence) strSubstring2);
                            if (c12164.matches()) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayListM2298.isEmpty()) {
                return arrayListM2298;
            }
            final ArrayList arrayList = new ArrayList();
            final CharSequence charSequence3 = charSequence;
            final CharSequence charSequence4 = charSequence2;
            final EnumC5491 enumC5492 = enumC5491;
            final boolean z3 = z2;
            Consumer consumer = new Consumer() { // from class: l.᩵ܿۘ
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C23517.$default$andThen(this, consumer2);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0090  */
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    int i3;
                    Object c5407;
                    List listSingletonList;
                    CharSequence charSequence5;
                    CharSequence charSequence6;
                    List list = (List) obj;
                    int size = list.size();
                    if (!z3) {
                        i3 = 0;
                    } else if (enumC5492 == EnumC5491.IGNORE_WHITESPACES) {
                        i3 = 0;
                        while (true) {
                            charSequence5 = charSequence3;
                            charSequence6 = charSequence4;
                            if (i3 >= size) {
                                break;
                            }
                            InterfaceC0467 interfaceC0468 = (InterfaceC0467) list.get(i3);
                            C17673 c17673 = new C17673(interfaceC0468.mo15487(), interfaceC0468.mo15477(), charSequence5);
                            C17673 c17674 = new C17673(interfaceC0468.mo15485(), interfaceC0468.mo15489(), charSequence6);
                            if ((interfaceC0468.mo2067() == null || !interfaceC0468.mo2067().isEmpty()) && !C11250.m27831(c17673, c17674)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        while (i3 < size) {
                            InterfaceC0467 interfaceC0469 = (InterfaceC0467) list.get(size - 1);
                            C17673 c17675 = new C17673(interfaceC0469.mo15487(), interfaceC0469.mo15477(), charSequence5);
                            C17673 c17676 = new C17673(interfaceC0469.mo15485(), interfaceC0469.mo15489(), charSequence6);
                            if ((interfaceC0469.mo2067() == null || !interfaceC0469.mo2067().isEmpty()) && !C11250.m27831(c17675, c17676)) {
                                break;
                            } else {
                                size--;
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    if (i3 == size) {
                        listSingletonList = Collections.EMPTY_LIST;
                    } else {
                        List<InterfaceC0467> listSubList = list.subList(i3, size);
                        if (listSubList.size() == 1) {
                            c5407 = (InterfaceC0467) listSubList.get(0);
                        } else {
                            InterfaceC0467 interfaceC04610 = (InterfaceC0467) listSubList.get(0);
                            InterfaceC0467 interfaceC04611 = (InterfaceC0467) C7166.m19188(1, listSubList);
                            ArrayList arrayList2 = new ArrayList();
                            for (InterfaceC0467 interfaceC04612 : listSubList) {
                                for (InterfaceC18813 interfaceC18813 : interfaceC04612.mo2067() != null ? interfaceC04612.mo2067() : Collections.singletonList(new C19519(0, interfaceC04612.mo15477() - interfaceC04612.mo15487(), 0, interfaceC04612.mo15489() - interfaceC04612.mo15485()))) {
                                    int iMo15487 = interfaceC04612.mo15487() - interfaceC04610.mo15487();
                                    int iMo15485 = interfaceC04612.mo15485() - interfaceC04610.mo15485();
                                    InterfaceC18813 interfaceC18814 = (InterfaceC18813) (arrayList2.isEmpty() ? null : C18566.m43105(arrayList2, 1));
                                    if (interfaceC18814 != null && interfaceC18814.mo15477() == interfaceC18813.mo15487() + iMo15487 && interfaceC18814.mo15489() == interfaceC18813.mo15485() + iMo15485) {
                                        arrayList2.remove(arrayList2.size() - 1);
                                        arrayList2.add(new C19519(interfaceC18814.mo15487(), interfaceC18813.mo15477() + iMo15487, interfaceC18814.mo15485(), interfaceC18813.mo15489() + iMo15485));
                                    } else {
                                        arrayList2.add(new C19519(interfaceC18813.mo15487() + iMo15487, interfaceC18813.mo15477() + iMo15487, interfaceC18813.mo15485() + iMo15485, interfaceC18813.mo15489() + iMo15485));
                                    }
                                }
                            }
                            c5407 = new C5407(interfaceC04610.mo2065(), interfaceC04611.mo2063(), interfaceC04610.mo2068(), interfaceC04611.mo2072(), interfaceC04610.mo15487(), interfaceC04611.mo15477(), interfaceC04610.mo15485(), interfaceC04611.mo15489(), arrayList2);
                        }
                        listSingletonList = Collections.singletonList(c5407);
                    }
                    arrayList.addAll(listSingletonList);
                }
            };
            for (int i3 = 1; i3 < arrayListM2298.size(); i3++) {
                InterfaceC0467 interfaceC0468 = (InterfaceC0467) arrayListM2298.get(i3 - 1);
                InterfaceC0467 interfaceC0469 = (InterfaceC0467) arrayListM2298.get(i3);
                if (interfaceC0468.mo2063() != interfaceC0469.mo2065() || interfaceC0468.mo2072() != interfaceC0469.mo2068() || interfaceC0468.mo15477() != interfaceC0469.mo15487() || interfaceC0468.mo15489() != interfaceC0469.mo15485()) {
                    consumer.n(arrayListM2298.subList(i2, i3));
                    i2 = i3;
                }
            }
            if (i2 < arrayListM2298.size()) {
                consumer.n(arrayListM2298.subList(i2, arrayListM2298.size()));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // l.InterfaceC16685
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20073(float f, float f2) {
        return this.f23032.mo20073(f, f2) || this.f23051.mo20073(f, f2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20068(RunnableC4196 runnableC4196) {
        this.f23034 = runnableC4196;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m20058() {
        if (this.f23034 != null) {
            if (C10975.m27285()) {
                this.f23034.run();
            } else {
                C4925.m14315(this.f23034);
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m20038() {
        if (C10975.m27285()) {
            invalidate();
            m20058();
        } else {
            C4925.m14315(new RunnableC8885(0, this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20023(C7473 c7473) {
        c7473.invalidate();
        c7473.m20058();
    }
}
