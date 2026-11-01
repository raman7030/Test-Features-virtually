package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.stateless.C0791b;
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
public final class C12004 {

    /* JADX INFO: renamed from: ᩷ */
    public static final C6468 f33472 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public HashMap f33473;

    /* JADX INFO: renamed from: ۜ */
    public HashMap f33474;

    /* JADX INFO: renamed from: ۧ */
    public final C23623 f33475;

    /* JADX INFO: renamed from: ܳ */
    public final C22004 f33476;

    /* JADX INFO: renamed from: ܽ */
    public final C8200 f33477;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC12224[] f33478;

    /* JADX INFO: renamed from: ᩳ */
    public final C3088 f33479;

    /* JADX INFO: renamed from: ᩻ */
    public final C8374 f33480;

    /* JADX INFO: renamed from: ֫ */
    public static C12004 m27492(C5127 c5127) {
        C12004 c12004 = (C12004) c5127.m10905(f33472);
        return c12004 == null ? new C12004(c5127) : c12004;
    }

    public C12004(C5127 c5127) {
        HashMap map = new HashMap(EnumC19998.m45368());
        this.f33474 = map;
        HashMap map2 = new HashMap(EnumC19998.m45368());
        this.f33473 = map2;
        AbstractC12224[] abstractC12224Arr = new AbstractC12224[EnumC19998.m45368()];
        this.f33478 = abstractC12224Arr;
        c5127.m10908(f33472, this);
        C22004 c22004M49577 = C22004.m49577(c5127);
        this.f33476 = c22004M49577;
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f33477 = c8200M18988;
        this.f33475 = C23623.m52439(c5127);
        this.f33480 = C8374.m19396(c5127);
        this.f33479 = new C3088(c8200M18988.f21725, AbstractC6462.f16700, -1, c22004M49577.f69157);
        EnumC19998 enumC19998 = EnumC19998.f60801;
        m27494(enumC19998, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC19998 enumC19999 = EnumC19998.f60744;
        m27494(enumC19999, "-");
        EnumC19998 enumC199910 = EnumC19998.f60712;
        m27494(enumC199910, "!");
        EnumC19998 enumC199911 = EnumC19998.f60731;
        m27494(enumC199911, "~");
        m27494(EnumC19998.f60760, "++");
        m27494(EnumC19998.f60716, "--");
        EnumC19998 enumC199912 = EnumC19998.f60723;
        m27494(enumC199912, "++");
        EnumC19998 enumC199913 = EnumC19998.f60791;
        m27494(enumC199913, "--");
        EnumC19998 enumC199914 = EnumC19998.f60784;
        m27494(enumC199914, "<*nullchk*>");
        EnumC19998 enumC199915 = EnumC19998.f60703;
        m27494(enumC199915, "||");
        EnumC19998 enumC199916 = EnumC19998.f60789;
        m27494(enumC199916, "&&");
        EnumC19998 enumC199917 = EnumC19998.f60783;
        m27494(enumC199917, "==");
        EnumC19998 enumC199918 = EnumC19998.f60794;
        m27494(enumC199918, "!=");
        EnumC19998 enumC199919 = EnumC19998.f60763;
        m27494(enumC199919, "<");
        EnumC19998 enumC199920 = EnumC19998.f60796;
        m27494(enumC199920, ">");
        EnumC19998 enumC199921 = EnumC19998.f60729;
        m27494(enumC199921, "<=");
        EnumC19998 enumC199922 = EnumC19998.f60768;
        m27494(enumC199922, ">=");
        EnumC19998 enumC199923 = EnumC19998.f60762;
        m27494(enumC199923, "|");
        EnumC19998 enumC199924 = EnumC19998.f60708;
        m27494(enumC199924, "^");
        EnumC19998 enumC199925 = EnumC19998.f60752;
        m27494(enumC199925, C0233a.f1084p);
        EnumC19998 enumC199926 = EnumC19998.f60736;
        m27494(enumC199926, "<<");
        EnumC19998 enumC199927 = EnumC19998.f60751;
        m27494(enumC199927, ">>");
        EnumC19998 enumC199928 = EnumC19998.f60770;
        m27494(enumC199928, ">>>");
        EnumC19998 enumC199929 = EnumC19998.f60769;
        m27494(enumC199929, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC19998 enumC199930 = EnumC19998.f60709;
        abstractC12224Arr[enumC199930.m45373()] = c8200M18988.f21660;
        EnumC19998 enumC199931 = EnumC19998.f60807;
        abstractC12224Arr[enumC199931.m45373()] = c8200M18988.f21693;
        EnumC19998 enumC199932 = EnumC19998.f60771;
        abstractC12224Arr[enumC199932.m45373()] = c8200M18988.f21661;
        EnumC19998 enumC199933 = EnumC19998.f60775;
        m27494(enumC199933, "%");
        C23403 c23403 = new C23403(this, enumC19998);
        EnumC16696 enumC16696 = EnumC16696.DOUBLE;
        c23403.m11458(enumC16696, enumC16696, 0);
        EnumC16696 enumC16697 = EnumC16696.FLOAT;
        c23403.m11458(enumC16697, enumC16697, 0);
        EnumC16696 enumC16698 = EnumC16696.LONG;
        c23403.m11458(enumC16698, enumC16698, 0);
        EnumC16696 enumC16699 = EnumC16696.INT;
        c23403.m11458(enumC16699, enumC16699, 0);
        C23403 c23404 = new C23403(this, enumC19999);
        c23404.m11458(enumC16696, enumC16696, 119);
        c23404.m11458(enumC16697, enumC16697, 118);
        c23404.m11458(enumC16698, enumC16698, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        c23404.m11458(enumC16699, enumC16699, 116);
        C23403 c23405 = new C23403(this, enumC199911, new C17280(3));
        c23405.m11458(enumC16698, enumC16698, 131);
        c23405.m11458(enumC16699, enumC16699, 130);
        C14685 c14685 = new C14685(this, enumC199912);
        c14685.m11458(enumC16696, enumC16696, 99);
        c14685.m11458(enumC16697, enumC16697, 98);
        c14685.m11458(enumC16698, enumC16698, 97);
        c14685.m11458(enumC16699, enumC16699, 96);
        EnumC16696 enumC166910 = EnumC16696.CHAR;
        c14685.m11458(enumC166910, enumC166910, 96);
        EnumC16696 enumC166911 = EnumC16696.SHORT;
        c14685.m11458(enumC166911, enumC166911, 96);
        EnumC16696 enumC166912 = EnumC16696.BYTE;
        c14685.m11458(enumC166912, enumC166912, 96);
        C14685 c14686 = new C14685(this, enumC199913);
        c14686.m11458(enumC16696, enumC16696, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c14686.m11458(enumC16697, enumC16697, IShizukuService.Stub.TRANSACTION_attachUserService);
        c14686.m11458(enumC16698, enumC16698, 101);
        c14686.m11458(enumC16699, enumC16699, 100);
        c14686.m11458(enumC166910, enumC166910, 100);
        c14686.m11458(enumC166911, enumC166911, 100);
        c14686.m11458(enumC166912, enumC166912, 100);
        C22733 c22733 = new C22733(this, enumC199910);
        EnumC16696 enumC166913 = EnumC16696.BOOLEAN;
        c22733.m11458(enumC166913, enumC166913, 257);
        C14015 c14015 = new C14015(this, enumC199914);
        EnumC16696 enumC166914 = EnumC16696.OBJECT;
        c14015.m11458(enumC166914, enumC166914, 276);
        AbstractC5298[] abstractC5298Arr = {c23403, c23404, c23405, c14685, c14686, c22733, c14015};
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            AbstractC5298 abstractC5298 = abstractC5298Arr[i];
            AbstractC12224 abstractC12224 = abstractC5298.f51772;
            map.put(abstractC12224, ((C4848) C15525.getOrDefault(map, abstractC12224, C4848.m10283())).m10290(abstractC5298));
            i++;
        }
        C8651 c8651 = new C8651(this, enumC199929);
        EnumC16696 enumC166915 = EnumC16696.STRING;
        c8651.m36472(enumC166915, enumC166914, enumC166915, 256);
        c8651.m36472(enumC166914, enumC166915, enumC166915, 256);
        c8651.m36472(enumC166915, enumC166915, enumC166915, 256);
        c8651.m36472(enumC166915, enumC16699, enumC166915, 256);
        c8651.m36472(enumC166915, enumC16698, enumC166915, 256);
        c8651.m36472(enumC166915, enumC16697, enumC166915, 256);
        c8651.m36472(enumC166915, enumC16696, enumC166915, 256);
        c8651.m36472(enumC166915, enumC166913, enumC166915, 256);
        EnumC16696 enumC166916 = EnumC16696.BOT;
        c8651.m36472(enumC166915, enumC166916, enumC166915, 256);
        c8651.m36472(enumC16699, enumC166915, enumC166915, 256);
        c8651.m36472(enumC16698, enumC166915, enumC166915, 256);
        c8651.m36472(enumC16697, enumC166915, enumC166915, 256);
        c8651.m36472(enumC16696, enumC166915, enumC166915, 256);
        c8651.m36472(enumC166913, enumC166915, enumC166915, 256);
        c8651.m36472(enumC166916, enumC166915, enumC166915, 256);
        C18038 c18038 = new C18038(this, enumC199929);
        c18038.m36472(enumC16696, enumC16696, enumC16696, 99);
        c18038.m36472(enumC16697, enumC16697, enumC16697, 98);
        c18038.m36472(enumC16698, enumC16698, enumC16698, 97);
        c18038.m36472(enumC16699, enumC16699, enumC16699, 96);
        C18038 c18039 = new C18038(this, enumC199930);
        c18039.m36472(enumC16696, enumC16696, enumC16696, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c18039.m36472(enumC16697, enumC16697, enumC16697, IShizukuService.Stub.TRANSACTION_attachUserService);
        c18039.m36472(enumC16698, enumC16698, enumC16698, 101);
        c18039.m36472(enumC16699, enumC16699, enumC16699, 100);
        C18038 c180310 = new C18038(this, enumC199931);
        c180310.m36472(enumC16696, enumC16696, enumC16696, IShizukuService.Stub.TRANSACTION_updateFlagsForUid);
        c180310.m36472(enumC16697, enumC16697, enumC16697, IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        c180310.m36472(enumC16698, enumC16698, enumC16698, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        c180310.m36472(enumC16699, enumC16699, enumC16699, IShizukuService.Stub.TRANSACTION_isHidden);
        C18038 c180311 = new C18038(this, enumC199932);
        c180311.m36472(enumC16696, enumC16696, enumC16696, UMErrorCode.E_UM_BE_CREATE_FAILED);
        c180311.m36472(enumC16697, enumC16697, enumC16697, UMErrorCode.E_UM_BE_JSON_FAILED);
        c180311.m36472(enumC16698, enumC16698, enumC16698, 109);
        c180311.m36472(enumC16699, enumC16699, enumC16699, 108);
        C18038 c180312 = new C18038(this, enumC199933);
        c180312.m36472(enumC16696, enumC16696, enumC16696, 115);
        c180312.m36472(enumC16697, enumC16697, enumC16697, 114);
        c180312.m36472(enumC16698, enumC16698, enumC16698, UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        c180312.m36472(enumC16699, enumC16699, enumC16699, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C3957 c3957 = new C3957(this, enumC199925);
        c3957.m36472(enumC166913, enumC166913, enumC166913, 126);
        C18038 c180313 = new C18038(this, enumC199925, new C17280(3));
        c180313.m36472(enumC16698, enumC16698, enumC16698, 127);
        c180313.m36472(enumC16699, enumC16699, enumC16699, 126);
        C3957 c3958 = new C3957(this, enumC199923);
        c3958.m36472(enumC166913, enumC166913, enumC166913, 128);
        C18038 c180314 = new C18038(this, enumC199923, new C17280(3));
        c180314.m36472(enumC16698, enumC16698, enumC16698, 129);
        c180314.m36472(enumC16699, enumC16699, enumC16699, 128);
        C3957 c3959 = new C3957(this, enumC199924);
        c3959.m36472(enumC166913, enumC166913, enumC166913, 130);
        C18038 c180315 = new C18038(this, enumC199924, new C17280(3));
        c180315.m36472(enumC16698, enumC16698, enumC16698, 131);
        c180315.m36472(enumC16699, enumC16699, enumC16699, 130);
        C24744 c24744 = new C24744(this, enumC199926);
        c24744.m36472(enumC16699, enumC16699, enumC16699, UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
        c24744.m36472(enumC16699, enumC16698, enumC16699, BottomAppBarTopEdgeTreatment.ANGLE_UP);
        c24744.m36472(enumC16698, enumC16699, enumC16698, UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
        c24744.m36472(enumC16698, enumC16698, enumC16698, 271);
        C24744 c24745 = new C24744(this, enumC199927);
        c24745.m36472(enumC16699, enumC16699, enumC16699, 122);
        c24745.m36472(enumC16699, enumC16698, enumC16699, 272);
        c24745.m36472(enumC16698, enumC16699, enumC16698, 123);
        c24745.m36472(enumC16698, enumC16698, enumC16698, 273);
        C24744 c24746 = new C24744(this, enumC199928);
        c24746.m36472(enumC16699, enumC16699, enumC16699, 124);
        c24746.m36472(enumC16699, enumC16698, enumC16699, 274);
        c24746.m36472(enumC16698, enumC16699, enumC16698, C0254q.f1218h);
        c24746.m36472(enumC16698, enumC16698, enumC16698, C0791b.f3325g);
        C18038 c180316 = new C18038(this, enumC199919);
        c180316.m36472(enumC16696, enumC16696, enumC166913, 152, 155);
        c180316.m36472(enumC16697, enumC16697, enumC166913, 150, 155);
        c180316.m36472(enumC16698, enumC16698, enumC166913, 148, 155);
        c180316.m36472(enumC16699, enumC16699, enumC166913, 161);
        C18038 c180317 = new C18038(this, enumC199920);
        c180317.m36472(enumC16696, enumC16696, enumC166913, 151, 157);
        c180317.m36472(enumC16697, enumC16697, enumC166913, 149, 157);
        c180317.m36472(enumC16698, enumC16698, enumC166913, 148, 157);
        c180317.m36472(enumC16699, enumC16699, enumC166913, 163);
        C18038 c180318 = new C18038(this, enumC199921);
        c180318.m36472(enumC16696, enumC16696, enumC166913, 152, 158);
        c180318.m36472(enumC16697, enumC16697, enumC166913, 150, 158);
        c180318.m36472(enumC16698, enumC16698, enumC166913, 148, 158);
        c180318.m36472(enumC16699, enumC16699, enumC166913, 164);
        C18038 c180319 = new C18038(this, enumC199922);
        c180319.m36472(enumC16696, enumC16696, enumC166913, 151, 156);
        c180319.m36472(enumC16697, enumC16697, enumC166913, 149, 156);
        c180319.m36472(enumC16698, enumC16698, enumC166913, 148, 156);
        c180319.m36472(enumC16699, enumC16699, enumC166913, 162);
        C12675 c12675 = new C12675(this, enumC199917);
        c12675.m36472(enumC166914, enumC166914, enumC166913, 165);
        c12675.m36472(enumC166913, enumC166913, enumC166913, 159);
        c12675.m36472(enumC16696, enumC16696, enumC166913, 151, 153);
        c12675.m36472(enumC16697, enumC16697, enumC166913, 149, 153);
        c12675.m36472(enumC16698, enumC16698, enumC166913, 148, 153);
        c12675.m36472(enumC16699, enumC16699, enumC166913, 159);
        C12675 c12676 = new C12675(this, enumC199918);
        c12676.m36472(enumC166914, enumC166914, enumC166913, 166);
        c12676.m36472(enumC166913, enumC166913, enumC166913, DHParameters.DEFAULT_MINIMUM_LENGTH);
        c12676.m36472(enumC16696, enumC16696, enumC166913, 151, EnumC19222.f57460);
        c12676.m36472(enumC16697, enumC16697, enumC166913, 149, EnumC19222.f57460);
        c12676.m36472(enumC16698, enumC16698, enumC166913, 148, EnumC19222.f57460);
        c12676.m36472(enumC16699, enumC16699, enumC166913, DHParameters.DEFAULT_MINIMUM_LENGTH);
        C3957 c39510 = new C3957(this, enumC199916);
        c39510.m36472(enumC166913, enumC166913, enumC166913, 258);
        C3957 c39511 = new C3957(this, enumC199915);
        c39511.m36472(enumC166913, enumC166913, enumC166913, 259);
        AbstractC16026[] abstractC16026Arr = {c8651, c18038, c18039, c180310, c180311, c180312, c3957, c180313, c3958, c180314, c3959, c180315, c24744, c24745, c24746, c180316, c180317, c180318, c180319, c12675, c12676, c39510, c39511};
        for (int i3 = 0; i3 < 23; i3++) {
            AbstractC16026 abstractC16026 = abstractC16026Arr[i3];
            AbstractC12224 abstractC12225 = abstractC16026.f51772;
            map2.put(abstractC12225, ((C4848) C15525.getOrDefault(map2, abstractC12225, C4848.m10283())).m10290(abstractC16026));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m27499(AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462M19499 = this.f33480.m19499(abstractC6462);
        int i = C9496.f26006[abstractC6462M19499.mo5577().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? this.f33476.f69134 : abstractC6462M19499;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m27500(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C8374 c8374 = this.f33480;
        AbstractC6462 abstractC6462M19499 = c8374.m19499(abstractC6462);
        AbstractC6462 abstractC6462M194910 = c8374.m19499(abstractC6463);
        boolean zMo14778 = abstractC6462M19499.mo14778();
        C22004 c22004 = this.f33476;
        if (!zMo14778 || !abstractC6462M194910.mo14778()) {
            return c8374.m19490(abstractC6462M19499, abstractC6462M194910) ? abstractC6462M19499 : c22004.f69208;
        }
        EnumC11353 enumC11353 = EnumC11353.DOUBLE;
        if (abstractC6462M19499.m14777(enumC11353) || abstractC6462M194910.m14777(enumC11353)) {
            return c22004.f69181;
        }
        EnumC11353 enumC11354 = EnumC11353.FLOAT;
        if (abstractC6462M19499.m14777(enumC11354) || abstractC6462M194910.m14777(enumC11354)) {
            return c22004.f69165;
        }
        EnumC11353 enumC11355 = EnumC11353.LONG;
        if (abstractC6462M19499.m14777(enumC11355) || abstractC6462M194910.m14777(enumC11355)) {
            return c22004.f69152;
        }
        return c22004.f69134;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3088 m27497(final AbstractC14355 abstractC14355, final EnumC19998 enumC19998, final AbstractC6462 abstractC6462) {
        Predicate predicate = new Predicate() { // from class: l.ۤܰ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C20697.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m28096or(Predicate predicate2) {
                return C20697.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC5298) obj).test(abstractC6462);
            }
        };
        C9675 c9675 = new C9675(1, abstractC6462);
        return (C3088) C7480.stream((C4848) this.f33474.get(m27501(enumC19998))).filter(predicate).map(c9675).findFirst().orElseGet(new Supplier() { // from class: l.ۛܰ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f21524.m27487(abstractC14355, enumC19998, abstractC6462);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3088 m27496(final AbstractC3094 abstractC3094, final EnumC19998 enumC19998, final AbstractC6462 abstractC6462, final AbstractC6462 abstractC6463) {
        C12596 c12596 = new C12596(abstractC6462, abstractC6463);
        C17959 c17959 = new C17959(1, abstractC6462, abstractC6463);
        return (C3088) C7480.stream((C4848) this.f33473.get(m27501(enumC19998))).filter(c12596).map(c17959).findFirst().orElseGet(new Supplier() { // from class: l.ۨܰ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f38000.m27487(abstractC3094, enumC19998, abstractC6462, abstractC6463);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3088 m27490(final C12004 c12004, AbstractC12224 abstractC12224, C4848 c4848, EnumC16696 enumC16696, int[] iArr) {
        int i;
        C4848 c4849 = (C4848) C7480.stream(c4848).map(new Function() { // from class: l.۫ܰ֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((EnumC16696) obj).m37853(this.f40451.f33476);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        }).collect(C4848.m10284());
        C22004 c22004 = c12004.f33476;
        C12497 c12497 = new C12497(c4849, enumC16696.m37853(c22004), C4848.m10283(), c22004.f69163);
        int length = iArr.length;
        C1446.m31704(length == 1 || length == 2);
        if (length == 1) {
            i = iArr[0];
        } else {
            i = (iArr[0] << 9) | iArr[1];
        }
        return new C3088(abstractC12224, c12497, i, c22004.f69157);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C3088 m27487(InterfaceC5323 interfaceC5323, EnumC19998 enumC19998, AbstractC6462... abstractC6462Arr) {
        C14040 c14040;
        if (C18486.m42024of((Object[]) abstractC6462Arr).noneMatch(new C14860())) {
            AbstractC12224 abstractC12224M27501 = m27501(enumC19998);
            if (abstractC6462Arr.length == 1) {
                AbstractC6462 abstractC6462 = abstractC6462Arr[0];
                C14040 c14041 = C8300.f21997;
                c14040 = new C14040("compiler", "operator.cant.be.applied", abstractC12224M27501, abstractC6462);
            } else {
                AbstractC6462 abstractC6463 = abstractC6462Arr[0];
                AbstractC6462 abstractC6464 = abstractC6462Arr[1];
                C14040 c14042 = C8300.f21997;
                c14040 = new C14040("compiler", "operator.cant.be.applied.1", abstractC12224M27501, abstractC6463, abstractC6464);
            }
            this.f33475.m9352(interfaceC5323, c14040);
        }
        return this.f33479;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m27501(EnumC19998 enumC19998) {
        return this.f33478[enumC19998.m45373()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3088 m27498(C17130 c17130) {
        return (C3088) C7480.stream(this.f33473.values()).flatMap(new C7970(5)).map(new C24248(0, c17130)).distinct().filter(new C15530(0, this)).findFirst().get();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27494(EnumC19998 enumC19998, String str) {
        AbstractC14235 abstractC14235 = this.f33477.f21738;
        abstractC14235.getClass();
        char[] charArray = str.toCharArray();
        this.f33478[enumC19998.m45373()] = abstractC14235.mo17848(charArray, charArray.length);
    }
}
