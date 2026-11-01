package p067l;

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
public class C12377 implements Closeable {

    /* JADX INFO: renamed from: ۫ */
    public boolean f34561;

    /* JADX INFO: renamed from: ᩶ */
    public C3659 f34563;

    /* JADX INFO: renamed from: ᩸ */
    public final C24618 f34564;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC24446 f34566;

    /* JADX INFO: renamed from: ۨ */
    public final byte[] f34560 = new byte[256];

    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashMap f34557 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f34562 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public HashMap f34556 = new HashMap();

    /* JADX INFO: renamed from: ۛ */
    public final int f34558 = 512;

    /* JADX INFO: renamed from: ۤ */
    public final ByteBuffer f34559 = ByteBuffer.allocate(512);

    /* JADX INFO: renamed from: ᩹ */
    public final int f34565 = 10240;

    /* JADX INFO: renamed from: ֫ */
    public static C12377 m28481(AbstractC17043 abstractC17043) {
        return new C15058(abstractC17043.m38671("r"), null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    public C12377(C24618 c24618, String str) throws IOException {
        this.f34564 = c24618;
        this.f34566 = AbstractC15728.m35783(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        if (c24618.read(byteBufferAllocate) < 12) {
            c24618.seek(0L);
        } else {
            byteBufferAllocate.flip();
            byte[] bArr = new byte[12];
            byteBufferAllocate.get(bArr);
            if (!"MIUI BACKUP\n".equals(new String(bArr, StandardCharsets.UTF_8))) {
                c24618.seek(0L);
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1);
                int i = 0;
                int i2 = 0;
                while (i < 8 && i2 < 2048) {
                    byteBufferAllocate2.clear();
                    if (c24618.read(byteBufferAllocate2) == -1) {
                        break;
                    }
                    i2++;
                    byteBufferAllocate2.flip();
                    if (byteBufferAllocate2.get() == 10) {
                        i++;
                    }
                }
                if (i != 8) {
                    c24618.seek(0L);
                }
            }
        }
        while (true) {
            C3659 c3659Mo28488 = mo28488();
            if (c3659Mo28488 == null) {
                return;
            }
            String strM6979 = c3659Mo28488.m6979();
            if (c3659Mo28488.m7006() && !strM6979.endsWith("/")) {
                strM6979 = strM6979.concat("/");
            }
            this.f34557.put(strM6979, c3659Mo28488);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private ArrayList m28483(C3659 c3659) throws IOException {
        ArrayList arrayList = new ArrayList();
        List<C7012> listM7002 = c3659.m7002();
        C21765 c21765 = new C21765();
        long jM16134 = 0;
        long j = 0;
        for (C7012 c7012 : listM7002) {
            long jM16135 = c7012.m16134() - jM16134;
            if (jM16135 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM16135 > 0) {
                arrayList.add(new C12733(jM16135, c21765));
                j += jM16135;
            }
            if (c7012.m16133() > 0) {
                long jM16136 = (c7012.m16134() + c3659.m6988()) - j;
                if (c7012.m16133() + jM16136 < jM16136) {
                    throw new IOException("Unreadable TAR archive, sparse block offset or length too big");
                }
                arrayList.add(new C18096(jM16136, c7012.m16133(), this.f34564));
            }
            jM16134 = c7012.m16134() + c7012.m16133();
        }
        long jM7003 = c3659.m7003() - jM16134;
        if (jM7003 < 0) {
            throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
        }
        if (jM7003 > 0) {
            arrayList.add(new C12733(jM7003, c21765));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34564.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m28487() {
        ArrayList arrayList = new ArrayList(this.f34557.values());
        Collections.sort(arrayList, new C5671());
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m28486(C3659 c3659) throws IOException {
        try {
            return new C14388(this, c3659, this.f34564, c3659.m6991() ? m28483(c3659) : Collections.EMPTY_LIST);
        } catch (RuntimeException e) {
            throw new IOException("Corrupted TAR archive. Can't read entry", e);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private byte[] m28484() throws IOException {
        byte[] bArr = this.f34560;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamM28486 = m28486(this.f34563);
        while (true) {
            try {
                int i = inputStreamM28486.read(bArr);
                if (i < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    inputStreamM28486.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        inputStreamM28486.close();
        mo28488();
        if (this.f34563 == null) {
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
    /* JADX INFO: renamed from: ܽ */
    public C3659 mo28488() throws IOException {
        boolean zM6993;
        ArrayList arrayList;
        ByteBuffer byteBufferM28485;
        C23776 c23776;
        InputStream inputStreamM28486;
        byte[] bArrM28484;
        String strMo31183;
        InterfaceC24446 interfaceC24446 = this.f34566;
        if (!this.f34561) {
            C3659 c3659 = this.f34563;
            C24618 c24618 = this.f34564;
            int i = this.f34558;
            if (c3659 != null) {
                long jM6967 = this.f34563.m6967() + c3659.m6988();
                if (jM6967 < c24618.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c24618.seek(jM6967);
                if (c24618.length() < c24618.getFilePointer()) {
                    throw new IOException("Truncated TAR archive");
                }
                C3659 c36510 = this.f34563;
                if ((c36510 == null || !c36510.m7006()) && this.f34563.m6967() > 0) {
                    long j = i;
                    if (this.f34563.m6967() % j != 0) {
                        long filePointer = c24618.getFilePointer() + ((((this.f34563.m6967() / j) + 1) * j) - this.f34563.m6967());
                        if (filePointer < c24618.getFilePointer()) {
                            throw new IOException("trying to move backwards inside of the archive");
                        }
                        c24618.seek(filePointer);
                        if (c24618.length() < c24618.getFilePointer()) {
                            throw new IOException("Truncated TAR archive");
                        }
                    }
                }
            }
            ByteBuffer byteBufferM28486 = m28485();
            if (byteBufferM28486 == null) {
                this.f34563 = null;
                return null;
            }
            try {
                long filePointer2 = c24618.getFilePointer();
                C3659 c36511 = new C3659(this.f34556, byteBufferM28486.array(), interfaceC24446);
                c36511.m6971(filePointer2);
                this.f34563 = c36511;
                if (!c36511.m6980()) {
                    if (this.f34563.m6978()) {
                        bArrM28484 = m28484();
                        if (bArrM28484 != null) {
                            strMo31183 = interfaceC24446.mo31183(0, bArrM28484.length, bArrM28484);
                            this.f34563.m6998(strMo31183);
                            if (this.f34563.m7006() && !strMo31183.endsWith("/")) {
                                this.f34563.m6998(strMo31183.concat("/"));
                            }
                        }
                    }
                    zM6993 = this.f34563.m6993();
                    arrayList = this.f34562;
                    if (zM6993) {
                        inputStreamM28486 = m28486(this.f34563);
                        try {
                            this.f34556 = C8353.m19274(inputStreamM28486, arrayList, this.f34556, this.f34563.m6967());
                            inputStreamM28486.close();
                            mo28488();
                            if (this.f34563 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamM28486.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    try {
                        if (this.f34563.m6982()) {
                            m28482();
                        } else if (!this.f34556.isEmpty()) {
                            this.f34563.m6974(this.f34556);
                            this.f34563.m6973(arrayList);
                        }
                        if (this.f34563.m6992() && this.f34563.m7007()) {
                            do {
                                byteBufferM28485 = m28485();
                                if (byteBufferM28485 != null) {
                                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                }
                                c23776 = new C23776(byteBufferM28485.array());
                                this.f34563.m6981().addAll(c23776.m52862());
                                C3659 c36512 = this.f34563;
                                c36512.m6971(c36512.m6988() + ((long) i));
                            } while (c23776.m52863());
                        }
                        return this.f34563;
                    } catch (NumberFormatException e) {
                        throw new IOException("Error detected parsing the pax header", e);
                    }
                }
                byte[] bArrM28485 = m28484();
                if (bArrM28485 != null) {
                    this.f34563.m6990(interfaceC24446.mo31183(0, bArrM28485.length, bArrM28485));
                    if (this.f34563.m6978()) {
                        bArrM28484 = m28484();
                        if (bArrM28484 != null) {
                            strMo31183 = interfaceC24446.mo31183(0, bArrM28484.length, bArrM28484);
                            this.f34563.m6998(strMo31183);
                            if (this.f34563.m7006()) {
                                this.f34563.m6998(strMo31183.concat("/"));
                            }
                        }
                    }
                    zM6993 = this.f34563.m6993();
                    arrayList = this.f34562;
                    if (zM6993) {
                        inputStreamM28486 = m28486(this.f34563);
                        this.f34556 = C8353.m19274(inputStreamM28486, arrayList, this.f34556, this.f34563.m6967());
                        inputStreamM28486.close();
                        mo28488();
                        if (this.f34563 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    if (this.f34563.m6982()) {
                        m28482();
                    } else if (!this.f34556.isEmpty()) {
                        this.f34563.m6974(this.f34556);
                        this.f34563.m6973(arrayList);
                    }
                    if (this.f34563.m6992()) {
                        do {
                            byteBufferM28485 = m28485();
                            if (byteBufferM28485 != null) {
                                throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                            }
                            c23776 = new C23776(byteBufferM28485.array());
                            this.f34563.m6981().addAll(c23776.m52862());
                            C3659 c36513 = this.f34563;
                            c36513.m6971(c36513.m6988() + ((long) i));
                        } while (c23776.m52863());
                    }
                    return this.f34563;
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    private void m28482() throws IOException {
        int i = this.f34558;
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamM28486 = m28486(this.f34563);
        try {
            HashMap mapM19274 = C8353.m19274(inputStreamM28486, arrayList, this.f34556, this.f34563.m6967());
            inputStreamM28486.close();
            if (mapM19274.containsKey("GNU.sparse.map")) {
                arrayList = new ArrayList(C8353.m19275((String) mapM19274.get("GNU.sparse.map")));
            }
            mo28488();
            C3659 c3659 = this.f34563;
            if (c3659 != null) {
                c3659.m6974(mapM19274);
                this.f34563.m6973(arrayList);
                if (this.f34563.m6987()) {
                    C24618 c24618 = this.f34564;
                    long filePointer = c24618.getFilePointer();
                    C18096 c18096 = new C18096(this.f34563.m6988(), this.f34563.m6967(), this.f34564);
                    try {
                        ArrayList arrayListM19273 = C8353.m19273(c18096, i);
                        c18096.close();
                        this.f34563.m6973(arrayListM19273);
                        long filePointer2 = c24618.getFilePointer() - filePointer;
                        if (filePointer2 < 0 || filePointer2 > this.f34563.m6967() || filePointer2 % ((long) i) != 0) {
                            throw new IOException("Corrupted TAR archive. Invalid sparse headers size");
                        }
                        C3659 c36510 = this.f34563;
                        c36510.m6989(c36510.m6967() - filePointer2);
                        C3659 c36511 = this.f34563;
                        c36511.m6971(c36511.m6988() + filePointer2);
                        return;
                    } catch (Throwable th) {
                        try {
                            c18096.close();
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
                inputStreamM28486.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private ByteBuffer m28485() throws IOException {
        boolean z;
        ByteBuffer byteBuffer = this.f34559;
        byteBuffer.rewind();
        C24618 c24618 = this.f34564;
        int i = c24618.read(byteBuffer);
        int i2 = this.f34558;
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
        this.f34561 = z;
        if (!z || byteBuffer2 == null) {
            return byteBuffer2;
        }
        try {
            byteBuffer.rewind();
            if (c24618.read(byteBuffer) != i2) {
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
                c24618.seek(c24618.getFilePointer() - ((long) i2));
            }
            long filePointer = c24618.getFilePointer();
            long j = this.f34565;
            long j2 = filePointer % j;
            if (j2 > 0) {
                long filePointer2 = c24618.getFilePointer() + (j - j2);
                if (filePointer2 < c24618.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c24618.seek(filePointer2);
            }
            return null;
        } catch (Throwable th) {
            c24618.seek(c24618.getFilePointer() - ((long) i2));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m28489() {
        this.f34561 = true;
    }
}
