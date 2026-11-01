package p067l;

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
public final class C3748 {

    /* JADX INFO: renamed from: ۠ */
    public static final ExecutorC22936 f7940 = new ExecutorC22936();

    /* JADX INFO: renamed from: ֡ */
    public InterfaceC23865 f7941;

    /* JADX INFO: renamed from: ֨ */
    public C10307 f7942;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17980 f7943;

    /* JADX INFO: renamed from: ۖ */
    public C21886 f7944 = new C21886();

    /* JADX INFO: renamed from: ۘ */
    public int f7945;

    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC15829 f7946;

    /* JADX INFO: renamed from: ۜ */
    public boolean f7947;

    /* JADX INFO: renamed from: ۡ */
    public final CopyOnWriteArraySet f7948;

    /* JADX INFO: renamed from: ۢ */
    public long f7949;

    /* JADX INFO: renamed from: ۧ */
    public final Context f7950;

    /* JADX INFO: renamed from: ܳ */
    public long f7951;

    /* JADX INFO: renamed from: ܺ */
    public int f7952;

    /* JADX INFO: renamed from: ܽ */
    public Pair f7953;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f7954;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC8640 f7955;

    /* JADX INFO: renamed from: ᩴ */
    public int f7956;

    /* JADX INFO: renamed from: ᩵ */
    public int f7957;

    /* JADX INFO: renamed from: ᩷ */
    public final SparseArray f7958;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC20664 f7959;

    /* JADX INFO: renamed from: ֫ */
    private void m7203(Surface surface, int i, int i2) {
    }

    /* JADX INFO: renamed from: ᩻ */
    public static /* bridge */ /* synthetic */ InterfaceC24547 m7227(C3748 c3748) {
        c3748.getClass();
        return null;
    }

    public C3748(C22525 c22525) {
        this.f7950 = c22525.f71024;
        InterfaceC15829 interfaceC15829 = c22525.f71023;
        C23877.m52958(interfaceC15829);
        this.f7946 = interfaceC15829;
        this.f7958 = new SparseArray();
        AbstractC16192.m36872of();
        this.f7954 = c22525.f71026;
        InterfaceC17980 interfaceC17980 = c22525.f71022;
        this.f7943 = interfaceC17980;
        this.f7955 = new C12207(c22525.f71025, interfaceC17980);
        this.f7948 = new CopyOnWriteArraySet();
        this.f7942 = new C3601().m6672();
        this.f7949 = -9223372036854775807L;
        this.f7951 = -9223372036854775807L;
        this.f7957 = -1;
        this.f7956 = 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7234() {
        this.f7957 = 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8640 m7230() {
        SparseArray sparseArray = this.f7958;
        if (C5792.m13003(sparseArray, 0)) {
            return (InterfaceC8640) sparseArray.get(0);
        }
        C5090 c5090 = new C5090(this, this.f7950);
        this.f7948.add(c5090);
        sparseArray.put(0, c5090);
        return c5090;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7229(Surface surface, C18532 c18532) {
        Pair pair = this.f7953;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C18532) this.f7953.second).equals(c18532)) {
            return;
        }
        this.f7953 = Pair.create(surface, c18532);
        m7203(surface, c18532.m42135(), c18532.m42134());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7228() {
        C18532 c18532 = C18532.f55343;
        m7203((Surface) null, c18532.m42135(), c18532.m42134());
        this.f7953 = null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m7233() {
        ((C12207) this.f7955).mo10832();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m7231() {
        ((C12207) this.f7955).mo10840();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7232() {
        if (this.f7956 == 2) {
            return;
        }
        InterfaceC20664 interfaceC20664 = this.f7959;
        if (interfaceC20664 != null) {
            interfaceC20664.mo19709();
        }
        this.f7953 = null;
        this.f7956 = 2;
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
    /* JADX INFO: renamed from: ֫ */
    public static boolean m7212(C3748 c3748, C10307 c10307) throws C24733 {
        InterfaceC8640 interfaceC8640 = c3748.f7955;
        C23877.m52960(c3748.f7956 == 0);
        C22378 c22378M20705 = c10307.f28551;
        if (c22378M20705 == null || !c22378M20705.m50230()) {
            c22378M20705 = C22378.f70597;
        }
        try {
            int i = c22378M20705.f70603;
            if (i == 7 && Build.VERSION.SDK_INT < 34 && C5911.m13293()) {
                C8966 c8966M50229 = c22378M20705.m50229();
                c8966M50229.m20711(6);
                c22378M20705 = c8966M50229.m20705();
            } else if (!C5911.m13290(i) && Build.VERSION.SDK_INT >= 29) {
                Locale locale = Locale.US;
                C21334.m48351("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                c22378M20705 = C22378.f70597;
            }
            InterfaceC17980 interfaceC17980 = c3748.f7943;
            Looper looperMyLooper = Looper.myLooper();
            C23877.m52958(looperMyLooper);
            final InterfaceC20664 interfaceC20664Mo35964 = interfaceC17980.mo35964(looperMyLooper, null);
            c3748.f7959 = interfaceC20664Mo35964;
            c3748.f7946.mo5189(c3748.f7950, c22378M20705, c3748, new Executor() { // from class: l.ۜ᩻ۧ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC20664Mo35964.mo19707(runnable);
                }
            }).m54136();
            throw null;
        } catch (C4570 e) {
            throw new C24733(e, c10307);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m7218(C3748 c3748, boolean z) {
        return ((C12207) c3748.f7955).mo10829(z && c3748.f7952 == 0);
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m7220(C3748 c3748) {
        ((C12207) c3748.f7955).mo10841();
        c3748.f7947 = true;
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m7215(C3748 c3748) {
        return c3748.f7952 == 0 && c3748.f7947 && ((C12207) c3748.f7955).mo10834();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7208(C3748 c3748, long j, long j2) {
        ((C12207) c3748.f7955).mo10820(j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7211(C3748 c3748, boolean z) {
        InterfaceC8640 interfaceC8640 = c3748.f7955;
        if (c3748.f7956 == 1) {
            c3748.f7952++;
            C12207 c12207 = (C12207) interfaceC8640;
            c12207.mo10833(z);
            while (c3748.f7944.m49352() > 1) {
                c3748.f7944.m49350();
            }
            if (c3748.f7944.m49352() == 1) {
                C7772 c7772 = (C7772) c3748.f7944.m49350();
                c7772.getClass();
                c12207.mo10824(c3748.f7942, c7772.f20390, c7772.f20388, AbstractC16192.m36872of());
            }
            c3748.f7949 = -9223372036854775807L;
            c3748.f7951 = -9223372036854775807L;
            c3748.f7947 = false;
            InterfaceC20664 interfaceC20664 = c3748.f7959;
            C23877.m52958(interfaceC20664);
            interfaceC20664.mo19707(new RunnableC22099(1, c3748));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m7204(C3748 c3748) {
        c3748.f7952--;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m7222(C3748 c3748, boolean z) {
        ((C12207) c3748.f7955).mo10837(z);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m7225(C3748 c3748) {
        ((C12207) c3748.f7955).mo10830();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7210(C3748 c3748, InterfaceC23865 interfaceC23865) {
        c3748.f7941 = interfaceC23865;
        ((C12207) c3748.f7955).mo10826(interfaceC23865);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7205(C3748 c3748, float f) {
        ((C12207) c3748.f7955).mo10817(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7206(C3748 c3748, int i) {
        ((C12207) c3748.f7955).mo10818(i);
    }

    /* JADX INFO: renamed from: ۡ */
    public static boolean m7214(C3748 c3748) {
        int i = c3748.f7957;
        return i != -1 && i == c3748.f7945;
    }
}
