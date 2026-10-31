package l;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۙۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4549 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Boolean f14514;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC8077 f14515;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f14516;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC18866 f14517;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f14518 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile int f14519 = Integer.MIN_VALUE;

    public C4549() {
        if (f14514 == null) {
            if (!C4925.m14335().bindService(new Intent(C4925.m14335(), (Class<?>) ServiceC22393.class), new ServiceConnectionC21483(), 1)) {
                f14514 = Boolean.FALSE;
            }
        }
        Application applicationM14335 = C4925.m14335();
        Intent intent = new Intent(applicationM14335, (Class<?>) ServiceC16042.class);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ServiceConnectionC22188 serviceConnectionC22188 = new ServiceConnectionC22188(this);
        if (applicationM14335.bindService(intent, serviceConnectionC22188, 1)) {
            this.f14515 = new RunnableC8077(this, atomicBoolean, applicationM14335, serviceConnectionC22188);
        } else {
            this.f14515 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13371(C4549 c4549, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        if (atomicBoolean.compareAndSet(false, true)) {
            c4549.f14517 = null;
            try {
                application.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13377(String str, boolean z, boolean z2) throws Exception {
        if (this.f14517 == null || f14514 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 2000;
            while (true) {
                if (this.f14517 != null && f14514 != null) {
                    break;
                } else if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    throw new Exception("Connection timeout");
                }
            }
        }
        if (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        this.f14518 = Integer.MIN_VALUE;
        this.f14516 = false;
        boolean zMo8299 = this.f14517.mo8299(str, z, f14514.booleanValue(), z2);
        int i = this.f14519;
        if (this.f14517 != null) {
            try {
                this.f14518 = this.f14517.mo8298();
                this.f14519 = this.f14518;
                this.f14516 = true;
                C1080.m3666(this.f14518);
            } catch (Exception unused) {
                if (i != Integer.MIN_VALUE) {
                    C1080.m3666(i);
                }
            }
        } else if (i != Integer.MIN_VALUE) {
            C1080.m3666(i);
        }
        if (zMo8299) {
            return;
        }
        m13374();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13376() {
        if (this.f14517 != null) {
            try {
                this.f14517.exit();
            } catch (Throwable unused) {
            }
        }
        this.f14517 = null;
        RunnableC8077 runnableC8077 = this.f14515;
        if (runnableC8077 == null) {
            return;
        }
        try {
            runnableC8077.run();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m13381(byte[] bArr) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo8311 = this.f14517.mo8311(bArr);
        if (strMo8311 == null) {
            m13374();
        }
        return strMo8311;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13375(byte[] bArr) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo8306 = this.f14517.mo8306(bArr);
        if (strMo8306 == null) {
            m13374();
        }
        return Integer.parseInt(strMo8306);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m13378(String str, String str2) throws C3138 {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] bArrM25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        byte[] bArrMo8304 = this.f14517.mo8304(bArrM25444);
        if (bArrMo8304 == null) {
            m13374();
        }
        return bArrMo8304;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short[] m13386(String str, String str2) throws C3138 {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] bArrM25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo8310 = this.f14517.mo8310(bArrM25444);
        if (iArrMo8310 == null) {
            m13374();
            return null;
        }
        int length = iArrMo8310.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) iArrMo8310[i];
        }
        return sArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] m13382(String str, String str2) throws C3138 {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] bArrM25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo8308 = this.f14517.mo8308(bArrM25444);
        if (iArrMo8308 == null) {
            m13374();
            return null;
        }
        int length = iArrMo8308.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArrMo8308[i];
        }
        return cArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m13384(String str, String str2) throws C3138 {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] bArrM25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo8301 = this.f14517.mo8301(bArrM25444);
        if (iArrMo8301 != null) {
            return iArrMo8301;
        }
        m13374();
        return null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m13388(String str, String str2) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int iMo8303 = this.f14517.mo8303(str, str2);
        if (iMo8303 == -1) {
            m13374();
        }
        return iMo8303;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m13380(String str, String str2) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo8305 = this.f14517.mo8305(str, str2);
        if (strMo8305 == null) {
            m13374();
        }
        return strMo8305;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m13387(String str, String str2) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo8300 = this.f14517.mo8300(str, str2);
        if (iArrMo8300 == null) {
            m13374();
        }
        return iArrMo8300;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] m13383(String str, String str2) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo8312 = this.f14517.mo8312(str, str2);
        if (iArrMo8312 == null) {
            m13374();
        }
        return iArrMo8312;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] m13379(String str, String str2) throws C3138 {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo8307 = this.f14517.mo8307(str, str2);
        if (iArrMo8307 == null) {
            m13374();
        }
        return iArrMo8307;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m13385(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        this.f14517.mo8309(str, str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13374() throws C3138 {
        if (this.f14517 == null) {
            throw new C3138("Disconnected after load failure");
        }
        try {
            String[] strArrMo8302 = this.f14517.mo8302();
            if (strArrMo8302 != null) {
                String strM14327 = strArrMo8302[0];
                int i = !this.f14516 ? Integer.MIN_VALUE : this.f14518;
                if (i != Integer.MIN_VALUE && i <= -1000) {
                    strM14327 = C4925.m14327(R.string.MT_Protector);
                } else if (strM14327 != null && strM14327.startsWith("Seccomp fatal:")) {
                    strM14327 = C4925.m14327(R.string.MT_Protector);
                }
                throw new C20072(strM14327, strArrMo8302);
            }
        } catch (RemoteException unused) {
            throw new C3138("Disconnected after load failure");
        }
    }
}
