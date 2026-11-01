package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6T5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12192 implements AutoCloseable {

    /* JADX INFO: renamed from: ۫ */
    public final boolean f34093;

    /* JADX INFO: renamed from: ۬ */
    public final C14443 f34094;

    /* JADX INFO: renamed from: ᩶ */
    public final int f34095;

    /* JADX INFO: renamed from: ᩸ */
    public final C2983 f34096;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f34097;

    /* JADX INFO: renamed from: ۙ */
    public final boolean[] f34092 = new boolean[261];

    /* JADX INFO: renamed from: ۗ */
    public C8168 f34091 = new C8168();

    public C12192(C14443 c14443, int i, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Invalid app state limit");
        }
        this.f34094 = c14443;
        this.f34095 = i3;
        this.f34096 = new C2983(c14443, i, i2);
        this.f34093 = i == 0 && i2 == c14443.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28156(int i, long j, InputStream inputStream) {
        if (i != 1 && i != 2 && i != 4 && i != 7 && i != 259 && i != 260) {
            m28154();
            return;
        }
        try {
            try {
                m28154();
                boolean[] zArr = this.f34092;
                if (!zArr[i] && j >= 0) {
                    int i2 = this.f34095;
                    if (j <= i2) {
                        zArr[i] = true;
                        C14203 c14203 = new C14203(inputStream);
                        if (i == 4) {
                            this.f34091.f21562 = new byte[(int) j];
                            int i3 = 0;
                            while (true) {
                                C8168 c8168 = this.f34091;
                                byte[] bArr = c8168.f21562;
                                if (i3 >= bArr.length) {
                                    c8168.f21561 = C14873.m33977(new ByteArrayInputStream(this.f34091.f21562), j, i2);
                                    break;
                                }
                                int i4 = c14203.read(bArr, i3, bArr.length - i3);
                                if (i4 <= 0) {
                                    throw new IOException("Truncated legacy text config");
                                }
                                i3 += i4;
                            }
                        } else {
                            C2983 c2983 = this.f34096;
                            if (i == 259 || i == 260) {
                                ArrayList arrayList = new ArrayList();
                                c2983.m5000(c14203, j, new C6706(this, arrayList));
                                if (i == 259) {
                                    this.f34091.f21558 = arrayList;
                                } else {
                                    this.f34091.f21559 = arrayList;
                                }
                            } else {
                                C25112 c25112M55102 = C25112.m55102(j, c14203);
                                try {
                                    if (i == 1) {
                                        this.f34091.f21556 = c25112M55102.readInt();
                                        this.f34091.f21553 = c25112M55102.readInt();
                                        this.f34091.f21563 = c25112M55102.readInt();
                                        C8168 c8169 = this.f34091;
                                        if (Integer.compare(c8169.f21563 ^ Integer.MIN_VALUE, c8169.f21556 ^ Integer.MIN_VALUE) > 0) {
                                            throw new IOException("Invalid legacy edit marks");
                                        }
                                        this.f34091.f21567 = true;
                                    } else if (i == 2) {
                                        C8168 c81610 = this.f34091;
                                        c2983.m4999(c25112M55102.readInt());
                                        c81610.getClass();
                                        C8168 c81611 = this.f34091;
                                        c2983.m4999(c25112M55102.readInt());
                                        c81611.getClass();
                                        this.f34091.f21564 = c25112M55102.readInt();
                                        this.f34091.f21565 = c25112M55102.readInt();
                                        this.f34091.f21554 = c25112M55102.readByte();
                                        this.f34091.f21550 = c25112M55102.m55109();
                                        this.f34091.f21551 = c25112M55102.m55109();
                                        this.f34091.f21557 = c25112M55102.m55109();
                                        this.f34091.f21555 = true;
                                    } else {
                                        this.f34091.f21552 = c2983.m4999(c25112M55102.readInt());
                                        this.f34091.f21560 = c2983.m4999(c25112M55102.readInt());
                                        this.f34091.f21566 = true;
                                    }
                                    c25112M55102.m55115();
                                    c25112M55102.close();
                                } catch (Throwable th) {
                                    try {
                                        c25112M55102.close();
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
            this.f34097 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28155(C12192 c12192, ArrayList arrayList, int i, int i2, int i3) {
        C14443 c14443 = c12192.f34094;
        if (!c12192.f34093 && i3 >= 0) {
            i = c14443.m34523(i3);
            i2 = i3 - c14443.m34524(i);
        }
        arrayList.add(new C22746(i, i2));
    }

    public final C8168 finish() {
        m28154();
        C8168 c8168 = this.f34091;
        close();
        return c8168;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28154() {
        if (this.f34091 == null || this.f34097) {
            throw new IllegalStateException("Legacy view reader is closed or failed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f34091 = null;
        this.f34096.close();
    }
}
