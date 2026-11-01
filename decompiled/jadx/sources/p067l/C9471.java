package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
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
public class C9471 extends ViewGroup implements InterfaceC18226 {

    /* JADX INFO: renamed from: ۗ֫ */
    public static final /* synthetic */ int f25926 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f25927;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f25928;

    /* JADX INFO: renamed from: ֫֫ */
    public EnumC12154 f25929;

    /* JADX INFO: renamed from: ۖ֫ */
    public InterfaceC9768 f25930;

    /* JADX INFO: renamed from: ۗ */
    public List f25931;

    /* JADX INFO: renamed from: ۘ֫ */
    public InterfaceC9768 f25932;

    /* JADX INFO: renamed from: ۙ */
    public C15795 f25933;

    /* JADX INFO: renamed from: ۙ֫ */
    public final float[] f25934;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f25935;

    /* JADX INFO: renamed from: ۛ */
    public boolean f25936;

    /* JADX INFO: renamed from: ۜ֫ */
    public final Object f25937;

    /* JADX INFO: renamed from: ۟ */
    public final C14165 f25938;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f25939;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Path f25940;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C8130 f25941;

    /* JADX INFO: renamed from: ۤ */
    public boolean f25942;

    /* JADX INFO: renamed from: ۧ֫ */
    public C6836 f25943;

    /* JADX INFO: renamed from: ۨ */
    public final C14146 f25944;

    /* JADX INFO: renamed from: ۫ */
    public final AtomicInteger f25945;

    /* JADX INFO: renamed from: ۬ */
    public RunnableC6357 f25946;

    /* JADX INFO: renamed from: ܰ */
    public final C14165 f25947;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f25948;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f25949;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f25950;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f25951;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C7350 f25952;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f25953;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f25954;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f25955;

    /* JADX INFO: renamed from: ᩶ */
    public final int f25956;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f25957;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f25958;

    /* JADX INFO: renamed from: ᩸ */
    public final C6789 f25959;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f25960;

    /* JADX INFO: renamed from: ᩹ */
    public final int f25961;

    /* JADX INFO: renamed from: ᩹֫ */
    public ArrayList f25962;

    /* JADX INFO: renamed from: ᩺ */
    public final C14146 f25963;

    /* JADX INFO: renamed from: ᩻֫ */
    public volatile boolean f25964;

    public C9471(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9471(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25947 = new C14165();
        this.f25938 = new C14165();
        C8130 c8130 = new C8130();
        c8130.f21431 = -1;
        c8130.f21430 = -1;
        c8130.f21433 = -1;
        c8130.f21432 = -1;
        this.f25941 = c8130;
        this.f25937 = new Object();
        this.f25945 = new AtomicInteger();
        this.f25959 = new C6789(this);
        this.f25940 = new Path();
        this.f25934 = new float[4];
        this.f25943 = new C6836();
        this.f25953 = true;
        this.f25952 = new C7350(Boolean.TRUE);
        this.f25958 = true;
        this.f25929 = EnumC12154.DO_NOT_IGNORE;
        this.f25942 = false;
        this.f25957 = false;
        this.f25949 = true;
        this.f25939 = true;
        this.f25935 = 300;
        setMotionEventSplittingEnabled(false);
        C14146 c14146 = new C14146(context, null);
        this.f25944 = c14146;
        C14146 c14147 = new C14146(context, null);
        this.f25963 = c14147;
        addView(c14146);
        addView(c14147);
        c14146.m32377(new C23553(this, true));
        c14147.m32377(new C23553(this, false));
        c14146.m32510();
        c14147.m32510();
        c14146.m32525();
        c14147.m32525();
        c14146.m32483();
        c14147.m32483();
        this.f25961 = C23223.m51761(-13158601, -1309);
        this.f25956 = C23223.m51761(-9803710, -332368);
        C14146.m32206(c14146, c14147);
        C23929 c23929 = c14146.f40262;
        C23929 c239210 = c14147.f40262;
        c23929.f75993 = 0;
        c239210.f75993 = 0;
        c23929.f76003 = true;
        c239210.f76003 = true;
        c23929.f75989 = true;
        c239210.f75989 = true;
        c23929.f76011 = true;
        c239210.f76011 = true;
        c23929.f75965 = true;
        c239210.f75965 = true;
        c23929.f75960 = true;
        c239210.f75960 = true;
        boolean z = this.f25957;
        c23929.f76016 = z;
        c239210.f76016 = true;
        c23929.f76002 = 0;
        c239210.f76002 = 0;
        c23929.f75979 = 1.0f;
        c239210.f75979 = 1.0f;
        boolean z2 = this.f25949;
        c23929.f75968 = z2;
        c239210.f75968 = z2;
        if (z) {
            int intrinsicHeight = c23929.f75956.getIntrinsicHeight() * 2;
            c239210.f75984 = intrinsicHeight;
            c23929.f75984 = intrinsicHeight;
        }
        int i2 = c23929.f76012;
        int iAlpha = (i2 & 16777215) | (((int) (Color.alpha(i2) * 0.5f)) << 24);
        c239210.f76012 = iAlpha;
        c23929.f76012 = iAlpha;
        c23929.f75978 = new C10142(this);
        c239210.f75978 = new C16846(this);
        c14146.m32385(new C6395(3, this));
        c14147.m32385(new C4183(this));
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: l.ۘ۫ᩳ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                C9471.m22001(this.f15382, view, z3);
            }
        };
        c14146.setOnFocusChangeListener(onFocusChangeListener);
        c14147.setOnFocusChangeListener(onFocusChangeListener);
        c14146.m32394(new InterfaceC10005() { // from class: l.ᩴ۫ᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i3, int i4) {
                C9471.m22021(this.f62498, i3, i4);
            }
        });
        c14147.m32394(new InterfaceC10005() { // from class: l.᩵۫ᩳ
            @Override // p067l.InterfaceC10005
            /* JADX INFO: renamed from: ֫ */
            public final void mo4046(int i3, int i4) {
                C9471.m21999(this.f65578, i3, i4);
            }
        });
        c14146.f40316 = new C24223(this, true);
        c14147.f40316 = new C24223(this, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22000(C9471 c9471, int i, int i2, int i3) {
        if (c9471.f25939) {
            C14146 c14146 = c9471.f25944;
            C14146 c14147 = c9471.f25963;
            if (c14146.isFocused() || c14146.isPressed()) {
                if (i == i3) {
                    c14147.m32456(i2, c14147.m32472());
                    c9471.invalidate();
                    return;
                }
                C6789 c6789 = c9471.f25959;
                if (c6789.m15494(c14146, c14147, true)) {
                    float fM26496 = c14146.f40262.m26496();
                    float fM15495 = (c6789.m15495(c14146) - ((c6789.f17577 * fM26496) - i3)) / fM26496;
                    int i4 = c6789.f17578;
                    int i5 = c6789.f17579;
                    i3 = (int) (((((i4 - i5) * fM15495) + i5) * fM26496) - c6789.m15495(c14147));
                }
                c14147.m32456(i2, i3);
                c9471.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m22022(C9471 c9471, int i, int i2, int i3) {
        if (c9471.f25939) {
            C14146 c14146 = c9471.f25963;
            C14146 c14147 = c9471.f25944;
            if (c14146.isFocused() || c14146.isPressed()) {
                if (i == i3) {
                    c14147.m32456(i2, c14147.m32472());
                    c9471.invalidate();
                    return;
                }
                C6789 c6789 = c9471.f25959;
                if (c6789.m15494(c14146, c14147, false)) {
                    float fM26496 = c14146.f40262.m26496();
                    float fM15495 = (c6789.m15495(c14146) - ((c6789.f17577 * fM26496) - i3)) / fM26496;
                    int i4 = c6789.f17578;
                    int i5 = c6789.f17579;
                    i3 = (int) (((((i4 - i5) * fM15495) + i5) * fM26496) - c6789.m15495(c14147));
                }
                c14147.m32456(i2, i3);
                c9471.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22001(C9471 c9471, View view, boolean z) {
        if (z) {
            boolean z2 = view == c9471.f25944;
            if (c9471.f25953 != z2) {
                c9471.f25953 = z2;
                c9471.f25952.mo4067(Boolean.valueOf(z2));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m22021(C9471 c9471, int i, int i2) {
        C14146 c14146 = c9471.f25963;
        if (c9471.f25949 && c9471.f25953) {
            c9471.m21997(i, i2, true);
            c14146.invalidate();
        } else if (c9471.f25957) {
            c14146.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m21999(C9471 c9471, int i, int i2) {
        C14146 c14146 = c9471.f25944;
        if (c9471.f25949 && !c9471.f25953) {
            c9471.m21997(i, i2, false);
            c14146.invalidate();
        } else if (c9471.f25957) {
            c14146.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m21997(int i, int i2, boolean z) {
        int iM22018;
        int iM22019;
        List list = this.f25931;
        if (list == null) {
            return;
        }
        C14146 c14146 = this.f25963;
        C14146 c14147 = this.f25944;
        C14146 c14148 = z ? c14147 : c14146;
        if (!z) {
            c14146 = c14147;
        }
        int length = c14148.m32500().length();
        int length2 = c14146.m32500().length();
        if (i == i2) {
            iM22018 = m22018(z, i, length, length2, list);
            iM22019 = iM22018;
        } else {
            iM22018 = m22018(z, i, length, length2, list);
            iM22019 = m22018(z, i2, length, length2, list);
        }
        c14146.mo27944(iM22018, iM22019);
        c14146.m32468();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[RETURN] */
    /* JADX INFO: renamed from: ۧ */
    public static int m22018(boolean z, int i, int i2, int i3, List list) {
        InterfaceC20248 interfaceC20248;
        int iMo17394;
        int iMo17389;
        InterfaceC20248 interfaceC20249;
        int iMo17395;
        List listMo4447;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC20248 interfaceC202410 = (InterfaceC20248) list.get(i4);
            int iMo173810 = interfaceC202410.mo17389(z);
            int iMo17396 = interfaceC202410.mo17394(z);
            if (iMo173810 > i || (i == i2 && iMo173810 == i && iMo173810 == iMo17396)) {
                if (i4 > 0 && (i = (i - interfaceC20249.mo17394(z)) + (iMo17395 = (interfaceC20249 = (InterfaceC20248) list.get(i4 - 1)).mo17394(!z))) < iMo17395) {
                    i = iMo17395;
                }
                int i5 = i4 + 1;
                if (i5 < size && i > (iMo17389 = ((InterfaceC20248) list.get(i5)).mo17389(!z))) {
                    i = iMo17389;
                }
                if (i > i3) {
                    return i3;
                }
                return i;
            }
            if (iMo17396 > i || (i == i2 && iMo17396 == i)) {
                boolean z2 = !z;
                int iMo173811 = interfaceC202410.mo17389(z2);
                int iMo17397 = interfaceC202410.mo17394(z2);
                int iM22018 = i - iMo173810;
                if ((interfaceC202410 instanceof InterfaceC2812) && (listMo4447 = ((InterfaceC2812) interfaceC202410).mo4447()) != null) {
                    iM22018 = m22018(z, iM22018, interfaceC202410.mo17394(z) - interfaceC202410.mo17389(z), iMo17397 - iMo173811, listMo4447);
                }
                int i6 = iM22018 + iMo173811;
                if (i6 < iMo173811) {
                    return iMo173811;
                }
                return i6 > iMo17397 ? iMo17397 : i6;
            }
        }
        if (size > 0 && i >= (iMo17394 = (interfaceC20248 = (InterfaceC20248) list.get(size - 1)).mo17394(z))) {
            i = (i - iMo17394) + interfaceC20248.mo17394(!z);
        }
        if (i < 0) {
            return 0;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m22053() {
        return this.f25957;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m22072(boolean z) {
        if (this.f25957 != z) {
            this.f25957 = z;
            C23929 c23929 = this.f25944.f40262;
            c23929.f76016 = z;
            C14146 c14146 = this.f25963;
            if (z) {
                C23929 c239210 = c14146.f40262;
                int intrinsicHeight = c23929.f75956.getIntrinsicHeight() * 2;
                c239210.f75984 = intrinsicHeight;
                c23929.f75984 = intrinsicHeight;
            } else {
                C23929 c239211 = c14146.f40262;
                int intrinsicHeight2 = c23929.f75956.getIntrinsicHeight() * 3;
                c239211.f75984 = intrinsicHeight2;
                c23929.f75984 = intrinsicHeight2;
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22059(boolean z) {
        this.f25939 = z;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m22036() {
        return this.f25939;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22042(ActivityC4030 activityC4030, C20439 c20439) {
        this.f25952.m4066(activityC4030, new C6220(1, c20439));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22044(C11996 c11996) {
        c11996.writeInt(631841030);
        c11996.m27445(this.f25953);
        c11996.m27445(this.f25958);
        c11996.writeByte(this.f25929.ordinal());
        c11996.mo15113(8454);
        c11996.m27445(this.f25942);
        c11996.m27445(this.f25957);
        c11996.m27445(this.f25949);
        c11996.mo15113(8454);
        c11996.m27445(this.f25939);
        if (this.f25931 == null) {
            c11996.writeByte(0);
        } else {
            c11996.m27445(true);
            c11996.writeInt(this.f25931.size());
            Iterator it = this.f25931.iterator();
            while (it.hasNext()) {
                ((InterfaceC2812) it.next()).mo17390(c11996);
            }
        }
        this.f25944.m32395(c11996, true);
        this.f25963.m32395(c11996, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22046(C14677 c14677, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        C23395.m52060((InterfaceC21384) c14677, 631841030);
        List list = null;
        m22019((List) null);
        this.f25953 = c14677.m33585();
        C7350 c7350 = this.f25952;
        boolean zBooleanValue = ((Boolean) c7350.m4060()).booleanValue();
        boolean z = this.f25953;
        if (zBooleanValue != z) {
            c7350.mo4062(Boolean.valueOf(z));
        }
        this.f25958 = c14677.m33585();
        this.f25929 = EnumC12154.values()[c14677.readByte() & 255];
        boolean zM33584 = c14677.m33584(8454);
        C14146 c14146 = this.f25963;
        C14146 c14147 = this.f25944;
        if (zM33584) {
            m22063(c14677.m33585());
            m22072(c14677.m33585());
            boolean zM33585 = c14677.m33585();
            this.f25949 = zM33585;
            c14147.f40262.f75968 = zM33585;
            c14146.f40262.f75968 = zM33585;
            invalidate();
        }
        if (c14677.m33584(8454)) {
            this.f25939 = c14677.m33585();
        }
        boolean zM33586 = c14677.m33585();
        if (zM33586) {
            int i = c14677.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C7507(c14677));
            }
            list = arrayList;
        }
        c14147.mo27918(c14677);
        c14146.mo27918(c14677);
        if (zM33586) {
            m22019(list);
        } else {
            m22024();
        }
        m22013();
        if (this.f25953) {
            if (c14146.isFocused()) {
                post(new RunnableC19354(c14147, 1));
            }
        } else if (c14147.isFocused()) {
            post(new RunnableC19354(c14146, 1));
        }
        m22032();
        if (abstractC17043 != null) {
            c14147.m32400(abstractC17043);
        }
        if (abstractC17044 != null) {
            c14146.m32400(abstractC17044);
        }
        m22032();
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
    /* JADX INFO: renamed from: ֫ */
    public static void m22008(C9471 c9471, boolean z, C22076 c22076, int i, int i2, int i3, Canvas canvas, Paint paint, C23929 c23929) {
        Paint paint2;
        InterfaceC2812 interfaceC2812;
        int i4;
        int i5;
        C17441 c17441;
        C9471 c9472;
        C17441 c17442;
        float f;
        float f2;
        float f3;
        float fM11830;
        int i6;
        float f4;
        int i7;
        float f5;
        InterfaceC2812 interfaceC2813;
        int iMo17389;
        int iMo17394;
        boolean z2 = z;
        int i8 = c9471.f25956;
        C14146 c14146 = c9471.f25963;
        C14146 c14147 = c9471.f25944;
        AbstractC5390 abstractC5390 = c9471.m22039(z).f40275;
        List list = c9471.f25931;
        if (list == null || !c9471.m22039(z).m32569()) {
            return;
        }
        C14165 c14165 = z2 ? c9471.f25947 : c9471.f25938;
        C14146 c14146M22039 = c9471.m22039(z);
        c14165.getClass();
        C17441 c17443 = c14165.f40396;
        InterfaceC9768 interfaceC9768M32500 = c14146M22039.m32500();
        c14165.f40404 = interfaceC9768M32500;
        c14165.f40403 = interfaceC9768M32500.mo28581();
        c14165.f40398 = list;
        C12826.requireNonNull(c23929);
        c14165.f40397 = c23929;
        C12826.requireNonNull(c22076);
        c14165.f40401 = c22076;
        c14165.f40399 = i;
        c14165.f40402 = i2;
        c17443.clear();
        if (c9471.f25957) {
            boolean z3 = c9471.f25953;
            C14146 c14148 = z3 ? c14147 : c14146;
            int length = c14148.m32500().length();
            int iM32508 = c14148.m32508();
            if (iM32508 != c14148.m32512()) {
                paint2 = paint;
                interfaceC2812 = null;
            } else {
                if (z2) {
                    c14146 = c14147;
                }
                int size = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 <= size) {
                        if (i9 == size) {
                            iMo17394 = length;
                            iMo17389 = iMo17394;
                            interfaceC2813 = null;
                        } else {
                            interfaceC2813 = (InterfaceC2812) list.get(i9);
                            iMo17389 = interfaceC2813.mo17389(z3);
                            iMo17394 = interfaceC2813.mo17394(z3);
                        }
                        if (iMo17389 > iM32508 || (iM32508 == length && iMo17389 == iM32508 && iMo17389 == iMo17394)) {
                            if (z3 != z2 && i9 > 0) {
                                InterfaceC2812 interfaceC2814 = (InterfaceC2812) list.get(i9 - 1);
                                iM32508 = (iM32508 - interfaceC2814.mo17394(z3)) + interfaceC2814.mo17394(z2);
                            }
                            int iM11834 = c14146.f40275.m11834(iM32508);
                            if (iM11834 >= c14165.f40399 && iM11834 <= c14165.f40402) {
                                int iM49693 = c22076.m49693(iM11834);
                                int iM49692 = c22076.m49692(iM11834);
                                float fM11831 = abstractC5390.m11830(iM49693);
                                float fM11832 = abstractC5390.m11830(iM49692 + 1);
                                paint2 = paint;
                                paint2.setColor(i8);
                                canvas.drawRect(0.0f, fM11831, i3, fM11832, paint);
                                c17443.add((int) fM11831);
                                c17443.add((int) fM11832);
                                c17443.add(-1);
                                c17443.add(0);
                            }
                            interfaceC2812 = null;
                        } else if (interfaceC2813 == null || (iMo17394 <= iM32508 && !(iM32508 == length && iMo17394 == iM32508))) {
                            i9++;
                            size = size;
                        } else {
                            paint2 = paint;
                            interfaceC2812 = interfaceC2813;
                        }
                    }
                    paint2 = paint;
                    interfaceC2812 = null;
                }
            }
        } else {
            paint2 = paint;
            interfaceC2812 = null;
        }
        int iM49684 = c14165.f40401.m49684(c14165.f40399);
        int iM49685 = c14165.f40401.m49684(c14165.f40402) + 1;
        float fM26503 = c14165.f40397.m26503() / 16.0f;
        Iterator it = list.iterator();
        while (true) {
            C9471 c9473 = c9471;
            Paint paint3 = paint2;
            while (it.hasNext()) {
                InterfaceC2812 interfaceC2815 = (InterfaceC2812) it.next();
                int iMo4445 = z2 ? interfaceC2815.mo4445() : interfaceC2815.mo4448();
                Iterator it2 = it;
                int iMo4443 = z2 ? interfaceC2815.mo4443() : interfaceC2815.mo4452();
                if (iMo4443 >= iM49684) {
                    if (iMo4445 > iM49685) {
                        i4 = iM49684;
                        i5 = iM49685;
                        c17442 = c17443;
                    } else {
                        i5 = iM49685;
                        EnumC5448 enumC5448M11961 = EnumC5448.m11961(interfaceC2815);
                        i4 = iM49684;
                        int iM49694 = c22076.m49694(iMo4445, (iMo4445 - iM49684) + i);
                        c17442 = c17443;
                        if (iM49694 == -1) {
                            if (iMo4445 == c22076.m49695().f38063 + 1) {
                                iM49694 = c22076.size();
                            }
                        }
                        if (c9473.f25957) {
                            f = 0.0f;
                        } else {
                            if (z2) {
                                C23929 c239210 = c14165.f40397;
                                f2 = i3 - (c239210.f75979 * c239210.f75970);
                                f3 = 0.0f;
                            } else {
                                C23929 c239211 = c14165.f40397;
                                f = c239211.f75979 * c239211.f75970;
                            }
                            fM11830 = abstractC5390.m11830(iM49694);
                            if (iMo4445 == iMo4443) {
                                if (iM49694 == 0) {
                                    f5 = fM11830 + fM26503 + fM26503;
                                } else if (iM49694 == c22076.size()) {
                                    f4 = (fM11830 - fM26503) - fM26503;
                                } else {
                                    f5 = fM11830 + fM26503;
                                    fM11830 -= fM26503;
                                }
                                float f6 = fM11830;
                                fM11830 = f5;
                                f4 = f6;
                            } else {
                                i6 = 1;
                                while (true) {
                                    iM49694++;
                                    if (iM49694 > i2 || c22076.m49684(iM49694) >= iMo4443) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                f4 = fM11830;
                                fM11830 = (c14165.f40397.m26496() * i6) + fM11830;
                            }
                            if (interfaceC2815 == interfaceC2812) {
                                paint3.setColor(i8);
                            } else {
                                paint3.setColor(enumC5448M11961.f13005);
                            }
                            canvas.drawRect(f3, f4, f2, fM11830, paint3);
                            c17442.add((int) f4);
                            c17442.add((int) fM11830);
                            c17442.add(enumC5448M11961.ordinal());
                            if (interfaceC2815.mo4447() == null) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            c17442.add(i7);
                            z2 = z;
                            paint2 = paint;
                            c17443 = c17442;
                            iM49685 = i5;
                            iM49684 = i4;
                            it = it2;
                        }
                        f2 = i3;
                        f3 = f;
                        fM11830 = abstractC5390.m11830(iM49694);
                        if (iMo4445 == iMo4443) {
                            if (iM49694 == 0) {
                                f5 = fM11830 + fM26503 + fM26503;
                            } else if (iM49694 == c22076.size()) {
                                f4 = (fM11830 - fM26503) - fM26503;
                            } else {
                                f5 = fM11830 + fM26503;
                                fM11830 -= fM26503;
                            }
                            float f7 = fM11830;
                            fM11830 = f5;
                            f4 = f7;
                        } else {
                            i6 = 1;
                            while (true) {
                                iM49694++;
                                if (iM49694 > i2) {
                                    break;
                                }
                                break;
                                break;
                                i6++;
                            }
                            f4 = fM11830;
                            fM11830 = (c14165.f40397.m26496() * i6) + fM11830;
                        }
                        if (interfaceC2815 == interfaceC2812) {
                            paint3.setColor(i8);
                        } else {
                            paint3.setColor(enumC5448M11961.f13005);
                        }
                        canvas.drawRect(f3, f4, f2, fM11830, paint3);
                        c17442.add((int) f4);
                        c17442.add((int) fM11830);
                        c17442.add(enumC5448M11961.ordinal());
                        if (interfaceC2815.mo4447() == null) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        c17442.add(i7);
                        z2 = z;
                        paint2 = paint;
                        c17443 = c17442;
                        iM49685 = i5;
                        iM49684 = i4;
                        it = it2;
                    }
                    c9472 = c9473;
                    c17441 = c17442;
                } else {
                    i4 = iM49684;
                    i5 = iM49685;
                    c17441 = c17443;
                    c9472 = c9471;
                    paint3 = paint;
                }
                z2 = z;
                c9473 = c9472;
                c17443 = c17441;
                iM49685 = i5;
                iM49684 = i4;
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
    /* JADX INFO: renamed from: ֫ */
    public static void m22007(C9471 c9471, boolean z, C22076 c22076, int i, int i2, float f, float f2, boolean z2, Canvas canvas, Paint paint, InterfaceC12786 interfaceC12786, C23929 c23929) {
        int i3;
        InterfaceC2812 interfaceC2812;
        List list;
        List listMo4447;
        int iM49694;
        boolean z3;
        int iMo17396;
        int iMo17397;
        int iMo17400;
        int i4;
        List list2;
        boolean z4;
        float f3;
        int iMo4448;
        int iMo4452;
        C22076 c22077 = c22076;
        int i5 = i;
        int i6 = i2;
        AbstractC5390 abstractC5390 = c9471.m22039(z).f40275;
        List list3 = c9471.f25931;
        if (list3 == null || !c9471.m22039(z).m32569()) {
            return;
        }
        C14165 c14165 = z ? c9471.f25947 : c9471.f25938;
        if (c14165.f40398 != list3 || c14165.f40397 != c23929 || c14165.f40401 != c22077 || c14165.f40399 != i5 || c14165.f40402 != i6) {
            c9471.f25944.postInvalidate();
            c9471.f25963.postInvalidate();
            c9471.postInvalidate();
            return;
        }
        C17441 c17441 = c14165.f40396;
        EnumC5448[] enumC5448ArrValues = EnumC5448.values();
        int i7 = 0;
        for (int size = c17441.size(); i7 < size; size = size) {
            int i8 = c17441.getInt(i7);
            int i9 = c17441.getInt(i7 + 1);
            int i10 = c17441.getInt(i7 + 2);
            if (i10 < 0) {
                paint.setColor(c9471.f25961);
            } else {
                EnumC5448 enumC5448 = enumC5448ArrValues[i10];
                paint.setColor(c17441.getInt(i7 + 3) != 0 ? enumC5448.f13006 : enumC5448.f13005);
            }
            canvas.drawRect(f, i8, f2, i9, paint);
            i7 += 4;
        }
        C17441 c17442 = c23929.f75977;
        float fM26496 = c23929.m26496();
        int iM49684 = c14165.f40401.m49684(c14165.f40399);
        int iM49685 = c14165.f40401.m49684(c14165.f40402);
        int i11 = i5;
        while (iM49684 <= iM49685) {
            int i12 = 1;
            int size2 = list3.size() - 1;
            int i13 = 0;
            while (true) {
                if (i13 > size2) {
                    i3 = iM49685;
                    interfaceC2812 = null;
                    break;
                }
                int i14 = (i13 + size2) >>> i12;
                interfaceC2812 = (InterfaceC2812) list3.get(i14);
                if (z) {
                    iMo4448 = interfaceC2812.mo4445();
                    iMo4452 = interfaceC2812.mo4443();
                } else {
                    iMo4448 = interfaceC2812.mo4448();
                    iMo4452 = interfaceC2812.mo4452();
                }
                i3 = iM49685;
                int i15 = iMo4452;
                if (iM49684 < iMo4448) {
                    size2 = i14 - 1;
                } else if (iM49684 < i15) {
                    break;
                } else {
                    i13 = i14 + 1;
                }
                i12 = 1;
                iM49685 = i3;
            }
            if (interfaceC2812 == null || (listMo4447 = interfaceC2812.mo4447()) == null || (iM49694 = c22077.m49694(iM49684, i11)) == -1) {
                list = list3;
            } else {
                int iM49693 = c22077.m49693(iM49694);
                int iMin = Math.min(c22077.m49692(iM49694), i6);
                if (iM49693 < i5) {
                    iM49693 = i5;
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i16 = iMin + 1;
                float fM11830 = abstractC5390.m11830(iM49693);
                int size3 = c22076.size();
                C15543 c15543M49686 = c22076.m49686();
                while (iM49693 <= iMin) {
                    int i17 = (int) fM11830;
                    int iM53013 = (!z2 || z3) ? 0 : c23929.m53013();
                    C13533 c13533M35335 = c15543M49686.m35335(iM49693);
                    C15543 c15543 = c15543M49686;
                    int i18 = c13533M35335.f38061;
                    int i19 = iMin;
                    int i20 = c13533M35335.f38062;
                    int i21 = i16;
                    if (iM49693 < size3 - 1 && c22077.m49684(iM49693 + 1) != c13533M35335.f38063) {
                        i20++;
                    }
                    int size4 = listMo4447.size();
                    float fM48686 = 0.0f;
                    int i22 = i18;
                    int i23 = 0;
                    while (i23 < size4) {
                        InterfaceC20248 interfaceC20248 = (InterfaceC20248) listMo4447.get(i23);
                        if (z) {
                            iMo17396 = interfaceC20248.mo17398() + interfaceC2812.mo17398();
                            iMo17397 = interfaceC2812.mo17398();
                            iMo17400 = interfaceC20248.mo17388();
                        } else {
                            iMo17396 = interfaceC20248.mo17396() + interfaceC2812.mo17396();
                            iMo17397 = interfaceC2812.mo17396();
                            iMo17400 = interfaceC20248.mo17400();
                        }
                        List list4 = listMo4447;
                        int i24 = iMo17396;
                        int i25 = size4;
                        int i26 = iMo17400 + iMo17397;
                        if (i26 <= i18 || i20 <= i24) {
                            i4 = i18;
                            list2 = list3;
                        } else {
                            int iMax = Math.max(i24, i18);
                            int iMin2 = Math.min(i26, i20);
                            if (z) {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC20248.mo17398() == interfaceC20248.mo17388()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                i4 = i18;
                                list2 = list3;
                                if (interfaceC20248.mo17396() == interfaceC20248.mo17400()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            C21484 c21484 = (C21484) interfaceC12786;
                            fM48686 += c21484.m48686(i22, fM48686, iMax);
                            float f4 = iM53013;
                            float f5 = fM48686 + f4;
                            if (z4) {
                                float f6 = fM26496 / 16.0f;
                                float f7 = (int) (f5 - f6);
                                f3 = (f6 * 2.0f) + f7;
                                f5 = f7;
                            } else {
                                if (iMin2 == i20) {
                                    f3 = f2;
                                } else {
                                    fM48686 += c21484.m48686(iMax, fM48686, iMin2);
                                    f3 = fM48686 + f4;
                                    i22 = iMin2;
                                }
                                if (f5 >= f3 && f3 >= f && f5 <= f2) {
                                    c17442.add(i17);
                                    c17442.add(Float.floatToRawIntBits(f5));
                                    c17442.add(Float.floatToRawIntBits(f3));
                                    c17442.add(EnumC5448.m11962(interfaceC20248).f13005);
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
                        listMo4447 = list4;
                    }
                    iM49693++;
                    fM11830 = abstractC5390.m11830(iM49693);
                    z3 = false;
                    c22077 = c22076;
                    c15543M49686 = c15543;
                    iMin = i19;
                    i16 = i21;
                }
                list = list3;
                i11 = i16;
            }
            iM49684++;
            iM49685 = i3;
            c22077 = c22076;
            i5 = i;
            i6 = i2;
            list3 = list;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22006(C9471 c9471, boolean z, C22076 c22076, float f, float f2, float f3, float f4, Canvas canvas, Paint paint, C23929 c23929) {
        float f5;
        float f6;
        int iM49693;
        int iM49692;
        List<InterfaceC2812> list = c9471.f25931;
        if (list == null || !c9471.m22039(z).m32569() || c22076.isEmpty()) {
            return;
        }
        int i = (int) (f4 - f2);
        int size = c22076.size();
        float f7 = c23929.f32015 * 3.0f;
        if (z && !c9471.f25957) {
            f6 = c23929.f76014 + f;
            f5 = f;
        } else {
            f5 = f3 - c23929.f76014;
            f6 = f3;
        }
        for (InterfaceC2812 interfaceC2812 : list) {
            int iMo4445 = z ? interfaceC2812.mo4445() : interfaceC2812.mo4448();
            int iMo4443 = z ? interfaceC2812.mo4443() : interfaceC2812.mo4452();
            int iM49675 = c22076.m49675(iMo4445);
            if (iM49675 == -1) {
                if (iMo4445 == c22076.m49695().f38063 + 1) {
                    iM49693 = c22076.size();
                }
            } else {
                iM49693 = c22076.m49693(iM49675);
            }
            int iM49676 = c22076.m49675(iMo4443);
            if (iM49676 == -1) {
                if (iMo4443 == c22076.m49695().f38063 + 1) {
                    iM49692 = c22076.size();
                }
            } else {
                iM49692 = c22076.m49692(iM49676);
            }
            float f8 = i;
            float f9 = size;
            float f10 = (iM49693 * f8) / f9;
            float f11 = (iM49692 * f8) / f9;
            float f12 = f8 - f7;
            if (f10 > f12) {
                f10 = f12;
            }
            if (f11 - f10 < f7) {
                f11 = f10 + f7;
            }
            paint.setColor(EnumC5448.m11961(interfaceC2812).f13004);
            canvas.drawRect(f5, f2 + f10, f6, f2 + f11, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14146 c14146 = this.f25944;
        C14146 c14147 = this.f25963;
        C14146.m32272(c14146, c14147);
        C23929 c23929 = c14146.f40262;
        c14147.computeScroll();
        c14147.f40209 = true;
        this.f25936 = true;
        try {
            super.dispatchDraw(canvas);
            this.f25936 = false;
            c14147.f40209 = false;
            List list = this.f25931;
            boolean zM22011 = m22011(list);
            this.f25951 = zM22011;
            C3831 c3831 = c23929.f75994;
            if (this.f25957) {
                int bottom = c14146.getBottom();
                int top = c14147.getTop();
                c3831.setColor(C1199.m21221((C23223.f72985 & 16777215) | (-1610612736), C23223.f72971));
                canvas.drawRect(0.0f, bottom, getWidth(), top, c3831);
                c3831.setColor(C23223.f72985);
                canvas.drawRect(0.0f, bottom + 2, getWidth(), top - 2, c3831);
            } else {
                if (zM22011) {
                    C14165 c14165 = this.f25947;
                    int iM49684 = c14165.f40401.m49684(c14165.f40399);
                    C14165 c14166 = this.f25938;
                    int iM49685 = c14166.f40401.m49684(c14166.f40399);
                    int iM49686 = c14165.f40401.m49684(c14165.f40402) + 1;
                    int iM49687 = c14166.f40401.m49684(c14166.f40402) + 1;
                    float width = getWidth() / 2.0f;
                    C23929 c239210 = c14165.f40397;
                    float f = width - (c239210.f75979 * c239210.f75970);
                    C23929 c239211 = c14166.f40397;
                    float f2 = (c239211.f75979 * c239211.f75970) + width;
                    float f3 = c23929.f75970 / 2.0f;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2812 interfaceC2812 = (InterfaceC2812) it.next();
                        if (interfaceC2812.mo4443() >= iM49684 || interfaceC2812.mo4452() >= iM49685) {
                            if (interfaceC2812.mo4445() <= iM49686 || interfaceC2812.mo4448() <= iM49687) {
                                EnumC5448 enumC5448M11961 = EnumC5448.m11961(interfaceC2812);
                                Iterator it2 = it;
                                Path path = this.f25940;
                                path.reset();
                                int i = iM49684;
                                float[] fArr = this.f25934;
                                int i2 = iM49685;
                                int i3 = iM49686;
                                if (c14165.m32643(interfaceC2812, true, fArr, 0) && c14166.m32643(interfaceC2812, false, fArr, 2)) {
                                    int paddingTop = c14146.getPaddingTop() - c14146.m32472();
                                    int paddingTop2 = c14147.getPaddingTop() - c14147.m32472();
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
                                    c3831.setColor(enumC5448M11961.f13005);
                                    canvas.drawPath(path, c3831);
                                }
                                it = it2;
                                iM49684 = i;
                                iM49685 = i2;
                                iM49686 = i3;
                            }
                        }
                    }
                }
                if (this.f25942 || !zM22011) {
                }
                C6789 c6789 = this.f25959;
                Paint paint = c6789.f17581;
                paint.setColor(C23223.f72969);
                C9471 c9471 = c6789.f17580;
                C14146 c14148 = c9471.f25963;
                C14146 c14149 = c9471.f25944;
                if (c9471.f25957) {
                    float top2 = c14149.getTop() + ((int) c6789.m15495(c14149));
                    canvas.drawLine(0.0f, top2, c9471.getWidth(), top2, paint);
                    float top3 = c14148.getTop() + ((int) c6789.m15495(c14148));
                    canvas.drawLine(0.0f, top3, c9471.getWidth(), top3, paint);
                    return;
                }
                float fM15495 = (int) c6789.m15495(c14149);
                canvas.drawLine(0.0f, fM15495, c9471.getWidth(), fM15495, paint);
                return;
            }
            if (this.f25942) {
            }
        } catch (Throwable th) {
            this.f25936 = false;
            c14147.f40209 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22004(C9471 c9471, C14165 c14165, boolean z) {
        c14165.f40400 = z;
        if (c9471.f25936 || c9471.f25951 == c9471.m22011(c9471.f25931)) {
            return;
        }
        super.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22011(List list) {
        if (list == null) {
            return false;
        }
        C14146 c14146 = this.f25944;
        if (!c14146.m32569()) {
            return false;
        }
        C14146 c14147 = this.f25963;
        return c14147.m32569() && this.f25947.m32644(c14146, list) && this.f25938.m32644(c14147, list);
    }

    /* JADX INFO: renamed from: ۖ */
    public static boolean m22012(C9471 c9471) {
        return c9471.f25944.m32569() && c9471.f25963.m32569();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0108 */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22057(final boolean z) {
        if (!C12799.m29347()) {
            post(new RunnableC7460(0, this));
            return;
        }
        if (this.f25928) {
            this.f25927 = true;
            return;
        }
        if (m22030()) {
            return;
        }
        boolean z2 = this.f25931 == null;
        synchronized (this.f25941) {
            if (!z2) {
                try {
                    C8130 c8130 = this.f25941;
                    if (c8130.f21431 == -1 && c8130.f21433 == -1) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        throw th;
                    }
                }
            }
            int i = z2 ? 0 : this.f25941.f21431;
            int iM32590 = z2 ? this.f25944.m32590() : this.f25941.f21430;
            int i2 = z2 ? 0 : this.f25941.f21433;
            int iM32591 = z2 ? this.f25963.m32590() : this.f25941.f21432;
            final InterfaceC9768 interfaceC9768M32500 = this.f25944.m32500();
            final InterfaceC9768 interfaceC9768M32501 = this.f25963.m32500();
            final C9729 c9729Mo28595 = interfaceC9768M32500.mo28595();
            try {
                final C9729 c9729Mo28596 = interfaceC9768M32501.mo28595();
                final int i3 = this.f25945.get();
                final int iM22747 = c9729Mo28595.m22747();
                final int iM22748 = c9729Mo28596.m22747();
                final List list = this.f25931;
                try {
                    final C15505 c15505M21996 = m21996(list, c9729Mo28595, c9729Mo28596, i, iM32590, i2, iM32591);
                    final EnumC12154 enumC12154 = this.f25929;
                    final boolean z3 = this.f25958;
                    final C15795 c15795 = this.f25933;
                    this.f25928 = true;
                    interfaceC9768M32500.setReadOnly(true);
                    interfaceC9768M32501.setReadOnly(true);
                    Runnable runnable = new Runnable() { // from class: l.֨۫ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9471.m22002(this.f6865, c9729Mo28595, c9729Mo28596, c15505M21996, enumC12154, z3, c15795, interfaceC9768M32500, interfaceC9768M32501, i3, list, iM22747, iM22748, z);
                        }
                    };
                    if (z) {
                        runnable.run();
                        return;
                    }
                    try {
                        C4081.f8987.execute(runnable);
                    } catch (RuntimeException e) {
                        this.f25928 = false;
                        c9729Mo28595.close();
                        c9729Mo28596.close();
                        interfaceC9768M32500.setReadOnly(false);
                        interfaceC9768M32501.setReadOnly(false);
                        throw e;
                    }
                } catch (Error | RuntimeException e2) {
                    c9729Mo28595.close();
                    c9729Mo28596.close();
                    throw e2;
                }
            } catch (Error | RuntimeException e3) {
                c9729Mo28595.close();
                throw e3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22002(final C9471 c9471, C9729 c9729, C9729 c97210, final C15505 c15505, final EnumC12154 enumC12154, final boolean z, final InterfaceC14835 interfaceC14835, final InterfaceC9768 interfaceC9768, final InterfaceC9768 interfaceC9769, final int i, final List list, final int i2, final int i3, boolean z2) {
        try {
            try {
                C16788 c16788M38032 = C16788.m38032(c9729);
                try {
                    C16788 c16788M38033 = C16788.m38032(c97210);
                    try {
                        final ArrayList<InterfaceC2812> arrayListM21994 = m21994(c16788M38032.range(c15505.f44312, c15505.f44308), c16788M38033.range(c15505.f44313, c15505.f44311), enumC12154, z, interfaceC14835, new C6836());
                        for (InterfaceC2812 interfaceC2812 : arrayListM21994) {
                            interfaceC2812.mo4451(interfaceC2812.mo4445() + c15505.f44310);
                            interfaceC2812.mo4444(interfaceC2812.mo4443() + c15505.f44310);
                            interfaceC2812.mo17397(interfaceC2812.mo17398() + c15505.f44312);
                            interfaceC2812.mo17395(interfaceC2812.mo17388() + c15505.f44312);
                            interfaceC2812.mo4440(interfaceC2812.mo4448() + c15505.f44309);
                            interfaceC2812.mo4453(interfaceC2812.mo4452() + c15505.f44309);
                            interfaceC2812.mo17393(interfaceC2812.mo17396() + c15505.f44313);
                            interfaceC2812.mo17391(interfaceC2812.mo17400() + c15505.f44313);
                        }
                        c16788M38033.close();
                        try {
                            try {
                                c16788M38032.close();
                                c97210.close();
                                c9729.close();
                                interfaceC9768.setReadOnly(false);
                                interfaceC9769.setReadOnly(false);
                                Runnable runnable = new Runnable() { // from class: l.ܺ۫ᩳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C9471.m22003(this.f52374, enumC12154, z, interfaceC14835, i, list, interfaceC9768, interfaceC9769, i2, i3, c15505, arrayListM21994);
                                    }
                                };
                                if (z2) {
                                    runnable.run();
                                } else {
                                    c9471.post(runnable);
                                }
                            } catch (Throwable th) {
                                interfaceC9768.setReadOnly(false);
                                interfaceC9769.setReadOnly(false);
                                throw th;
                            }
                        } catch (Error | RuntimeException e) {
                            c9471.post(new RunnableC25132(2, c9471));
                            throw e;
                        }
                    } catch (Throwable th2) {
                        try {
                            c16788M38033.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        c16788M38032.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                try {
                    c9729.close();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            try {
                c97210.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m22020(C9471 c9471) {
        c9471.f25928 = false;
        c9471.f25927 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22003(C9471 c9471, EnumC12154 enumC12154, boolean z, InterfaceC14835 interfaceC14835, int i, List list, InterfaceC9768 interfaceC9768, InterfaceC9768 interfaceC9769, int i2, int i3, C15505 c15505, ArrayList arrayList) {
        try {
            if (c9471.f25929 == enumC12154 && c9471.f25958 == z && c9471.f25933 == interfaceC14835 && i == c9471.f25945.get() && c9471.f25931 == list && !c9471.m22030() && interfaceC9768 == c9471.f25944.m32500() && interfaceC9769 == c9471.f25963.m32500() && i2 == interfaceC9768.mo28581() && i3 == interfaceC9769.mo28581()) {
                List listM21995 = m21995(list, c15505, arrayList);
                synchronized (c9471.f25941) {
                    C8130 c8130 = c9471.f25941;
                    c8130.f21432 = -1;
                    c8130.f21433 = -1;
                    c8130.f21430 = -1;
                    c8130.f21431 = -1;
                }
                c9471.m22019(listM21995);
                c9471.invalidate();
                boolean z2 = c9471.f25953;
                C14146 c14146M22039 = c9471.m22039(z2);
                c9471.m21997(c14146M22039.m32508(), c14146M22039.m32512(), z2);
                c9471.m22033();
            } else if (!c9471.m22030()) {
                c9471.f25927 = true;
            }
            c9471.f25928 = false;
            if (c9471.f25927) {
                c9471.f25927 = false;
                c9471.post(new RunnableC4778(0, c9471));
            }
        } catch (Throwable th) {
            c9471.f25928 = false;
            if (c9471.f25927) {
                c9471.f25927 = false;
                c9471.post(new RunnableC4778(0, c9471));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15505 m21996(List list, C9729 c9729, C9729 c97210, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iMo4452;
        int i8;
        int i9;
        int size = list == null ? 0 : list.size();
        int iM22745 = i == -1 ? -1 : c9729.m22745(i);
        int iM22746 = i2 == -1 ? -1 : c9729.m22745(i2) + 1;
        int iM22747 = i3 == -1 ? -1 : c97210.m22745(i3);
        int iM22748 = i4 == -1 ? -1 : c97210.m22745(i4) + 1;
        int i10 = 0;
        int i11 = size;
        while (i10 < i11) {
            int i12 = (i10 + i11) >>> 1;
            InterfaceC2812 interfaceC2812 = (InterfaceC2812) list.get(i12);
            if ((iM22745 == -1 || interfaceC2812.mo4443() < iM22745) && (iM22747 == -1 || interfaceC2812.mo4452() < iM22747)) {
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
            InterfaceC2812 interfaceC2813 = (InterfaceC2812) list.get(i15);
            if ((iM22746 == -1 || interfaceC2813.mo4445() > iM22746) && (iM22748 == -1 || interfaceC2813.mo4448() > iM22748)) {
                i14 = i15;
            } else {
                i13 = i15 + 1;
            }
        }
        int iMin = Math.min(size, i13 + 1);
        if (iMax >= 0) {
            InterfaceC2812 interfaceC2814 = (InterfaceC2812) list.get(iMax);
            int iMo17388 = interfaceC2814.mo17388();
            int iMo17400 = interfaceC2814.mo17400();
            int iMo4443 = interfaceC2814.mo4443();
            iMo4452 = interfaceC2814.mo4452();
            i5 = iMo17388;
            i6 = iMo17400;
            i7 = iMo4443;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            iMo4452 = 0;
        }
        int length = c9729.length();
        int length2 = c97210.length();
        if (iMin < size) {
            InterfaceC2812 interfaceC2815 = (InterfaceC2812) list.get(iMin);
            int iMo17398 = interfaceC2815.mo17398();
            int iMo17396 = interfaceC2815.mo17396();
            if (iMo17398 != c9729.length()) {
                iMo17398--;
            }
            if (iMo17396 != c97210.length()) {
                iMo17396--;
            }
            i9 = iMo17396;
            i8 = iMo17398;
        } else {
            i8 = length;
            i9 = length2;
        }
        return new C15505(iMax, iMin, i5, i8, i6, i9, i7, iMo4452);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m21995(List list, C15505 c15505, ArrayList arrayList) {
        if (list == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((list.size() + (arrayList.size() + (c15505.f44307 + 1))) - c15505.f44306);
        for (int i = 0; i <= c15505.f44307; i++) {
            arrayList2.add((InterfaceC2812) list.get(i));
        }
        arrayList2.addAll(arrayList);
        for (int i2 = c15505.f44306; i2 < list.size(); i2++) {
            arrayList2.add((InterfaceC2812) list.get(i2));
        }
        return arrayList2;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f25944.invalidate();
        this.f25963.invalidate();
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m22050() {
        return this.f25942;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22063(boolean z) {
        if (this.f25942 != z) {
            this.f25942 = z;
            super.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22045(EnumC12154 enumC12154) {
        if (this.f25929 == enumC12154) {
            return;
        }
        C12826.requireNonNull(enumC12154);
        this.f25929 = enumC12154;
        if (this.f25944.m32590() > 0 || this.f25963.m32590() > 0) {
            m22024();
            invalidate();
            m22033();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final EnumC12154 m22055() {
        return this.f25929;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22067(boolean z) {
        if (this.f25958 == z) {
            return;
        }
        this.f25958 = z;
        if (this.f25944.m32590() > 0 || this.f25963.m32590() > 0) {
            m22024();
            invalidate();
            m22033();
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m22035() {
        return this.f25958;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22047(C15795 c15795) {
        this.f25933 = c15795;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22019(List list) {
        this.f25931 = list;
        this.f25945.incrementAndGet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14146 m22039(boolean z) {
        return z ? this.f25944 : this.f25963;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C14146 m22071() {
        return this.f25944;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C14146 m22052() {
        return this.f25963;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m22051() {
        return this.f25944.m32505() && this.f25963.m32505();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m22065(boolean z) {
        this.f25944.m32471(z);
        this.f25963.m32471(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22056() {
        boolean z;
        synchronized (this.f25937) {
            if (this.f25948) {
                z = false;
            } else {
                this.f25948 = true;
                this.f25964 = false;
                this.f25960 = false;
                this.f25945.incrementAndGet();
                z = true;
            }
        }
        if (z) {
            this.f25944.m32410(true, false);
            this.f25963.m32410(true, false);
            this.f25944.m32549();
            this.f25963.m32549();
            this.f25944.m32502();
            this.f25963.m32502();
        }
        C4081.m8190().removeCallbacksAndMessages(this.f25941);
        synchronized (this.f25941) {
            C8130 c8130 = this.f25941;
            c8130.f21432 = -1;
            c8130.f21433 = -1;
            c8130.f21430 = -1;
            c8130.f21431 = -1;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22066() {
        synchronized (this.f25937) {
            if (this.f25948) {
                this.f25948 = false;
                if (this.f25955 || m22014()) {
                    m22040();
                }
                this.f25944.m32503();
                this.f25963.m32503();
                if (!this.f25944.m32557()) {
                    this.f25944.m32435();
                }
                if (!this.f25963.m32557()) {
                    this.f25963.m32435();
                }
                if (this.f25960 || m22014()) {
                    return;
                }
                this.f25944.m32410(false, false);
                this.f25963.m32410(false, false);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    private boolean m22030() {
        boolean z;
        synchronized (this.f25937) {
            z = this.f25948;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z2 = this.f25957;
        C14146 c14146 = this.f25963;
        C14146 c14147 = this.f25944;
        if (z2) {
            int iM29939 = C13076.m29939(2.5f);
            int i7 = i6 / 2;
            c14147.layout(0, 0, i5, i7 - iM29939);
            c14146.layout(0, i7 + iM29939, i5, i6);
            return;
        }
        int i8 = i5 / 2;
        c14147.layout(0, 0, i8, i6);
        c14146.layout(i8, 0, i5, i6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22041(CharSequence charSequence, CharSequence charSequence2, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        C14146 c14146 = this.f25944;
        if (c14146.m32557()) {
            return;
        }
        C14146 c14147 = this.f25963;
        if (c14147.m32557()) {
            return;
        }
        m22023();
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        InterfaceC9768 interfaceC9768M32501 = c14147.m32500();
        this.f25955 = false;
        this.f25962 = null;
        try {
            if (C12799.m29347()) {
                c14146.m32401(abstractC17043, charSequence);
                m22009(interfaceC9768M32500, interfaceC9768M32501);
                if (m22014()) {
                    m22040();
                    return;
                }
                c14147.m32401(abstractC17044, charSequence2);
            } else {
                this.f25955 = true;
                m22019((List) null);
                m22013();
                if (!new C3378(new C11484(this)).m5903(c14146, charSequence, abstractC17043, c14147, charSequence2, abstractC17044)) {
                    m22040();
                    return;
                }
            }
            m22009(interfaceC9768M32500, interfaceC9768M32501);
            if (m22014()) {
                m22040();
                return;
            }
            InterfaceC9768 interfaceC9768M32502 = c14146.m32500();
            InterfaceC9768 interfaceC9768M32503 = c14147.m32500();
            interfaceC9768M32502.setReadOnly(true);
            interfaceC9768M32503.setReadOnly(true);
            this.f25930 = interfaceC9768M32502;
            this.f25932 = interfaceC9768M32503;
            C9729 c9729Mo28595 = interfaceC9768M32502.mo28595();
            try {
                C9729 c9729Mo28596 = interfaceC9768M32503.mo28595();
                try {
                    this.f25950 = c9729Mo28595.m22747();
                    this.f25954 = c9729Mo28596.m22747();
                    this.f25962 = m22038(c9729Mo28595, c9729Mo28596);
                    c9729Mo28596.close();
                    c9729Mo28595.close();
                    m22032();
                    if (m22014()) {
                        m22040();
                    }
                } catch (Throwable th) {
                    try {
                        c9729Mo28596.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c9729Mo28595.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            m22009(interfaceC9768M32500, interfaceC9768M32501);
            m22040();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22009(InterfaceC9768 interfaceC9768, InterfaceC9768 interfaceC9769) {
        if (this.f25955) {
            return;
        }
        if (this.f25944.m32500() == interfaceC9768 && this.f25963.m32500() == interfaceC9769) {
            return;
        }
        this.f25955 = true;
        m22019((List) null);
        m22013();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22040() {
        this.f25960 = true;
        this.f25955 = false;
        this.f25962 = null;
        try {
            this.f25944.m32372();
            this.f25963.m32372();
        } finally {
            m22023();
        }
    }

    /* JADX INFO: renamed from: ۫ */
    private void m22023() {
        InterfaceC9768 interfaceC9768 = this.f25930;
        InterfaceC9768 interfaceC9769 = this.f25932;
        this.f25932 = null;
        this.f25930 = null;
        if (interfaceC9768 != null) {
            interfaceC9768.setReadOnly(false);
            interfaceC9769.setReadOnly(false);
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m22060() {
        this.f25944.m32450();
        this.f25963.m32450();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m22069() {
        return this.f25944.m32434() || this.f25963.m32434();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m22064() {
        C14146 c14146 = this.f25944;
        try {
            InterfaceC9768 interfaceC9768 = this.f25930;
            InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
            C14146 c14147 = this.f25963;
            if (interfaceC9768 == interfaceC9768M32500 && this.f25932 == c14147.m32500() && this.f25950 == this.f25930.mo28581() && this.f25954 == this.f25932.mo28581()) {
                m22019(this.f25962);
            } else {
                m22019((List) null);
                post(new RunnableC24718(1, this));
            }
            this.f25962 = null;
            this.f25955 = false;
            c14146.m32424();
            c14147.m32424();
            boolean zM32501 = c14146.m32501();
            boolean zM32502 = c14147.m32501();
            if (zM32501 && !zM32502) {
                c14147.m32446(true);
            } else if (!zM32501 && zM32502) {
                c14146.m32446(true);
            }
            invalidate();
            m22033();
        } finally {
            m22023();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22062() {
        this.f25964 = true;
        this.f25943.m15649();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ */
    public boolean m22014() {
        return this.f25964 || this.f25944.m32557() || this.f25963.m32557();
    }

    /* JADX INFO: renamed from: ᩸ */
    private void m22032() {
        if (C12799.m29347()) {
            return;
        }
        boolean z = false;
        while (m22069()) {
            if (m22014()) {
                this.f25944.m32526();
                this.f25963.m32526();
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
                z = true;
                this.f25964 = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m22068() {
        return this.f25953;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C14146 m22070() {
        return this.f25953 ? this.f25944 : this.f25963;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m22058() {
        List list = this.f25931;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m22037(int i, boolean z) {
        List list = this.f25931;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            InterfaceC2812 interfaceC2812 = (InterfaceC2812) list.get(i3);
            int iMo17389 = interfaceC2812.mo17389(z);
            int iMo17394 = interfaceC2812.mo17394(z);
            if (i < iMo17389) {
                size = i3 - 1;
            } else {
                if (i <= iMo17394 && (i != iMo17394 || iMo17389 >= iMo17394)) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m22061() {
        InterfaceC2812 interfaceC2812;
        List list = this.f25931;
        if (list == null || list.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = this.f25953;
        int iM32508 = (z ? this.f25944 : this.f25963).m32508();
        int i = 0;
        while (true) {
            if (i >= this.f25931.size()) {
                interfaceC2812 = null;
                break;
            }
            interfaceC2812 = (InterfaceC2812) this.f25931.get(i);
            if (interfaceC2812.mo17389(z) > iM32508) {
                break;
            } else {
                i++;
            }
        }
        if (interfaceC2812 == null) {
            interfaceC2812 = (InterfaceC2812) this.f25931.get(0);
        }
        m22010(z, (InterfaceC20248) interfaceC2812, true);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m22049() {
        InterfaceC2812 interfaceC2812;
        List list = this.f25931;
        if (list == null || list.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = this.f25953;
        int iM32508 = (z ? this.f25944 : this.f25963).m32508();
        int size = this.f25931.size() - 1;
        while (true) {
            if (size < 0) {
                interfaceC2812 = null;
                break;
            }
            interfaceC2812 = (InterfaceC2812) this.f25931.get(size);
            if (interfaceC2812.mo17394(z) < iM32508) {
                break;
            } else {
                size--;
            }
        }
        if (interfaceC2812 == null) {
            interfaceC2812 = (InterfaceC2812) C9179.m21131(1, this.f25931);
            this.f25931.size();
        }
        m22010(z, (InterfaceC20248) interfaceC2812, true);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m22054() {
        List list = this.f25931;
        if (list == null || list.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        boolean z = this.f25953;
        C14146 c14146 = z ? this.f25944 : this.f25963;
        if (!c14146.isFocused()) {
            c14146.requestFocus();
        }
        m22010(z, (InterfaceC20248) this.f25931.get(0), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22010(boolean z, InterfaceC20248 interfaceC20248, boolean z2) {
        int iMo17389 = interfaceC20248.mo17389(z);
        C14146 c14146 = z ? this.f25944 : this.f25963;
        if (c14146.m32569()) {
            c14146.m32464();
            c14146.mo27941(iMo17389);
            c14146.m32468();
            int iM15495 = (int) this.f25959.m15495(c14146);
            int iM26496 = (int) (c14146.f40262.m26496() * c14146.f40275.m11834(iMo17389));
            if (z2) {
                c14146.m32475(0, c14146.m32585(iM26496 - iM15495));
            } else {
                c14146.scrollTo(0, c14146.m32585(iM26496 - iM15495));
            }
        }
    }

    /* JADX INFO: renamed from: ۬ */
    private void m22024() {
        C14146 c14146 = this.f25944;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        C14146 c14147 = this.f25963;
        InterfaceC9768 interfaceC9768M32501 = c14147.m32500();
        interfaceC9768M32500.setReadOnly(true);
        interfaceC9768M32501.setReadOnly(true);
        try {
            C9729 c9729Mo28595 = interfaceC9768M32500.mo28595();
            try {
                C9729 c9729Mo28596 = interfaceC9768M32501.mo28595();
                try {
                    ArrayList arrayListM22038 = m22038(c9729Mo28595, c9729Mo28596);
                    if (interfaceC9768M32500 == c14146.m32500() && interfaceC9768M32501 == c14147.m32500() && c9729Mo28595.m22747() == interfaceC9768M32500.mo28581() && c9729Mo28596.m22747() == interfaceC9768M32501.mo28581()) {
                        m22019(arrayListM22038);
                    } else {
                        m22019((List) null);
                        post(new RunnableC2765(0, this));
                    }
                    c9729Mo28596.close();
                    c9729Mo28595.close();
                    interfaceC9768M32500.setReadOnly(false);
                    interfaceC9768M32501.setReadOnly(false);
                } catch (Throwable th) {
                    try {
                        c9729Mo28596.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c9729Mo28595.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            interfaceC9768M32500.setReadOnly(false);
            interfaceC9768M32501.setReadOnly(false);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m22038(C9729 c9729, C9729 c97210) {
        C16788 c16788M38032 = C16788.m38032(c9729);
        try {
            C16788 c16788M38033 = C16788.m38032(c97210);
            try {
                ArrayList arrayListM21994 = m21994(c16788M38032.range(0, c16788M38032.length()), c16788M38033.range(0, c16788M38033.length()), this.f25929, this.f25958, this.f25933, this.f25943);
                c16788M38033.close();
                c16788M38032.close();
                return arrayListM21994;
            } catch (Throwable th) {
                try {
                    c16788M38033.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c16788M38032.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m21994(CharSequence charSequence, CharSequence charSequence2, EnumC12154 enumC12154, boolean z, InterfaceC14835 interfaceC14835, C6836 c6836) {
        EnumC7587 enumC7587;
        if (!z) {
            C13507 c13507 = new C13507(charSequence);
            charSequence2 = new C13507(charSequence2);
            charSequence = c13507;
        }
        int i = C21542.f67945[enumC12154.ordinal()];
        if (i == 1) {
            enumC7587 = EnumC7587.DEFAULT;
        } else if (i == 2) {
            enumC7587 = EnumC7587.TRIM_WHITESPACES;
        } else if (i == 3 || i == 4) {
            enumC7587 = EnumC7587.IGNORE_WHITESPACES;
        } else {
            throw new RuntimeException();
        }
        int i2 = 0;
        boolean z2 = enumC12154 == EnumC12154.IGNORE_WHITESPACES_AND_EMPTY_LINES;
        c6836.m15652();
        ArrayList arrayListM4666 = C2892.m4666(charSequence, charSequence2, C16893.m38452(charSequence), C16893.m38452(charSequence2), enumC7587, EnumC23010.WORDS, c6836);
        if (!c6836.m15651()) {
            if (interfaceC14835 != null) {
                Iterator it = arrayListM4666.iterator();
                while (it.hasNext()) {
                    InterfaceC2812 interfaceC2812 = (InterfaceC2812) it.next();
                    String strSubstring = TextUtils.substring(charSequence, interfaceC2812.mo17398(), interfaceC2812.mo17388());
                    String strSubstring2 = TextUtils.substring(charSequence2, interfaceC2812.mo17396(), interfaceC2812.mo17400());
                    InterfaceC12631 interfaceC12631ListIterator = ((C20539) ((C15795) interfaceC14835).f45697).listIterator(0);
                    while (interfaceC12631ListIterator.hasNext()) {
                        C13929 c13929 = (C13929) interfaceC12631ListIterator.next();
                        c13929.m56473reset((CharSequence) strSubstring);
                        if (c13929.matches()) {
                            c13929.m56473reset((CharSequence) strSubstring2);
                            if (c13929.matches()) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayListM4666.isEmpty()) {
                return arrayListM4666;
            }
            final ArrayList arrayList = new ArrayList();
            final CharSequence charSequence3 = charSequence;
            final CharSequence charSequence4 = charSequence2;
            final EnumC7587 enumC7588 = enumC7587;
            final boolean z3 = z2;
            Consumer consumer = new Consumer() { // from class: l.᩵ܿۘ
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C24719.$default$andThen(this, consumer2);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0090  */
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    int i3;
                    Object c7507;
                    List listSingletonList;
                    CharSequence charSequence5;
                    CharSequence charSequence6;
                    List list = (List) obj;
                    int size = list.size();
                    if (!z3) {
                        i3 = 0;
                    } else if (enumC7588 == EnumC7587.IGNORE_WHITESPACES) {
                        i3 = 0;
                        while (true) {
                            charSequence5 = charSequence3;
                            charSequence6 = charSequence4;
                            if (i3 >= size) {
                                break;
                            }
                            InterfaceC2812 interfaceC2813 = (InterfaceC2812) list.get(i3);
                            C19165 c19165 = new C19165(interfaceC2813.mo17398(), interfaceC2813.mo17388(), charSequence5);
                            C19165 c19166 = new C19165(interfaceC2813.mo17396(), interfaceC2813.mo17400(), charSequence6);
                            if ((interfaceC2813.mo4447() == null || !interfaceC2813.mo4447().isEmpty()) && !C13061.m29893(c19165, c19166)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        while (i3 < size) {
                            InterfaceC2812 interfaceC2814 = (InterfaceC2812) list.get(size - 1);
                            C19165 c19167 = new C19165(interfaceC2814.mo17398(), interfaceC2814.mo17388(), charSequence5);
                            C19165 c19168 = new C19165(interfaceC2814.mo17396(), interfaceC2814.mo17400(), charSequence6);
                            if ((interfaceC2814.mo4447() == null || !interfaceC2814.mo4447().isEmpty()) && !C13061.m29893(c19167, c19168)) {
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
                        List<InterfaceC2812> listSubList = list.subList(i3, size);
                        if (listSubList.size() == 1) {
                            c7507 = (InterfaceC2812) listSubList.get(0);
                        } else {
                            InterfaceC2812 interfaceC2815 = (InterfaceC2812) listSubList.get(0);
                            InterfaceC2812 interfaceC2816 = (InterfaceC2812) C9179.m21131(1, listSubList);
                            ArrayList arrayList2 = new ArrayList();
                            for (InterfaceC2812 interfaceC2817 : listSubList) {
                                for (InterfaceC20248 interfaceC20248 : interfaceC2817.mo4447() != null ? interfaceC2817.mo4447() : Collections.singletonList(new C20919(0, interfaceC2817.mo17388() - interfaceC2817.mo17398(), 0, interfaceC2817.mo17400() - interfaceC2817.mo17396()))) {
                                    int iMo17398 = interfaceC2817.mo17398() - interfaceC2815.mo17398();
                                    int iMo17396 = interfaceC2817.mo17396() - interfaceC2815.mo17396();
                                    InterfaceC20248 interfaceC20249 = (InterfaceC20248) (arrayList2.isEmpty() ? null : C20013.m45383(arrayList2, 1));
                                    if (interfaceC20249 != null && interfaceC20249.mo17388() == interfaceC20248.mo17398() + iMo17398 && interfaceC20249.mo17400() == interfaceC20248.mo17396() + iMo17396) {
                                        arrayList2.remove(arrayList2.size() - 1);
                                        arrayList2.add(new C20919(interfaceC20249.mo17398(), interfaceC20248.mo17388() + iMo17398, interfaceC20249.mo17396(), interfaceC20248.mo17400() + iMo17396));
                                    } else {
                                        arrayList2.add(new C20919(interfaceC20248.mo17398() + iMo17398, interfaceC20248.mo17388() + iMo17398, interfaceC20248.mo17396() + iMo17396, interfaceC20248.mo17400() + iMo17396));
                                    }
                                }
                            }
                            c7507 = new C7507(interfaceC2815.mo4445(), interfaceC2816.mo4443(), interfaceC2815.mo4448(), interfaceC2816.mo4452(), interfaceC2815.mo17398(), interfaceC2816.mo17388(), interfaceC2815.mo17396(), interfaceC2816.mo17400(), arrayList2);
                        }
                        listSingletonList = Collections.singletonList(c7507);
                    }
                    arrayList.addAll(listSingletonList);
                }
            };
            for (int i3 = 1; i3 < arrayListM4666.size(); i3++) {
                InterfaceC2812 interfaceC2813 = (InterfaceC2812) arrayListM4666.get(i3 - 1);
                InterfaceC2812 interfaceC2814 = (InterfaceC2812) arrayListM4666.get(i3);
                if (interfaceC2813.mo4443() != interfaceC2814.mo4445() || interfaceC2813.mo4452() != interfaceC2814.mo4448() || interfaceC2813.mo17388() != interfaceC2814.mo17398() || interfaceC2813.mo17400() != interfaceC2814.mo17396()) {
                    consumer.m45213n(arrayListM4666.subList(i2, i3));
                    i2 = i3;
                }
            }
            if (i2 < arrayListM4666.size()) {
                consumer.m45213n(arrayListM4666.subList(i2, arrayListM4666.size()));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // p067l.InterfaceC18226
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22048(float f, float f2) {
        return this.f25944.mo22048(f, f2) || this.f25963.mo22048(f, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22043(RunnableC6357 runnableC6357) {
        this.f25946 = runnableC6357;
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m22033() {
        if (this.f25946 != null) {
            if (C12799.m29347()) {
                this.f25946.run();
            } else {
                C7050.m16212(this.f25946);
            }
        }
    }

    /* JADX INFO: renamed from: ۗ */
    private void m22013() {
        if (C12799.m29347()) {
            invalidate();
            m22033();
        } else {
            C7050.m16212(new RunnableC10813(0, this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m21998(C9471 c9471) {
        c9471.invalidate();
        c9471.m22033();
    }
}
