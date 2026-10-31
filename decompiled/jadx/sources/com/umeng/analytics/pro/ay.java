package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: G4P0 */
/* JADX INFO: loaded from: classes.dex */
public class ay {
    public final bu a;
    public final ch b;

    public ay() {
        this(new bo.a());
    }

    public ay(bw bwVar) {
        ch chVar = new ch();
        this.b = chVar;
        this.a = bwVar.a(chVar);
    }

    public void a(av avVar, byte[] bArr) {
        try {
            this.b.a(bArr);
            avVar.read(this.a);
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    public void a(av avVar, String str, String str2) {
        try {
            try {
                a(avVar, str.getBytes(str2));
                this.a.B();
            } catch (UnsupportedEncodingException unused) {
                throw new bb("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } catch (Throwable th) {
            this.a.B();
            throw th;
        }
    }

    public void a(av avVar, byte[] bArr, bc bcVar, bc... bcVarArr) {
        try {
            try {
                if (j(bArr, bcVar, bcVarArr) != null) {
                    avVar.read(this.a);
                }
                this.b.e();
                this.a.B();
            } catch (Exception e) {
                throw new bb(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.a.B();
            throw th;
        }
    }

    public Boolean a(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Boolean) a((byte) 2, bArr, bcVar, bcVarArr);
    }

    public Byte b(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Byte) a((byte) 3, bArr, bcVar, bcVarArr);
    }

    public Double c(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Double) a((byte) 4, bArr, bcVar, bcVarArr);
    }

    public Short d(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Short) a((byte) 6, bArr, bcVar, bcVarArr);
    }

    public Integer e(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Integer) a((byte) 8, bArr, bcVar, bcVarArr);
    }

    public Long f(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Long) a((byte) 10, bArr, bcVar, bcVarArr);
    }

    public String g(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (String) a((byte) 11, bArr, bcVar, bcVarArr);
    }

    public ByteBuffer h(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (ByteBuffer) a((byte) 100, bArr, bcVar, bcVarArr);
    }

    public Short i(byte[] bArr, bc bcVar, bc... bcVarArr) {
        try {
            try {
                if (j(bArr, bcVar, bcVarArr) != null) {
                    this.a.j();
                    Short shValueOf = Short.valueOf(this.a.l().c);
                    this.b.e();
                    this.a.B();
                    return shValueOf;
                }
                this.b.e();
                this.a.B();
                return null;
            } catch (Exception e) {
                throw new bb(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.a.B();
            throw th;
        }
        this.b.e();
        this.a.B();
        throw th;
    }

    private Object a(byte b, byte[] bArr, bc bcVar, bc... bcVarArr) {
        try {
            try {
                bp bpVarJ = j(bArr, bcVar, bcVarArr);
                if (bpVarJ != null) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 6) {
                                    if (b != 8) {
                                        if (b != 100) {
                                            if (b != 10) {
                                                if (b == 11 && bpVarJ.b == 11) {
                                                    String strZ = this.a.z();
                                                    this.b.e();
                                                    this.a.B();
                                                    return strZ;
                                                }
                                            } else if (bpVarJ.b == 10) {
                                                Long lValueOf = Long.valueOf(this.a.x());
                                                this.b.e();
                                                this.a.B();
                                                return lValueOf;
                                            }
                                        } else if (bpVarJ.b == 11) {
                                            ByteBuffer byteBufferA = this.a.A();
                                            this.b.e();
                                            this.a.B();
                                            return byteBufferA;
                                        }
                                    } else if (bpVarJ.b == 8) {
                                        Integer numValueOf = Integer.valueOf(this.a.w());
                                        this.b.e();
                                        this.a.B();
                                        return numValueOf;
                                    }
                                } else if (bpVarJ.b == 6) {
                                    Short shValueOf = Short.valueOf(this.a.v());
                                    this.b.e();
                                    this.a.B();
                                    return shValueOf;
                                }
                            } else if (bpVarJ.b == 4) {
                                Double dValueOf = Double.valueOf(this.a.y());
                                this.b.e();
                                this.a.B();
                                return dValueOf;
                            }
                        } else if (bpVarJ.b == 3) {
                            Byte bValueOf = Byte.valueOf(this.a.u());
                            this.b.e();
                            this.a.B();
                            return bValueOf;
                        }
                    } else if (bpVarJ.b == 2) {
                        Boolean boolValueOf = Boolean.valueOf(this.a.t());
                        this.b.e();
                        this.a.B();
                        return boolValueOf;
                    }
                }
                this.b.e();
                this.a.B();
                return null;
            } catch (Exception e) {
                throw new bb(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.a.B();
            throw th;
        }
    }

    private bp j(byte[] bArr, bc bcVar, bc... bcVarArr) {
        this.b.a(bArr);
        int length = bcVarArr.length + 1;
        bc[] bcVarArr2 = new bc[length];
        int i = 0;
        bcVarArr2[0] = bcVar;
        int i2 = 0;
        while (i2 < bcVarArr.length) {
            int i3 = i2 + 1;
            bcVarArr2[i3] = bcVarArr[i2];
            i2 = i3;
        }
        this.a.j();
        bp bpVarL = null;
        while (i < length) {
            bpVarL = this.a.l();
            if (bpVarL.b == 0 || bpVarL.c > bcVarArr2[i].a()) {
                return null;
            }
            if (bpVarL.c != bcVarArr2[i].a()) {
                bx.a(this.a, bpVarL.b);
                this.a.m();
            } else {
                i++;
                if (i < length) {
                    this.a.j();
                }
            }
        }
        return bpVarL;
    }

    public void a(av avVar, String str) {
        a(avVar, str.getBytes());
    }
}
