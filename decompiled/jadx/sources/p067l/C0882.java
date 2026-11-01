package p067l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.view.View;
import bin.p000mt.plugin.api.PluginContext;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨֫ */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes.dex */
public class C0882 {

    /* JADX INFO: renamed from: ᩺ܺ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f81846;

    /* JADX INFO: renamed from: ۧ */
    public final MediaController f5692;

    /* JADX INFO: renamed from: ܿ */
    public final C1560 f5694;

    /* JADX INFO: renamed from: ܽ */
    public final Object f5693 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f5695 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public HashMap f5691 = new HashMap();

    /* JADX INFO: renamed from: ֡֫ۙ, reason: not valid java name and contains not printable characters */
    public static int m55710() {
        return 0;
    }

    /* JADX INFO: renamed from: ֡ۢ֨, reason: not valid java name and contains not printable characters */
    public static String m55711(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ֨ܳۗ, reason: not valid java name and contains not printable characters */
    public static char m55712(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ֫ܶۚ, reason: not valid java name and contains not printable characters */
    public static boolean m55713() {
        return C24414.m53850();
    }

    /* JADX INFO: renamed from: ֫ܿۢ, reason: not valid java name and contains not printable characters */
    public static void m55714(Object obj) {
        ((AbstractC17043) obj).m38666();
    }

    /* JADX INFO: renamed from: ۖܺۜ, reason: not valid java name and contains not printable characters */
    public static boolean m55715(Object obj) {
        return ((File) obj).exists();
    }

    /* JADX INFO: renamed from: ۚ۬᩷, reason: not valid java name and contains not printable characters */
    public static void m55716(int i) {
        C22682.m50799(i);
    }

    /* JADX INFO: renamed from: ۚܺ᩵, reason: not valid java name and contains not printable characters */
    public static String m55717(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛۗ᩹, reason: not valid java name and contains not printable characters */
    public static int m55718(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ۡۚܽ, reason: not valid java name and contains not printable characters */
    public static int m55719(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ܶ֨ۜ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m55720(Object obj, long j) {
        return ((ObjectAnimator) obj).setDuration(j);
    }

    /* JADX INFO: renamed from: ᩳ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static Intent m55721(Object obj, int i) {
        return ((Intent) obj).addFlags(i);
    }

    /* JADX INFO: renamed from: ᩷ۖ֫, reason: not valid java name and contains not printable characters */
    public static boolean m55722(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ᩷ۚ᩷, reason: not valid java name and contains not printable characters */
    public static void m55723(Object obj, Object obj2) {
        ((C2836) obj).m4535((String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩷۟۬, reason: not valid java name and contains not printable characters */
    public static void m55724(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ᩹᩸ۖ, reason: not valid java name and contains not printable characters */
    public static void m55725(Object obj, Object obj2) {
        ((C20671) obj).m46715((View) obj2);
    }

    public C0882(Context context, C1560 c1560) {
        this.f5694 = c1560;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) c1560.m36714());
        this.f5692 = mediaController;
        if (c1560.m36710() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiverC0847(this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5327() {
        C1560 c1560 = this.f5694;
        if (c1560.m36710() == null) {
            return;
        }
        ArrayList<AbstractC1792> arrayList = this.f5695;
        for (AbstractC1792 abstractC1792 : arrayList) {
            BinderC1092 binderC1092 = new BinderC1092(abstractC1792);
            this.f5691.put(abstractC1792, binderC1092);
            abstractC1792.f63573 = binderC1092;
            try {
                c1560.m36710().mo9437(binderC1092);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }
}
