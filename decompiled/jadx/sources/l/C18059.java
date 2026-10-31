package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ᩳ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes5.dex */
public class C18059 implements InterfaceC10318, InterfaceC9593 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56270 = AtomicReferenceFieldUpdater.newUpdater(C18059.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    public volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ֫ */
    public String mo26920() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ۡ */
    public boolean mo3349() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo22960(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo34675() {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo3351(Object obj) {
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean mo42129() {
        return true;
    }

    public C18059(boolean z) {
        this._state = z ? C17353.f53157 : C17353.f53156;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m42119(C18059 c18059, C11004 c11004, C2269 c2269, Object obj) {
        c18059.getClass();
        C2269 c2269M42117 = m42117((C20697) c2269);
        if (c2269M42117 != null) {
            while (c2269M42117.f7361.mo26067((1 & 1) == 0, (1 & 2) != 0, new C1831(c18059, c11004, c2269M42117, obj)) == C6770.f21025) {
                c2269M42117 = m42117((C20697) c2269M42117);
                if (c2269M42117 == null) {
                }
            }
            return;
        }
        c18059.mo3351(c18059.m42116(c11004, obj));
    }

    @Override // l.InterfaceC18330
    public final InterfaceC17624 getKey() {
        return C12434.f37427;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18330 mo9082(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        if (C11233.m27802(C12434.f37427, interfaceC17624)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13850(Object obj, InterfaceC19763 interfaceC19763) {
        return interfaceC19763.mo6973(obj, this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo3352(Object obj) {
        mo3351(obj);
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14801 mo13851(InterfaceC14801 interfaceC14801) {
        return C16918.m39767(this, interfaceC14801);
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14801 mo9085(InterfaceC17624 interfaceC17624) {
        return C16918.m39768(this, interfaceC17624);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m42120(InterfaceC20196 interfaceC20196, Object obj) {
        InterfaceC15673 interfaceC15673 = (InterfaceC15673) this._parentHandle;
        if (interfaceC15673 != null) {
            interfaceC15673.mo12010();
            this._parentHandle = C6770.f21025;
        }
        C5091 c5091 = null;
        C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
        Throwable th = c18497 != null ? c18497.f57332 : null;
        if (interfaceC20196 instanceof AbstractC7495) {
            try {
                ((AbstractC7495) interfaceC20196).mo1250(th);
                return;
            } catch (Throwable th2) {
                mo26921(new C5091("Exception in completion handler " + interfaceC20196 + " for " + this, th2));
                return;
            }
        }
        C23703 c23703Mo20125 = interfaceC20196.mo20125();
        if (c23703Mo20125 != null) {
            for (C20697 c20697M47312 = (C20697) c23703Mo20125.m47316(); !C11233.m27802(c20697M47312, c23703Mo20125); c20697M47312 = c20697M47312.m47312()) {
                if (c20697M47312 instanceof AbstractC7495) {
                    AbstractC7495 abstractC7495 = (AbstractC7495) c20697M47312;
                    try {
                        abstractC7495.mo1250(th);
                    } catch (Throwable th3) {
                        if (c5091 == null) {
                            c5091 = new C5091("Exception in completion handler " + abstractC7495 + " for " + this, th3);
                            C8058 c8058 = C8058.f24861;
                        } else {
                            C10881.m27179(c5091, th3);
                        }
                    }
                }
            }
            if (c5091 != null) {
                mo26921(c5091);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15673 m42131() {
        return (InterfaceC15673) this._parentHandle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42126(InterfaceC10318 interfaceC10318) {
        C6770 c6770 = C6770.f21025;
        if (interfaceC10318 == null) {
            this._parentHandle = c6770;
            return;
        }
        interfaceC10318.start();
        InterfaceC15673 interfaceC15673Mo26068 = interfaceC10318.mo26068(this);
        this._parentHandle = interfaceC15673Mo26068;
        if (m42127() instanceof InterfaceC20196) {
            return;
        }
        interfaceC15673Mo26068.mo12010();
        this._parentHandle = c6770;
    }

    @Override // l.InterfaceC10318
    public final boolean start() {
        while (true) {
            Object objM42127 = m42127();
            boolean z = objM42127 instanceof C15961;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
            if (z) {
                if (((C15961) objM42127).mo20124()) {
                    return false;
                }
                C15961 c15961 = C17353.f53157;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM42127, c15961)) {
                        mo34675();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM42127);
            } else {
                if (!(objM42127 instanceof C22312)) {
                    return false;
                }
                C23703 c23703Mo20125 = ((C22312) objM42127).mo20125();
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM42127, c23703Mo20125)) {
                        mo34675();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM42127);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42125(AbstractC7495 abstractC7495) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objM42127 = m42127();
            if (!(objM42127 instanceof AbstractC7495)) {
                if (!(objM42127 instanceof InterfaceC20196) || ((InterfaceC20196) objM42127).mo20125() == null) {
                    return;
                }
                abstractC7495.m47311();
                return;
            }
            if (objM42127 != abstractC7495) {
                return;
            }
            C15961 c15961 = C17353.f53157;
            do {
                atomicReferenceFieldUpdater = f56270;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM42127, c15961)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM42127);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m42128(Object obj) {
        Object objM42115;
        do {
            objM42115 = m42115(m42127(), obj);
            if (objM42115 == C17353.f53152) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
                throw new IllegalStateException(str, c18497 != null ? c18497.f57332 : null);
            }
        } while (objM42115 == C17353.f53153);
        return objM42115;
    }

    @Override // l.InterfaceC10318
    /* JADX INFO: renamed from: ܽ */
    public boolean mo26070() {
        Object objM42127 = m42127();
        return (objM42127 instanceof InterfaceC20196) && ((InterfaceC20196) objM42127).mo20124();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final Object m42116(C11004 c11004, Object obj) {
        Object obj2 = null;
        Throwable c6084 = null;
        C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
        Throwable th = c18497 != null ? c18497.f57332 : null;
        synchronized (c11004) {
            c11004.m27325();
            ArrayList<Throwable> arrayListM27324 = c11004.m27324(th);
            if (!arrayListM27324.isEmpty()) {
                for (Object obj3 : arrayListM27324) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c6084 = (Throwable) obj2;
                if (c6084 == null) {
                    c6084 = (Throwable) arrayListM27324.get(0);
                }
            } else if (c11004.m27325()) {
                c6084 = new C6084(mo26920(), null, this);
            }
            if (c6084 != null && arrayListM27324.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM27324.size()));
                for (Throwable th2 : arrayListM27324) {
                    if (th2 != c6084 && th2 != c6084 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C10881.m27179(c6084, th2);
                    }
                }
            }
        }
        if (c6084 != null && c6084 != th) {
            obj = new C18497(c6084, false);
        }
        if (c6084 != null && (m42123(c6084) || mo22960(c6084))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            ((C18497) obj).m42997();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
        Object c4673 = obj instanceof InterfaceC20196 ? new C4673((InterfaceC20196) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c11004, c4673) && atomicReferenceFieldUpdater.get(this) == c11004) {
        }
        m42120((InterfaceC20196) c11004, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final boolean m42123(Throwable th) {
        if (!mo3349()) {
            boolean z = th instanceof CancellationException;
            InterfaceC15673 interfaceC15673 = (InterfaceC15673) this._parentHandle;
            if (interfaceC15673 == null || interfaceC15673 == C6770.f21025) {
                return z;
            }
            return interfaceC15673.mo7498(th) || z;
        }
        return true;
    }

    @Override // l.InterfaceC10318
    /* JADX INFO: renamed from: ᩳ */
    public final CancellationException mo26071() {
        CancellationException cancellationException;
        Object objM42127 = m42127();
        if (!(objM42127 instanceof C11004)) {
            if (objM42127 instanceof InterfaceC20196) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objM42127 instanceof C18497)) {
                return new C6084(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C18497) objM42127).f57332;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C6084(mo26920(), th, this) : cancellationException;
        }
        Throwable thM27322 = ((C11004) objM42127).m27322();
        if (thM27322 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM27322 instanceof CancellationException ? (CancellationException) thM27322 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo26920();
        }
        return new C6084(strConcat, thM27322, this);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00ed A[EDGE_INSN: B:111:0x00ed->B:88:0x00ed BREAK  A[LOOP:0: B:13:0x0018->B:118:0x0018, LOOP_LABEL: LOOP:0: B:13:0x0018->B:118:0x0018], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea A[ADDED_TO_REGION] */
    @Override // l.InterfaceC10318
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8907 mo26067(boolean z, boolean z2, AbstractC7495 abstractC7495) {
        AbstractC7495 abstractC7496;
        Throwable thM27322;
        C16647 c16647;
        int iM47308;
        boolean z3;
        if (z) {
            AbstractC11729 c3262 = abstractC7495 instanceof AbstractC11729 ? (AbstractC11729) abstractC7495 : null;
            if (c3262 == null) {
                c3262 = new C3262(abstractC7495);
            }
            abstractC7496 = c3262;
        } else {
            abstractC7496 = abstractC7495;
        }
        abstractC7496.f23084 = this;
        loop0: while (true) {
            Object objM42127 = m42127();
            if (objM42127 instanceof C15961) {
                C15961 c15961 = (C15961) objM42127;
                if (c15961.mo20124()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objM42127, abstractC7496)) {
                        if (atomicReferenceFieldUpdater.get(this) != objM42127) {
                        }
                    }
                    break loop0;
                }
                C23703 c23703 = new C23703();
                InterfaceC20196 c22312 = c15961.mo20124() ? c23703 : new C22312(c23703);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f56270;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c15961, c22312) && atomicReferenceFieldUpdater2.get(this) == c15961) {
                }
            } else {
                if (!(objM42127 instanceof InterfaceC20196)) {
                    if (z2) {
                        C18497 c18497 = objM42127 instanceof C18497 ? (C18497) objM42127 : null;
                        abstractC7495.invoke(c18497 != null ? c18497.f57332 : null);
                    }
                    return C6770.f21025;
                }
                InterfaceC20196 interfaceC20196 = (InterfaceC20196) objM42127;
                C23703 c23703Mo20125 = interfaceC20196.mo20125();
                if (c23703Mo20125 != null) {
                    InterfaceC8907 interfaceC8907 = C6770.f21025;
                    if (!z || !(objM42127 instanceof C11004)) {
                        thM27322 = null;
                        if (thM27322 != null) {
                            c16647 = new C16647(abstractC7496, this, interfaceC20196);
                            do {
                                iM47308 = c23703Mo20125.m47315().m47308(abstractC7496, c23703Mo20125, c16647);
                                if (iM47308 != 1) {
                                    break loop0;
                                }
                            } while (iM47308 != 2);
                        } else {
                            if (z2) {
                                abstractC7495.invoke(thM27322);
                            }
                            return interfaceC8907;
                        }
                    } else {
                        synchronized (objM42127) {
                            thM27322 = ((C11004) objM42127).m27322();
                            if (thM27322 == null || ((abstractC7495 instanceof C2269) && !((C11004) objM42127).m27327())) {
                                C16647 c16648 = new C16647(abstractC7496, this, (InterfaceC20196) objM42127);
                                while (true) {
                                    int iM47309 = c23703Mo20125.m47315().m47308(abstractC7496, c23703Mo20125, c16648);
                                    if (iM47309 == 1) {
                                        z3 = true;
                                        break;
                                    }
                                    if (iM47309 == 2) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (thM27322 == null) {
                                        return abstractC7496;
                                    }
                                    interfaceC8907 = abstractC7496;
                                }
                            }
                            C8058 c8058 = C8058.f24861;
                        }
                        if (thM27322 != null) {
                            c16647 = new C16647(abstractC7496, this, interfaceC20196);
                            do {
                                iM47308 = c23703Mo20125.m47315().m47308(abstractC7496, c23703Mo20125, c16647);
                                if (iM47308 != 1) {
                                    break loop0;
                                    break loop0;
                                }
                            } while (iM47308 != 2);
                        } else {
                            if (z2) {
                                abstractC7495.invoke(thM27322);
                            }
                            return interfaceC8907;
                        }
                    }
                } else {
                    AbstractC7495 abstractC7497 = (AbstractC7495) objM42127;
                    abstractC7497.m47309(new C23703());
                    C20697 c20697M47312 = abstractC7497.m47312();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f56270;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, abstractC7497, c20697M47312) && atomicReferenceFieldUpdater3.get(this) == abstractC7497) {
                    }
                }
            }
        }
        return abstractC7496;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m42121(C23703 c23703, Throwable th) {
        C5091 c5091 = null;
        for (C20697 c20697M47312 = (C20697) c23703.m47316(); !C11233.m27802(c20697M47312, c23703); c20697M47312 = c20697M47312.m47312()) {
            if (c20697M47312 instanceof AbstractC11729) {
                AbstractC7495 abstractC7495 = (AbstractC7495) c20697M47312;
                try {
                    abstractC7495.mo1250(th);
                } catch (Throwable th2) {
                    if (c5091 == null) {
                        c5091 = new C5091("Exception in completion handler " + abstractC7495 + " for " + this, th2);
                        C8058 c8058 = C8058.f24861;
                    } else {
                        C10881.m27179(c5091, th2);
                    }
                }
            }
        }
        if (c5091 != null) {
            mo26921(c5091);
        }
        m42123(th);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v15 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {, blocks: (B:25:0x0050, B:27:0x0059, B:30:0x0060, B:36:0x0077, B:34:0x006d, B:35:0x0071), top: B:82:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x0092, TRY_ENTER, TryCatch #0 {, blocks: (B:25:0x0050, B:27:0x0059, B:30:0x0060, B:36:0x0077, B:34:0x006d, B:35:0x0071), top: B:82:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:25:0x0050, B:27:0x0059, B:30:0x0060, B:36:0x0077, B:34:0x006d, B:35:0x0071), top: B:82:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[EDGE_INSN: B:92:0x00ff->B:71:0x00ff BREAK  A[LOOP:1: B:21:0x0046->B:95:0x0046], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:2: B:56:0x00b6->B:99:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0044, please report this as an issue */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m42130(Object obj) {
        Throwable thM42124;
        Object objM42127;
        Throwable thM27322;
        C15050 c15050;
        InterfaceC20196 interfaceC20196;
        C23703 c23703M42118;
        C11004 c11004;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM42115 = C17353.f53152;
        if (this instanceof C23017) {
            do {
                Object objM42128 = m42127();
                if (!(objM42128 instanceof InterfaceC20196) || ((objM42128 instanceof C11004) && ((C11004) objM42128).m27327())) {
                    objM42115 = C17353.f53152;
                    break;
                }
                objM42115 = m42115(objM42128, new C18497(m42124(obj), false));
            } while (objM42115 == C17353.f53153);
            if (objM42115 != C17353.f53155) {
                if (objM42115 == C17353.f53152) {
                    thM42124 = null;
                    loop1: while (true) {
                        objM42127 = m42127();
                        if (objM42127 instanceof C11004) {
                            synchronized (objM42127) {
                                if (((C11004) objM42127).m27326()) {
                                    c15050 = C17353.f53158;
                                } else {
                                    boolean zM27325 = ((C11004) objM42127).m27325();
                                    if (obj == null || !zM27325) {
                                        if (thM42124 == null) {
                                            thM42124 = m42124(obj);
                                        }
                                        ((C11004) objM42127).m27323(thM42124);
                                    }
                                    thM27322 = zM27325 ? null : ((C11004) objM42127).m27322();
                                    if (thM27322 != null) {
                                        m42121(((C11004) objM42127).mo20125(), thM27322);
                                    }
                                    c15050 = C17353.f53152;
                                }
                            }
                        } else if (objM42127 instanceof InterfaceC20196) {
                            if (thM42124 == null) {
                                thM42124 = m42124(obj);
                            }
                            interfaceC20196 = (InterfaceC20196) objM42127;
                            if (interfaceC20196.mo20124()) {
                                c23703M42118 = m42118(interfaceC20196);
                                if (c23703M42118 == null) {
                                    continue;
                                } else {
                                    c11004 = new C11004(c23703M42118, thM42124);
                                    atomicReferenceFieldUpdater = f56270;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC20196, c11004)) {
                                            m42121(c23703M42118, thM42124);
                                            c15050 = C17353.f53152;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC20196) {
                                        }
                                    }
                                }
                            } else {
                                objM42115 = m42115(objM42127, new C18497(thM42124, false));
                                if (objM42115 != C17353.f53152) {
                                    throw new IllegalStateException(("Cannot happen in " + objM42127).toString());
                                }
                                if (objM42115 != C17353.f53153) {
                                    break;
                                }
                            }
                        } else {
                            c15050 = C17353.f53158;
                        }
                        objM42115 = c15050;
                        break;
                    }
                }
                if (objM42115 != C17353.f53152 && objM42115 != C17353.f53155) {
                    if (objM42115 == C17353.f53158) {
                        return false;
                    }
                    mo3351(objM42115);
                    return true;
                }
            }
        } else {
            if (objM42115 == C17353.f53152) {
                thM42124 = null;
                loop1: while (true) {
                    objM42127 = m42127();
                    if (objM42127 instanceof C11004) {
                        synchronized (objM42127) {
                            if (((C11004) objM42127).m27326()) {
                                c15050 = C17353.f53158;
                            } else {
                                boolean zM27326 = ((C11004) objM42127).m27325();
                                if (obj == null) {
                                    if (thM42124 == null) {
                                        thM42124 = m42124(obj);
                                    }
                                    ((C11004) objM42127).m27323(thM42124);
                                } else {
                                    if (thM42124 == null) {
                                        thM42124 = m42124(obj);
                                    }
                                    ((C11004) objM42127).m27323(thM42124);
                                }
                                if (zM27326) {
                                }
                                if (thM27322 != null) {
                                    m42121(((C11004) objM42127).mo20125(), thM27322);
                                }
                                c15050 = C17353.f53152;
                            }
                        }
                    } else if (objM42127 instanceof InterfaceC20196) {
                        if (thM42124 == null) {
                            thM42124 = m42124(obj);
                        }
                        interfaceC20196 = (InterfaceC20196) objM42127;
                        if (interfaceC20196.mo20124()) {
                            c23703M42118 = m42118(interfaceC20196);
                            if (c23703M42118 == null) {
                                continue;
                            } else {
                                c11004 = new C11004(c23703M42118, thM42124);
                                atomicReferenceFieldUpdater = f56270;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC20196, c11004)) {
                                        m42121(c23703M42118, thM42124);
                                        c15050 = C17353.f53152;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC20196) {
                                    }
                                }
                            }
                        } else {
                            objM42115 = m42115(objM42127, new C18497(thM42124, false));
                            if (objM42115 != C17353.f53152) {
                                throw new IllegalStateException(("Cannot happen in " + objM42127).toString());
                            }
                            if (objM42115 != C17353.f53153) {
                                break;
                                break;
                            }
                        }
                    } else {
                        c15050 = C17353.f53158;
                    }
                    objM42115 = c15050;
                    break;
                }
            }
            if (objM42115 != C17353.f53152) {
                if (objM42115 == C17353.f53158) {
                    return false;
                }
                mo3351(objM42115);
                return true;
            }
        }
        return true;
    }

    @Override // l.InterfaceC10318
    /* JADX INFO: renamed from: ֫ */
    public final void mo26069(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C6084(mo26920(), null, this);
        }
        m42130(cancellationException);
    }

    @Override // l.InterfaceC9593
    /* JADX INFO: renamed from: ᩻ */
    public final CancellationException mo24530() {
        Throwable thM27322;
        Object objM42127 = m42127();
        if (objM42127 instanceof C11004) {
            thM27322 = ((C11004) objM42127).m27322();
        } else if (objM42127 instanceof C18497) {
            thM27322 = ((C18497) objM42127).f57332;
        } else {
            if (objM42127 instanceof InterfaceC20196) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM42127).toString());
            }
            thM27322 = null;
        }
        CancellationException cancellationException = thM27322 instanceof CancellationException ? (CancellationException) thM27322 : null;
        return cancellationException == null ? new C6084("Parent job is ".concat(m42122(objM42127)), thM27322, this) : cancellationException;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private final Throwable m42124(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C6084(mo26920(), null, this) : th;
        }
        if (obj != null) {
            return ((InterfaceC9593) obj).mo24530();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C23703 m42118(InterfaceC20196 interfaceC20196) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C23703 c23703Mo20125 = interfaceC20196.mo20125();
        if (c23703Mo20125 != null) {
            return c23703Mo20125;
        }
        if (interfaceC20196 instanceof C15961) {
            return new C23703();
        }
        if (!(interfaceC20196 instanceof AbstractC7495)) {
            throw new IllegalStateException(("State should have list: " + interfaceC20196).toString());
        }
        AbstractC7495 abstractC7495 = (AbstractC7495) interfaceC20196;
        abstractC7495.m47309(new C23703());
        C20697 c20697M47312 = abstractC7495.m47312();
        do {
            atomicReferenceFieldUpdater = f56270;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7495, c20697M47312)) {
                return null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC7495);
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final Object m42115(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC20196)) {
            return C17353.f53152;
        }
        if (((obj instanceof C15961) || (obj instanceof AbstractC7495)) && !(obj instanceof C2269) && !(obj2 instanceof C18497)) {
            InterfaceC20196 interfaceC20196 = (InterfaceC20196) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
            Object c4673 = obj2 instanceof InterfaceC20196 ? new C4673((InterfaceC20196) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC20196, c4673)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC20196) {
                    return C17353.f53153;
                }
            }
            m42120(interfaceC20196, obj2);
            return obj2;
        }
        InterfaceC20196 interfaceC20197 = (InterfaceC20196) obj;
        C23703 c23703M42118 = m42118(interfaceC20197);
        if (c23703M42118 == null) {
            return C17353.f53153;
        }
        C2269 c2269M42117 = null;
        C11004 c11004 = interfaceC20197 instanceof C11004 ? (C11004) interfaceC20197 : null;
        if (c11004 == null) {
            c11004 = new C11004(c23703M42118, null);
        }
        C11004 c11005 = c11004;
        synchronized (c11005) {
            if (c11005.m27327()) {
                return C17353.f53152;
            }
            c11005.m27328();
            if (c11005 != interfaceC20197) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f56270;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC20197, c11005)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC20197) {
                        return C17353.f53153;
                    }
                }
            }
            boolean zM27325 = c11005.m27325();
            C18497 c18497 = obj2 instanceof C18497 ? (C18497) obj2 : null;
            if (c18497 != null) {
                c11005.m27323(c18497.f57332);
            }
            Throwable thM27322 = c11005.m27322();
            if (zM27325) {
                thM27322 = null;
            }
            C8058 c8058 = C8058.f24861;
            if (thM27322 != null) {
                m42121(c23703M42118, thM27322);
            }
            C2269 c2269 = interfaceC20197 instanceof C2269 ? (C2269) interfaceC20197 : null;
            if (c2269 == null) {
                C23703 c23703Mo20125 = interfaceC20197.mo20125();
                if (c23703Mo20125 != null) {
                    c2269M42117 = m42117((C20697) c23703Mo20125);
                }
            } else {
                c2269M42117 = c2269;
            }
            if (c2269M42117 != null) {
                while (c2269M42117.f7361.mo26067((1 & 1) == 0, (1 & 2) != 0, new C1831(this, c11005, c2269M42117, obj2)) == C6770.f21025) {
                    c2269M42117 = m42117((C20697) c2269M42117);
                    if (c2269M42117 == null) {
                    }
                }
                return C17353.f53155;
            }
            return m42116(c11005, obj2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2269 m42117(C20697 c20697) {
        while (c20697.mo40262()) {
            c20697 = c20697.m47315();
        }
        while (true) {
            c20697 = c20697.m47312();
            if (!c20697.mo40262()) {
                if (c20697 instanceof C2269) {
                    return (C2269) c20697;
                }
                if (c20697 instanceof C23703) {
                    return null;
                }
            }
        }
    }

    @Override // l.InterfaceC10318
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15673 mo26068(C18059 c18059) {
        return (InterfaceC15673) mo26067((1 & 1) == 0, (1 & 2) != 0, new C2269(c18059));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26921(C5091 c5091) {
        throw c5091;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m42122(m42127()) + '}');
        sb.append('@');
        sb.append(C11024.m27354(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m42122(Object obj) {
        if (obj instanceof C11004) {
            C11004 c11004 = (C11004) obj;
            if (c11004.m27325()) {
                return "Cancelling";
            }
            return c11004.m27327() ? "Completing" : "Active";
        }
        if (obj instanceof InterfaceC20196) {
            return ((InterfaceC20196) obj).mo20124() ? "Active" : "New";
        }
        return obj instanceof C18497 ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object m42127() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC19286)) {
                return obj;
            }
            ((AbstractC19286) obj).mo33080(this);
        }
    }
}
