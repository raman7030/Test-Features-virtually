package l;

/* JADX INFO: renamed from: l.ۖ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2742 implements InterfaceC2266, InterfaceC12766, InterfaceC2343, InterfaceC23206 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8539;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8540;

    public /* synthetic */ C2742(int i, Object obj) {
        this.f8539 = i;
        this.f8540 = obj;
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        switch (this.f8539) {
            case 2:
                ((C11172) this.f8540).mo11538(i);
                break;
            default:
                ((InterfaceC5880) this.f8540).mo16442(i);
                break;
        }
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8486(String str) {
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = (ViewOnClickListenerC7528) this.f8540;
        viewOnClickListenerC7528.m20191(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: INVOKE 
              (r0v1 'viewOnClickListenerC7528' l.ￛﾟￜﾳￛﾢ)
              (wrap java.lang.Runnable:0x0002: CONSTRUCTOR (r0v1 'viewOnClickListenerC7528' l.ￛﾟￜﾳￛﾢ), (r2v0 'str' java.lang.String) A[MD:(l.ￛﾟￜﾳￛﾢ, java.lang.String):void (m), WRAPPED] (LINE:181) call: l.ￛﾜￜﾳￛﾢ.<init>(l.ￛﾟￜﾳￛﾢ, java.lang.String):void type: CONSTRUCTOR)
             DIRECT call: l.ￛﾟￜﾳￛﾢ.ￖﾫ(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] (LINE:181) in method: l.ￛﾖ￡ﾩﾵￜ﾿.ￖﾫ(java.lang.String):void, file: classes3.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾜￜﾳￛﾢ, state: NOT_LOADED
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
            java.lang.Object r0 = r1.f8540
            l.۟ܳۢ r0 = (l.ViewOnClickListenerC7528) r0
            l.ViewOnClickListenerC7528.m20207(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2742.mo8486(java.lang.String):void");
    }

    @Override // l.InterfaceC2266
    /* JADX INFO: renamed from: ۧ */
    public void mo7493(int i) {
        ViewOnClickListenerC8597.m22317((ViewOnClickListenerC8597) this.f8540, i);
    }

    @Override // l.InterfaceC12061
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8487(AbstractC15440 abstractC15440) {
        abstractC15440.m36502((byte[]) this.f8540);
    }
}
