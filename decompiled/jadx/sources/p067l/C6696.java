package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6696 {

    /* JADX INFO: renamed from: ֡ */
    public AbstractC5375 f17352;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23460 f17353;

    /* JADX INFO: renamed from: ۢ */
    public boolean f17358;

    /* JADX INFO: renamed from: ۧ */
    public C16861 f17359;

    /* JADX INFO: renamed from: ܺ */
    public C10069 f17361;

    /* JADX INFO: renamed from: ᩳ */
    public ExecutorService f17364;

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC15599 f17366;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f17367 = C7050.m16218();

    /* JADX INFO: renamed from: ۡ */
    public final List f17357 = C18426.m41997();

    /* JADX INFO: renamed from: ܽ */
    public final AtomicReference f17362 = new AtomicReference();

    /* JADX INFO: renamed from: ۜ */
    public final List f17356 = C18426.m41997();

    /* JADX INFO: renamed from: ۘ */
    public final C6455 f17355 = new C6455(0);

    /* JADX INFO: renamed from: ᩻ */
    public final ThreadLocal f17368 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC22898 f17363 = new C6727(false);

    /* JADX INFO: renamed from: ܳ */
    public boolean f17360 = false;

    /* JADX INFO: renamed from: ᩴ */
    public final C21449 f17365 = new C21449(this);

    /* JADX INFO: renamed from: ۖ */
    public ArrayList f17354 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m15290(InterfaceC22898 interfaceC22898) {
        this.f17363 = interfaceC22898;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m15293() {
        this.f17360 = true;
        this.f17363.mo15384();
    }

    /* JADX WARN: Code duplicated, block: B:171:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:178:0x02bf  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final void m15289(AbstractC15599 abstractC15599, AbstractC5375 abstractC5375, String[] strArr, String str, InterfaceC23460 interfaceC23460) {
        Throwable th;
        C20661 c20661;
        Exception e;
        C20661 c20662;
        ExecutorService executorService;
        C20661 c20663;
        C20661 c20664;
        AbstractC15599 abstractC155910;
        AtomicReference atomicReference;
        C20661 c20665;
        C6455 c6455 = this.f17355;
        this.f17366 = abstractC15599;
        this.f17352 = abstractC5375;
        this.f17353 = interfaceC23460;
        if (abstractC15599 instanceof AbstractC5375) {
            this.f17358 = ((AbstractC5375) abstractC15599).f12758.f14161 == abstractC5375.f12758.f14161;
        } else {
            this.f17358 = false;
        }
        AbstractC17043 abstractC17043 = null;
        try {
            this.f17364 = Executors.newFixedThreadPool(abstractC5375.m11748());
            this.f17361 = new C10069(abstractC5375);
            C16861 c16861M38376 = C16861.m38376(str, abstractC5375, this.f17363, new C16753(this, interfaceC23460));
            this.f17359 = c16861M38376;
            if (!abstractC5375.f12758.f14155) {
                c16861M38376.m38407();
            }
            if (abstractC15599.mo9723()) {
                AbstractC17043 abstractC17043M38685 = C17853.f53278.m38685();
                try {
                    C20423 c20423 = new C20423();
                    interfaceC23460.setTitle(R.string.MT_Protector);
                    interfaceC23460.mo12137(true);
                    interfaceC23460.mo12136("...");
                    c20423.m46105(abstractC17043M38685, abstractC15599, strArr, new C22790(interfaceC23460));
                    if (interfaceC23460.mo3924()) {
                        ExecutorService executorService2 = this.f17364;
                        if (executorService2 != null && !executorService2.isShutdown()) {
                            this.f17364.shutdownNow();
                        }
                        c6455.m14743();
                        abstractC17043M38685.mo25503();
                        return;
                    }
                    c20665 = new C20661(abstractC17043M38685.mo25505());
                    try {
                        this.f17366 = c20665;
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC19370 interfaceC19370 : c20665.mo9708("/", true)) {
                            if (interfaceC19370.isDirectory()) {
                                arrayList.add(interfaceC19370.getPath() + "/");
                            } else {
                                arrayList.add(interfaceC19370.getPath());
                            }
                        }
                        strArr = (String[]) arrayList.toArray(new String[0]);
                        interfaceC23460.mo12137(false);
                        abstractC17043 = abstractC17043M38685;
                        c20664 = c20665;
                        abstractC155910 = c20665;
                    } catch (Exception e2) {
                        e = e2;
                        abstractC17043 = abstractC17043M38685;
                        c20662 = c20665;
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC17043 = abstractC17043M38685;
                        c20661 = c20665;
                        executorService = this.f17364;
                        if (executorService != null) {
                            this.f17364.shutdownNow();
                        }
                        c6455.m14743();
                        if (abstractC17043 != null) {
                            abstractC17043.mo25503();
                        }
                        if (c20661 != null) {
                            C2700.m4192(c20661);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c20665 = null;
                } catch (Throwable th3) {
                    th = th3;
                    c20665 = null;
                }
                abstractC17043 = abstractC17043M38685;
                c20662 = c20665;
                try {
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c20663 = c20662;
                    c20661 = c20663;
                    executorService = this.f17364;
                    if (executorService != null && !executorService.isShutdown()) {
                        this.f17364.shutdownNow();
                    }
                    c6455.m14743();
                    if (abstractC17043 != null) {
                        abstractC17043.mo25503();
                    }
                    if (c20661 != null) {
                        C2700.m4192(c20661);
                    }
                    throw th;
                }
            }
            c20664 = null;
            abstractC155910 = abstractC15599;
            try {
                if (this.f17360 && this.f17358) {
                    this.f17359.m38400(strArr, abstractC5375, interfaceC23460);
                    Iterator it = this.f17359.m38405().iterator();
                    while (it.hasNext()) {
                        Object objM6134 = ((AbstractC3451) it.next()).m6134();
                        if (objM6134 instanceof String) {
                            this.f17356.add((String) objM6134);
                        }
                    }
                } else {
                    this.f17359.m38402(strArr, abstractC155910, abstractC5375, interfaceC23460);
                }
                interfaceC23460.setTitle(this.f17360 ? R.string.MT_Protector : R.string.MT_Protector);
                interfaceC23460.mo5837(this.f17359);
                interfaceC23460.mo5838();
                c6455.m14742();
                Iterator it2 = this.f17359.m38409().iterator();
                while (it2.hasNext()) {
                    m15279((AbstractC3451) it2.next());
                }
                this.f17364.shutdown();
                while (true) {
                    ExecutorService executorService3 = this.f17364;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    boolean zAwaitTermination = executorService3.awaitTermination(1L, timeUnit);
                    atomicReference = this.f17362;
                    if (zAwaitTermination) {
                        break;
                    }
                    if (interfaceC23460.mo3924() || atomicReference.get() != null) {
                        this.f17364.awaitTermination(3L, timeUnit);
                        break;
                    }
                }
                if (interfaceC23460.mo3924()) {
                    ExecutorService executorService4 = this.f17364;
                    if (executorService4 != null && !executorService4.isShutdown()) {
                        this.f17364.shutdownNow();
                    }
                    c6455.m14743();
                    if (abstractC17043 != null) {
                        abstractC17043.mo25503();
                    }
                    if (c20664 != null) {
                        C2700.m4192(c20664);
                        return;
                    }
                    return;
                }
                if (atomicReference.get() != null) {
                    throw ((Exception) atomicReference.get());
                }
                if (this.f17360) {
                    if (abstractC155910 instanceof C4744) {
                        Iterator it3 = this.f17359.m38409().iterator();
                        while (it3.hasNext()) {
                            C19389.m44136((AbstractC3451) it3.next());
                            if (interfaceC23460.mo3924()) {
                                ExecutorService executorService5 = this.f17364;
                                if (executorService5 != null && !executorService5.isShutdown()) {
                                    this.f17364.shutdownNow();
                                }
                                c6455.m14743();
                                if (abstractC17043 != null) {
                                    abstractC17043.mo25503();
                                }
                                if (c20664 != null) {
                                    C2700.m4192(c20664);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (abstractC155910 instanceof AbstractC5375) {
                        AbstractC5375 abstractC5376 = (AbstractC5375) abstractC155910;
                        Iterator it4 = this.f17359.m38409().iterator();
                        while (it4.hasNext()) {
                            m15280(abstractC5376, (AbstractC3451) it4.next());
                            if (interfaceC23460.mo3924()) {
                                ExecutorService executorService6 = this.f17364;
                                if (executorService6 != null && !executorService6.isShutdown()) {
                                    this.f17364.shutdownNow();
                                }
                                c6455.m14743();
                                if (abstractC17043 != null) {
                                    abstractC17043.mo25503();
                                }
                                if (c20664 != null) {
                                    C2700.m4192(c20664);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Iterator it5 = this.f17357.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC20136) it5.next()).run();
                    if (interfaceC23460.mo3924()) {
                        ExecutorService executorService7 = this.f17364;
                        if (executorService7 != null && !executorService7.isShutdown()) {
                            this.f17364.shutdownNow();
                        }
                        c6455.m14743();
                        if (abstractC17043 != null) {
                            abstractC17043.mo25503();
                        }
                        if (c20664 != null) {
                            C2700.m4192(c20664);
                            return;
                        }
                        return;
                    }
                }
                ExecutorService executorService8 = this.f17364;
                if (executorService8 != null && !executorService8.isShutdown()) {
                    this.f17364.shutdownNow();
                }
                c6455.m14743();
                if (abstractC17043 != null) {
                    abstractC17043.mo25503();
                }
                if (c20664 != null) {
                    C2700.m4192(c20664);
                }
            } catch (Exception e4) {
                e = e4;
                c20662 = c20664;
            } catch (Throwable th5) {
                th = th5;
                c20663 = c20664;
                c20661 = c20663;
                executorService = this.f17364;
                if (executorService != null) {
                    this.f17364.shutdownNow();
                }
                c6455.m14743();
                if (abstractC17043 != null) {
                    abstractC17043.mo25503();
                }
                if (c20661 != null) {
                    C2700.m4192(c20661);
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            c20662 = null;
        } catch (Throwable th6) {
            th = th6;
            c20661 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15280(AbstractC5375 abstractC5375, AbstractC3451 abstractC3451) {
        if (abstractC3451.m6129()) {
            String str = abstractC3451.m6151() + "/";
            Iterator it = this.f17354.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return;
                }
            }
            C2780 c2780Mo4359 = abstractC3451.mo4359();
            if (c2780Mo4359.m4362()) {
                Iterator it2 = c2780Mo4359.m4364().iterator();
                while (it2.hasNext()) {
                    m15280(abstractC5375, (AbstractC3451) it2.next());
                }
            } else {
                this.f17353.setTitle(R.string.MT_Protector);
                this.f17353.mo12136(abstractC3451.m6139());
                C12296.m28315(abstractC5375, c2780Mo4359);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15284(AbstractC3451 abstractC3451) {
        AbstractC15599 abstractC15599 = this.f17366;
        if (abstractC15599 instanceof C4744) {
            abstractC3451.m6131().mo25503();
        } else if (abstractC15599 instanceof AbstractC5375) {
            ((AbstractC5375) abstractC15599).m11741(abstractC3451.m6151(), false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15599 m15291() {
        return this.f17366;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC5375 m15292() {
        return this.f17352;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m15288() {
        return this.f17356;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15279(AbstractC3451 abstractC3451) {
        this.f17364.submit(new RunnableC19642(2, this, abstractC3451));
        if (abstractC3451.m6129()) {
            Iterator it = abstractC3451.mo4359().m4364().iterator();
            while (it.hasNext()) {
                m15279((AbstractC3451) it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0267 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0279 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0109 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0130 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0170 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0176 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e6 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX INFO: renamed from: ֫ */
    public static void m15282(final C6696 c6696, final AbstractC3451 abstractC3451) {
        int i;
        String strM6141;
        String strMo11753;
        AbstractC5375 abstractC5375;
        int i2;
        String strM6142;
        AbstractC5375 abstractC5376;
        int i3;
        final String strM6143;
        AbstractC5375 abstractC5377;
        int i4;
        ArrayList arrayList = c6696.f17354;
        AtomicReference atomicReference = c6696.f17362;
        if (c6696.f17353.mo3924() || atomicReference.get() != null) {
            abstractC3451.m6132();
            return;
        }
        c6696.f17368.set(abstractC3451.m6139());
        c6696.f17353.setName(abstractC3451.m6139());
        abstractC3451.m6140();
        if (c6696.f17366 instanceof C4744) {
            String strM6151 = abstractC3451.m6151();
            if (C18524.m42130(strM6151) || C18524.m42120(strM6151)) {
                i = 292;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        try {
            try {
                if (c6696.f17360 && c6696.f17358) {
                    String strM6152 = abstractC3451.m6151();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (strM6152.startsWith((String) it.next())) {
                                if (!abstractC3451.m6129()) {
                                    long jM6154 = abstractC3451.m6154();
                                    c6696.f17365.mo7909(jM6154, jM6154, jM6154, 0L);
                                }
                            }
                        } else if (abstractC3451.m6129()) {
                            if (!abstractC3451.m6120()) {
                                strM6143 = abstractC3451.m6141();
                                if (c6696.f17360) {
                                    c6696.f17352.mo11746(strM6143);
                                    if (!c6696.f17353.mo3924()) {
                                        abstractC5377 = c6696.f17352;
                                        i4 = i | abstractC3451.m6145().f60012;
                                        if (abstractC5377.mo11752()) {
                                            abstractC5377.mo11738(i4, strM6143);
                                        }
                                    }
                                    if (c6696.f17367) {
                                        c6696.f17357.add(new InterfaceC20136() { // from class: l.۠ۡ᩻
                                            @Override // p067l.InterfaceC20136
                                            public final void run() {
                                                C6696.m15281(this.f27799, strM6143, abstractC3451);
                                            }
                                        });
                                    }
                                } else {
                                    c6696.f17352.mo11746(strM6143);
                                    if (!c6696.f17353.mo3924()) {
                                        abstractC5377 = c6696.f17352;
                                        i4 = i | abstractC3451.m6145().f60012;
                                        if (abstractC5377.mo11752()) {
                                            abstractC5377.mo11738(i4, strM6143);
                                        }
                                    }
                                    if (c6696.f17367) {
                                        c6696.f17357.add(new InterfaceC20136() { // from class: l.۠ۡ᩻
                                            @Override // p067l.InterfaceC20136
                                            public final void run() {
                                                C6696.m15281(this.f27799, strM6143, abstractC3451);
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (!abstractC3451.m6120()) {
                            strM6142 = abstractC3451.m6141();
                            if (!c6696.f17360) {
                                c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6142, false, c6696.f17365);
                                if (!c6696.f17353.mo3924()) {
                                    abstractC5376 = c6696.f17352;
                                    i3 = i | abstractC3451.m6145().f60012;
                                    if (abstractC5376.mo11752()) {
                                        abstractC5376.mo11738(i3, strM6142);
                                    }
                                }
                                if (c6696.f17360) {
                                    c6696.m15284(abstractC3451);
                                }
                            } else {
                                c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6142, false, c6696.f17365);
                                if (!c6696.f17353.mo3924()) {
                                    abstractC5376 = c6696.f17352;
                                    i3 = i | abstractC3451.m6145().f60012;
                                    if (abstractC5376.mo11752()) {
                                        abstractC5376.mo11738(i3, strM6142);
                                    }
                                }
                                if (c6696.f17360) {
                                    c6696.m15284(abstractC3451);
                                }
                            }
                        } else if (abstractC3451.m6149()) {
                            strMo11753 = c6696.f17352.mo11753(abstractC3451.m6141());
                            if (!c6696.f17360) {
                                c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strMo11753, false, c6696.f17365);
                                if (!c6696.f17353.mo3924()) {
                                    abstractC5375 = c6696.f17352;
                                    i2 = i | abstractC3451.m6145().f60012;
                                    if (abstractC5375.mo11752()) {
                                        abstractC5375.mo11738(i2, strMo11753);
                                    }
                                }
                                if (c6696.f17360) {
                                    c6696.m15284(abstractC3451);
                                }
                            } else {
                                c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strMo11753, false, c6696.f17365);
                                if (!c6696.f17353.mo3924()) {
                                    abstractC5375 = c6696.f17352;
                                    i2 = i | abstractC3451.m6145().f60012;
                                    if (abstractC5375.mo11752()) {
                                        abstractC5375.mo11738(i2, strMo11753);
                                    }
                                }
                                if (c6696.f17360) {
                                    c6696.m15284(abstractC3451);
                                }
                            }
                            if (abstractC3451.m6134() != null) {
                                abstractC3451.m6148(C11419.m26414(strMo11753));
                            }
                        } else {
                            strM6141 = abstractC3451.m6141();
                            if (c6696.f17360) {
                                c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6141, false, c6696.f17365);
                                if (c6696.f17360) {
                                    c6696.m15284(abstractC3451);
                                }
                            } else {
                                c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6141, false, c6696.f17365);
                                if (c6696.f17360) {
                                    c6696.m15284(abstractC3451);
                                }
                            }
                        }
                    }
                } else if (abstractC3451.m6129()) {
                    if (!abstractC3451.m6120()) {
                        strM6143 = abstractC3451.m6141();
                        if (c6696.f17360 || !c6696.f17358) {
                            c6696.f17352.mo11746(strM6143);
                            if (!c6696.f17353.mo3924() && abstractC3451.m6145() != null) {
                                abstractC5377 = c6696.f17352;
                                i4 = i | abstractC3451.m6145().f60012;
                                if (abstractC5377.mo11752()) {
                                    try {
                                        abstractC5377.mo11738(i4, strM6143);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            if (c6696.f17367 && c6696.f17352.mo11731()) {
                                c6696.f17357.add(new InterfaceC20136() { // from class: l.۠ۡ᩻
                                    @Override // p067l.InterfaceC20136
                                    public final void run() {
                                        C6696.m15281(this.f27799, strM6143, abstractC3451);
                                    }
                                });
                            }
                        } else {
                            AbstractC5375 abstractC5378 = c6696.f17352;
                            abstractC5378.getClass();
                            if ((abstractC5378 instanceof C9202) || !c6696.f17352.mo11740(abstractC3451.m6151(), strM6143)) {
                                c6696.f17352.mo11746(strM6143);
                                if (!c6696.f17353.mo3924()) {
                                    abstractC5377 = c6696.f17352;
                                    i4 = i | abstractC3451.m6145().f60012;
                                    if (abstractC5377.mo11752()) {
                                        abstractC5377.mo11738(i4, strM6143);
                                    }
                                }
                                if (c6696.f17367) {
                                    c6696.f17357.add(new InterfaceC20136() { // from class: l.۠ۡ᩻
                                        @Override // p067l.InterfaceC20136
                                        public final void run() {
                                            C6696.m15281(this.f27799, strM6143, abstractC3451);
                                        }
                                    });
                                }
                            } else {
                                arrayList.add(abstractC3451.m6151() + "/");
                            }
                        }
                    }
                } else if (!abstractC3451.m6120()) {
                    strM6142 = abstractC3451.m6141();
                    if (!c6696.f17360 && c6696.f17358 && c6696.f17352.mo11740(abstractC3451.m6151(), strM6142)) {
                        long jM6155 = abstractC3451.m6154();
                        c6696.f17365.mo7909(jM6155, jM6155, jM6155, 0L);
                    } else {
                        c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6142, false, c6696.f17365);
                        if (!c6696.f17353.mo3924() && abstractC3451.m6145() != null) {
                            abstractC5376 = c6696.f17352;
                            i3 = i | abstractC3451.m6145().f60012;
                            if (abstractC5376.mo11752()) {
                                try {
                                    abstractC5376.mo11738(i3, strM6142);
                                } catch (IOException unused2) {
                                }
                            }
                        }
                        if (c6696.f17360 && !c6696.f17353.mo3924()) {
                            c6696.m15284(abstractC3451);
                        }
                    }
                } else if (abstractC3451.m6149()) {
                    strMo11753 = c6696.f17352.mo11753(abstractC3451.m6141());
                    if (!c6696.f17360 && c6696.f17358 && c6696.f17352.mo11740(abstractC3451.m6151(), strMo11753)) {
                        long jM6156 = abstractC3451.m6154();
                        c6696.f17365.mo7909(jM6156, jM6156, jM6156, 0L);
                    } else {
                        c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strMo11753, false, c6696.f17365);
                        if (!c6696.f17353.mo3924() && abstractC3451.m6145() != null) {
                            abstractC5375 = c6696.f17352;
                            i2 = i | abstractC3451.m6145().f60012;
                            if (abstractC5375.mo11752()) {
                                try {
                                    abstractC5375.mo11738(i2, strMo11753);
                                } catch (IOException unused3) {
                                }
                            }
                        }
                        if (c6696.f17360 && !c6696.f17353.mo3924()) {
                            c6696.m15284(abstractC3451);
                        }
                    }
                    if (abstractC3451.m6134() != null) {
                        abstractC3451.m6148(C11419.m26414(strMo11753));
                    }
                } else {
                    strM6141 = abstractC3451.m6141();
                    if (c6696.f17360 || !c6696.f17358) {
                        c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6141, false, c6696.f17365);
                        if (c6696.f17360 && !c6696.f17353.mo3924()) {
                            c6696.m15284(abstractC3451);
                        }
                    } else {
                        String strM26416 = C11419.m26416(strM6141);
                        String str = C19158.m43632(System.currentTimeMillis()) + Long.toString(((long) strM6141.hashCode()) & 4294967295L, 16) + ".tmp";
                        if (strM26416 != null) {
                            str = strM26416 + str;
                        }
                        if (c6696.f17352.mo11740(abstractC3451.m6151(), str) && c6696.f17352.m11741(strM6141, false) && c6696.f17352.mo11740(str, strM6141)) {
                            long jM6157 = abstractC3451.m6154();
                            c6696.f17365.mo7909(jM6157, jM6157, jM6157, 0L);
                        } else {
                            c6696.f17361.m23503(c6696.f17366, abstractC3451.m6151(), strM6141, false, c6696.f17365);
                            if (c6696.f17360) {
                                c6696.m15284(abstractC3451);
                            }
                        }
                    }
                }
                abstractC3451.m6132();
                if (c6696.f17353.mo3924()) {
                    return;
                }
                c6696.f17359.m50045();
                if (abstractC3451.m6134() != null) {
                    c6696.f17356.add((String) abstractC3451.m6134());
                }
                c6696.f17353.mo5837(c6696.f17359);
                c6696.f17353.setProgress(c6696.f17359.m50042());
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                abstractC3451.m6132();
            }
        } catch (Throwable th) {
            abstractC3451.m6132();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15281(C6696 c6696, String str, AbstractC3451 abstractC3451) {
        try {
            if (c6696.f17352.mo11731()) {
                c6696.f17352.mo11744(abstractC3451.m6128(), str);
            }
        } catch (Exception unused) {
        }
    }
}
