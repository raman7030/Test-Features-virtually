package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ay */
/* JADX INFO: compiled from: G4P0 */
/* JADX INFO: loaded from: classes.dex */
public class C0667ay {

    /* JADX INFO: renamed from: a */
    public final AbstractC0690bu f2451a;

    /* JADX INFO: renamed from: b */
    public final C0704ch f2452b;

    public C0667ay() {
        this(new C0684bo.a());
    }

    public C0667ay(InterfaceC0692bw interfaceC0692bw) {
        C0704ch c0704ch = new C0704ch();
        this.f2452b = c0704ch;
        this.f2451a = interfaceC0692bw.mo2402a(c0704ch);
    }

    /* JADX INFO: renamed from: a */
    public void m2304a(InterfaceC0664av interfaceC0664av, byte[] bArr) {
        try {
            this.f2452b.m2444a(bArr);
            interfaceC0664av.read(this.f2451a);
        } finally {
            this.f2452b.m2446e();
            this.f2451a.mo2422B();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2303a(InterfaceC0664av interfaceC0664av, String str, String str2) {
        try {
            try {
                m2304a(interfaceC0664av, str.getBytes(str2));
                this.f2451a.mo2422B();
            } catch (UnsupportedEncodingException unused) {
                throw new C0671bb("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } catch (Throwable th) {
            this.f2451a.mo2422B();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2305a(InterfaceC0664av interfaceC0664av, byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        try {
            try {
                if (m2300j(bArr, interfaceC0672bc, interfaceC0672bcArr) != null) {
                    interfaceC0664av.read(this.f2451a);
                }
                this.f2452b.m2446e();
                this.f2451a.mo2422B();
            } catch (Exception e) {
                throw new C0671bb(e);
            }
        } catch (Throwable th) {
            this.f2452b.m2446e();
            this.f2451a.mo2422B();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public Boolean m2301a(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (Boolean) m2299a((byte) 2, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: b */
    public Byte m2306b(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (Byte) m2299a((byte) 3, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: c */
    public Double m2307c(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (Double) m2299a((byte) 4, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: d */
    public Short m2308d(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (Short) m2299a((byte) 6, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: e */
    public Integer m2309e(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (Integer) m2299a((byte) 8, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: f */
    public Long m2310f(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (Long) m2299a((byte) 10, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: g */
    public String m2311g(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (String) m2299a((byte) 11, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: h */
    public ByteBuffer m2312h(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        return (ByteBuffer) m2299a((byte) 100, bArr, interfaceC0672bc, interfaceC0672bcArr);
    }

    /* JADX INFO: renamed from: i */
    public Short m2313i(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        try {
            try {
                if (m2300j(bArr, interfaceC0672bc, interfaceC0672bcArr) != null) {
                    this.f2451a.mo2385j();
                    Short shValueOf = Short.valueOf(this.f2451a.mo2387l().f2532c);
                    this.f2452b.m2446e();
                    this.f2451a.mo2422B();
                    return shValueOf;
                }
                this.f2452b.m2446e();
                this.f2451a.mo2422B();
                return null;
            } catch (Exception e) {
                throw new C0671bb(e);
            }
        } catch (Throwable th) {
            this.f2452b.m2446e();
            this.f2451a.mo2422B();
            throw th;
        }
        this.f2452b.m2446e();
        this.f2451a.mo2422B();
        throw th;
    }

    /* JADX INFO: renamed from: a */
    private Object m2299a(byte b, byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        try {
            try {
                C0685bp c0685bpM2300j = m2300j(bArr, interfaceC0672bc, interfaceC0672bcArr);
                if (c0685bpM2300j != null) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 6) {
                                    if (b != 8) {
                                        if (b != 100) {
                                            if (b != 10) {
                                                if (b == 11 && c0685bpM2300j.f2531b == 11) {
                                                    String strMo2401z = this.f2451a.mo2401z();
                                                    this.f2452b.m2446e();
                                                    this.f2451a.mo2422B();
                                                    return strMo2401z;
                                                }
                                            } else if (c0685bpM2300j.f2531b == 10) {
                                                Long lValueOf = Long.valueOf(this.f2451a.mo2399x());
                                                this.f2452b.m2446e();
                                                this.f2451a.mo2422B();
                                                return lValueOf;
                                            }
                                        } else if (c0685bpM2300j.f2531b == 11) {
                                            ByteBuffer byteBufferMo2358A = this.f2451a.mo2358A();
                                            this.f2452b.m2446e();
                                            this.f2451a.mo2422B();
                                            return byteBufferMo2358A;
                                        }
                                    } else if (c0685bpM2300j.f2531b == 8) {
                                        Integer numValueOf = Integer.valueOf(this.f2451a.mo2398w());
                                        this.f2452b.m2446e();
                                        this.f2451a.mo2422B();
                                        return numValueOf;
                                    }
                                } else if (c0685bpM2300j.f2531b == 6) {
                                    Short shValueOf = Short.valueOf(this.f2451a.mo2397v());
                                    this.f2452b.m2446e();
                                    this.f2451a.mo2422B();
                                    return shValueOf;
                                }
                            } else if (c0685bpM2300j.f2531b == 4) {
                                Double dValueOf = Double.valueOf(this.f2451a.mo2400y());
                                this.f2452b.m2446e();
                                this.f2451a.mo2422B();
                                return dValueOf;
                            }
                        } else if (c0685bpM2300j.f2531b == 3) {
                            Byte bValueOf = Byte.valueOf(this.f2451a.mo2396u());
                            this.f2452b.m2446e();
                            this.f2451a.mo2422B();
                            return bValueOf;
                        }
                    } else if (c0685bpM2300j.f2531b == 2) {
                        Boolean boolValueOf = Boolean.valueOf(this.f2451a.mo2395t());
                        this.f2452b.m2446e();
                        this.f2451a.mo2422B();
                        return boolValueOf;
                    }
                }
                this.f2452b.m2446e();
                this.f2451a.mo2422B();
                return null;
            } catch (Exception e) {
                throw new C0671bb(e);
            }
        } catch (Throwable th) {
            this.f2452b.m2446e();
            this.f2451a.mo2422B();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    private C0685bp m2300j(byte[] bArr, InterfaceC0672bc interfaceC0672bc, InterfaceC0672bc... interfaceC0672bcArr) {
        this.f2452b.m2444a(bArr);
        int length = interfaceC0672bcArr.length + 1;
        InterfaceC0672bc[] interfaceC0672bcArr2 = new InterfaceC0672bc[length];
        int i = 0;
        interfaceC0672bcArr2[0] = interfaceC0672bc;
        int i2 = 0;
        while (i2 < interfaceC0672bcArr.length) {
            int i3 = i2 + 1;
            interfaceC0672bcArr2[i3] = interfaceC0672bcArr[i2];
            i2 = i3;
        }
        this.f2451a.mo2385j();
        C0685bp c0685bpMo2387l = null;
        while (i < length) {
            c0685bpMo2387l = this.f2451a.mo2387l();
            if (c0685bpMo2387l.f2531b == 0 || c0685bpMo2387l.f2532c > interfaceC0672bcArr2[i].mo2227a()) {
                return null;
            }
            if (c0685bpMo2387l.f2532c != interfaceC0672bcArr2[i].mo2227a()) {
                C0693bx.m2431a(this.f2451a, c0685bpMo2387l.f2531b);
                this.f2451a.mo2388m();
            } else {
                i++;
                if (i < length) {
                    this.f2451a.mo2385j();
                }
            }
        }
        return c0685bpMo2387l;
    }

    /* JADX INFO: renamed from: a */
    public void m2302a(InterfaceC0664av interfaceC0664av, String str) {
        m2304a(interfaceC0664av, str.getBytes());
    }
}
