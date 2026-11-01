package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.alipay.sdk.p010m.p050t0.C0215b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.ܺۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17289 extends AbstractC16341 implements InterfaceC6324 {

    /* JADX INFO: renamed from: ֡ */
    public final C3569 f51526;

    /* JADX INFO: renamed from: ֡֫ */
    public SurfaceHolder f51527;

    /* JADX INFO: renamed from: ֨ */
    public boolean f51528;

    /* JADX INFO: renamed from: ֨֫ */
    public C18532 f51529;

    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC20664 f51530;

    /* JADX INFO: renamed from: ۖ */
    public final C15968 f51531;

    /* JADX INFO: renamed from: ۖ֫ */
    public InterfaceC3549 f51532;

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC10770 f51533;

    /* JADX INFO: renamed from: ۗ֫ */
    public C8454 f51534;

    /* JADX INFO: renamed from: ۘ */
    public C6443 f51535;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f51536;

    /* JADX INFO: renamed from: ۙ */
    public C19044 f51537;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f51538;

    /* JADX INFO: renamed from: ۚ */
    public final C11256 f51539;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f51540;

    /* JADX INFO: renamed from: ۛ */
    public int f51541;

    /* JADX INFO: renamed from: ۜ */
    public final C12617 f51542;

    /* JADX INFO: renamed from: ۜ֫ */
    public C22220 f51543;

    /* JADX INFO: renamed from: ۟ */
    public C14569 f51544;

    /* JADX INFO: renamed from: ۠ */
    public final C21315 f51545;

    /* JADX INFO: renamed from: ۠֫ */
    public TextureView f51546;

    /* JADX INFO: renamed from: ۡ */
    public final C15849 f51547;

    /* JADX INFO: renamed from: ۡ֫ */
    public final long f51548;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC14968 f51549;

    /* JADX INFO: renamed from: ۢ֫ */
    public final long f51550;

    /* JADX INFO: renamed from: ۤ */
    public boolean f51551;

    /* JADX INFO: renamed from: ۤ֫ */
    public final InterfaceC3621 f51552;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20879 f51553;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C17051 f51554;

    /* JADX INFO: renamed from: ۨ */
    public int f51555;

    /* JADX INFO: renamed from: ۫ */
    public Surface f51556;

    /* JADX INFO: renamed from: ۫֫ */
    public final C20208 f51557;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f51558;

    /* JADX INFO: renamed from: ۬֫ */
    public final C4785 f51559;

    /* JADX INFO: renamed from: ܰ */
    public final C20386 f51560;

    /* JADX INFO: renamed from: ܳ */
    public final C10407 f51561;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f51562;

    /* JADX INFO: renamed from: ܶ */
    public final C23345 f51563;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f51564;

    /* JADX INFO: renamed from: ܺ */
    public final SurfaceHolderCallbackC21985 f51565;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f51566;

    /* JADX INFO: renamed from: ܽ */
    public final Context f51567;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f51568;

    /* JADX INFO: renamed from: ܿ */
    public C19695 f51569;

    /* JADX INFO: renamed from: ܿ֫ */
    public final InterfaceC4114[] f51570;

    /* JADX INFO: renamed from: ᩳ */
    public final Looper f51571;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f51572;

    /* JADX INFO: renamed from: ᩴ */
    public final long f51573;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C21381 f51574;

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC8146 f51575;

    /* JADX INFO: renamed from: ᩵֫ */
    public C19044 f51576;

    /* JADX INFO: renamed from: ᩶ */
    public final long f51577;

    /* JADX INFO: renamed from: ᩶֫ */
    public Object f51578;

    /* JADX INFO: renamed from: ᩷ */
    public C20386 f51579;

    /* JADX INFO: renamed from: ᩷֫ */
    public final InterfaceC4114[] f51580;

    /* JADX INFO: renamed from: ᩸ */
    public int f51581;

    /* JADX INFO: renamed from: ᩸֫ */
    public final AbstractC7593 f51582;

    /* JADX INFO: renamed from: ᩹ */
    public long f51583;

    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean f51584;

    /* JADX INFO: renamed from: ᩺ */
    public final C23738 f51585;

    /* JADX INFO: renamed from: ᩻ */
    public final CopyOnWriteArraySet f51586;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f51587;

    static {
        C18373.m41851("media3.exoplayer");
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ */
    public final void mo6819(InterfaceC2950 interfaceC2950) {
        interfaceC2950.getClass();
        this.f51563.m51994((Object) interfaceC2950);
    }

    public C17289(C17722 c17722) throws Throwable {
        C17722 c17723;
        C15849 c15849;
        Handler.Callback callback;
        final C17289 c17289 = this;
        ContextWrapper contextWrapper = c17722.f52932;
        c17289.f51531 = new C15968();
        try {
            C21334.m48349("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C5792.f14228 + "]");
            C15849 c158410 = c17722.f52936;
            c17289.f51567 = contextWrapper.getApplicationContext();
            c17722.f52923.getClass();
            c17289.f51553 = new C21549(c158410);
            c17289.f51572 = c17722.f52925;
            c17289.f51569 = c17722.f52931;
            c17289.f51538 = c17722.f52940;
            c17289.f51536 = false;
            c17289.f51573 = c17722.f52944;
            SurfaceHolderCallbackC21985 surfaceHolderCallbackC21985 = new SurfaceHolderCallbackC21985(c17289);
            c17289.f51565 = surfaceHolderCallbackC21985;
            c17289.f51539 = new C11256();
            Handler handler = new Handler(c17722.f52930);
            InterfaceC24901 interfaceC24901 = (InterfaceC24901) c17722.f52939.get();
            InterfaceC4114[] interfaceC4114ArrMo22762 = interfaceC24901.mo22762(handler, surfaceHolderCallbackC21985, surfaceHolderCallbackC21985, surfaceHolderCallbackC21985, surfaceHolderCallbackC21985);
            c17289.f51570 = interfaceC4114ArrMo22762;
            C23877.m52960(interfaceC4114ArrMo22762.length > 0);
            c17289.f51580 = new InterfaceC4114[interfaceC4114ArrMo22762.length];
            int i = 0;
            while (true) {
                InterfaceC4114[] interfaceC4114Arr = c17289.f51580;
                if (i >= interfaceC4114Arr.length) {
                    break;
                }
                interfaceC24901.mo22761(c17289.f51570[i]);
                interfaceC4114Arr[i] = null;
                i++;
                c17289.f51531.m36284();
                throw th;
            }
            AbstractC7593 abstractC7593 = (AbstractC7593) c17722.f52933.get();
            c17289.f51582 = abstractC7593;
            c17289.f51533 = (InterfaceC10770) c17722.f52934.get();
            C13628 c13628M30990 = C13628.m30990((ContextWrapper) c17722.f52935.f59468);
            c17289.f51549 = c13628M30990;
            c17289.f51584 = c17722.f52942;
            C11491 c11491 = c17722.f52928;
            c17289.f51550 = c17722.f52926;
            c17289.f51548 = c17722.f52922;
            c17289.f51577 = c17722.f52929;
            C22220 c22220 = c17722.f52921;
            c17289.f51543 = c22220;
            Looper looper = c17722.f52930;
            c17289.f51571 = looper;
            c17289.f51547 = c158410;
            c17289.f51552 = c17289;
            c17289.f51563 = new C23345(looper, c158410, new C9179());
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            c17289.f51586 = copyOnWriteArraySet;
            c17289.f51558 = new ArrayList();
            c17289.f51532 = new C7573();
            InterfaceC4114[] interfaceC4114Arr2 = c17289.f51570;
            C3569 c3569 = new C3569(new C18866[interfaceC4114Arr2.length], new InterfaceC11617[interfaceC4114Arr2.length], C15690.f45476, null);
            c17289.f51526 = c3569;
            c17289.f51585 = new C23738();
            C6304 c6304 = new C6304();
            c6304.m14317(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            c6304.m14315(29, abstractC7593 instanceof C8934);
            c6304.m14315(23, false);
            c6304.m14315(25, false);
            c6304.m14315(33, false);
            c6304.m14315(26, false);
            c6304.m14315(34, false);
            C20386 c20386M14313 = c6304.m14313();
            c17289.f51560 = c20386M14313;
            C6304 c6305 = new C6304();
            c6305.m14316(c20386M14313);
            c6305.m14314(4);
            c6305.m14314(10);
            c17289.f51579 = c6305.m14313();
            c17289.f51530 = c158410.mo35964(looper, null);
            C17051 c17051 = new C17051(c17289);
            c17289.f51554 = c17051;
            c17289.f51544 = C14569.m33310(c3569);
            c17289.f51553.mo47177(c17289, looper);
            final C15512 c15512 = new C15512(c17722.f52924);
            Context context = c17289.f51567;
            InterfaceC4114[] interfaceC4114Arr3 = c17289.f51570;
            InterfaceC4114[] interfaceC4114Arr4 = c17289.f51580;
            c17722.f52941.getClass();
            try {
                C21315 c21315 = new C21315(context, interfaceC4114Arr3, interfaceC4114Arr4, abstractC7593, c3569, new C13760(), c13628M30990, c17289.f51562, c17289.f51566, c17289.f51553, c11491, c17722.f52927, c17722.f52938, looper, c158410, c17051, c15512, c17289.f51539);
                c17289 = this;
                c17289.f51545 = c21315;
                Looper looperM48327 = c21315.m48327();
                c17289.f51562 = 0;
                C19044 c19044 = C19044.f56787;
                c17289.f51537 = c19044;
                c17289.f51576 = c19044;
                c17289.f51581 = -1;
                c17289.f51535 = C6443.f16654;
                c17289.f51564 = true;
                c17289.mo6819(c17289.f51553);
                c13628M30990.mo30993(new Handler(looper), c17289.f51553);
                copyOnWriteArraySet.add(c17289.f51565);
                if (Build.VERSION.SDK_INT >= 31) {
                    final Context context2 = c17289.f51567;
                    c17723 = c17722;
                    final boolean z = c17723.f52943;
                    callback = null;
                    c15849 = c158410;
                    c15849.mo35964(c21315.m48327(), null).mo19707(new Runnable() { // from class: l.ܽۙ֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13502 c13502M30643 = C13502.m30643(context2);
                            if (c13502M30643 == null) {
                                C21334.m48351("MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                c17289.m39202(c13502M30643);
                            }
                            c15512.m35303(c13502M30643.m30653());
                        }
                    });
                } else {
                    c17723 = c17722;
                    c15849 = c158410;
                    callback = null;
                }
                Handler.Callback callback2 = callback;
                C12617 c12617 = new C12617(0, looperM48327, looper, c15849, new InterfaceC3899() { // from class: l.᩹᩶֫
                    @Override // p067l.InterfaceC3899
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo7705(Object obj, Object obj2) {
                        ((Integer) obj).getClass();
                        C17289.m39169(this.f75555, ((Integer) obj2).intValue());
                    }
                });
                c17289.f51542 = c12617;
                c12617.m29030(new Runnable() { // from class: l.᩶᩶֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17289.m39168(this.f68465);
                    }
                });
                C15849 c158411 = c15849;
                C10407 c10407 = new C10407(contextWrapper, looperM48327, c17723.f52930, c17289.f51565, c15849);
                c17289.f51561 = c10407;
                c10407.m24109();
                C4785 c4785 = new C4785();
                contextWrapper.getApplicationContext();
                c158411.mo35964(looperM48327, callback2);
                c17289.f51559 = c4785;
                C20208 c20208 = new C20208();
                contextWrapper.getApplicationContext();
                c158411.mo35964(looperM48327, callback2);
                c17289.f51557 = c20208;
                C17682 c17682 = C17682.f52814;
                c17289.f51534 = C8454.f22684;
                c17289.f51529 = C18532.f55343;
                c21315.m48319(c22220);
                c21315.m48318(c17289.f51569);
                c17289.m39162(1, 3, c17289.f51569);
                c17289.m39162(2, 4, Integer.valueOf(c17289.f51538));
                c17289.m39162(2, 5, (Object) 0);
                c17289.m39162(1, 9, Boolean.valueOf(c17289.f51536));
                c17289.m39162(6, 8, c17289.f51539);
                c17289.m39162(-1, 16, Integer.valueOf(c17289.f51572));
                c17289.f51531.m36284();
            } catch (Throwable th) {
                th = th;
                c17289 = this;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m39188(final C17289 c17289, final C16619 c16619) {
        c17289.f51530.mo19707(new Runnable() { // from class: l.ۙ᩶֫
            @Override // java.lang.Runnable
            public final void run() {
                C17289.m39176(this.f18219, c16619);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39168(C17289 c17289) {
        C12617 c12617 = c17289.f51542;
        Context context = c17289.f51567;
        String str = C5792.f14228;
        c12617.m29029(Integer.valueOf(C4431.m9260(context).generateAudioSessionId()));
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֨ */
    public final Looper mo6793() {
        return this.f51571;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩹ */
    public final C20386 mo6841() {
        m39199();
        return this.f51579;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6835() {
        m39199();
        return this.f51544.f41611;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֡ */
    public final int mo6792() {
        m39199();
        return this.f51544.f41610;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۖ */
    public final C19735 mo6804() {
        m39199();
        return this.f51544.f41608;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ */
    public final void mo6816() {
        m39199();
        C14569 c14569 = this.f51544;
        if (c14569.f41611 != 1) {
            return;
        }
        C14569 c14569M33319 = c14569.m33319((C19735) null);
        C14569 c14569M39159 = m39159(c14569M33319, c14569M33319.f41602.m15990() ? 4 : 2);
        this.f51555++;
        this.f51545.m48328();
        m39167(c14569M39159, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6798(List list) {
        m39199();
        ArrayList arrayListM39186 = m39186(list);
        m39199();
        m39166(arrayListM39186, -1, -9223372036854775807L, true);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6795(long j, List list) {
        m39199();
        ArrayList arrayListM39186 = m39186(list);
        m39199();
        m39166(arrayListM39186, 0, j, false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۗ */
    public final void mo6805() {
        C15239 c15239;
        int i;
        Pair pairM39156;
        Pair pairM15980;
        boolean z;
        C14569 c14569M39160;
        int i2;
        m39199();
        ArrayList arrayList = this.f51558;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        C14569 c14569 = this.f51544;
        int iM39193 = m39193(c14569);
        long jM39155 = m39155(c14569);
        AbstractC6974 abstractC6974 = c14569.f41602;
        int size2 = arrayList.size();
        this.f51555++;
        for (int i3 = iMin - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        this.f51532 = this.f51532.mo6322(iMin);
        C15239 c152310 = new C15239(arrayList, this.f51532);
        if (abstractC6974.m15990() || c152310.m15990()) {
            c15239 = c152310;
            i = size2;
            boolean z2 = !abstractC6974.m15990() && c15239.m15990();
            int i4 = z2 ? -1 : iM39193;
            if (z2) {
                jM39155 = -9223372036854775807L;
            }
            pairM39156 = m39156(c15239, i4, jM39155);
        } else {
            pairM15980 = abstractC6974.m15980(this.f48018, this.f51585, iM39193, C5792.m12990(jM39155));
            Object obj = pairM15980.first;
            if (c152310.mo15978(obj) != -1) {
                z = true;
                c15239 = c152310;
                i = size2;
            } else {
                c15239 = c152310;
                i = size2;
                int iM48232 = C21315.m48232(this.f48018, this.f51585, this.f51562, this.f51566, obj, abstractC6974, c15239);
                if (iM48232 != -1) {
                    C21727 c21727 = this.f48018;
                    c15239.mo15983(iM48232, c21727, 0L);
                    pairM39156 = m39156(c15239, iM48232, C5792.m13013(c21727.f68425));
                } else {
                    pairM39156 = m39156(c15239, -1, -9223372036854775807L);
                }
            }
            c14569M39160 = m39160(c14569, c15239, pairM15980);
            i2 = c14569M39160.f41611;
            if (i2 != z && i2 != 4 && iMin > 0 && iMin == i && iM39193 >= c14569M39160.f41602.mo15987()) {
                c14569M39160 = m39159(c14569M39160, 4);
            }
            C14569 c145610 = c14569M39160;
            this.f51545.m48314(iMin, this.f51532);
            m39167(c145610, 0, z ^ c145610.f41616.f52252.equals(this.f51544.f41616.f52252), 4, m39185(c145610), -1, false);
        }
        pairM15980 = pairM39156;
        z = true;
        c14569M39160 = m39160(c14569, c15239, pairM15980);
        i2 = c14569M39160.f41611;
        if (i2 != z) {
            c14569M39160 = m39159(c14569M39160, 4);
        }
        C14569 c145611 = c14569M39160;
        this.f51545.m48314(iMin, this.f51532);
        m39167(c145611, 0, z ^ c145611.f41616.f52252.equals(this.f51544.f41616.f52252), 4, m39185(c145611), -1, false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6802(boolean z) {
        m39199();
        m39163(1, z);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo6839() {
        m39199();
        return this.f51544.f41613;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6794(final int i) {
        m39199();
        if (this.f51562 != i) {
            this.f51562 = i;
            this.f51545.m48323(i);
            InterfaceC9934 interfaceC9934 = new InterfaceC9934() { // from class: l.۠᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj) {
                    ((InterfaceC2950) obj).mo4872(i);
                }
            };
            C23345 c23345 = this.f51563;
            c23345.m51993(8, interfaceC9934);
            m39181();
            c23345.m51992();
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۜ */
    public final int mo6810() {
        m39199();
        return this.f51562;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ */
    public final void mo6820(final boolean z) {
        m39199();
        if (this.f51566 != z) {
            this.f51566 = z;
            this.f51545.m48325(z);
            InterfaceC9934 interfaceC9934 = new InterfaceC9934() { // from class: l.ۗ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj) {
                    ((InterfaceC2950) obj).mo4870(z);
                }
            };
            C23345 c23345 = this.f51563;
            c23345.m51993(9, interfaceC9934);
            m39181();
            c23345.m51992();
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫֫ */
    public final boolean mo6803() {
        m39199();
        return this.f51566;
    }

    @Override // p067l.AbstractC16341
    /* JADX INFO: renamed from: ֫ */
    public final void mo37142(long j, int i, boolean z) {
        m39199();
        if (i == -1) {
            return;
        }
        C23877.m52957(i >= 0);
        AbstractC6974 abstractC6974 = this.f51544.f41602;
        if (abstractC6974.m15990() || i < abstractC6974.mo15987()) {
            this.f51553.mo47188();
            this.f51555++;
            if (mo6840()) {
                C21334.m48351("seekTo ignored because an ad is playing");
                C16619 c16619 = new C16619(this.f51544);
                c16619.m37679(1);
                m39188(this.f51554.f50436, c16619);
                return;
            }
            C14569 c14569M33313 = this.f51544;
            int i2 = c14569M33313.f41611;
            if (i2 == 3 || (i2 == 4 && !abstractC6974.m15990())) {
                c14569M33313 = this.f51544.m33313(2);
            }
            int iMo6811 = mo6811();
            C14569 c14569M39160 = m39160(c14569M33313, abstractC6974, m39156(abstractC6974, i, j));
            this.f51545.m48316(abstractC6974, i, C5792.m12990(j));
            m39167(c14569M39160, 0, true, 1, m39185(c14569M39160), iMo6811, z);
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܳ֫ */
    public final long mo6828() {
        m39199();
        return this.f51550;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩺ */
    public final long mo6842() {
        m39199();
        return this.f51548;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۙ */
    public final long mo6807() {
        m39199();
        return this.f51577;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6800(C4963 c4963) {
        m39199();
        if (this.f51544.f41620.equals(c4963)) {
            return;
        }
        C14569 c14569M33315 = this.f51544.m33315(c4963);
        this.f51555++;
        this.f51545.m48324(c4963);
        m39167(c14569M33315, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܽ */
    public final C4963 mo6831() {
        m39199();
        return this.f51544.f41620;
    }

    @Override // p067l.InterfaceC3621
    public final void stop() {
        m39199();
        m39179((C19735) null);
        AbstractC16192 abstractC16192M36872of = AbstractC16192.m36872of();
        long j = this.f51544.f41605;
        this.f51535 = new C6443(abstractC16192M36872of);
    }

    @Override // p067l.InterfaceC6324
    /* JADX INFO: renamed from: ֫ */
    public final void mo14457() {
        C21334.m48349("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C5792.f14228 + "] [" + C18373.m41850() + "]");
        m39199();
        this.f51561.m24109();
        this.f51559.m10088(false);
        this.f51557.m45701(false);
        if (!this.f51545.m48326()) {
            this.f51563.m51997(10, new C21466(3));
        }
        this.f51563.m51996();
        this.f51530.mo19709();
        this.f51549.mo30994(this.f51553);
        C14569 c14569 = this.f51544;
        if (c14569.f41618) {
            this.f51544 = c14569.m33312();
        }
        C14569 c14569M39159 = m39159(this.f51544, 1);
        this.f51544 = c14569M39159;
        C14569 c14569M33317 = c14569M39159.m33317(c14569M39159.f41616);
        this.f51544 = c14569M33317;
        c14569M33317.f41604 = c14569M33317.f41605;
        this.f51544.f41607 = 0L;
        this.f51553.mo47166();
        m39180();
        Surface surface = this.f51556;
        if (surface != null) {
            surface.release();
            this.f51556 = null;
        }
        this.f51535 = C6443.f16654;
        this.f51568 = true;
    }

    @Override // p067l.InterfaceC6324
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo14461() {
        m39199();
        return this.f51568;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۫ */
    public final int mo6824() {
        m39199();
        if (this.f51544.f41602.m15990()) {
            return 0;
        }
        C14569 c14569 = this.f51544;
        return c14569.f41602.mo15978(c14569.f41616.f52252);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۟ */
    public final int mo6811() {
        m39199();
        int iM39193 = m39193(this.f51544);
        if (iM39193 == -1) {
            return 0;
        }
        return iM39193;
    }

    @Override // p067l.InterfaceC3621
    public final long getDuration() {
        m39199();
        if (mo6840()) {
            C14569 c14569 = this.f51544;
            C17474 c17474 = c14569.f41616;
            AbstractC6974 abstractC6974 = c14569.f41602;
            Object obj = c17474.f52252;
            C23738 c23738 = this.f51585;
            abstractC6974.mo15985(obj, c23738);
            return C5792.m13013(c23738.m52775(c17474.f52248, c17474.f52249));
        }
        return mo6825();
    }

    @Override // p067l.InterfaceC3621
    public final long getCurrentPosition() {
        m39199();
        return C5792.m13013(m39185(this.f51544));
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۢ */
    public final long mo6814() {
        m39199();
        return C5792.m13013(this.f51544.f41607);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6840() {
        m39199();
        return this.f51544.f41616.m39842();
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩵ */
    public final int mo6838() {
        m39199();
        if (mo6840()) {
            return this.f51544.f41616.f52248;
        }
        return -1;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۛ */
    public final int mo6809() {
        m39199();
        if (mo6840()) {
            return this.f51544.f41616.f52249;
        }
        return -1;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܰ */
    public final long mo6826() {
        m39199();
        return m39155(this.f51544);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ֫ */
    public final long mo6822() {
        m39199();
        if (this.f51544.f41602.m15990()) {
            return this.f51583;
        }
        C14569 c14569 = this.f51544;
        long j = 0;
        if (c14569.f41617.f52251 != c14569.f41616.f52251) {
            return C5792.m13013(c14569.f41602.mo15983(mo6811(), this.f48018, 0L).f68431);
        }
        long j2 = c14569.f41604;
        if (this.f51544.f41617.m39842()) {
            C14569 c145610 = this.f51544;
            c145610.f41602.mo15985(c145610.f41617.f52252, this.f51585).m52774(this.f51544.f41617.f52248);
        } else {
            j = j2;
        }
        C14569 c145611 = this.f51544;
        AbstractC6974 abstractC6974 = c145611.f41602;
        Object obj = c145611.f41617.f52252;
        C23738 c23738 = this.f51585;
        abstractC6974.mo15985(obj, c23738);
        return C5792.m13013(j + c23738.f75530);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۘ */
    public final C15690 mo6806() {
        m39199();
        return this.f51544.f41609.f7247;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۠ */
    public final C13680 mo6812() {
        m39199();
        C13680 c13680Mo17537 = this.f51582.mo17537();
        return this.f51587 ? c13680Mo17537.mo31081().mo19201(this.f51575).mo19204() : c13680Mo17537;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6801(C13680 c13680) {
        C13680 c13680Mo19204;
        m39199();
        AbstractC7593 abstractC7593 = this.f51582;
        abstractC7593.getClass();
        if (abstractC7593 instanceof C8934) {
            C13680 c13680Mo6812 = mo6812();
            if (this.f51587) {
                this.f51575 = c13680.f38569;
                AbstractC8146 abstractC8146 = this.f51543.f70273;
                C8315 c8315Mo31081 = c13680.mo31081();
                AbstractC21520 it = abstractC8146.iterator();
                while (it.hasNext()) {
                    c8315Mo31081.mo19200(((Integer) it.next()).intValue(), true);
                }
                c13680Mo19204 = c8315Mo31081.mo19204();
            } else {
                c13680Mo19204 = c13680;
            }
            if (!c13680Mo19204.equals(abstractC7593.mo17537())) {
                abstractC7593.mo17535(c13680Mo19204);
            }
            if (c13680Mo6812.equals(c13680)) {
                return;
            }
            this.f51563.m51997(19, new C11010(c13680));
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܿ֫ */
    public final C19044 mo6834() {
        m39199();
        return this.f51537;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC6974 mo6808() {
        m39199();
        return this.f51544.f41602;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۤ */
    public final C8454 mo6815() {
        m39199();
        return this.f51534;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۨ */
    public final void mo6823() {
        m39199();
        m39180();
        m39165((Object) null);
        m39161(0, 0);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6796(SurfaceView surfaceView) {
        m39199();
        if (surfaceView instanceof InterfaceC23195) {
            m39180();
            m39165((Object) surfaceView);
            m39164(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof C21381;
        SurfaceHolderCallbackC21985 surfaceHolderCallbackC21985 = this.f51565;
        if (z) {
            m39180();
            this.f51574 = (C21381) surfaceView;
            C13229 c13229M39158 = m39158(this.f51539);
            c13229M39158.m30279(10000);
            c13229M39158.m30280(this.f51574);
            c13229M39158.m30284();
            this.f51574.m48456(surfaceHolderCallbackC21985);
            m39165(this.f51574.m48459());
            m39164(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m39199();
        if (holder == null) {
            mo6823();
            return;
        }
        m39180();
        this.f51540 = true;
        this.f51527 = holder;
        holder.addCallback(surfaceHolderCallbackC21985);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            m39165(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m39161(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m39165((Object) null);
            m39161(0, 0);
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ */
    public final void mo6817(SurfaceView surfaceView) {
        m39199();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m39199();
        if (holder == null || holder != this.f51527) {
            return;
        }
        mo6823();
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6797(TextureView textureView) {
        m39199();
        if (textureView == null) {
            mo6823();
            return;
        }
        m39180();
        this.f51546 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C21334.m48351("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f51565);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m39165((Object) null);
            m39161(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m39165(surface);
            this.f51556 = surface;
            m39161(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ */
    public final void mo6818(TextureView textureView) {
        m39199();
        if (textureView == null || textureView != this.f51546) {
            return;
        }
        mo6823();
    }

    @Override // p067l.InterfaceC6324
    /* JADX INFO: renamed from: ܽ */
    public final void mo14459(boolean z) {
        C13680 c13680Mo19204;
        m39199();
        if (z == this.f51587) {
            return;
        }
        this.f51587 = z;
        C22220 c22220 = this.f51543;
        if (!c22220.f70273.isEmpty()) {
            AbstractC7593 abstractC7593 = this.f51582;
            abstractC7593.getClass();
            if (abstractC7593 instanceof C8934) {
                C13680 c13680Mo17537 = abstractC7593.mo17537();
                if (z) {
                    this.f51575 = c13680Mo17537.f38569;
                    AbstractC8146 abstractC8146 = c22220.f70273;
                    C8315 c8315Mo31081 = c13680Mo17537.mo31081();
                    AbstractC21520 it = abstractC8146.iterator();
                    while (it.hasNext()) {
                        c8315Mo31081.mo19200(((Integer) it.next()).intValue(), true);
                    }
                    c13680Mo19204 = c8315Mo31081.mo19204();
                } else {
                    c13680Mo19204 = c13680Mo17537.mo31081().mo19201(this.f51575).mo19204();
                    this.f51575 = null;
                }
                if (!c13680Mo19204.equals(c13680Mo17537)) {
                    abstractC7593.mo17535(c13680Mo19204);
                }
            }
        }
        this.f51545.m48320(z);
        C14569 c14569 = this.f51544;
        m39163(c14569.f41621, c14569.f41613);
    }

    @Override // p067l.InterfaceC6324
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo14460() {
        m39199();
        return this.f51587;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39202(C13502 c13502) {
        this.f51553.mo47180(c13502);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩴ */
    public final C6443 mo6837() {
        m39199();
        return this.f51535;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ֫ */
    public final void mo6799(InterfaceC2950 interfaceC2950) {
        m39199();
        interfaceC2950.getClass();
        this.f51563.m51995(interfaceC2950);
    }

    @Override // p067l.InterfaceC6324
    /* JADX INFO: renamed from: ֫ */
    public final void mo14458(InterfaceC17543 interfaceC17543) {
        m39199();
        m39162(4, 15, interfaceC17543);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39179(C19735 c19735) {
        C14569 c14569 = this.f51544;
        C14569 c14569M33317 = c14569.m33317(c14569.f41616);
        c14569M33317.f41604 = c14569M33317.f41605;
        c14569M33317.f41607 = 0L;
        C14569 c14569M39159 = m39159(c14569M33317, 1);
        if (c19735 != null) {
            c14569M39159 = c14569M39159.m33319(c19735);
        }
        this.f51555++;
        this.f51545.m48322();
        m39167(c14569M39159, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m39193(C14569 c14569) {
        if (c14569.f41602.m15990()) {
            return this.f51581;
        }
        return c14569.f41602.mo15985(c14569.f41616.f52252, this.f51585).f75532;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m39155(C14569 c14569) {
        C17474 c17474 = c14569.f41616;
        long j = c14569.f41606;
        AbstractC6974 abstractC6974 = c14569.f41602;
        if (c17474.m39842()) {
            Object obj = c14569.f41616.f52252;
            C23738 c23738 = this.f51585;
            abstractC6974.mo15985(obj, c23738);
            if (j == -9223372036854775807L) {
                return C5792.m13013(abstractC6974.mo15983(m39193(c14569), this.f48018, 0L).f68425);
            }
            return C5792.m13013(j) + C5792.m13013(c23738.f75530);
        }
        return C5792.m13013(m39185(c14569));
    }

    /* JADX INFO: renamed from: ۧ */
    private long m39185(C14569 c14569) {
        long jM33321;
        if (c14569.f41602.m15990()) {
            return C5792.m12990(this.f51583);
        }
        if (c14569.f41618) {
            jM33321 = c14569.m33321();
        } else {
            jM33321 = c14569.f41605;
        }
        if (c14569.f41616.m39842()) {
            return jM33321;
        }
        AbstractC6974 abstractC6974 = c14569.f41602;
        Object obj = c14569.f41616.f52252;
        C23738 c23738 = this.f51585;
        abstractC6974.mo15985(obj, c23738);
        return jM33321 + c23738.f75530;
    }

    /* JADX INFO: renamed from: ۧ */
    private ArrayList m39186(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f51533.mo24806((C13010) list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39176(C17289 c17289, C16619 c16619) {
        boolean z;
        int i = c17289.f51555 - c16619.f48859;
        c17289.f51555 = i;
        boolean z2 = true;
        if (c16619.f48860) {
            c17289.f51541 = c16619.f48857;
            c17289.f51551 = true;
        }
        if (i == 0) {
            AbstractC6974 abstractC6974 = c16619.f48861.f41602;
            if (!c17289.f51544.f41602.m15990() && abstractC6974.m15990()) {
                c17289.f51581 = -1;
                c17289.f51583 = 0L;
            }
            if (!abstractC6974.m15990()) {
                List listM34695 = ((C15239) abstractC6974).m34695();
                C23877.m52960(listM34695.size() == c17289.f51558.size());
                for (int i2 = 0; i2 < listM34695.size(); i2++) {
                    ((C10585) c17289.f51558.get(i2)).m24381((AbstractC6974) listM34695.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (c17289.f51551) {
                if (c16619.f48861.f41616.equals(c17289.f51544.f41616) && c16619.f48861.f41612 == c17289.f51544.f41605) {
                    z2 = false;
                }
                if (z2) {
                    if (abstractC6974.m15990() || c16619.f48861.f41616.m39842()) {
                        j = c16619.f48861.f41612;
                    } else {
                        C14569 c14569 = c16619.f48861;
                        C17474 c17474 = c14569.f41616;
                        long j2 = c14569.f41612;
                        Object obj = c17474.f52252;
                        C23738 c23738 = c17289.f51585;
                        abstractC6974.mo15985(obj, c23738);
                        j = j2 + c23738.f75530;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            c17289.f51551 = false;
            c17289.m39167(c16619.f48861, 1, z, c17289.f51541, j, -1, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x027f  */
    /* JADX WARN: Code duplicated, block: B:106:0x028a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0295  */
    /* JADX WARN: Code duplicated, block: B:110:0x029b  */
    /* JADX WARN: Code duplicated, block: B:113:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f2 A[LOOP:0: B:123:0x02ec->B:125:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135 A[LOOP:2: B:53:0x012f->B:55:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x0238  */
    /* JADX WARN: Code duplicated, block: B:94:0x0244  */
    /* JADX WARN: Code duplicated, block: B:97:0x0252  */
    /* JADX WARN: Code duplicated, block: B:99:0x0264  */
    /* JADX INFO: renamed from: ֫ */
    private void m39167(final C14569 c14569, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        boolean z3;
        C19735 c19735;
        List list;
        Pair pair;
        int i4;
        boolean zBooleanValue;
        final int iIntValue;
        final C13010 c13010;
        List list2;
        C19715 c19715M43272;
        int i5;
        C25079 c25079;
        int i6;
        boolean zEquals;
        boolean z4;
        boolean z5;
        boolean z6;
        C23345 c23345;
        C19735 c19736;
        C3569 c3569;
        C3569 c35610;
        Iterator it;
        int iMo6811;
        Object obj;
        C13010 c13011;
        Object obj2;
        int iMo15978;
        long jM13013;
        long jM13014;
        C14569 c145610 = this.f51544;
        this.f51544 = c14569;
        AbstractC6974 abstractC6974 = c145610.f41602;
        AbstractC6974 abstractC6975 = c14569.f41602;
        boolean z7 = c14569.f41618;
        C19735 c19737 = c14569.f41608;
        List list3 = c14569.f41619;
        boolean zEquals2 = abstractC6974.equals(abstractC6975);
        AbstractC6974 abstractC6976 = c145610.f41602;
        C17474 c17474 = c145610.f41616;
        AbstractC6974 abstractC6977 = c14569.f41602;
        C17474 c17475 = c14569.f41616;
        boolean zM15990 = abstractC6977.m15990();
        C21727 c21727 = this.f48018;
        C23738 c23738 = this.f51585;
        if (!zM15990 || !abstractC6976.m15990()) {
            z3 = z7;
            if (abstractC6977.m15990() != abstractC6976.m15990()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                c19735 = c19737;
                list = list3;
                if (!abstractC6976.mo15983(abstractC6976.mo15985(c17474.f52252, c23738).f75532, c21727, 0L).f68437.equals(abstractC6977.mo15983(abstractC6977.mo15985(c17475.f52252, c23738).f75532, c21727, 0L).f68437)) {
                    if (z && i2 == 0) {
                        i4 = 1;
                    } else if (z && i2 == 1) {
                        i4 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i4 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
                } else if (z && i2 == 0 && c17474.f52251 < c17475.f52251) {
                    pair = new Pair(Boolean.TRUE, 0);
                } else {
                    pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (abstractC6977.m15990()) {
                    c13010 = null;
                } else {
                    c13010 = abstractC6977.mo15983(abstractC6977.mo15985(c17475.f52252, c23738).f75532, c21727, 0L).f68429;
                }
                this.f51576 = C19044.f56787;
            } else {
                c13010 = null;
            }
            if (!zBooleanValue) {
                list2 = list;
                if (!c145610.f41619.equals(list2)) {
                }
                C19044 c19044M39192 = m39192();
                zEquals = c19044M39192.equals(this.f51537);
                this.f51537 = c19044M39192;
                if (c145610.f41613 != c14569.f41613) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c145610.f41611 != c14569.f41611) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 || z4) {
                    m39198();
                }
                if (c145610.f41615 != c14569.f41615) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c23345 = this.f51563;
                if (!zEquals2) {
                    c23345.m51993(0, new InterfaceC9934() { // from class: l.᩸᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj3) {
                            ((InterfaceC2950) obj3).mo4854(c14569.f41602, i);
                        }
                    });
                }
                if (z) {
                    final C7645 c7645M39157 = m39157(i2, c145610, i3);
                    iMo6811 = mo6811();
                    if (this.f51544.f41602.m15990()) {
                        obj = null;
                        c13011 = null;
                        obj2 = null;
                        iMo15978 = -1;
                    } else {
                        C14569 c145611 = this.f51544;
                        Object obj3 = c145611.f41616.f52252;
                        c145611.f41602.mo15985(obj3, c23738);
                        iMo15978 = this.f51544.f41602.mo15978(obj3);
                        obj = this.f51544.f41602.mo15983(iMo6811, c21727, 0L).f68437;
                        c13011 = c21727.f68429;
                        obj2 = obj3;
                    }
                    jM13013 = C5792.m13013(j);
                    if (this.f51544.f41616.m39842()) {
                        jM13014 = C5792.m13013(m39196(this.f51544));
                    } else {
                        jM13014 = jM13013;
                    }
                    C17474 c17476 = this.f51544.f41616;
                    final C7645 c7645 = new C7645(obj, iMo6811, c13011, obj2, iMo15978, jM13013, jM13014, c17476.f52248, c17476.f52249);
                    c23345.m51993(11, new InterfaceC9934() { // from class: l.ܰ᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj4;
                            interfaceC2950.getClass();
                            interfaceC2950.mo4849(i2, c7645M39157, c7645);
                        }
                    });
                } else {
                    z5 = z5;
                    z6 = z6;
                }
                if (zBooleanValue) {
                    c23345.m51993(1, new InterfaceC9934() { // from class: l.۟᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4856(c13010, iIntValue);
                        }
                    });
                }
                c19736 = c19735;
                if (c145610.f41608 != c19736) {
                    c23345.m51993(10, new InterfaceC9934() { // from class: l.֫ۙ֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4867(c14569.f41608);
                        }
                    });
                    if (c19736 != null) {
                        c23345.m51993(10, new InterfaceC9934() { // from class: l.ۧۙ֫
                            @Override // p067l.InterfaceC9934
                            public final void invoke(Object obj4) {
                                ((InterfaceC2950) obj4).mo4859(c14569.f41608);
                            }
                        });
                    }
                }
                c3569 = c145610.f41609;
                c35610 = c14569.f41609;
                if (c3569 != c35610) {
                    this.f51582.mo14190(c35610.f7244);
                    c23345.m51993(2, new InterfaceC9934() { // from class: l.ᩴ᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4858(c14569.f41609.f7247);
                        }
                    });
                }
                if (!zEquals) {
                    c23345.m51993(14, new C21658(this.f51537));
                }
                if (z6) {
                    c23345.m51993(3, new InterfaceC9934() { // from class: l.᩵᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj4;
                            C14569 c145612 = c14569;
                            boolean z8 = c145612.f41615;
                            interfaceC2950.getClass();
                            interfaceC2950.mo4873(c145612.f41615);
                        }
                    });
                }
                if (z5 || z4) {
                    c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            C14569 c145612 = c14569;
                            ((InterfaceC2950) obj4).mo4866(c145612.f41611, c145612.f41613);
                        }
                    });
                }
                if (z5) {
                    c23345.m51993(4, new InterfaceC9934() { // from class: l.ۚ᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4869(c14569.f41611);
                        }
                    });
                }
                if (z4 == 0 || c145610.f41621 != c14569.f41621) {
                    c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            C14569 c145612 = c14569;
                            ((InterfaceC2950) obj4).mo4850(c145612.f41621, c145612.f41613);
                        }
                    });
                }
                if (c145610.f41610 != c14569.f41610) {
                    c23345.m51993(6, new InterfaceC9934() { // from class: l.ۛ᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4865(c14569.f41610);
                        }
                    });
                }
                if (c145610.m33323() != c14569.m33323()) {
                    c23345.m51993(7, new InterfaceC9934() { // from class: l.ۨ᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4868(c14569.m33323());
                        }
                    });
                }
                if (!c145610.f41620.equals(c14569.f41620)) {
                    c23345.m51993(12, new InterfaceC9934() { // from class: l.᩺᩶֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj4) {
                            ((InterfaceC2950) obj4).mo4852(c14569.f41620);
                        }
                    });
                }
                m39181();
                c23345.m51992();
                if (c145610.f41618 != z3) {
                    it = this.f51586.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC19064) it.next()).mo43301();
                    }
                }
            }
            list2 = list;
            c19715M43272 = this.f51576.m43272();
            i5 = 0;
            while (i5 < list2.size()) {
                c25079 = (C25079) list2.get(i5);
                List list4 = list2;
                for (i6 = 0; i6 < c25079.m55048(); i6++) {
                    c25079.m55049(i6).mo3422(c19715M43272);
                }
                i5++;
                list2 = list4;
            }
            this.f51576 = c19715M43272.m44826();
            C19044 c19044M39193 = m39192();
            zEquals = c19044M39193.equals(this.f51537);
            this.f51537 = c19044M39193;
            if (c145610.f41613 != c14569.f41613) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c145610.f41611 != c14569.f41611) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m39198();
            } else {
                m39198();
            }
            if (c145610.f41615 != c14569.f41615) {
                z6 = true;
            } else {
                z6 = false;
            }
            c23345 = this.f51563;
            if (!zEquals2) {
                c23345.m51993(0, new InterfaceC9934() { // from class: l.᩸᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj4) {
                        ((InterfaceC2950) obj4).mo4854(c14569.f41602, i);
                    }
                });
            }
            if (z) {
                final C7645 c7645M39158 = m39157(i2, c145610, i3);
                iMo6811 = mo6811();
                if (this.f51544.f41602.m15990()) {
                    C14569 c145612 = this.f51544;
                    Object obj4 = c145612.f41616.f52252;
                    c145612.f41602.mo15985(obj4, c23738);
                    iMo15978 = this.f51544.f41602.mo15978(obj4);
                    obj = this.f51544.f41602.mo15983(iMo6811, c21727, 0L).f68437;
                    c13011 = c21727.f68429;
                    obj2 = obj4;
                } else {
                    obj = null;
                    c13011 = null;
                    obj2 = null;
                    iMo15978 = -1;
                }
                jM13013 = C5792.m13013(j);
                if (this.f51544.f41616.m39842()) {
                    jM13014 = C5792.m13013(m39196(this.f51544));
                } else {
                    jM13014 = jM13013;
                }
                C17474 c17477 = this.f51544.f41616;
                final C7645 c7646 = new C7645(obj, iMo6811, c13011, obj2, iMo15978, jM13013, jM13014, c17477.f52248, c17477.f52249);
                c23345.m51993(11, new InterfaceC9934() { // from class: l.ܰ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj5;
                        interfaceC2950.getClass();
                        interfaceC2950.mo4849(i2, c7645M39158, c7646);
                    }
                });
            } else {
                z5 = z5;
                z6 = z6;
            }
            if (zBooleanValue) {
                c23345.m51993(1, new InterfaceC9934() { // from class: l.۟᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4856(c13010, iIntValue);
                    }
                });
            }
            c19736 = c19735;
            if (c145610.f41608 != c19736) {
                c23345.m51993(10, new InterfaceC9934() { // from class: l.֫ۙ֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4867(c14569.f41608);
                    }
                });
                if (c19736 != null) {
                    c23345.m51993(10, new InterfaceC9934() { // from class: l.ۧۙ֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj5) {
                            ((InterfaceC2950) obj5).mo4859(c14569.f41608);
                        }
                    });
                }
            }
            c3569 = c145610.f41609;
            c35610 = c14569.f41609;
            if (c3569 != c35610) {
                this.f51582.mo14190(c35610.f7244);
                c23345.m51993(2, new InterfaceC9934() { // from class: l.ᩴ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4858(c14569.f41609.f7247);
                    }
                });
            }
            if (!zEquals) {
                c23345.m51993(14, new C21658(this.f51537));
            }
            if (z6) {
                c23345.m51993(3, new InterfaceC9934() { // from class: l.᩵᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj5;
                        C14569 c145613 = c14569;
                        boolean z8 = c145613.f41615;
                        interfaceC2950.getClass();
                        interfaceC2950.mo4873(c145613.f41615);
                    }
                });
            }
            if (z5) {
                c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        C14569 c145613 = c14569;
                        ((InterfaceC2950) obj5).mo4866(c145613.f41611, c145613.f41613);
                    }
                });
            } else {
                c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        C14569 c145613 = c14569;
                        ((InterfaceC2950) obj5).mo4866(c145613.f41611, c145613.f41613);
                    }
                });
            }
            if (z5) {
                c23345.m51993(4, new InterfaceC9934() { // from class: l.ۚ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4869(c14569.f41611);
                    }
                });
            }
            if (z4 == 0) {
                c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        C14569 c145613 = c14569;
                        ((InterfaceC2950) obj5).mo4850(c145613.f41621, c145613.f41613);
                    }
                });
            } else {
                c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        C14569 c145613 = c14569;
                        ((InterfaceC2950) obj5).mo4850(c145613.f41621, c145613.f41613);
                    }
                });
            }
            if (c145610.f41610 != c14569.f41610) {
                c23345.m51993(6, new InterfaceC9934() { // from class: l.ۛ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4865(c14569.f41610);
                    }
                });
            }
            if (c145610.m33323() != c14569.m33323()) {
                c23345.m51993(7, new InterfaceC9934() { // from class: l.ۨ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4868(c14569.m33323());
                    }
                });
            }
            if (!c145610.f41620.equals(c14569.f41620)) {
                c23345.m51993(12, new InterfaceC9934() { // from class: l.᩺᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4852(c14569.f41620);
                    }
                });
            }
            m39181();
            c23345.m51992();
            if (c145610.f41618 != z3) {
                it = this.f51586.iterator();
                while (it.hasNext()) {
                    ((InterfaceC19064) it.next()).mo43301();
                }
            }
        }
        pair = new Pair(Boolean.FALSE, -1);
        z3 = z7;
        c19735 = c19737;
        list = list3;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (abstractC6977.m15990()) {
                c13010 = abstractC6977.mo15983(abstractC6977.mo15985(c17475.f52252, c23738).f75532, c21727, 0L).f68429;
            } else {
                c13010 = null;
            }
            this.f51576 = C19044.f56787;
        } else {
            c13010 = null;
        }
        if (!zBooleanValue) {
            list2 = list;
            if (!c145610.f41619.equals(list2)) {
            }
            C19044 c19044M39194 = m39192();
            zEquals = c19044M39194.equals(this.f51537);
            this.f51537 = c19044M39194;
            if (c145610.f41613 != c14569.f41613) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c145610.f41611 != c14569.f41611) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m39198();
            } else {
                m39198();
            }
            if (c145610.f41615 != c14569.f41615) {
                z6 = true;
            } else {
                z6 = false;
            }
            c23345 = this.f51563;
            if (!zEquals2) {
                c23345.m51993(0, new InterfaceC9934() { // from class: l.᩸᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj5) {
                        ((InterfaceC2950) obj5).mo4854(c14569.f41602, i);
                    }
                });
            }
            if (z) {
                final C7645 c7645M39159 = m39157(i2, c145610, i3);
                iMo6811 = mo6811();
                if (this.f51544.f41602.m15990()) {
                    C14569 c145613 = this.f51544;
                    Object obj5 = c145613.f41616.f52252;
                    c145613.f41602.mo15985(obj5, c23738);
                    iMo15978 = this.f51544.f41602.mo15978(obj5);
                    obj = this.f51544.f41602.mo15983(iMo6811, c21727, 0L).f68437;
                    c13011 = c21727.f68429;
                    obj2 = obj5;
                } else {
                    obj = null;
                    c13011 = null;
                    obj2 = null;
                    iMo15978 = -1;
                }
                jM13013 = C5792.m13013(j);
                if (this.f51544.f41616.m39842()) {
                    jM13014 = C5792.m13013(m39196(this.f51544));
                } else {
                    jM13014 = jM13013;
                }
                C17474 c17478 = this.f51544.f41616;
                final C7645 c7647 = new C7645(obj, iMo6811, c13011, obj2, iMo15978, jM13013, jM13014, c17478.f52248, c17478.f52249);
                c23345.m51993(11, new InterfaceC9934() { // from class: l.ܰ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj6;
                        interfaceC2950.getClass();
                        interfaceC2950.mo4849(i2, c7645M39159, c7647);
                    }
                });
            } else {
                z5 = z5;
                z6 = z6;
            }
            if (zBooleanValue) {
                c23345.m51993(1, new InterfaceC9934() { // from class: l.۟᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4856(c13010, iIntValue);
                    }
                });
            }
            c19736 = c19735;
            if (c145610.f41608 != c19736) {
                c23345.m51993(10, new InterfaceC9934() { // from class: l.֫ۙ֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4867(c14569.f41608);
                    }
                });
                if (c19736 != null) {
                    c23345.m51993(10, new InterfaceC9934() { // from class: l.ۧۙ֫
                        @Override // p067l.InterfaceC9934
                        public final void invoke(Object obj6) {
                            ((InterfaceC2950) obj6).mo4859(c14569.f41608);
                        }
                    });
                }
            }
            c3569 = c145610.f41609;
            c35610 = c14569.f41609;
            if (c3569 != c35610) {
                this.f51582.mo14190(c35610.f7244);
                c23345.m51993(2, new InterfaceC9934() { // from class: l.ᩴ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4858(c14569.f41609.f7247);
                    }
                });
            }
            if (!zEquals) {
                c23345.m51993(14, new C21658(this.f51537));
            }
            if (z6) {
                c23345.m51993(3, new InterfaceC9934() { // from class: l.᩵᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj6;
                        C14569 c145614 = c14569;
                        boolean z8 = c145614.f41615;
                        interfaceC2950.getClass();
                        interfaceC2950.mo4873(c145614.f41615);
                    }
                });
            }
            if (z5) {
                c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        C14569 c145614 = c14569;
                        ((InterfaceC2950) obj6).mo4866(c145614.f41611, c145614.f41613);
                    }
                });
            } else {
                c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        C14569 c145614 = c14569;
                        ((InterfaceC2950) obj6).mo4866(c145614.f41611, c145614.f41613);
                    }
                });
            }
            if (z5) {
                c23345.m51993(4, new InterfaceC9934() { // from class: l.ۚ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4869(c14569.f41611);
                    }
                });
            }
            if (z4 == 0) {
                c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        C14569 c145614 = c14569;
                        ((InterfaceC2950) obj6).mo4850(c145614.f41621, c145614.f41613);
                    }
                });
            } else {
                c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        C14569 c145614 = c14569;
                        ((InterfaceC2950) obj6).mo4850(c145614.f41621, c145614.f41613);
                    }
                });
            }
            if (c145610.f41610 != c14569.f41610) {
                c23345.m51993(6, new InterfaceC9934() { // from class: l.ۛ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4865(c14569.f41610);
                    }
                });
            }
            if (c145610.m33323() != c14569.m33323()) {
                c23345.m51993(7, new InterfaceC9934() { // from class: l.ۨ᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4868(c14569.m33323());
                    }
                });
            }
            if (!c145610.f41620.equals(c14569.f41620)) {
                c23345.m51993(12, new InterfaceC9934() { // from class: l.᩺᩶֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj6) {
                        ((InterfaceC2950) obj6).mo4852(c14569.f41620);
                    }
                });
            }
            m39181();
            c23345.m51992();
            if (c145610.f41618 != z3) {
                it = this.f51586.iterator();
                while (it.hasNext()) {
                    ((InterfaceC19064) it.next()).mo43301();
                }
            }
        }
        list2 = list;
        c19715M43272 = this.f51576.m43272();
        i5 = 0;
        while (i5 < list2.size()) {
            c25079 = (C25079) list2.get(i5);
            List list5 = list2;
            while (i6 < c25079.m55048()) {
                c25079.m55049(i6).mo3422(c19715M43272);
            }
            i5++;
            list2 = list5;
        }
        this.f51576 = c19715M43272.m44826();
        C19044 c19044M39195 = m39192();
        zEquals = c19044M39195.equals(this.f51537);
        this.f51537 = c19044M39195;
        if (c145610.f41613 != c14569.f41613) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c145610.f41611 != c14569.f41611) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            m39198();
        } else {
            m39198();
        }
        if (c145610.f41615 != c14569.f41615) {
            z6 = true;
        } else {
            z6 = false;
        }
        c23345 = this.f51563;
        if (!zEquals2) {
            c23345.m51993(0, new InterfaceC9934() { // from class: l.᩸᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj6) {
                    ((InterfaceC2950) obj6).mo4854(c14569.f41602, i);
                }
            });
        }
        if (z) {
            final C7645 c7645M391510 = m39157(i2, c145610, i3);
            iMo6811 = mo6811();
            if (this.f51544.f41602.m15990()) {
                C14569 c145614 = this.f51544;
                Object obj6 = c145614.f41616.f52252;
                c145614.f41602.mo15985(obj6, c23738);
                iMo15978 = this.f51544.f41602.mo15978(obj6);
                obj = this.f51544.f41602.mo15983(iMo6811, c21727, 0L).f68437;
                c13011 = c21727.f68429;
                obj2 = obj6;
            } else {
                obj = null;
                c13011 = null;
                obj2 = null;
                iMo15978 = -1;
            }
            jM13013 = C5792.m13013(j);
            if (this.f51544.f41616.m39842()) {
                jM13014 = C5792.m13013(m39196(this.f51544));
            } else {
                jM13014 = jM13013;
            }
            C17474 c17479 = this.f51544.f41616;
            final C7645 c7648 = new C7645(obj, iMo6811, c13011, obj2, iMo15978, jM13013, jM13014, c17479.f52248, c17479.f52249);
            c23345.m51993(11, new InterfaceC9934() { // from class: l.ܰ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj7;
                    interfaceC2950.getClass();
                    interfaceC2950.mo4849(i2, c7645M391510, c7648);
                }
            });
        } else {
            z5 = z5;
            z6 = z6;
        }
        if (zBooleanValue) {
            c23345.m51993(1, new InterfaceC9934() { // from class: l.۟᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4856(c13010, iIntValue);
                }
            });
        }
        c19736 = c19735;
        if (c145610.f41608 != c19736) {
            c23345.m51993(10, new InterfaceC9934() { // from class: l.֫ۙ֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4867(c14569.f41608);
                }
            });
            if (c19736 != null) {
                c23345.m51993(10, new InterfaceC9934() { // from class: l.ۧۙ֫
                    @Override // p067l.InterfaceC9934
                    public final void invoke(Object obj7) {
                        ((InterfaceC2950) obj7).mo4859(c14569.f41608);
                    }
                });
            }
        }
        c3569 = c145610.f41609;
        c35610 = c14569.f41609;
        if (c3569 != c35610) {
            this.f51582.mo14190(c35610.f7244);
            c23345.m51993(2, new InterfaceC9934() { // from class: l.ᩴ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4858(c14569.f41609.f7247);
                }
            });
        }
        if (!zEquals) {
            c23345.m51993(14, new C21658(this.f51537));
        }
        if (z6) {
            c23345.m51993(3, new InterfaceC9934() { // from class: l.᩵᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    InterfaceC2950 interfaceC2950 = (InterfaceC2950) obj7;
                    C14569 c145615 = c14569;
                    boolean z8 = c145615.f41615;
                    interfaceC2950.getClass();
                    interfaceC2950.mo4873(c145615.f41615);
                }
            });
        }
        if (z5) {
            c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    C14569 c145615 = c14569;
                    ((InterfaceC2950) obj7).mo4866(c145615.f41611, c145615.f41613);
                }
            });
        } else {
            c23345.m51993(-1, new InterfaceC9934() { // from class: l.֡᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    C14569 c145615 = c14569;
                    ((InterfaceC2950) obj7).mo4866(c145615.f41611, c145615.f41613);
                }
            });
        }
        if (z5) {
            c23345.m51993(4, new InterfaceC9934() { // from class: l.ۚ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4869(c14569.f41611);
                }
            });
        }
        if (z4 == 0) {
            c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    C14569 c145615 = c14569;
                    ((InterfaceC2950) obj7).mo4850(c145615.f41621, c145615.f41613);
                }
            });
        } else {
            c23345.m51993(5, new InterfaceC9934() { // from class: l.ۤ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    C14569 c145615 = c14569;
                    ((InterfaceC2950) obj7).mo4850(c145615.f41621, c145615.f41613);
                }
            });
        }
        if (c145610.f41610 != c14569.f41610) {
            c23345.m51993(6, new InterfaceC9934() { // from class: l.ۛ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4865(c14569.f41610);
                }
            });
        }
        if (c145610.m33323() != c14569.m33323()) {
            c23345.m51993(7, new InterfaceC9934() { // from class: l.ۨ᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4868(c14569.m33323());
                }
            });
        }
        if (!c145610.f41620.equals(c14569.f41620)) {
            c23345.m51993(12, new InterfaceC9934() { // from class: l.᩺᩶֫
                @Override // p067l.InterfaceC9934
                public final void invoke(Object obj7) {
                    ((InterfaceC2950) obj7).mo4852(c14569.f41620);
                }
            });
        }
        m39181();
        c23345.m51992();
        if (c145610.f41618 != z3) {
            it = this.f51586.iterator();
            while (it.hasNext()) {
                ((InterfaceC19064) it.next()).mo43301();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C7645 m39157(int i, C14569 c14569, int i2) {
        int i3;
        Object obj;
        C13010 c13010;
        Object obj2;
        int i4;
        long jM39196;
        long jM39197;
        C23738 c23738 = new C23738();
        if (c14569.f41602.m15990()) {
            i3 = i2;
            obj = null;
            c13010 = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = c14569.f41616.f52252;
            c14569.f41602.mo15985(obj3, c23738);
            int i5 = c23738.f75532;
            int iMo15978 = c14569.f41602.mo15978(obj3);
            Object obj4 = c14569.f41602.mo15983(i5, this.f48018, 0L).f68437;
            obj2 = obj3;
            i3 = i5;
            i4 = iMo15978;
            c13010 = this.f48018.f68429;
            obj = obj4;
        }
        if (i == 0) {
            if (c14569.f41616.m39842()) {
                C17474 c17474 = c14569.f41616;
                jM39196 = c23738.m52775(c17474.f52248, c17474.f52249);
                jM39197 = m39196(c14569);
            } else {
                if (c14569.f41616.f52250 != -1) {
                    jM39196 = m39196(this.f51544);
                } else {
                    jM39196 = c23738.f75530 + c23738.f75527;
                }
                jM39197 = jM39196;
            }
        } else if (c14569.f41616.m39842()) {
            jM39196 = c14569.f41605;
            jM39197 = m39196(c14569);
        } else {
            jM39196 = c23738.f75530 + c14569.f41605;
            jM39197 = jM39196;
        }
        long jM13013 = C5792.m13013(jM39196);
        long jM13014 = C5792.m13013(jM39197);
        C17474 c17475 = c14569.f41616;
        return new C7645(obj, i3, c13010, obj2, i4, jM13013, jM13014, c17475.f52248, c17475.f52249);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m39196(C14569 c14569) {
        C21727 c21727 = new C21727();
        C23738 c23738 = new C23738();
        c14569.f41602.mo15985(c14569.f41616.f52252, c23738);
        long j = c14569.f41606;
        if (j == -9223372036854775807L) {
            return c14569.f41602.mo15983(c23738.f75532, c21727, 0L).f68425;
        }
        return c23738.f75530 + j;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    private void m39181() {
        C20386 c20386 = this.f51579;
        String str = C5792.f14228;
        C17289 c17289 = (C17289) this.f51552;
        boolean zMo6840 = c17289.mo6840();
        boolean zM37145 = c17289.m37145();
        boolean zM37144 = c17289.m37144();
        boolean zM37148 = c17289.m37148();
        boolean zM37146 = c17289.m37146();
        boolean zM37147 = c17289.m37147();
        boolean zM15990 = c17289.mo6808().m15990();
        C6304 c6304 = new C6304();
        c6304.m14316(this.f51560);
        boolean z = !zMo6840;
        c6304.m14315(4, z);
        boolean z2 = false;
        c6304.m14315(5, zM37145 && !zMo6840);
        c6304.m14315(6, zM37144 && !zMo6840);
        c6304.m14315(7, !zM15990 && (zM37144 || !zM37146 || zM37145) && !zMo6840);
        c6304.m14315(8, zM37148 && !zMo6840);
        c6304.m14315(9, !zM15990 && (zM37148 || (zM37146 && zM37147)) && !zMo6840);
        c6304.m14315(10, z);
        c6304.m14315(11, zM37145 && !zMo6840);
        if (zM37145 && !zMo6840) {
            z2 = true;
        }
        c6304.m14315(12, z2);
        C20386 c20386M14313 = c6304.m14313();
        this.f51579 = c20386M14313;
        if (c20386M14313.equals(c20386)) {
            return;
        }
        this.f51563.m51993(13, new InterfaceC9934() { // from class: l.۬᩶֫
            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC2950) obj).mo4861(this.f42960.f51579);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX INFO: renamed from: ֫ */
    private void m39166(ArrayList arrayList, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        C14569 c14569M39159;
        boolean z2;
        int iMo15979 = i;
        int iM39193 = m39193(this.f51544);
        long currentPosition = getCurrentPosition();
        this.f51555++;
        ArrayList arrayList2 = this.f51558;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                arrayList2.remove(i4);
            }
            this.f51532 = this.f51532.mo6322(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C21276 c21276 = new C21276((InterfaceC6076) arrayList.get(i5), this.f51584);
            arrayList3.add(c21276);
            arrayList2.add(i5, new C10585(c21276.f66930, c21276.f66931));
        }
        this.f51532 = this.f51532.mo6327(arrayList3.size());
        C15239 c15239 = new C15239(arrayList2, this.f51532);
        if (!c15239.m15990() && iMo15979 >= c15239.mo15987()) {
            throw new C17011();
        }
        if (z) {
            iMo15979 = c15239.mo15979(this.f51566);
            j2 = -9223372036854775807L;
        } else {
            if (iMo15979 == -1) {
                i2 = iM39193;
            } else {
                j2 = j;
            }
            C14569 c14569M39160 = m39160(this.f51544, c15239, m39156(c15239, i2, currentPosition));
            i3 = c14569M39160.f41611;
            if (i2 != -1 && i3 != 1) {
                if (!c15239.m15990() || i2 >= c15239.mo15987()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            c14569M39159 = m39159(c14569M39160, i3);
            this.f51545.m48313(i2, C5792.m12990(currentPosition), this.f51532, arrayList3);
            if (!this.f51544.f41616.f52252.equals(c14569M39159.f41616.f52252) || this.f51544.f41602.m15990()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m39167(c14569M39159, 0, z2, 4, m39185(c14569M39159), -1, false);
        }
        i2 = iMo15979;
        currentPosition = j2;
        C14569 c14569M39161 = m39160(this.f51544, c15239, m39156(c15239, i2, currentPosition));
        i3 = c14569M39161.f41611;
        if (i2 != -1) {
            if (c15239.m15990()) {
                i3 = 4;
            } else {
                i3 = 4;
            }
        }
        c14569M39159 = m39159(c14569M39161, i3);
        this.f51545.m48313(i2, C5792.m12990(currentPosition), this.f51532, arrayList3);
        if (this.f51544.f41616.f52252.equals(c14569M39159.f41616.f52252)) {
            z2 = false;
        } else {
            z2 = false;
        }
        m39167(c14569M39159, 0, z2, 4, m39185(c14569M39159), -1, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private C14569 m39160(C14569 c14569, AbstractC6974 abstractC6974, Pair pair) {
        long jM52775;
        C23877.m52957(abstractC6974.m15990() || pair != null);
        AbstractC6974 abstractC6975 = c14569.f41602;
        long jM39155 = m39155(c14569);
        C14569 c14569M33316 = c14569.m33316(abstractC6974);
        if (abstractC6974.m15990()) {
            C17474 c17474M33311 = C14569.m33311();
            long jM12990 = C5792.m12990(this.f51583);
            C14569 c14569M33317 = c14569M33316.m33318(c17474M33311, jM12990, jM12990, jM12990, 0L, C8243.f21835, this.f51526, AbstractC16192.m36872of()).m33317(c17474M33311);
            c14569M33317.f41604 = c14569M33317.f41605;
            return c14569M33317;
        }
        Object obj = c14569M33316.f41616.f52252;
        boolean zEquals = obj.equals(pair.first);
        C17474 c17474 = !zEquals ? new C17474(pair.first) : c14569M33316.f41616;
        long jLongValue = ((Long) pair.second).longValue();
        long jM12991 = C5792.m12990(jM39155);
        if (!abstractC6975.m15990()) {
            jM12991 -= abstractC6975.mo15985(obj, this.f51585).f75530;
        }
        if (!zEquals || jLongValue < jM12991) {
            C23877.m52960(!c17474.m39842());
            C14569 c14569M33318 = c14569M33316.m33318(r0, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? C8243.f21835 : c14569M33316.f41603, !zEquals ? this.f51526 : c14569M33316.f41609, !zEquals ? AbstractC16192.m36872of() : c14569M33316.f41619).m33317(c17474);
            c14569M33318.f41604 = jLongValue;
            return c14569M33318;
        }
        if (jLongValue == jM12991) {
            int iMo15978 = abstractC6974.mo15978(c14569M33316.f41617.f52252);
            if (iMo15978 != -1 && abstractC6974.mo15984(iMo15978, this.f51585, false).f75532 == abstractC6974.mo15985(c17474.f52252, this.f51585).f75532) {
                return c14569M33316;
            }
            abstractC6974.mo15985(c17474.f52252, this.f51585);
            if (c17474.m39842()) {
                jM52775 = this.f51585.m52775(c17474.f52248, c17474.f52249);
            } else {
                jM52775 = this.f51585.f75527;
            }
            C14569 c14569M33319 = c14569M33316.m33318(c17474, c14569M33316.f41605, c14569M33316.f41605, c14569M33316.f41612, jM52775 - c14569M33316.f41605, c14569M33316.f41603, c14569M33316.f41609, c14569M33316.f41619).m33317(c17474);
            c14569M33319.f41604 = jM52775;
            return c14569M33319;
        }
        C23877.m52960(!c17474.m39842());
        long jMax = Math.max(0L, c14569M33316.f41607 - (jLongValue - jM12991));
        long j = c14569M33316.f41604;
        if (c14569M33316.f41617.equals(c14569M33316.f41616)) {
            j = jLongValue + jMax;
        }
        C14569 c14569M333110 = c14569M33316.m33318(c17474, jLongValue, jLongValue, jLongValue, jMax, c14569M33316.f41603, c14569M33316.f41609, c14569M33316.f41619);
        c14569M333110.f41604 = j;
        return c14569M333110;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14569 m39159(C14569 c14569, int i) {
        C14569 c14569M33313 = c14569.m33313(i);
        return (i == 1 || i == 4) ? c14569M33313.m33320(false) : c14569M33313;
    }

    /* JADX INFO: renamed from: ֫ */
    private Pair m39156(AbstractC6974 abstractC6974, int i, long j) {
        if (abstractC6974.m15990()) {
            this.f51581 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f51583 = j;
            return null;
        }
        if (i == -1 || i >= abstractC6974.mo15987()) {
            i = abstractC6974.mo15979(this.f51566);
            j = C5792.m13013(abstractC6974.mo15983(i, this.f48018, 0L).f68425);
        }
        return abstractC6974.m15980(this.f48018, this.f51585, i, C5792.m12990(j));
    }

    /* JADX INFO: renamed from: ֫ */
    private C13229 m39158(InterfaceC7864 interfaceC7864) {
        int iM39193 = m39193(this.f51544);
        AbstractC6974 abstractC6974 = this.f51544.f41602;
        int i = iM39193 == -1 ? 0 : iM39193;
        C15849 c15849 = this.f51547;
        C21315 c21315 = this.f51545;
        return new C13229(c21315, interfaceC7864, abstractC6974, i, c15849, c21315.m48327());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ֫ */
    public C19044 m39192() {
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        if (abstractC6974Mo6808.m15990()) {
            return this.f51576;
        }
        C13010 c13010 = abstractC6974Mo6808.mo15983(mo6811(), this.f48018, 0L).f68429;
        C19715 c19715M43272 = this.f51576.m43272();
        c19715M43272.m44830(c13010.f36612);
        return c19715M43272.m44826();
    }

    /* JADX INFO: renamed from: ۖ֫ */
    private void m39180() {
        C21381 c21381 = this.f51574;
        SurfaceHolderCallbackC21985 surfaceHolderCallbackC21985 = this.f51565;
        if (c21381 != null) {
            C13229 c13229M39158 = m39158((InterfaceC7864) this.f51539);
            c13229M39158.m30279(10000);
            c13229M39158.m30280((Object) null);
            c13229M39158.m30284();
            this.f51574.m48458(surfaceHolderCallbackC21985);
            this.f51574 = null;
        }
        TextureView textureView = this.f51546;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC21985) {
                C21334.m48351("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f51546.setSurfaceTextureListener(null);
            }
            this.f51546 = null;
        }
        SurfaceHolder surfaceHolder = this.f51527;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC21985);
            this.f51527 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39171(C17289 c17289, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        c17289.m39165(surface);
        c17289.f51556 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m39165(Object obj) {
        Object obj2 = this.f51578;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean zM48321 = this.f51545.m48321(z ? this.f51573 : -9223372036854775807L, obj);
        if (z) {
            Object obj3 = this.f51578;
            Surface surface = this.f51556;
            if (obj3 == surface) {
                surface.release();
                this.f51556 = null;
            }
        }
        this.f51578 = obj;
        if (zM48321) {
            return;
        }
        m39179(C19735.m44863(new C6562("Detaching surface timed out."), C0215b.f1001d));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39164(SurfaceHolder surfaceHolder) {
        this.f51540 = false;
        this.f51527 = surfaceHolder;
        surfaceHolder.addCallback(this.f51565);
        Surface surface = this.f51527.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f51527.getSurfaceFrame();
            m39161(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m39161(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m39161(final int i, final int i2) {
        if (i == this.f51529.m42135() && i2 == this.f51529.m42134()) {
            return;
        }
        this.f51529 = new C18532(i, i2);
        this.f51563.m51997(24, new InterfaceC9934() { // from class: l.֨᩶֫
            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC2950) obj).mo4848(i, i2);
            }
        });
        m39162(2, 14, new C18532(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m39163(int i, boolean z) {
        int i2;
        if (this.f51587) {
            i2 = 4;
        } else {
            i2 = (this.f51544.f41610 != 1 || z) ? 0 : 1;
        }
        C14569 c14569M33312 = this.f51544;
        if (c14569M33312.f41613 == z && c14569M33312.f41610 == i2 && c14569M33312.f41621 == i) {
            return;
        }
        this.f51555++;
        if (c14569M33312.f41618) {
            c14569M33312 = c14569M33312.m33312();
        }
        C14569 c14569M33314 = c14569M33312.m33314(i, i2, z);
        this.f51545.m48312(i, i2, z);
        m39167(c14569M33314, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ֫ */
    public void m39198() {
        int iMo6835 = mo6835();
        C20208 c20208 = this.f51557;
        C4785 c4785 = this.f51559;
        boolean z = false;
        if (iMo6835 != 1) {
            if (iMo6835 == 2 || iMo6835 == 3) {
                m39199();
                boolean z2 = this.f51544.f41618;
                if (mo6839() && !z2) {
                    z = true;
                }
                c4785.m10088(z);
                c20208.m45701(mo6839());
                return;
            }
            if (iMo6835 != 4) {
                throw new IllegalStateException();
            }
        }
        c4785.m10088(false);
        c20208.m45701(false);
    }

    /* JADX INFO: renamed from: ᩵֫ */
    private void m39199() {
        this.f51531.m36282();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f51571;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = C5792.f14228;
            Locale locale = Locale.US;
            String strM48622 = C21459.m48622("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f51564) {
                throw new IllegalStateException(strM48622);
            }
            C21334.m48350(strM48622, this.f51528 ? null : new IllegalStateException());
            this.f51528 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39162(int i, int i2, Object obj) {
        for (InterfaceC4114 interfaceC4114 : this.f51570) {
            if (i == -1 || interfaceC4114.mo8290() == i) {
                C13229 c13229M39158 = m39158((InterfaceC7864) interfaceC4114);
                c13229M39158.m30279(i2);
                c13229M39158.m30280(obj);
                c13229M39158.m30284();
            }
        }
        for (InterfaceC4114 interfaceC4115 : this.f51580) {
            if (interfaceC4115 != null && (i == -1 || interfaceC4115.mo8290() == i)) {
                C13229 c13229M39159 = m39158((InterfaceC7864) interfaceC4115);
                c13229M39159.m30279(i2);
                c13229M39159.m30280(obj);
                c13229M39159.m30284();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39169(C17289 c17289, final int i) {
        c17289.m39199();
        c17289.m39162(1, 10, Integer.valueOf(i));
        c17289.m39162(2, 10, Integer.valueOf(i));
        c17289.f51563.m51997(21, new InterfaceC9934() { // from class: l.۫᩶֫
            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC2950) obj).mo4847(i);
            }
        });
    }
}
