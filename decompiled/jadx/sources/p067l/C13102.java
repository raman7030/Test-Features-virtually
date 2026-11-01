package p067l;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import bin.p000mt.plus.Features3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧ᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes4.dex */
public class C13102 extends AbstractC17043 implements InterfaceC23140 {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f36831;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f36832;

    /* JADX INFO: renamed from: ۬ */
    public final File f36833;

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ۧ */
    public boolean mo29973() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۗ֫ */
    public final boolean mo29978() {
        return true;
    }

    /* JADX INFO: renamed from: ۛۧ */
    public C19136 mo29981() {
        return null;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۢ */
    public final C13102 mo29986() {
        return this;
    }

    /* JADX INFO: renamed from: ۬ۧ */
    public void mo29991() {
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo29994() {
        return true;
    }

    /* JADX INFO: renamed from: ᩺ۧ */
    public boolean mo29999() {
        return false;
    }

    public C13102(File file, boolean z) {
        this.f36833 = file;
        this.f36832 = z;
        this.f36831 = z || C21129.m47753(file.getPath()) != null;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺ */
    public AbstractC17043 mo25510() {
        return new C13102(this.f36833.getAbsoluteFile(), this.f36832);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫֫ */
    public String mo25495() {
        return this.f36833.getAbsolutePath();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo25496() {
        if (!mo25094()) {
            if (this.f36832) {
                try {
                    return this.f36833.createNewFile();
                } catch (IOException unused) {
                }
            } else {
                C21089 c21089Mo29998 = null;
                try {
                    try {
                        c21089Mo29998 = mo29998();
                        c21089Mo29998.m47677(this.f36833.getPath(), false).close();
                        try {
                            c21089Mo29998.m47653(this.f36833.getPath(), 420, false, false);
                            c21089Mo29998.m47652(this.f36833.getPath(), 0, 0, false, false);
                        } catch (IOException unused2) {
                        }
                        c21089Mo29998.f66255 = 0L;
                        return true;
                    } catch (Throwable th) {
                        if (c21089Mo29998 != null) {
                            c21089Mo29998.f66255 = 0L;
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                }
            }
        }
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25497() {
        if (this.f36832) {
            if (this.f36833.exists()) {
                return this.f36833.isDirectory();
            }
            if (this.f36833.mkdirs()) {
                return true;
            }
        }
        C21089 c21089Mo29998 = null;
        try {
            c21089Mo29998 = mo29998();
            c21089Mo29998.m47672(this.f36833.getPath(), true);
            c21089Mo29998.f66255 = 0L;
            return true;
        } catch (IOException unused) {
            if (c21089Mo29998 == null) {
                return false;
            }
            c21089Mo29998.f66255 = 0L;
            return false;
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12351 mo25509() {
        return new C19807(this);
    }

    @Override // p067l.AbstractC17043
    public final String getName() {
        return this.f36833.getName();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo25505() {
        return this.f36833.getPath();
    }

    @Override // p067l.AbstractC17043
    public final String getParent() {
        return this.f36833.getParent();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo29996() {
        try {
            C19136 c19136Mo29981 = mo29981();
            if (c19136Mo29981 == null) {
                c19136Mo29981 = mo29988();
            }
            return c19136Mo29981.m43531();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public final void mo29995(String str) throws IOException {
        if (!this.f36832 || !C23770.m52834().mo4998()) {
            super.mo29995(str);
            return;
        }
        try {
            Os.symlink(str, this.f36833.getPath());
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo29980() {
        return !this.f36832 && m38646();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public boolean mo25503() {
        if (C17425.m39675(this.f36833)) {
            return true;
        }
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = mo29998();
                c21089Mo29998.m47665(this.f36833.getPath());
                c21089Mo29998.f66255 = 0L;
                return true;
            } catch (IOException unused) {
                if (m29970(c21089Mo29998)) {
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    return true;
                }
                if (c21089Mo29998 == null) {
                    return false;
                }
                c21089Mo29998.f66255 = 0L;
                return false;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۫ */
    public boolean mo29990() {
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = mo29998();
                c21089Mo29998.m47665(this.f36833.getPath());
                c21089Mo29998.f66255 = 0L;
                return true;
            } catch (IOException unused) {
                if (m29970(c21089Mo29998)) {
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    return true;
                }
                boolean zDelete = this.f36833.delete();
                if (c21089Mo29998 != null) {
                    c21089Mo29998.f66255 = 0L;
                }
                return zDelete;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public boolean mo25502(AbstractC17043 abstractC17043) {
        boolean z;
        String strMo25495 = abstractC17043.mo25495();
        if (this.f36833.renameTo(new File(strMo25495))) {
            return true;
        }
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = mo29998();
                c21089Mo29998.m47680(this.f36833.getPath(), strMo25495);
                c21089Mo29998.f66255 = 0L;
                return true;
            } catch (IOException unused) {
                byte[] bArrM29969 = m29969(c21089Mo29998);
                if (bArrM29969 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(m38669().getBytes());
                        byteArrayOutputStream.write(47);
                        byteArrayOutputStream.write(bArrM29969);
                        c21089Mo29998.m47657(byteArrayOutputStream.toByteArray(), strMo25495.getBytes());
                        z = true;
                    } catch (IOException unused2) {
                        z = false;
                        if (z) {
                            if (c21089Mo29998 != null) {
                                c21089Mo29998.f66255 = 0L;
                            }
                            return true;
                        }
                        if (c21089Mo29998 != null) {
                            c21089Mo29998.f66255 = 0L;
                        }
                        return false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    return true;
                }
                if (c21089Mo29998 != null) {
                    c21089Mo29998.f66255 = 0L;
                }
                return false;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m29970(C21089 c21089) {
        byte[] bArrM29969 = m29969(c21089);
        if (bArrM29969 == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(m38669().getBytes());
            byteArrayOutputStream.write(47);
            byteArrayOutputStream.write(bArrM29969);
            c21089.m47673(byteArrayOutputStream.toByteArray());
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m29969(C21089 c21089) {
        String name = this.f36833.getName();
        if (!C10685.m24622(name)) {
            return null;
        }
        try {
            for (byte[] bArr : c21089.m47674(m38669())) {
                if (name.equals(new String(bArr, StandardCharsets.UTF_8))) {
                    return bArr;
                }
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo25094() {
        if ((this.f36832 && this.f36833.exists()) || mo29999()) {
            return true;
        }
        if (!this.f36832 && this.f36833.exists()) {
            return true;
        }
        if (this.f36832 && m29971()) {
            return false;
        }
        C21089 c21089Mo29998 = null;
        try {
            c21089Mo29998 = mo29998();
            boolean zM47658 = c21089Mo29998.m47658(this.f36833.getPath());
            c21089Mo29998.f66255 = 0L;
            return zM47658;
        } catch (IOException unused) {
            if (c21089Mo29998 == null) {
                return false;
            }
            c21089Mo29998.f66255 = 0L;
            return false;
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo25093() {
        File file = this.f36833;
        boolean z = this.f36832;
        if (z && file.exists()) {
            return file.isFile();
        }
        if (!mo29999() && file.isFile()) {
            return true;
        }
        if (z && m29971()) {
            return false;
        }
        try {
            C19136 c19136Mo29988 = mo29988();
            char cM43534 = c19136Mo29988.m43534();
            if (cM43534 == 'l') {
                cM43534 = c19136Mo29988.m43533();
            }
            return cM43534 == '-';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo25087() {
        File file = this.f36833;
        boolean z = this.f36832;
        if (z && file.exists()) {
            return file.isDirectory();
        }
        if (!mo29999() && file.isDirectory()) {
            return true;
        }
        if (z && m29971()) {
            return false;
        }
        try {
            C19136 c19136Mo29988 = mo29988();
            char cM43534 = c19136Mo29988.m43534();
            if (cM43534 == 'l') {
                cM43534 = c19136Mo29988.m43533();
            }
            return cM43534 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo29972() {
        if (this.f36832 && this.f36833.exists()) {
            return true;
        }
        try {
            C19136 c19136Mo29988 = mo29988();
            char cM43534 = c19136Mo29988.m43534();
            if (cM43534 == 'l') {
                cM43534 = c19136Mo29988.m43533();
            }
            return cM43534 == '-' || cM43534 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺֫ */
    public final long mo25101() {
        boolean z = this.f36832;
        File file = this.f36833;
        if (z && file.exists()) {
            return file.length();
        }
        if (!mo29999()) {
            long length = file.length();
            if (length > 0) {
                return length;
            }
        }
        try {
            return mo29988().m43536();
        } catch (IOException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۗۧ */
    public final long m29979() {
        C21089 c21089Mo29998 = null;
        try {
            c21089Mo29998 = mo29998();
            long jM47668 = c21089Mo29998.m47668(this.f36833.getPath());
            c21089Mo29998.f66255 = 0L;
            return jM47668;
        } catch (IOException unused) {
            if (c21089Mo29998 == null) {
                return -1L;
            }
            c21089Mo29998.f66255 = 0L;
            return -1L;
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۛ֫ */
    public final long mo25091() {
        if (this.f36832 || !mo29999()) {
            try {
                return Features3.m55(this.f36833.getPath());
            } catch (IOException unused) {
            }
        }
        try {
            return mo29988().m43530();
        } catch (IOException unused2) {
            return 0L;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20486(long j) {
        if (j < 0) {
            return false;
        }
        if (this.f36832 && this.f36833.exists()) {
            return this.f36833.setLastModified(j);
        }
        if (this.f36833.setLastModified(j)) {
            return true;
        }
        C21089 c21089Mo29998 = null;
        try {
            c21089Mo29998 = mo29998();
            c21089Mo29998.m47651(j, this.f36833.getPath());
            c21089Mo29998.f66255 = 0L;
            return true;
        } catch (IOException unused) {
            if (c21089Mo29998 == null) {
                return false;
            }
            c21089Mo29998.f66255 = 0L;
            return false;
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo29997() {
        if (this.f36833.canRead()) {
            return true;
        }
        return mo25094() && C23770.m52834().mo4996();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠ */
    public boolean mo29985() {
        AbstractC17043 abstractC17043M38694;
        if (this.f36833.canWrite() || C23770.m52834().mo4997()) {
            return true;
        }
        return C23770.m52834().mo4998() && (abstractC17043M38694 = m38694()) != null && abstractC17043M38694.mo25094();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public AbstractC22410 mo29976(InterfaceC8998 interfaceC8998) {
        return new C4384(this, this, interfaceC8998);
    }

    /* JADX INFO: renamed from: ۤۧ */
    public C19136 mo29988() {
        C19136 c19136Mo29981 = mo29981();
        return c19136Mo29981 != null ? c19136Mo29981 : m29993();
    }

    /* JADX INFO: renamed from: ܳܽ */
    public final C19136 m29993() throws Throwable {
        C21089 c21089Mo29998;
        try {
            c21089Mo29998 = mo29998();
            try {
                C19136 c19136M47663 = c21089Mo29998.m47663(this.f36833.getPath());
                c21089Mo29998.f66255 = 0L;
                return c19136M47663;
            } catch (Throwable th) {
                th = th;
                if (c21089Mo29998 != null) {
                    c21089Mo29998.f66255 = 0L;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c21089Mo29998 = null;
        }
    }

    /* JADX INFO: renamed from: ۨۧ */
    public final C19136 m29989() {
        return mo29988();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final List mo25500(boolean z) {
        if (this.f36832 && m29971()) {
            return new C17182(this.f36833).mo25500(z);
        }
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = mo29998();
                List list = (List) C7480.stream(c21089Mo29998.m47647(this.f36833.getPath(), z)).map(new Function() { // from class: l.۟᩸ܿ
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo56417andThen(Function function) {
                        return C22038.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f26867.mo29975((C19136) obj);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C22038.$default$compose(this, function);
                    }
                }).collect(C24205.toList());
                c21089Mo29998.f66255 = 0L;
                return list;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c21089Mo29998 != null) {
                    c21089Mo29998.f66255 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo29992() {
        if (this.f36832 && m29971()) {
            return new C17182(this.f36833).mo29992();
        }
        C21089 c21089Mo29998 = null;
        try {
            try {
                c21089Mo29998 = mo29998();
                List listM47681 = c21089Mo29998.m47681(this.f36833.getPath());
                c21089Mo29998.f66255 = 0L;
                return listM47681;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c21089Mo29998 != null) {
                    c21089Mo29998.f66255 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c21089Mo29998 != null) {
                c21089Mo29998.f66255 = 0L;
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo29987() throws Throwable {
        C21089 c21089Mo29998;
        try {
            return new C16571(this.f36833.getPath());
        } catch (FileNotFoundException unused) {
            try {
                c21089Mo29998 = mo29998();
                try {
                    InputStream inputStreamM47687 = c21089Mo29998.m47687(this.f36833.getPath());
                    c21089Mo29998.f66255 = 0L;
                    return inputStreamM47687;
                } catch (Throwable th) {
                    th = th;
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c21089Mo29998 = null;
            }
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo25506(boolean z) throws Throwable {
        C21089 c21089Mo29998;
        try {
            return new FileOutputStream(this.f36833, z);
        } catch (FileNotFoundException e) {
            if (this.f36832 && e.getCause() == null) {
                throw e;
            }
            try {
                c21089Mo29998 = mo29998();
                try {
                    OutputStream outputStreamM47677 = c21089Mo29998.m47677(this.f36833.getPath(), z);
                    c21089Mo29998.f66255 = 0L;
                    return outputStreamM47677;
                } catch (Throwable th) {
                    th = th;
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c21089Mo29998 = null;
            }
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo29983() {
        try {
            return C13853.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f36833, "r").getChannel());
        } catch (IOException e) {
            if (this.f36832 && e.getCause() == null) {
                throw e;
            }
            throw new IOException("Unsupported");
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC4502 mo25508(String str) throws Throwable {
        C21089 c21089Mo29998;
        try {
            return C2489.m3600(this.f36833, str);
        } catch (FileNotFoundException e) {
            if (this.f36832 && e.getCause() == null) {
                throw e;
            }
            try {
                c21089Mo29998 = mo29998();
                try {
                    InterfaceC4502 interfaceC4502M47685 = c21089Mo29998.m47685(this.f36833.getPath(), str);
                    c21089Mo29998.f66255 = 0L;
                    return interfaceC4502M47685;
                } catch (Throwable th) {
                    th = th;
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c21089Mo29998 = null;
            }
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo29982(String str) throws Throwable {
        C21089 c21089Mo29998;
        try {
            return ParcelFileDescriptor.open(this.f36833, C16433.m37332(str));
        } catch (FileNotFoundException e) {
            if (this.f36832 && e.getCause() == null) {
                throw e;
            }
            try {
                c21089Mo29998 = mo29998();
                try {
                    String path = this.f36833.getPath();
                    c21089Mo29998.getClass();
                    if (C23770.m52827(str)) {
                        path = C23770.m52831(path);
                    }
                    ParcelFileDescriptor parcelFileDescriptorM47669 = c21089Mo29998.m47669(path, str);
                    c21089Mo29998.f66255 = 0L;
                    return parcelFileDescriptorM47669;
                } catch (Throwable th) {
                    th = th;
                    if (c21089Mo29998 != null) {
                        c21089Mo29998.f66255 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c21089Mo29998 = null;
            }
        }
    }

    @Override // p067l.InterfaceC23140
    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 mo29974() {
        return new C15762(this.f36833, this.f36832, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 mo29975(C19136 c19136) {
        File file = new File(this.f36833.getPath(), c19136.m43532());
        if (this.f36832) {
            return new C15762(file, true, c19136);
        }
        AbstractC17043 abstractC17043M42107 = C18524.m42107(file);
        if (abstractC17043M42107.mo29978()) {
            return new C15762(file, abstractC17043M42107.mo29986().f36832, c19136);
        }
        return abstractC17043M42107 instanceof InterfaceC23140 ? ((InterfaceC23140) abstractC17043M42107).mo29974() : abstractC17043M42107;
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public C21089 mo29998() {
        return C5665.m12615(this.f36831 && C23770.m52834().mo4998());
    }

    /* JADX INFO: renamed from: ᩻ܽ */
    private boolean m29971() {
        if (this.f36831 && C23770.m52834().mo4998()) {
            return C21799.m49167();
        }
        return C5665.m12620();
    }

    /* JADX INFO: renamed from: ֫ܽ */
    public final boolean m29977() {
        return this.f36832;
    }

    /* JADX INFO: renamed from: ۟ۧ */
    public final boolean m29984() {
        return this.f36831;
    }
}
