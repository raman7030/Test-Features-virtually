package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import bin.mt.plus.Main;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C21923 {

    /* JADX INFO: renamed from: ۤܿܳ, reason: not valid java name and contains not printable characters */
    public static int f70183;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Messenger f70184;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Bundle f70185;

    /* JADX INFO: renamed from: ۖۘ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m49329() {
        return false;
    }

    /* JADX INFO: renamed from: ۗ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static void m49330(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ۘ᩹ܿ, reason: not valid java name and contains not printable characters */
    public static void m49331(Object obj, Object obj2) {
        ((C12392) obj).mo25910((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡܽ֨, reason: not valid java name and contains not printable characters */
    public static String m49332(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۡܽۙ, reason: not valid java name and contains not printable characters */
    public static int m49333(Object obj) {
        return ((C23881) obj).m52606();
    }

    /* JADX INFO: renamed from: ۡ᩺ᩴ, reason: not valid java name and contains not printable characters */
    public static String m49334(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤܳ۠, reason: not valid java name and contains not printable characters */
    public static void m49335(Object obj, Object obj2) {
        ((AbstractActivityC3346) obj).m10237((String) obj2);
    }

    /* JADX INFO: renamed from: ܳ֨ۛ, reason: not valid java name and contains not printable characters */
    public static Main m49336(Object obj) {
        return ((C16560) obj).m39056();
    }

    /* JADX INFO: renamed from: ܶۗ᩷, reason: not valid java name and contains not printable characters */
    public static Iterator m49337(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩴۙᩴ, reason: not valid java name and contains not printable characters */
    public static void m49338(Object obj) {
        C11233.m27804((String) obj);
    }

    /* JADX INFO: renamed from: ᩵֫۟, reason: not valid java name and contains not printable characters */
    public static Object m49339(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ᩵ۤᩴ, reason: not valid java name and contains not printable characters */
    public static void m49340(Object obj, Object obj2) {
        ((C9762) obj).setSubtitle((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩶֨ۗ, reason: not valid java name and contains not printable characters */
    public static void m49341(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ᩶֨᩷, reason: not valid java name and contains not printable characters */
    public static void m49342(Object obj, int i) {
        ((InterfaceC4485) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ᩶֫۟, reason: not valid java name and contains not printable characters */
    public static Button m49343(Object obj) {
        return ((DialogInterfaceC0206) obj).m1447();
    }

    /* JADX INFO: renamed from: ᩶ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m49344(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    public C21923(IBinder iBinder, Bundle bundle) {
        this.f70184 = new Messenger(iBinder);
        this.f70185 = bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49345(Context context, Messenger messenger) {
        Bundle bundle = new Bundle();
        bundle.putString("data_package_name", context.getPackageName());
        bundle.putInt("data_calling_pid", Process.myPid());
        bundle.putBundle("data_root_hints", this.f70185);
        m49328(6, bundle, messenger);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49346(Messenger messenger) {
        m49328(7, null, messenger);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49328(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        this.f70184.send(messageObtain);
    }
}
