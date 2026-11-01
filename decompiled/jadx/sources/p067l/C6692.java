package p067l;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۙۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6692 {

    /* JADX INFO: renamed from: ܳ */
    public static Boolean f17344;

    /* JADX INFO: renamed from: ֫ */
    public final RunnableC10045 f17345;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f17346;

    /* JADX INFO: renamed from: ܽ */
    public volatile InterfaceC20299 f17347;

    /* JADX INFO: renamed from: ܿ */
    public volatile int f17348 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩳ */
    public volatile int f17349 = Integer.MIN_VALUE;

    public C6692() {
        if (f17344 == null) {
            if (!C7050.m16232().bindService(new Intent(C7050.m16232(), (Class<?>) ServiceC23651.class), new ServiceConnectionC22786(), 1)) {
                f17344 = Boolean.FALSE;
            }
        }
        Application applicationM16232 = C7050.m16232();
        Intent intent = new Intent(applicationM16232, (Class<?>) ServiceC17615.class);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ServiceConnectionC23456 serviceConnectionC23456 = new ServiceConnectionC23456(this);
        if (applicationM16232.bindService(intent, serviceConnectionC23456, 1)) {
            this.f17345 = new RunnableC10045(this, atomicBoolean, applicationM16232, serviceConnectionC23456);
        } else {
            this.f17345 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15259(C6692 c6692, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        if (atomicBoolean.compareAndSet(false, true)) {
            c6692.f17347 = null;
            try {
                application.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX INFO: renamed from: ֫ */
    public final void m15265(String str, boolean z, boolean z2) throws Exception {
        if (this.f17347 == null || f17344 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 2000;
            while (true) {
                if (this.f17347 != null && f17344 != null) {
                    break;
                } else if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    throw new Exception("Connection timeout");
                }
            }
        }
        if (str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        this.f17348 = Integer.MIN_VALUE;
        this.f17346 = false;
        boolean zMo10343 = this.f17347.mo10343(str, z, f17344.booleanValue(), z2);
        int i = this.f17349;
        if (this.f17347 != null) {
            try {
                this.f17348 = this.f17347.mo10342();
                this.f17349 = this.f17348;
                this.f17346 = true;
                C3395.m5937(this.f17348);
            } catch (Exception unused) {
                if (i != Integer.MIN_VALUE) {
                    C3395.m5937(i);
                }
            }
        } else if (i != Integer.MIN_VALUE) {
            C3395.m5937(i);
        }
        if (zMo10343) {
            return;
        }
        m15262();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15264() {
        if (this.f17347 != null) {
            try {
                this.f17347.exit();
            } catch (Throwable unused) {
            }
        }
        this.f17347 = null;
        RunnableC10045 runnableC10045 = this.f17345;
        if (runnableC10045 == null) {
            return;
        }
        try {
            runnableC10045.run();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m15269(byte[] bArr) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo10355 = this.f17347.mo10355(bArr);
        if (strMo10355 == null) {
            m15262();
        }
        return strMo10355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15263(byte[] bArr) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo10350 = this.f17347.mo10350(bArr);
        if (strMo10350 == null) {
            m15262();
        }
        return Integer.parseInt(strMo10350);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m15266(String str, String str2) throws C5351 {
        C11996 c11996 = new C11996();
        c11996.m27443((CharSequence) str);
        c11996.m27443((CharSequence) str2);
        c11996.writeByte(0);
        byte[] bArrM27464 = c11996.m27464();
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        byte[] bArrMo10348 = this.f17347.mo10348(bArrM27464);
        if (bArrMo10348 == null) {
            m15262();
        }
        return bArrMo10348;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final short[] m15274(String str, String str2) throws C5351 {
        C11996 c11996 = new C11996();
        c11996.m27443((CharSequence) str);
        c11996.m27443((CharSequence) str2);
        c11996.writeByte(0);
        byte[] bArrM27464 = c11996.m27464();
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo10354 = this.f17347.mo10354(bArrM27464);
        if (iArrMo10354 == null) {
            m15262();
            return null;
        }
        int length = iArrMo10354.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) iArrMo10354[i];
        }
        return sArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final char[] m15270(String str, String str2) throws C5351 {
        C11996 c11996 = new C11996();
        c11996.m27443((CharSequence) str);
        c11996.m27443((CharSequence) str2);
        c11996.writeByte(0);
        byte[] bArrM27464 = c11996.m27464();
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo10352 = this.f17347.mo10352(bArrM27464);
        if (iArrMo10352 == null) {
            m15262();
            return null;
        }
        int length = iArrMo10352.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArrMo10352[i];
        }
        return cArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int[] m15272(String str, String str2) throws C5351 {
        C11996 c11996 = new C11996();
        c11996.m27443((CharSequence) str);
        c11996.m27443((CharSequence) str2);
        c11996.writeByte(0);
        byte[] bArrM27464 = c11996.m27464();
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo10345 = this.f17347.mo10345(bArrM27464);
        if (iArrMo10345 != null) {
            return iArrMo10345;
        }
        m15262();
        return null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m15276(String str, String str2) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int iMo10347 = this.f17347.mo10347(str, str2);
        if (iMo10347 == -1) {
            m15262();
        }
        return iMo10347;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m15268(String str, String str2) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        String strMo10349 = this.f17347.mo10349(str, str2);
        if (strMo10349 == null) {
            m15262();
        }
        return strMo10349;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int[] m15275(String str, String str2) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo10344 = this.f17347.mo10344(str, str2);
        if (iArrMo10344 == null) {
            m15262();
        }
        return iArrMo10344;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int[] m15271(String str, String str2) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo10356 = this.f17347.mo10356(str, str2);
        if (iArrMo10356 == null) {
            m15262();
        }
        return iArrMo10356;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int[] m15267(String str, String str2) throws C5351 {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] iArrMo10351 = this.f17347.mo10351(str, str2);
        if (iArrMo10351 == null) {
            m15262();
        }
        return iArrMo10351;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m15273(String str, String str2) {
        if (this.f17347 == null) {
            throw new RuntimeException("Disconnected");
        }
        this.f17347.mo10353(str, str2);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m15262() throws C5351 {
        if (this.f17347 == null) {
            throw new C5351("Disconnected after load failure");
        }
        try {
            String[] strArrMo10346 = this.f17347.mo10346();
            if (strArrMo10346 != null) {
                String strM16224 = strArrMo10346[0];
                int i = !this.f17346 ? Integer.MIN_VALUE : this.f17348;
                if (i != Integer.MIN_VALUE && i <= -1000) {
                    strM16224 = C7050.m16224(R.string.MT_Protector);
                } else if (strM16224 != null && strM16224.startsWith("Seccomp fatal:")) {
                    strM16224 = C7050.m16224(R.string.MT_Protector);
                }
                throw new C21445(strM16224, strArrMo10346);
            }
        } catch (RemoteException unused) {
            throw new C5351("Disconnected after load failure");
        }
    }
}
