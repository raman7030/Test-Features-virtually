package p067l;

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
import bin.p000mt.plus.Main;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩹ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C1929 {

    /* JADX INFO: renamed from: ۤܿܳ, reason: not valid java name and contains not printable characters */
    public static int f83011;

    /* JADX INFO: renamed from: ֫ */
    public Messenger f72896;

    /* JADX INFO: renamed from: ۧ */
    public Bundle f72897;

    /* JADX INFO: renamed from: ۖۘ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m56553() {
        return false;
    }

    /* JADX INFO: renamed from: ۗ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static void m56554(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ۘ᩹ܿ, reason: not valid java name and contains not printable characters */
    public static void m56555(Object obj, Object obj2) {
        ((C14146) obj).mo27932((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡܽ֨, reason: not valid java name and contains not printable characters */
    public static String m56556(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۡܽۙ, reason: not valid java name and contains not printable characters */
    public static int m56557(Object obj) {
        return ((C25065) obj).m55015();
    }

    /* JADX INFO: renamed from: ۡ᩺ᩴ, reason: not valid java name and contains not printable characters */
    public static String m56558(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤܳ۠, reason: not valid java name and contains not printable characters */
    public static void m56559(Object obj, Object obj2) {
        ((AbstractActivityC5549) obj).m12273((String) obj2);
    }

    /* JADX INFO: renamed from: ܳ֨ۛ, reason: not valid java name and contains not printable characters */
    public static Main m56560(Object obj) {
        return ((C18107) obj).m41282();
    }

    /* JADX INFO: renamed from: ܶۗ᩷, reason: not valid java name and contains not printable characters */
    public static Iterator m56561(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩴۙᩴ, reason: not valid java name and contains not printable characters */
    public static void m56562(Object obj) {
        C13045.m29866((String) obj);
    }

    /* JADX INFO: renamed from: ᩵֫۟, reason: not valid java name and contains not printable characters */
    public static Object m56563(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ᩵ۤᩴ, reason: not valid java name and contains not printable characters */
    public static void m56564(Object obj, Object obj2) {
        ((C1326) obj).setSubtitle((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩶֨ۗ, reason: not valid java name and contains not printable characters */
    public static void m56565(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ᩶֨᩷, reason: not valid java name and contains not printable characters */
    public static void m56566(Object obj, int i) {
        ((InterfaceC6631) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ᩶֫۟, reason: not valid java name and contains not printable characters */
    public static Button m56567(Object obj) {
        return ((DialogInterfaceC2564) obj).m3860();
    }

    /* JADX INFO: renamed from: ᩶ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m56568(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    public C1929(IBinder iBinder, Bundle bundle) {
        this.f72896 = new Messenger(iBinder);
        this.f72897 = bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51682(Context context, Messenger messenger) {
        Bundle bundle = new Bundle();
        bundle.putString("data_package_name", context.getPackageName());
        bundle.putInt("data_calling_pid", Process.myPid());
        bundle.putBundle("data_root_hints", this.f72897);
        m51681(6, bundle, messenger);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51683(Messenger messenger) {
        m51681(7, null, messenger);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51681(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        this.f72896.send(messageObtain);
    }
}
