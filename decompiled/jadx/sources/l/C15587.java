package l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import bin.mt.plus.Features3;
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
public class C15587 extends AbstractC15440 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final boolean f48019 = Build.MANUFACTURER.toLowerCase().contains("huawei");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final File f48020;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f48021;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f48022;

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo27912() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo27933() {
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩶֫ */
    public final boolean mo36530() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩷ */
    public final C15587 mo36531() {
        return this;
    }

    public C15587(File file) {
        this(file, false);
    }

    public C15587(File file, boolean z) {
        this.f48020 = file;
        this.f48022 = z;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC15440 mo23559() {
        return new C15587(this.f48020.getAbsoluteFile(), this.f48022);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo23544() {
        return this.f48020.getAbsolutePath();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo23545() {
        try {
            return this.f48020.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23546() {
        return this.f48020.mkdirs();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC10503 mo23558() {
        return new C3594(this);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo27919() {
        return !this.f48022 && m36488();
    }

    @Override // l.AbstractC15440
    public String getName() {
        return this.f48020.getName();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܺ֫ */
    public String mo23554() {
        return this.f48020.getPath();
    }

    @Override // l.AbstractC15440
    public String getParent() {
        return this.f48020.getParent();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo23552() {
        boolean zM37503;
        String strM39859;
        boolean z = f48019;
        File file = this.f48020;
        if (z) {
            zM37503 = C9798.m24829(file);
        } else {
            zM37503 = C15843.m37503(file);
        }
        if (!zM37503 && m36752()) {
            zM37503 = true;
        }
        if (!zM37503 && C22518.m50492().mo2657() && file.exists() && (strM39859 = C16999.m39859(file.getPath())) != null) {
            try {
                C20402.m46729("/data/media/" + C16293.f50120.getName() + "/" + strM39859);
                return true;
            } catch (IOException unused) {
            }
        }
        return zM37503;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo27929() {
        boolean zDelete;
        String strM39859;
        File file = this.f48020;
        try {
            if (f48019) {
                zDelete = C9798.m24830(file);
            } else {
                zDelete = file.delete();
            }
            if (!zDelete && m36752()) {
                zDelete = true;
            }
        } catch (Exception unused) {
            zDelete = false;
        }
        if (!zDelete && C22518.m50492().mo2657() && file.exists() && (strM39859 = C16999.m39859(file.getPath())) != null) {
            try {
                C20402.m46729("/data/media/" + C16293.f50120.getName() + "/" + strM39859);
                return true;
            } catch (IOException unused2) {
            }
        }
        return zDelete;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23551(AbstractC15440 abstractC15440) {
        String strMo23544 = abstractC15440.mo23544();
        File file = abstractC15440.mo36530() ? abstractC15440.mo36531().f48020 : new File(strMo23544);
        long jM36754 = m36754(abstractC15440);
        if (!this.f48020.renameTo(file)) {
            byte[] bArrM36753 = m36753();
            if (bArrM36753 != null) {
                if (!Features3.rename(m36511(), bArrM36753, strMo23544)) {
                    if (C22518.m50492().mo2657()) {
                        C19697 c19697M10607 = null;
                        try {
                            c19697M10607 = C3468.m10607(false);
                            if (!c19697M10607.m45367()) {
                                c19697M10607.m45389();
                                return false;
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(m36511().getBytes());
                            byteArrayOutputStream.write(47);
                            byteArrayOutputStream.write(bArrM36753);
                            c19697M10607.m45360(byteArrayOutputStream.toByteArray(), strMo23544.getBytes());
                            c19697M10607.m45389();
                        } catch (IOException unused) {
                            if (c19697M10607 != null) {
                                c19697M10607.m45389();
                            }
                        } catch (Throwable th) {
                            if (c19697M10607 != null) {
                                c19697M10607.m45389();
                            }
                            throw th;
                        }
                    }
                }
            }
            return false;
        }
        if (jM36754 < 0) {
            return true;
        }
        try {
            if (file.setLastModified(jM36754)) {
                return true;
            }
            file.toString();
            return true;
        } catch (RuntimeException unused2) {
            C11003.toString(file);
            return true;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m36754(AbstractC15440 abstractC15440) {
        if (!this.f48022 && abstractC15440.mo36530() && !abstractC15440.mo36531().f48022) {
            File file = this.f48020;
            try {
                return Features3.m57(file.getPath());
            } catch (IOException | RuntimeException unused) {
                C11003.toString(file);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    private boolean m36752() {
        byte[] bArrM36753 = m36753();
        if (bArrM36753 != null) {
            if (Features3.delete(m36511(), bArrM36753)) {
                return true;
            }
            if (C22518.m50492().mo2657()) {
                C19697 c19697M10607 = null;
                try {
                    c19697M10607 = C3468.m10607(false);
                    if (c19697M10607.m45367()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m36511().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM36753);
                        c19697M10607.m45376(byteArrayOutputStream.toByteArray());
                        c19697M10607.m45389();
                        return true;
                    }
                } catch (IOException unused) {
                    if (c19697M10607 != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    if (c19697M10607 != null) {
                        c19697M10607.m45389();
                    }
                    throw th;
                }
                c19697M10607.m45389();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    private byte[] m36753() {
        String name = this.f48020.getName();
        if (!C8751.m22652(name)) {
            return null;
        }
        for (byte[] bArr : Features3.listGarbledFileNames(m36511())) {
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

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo23120() {
        return this.f48020.exists();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo23119() {
        return this.f48020.isFile();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo23113() {
        return this.f48020.isDirectory();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo27911() {
        File file = this.f48020;
        return file.isFile() || file.isDirectory();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩺֫ */
    public final long mo23127() {
        return this.f48020.length();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۛ֫ */
    public final long mo23117() {
        return this.f48020.lastModified();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18537(long j) {
        if (j < 0) {
            return false;
        }
        return this.f48020.setLastModified(j);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo27935() {
        String strM58 = this.f48021;
        if (strM58 == null) {
            strM58 = Features3.m58(this.f48020.getAbsolutePath());
            if (strM58 == null) {
                strM58 = "";
            }
            this.f48021 = strM58;
        }
        if (strM58.isEmpty()) {
            return null;
        }
        return strM58;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo27936() {
        return this.f48020.canRead();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo18540() {
        return !this.f48022;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo27924() {
        return this.f48020.canWrite();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        return new C8533(this, interfaceC6975);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public List mo23549(final boolean z) {
        File[] fileArrListFiles = this.f48020.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        int i = 0;
        return (List) C22311.stream(fileArrListFiles).filter(new Predicate() { // from class: l.᩻֡ܿ
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
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C6416(i)).map(new C20528(i)).collect(C22976.toList());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo27931() {
        String[] list = this.f48020.list();
        if (list == null) {
            return new ArrayList();
        }
        return (List) C22311.stream(list).filter(new C9239(0)).collect(C22976.toList());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo27926() {
        return new C14944(this.f48020);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo23555(boolean z) {
        return new FileOutputStream(this.f48020, z);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo27922() {
        return C12084.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f48020, "r").getChannel());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC2245 mo23557(String str) {
        return C0127.m1199(this.f48020, str);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo27921(String str) {
        return ParcelFileDescriptor.open(this.f48020, C14798.m35185(str));
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۚۧ */
    public boolean mo29016() {
        return !this.f48022;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public boolean mo29017(InterfaceC17066 interfaceC17066) {
        C21234 c21234M48192;
        if (mo29016() && (c21234M48192 = C21234.m48192(this, interfaceC17066)) != null) {
            AbstractC15440 abstractC15440M48201 = c21234M48192.m48201();
            AbstractC15440 abstractC15440M36514 = abstractC15440M48201.m36514();
            if (abstractC15440M36514.mo23546()) {
                if (!mo23551(abstractC15440M48201)) {
                    abstractC15440M36514.mo23552();
                    return false;
                }
                if (c21234M48192.m48196()) {
                    return true;
                }
                abstractC15440M48201.mo23551(this);
                abstractC15440M36514.mo23552();
                return false;
            }
        }
        return false;
    }
}
