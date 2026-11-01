package p067l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import bin.p000mt.plus.Features3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes4.dex */
public class C17182 extends AbstractC17043 {

    /* JADX INFO: renamed from: ۤ */
    public static final boolean f51151 = Build.MANUFACTURER.toLowerCase().contains("huawei");

    /* JADX INFO: renamed from: ۗ */
    public final File f51152;

    /* JADX INFO: renamed from: ۫ */
    public String f51153;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f51154;

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo29973() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo29994() {
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩶֫ */
    public final boolean mo38688() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩷ */
    public final C17182 mo38689() {
        return this;
    }

    public C17182(File file) {
        this(file, false);
    }

    public C17182(File file, boolean z) {
        this.f51152 = file;
        this.f51154 = z;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC17043 mo25510() {
        return new C17182(this.f51152.getAbsoluteFile(), this.f51154);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo25495() {
        return this.f51152.getAbsolutePath();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo25496() {
        try {
            return this.f51152.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25497() {
        return this.f51152.mkdirs();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12351 mo25509() {
        return new C5784(this);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo29980() {
        return !this.f51154 && m38646();
    }

    @Override // p067l.AbstractC17043
    public String getName() {
        return this.f51152.getName();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ֫ */
    public String mo25505() {
        return this.f51152.getPath();
    }

    @Override // p067l.AbstractC17043
    public String getParent() {
        return this.f51152.getParent();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo25503() {
        boolean zM39675;
        String strM42102;
        boolean z = f51151;
        File file = this.f51152;
        if (z) {
            zM39675 = C11681.m26844(file);
        } else {
            zM39675 = C17425.m39675(file);
        }
        if (!zM39675 && m38912()) {
            zM39675 = true;
        }
        if (!zM39675 && C23770.m52834().mo4997() && file.exists() && (strM42102 = C18524.m42102(file.getPath())) != null) {
            try {
                C21759.m49052("/data/media/" + C17853.f53287.getName() + "/" + strM42102);
                return true;
            } catch (IOException unused) {
            }
        }
        return zM39675;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo29990() {
        boolean zDelete;
        String strM42102;
        File file = this.f51152;
        try {
            if (f51151) {
                zDelete = C11681.m26845(file);
            } else {
                zDelete = file.delete();
            }
            if (!zDelete && m38912()) {
                zDelete = true;
            }
        } catch (Exception unused) {
            zDelete = false;
        }
        if (!zDelete && C23770.m52834().mo4997() && file.exists() && (strM42102 = C18524.m42102(file.getPath())) != null) {
            try {
                C21759.m49052("/data/media/" + C17853.f53287.getName() + "/" + strM42102);
                return true;
            } catch (IOException unused2) {
            }
        }
        return zDelete;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25502(AbstractC17043 abstractC17043) {
        String strMo25495 = abstractC17043.mo25495();
        File file = abstractC17043.mo38688() ? abstractC17043.mo38689().f51152 : new File(strMo25495);
        long jM38914 = m38914(abstractC17043);
        if (!this.f51152.renameTo(file)) {
            byte[] bArrM38913 = m38913();
            if (bArrM38913 != null) {
                if (!Features3.rename(m38669(), bArrM38913, strMo25495)) {
                    if (C23770.m52834().mo4997()) {
                        C21089 c21089M12615 = null;
                        try {
                            c21089M12615 = C5665.m12615(false);
                            if (!c21089M12615.m47664()) {
                                c21089M12615.m47686();
                                return false;
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(m38669().getBytes());
                            byteArrayOutputStream.write(47);
                            byteArrayOutputStream.write(bArrM38913);
                            c21089M12615.m47657(byteArrayOutputStream.toByteArray(), strMo25495.getBytes());
                            c21089M12615.m47686();
                        } catch (IOException unused) {
                            if (c21089M12615 != null) {
                                c21089M12615.m47686();
                            }
                        } catch (Throwable th) {
                            if (c21089M12615 != null) {
                                c21089M12615.m47686();
                            }
                            throw th;
                        }
                    }
                }
            }
            return false;
        }
        if (jM38914 < 0) {
            return true;
        }
        try {
            if (file.setLastModified(jM38914)) {
                return true;
            }
            file.toString();
            return true;
        } catch (RuntimeException unused2) {
            C12826.toString(file);
            return true;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m38914(AbstractC17043 abstractC17043) {
        if (!this.f51154 && abstractC17043.mo38688() && !abstractC17043.mo38689().f51154) {
            File file = this.f51152;
            try {
                return Features3.m55(file.getPath());
            } catch (IOException | RuntimeException unused) {
                C12826.toString(file);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۗۧ */
    private boolean m38912() {
        byte[] bArrM38913 = m38913();
        if (bArrM38913 != null) {
            if (Features3.delete(m38669(), bArrM38913)) {
                return true;
            }
            if (C23770.m52834().mo4997()) {
                C21089 c21089M12615 = null;
                try {
                    c21089M12615 = C5665.m12615(false);
                    if (c21089M12615.m47664()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m38669().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM38913);
                        c21089M12615.m47673(byteArrayOutputStream.toByteArray());
                        c21089M12615.m47686();
                        return true;
                    }
                } catch (IOException unused) {
                    if (c21089M12615 != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    if (c21089M12615 != null) {
                        c21089M12615.m47686();
                    }
                    throw th;
                }
                c21089M12615.m47686();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    private byte[] m38913() {
        String name = this.f51152.getName();
        if (!C10685.m24622(name)) {
            return null;
        }
        for (byte[] bArr : Features3.listGarbledFileNames(m38669())) {
            String strNewStringUTF = Features3.newStringUTF(bArr);
            if (!name.equals(strNewStringUTF)) {
                if (strNewStringUTF.length() == name.length()) {
                    String str = new String(strNewStringUTF.getBytes());
                    String str2 = new String(name.getBytes());
                    if (!str2.equals(str)) {
                        name = str2;
                    }
                }
            }
            return bArr;
        }
        return null;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo25094() {
        return this.f51152.exists();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo25093() {
        return this.f51152.isFile();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo25087() {
        return this.f51152.isDirectory();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo29972() {
        File file = this.f51152;
        return file.isFile() || file.isDirectory();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺֫ */
    public final long mo25101() {
        return this.f51152.length();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۛ֫ */
    public final long mo25091() {
        return this.f51152.lastModified();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20486(long j) {
        if (j < 0) {
            return false;
        }
        return this.f51152.setLastModified(j);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo29996() {
        String strM56 = this.f51153;
        if (strM56 == null) {
            strM56 = Features3.m56(this.f51152.getAbsolutePath());
            if (strM56 == null) {
                strM56 = "";
            }
            this.f51153 = strM56;
        }
        if (strM56.isEmpty()) {
            return null;
        }
        return strM56;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo29997() {
        return this.f51152.canRead();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo20489() {
        return !this.f51154;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo29985() {
        return this.f51152.canWrite();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22410 mo29976(InterfaceC8998 interfaceC8998) {
        return new C10478(this, interfaceC8998);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public List mo25500(final boolean z) {
        File[] fileArrListFiles = this.f51152.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        int i = 0;
        return (List) C23573.stream(fileArrListFiles).filter(new Predicate() { // from class: l.᩻֡ܿ
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
            public /* synthetic */ Predicate m54159or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C8466(i)).map(new C21878(i)).collect(C24205.toList());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo29992() {
        String[] list = this.f51152.list();
        if (list == null) {
            return new ArrayList();
        }
        return (List) C23573.stream(list).filter(new C11149(0)).collect(C24205.toList());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo29987() {
        return new C16571(this.f51152);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo25506(boolean z) {
        return new FileOutputStream(this.f51152, z);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo29983() {
        return C13853.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f51152, "r").getChannel());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC4502 mo25508(String str) {
        return C2489.m3600(this.f51152, str);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo29982(String str) {
        return ParcelFileDescriptor.open(this.f51152, C16433.m37332(str));
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۚۧ */
    public boolean mo31068() {
        return !this.f51154;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public boolean mo31069(InterfaceC18588 interfaceC18588) {
        C22549 c22549M50523;
        if (mo31068() && (c22549M50523 = C22549.m50523(this, interfaceC18588)) != null) {
            AbstractC17043 abstractC17043M50532 = c22549M50523.m50532();
            AbstractC17043 abstractC17043M38672 = abstractC17043M50532.m38672();
            if (abstractC17043M38672.mo25497()) {
                if (!mo25502(abstractC17043M50532)) {
                    abstractC17043M38672.mo25503();
                    return false;
                }
                if (c22549M50523.m50527()) {
                    return true;
                }
                abstractC17043M50532.mo25502(this);
                abstractC17043M38672.mo25503();
                return false;
            }
        }
        return false;
    }
}
