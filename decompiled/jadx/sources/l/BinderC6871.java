package l;

import android.util.Log;
import bin.mt.plus.Features2;
import com.alipay.sdk.m.t.e;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۜܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC6871 extends AbstractBinderC4049 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC16042 f21236;

    public BinderC6871(ServiceC16042 serviceC16042) {
        this.f21236 = serviceC16042;
        attachInterface(this, "bin.mt.dstr.ipc.IDecryptorAidlInterface");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ca A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #0 {all -> 0x00ce, blocks: (B:19:0x00c4, B:21:0x00ca), top: B:42:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ef A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0119 A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x012a A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x013b A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x013b, please report this as an issue */
    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8299(String str, final boolean z, boolean z2, boolean z3) {
        String str2;
        int iInit;
        ClassLoader systemClassLoader;
        ServiceC16042 serviceC16042 = this.f21236;
        ClassLoader parent = null;
        serviceC16042.f49480 = null;
        if (serviceC16042.f49477) {
            serviceC16042.f49480 = new IllegalStateException("Decryptor session already loaded");
            return false;
        }
        ServiceC16042.m37946(serviceC16042, true);
        try {
            File canonicalFile = new File(serviceC16042.getCacheDir(), "decrypt").getCanonicalFile();
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile.equals(canonicalFile2)) {
                throw new IllegalArgumentException(C20094.m46315("Unsupported work dir: ", str));
            }
            File file = new File(canonicalFile2, "base.apk");
            if (!file.isFile()) {
                throw new IllegalArgumentException("Missing base.apk");
            }
            File file2 = new File(canonicalFile2, "lib");
            File file3 = new File(canonicalFile2, "opt");
            File file4 = new File(canonicalFile2, e.m);
            File file5 = new File(canonicalFile2, "tmp");
            File file6 = new File(canonicalFile2, "lib_abi");
            try {
                if (file6.isFile()) {
                    Charset charset = StandardCharsets.UTF_8;
                    String strTrim = C15843.m37502(file6).trim();
                    if (!strTrim.isEmpty()) {
                        str2 = strTrim;
                    }
                    C15843.m37505(file2);
                    C15843.m37505(file3);
                    C15843.m37505(file5);
                    C15843.m37505(new File(file4, "files"));
                    C15843.m37505(new File(file4, "cache"));
                    C15843.m37505(new File(file4, "code_cache"));
                    file.setReadOnly();
                    String path = file.getPath();
                    String path2 = file3.getPath();
                    String path3 = file2.getPath();
                    systemClassLoader = ClassLoader.getSystemClassLoader();
                    if (systemClassLoader != null) {
                        parent = systemClassLoader.getParent();
                    }
                    serviceC16042.f49483 = new C11626(path, path2, path3, parent);
                    serviceC16042.f49481 = new C5981(serviceC16042.getApplicationContext(), file, C19993.m46094(file.getPath()), serviceC16042.f49483, file2, file4, str2);
                    if (z2) {
                        C15336.m36370();
                    }
                    C20177 c20177 = ServiceC16042.f49473;
                    String packageName = serviceC16042.f49481.getPackageName();
                    String packageName2 = serviceC16042.getPackageName();
                    String canonicalPath = canonicalFile2.getCanonicalPath();
                    String strM16795 = serviceC16042.f49481.m16795();
                    c20177.getClass();
                    iInit = Features2.init(packageName, packageName2, canonicalPath, strM16795);
                    if (iInit == 0) {
                        throw new IllegalStateException("Native hook init failed: " + iInit);
                    }
                    if (z3) {
                        ServiceC16042.f49471.getClass();
                        ServiceC16042.m37931(serviceC16042, Features2.installSeccomp(15));
                    } else {
                        ServiceC16042.m37951(serviceC16042);
                    }
                    ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ܿܺᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            ServiceC16042.m37941(this.f53317.f21236, z);
                            return null;
                        }
                    });
                    serviceC16042.f49477 = true;
                    return true;
                }
                systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    parent = systemClassLoader.getParent();
                }
            } catch (Throwable unused) {
            }
            str2 = null;
            C15843.m37505(file2);
            C15843.m37505(file3);
            C15843.m37505(file5);
            C15843.m37505(new File(file4, "files"));
            C15843.m37505(new File(file4, "cache"));
            C15843.m37505(new File(file4, "code_cache"));
            file.setReadOnly();
            String path4 = file.getPath();
            String path5 = file3.getPath();
            String path6 = file2.getPath();
            serviceC16042.f49483 = new C11626(path4, path5, path6, parent);
            serviceC16042.f49481 = new C5981(serviceC16042.getApplicationContext(), file, C19993.m46094(file.getPath()), serviceC16042.f49483, file2, file4, str2);
            if (z2) {
                C15336.m36370();
            }
            C20177 c20178 = ServiceC16042.f49473;
            String packageName3 = serviceC16042.f49481.getPackageName();
            String packageName4 = serviceC16042.getPackageName();
            String canonicalPath2 = canonicalFile2.getCanonicalPath();
            String strM16796 = serviceC16042.f49481.m16795();
            c20178.getClass();
            iInit = Features2.init(packageName3, packageName4, canonicalPath2, strM16796);
            if (iInit == 0) {
                throw new IllegalStateException("Native hook init failed: " + iInit);
            }
            if (z3) {
                ServiceC16042.f49471.getClass();
                ServiceC16042.m37931(serviceC16042, Features2.installSeccomp(15));
            } else {
                ServiceC16042.m37951(serviceC16042);
            }
            ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ܿܺᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    ServiceC16042.m37941(this.f53317.f21236, z);
                    return null;
                }
            });
            serviceC16042.f49477 = true;
            return true;
        } catch (Exception e) {
            ServiceC16042.m37946(serviceC16042, false);
            serviceC16042.f49480 = e;
            return false;
        }
    }

    @Override // l.InterfaceC18866
    public final void exit() {
        this.f21236.stopSelf();
        System.exit(0);
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo8302() {
        ServiceC16042 serviceC16042 = this.f21236;
        if (serviceC16042.f49480 == null) {
            return null;
        }
        String message = serviceC16042.f49480.getMessage();
        if (message == null || message.isEmpty()) {
            message = serviceC16042.f49480.toString();
        }
        String stackTraceString = Log.getStackTraceString(serviceC16042.f49480);
        serviceC16042.f49480 = null;
        return new String[]{message, stackTraceString};
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֨ */
    public final int mo8298() {
        return this.f21236.f49478;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Object m18603(byte[] bArr) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        C12951 c12951 = new C12951(bArr);
        final String strM31504 = c12951.m31504();
        final String strM31505 = c12951.m31504();
        int i = c12951.readByte() & 255;
        final Class[] clsArr = new Class[i];
        final Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch (c12951.readByte()) {
                case 0:
                    clsArr[i2] = Byte.TYPE;
                    objArr[i2] = Byte.valueOf(c12951.readByte());
                    break;
                case 1:
                    clsArr[i2] = Short.TYPE;
                    objArr[i2] = Short.valueOf(c12951.readShort());
                    break;
                case 2:
                    clsArr[i2] = Character.TYPE;
                    objArr[i2] = Character.valueOf(c12951.m31507());
                    break;
                case 3:
                    clsArr[i2] = Integer.TYPE;
                    objArr[i2] = Integer.valueOf(c12951.readInt());
                    break;
                case 4:
                    clsArr[i2] = Long.TYPE;
                    objArr[i2] = Long.valueOf(c12951.readLong());
                    break;
                case 5:
                    clsArr[i2] = Float.TYPE;
                    objArr[i2] = Float.valueOf(c12951.m31495());
                    break;
                case 6:
                    clsArr[i2] = Double.TYPE;
                    objArr[i2] = Double.valueOf(Double.longBitsToDouble(c12951.readLong()));
                    break;
                case 7:
                    clsArr[i2] = Boolean.TYPE;
                    objArr[i2] = Boolean.valueOf(c12951.m31498());
                    break;
                case 8:
                    clsArr[i2] = String.class;
                    objArr[i2] = c12951.m31504();
                    break;
                case 9:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c12951.m31504();
                    break;
                case 10:
                    clsArr[i2] = byte[].class;
                    objArr[i2] = c12951.m31496();
                    break;
                case 11:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c12951.m31496();
                    break;
                case 12:
                    clsArr[i2] = short[].class;
                    int i3 = c12951.readInt();
                    short[] sArr = new short[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        sArr[i4] = c12951.readShort();
                    }
                    objArr[i2] = sArr;
                    break;
                case 13:
                    clsArr[i2] = char[].class;
                    objArr[i2] = Character.valueOf(c12951.m31507());
                    break;
                case 14:
                    clsArr[i2] = int[].class;
                    objArr[i2] = c12951.m31491();
                    break;
                default:
                    serviceC16042.f49480 = new Exception("Unsupported parameter type");
                    return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM31504);
        sb.append(':');
        sb.append(strM31505);
        for (int i5 = 0; i5 < i; i5++) {
            Class cls = clsArr[i5];
            sb.append(':');
            sb.append(cls.getSimpleName());
        }
        final String string = sb.toString();
        if (serviceC16042.f49476.contains(string)) {
            serviceC16042.f49480 = new Exception(C20094.m46315("Disabled method: ", string));
            return null;
        }
        try {
            final Method method = (Method) ((ConcurrentMapC10942) serviceC16042.f49479).get(string);
            if (method == null) {
                method = (Method) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ܽܺᩳ
                    @Override // l.InterfaceC9694
                    public final Object call() {
                        final BinderC6871 binderC6871 = this.f51435;
                        ServiceC16042 serviceC16043 = binderC6871.f21236;
                        final String str = string;
                        final String str2 = strM31504;
                        final String str3 = strM31505;
                        final Class[] clsArr2 = clsArr;
                        return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.ۨۡᩳ
                            @Override // l.InterfaceC9694
                            public final Object call() {
                                String str4 = str2;
                                String str5 = str3;
                                Class<?>[] clsArr3 = clsArr2;
                                ServiceC16042 serviceC16044 = binderC6871.f21236;
                                ConcurrentMapC10942 concurrentMapC10942 = (ConcurrentMapC10942) serviceC16044.f49479;
                                String str6 = str;
                                Method method2 = (Method) concurrentMapC10942.get(str6);
                                if (method2 != null) {
                                    return method2;
                                }
                                try {
                                    Method declaredMethod = Class.forName(str4, true, serviceC16044.f49483).getDeclaredMethod(str5, clsArr3);
                                    if (!declaredMethod.isAccessible()) {
                                        declaredMethod.setAccessible(true);
                                    }
                                    ((ConcurrentMapC10942) serviceC16044.f49479).put(str6, declaredMethod);
                                    return declaredMethod;
                                } catch (Exception e) {
                                    serviceC16044.f49480 = e;
                                    return null;
                                }
                            }
                        });
                    }
                });
            }
            Future futureSubmit = ServiceC16042.f49472.submit(new Callable() { // from class: l.ᩳܺᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ServiceC16042 serviceC16043 = this.f56466.f21236;
                    final Method method2 = method;
                    final Object[] objArr2 = objArr;
                    return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.ܳܺᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            return method2.invoke(null, objArr2);
                        }
                    });
                }
            });
            try {
                return futureSubmit.get(2L, TimeUnit.SECONDS);
            } catch (ExecutionException e) {
                serviceC16042.f49480 = e.getCause();
                return null;
            } catch (TimeoutException e2) {
                serviceC16042.f49480 = e2;
                futureSubmit.cancel(true);
                serviceC16042.f49476.add(string);
                return null;
            }
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8311(byte[] bArr) {
        Object objM18603 = m18603(bArr);
        if (objM18603 == null) {
            return null;
        }
        return objM18603.toString();
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܳ */
    public final String mo8306(byte[] bArr) {
        Integer num = (Integer) m18603(bArr);
        if (num == null) {
            return null;
        }
        return String.valueOf(num);
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo8304(byte[] bArr) {
        return (byte[]) m18603(bArr);
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܿ */
    public final int[] mo8310(byte[] bArr) {
        short[] sArr = (short[]) m18603(bArr);
        if (sArr == null) {
            return null;
        }
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = sArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܽ */
    public final int[] mo8308(byte[] bArr) {
        char[] cArr = (char[]) m18603(bArr);
        if (cArr == null) {
            return null;
        }
        int[] iArr = new int[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            iArr[i] = cArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo8301(byte[] bArr) {
        return (int[]) m18603(bArr);
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ۧ */
    public final int mo8303(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return ((Integer) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.۬ۡᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = this.f38957;
                    ServiceC16042 serviceC16043 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.ۤۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() throws Exception {
                            C11626 c11626 = binderC6871.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            })).intValue();
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return -1;
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܳ */
    public final String mo8305(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (String) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ܰۡᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = this.f40938;
                    ServiceC16042 serviceC16043 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.۫ۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() throws Exception {
                            C11626 c11626 = binderC6871.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == String.class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo8300(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (int[]) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.۟ۡᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = this.f22641;
                    ServiceC16042 serviceC16043 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.ۛۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() throws Exception {
                            C11626 c11626 = binderC6871.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == short[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    short[] sArr = (short[]) field.get(null);
                                    if (sArr == null) {
                                        return null;
                                    }
                                    int[] iArr = new int[sArr.length];
                                    for (int i2 = 0; i2 < sArr.length; i2++) {
                                        iArr[i2] = sArr[i2];
                                    }
                                    return iArr;
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ᩳ */
    public final int[] mo8312(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (int[]) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.֫ܺᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = this.f6470;
                    ServiceC16042 serviceC16043 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.᩺ۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() throws Exception {
                            C11626 c11626 = binderC6871.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == char[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    char[] cArr = (char[]) field.get(null);
                                    if (cArr == null) {
                                        return null;
                                    }
                                    int[] iArr = new int[cArr.length];
                                    for (int i2 = 0; i2 < cArr.length; i2++) {
                                        iArr[i2] = cArr[i2];
                                    }
                                    return iArr;
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܽ */
    public final int[] mo8307(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (int[]) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ۧܺᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = this.f33326;
                    ServiceC16042 serviceC16043 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC16043, new InterfaceC9694() { // from class: l.᩻ܺᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() throws Exception {
                            C11626 c11626 = binderC6871.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == int[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܿ */
    public final void mo8309(String str, String str2) {
        C15336.m36366(str, str2);
    }
}
