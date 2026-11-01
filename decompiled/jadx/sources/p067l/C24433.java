package p067l;

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
public final class C24433 {

    /* JADX INFO: renamed from: ۜ */
    public static boolean f77348 = false;

    /* JADX INFO: renamed from: ۡ */
    public static int f77349 = -1;

    /* JADX INFO: renamed from: ۢ */
    public static int f77350 = -1;

    /* JADX INFO: renamed from: ܺ */
    public static IShizukuService f77353;

    /* JADX INFO: renamed from: ᩷ */
    public static boolean f77357;

    /* JADX INFO: renamed from: ᩻ */
    public static IBinder f77358;

    /* JADX INFO: renamed from: ܳ */
    public static final IShizukuApplication f77352 = new BinderC5658();

    /* JADX INFO: renamed from: ۧ */
    public static final C23093 f77351 = new C23093();

    /* JADX INFO: renamed from: ܿ */
    public static final ArrayList f77355 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static final ArrayList f77347 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public static final ArrayList f77356 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public static final Handler f77354 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۧ */
    public static boolean m53917(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f77352.asBinder());
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53911(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(f77352.asBinder());
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53921(IBinder iBinder, String str) {
        IBinder iBinder2 = f77358;
        if (iBinder2 == iBinder) {
            return;
        }
        if (iBinder == null) {
            f77358 = null;
            f77353 = null;
            f77349 = -1;
            f77350 = -1;
            synchronized (f77355) {
                for (C15045 c15045 : f77347) {
                    c15045.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((InterfaceC14375) c15045.f42973).m32971();
                    } else {
                        Handler handler = f77354;
                        InterfaceC14375 interfaceC14375 = (InterfaceC14375) c15045.f42973;
                        C12826.requireNonNull(interfaceC14375);
                        handler.post(new RunnableC23763(0, interfaceC14375));
                    }
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f77351, 0);
        }
        f77358 = iBinder;
        f77353 = IShizukuService.Stub.asInterface(iBinder);
        try {
            f77358.linkToDeath(f77351, 0);
        } catch (Throwable unused) {
        }
        try {
            if (!m53917(f77358, str) && !m53911(f77358, str)) {
                f77357 = true;
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
        if (f77357) {
            m53924();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m53924() {
        ArrayList<C15045> arrayList = f77355;
        synchronized (arrayList) {
            for (C15045 c15045 : arrayList) {
                c15045.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC12364) c15045.f42973).m28459();
                } else {
                    Handler handler = f77354;
                    InterfaceC12364 interfaceC12364 = (InterfaceC12364) c15045.f42973;
                    C12826.requireNonNull(interfaceC12364);
                    handler.post(new RunnableC17056(0, interfaceC12364));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53908(InterfaceC8340 interfaceC8340) {
        synchronized (f77355) {
            f77356.add(new C15045(interfaceC8340));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53915(final InterfaceC8340 interfaceC8340) {
        synchronized (f77355) {
            C7480.removeIf(f77356, new Predicate() { // from class: l.ۙ᩶۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m16110or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C15045) obj).f42973 == interfaceC8340;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53907(final int i, final int i2) {
        synchronized (f77355) {
            for (final C15045 c15045 : f77356) {
                c15045.getClass();
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((InterfaceC8340) c15045.f42973).mo14834(i, i2);
                } else {
                    f77354.post(new Runnable() { // from class: l.᩶᩶۠
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC8340) c15045.f42973).mo14834(i, i2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static IShizukuService m53912() {
        IShizukuService iShizukuService = f77353;
        if (iShizukuService != null) {
            return iShizukuService;
        }
        throw new IllegalStateException("binder haven't been received");
    }

    /* JADX INFO: renamed from: ܽ */
    public static IBinder m53919() {
        return f77358;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m53925() {
        IBinder iBinder = f77358;
        return iBinder != null && iBinder.pingBinder();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m53923() {
        int i = f77349;
        if (i != -1) {
            return i;
        }
        try {
            int uid = m53912().getUid();
            f77349 = uid;
            return uid;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m53922() {
        int i = f77350;
        if (i != -1) {
            return i;
        }
        try {
            int version = m53912().getVersion();
            f77350 = version;
            return version;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m53918() {
        return f77357;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53909(C13705 c13705, ServiceConnection serviceConnection) {
        BinderC19307 binderC19307M42390 = C18636.m42390(c13705);
        binderC19307M42390.m44011(serviceConnection);
        try {
            m53912().addUserService(binderC19307M42390, C13705.m31157(c13705));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53904(C13705 c13705) {
        BinderC19307 binderC19307M42390 = C18636.m42390(c13705);
        try {
            Bundle bundleM31157 = C13705.m31157(c13705);
            bundleM31157.putBoolean("shizuku:user-service-arg-no-create", true);
            int iAddUserService = m53912().addUserService(binderC19307M42390, bundleM31157);
            if (f77357 || m53922() < 13) {
                return iAddUserService == 0 ? 0 : -1;
            }
            return iAddUserService;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53916(C13705 c13705) {
        try {
            IShizukuService iShizukuServiceM53912 = m53912();
            c13705.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", c13705.f38668);
            bundle.putBoolean("shizuku:user-service-remove", true);
            iShizukuServiceM53912.removeUserService(null, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53920(int i) {
        try {
            m53912().requestPermission(i);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m53913() {
        if (f77348) {
            return 0;
        }
        try {
            boolean zCheckSelfPermission = m53912().checkSelfPermission();
            f77348 = zCheckSelfPermission;
            return zCheckSelfPermission ? 0 : -1;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
