package p067l;

/* JADX INFO: renamed from: l.ۤ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12352 implements InterfaceC9988, InterfaceC16692 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f34468;

    public /* synthetic */ C12352(Object obj) {
        this.f34468 = obj;
    }

    @Override // p067l.InterfaceC16692
    /* JADX INFO: renamed from: ֫ */
    public Object mo27141(Object obj, Throwable th) {
        return C13693.m31103((C13693) this.f34468, th);
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public void mo6895(Object obj, Throwable th) {
        C21050 c21050 = (C21050) this.f34468;
        c21050.f66087.post(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: INVOKE 
              (wrap android.os.Handler:0x0000: IGET (r0v1 'c21050' l.￡ﾩﾵ￡ﾩﾴ￡ﾩﾳ) A[WRAPPED] (LINE:92) l.￡ﾩﾵ￡ﾩﾴ￡ﾩﾳ.￡ﾩﾷ android.os.Handler)
              (wrap java.lang.Runnable:0x0004: CONSTRUCTOR 
              (r0v1 'c21050' l.￡ﾩﾵ￡ﾩﾴ￡ﾩﾳ)
              (wrap java.lang.Long:0x0004: CHECK_CAST (java.lang.Long) (r2v0 'obj' java.lang.Object))
              (r3v0 'th' java.lang.Throwable)
             A[MD:(l.￡ﾩﾵ￡ﾩﾴ￡ﾩﾳ, java.lang.Long, java.lang.Throwable):void (m), WRAPPED] call: l.ￛﾡ￡ﾩﾴ￡ﾩﾳ.<init>(l.￡ﾩﾵ￡ﾩﾴ￡ﾩﾳ, java.lang.Long, java.lang.Throwable):void type: CONSTRUCTOR)
             VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] (LINE:92) in method: l.ￛﾤ￡ﾩﾵ￡ﾩﾳ.ￛﾧ(java.lang.Object, java.lang.Throwable):void, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾡ￡ﾩﾴ￡ﾩﾳ, state: NOT_LOADED
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
            	... 15 more
            */
        /*
            this = this;
            java.lang.Object r0 = r1.f34468
            l.᩵ᩴᩳ r0 = (p067l.C21050) r0
            java.lang.Long r2 = (java.lang.Long) r2
            p067l.C21050.m47474(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C12352.mo6895(java.lang.Object, java.lang.Throwable):void");
    }
}
