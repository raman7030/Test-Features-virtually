package l;

import android.app.Activity;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܽܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAMP */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC0690(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {ThreefishEngine.Threefish512Cipher.ROTATION_3_2, ThreefishEngine.Threefish1024Cipher.ROTATION_1_3}, m = "invokeSuspend")
public final class C16767 extends AbstractC21858 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f51474;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f51475;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC7475 f51476;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18179 f51477;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC13041 f51478;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f51479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16767(C18179 c18179, Activity activity, InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        this.f51477 = c18179;
        this.f51474 = activity;
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11791 mo8682(Object obj, InterfaceC11791 interfaceC11791) {
        C16767 c16767 = new C16767(this.f51477, this.f51474, interfaceC11791);
        c16767.f51479 = obj;
        return c16767;
    }

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        return ((C16767) mo8682(obj, (InterfaceC11791) obj2)).mo8684(C8058.f24861);
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
    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final java.lang.Object mo8684(java.lang.Object r12) {
        /*
            r11 = this;
            l.ۜ᩸᩵ r0 = l.EnumC7041.COROUTINE_SUSPENDED
            int r1 = r11.f51475
            r2 = 2
            r3 = 1
            l.ᩳܽܽ r4 = r11.f51477
            if (r1 == 0) goto L38
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            l.۟۫᩵ r1 = r11.f51476
            l.۬ۤ r5 = r11.f51478
            java.lang.Object r6 = r11.f51479
            l.᩵ۤ᩵ r6 = (l.InterfaceC19410) r6
            l.C18642.m43236(r12)     // Catch: java.lang.Throwable -> L35
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
            l.۟۫᩵ r1 = r11.f51476
            l.۬ۤ r5 = r11.f51478
            java.lang.Object r6 = r11.f51479
            l.᩵ۤ᩵ r6 = (l.InterfaceC19410) r6
            l.C18642.m43236(r12)     // Catch: java.lang.Throwable -> L35
            r7 = r6
            r6 = r11
            goto L75
        L35:
            r12 = move-exception
            goto La0
        L38:
            l.C18642.m43236(r12)
            java.lang.Object r12 = r11.f51479
            l.᩵ۤ᩵ r12 = (l.InterfaceC19410) r12
            l.ܰ۫᩵ r1 = l.EnumC13824.DROP_OLDEST
            l.᩺۫᩵ r5 = new l.᩺۫᩵
            r6 = 10
            r5.<init>(r6, r1)
            l.ۧܽܽ r1 = new l.ۧܽܽ
            r1.<init>(r5)
            l.ۨۧܽ r6 = l.C18179.m42400(r4)
            l.᩺᩹ۧ r7 = new l.᩺᩹ۧ
            r7.<init>()
            android.app.Activity r8 = r11.f51474
            r6.mo16844(r8, r7, r1)
            l.۟۫᩵ r5 = r5.m30582()     // Catch: java.lang.Throwable -> L9e
            r6 = r11
        L60:
            r6.f51479 = r12     // Catch: java.lang.Throwable -> L9e
            r6.f51478 = r1     // Catch: java.lang.Throwable -> L9e
            r6.f51476 = r5     // Catch: java.lang.Throwable -> L9e
            r6.f51475 = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r7 = r5.mo20098(r6)     // Catch: java.lang.Throwable -> L9e
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
            l.ܿܽܽ r12 = (l.C17473) r12     // Catch: java.lang.Throwable -> L35
            r6.f51479 = r7     // Catch: java.lang.Throwable -> L35
            r6.f51478 = r5     // Catch: java.lang.Throwable -> L35
            r6.f51476 = r1     // Catch: java.lang.Throwable -> L35
            r6.f51475 = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r12 = r7.mo7954(r12, r6)     // Catch: java.lang.Throwable -> L35
            if (r12 != r0) goto L92
        L91:
            return r0
        L92:
            r12 = r7
            goto L1b
        L94:
            l.ۨۧܽ r12 = l.C18179.m42400(r4)
            r12.mo16845(r5)
            l.۠۠᩵ r12 = l.C8058.f24861
            return r12
        L9e:
            r12 = move-exception
            r5 = r1
        La0:
            l.ۨۧܽ r0 = l.C18179.m42400(r4)
            r0.mo16845(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16767.mo8684(java.lang.Object):java.lang.Object");
    }
}
