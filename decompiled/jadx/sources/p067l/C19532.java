package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ᩳ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes5.dex */
public class C19532 implements InterfaceC12175, InterfaceC11486 {

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59475 = AtomicReferenceFieldUpdater.newUpdater(C19532.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    public volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ֫ */
    public String mo28964() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ۡ */
    public boolean mo5668() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo24931(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo36818() {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo5670(Object obj) {
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo44381() {
        return true;
    }

    public C19532(boolean z) {
        this._state = z ? C18861.f56341 : C18861.f56340;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m44371(C19532 c19532, C12827 c12827, C4525 c4525, Object obj) {
        c19532.getClass();
        C4525 c4525M44369 = m44369((C22039) c4525);
        if (c4525M44369 != null) {
            while (c4525M44369.f10149.mo28091((1 & 1) == 0, (1 & 2) != 0, new C4109(c19532, c12827, c4525M44369, obj)) == C8803.f23899) {
                c4525M44369 = m44369((C22039) c4525M44369);
                if (c4525M44369 == null) {
                }
            }
            return;
        }
        c19532.mo5670(c19532.m44368(c12827, obj));
    }

    @Override // p067l.InterfaceC19790
    public final InterfaceC19119 getKey() {
        return C14186.f40444;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19790 mo11134(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        if (C13045.m29864(C14186.f40444, interfaceC19119)) {
            return this;
        }
        return null;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15730(Object obj, InterfaceC21152 interfaceC21152) {
        return interfaceC21152.mo9100(obj, this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo5671(Object obj) {
        mo5670(obj);
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16436 mo15731(InterfaceC16436 interfaceC16436) {
        return C18448.m42008(this, interfaceC16436);
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16436 mo11137(InterfaceC19119 interfaceC19119) {
        return C18448.m42009(this, interfaceC19119);
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m44372(InterfaceC21563 interfaceC21563, Object obj) {
        InterfaceC17264 interfaceC17264 = (InterfaceC17264) this._parentHandle;
        if (interfaceC17264 != null) {
            interfaceC17264.mo13934();
            this._parentHandle = C8803.f23899;
        }
        C7207 c7207 = null;
        C19948 c19948 = obj instanceof C19948 ? (C19948) obj : null;
        Throwable th = c19948 != null ? c19948.f60554 : null;
        if (interfaceC21563 instanceof AbstractC9492) {
            try {
                ((AbstractC9492) interfaceC21563).mo3658(th);
                return;
            } catch (Throwable th2) {
                mo28965(new C7207("Exception in completion handler " + interfaceC21563 + " for " + this, th2));
                return;
            }
        }
        C24896 c24896Mo22101 = interfaceC21563.mo22101();
        if (c24896Mo22101 != null) {
            for (C22039 c22039M49639 = (C22039) c24896Mo22101.m49643(); !C13045.m29864(c22039M49639, c24896Mo22101); c22039M49639 = c22039M49639.m49639()) {
                if (c22039M49639 instanceof AbstractC9492) {
                    AbstractC9492 abstractC9492 = (AbstractC9492) c22039M49639;
                    try {
                        abstractC9492.mo3658(th);
                    } catch (Throwable th3) {
                        if (c7207 == null) {
                            c7207 = new C7207("Exception in completion handler " + abstractC9492 + " for " + this, th3);
                            C10027 c10027 = C10027.f27775;
                        } else {
                            C12710.m29224(c7207, th3);
                        }
                    }
                }
            }
            if (c7207 != null) {
                mo28965(c7207);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC17264 m44383() {
        return (InterfaceC17264) this._parentHandle;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44378(InterfaceC12175 interfaceC12175) {
        C8803 c8803 = C8803.f23899;
        if (interfaceC12175 == null) {
            this._parentHandle = c8803;
            return;
        }
        interfaceC12175.start();
        InterfaceC17264 interfaceC17264Mo28092 = interfaceC12175.mo28092(this);
        this._parentHandle = interfaceC17264Mo28092;
        if (m44379() instanceof InterfaceC21563) {
            return;
        }
        interfaceC17264Mo28092.mo13934();
        this._parentHandle = c8803;
    }

    @Override // p067l.InterfaceC12175
    public final boolean start() {
        while (true) {
            Object objM44379 = m44379();
            boolean z = objM44379 instanceof C17538;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59475;
            if (z) {
                if (((C17538) objM44379).mo22100()) {
                    return false;
                }
                C17538 c17538 = C18861.f56341;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM44379, c17538)) {
                        mo36818();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM44379);
            } else {
                if (!(objM44379 instanceof C23574)) {
                    return false;
                }
                C24896 c24896Mo22101 = ((C23574) objM44379).mo22101();
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM44379, c24896Mo22101)) {
                        mo36818();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM44379);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44377(AbstractC9492 abstractC9492) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objM44379 = m44379();
            if (!(objM44379 instanceof AbstractC9492)) {
                if (!(objM44379 instanceof InterfaceC21563) || ((InterfaceC21563) objM44379).mo22101() == null) {
                    return;
                }
                abstractC9492.m49638();
                return;
            }
            if (objM44379 != abstractC9492) {
                return;
            }
            C17538 c17538 = C18861.f56341;
            do {
                atomicReferenceFieldUpdater = f59475;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM44379, c17538)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM44379);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final Object m44380(Object obj) {
        Object objM44367;
        do {
            objM44367 = m44367(m44379(), obj);
            if (objM44367 == C18861.f56336) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C19948 c19948 = obj instanceof C19948 ? (C19948) obj : null;
                throw new IllegalStateException(str, c19948 != null ? c19948.f60554 : null);
            }
        } while (objM44367 == C18861.f56337);
        return objM44367;
    }

    @Override // p067l.InterfaceC12175
    /* JADX INFO: renamed from: ܽ */
    public boolean mo28094() {
        Object objM44379 = m44379();
        return (objM44379 instanceof InterfaceC21563) && ((InterfaceC21563) objM44379).mo22100();
    }

    /* JADX INFO: renamed from: ֫ */
    private final Object m44368(C12827 c12827, Object obj) {
        Object obj2 = null;
        Throwable c8151 = null;
        C19948 c19948 = obj instanceof C19948 ? (C19948) obj : null;
        Throwable th = c19948 != null ? c19948.f60554 : null;
        synchronized (c12827) {
            c12827.m29387();
            ArrayList<Throwable> arrayListM29386 = c12827.m29386(th);
            if (!arrayListM29386.isEmpty()) {
                for (Object obj3 : arrayListM29386) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c8151 = (Throwable) obj2;
                if (c8151 == null) {
                    c8151 = (Throwable) arrayListM29386.get(0);
                }
            } else if (c12827.m29387()) {
                c8151 = new C8151(mo28964(), null, this);
            }
            if (c8151 != null && arrayListM29386.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM29386.size()));
                for (Throwable th2 : arrayListM29386) {
                    if (th2 != c8151 && th2 != c8151 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C12710.m29224(c8151, th2);
                    }
                }
            }
        }
        if (c8151 != null && c8151 != th) {
            obj = new C19948(c8151, false);
        }
        if (c8151 != null && (m44375(c8151) || mo24931(c8151))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            ((C19948) obj).m45275();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59475;
        Object c6810 = obj instanceof InterfaceC21563 ? new C6810((InterfaceC21563) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c12827, c6810) && atomicReferenceFieldUpdater.get(this) == c12827) {
        }
        m44372((InterfaceC21563) c12827, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ܽ */
    private final boolean m44375(Throwable th) {
        if (!mo5668()) {
            boolean z = th instanceof CancellationException;
            InterfaceC17264 interfaceC17264 = (InterfaceC17264) this._parentHandle;
            if (interfaceC17264 == null || interfaceC17264 == C8803.f23899) {
                return z;
            }
            return interfaceC17264.mo9580(th) || z;
        }
        return true;
    }

    @Override // p067l.InterfaceC12175
    /* JADX INFO: renamed from: ᩳ */
    public final CancellationException mo28095() {
        CancellationException cancellationException;
        Object objM44379 = m44379();
        if (!(objM44379 instanceof C12827)) {
            if (objM44379 instanceof InterfaceC21563) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objM44379 instanceof C19948)) {
                return new C8151(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C19948) objM44379).f60554;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C8151(mo28964(), th, this) : cancellationException;
        }
        Throwable thM29384 = ((C12827) objM44379).m29384();
        if (thM29384 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM29384 instanceof CancellationException ? (CancellationException) thM29384 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo28964();
        }
        return new C8151(strConcat, thM29384, this);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00ed A[EDGE_INSN: B:111:0x00ed->B:88:0x00ed BREAK  A[LOOP:0: B:13:0x0018->B:118:0x0018, LOOP_LABEL: LOOP:0: B:13:0x0018->B:118:0x0018], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea A[ADDED_TO_REGION] */
    @Override // p067l.InterfaceC12175
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10834 mo28091(boolean z, boolean z2, AbstractC9492 abstractC9492) {
        AbstractC9492 abstractC9493;
        Throwable thM29384;
        C18190 c18190;
        int iM49635;
        boolean z3;
        if (z) {
            AbstractC13516 c5469 = abstractC9492 instanceof AbstractC13516 ? (AbstractC13516) abstractC9492 : null;
            if (c5469 == null) {
                c5469 = new C5469(abstractC9492);
            }
            abstractC9493 = c5469;
        } else {
            abstractC9493 = abstractC9492;
        }
        abstractC9493.f25996 = this;
        loop0: while (true) {
            Object objM44379 = m44379();
            if (objM44379 instanceof C17538) {
                C17538 c17538 = (C17538) objM44379;
                if (c17538.mo22100()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59475;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objM44379, abstractC9493)) {
                        if (atomicReferenceFieldUpdater.get(this) != objM44379) {
                        }
                    }
                    break loop0;
                }
                C24896 c24896 = new C24896();
                InterfaceC21563 c23574 = c17538.mo22100() ? c24896 : new C23574(c24896);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f59475;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c17538, c23574) && atomicReferenceFieldUpdater2.get(this) == c17538) {
                }
            } else {
                if (!(objM44379 instanceof InterfaceC21563)) {
                    if (z2) {
                        C19948 c19948 = objM44379 instanceof C19948 ? (C19948) objM44379 : null;
                        abstractC9492.invoke(c19948 != null ? c19948.f60554 : null);
                    }
                    return C8803.f23899;
                }
                InterfaceC21563 interfaceC21563 = (InterfaceC21563) objM44379;
                C24896 c24896Mo22101 = interfaceC21563.mo22101();
                if (c24896Mo22101 != null) {
                    InterfaceC10834 interfaceC10834 = C8803.f23899;
                    if (!z || !(objM44379 instanceof C12827)) {
                        thM29384 = null;
                        if (thM29384 != null) {
                            c18190 = new C18190(abstractC9493, this, interfaceC21563);
                            do {
                                iM49635 = c24896Mo22101.m49642().m49635(abstractC9493, c24896Mo22101, c18190);
                                if (iM49635 != 1) {
                                    break loop0;
                                }
                            } while (iM49635 != 2);
                        } else {
                            if (z2) {
                                abstractC9492.invoke(thM29384);
                            }
                            return interfaceC10834;
                        }
                    } else {
                        synchronized (objM44379) {
                            thM29384 = ((C12827) objM44379).m29384();
                            if (thM29384 == null || ((abstractC9492 instanceof C4525) && !((C12827) objM44379).m29389())) {
                                C18190 c18191 = new C18190(abstractC9493, this, (InterfaceC21563) objM44379);
                                while (true) {
                                    int iM49636 = c24896Mo22101.m49642().m49635(abstractC9493, c24896Mo22101, c18191);
                                    if (iM49636 == 1) {
                                        z3 = true;
                                        break;
                                    }
                                    if (iM49636 == 2) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (thM29384 == null) {
                                        return abstractC9493;
                                    }
                                    interfaceC10834 = abstractC9493;
                                }
                            }
                            C10027 c10027 = C10027.f27775;
                        }
                        if (thM29384 != null) {
                            c18190 = new C18190(abstractC9493, this, interfaceC21563);
                            do {
                                iM49635 = c24896Mo22101.m49642().m49635(abstractC9493, c24896Mo22101, c18190);
                                if (iM49635 != 1) {
                                    break loop0;
                                    break loop0;
                                }
                            } while (iM49635 != 2);
                        } else {
                            if (z2) {
                                abstractC9492.invoke(thM29384);
                            }
                            return interfaceC10834;
                        }
                    }
                } else {
                    AbstractC9492 abstractC9494 = (AbstractC9492) objM44379;
                    abstractC9494.m49636(new C24896());
                    C22039 c22039M49639 = abstractC9494.m49639();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f59475;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, abstractC9494, c22039M49639) && atomicReferenceFieldUpdater3.get(this) == abstractC9494) {
                    }
                }
            }
        }
        return abstractC9493;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m44373(C24896 c24896, Throwable th) {
        C7207 c7207 = null;
        for (C22039 c22039M49639 = (C22039) c24896.m49643(); !C13045.m29864(c22039M49639, c24896); c22039M49639 = c22039M49639.m49639()) {
            if (c22039M49639 instanceof AbstractC13516) {
                AbstractC9492 abstractC9492 = (AbstractC9492) c22039M49639;
                try {
                    abstractC9492.mo3658(th);
                } catch (Throwable th2) {
                    if (c7207 == null) {
                        c7207 = new C7207("Exception in completion handler " + abstractC9492 + " for " + this, th2);
                        C10027 c10027 = C10027.f27775;
                    } else {
                        C12710.m29224(c7207, th2);
                    }
                }
            }
        }
        if (c7207 != null) {
            mo28965(c7207);
        }
        m44375(th);
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
    /* JADX INFO: renamed from: ܿ */
    public final boolean m44382(Object obj) {
        Throwable thM44376;
        Object objM44379;
        Throwable thM29384;
        C16672 c16672;
        InterfaceC21563 interfaceC21563;
        C24896 c24896M44370;
        C12827 c12827;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM44367 = C18861.f56336;
        if (this instanceof C24244) {
            do {
                Object objM443710 = m44379();
                if (!(objM443710 instanceof InterfaceC21563) || ((objM443710 instanceof C12827) && ((C12827) objM443710).m29389())) {
                    objM44367 = C18861.f56336;
                    break;
                }
                objM44367 = m44367(objM443710, new C19948(m44376(obj), false));
            } while (objM44367 == C18861.f56337);
            if (objM44367 != C18861.f56339) {
                if (objM44367 == C18861.f56336) {
                    thM44376 = null;
                    loop1: while (true) {
                        objM44379 = m44379();
                        if (objM44379 instanceof C12827) {
                            synchronized (objM44379) {
                                if (((C12827) objM44379).m29388()) {
                                    c16672 = C18861.f56342;
                                } else {
                                    boolean zM29387 = ((C12827) objM44379).m29387();
                                    if (obj == null || !zM29387) {
                                        if (thM44376 == null) {
                                            thM44376 = m44376(obj);
                                        }
                                        ((C12827) objM44379).m29385(thM44376);
                                    }
                                    thM29384 = zM29387 ? null : ((C12827) objM44379).m29384();
                                    if (thM29384 != null) {
                                        m44373(((C12827) objM44379).mo22101(), thM29384);
                                    }
                                    c16672 = C18861.f56336;
                                }
                            }
                        } else if (objM44379 instanceof InterfaceC21563) {
                            if (thM44376 == null) {
                                thM44376 = m44376(obj);
                            }
                            interfaceC21563 = (InterfaceC21563) objM44379;
                            if (interfaceC21563.mo22100()) {
                                c24896M44370 = m44370(interfaceC21563);
                                if (c24896M44370 == null) {
                                    continue;
                                } else {
                                    c12827 = new C12827(c24896M44370, thM44376);
                                    atomicReferenceFieldUpdater = f59475;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC21563, c12827)) {
                                            m44373(c24896M44370, thM44376);
                                            c16672 = C18861.f56336;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC21563) {
                                        }
                                    }
                                }
                            } else {
                                objM44367 = m44367(objM44379, new C19948(thM44376, false));
                                if (objM44367 != C18861.f56336) {
                                    throw new IllegalStateException(("Cannot happen in " + objM44379).toString());
                                }
                                if (objM44367 != C18861.f56337) {
                                    break;
                                }
                            }
                        } else {
                            c16672 = C18861.f56342;
                        }
                        objM44367 = c16672;
                        break;
                    }
                }
                if (objM44367 != C18861.f56336 && objM44367 != C18861.f56339) {
                    if (objM44367 == C18861.f56342) {
                        return false;
                    }
                    mo5670(objM44367);
                    return true;
                }
            }
        } else {
            if (objM44367 == C18861.f56336) {
                thM44376 = null;
                loop1: while (true) {
                    objM44379 = m44379();
                    if (objM44379 instanceof C12827) {
                        synchronized (objM44379) {
                            if (((C12827) objM44379).m29388()) {
                                c16672 = C18861.f56342;
                            } else {
                                boolean zM29388 = ((C12827) objM44379).m29387();
                                if (obj == null) {
                                    if (thM44376 == null) {
                                        thM44376 = m44376(obj);
                                    }
                                    ((C12827) objM44379).m29385(thM44376);
                                } else {
                                    if (thM44376 == null) {
                                        thM44376 = m44376(obj);
                                    }
                                    ((C12827) objM44379).m29385(thM44376);
                                }
                                if (zM29388) {
                                }
                                if (thM29384 != null) {
                                    m44373(((C12827) objM44379).mo22101(), thM29384);
                                }
                                c16672 = C18861.f56336;
                            }
                        }
                    } else if (objM44379 instanceof InterfaceC21563) {
                        if (thM44376 == null) {
                            thM44376 = m44376(obj);
                        }
                        interfaceC21563 = (InterfaceC21563) objM44379;
                        if (interfaceC21563.mo22100()) {
                            c24896M44370 = m44370(interfaceC21563);
                            if (c24896M44370 == null) {
                                continue;
                            } else {
                                c12827 = new C12827(c24896M44370, thM44376);
                                atomicReferenceFieldUpdater = f59475;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC21563, c12827)) {
                                        m44373(c24896M44370, thM44376);
                                        c16672 = C18861.f56336;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC21563) {
                                    }
                                }
                            }
                        } else {
                            objM44367 = m44367(objM44379, new C19948(thM44376, false));
                            if (objM44367 != C18861.f56336) {
                                throw new IllegalStateException(("Cannot happen in " + objM44379).toString());
                            }
                            if (objM44367 != C18861.f56337) {
                                break;
                                break;
                            }
                        }
                    } else {
                        c16672 = C18861.f56342;
                    }
                    objM44367 = c16672;
                    break;
                }
            }
            if (objM44367 != C18861.f56336) {
                if (objM44367 == C18861.f56342) {
                    return false;
                }
                mo5670(objM44367);
                return true;
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC12175
    /* JADX INFO: renamed from: ֫ */
    public final void mo28093(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C8151(mo28964(), null, this);
        }
        m44382(cancellationException);
    }

    @Override // p067l.InterfaceC11486
    /* JADX INFO: renamed from: ᩻ */
    public final CancellationException mo26542() {
        Throwable thM29384;
        Object objM44379 = m44379();
        if (objM44379 instanceof C12827) {
            thM29384 = ((C12827) objM44379).m29384();
        } else if (objM44379 instanceof C19948) {
            thM29384 = ((C19948) objM44379).f60554;
        } else {
            if (objM44379 instanceof InterfaceC21563) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM44379).toString());
            }
            thM29384 = null;
        }
        CancellationException cancellationException = thM29384 instanceof CancellationException ? (CancellationException) thM29384 : null;
        return cancellationException == null ? new C8151("Parent job is ".concat(m44374(objM44379)), thM29384, this) : cancellationException;
    }

    /* JADX INFO: renamed from: ᩻ */
    private final Throwable m44376(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C8151(mo28964(), null, this) : th;
        }
        if (obj != null) {
            return ((InterfaceC11486) obj).mo26542();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* JADX INFO: renamed from: ֫ */
    private final C24896 m44370(InterfaceC21563 interfaceC21563) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C24896 c24896Mo22101 = interfaceC21563.mo22101();
        if (c24896Mo22101 != null) {
            return c24896Mo22101;
        }
        if (interfaceC21563 instanceof C17538) {
            return new C24896();
        }
        if (!(interfaceC21563 instanceof AbstractC9492)) {
            throw new IllegalStateException(("State should have list: " + interfaceC21563).toString());
        }
        AbstractC9492 abstractC9492 = (AbstractC9492) interfaceC21563;
        abstractC9492.m49636(new C24896());
        C22039 c22039M49639 = abstractC9492.m49639();
        do {
            atomicReferenceFieldUpdater = f59475;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC9492, c22039M49639)) {
                return null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC9492);
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private final Object m44367(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC21563)) {
            return C18861.f56336;
        }
        if (((obj instanceof C17538) || (obj instanceof AbstractC9492)) && !(obj instanceof C4525) && !(obj2 instanceof C19948)) {
            InterfaceC21563 interfaceC21563 = (InterfaceC21563) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59475;
            Object c6810 = obj2 instanceof InterfaceC21563 ? new C6810((InterfaceC21563) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC21563, c6810)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC21563) {
                    return C18861.f56337;
                }
            }
            m44372(interfaceC21563, obj2);
            return obj2;
        }
        InterfaceC21563 interfaceC21564 = (InterfaceC21563) obj;
        C24896 c24896M44370 = m44370(interfaceC21564);
        if (c24896M44370 == null) {
            return C18861.f56337;
        }
        C4525 c4525M44369 = null;
        C12827 c12827 = interfaceC21564 instanceof C12827 ? (C12827) interfaceC21564 : null;
        if (c12827 == null) {
            c12827 = new C12827(c24896M44370, null);
        }
        C12827 c12828 = c12827;
        synchronized (c12828) {
            if (c12828.m29389()) {
                return C18861.f56336;
            }
            c12828.m29390();
            if (c12828 != interfaceC21564) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f59475;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC21564, c12828)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC21564) {
                        return C18861.f56337;
                    }
                }
            }
            boolean zM29387 = c12828.m29387();
            C19948 c19948 = obj2 instanceof C19948 ? (C19948) obj2 : null;
            if (c19948 != null) {
                c12828.m29385(c19948.f60554);
            }
            Throwable thM29384 = c12828.m29384();
            if (zM29387) {
                thM29384 = null;
            }
            C10027 c10027 = C10027.f27775;
            if (thM29384 != null) {
                m44373(c24896M44370, thM29384);
            }
            C4525 c4525 = interfaceC21564 instanceof C4525 ? (C4525) interfaceC21564 : null;
            if (c4525 == null) {
                C24896 c24896Mo22101 = interfaceC21564.mo22101();
                if (c24896Mo22101 != null) {
                    c4525M44369 = m44369((C22039) c24896Mo22101);
                }
            } else {
                c4525M44369 = c4525;
            }
            if (c4525M44369 != null) {
                while (c4525M44369.f10149.mo28091((1 & 1) == 0, (1 & 2) != 0, new C4109(this, c12828, c4525M44369, obj2)) == C8803.f23899) {
                    c4525M44369 = m44369((C22039) c4525M44369);
                    if (c4525M44369 == null) {
                    }
                }
                return C18861.f56339;
            }
            return m44368(c12828, obj2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4525 m44369(C22039 c22039) {
        while (c22039.mo42507()) {
            c22039 = c22039.m49642();
        }
        while (true) {
            c22039 = c22039.m49639();
            if (!c22039.mo42507()) {
                if (c22039 instanceof C4525) {
                    return (C4525) c22039;
                }
                if (c22039 instanceof C24896) {
                    return null;
                }
            }
        }
    }

    @Override // p067l.InterfaceC12175
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17264 mo28092(C19532 c19532) {
        return (InterfaceC17264) mo28091((1 & 1) == 0, (1 & 2) != 0, new C4525(c19532));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28965(C7207 c7207) {
        throw c7207;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m44374(m44379()) + '}');
        sb.append('@');
        sb.append(C12846.m29416(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m44374(Object obj) {
        if (obj instanceof C12827) {
            C12827 c12827 = (C12827) obj;
            if (c12827.m29387()) {
                return "Cancelling";
            }
            return c12827.m29389() ? "Completing" : "Active";
        }
        if (obj instanceof InterfaceC21563) {
            return ((InterfaceC21563) obj).mo22100() ? "Active" : "New";
        }
        return obj instanceof C19948 ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: ۢ */
    public final Object m44379() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC20698)) {
                return obj;
            }
            ((AbstractC20698) obj).mo35195(this);
        }
    }
}
