package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0708d;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97BO */
/* JADX INFO: loaded from: classes.dex */
public final class C23884 extends AbstractC6843 {

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f75835 = 0;

    /* JADX INFO: renamed from: ֡ */
    public final C11676 f75836;

    /* JADX INFO: renamed from: ֨ */
    public final C23745 f75837;

    /* JADX INFO: renamed from: ۖ */
    public final C24395 f75838;

    /* JADX INFO: renamed from: ۗ */
    public final C11283 f75839;

    /* JADX INFO: renamed from: ۘ */
    public final C15166 f75840;

    /* JADX INFO: renamed from: ۙ */
    public final C5109 f75841;

    /* JADX INFO: renamed from: ۚ */
    public final C20393 f75842;

    /* JADX INFO: renamed from: ۠ */
    public final C19190 f75843;

    /* JADX INFO: renamed from: ۡ */
    public final C12997 f75844;

    /* JADX INFO: renamed from: ۫ */
    public final C4577 f75845;

    /* JADX INFO: renamed from: ۬ */
    public final C17316 f75846;

    /* JADX INFO: renamed from: ܶ */
    public final C18519 f75847;

    /* JADX INFO: renamed from: ܺ */
    public final C8973 f75848;

    /* JADX INFO: renamed from: ᩴ */
    public final C13017 f75849;

    /* JADX INFO: renamed from: ᩵ */
    public final C19722 f75850;

    /* JADX INFO: renamed from: ᩶ */
    public final C6450 f75851;

    /* JADX INFO: renamed from: ᩸ */
    public final C15836 f75852;

    /* JADX INFO: renamed from: ᩹ */
    public final C21203 f75853;

    @Override // p067l.AbstractC6843
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15673(C10196 c10196) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23884(int i, C9387 c9387, C15166 c15166) {
        super(i);
        String strM13298 = C5918.m13298();
        this.f75840 = c15166;
        C5109 c5109 = new C5109();
        this.f75841 = c5109;
        C24395 c24395 = new C24395(new C14496(this, c9387), strM13298);
        this.f75838 = c24395;
        C12997 c12997 = new C12997(c5109, c24395);
        this.f75844 = c12997;
        this.f75848 = new C8973(c5109, c24395, c12997);
        this.f75843 = new C19190();
        this.f75852 = new C15836();
        this.f75849 = new C13017();
        this.f75839 = new C11283();
        this.f75851 = new C6450();
        this.f75850 = new C19722();
        this.f75853 = new C21203(c5109);
        this.f75842 = new C20393(c5109, C10334.m23948());
        this.f75837 = new C23745(c5109, C12485.m28744());
        this.f75836 = new C11676();
        this.f75847 = new C18519();
        this.f75845 = new C4577();
        this.f75846 = new C17316();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:230:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x050b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0541  */
    /* JADX WARN: Code duplicated, block: B:251:0x0544  */
    @Override // p067l.AbstractC6843
    /* JADX INFO: renamed from: ֫ */
    public final C10196 mo15672(C17571 c17571) throws Throwable {
        boolean zEquals;
        C10196 c10196M10885;
        EnumC6173 enumC6173;
        String str;
        String str2;
        String str3;
        boolean z;
        C10196 c10196M10886;
        C23055 c23055M53791;
        EnumC3490 enumC3490;
        String strM16203;
        EnumC3490 enumC3491;
        String strM16204;
        C10196 c10196M15660;
        String str4;
        C15166 c15166 = this.f75840;
        if (c15166 != null) {
            c15166.f43274.m46352(c17571.m39991());
        }
        String strM39990 = c17571.m39990();
        EnumC6173 enumC6174 = EnumC6173.OPTIONS;
        String str5 = "/api/web-config";
        if (enumC6174.equals(c17571.m39993())) {
            zEquals = true;
        } else if ("/api/auth/status".equals(strM39990) || "/api/web-config".equals(strM39990)) {
            zEquals = EnumC6173.GET.equals(c17571.m39993());
        } else if ("/api".equals(strM39990) || strM39990.startsWith("/api/") || !(EnumC6173.GET.equals(c17571.m39993()) || EnumC6173.HEAD.equals(c17571.m39993()))) {
            zEquals = false;
        } else {
            zEquals = true;
        }
        C5109 c5109 = this.f75841;
        if (zEquals && C18658.m42478(c17571)) {
            EnumC3490 enumC3492 = EnumC3490.BAD_REQUEST;
            c5109.getClass();
            c10196M10885 = C5109.m10885(enumC3492, C7050.m16203(R.string.MT_Protector, new Object[0]));
            c10196M10885.m23772();
        } else {
            c10196M10885 = null;
        }
        if (c10196M10885 != null) {
            m52968(c10196M10885);
            return c10196M10885;
        }
        if (enumC6174.equals(c17571.m39993())) {
            EnumC3490 enumC3493 = EnumC3490.OK;
            c5109.getClass();
            C10196 c10196M15661 = AbstractC6843.m15660(enumC3493, "text/plain", "");
            m52968(c10196M15661);
            return c10196M15661;
        }
        boolean zEquals2 = "/api/auth/status".equals(strM39990);
        C8973 c8973 = this.f75848;
        if (!zEquals2) {
            if ("/api/auth/pair".equals(strM39990)) {
                c10196M10886 = c8973.m20725(c17571);
            } else {
                boolean z2 = ((!"/api".equals(strM39990) && !strM39990.startsWith("/api/")) || "/api/web-config".equals(strM39990) || "/api/auth/status".equals(strM39990) || "/api/auth/pair".equals(strM39990)) ? false : true;
                C17316 c17316 = this.f75846;
                if (z2) {
                    boolean zEquals3 = "/api/file-content".equals(strM39990);
                    str = "/api/auth/status";
                    str3 = "/api/auth/pair";
                    C24395 c24395 = this.f75838;
                    if (zEquals3) {
                        c23055M53791 = c24395.m53795(c17571);
                    } else {
                        c23055M53791 = "/api/file-archive".equals(strM39990) ? c24395.m53791(c17571) : c24395.m53788(c17571);
                    }
                    Object[] objArr = c23055M53791.f72454;
                    enumC6173 = enumC6174;
                    int i = c23055M53791.f72453;
                    EnumC3490 enumC3494 = c23055M53791.f72451;
                    String str6 = c23055M53791.f72452;
                    if (!c23055M53791.f72449) {
                        if (str6.isEmpty()) {
                            c5109.getClass();
                            c10196M15660 = C5109.m10885(enumC3494, C7050.m16203(i, objArr));
                        } else {
                            c5109.getClass();
                            c10196M15660 = AbstractC6843.m15660(enumC3494, "application/json", new JSONObject().add(C0708d.f2599O, C7050.m16203(i, objArr)).add("code", str6).toString());
                            c10196M15660.m23774("X-MT-Auth-Error-Code", str6);
                        }
                        if (C18658.m42482(c17571)) {
                            c10196M15660.m23772();
                        }
                        m52968(c10196M15660);
                        return c10196M15660;
                    }
                    C17018 c17018 = c23055M53791.f72450;
                    if ("/api/auth/session".equals(strM39990)) {
                        c10196M10886 = c8973.m20730(c17571, c17018);
                    } else if ("/api/auth/devices".equals(strM39990)) {
                        c10196M10886 = c8973.m20729(c17571, c17018);
                    } else if ("/api/auth/content-ticket".equals(strM39990)) {
                        c10196M10886 = c8973.m20728(c17571, c17018);
                    } else if ("/api/auth/archive-ticket".equals(strM39990)) {
                        c10196M10886 = c8973.m20726(c17571, c17018);
                    } else if ("/api/files".equals(strM39990)) {
                        c10196M10886 = this.f75843.m43679(c17571);
                    } else {
                        if ("/api/file-icon".equals(strM39990)) {
                            this.f75852.getClass();
                            String strM42479 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
                            if (strM42479 == null || strM42479.isEmpty()) {
                                enumC3491 = EnumC3490.BAD_REQUEST;
                                strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                            } else {
                                C25086 c25086M20795 = C8993.m20795(strM42479);
                                if (c25086M20795 == null) {
                                    enumC3491 = EnumC3490.NOT_FOUND;
                                    strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                                } else {
                                    byte[] bArr = c25086M20795.f80035;
                                    String str7 = c25086M20795.f80034;
                                    if ("damaged".equals(c25086M20795.f80036)) {
                                        c10196M10886 = AbstractC6843.m15660(EnumC3490.NO_CONTENT, "text/plain", "");
                                        c10196M10886.m23774("X-MT-Icon-State", "damaged");
                                    } else if (str7.equals(C18658.m42476(c17571, "if-none-match"))) {
                                        c10196M10886 = AbstractC6843.m15660(EnumC3490.NOT_MODIFIED, "text/plain", "");
                                        c10196M10886.m23774("ETag", str7);
                                    } else {
                                        c10196M10886 = AbstractC6843.m15659(EnumC3490.OK, "image/png", new ByteArrayInputStream(bArr), bArr.length);
                                        c10196M10886.m23774("ETag", str7);
                                    }
                                }
                            }
                            c10196M10886 = C5109.m10885(enumC3491, strM16204);
                        } else if ("/api/file-content".equals(strM39990)) {
                            c10196M10886 = this.f75849.m29834(c17571);
                        } else if ("/api/text-file".equals(strM39990)) {
                            c10196M10886 = this.f75839.m26229(c17571);
                        } else if ("/api/file-archive".equals(strM39990)) {
                            c10196M10886 = this.f75844.m29801(c17571, c17018);
                        } else if ("/api/file-rename".equals(strM39990)) {
                            this.f75851.getClass();
                            if (EnumC6173.POST.equals(c17571.m39993())) {
                                String strM424710 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
                                String strM424711 = C18658.m42479(c17571, "newName");
                                if (strM424710 == null || strM424710.isEmpty()) {
                                    enumC3490 = EnumC3490.BAD_REQUEST;
                                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                                } else if (strM424711 == null || strM424711.isEmpty()) {
                                    enumC3491 = EnumC3490.BAD_REQUEST;
                                    strM16204 = C7050.m16203(R.string.MT_Protector, "newName");
                                } else if (strM424711.contains("/") || strM424711.contains("\\")) {
                                    c10196M10886 = C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16224(R.string.MT_Protector));
                                } else {
                                    AbstractC17043 abstractC17043M42109 = C18524.m42109(AbstractC18422.m41972(strM424710), new String[0]);
                                    if (abstractC17043M42109.mo25094()) {
                                        final String strMo25505 = abstractC17043M42109.mo25505();
                                        final boolean zMo25087 = abstractC17043M42109.mo25087();
                                        try {
                                            C19210.m43749(abstractC17043M42109.m38669(), EnumC17868.MODIFY_DIRECTORY_LINKED);
                                            final AbstractC17043 abstractC17043M421010 = C18524.m42109(abstractC17043M42109.m38669(), strM424711);
                                            String strM42104 = C18524.m42104(abstractC17043M42109, abstractC17043M421010);
                                            if (strM42104 != null) {
                                                c10196M10886 = C5109.m10885(EnumC3490.CONFLICT, strM42104);
                                            } else if (abstractC17043M421010.mo25094()) {
                                                Runnable runnable = new Runnable() { // from class: l.۫֡ۢ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        EnumC18126.m41309(zMo25087).m41311(strMo25505);
                                                        C16114.m36689(abstractC17043M421010);
                                                        C17127.m38756();
                                                        C10987.m25375();
                                                    }
                                                };
                                                if (C12799.m29347()) {
                                                    runnable.run();
                                                } else {
                                                    C7050.m16212(runnable);
                                                }
                                                HashMap map = new HashMap();
                                                map.put("item", C22405.m50311(new C11450(abstractC17043M421010)));
                                                c10196M10886 = C5109.m10884(map);
                                            } else {
                                                enumC3491 = EnumC3490.NOT_FOUND;
                                                strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                                            }
                                        } catch (C3924 e) {
                                            enumC3490 = EnumC3490.CONFLICT;
                                            strM16203 = e.getMessage();
                                            c10196M10886 = C5109.m10885(enumC3490, strM16203);
                                        }
                                    } else {
                                        enumC3491 = EnumC3490.NOT_FOUND;
                                        strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                                    }
                                }
                                c10196M10886 = C5109.m10885(enumC3490, strM16203);
                            } else {
                                enumC3491 = EnumC3490.METHOD_NOT_ALLOWED;
                                strM16204 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                            }
                            c10196M10886 = C5109.m10885(enumC3491, strM16204);
                        } else if ("/api/file-create".equals(strM39990)) {
                            c10196M10886 = this.f75850.m44854(c17571);
                        } else if ("/api/file-property".equals(strM39990)) {
                            c10196M10886 = this.f75853.m47910(c17571);
                        } else if ("/api/file-transfer".equals(strM39990)) {
                            c10196M10886 = this.f75842.m46053(c17571);
                        } else {
                            boolean zEquals4 = "/api/file-upload-session".equals(strM39990);
                            C23745 c23745 = this.f75837;
                            if (zEquals4) {
                                c10196M10886 = c23745.m52790(c17571);
                            } else if ("/api/file-upload-prepare".equals(strM39990)) {
                                c10196M10886 = c23745.m52791(c17571);
                            } else if ("/api/file-upload-begin".equals(strM39990)) {
                                c10196M10886 = c23745.m52787(c17571);
                            } else if ("/api/file-upload-content".equals(strM39990)) {
                                c10196M10886 = c23745.m52789(c17571);
                            } else if ("/api/file-upload-complete".equals(strM39990)) {
                                c10196M10886 = c23745.m52788(c17571);
                            } else {
                                boolean zEquals5 = "/api/file-sort".equals(strM39990);
                                C11676 c11676 = this.f75836;
                                if (zEquals5) {
                                    c10196M10886 = c11676.m26843(c17571);
                                } else if ("/api/file-sort/folder".equals(strM39990)) {
                                    c10196M10886 = c11676.m26842(c17571);
                                } else {
                                    boolean zEquals6 = "/api/hidden-files".equals(strM39990);
                                    C18519 c18519 = this.f75847;
                                    if (zEquals6) {
                                        c10196M10886 = c18519.m42078(c17571);
                                    } else if ("/api/hidden-files/settings".equals(strM39990)) {
                                        c10196M10886 = c18519.m42077(c17571);
                                    } else if ("/api/hidden-files/hide-selected".equals(strM39990)) {
                                        c10196M10886 = c18519.m42075(c17571);
                                    } else if ("/api/hidden-files/list".equals(strM39990)) {
                                        c10196M10886 = c18519.m42076(c17571);
                                    } else {
                                        str2 = "/api/";
                                        if ("/api".equals(strM39990) || strM39990.startsWith(str2)) {
                                            EnumC3490 enumC3495 = EnumC3490.NOT_FOUND;
                                            c5109.getClass();
                                            c10196M10886 = C5109.m10885(enumC3495, C7050.m16203(R.string.MT_Protector, new Object[0]));
                                        } else {
                                            c10196M10886 = c17316.m39287(c17571);
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
                    enumC6173 = enumC6174;
                    str = "/api/auth/status";
                    str2 = "/api/";
                    str3 = "/api/auth/pair";
                    if ("/api/web-config".equals(strM39990)) {
                        this.f75845.getClass();
                        if (EnumC6173.GET.equals(c17571.m39993())) {
                            Locale localeM26404 = C11419.m26404(C7050.m16232());
                            HashMap map2 = new HashMap();
                            map2.put(C0655am.f2259N, C4577.m9653(localeM26404));
                            map2.put("initialPath", C5918.m13301().mo25505());
                            c10196M10886 = C5109.m10884(map2);
                        } else {
                            c10196M10886 = C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
                        }
                    } else if ("/api".equals(strM39990) || strM39990.startsWith(str2)) {
                        EnumC3490 enumC3496 = EnumC3490.NOT_FOUND;
                        z = false;
                        c5109.getClass();
                        c10196M10886 = C5109.m10885(enumC3496, C7050.m16203(R.string.MT_Protector, new Object[0]));
                    } else {
                        c10196M10886 = c17316.m39287(c17571);
                    }
                }
                z = false;
            }
            if (C18658.m42478(c17571)) {
                if (enumC6173.equals(c17571.m39993())) {
                    z = true;
                } else {
                    str4 = str3;
                    if ((str4.equals(strM39990) || !EnumC6173.POST.equals(c17571.m39993())) && (str.equals(strM39990) || str4.equals(strM39990) || str5.equals(strM39990) || (!"/api".equals(strM39990) && !strM39990.startsWith(str2)))) {
                        z = true;
                    }
                }
                if (z) {
                    c10196M10886.m23772();
                }
            }
            m52968(c10196M10886);
            return c10196M10886;
        }
        c10196M10886 = c8973.m20727(c17571);
        enumC6173 = enumC6174;
        str = "/api/auth/status";
        str2 = "/api/";
        str3 = "/api/auth/pair";
        z = false;
        if (C18658.m42478(c17571)) {
            if (enumC6173.equals(c17571.m39993())) {
                z = true;
            } else {
                str4 = str3;
                if (str4.equals(strM39990)) {
                    z = true;
                } else {
                    z = true;
                }
            }
            if (z) {
                c10196M10886.m23772();
            }
        }
        m52968(c10196M10886);
        return c10196M10886;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m52970() {
        this.f75844.m29802();
        this.f75838.m53796();
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m52972() {
        return this.f75838.m53794();
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m52969() {
        return this.f75838.m53798();
    }

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList m52971() {
        return this.f75838.m53783();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m52973(String str) {
        return this.f75838.m53789(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m52968(C10196 c10196) {
        c10196.m23774("Access-Control-Allow-Origin", "*");
        c10196.m23774("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, OPTIONS");
        c10196.m23774("Access-Control-Allow-Headers", "Content-Type, If-None-Match, Range, X-MT-Auth-Device, X-MT-Auth-Timestamp, X-MT-Auth-Nonce, X-MT-Auth-Content-SHA256, X-MT-Auth-Signature, X-MT-Text-Parameters-Token");
        c10196.m23774("Access-Control-Expose-Headers", "ETag, X-MT-Icon-State, Accept-Ranges, Content-Disposition, Content-Range, X-MT-Preview-Time, Content-Length, X-MT-Auth-Error-Code, Date");
    }
}
