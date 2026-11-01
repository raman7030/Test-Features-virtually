package p067l;

import android.app.Activity;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܽܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAMP */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC3025(m5117c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m5118f = "WindowInfoTrackerImpl.kt", m5119l = {ThreefishEngine.Threefish512Cipher.ROTATION_3_2, ThreefishEngine.Threefish1024Cipher.ROTATION_1_3}, m5120m = "invokeSuspend")
public final class C18304 extends AbstractC23143 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Activity f54656;

    /* JADX INFO: renamed from: ۛ */
    public int f54657;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC9473 f54658;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C19646 f54659;

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC1489 f54660;

    /* JADX INFO: renamed from: ۬ */
    public /* synthetic */ Object f54661;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18304(C19646 c19646, Activity activity, InterfaceC13575 interfaceC13575) {
        super(interfaceC13575);
        this.f54659 = c19646;
        this.f54656 = activity;
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13575 mo10743(Object obj, InterfaceC13575 interfaceC13575) {
        C18304 c18304 = new C18304(this.f54659, this.f54656, interfaceC13575);
        c18304.f54661 = obj;
        return c18304;
    }

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        return ((C18304) mo10743(obj, (InterfaceC13575) obj2)).mo10745(C10027.f27775);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x0016, B:23:0x0075, B:25:0x007d, B:13:0x002f), top: B:35:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۨۧܽ] */
    /* JADX WARN: Type inference failed for: r12v9, types: [l.ۨۧܽ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۧܽܽ] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.۬ۤ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.۬ۤ] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [l.۬ۤ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۨۧܽ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0092 -> B:9:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    public final java.lang.Object mo10745(java.lang.Object r12) {
        /*
            r11 = this;
            l.ۜ᩸᩵ r0 = p067l.EnumC9061.COROUTINE_SUSPENDED
            int r1 = r11.f54657
            r2 = 2
            r3 = 1
            l.ᩳܽܽ r4 = r11.f54659
            if (r1 == 0) goto L38
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            l.۟۫᩵ r1 = r11.f54658
            l.۬ۤ r5 = r11.f54660
            java.lang.Object r6 = r11.f54661
            l.᩵ۤ᩵ r6 = (p067l.InterfaceC20816) r6
            p067l.C20086.m45502(r12)     // Catch: java.lang.Throwable -> L35
            r12 = r6
            r6 = r11
        L1b:
            r9 = r5
            r5 = r1
            r1 = r9
            goto L60
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            l.۟۫᩵ r1 = r11.f54658
            l.۬ۤ r5 = r11.f54660
            java.lang.Object r6 = r11.f54661
            l.᩵ۤ᩵ r6 = (p067l.InterfaceC20816) r6
            p067l.C20086.m45502(r12)     // Catch: java.lang.Throwable -> L35
            r7 = r6
            r6 = r11
            goto L75
        L35:
            r12 = move-exception
            goto La0
        L38:
            p067l.C20086.m45502(r12)
            java.lang.Object r12 = r11.f54661
            l.᩵ۤ᩵ r12 = (p067l.InterfaceC20816) r12
            l.ܰ۫᩵ r1 = p067l.EnumC15507.DROP_OLDEST
            l.᩺۫᩵ r5 = new l.᩺۫᩵
            r6 = 10
            r5.<init>(r6, r1)
            l.ۧܽܽ r1 = new l.ۧܽܽ
            r1.<init>(r5)
            l.ۨۧܽ r6 = p067l.C19646.m44661(r4)
            l.᩺᩹ۧ r7 = new l.᩺᩹ۧ
            r7.<init>()
            android.app.Activity r8 = r11.f54656
            r6.mo18772(r8, r7, r1)
            l.۟۫᩵ r5 = r5.m32646()     // Catch: java.lang.Throwable -> L9e
            r6 = r11
        L60:
            r6.f54661 = r12     // Catch: java.lang.Throwable -> L9e
            r6.f54660 = r1     // Catch: java.lang.Throwable -> L9e
            r6.f54658 = r5     // Catch: java.lang.Throwable -> L9e
            r6.f54657 = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r7 = r5.mo22073(r6)     // Catch: java.lang.Throwable -> L9e
            if (r7 != r0) goto L6f
            goto L91
        L6f:
            r9 = r7
            r7 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
        L75:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L35
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L94
            java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L35
            l.ܿܽܽ r12 = (p067l.C18975) r12     // Catch: java.lang.Throwable -> L35
            r6.f54661 = r7     // Catch: java.lang.Throwable -> L35
            r6.f54660 = r5     // Catch: java.lang.Throwable -> L35
            r6.f54658 = r1     // Catch: java.lang.Throwable -> L35
            r6.f54657 = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r12 = r7.mo10002(r12, r6)     // Catch: java.lang.Throwable -> L35
            if (r12 != r0) goto L92
        L91:
            return r0
        L92:
            r12 = r7
            goto L1b
        L94:
            l.ۨۧܽ r12 = p067l.C19646.m44661(r4)
            r12.mo18773(r5)
            l.۠۠᩵ r12 = p067l.C10027.f27775
            return r12
        L9e:
            r12 = move-exception
            r5 = r1
        La0:
            l.ۨۧܽ r0 = p067l.C19646.m44661(r4)
            r0.mo18773(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C18304.mo10745(java.lang.Object):java.lang.Object");
    }
}
