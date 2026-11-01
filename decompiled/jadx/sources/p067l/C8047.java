package p067l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۛۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8047 implements InterfaceC6782, InterfaceC24424, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f21194;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f21195;

    public /* synthetic */ C8047(int i, Object obj) {
        this.f21194 = i;
        this.f21195 = obj;
    }

    /* JADX INFO: renamed from: ܽ */
    private final /* synthetic */ void m18684() {
    }

    /* JADX INFO: renamed from: ᩳ */
    private final /* synthetic */ void m18685() {
    }

    @Override // p067l.InterfaceC24424
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public void mo10533(String str) {
        switch (this.f21194) {
            case 0:
                ActivityC9368.m21769((ActivityC9368) this.f21195, str);
                break;
            default:
                ViewOnClickListenerC22924 viewOnClickListenerC22924 = (ViewOnClickListenerC22924) this.f21195;
                viewOnClickListenerC22924.m51216(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE 
                      (r0v4 'viewOnClickListenerC22924' l.￡ﾩﾸￜﾰ￡ﾩﾷ)
                      (wrap java.lang.Runnable:0x0002: CONSTRUCTOR (r0v4 'viewOnClickListenerC22924' l.￡ﾩﾸￜﾰ￡ﾩﾷ), (r2v0 'str' java.lang.String) A[MD:(l.￡ﾩﾸￜﾰ￡ﾩﾷ, java.lang.String):void (m), WRAPPED] (LINE:198) call: l.ￛﾜￜﾰ￡ﾩﾷ.<init>(l.￡ﾩﾸￜﾰ￡ﾩﾷ, java.lang.String):void type: CONSTRUCTOR)
                     DIRECT call: l.￡ﾩﾸￜﾰ￡ﾩﾷ.ￖﾫ(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] (LINE:198) in method: l.ￛﾛￛﾢￛﾢ.ￖﾫ(java.lang.String):void, file: classes3.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾜￜﾰ￡ﾩﾷ, state: NOT_LOADED
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
                    int r0 = r1.f21194
                    switch(r0) {
                        case 0: goto Ld;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r1.f21195
                    l.᩸ܰ᩷ r0 = (p067l.ViewOnClickListenerC22924) r0
                    p067l.ViewOnClickListenerC22924.m51229(r0, r2)
                    return
                Ld:
                    java.lang.Object r0 = r1.f21195
                    l.۟ۡۢ r0 = (p067l.ActivityC9368) r0
                    p067l.ActivityC9368.m21769(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p067l.C8047.mo10533(java.lang.String):void");
            }

            @Override // p067l.InterfaceC6782
            /* JADX INFO: renamed from: ֫ */
            public Bitmap mo7890() {
                return C18950.m43047((InterfaceC12916) this.f21195);
            }

            @Override // p067l.InterfaceC22339
            /* JADX INFO: renamed from: ۧ */
            public Object mo14676() {
                throw new C15611((String) this.f21195);
            }
        }
