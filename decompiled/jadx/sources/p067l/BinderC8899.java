package p067l;

import android.util.Log;
import bin.p000mt.plus.Features2;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
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
public final class BinderC8899 extends AbstractBinderC6217 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ServiceC17615 f24114;

    public BinderC8899(ServiceC17615 serviceC17615) {
        this.f24114 = serviceC17615;
        attachInterface(this, "bin.mt.dstr.ipc.IDecryptorAidlInterface");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ca A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #0 {all -> 0x00ce, blocks: (B:19:0x00c4, B:21:0x00ca), top: B:42:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ef A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0119 A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x012a A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x013b A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:7:0x0022, B:9:0x0040, B:11:0x004d, B:18:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:30:0x012d, B:29:0x012a, B:32:0x013b, B:33:0x014c, B:14:0x0077, B:34:0x014d, B:35:0x0154, B:36:0x0155, B:37:0x0160), top: B:44:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x013b, please report this as an issue */
    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10343(String str, final boolean z, boolean z2, boolean z3) {
        String str2;
        int iInit;
        ClassLoader systemClassLoader;
        ServiceC17615 serviceC17615 = this.f24114;
        ClassLoader parent = null;
        serviceC17615.f52644 = null;
        if (serviceC17615.f52641) {
            serviceC17615.f52644 = new IllegalStateException("Decryptor session already loaded");
            return false;
        }
        ServiceC17615.m40133(serviceC17615, true);
        try {
            File canonicalFile = new File(serviceC17615.getCacheDir(), "decrypt").getCanonicalFile();
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile.equals(canonicalFile2)) {
                throw new IllegalArgumentException(C21466.m48631("Unsupported work dir: ", str));
            }
            File file = new File(canonicalFile2, "base.apk");
            if (!file.isFile()) {
                throw new IllegalArgumentException("Missing base.apk");
            }
            File file2 = new File(canonicalFile2, "lib");
            File file3 = new File(canonicalFile2, "opt");
            File file4 = new File(canonicalFile2, AbstractC0213e.f989m);
            File file5 = new File(canonicalFile2, "tmp");
            File file6 = new File(canonicalFile2, "lib_abi");
            try {
                if (file6.isFile()) {
                    Charset charset = StandardCharsets.UTF_8;
                    String strTrim = C17425.m39674(file6).trim();
                    if (!strTrim.isEmpty()) {
                        str2 = strTrim;
                    }
                    C17425.m39677(file2);
                    C17425.m39677(file3);
                    C17425.m39677(file5);
                    C17425.m39677(new File(file4, "files"));
                    C17425.m39677(new File(file4, "cache"));
                    C17425.m39677(new File(file4, "code_cache"));
                    file.setReadOnly();
                    String path = file.getPath();
                    String path2 = file3.getPath();
                    String path3 = file2.getPath();
                    systemClassLoader = ClassLoader.getSystemClassLoader();
                    if (systemClassLoader != null) {
                        parent = systemClassLoader.getParent();
                    }
                    serviceC17615.f52647 = new C13418(path, path2, path3, parent);
                    serviceC17615.f52645 = new C8053(serviceC17615.getApplicationContext(), file, C21370.m48409(file.getPath()), serviceC17615.f52647, file2, file4, str2);
                    if (z2) {
                        C16944.m38528();
                    }
                    C21545 c21545 = ServiceC17615.f52637;
                    String packageName = serviceC17615.f52645.getPackageName();
                    String packageName2 = serviceC17615.getPackageName();
                    String canonicalPath = canonicalFile2.getCanonicalPath();
                    String strM18721 = serviceC17615.f52645.m18721();
                    c21545.getClass();
                    iInit = Features2.init(packageName, packageName2, canonicalPath, strM18721);
                    if (iInit == 0) {
                        throw new IllegalStateException("Native hook init failed: " + iInit);
                    }
                    if (z3) {
                        ServiceC17615.f52635.getClass();
                        ServiceC17615.m40118(serviceC17615, Features2.installSeccomp(15));
                    } else {
                        ServiceC17615.m40138(serviceC17615);
                    }
                    ServiceC17615.m40113(new InterfaceC11582() { // from class: l.ܿܺᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() {
                            ServiceC17615.m40128(this.f56505.f24114, z);
                            return null;
                        }
                    });
                    serviceC17615.f52641 = true;
                    return true;
                }
                systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    parent = systemClassLoader.getParent();
                }
            } catch (Throwable unused) {
            }
            str2 = null;
            C17425.m39677(file2);
            C17425.m39677(file3);
            C17425.m39677(file5);
            C17425.m39677(new File(file4, "files"));
            C17425.m39677(new File(file4, "cache"));
            C17425.m39677(new File(file4, "code_cache"));
            file.setReadOnly();
            String path4 = file.getPath();
            String path5 = file3.getPath();
            String path6 = file2.getPath();
            serviceC17615.f52647 = new C13418(path4, path5, path6, parent);
            serviceC17615.f52645 = new C8053(serviceC17615.getApplicationContext(), file, C21370.m48409(file.getPath()), serviceC17615.f52647, file2, file4, str2);
            if (z2) {
                C16944.m38528();
            }
            C21545 c21546 = ServiceC17615.f52637;
            String packageName3 = serviceC17615.f52645.getPackageName();
            String packageName4 = serviceC17615.getPackageName();
            String canonicalPath2 = canonicalFile2.getCanonicalPath();
            String strM18722 = serviceC17615.f52645.m18721();
            c21546.getClass();
            iInit = Features2.init(packageName3, packageName4, canonicalPath2, strM18722);
            if (iInit == 0) {
                throw new IllegalStateException("Native hook init failed: " + iInit);
            }
            if (z3) {
                ServiceC17615.f52635.getClass();
                ServiceC17615.m40118(serviceC17615, Features2.installSeccomp(15));
            } else {
                ServiceC17615.m40138(serviceC17615);
            }
            ServiceC17615.m40113(new InterfaceC11582() { // from class: l.ܿܺᩳ
                @Override // p067l.InterfaceC11582
                public final Object call() {
                    ServiceC17615.m40128(this.f56505.f24114, z);
                    return null;
                }
            });
            serviceC17615.f52641 = true;
            return true;
        } catch (Exception e) {
            ServiceC17615.m40133(serviceC17615, false);
            serviceC17615.f52644 = e;
            return false;
        }
    }

    @Override // p067l.InterfaceC20299
    public final void exit() {
        this.f24114.stopSelf();
        System.exit(0);
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo10346() {
        ServiceC17615 serviceC17615 = this.f24114;
        if (serviceC17615.f52644 == null) {
            return null;
        }
        String message = serviceC17615.f52644.getMessage();
        if (message == null || message.isEmpty()) {
            message = serviceC17615.f52644.toString();
        }
        String stackTraceString = Log.getStackTraceString(serviceC17615.f52644);
        serviceC17615.f52644 = null;
        return new String[]{message, stackTraceString};
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֨ */
    public final int mo10342() {
        return this.f24114.f52642;
    }

    /* JADX INFO: renamed from: ᩻ */
    private Object m20552(byte[] bArr) {
        ServiceC17615 serviceC17615 = this.f24114;
        serviceC17615.f52644 = null;
        C14677 c14677 = new C14677(bArr);
        final String strM33591 = c14677.m33591();
        final String strM33592 = c14677.m33591();
        int i = c14677.readByte() & 255;
        final Class[] clsArr = new Class[i];
        final Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch (c14677.readByte()) {
                case 0:
                    clsArr[i2] = Byte.TYPE;
                    objArr[i2] = Byte.valueOf(c14677.readByte());
                    break;
                case 1:
                    clsArr[i2] = Short.TYPE;
                    objArr[i2] = Short.valueOf(c14677.readShort());
                    break;
                case 2:
                    clsArr[i2] = Character.TYPE;
                    objArr[i2] = Character.valueOf(c14677.m33594());
                    break;
                case 3:
                    clsArr[i2] = Integer.TYPE;
                    objArr[i2] = Integer.valueOf(c14677.readInt());
                    break;
                case 4:
                    clsArr[i2] = Long.TYPE;
                    objArr[i2] = Long.valueOf(c14677.readLong());
                    break;
                case 5:
                    clsArr[i2] = Float.TYPE;
                    objArr[i2] = Float.valueOf(c14677.m33582());
                    break;
                case 6:
                    clsArr[i2] = Double.TYPE;
                    objArr[i2] = Double.valueOf(Double.longBitsToDouble(c14677.readLong()));
                    break;
                case 7:
                    clsArr[i2] = Boolean.TYPE;
                    objArr[i2] = Boolean.valueOf(c14677.m33585());
                    break;
                case 8:
                    clsArr[i2] = String.class;
                    objArr[i2] = c14677.m33591();
                    break;
                case 9:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c14677.m33591();
                    break;
                case 10:
                    clsArr[i2] = byte[].class;
                    objArr[i2] = c14677.m33583();
                    break;
                case 11:
                    clsArr[i2] = Object.class;
                    objArr[i2] = c14677.m33583();
                    break;
                case 12:
                    clsArr[i2] = short[].class;
                    int i3 = c14677.readInt();
                    short[] sArr = new short[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        sArr[i4] = c14677.readShort();
                    }
                    objArr[i2] = sArr;
                    break;
                case 13:
                    clsArr[i2] = char[].class;
                    objArr[i2] = Character.valueOf(c14677.m33594());
                    break;
                case 14:
                    clsArr[i2] = int[].class;
                    objArr[i2] = c14677.m33578();
                    break;
                default:
                    serviceC17615.f52644 = new Exception("Unsupported parameter type");
                    return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM33591);
        sb.append(':');
        sb.append(strM33592);
        for (int i5 = 0; i5 < i; i5++) {
            Class cls = clsArr[i5];
            sb.append(':');
            sb.append(cls.getSimpleName());
        }
        final String string = sb.toString();
        if (serviceC17615.f52640.contains(string)) {
            serviceC17615.f52644 = new Exception(C21466.m48631("Disabled method: ", string));
            return null;
        }
        try {
            final Method method = (Method) ((ConcurrentMapC12768) serviceC17615.f52643).get(string);
            if (method == null) {
                method = (Method) ServiceC17615.m40113(new InterfaceC11582() { // from class: l.ܽܺᩳ
                    @Override // p067l.InterfaceC11582
                    public final Object call() {
                        final BinderC8899 binderC8899 = this.f54618;
                        ServiceC17615 serviceC17616 = binderC8899.f24114;
                        final String str = string;
                        final String str2 = strM33591;
                        final String str3 = strM33592;
                        final Class[] clsArr2 = clsArr;
                        return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.ۨۡᩳ
                            @Override // p067l.InterfaceC11582
                            public final Object call() {
                                String str4 = str2;
                                String str5 = str3;
                                Class<?>[] clsArr3 = clsArr2;
                                ServiceC17615 serviceC17617 = binderC8899.f24114;
                                ConcurrentMapC12768 concurrentMapC12768 = (ConcurrentMapC12768) serviceC17617.f52643;
                                String str6 = str;
                                Method method2 = (Method) concurrentMapC12768.get(str6);
                                if (method2 != null) {
                                    return method2;
                                }
                                try {
                                    Method declaredMethod = Class.forName(str4, true, serviceC17617.f52647).getDeclaredMethod(str5, clsArr3);
                                    if (!declaredMethod.isAccessible()) {
                                        declaredMethod.setAccessible(true);
                                    }
                                    ((ConcurrentMapC12768) serviceC17617.f52643).put(str6, declaredMethod);
                                    return declaredMethod;
                                } catch (Exception e) {
                                    serviceC17617.f52644 = e;
                                    return null;
                                }
                            }
                        });
                    }
                });
            }
            Future futureSubmit = ServiceC17615.f52636.submit(new Callable() { // from class: l.ᩳܺᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ServiceC17615 serviceC17616 = this.f59680.f24114;
                    final Method method2 = method;
                    final Object[] objArr2 = objArr;
                    return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.ܳܺᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() {
                            return method2.invoke(null, objArr2);
                        }
                    });
                }
            });
            try {
                return futureSubmit.get(2L, TimeUnit.SECONDS);
            } catch (ExecutionException e) {
                serviceC17615.f52644 = e.getCause();
                return null;
            } catch (TimeoutException e2) {
                serviceC17615.f52644 = e2;
                futureSubmit.cancel(true);
                serviceC17615.f52640.add(string);
                return null;
            }
        } catch (Throwable th) {
            serviceC17615.f52644 = th;
            return null;
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ᩳ */
    public final String mo10355(byte[] bArr) {
        Object objM20552 = m20552(bArr);
        if (objM20552 == null) {
            return null;
        }
        return objM20552.toString();
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܳ */
    public final String mo10350(byte[] bArr) {
        Integer num = (Integer) m20552(bArr);
        if (num == null) {
            return null;
        }
        return String.valueOf(num);
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo10348(byte[] bArr) {
        return (byte[]) m20552(bArr);
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܿ */
    public final int[] mo10354(byte[] bArr) {
        short[] sArr = (short[]) m20552(bArr);
        if (sArr == null) {
            return null;
        }
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = sArr[i];
        }
        return iArr;
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܽ */
    public final int[] mo10352(byte[] bArr) {
        char[] cArr = (char[]) m20552(bArr);
        if (cArr == null) {
            return null;
        }
        int[] iArr = new int[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            iArr[i] = cArr[i];
        }
        return iArr;
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo10345(byte[] bArr) {
        return (int[]) m20552(bArr);
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ۧ */
    public final int mo10347(final String str, final String str2) {
        ServiceC17615 serviceC17615 = this.f24114;
        serviceC17615.f52644 = null;
        try {
            return ((Integer) ServiceC17615.m40113(new InterfaceC11582() { // from class: l.۬ۡᩳ
                @Override // p067l.InterfaceC11582
                public final Object call() {
                    final BinderC8899 binderC8899 = this.f42004;
                    ServiceC17615 serviceC17616 = binderC8899.f24114;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.ۤۡᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() throws Exception {
                            C13418 c13418 = binderC8899.f24114.f52647;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c13418).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C21459.m48622("Field ", str5, ".", str6, " not found"));
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
            serviceC17615.f52644 = th;
            return -1;
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܳ */
    public final String mo10349(final String str, final String str2) {
        ServiceC17615 serviceC17615 = this.f24114;
        serviceC17615.f52644 = null;
        try {
            return (String) ServiceC17615.m40113(new InterfaceC11582() { // from class: l.ܰۡᩳ
                @Override // p067l.InterfaceC11582
                public final Object call() {
                    final BinderC8899 binderC8899 = this.f44018;
                    ServiceC17615 serviceC17616 = binderC8899.f24114;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.۫ۡᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() throws Exception {
                            C13418 c13418 = binderC8899.f24114.f52647;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c13418).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C21459.m48622("Field ", str5, ".", str6, " not found"));
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
            serviceC17615.f52644 = th;
            return null;
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo10344(final String str, final String str2) {
        ServiceC17615 serviceC17615 = this.f24114;
        serviceC17615.f52644 = null;
        try {
            return (int[]) ServiceC17615.m40113(new InterfaceC11582() { // from class: l.۟ۡᩳ
                @Override // p067l.InterfaceC11582
                public final Object call() {
                    final BinderC8899 binderC8899 = this.f25553;
                    ServiceC17615 serviceC17616 = binderC8899.f24114;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.ۛۡᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() throws Exception {
                            C13418 c13418 = binderC8899.f24114.f52647;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c13418).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C21459.m48622("Field ", str5, ".", str6, " not found"));
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
            serviceC17615.f52644 = th;
            return null;
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ᩳ */
    public final int[] mo10356(final String str, final String str2) {
        ServiceC17615 serviceC17615 = this.f24114;
        serviceC17615.f52644 = null;
        try {
            return (int[]) ServiceC17615.m40113(new InterfaceC11582() { // from class: l.֫ܺᩳ
                @Override // p067l.InterfaceC11582
                public final Object call() {
                    final BinderC8899 binderC8899 = this.f9250;
                    ServiceC17615 serviceC17616 = binderC8899.f24114;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.᩺ۡᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() throws Exception {
                            C13418 c13418 = binderC8899.f24114.f52647;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c13418).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C21459.m48622("Field ", str5, ".", str6, " not found"));
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
            serviceC17615.f52644 = th;
            return null;
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܽ */
    public final int[] mo10351(final String str, final String str2) {
        ServiceC17615 serviceC17615 = this.f24114;
        serviceC17615.f52644 = null;
        try {
            return (int[]) ServiceC17615.m40113(new InterfaceC11582() { // from class: l.ۧܺᩳ
                @Override // p067l.InterfaceC11582
                public final Object call() {
                    final BinderC8899 binderC8899 = this.f36327;
                    ServiceC17615 serviceC17616 = binderC8899.f24114;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC17615.m40114(serviceC17616, new InterfaceC11582() { // from class: l.᩻ܺᩳ
                        @Override // p067l.InterfaceC11582
                        public final Object call() throws Exception {
                            C13418 c13418 = binderC8899.f24114.f52647;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c13418).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C21459.m48622("Field ", str5, ".", str6, " not found"));
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
            serviceC17615.f52644 = th;
            return null;
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܿ */
    public final void mo10353(String str, String str2) {
        C16944.m38524(str, str2);
    }
}
