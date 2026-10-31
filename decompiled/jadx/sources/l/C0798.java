package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes.dex */
public class C0798 {

    /* JADX INFO: renamed from: ᩺ܺ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f2919;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaController f2921;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14472 f2923;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f2922 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2924 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f2920 = new HashMap();

    /* JADX INFO: renamed from: ֡֫ۙ, reason: not valid java name and contains not printable characters */
    public static int m2998() {
        return 0;
    }

    /* JADX INFO: renamed from: ֡ۢ֨, reason: not valid java name and contains not printable characters */
    public static String m2999(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ֨ܳۗ, reason: not valid java name and contains not printable characters */
    public static char m3000(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ֫ܶۚ, reason: not valid java name and contains not printable characters */
    public static boolean m3001() {
        return C23196.m51454();
    }

    /* JADX INFO: renamed from: ֫ܿۢ, reason: not valid java name and contains not printable characters */
    public static void m3002(Object obj) {
        ((AbstractC15440) obj).m36508();
    }

    /* JADX INFO: renamed from: ۖܺۜ, reason: not valid java name and contains not printable characters */
    public static boolean m3003(Object obj) {
        return ((File) obj).exists();
    }

    /* JADX INFO: renamed from: ۚ۬᩷, reason: not valid java name and contains not printable characters */
    public static void m3004(int i) {
        C21374.m48463(i);
    }

    /* JADX INFO: renamed from: ۚܺ᩵, reason: not valid java name and contains not printable characters */
    public static String m3005(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛۗ᩹, reason: not valid java name and contains not printable characters */
    public static int m3006(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ۡۚܽ, reason: not valid java name and contains not printable characters */
    public static int m3007(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ܶ֨ۜ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m3008(Object obj, long j) {
        return ((ObjectAnimator) obj).setDuration(j);
    }

    /* JADX INFO: renamed from: ᩳ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static Intent m3009(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ᩷ۖ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3010(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ᩷ۚ᩷, reason: not valid java name and contains not printable characters */
    public static void m3011(Object obj, Object obj2) {
        ((C0492) obj).m2168((String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩷۟۬, reason: not valid java name and contains not printable characters */
    public static void m3012(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ᩹᩸ۖ, reason: not valid java name and contains not printable characters */
    public static void m3013(Object obj, Object obj2) {
        ((C19258) obj).m44421((View) obj2);
    }

    public C0798(Context context, C14472 c14472) {
        this.f2923 = c14472;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) c14472.m34573());
        this.f2921 = mediaController;
        if (c14472.m34569() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiverC0092(this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3014() {
        C14472 c14472 = this.f2923;
        if (c14472.m34569() == null) {
            return;
        }
        ArrayList<AbstractC19144> arrayList = this.f2924;
        for (AbstractC19144 abstractC19144 : arrayList) {
            BinderC5032 binderC5032 = new BinderC5032(abstractC19144);
            this.f2920.put(abstractC19144, binderC5032);
            abstractC19144.f60342 = binderC5032;
            try {
                c14472.m34569().mo7354(binderC5032);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }
}
