package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97BO */
/* JADX INFO: loaded from: classes.dex */
public final class C22639 extends AbstractC4708 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73109 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9793 f73110;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22492 f73111;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23176 f73112;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9380 f73113;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13466 f73114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2884 f73115;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18965 f73116;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17700 f73117;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11183 f73118;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2324 f73119;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15728 f73120;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16994 f73121;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6949 f73122;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11204 f73123;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C18259 f73124;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4295 f73125;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14171 f73126;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19818 f73127;

    @Override // l.AbstractC4708
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13797(C8236 c8236) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22639(int i, C7385 c7385, C13466 c13466) {
        super(i);
        String strM11346 = C3735.m11346();
        this.f73114 = c13466;
        C2884 c2884 = new C2884();
        this.f73115 = c2884;
        C23176 c23176 = new C23176(new C12761(this, c7385), strM11346);
        this.f73112 = c23176;
        C11183 c11183 = new C11183(c2884, c23176);
        this.f73118 = c11183;
        this.f73122 = new C6949(c2884, c23176, c11183);
        this.f73117 = new C17700();
        this.f73126 = new C14171();
        this.f73123 = new C11204();
        this.f73113 = new C9380();
        this.f73125 = new C4295();
        this.f73124 = new C18259();
        this.f73127 = new C19818(c2884);
        this.f73116 = new C18965(c2884, C8381.m21977());
        this.f73111 = new C22492(c2884, C10645.m26705());
        this.f73110 = new C9793();
        this.f73121 = new C16994();
        this.f73119 = new C2324();
        this.f73120 = new C15728();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:230:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x050b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0541  */
    /* JADX WARN: Code duplicated, block: B:251:0x0544  */
    @Override // l.AbstractC4708
    /* JADX INFO: renamed from: ֫ */
    public final C8236 mo13796(C15996 c15996) throws Throwable {
        boolean zEquals;
        C8236 c8236M8818;
        EnumC4003 enumC4003;
        String str;
        String str2;
        String str3;
        boolean z;
        C8236 c8236M8819;
        C21766 c21766M51395;
        EnumC1180 enumC1180;
        String strM14306;
        EnumC1180 enumC1181;
        String strM14307;
        C8236 c8236M13784;
        String str4;
        C13466 c13466 = this.f73114;
        if (c13466 != null) {
            c13466.f40204.m44058(c15996.m37805());
        }
        String strM37804 = c15996.m37804();
        EnumC4003 enumC4004 = EnumC4003.OPTIONS;
        String str5 = "/api/web-config";
        if (enumC4004.equals(c15996.m37807())) {
            zEquals = true;
        } else if ("/api/auth/status".equals(strM37804) || "/api/web-config".equals(strM37804)) {
            zEquals = EnumC4003.GET.equals(c15996.m37807());
        } else if ("/api".equals(strM37804) || strM37804.startsWith("/api/") || !(EnumC4003.GET.equals(c15996.m37807()) || EnumC4003.HEAD.equals(c15996.m37807()))) {
            zEquals = false;
        } else {
            zEquals = true;
        }
        C2884 c2884 = this.f73115;
        if (zEquals && C17140.m40233(c15996)) {
            EnumC1180 enumC1182 = EnumC1180.BAD_REQUEST;
            c2884.getClass();
            c8236M8818 = C2884.m8818(enumC1182, C4925.m14306(R.string.MT_Protector, new Object[0]));
            c8236M8818.m21803();
        } else {
            c8236M8818 = null;
        }
        if (c8236M8818 != null) {
            m50642(c8236M8818);
            return c8236M8818;
        }
        if (enumC4004.equals(c15996.m37807())) {
            EnumC1180 enumC1183 = EnumC1180.OK;
            c2884.getClass();
            C8236 c8236M13785 = AbstractC4708.m13784(enumC1183, "text/plain", "");
            m50642(c8236M13785);
            return c8236M13785;
        }
        boolean zEquals2 = "/api/auth/status".equals(strM37804);
        C6949 c6949 = this.f73122;
        if (!zEquals2) {
            if ("/api/auth/pair".equals(strM37804)) {
                c8236M8819 = c6949.m18771(c15996);
            } else {
                boolean z2 = ((!"/api".equals(strM37804) && !strM37804.startsWith("/api/")) || "/api/web-config".equals(strM37804) || "/api/auth/status".equals(strM37804) || "/api/auth/pair".equals(strM37804)) ? false : true;
                C15728 c15728 = this.f73120;
                if (z2) {
                    boolean zEquals3 = "/api/file-content".equals(strM37804);
                    str = "/api/auth/status";
                    str3 = "/api/auth/pair";
                    C23176 c23176 = this.f73112;
                    if (zEquals3) {
                        c21766M51395 = c23176.m51399(c15996);
                    } else {
                        c21766M51395 = "/api/file-archive".equals(strM37804) ? c23176.m51395(c15996) : c23176.m51392(c15996);
                    }
                    Object[] objArr = c21766M51395.f69746;
                    enumC4003 = enumC4004;
                    int i = c21766M51395.f69745;
                    EnumC1180 enumC1184 = c21766M51395.f69743;
                    String str6 = c21766M51395.f69744;
                    if (!c21766M51395.f69741) {
                        if (str6.isEmpty()) {
                            c2884.getClass();
                            c8236M13784 = C2884.m8818(enumC1184, C4925.m14306(i, objArr));
                        } else {
                            c2884.getClass();
                            c8236M13784 = AbstractC4708.m13784(enumC1184, "application/json", new JSONObject().add(d.O, C4925.m14306(i, objArr)).add("code", str6).toString());
                            c8236M13784.m21805("X-MT-Auth-Error-Code", str6);
                        }
                        if (C17140.m40237(c15996)) {
                            c8236M13784.m21803();
                        }
                        m50642(c8236M13784);
                        return c8236M13784;
                    }
                    C15414 c15414 = c21766M51395.f69742;
                    if ("/api/auth/session".equals(strM37804)) {
                        c8236M8819 = c6949.m18776(c15996, c15414);
                    } else if ("/api/auth/devices".equals(strM37804)) {
                        c8236M8819 = c6949.m18775(c15996, c15414);
                    } else if ("/api/auth/content-ticket".equals(strM37804)) {
                        c8236M8819 = c6949.m18774(c15996, c15414);
                    } else if ("/api/auth/archive-ticket".equals(strM37804)) {
                        c8236M8819 = c6949.m18772(c15996, c15414);
                    } else if ("/api/files".equals(strM37804)) {
                        c8236M8819 = this.f73117.m41433(c15996);
                    } else {
                        if ("/api/file-icon".equals(strM37804)) {
                            this.f73126.getClass();
                            String strM40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
                            if (strM40234 == null || strM40234.isEmpty()) {
                                enumC1181 = EnumC1180.BAD_REQUEST;
                                strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                            } else {
                                C23903 c23903M18841 = C6970.m18841(strM40234);
                                if (c23903M18841 == null) {
                                    enumC1181 = EnumC1180.NOT_FOUND;
                                    strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                                } else {
                                    byte[] bArr = c23903M18841.f77284;
                                    String str7 = c23903M18841.f77283;
                                    if ("damaged".equals(c23903M18841.f77285)) {
                                        c8236M8819 = AbstractC4708.m13784(EnumC1180.NO_CONTENT, "text/plain", "");
                                        c8236M8819.m21805("X-MT-Icon-State", "damaged");
                                    } else if (str7.equals(C17140.m40231(c15996, "if-none-match"))) {
                                        c8236M8819 = AbstractC4708.m13784(EnumC1180.NOT_MODIFIED, "text/plain", "");
                                        c8236M8819.m21805("ETag", str7);
                                    } else {
                                        c8236M8819 = AbstractC4708.m13783(EnumC1180.OK, "image/png", new ByteArrayInputStream(bArr), bArr.length);
                                        c8236M8819.m21805("ETag", str7);
                                    }
                                }
                            }
                            c8236M8819 = C2884.m8818(enumC1181, strM14307);
                        } else if ("/api/file-content".equals(strM37804)) {
                            c8236M8819 = this.f73123.m27772(c15996);
                        } else if ("/api/text-file".equals(strM37804)) {
                            c8236M8819 = this.f73113.m24219(c15996);
                        } else if ("/api/file-archive".equals(strM37804)) {
                            c8236M8819 = this.f73118.m27739(c15996, c15414);
                        } else if ("/api/file-rename".equals(strM37804)) {
                            this.f73125.getClass();
                            if (EnumC4003.POST.equals(c15996.m37807())) {
                                String strM40235 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
                                String strM40236 = C17140.m40234(c15996, "newName");
                                if (strM40235 == null || strM40235.isEmpty()) {
                                    enumC1180 = EnumC1180.BAD_REQUEST;
                                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                                } else if (strM40236 == null || strM40236.isEmpty()) {
                                    enumC1181 = EnumC1180.BAD_REQUEST;
                                    strM14307 = C4925.m14306(R.string.MT_Protector, "newName");
                                } else if (strM40236.contains("/") || strM40236.contains("\\")) {
                                    c8236M8819 = C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14327(R.string.MT_Protector));
                                } else {
                                    AbstractC15440 abstractC15440M39866 = C16999.m39866(AbstractC16891.m39731(strM40235), new String[0]);
                                    if (abstractC15440M39866.mo23120()) {
                                        final String strMo23554 = abstractC15440M39866.mo23554();
                                        final boolean zMo23113 = abstractC15440M39866.mo23113();
                                        try {
                                            C17721.m41503(abstractC15440M39866.m36511(), EnumC16309.MODIFY_DIRECTORY_LINKED);
                                            final AbstractC15440 abstractC15440M39867 = C16999.m39866(abstractC15440M39866.m36511(), strM40236);
                                            String strM39861 = C16999.m39861(abstractC15440M39866, abstractC15440M39867);
                                            if (strM39861 != null) {
                                                c8236M8819 = C2884.m8818(EnumC1180.CONFLICT, strM39861);
                                            } else if (abstractC15440M39867.mo23120()) {
                                                Runnable runnable = new Runnable() { // from class: l.۫֡ۢ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        EnumC16580.m39083(zMo23113).m39085(strMo23554);
                                                        C14463.m34555(abstractC15440M39867);
                                                        C15528.m36596();
                                                        C9068.m23429();
                                                    }
                                                };
                                                if (C10975.m27285()) {
                                                    runnable.run();
                                                } else {
                                                    C4925.m14315(runnable);
                                                }
                                                HashMap map = new HashMap();
                                                map.put("item", C21082.m47981(new C9555(abstractC15440M39867)));
                                                c8236M8819 = C2884.m8817(map);
                                            } else {
                                                enumC1181 = EnumC1180.NOT_FOUND;
                                                strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                                            }
                                        } catch (C1637 e) {
                                            enumC1180 = EnumC1180.CONFLICT;
                                            strM14306 = e.getMessage();
                                            c8236M8819 = C2884.m8818(enumC1180, strM14306);
                                        }
                                    } else {
                                        enumC1181 = EnumC1180.NOT_FOUND;
                                        strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                                    }
                                }
                                c8236M8819 = C2884.m8818(enumC1180, strM14306);
                            } else {
                                enumC1181 = EnumC1180.METHOD_NOT_ALLOWED;
                                strM14307 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                            }
                            c8236M8819 = C2884.m8818(enumC1181, strM14307);
                        } else if ("/api/file-create".equals(strM37804)) {
                            c8236M8819 = this.f73124.m42595(c15996);
                        } else if ("/api/file-property".equals(strM37804)) {
                            c8236M8819 = this.f73127.m45599(c15996);
                        } else if ("/api/file-transfer".equals(strM37804)) {
                            c8236M8819 = this.f73116.m43786(c15996);
                        } else {
                            boolean zEquals4 = "/api/file-upload-session".equals(strM37804);
                            C22492 c22492 = this.f73111;
                            if (zEquals4) {
                                c8236M8819 = c22492.m50449(c15996);
                            } else if ("/api/file-upload-prepare".equals(strM37804)) {
                                c8236M8819 = c22492.m50450(c15996);
                            } else if ("/api/file-upload-begin".equals(strM37804)) {
                                c8236M8819 = c22492.m50446(c15996);
                            } else if ("/api/file-upload-content".equals(strM37804)) {
                                c8236M8819 = c22492.m50448(c15996);
                            } else if ("/api/file-upload-complete".equals(strM37804)) {
                                c8236M8819 = c22492.m50447(c15996);
                            } else {
                                boolean zEquals5 = "/api/file-sort".equals(strM37804);
                                C9793 c9793 = this.f73110;
                                if (zEquals5) {
                                    c8236M8819 = c9793.m24828(c15996);
                                } else if ("/api/file-sort/folder".equals(strM37804)) {
                                    c8236M8819 = c9793.m24827(c15996);
                                } else {
                                    boolean zEquals6 = "/api/hidden-files".equals(strM37804);
                                    C16994 c16994 = this.f73121;
                                    if (zEquals6) {
                                        c8236M8819 = c16994.m39835(c15996);
                                    } else if ("/api/hidden-files/settings".equals(strM37804)) {
                                        c8236M8819 = c16994.m39834(c15996);
                                    } else if ("/api/hidden-files/hide-selected".equals(strM37804)) {
                                        c8236M8819 = c16994.m39832(c15996);
                                    } else if ("/api/hidden-files/list".equals(strM37804)) {
                                        c8236M8819 = c16994.m39833(c15996);
                                    } else {
                                        str2 = "/api/";
                                        if ("/api".equals(strM37804) || strM37804.startsWith(str2)) {
                                            EnumC1180 enumC1185 = EnumC1180.NOT_FOUND;
                                            c2884.getClass();
                                            c8236M8819 = C2884.m8818(enumC1185, C4925.m14306(R.string.MT_Protector, new Object[0]));
                                        } else {
                                            c8236M8819 = c15728.m37118(c15996);
                                        }
                                    }
                                }
                            }
                        }
                        str5 = "/api/web-config";
                    }
                    str2 = "/api/";
                    str5 = "/api/web-config";
                } else {
                    enumC4003 = enumC4004;
                    str = "/api/auth/status";
                    str2 = "/api/";
                    str3 = "/api/auth/pair";
                    if ("/api/web-config".equals(strM37804)) {
                        this.f73119.getClass();
                        if (EnumC4003.GET.equals(c15996.m37807())) {
                            Locale localeM24394 = C9523.m24394(C4925.m14335());
                            HashMap map2 = new HashMap();
                            map2.put(am.N, C2324.m7583(localeM24394));
                            map2.put("initialPath", C3735.m11349().mo23554());
                            c8236M8819 = C2884.m8817(map2);
                        } else {
                            c8236M8819 = C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
                        }
                    } else if ("/api".equals(strM37804) || strM37804.startsWith(str2)) {
                        EnumC1180 enumC1186 = EnumC1180.NOT_FOUND;
                        z = false;
                        c2884.getClass();
                        c8236M8819 = C2884.m8818(enumC1186, C4925.m14306(R.string.MT_Protector, new Object[0]));
                    } else {
                        c8236M8819 = c15728.m37118(c15996);
                    }
                }
                z = false;
            }
            if (C17140.m40233(c15996)) {
                if (enumC4003.equals(c15996.m37807())) {
                    z = true;
                } else {
                    str4 = str3;
                    if ((str4.equals(strM37804) || !EnumC4003.POST.equals(c15996.m37807())) && (str.equals(strM37804) || str4.equals(strM37804) || str5.equals(strM37804) || (!"/api".equals(strM37804) && !strM37804.startsWith(str2)))) {
                        z = true;
                    }
                }
                if (z) {
                    c8236M8819.m21803();
                }
            }
            m50642(c8236M8819);
            return c8236M8819;
        }
        c8236M8819 = c6949.m18773(c15996);
        enumC4003 = enumC4004;
        str = "/api/auth/status";
        str2 = "/api/";
        str3 = "/api/auth/pair";
        z = false;
        if (C17140.m40233(c15996)) {
            if (enumC4003.equals(c15996.m37807())) {
                z = true;
            } else {
                str4 = str3;
                if (str4.equals(strM37804)) {
                    z = true;
                } else {
                    z = true;
                }
            }
            if (z) {
                c8236M8819.m21803();
            }
        }
        m50642(c8236M8819);
        return c8236M8819;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m50644() {
        this.f73118.m27740();
        this.f73112.m51400();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m50646() {
        return this.f73112.m51398();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m50643() {
        return this.f73112.m51402();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList m50645() {
        return this.f73112.m51387();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50647(String str) {
        return this.f73112.m51393(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50642(C8236 c8236) {
        c8236.m21805("Access-Control-Allow-Origin", "*");
        c8236.m21805("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, OPTIONS");
        c8236.m21805("Access-Control-Allow-Headers", "Content-Type, If-None-Match, Range, X-MT-Auth-Device, X-MT-Auth-Timestamp, X-MT-Auth-Nonce, X-MT-Auth-Content-SHA256, X-MT-Auth-Signature, X-MT-Text-Parameters-Token");
        c8236.m21805("Access-Control-Expose-Headers", "ETag, X-MT-Icon-State, Accept-Ranges, Content-Disposition, Content-Range, X-MT-Preview-Time, Content-Length, X-MT-Auth-Error-Code, Date");
    }
}
