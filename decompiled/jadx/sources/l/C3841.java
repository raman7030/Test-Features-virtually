package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;

/* JADX INFO: renamed from: l.ۘۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAA */
/* JADX INFO: loaded from: classes3.dex */
public final class C3841 extends AbstractC15834 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22390 f12272;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22390 f12273;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f12274;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4751 f12275;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C13217 f12269 = new C13217("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C13217 f12271 = new C13217("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C13217 f12270 = new C13217("([Ljava/lang/Object;)Z");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C3841(C3135 c3135, C10191 c10191, C20069 c20069, InterfaceC10711 interfaceC10711, C22390 c22390) {
        C22390 c22391;
        super(c3135, c10191, null, c20069);
        byte b = 6;
        if (c3135.m9558() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f12274 = interfaceC10711;
        if (c22390 == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c22390.m39384()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f12272 = c22390;
        C12512 c12512M36363 = c22390.m36363();
        C13217 name = c22390.m36364().getName();
        String string = c22390.m36364().getName().getString();
        boolean zEquals = c12512M36363.equals(C12512.f37598);
        C13217 c13217 = f12269;
        if (zEquals && (string.equals("invoke") || string.equals("invokeExact"))) {
            c22391 = new C22390(c12512M36363, new C20274(name, c13217));
        } else {
            if (c12512M36363.equals(C12512.f37586)) {
                string.getClass();
                switch (string.hashCode()) {
                    case -1946504908:
                        if (!string.equals("getAndBitwiseOrRelease")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case -1686727776:
                        if (!string.equals("getAndBitwiseAndRelease")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case -1671098288:
                        if (!string.equals("compareAndSet")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case -1292078254:
                        if (!string.equals("compareAndExchangeRelease")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -1117944904:
                        if (!string.equals("weakCompareAndSet")) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case -1103072857:
                        if (!string.equals("getAndAddRelease")) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case -1032914329:
                        if (!string.equals("getAndBitwiseAnd")) {
                            b = -1;
                        }
                        break;
                    case -1032892181:
                        if (!string.equals("getAndBitwiseXor")) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case -794517348:
                        if (!string.equals("getAndBitwiseXorRelease")) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case -567150350:
                        if (!string.equals("weakCompareAndSetPlain")) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case -240822786:
                        if (!string.equals("weakCompareAndSetAcquire")) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case -230706875:
                        if (!string.equals("setRelease")) {
                            b = -1;
                        } else {
                            b = 11;
                        }
                        break;
                    case -127361888:
                        if (!string.equals("getAcquire")) {
                            b = -1;
                        } else {
                            b = 12;
                        }
                        break;
                    case -37641530:
                        if (!string.equals("getAndSetRelease")) {
                            b = -1;
                        } else {
                            b = cb.k;
                        }
                        break;
                    case 102230:
                        if (!string.equals("get")) {
                            b = -1;
                        } else {
                            b = cb.f77931l;
                        }
                        break;
                    case 113762:
                        if (!string.equals("set")) {
                            b = -1;
                        } else {
                            b = 15;
                        }
                        break;
                    case 93645315:
                        if (!string.equals("getAndBitwiseOrAcquire")) {
                            b = -1;
                        } else {
                            b = 16;
                        }
                        break;
                    case 101293086:
                        if (!string.equals("setVolatile")) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case 189872914:
                        if (!string.equals("getVolatile")) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case 282707520:
                        if (!string.equals("getAndAdd")) {
                            b = -1;
                        } else {
                            b = 19;
                        }
                        break;
                    case 282724865:
                        if (!string.equals("getAndSet")) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case 353422447:
                        if (!string.equals("getAndBitwiseAndAcquire")) {
                            b = -1;
                        } else {
                            b = 21;
                        }
                        break;
                    case 470702883:
                        if (!string.equals("setOpaque")) {
                            b = -1;
                        } else {
                            b = 22;
                        }
                        break;
                    case 685319959:
                        if (!string.equals("getOpaque")) {
                            b = -1;
                        } else {
                            b = 23;
                        }
                        break;
                    case 748071969:
                        if (!string.equals("compareAndExchangeAcquire")) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 937077366:
                        if (!string.equals("getAndAddAcquire")) {
                            b = -1;
                        } else {
                            b = 25;
                        }
                        break;
                    case 1245632875:
                        if (!string.equals("getAndBitwiseXorAcquire")) {
                            b = -1;
                        } else {
                            b = 26;
                        }
                        break;
                    case 1352153939:
                        if (!string.equals("getAndBitwiseOr")) {
                            b = -1;
                        } else {
                            b = 27;
                        }
                        break;
                    case 1483964149:
                        if (!string.equals("compareAndExchange")) {
                            b = -1;
                        } else {
                            b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        }
                        break;
                    case 2002508693:
                        if (!string.equals("getAndSetAcquire")) {
                            b = -1;
                        } else {
                            b = 29;
                        }
                        break;
                    case 2013994287:
                        if (!string.equals("weakCompareAndSetRelease")) {
                            b = -1;
                        } else {
                            b = 30;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 12:
                    case 13:
                    case 14:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        c22391 = new C22390(c12512M36363, new C20274(name, c13217));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c22391 = new C22390(c12512M36363, new C20274(name, f12270));
                        break;
                    case 11:
                    case 15:
                    case 17:
                    case 22:
                        c22391 = new C22390(c12512M36363, new C20274(name, f12271));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c22390.mo2463());
        }
        this.f12273 = c22391;
        this.f12275 = new C4751(c22390.m39385(true));
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10711 mo3533() {
        return this.f12274;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8213(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3529(C7573 c7573) {
        return new C3841(m37484(), m37480(), m37479(), this.f12274.mo26890(c7573), this.f12272);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C3841(m37484(), m37480(), c20069, this.f12274, this.f12272);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22390 m11592() {
        return this.f12273;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4751 m11591() {
        return this.f12275;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo11590() {
        return this.f12273.toString() + " " + this.f12275.toString() + " " + C22890.m50977(this.f12274);
    }
}
