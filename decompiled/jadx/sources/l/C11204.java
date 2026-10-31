package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۧ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11204 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5414 f33623 = new C7654(206, "Partial Content");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5414 f33624 = new C7654(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m27772(C15996 c15996) {
        C2031 c2031M6607;
        int iIndexOf;
        EnumC4003 enumC4003M37807 = c15996.m37807();
        if (!EnumC4003.GET.equals(enumC4003M37807) && !EnumC4003.HEAD.equals(enumC4003M37807)) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        String strM40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
        if (TextUtils.isEmpty(strM40234)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        String strM40235 = C17140.m40234(c15996, "disposition");
        if (!"inline".equals(strM40235) && !"attachment".equals(strM40235)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "disposition"));
        }
        C9555 c9555M18837 = C6970.m18837(strM40234);
        if (c9555M18837 == null || !c9555M18837.mo24433().mo23120()) {
            return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        if (c9555M18837.isDirectory()) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        long jMax = Math.max(c9555M18837.getSize(), 0L);
        String strM40231 = C17140.m40231(c15996, "range");
        if (TextUtils.isEmpty(strM40231)) {
            c2031M6607 = C2031.m6608(jMax);
        } else {
            String strTrim = strM40231.trim();
            if (strTrim.startsWith("bytes=")) {
                String strTrim2 = strTrim.substring(6).trim();
                if (TextUtils.isEmpty(strTrim2) || strTrim2.contains(",") || (iIndexOf = strTrim2.indexOf(45)) < 0) {
                    c2031M6607 = C2031.m6607();
                } else {
                    String strTrim3 = strTrim2.substring(0, iIndexOf).trim();
                    String strTrim4 = strTrim2.substring(iIndexOf + 1).trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        try {
                            long j = Long.parseLong(strTrim3);
                            if (j < 0 || j >= jMax) {
                                c2031M6607 = C2031.m6607();
                            } else {
                                long j2 = jMax - 1;
                                if (TextUtils.isEmpty(strTrim4)) {
                                    c2031M6607 = C2031.m6609(j, j2);
                                } else {
                                    try {
                                        long j3 = Long.parseLong(strTrim4);
                                        if (j3 < j) {
                                            c2031M6607 = C2031.m6607();
                                        } else {
                                            if (j3 < jMax) {
                                                j2 = j3;
                                            }
                                            c2031M6607 = C2031.m6609(j, j2);
                                        }
                                    } catch (NumberFormatException unused) {
                                        c2031M6607 = C2031.m6607();
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            c2031M6607 = C2031.m6607();
                        }
                    } else if (TextUtils.isEmpty(strTrim4)) {
                        c2031M6607 = C2031.m6607();
                    } else {
                        try {
                            long j4 = Long.parseLong(strTrim4);
                            c2031M6607 = (j4 <= 0 || jMax <= 0) ? C2031.m6607() : C2031.m6609(Math.max(jMax - j4, 0L), jMax - 1);
                        } catch (NumberFormatException unused3) {
                            c2031M6607 = C2031.m6607();
                        }
                    }
                }
            } else {
                c2031M6607 = C2031.m6607();
            }
        }
        boolean z = c2031M6607.f6769;
        long j5 = c2031M6607.f6768;
        long j6 = c2031M6607.f6770;
        if (!c2031M6607.f6771) {
            C8236 c8236M13784 = AbstractC4708.m13784(f33624, "text/plain", "");
            c8236M13784.m21805("Accept-Ranges", "bytes");
            c8236M13784.m21805("Content-Range", "bytes */" + jMax);
            c8236M13784.m21806(enumC4003M37807);
            return c8236M13784;
        }
        long j7 = (j5 - j6) + 1;
        try {
            EnumC4003 enumC4003 = EnumC4003.HEAD;
            InputStream byteArrayInputStream = enumC4003.equals(enumC4003M37807) ? new ByteArrayInputStream(new byte[0]) : new C14003(j7, m27770(c9555M18837, j6));
            String strMo36971 = TextUtils.isEmpty(c9555M18837.mo36971()) ? "application/octet-stream" : c9555M18837.mo36971();
            C8236 c8236M13783 = AbstractC4708.m13783(z ? f33623 : EnumC1180.OK, strMo36971, byteArrayInputStream, j7);
            c8236M13783.m21806(enumC4003M37807);
            c8236M13783.m21805("Accept-Ranges", "bytes");
            c8236M13783.m21805("Referrer-Policy", "no-referrer");
            c8236M13783.m21805("Content-Disposition", m27771(c9555M18837.getName(), strM40235));
            if (enumC4003.equals(enumC4003M37807) && strMo36971.startsWith("image/")) {
                long time = c9555M18837.getTime();
                try {
                    InputStream inputStreamMo7636 = C2499.f7958.mo7636((AbstractActivityC3346) null, c9555M18837);
                    if (inputStreamMo7636 != null) {
                        try {
                            Long lM40645 = C17324.m40645(new C7605(inputStreamMo7636, 0));
                            if (lM40645 != null) {
                                time = lM40645.longValue();
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo7636.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (inputStreamMo7636 != null) {
                        inputStreamMo7636.close();
                    }
                } catch (IOException | RuntimeException unused4) {
                }
                c8236M13783.m21805("X-MT-Preview-Time", C17283.m40576(time));
            }
            if (z) {
                StringBuilder sbM31106 = C12803.m31106("bytes ", "-", j6);
                sbM31106.append(j5);
                sbM31106.append("/");
                sbM31106.append(jMax);
                c8236M13783.m21805("Content-Range", sbM31106.toString());
            }
            return c8236M13783;
        } catch (IOException unused5) {
            return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m27770(C9555 c9555, long j) throws IOException {
        InputStream inputStreamMo7636 = C2499.f7958.mo7636((AbstractActivityC3346) null, c9555);
        if (inputStreamMo7636 == null) {
            throw new IOException("file stream is not available");
        }
        try {
            byte[] bArr = new byte[8192];
            while (j > 0) {
                long jSkip = inputStreamMo7636.skip(j);
                if (jSkip > 0) {
                    j -= jSkip;
                } else {
                    int i = inputStreamMo7636.read(bArr, 0, (int) Math.min(8192, j));
                    if (i == -1) {
                        throw new IOException("unexpected eof");
                    }
                    j -= (long) i;
                }
            }
            return inputStreamMo7636;
        } catch (IOException e) {
            try {
                inputStreamMo7636.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27771(String str, String str2) {
        String string;
        if (TextUtils.isEmpty(str)) {
            str = "download";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || cCharAt == '\"' || cCharAt == '\\') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        try {
            string = C12789.encode(str, StandardCharsets.UTF_8.name()).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        } catch (Exception unused) {
            string = sb.toString();
        }
        return str2 + "; filename=\"" + ((Object) sb) + "\"; filename*=UTF-8''" + string;
    }
}
