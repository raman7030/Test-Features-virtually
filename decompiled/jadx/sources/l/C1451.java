package l;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1451 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final ExecutorC21641 f5167 = new ExecutorC21641();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f5168;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8353 f5169;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f5170;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20537 f5171 = new C20537();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f5172;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14164 f5173;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f5174;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f5175;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f5176;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f5177;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f5178;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f5179;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Pair f5180;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f5181;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6599 f5182;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f5183;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f5184;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SparseArray f5185;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC19251 f5186;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4960(Surface surface, int i, int i2) {
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC23337 m4984(C1451 c1451) {
        c1451.getClass();
        return null;
    }

    public C1451(C21208 c21208) {
        this.f5177 = c21208.f68341;
        InterfaceC14164 interfaceC14164 = c21208.f68340;
        C22632.m50632(interfaceC14164);
        this.f5173 = interfaceC14164;
        this.f5185 = new SparseArray();
        AbstractC14545.of();
        this.f5181 = c21208.f68343;
        InterfaceC16427 interfaceC16427 = c21208.f68339;
        this.f5170 = interfaceC16427;
        this.f5182 = new C10352(c21208.f68342, interfaceC16427);
        this.f5175 = new CopyOnWriteArraySet();
        this.f5169 = new C1297().m4440();
        this.f5176 = -9223372036854775807L;
        this.f5178 = -9223372036854775807L;
        this.f5184 = -1;
        this.f5183 = 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4991() {
        this.f5184 = 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6599 m4987() {
        SparseArray sparseArray = this.f5185;
        if (C3603.m11027(sparseArray, 0)) {
            return (InterfaceC6599) sparseArray.get(0);
        }
        C2863 c2863 = new C2863(this, this.f5177);
        this.f5175.add(c2863);
        sparseArray.put(0, c2863);
        return c2863;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4986(Surface surface, C17008 c17008) {
        Pair pair = this.f5180;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C17008) this.f5180.second).equals(c17008)) {
            return;
        }
        this.f5180 = Pair.create(surface, c17008);
        m4960(surface, c17008.m39892(), c17008.m39891());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4985() {
        C17008 c17008 = C17008.f52163;
        m4960((Surface) null, c17008.m39892(), c17008.m39891());
        this.f5180 = null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m4990() {
        ((C10352) this.f5182).mo8765();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4988() {
        ((C10352) this.f5182).mo8773();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4989() {
        if (this.f5183 == 2) {
            return;
        }
        InterfaceC19251 interfaceC19251 = this.f5186;
        if (interfaceC19251 != null) {
            interfaceC19251.mo17762();
        }
        this.f5180 = null;
        this.f5183 = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ۜ᩻ۧ] */
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
    public static boolean m4969(C1451 c1451, C8353 c8353) throws C23532 {
        InterfaceC6599 interfaceC6599 = c1451.f5182;
        C22632.m50634(c1451.f5183 == 0);
        C21054 c21054M18751 = c8353.f25637;
        if (c21054M18751 == null || !c21054M18751.m47900()) {
            c21054M18751 = C21054.f67913;
        }
        try {
            int i = c21054M18751.f67919;
            if (i == 7 && Build.VERSION.SDK_INT < 34 && C3728.m11341()) {
                C6942 c6942M47899 = c21054M18751.m47899();
                c6942M47899.m18757(6);
                c21054M18751 = c6942M47899.m18751();
            } else if (!C3728.m11338(i) && Build.VERSION.SDK_INT >= 29) {
                Locale locale = Locale.US;
                C19956.m46037("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                c21054M18751 = C21054.f67913;
            }
            InterfaceC16427 interfaceC16427 = c1451.f5170;
            Looper looperMyLooper = Looper.myLooper();
            C22632.m50632(looperMyLooper);
            final InterfaceC19251 interfaceC19251Mo33832 = interfaceC16427.mo33832(looperMyLooper, null);
            c1451.f5186 = interfaceC19251Mo33832;
            c1451.f5173.mo2860(c1451.f5177, c21054M18751, c1451, new Executor() { // from class: l.ۜ᩻ۧ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC19251Mo33832.mo17760(runnable);
                }
            }).m51739();
            throw null;
        } catch (C2317 e) {
            throw new C23532(e, c8353);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4975(C1451 c1451, boolean z) {
        return ((C10352) c1451.f5182).mo8762(z && c1451.f5179 == 0);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m4977(C1451 c1451) {
        ((C10352) c1451.f5182).mo8774();
        c1451.f5174 = true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4972(C1451 c1451) {
        return c1451.f5179 == 0 && c1451.f5174 && ((C10352) c1451.f5182).mo8767();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4965(C1451 c1451, long j, long j2) {
        ((C10352) c1451.f5182).mo8753(j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4968(C1451 c1451, boolean z) {
        InterfaceC6599 interfaceC6599 = c1451.f5182;
        if (c1451.f5183 == 1) {
            c1451.f5179++;
            C10352 c10352 = (C10352) interfaceC6599;
            c10352.mo8766(z);
            while (c1451.f5171.m47029() > 1) {
                c1451.f5171.m47027();
            }
            if (c1451.f5171.m47029() == 1) {
                C5685 c5685 = (C5685) c1451.f5171.m47027();
                c5685.getClass();
                c10352.mo8757(c1451.f5169, c5685.f17543, c5685.f17541, AbstractC14545.of());
            }
            c1451.f5176 = -9223372036854775807L;
            c1451.f5178 = -9223372036854775807L;
            c1451.f5174 = false;
            InterfaceC19251 interfaceC19251 = c1451.f5186;
            C22632.m50632(interfaceC19251);
            interfaceC19251.mo17760(new RunnableC20760(1, c1451));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4961(C1451 c1451) {
        c1451.f5179--;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m4979(C1451 c1451, boolean z) {
        ((C10352) c1451.f5182).mo8770(z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m4982(C1451 c1451) {
        ((C10352) c1451.f5182).mo8763();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4967(C1451 c1451, InterfaceC22618 interfaceC22618) {
        c1451.f5168 = interfaceC22618;
        ((C10352) c1451.f5182).mo8759(interfaceC22618);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4962(C1451 c1451, float f) {
        ((C10352) c1451.f5182).mo8750(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4963(C1451 c1451, int i) {
        ((C10352) c1451.f5182).mo8751(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4971(C1451 c1451) {
        int i = c1451.f5184;
        return i != -1 && i == c1451.f5172;
    }
}
