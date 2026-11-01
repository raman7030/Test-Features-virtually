package p067l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C18107 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֡֫ */
    public static final ExecutorService f54055;

    /* JADX INFO: renamed from: ֨֫ */
    public static Object f54056;

    /* JADX INFO: renamed from: ۚ֫ */
    public static C10748 f54057;

    /* JADX INFO: renamed from: ۠֫ */
    public static final Bitmap f54058;

    /* JADX INFO: renamed from: ܶ֫ */
    public static boolean f54059;

    /* JADX INFO: renamed from: ᩺ۛ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f82262;

    /* JADX INFO: renamed from: ֫֫ */
    public final HashSet f54060;

    /* JADX INFO: renamed from: ۖ֫ */
    public List f54061;

    /* JADX INFO: renamed from: ۗ */
    public boolean f54062;

    /* JADX INFO: renamed from: ۘ֫ */
    public WeakReference f54063;

    /* JADX INFO: renamed from: ۙ */
    public HashSet f54064;

    /* JADX INFO: renamed from: ۛ */
    public List f54065;

    /* JADX INFO: renamed from: ۜ֫ */
    public String f54066;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C14084 f54068;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C17436 f54069;

    /* JADX INFO: renamed from: ۤ */
    public final C11403 f54070;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f54071;

    /* JADX INFO: renamed from: ۫ */
    public String f54073;

    /* JADX INFO: renamed from: ۬ */
    public final C10748 f54074;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f54075;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f54076;

    /* JADX INFO: renamed from: ܺ֫ */
    public AbstractC18422 f54077;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f54078;

    /* JADX INFO: renamed from: ܿ֫ */
    public List f54079;

    /* JADX INFO: renamed from: ᩳ֫ */
    public AbstractC3947 f54080;

    /* JADX INFO: renamed from: ᩴ֫ */
    public ArrayList f54081;

    /* JADX INFO: renamed from: ᩵֫ */
    public final C11245 f54082;

    /* JADX INFO: renamed from: ᩶ */
    public final C10748 f54083;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f54084;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f54085;

    /* JADX INFO: renamed from: ᩹ */
    public C18107 f54086;

    /* JADX INFO: renamed from: ᩻֫ */
    public String f54088;

    /* JADX INFO: renamed from: ۟ */
    public final C9705 f54067 = new C9705(this);

    /* JADX INFO: renamed from: ᩺ */
    public final HashSet f54087 = new HashSet();

    /* JADX INFO: renamed from: ۨ */
    public AtomicInteger f54072 = new AtomicInteger();

    @Override // android.widget.AdapterView.OnItemClickListener
    public native void onItemClick(AdapterView adapterView, View view, int i, long j);

    /* JADX INFO: renamed from: ۘ֫ */
    public native void m41244();

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41194(C18107 c18107, C4341 c4341, String str) {
        c18107.getClass();
        c18107.m41185(Integer.valueOf(c4341.f9711), str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m41205(C18107 c18107, C4341 c4341, String str) {
        c18107.getClass();
        c18107.m41185(Integer.valueOf(c4341.f9711), str);
    }

    public C18107(C11245 c11245, C11400 c11400, AbstractC18422 abstractC18422, boolean z, C14677 c14677) {
        List list = Collections.EMPTY_LIST;
        this.f54079 = list;
        this.f54065 = list;
        this.f54073 = "";
        this.f54063 = new WeakReference(null);
        this.f54061 = list;
        this.f54081 = new ArrayList();
        this.f54083 = C10748.m24759();
        this.f54074 = C10748.m24757();
        this.f54060 = new HashSet();
        this.f54082 = c11245;
        this.f54075 = z;
        this.f54077 = abstractC18422;
        this.f54068 = new C14084(this, c11400);
        C17436 c17436 = new C17436(this);
        this.f54069 = c17436;
        this.f54070 = new C11403(this);
        c17436.m39700(new C8460(this, c11245));
        c11400.setOnItemClickListener(this);
        c11400.setOnItemLongClickListener(this);
        c11400.m26365(new View.OnTouchListener() { // from class: l.᩷᩷ܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C18107.m41191(this.f70819, motionEvent);
                return false;
            }
        });
        if (c14677 != null) {
            final int i = c14677.readInt();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            int i2 = c14677.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                hashSet.add(c14677.m33593());
            }
            int i4 = c14677.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                hashSet2.add(c14677.m33593());
            }
            if (c14677.m33585()) {
                this.f54070.m26375(true);
                this.f54070.m26372(c14677.m33593());
                if (c11245.m26098() == z) {
                    this.f54082.m26102();
                }
            }
            final boolean zMo41741 = this.f54077.mo41741();
            m41197(false, new Runnable() { // from class: l.ۢ᩷ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C18107.m41190(this.f32677, i, hashSet, hashSet2, zMo41741);
                }
            }, false);
            return;
        }
        m41197(false, (Runnable) null, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41195(C18107 c18107, C11245 c11245) {
        if (c18107.f54085) {
            c11245.m26101();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41190(C18107 c18107, int i, HashSet hashSet, HashSet hashSet2, boolean z) {
        C14084 c14084 = c18107.f54068;
        c14084.m31984(i);
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC19370 interfaceC19370 : c18107.f54065) {
            if (hashSet.contains(interfaceC19370.getName())) {
                interfaceC19370.setChecked(true);
                z2 = true;
                z3 = true;
            }
            if (hashSet2.contains(z ? interfaceC19370.getPath() : interfaceC19370.getName())) {
                interfaceC19370.mo39142(true);
                z3 = true;
            }
        }
        if (z2) {
            c18107.f54069.m39705();
        }
        if (z3) {
            c14084.m31983();
        }
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final void m41281() {
        if (m41266()) {
            return;
        }
        m41197(true, (Runnable) null, false);
        if (m41261("local")) {
            C22290.m50109(this.f54082.m26082(), this.f54077.m41983());
        }
    }

    static {
        ApplicationC14266.m56479(C0254q.f1218h);
        f82262 = new short[]{4417, 3053, 3046, 3041, 2977, 3042, 3067, 2977, 3071, 3043, 3066, 3068, 9832, 3628, 3631, 3619, 3617, 3628, 524, 18178, 18249, 18252, 18265, 18252};
        f54055 = Executors.newFixedThreadPool(2);
        f54057 = C10748.m24756(500);
        f54058 = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_4444);
        f54059 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41197(boolean z, Runnable runnable, boolean z2) {
        if (this.f54076 && this.f54085) {
            this.f54082.m26077();
        }
        C7023 c7023 = new C7023(this, this.f54077, z, z2, runnable);
        c7023.m22241(f54055);
        c7023.m22250();
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final void m41283() {
        int i = 0;
        int i2 = 0;
        for (InterfaceC19370 interfaceC19370 : m41240()) {
            if (!interfaceC19370.mo39147()) {
                if (interfaceC19370.mo39135()) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Resources resourcesM16235 = C7050.m16235();
        sb.append(resourcesM16235.getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
        sb.append(EnumC2483.f3919);
        sb.append(resourcesM16235.getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2)));
        C17436 c17436 = this.f54069;
        if (c17436.m39714()) {
            sb.append(EnumC2483.f3919);
            sb.append(resourcesM16235.getString(R.string.MT_Protector, Integer.valueOf(c17436.m39711())));
        }
        this.f54073 = sb.toString();
        m41202();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m41187(List list, boolean z) {
        HashSet hashSet;
        HashSet hashSet2;
        C17436 c17436 = this.f54069;
        if (!c17436.m39714()) {
            hashSet = null;
        } else if (z) {
            hashSet = new HashSet();
            for (InterfaceC19370 interfaceC19370 : this.f54079) {
                if (interfaceC19370.isChecked()) {
                    hashSet.add(interfaceC19370.getPath());
                }
            }
        } else {
            c17436.m39697();
            hashSet = null;
        }
        final int iIncrementAndGet = this.f54072.incrementAndGet();
        C11403 c11403 = this.f54070;
        List listM26370 = (!c11403.m26377() || c11403.m26376().isEmpty()) ? list : C11403.m26370(c11403.m26376(), list);
        this.f54079 = list;
        this.f54065 = listM26370;
        if (this.f54078) {
            int size = list.size();
            int i = 0;
            int i2 = 0;
            final int i3 = -1;
            while (true) {
                hashSet2 = this.f54087;
                if (i >= size) {
                    break;
                }
                InterfaceC19370 interfaceC19371 = (InterfaceC19370) list.get(i);
                if (!interfaceC19371.mo39147()) {
                    if (hashSet2.contains(this.f54071 ? interfaceC19371.getPath() : interfaceC19371.getName())) {
                        i2++;
                        interfaceC19371.mo39142(true);
                        if (i3 == -1) {
                            i3 = i;
                        }
                    } else {
                        interfaceC19371.mo39142(false);
                    }
                }
                i++;
            }
            if (i2 > 0 && listM26370 != list) {
                int size2 = listM26370.size();
                int i4 = 0;
                int i5 = -1;
                for (int i6 = 0; i6 < size2; i6++) {
                    InterfaceC19370 interfaceC19372 = (InterfaceC19370) listM26370.get(i6);
                    if (!interfaceC19372.mo39147() && interfaceC19372.mo39149()) {
                        i4++;
                        if (i5 == -1) {
                            i5 = i6;
                        }
                    }
                }
                if (i2 == i4) {
                    i3 = i5;
                } else {
                    c11403.m26371();
                    this.f54065 = list;
                }
            }
            final boolean z2 = this.f54062;
            if (z2) {
                this.f54062 = false;
            }
            this.f54078 = false;
            hashSet2.clear();
            this.f54071 = false;
            if (i3 != -1) {
                C7050.m16212(new Runnable() { // from class: l.ܿ᩷ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18107.m41188(this.f56967, iIncrementAndGet, i3, z2);
                    }
                });
            }
        }
        if (hashSet != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC19370 interfaceC19373 = (InterfaceC19370) it.next();
                if (!interfaceC19373.mo39147()) {
                    interfaceC19373.setChecked(hashSet.contains(interfaceC19373.getPath()));
                }
            }
            c17436.m39705();
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC19370 interfaceC19374 = (InterfaceC19370) it2.next();
                if (!interfaceC19374.mo39147()) {
                    interfaceC19374.setChecked(false);
                }
            }
            if (c17436.m39714()) {
                c17436.m39697();
            }
        }
        m41283();
        c17436.m39707();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.֨᩷ܳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static void m41188(final C18107 c18107, final int i, int i2, boolean z) {
        if (i != c18107.f54072.get()) {
            return;
        }
        c18107.f54068.m31980(i2, (C3670) new BooleanSupplier() { // from class: l.֨᩷ܳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C18107.m41199(this.f7773, i);
            }
        });
        if (!z || c18107.f54069.m39714()) {
            return;
        }
        new RunnableC5682(c18107, i, i2).run();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m41199(C18107 c18107, int i) {
        return i == c18107.f54072.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41228(List list) {
        this.f54072.incrementAndGet();
        this.f54065 = list;
        m41283();
        this.f54069.m39707();
    }

    /* JADX INFO: renamed from: ۖ */
    public final List m41240() {
        if (!m41183()) {
            return C19336.f57728;
        }
        return C21562.unmodifiableList(this.f54065);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 m41220(int i) {
        return (InterfaceC19370) this.f54065.get(i);
    }

    /* JADX INFO: renamed from: ֡֫ */
    public static boolean m41183() {
        File parentFile = null;
        String name = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 818721515;
        int i6 = C1025.f81947;
        int i7 = C0877.f81843;
        int iM55979 = (C0946.m55979("ۙۛ") + i7) * 43;
        int i8 = ((iM55979 ^ i6) * 23581) ^ (-584967174);
        int i9 = -1413495714;
        while (true) {
            i5 = ((((i5 ^ i6) * 18057) >> 31) & i8) ^ (iM55979 ^ i9);
            switch (i5) {
                case -2138980975:
                case 774816252:
                    if ((s * s2) - i2 > 0) {
                        iM55979 = C0873.m55680("ۙۗ") ^ i6;
                        i8 = ((iM55979 ^ i7) * 26443) ^ (-1402087231);
                        i9 = -2122740290;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩸") ^ i7;
                        i8 = ((iM55979 ^ i6) * 12919) ^ (-431070706);
                        i9 = 149399882;
                    }
                    break;
                case -2053929690:
                case -1743233955:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0873.m55680("۠᩵") + i6) * 57;
                        i8 = ((iM55979 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        iM55979 = (C0873.m55680("᩺ܳ") + i7) * 3;
                        i8 = ((iM55979 ^ i6) * (-17611)) ^ 898351359;
                        i9 = 1217679234;
                    }
                    break;
                case -2035786326:
                case 1300958383:
                    i3 = 2959;
                    iM55979 = (C0946.m55979("ܿܳ") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((iM55979 ^ i7) * 5315) ^ 1040558890;
                    i9 = -1954643752;
                    break;
                case -2033471971:
                case -1179791074:
                    C1053.m56327();
                    C1003.m56123();
                    iM55979 = (C0946.m55979("ۚۨ") ^ i6) * (-67);
                    i8 = ((iM55979 ^ i7) * (-15547)) ^ (-131477328);
                    i9 = -318690128;
                    break;
                case -1942021513:
                case 975396555:
                    parentFile = C7050.m16219().getParentFile();
                    if (parentFile != null) {
                        iM55979 = C0873.m55680("۫ܳ") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-24103)) ^ 1072322134;
                        i9 = 750882296;
                    } else {
                        iM55979 = (C0946.m55979("ۤᩳ") + i7) * (-37);
                        i8 = ((iM55979 ^ i6) * (-241)) ^ (-112057334);
                        i9 = -663068256;
                    }
                    break;
                case -1549573168:
                case 970079239:
                    i2 = i * i;
                    s2 = 51656;
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("۠᩵") + i6) * 57;
                        i8 = ((iM55979 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩶") ^ i6) * (-55);
                        i8 = ((iM55979 ^ i7) * (-6979)) ^ 1609927557;
                        i9 = -160195196;
                    }
                    break;
                case -1489637072:
                case -1469381261:
                    C1053.m56327();
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0946.m55979("᩺ۛ") + i7) * 69;
                        i8 = ((iM55979 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    } else {
                        iM55979 = (C0946.m55979("۟ᩳ") + i7) * (-115);
                        i8 = ((iM55979 ^ i6) * 6599) ^ (-785052589);
                        i9 = -1415159101;
                    }
                    break;
                case -1452586954:
                case 1979619149:
                    i3 = 12404;
                    iM55979 = (C0946.m55979("ܿܳ") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((iM55979 ^ i7) * 5315) ^ 1040558890;
                    i9 = -1954643752;
                    break;
                case -1159950232:
                case 906727427:
                    return true;
                case -1157237687:
                case 1034884478:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("۠᩵") + i6) * 57;
                        i8 = ((iM55979 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        iM55979 = C0873.m55680("ۚ֫") ^ i7;
                        i8 = ((iM55979 ^ i6) * 7243) ^ (-985206384);
                        i9 = 198985002;
                    }
                    break;
                case -1038568535:
                case 1288828363:
                    sArr = f82262;
                    c = 0;
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0946.m55979("᩺ۛ") + i7) * 69;
                        i8 = ((iM55979 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    } else {
                        iM55979 = (C0873.m55680("ۢ۬") ^ i7) * (-103);
                        i8 = ((iM55979 ^ i6) * (-20817)) ^ (-1126349901);
                        i9 = 1474096096;
                    }
                    break;
                case -769542256:
                case -523169793:
                    i = s + 12914;
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i7 - C0873.m55680("ᩳ۫")) * (-99);
                        i8 = ((iM55979 ^ i6) * (-19983)) ^ (-207077991);
                        i9 = -874856819;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۛ") ^ i7) * (-13);
                        i8 = ((iM55979 ^ i6) * (-17793)) ^ 1181526743;
                        i9 = 1702963517;
                    }
                    break;
                case -666463811:
                case 1050574707:
                    name = parentFile.getName();
                    sArr2 = f82262;
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("ۚۨ") ^ i6) * (-67);
                        i8 = ((iM55979 ^ i7) * (-15547)) ^ (-131477328);
                        i9 = -318690128;
                    } else {
                        iM55979 = C0946.m55979("ۚۘ") ^ i7;
                        i8 = ((iM55979 ^ i6) * (-11279)) ^ 17480779;
                        i9 = -1148580990;
                    }
                    break;
                case -496808512:
                case -9251580:
                    s = sArr[c];
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("۟ᩳ") + i7) * (-115);
                        i8 = ((iM55979 ^ i6) * 6599) ^ (-785052589);
                        i9 = -1415159101;
                    } else {
                        iM55979 = C0873.m55680("֨۬") ^ i6;
                        i8 = ((iM55979 ^ i7) * (-31145)) ^ 119879747;
                        i9 = 341211222;
                    }
                    break;
                case -365176545:
                case 1301086178:
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("۠۬") ^ i6;
                        i8 = ((iM55979 ^ i7) * 8217) ^ 1350073355;
                        i9 = -1467620839;
                    } else {
                        iM55979 = (C0873.m55680("۠᩵") + i6) * 57;
                        i8 = ((iM55979 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    }
                    break;
                case -307942425:
                case 1793636773:
                    C0861.m55626();
                    return false;
                case -218971025:
                case 1543700472:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("᩺ۛ") + i7) * 69;
                        i8 = ((iM55979 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    } else {
                        iM55979 = (i6 - C0946.m55979("᩶ۡ")) * (-25);
                        i8 = ((iM55979 ^ i7) * (-9275)) ^ (-1034554968);
                        i9 = -1542773945;
                    }
                    break;
                case 335376709:
                case 954656561:
                    if (C0906.m55806(name, C0892.m55750(sArr2, i4, 11, i3))) {
                        iM55979 = C0873.m55680("ۖ᩷") ^ i6;
                        i8 = ((iM55979 ^ i7) * 16067) ^ (-1884361960);
                        i9 = -1030963313;
                    } else {
                        iM55979 = (C0946.m55979("ۤᩳ") + i7) * (-37);
                        i8 = ((iM55979 ^ i6) * (-241)) ^ (-112057334);
                        i9 = -663068256;
                    }
                    break;
                case 400273081:
                case 863114972:
                    if (!C0892.f81851) {
                        iM55979 = (C0873.m55680("۠᩵") + i6) * 57;
                        i8 = ((iM55979 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۛ") + i7) * 69;
                        i8 = ((iM55979 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    }
                    break;
                case 690382159:
                case 1020134073:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("۟ᩳ") + i7) * (-115);
                        i8 = ((iM55979 ^ i6) * 6599) ^ (-785052589);
                        i9 = -1415159101;
                    } else {
                        iM55979 = (C0946.m55979("ۚۨ") ^ i6) * (-67);
                        i8 = ((iM55979 ^ i7) * (-15547)) ^ (-131477328);
                        i9 = -318690128;
                    }
                    break;
                case 902154913:
                case 1525415172:
                    i4 = 1;
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0946.m55979("ۚۨ") ^ i6) * (-67);
                        i8 = ((iM55979 ^ i7) * (-15547)) ^ (-131477328);
                        i9 = -318690128;
                    } else {
                        iM55979 = (i7 - C0946.m55979("֫ܺ")) * 41;
                        i8 = ((iM55979 ^ i6) * (-8671)) ^ (-1920253337);
                        i9 = -646933733;
                    }
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final List m41254() {
        return C21562.unmodifiableList(this.f54079);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41232(C18107 c18107) {
        this.f54086 = c18107;
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC18422 m41270() {
        return this.f54077;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m41274() {
        AbstractC18422 abstractC18422 = this.f54077;
        return abstractC18422.f55048.m29883() || abstractC18422.m41973() != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m41280() {
        return this.f54077.f55048.m29885();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC15599 m41289() {
        return this.f54077.mo8217();
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m41264() {
        return this.f54077.mo41741();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41273(AbstractC18422 abstractC18422) {
        AbstractC18422 abstractC18423 = this.f54077;
        abstractC18423.f55048.f36716.put(abstractC18423.m41982(), Integer.valueOf(this.f54068.m31976()));
        this.f54077 = abstractC18422;
        m41184();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41229(C7367 c7367) {
        this.f54063 = new WeakReference(c7367);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41260(AbstractC18422 abstractC18422) {
        m41273(abstractC18422);
        if (abstractC18422 != this.f54063.get()) {
            m41197(false, (Runnable) new RunnableC17751(0, this), true);
        } else {
            this.f54063.clear();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41204(C18107 c18107) {
        AbstractC18422 abstractC18422 = c18107.f54077;
        Integer num = (Integer) abstractC18422.f55048.f36716.getOrDefault(abstractC18422.m41982(), null);
        c18107.f54068.m31984(num == null ? 0 : num.intValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41236(InterfaceC19764 interfaceC19764, Runnable runnable) {
        C11245 c11245 = this.f54082;
        c11245.getClass();
        C15937 c15937 = new C15937(c11245, this, interfaceC19764, runnable);
        c15937.m22241(f54055);
        c15937.m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41235(InterfaceC19764 interfaceC19764) {
        C11245 c11245 = this.f54082;
        c11245.getClass();
        C15937 c15937 = new C15937(c11245, this, interfaceC19764, null);
        c15937.m22241(f54055);
        c15937.m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41231(AbstractC17043 abstractC17043) {
        this.f54086 = this.f54086;
        m41267();
        this.f54086.m41267();
        AbstractC17043 abstractC17043M38672 = abstractC17043.m38672();
        if (m41261("local") && C18524.m42109(this.f54077.m41982(), new String[0]).equals(abstractC17043M38672)) {
            m41279(abstractC17043.getName());
            return;
        }
        this.f54086.m41279(abstractC17043.getName());
        if (this.f54086.m41261("local") && C18524.m42109(this.f54086.f54077.m41982(), new String[0]).equals(abstractC17043M38672)) {
            return;
        }
        this.f54086.m41259(abstractC17043M38672.mo25505(), true);
    }

    /* JADX INFO: renamed from: ۡ */
    public final C18107 m41252() {
        return this.f54086;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܽ */
    public final void m41272(String str) {
        C18107 c18107 = this.f54086;
        String strM41972 = AbstractC18422.m41972(str);
        AbstractC18422 abstractC18422 = this.f54077;
        if (!(abstractC18422 instanceof C18310 ? abstractC18422.m41982().equals(strM41972) : false)) {
            c18107.getClass();
            String strM41973 = AbstractC18422.m41972(str);
            AbstractC18422 abstractC18423 = c18107.f54077;
            if (abstractC18423 instanceof C18310 ? abstractC18423.m41982().equals(strM41973) : false) {
                c18107.m41268();
                HashSet hashSet = this.f54087;
                if (!hashSet.isEmpty()) {
                    c18107.m41203(hashSet, this.f54071);
                    if (this.f54062) {
                        c18107.f54062 = true;
                        this.f54062 = false;
                    }
                    hashSet.clear();
                    this.f54071 = false;
                }
                c18107.m41259(str, true);
                return;
            }
        }
        m41259(str, true);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m41284() {
        return this.f54077.m41982();
    }

    /* JADX INFO: renamed from: ۚ */
    public final String m41246() {
        return this.f54077.m41983();
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m41216() {
        if (this.f54077.mo41741()) {
            return C7050.m16224(R.string.MT_Protector);
        }
        String strM41982 = this.f54077.m41982();
        if (strM41982.length() == 1) {
            return strM41982;
        }
        int iLastIndexOf = strM41982.lastIndexOf(47, strM41982.length() - 2);
        return iLastIndexOf != -1 ? C17073.m38720(1, iLastIndexOf + 1, strM41982) : C17073.m38720(1, 0, strM41982);
    }

    /* JADX INFO: renamed from: ֨ */
    public final String m41217() {
        return this.f54077.mo41743();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41237(boolean z) {
        this.f54085 = z;
        m41202();
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m41247() {
        return this.f54085;
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m41266() {
        boolean z;
        synchronized (this.f54060) {
            z = !this.f54060.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠֫ */
    public void m41202() {
        if (this.f54085) {
            String strMo8206 = this.f54077.mo8206();
            C11245 c11245 = this.f54082;
            c11245.m26084(strMo8206);
            if (!this.f54076 || TextUtils.isEmpty(this.f54088)) {
                String strMo37383 = this.f54077.mo37383(this);
                if (strMo37383 != null) {
                    c11245.m26065((CharSequence) C24420.m53894(new StringBuilder(), this.f54073, EnumC2483.f3919, strMo37383));
                } else {
                    c11245.m26065((CharSequence) this.f54073);
                }
            } else {
                c11245.m26065((CharSequence) this.f54088);
            }
            c11245.m26101();
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final String m41285() {
        return this.f54077.mo8206();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41223(SubMenu subMenu) {
        if (m41266()) {
            return;
        }
        if (this.f54076) {
            this.f54061 = Collections.singletonList(AbstractC18422.f55044);
        } else {
            this.f54061 = this.f54077.mo8207();
        }
        ArrayList arrayList = this.f54081;
        arrayList.clear();
        int size = this.f54061.size();
        for (int i = 0; i < size; i++) {
            AbstractC11994 abstractC11994 = (AbstractC11994) this.f54061.get(i);
            if (abstractC11994.mo11888()) {
                List<AbstractC11994> listM27426 = abstractC11994.m27426();
                if (listM27426.isEmpty()) {
                    MenuItem icon = subMenu.add(0, i | 2113929216, 0, abstractC11994.m27427()).setIcon(abstractC11994.m27424());
                    if (abstractC11994.mo27429()) {
                        icon.setCheckable(true).setChecked(abstractC11994.mo27428());
                    }
                    if (!abstractC11994.mo21944(this)) {
                        icon.setEnabled(false);
                    }
                } else {
                    SubMenu icon2 = subMenu.addSubMenu(0, i | 2113929216, 0, abstractC11994.m27427()).setIcon(abstractC11994.m27424());
                    if (!abstractC11994.mo21944(this)) {
                        icon2.getItem().setEnabled(false);
                    }
                    for (AbstractC11994 abstractC11995 : listM27426) {
                        int size2 = arrayList.size();
                        arrayList.add(abstractC11995);
                        MenuItem icon3 = icon2.add(0, size2 | 2097152000, 0, abstractC11995.m27427()).setIcon(abstractC11995.m27424());
                        if (abstractC11995.mo27429()) {
                            icon3.setCheckable(true).setChecked(abstractC11995.mo27428());
                        }
                        if (!abstractC11995.mo21944(this)) {
                            icon3.setEnabled(false);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41258(int i) {
        int i2 = i >>> 24;
        int i3 = i & 16777215;
        if (i2 == 126) {
            if (i3 < this.f54061.size()) {
                ((AbstractC11994) this.f54061.get(i3)).mo7575(this);
            }
        } else if (i2 == 125) {
            ArrayList arrayList = this.f54081;
            if (i3 < arrayList.size()) {
                ((AbstractC11994) arrayList.get(i3)).mo7575(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41259(String str, boolean z) {
        AbstractC18422 abstractC18422;
        if (m41266()) {
            RunnableC2999 runnableC2999 = new RunnableC2999(this, this.f54078, this.f54062, this.f54071, new ArrayList(this.f54087), str, z);
            if (m41266()) {
                C7050.m16213(new RunnableC10376(0, this, runnableC2999), 100L);
                return;
            } else {
                runnableC2999.run();
                return;
            }
        }
        if (z) {
            AbstractC18422 abstractC18423 = this.f54077;
            if (abstractC18423 instanceof C18310) {
                m41208(str);
                return;
            }
            int iM41973 = abstractC18423.m41973();
            C13746<AbstractC18422> c13746M26103 = this.f54082.m26103();
            c13746M26103.m31299();
            AbstractC18422 abstractC18424 = null;
            if (iM41973 != 0) {
                try {
                    abstractC18422 = null;
                    for (AbstractC18422 abstractC18425 : c13746M26103) {
                        if (abstractC18425.m41987() == iM41973 && (abstractC18425 instanceof C18310)) {
                            abstractC18424 = abstractC18425;
                            break;
                        } else if (abstractC18422 == null && (abstractC18425 instanceof C18310)) {
                            abstractC18422 = abstractC18425;
                        }
                    }
                } catch (Throwable th) {
                    c13746M26103.m31298();
                    throw th;
                }
            } else {
                abstractC18422 = null;
            }
            if (abstractC18424 == null) {
                if (abstractC18422 == null) {
                    throw new RuntimeException();
                }
                abstractC18424 = abstractC18422;
            }
            c13746M26103.remove(abstractC18424);
            if (abstractC18423.mo37384()) {
                c13746M26103.add(abstractC18423);
                abstractC18423.f55048.f36716.put(abstractC18423.m41982(), Integer.valueOf(this.f54068.m31976()));
            } else {
                if (abstractC18423.m41973() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC18423.m41985();
            }
            c13746M26103.m31298();
            this.f54077 = abstractC18424;
            abstractC18424.mo8215(this);
            m41184();
            m41208(str);
            C8009.m18592();
            return;
        }
        m41208(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41196(C18107 c18107, boolean z, boolean z2, boolean z3, ArrayList arrayList, String str, boolean z4) {
        c18107.f54078 = z;
        c18107.f54062 = z2;
        c18107.f54071 = z3;
        HashSet hashSet = c18107.f54087;
        hashSet.clear();
        hashSet.addAll(arrayList);
        c18107.m41259(str, z4);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m41208(String str) {
        String strM41972 = AbstractC18422.m41972(str);
        if (!this.f54077.m41982().equals(strM41972)) {
            AbstractC18422 abstractC18422 = this.f54077;
            abstractC18422.f55048.f36716.put(abstractC18422.m41982(), Integer.valueOf(this.f54068.m31976()));
            this.f54077.f55048.m29887(m41200());
            this.f54077.mo37385(strM41972);
        }
        C11403 c11403 = this.f54070;
        boolean zM26377 = c11403.m26377();
        C11245 c11245 = this.f54082;
        if (zM26377) {
            c11403.m26371();
            c11245.m26076();
        }
        m41197(false, this.f54078 ? null : new Runnable() { // from class: l.ܳ᩷ܳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f48231.f54068.m31984(0);
            }
        }, true);
        if (m41261("local")) {
            C22290.m50109(c11245.m26082(), this.f54077.m41983());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41191(C18107 c18107, MotionEvent motionEvent) {
        if (!f54059 && motionEvent.getActionMasked() == 0 && c18107.f54082.m26082().m12281()) {
            f54059 = true;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM9966;
        InterfaceC19370 interfaceC19370;
        InterfaceC19370 interfaceC19371;
        if (!m41266() && !this.f54076 && i <= this.f54065.size()) {
            this.f54084 = i;
            if (!((InterfaceC19370) this.f54065.get(i)).mo39147()) {
                final int i2 = this.f54072.get();
                final C4697 c4697 = new C4697(this);
                AbstractC18422 abstractC18422 = this.f54077;
                abstractC18422.getClass();
                C15838 c15838 = null;
                if (!c4697.m9964("trash") && c4697.m9972() && (iM9966 = c4697.m9966()) <= 2) {
                    if (iM9966 == 2) {
                        List listM9957 = c4697.m9957();
                        interfaceC19370 = (InterfaceC19370) listM9957.get(0);
                        interfaceC19371 = (InterfaceC19370) listM9957.get(1);
                    } else {
                        C18107 c18107M9967 = c4697.m9967();
                        if (!c18107M9967.m41261("trash") && c18107M9967.f54069.m39714() && c18107M9967.m41269() == 1) {
                            InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
                            InterfaceC19370 interfaceC19370M41251 = c18107M9967.m41251();
                            interfaceC19370 = interfaceC19370M9961;
                            interfaceC19371 = interfaceC19370M41251;
                        }
                    }
                    if (interfaceC19370.isDirectory() && interfaceC19371.isDirectory()) {
                        c15838 = new C15838(-1L, -1L, "folder", "folder");
                    } else if (interfaceC19370.mo39135() && interfaceC19371.mo39135()) {
                        String lowerCase = interfaceC19370.getName().toLowerCase();
                        String lowerCase2 = interfaceC19371.getName().toLowerCase();
                        if (lowerCase.endsWith(".bak")) {
                            lowerCase = C17073.m38720(4, 0, lowerCase);
                        }
                        if (lowerCase2.endsWith(".bak")) {
                            lowerCase2 = C17073.m38720(4, 0, lowerCase2);
                        }
                        String strM38645 = AbstractC17043.m38645(lowerCase);
                        String strM38646 = AbstractC17043.m38645(lowerCase2);
                        if (!strM38645.isEmpty()) {
                            strM38645 = strM38645.substring(1);
                        }
                        String str = strM38645;
                        if (!strM38646.isEmpty()) {
                            strM38646 = strM38646.substring(1);
                        }
                        c15838 = new C15838(interfaceC19370.getSize(), interfaceC19371.getSize(), str, strM38646);
                    }
                }
                abstractC18422.f55046 = c15838;
                final ArrayList arrayList = new ArrayList(10);
                for (int i3 : DialogInterfaceOnDismissListenerC16634.m37699()) {
                    switch (i3) {
                        case 0:
                            arrayList.add(abstractC18422.mo41739(c4697));
                            break;
                        case 1:
                            arrayList.add(abstractC18422.mo17068(c4697));
                            break;
                        case 2:
                            arrayList.add(abstractC18422.mo17062());
                            break;
                        case 3:
                            arrayList.add(abstractC18422.mo17075());
                            break;
                        case 4:
                            arrayList.add(abstractC18422.mo17072());
                            break;
                        case 5:
                            arrayList.add(abstractC18422.mo41740());
                            break;
                        case 6:
                            arrayList.add(abstractC18422.mo8205());
                            break;
                        case 7:
                            arrayList.add(abstractC18422.mo37386());
                            break;
                        case 8:
                            arrayList.add(abstractC18422.mo37382());
                            break;
                        case 9:
                            arrayList.add(abstractC18422.mo17067());
                            break;
                    }
                }
                abstractC18422.mo28979(c4697, arrayList);
                if (!arrayList.isEmpty()) {
                    Main mainM26082 = this.f54082.m26082();
                    if (f54059 || !mainM26082.m12281()) {
                        ViewOnClickListenerC22974 viewOnClickListenerC22974 = new ViewOnClickListenerC22974(mainM26082, mainM26082.m124());
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC3947 abstractC3947 = (AbstractC3947) arrayList.get(i4);
                            String strM16224 = C7050.m16224(abstractC3947.m7840());
                            if (abstractC3947.m7839()) {
                                strM16224 = this.f54075 ? strM16224.concat(" ->") : "<- ".concat(strM16224);
                            }
                            viewOnClickListenerC22974.m51305(strM16224, i4, abstractC3947.m7837(), abstractC3947.m7835(c4697), abstractC3947.m7838(c4697));
                        }
                        viewOnClickListenerC22974.m51307(new InterfaceC16937() { // from class: l.ۖ᩷ܳ
                            @Override // p067l.InterfaceC16937
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo10648(int i5) {
                                C18107.m41189(this.f11454, i2, arrayList, c4697, i5);
                            }
                        });
                        viewOnClickListenerC22974.m51306(new C6353(this, i2, arrayList, c4697));
                        viewOnClickListenerC22974.m51303();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41189(C18107 c18107, int i, ArrayList arrayList, C4697 c4697, int i2) {
        if (i == c18107.f54072.get()) {
            ((AbstractC3947) arrayList.get(i2)).m7836(c4697, false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m41207(C18107 c18107, int i, ArrayList arrayList, C4697 c4697, int i2) {
        if (i == c18107.f54072.get()) {
            return ((AbstractC3947) arrayList.get(i2)).m7836(c4697, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41238() {
        final String strM41982;
        final String strM26416;
        if (!m41266()) {
            if (this.f54069.m39714()) {
                m41267();
                return true;
            }
            C11403 c11403 = this.f54070;
            boolean zM26377 = c11403.m26377();
            C11245 c11245 = this.f54082;
            if (zM26377) {
                c11403.m26375(false);
                c11245.m26076();
                return true;
            }
            if (this.f54077.mo41741()) {
                strM26416 = this.f54077.mo41744();
                strM41982 = null;
            } else {
                strM41982 = this.f54077.m41982();
                strM26416 = C11419.m26416(strM41982);
            }
            if (strM26416 == null) {
                if (this.f54077.m41973() == 0) {
                    return false;
                }
                AbstractC18422 abstractC18422 = this.f54077;
                abstractC18422.getClass();
                if (abstractC18422 instanceof C7367) {
                    if (this.f54074.m24761()) {
                        C22682.m50793(this.f54077.mo17069());
                        return true;
                    }
                    C22682.m50801();
                }
                this.f54068.m31981(this.f54077.m41981());
                c11245.m26068(this);
                return true;
            }
            if (!this.f54083.m24763()) {
                this.f54077.f55048.m29887(m41200());
                this.f54077.mo37385(strM26416);
                c11403.m26371();
                m41197(false, new Runnable() { // from class: l.ۚ᩷ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18107.m41192(this.f20190, strM26416, strM41982);
                    }
                }, true);
                if (m41261("local")) {
                    C22290.m50109(c11245.m26082(), this.f54077.m41983());
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41192(C18107 c18107, String str, String str2) {
        c18107.m41185((Integer) c18107.f54077.f55048.f36716.getOrDefault(str, null), str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41257() {
        if (m41266() || !m41274()) {
            return;
        }
        if (!this.f54077.f55048.m29883()) {
            AbstractC18422 abstractC18422 = this.f54077;
            abstractC18422.getClass();
            if (abstractC18422 instanceof C7367) {
                if (this.f54074.m24761()) {
                    C22682.m50793(this.f54077.mo17069());
                    return;
                }
                C22682.m50801();
            }
            this.f54068.m31981(this.f54077.m41981());
            this.f54082.m26068(this);
            return;
        }
        C4341 c4341M29880 = this.f54077.f55048.m29880(m41200());
        String strM41982 = this.f54077.m41982();
        this.f54077.mo37385(c4341M29880.f9710);
        String strM41983 = this.f54077.m41982();
        if (!strM41983.startsWith("//SEARCH//") && (strM41982.startsWith("//SEARCH//") || strM41982.length() <= strM41983.length() || !strM41983.equals(C11419.m26416(strM41982)))) {
            strM41982 = null;
        }
        this.f54070.m26374(c4341M29880);
        m41197(false, (Runnable) new RunnableC9035(this, c4341M29880, strM41982), true);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m41286() {
        if (!m41266() && m41280() && this.f54077.f55048.m29885()) {
            final C4341 c4341M29884 = this.f54077.f55048.m29884(m41200());
            final String strM41982 = this.f54077.m41982();
            this.f54077.mo37385(c4341M29884.f9710);
            String strM41983 = this.f54077.m41982();
            if (strM41982.startsWith("//SEARCH//") || strM41983.startsWith("//SEARCH//") || strM41982.length() <= strM41983.length() || !strM41983.equals(C11419.m26416(strM41982))) {
                strM41982 = null;
            }
            this.f54070.m26374(c4341M29884);
            m41197(false, new Runnable() { // from class: l.ۡ᩷ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C18107.m41205(this.f30599, c4341M29884, strM41982);
                }
            }, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.᩻᩷ܳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    private void m41185(Integer num, String str) {
        int iIntValue = num == null ? 0 : num.intValue();
        C14084 c14084 = this.f54068;
        if (str != null) {
            if (str.endsWith("/")) {
                str = C17073.m38720(1, 0, str);
            }
            for (int i = 0; i < this.f54065.size(); i++) {
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f54065.get(i);
                if (interfaceC19370.isDirectory() && interfaceC19370.getPath().equals(str)) {
                    final int i2 = this.f54072.get();
                    c14084.m31977(iIntValue, i, str, (C25128) new BooleanSupplier() { // from class: l.᩻᩷ܳ
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            return C18107.m41206(this.f80413, i2);
                        }
                    });
                    return;
                }
            }
        }
        c14084.m31984(iIntValue);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m41206(C18107 c18107, int i) {
        return i == c18107.f54072.get();
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final void m41292() {
        if (m41266() || this.f54076) {
            return;
        }
        this.f54069.m39716();
        this.f54068.m31987();
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final void m41287() {
        if (m41266() || this.f54076) {
            return;
        }
        C17436 c17436 = this.f54069;
        if (c17436.m39714()) {
            c17436.m39704();
            this.f54068.m31987();
        }
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final void m41255() {
        if (m41266() || this.f54076) {
            return;
        }
        C17436 c17436 = this.f54069;
        if (c17436.m39714()) {
            c17436.m39715();
            this.f54068.m31987();
        }
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final void m41249() {
        if (!m41266() && this.f54069.m39714()) {
            new C7300(this.f54082.m26082(), new C15069(this)).m16862();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m41267() {
        if (m41266()) {
            return;
        }
        C17436 c17436 = this.f54069;
        if (c17436.m39714()) {
            c17436.m39697();
            this.f54068.m31987();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41233(AbstractC18422 abstractC18422) {
        this.f54082.m26070(this, abstractC18422);
    }

    /* JADX INFO: renamed from: ۗ */
    public final C11245 m41242() {
        return this.f54082;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    private C4341 m41200() {
        String strM41982 = this.f54077.m41982();
        int iM31976 = this.f54068.m31976();
        C11403 c11403 = this.f54070;
        return new C4341(strM41982, iM31976, c11403.m26376(), c11403.m26377());
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41261(String str) {
        return str.equals(this.f54077.mo8204());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41224(String str) {
        if (C12826.equals(str, this.f54077.mo8204())) {
            return;
        }
        StringBuilder sbM11879 = C5410.m11879("Expected type: ", str, ", got: ");
        sbM11879.append(this.f54077.mo8204());
        throw new RuntimeException(sbM11879.toString());
    }

    /* JADX INFO: renamed from: ᩴ */
    public final Main m41282() {
        return this.f54082.m26082();
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m41256() {
        return this.f54069.m39714();
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m41269() {
        C17436 c17436 = this.f54069;
        if (!c17436.m39714()) {
            return 1;
        }
        if (this.f54070.m26377()) {
            Iterator it = this.f54065.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((InterfaceC19370) it.next()).isChecked()) {
                    i++;
                }
            }
            return i;
        }
        return Math.max(1, c17436.m39711());
    }

    /* JADX INFO: renamed from: ۠ */
    public final InterfaceC19370 m41251() {
        if (m41269() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC19370) m41288().get(0);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final List m41288() {
        C17436 c17436 = this.f54069;
        if (c17436.m39714() && c17436.m39711() > 0) {
            ArrayList arrayList = new ArrayList(c17436.m39711());
            for (InterfaceC19370 interfaceC19370 : this.f54065) {
                if (interfaceC19370.isChecked()) {
                    arrayList.add(interfaceC19370);
                }
            }
            return C21562.unmodifiableList(arrayList);
        }
        return Collections.singletonList((InterfaceC19370) this.f54065.get(this.f54084));
    }

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC19370 m41243() {
        return (InterfaceC19370) this.f54065.get(this.f54084);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41221(int i, String str, String str2, ArrayList arrayList) {
        this.f54068.m31979(i, str, str2, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41227(Collection collection, boolean z) {
        C17436 c17436;
        List listM41240 = m41240();
        int i = 0;
        int i2 = -1;
        while (true) {
            int size = listM41240.size();
            c17436 = this.f54069;
            if (i >= size) {
                break;
            }
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM41240.get(i);
            if (!interfaceC19370.mo39147()) {
                if (!c17436.m39714()) {
                    c17436.m39706();
                }
                boolean zContains = collection.contains(interfaceC19370.getPath());
                c17436.m39702(interfaceC19370, zContains);
                if (zContains && z && i2 == -1) {
                    i2 = i;
                }
            }
            i++;
        }
        if (c17436.m39714() && !c17436.m39713()) {
            c17436.m39697();
        }
        C14084 c14084 = this.f54068;
        c14084.m31987();
        if (i2 != -1) {
            c14084.m31984(i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41226(Collection collection) {
        m41203(collection, false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m41279(String str) {
        m41203((Collection) Collections.singleton(str), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41225(ArrayList arrayList) {
        m41203((Collection) arrayList, true);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m41203(Collection collection, boolean z) {
        HashSet hashSet = this.f54087;
        hashSet.clear();
        hashSet.addAll(collection);
        this.f54071 = z;
        this.f54078 = !hashSet.isEmpty();
        this.f54062 = false;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m41263() {
        return this.f54062;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m41291() {
        this.f54062 = true;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final void m41262() {
        if (m41266()) {
            return;
        }
        AbstractC18422 abstractC18422 = this.f54077;
        String strM41982 = abstractC18422.m41982();
        int iM29888 = abstractC18422.f55048.m29888();
        if (abstractC18422.mo8208()) {
            C14399 c14399 = new C14399(this, abstractC18422, strM41982, iM29888);
            c14399.m22241(f54055);
            c14399.m22250();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41277(String str) {
        if (m41266()) {
            return;
        }
        AbstractC18422 abstractC18422 = this.f54077;
        if (abstractC18422.mo17073(str)) {
            C12388 c12388 = new C12388(this, abstractC18422);
            c12388.m22241(f54055);
            c12388.m22250();
        }
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final void m41275() {
        if (m41266()) {
            return;
        }
        m41197(false, (Runnable) null, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41198(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((InterfaceC19370) list.get(i)).equals(list2.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m41290() {
        return this.f54075;
    }

    /* JADX INFO: renamed from: ۙ */
    public final C19449 m41245() {
        C19449 c19449 = new C19449();
        c19449.f59249 = this.f54077;
        c19449.f59252 = this.f54079;
        c19449.f59255 = this.f54065;
        C11403 c11403 = this.f54070;
        c19449.f59253 = c11403.m26377();
        c19449.f59251 = c11403.m26376();
        c19449.f59250 = this.f54068.m31976();
        c19449.f59254 = this.f54080;
        c19449.f59257 = this.f54076;
        c19449.f59248 = this.f54088;
        c19449.f59256 = this.f54066;
        c19449.f59247 = this.f54064;
        return c19449;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41234(C19449 c19449) {
        if (m41266()) {
            return;
        }
        this.f54072.incrementAndGet();
        this.f54077 = c19449.f59249;
        this.f54079 = c19449.f59252;
        this.f54065 = c19449.f59255;
        this.f54080 = c19449.f59254;
        this.f54076 = c19449.f59257;
        this.f54088 = c19449.f59248;
        this.f54066 = c19449.f59256;
        this.f54064 = c19449.f59247;
        C17436 c17436 = this.f54069;
        c17436.m39705();
        if (this.f54076 && c17436.m39714()) {
            c17436.m39697();
        }
        boolean z = c19449.f59253;
        this.f54070.m26373(c19449.f59251, z);
        this.f54078 = false;
        this.f54087.clear();
        this.f54071 = false;
        C14084 c14084 = this.f54068;
        c14084.m31983();
        c14084.m31984(c19449.f59250);
        m41283();
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final C12744 m41253() {
        return m41218(false, (Runnable) null);
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final C12744 m41271() {
        return m41218(true, (Runnable) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12744 m41218(boolean z, Runnable runnable) {
        boolean z2;
        C12744 c12744;
        synchronized (this.f54060) {
            if (m41266()) {
                z2 = false;
            } else {
                if (!this.f54060.isEmpty()) {
                    throw new IllegalStateException();
                }
                z2 = true;
            }
            c12744 = new C12744(this, runnable);
            this.f54060.add(c12744);
        }
        if (z2) {
            final C9705 c9705 = this.f54067;
            C18107 c18107 = c9705.f26773;
            C18514 c18514 = c9705.f26772;
            if (c18514 != null) {
                c18514.cancel();
                c9705.f26772 = null;
            }
            ViewGroup viewGroupM26063 = c18107.f54082.m26063(c18107.f54075);
            c9705.f26771 = viewGroupM26063;
            viewGroupM26063.setAlpha(0.0f);
            c9705.f26771.setVisibility(0);
            c9705.f26771.getChildAt(0).setVisibility(4);
            TextView textView = (TextView) c9705.f26771.getChildAt(2);
            c9705.f26769 = textView;
            textView.setVisibility(4);
            c9705.f26769.setTag(-1);
            final View childAt = c9705.f26771.getChildAt(1);
            childAt.setVisibility(4);
            childAt.setAlpha(0.0f);
            C18514 c18514M42063 = C18514.m42063(c9705.f26771, 0.0f, 0.1f);
            c18514M42063.m42064(200L);
            c9705.f26767 = c18514M42063;
            c18514M42063.m30122();
            C18514 c18514M42064 = C18514.m42063(c9705.f26771, 0.1f, 1.0f);
            c18514M42064.m42064(2500L);
            c9705.f26768 = c18514M42064;
            c18514M42064.m53840(new C13729(c9705));
            c9705.f26768.m30124(500L);
            c9705.f26768.m30115(new AccelerateInterpolator());
            c9705.f26768.m30122();
            if (z) {
                C18514 c18514M42065 = C18514.m42063(c9705.f26771.getChildAt(1), 0.0f, 1.0f);
                c9705.f26770 = c18514M42065;
                c18514M42065.m53840(new C24457(c9705, childAt));
                c9705.f26770.m30124(C0240c.f1145a);
                c9705.f26770.m30122();
                final C10748 c10748M24758 = C10748.m24758();
                childAt.setOnClickListener(new View.OnClickListener() { // from class: l.ۛ᩷ܳ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C9705 c9706 = c9705;
                        c9706.getClass();
                        if (c10748M24758.m24763()) {
                            return;
                        }
                        childAt.setOnClickListener(null);
                        c9706.f26773.m41276();
                    }
                });
            }
        }
        return c12744;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41276() {
        ArrayList arrayList;
        synchronized (this.f54060) {
            arrayList = new ArrayList(this.f54060);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12744.m29267((C12744) it.next());
        }
    }

    /* JADX INFO: renamed from: ֨֫ */
    private void m41184() {
        C11403 c11403 = this.f54070;
        boolean zM26377 = c11403.m26377();
        C11245 c11245 = this.f54082;
        if (zM26377) {
            c11403.m26371();
            c11245.m26076();
        }
        if (this.f54076) {
            this.f54076 = false;
            this.f54080 = null;
            this.f54066 = null;
            this.f54064 = null;
            c11245.m26073(this.f54075, false);
            if (this.f54085) {
                c11245.m26101();
            }
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public final boolean m41265() {
        return this.f54076;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m41222(int i, Function function) {
        if (!this.f54076) {
            C17436 c17436 = this.f54069;
            if (c17436.m39714()) {
                this.f54066 = this.f54077.m41982();
                this.f54064 = new HashSet();
                for (InterfaceC19370 interfaceC19370 : m41240()) {
                    if (!interfaceC19370.mo39147() && interfaceC19370.isChecked()) {
                        this.f54064.add(interfaceC19370.getPath());
                    }
                }
            } else {
                this.f54066 = null;
                this.f54064 = null;
            }
            this.f54080 = (AbstractC3947) function;
            this.f54076 = true;
            if (i == -1) {
                this.f54088 = null;
            } else {
                this.f54088 = "➤ ".concat(C7050.m16224(i));
            }
            C14084.m31971(200);
            if (c17436.m39714()) {
                c17436.m39697();
            }
            this.f54068.m31983();
            this.f54082.m26087(this.f54075, true);
            m41202();
            return;
        }
        throw new IllegalStateException("Already in paste mode.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.Function, l.֫ۜܳ] */
    /* JADX INFO: renamed from: ֫֫ */
    public final void m41239() {
        C11245 c11245 = this.f54082;
        c11245.m26077();
        ?? r1 = this.f54080;
        if (r1 == 0 || ((Boolean) r1.apply(this)).booleanValue()) {
            this.f54076 = false;
            this.f54080 = null;
            this.f54066 = null;
            this.f54064 = null;
            C14084.m31971(200);
            this.f54068.m31983();
            c11245.m26073(this.f54075, true);
            m41202();
        }
    }

    /* JADX INFO: renamed from: ۟ */
    public final void m41250() {
        this.f54076 = false;
        this.f54080 = null;
        C14084.m31971(200);
        HashSet hashSet = this.f54064;
        C14084 c14084 = this.f54068;
        if (hashSet != null && C12826.equals(this.f54066, this.f54077.m41982())) {
            m41227((Collection) hashSet, false);
            if (hashSet.isEmpty()) {
                C17436 c17436 = this.f54069;
                if (!c17436.m39714()) {
                    c17436.m39706();
                    c14084.m31987();
                }
            }
        }
        this.f54066 = null;
        this.f54064 = null;
        c14084.m31983();
        this.f54082.m26073(this.f54075, false);
        m41202();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41230(C11996 c11996) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zM39714 = this.f54069.m39714();
        boolean zMo41741 = this.f54077.mo41741();
        for (InterfaceC19370 interfaceC19370 : C21562.unmodifiableList(this.f54079)) {
            if (zM39714 && interfaceC19370.isChecked()) {
                arrayList.add(interfaceC19370.getName());
            }
            if (interfaceC19370.mo39149()) {
                arrayList2.add(zMo41741 ? interfaceC19370.getPath() : interfaceC19370.getName());
            }
        }
        c11996.writeInt(this.f54068.m31976());
        c11996.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c11996.m27459((String) it.next());
        }
        c11996.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c11996.m27459((String) it2.next());
        }
        C11403 c11403 = this.f54070;
        c11996.m27445(c11403.m26377());
        if (c11403.m26377()) {
            c11996.m27459(c11403.m26376());
        }
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final void m41241() {
        AbstractC18422 abstractC18422 = this.f54077;
        if (abstractC18422 != null) {
            abstractC18422.f55057 = true;
            if (m41261("local") && this.f54086.m41261("local") && this.f54077.mo41743().equals(this.f54086.f54077.mo41743())) {
                this.f54086.f54077.f55057 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final void m41278() {
        this.f54068.m31988();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m41219(String str, boolean z) {
        String strM38669;
        String strReplaceAll = str.replaceAll("[:\\\\/*?<>\"|]", "_").replaceAll("\\s", " ");
        String str2 = null;
        if (m41261("local")) {
            strM38669 = this.f54077.m41982();
            if (!C18524.m42130(strM38669)) {
                strM38669 = null;
            }
        } else {
            strM38669 = null;
        }
        if (!z && strM38669 == null && this.f54086.m41261("local")) {
            strM38669 = this.f54086.f54077.m41982();
            if (!C18524.m42130(strM38669)) {
                strM38669 = null;
            }
        }
        if (strM38669 == null && m41261("zip")) {
            strM38669 = C18524.m42109(((C12574) this.f54077).m28981(), new String[0]).m38669();
            if (!C18524.m42130(strM38669)) {
                strM38669 = null;
            }
        }
        if (strM38669 == null && m41261("archive")) {
            String strM386610 = C18524.m42109(((C7280) this.f54077).m16734(), new String[0]).m38669();
            if (C18524.m42130(strM386610)) {
                str2 = strM386610;
            }
        } else {
            str2 = strM38669;
        }
        return (str2 == null ? C17853.m40542() : C18524.m42109(str2, new String[0])).m38684(strReplaceAll);
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final void m41268() {
        C11245 c11245 = this.f54082;
        if (c11245.m26098() != this.f54075) {
            c11245.m26090();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m41248() {
        MessageDigest messageDigestM36666 = C16111.m36666();
        AbstractC18422 abstractC18422 = this.f54077;
        List<InterfaceC19370> listM41240 = m41240();
        boolean zM39714 = this.f54069.m39714();
        C16111.m36662(messageDigestM36666, abstractC18422.mo8204() + "|" + abstractC18422.m41982() + "|" + zM39714 + "|" + listM41240.size());
        messageDigestM36666.update((byte) -1);
        for (InterfaceC19370 interfaceC19370 : listM41240) {
            C16111.m36662(messageDigestM36666, interfaceC19370.getName());
            messageDigestM36666.update((byte) -1);
            C16111.m36662(messageDigestM36666, String.valueOf(interfaceC19370.isDirectory()));
            messageDigestM36666.update((byte) -1);
            C16111.m36662(messageDigestM36666, String.valueOf(interfaceC19370.mo39144()));
            messageDigestM36666.update((byte) -1);
            C16111.m36662(messageDigestM36666, String.valueOf(interfaceC19370.mo27882()));
            messageDigestM36666.update((byte) -1);
            C16111.m36662(messageDigestM36666, String.valueOf(zM39714 && interfaceC19370.isChecked()));
            messageDigestM36666.update((byte) -1);
        }
        return C16111.m36665(messageDigestM36666.digest());
    }
}
