package l;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.alipay.sdk.m.t0.b;
import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19936 implements Handler.Callback, InterfaceC20835, InterfaceC0557, InterfaceC4372, InterfaceC23274, InterfaceC10017, InterfaceC22569, InterfaceC22618 {

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final long f64538 = C3603.m11037(10000L);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C15449 f64539;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C12133 f64540;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f64541;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f64542;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C18273 f64543;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13257 f64544;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final long f64545;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C22485 f64546;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f64547;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C22052 f64548;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Looper f64549;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f64550;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public long f64551;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f64552;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5497 f64553;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f64554;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f64555;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f64557;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C22052 f64558;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final C20369 f64559;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1263 f64560;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public long f64561;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f64563;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f64564;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f64565;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f64566;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18065[] f64567;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f64568;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f64569;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f64570;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f64571;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C2961 f64572;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f64573;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final C13830 f64574;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f64575;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12879 f64576;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C14101 f64578;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C9599 f64579;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10058 f64580;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f64581;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C12838 f64582;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C14995 f64583;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20453 f64584;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final C6488 f64585;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC19477 f64588;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f64590;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f64592;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final C14536[] f64593;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f64594;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64595;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public long f64591 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f64586 = false;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C2751 f64589 = C2751.f8557;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public float f64587 = 1.0f;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C20888 f64577 = C20888.f67585;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f64556 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f64562 = -9223372036854775807L;

    @Override // l.InterfaceC19588
    /* JADX INFO: renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        this.f64592.mo17757(9, (InterfaceC9546) interfaceC0536).mo43089();
    }

    public C19936(Context context, InterfaceC1837[] interfaceC1837Arr, InterfaceC1837[] interfaceC1837Arr2, AbstractC5497 abstractC5497, C1263 c1263, InterfaceC10058 interfaceC10058, InterfaceC13257 interfaceC13257, int i, boolean z, InterfaceC19477 interfaceC19477, C9599 c9599, C10575 c10575, long j, Looper looper, C14185 c14185, C15449 c15449, C13830 c13830, final InterfaceC22618 interfaceC22618) {
        this.f64539 = c15449;
        this.f64553 = abstractC5497;
        this.f64560 = c1263;
        this.f64580 = interfaceC10058;
        this.f64544 = interfaceC13257;
        this.f64571 = i;
        this.f64595 = z;
        this.f64579 = c9599;
        this.f64576 = c10575;
        this.f64545 = j;
        this.f64568 = c14185;
        this.f64574 = c13830;
        this.f64588 = interfaceC19477;
        this.f64547 = interfaceC10058.mo25242();
        this.f64542 = interfaceC10058.mo25240();
        AbstractC4846 abstractC4846 = AbstractC4846.f15313;
        C12838 c12838M31224 = C12838.m31224(c1263);
        this.f64582 = c12838M31224;
        this.f64583 = new C14995(c12838M31224);
        this.f64567 = new InterfaceC18065[interfaceC1837Arr.length];
        this.f64565 = new boolean[interfaceC1837Arr.length];
        InterfaceC16653 interfaceC16653Mo15627 = abstractC5497.mo15627();
        this.f64593 = new C14536[interfaceC1837Arr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < interfaceC1837Arr.length; i2++) {
            interfaceC1837Arr[i2].mo6086(i2, c13830, c14185);
            this.f64567[i2] = interfaceC1837Arr[i2].mo6093();
            if (interfaceC16653Mo15627 != null) {
                ((AbstractC4930) this.f64567[i2]).m14358(interfaceC16653Mo15627);
            }
            InterfaceC1837 interfaceC1837 = interfaceC1837Arr2[i2];
            if (interfaceC1837 != null) {
                interfaceC1837.mo6086(i2, c13830, c14185);
                z2 = true;
            }
            this.f64593[i2] = new C14536(interfaceC1837Arr[i2], interfaceC1837Arr2[i2], i2);
        }
        this.f64570 = z2;
        this.f64578 = new C14101(this, c14185);
        this.f64557 = new ArrayList();
        this.f64559 = new C20369();
        this.f64546 = new C22485();
        abstractC5497.m15622(this, interfaceC13257);
        this.f64566 = true;
        InterfaceC19251 interfaceC19251Mo33832 = c14185.mo33832(looper, null);
        this.f64590 = interfaceC19251Mo33832;
        this.f64585 = new C6488(interfaceC19477, interfaceC19251Mo33832, new C18524(this));
        this.f64572 = new C2961(this, interfaceC19477, interfaceC19251Mo33832, c13830);
        C12133 c12133 = new C12133();
        this.f64540 = c12133;
        Looper looperM29552 = c12133.m29552();
        this.f64549 = looperM29552;
        InterfaceC19251 interfaceC19251Mo33833 = c14185.mo33832(looperM29552, this);
        this.f64592 = interfaceC19251Mo33833;
        this.f64584 = new C20453(context, looperM29552, this);
        interfaceC19251Mo33833.mo17757(35, new InterfaceC22618() { // from class: l.᩵ۙ֫
            @Override // l.InterfaceC22618
            /* JADX INFO: renamed from: ֫ */
            public final void mo24148(long j2, long j3, C8353 c8353, MediaFormat mediaFormat) {
                C19936 c19936 = this.f60537;
                c19936.getClass();
                interfaceC22618.mo24148(j2, j3, c8353, mediaFormat);
                c19936.mo24148(j2, j3, c8353, mediaFormat);
            }
        }).mo43089();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45969(C11428 c11428) {
        synchronized (c11428) {
        }
        try {
            c11428.m28239().mo13450(c11428.m28241(), c11428.m28238());
        } finally {
            c11428.m28237(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17071 m45927(C19936 c19936, C14248 c14248, long j) {
        InterfaceC18065[] interfaceC18065Arr = c19936.f64567;
        AbstractC5497 abstractC5497 = c19936.f64553;
        C12552 c12552Mo25245 = c19936.f64580.mo25245();
        C2961 c2961 = c19936.f64572;
        C1263 c1263 = c19936.f64560;
        c19936.f64589.getClass();
        return new C17071(interfaceC18065Arr, j, abstractC5497, c12552Mo25245, c2961, c14248, c1263);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m46015() {
        this.f64592.mo17754(29).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45999(int i, int i2, boolean z) {
        this.f64592.mo17755(1, z ? 1 : 0, i | (i2 << 4)).mo43089();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46010(int i) {
        this.f64592.mo17755(11, i, 0).mo43089();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46012(boolean z) {
        this.f64592.mo17755(12, z ? 1 : 0, 0).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46003(AbstractC4846 abstractC4846, int i, long j) {
        this.f64592.mo17757(3, new C22052(abstractC4846, i, j)).mo43089();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46011(C2730 c2730) {
        this.f64592.mo17757(4, c2730).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46007(boolean z) {
        this.f64592.mo17757(36, Boolean.valueOf(z)).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46006(C20888 c20888) {
        this.f64592.mo17757(38, c20888).mo43089();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m46009() {
        this.f64592.mo17754(6).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46000(int i, long j, InterfaceC1242 interfaceC1242, ArrayList arrayList) {
        this.f64592.mo17757(17, new C5118(i, j, interfaceC1242, arrayList)).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46001(int i, InterfaceC1242 interfaceC1242) {
        this.f64592.mo17756(20, i, interfaceC1242).mo43089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46005(C18231 c18231) {
        this.f64592.mo17756(31, 0, c18231).mo43089();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45978(int i) {
        C12838 c12838 = this.f64582;
        m45929(i, c12838.f38568, c12838.f38579, c12838.f38571);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m45959() {
        float f = this.f64587;
        this.f64587 = f;
        float fM46852 = f * this.f64584.m46852();
        for (C14536 c14536 : this.f64593) {
            c14536.m34693(fM46852);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45952(InterfaceC22618 interfaceC22618) {
        for (C14536 c14536 : this.f64593) {
            c14536.m34705(interfaceC22618);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46004(C11428 c11428) {
        if (this.f64569 || !this.f64549.getThread().isAlive()) {
            C19956.m46037("Ignoring messages sent after release.");
            c11428.m28237(false);
        } else {
            this.f64592.mo17757(14, c11428).mo43089();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46008(long j, Object obj) {
        if (this.f64569 || !this.f64549.getThread().isAlive()) {
            return true;
        }
        C14310 c14310 = new C14310(this.f64568);
        this.f64592.mo17757(30, new Pair(obj, c14310)).mo43089();
        if (j != -9223372036854775807L) {
            return c14310.m34148(j);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m46013() {
        if (this.f64569 || !this.f64549.getThread().isAlive()) {
            return true;
        }
        this.f64569 = true;
        C14310 c14310 = new C14310(this.f64568);
        this.f64592.mo17757(7, c14310).mo43089();
        return c14310.m34148(this.f64545);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Looper m46014() {
        return this.f64549;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46016() {
        InterfaceC19251 interfaceC19251 = this.f64592;
        interfaceC19251.mo17765(2);
        interfaceC19251.mo17763(22);
    }

    @Override // l.InterfaceC20835
    /* JADX INFO: renamed from: ֫ */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        this.f64592.mo17757(8, interfaceC9546).mo43089();
    }

    @Override // l.InterfaceC0557
    /* JADX INFO: renamed from: ֫ */
    public final void mo2303() {
        this.f64592.mo17763(10);
    }

    @Override // l.InterfaceC0557
    /* JADX INFO: renamed from: ۧ */
    public final void mo2304() {
        this.f64592.mo17763(26);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46002(C2730 c2730) {
        this.f64592.mo17757(16, c2730).mo43089();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m46017() {
        this.f64592.mo17763(34);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45998(int i) {
        this.f64592.mo17755(33, i, 0).mo43089();
    }

    @Override // l.InterfaceC22618
    /* JADX INFO: renamed from: ֫ */
    public final void mo24148(long j, long j2, C8353 c8353, MediaFormat mediaFormat) {
        if (this.f64581) {
            this.f64592.mo17754(37).mo43089();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        C15894 c15894;
        C17071 c17071M17917;
        int i2 = 1000;
        try {
            int i3 = message.what;
            C20453 c20453 = this.f64584;
            switch (i3) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f64583.m35523(1);
                    m45929(c20453.m46853(this.f64582.f38569, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    m45977();
                    break;
                case 3:
                    m45951((C22052) message.obj, true);
                    break;
                case 4:
                    m45980((C2730) message.obj);
                    break;
                case 5:
                    m45944((C9599) message.obj);
                    break;
                case 6:
                    m45954(false, true);
                    break;
                case 7:
                    m45945((C14310) message.obj);
                    return true;
                case 8:
                    m45981((InterfaceC9546) message.obj);
                    break;
                case 9:
                    m45968((InterfaceC9546) message.obj);
                    break;
                case 10:
                    m45964();
                    break;
                case 11:
                    m45985(message.arg1);
                    break;
                case 12:
                    m45997(message.arg1 != 0);
                    break;
                case 13:
                    m45953(message.arg1 != 0, (C14310) message.obj);
                    break;
                case 14:
                    m45982((C11428) message.obj);
                    break;
                case 15:
                    m45988((C11428) message.obj);
                    break;
                case 16:
                    C2730 c2730 = (C2730) message.obj;
                    m45937(c2730, c2730.f8510, true, false);
                    break;
                case 17:
                    m45942((C5118) message.obj);
                    break;
                case 18:
                    m45943((C5118) message.obj, message.arg1);
                    break;
                case 19:
                    m45935((C0884) message.obj);
                    break;
                case 20:
                    m45931(message.arg1, message.arg2, (InterfaceC1242) message.obj);
                    break;
                case 21:
                    m45936((InterfaceC1242) message.obj);
                    break;
                case 22:
                    m45963();
                    break;
                case 23:
                    m45986(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m45966();
                    break;
                case 26:
                    m45964();
                    m45989(true);
                    break;
                case 27:
                    m45930(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m45938((C2751) message.obj);
                    break;
                case 29:
                    m45918();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m45934(pair.first, (C14310) pair.second);
                    break;
                case 31:
                    m45948((C18231) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    float fFloatValue = ((Float) message.obj).floatValue();
                    this.f64587 = fFloatValue;
                    float fM46852 = fFloatValue * c20453.m46852();
                    for (C14536 c14536 : this.f64593) {
                        c14536.m34693(fM46852);
                    }
                    break;
                case 33:
                    m45978(message.arg1);
                    break;
                case 34:
                    m45959();
                    break;
                case 35:
                    m45952((InterfaceC22618) message.obj);
                    break;
                case 36:
                    m45975(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f64581 = false;
                    C22052 c22052 = this.f64548;
                    if (c22052 != null) {
                        m45951(c22052, false);
                        this.f64548 = null;
                    }
                    break;
                case 38:
                    m45970((C20888) message.obj);
                    break;
            }
        } catch (C9080 e) {
            boolean z2 = e.f27517;
            int i5 = e.f27518;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else if (i5 == 4) {
                i2 = z2 ? 3002 : 3004;
            }
            m45933(e, i2);
        } catch (C19272 e2) {
            m45933(e2, e2.f60648);
        } catch (IOException e3) {
            m45933(e3, 2000);
        } catch (RuntimeException e4) {
            C18273 c18273M42604 = C18273.m42604(e4, ((e4 instanceof IllegalStateException) || (e4 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C19956.m46034("Playback error", c18273M42604);
            m45954(true, false);
            this.f64582 = this.f64582.m31233(c18273M42604);
        } catch (C8571 e5) {
            m45933(e5, b.c);
        } catch (C18273 e6) {
            C18273 c18273M42606 = e6;
            int i6 = c18273M42606.f56812;
            C6488 c6488 = this.f64585;
            if (i6 == 1 && (c17071M17917 = c6488.m17917()) != null && c18273M42606.f56811 == null) {
                c18273M42606 = c18273M42606.m42606(c17071M17917.f52336.f42930);
            }
            int i7 = c18273M42606.f56812;
            InterfaceC19251 interfaceC19251 = this.f64592;
            if (i7 == 1 && (c15894 = c18273M42606.f56811) != null && m45957(c18273M42606.f56814, c15894)) {
                this.f64554 = true;
                m45965();
                C17071 c17071M17906 = c6488.m17906();
                C17071 c17071M17911 = c6488.m17911();
                if (c6488.m17911() != c17071M17906) {
                    while (c17071M17911 != null && c17071M17911.m40068() != c17071M17906) {
                        c17071M17911 = c17071M17911.m40068();
                    }
                }
                c6488.m17897(c17071M17911);
                if (this.f64582.f38569 != 4) {
                    m45991();
                    interfaceC19251.mo17763(2);
                }
            } else {
                C18273 c18273 = this.f64543;
                if (c18273 != null) {
                    c18273.addSuppressed(c18273M42606);
                    c18273M42606 = this.f64543;
                }
                C18273 c18274 = c18273M42606;
                if (c18274.f56812 == 1 && c6488.m17911() != c6488.m17917()) {
                    while (c6488.m17911() != c6488.m17917()) {
                        c6488.m17901();
                    }
                    C17071 c17071M17912 = c6488.m17911();
                    C22632.m50628(c17071M17912);
                    m45917();
                    C14248 c14248 = c17071M17912.f52336;
                    C15894 c15895 = c14248.f42930;
                    long j = c14248.f42927;
                    this.f64582 = m45926(c15895, j, c14248.f42933, j, true, 0);
                }
                if (c18274.f56816 && (this.f64543 == null || (i = c18274.f49707) == 5004 || i == 5003)) {
                    C19956.m46036("Recoverable renderer error", c18274);
                    if (this.f64543 == null) {
                        this.f64543 = c18274;
                    }
                    interfaceC19251.mo17761(interfaceC19251.mo17757(25, c18274));
                } else {
                    C19956.m46034("Playback error", c18274);
                    m45954(true, false);
                    this.f64582 = this.f64582.m31233(c18274);
                }
            }
        } catch (C22154 e7) {
            m45933(e7, e7.f71901);
        }
        m45917();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45933(IOException iOException, int i) {
        C18273 c18273M42603 = C18273.m42603(iOException, i);
        C17071 c17071M17911 = this.f64585.m17911();
        if (c17071M17911 != null) {
            c18273M42603 = c18273M42603.m42606(c17071M17911.f52336.f42930);
        }
        C19956.m46034("Playback error", c18273M42603);
        m45954(false, false);
        this.f64582 = this.f64582.m31233(c18273M42603);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45974(int i) {
        C12838 c12838 = this.f64582;
        if (c12838.f38569 != i) {
            if (i != 2) {
                this.f64556 = -9223372036854775807L;
            }
            if (i != 3 && c12838.f38576) {
                this.f64582 = c12838.m31236(false);
            }
            this.f64582 = this.f64582.m31227(i);
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m45917() {
        this.f64583.m35524(this.f64582);
        if (this.f64583.f45745) {
            C15700.m37021(this.f64539.f47307, this.f64583);
            this.f64583 = new C14995(this.f64582);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m45918() {
        this.f64583.m35523(1);
        m45955(false, false, false, true);
        this.f64580.mo25239(this.f64574);
        m45974(this.f64582.f38560.m14110() ? 4 : 2);
        C12838 c12838 = this.f64582;
        boolean z = c12838.f38571;
        m45929(this.f64584.m46853(c12838.f38569, z), c12838.f38568, c12838.f38579, z);
        this.f64572.m9057(this.f64544.mo28942());
        this.f64592.mo17763(2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45942(C5118 c5118) throws Throwable {
        this.f64583.m35523(1);
        if (c5118.f16037 != -1) {
            this.f64558 = new C22052(new C13543(c5118.f16034, c5118.f16036), c5118.f16037, c5118.f16035);
        }
        m45941(this.f64572.m9054(c5118.f16034, c5118.f16036), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45943(C5118 c5118, int i) throws Throwable {
        this.f64583.m35523(1);
        C2961 c2961 = this.f64572;
        if (i == -1) {
            i = c2961.m9061();
        }
        m45941(c2961.m9053(i, c5118.f16034, c5118.f16036), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45935(C0884 c0884) throws Throwable {
        this.f64583.m35523(1);
        c0884.getClass();
        m45941(this.f64572.m9062(), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45931(int i, int i2, InterfaceC1242 interfaceC1242) throws Throwable {
        this.f64583.m35523(1);
        m45941(this.f64572.m9052(i, i2, interfaceC1242), false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m45963() throws Throwable {
        m45941(this.f64572.m9050(), true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45936(InterfaceC1242 interfaceC1242) throws Throwable {
        this.f64583.m35523(1);
        m45941(this.f64572.m9055(interfaceC1242), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45930(int i, int i2, List list) throws Throwable {
        this.f64583.m35523(1);
        m45941(this.f64572.m9051(i, i2, list), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45948(C18231 c18231, boolean z) {
        this.f64553.mo15625(c18231);
        if (!z) {
            c18231 = null;
        }
        C20453 c20453 = this.f64584;
        c20453.m46854(c18231);
        C12838 c12838 = this.f64582;
        boolean z2 = c12838.f38571;
        m45929(c20453.m46853(c12838.f38569, z2), c12838.f38568, c12838.f38579, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45929(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        C12838 c12838 = this.f64582;
        if (c12838.f38571 == z2 && c12838.f38568 == i2 && c12838.f38579 == i3) {
            return;
        }
        this.f64582 = c12838.m31228(i3, i2, z2);
        m45971(false, false);
        C6488 c6488 = this.f64585;
        for (C17071 c17071M17911 = c6488.m17911(); c17071M17911 != null; c17071M17911 = c17071M17911.m40068()) {
            for (InterfaceC9731 interfaceC9731 : c17071M17911.m40070().f4478) {
                if (interfaceC9731 != null) {
                    interfaceC9731.mo2379(z2);
                }
            }
        }
        if (!m45995()) {
            m45993();
            m45960();
            C12838 c12839 = this.f64582;
            if (c12839.f38576) {
                this.f64582 = c12839.m31236(false);
            }
            c6488.m17904(this.f64551);
            return;
        }
        int i4 = this.f64582.f38569;
        InterfaceC19251 interfaceC19251 = this.f64592;
        if (i4 == 3) {
            this.f64578.m33714();
            m45996();
            interfaceC19251.mo17763(2);
        } else if (i4 == 2) {
            interfaceC19251.mo17763(2);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m45986(boolean z) {
        this.f64586 = z;
        m45976();
        if (this.f64575) {
            C6488 c6488 = this.f64585;
            if (c6488.m17917() != c6488.m17911()) {
                m45989(true);
                m45984(false);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m45985(int i) {
        this.f64571 = i;
        int iM17894 = this.f64585.m17894(this.f64582.f38560, i);
        if ((iM17894 & 1) != 0) {
            m45989(true);
        } else if ((iM17894 & 2) != 0) {
            m45965();
        }
        m45984(false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m45997(boolean z) {
        this.f64595 = z;
        int iM17896 = this.f64585.m17896(this.f64582.f38560, z);
        if ((iM17896 & 1) != 0) {
            m45989(true);
        } else if ((iM17896 & 2) != 0) {
            m45965();
        }
        m45984(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45938(C2751 c2751) {
        this.f64589 = c2751;
        this.f64585.m17905(this.f64582.f38560, c2751);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45989(boolean z) {
        C15894 c15894 = this.f64585.m17911().f52336.f42930;
        long jM45922 = m45922(c15894, this.f64582.f38563, true, false);
        if (jM45922 != this.f64582.f38563) {
            C12838 c12838 = this.f64582;
            this.f64582 = m45926(c15894, jM45922, c12838.f38564, c12838.f38570, z, 5);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m45996() {
        C17071 c17071M17911 = this.f64585.m17911();
        if (c17071M17911 == null) {
            return;
        }
        C1263 c1263M40070 = c17071M17911.m40070();
        int i = 0;
        while (true) {
            C14536[] c14536Arr = this.f64593;
            if (i >= c14536Arr.length) {
                return;
            }
            if (c1263M40070.m4319(i)) {
                c14536Arr[i].m34709();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m45993() {
        this.f64578.m33717();
        for (C14536 c14536 : this.f64593) {
            c14536.m34707();
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m45960() {
        C17071 c17071M17911 = this.f64585.m17911();
        if (c17071M17911 == null) {
            return;
        }
        long jMo11122 = c17071M17911.f52341 ? c17071M17911.f52337.mo11122() : -9223372036854775807L;
        if (jMo11122 != -9223372036854775807L) {
            if (!c17071M17911.m40077()) {
                this.f64585.m17897(c17071M17911);
                m45984(false);
                m45991();
            }
            m45967(jMo11122);
            if (jMo11122 != this.f64582.f38563) {
                C12838 c12838 = this.f64582;
                this.f64582 = m45926(c12838.f38574, jMo11122, c12838.f38564, jMo11122, true, 5);
            }
        } else {
            long jM33713 = this.f64578.m33713(c17071M17911 != this.f64585.m17917());
            this.f64551 = jM33713;
            long jM40072 = c17071M17911.m40072(jM33713);
            long j = this.f64582.f38563;
            if (!this.f64557.isEmpty() && !this.f64582.f38574.m37669()) {
                if (this.f64566) {
                    j--;
                    this.f64566 = false;
                }
                C12838 c12839 = this.f64582;
                int iMo14098 = c12839.f38560.mo14098(c12839.f38574.f49112);
                int iMin = Math.min(this.f64594, this.f64557.size());
                C7940 c7940 = iMin > 0 ? (C7940) this.f64557.get(iMin - 1) : null;
                while (c7940 != null && (iMo14098 < 0 || (iMo14098 == 0 && 0 > j))) {
                    int i = iMin - 1;
                    c7940 = i > 0 ? (C7940) this.f64557.get(iMin - 2) : null;
                    iMin = i;
                }
                if (iMin < this.f64557.size()) {
                }
                this.f64594 = iMin;
            }
            if (this.f64578.mo13463()) {
                boolean z = !this.f64583.f45747;
                C12838 c128310 = this.f64582;
                this.f64582 = m45926(c128310.f38574, jM40072, c128310.f38564, jM40072, z, 6);
            } else {
                C12838 c128311 = this.f64582;
                c128311.f38563 = jM40072;
                c128311.f38572 = SystemClock.elapsedRealtime();
            }
        }
        this.f64582.f38562 = this.f64585.m17915().m40058();
        C12838 c128312 = this.f64582;
        c128312.f38565 = m45920(c128312.f38562);
        C12838 c128313 = this.f64582;
        if (c128313.f38571 && c128313.f38569 == 3 && m45958(c128313.f38560, c128313.f38574)) {
            C12838 c128314 = this.f64582;
            if (c128314.f38578.f8510 == 1.0f) {
                float fM26567 = ((C10575) this.f64576).m26567(m45921(c128314.f38560, c128314.f38574.f49112, c128314.f38563), this.f64582.f38565);
                if (this.f64578.mo13468().f8510 != fM26567) {
                    C2730 c2730 = new C2730(fM26567, this.f64582.f38578.f8508);
                    this.f64592.mo17765(16);
                    this.f64578.mo13455(c2730);
                    m45937(this.f64582.f38578, this.f64578.mo13468().f8510, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45980(C2730 c2730) {
        this.f64592.mo17765(16);
        C14101 c14101 = this.f64578;
        c14101.mo13455(c2730);
        C2730 c2730Mo13468 = c14101.mo13468();
        m45937(c2730Mo13468, c2730Mo13468.f8510, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0203 A[LOOP:3: B:122:0x0201->B:123:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0211 A[EDGE_INSN: B:126:0x0211->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:127:0x021d A[EDGE_INSN: B:127:0x021d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0220  */
    /* JADX WARN: Code duplicated, block: B:130:0x0225 A[LOOP:13: B:129:0x0223->B:130:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x0364  */
    /* JADX WARN: Code duplicated, block: B:286:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x04be  */
    /* JADX WARN: Code duplicated, block: B:296:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:306:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:309:0x0502  */
    /* JADX WARN: Code duplicated, block: B:312:0x0508  */
    /* JADX WARN: Code duplicated, block: B:314:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x054c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0559  */
    /* JADX WARN: Code duplicated, block: B:322:0x0565  */
    /* JADX WARN: Code duplicated, block: B:325:0x056e  */
    /* JADX WARN: Code duplicated, block: B:333:0x058a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0592  */
    /* JADX WARN: Code duplicated, block: B:337:0x059c  */
    /* JADX WARN: Code duplicated, block: B:339:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:346:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:351:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:362:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:364:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:365:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:367:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:368:0x0608  */
    /* JADX WARN: Code duplicated, block: B:375:0x0626  */
    /* JADX WARN: Code duplicated, block: B:382:0x0632  */
    /* JADX WARN: Code duplicated, block: B:385:0x0639  */
    /* JADX WARN: Code duplicated, block: B:401:0x0660  */
    /* JADX WARN: Code duplicated, block: B:439:0x05d0 A[EDGE_INSN: B:439:0x05d0->B:353:0x05d0 BREAK  A[LOOP:10: B:347:0x05bd->B:352:0x05cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015d A[EDGE_INSN: B:88:0x015d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[PHI: r2
      0x01b3: PHI (r2v48 long) = (r2v47 long), (r2v60 long) binds: [B:98:0x01b1, B:94:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x01fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0220, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:335:0x0592, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m45977() {
        long j;
        ?? r0;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        C12838 c12838;
        C17071 c17071M17911;
        int i;
        C6488 c6488;
        C17071 c17071M17912;
        long jM26568;
        C17071 c17071M17915;
        boolean z5;
        boolean z6;
        boolean zMo25241;
        boolean z7;
        boolean z8;
        C12838 c12839;
        int i2;
        int i3;
        C14536[] c14536Arr;
        C12838 c128310;
        C17071 c17071M17913;
        C17071 c17071M40068;
        boolean z9;
        boolean z10;
        int i4;
        long j3;
        boolean z11;
        long jM40074;
        int i5;
        int i6;
        boolean zM4319;
        C17071 c17071M17906;
        C14248 c14248M17898;
        long jMo33833 = this.f64568.mo33833();
        this.f64592.mo17765(2);
        boolean z12 = this.f64570;
        C14536[] c14536Arr2 = this.f64593;
        C6488 c6489 = this.f64585;
        if (this.f64582.f38560.m14110() || !this.f64572.m9063()) {
            j = jMo33833;
            r0 = 0;
            z = true;
        } else {
            c6489.m17904(this.f64551);
            if (c6489.m17912() && (c14248M17898 = c6489.m17898(this.f64551, this.f64582)) != null) {
                long j4 = c14248M17898.f42927;
                C17071 c17071M17903 = c6489.m17903(c14248M17898);
                if (!c17071M17903.f52330) {
                    c17071M17903.f52330 = true;
                    c17071M17903.f52337.mo11121(this, j4);
                } else if (c17071M17903.f52341) {
                    this.f64592.mo17757(8, c17071M17903.f52337).mo43089();
                }
                if (c6489.m17911() == c17071M17903) {
                    m45967(j4);
                }
                m45984(false);
            }
            if (this.f64573) {
                this.f64573 = m45972(c6489.m17915());
                m45962();
            } else {
                m45991();
            }
            if (!this.f64575 && z12 && !this.f64554 && !m45994() && (c17071M17906 = c6489.m17906()) != null && c17071M17906 == c6489.m17917() && c17071M17906.m40068() != null && c17071M17906.m40068().f52341) {
                c6489.m17909();
                C17071 c17071M17907 = c6489.m17906();
                if (c17071M17907 != null) {
                    C1263 c1263M40070 = c17071M17907.m40070();
                    for (int i7 = 0; i7 < c14536Arr2.length; i7++) {
                        if (c1263M40070.m4319(i7) && c14536Arr2[i7].m34723() && !c14536Arr2[i7].m34716()) {
                            c14536Arr2[i7].m34718();
                            m45947(c17071M17907, i7, false, c17071M17907.m40074());
                        }
                    }
                    if (m45994()) {
                        this.f64591 = c17071M17907.f52337.mo11122();
                        if (!c17071M17907.m40077()) {
                            c6489.m17897(c17071M17907);
                            m45984(false);
                            m45991();
                        }
                    }
                }
            }
            C17071 c17071M17917 = c6489.m17917();
            if (c17071M17917 == null) {
                j = jMo33833;
                break;
            }
            if (c17071M17917.m40068() == null || this.f64575) {
                j = jMo33833;
                if (c17071M17917.f52336.f42932 || this.f64575) {
                    for (C14536 c14536 : c14536Arr2) {
                        if (c14536.m34717(c17071M17917) && c14536.m34724(c17071M17917)) {
                            long j5 = c17071M17917.f52336.f42925;
                            c14536.m34715(c17071M17917, (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? -9223372036854775807L : c17071M17917.m40071() + c17071M17917.f52336.f42925);
                        }
                    }
                }
            } else {
                C17071 c17071M17918 = c6489.m17917();
                if (!c17071M17918.f52341) {
                    j = jMo33833;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= c14536Arr2.length) {
                        if ((!m45994() || c6489.m17906() != c6489.m17917()) && (c17071M17917.m40068().f52341 || this.f64551 >= c17071M17917.m40068().m40074())) {
                            C1263 c1263M40071 = c17071M17917.m40070();
                            C17071 c17071M17914 = c6489.m17913();
                            C1263 c1263M40072 = c17071M17914.m40070();
                            AbstractC4846 abstractC4846 = this.f64582.f38560;
                            j = jMo33833;
                            m45940(abstractC4846, c17071M17914.f52336.f42930, abstractC4846, c17071M17917.f52336.f42930, -9223372036854775807L, false);
                            if (!c17071M17914.f52341) {
                                for (C14536 c14537 : c14536Arr2) {
                                    c14537.m34698(c1263M40071, c1263M40072, c17071M17914.m40074());
                                }
                                break;
                            }
                            if (z12) {
                                j3 = -9223372036854775807L;
                                if (this.f64591 != -9223372036854775807L) {
                                    this.f64591 = j3;
                                    if (z12 || this.f64554) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        for (i6 = 0; i6 < c14536Arr2.length; i6++) {
                                            zM4319 = c1263M40072.m4319(i6);
                                            InterfaceC9731[] interfaceC9731Arr = c1263M40072.f4478;
                                            if (!zM4319 && c14536Arr2[i6].m34719() != -2 && !C9786.m24798(interfaceC9731Arr[i6].mo2382().f25614, interfaceC9731Arr[i6].mo2382().f25619) && !c14536Arr2[i6].m34716()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z11) {
                                        jM40074 = c17071M17914.m40074();
                                        for (C14536 c14538 : c14536Arr2) {
                                            c14538.m34695(jM40074);
                                        }
                                        if (c17071M17914.m40077()) {
                                            c6489.m17897(c17071M17914);
                                            m45984(false);
                                            m45991();
                                            break;
                                        }
                                        break;
                                    }
                                    while (i4 < r1) {
                                        c14537.m34698(c1263M40071, c1263M40072, c17071M17914.m40074());
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            if (c17071M17914.f52337.mo11122() != j3) {
                                this.f64591 = j3;
                                if (z12) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    while (i6 < c14536Arr2.length) {
                                        zM4319 = c1263M40072.m4319(i6);
                                        InterfaceC9731[] interfaceC9731Arr2 = c1263M40072.f4478;
                                        if (!zM4319) {
                                        }
                                    }
                                }
                                if (!z11) {
                                    jM40074 = c17071M17914.m40074();
                                    while (i5 < r2) {
                                        c14538.m34695(jM40074);
                                    }
                                    if (c17071M17914.m40077()) {
                                        break;
                                        break;
                                    }
                                    c6489.m17897(c17071M17914);
                                    m45984(false);
                                    m45991();
                                    break;
                                }
                                while (i4 < r1) {
                                    c14537.m34698(c1263M40071, c1263M40072, c17071M17914.m40074());
                                }
                                break;
                                break;
                            }
                            while (i4 < r1) {
                                c14537.m34698(c1263M40071, c1263M40072, c17071M17914.m40074());
                            }
                            break;
                            break;
                        }
                    } else if (c14536Arr2[i8].m34720(c17071M17918)) {
                        i8++;
                    }
                    j = jMo33833;
                    break;
                }
            }
            boolean z13 = false;
            C17071 c17071M17919 = c6489.m17917();
            if (c17071M17919 != null && c6489.m17911() != c17071M17919 && !c17071M17919.f52327) {
                C17071 c17071M179110 = c6489.m17917();
                C1263 c1263M40073 = c17071M179110.m40070();
                boolean z14 = true;
                for (int i9 = 0; i9 < c14536Arr2.length; i9++) {
                    int iM34711 = c14536Arr2[i9].m34711();
                    int iM34690 = c14536Arr2[i9].m34690(c17071M179110, c1263M40073, this.f64578);
                    if ((iM34690 & 2) != 0 && (z10 = this.f64552) && z10) {
                        this.f64552 = false;
                        if (this.f64582.f38576) {
                            this.f64592.mo17763(2);
                        }
                    }
                    this.f64550 -= iM34711 - c14536Arr2[i9].m34711();
                    z14 &= (iM34690 & 1) != 0;
                }
                if (z14) {
                    for (int i10 = 0; i10 < c14536Arr2.length; i10++) {
                        if (c1263M40073.m4319(i10) && !c14536Arr2[i10].m34717(c17071M179110)) {
                            m45947(c17071M179110, i10, false, c17071M179110.m40074());
                        }
                    }
                }
                if (z14) {
                    c6489.m17917().f52327 = true;
                }
            }
            boolean z15 = false;
            while (m45995() && !this.f64575 && (c17071M17913 = c6489.m17911()) != null && (c17071M40068 = c17071M17913.m40068()) != null && this.f64551 >= c17071M40068.m40074() && c17071M40068.f52327) {
                if (z15) {
                    m45917();
                }
                this.f64554 = z13;
                C17071 c17071M17901 = c6489.m17901();
                c17071M17901.getClass();
                if (this.f64582.f38574.f49112.equals(c17071M17901.f52336.f42930.f49112)) {
                    C15894 c15894 = this.f64582.f38574;
                    if (c15894.f49108 == -1) {
                        C15894 c15895 = c17071M17901.f52336.f42930;
                        if (c15895.f49108 != -1 || c15894.f49110 == c15895.f49110) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                C14248 c14248 = c17071M17901.f52336;
                C15894 c15896 = c14248.f42930;
                long j6 = c14248.f42927;
                this.f64582 = m45926(c15896, j6, c14248.f42933, j6, !z9, 0);
                m45976();
                m45960();
                if (m45994() && c17071M17901 == c6489.m17906()) {
                    for (C14536 c14539 : c14536Arr2) {
                        c14539.m34708();
                    }
                }
                if (this.f64582.f38569 == 3) {
                    m45996();
                }
                C1263 c1263M40074 = c6489.m17911().m40070();
                for (int i11 = 0; i11 < c14536Arr2.length; i11++) {
                    if (c1263M40074.m4319(i11)) {
                        c14536Arr2[i11].m34692();
                    }
                }
                z15 = true;
                z13 = false;
            }
            r0 = 0;
            z = true;
            this.f64589.getClass();
        }
        int i12 = this.f64582.f38569;
        if (i12 == z || i12 == 4) {
            return;
        }
        C17071 c17071M17916 = this.f64585.m17911();
        if (c17071M17916 != null) {
            long j7 = j;
            Trace.beginSection("doSomeWork");
            m45960();
            if (c17071M17916.f52341) {
                this.f64561 = C3603.m11014(this.f64568.mo33834());
                c17071M17916.f52337.mo11117(this.f64582.f38563 - this.f64547, this.f64542);
                int i13 = 0;
                z2 = true;
                z3 = true;
                while (true) {
                    C14536[] c14536Arr3 = this.f64593;
                    if (i13 >= c14536Arr3.length) {
                        break;
                    }
                    C14536 c145310 = c14536Arr3[i13];
                    if (c145310.m34711() == 0) {
                        m45932(i13, (boolean) r0);
                    } else {
                        c145310.m34713(this.f64551, this.f64561);
                        z3 = z3 && c145310.m34721();
                        boolean zM34706 = c145310.m34706(c17071M17916);
                        m45932(i13, zM34706);
                        z2 = z2 && zM34706;
                        if (!zM34706) {
                            m45987(i13);
                        }
                    }
                    i13++;
                }
            } else {
                c17071M17916.f52337.mo11124();
                z2 = true;
                z3 = true;
            }
            long j8 = c17071M17916.f52336.f42925;
            if (z3 && c17071M17916.f52341) {
                j2 = -9223372036854775807L;
                z4 = j8 == -9223372036854775807L || j8 <= this.f64582.f38563;
                if (z4 && this.f64575) {
                    this.f64575 = r0;
                    int i14 = this.f64582.f38568;
                    this.f64583.m35523((int) r0);
                    m45929(this.f64584.m46853(this.f64582.f38569, (boolean) r0), i14, 5, (boolean) r0);
                }
                if (!z4 && c17071M17916.f52336.f42932) {
                    m45974(4);
                    m45993();
                    j7 = j7;
                } else {
                    c12838 = this.f64582;
                    if (c12838.f38569 == 2) {
                        c6488 = this.f64585;
                        if (this.f64550 == 0) {
                            zMo25241 = m45961();
                        } else {
                            if (!z2) {
                                zMo25241 = false;
                            } else if (c12838.f38573) {
                                c17071M17912 = c6488.m17911();
                                if (m45958(this.f64582.f38560, c17071M17912.f52336.f42930)) {
                                    jM26568 = ((C10575) this.f64576).m26568();
                                } else {
                                    jM26568 = j2;
                                }
                                c17071M17915 = c6488.m17915();
                                if (c17071M17915.m40077() || !c17071M17915.f52336.f42932) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (c17071M17915.f52336.f42930.m37669() || c17071M17915.f52341) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (z5 && !z6) {
                                    long jM45920 = m45920(c17071M17915.m40058());
                                    InterfaceC10058 interfaceC10058 = this.f64580;
                                    C13830 c13830 = this.f64574;
                                    AbstractC4846 abstractC4847 = this.f64582.f38560;
                                    C15894 c15897 = c17071M17912.f52336.f42930;
                                    long jM40072 = c17071M17912.m40072(this.f64551);
                                    float f = this.f64578.mo13468().f8510;
                                    boolean z16 = this.f64582.f38571;
                                    zMo25241 = interfaceC10058.mo25241(new C12174(c13830, abstractC4847, c15897, jM40072, jM45920, f, this.f64541, jM26568));
                                }
                            }
                            if (zMo25241) {
                                m45974(3);
                                this.f64543 = null;
                                if (m45995()) {
                                    m45971(r0, r0);
                                    this.f64578.m33714();
                                    m45996();
                                }
                            }
                        }
                        if (zMo25241) {
                            m45974(3);
                            this.f64543 = null;
                            if (m45995()) {
                                m45971(r0, r0);
                                this.f64578.m33714();
                                m45996();
                            }
                        }
                    } else {
                        j7 = j7;
                    }
                    if (this.f64582.f38569 == 3 && (this.f64550 != 0 ? !z2 : !m45961())) {
                        m45971(m45995(), r0);
                        m45974(2);
                        if (this.f64541) {
                            for (c17071M17911 = this.f64585.m17911(); c17071M17911 != null; c17071M17911 = c17071M17911.m40068()) {
                                for (InterfaceC9731 interfaceC9731 : c17071M17911.m40070().f4478) {
                                    if (interfaceC9731 != null) {
                                        interfaceC9731.mo2383();
                                    }
                                }
                            }
                            ((C10575) this.f64576).m26571();
                        }
                        m45993();
                    }
                }
                if (this.f64582.f38569 == 2) {
                    i3 = 0;
                    while (true) {
                        c14536Arr = this.f64593;
                        if (i3 < c14536Arr.length) {
                            break;
                        }
                        if (c14536Arr[i3].m34717(c17071M17916)) {
                            m45987(i3);
                        }
                        i3++;
                    }
                    c128310 = this.f64582;
                    if (c128310.f38573 && c128310.f38565 < 500000 && m45972(this.f64585.m17915()) && m45995()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (!z7) {
                    this.f64556 = j2;
                } else if (this.f64556 == j2) {
                    this.f64556 = this.f64568.mo33834();
                } else if (this.f64568.mo33834() - this.f64556 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
                if (m45995() || this.f64582.f38569 != 3) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (this.f64552 || !this.f64555 || !z8) {
                    z = false;
                }
                c12839 = this.f64582;
                if (c12839.f38576 != z) {
                    this.f64582 = c12839.m31236(z);
                }
                this.f64555 = r0;
                if (!z && (i2 = this.f64582.f38569) != 4 && (z8 || i2 == 2 || (i2 == 3 && this.f64550 != 0))) {
                    m45979(j7);
                }
                Trace.endSection();
                return;
            }
            j2 = -9223372036854775807L;
            if (z4) {
                this.f64575 = r0;
                int i15 = this.f64582.f38568;
                this.f64583.m35523((int) r0);
                m45929(this.f64584.m46853(this.f64582.f38569, (boolean) r0), i15, 5, (boolean) r0);
            }
            if (!z4) {
                c12838 = this.f64582;
                if (c12838.f38569 == 2) {
                    c6488 = this.f64585;
                    if (this.f64550 == 0) {
                        zMo25241 = m45961();
                    } else {
                        if (!z2) {
                            zMo25241 = false;
                        } else if (c12838.f38573) {
                            c17071M17912 = c6488.m17911();
                            if (m45958(this.f64582.f38560, c17071M17912.f52336.f42930)) {
                                jM26568 = ((C10575) this.f64576).m26568();
                            } else {
                                jM26568 = j2;
                            }
                            c17071M17915 = c6488.m17915();
                            if (c17071M17915.m40077()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c17071M17915.f52336.f42930.m37669()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            zMo25241 = z5 ? true : true;
                        }
                        if (zMo25241) {
                            m45974(3);
                            this.f64543 = null;
                            if (m45995()) {
                                m45971(r0, r0);
                                this.f64578.m33714();
                                m45996();
                            }
                        }
                    }
                    if (zMo25241) {
                        m45974(3);
                        this.f64543 = null;
                        if (m45995()) {
                            m45971(r0, r0);
                            this.f64578.m33714();
                            m45996();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f64582.f38569 == 3) {
                    m45971(m45995(), r0);
                    m45974(2);
                    if (this.f64541) {
                        while (c17071M17911 != null) {
                            while (i < r5) {
                                if (interfaceC9731 != null) {
                                    interfaceC9731.mo2383();
                                }
                            }
                        }
                        ((C10575) this.f64576).m26571();
                    }
                    m45993();
                }
            } else {
                c12838 = this.f64582;
                if (c12838.f38569 == 2) {
                    c6488 = this.f64585;
                    if (this.f64550 == 0) {
                        zMo25241 = m45961();
                    } else {
                        if (!z2) {
                            zMo25241 = false;
                        } else if (c12838.f38573) {
                            c17071M17912 = c6488.m17911();
                            if (m45958(this.f64582.f38560, c17071M17912.f52336.f42930)) {
                                jM26568 = ((C10575) this.f64576).m26568();
                            } else {
                                jM26568 = j2;
                            }
                            c17071M17915 = c6488.m17915();
                            if (c17071M17915.m40077()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c17071M17915.f52336.f42930.m37669()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                            }
                        }
                        if (zMo25241) {
                            m45974(3);
                            this.f64543 = null;
                            if (m45995()) {
                                m45971(r0, r0);
                                this.f64578.m33714();
                                m45996();
                            }
                        }
                    }
                    if (zMo25241) {
                        m45974(3);
                        this.f64543 = null;
                        if (m45995()) {
                            m45971(r0, r0);
                            this.f64578.m33714();
                            m45996();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f64582.f38569 == 3) {
                    m45971(m45995(), r0);
                    m45974(2);
                    if (this.f64541) {
                        while (c17071M17911 != null) {
                            while (i < r5) {
                                if (interfaceC9731 != null) {
                                    interfaceC9731.mo2383();
                                }
                            }
                        }
                        ((C10575) this.f64576).m26571();
                    }
                    m45993();
                }
            }
            if (this.f64582.f38569 == 2) {
                i3 = 0;
                while (true) {
                    c14536Arr = this.f64593;
                    if (i3 < c14536Arr.length) {
                        break;
                        break;
                    } else {
                        if (c14536Arr[i3].m34717(c17071M17916)) {
                            m45987(i3);
                        }
                        i3++;
                    }
                }
                c128310 = this.f64582;
                if (c128310.f38573) {
                    z7 = false;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            if (!z7) {
                this.f64556 = j2;
            } else if (this.f64556 == j2) {
                this.f64556 = this.f64568.mo33834();
            } else if (this.f64568.mo33834() - this.f64556 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
            if (m45995()) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f64552) {
                z = false;
            } else {
                z = false;
            }
            c12839 = this.f64582;
            if (c12839.f38576 != z) {
                this.f64582 = c12839.m31236(z);
            }
            this.f64555 = r0;
            if (!z) {
                m45979(j7);
            }
            Trace.endSection();
            return;
        }
        m45979(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45932(final int i, final boolean z) {
        boolean[] zArr = this.f64565;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f64590.mo17760(new Runnable() { // from class: l.ۖۙ֫
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    boolean z2 = z;
                    C19936 c19936 = this.f7419;
                    c19936.f64588.mo44870(i2, c19936.f64593[i2].m34719(), z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45921(AbstractC4846 abstractC4846, Object obj, long j) {
        long jElapsedRealtime;
        C22485 c22485 = this.f64546;
        int i = abstractC4846.mo14105(obj, c22485).f72806;
        C20369 c20369 = this.f64559;
        abstractC4846.m14106(i, c20369);
        if (c20369.f65762 == -9223372036854775807L || !c20369.m46687() || !c20369.f65759) {
            return -9223372036854775807L;
        }
        long j2 = c20369.f65758;
        if (j2 == -9223372036854775807L) {
            jElapsedRealtime = System.currentTimeMillis();
        } else {
            jElapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return C3603.m11014(jElapsedRealtime - c20369.f65762) - (j + c22485.f72804);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45958(AbstractC4846 abstractC4846, C15894 c15894) {
        if (c15894.m37669() || abstractC4846.m14110()) {
            return false;
        }
        int i = abstractC4846.mo14105(c15894.f49112, this.f64546).f72806;
        C20369 c20369 = this.f64559;
        abstractC4846.m14106(i, c20369);
        return c20369.m46687() && c20369.f65759 && c20369.f65762 != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45951(C22052 c22052, boolean z) throws Throwable {
        long j;
        long j2;
        C15894 c15894;
        long j3;
        boolean z2;
        C15894 c15895;
        boolean z3;
        long jLongValue;
        boolean z4;
        long j4;
        long j5;
        boolean z5;
        C6488 c6488;
        boolean z6;
        long jM45922;
        boolean z7;
        C17071 c17071M17911;
        long jMo11115;
        C12838 c12838;
        int i;
        int i2;
        boolean z8;
        long j6;
        this.f64583.m35523(z ? 1 : 0);
        if (this.f64581) {
            this.f64548 = c22052;
            return;
        }
        Pair pairM45925 = m45925(this.f64582.f38560, c22052, true, this.f64571, this.f64595, this.f64559, this.f64546);
        try {
            if (pairM45925 == null) {
                Pair pairM45924 = m45924(this.f64582.f38560);
                c15895 = (C15894) pairM45924.first;
                jLongValue = ((Long) pairM45924.second).longValue();
                z3 = !this.f64582.f38560.m14110();
                j = -9223372036854775807L;
            } else {
                Object obj = pairM45925.first;
                long jLongValue2 = ((Long) pairM45925.second).longValue();
                long j7 = c22052.f70685 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                C15894 c15894M17900 = this.f64585.m17900(this.f64582.f38560, obj, jLongValue2);
                if (c15894M17900.m37669()) {
                    this.f64582.f38560.mo14105(c15894M17900.f49112, this.f64546);
                    if (this.f64546.m50436(c15894M17900.f49108) == c15894M17900.f49109) {
                        this.f64546.f72800.getClass();
                    }
                    c15895 = c15894M17900;
                    z3 = true;
                    jLongValue = 0;
                    j = j7;
                } else if (c22052.f70685 == -9223372036854775807L) {
                    j = j7;
                    j2 = 0;
                    c15894 = c15894M17900;
                    j3 = jLongValue2;
                    z2 = true;
                } else {
                    j = j7;
                    j2 = 0;
                    c15894 = c15894M17900;
                    j3 = jLongValue2;
                    z2 = false;
                }
                if (this.f64582.f38560.m14110()) {
                    this.f64558 = c22052;
                } else if (pairM45925 == null) {
                    if (this.f64582.f38569 != 1) {
                        m45974(4);
                    }
                    m45955(false, true, false, true);
                } else {
                    try {
                        if (c15894.equals(this.f64582.f38574)) {
                            c17071M17911 = this.f64585.m17911();
                            if (c17071M17911 == null && c17071M17911.f52341 && j3 != j2) {
                                ?? r1 = c17071M17911.f52337;
                                long j8 = this.f64559.f65755;
                                if (this.f64563 && j8 != -9223372036854775807L) {
                                    this.f64577.getClass();
                                }
                                jMo11115 = r1.mo11115(j3, this.f64579);
                            } else {
                                jMo11115 = j3;
                            }
                            if (C3603.m11037(jMo11115) == C3603.m11037(this.f64582.f38563) || !((i = (c12838 = this.f64582).f38569) == 2 || i == 3)) {
                                j5 = jMo11115;
                            } else {
                                i2 = 2;
                                z8 = z2;
                                j6 = c12838.f38563;
                            }
                            this.f64582 = m45926(c15894, j6, j, j6, z8, i2);
                            return;
                        }
                        j5 = j3;
                        C12838 c12839 = this.f64582;
                        AbstractC4846 abstractC4846 = c12839.f38560;
                        m45940(abstractC4846, c15894, abstractC4846, c12839.f38574, j, true);
                        z2 = z4;
                        j3 = jM45922;
                    } catch (Throwable th) {
                        th = th;
                        j4 = jM45922;
                        this.f64582 = m45926(c15894, j4, j, j4, z4, 2);
                        throw th;
                    }
                    this.f64581 = this.f64563;
                    if (this.f64582.f38569 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c6488 = this.f64585;
                    if (c6488.m17911() != c6488.m17917()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    jM45922 = m45922(c15894, j5, z6, z5);
                    if (j3 != jM45922) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z4 = z2 | z7;
                }
                z8 = z2;
                j6 = j3;
                i2 = 2;
                this.f64582 = m45926(c15894, j6, j, j6, z8, i2);
                return;
            }
            if (this.f64582.f38560.m14110()) {
                this.f64558 = c22052;
            } else if (pairM45925 == null) {
                if (this.f64582.f38569 != 1) {
                    m45974(4);
                }
                m45955(false, true, false, true);
            } else {
                if (c15894.equals(this.f64582.f38574)) {
                    c17071M17911 = this.f64585.m17911();
                    if (c17071M17911 == null) {
                        jMo11115 = j3;
                    } else {
                        jMo11115 = j3;
                    }
                    if (C3603.m11037(jMo11115) == C3603.m11037(this.f64582.f38563)) {
                    }
                    j5 = jMo11115;
                } else {
                    j5 = j3;
                }
                this.f64581 = this.f64563;
                if (this.f64582.f38569 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6488 = this.f64585;
                if (c6488.m17911() != c6488.m17917()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jM45922 = m45922(c15894, j5, z6, z5);
                if (j3 != jM45922) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 = z2 | z7;
                C12838 c128310 = this.f64582;
                AbstractC4846 abstractC4847 = c128310.f38560;
                m45940(abstractC4847, c15894, abstractC4847, c128310.f38574, j, true);
                z2 = z4;
                j3 = jM45922;
            }
            z8 = z2;
            j6 = j3;
            i2 = 2;
            this.f64582 = m45926(c15894, j6, j, j6, z8, i2);
            return;
        } catch (Throwable th2) {
            th = th2;
            z4 = z2;
            j4 = j3;
        }
        j2 = 0;
        j3 = jLongValue;
        c15894 = c15895;
        z2 = z3;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45922(C15894 c15894, long j, boolean z, boolean z2) {
        C14536[] c14536Arr;
        m45993();
        m45971(false, true);
        if (z2 || this.f64582.f38569 == 3) {
            m45974(2);
        }
        C6488 c6488 = this.f64585;
        C17071 c17071M17911 = c6488.m17911();
        C17071 c17071M40068 = c17071M17911;
        while (c17071M40068 != null && !c15894.equals(c17071M40068.f52336.f42930)) {
            c17071M40068 = c17071M40068.m40068();
        }
        if (z || c17071M17911 != c17071M40068 || (c17071M40068 != null && c17071M40068.m40075(j) < 0)) {
            int i = 0;
            while (true) {
                c14536Arr = this.f64593;
                if (i >= c14536Arr.length) {
                    break;
                }
                int iM34711 = c14536Arr[i].m34711();
                c14536Arr[i].m34700(this.f64578);
                m45932(i, false);
                this.f64550 -= iM34711;
                i++;
            }
            this.f64591 = -9223372036854775807L;
            if (c17071M40068 != null) {
                while (c6488.m17911() != c17071M40068) {
                    c6488.m17901();
                }
                c6488.m17897(c17071M40068);
                c17071M40068.m40069(BasicLabelFormatter.TRILLION);
                m45956(new boolean[c14536Arr.length], c6488.m17917().m40074());
                c17071M40068.f52327 = true;
            }
        }
        m45965();
        if (c17071M40068 != null) {
            ?? r10 = c17071M40068.f52337;
            c6488.m17897(c17071M40068);
            if (!c17071M40068.f52341) {
                c17071M40068.f52336 = c17071M40068.f52336.m33893(j);
            } else if (c17071M40068.f52333) {
                j = r10.mo11114(j);
                r10.mo11117(j - this.f64547, this.f64542);
            }
            m45967(j);
            m45991();
        } else {
            c6488.m17916();
            m45967(j);
        }
        m45984(false);
        this.f64592.mo17763(2);
        return j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45967(long j) {
        C17071 c17071M17911 = this.f64585.m17911();
        long jM40075 = c17071M17911 == null ? j + BasicLabelFormatter.TRILLION : c17071M17911.m40075(j);
        this.f64551 = jM40075;
        this.f64578.m33715(jM40075);
        for (C14536 c14536 : this.f64593) {
            c14536.m34701(c17071M17911, this.f64551);
        }
        for (C17071 c17071M17912 = r0.m17911(); c17071M17912 != null; c17071M17912 = c17071M17912.m40068()) {
            for (InterfaceC9731 interfaceC9731 : c17071M17912.m40070().f4478) {
                if (interfaceC9731 != null) {
                    interfaceC9731.mo2387();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45944(C9599 c9599) {
        this.f64579 = c9599;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45975(boolean z) throws Throwable {
        if (!z) {
            this.f64581 = false;
            this.f64592.mo17765(37);
            C22052 c22052 = this.f64548;
            if (c22052 != null) {
                m45951(c22052, false);
                this.f64548 = null;
            }
        }
        this.f64563 = z;
        for (C14536 c14536 : this.f64593) {
            c14536.m34704(this.f64563 ? this.f64577 : null);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45970(C20888 c20888) {
        this.f64577 = c20888;
        for (C14536 c14536 : this.f64593) {
            c14536.m34704(this.f64563 ? this.f64577 : null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45953(boolean z, C14310 c14310) {
        if (this.f64564 != z) {
            this.f64564 = z;
            if (!z) {
                for (C14536 c14536 : this.f64593) {
                    c14536.m34710();
                }
            }
        }
        if (c14310 != null) {
            c14310.m34151();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45934(Object obj, C14310 c14310) {
        for (C14536 c14536 : this.f64593) {
            c14536.m34696(obj);
        }
        int i = this.f64582.f38569;
        if (i == 3 || i == 2) {
            this.f64592.mo17763(2);
        }
        if (c14310 != null) {
            c14310.m34151();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45954(boolean z, boolean z2) {
        m45955(z || !this.f64564, false, true, false);
        this.f64583.m35523(z2 ? 1 : 0);
        this.f64580.mo25246(this.f64574);
        this.f64584.m46853(1, this.f64582.f38571);
        m45974(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45945(C14310 c14310) {
        C12133 c12133 = this.f64540;
        InterfaceC19251 interfaceC19251 = this.f64592;
        try {
            m45955(true, false, true, false);
            C14536[] c14536Arr = this.f64593;
            for (int i = 0; i < c14536Arr.length; i++) {
                ((AbstractC4930) this.f64567[i]).m14354();
                c14536Arr[i].m34725();
            }
            this.f64580.mo25243(this.f64574);
            this.f64584.m46855();
            this.f64553.mo15628();
            m45974(1);
        } finally {
            interfaceC19251.mo17762();
            c12133.m29553();
            c14310.m34151();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[PHI: r0
      0x010e: PHI (r0v13 l.ۙ᩵֫) = (r0v12 l.ۙ᩵֫), (r0v12 l.ۙ᩵֫), (r0v18 l.ۙ᩵֫), (r0v18 l.ۙ᩵֫) binds: [B:39:0x00d2, B:41:0x00d6, B:43:0x00e7, B:45:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45955(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        long j2;
        long j3;
        AbstractC4846 abstractC4846;
        C15894 c15894;
        this.f64592.mo17765(2);
        this.f64581 = false;
        this.f64548 = null;
        this.f64543 = null;
        m45971(false, true);
        this.f64578.m33717();
        this.f64551 = BasicLabelFormatter.TRILLION;
        int i = 0;
        while (true) {
            try {
                C14536[] c14536Arr = this.f64593;
                if (i >= c14536Arr.length) {
                    break;
                }
                int iM34711 = c14536Arr[i].m34711();
                c14536Arr[i].m34700(this.f64578);
                m45932(i, false);
                this.f64550 -= iM34711;
                i++;
            } catch (RuntimeException | C18273 e) {
                C19956.m46034("Disable failed.", e);
            }
        }
        this.f64591 = -9223372036854775807L;
        if (z) {
            for (C14536 c14536 : this.f64593) {
                try {
                    c14536.m34710();
                } catch (RuntimeException e2) {
                    C19956.m46034("Reset failed.", e2);
                }
            }
        }
        this.f64550 = 0;
        C12838 c12838 = this.f64582;
        C15894 c15895 = c12838.f38574;
        long j4 = c12838.f38563;
        if (this.f64582.f38574.m37669()) {
            j = this.f64582.f38564;
        } else {
            C12838 c12839 = this.f64582;
            C22485 c22485 = this.f64546;
            C15894 c15896 = c12839.f38574;
            AbstractC4846 abstractC4847 = c12839.f38560;
            if (abstractC4847.m14110() || abstractC4847.mo14105(c15896.f49112, c22485).f72805) {
                j = this.f64582.f38564;
            } else {
                j = this.f64582.f38563;
            }
        }
        if (z2) {
            this.f64558 = null;
            Pair pairM45924 = m45924(this.f64582.f38560);
            c15895 = (C15894) pairM45924.first;
            long jLongValue = ((Long) pairM45924.second).longValue();
            z5 = c15895.equals(this.f64582.f38574) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            z5 = false;
            j2 = j4;
            j3 = j;
        }
        this.f64585.m17916();
        this.f64573 = false;
        AbstractC4846 abstractC4846M32585 = this.f64582.f38560;
        if (z3 && (abstractC4846M32585 instanceof C13543)) {
            abstractC4846M32585 = ((C13543) abstractC4846M32585).m32585(this.f64572.m9059());
            if (c15895.f49108 != -1) {
                abstractC4846M32585.mo14105(c15895.f49112, this.f64546);
                int i2 = this.f64546.f72806;
                C20369 c20369 = this.f64559;
                abstractC4846M32585.mo14103(i2, c20369, 0L);
                if (c20369.m46687()) {
                    abstractC4846 = abstractC4846M32585;
                    c15894 = new C15894(c15895.f49111, c15895.f49112);
                } else {
                    abstractC4846 = abstractC4846M32585;
                    c15894 = c15895;
                }
            } else {
                abstractC4846 = abstractC4846M32585;
                c15894 = c15895;
            }
        } else {
            abstractC4846 = abstractC4846M32585;
            c15894 = c15895;
        }
        C12838 c128310 = this.f64582;
        int i3 = c128310.f38569;
        C18273 c18273 = z4 ? null : c128310.f38566;
        C6181 c6181 = z5 ? C6181.f18976 : c128310.f38561;
        C1263 c1263 = z5 ? this.f64560 : c128310.f38567;
        List listOf = z5 ? AbstractC14545.of() : c128310.f38577;
        C12838 c128311 = this.f64582;
        this.f64582 = new C12838(abstractC4846, c15894, j3, j2, i3, c18273, false, c6181, c1263, listOf, c15894, c128311.f38571, c128311.f38579, c128311.f38568, c128311.f38578, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f64585.m17907();
            this.f64572.m9060();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Pair m45924(AbstractC4846 abstractC4846) {
        long j = 0;
        if (abstractC4846.m14110()) {
            return Pair.create(C12838.m31225(), 0L);
        }
        int iMo14099 = abstractC4846.mo14099(this.f64595);
        Pair pairM14100 = abstractC4846.m14100(this.f64559, this.f64546, iMo14099, -9223372036854775807L);
        C15894 c15894M17900 = this.f64585.m17900(abstractC4846, pairM14100.first, 0L);
        long jLongValue = ((Long) pairM14100.second).longValue();
        if (c15894M17900.m37669()) {
            Object obj = c15894M17900.f49112;
            C22485 c22485 = this.f64546;
            abstractC4846.mo14105(obj, c22485);
            if (c15894M17900.f49109 == c22485.m50436(c15894M17900.f49108)) {
                c22485.f72800.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c15894M17900, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45982(C11428 c11428) {
        c11428.getClass();
        Looper looperM28234 = c11428.m28234();
        Looper looper = this.f64549;
        InterfaceC19251 interfaceC19251 = this.f64592;
        if (looperM28234 == looper) {
            m45969(c11428);
            int i = this.f64582.f38569;
            if (i == 3 || i == 2) {
                interfaceC19251.mo17763(2);
                return;
            }
            return;
        }
        interfaceC19251.mo17757(15, c11428).mo43089();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45988(final C11428 c11428) {
        Looper looperM28234 = c11428.m28234();
        if (!looperM28234.getThread().isAlive()) {
            C19956.m46037("Trying to send message on a dead thread.");
            c11428.m28237(false);
        } else {
            this.f64568.mo33832(looperM28234, null).mo17760(new Runnable() { // from class: l.ۘۙ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C19936.m45950(this.f11703, c11428);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45950(C19936 c19936, C11428 c11428) {
        try {
            m45969(c11428);
        } catch (C18273 e) {
            C19956.m46034("Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45939(AbstractC4846 abstractC4846, AbstractC4846 abstractC4847) {
        if (abstractC4846.m14110() && abstractC4847.m14110()) {
            return;
        }
        ArrayList arrayList = this.f64557;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((C7940) arrayList.get(size)).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m45965() {
        if (this.f64570 && m45994()) {
            for (C14536 c14536 : this.f64593) {
                int iM34711 = c14536.m34711();
                c14536.m34714(this.f64578);
                this.f64550 -= iM34711 - c14536.m34711();
            }
            this.f64591 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45957(int i, C15894 c15894) {
        C6488 c6488 = this.f64585;
        if (c6488.m17906() == null || !c6488.m17906().f52336.f42930.equals(c15894)) {
            return false;
        }
        return this.f64593[i].m34722(c6488.m17906());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m45966() {
        m45964();
        m45989(true);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m45964() {
        float f = this.f64578.mo13468().f8510;
        C17071 c17071M17911 = this.f64585.m17911();
        C17071 c17071M17917 = this.f64585.m17917();
        C1263 c1263 = null;
        boolean z = true;
        while (c17071M17911 != null && c17071M17911.f52341) {
            C12838 c12838 = this.f64582;
            C1263 c1263M40067 = c17071M17911.m40067(f, c12838.f38560, c12838.f38571);
            C1263 c1264 = c17071M17911 == this.f64585.m17911() ? c1263M40067 : c1263;
            C1263 c1263M40070 = c17071M17911.m40070();
            InterfaceC9731[] interfaceC9731Arr = c1263M40067.f4478;
            if (c1263M40070 != null && c1263M40070.f4478.length == interfaceC9731Arr.length) {
                int i = 0;
                while (true) {
                    if (i < interfaceC9731Arr.length) {
                        if (c1263M40067.m4320(c1263M40070, i)) {
                            i++;
                        }
                    } else {
                        if (c17071M17911 == c17071M17917) {
                            z = false;
                        }
                        c17071M17911 = c17071M17911.m40068();
                        c1263 = c1264;
                    }
                }
            }
            if (z) {
                C17071 c17071M17912 = this.f64585.m17911();
                boolean z2 = (this.f64585.m17897(c17071M17912) & 1) != 0;
                boolean[] zArr = new boolean[this.f64593.length];
                c1264.getClass();
                long jM40060 = c17071M17912.m40060(c1264, this.f64582.f38563, z2, zArr);
                C12838 c12839 = this.f64582;
                boolean z3 = (c12839.f38569 == 4 || jM40060 == c12839.f38563) ? false : true;
                C12838 c128310 = this.f64582;
                this.f64582 = m45926(c128310.f38574, jM40060, c128310.f38564, c128310.f38570, z3, 5);
                if (z3) {
                    m45967(jM40060);
                }
                m45965();
                boolean[] zArr2 = new boolean[this.f64593.length];
                int i2 = 0;
                while (true) {
                    C14536[] c14536Arr = this.f64593;
                    if (i2 >= c14536Arr.length) {
                        break;
                    }
                    int iM34711 = c14536Arr[i2].m34711();
                    zArr2[i2] = this.f64593[i2].m34727();
                    this.f64593[i2].m34703(c17071M17912.f52335[i2], this.f64578, this.f64551, zArr[i2]);
                    if (iM34711 - this.f64593[i2].m34711() > 0) {
                        m45932(i2, false);
                    }
                    this.f64550 -= iM34711 - this.f64593[i2].m34711();
                    i2++;
                }
                m45956(zArr2, this.f64551);
                c17071M17912.f52327 = true;
            } else {
                this.f64585.m17897(c17071M17911);
                if (c17071M17911.f52341) {
                    long jMax = Math.max(c17071M17911.f52336.f42927, c17071M17911.m40072(this.f64551));
                    if (this.f64570 && m45994() && this.f64585.m17906() == c17071M17911) {
                        m45965();
                    }
                    c17071M17911.m40059(c1263M40067, jMax);
                }
            }
            m45984(true);
            if (this.f64582.f38569 != 4) {
                m45991();
                m45960();
                this.f64592.mo17763(2);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m45961() {
        C17071 c17071M17911 = this.f64585.m17911();
        long j = c17071M17911.f52336.f42925;
        if (c17071M17911.f52341) {
            return j == -9223372036854775807L || this.f64582.f38563 < j || !m45995();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x033d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352  */
    /* JADX WARN: Code duplicated, block: B:176:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0371  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45941(AbstractC4846 abstractC4846, boolean z) throws Throwable {
        C15894 c15894;
        Object obj;
        int i;
        int iM45919;
        Object obj2;
        long jM11016;
        ?? r21;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        long j2;
        C21347 c21347;
        int i3;
        int iMo14099;
        boolean z7;
        boolean z8;
        long j3;
        ?? r8;
        int i4;
        long jM45922;
        int i5;
        long j4;
        Object obj3;
        boolean z9;
        int i6;
        C12838 c12838 = this.f64582;
        C22052 c22052 = this.f64558;
        C6488 c6488 = this.f64585;
        int i7 = this.f64571;
        boolean z10 = this.f64595;
        C20369 c20369 = this.f64559;
        C22485 c22485 = this.f64546;
        if (abstractC4846.m14110()) {
            j3 = -9223372036854775807L;
            c21347 = new C21347(C12838.m31225(), 0L, -9223372036854775807L, false, true, false);
            i = -1;
        } else {
            C15894 c15895 = c12838.f38574;
            Object obj4 = c15895.f49112;
            AbstractC4846 abstractC4847 = c12838.f38560;
            boolean z11 = abstractC4847.m14110() || abstractC4847.mo14105(c15895.f49112, c22485).f72805;
            long j5 = (c12838.f38574.m37669() || z11) ? c12838.f38564 : c12838.f38563;
            if (c22052 != null) {
                boolean z12 = false;
                Pair pairM45925 = m45925(abstractC4846, c22052, true, i7, z10, c20369, c22485);
                if (pairM45925 == null) {
                    iMo14099 = abstractC4846.mo14099(z10);
                    jM11016 = j5;
                    obj2 = obj4;
                    z7 = false;
                    z8 = true;
                } else {
                    if (c22052.f70685 == -9223372036854775807L) {
                        iMo14099 = abstractC4846.mo14105(pairM45925.first, c22485).f72806;
                        jM11016 = j5;
                        obj2 = obj4;
                        z7 = false;
                    } else {
                        obj2 = pairM45925.first;
                        jM11016 = ((Long) pairM45925.second).longValue();
                        iMo14099 = -1;
                        z7 = true;
                    }
                    z12 = c12838.f38569 == 4;
                    z8 = false;
                }
                z4 = z7;
                z3 = z8;
                z2 = z12;
                c15894 = c15895;
                i = -1;
                i2 = iMo14099;
            } else {
                c15894 = c15895;
                if (c12838.f38560.m14110()) {
                    iM45919 = abstractC4846.mo14099(z10);
                    obj = obj4;
                    i = -1;
                } else {
                    obj = obj4;
                    if (abstractC4846.mo14098(obj) == -1) {
                        i = -1;
                        iM45919 = m45919(c20369, c22485, i7, z10, obj, c12838.f38560, abstractC4846);
                        if (iM45919 == -1) {
                            iM45919 = abstractC4846.mo14099(z10);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5;
                        c15894 = c15894;
                        i2 = iM45919;
                        z3 = z6;
                        obj2 = obj;
                        z2 = false;
                        jM11016 = j5;
                        z4 = false;
                    } else {
                        i = -1;
                        if (j5 == -9223372036854775807L) {
                            iM45919 = abstractC4846.mo14105(obj, c22485).f72806;
                        } else if (z11) {
                            c15894 = c15894;
                            c12838.f38560.mo14105(c15894.f49112, c22485);
                            if (c12838.f38560.mo14103(c22485.f72806, c20369, 0L).f65760 == c12838.f38560.mo14098(c15894.f49112)) {
                                Pair pairM14100 = abstractC4846.m14100(c20369, c22485, abstractC4846.mo14105(obj, c22485).f72806, j5 + c22485.f72804);
                                obj2 = pairM14100.first;
                                jM11016 = ((Long) pairM14100.second).longValue();
                            } else if (abstractC4846.mo14105(obj, c22485).f72801 != -9223372036854775807L) {
                                r21 = 0;
                                jM11016 = C3603.m11016(j5, 0L, c22485.f72801 - 1);
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                                jM11016 = j5;
                            }
                            i2 = -1;
                            z2 = false;
                            z3 = false;
                            z4 = true;
                        } else {
                            iM45919 = -1;
                            z6 = false;
                            i2 = iM45919;
                            z3 = z6;
                            obj2 = obj;
                            z2 = false;
                            jM11016 = j5;
                            z4 = false;
                        }
                    }
                }
                z6 = false;
                i2 = iM45919;
                z3 = z6;
                obj2 = obj;
                z2 = false;
                jM11016 = j5;
                z4 = false;
            }
            if (i2 != i) {
                Pair pairM14101 = abstractC4846.m14100(c20369, c22485, i2, -9223372036854775807L);
                obj2 = pairM14101.first;
                jM11016 = ((Long) pairM14101.second).longValue();
                j = -9223372036854775807L;
            } else {
                j = jM11016;
            }
            C15894 c15894M17900 = c6488.m17900(abstractC4846, obj2, jM11016);
            int i8 = c15894M17900.f49110;
            boolean z13 = c15894.f49112.equals(obj2) && !c15894.m37669() && !c15894M17900.m37669() && (i8 == i || ((i3 = c15894.f49110) != i && i8 >= i3));
            C22485 c22485Mo14105 = abstractC4846.mo14105(obj2, c22485);
            if (!z11 && j5 == j) {
                Object obj5 = c15894.f49112;
                int i9 = c15894.f49108;
                if (obj5.equals(c15894M17900.f49112)) {
                    if (c15894.m37669()) {
                        c22485Mo14105.m50439(i9);
                    }
                    if (c15894M17900.m37669()) {
                        c22485Mo14105.m50439(c15894M17900.f49108);
                    }
                }
            }
            if (z13) {
                c15894M17900 = c15894;
            }
            if (!c15894M17900.m37669()) {
                j2 = jM11016;
            } else if (c15894M17900.equals(c15894)) {
                jM11016 = c12838.f38563;
                j2 = jM11016;
            } else {
                abstractC4846.mo14105(c15894M17900.f49112, c22485);
                if (c15894M17900.f49109 == c22485.m50436(c15894M17900.f49108)) {
                    c22485.f72800.getClass();
                }
                j2 = 0;
            }
            c21347 = new C21347(c15894M17900, j2, j, z2, z3, z4);
        }
        C15894 c15896 = c21347.f68783;
        long j6 = c21347.f68784;
        boolean z14 = c21347.f68781;
        long j7 = c21347.f68785;
        boolean z15 = (this.f64582.f38574.equals(c15896) && j7 == this.f64582.f38563) ? false : true;
        try {
            if (c21347.f68780) {
                if (this.f64582.f38569 != 1) {
                    m45974(4);
                }
                m45955(false, false, false, true);
            }
            for (C14536 c14536 : this.f64593) {
                c14536.m34699(abstractC4846);
            }
            try {
                if (z15) {
                    jM45922 = j7;
                    i4 = 2;
                    if (!abstractC4846.m14110()) {
                        for (C17071 c17071M17911 = this.f64585.m17911(); c17071M17911 != null; c17071M17911 = c17071M17911.m40068()) {
                            if (c17071M17911.f52336.f42930.equals(c15896)) {
                                c17071M17911.f52336 = this.f64585.m17899(abstractC4846, c17071M17911.f52336);
                                c17071M17911.m40066();
                            }
                        }
                        C6488 c6489 = this.f64585;
                        jM45922 = m45922(c15896, jM45922, c6489.m17911() != c6489.m17917(), z14);
                        i5 = 2;
                    }
                    C12838 c12839 = this.f64582;
                    AbstractC4846 abstractC4848 = c12839.f38560;
                    C15894 c15897 = c12839.f38574;
                    if (c21347.f68782) {
                        j4 = jM45922;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    m45940(abstractC4846, c15896, abstractC4848, c15897, j4, false);
                    if (z15 || j6 != this.f64582.f38564) {
                        C12838 c128310 = this.f64582;
                        obj3 = c128310.f38574.f49112;
                        AbstractC4846 abstractC4849 = c128310.f38560;
                        if (z15 || !z || abstractC4849.m14110() || abstractC4849.mo14105(obj3, this.f64546).f72805) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        long j8 = this.f64582.f38570;
                        if (abstractC4846.mo14098(obj3) == i) {
                            i6 = 4;
                        } else {
                            i6 = 3;
                        }
                        this.f64582 = m45926(c15896, jM45922, j6, j8, z9, i6);
                    }
                    m45976();
                    m45939(abstractC4846, this.f64582.f38560);
                    this.f64582 = this.f64582.m31230(abstractC4846);
                    if (!abstractC4846.m14110()) {
                        this.f64558 = null;
                    }
                    m45984(false);
                    this.f64592.mo17763(i5);
                }
                try {
                    i4 = 2;
                    jM45922 = j7;
                    int iM17895 = this.f64585.m17895(abstractC4846, this.f64551, this.f64585.m17917() == null ? 0L : m45923(this.f64585.m17917()), (!m45994() || this.f64585.m17906() == null) ? 0L : m45923(this.f64585.m17906()));
                    if ((iM17895 & 1) != 0) {
                        m45989(false);
                    } else if ((iM17895 & 2) != 0) {
                        m45965();
                    }
                } catch (Throwable th) {
                    th = th;
                    j3 = j7;
                    r21 = 2;
                    r8 = r21;
                    C12838 c128311 = this.f64582;
                    ?? r37 = r8;
                    m45940(abstractC4846, c15896, c128311.f38560, c128311.f38574, c21347.f68782 ? j3 : -9223372036854775807L, false);
                    if (z15 || j6 != this.f64582.f38564) {
                        C12838 c128312 = this.f64582;
                        Object obj6 = c128312.f38574.f49112;
                        AbstractC4846 abstractC48410 = c128312.f38560;
                        this.f64582 = m45926(c15896, j3, j6, this.f64582.f38570, z15 && z && !abstractC48410.m14110() && !abstractC48410.mo14105(obj6, this.f64546).f72805, abstractC4846.mo14098(obj6) == i ? 4 : 3);
                    }
                    m45976();
                    m45939(abstractC4846, this.f64582.f38560);
                    this.f64582 = this.f64582.m31230(abstractC4846);
                    if (!abstractC4846.m14110()) {
                        this.f64558 = null;
                    }
                    m45984(false);
                    this.f64592.mo17763(r37 == true ? 1 : 0);
                    throw th;
                }
                i5 = i4;
                C12838 c128313 = this.f64582;
                AbstractC4846 abstractC48411 = c128313.f38560;
                C15894 c15898 = c128313.f38574;
                if (c21347.f68782) {
                    j4 = jM45922;
                } else {
                    j4 = -9223372036854775807L;
                }
                m45940(abstractC4846, c15896, abstractC48411, c15898, j4, false);
                if (z15) {
                    C12838 c128314 = this.f64582;
                    obj3 = c128314.f38574.f49112;
                    AbstractC4846 abstractC48412 = c128314.f38560;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j9 = this.f64582.f38570;
                    if (abstractC4846.mo14098(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f64582 = m45926(c15896, jM45922, j6, j9, z9, i6);
                } else {
                    C12838 c128315 = this.f64582;
                    obj3 = c128315.f38574.f49112;
                    AbstractC4846 abstractC48413 = c128315.f38560;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j10 = this.f64582.f38570;
                    if (abstractC4846.mo14098(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f64582 = m45926(c15896, jM45922, j6, j10, z9, i6);
                }
                m45976();
                m45939(abstractC4846, this.f64582.f38560);
                this.f64582 = this.f64582.m31230(abstractC4846);
                if (!abstractC4846.m14110()) {
                    this.f64558 = null;
                }
                m45984(false);
                this.f64592.mo17763(i5);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            j3 = j7;
            r8 = 2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45940(AbstractC4846 abstractC4846, C15894 c15894, AbstractC4846 abstractC4847, C15894 c15895, long j, boolean z) {
        boolean zM45958 = m45958(abstractC4846, c15894);
        Object obj = c15894.f49112;
        if (!zM45958) {
            C2730 c2730 = c15894.m37669() ? C2730.f8507 : this.f64582.f38578;
            C14101 c14101 = this.f64578;
            if (c14101.mo13468().equals(c2730)) {
                return;
            }
            this.f64592.mo17765(16);
            c14101.mo13455(c2730);
            m45937(this.f64582.f38578, c2730.f8510, false, false);
            return;
        }
        C22485 c22485 = this.f64546;
        int i = abstractC4846.mo14105(obj, c22485).f72806;
        C20369 c20369 = this.f64559;
        abstractC4846.m14106(i, c20369);
        C6236 c6236 = c20369.f65763;
        C10575 c10575 = (C10575) this.f64576;
        c10575.m26570(c6236);
        if (j != -9223372036854775807L) {
            c10575.m26569(m45921(abstractC4846, obj, j));
            return;
        }
        if (!C11003.equals(!abstractC4847.m14110() ? abstractC4847.mo14103(abstractC4847.mo14105(c15895.f49112, c22485).f72806, c20369, 0L).f65761 : null, c20369.f65761) || z) {
            c10575.m26569(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45923(C17071 c17071) {
        if (c17071 == null) {
            return 0L;
        }
        long jM40071 = c17071.m40071();
        if (!c17071.f52341) {
            return jM40071;
        }
        int i = 0;
        while (true) {
            C14536[] c14536Arr = this.f64593;
            if (i >= c14536Arr.length) {
                return jM40071;
            }
            if (c14536Arr[i].m34717(c17071)) {
                long jM34712 = c14536Arr[i].m34712(c17071);
                if (jM34712 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM40071 = Math.max(jM34712, jM40071);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֡ܽۧ, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m45992() {
        C6488 c6488 = this.f64585;
        c6488.m17908();
        C17071 c17071M17918 = c6488.m17918();
        if (c17071M17918 != null) {
            ?? r1 = c17071M17918.f52337;
            if ((!c17071M17918.f52330 || c17071M17918.f52341) && !r1.mo2264()) {
                AbstractC4846 abstractC4846 = this.f64582.f38560;
                if (c17071M17918.f52341) {
                    r1.mo2266();
                }
                if (this.f64580.mo25247()) {
                    if (!c17071M17918.f52330) {
                        long j = c17071M17918.f52336.f42927;
                        c17071M17918.f52330 = true;
                        r1.mo11121(this, j);
                    } else {
                        C5824 c5824 = new C5824();
                        c5824.m16330(c17071M17918.m40072(this.f64551));
                        c5824.m16328(this.f64578.mo13468().f8510);
                        c5824.m16329(this.f64562);
                        c17071M17918.m40063(new C11469(c5824));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m45976() {
        C17071 c17071M17911 = this.f64585.m17911();
        this.f64575 = c17071M17911 != null && c17071M17911.f52336.f42934 && this.f64586;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45981(InterfaceC9546 interfaceC9546) {
        C6488 c6488 = this.f64585;
        boolean zM17910 = c6488.m17910(interfaceC9546);
        C14101 c14101 = this.f64578;
        if (zM17910) {
            C17071 c17071M17915 = c6488.m17915();
            c17071M17915.getClass();
            if (!c17071M17915.f52341) {
                float f = c14101.mo13468().f8510;
                C12838 c12838 = this.f64582;
                c17071M17915.m40061(f, c12838.f38560, c12838.f38571);
            }
            m45946(c17071M17915.f52336.f42930, c17071M17915.m40073(), c17071M17915.m40070());
            if (c17071M17915 == c6488.m17911()) {
                m45967(c17071M17915.f52336.f42927);
                m45956(new boolean[this.f64593.length], c6488.m17917().m40074());
                c17071M17915.f52327 = true;
                C12838 c12839 = this.f64582;
                C15894 c15894 = c12839.f38574;
                long j = c17071M17915.f52336.f42927;
                this.f64582 = m45926(c15894, j, c12839.f38564, j, false, 5);
            }
            m45991();
            return;
        }
        C17071 c17071M17902 = c6488.m17902(interfaceC9546);
        if (c17071M17902 != null) {
            C22632.m50634(true ^ c17071M17902.f52341);
            float f2 = c14101.mo13468().f8510;
            C12838 c128310 = this.f64582;
            c17071M17902.m40061(f2, c128310.f38560, c128310.f38571);
            if (c6488.m17914(interfaceC9546)) {
                m45992();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45968(InterfaceC9546 interfaceC9546) {
        C6488 c6488 = this.f64585;
        if (c6488.m17910(interfaceC9546)) {
            c6488.m17904(this.f64551);
            m45991();
        } else if (c6488.m17914(interfaceC9546)) {
            m45992();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45937(C2730 c2730, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f64583.m35523(1);
            }
            this.f64582 = this.f64582.m31229(c2730);
        }
        float f2 = c2730.f8510;
        C17071 c17071M17911 = this.f64585.m17911();
        while (true) {
            i = 0;
            if (c17071M17911 == null) {
                break;
            }
            InterfaceC9731[] interfaceC9731Arr = c17071M17911.m40070().f4478;
            int length = interfaceC9731Arr.length;
            while (i < length) {
                InterfaceC9731 interfaceC9731 = interfaceC9731Arr[i];
                if (interfaceC9731 != null) {
                    interfaceC9731.mo2378(f2);
                }
                i++;
            }
            c17071M17911 = c17071M17911.m40068();
        }
        C14536[] c14536Arr = this.f64593;
        int length2 = c14536Arr.length;
        while (i < length2) {
            c14536Arr[i].m34694(f, c2730.f8510);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m45991() {
        long jM40072;
        boolean zMo25244 = false;
        if (m45972(this.f64585.m17915())) {
            C17071 c17071M17915 = this.f64585.m17915();
            long jM45920 = m45920(!c17071M17915.f52341 ? 0L : c17071M17915.f52337.mo2267());
            if (c17071M17915 == this.f64585.m17911()) {
                jM40072 = c17071M17915.m40072(this.f64551);
            } else {
                jM40072 = c17071M17915.m40072(this.f64551) - c17071M17915.f52336.f42927;
            }
            long j = jM40072;
            long jM26568 = m45958(this.f64582.f38560, c17071M17915.f52336.f42930) ? ((C10575) this.f64576).m26568() : -9223372036854775807L;
            C13830 c13830 = this.f64574;
            AbstractC4846 abstractC4846 = this.f64582.f38560;
            C15894 c15894 = c17071M17915.f52336.f42930;
            float f = this.f64578.mo13468().f8510;
            boolean z = this.f64582.f38571;
            C12174 c12174 = new C12174(c13830, abstractC4846, c15894, j, jM45920, f, this.f64541, jM26568);
            boolean zMo25245 = this.f64580.mo25244(c12174);
            C17071 c17071M17911 = this.f64585.m17911();
            if (zMo25245 || !c17071M17911.f52341 || jM45920 >= 500000 || (this.f64547 <= 0 && !this.f64542)) {
                zMo25244 = zMo25245;
            } else {
                c17071M17911.f52337.mo11117(this.f64582.f38563, false);
                zMo25244 = this.f64580.mo25244(c12174);
            }
        }
        this.f64573 = zMo25244;
        if (zMo25244) {
            C17071 c17071M17916 = this.f64585.m17915();
            c17071M17916.getClass();
            C5824 c5824 = new C5824();
            c5824.m16330(c17071M17916.m40072(this.f64551));
            c5824.m16328(this.f64578.mo13468().f8510);
            c5824.m16329(this.f64562);
            c17071M17916.m40063(new C11469(c5824));
        }
        m45962();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֡ܽۧ, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m45972(C17071 c17071) {
        if (c17071 != null) {
            try {
                ?? r1 = c17071.f52337;
                if (!c17071.f52341) {
                    r1.mo11124();
                } else {
                    for (InterfaceC18882 interfaceC18882 : c17071.f52335) {
                        if (interfaceC18882 != null) {
                            interfaceC18882.mo6411();
                        }
                    }
                }
                if ((!c17071.f52341 ? 0L : r1.mo2267()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45962() {
        C17071 c17071M17915 = this.f64585.m17915();
        boolean z = this.f64573 || (c17071M17915 != null && c17071M17915.f52337.mo2264());
        C12838 c12838 = this.f64582;
        if (z != c12838.f38573) {
            this.f64582 = c12838.m31234(z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12838 m45926(C15894 c15894, long j, long j2, long j3, boolean z, int i) {
        List list;
        C17071 c17071M17911;
        boolean z2;
        this.f64566 = (!this.f64566 && j == this.f64582.f38563 && c15894.equals(this.f64582.f38574)) ? false : true;
        m45976();
        C12838 c12838 = this.f64582;
        C6181 c6181M40073 = c12838.f38561;
        C1263 c1263M40070 = c12838.f38567;
        List listOf = c12838.f38577;
        if (this.f64572.m9063()) {
            C17071 c17071M17912 = this.f64585.m17911();
            if (c17071M17912 == null) {
                c6181M40073 = C6181.f18976;
            } else {
                c6181M40073 = c17071M17912.m40073();
            }
            if (c17071M17912 == null) {
                c1263M40070 = this.f64560;
            } else {
                c1263M40070 = c17071M17912.m40070();
            }
            InterfaceC9731[] interfaceC9731Arr = c1263M40070.f4478;
            C1846 c1846 = new C1846();
            boolean z3 = false;
            for (InterfaceC9731 interfaceC9731 : interfaceC9731Arr) {
                if (interfaceC9731 != null) {
                    C23896 c23896 = interfaceC9731.mo2377(0).f25612;
                    if (c23896 == null) {
                        c1846.m16264(new C23896(new InterfaceC14723[0]));
                    } else {
                        c1846.m16264(c23896);
                        z3 = true;
                    }
                }
            }
            AbstractC14545 abstractC14545M6131 = z3 ? c1846.m6131() : AbstractC14545.of();
            if (c17071M17912 != null) {
                C14248 c14248 = c17071M17912.f52336;
                if (c14248.f42933 != j2) {
                    c17071M17912.f52336 = c14248.m33892(j2);
                }
            }
            C14536[] c14536Arr = this.f64593;
            C6488 c6488 = this.f64585;
            if (c6488.m17911() == c6488.m17917() && (c17071M17911 = c6488.m17911()) != null) {
                C1263 c1263M40071 = c17071M17911.m40070();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c14536Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (c1263M40071.m4319(i2)) {
                        if (c14536Arr[i2].m34719() != 1) {
                            z2 = false;
                            break;
                        }
                        if (c1263M40071.f4476[i2].f53167 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f64552) {
                    this.f64552 = z5;
                    if (!z5 && this.f64582.f38576) {
                        this.f64592.mo17763(2);
                    }
                }
            }
            list = abstractC14545M6131;
        } else {
            if (!c15894.equals(this.f64582.f38574)) {
                c6181M40073 = C6181.f18976;
                c1263M40070 = this.f64560;
                listOf = AbstractC14545.of();
            }
            list = listOf;
        }
        C6181 c6181 = c6181M40073;
        C1263 c1263 = c1263M40070;
        if (z) {
            this.f64583.m35525(i);
        }
        C12838 c12839 = this.f64582;
        return c12839.m31232(c15894, j, j2, j3, m45920(c12839.f38562), c6181, c1263, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45956(boolean[] zArr, long j) {
        C14536[] c14536Arr;
        C17071 c17071M17917 = this.f64585.m17917();
        C1263 c1263M40070 = c17071M17917.m40070();
        int i = 0;
        while (true) {
            c14536Arr = this.f64593;
            if (i >= c14536Arr.length) {
                break;
            }
            if (!c1263M40070.m4319(i)) {
                c14536Arr[i].m34710();
            }
            i++;
        }
        for (int i2 = 0; i2 < c14536Arr.length; i2++) {
            if (c1263M40070.m4319(i2) && !c14536Arr[i2].m34717(c17071M17917)) {
                m45947(c17071M17917, i2, zArr[i2], j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45947(C17071 c17071, int i, boolean z, long j) {
        C14536 c14536 = this.f64593[i];
        if (c14536.m34727()) {
            return;
        }
        boolean z2 = c17071 == this.f64585.m17911();
        C1263 c1263M40070 = c17071.m40070();
        C17359 c17359 = c1263M40070.f4476[i];
        InterfaceC9731 interfaceC9731 = c1263M40070.f4478[i];
        boolean z3 = m45995() && this.f64582.f38569 == 3;
        boolean z4 = !z && z3;
        this.f64550++;
        c14536.m34702(c17359, interfaceC9731, c17071.f52335[i], this.f64551, z4, z2, j, c17071.m40071(), c17071.f52336.f42930, this.f64578);
        c14536.m34697(new C0178(this), c17071);
        if (z3 && z2) {
            c14536.m34709();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45984(boolean z) {
        long jM40058;
        C17071 c17071M17915 = this.f64585.m17915();
        C15894 c15894 = c17071M17915 == null ? this.f64582.f38574 : c17071M17915.f52336.f42930;
        boolean zEquals = this.f64582.f38575.equals(c15894);
        if (!zEquals) {
            this.f64582 = this.f64582.m31231(c15894);
        }
        C12838 c12838 = this.f64582;
        if (c17071M17915 == null) {
            jM40058 = c12838.f38563;
        } else {
            jM40058 = c17071M17915.m40058();
        }
        c12838.f38562 = jM40058;
        C12838 c12839 = this.f64582;
        c12839.f38565 = m45920(c12839.f38562);
        if ((!zEquals || z) && c17071M17915 != null && c17071M17915.f52341) {
            m45946(c17071M17915.f52336.f42930, c17071M17915.m40073(), c17071M17915.m40070());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45920(long j) {
        C17071 c17071M17915 = this.f64585.m17915();
        if (c17071M17915 == null) {
            return 0L;
        }
        return Math.max(0L, j - c17071M17915.m40072(this.f64551));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45946(C15894 c15894, C6181 c6181, C1263 c1263) {
        long jM40072;
        C6488 c6488 = this.f64585;
        C17071 c17071M17915 = c6488.m17915();
        c17071M17915.getClass();
        if (c17071M17915 == c6488.m17911()) {
            jM40072 = c17071M17915.m40072(this.f64551);
        } else {
            jM40072 = c17071M17915.m40072(this.f64551) - c17071M17915.f52336.f42927;
        }
        long j = jM40072;
        long jM45920 = m45920(c17071M17915.m40058());
        long jM26568 = m45958(this.f64582.f38560, c17071M17915.f52336.f42930) ? ((C10575) this.f64576).m26568() : -9223372036854775807L;
        AbstractC4846 abstractC4846 = this.f64582.f38560;
        float f = this.f64578.mo13468().f8510;
        boolean z = this.f64582.f38571;
        this.f64580.mo25238(new C12174(this.f64574, abstractC4846, c15894, j, jM45920, f, this.f64541, jM26568), c1263.f4478);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m45995() {
        C12838 c12838 = this.f64582;
        return c12838.f38571 && c12838.f38568 == 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45987(int i) {
        C14536 c14536 = this.f64593[i];
        try {
            C17071 c17071M17911 = this.f64585.m17911();
            c17071M17911.getClass();
            c14536.m34726(c17071M17911);
        } catch (IOException | RuntimeException e) {
            int iM34719 = c14536.m34719();
            if (iM34719 == 3 || iM34719 == 5) {
                C1263 c1263M40070 = this.f64585.m17911().m40070();
                C19956.m46034("Disabling track due to error: " + C8353.m21947(c1263M40070.f4478[i].mo2382()), e);
                C1263 c1263 = new C1263((C17359[]) c1263M40070.f4476.clone(), (InterfaceC9731[]) c1263M40070.f4478.clone(), c1263M40070.f4477, c1263M40070.f4474);
                c1263.f4476[i] = null;
                c1263.f4478[i] = null;
                C14536[] c14536Arr = this.f64593;
                int iM34711 = c14536Arr[i].m34711();
                c14536Arr[i].m34700(this.f64578);
                m45932(i, false);
                this.f64550 -= iM34711;
                this.f64585.m17911().m40059(c1263, this.f64582.f38563);
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m45994() {
        if (!this.f64570) {
            return false;
        }
        for (C14536 c14536 : this.f64593) {
            if (c14536.m34716()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45979(long j) {
        boolean z = this.f64563;
        long jMin = 1000;
        long j2 = f64538;
        if (z && this.f64577.f67588) {
            jMin = this.f64582.f38569 != 3 ? j2 : 1000L;
            for (C14536 c14536 : this.f64593) {
                jMin = Math.min(jMin, C3603.m11037(c14536.m34691(this.f64551, this.f64561)));
            }
            if (this.f64582.m31237()) {
                C6488 c6488 = this.f64585;
                C17071 c17071M40068 = c6488.m17911() != null ? c6488.m17911().m40068() : null;
                if (c17071M40068 != null) {
                    if ((C3603.m11014(jMin) * this.f64582.f38578.f8510) + this.f64551 >= c17071M40068.m40074()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.f64582.f38569 != 3 || m45995()) {
            jMin = j2;
        }
        this.f64592.mo17759(j + jMin);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m45990(C19936 c19936) {
        return c19936.f64563 && c19936.f64577.f67588;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45971(boolean z, boolean z2) {
        this.f64541 = z;
        this.f64562 = (!z || z2) ? -9223372036854775807L : this.f64568.mo33834();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m45925(AbstractC4846 abstractC4846, C22052 c22052, boolean z, int i, boolean z2, C20369 c20369, C22485 c22485) {
        int iM45919;
        AbstractC4846 abstractC4847 = c22052.f70683;
        if (abstractC4846.m14110()) {
            return null;
        }
        AbstractC4846 abstractC4848 = abstractC4847.m14110() ? abstractC4846 : abstractC4847;
        try {
            Pair pairM14100 = abstractC4848.m14100(c20369, c22485, c22052.f70684, c22052.f70685);
            if (!abstractC4846.equals(abstractC4848)) {
                if (abstractC4846.mo14098(pairM14100.first) == -1) {
                    if (!z || (iM45919 = m45919(c20369, c22485, i, z2, pairM14100.first, abstractC4848, abstractC4846)) == -1) {
                        return null;
                    }
                    return abstractC4846.m14100(c20369, c22485, iM45919, -9223372036854775807L);
                }
                if (abstractC4848.mo14105(pairM14100.first, c22485).f72805 && abstractC4848.mo14103(c22485.f72806, c20369, 0L).f65760 == abstractC4848.mo14098(pairM14100.first)) {
                    return abstractC4846.m14100(c20369, c22485, abstractC4846.mo14105(pairM14100.first, c22485).f72806, c22052.f70685);
                }
            }
            return pairM14100;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45919(C20369 c20369, C22485 c22485, int i, boolean z, Object obj, AbstractC4846 abstractC4846, AbstractC4846 abstractC4847) {
        Object obj2 = abstractC4846.mo14103(abstractC4846.mo14105(obj, c22485).f72806, c20369, 0L).f65761;
        for (int i2 = 0; i2 < abstractC4847.mo14107(); i2++) {
            if (abstractC4847.mo14103(i2, c20369, 0L).f65761.equals(obj2)) {
                return i2;
            }
        }
        int iMo14098 = abstractC4846.mo14098(obj);
        int iMo14095 = abstractC4846.mo14095();
        int iM14097 = iMo14098;
        int iMo14099 = -1;
        for (int i3 = 0; i3 < iMo14095 && iMo14099 == -1; i3++) {
            iM14097 = abstractC4846.m14097(iM14097, c22485, c20369, i, z);
            if (iM14097 == -1) {
                break;
            }
            iMo14099 = abstractC4847.mo14098(abstractC4846.mo14102(iM14097));
        }
        if (iMo14099 == -1) {
            return -1;
        }
        return abstractC4847.mo14104(iMo14099, c22485, false).f72806;
    }
}
