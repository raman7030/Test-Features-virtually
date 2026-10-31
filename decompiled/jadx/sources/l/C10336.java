package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6T5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10336 implements AutoCloseable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f31131;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12704 f31132;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f31133;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0646 f31134;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f31135;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f31130 = new boolean[261];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6102 f31129 = new C6102();

    public C10336(C12704 c12704, int i, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Invalid app state limit");
        }
        this.f31132 = c12704;
        this.f31133 = i3;
        this.f31134 = new C0646(c12704, i, i2);
        this.f31131 = i == 0 && i2 == c12704.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26131(int i, long j, InputStream inputStream) {
        if (i != 1 && i != 2 && i != 4 && i != 7 && i != 259 && i != 260) {
            m26129();
            return;
        }
        try {
            try {
                m26129();
                boolean[] zArr = this.f31130;
                if (!zArr[i] && j >= 0) {
                    int i2 = this.f31133;
                    if (j <= i2) {
                        zArr[i] = true;
                        C12452 c12452 = new C12452(inputStream);
                        if (i == 4) {
                            this.f31129.f18707 = new byte[(int) j];
                            int i3 = 0;
                            while (true) {
                                C6102 c6102 = this.f31129;
                                byte[] bArr = c6102.f18707;
                                if (i3 >= bArr.length) {
                                    c6102.f18706 = C13157.m31884(new ByteArrayInputStream(this.f31129.f18707), j, i2);
                                    break;
                                }
                                int i4 = c12452.read(bArr, i3, bArr.length - i3);
                                if (i4 <= 0) {
                                    throw new IOException("Truncated legacy text config");
                                }
                                i3 += i4;
                            }
                        } else {
                            C0646 c0646 = this.f31134;
                            if (i == 259 || i == 260) {
                                ArrayList arrayList = new ArrayList();
                                c0646.m2660(c12452, j, new C4564(this, arrayList));
                                if (i == 259) {
                                    this.f31129.f18703 = arrayList;
                                } else {
                                    this.f31129.f18704 = arrayList;
                                }
                            } else {
                                C23930 c23930M52696 = C23930.m52696(j, c12452);
                                try {
                                    if (i == 1) {
                                        this.f31129.f18701 = c23930M52696.readInt();
                                        this.f31129.f18698 = c23930M52696.readInt();
                                        this.f31129.f18708 = c23930M52696.readInt();
                                        C6102 c6103 = this.f31129;
                                        if (Integer.compare(c6103.f18708 ^ Integer.MIN_VALUE, c6103.f18701 ^ Integer.MIN_VALUE) > 0) {
                                            throw new IOException("Invalid legacy edit marks");
                                        }
                                        this.f31129.f18712 = true;
                                    } else if (i == 2) {
                                        C6102 c6104 = this.f31129;
                                        c0646.m2659(c23930M52696.readInt());
                                        c6104.getClass();
                                        C6102 c6105 = this.f31129;
                                        c0646.m2659(c23930M52696.readInt());
                                        c6105.getClass();
                                        this.f31129.f18709 = c23930M52696.readInt();
                                        this.f31129.f18710 = c23930M52696.readInt();
                                        this.f31129.f18699 = c23930M52696.readByte();
                                        this.f31129.f18695 = c23930M52696.m52703();
                                        this.f31129.f18696 = c23930M52696.m52703();
                                        this.f31129.f18702 = c23930M52696.m52703();
                                        this.f31129.f18700 = true;
                                    } else {
                                        this.f31129.f18697 = c0646.m2659(c23930M52696.readInt());
                                        this.f31129.f18705 = c0646.m2659(c23930M52696.readInt());
                                        this.f31129.f18711 = true;
                                    }
                                    c23930M52696.m52709();
                                    c23930M52696.close();
                                } catch (Throwable th) {
                                    try {
                                        c23930M52696.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }
                        inputStream.close();
                        return;
                    }
                }
                throw new IOException("Invalid or repeated legacy view field");
            } catch (Throwable th3) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f31135 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26130(C10336 c10336, ArrayList arrayList, int i, int i2, int i3) {
        C12704 c12704 = c10336.f31132;
        if (!c10336.f31131 && i3 >= 0) {
            i = c12704.m32421(i3);
            i2 = i3 - c12704.m32422(i);
        }
        arrayList.add(new C21441(i, i2));
    }

    public final C6102 finish() {
        m26129();
        C6102 c6102 = this.f31129;
        close();
        return c6102;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26129() {
        if (this.f31129 == null || this.f31135) {
            throw new IllegalStateException("Legacy view reader is closed or failed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f31129 = null;
        this.f31134.close();
    }
}
