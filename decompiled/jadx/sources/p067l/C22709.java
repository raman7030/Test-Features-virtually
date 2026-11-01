package p067l;

/* JADX INFO: renamed from: l.᩸ۛ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C22709 {
    /* JADX INFO: renamed from: ֫ */
    public static final int m50814() {
        return C23379.m52022();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final String m50817(String str) {
        int i = C23379.f74492;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m50815(int i, int i2, String str) {
        return (int) m50816(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[PHI: r14
      0x0064: PHI (r14v2 long) = (r14v1 long), (r14v7 long) binds: [B:27:0x0056, B:31:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[LOOP:0: B:22:0x003e->B:36:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c A[EDGE_INSN: B:38:0x007c->B:40:0x0086 BREAK  A[LOOP:0: B:22:0x003e->B:36:0x0072]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[EDGE_INSN: B:39:0x0081->B:40:0x0086 BREAK  A[LOOP:0: B:22:0x003e->B:36:0x0072]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0070 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static final long m50816(String str, long j, long j2, long j3) {
        Long lValueOf;
        int i;
        boolean z;
        long j4;
        long j5;
        int i2;
        int iDigit;
        long j6;
        long j7;
        long j8;
        String strM50817 = m50817(str);
        if (strM50817 == null) {
            return j;
        }
        int length = strM50817.length();
        if (length != 0) {
            int i3 = 0;
            char cCharAt = strM50817.charAt(0);
            long j9 = -9223372036854775807L;
            if (cCharAt >= '0') {
                i = i3;
                z = false;
                j4 = 0;
                j5 = -256204778801521550L;
                while (true) {
                    if (i >= length) {
                        if (!z) {
                            lValueOf = Long.valueOf(-j4);
                            break;
                        }
                        lValueOf = Long.valueOf(j4);
                        break;
                    }
                    i2 = length;
                    iDigit = Character.digit((int) strM50817.charAt(i), 10);
                    if (iDigit >= 0) {
                        if (j4 >= j5) {
                            j6 = j5;
                            j7 = j4 * ((long) 10);
                            j8 = iDigit;
                            if (j7 < j9 + j8) {
                                j4 = j7 - j8;
                                i++;
                                length = i2;
                                j5 = j6;
                            }
                        } else if (j5 == -256204778801521550L) {
                            j5 = j9 / ((long) 10);
                            if (j4 >= j5) {
                                j6 = j5;
                                j7 = j4 * ((long) 10);
                                j8 = iDigit;
                                if (j7 < j9 + j8) {
                                    j4 = j7 - j8;
                                    i++;
                                    length = i2;
                                    j5 = j6;
                                }
                            }
                        }
                    }
                }
            } else {
                z = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        i3 = 1;
                        i = i3;
                        z = false;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i >= length) {
                                if (!z) {
                                    lValueOf = Long.valueOf(-j4);
                                    break;
                                }
                                lValueOf = Long.valueOf(j4);
                                break;
                            }
                            i2 = length;
                            iDigit = Character.digit((int) strM50817.charAt(i), 10);
                            if (iDigit >= 0) {
                                if (j4 >= j5) {
                                    j6 = j5;
                                    j7 = j4 * ((long) 10);
                                    j8 = iDigit;
                                    if (j7 < j9 + j8) {
                                        j4 = j7 - j8;
                                        i++;
                                        length = i2;
                                        j5 = j6;
                                    }
                                } else if (j5 == -256204778801521550L) {
                                    j5 = j9 / ((long) 10);
                                    if (j4 >= j5) {
                                        j6 = j5;
                                        j7 = j4 * ((long) 10);
                                        j8 = iDigit;
                                        if (j7 < j9 + j8) {
                                            j4 = j7 - j8;
                                            i++;
                                            length = i2;
                                            j5 = j6;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (cCharAt == '-') {
                        j9 = Long.MIN_VALUE;
                        i = 1;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i >= length) {
                                if (!z) {
                                    lValueOf = Long.valueOf(-j4);
                                    break;
                                }
                                lValueOf = Long.valueOf(j4);
                                break;
                            }
                            i2 = length;
                            iDigit = Character.digit((int) strM50817.charAt(i), 10);
                            if (iDigit >= 0) {
                                if (j4 >= j5) {
                                    j6 = j5;
                                    j7 = j4 * ((long) 10);
                                    j8 = iDigit;
                                    if (j7 < j9 + j8) {
                                        j4 = j7 - j8;
                                        i++;
                                        length = i2;
                                        j5 = j6;
                                    }
                                } else if (j5 == -256204778801521550L) {
                                    j5 = j9 / ((long) 10);
                                    if (j4 >= j5) {
                                        j6 = j5;
                                        j7 = j4 * ((long) 10);
                                        j8 = iDigit;
                                        if (j7 < j9 + j8) {
                                            j4 = j7 - j8;
                                            i++;
                                            length = i2;
                                            j5 = j6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            lValueOf = null;
            break;
        } else {
            lValueOf = null;
            break;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (j2 <= jLongValue && jLongValue <= j3) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM50817 + '\'').toString());
    }
}
