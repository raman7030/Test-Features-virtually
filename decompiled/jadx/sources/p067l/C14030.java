package p067l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۫۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14030 {

    /* JADX INFO: renamed from: ֫ */
    public int f39563;

    /* JADX INFO: renamed from: ۜ */
    public long f39564;

    /* JADX INFO: renamed from: ۡ */
    public Date f39565;

    /* JADX INFO: renamed from: ۢ */
    public long f39566;

    /* JADX INFO: renamed from: ۧ */
    public final C20066 f39567;

    /* JADX INFO: renamed from: ܳ */
    public String f39568;

    /* JADX INFO: renamed from: ܺ */
    public String f39569;

    /* JADX INFO: renamed from: ܽ */
    public String f39570;

    /* JADX INFO: renamed from: ܿ */
    public Date f39571;

    /* JADX INFO: renamed from: ᩳ */
    public Date f39572;

    /* JADX INFO: renamed from: ᩷ */
    public final C10678 f39573;

    /* JADX INFO: renamed from: ᩻ */
    public final long f39574;

    public C14030(long j, C10678 c10678, C20066 c20066) {
        this.f39563 = -1;
        this.f39574 = j;
        this.f39573 = c10678;
        this.f39567 = c20066;
        if (c20066 != null) {
            this.f39566 = c20066.m45441();
            this.f39564 = c20066.m45445();
            C12194 c12194M45446 = c20066.m45446();
            int iM28164 = c12194M45446.m28164();
            for (int i = 0; i < iM28164; i++) {
                String strM28161 = c12194M45446.m28161(i);
                String strM28165 = c12194M45446.m28165(i);
                if ("Date".equalsIgnoreCase(strM28161)) {
                    this.f39565 = C7151.m16449(strM28165);
                    this.f39569 = strM28165;
                } else if ("Expires".equalsIgnoreCase(strM28161)) {
                    this.f39572 = C7151.m16449(strM28165);
                } else if ("Last-Modified".equalsIgnoreCase(strM28161)) {
                    this.f39571 = C7151.m16449(strM28165);
                    this.f39568 = strM28165;
                } else if ("ETag".equalsIgnoreCase(strM28161)) {
                    this.f39570 = strM28165;
                } else if ("Age".equalsIgnoreCase(strM28161)) {
                    this.f39563 = C3127.m5328(-1, strM28165);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.ۡ۟᩵, l.ᩴ۟᩵] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: ֫ */
    public final C12019 m31866() {
        C12019 c12019;
        long millis;
        long time;
        long millis2;
        String str;
        String str2;
        long j;
        C5984 c5984M45438;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        C10678 c10678 = this.f39573;
        C20066 c20066 = this.f39567;
        if (c20066 == null) {
            c12019 = new C12019(c10678, null);
        } else if ((c10678.m24590() && c20066.m45440() == null) || !C12019.m27510(c10678, c20066)) {
            c12019 = new C12019(c10678, null);
        } else {
            C12865 c12865M24586 = c10678.m24586();
            if (c12865M24586.m29493() || c10678.m24584("If-Modified-Since") != null || c10678.m24584("If-None-Match") != null) {
                c12019 = new C12019(c10678, null);
            } else {
                C12865 c12865M45442 = c20066.m45442();
                long j2 = this.f39564;
                Date date = this.f39565;
                long jMax = date != null ? Math.max(0L, j2 - date.getTime()) : 0L;
                int i = this.f39563;
                if (i != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                }
                long time2 = this.f39566;
                long j3 = jMax + (j2 - time2) + (this.f39574 - j2);
                C12865 c12865M45443 = c20066.m45442();
                int iM29489 = c12865M45443.m29489();
                Date date2 = this.f39572;
                long time3 = j2;
                Date date3 = this.f39571;
                if (iM29489 == -1) {
                    if (date2 != null) {
                        if (date != null) {
                            time3 = date.getTime();
                        }
                        time = date2.getTime() - time3;
                        if (time > 0) {
                        }
                        if (c12865M24586.m29489() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c12865M24586.m29489()));
                        }
                        if (c12865M24586.m29490() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c12865M24586.m29490());
                        } else {
                            millis2 = millis;
                        }
                        if (!c12865M45442.m29488() && c12865M24586.m29491() != -1) {
                            millis = TimeUnit.SECONDS.toMillis(c12865M24586.m29491());
                        }
                        if (c12865M45442.m29493()) {
                            str = this.f39570;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f39568;
                                } else if (date != null) {
                                    str = this.f39569;
                                } else {
                                    r1 = 0;
                                    c12019 = new C12019(c10678, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C14205 c14205M28163 = c10678.m24588().m28163();
                            AbstractC10007.f27689.mo23320(c14205M28163, str2, str);
                            C11349 c11349M24587 = c10678.m24587();
                            c11349M24587.m26288(c14205M28163.m32677());
                            C12019 c120110 = new C12019(c11349M24587.m26284(), c20066);
                            r1 = 0;
                            c12019 = c120110;
                        } else {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c5984M45438 = c20066.m45438();
                                if (j >= time) {
                                    c5984M45438.m13413("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000 && c20066.m45442().m29489() == -1 && date2 == null) {
                                    c5984M45438.m13413("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c12019 = new C12019(null, c5984M45438.m13410());
                                r1 = 0;
                            } else {
                                str = this.f39570;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f39568;
                                    } else if (date != null) {
                                        str = this.f39569;
                                    } else {
                                        r1 = 0;
                                        c12019 = new C12019(c10678, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C14205 c14205M28164 = c10678.m24588().m28163();
                                AbstractC10007.f27689.mo23320(c14205M28164, str2, str);
                                C11349 c11349M24588 = c10678.m24587();
                                c11349M24588.m26288(c14205M28164.m32677());
                                C12019 c120111 = new C12019(c11349M24588.m26284(), c20066);
                                r1 = 0;
                                c12019 = c120111;
                            }
                        }
                    } else {
                        if (date3 != null && c20066.m45434().m24591().m30817() == null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            long time4 = time2 - date3.getTime();
                            millis = 0;
                            if (time4 > 0) {
                                time = time4 / 10;
                            }
                            if (c12865M24586.m29489() != -1) {
                                time = Math.min(time, TimeUnit.SECONDS.toMillis(c12865M24586.m29489()));
                            }
                            if (c12865M24586.m29490() != -1) {
                                millis2 = TimeUnit.SECONDS.toMillis(c12865M24586.m29490());
                            } else {
                                millis2 = millis;
                            }
                            if (!c12865M45442.m29488()) {
                                millis = TimeUnit.SECONDS.toMillis(c12865M24586.m29491());
                            }
                            if (c12865M45442.m29493()) {
                                j = millis2 + j3;
                                if (j < time + millis) {
                                    c5984M45438 = c20066.m45438();
                                    if (j >= time) {
                                        c5984M45438.m13413("110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        c5984M45438.m13413("113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    c12019 = new C12019(null, c5984M45438.m13410());
                                    r1 = 0;
                                } else {
                                    str = this.f39570;
                                    if (str != null) {
                                        str2 = "If-None-Match";
                                    } else {
                                        if (date3 != null) {
                                            str = this.f39568;
                                        } else if (date != null) {
                                            str = this.f39569;
                                        } else {
                                            r1 = 0;
                                            c12019 = new C12019(c10678, null);
                                        }
                                        str2 = "If-Modified-Since";
                                    }
                                    C14205 c14205M28165 = c10678.m24588().m28163();
                                    AbstractC10007.f27689.mo23320(c14205M28165, str2, str);
                                    C11349 c11349M24589 = c10678.m24587();
                                    c11349M24589.m26288(c14205M28165.m32677());
                                    C12019 c120112 = new C12019(c11349M24589.m26284(), c20066);
                                    r1 = 0;
                                    c12019 = c120112;
                                }
                            } else {
                                str = this.f39570;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f39568;
                                    } else if (date != null) {
                                        str = this.f39569;
                                    } else {
                                        r1 = 0;
                                        c12019 = new C12019(c10678, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C14205 c14205M28166 = c10678.m24588().m28163();
                                AbstractC10007.f27689.mo23320(c14205M28166, str2, str);
                                C11349 c11349M245810 = c10678.m24587();
                                c11349M245810.m26288(c14205M28166.m32677());
                                C12019 c120113 = new C12019(c11349M245810.m26284(), c20066);
                                r1 = 0;
                                c12019 = c120113;
                            }
                        }
                        time = millis;
                        if (c12865M24586.m29489() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c12865M24586.m29489()));
                        }
                        if (c12865M24586.m29490() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c12865M24586.m29490());
                        } else {
                            millis2 = millis;
                        }
                        if (!c12865M45442.m29488()) {
                            millis = TimeUnit.SECONDS.toMillis(c12865M24586.m29491());
                        }
                        if (c12865M45442.m29493()) {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c5984M45438 = c20066.m45438();
                                if (j >= time) {
                                    c5984M45438.m13413("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    c5984M45438.m13413("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c12019 = new C12019(null, c5984M45438.m13410());
                                r1 = 0;
                            } else {
                                str = this.f39570;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f39568;
                                    } else if (date != null) {
                                        str = this.f39569;
                                    } else {
                                        r1 = 0;
                                        c12019 = new C12019(c10678, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C14205 c14205M28167 = c10678.m24588().m28163();
                                AbstractC10007.f27689.mo23320(c14205M28167, str2, str);
                                C11349 c11349M245811 = c10678.m24587();
                                c11349M245811.m26288(c14205M28167.m32677());
                                C12019 c120114 = new C12019(c11349M245811.m26284(), c20066);
                                r1 = 0;
                                c12019 = c120114;
                            }
                        } else {
                            str = this.f39570;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f39568;
                                } else if (date != null) {
                                    str = this.f39569;
                                } else {
                                    r1 = 0;
                                    c12019 = new C12019(c10678, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C14205 c14205M28168 = c10678.m24588().m28163();
                            AbstractC10007.f27689.mo23320(c14205M28168, str2, str);
                            C11349 c11349M245812 = c10678.m24587();
                            c11349M245812.m26288(c14205M28168.m32677());
                            C12019 c120115 = new C12019(c11349M245812.m26284(), c20066);
                            r1 = 0;
                            c12019 = c120115;
                        }
                    }
                    millis = 0;
                    time = millis;
                    if (c12865M24586.m29489() != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(c12865M24586.m29489()));
                    }
                    if (c12865M24586.m29490() != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(c12865M24586.m29490());
                    } else {
                        millis2 = millis;
                    }
                    if (!c12865M45442.m29488()) {
                        millis = TimeUnit.SECONDS.toMillis(c12865M24586.m29491());
                    }
                    if (c12865M45442.m29493()) {
                        j = millis2 + j3;
                        if (j < time + millis) {
                            c5984M45438 = c20066.m45438();
                            if (j >= time) {
                                c5984M45438.m13413("110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                c5984M45438.m13413("113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            c12019 = new C12019(null, c5984M45438.m13410());
                            r1 = 0;
                        } else {
                            str = this.f39570;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f39568;
                                } else if (date != null) {
                                    str = this.f39569;
                                } else {
                                    r1 = 0;
                                    c12019 = new C12019(c10678, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C14205 c14205M28169 = c10678.m24588().m28163();
                            AbstractC10007.f27689.mo23320(c14205M28169, str2, str);
                            C11349 c11349M245813 = c10678.m24587();
                            c11349M245813.m26288(c14205M28169.m32677());
                            C12019 c120116 = new C12019(c11349M245813.m26284(), c20066);
                            r1 = 0;
                            c12019 = c120116;
                        }
                    } else {
                        str = this.f39570;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f39568;
                            } else if (date != null) {
                                str = this.f39569;
                            } else {
                                r1 = 0;
                                c12019 = new C12019(c10678, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C14205 c14205M281610 = c10678.m24588().m28163();
                        AbstractC10007.f27689.mo23320(c14205M281610, str2, str);
                        C11349 c11349M245814 = c10678.m24587();
                        c11349M245814.m26288(c14205M281610.m32677());
                        C12019 c120117 = new C12019(c11349M245814.m26284(), c20066);
                        r1 = 0;
                        c12019 = c120117;
                    }
                } else {
                    time = TimeUnit.SECONDS.toMillis(c12865M45443.m29489());
                }
                millis = 0;
                if (c12865M24586.m29489() != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(c12865M24586.m29489()));
                }
                if (c12865M24586.m29490() != -1) {
                    millis2 = TimeUnit.SECONDS.toMillis(c12865M24586.m29490());
                } else {
                    millis2 = millis;
                }
                if (!c12865M45442.m29488()) {
                    millis = TimeUnit.SECONDS.toMillis(c12865M24586.m29491());
                }
                if (c12865M45442.m29493()) {
                    j = millis2 + j3;
                    if (j < time + millis) {
                        c5984M45438 = c20066.m45438();
                        if (j >= time) {
                            c5984M45438.m13413("110 HttpURLConnection \"Response is stale\"");
                        }
                        if (j3 > 86400000) {
                            c5984M45438.m13413("113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        c12019 = new C12019(null, c5984M45438.m13410());
                        r1 = 0;
                    } else {
                        str = this.f39570;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f39568;
                            } else if (date != null) {
                                str = this.f39569;
                            } else {
                                r1 = 0;
                                c12019 = new C12019(c10678, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C14205 c14205M281611 = c10678.m24588().m28163();
                        AbstractC10007.f27689.mo23320(c14205M281611, str2, str);
                        C11349 c11349M245815 = c10678.m24587();
                        c11349M245815.m26288(c14205M281611.m32677());
                        C12019 c120118 = new C12019(c11349M245815.m26284(), c20066);
                        r1 = 0;
                        c12019 = c120118;
                    }
                } else {
                    str = this.f39570;
                    if (str != null) {
                        str2 = "If-None-Match";
                    } else {
                        if (date3 != null) {
                            str = this.f39568;
                        } else if (date != null) {
                            str = this.f39569;
                        } else {
                            r1 = 0;
                            c12019 = new C12019(c10678, null);
                        }
                        str2 = "If-Modified-Since";
                    }
                    C14205 c14205M281612 = c10678.m24588().m28163();
                    AbstractC10007.f27689.mo23320(c14205M281612, str2, str);
                    C11349 c11349M245816 = c10678.m24587();
                    c11349M245816.m26288(c14205M281612.m32677());
                    C12019 c120119 = new C12019(c11349M245816.m26284(), c20066);
                    r1 = 0;
                    c12019 = c120119;
                }
            }
        }
        return (c12019.f33498 == null || !c10678.m24586().m29492()) ? c12019 : new C12019(r1, r1);
    }
}
