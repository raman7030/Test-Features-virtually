package l;

import bin.mt.plus.R;
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
public final class C4553 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f14523;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22192 f14524;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f14529;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15249 f14530;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8102 f14532;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ExecutorService f14535;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC13921 f14537;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f14538 = C4925.m14321();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List f14528 = C16895.m39756();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f14533 = new AtomicReference();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f14527 = C16895.m39756();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4300 f14526 = new C4300(0);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f14539 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21601 f14534 = new C4586(false);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f14531 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20076 f14536 = new C20076(this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f14525 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13402(InterfaceC21601 interfaceC21601) {
        this.f14534 = interfaceC21601;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m13405() {
        this.f14531 = true;
        this.f14534.mo13495();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13401(AbstractC13921 abstractC13921, AbstractC3163 abstractC3163, String[] strArr, String str, InterfaceC22192 interfaceC22192) {
        Throwable th;
        C19247 c19247;
        Exception e;
        C19247 c19248;
        ExecutorService executorService;
        C19247 c19249;
        C19247 c192410;
        AbstractC13921 abstractC13922;
        AtomicReference atomicReference;
        C19247 c192411;
        C4300 c4300 = this.f14526;
        this.f14537 = abstractC13921;
        this.f14523 = abstractC3163;
        this.f14524 = interfaceC22192;
        if (abstractC13921 instanceof AbstractC3163) {
            this.f14529 = ((AbstractC3163) abstractC13921).f9955.f11356 == abstractC3163.f9955.f11356;
        } else {
            this.f14529 = false;
        }
        AbstractC15440 abstractC15440 = null;
        try {
            this.f14535 = Executors.newFixedThreadPool(abstractC3163.m9704());
            this.f14532 = new C8102(abstractC3163);
            C15249 c15249M36215 = C15249.m36215(str, abstractC3163, this.f14534, new C15135(this, interfaceC22192));
            this.f14530 = c15249M36215;
            if (!abstractC3163.f9955.f11350) {
                c15249M36215.m36246();
            }
            if (abstractC13921.mo7652()) {
                AbstractC15440 abstractC15440M36527 = C16293.f50111.m36527();
                try {
                    C18996 c18996 = new C18996();
                    interfaceC22192.setTitle(R.string.MT_Protector);
                    interfaceC22192.mo10101(true);
                    interfaceC22192.mo10100("...");
                    c18996.m43837(abstractC15440M36527, abstractC13921, strArr, new C21487(interfaceC22192));
                    if (interfaceC22192.mo1526()) {
                        ExecutorService executorService2 = this.f14535;
                        if (executorService2 != null && !executorService2.isShutdown()) {
                            this.f14535.shutdownNow();
                        }
                        c4300.m12879();
                        abstractC15440M36527.mo23552();
                        return;
                    }
                    c192411 = new C19247(abstractC15440M36527.mo23554());
                    try {
                        this.f14537 = c192411;
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC17889 interfaceC17889 : c192411.mo7637("/", true)) {
                            if (interfaceC17889.isDirectory()) {
                                arrayList.add(interfaceC17889.getPath() + "/");
                            } else {
                                arrayList.add(interfaceC17889.getPath());
                            }
                        }
                        strArr = (String[]) arrayList.toArray(new String[0]);
                        interfaceC22192.mo10101(false);
                        abstractC15440 = abstractC15440M36527;
                        c192410 = c192411;
                        abstractC13922 = c192411;
                    } catch (Exception e2) {
                        e = e2;
                        abstractC15440 = abstractC15440M36527;
                        c19248 = c192411;
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC15440 = abstractC15440M36527;
                        c19247 = c192411;
                        executorService = this.f14535;
                        if (executorService != null) {
                            this.f14535.shutdownNow();
                        }
                        c4300.m12879();
                        if (abstractC15440 != null) {
                            abstractC15440.mo23552();
                        }
                        if (c19247 != null) {
                            C0349.m1793(c19247);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c192411 = null;
                } catch (Throwable th3) {
                    th = th3;
                    c192411 = null;
                }
                abstractC15440 = abstractC15440M36527;
                c19248 = c192411;
                try {
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c19249 = c19248;
                    c19247 = c19249;
                    executorService = this.f14535;
                    if (executorService != null && !executorService.isShutdown()) {
                        this.f14535.shutdownNow();
                    }
                    c4300.m12879();
                    if (abstractC15440 != null) {
                        abstractC15440.mo23552();
                    }
                    if (c19247 != null) {
                        C0349.m1793(c19247);
                    }
                    throw th;
                }
            }
            c192410 = null;
            abstractC13922 = abstractC13921;
            try {
                if (this.f14531 && this.f14529) {
                    this.f14530.m36239(strArr, abstractC3163, interfaceC22192);
                    Iterator it = this.f14530.m36244().iterator();
                    while (it.hasNext()) {
                        Object objM3893 = ((AbstractC1139) it.next()).m3893();
                        if (objM3893 instanceof String) {
                            this.f14527.add((String) objM3893);
                        }
                    }
                } else {
                    this.f14530.m36241(strArr, abstractC13922, abstractC3163, interfaceC22192);
                }
                interfaceC22192.setTitle(this.f14531 ? R.string.MT_Protector : R.string.MT_Protector);
                interfaceC22192.mo3550(this.f14530);
                interfaceC22192.mo3551();
                c4300.m12878();
                Iterator it2 = this.f14530.m36248().iterator();
                while (it2.hasNext()) {
                    m13391((AbstractC1139) it2.next());
                }
                this.f14535.shutdown();
                while (true) {
                    ExecutorService executorService3 = this.f14535;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    boolean zAwaitTermination = executorService3.awaitTermination(1L, timeUnit);
                    atomicReference = this.f14533;
                    if (zAwaitTermination) {
                        break;
                    }
                    if (interfaceC22192.mo1526() || atomicReference.get() != null) {
                        this.f14535.awaitTermination(3L, timeUnit);
                        break;
                    }
                }
                if (interfaceC22192.mo1526()) {
                    ExecutorService executorService4 = this.f14535;
                    if (executorService4 != null && !executorService4.isShutdown()) {
                        this.f14535.shutdownNow();
                    }
                    c4300.m12879();
                    if (abstractC15440 != null) {
                        abstractC15440.mo23552();
                    }
                    if (c192410 != null) {
                        C0349.m1793(c192410);
                        return;
                    }
                    return;
                }
                if (atomicReference.get() != null) {
                    throw ((Exception) atomicReference.get());
                }
                if (this.f14531) {
                    if (abstractC13922 instanceof C2499) {
                        Iterator it3 = this.f14530.m36248().iterator();
                        while (it3.hasNext()) {
                            C17909.m41888((AbstractC1139) it3.next());
                            if (interfaceC22192.mo1526()) {
                                ExecutorService executorService5 = this.f14535;
                                if (executorService5 != null && !executorService5.isShutdown()) {
                                    this.f14535.shutdownNow();
                                }
                                c4300.m12879();
                                if (abstractC15440 != null) {
                                    abstractC15440.mo23552();
                                }
                                if (c192410 != null) {
                                    C0349.m1793(c192410);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (abstractC13922 instanceof AbstractC3163) {
                        AbstractC3163 abstractC3164 = (AbstractC3163) abstractC13922;
                        Iterator it4 = this.f14530.m36248().iterator();
                        while (it4.hasNext()) {
                            m13392(abstractC3164, (AbstractC1139) it4.next());
                            if (interfaceC22192.mo1526()) {
                                ExecutorService executorService6 = this.f14535;
                                if (executorService6 != null && !executorService6.isShutdown()) {
                                    this.f14535.shutdownNow();
                                }
                                c4300.m12879();
                                if (abstractC15440 != null) {
                                    abstractC15440.mo23552();
                                }
                                if (c192410 != null) {
                                    C0349.m1793(c192410);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Iterator it5 = this.f14528.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC18695) it5.next()).run();
                    if (interfaceC22192.mo1526()) {
                        ExecutorService executorService7 = this.f14535;
                        if (executorService7 != null && !executorService7.isShutdown()) {
                            this.f14535.shutdownNow();
                        }
                        c4300.m12879();
                        if (abstractC15440 != null) {
                            abstractC15440.mo23552();
                        }
                        if (c192410 != null) {
                            C0349.m1793(c192410);
                            return;
                        }
                        return;
                    }
                }
                ExecutorService executorService8 = this.f14535;
                if (executorService8 != null && !executorService8.isShutdown()) {
                    this.f14535.shutdownNow();
                }
                c4300.m12879();
                if (abstractC15440 != null) {
                    abstractC15440.mo23552();
                }
                if (c192410 != null) {
                    C0349.m1793(c192410);
                }
            } catch (Exception e4) {
                e = e4;
                c19248 = c192410;
            } catch (Throwable th5) {
                th = th5;
                c19249 = c192410;
                c19247 = c19249;
                executorService = this.f14535;
                if (executorService != null) {
                    this.f14535.shutdownNow();
                }
                c4300.m12879();
                if (abstractC15440 != null) {
                    abstractC15440.mo23552();
                }
                if (c19247 != null) {
                    C0349.m1793(c19247);
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            c19248 = null;
        } catch (Throwable th6) {
            th = th6;
            c19247 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13392(AbstractC3163 abstractC3163, AbstractC1139 abstractC1139) {
        if (abstractC1139.m3888()) {
            String str = abstractC1139.m3910() + "/";
            Iterator it = this.f14525.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return;
                }
            }
            C0433 c0433Mo1983 = abstractC1139.mo1983();
            if (c0433Mo1983.m1986()) {
                Iterator it2 = c0433Mo1983.m1988().iterator();
                while (it2.hasNext()) {
                    m13392(abstractC3163, (AbstractC1139) it2.next());
                }
            } else {
                this.f14524.setTitle(R.string.MT_Protector);
                this.f14524.mo10100(abstractC1139.m3898());
                C10445.m26286(abstractC3163, c0433Mo1983);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13396(AbstractC1139 abstractC1139) {
        AbstractC13921 abstractC13921 = this.f14537;
        if (abstractC13921 instanceof C2499) {
            abstractC1139.m3890().mo23552();
        } else if (abstractC13921 instanceof AbstractC3163) {
            ((AbstractC3163) abstractC13921).m9697(abstractC1139.m3910(), false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m13403() {
        return this.f14537;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 m13404() {
        return this.f14523;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m13400() {
        return this.f14527;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13391(AbstractC1139 abstractC1139) {
        this.f14535.submit(new RunnableC18175(2, this, abstractC1139));
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m13391((AbstractC1139) it.next());
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13394(final C4553 c4553, final AbstractC1139 abstractC1139) {
        int i;
        String strM3900;
        String strMo9709;
        AbstractC3163 abstractC3163;
        int i2;
        String strM3901;
        AbstractC3163 abstractC3164;
        int i3;
        final String strM3902;
        AbstractC3163 abstractC3165;
        int i4;
        ArrayList arrayList = c4553.f14525;
        AtomicReference atomicReference = c4553.f14533;
        if (c4553.f14524.mo1526() || atomicReference.get() != null) {
            abstractC1139.m3891();
            return;
        }
        c4553.f14539.set(abstractC1139.m3898());
        c4553.f14524.setName(abstractC1139.m3898());
        abstractC1139.m3899();
        if (c4553.f14537 instanceof C2499) {
            String strM3910 = abstractC1139.m3910();
            if (C16999.m39887(strM3910) || C16999.m39877(strM3910)) {
                i = 292;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        try {
            try {
                if (c4553.f14531 && c4553.f14529) {
                    String strM3911 = abstractC1139.m3910();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (strM3911.startsWith((String) it.next())) {
                                if (!abstractC1139.m3888()) {
                                    long jM3913 = abstractC1139.m3913();
                                    c4553.f14536.mo5679(jM3913, jM3913, jM3913, 0L);
                                }
                            }
                        } else if (abstractC1139.m3888()) {
                            if (!abstractC1139.m3879()) {
                                strM3902 = abstractC1139.m3900();
                                if (c4553.f14531) {
                                    c4553.f14523.mo9702(strM3902);
                                    if (!c4553.f14524.mo1526()) {
                                        abstractC3165 = c4553.f14523;
                                        i4 = i | abstractC1139.m3904().f56795;
                                        if (abstractC3165.mo9708()) {
                                            abstractC3165.mo9694(i4, strM3902);
                                        }
                                    }
                                    if (c4553.f14538) {
                                        c4553.f14528.add(new InterfaceC18695() { // from class: l.۠ۡ᩻
                                            @Override // l.InterfaceC18695
                                            public final void run() {
                                                C4553.m13393(this.f24888, strM3902, abstractC1139);
                                            }
                                        });
                                    }
                                } else {
                                    c4553.f14523.mo9702(strM3902);
                                    if (!c4553.f14524.mo1526()) {
                                        abstractC3165 = c4553.f14523;
                                        i4 = i | abstractC1139.m3904().f56795;
                                        if (abstractC3165.mo9708()) {
                                            abstractC3165.mo9694(i4, strM3902);
                                        }
                                    }
                                    if (c4553.f14538) {
                                        c4553.f14528.add(new InterfaceC18695() { // from class: l.۠ۡ᩻
                                            @Override // l.InterfaceC18695
                                            public final void run() {
                                                C4553.m13393(this.f24888, strM3902, abstractC1139);
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (!abstractC1139.m3879()) {
                            strM3901 = abstractC1139.m3900();
                            if (!c4553.f14531) {
                                c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3901, false, c4553.f14536);
                                if (!c4553.f14524.mo1526()) {
                                    abstractC3164 = c4553.f14523;
                                    i3 = i | abstractC1139.m3904().f56795;
                                    if (abstractC3164.mo9708()) {
                                        abstractC3164.mo9694(i3, strM3901);
                                    }
                                }
                                if (c4553.f14531) {
                                    c4553.m13396(abstractC1139);
                                }
                            } else {
                                c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3901, false, c4553.f14536);
                                if (!c4553.f14524.mo1526()) {
                                    abstractC3164 = c4553.f14523;
                                    i3 = i | abstractC1139.m3904().f56795;
                                    if (abstractC3164.mo9708()) {
                                        abstractC3164.mo9694(i3, strM3901);
                                    }
                                }
                                if (c4553.f14531) {
                                    c4553.m13396(abstractC1139);
                                }
                            }
                        } else if (abstractC1139.m3908()) {
                            strMo9709 = c4553.f14523.mo9709(abstractC1139.m3900());
                            if (!c4553.f14531) {
                                c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strMo9709, false, c4553.f14536);
                                if (!c4553.f14524.mo1526()) {
                                    abstractC3163 = c4553.f14523;
                                    i2 = i | abstractC1139.m3904().f56795;
                                    if (abstractC3163.mo9708()) {
                                        abstractC3163.mo9694(i2, strMo9709);
                                    }
                                }
                                if (c4553.f14531) {
                                    c4553.m13396(abstractC1139);
                                }
                            } else {
                                c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strMo9709, false, c4553.f14536);
                                if (!c4553.f14524.mo1526()) {
                                    abstractC3163 = c4553.f14523;
                                    i2 = i | abstractC1139.m3904().f56795;
                                    if (abstractC3163.mo9708()) {
                                        abstractC3163.mo9694(i2, strMo9709);
                                    }
                                }
                                if (c4553.f14531) {
                                    c4553.m13396(abstractC1139);
                                }
                            }
                            if (abstractC1139.m3893() != null) {
                                abstractC1139.m3907(C9523.m24404(strMo9709));
                            }
                        } else {
                            strM3900 = abstractC1139.m3900();
                            if (c4553.f14531) {
                                c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3900, false, c4553.f14536);
                                if (c4553.f14531) {
                                    c4553.m13396(abstractC1139);
                                }
                            } else {
                                c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3900, false, c4553.f14536);
                                if (c4553.f14531) {
                                    c4553.m13396(abstractC1139);
                                }
                            }
                        }
                    }
                } else if (abstractC1139.m3888()) {
                    if (!abstractC1139.m3879()) {
                        strM3902 = abstractC1139.m3900();
                        if (c4553.f14531 || !c4553.f14529) {
                            c4553.f14523.mo9702(strM3902);
                            if (!c4553.f14524.mo1526() && abstractC1139.m3904() != null) {
                                abstractC3165 = c4553.f14523;
                                i4 = i | abstractC1139.m3904().f56795;
                                if (abstractC3165.mo9708()) {
                                    try {
                                        abstractC3165.mo9694(i4, strM3902);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            if (c4553.f14538 && c4553.f14523.mo9687()) {
                                c4553.f14528.add(new InterfaceC18695() { // from class: l.۠ۡ᩻
                                    @Override // l.InterfaceC18695
                                    public final void run() {
                                        C4553.m13393(this.f24888, strM3902, abstractC1139);
                                    }
                                });
                            }
                        } else {
                            AbstractC3163 abstractC3166 = c4553.f14523;
                            abstractC3166.getClass();
                            if ((abstractC3166 instanceof C7190) || !c4553.f14523.mo9696(abstractC1139.m3910(), strM3902)) {
                                c4553.f14523.mo9702(strM3902);
                                if (!c4553.f14524.mo1526()) {
                                    abstractC3165 = c4553.f14523;
                                    i4 = i | abstractC1139.m3904().f56795;
                                    if (abstractC3165.mo9708()) {
                                        abstractC3165.mo9694(i4, strM3902);
                                    }
                                }
                                if (c4553.f14538) {
                                    c4553.f14528.add(new InterfaceC18695() { // from class: l.۠ۡ᩻
                                        @Override // l.InterfaceC18695
                                        public final void run() {
                                            C4553.m13393(this.f24888, strM3902, abstractC1139);
                                        }
                                    });
                                }
                            } else {
                                arrayList.add(abstractC1139.m3910() + "/");
                            }
                        }
                    }
                } else if (!abstractC1139.m3879()) {
                    strM3901 = abstractC1139.m3900();
                    if (!c4553.f14531 && c4553.f14529 && c4553.f14523.mo9696(abstractC1139.m3910(), strM3901)) {
                        long jM3914 = abstractC1139.m3913();
                        c4553.f14536.mo5679(jM3914, jM3914, jM3914, 0L);
                    } else {
                        c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3901, false, c4553.f14536);
                        if (!c4553.f14524.mo1526() && abstractC1139.m3904() != null) {
                            abstractC3164 = c4553.f14523;
                            i3 = i | abstractC1139.m3904().f56795;
                            if (abstractC3164.mo9708()) {
                                try {
                                    abstractC3164.mo9694(i3, strM3901);
                                } catch (IOException unused2) {
                                }
                            }
                        }
                        if (c4553.f14531 && !c4553.f14524.mo1526()) {
                            c4553.m13396(abstractC1139);
                        }
                    }
                } else if (abstractC1139.m3908()) {
                    strMo9709 = c4553.f14523.mo9709(abstractC1139.m3900());
                    if (!c4553.f14531 && c4553.f14529 && c4553.f14523.mo9696(abstractC1139.m3910(), strMo9709)) {
                        long jM3915 = abstractC1139.m3913();
                        c4553.f14536.mo5679(jM3915, jM3915, jM3915, 0L);
                    } else {
                        c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strMo9709, false, c4553.f14536);
                        if (!c4553.f14524.mo1526() && abstractC1139.m3904() != null) {
                            abstractC3163 = c4553.f14523;
                            i2 = i | abstractC1139.m3904().f56795;
                            if (abstractC3163.mo9708()) {
                                try {
                                    abstractC3163.mo9694(i2, strMo9709);
                                } catch (IOException unused3) {
                                }
                            }
                        }
                        if (c4553.f14531 && !c4553.f14524.mo1526()) {
                            c4553.m13396(abstractC1139);
                        }
                    }
                    if (abstractC1139.m3893() != null) {
                        abstractC1139.m3907(C9523.m24404(strMo9709));
                    }
                } else {
                    strM3900 = abstractC1139.m3900();
                    if (c4553.f14531 || !c4553.f14529) {
                        c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3900, false, c4553.f14536);
                        if (c4553.f14531 && !c4553.f14524.mo1526()) {
                            c4553.m13396(abstractC1139);
                        }
                    } else {
                        String strM24406 = C9523.m24406(strM3900);
                        String str = C17665.m41386(System.currentTimeMillis()) + Long.toString(((long) strM3900.hashCode()) & 4294967295L, 16) + ".tmp";
                        if (strM24406 != null) {
                            str = strM24406 + str;
                        }
                        if (c4553.f14523.mo9696(abstractC1139.m3910(), str) && c4553.f14523.m9697(strM3900, false) && c4553.f14523.mo9696(str, strM3900)) {
                            long jM3916 = abstractC1139.m3913();
                            c4553.f14536.mo5679(jM3916, jM3916, jM3916, 0L);
                        } else {
                            c4553.f14532.m21535(c4553.f14537, abstractC1139.m3910(), strM3900, false, c4553.f14536);
                            if (c4553.f14531) {
                                c4553.m13396(abstractC1139);
                            }
                        }
                    }
                }
                abstractC1139.m3891();
                if (c4553.f14524.mo1526()) {
                    return;
                }
                c4553.f14530.m47715();
                if (abstractC1139.m3893() != null) {
                    c4553.f14527.add((String) abstractC1139.m3893());
                }
                c4553.f14524.mo3550(c4553.f14530);
                c4553.f14524.setProgress(c4553.f14530.m47712());
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                abstractC1139.m3891();
            }
        } catch (Throwable th) {
            abstractC1139.m3891();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13393(C4553 c4553, String str, AbstractC1139 abstractC1139) {
        try {
            if (c4553.f14523.mo9687()) {
                c4553.f14523.mo9700(abstractC1139.m3887(), str);
            }
        } catch (Exception unused) {
        }
    }
}
