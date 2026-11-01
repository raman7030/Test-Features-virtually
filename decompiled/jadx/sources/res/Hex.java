package res;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import java.nio.ByteOrder;
import p067l.C8328;
import p067l.InterfaceC9749;
import p067l.InterfaceC9768;

/* JADX INFO: loaded from: input.apk:assets/Hex.class */
public class Hex {
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public Hex(p067l.RunnableC7265 r3) {
        /*
            r2 = this;
            r0 = r2
            super/*android.accessibilityservice.AccessibilityService*/.onCreate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: res.Hex.m32390(l.ۚۚᩳ):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [long[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, void] */
    /* JADX INFO: renamed from: ֫ */
    public static void m32391(C8328 c8328) {
        ?? OnDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? End = settingsActivityName.end();
        ?? r0 = new long[OnDestroy.length / 8];
        End.getDuration();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, long] */
    /* JADX INFO: renamed from: ֫ */
    public static void m32392(InterfaceC9749 interfaceC9749) {
        ?? OnDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? startDelay = settingsActivityName.getStartDelay();
        ?? r0 = new int[OnDestroy.length / 4];
        startDelay.isPaused();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v11, types: [long, short[], void] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.Animator, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.animation.Animator, boolean] */
    /* JADX INFO: renamed from: ֫ */
    public static void m32393(InterfaceC9768 interfaceC9768) {
        ?? OnDestroy = AccessibilityService.onDestroy();
        ?? settingsActivityName = AccessibilityServiceInfo.getSettingsActivityName();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        settingsActivityName.cancel();
        ?? IsRunning = settingsActivityName.isRunning();
        ?? r0 = new short[OnDestroy.length / 2];
        IsRunning.setDuration(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.Animator, java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.animation.Animator, java.lang.RuntimeException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, void] */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], void] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 ??, still in use, count: 2, list:
          (r0v28 ?? I:java.lang.Throwable) from 0x00d1: THROW (r0v28 ?? I:java.lang.Throwable)
          (r0v28 ?? I:android.animation.Animator) from 0x00ce: INVOKE (r0v28 ?? I:android.animation.Animator) SUPER call: android.animation.Animator.start():void A[MD:():void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: ֫ */
    public static void m32191(p067l.InterfaceC9768 r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: res.Hex.m32191(l.۟᩺ᩳ, boolean):void");
    }
}
