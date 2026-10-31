package l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۫۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12270 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f36547;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f36548;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Date f36549;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f36550;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18621 f36551;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f36552;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f36553;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f36554;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Date f36555;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Date f36556;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8743 f36557;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f36558;

    public C12270(long j, C8743 c8743, C18621 c18621) {
        this.f36547 = -1;
        this.f36558 = j;
        this.f36557 = c8743;
        this.f36551 = c18621;
        if (c18621 != null) {
            this.f36550 = c18621.m43175();
            this.f36548 = c18621.m43179();
            C10338 c10338M43180 = c18621.m43180();
            int iM26139 = c10338M43180.m26139();
            for (int i = 0; i < iM26139; i++) {
                String strM26136 = c10338M43180.m26136(i);
                String strM26140 = c10338M43180.m26140(i);
                if ("Date".equalsIgnoreCase(strM26136)) {
                    this.f36549 = C5033.m14545(strM26140);
                    this.f36553 = strM26140;
                } else if ("Expires".equalsIgnoreCase(strM26136)) {
                    this.f36556 = C5033.m14545(strM26140);
                } else if ("Last-Modified".equalsIgnoreCase(strM26136)) {
                    this.f36555 = C5033.m14545(strM26140);
                    this.f36552 = strM26140;
                } else if ("ETag".equalsIgnoreCase(strM26136)) {
                    this.f36554 = strM26140;
                } else if ("Age".equalsIgnoreCase(strM26136)) {
                    this.f36547 = C0799.m3015(-1, strM26140);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10154 m29804() {
        C10154 c10154;
        long millis;
        long time;
        long millis2;
        String str;
        String str2;
        long j;
        C3804 c3804M43172;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        C8743 c8743 = this.f36557;
        C18621 c18621 = this.f36551;
        if (c18621 == null) {
            c10154 = new C10154(c8743, null);
        } else if ((c8743.m22621() && c18621.m43174() == null) || !C10154.m25491(c8743, c18621)) {
            c10154 = new C10154(c8743, null);
        } else {
            C11044 c11044M22617 = c8743.m22617();
            if (c11044M22617.m27431() || c8743.m22615("If-Modified-Since") != null || c8743.m22615("If-None-Match") != null) {
                c10154 = new C10154(c8743, null);
            } else {
                C11044 c11044M43176 = c18621.m43176();
                long j2 = this.f36548;
                Date date = this.f36549;
                long jMax = date != null ? Math.max(0L, j2 - date.getTime()) : 0L;
                int i = this.f36547;
                if (i != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                }
                long time2 = this.f36550;
                long j3 = jMax + (j2 - time2) + (this.f36558 - j2);
                C11044 c11044M43177 = c18621.m43176();
                int iM27427 = c11044M43177.m27427();
                Date date2 = this.f36556;
                long time3 = j2;
                Date date3 = this.f36555;
                if (iM27427 == -1) {
                    if (date2 != null) {
                        if (date != null) {
                            time3 = date.getTime();
                        }
                        time = date2.getTime() - time3;
                        if (time > 0) {
                        }
                        if (c11044M22617.m27427() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c11044M22617.m27427()));
                        }
                        if (c11044M22617.m27428() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c11044M22617.m27428());
                        } else {
                            millis2 = millis;
                        }
                        if (!c11044M43176.m27426() && c11044M22617.m27429() != -1) {
                            millis = TimeUnit.SECONDS.toMillis(c11044M22617.m27429());
                        }
                        if (c11044M43176.m27431()) {
                            str = this.f36554;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f36552;
                                } else if (date != null) {
                                    str = this.f36553;
                                } else {
                                    r1 = 0;
                                    c10154 = new C10154(c8743, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C12454 c12454M26138 = c8743.m22619().m26138();
                            AbstractC8037.f24775.mo21353(c12454M26138, str2, str);
                            C9449 c9449M22618 = c8743.m22618();
                            c9449M22618.m24278(c12454M26138.m30612());
                            C10154 c10155 = new C10154(c9449M22618.m24274(), c18621);
                            r1 = 0;
                            c10154 = c10155;
                        } else {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c3804M43172 = c18621.m43172();
                                if (j >= time) {
                                    c3804M43172.m11477("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000 && c18621.m43176().m27427() == -1 && date2 == null) {
                                    c3804M43172.m11477("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c10154 = new C10154(null, c3804M43172.m11474());
                                r1 = 0;
                            } else {
                                str = this.f36554;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f36552;
                                    } else if (date != null) {
                                        str = this.f36553;
                                    } else {
                                        r1 = 0;
                                        c10154 = new C10154(c8743, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C12454 c12454M26139 = c8743.m22619().m26138();
                                AbstractC8037.f24775.mo21353(c12454M26139, str2, str);
                                C9449 c9449M22619 = c8743.m22618();
                                c9449M22619.m24278(c12454M26139.m30612());
                                C10154 c10156 = new C10154(c9449M22619.m24274(), c18621);
                                r1 = 0;
                                c10154 = c10156;
                            }
                        }
                    } else {
                        if (date3 != null && c18621.m43168().m22622().m28770() == null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            long time4 = time2 - date3.getTime();
                            millis = 0;
                            if (time4 > 0) {
                                time = time4 / 10;
                            }
                            if (c11044M22617.m27427() != -1) {
                                time = Math.min(time, TimeUnit.SECONDS.toMillis(c11044M22617.m27427()));
                            }
                            if (c11044M22617.m27428() != -1) {
                                millis2 = TimeUnit.SECONDS.toMillis(c11044M22617.m27428());
                            } else {
                                millis2 = millis;
                            }
                            if (!c11044M43176.m27426()) {
                                millis = TimeUnit.SECONDS.toMillis(c11044M22617.m27429());
                            }
                            if (c11044M43176.m27431()) {
                                j = millis2 + j3;
                                if (j < time + millis) {
                                    c3804M43172 = c18621.m43172();
                                    if (j >= time) {
                                        c3804M43172.m11477("110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        c3804M43172.m11477("113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    c10154 = new C10154(null, c3804M43172.m11474());
                                    r1 = 0;
                                } else {
                                    str = this.f36554;
                                    if (str != null) {
                                        str2 = "If-None-Match";
                                    } else {
                                        if (date3 != null) {
                                            str = this.f36552;
                                        } else if (date != null) {
                                            str = this.f36553;
                                        } else {
                                            r1 = 0;
                                            c10154 = new C10154(c8743, null);
                                        }
                                        str2 = "If-Modified-Since";
                                    }
                                    C12454 c12454M261310 = c8743.m22619().m26138();
                                    AbstractC8037.f24775.mo21353(c12454M261310, str2, str);
                                    C9449 c9449M226110 = c8743.m22618();
                                    c9449M226110.m24278(c12454M261310.m30612());
                                    C10154 c10157 = new C10154(c9449M226110.m24274(), c18621);
                                    r1 = 0;
                                    c10154 = c10157;
                                }
                            } else {
                                str = this.f36554;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f36552;
                                    } else if (date != null) {
                                        str = this.f36553;
                                    } else {
                                        r1 = 0;
                                        c10154 = new C10154(c8743, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C12454 c12454M261311 = c8743.m22619().m26138();
                                AbstractC8037.f24775.mo21353(c12454M261311, str2, str);
                                C9449 c9449M226111 = c8743.m22618();
                                c9449M226111.m24278(c12454M261311.m30612());
                                C10154 c10158 = new C10154(c9449M226111.m24274(), c18621);
                                r1 = 0;
                                c10154 = c10158;
                            }
                        }
                        time = millis;
                        if (c11044M22617.m27427() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(c11044M22617.m27427()));
                        }
                        if (c11044M22617.m27428() != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(c11044M22617.m27428());
                        } else {
                            millis2 = millis;
                        }
                        if (!c11044M43176.m27426()) {
                            millis = TimeUnit.SECONDS.toMillis(c11044M22617.m27429());
                        }
                        if (c11044M43176.m27431()) {
                            j = millis2 + j3;
                            if (j < time + millis) {
                                c3804M43172 = c18621.m43172();
                                if (j >= time) {
                                    c3804M43172.m11477("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    c3804M43172.m11477("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                c10154 = new C10154(null, c3804M43172.m11474());
                                r1 = 0;
                            } else {
                                str = this.f36554;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.f36552;
                                    } else if (date != null) {
                                        str = this.f36553;
                                    } else {
                                        r1 = 0;
                                        c10154 = new C10154(c8743, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                C12454 c12454M261312 = c8743.m22619().m26138();
                                AbstractC8037.f24775.mo21353(c12454M261312, str2, str);
                                C9449 c9449M226112 = c8743.m22618();
                                c9449M226112.m24278(c12454M261312.m30612());
                                C10154 c10159 = new C10154(c9449M226112.m24274(), c18621);
                                r1 = 0;
                                c10154 = c10159;
                            }
                        } else {
                            str = this.f36554;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f36552;
                                } else if (date != null) {
                                    str = this.f36553;
                                } else {
                                    r1 = 0;
                                    c10154 = new C10154(c8743, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C12454 c12454M261313 = c8743.m22619().m26138();
                            AbstractC8037.f24775.mo21353(c12454M261313, str2, str);
                            C9449 c9449M226113 = c8743.m22618();
                            c9449M226113.m24278(c12454M261313.m30612());
                            C10154 c101510 = new C10154(c9449M226113.m24274(), c18621);
                            r1 = 0;
                            c10154 = c101510;
                        }
                    }
                    millis = 0;
                    time = millis;
                    if (c11044M22617.m27427() != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(c11044M22617.m27427()));
                    }
                    if (c11044M22617.m27428() != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(c11044M22617.m27428());
                    } else {
                        millis2 = millis;
                    }
                    if (!c11044M43176.m27426()) {
                        millis = TimeUnit.SECONDS.toMillis(c11044M22617.m27429());
                    }
                    if (c11044M43176.m27431()) {
                        j = millis2 + j3;
                        if (j < time + millis) {
                            c3804M43172 = c18621.m43172();
                            if (j >= time) {
                                c3804M43172.m11477("110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                c3804M43172.m11477("113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            c10154 = new C10154(null, c3804M43172.m11474());
                            r1 = 0;
                        } else {
                            str = this.f36554;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.f36552;
                                } else if (date != null) {
                                    str = this.f36553;
                                } else {
                                    r1 = 0;
                                    c10154 = new C10154(c8743, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            C12454 c12454M261314 = c8743.m22619().m26138();
                            AbstractC8037.f24775.mo21353(c12454M261314, str2, str);
                            C9449 c9449M226114 = c8743.m22618();
                            c9449M226114.m24278(c12454M261314.m30612());
                            C10154 c101511 = new C10154(c9449M226114.m24274(), c18621);
                            r1 = 0;
                            c10154 = c101511;
                        }
                    } else {
                        str = this.f36554;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f36552;
                            } else if (date != null) {
                                str = this.f36553;
                            } else {
                                r1 = 0;
                                c10154 = new C10154(c8743, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C12454 c12454M261315 = c8743.m22619().m26138();
                        AbstractC8037.f24775.mo21353(c12454M261315, str2, str);
                        C9449 c9449M226115 = c8743.m22618();
                        c9449M226115.m24278(c12454M261315.m30612());
                        C10154 c101512 = new C10154(c9449M226115.m24274(), c18621);
                        r1 = 0;
                        c10154 = c101512;
                    }
                } else {
                    time = TimeUnit.SECONDS.toMillis(c11044M43177.m27427());
                }
                millis = 0;
                if (c11044M22617.m27427() != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(c11044M22617.m27427()));
                }
                if (c11044M22617.m27428() != -1) {
                    millis2 = TimeUnit.SECONDS.toMillis(c11044M22617.m27428());
                } else {
                    millis2 = millis;
                }
                if (!c11044M43176.m27426()) {
                    millis = TimeUnit.SECONDS.toMillis(c11044M22617.m27429());
                }
                if (c11044M43176.m27431()) {
                    j = millis2 + j3;
                    if (j < time + millis) {
                        c3804M43172 = c18621.m43172();
                        if (j >= time) {
                            c3804M43172.m11477("110 HttpURLConnection \"Response is stale\"");
                        }
                        if (j3 > 86400000) {
                            c3804M43172.m11477("113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        c10154 = new C10154(null, c3804M43172.m11474());
                        r1 = 0;
                    } else {
                        str = this.f36554;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date3 != null) {
                                str = this.f36552;
                            } else if (date != null) {
                                str = this.f36553;
                            } else {
                                r1 = 0;
                                c10154 = new C10154(c8743, null);
                            }
                            str2 = "If-Modified-Since";
                        }
                        C12454 c12454M261316 = c8743.m22619().m26138();
                        AbstractC8037.f24775.mo21353(c12454M261316, str2, str);
                        C9449 c9449M226116 = c8743.m22618();
                        c9449M226116.m24278(c12454M261316.m30612());
                        C10154 c101513 = new C10154(c9449M226116.m24274(), c18621);
                        r1 = 0;
                        c10154 = c101513;
                    }
                } else {
                    str = this.f36554;
                    if (str != null) {
                        str2 = "If-None-Match";
                    } else {
                        if (date3 != null) {
                            str = this.f36552;
                        } else if (date != null) {
                            str = this.f36553;
                        } else {
                            r1 = 0;
                            c10154 = new C10154(c8743, null);
                        }
                        str2 = "If-Modified-Since";
                    }
                    C12454 c12454M261317 = c8743.m22619().m26138();
                    AbstractC8037.f24775.mo21353(c12454M261317, str2, str);
                    C9449 c9449M226117 = c8743.m22618();
                    c9449M226117.m24278(c12454M261317.m30612());
                    C10154 c101514 = new C10154(c9449M226117.m24274(), c18621);
                    r1 = 0;
                    c10154 = c101514;
                }
            }
        }
        return (c10154.f30536 == null || !c8743.m22617().m27430()) ? c10154 : new C10154(r1, r1);
    }
}
