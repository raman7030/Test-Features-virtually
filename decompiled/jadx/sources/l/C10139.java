package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۤ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10139 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4314 f30510 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f30511;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f30512;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22364 f30513;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20661 f30514;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6136 f30515;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC10370[] f30516;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0758 f30517;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6319 f30518;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10139 m25473(C2903 c2903) {
        C10139 c10139 = (C10139) c2903.m8838(f30510);
        return c10139 == null ? new C10139(c2903) : c10139;
    }

    public C10139(C2903 c2903) {
        HashMap map = new HashMap(EnumC18550.m43090());
        this.f30512 = map;
        HashMap map2 = new HashMap(EnumC18550.m43090());
        this.f30511 = map2;
        AbstractC10370[] abstractC10370Arr = new AbstractC10370[EnumC18550.m43090()];
        this.f30516 = abstractC10370Arr;
        c2903.m8841(f30510, this);
        C20661 c20661M47250 = C20661.m47250(c2903);
        this.f30514 = c20661M47250;
        C6136 c6136M17057 = C6136.m17057(c2903);
        this.f30515 = c6136M17057;
        this.f30513 = C22364.m50099(c2903);
        this.f30518 = C6319.m17456(c2903);
        this.f30517 = new C0758(c6136M17057.f18867, AbstractC4308.f13885, -1, c20661M47250.f66475);
        EnumC18550 enumC18550 = EnumC18550.f57577;
        m25475(enumC18550, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC18550 enumC18551 = EnumC18550.f57520;
        m25475(enumC18551, "-");
        EnumC18550 enumC18552 = EnumC18550.f57488;
        m25475(enumC18552, "!");
        EnumC18550 enumC18553 = EnumC18550.f57507;
        m25475(enumC18553, "~");
        m25475(EnumC18550.f57536, "++");
        m25475(EnumC18550.f57492, "--");
        EnumC18550 enumC18554 = EnumC18550.f57499;
        m25475(enumC18554, "++");
        EnumC18550 enumC18555 = EnumC18550.f57567;
        m25475(enumC18555, "--");
        EnumC18550 enumC18556 = EnumC18550.f57560;
        m25475(enumC18556, "<*nullchk*>");
        EnumC18550 enumC18557 = EnumC18550.f57479;
        m25475(enumC18557, "||");
        EnumC18550 enumC18558 = EnumC18550.f57565;
        m25475(enumC18558, "&&");
        EnumC18550 enumC18559 = EnumC18550.f57559;
        m25475(enumC18559, "==");
        EnumC18550 enumC185510 = EnumC18550.f57570;
        m25475(enumC185510, "!=");
        EnumC18550 enumC185511 = EnumC18550.f57539;
        m25475(enumC185511, "<");
        EnumC18550 enumC185512 = EnumC18550.f57572;
        m25475(enumC185512, ">");
        EnumC18550 enumC185513 = EnumC18550.f57505;
        m25475(enumC185513, "<=");
        EnumC18550 enumC185514 = EnumC18550.f57544;
        m25475(enumC185514, ">=");
        EnumC18550 enumC185515 = EnumC18550.f57538;
        m25475(enumC185515, "|");
        EnumC18550 enumC185516 = EnumC18550.f57484;
        m25475(enumC185516, "^");
        EnumC18550 enumC185517 = EnumC18550.f57528;
        m25475(enumC185517, a.p);
        EnumC18550 enumC185518 = EnumC18550.f57512;
        m25475(enumC185518, "<<");
        EnumC18550 enumC185519 = EnumC18550.f57527;
        m25475(enumC185519, ">>");
        EnumC18550 enumC185520 = EnumC18550.f57546;
        m25475(enumC185520, ">>>");
        EnumC18550 enumC185521 = EnumC18550.f57545;
        m25475(enumC185521, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC18550 enumC185522 = EnumC18550.f57485;
        abstractC10370Arr[enumC185522.m43095()] = c6136M17057.f18802;
        EnumC18550 enumC185523 = EnumC18550.f57583;
        abstractC10370Arr[enumC185523.m43095()] = c6136M17057.f18835;
        EnumC18550 enumC185524 = EnumC18550.f57547;
        abstractC10370Arr[enumC185524.m43095()] = c6136M17057.f18803;
        EnumC18550 enumC185525 = EnumC18550.f57551;
        m25475(enumC185525, "%");
        C22133 c22133 = new C22133(this, enumC18550);
        EnumC15076 enumC15076 = EnumC15076.DOUBLE;
        c22133.m9415(enumC15076, enumC15076, 0);
        EnumC15076 enumC15077 = EnumC15076.FLOAT;
        c22133.m9415(enumC15077, enumC15077, 0);
        EnumC15076 enumC15078 = EnumC15076.LONG;
        c22133.m9415(enumC15078, enumC15078, 0);
        EnumC15076 enumC15079 = EnumC15076.INT;
        c22133.m9415(enumC15079, enumC15079, 0);
        C22133 c22134 = new C22133(this, enumC18551);
        c22134.m9415(enumC15076, enumC15076, 119);
        c22134.m9415(enumC15077, enumC15077, 118);
        c22134.m9415(enumC15078, enumC15078, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        c22134.m9415(enumC15079, enumC15079, 116);
        C22133 c22135 = new C22133(this, enumC18553, new C15690(3));
        c22135.m9415(enumC15078, enumC15078, 131);
        c22135.m9415(enumC15079, enumC15079, 130);
        C12960 c12960 = new C12960(this, enumC18554);
        c12960.m9415(enumC15076, enumC15076, 99);
        c12960.m9415(enumC15077, enumC15077, 98);
        c12960.m9415(enumC15078, enumC15078, 97);
        c12960.m9415(enumC15079, enumC15079, 96);
        EnumC15076 enumC150710 = EnumC15076.CHAR;
        c12960.m9415(enumC150710, enumC150710, 96);
        EnumC15076 enumC150711 = EnumC15076.SHORT;
        c12960.m9415(enumC150711, enumC150711, 96);
        EnumC15076 enumC150712 = EnumC15076.BYTE;
        c12960.m9415(enumC150712, enumC150712, 96);
        C12960 c12961 = new C12960(this, enumC18555);
        c12961.m9415(enumC15076, enumC15076, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c12961.m9415(enumC15077, enumC15077, IShizukuService.Stub.TRANSACTION_attachUserService);
        c12961.m9415(enumC15078, enumC15078, 101);
        c12961.m9415(enumC15079, enumC15079, 100);
        c12961.m9415(enumC150710, enumC150710, 100);
        c12961.m9415(enumC150711, enumC150711, 100);
        c12961.m9415(enumC150712, enumC150712, 100);
        C21428 c21428 = new C21428(this, enumC18552);
        EnumC15076 enumC150713 = EnumC15076.BOOLEAN;
        c21428.m9415(enumC150713, enumC150713, 257);
        C12255 c12255 = new C12255(this, enumC18556);
        EnumC15076 enumC150714 = EnumC15076.OBJECT;
        c12255.m9415(enumC150714, enumC150714, 276);
        AbstractC3083[] abstractC3083Arr = {c22133, c22134, c22135, c12960, c12961, c21428, c12255};
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            AbstractC3083 abstractC3083 = abstractC3083Arr[i];
            AbstractC10370 abstractC10370 = abstractC3083.f48633;
            map.put(abstractC10370, ((C2609) C13843.getOrDefault(map, abstractC10370, C2609.m8239())).m8246(abstractC3083));
            i++;
        }
        C6611 c6611 = new C6611(this, enumC185521);
        EnumC15076 enumC150715 = EnumC15076.STRING;
        c6611.m34338(enumC150715, enumC150714, enumC150715, 256);
        c6611.m34338(enumC150714, enumC150715, enumC150715, 256);
        c6611.m34338(enumC150715, enumC150715, enumC150715, 256);
        c6611.m34338(enumC150715, enumC15079, enumC150715, 256);
        c6611.m34338(enumC150715, enumC15078, enumC150715, 256);
        c6611.m34338(enumC150715, enumC15077, enumC150715, 256);
        c6611.m34338(enumC150715, enumC15076, enumC150715, 256);
        c6611.m34338(enumC150715, enumC150713, enumC150715, 256);
        EnumC15076 enumC150716 = EnumC15076.BOT;
        c6611.m34338(enumC150715, enumC150716, enumC150715, 256);
        c6611.m34338(enumC15079, enumC150715, enumC150715, 256);
        c6611.m34338(enumC15078, enumC150715, enumC150715, 256);
        c6611.m34338(enumC15077, enumC150715, enumC150715, 256);
        c6611.m34338(enumC15076, enumC150715, enumC150715, 256);
        c6611.m34338(enumC150713, enumC150715, enumC150715, 256);
        c6611.m34338(enumC150716, enumC150715, enumC150715, 256);
        C16488 c16488 = new C16488(this, enumC185521);
        c16488.m34338(enumC15076, enumC15076, enumC15076, 99);
        c16488.m34338(enumC15077, enumC15077, enumC15077, 98);
        c16488.m34338(enumC15078, enumC15078, enumC15078, 97);
        c16488.m34338(enumC15079, enumC15079, enumC15079, 96);
        C16488 c16489 = new C16488(this, enumC185522);
        c16489.m34338(enumC15076, enumC15076, enumC15076, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c16489.m34338(enumC15077, enumC15077, enumC15077, IShizukuService.Stub.TRANSACTION_attachUserService);
        c16489.m34338(enumC15078, enumC15078, enumC15078, 101);
        c16489.m34338(enumC15079, enumC15079, enumC15079, 100);
        C16488 c164810 = new C16488(this, enumC185523);
        c164810.m34338(enumC15076, enumC15076, enumC15076, IShizukuService.Stub.TRANSACTION_updateFlagsForUid);
        c164810.m34338(enumC15077, enumC15077, enumC15077, IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        c164810.m34338(enumC15078, enumC15078, enumC15078, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        c164810.m34338(enumC15079, enumC15079, enumC15079, IShizukuService.Stub.TRANSACTION_isHidden);
        C16488 c164811 = new C16488(this, enumC185524);
        c164811.m34338(enumC15076, enumC15076, enumC15076, UMErrorCode.E_UM_BE_CREATE_FAILED);
        c164811.m34338(enumC15077, enumC15077, enumC15077, UMErrorCode.E_UM_BE_JSON_FAILED);
        c164811.m34338(enumC15078, enumC15078, enumC15078, 109);
        c164811.m34338(enumC15079, enumC15079, enumC15079, 108);
        C16488 c164812 = new C16488(this, enumC185525);
        c164812.m34338(enumC15076, enumC15076, enumC15076, 115);
        c164812.m34338(enumC15077, enumC15077, enumC15077, 114);
        c164812.m34338(enumC15078, enumC15078, enumC15078, UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        c164812.m34338(enumC15079, enumC15079, enumC15079, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C1672 c1672 = new C1672(this, enumC185517);
        c1672.m34338(enumC150713, enumC150713, enumC150713, 126);
        C16488 c164813 = new C16488(this, enumC185517, new C15690(3));
        c164813.m34338(enumC15078, enumC15078, enumC15078, 127);
        c164813.m34338(enumC15079, enumC15079, enumC15079, 126);
        C1672 c1673 = new C1672(this, enumC185515);
        c1673.m34338(enumC150713, enumC150713, enumC150713, 128);
        C16488 c164814 = new C16488(this, enumC185515, new C15690(3));
        c164814.m34338(enumC15078, enumC15078, enumC15078, 129);
        c164814.m34338(enumC15079, enumC15079, enumC15079, 128);
        C1672 c1674 = new C1672(this, enumC185516);
        c1674.m34338(enumC150713, enumC150713, enumC150713, 130);
        C16488 c164815 = new C16488(this, enumC185516, new C15690(3));
        c164815.m34338(enumC15078, enumC15078, enumC15078, 131);
        c164815.m34338(enumC15079, enumC15079, enumC15079, 130);
        C23544 c23544 = new C23544(this, enumC185518);
        c23544.m34338(enumC15079, enumC15079, enumC15079, UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
        c23544.m34338(enumC15079, enumC15078, enumC15079, BottomAppBarTopEdgeTreatment.ANGLE_UP);
        c23544.m34338(enumC15078, enumC15079, enumC15078, UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
        c23544.m34338(enumC15078, enumC15078, enumC15078, 271);
        C23544 c23545 = new C23544(this, enumC185519);
        c23545.m34338(enumC15079, enumC15079, enumC15079, 122);
        c23545.m34338(enumC15079, enumC15078, enumC15079, 272);
        c23545.m34338(enumC15078, enumC15079, enumC15078, 123);
        c23545.m34338(enumC15078, enumC15078, enumC15078, 273);
        C23544 c23546 = new C23544(this, enumC185520);
        c23546.m34338(enumC15079, enumC15079, enumC15079, 124);
        c23546.m34338(enumC15079, enumC15078, enumC15079, 274);
        c23546.m34338(enumC15078, enumC15079, enumC15078, q.h);
        c23546.m34338(enumC15078, enumC15078, enumC15078, b.g);
        C16488 c164816 = new C16488(this, enumC185511);
        c164816.m34338(enumC15076, enumC15076, enumC150713, 152, 155);
        c164816.m34338(enumC15077, enumC15077, enumC150713, 150, 155);
        c164816.m34338(enumC15078, enumC15078, enumC150713, 148, 155);
        c164816.m34338(enumC15079, enumC15079, enumC150713, 161);
        C16488 c164817 = new C16488(this, enumC185512);
        c164817.m34338(enumC15076, enumC15076, enumC150713, 151, 157);
        c164817.m34338(enumC15077, enumC15077, enumC150713, 149, 157);
        c164817.m34338(enumC15078, enumC15078, enumC150713, 148, 157);
        c164817.m34338(enumC15079, enumC15079, enumC150713, 163);
        C16488 c164818 = new C16488(this, enumC185513);
        c164818.m34338(enumC15076, enumC15076, enumC150713, 152, 158);
        c164818.m34338(enumC15077, enumC15077, enumC150713, 150, 158);
        c164818.m34338(enumC15078, enumC15078, enumC150713, 148, 158);
        c164818.m34338(enumC15079, enumC15079, enumC150713, 164);
        C16488 c164819 = new C16488(this, enumC185514);
        c164819.m34338(enumC15076, enumC15076, enumC150713, 151, 156);
        c164819.m34338(enumC15077, enumC15077, enumC150713, 149, 156);
        c164819.m34338(enumC15078, enumC15078, enumC150713, 148, 156);
        c164819.m34338(enumC15079, enumC15079, enumC150713, 162);
        C10845 c10845 = new C10845(this, enumC18559);
        c10845.m34338(enumC150714, enumC150714, enumC150713, 165);
        c10845.m34338(enumC150713, enumC150713, enumC150713, 159);
        c10845.m34338(enumC15076, enumC15076, enumC150713, 151, 153);
        c10845.m34338(enumC15077, enumC15077, enumC150713, 149, 153);
        c10845.m34338(enumC15078, enumC15078, enumC150713, 148, 153);
        c10845.m34338(enumC15079, enumC15079, enumC150713, 159);
        C10845 c10846 = new C10845(this, enumC185510);
        c10846.m34338(enumC150714, enumC150714, enumC150713, 166);
        c10846.m34338(enumC150713, enumC150713, enumC150713, DHParameters.DEFAULT_MINIMUM_LENGTH);
        c10846.m34338(enumC15076, enumC15076, enumC150713, 151, EnumC17734.f54268);
        c10846.m34338(enumC15077, enumC15077, enumC150713, 149, EnumC17734.f54268);
        c10846.m34338(enumC15078, enumC15078, enumC150713, 148, EnumC17734.f54268);
        c10846.m34338(enumC15079, enumC15079, enumC150713, DHParameters.DEFAULT_MINIMUM_LENGTH);
        C1672 c1675 = new C1672(this, enumC18558);
        c1675.m34338(enumC150713, enumC150713, enumC150713, 258);
        C1672 c1676 = new C1672(this, enumC18557);
        c1676.m34338(enumC150713, enumC150713, enumC150713, 259);
        AbstractC14371[] abstractC14371Arr = {c6611, c16488, c16489, c164810, c164811, c164812, c1672, c164813, c1673, c164814, c1674, c164815, c23544, c23545, c23546, c164816, c164817, c164818, c164819, c10845, c10846, c1675, c1676};
        for (int i3 = 0; i3 < 23; i3++) {
            AbstractC14371 abstractC14371 = abstractC14371Arr[i3];
            AbstractC10370 abstractC10371 = abstractC14371.f48633;
            map2.put(abstractC10371, ((C2609) C13843.getOrDefault(map2, abstractC10371, C2609.m8239())).m8246(abstractC14371));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m25480(AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4308M17559 = this.f30518.m17559(abstractC4308);
        int i = C7500.f23094[abstractC4308M17559.mo3258().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? this.f30514.f66452 : abstractC4308M17559;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m25481(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C6319 c6319 = this.f30518;
        AbstractC4308 abstractC4308M17559 = c6319.m17559(abstractC4308);
        AbstractC4308 abstractC4308M175510 = c6319.m17559(abstractC4309);
        boolean zMo12914 = abstractC4308M17559.mo12914();
        C20661 c20661 = this.f30514;
        if (!zMo12914 || !abstractC4308M175510.mo12914()) {
            return c6319.m17550(abstractC4308M17559, abstractC4308M175510) ? abstractC4308M17559 : c20661.f66526;
        }
        EnumC9454 enumC9454 = EnumC9454.DOUBLE;
        if (abstractC4308M17559.m12913(enumC9454) || abstractC4308M175510.m12913(enumC9454)) {
            return c20661.f66499;
        }
        EnumC9454 enumC9455 = EnumC9454.FLOAT;
        if (abstractC4308M17559.m12913(enumC9455) || abstractC4308M175510.m12913(enumC9455)) {
            return c20661.f66483;
        }
        EnumC9454 enumC9456 = EnumC9454.LONG;
        if (abstractC4308M17559.m12913(enumC9456) || abstractC4308M175510.m12913(enumC9456)) {
            return c20661.f66470;
        }
        return c20661.f66452;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m25478(final AbstractC12612 abstractC12612, final EnumC18550 enumC18550, final AbstractC4308 abstractC4308) {
        Predicate predicate = new Predicate() { // from class: l.ۤܰ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C19285.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate2) {
                return C19285.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC3083) obj).test(abstractC4308);
            }
        };
        C7688 c7688 = new C7688(1, abstractC4308);
        return (C0758) C5378.stream((C2609) this.f30512.get(m25482(enumC18550))).filter(predicate).map(c7688).findFirst().orElseGet(new Supplier() { // from class: l.ۛܰ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f18668.m25468(abstractC12612, enumC18550, abstractC4308);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m25477(final AbstractC0764 abstractC0764, final EnumC18550 enumC18550, final AbstractC4308 abstractC4308, final AbstractC4308 abstractC4309) {
        C10762 c10762 = new C10762(abstractC4308, abstractC4309);
        C16405 c16405 = new C16405(1, abstractC4308, abstractC4309);
        return (C0758) C5378.stream((C2609) this.f30511.get(m25482(enumC18550))).filter(c10762).map(c16405).findFirst().orElseGet(new Supplier() { // from class: l.ۨܰ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f35000.m25468(abstractC0764, enumC18550, abstractC4308, abstractC4309);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0758 m25471(final C10139 c10139, AbstractC10370 abstractC10370, C2609 c2609, EnumC15076 enumC15076, int[] iArr) {
        int i;
        C2609 c26010 = (C2609) C5378.stream(c2609).map(new Function() { // from class: l.۫ܰ֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((EnumC15076) obj).m35695(this.f37434.f30514);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }).collect(C2609.m8240());
        C20661 c20661 = c10139.f30514;
        C10658 c10658 = new C10658(c26010, enumC15076.m35695(c20661), C2609.m8239(), c20661.f66481);
        int length = iArr.length;
        C12171.m29642(length == 1 || length == 2);
        if (length == 1) {
            i = iArr[0];
        } else {
            i = (iArr[0] << 9) | iArr[1];
        }
        return new C0758(abstractC10370, c10658, i, c20661.f66475);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0758 m25468(InterfaceC3109 interfaceC3109, EnumC18550 enumC18550, AbstractC4308... abstractC4308Arr) {
        C12281 c12281;
        if (C16958.of((Object[]) abstractC4308Arr).noneMatch(new C13144())) {
            AbstractC10370 abstractC10370M25482 = m25482(enumC18550);
            if (abstractC4308Arr.length == 1) {
                AbstractC4308 abstractC4308 = abstractC4308Arr[0];
                C12281 c12282 = C6241.f19132;
                c12281 = new C12281("compiler", "operator.cant.be.applied", abstractC10370M25482, abstractC4308);
            } else {
                AbstractC4308 abstractC4309 = abstractC4308Arr[0];
                AbstractC4308 abstractC43010 = abstractC4308Arr[1];
                C12281 c12283 = C6241.f19132;
                c12281 = new C12281("compiler", "operator.cant.be.applied.1", abstractC10370M25482, abstractC4309, abstractC43010);
            }
            this.f30513.m7273(interfaceC3109, c12281);
        }
        return this.f30517;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m25482(EnumC18550 enumC18550) {
        return this.f30516[enumC18550.m43095()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m25479(C15532 c15532) {
        return (C0758) C5378.stream(this.f30511.values()).flatMap(new C5894(5)).map(new C23022(0, c15532)).distinct().filter(new C13849(0, this)).findFirst().get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25475(EnumC18550 enumC18550, String str) {
        AbstractC12486 abstractC12486 = this.f30515.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        this.f30516[enumC18550.m43095()] = abstractC12486.mo15927(charArray, charArray.length);
    }
}
