package l;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuApplication;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes.dex */
public final class C23216 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f74605 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f74606 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int f74607 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static IShizukuService f74610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f74614;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static IBinder f74615;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final IShizukuApplication f74609 = new BinderC3461();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C21806 f74608 = new C21806();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f74612 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f74604 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f74613 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Handler f74611 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m51520(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f74609.asBinder());
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            boolean zTransact = iBinder.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51514(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f74609.asBinder());
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51524(IBinder iBinder, String str) {
        IBinder iBinder2 = f74615;
        if (iBinder2 == iBinder) {
            return;
        }
        if (iBinder == null) {
            f74615 = null;
            f74610 = null;
            f74606 = -1;
            f74607 = -1;
            synchronized (f74612) {
                for (C13338 c13338 : f74604) {
                    c13338.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((InterfaceC12633) c13338.f39907).m30893();
                    } else {
                        Handler handler = f74611;
                        InterfaceC12633 interfaceC12633 = (InterfaceC12633) c13338.f39907;
                        C11003.requireNonNull(interfaceC12633);
                        handler.post(new RunnableC22511(0, interfaceC12633));
                    }
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f74608, 0);
        }
        f74615 = iBinder;
        f74610 = IShizukuService.Stub.asInterface(iBinder);
        try {
            f74615.linkToDeath(f74608, 0);
        } catch (Throwable unused) {
        }
        try {
            if (!m51520(f74615, str) && !m51514(f74615, str)) {
                f74614 = true;
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
        if (f74614) {
            m51527();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51527() {
        ArrayList<C13338> arrayList = f74612;
        synchronized (arrayList) {
            for (C13338 c13338 : arrayList) {
                c13338.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC10517) c13338.f39907).m26426();
                } else {
                    Handler handler = f74611;
                    InterfaceC10517 interfaceC10517 = (InterfaceC10517) c13338.f39907;
                    C11003.requireNonNull(interfaceC10517);
                    handler.post(new RunnableC15454(0, interfaceC10517));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51511(InterfaceC6283 interfaceC6283) {
        synchronized (f74612) {
            f74613.add(new C13338(interfaceC6283));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51518(final InterfaceC6283 interfaceC6283) {
        synchronized (f74612) {
            C5378.removeIf(f74613, new Predicate() { // from class: l.ۙ᩶۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C13338) obj).f39907 == interfaceC6283;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51510(final int i, final int i2) {
        synchronized (f74612) {
            for (final C13338 c13338 : f74613) {
                c13338.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC6283) c13338.f39907).mo12970(i, i2);
                } else {
                    f74611.post(new Runnable() { // from class: l.᩶᩶۠
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC6283) c13338.f39907).mo12970(i, i2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static IShizukuService m51515() {
        IShizukuService iShizukuService = f74610;
        if (iShizukuService != null) {
            return iShizukuService;
        }
        throw new IllegalStateException("binder haven't been received");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static IBinder m51522() {
        return f74615;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m51528() {
        IBinder iBinder = f74615;
        return iBinder != null && iBinder.pingBinder();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m51526() {
        int i = f74606;
        if (i != -1) {
            return i;
        }
        try {
            int uid = m51515().getUid();
            f74606 = uid;
            return uid;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m51525() {
        int i = f74607;
        if (i != -1) {
            return i;
        }
        try {
            int version = m51515().getVersion();
            f74607 = version;
            return version;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m51521() {
        return f74614;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51512(C11928 c11928, ServiceConnection serviceConnection) {
        BinderC17823 binderC17823M40145 = C17117.m40145(c11928);
        binderC17823M40145.m41765(serviceConnection);
        try {
            m51515().addUserService(binderC17823M40145, C11928.m29104(c11928));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51507(C11928 c11928) {
        BinderC17823 binderC17823M40145 = C17117.m40145(c11928);
        try {
            Bundle bundleM29104 = C11928.m29104(c11928);
            bundleM29104.putBoolean("shizuku:user-service-arg-no-create", true);
            int iAddUserService = m51515().addUserService(binderC17823M40145, bundleM29104);
            if (f74614 || m51525() < 13) {
                return iAddUserService == 0 ? 0 : -1;
            }
            return iAddUserService;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51519(C11928 c11928) {
        try {
            IShizukuService iShizukuServiceM51515 = m51515();
            c11928.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", c11928.f35659);
            bundle.putBoolean("shizuku:user-service-remove", true);
            iShizukuServiceM51515.removeUserService(null, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51523(int i) {
        try {
            m51515().requestPermission(i);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m51516() {
        if (f74605) {
            return 0;
        }
        try {
            boolean zCheckSelfPermission = m51515().checkSelfPermission();
            f74605 = zCheckSelfPermission;
            return zCheckSelfPermission ? 0 : -1;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
