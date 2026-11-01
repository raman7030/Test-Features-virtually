package com.alipay.sdk.p010m.p049t;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p041p.C0185b;
import com.alipay.sdk.p010m.p041p.C0187d;
import com.alipay.sdk.p010m.p041p.C0188e;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;

/* JADX INFO: renamed from: com.alipay.sdk.m.t.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211c {

    /* JADX INFO: renamed from: a */
    public boolean f975a;

    /* JADX INFO: renamed from: b */
    public String f976b = C0254q.m1253a(24);

    public C0211c(boolean z) {
        this.f975a = z;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1028b(String str, byte[] bArr, String str2) {
        return C0188e.m913b(str, bArr, str2);
    }

    /* JADX INFO: renamed from: a */
    public C0212d m1030a(C0210b c0210b, boolean z, String str) {
        if (c0210b == null) {
            return null;
        }
        byte[] bytes = c0210b.m1021b().getBytes();
        byte[] bytes2 = c0210b.m1020a().getBytes();
        if (z) {
            try {
                bytes2 = C0185b.m905a(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        return new C0212d(z, this.f975a ? m1027a(bytes, m1025a(this.f976b, C0170a.f668g), m1028b(this.f976b, bytes2, str)) : m1027a(bytes, bytes2));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public C0210b m1029a(C0212d c0212d, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        String str3;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(c0212d.m1031a());
            try {
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[m1023a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream.read(bArr3);
                        int iM1023a = m1023a(new String(bArr3));
                        if (iM1023a > 0) {
                            byte[] bArrM906b = new byte[iM1023a];
                            byteArrayInputStream.read(bArrM906b);
                            if (this.f975a) {
                                bArrM906b = m1026a(this.f976b, bArrM906b, str);
                            }
                            if (c0212d.m1032b()) {
                                bArrM906b = C0185b.m906b(bArrM906b);
                            }
                            str3 = new String(bArrM906b);
                        } else {
                            str3 = null;
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            C0244g.m1199a(e);
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            str3 = null;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream2 = byteArrayInputStream;
                            byteArrayInputStream = byteArrayInputStream2;
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = byteArrayInputStream2;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            throw th;
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new C0210b(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1025a(String str, String str2) {
        return C0187d.m908a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1026a(String str, byte[] bArr, String str2) {
        return C0188e.m911a(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static byte[] m1027a(byte[]... bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        DataOutputStream dataOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            try {
                                for (byte[] bArr2 : bArr) {
                                    dataOutputStream.write(m1024a(bArr2.length).getBytes());
                                    dataOutputStream.write(bArr2);
                                }
                                dataOutputStream.flush();
                                byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused) {
                                }
                                dataOutputStream.close();
                            } catch (Exception e) {
                                e = e;
                                try {
                                    C0244g.m1199a(e);
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    return byteArray;
                                } catch (Throwable th) {
                                    th = th;
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    dataOutputStream2 = dataOutputStream;
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    if (dataOutputStream2 != null) {
                                        try {
                                            dataOutputStream2.close();
                                            throw th;
                                        } catch (Exception unused4) {
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                if (dataOutputStream2 != null) {
                                    dataOutputStream2.close();
                                    throw th;
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            dataOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream = null;
                        dataOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        dataOutputStream = null;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        dataOutputStream2 = dataOutputStream;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        if (dataOutputStream2 != null) {
                            dataOutputStream2.close();
                            throw th;
                        }
                        throw th;
                    }
                    return byteArray;
                }
            } catch (Exception unused5) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m1024a(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public static int m1023a(String str) {
        return Integer.parseInt(str);
    }
}
