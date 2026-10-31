package l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes3.dex */
public class C10531 implements Closeable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f31597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1358 f31599;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23411 f31600;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC23230 f31602;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f31596 = new byte[256];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f31593 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f31598 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public HashMap f31592 = new HashMap();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f31594 = 512;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f31595 = ByteBuffer.allocate(512);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f31601 = 10240;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10531 m26448(AbstractC15440 abstractC15440) {
        return new C13352(abstractC15440.m36513("r"), null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    public C10531(C23411 c23411, String str) throws IOException {
        this.f31600 = c23411;
        this.f31602 = AbstractC14057.m33658(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        if (c23411.read(byteBufferAllocate) < 12) {
            c23411.seek(0L);
        } else {
            byteBufferAllocate.flip();
            byte[] bArr = new byte[12];
            byteBufferAllocate.get(bArr);
            if (!"MIUI BACKUP\n".equals(new String(bArr, StandardCharsets.UTF_8))) {
                c23411.seek(0L);
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1);
                int i = 0;
                int i2 = 0;
                while (i < 8 && i2 < 2048) {
                    byteBufferAllocate2.clear();
                    if (c23411.read(byteBufferAllocate2) == -1) {
                        break;
                    }
                    i2++;
                    byteBufferAllocate2.flip();
                    if (byteBufferAllocate2.get() == 10) {
                        i++;
                    }
                }
                if (i != 8) {
                    c23411.seek(0L);
                }
            }
        }
        while (true) {
            C1358 c1358Mo26455 = mo26455();
            if (c1358Mo26455 == null) {
                return;
            }
            String strM4741 = c1358Mo26455.m4741();
            if (c1358Mo26455.m4768() && !strM4741.endsWith("/")) {
                strM4741 = strM4741.concat("/");
            }
            this.f31593.put(strM4741, c1358Mo26455);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m26450(C1358 c1358) throws IOException {
        ArrayList arrayList = new ArrayList();
        List<C4886> listM4764 = c1358.m4764();
        C20409 c20409 = new C20409();
        long jM14237 = 0;
        long j = 0;
        for (C4886 c4886 : listM4764) {
            long jM14238 = c4886.m14237() - jM14237;
            if (jM14238 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM14238 > 0) {
                arrayList.add(new C10906(jM14238, c20409));
                j += jM14238;
            }
            if (c4886.m14236() > 0) {
                long jM14239 = (c4886.m14237() + c1358.m4750()) - j;
                if (c4886.m14236() + jM14239 < jM14239) {
                    throw new IOException("Unreadable TAR archive, sparse block offset or length too big");
                }
                arrayList.add(new C16549(jM14239, c4886.m14236(), this.f31600));
            }
            jM14237 = c4886.m14237() + c4886.m14236();
        }
        long jM4765 = c1358.m4765() - jM14237;
        if (jM4765 < 0) {
            throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
        }
        if (jM4765 > 0) {
            arrayList.add(new C10906(jM4765, c20409));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f31600.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m26454() {
        ArrayList arrayList = new ArrayList(this.f31593.values());
        Collections.sort(arrayList, new C3475());
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m26453(C1358 c1358) throws IOException {
        try {
            return new C12647(this, c1358, this.f31600, c1358.m4753() ? m26450(c1358) : Collections.EMPTY_LIST);
        } catch (RuntimeException e) {
            throw new IOException("Corrupted TAR archive. Can't read entry", e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte[] m26451() throws IOException {
        byte[] bArr = this.f31596;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamM26453 = m26453(this.f31599);
        while (true) {
            try {
                int i = inputStreamM26453.read(bArr);
                if (i < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    inputStreamM26453.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        inputStreamM26453.close();
        mo26455();
        if (this.f31599 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:69:0x0144, B:71:0x014c, B:72:0x0150, B:74:0x0158), top: B:96:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:69:0x0144, B:71:0x014c, B:72:0x0150, B:74:0x0158), top: B:96:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0158 A[Catch: NumberFormatException -> 0x01ad, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:69:0x0144, B:71:0x014c, B:72:0x0150, B:74:0x0158), top: B:96:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1358 mo26455() throws IOException {
        boolean zM4755;
        ArrayList arrayList;
        ByteBuffer byteBufferM26452;
        C22525 c22525;
        InputStream inputStreamM26453;
        byte[] bArrM26451;
        String strMo29129;
        InterfaceC23230 interfaceC23230 = this.f31602;
        if (!this.f31597) {
            C1358 c1358 = this.f31599;
            C23411 c23411 = this.f31600;
            int i = this.f31594;
            if (c1358 != null) {
                long jM4729 = this.f31599.m4729() + c1358.m4750();
                if (jM4729 < c23411.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c23411.seek(jM4729);
                if (c23411.length() < c23411.getFilePointer()) {
                    throw new IOException("Truncated TAR archive");
                }
                C1358 c1359 = this.f31599;
                if ((c1359 == null || !c1359.m4768()) && this.f31599.m4729() > 0) {
                    long j = i;
                    if (this.f31599.m4729() % j != 0) {
                        long filePointer = c23411.getFilePointer() + ((((this.f31599.m4729() / j) + 1) * j) - this.f31599.m4729());
                        if (filePointer < c23411.getFilePointer()) {
                            throw new IOException("trying to move backwards inside of the archive");
                        }
                        c23411.seek(filePointer);
                        if (c23411.length() < c23411.getFilePointer()) {
                            throw new IOException("Truncated TAR archive");
                        }
                    }
                }
            }
            ByteBuffer byteBufferM26453 = m26452();
            if (byteBufferM26453 == null) {
                this.f31599 = null;
                return null;
            }
            try {
                long filePointer2 = c23411.getFilePointer();
                C1358 c13510 = new C1358(this.f31592, byteBufferM26453.array(), interfaceC23230);
                c13510.m4733(filePointer2);
                this.f31599 = c13510;
                if (!c13510.m4742()) {
                    if (this.f31599.m4740()) {
                        bArrM26451 = m26451();
                        if (bArrM26451 != null) {
                            strMo29129 = interfaceC23230.mo29129(0, bArrM26451.length, bArrM26451);
                            this.f31599.m4760(strMo29129);
                            if (this.f31599.m4768() && !strMo29129.endsWith("/")) {
                                this.f31599.m4760(strMo29129.concat("/"));
                            }
                        }
                    }
                    zM4755 = this.f31599.m4755();
                    arrayList = this.f31598;
                    if (zM4755) {
                        inputStreamM26453 = m26453(this.f31599);
                        try {
                            this.f31592 = C6297.m17334(inputStreamM26453, arrayList, this.f31592, this.f31599.m4729());
                            inputStreamM26453.close();
                            mo26455();
                            if (this.f31599 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamM26453.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    try {
                        if (this.f31599.m4744()) {
                            m26449();
                        } else if (!this.f31592.isEmpty()) {
                            this.f31599.m4736(this.f31592);
                            this.f31599.m4735(arrayList);
                        }
                        if (this.f31599.m4754() && this.f31599.m4769()) {
                            do {
                                byteBufferM26452 = m26452();
                                if (byteBufferM26452 != null) {
                                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                }
                                c22525 = new C22525(byteBufferM26452.array());
                                this.f31599.m4743().addAll(c22525.m50520());
                                C1358 c13511 = this.f31599;
                                c13511.m4733(c13511.m4750() + ((long) i));
                            } while (c22525.m50521());
                        }
                        return this.f31599;
                    } catch (NumberFormatException e) {
                        throw new IOException("Error detected parsing the pax header", e);
                    }
                }
                byte[] bArrM26452 = m26451();
                if (bArrM26452 != null) {
                    this.f31599.m4752(interfaceC23230.mo29129(0, bArrM26452.length, bArrM26452));
                    if (this.f31599.m4740()) {
                        bArrM26451 = m26451();
                        if (bArrM26451 != null) {
                            strMo29129 = interfaceC23230.mo29129(0, bArrM26451.length, bArrM26451);
                            this.f31599.m4760(strMo29129);
                            if (this.f31599.m4768()) {
                                this.f31599.m4760(strMo29129.concat("/"));
                            }
                        }
                    }
                    zM4755 = this.f31599.m4755();
                    arrayList = this.f31598;
                    if (zM4755) {
                        inputStreamM26453 = m26453(this.f31599);
                        this.f31592 = C6297.m17334(inputStreamM26453, arrayList, this.f31592, this.f31599.m4729());
                        inputStreamM26453.close();
                        mo26455();
                        if (this.f31599 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    if (this.f31599.m4744()) {
                        m26449();
                    } else if (!this.f31592.isEmpty()) {
                        this.f31599.m4736(this.f31592);
                        this.f31599.m4735(arrayList);
                    }
                    if (this.f31599.m4754()) {
                        do {
                            byteBufferM26452 = m26452();
                            if (byteBufferM26452 != null) {
                                throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                            }
                            c22525 = new C22525(byteBufferM26452.array());
                            this.f31599.m4743().addAll(c22525.m50520());
                            C1358 c13512 = this.f31599;
                            c13512.m4733(c13512.m4750() + ((long) i));
                        } while (c22525.m50521());
                    }
                    return this.f31599;
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m26449() throws IOException {
        int i = this.f31594;
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamM26453 = m26453(this.f31599);
        try {
            HashMap mapM17334 = C6297.m17334(inputStreamM26453, arrayList, this.f31592, this.f31599.m4729());
            inputStreamM26453.close();
            if (mapM17334.containsKey("GNU.sparse.map")) {
                arrayList = new ArrayList(C6297.m17335((String) mapM17334.get("GNU.sparse.map")));
            }
            mo26455();
            C1358 c1358 = this.f31599;
            if (c1358 != null) {
                c1358.m4736(mapM17334);
                this.f31599.m4735(arrayList);
                if (this.f31599.m4749()) {
                    C23411 c23411 = this.f31600;
                    long filePointer = c23411.getFilePointer();
                    C16549 c16549 = new C16549(this.f31599.m4750(), this.f31599.m4729(), this.f31600);
                    try {
                        ArrayList arrayListM17333 = C6297.m17333(c16549, i);
                        c16549.close();
                        this.f31599.m4735(arrayListM17333);
                        long filePointer2 = c23411.getFilePointer() - filePointer;
                        if (filePointer2 < 0 || filePointer2 > this.f31599.m4729() || filePointer2 % ((long) i) != 0) {
                            throw new IOException("Corrupted TAR archive. Invalid sparse headers size");
                        }
                        C1358 c1359 = this.f31599;
                        c1359.m4751(c1359.m4729() - filePointer2);
                        C1358 c13510 = this.f31599;
                        c13510.m4733(c13510.m4750() + filePointer2);
                        return;
                    } catch (Throwable th) {
                        try {
                            c16549.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return;
            }
            throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
        } catch (Throwable th3) {
            try {
                inputStreamM26453.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private ByteBuffer m26452() throws IOException {
        boolean z;
        ByteBuffer byteBuffer = this.f31595;
        byteBuffer.rewind();
        C23411 c23411 = this.f31600;
        int i = c23411.read(byteBuffer);
        int i2 = this.f31594;
        ByteBuffer byteBuffer2 = i != i2 ? null : byteBuffer;
        boolean z2 = true;
        if (byteBuffer2 == null) {
            z = true;
            break;
        }
        byte[] bArrArray = byteBuffer2.array();
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                z = true;
                break;
            }
            if (bArrArray[i3] != 0) {
                z = false;
                break;
            }
            i3++;
        }
        this.f31597 = z;
        if (!z || byteBuffer2 == null) {
            return byteBuffer2;
        }
        try {
            byteBuffer.rewind();
            if (c23411.read(byteBuffer) != i2) {
                byteBuffer = null;
            }
            if (byteBuffer != null) {
                byte[] bArrArray2 = byteBuffer.array();
                for (int i4 = 0; i4 < i2; i4++) {
                    if (bArrArray2[i4] != 0) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (!z2) {
                c23411.seek(c23411.getFilePointer() - ((long) i2));
            }
            long filePointer = c23411.getFilePointer();
            long j = this.f31601;
            long j2 = filePointer % j;
            if (j2 > 0) {
                long filePointer2 = c23411.getFilePointer() + (j - j2);
                if (filePointer2 < c23411.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c23411.seek(filePointer2);
            }
            return null;
        } catch (Throwable th) {
            c23411.seek(c23411.getFilePointer() - ((long) i2));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26456() {
        this.f31597 = true;
    }
}
