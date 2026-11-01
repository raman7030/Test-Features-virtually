package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10584 implements Consumer {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f29310;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29311;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f29312;

    public /* synthetic */ C10584(int i, Object obj, Object obj2) {
        this.f29311 = i;
        this.f29312 = obj;
        this.f29310 = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f29311) {
            case 0:
                C21230.forEach((C4848) this.f29310, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE 
                      (wrap l.ￛﾖￜﾶￛﾠ:0x0017: CHECK_CAST (l.ￛﾖￜﾶￛﾠ) (wrap java.lang.Object:0x0015: IGET (r2v0 'this' l.ￛﾡￛﾙￖﾨ A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] l.ￛﾡￛﾙￖﾨ.￡ﾩﾶ java.lang.Object))
                      (wrap java.util.function.Consumer:0x0002: CONSTRUCTOR 
                      (wrap l.ￛﾢￛﾗￖﾨ:0x0013: CHECK_CAST (l.ￛﾢￛﾗￖﾨ) (wrap java.lang.Object:0x0011: IGET (r2v0 'this' l.ￛﾡￛﾙￖﾨ A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] l.ￛﾡￛﾙￖﾨ.￡ﾩﾹ java.lang.Object))
                      (wrap l.ￛﾙￖﾨￖﾨ:0x0019: CHECK_CAST (l.ￛﾙￖﾨￖﾨ) (r3v0 'obj' java.lang.Object))
                     A[MD:(l.ￛﾢￛﾗￖﾨ, l.ￛﾙￖﾨￖﾨ):void (m), WRAPPED] (LINE:3863) call: l.￡ﾩﾷￛﾙￖﾨ.<init>(l.ￛﾢￛﾗￖﾨ, l.ￛﾙￖﾨￖﾨ):void type: CONSTRUCTOR)
                     STATIC call: l.￡ﾩﾶￖﾨ￡ﾩﾴ.forEach(java.lang.Iterable, java.util.function.Consumer):void A[MD:(java.lang.Iterable, java.util.function.Consumer):void (m)] (LINE:3863) in method: l.ￛﾡￛﾙￖﾨ.accept(java.lang.Object):void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.￡ﾩﾷￛﾙￖﾨ, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    int r0 = r2.f29311
                    switch(r0) {
                        case 0: goto L11;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r2.f29312
                    java.util.TreeMap r0 = (java.util.TreeMap) r0
                    java.lang.Object r1 = r2.f29310
                    l.ۤۖ֡ r3 = (p067l.InterfaceC11866) r3
                    r0.put(r3, r1)
                    return
                L11:
                    java.lang.Object r0 = r2.f29312
                    l.ۢۗ֨ r0 = (p067l.C11216) r0
                    java.lang.Object r1 = r2.f29310
                    l.ۖܶ۠ r1 = (p067l.C4848) r1
                    l.ۙ֨֨ r3 = (p067l.AbstractC6462) r3
                    p067l.C11216.m25914(r0, r1, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p067l.C10584.m45213n(java.lang.Object):void");
            }
        }
