package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;

/* JADX INFO: renamed from: l.ۘۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6019 extends AbstractC17417 {

    /* JADX INFO: renamed from: ۗ */
    public final C23648 f15080;

    /* JADX INFO: renamed from: ۤ */
    public final C23648 f15081;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC12548 f15082;

    /* JADX INFO: renamed from: ۬ */
    public final C6884 f15083;

    /* JADX INFO: renamed from: ۛ */
    public static final C14930 f15077 = new C14930("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: ᩺ */
    public static final C14930 f15079 = new C14930("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: ۨ */
    public static final C14930 f15078 = new C14930("([Ljava/lang/Object;)Z");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C6019(C5348 c5348, C12054 c12054, C21442 c21442, InterfaceC12548 interfaceC12548, C23648 c23648) {
        C23648 c23649;
        super(c5348, c12054, null, c21442);
        byte b = 6;
        if (c5348.m11601() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c5348.m11601());
        }
        if (interfaceC12548 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f15082 = interfaceC12548;
        if (c23648 == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c23648.m41620()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f15080 = c23648;
        C14260 c14260M38521 = c23648.m38521();
        C14930 name = c23648.m38522().getName();
        String string = c23648.m38522().getName().getString();
        boolean zEquals = c14260M38521.equals(C14260.f40622);
        C14930 c14930 = f15077;
        if (zEquals && (string.equals("invoke") || string.equals("invokeExact"))) {
            c23649 = new C23648(c14260M38521, new C21637(name, c14930));
        } else {
            if (c14260M38521.equals(C14260.f40610)) {
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
                            b = C0698cb.f2569k;
                        }
                        break;
                    case 102230:
                        if (!string.equals("get")) {
                            b = -1;
                        } else {
                            b = C0698cb.f2570l;
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
                        c23649 = new C23648(c14260M38521, new C21637(name, c14930));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c23649 = new C23648(c14260M38521, new C21637(name, f15078));
                        break;
                    case 11:
                    case 15:
                    case 17:
                    case 22:
                        c23649 = new C23648(c14260M38521, new C21637(name, f15079));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c23648.mo4819());
        }
        this.f15081 = c23649;
        this.f15083 = new C6884(c23648.m41621(true));
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return this.f15082;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10252(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        return new C6019(m39656(), m39652(), m39651(), this.f15082.mo28930(c9566), this.f15080);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C6019(m39656(), m39652(), c21442, this.f15082, this.f15080);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C23648 m13528() {
        return this.f15081;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C6884 m13527() {
        return this.f15083;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ᩳ */
    public final String mo13526() {
        return this.f15081.toString() + " " + this.f15083.toString() + " " + C24123.m53368(this.f15082);
    }
}
