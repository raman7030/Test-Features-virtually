package p067l;

/* JADX INFO: renamed from: l.ۖ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4975 implements InterfaceC4522, InterfaceC14501, InterfaceC4595, InterfaceC24424 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f11333;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f11334;

    public /* synthetic */ C4975(int i, Object obj) {
        this.f11333 = i;
        this.f11334 = obj;
    }

    @Override // p067l.InterfaceC24424
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        switch (this.f11333) {
            case 2:
                ((C12987) this.f11334).mo13474(i);
                break;
            default:
                ((InterfaceC7957) this.f11334).mo18368(i);
                break;
        }
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public void mo10533(String str) {
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = (ViewOnClickListenerC9523) this.f11334;
        viewOnClickListenerC9523.m22167(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: INVOKE 
              (r0v1 'viewOnClickListenerC9523' l.ￛﾟￜﾳￛﾢ)
              (wrap java.lang.Runnable:0x0002: CONSTRUCTOR (r0v1 'viewOnClickListenerC9523' l.ￛﾟￜﾳￛﾢ), (r2v0 'str' java.lang.String) A[MD:(l.ￛﾟￜﾳￛﾢ, java.lang.String):void (m), WRAPPED] (LINE:181) call: l.ￛﾜￜﾳￛﾢ.<init>(l.ￛﾟￜﾳￛﾢ, java.lang.String):void type: CONSTRUCTOR)
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
            java.lang.Object r0 = r1.f11334
            l.۟ܳۢ r0 = (p067l.ViewOnClickListenerC9523) r0
            p067l.ViewOnClickListenerC9523.m22183(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C4975.mo10533(java.lang.String):void");
    }

    @Override // p067l.InterfaceC4522
    /* JADX INFO: renamed from: ۧ */
    public void mo9575(int i) {
        ViewOnClickListenerC10539.m24286((ViewOnClickListenerC10539) this.f11334, i);
    }

    @Override // p067l.InterfaceC13831
    /* JADX INFO: renamed from: ֫ */
    public void mo10534(AbstractC17043 abstractC17043) {
        abstractC17043.m38660((byte[]) this.f11334);
    }
}
