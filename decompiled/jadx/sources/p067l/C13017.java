package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۧ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes3.dex */
public final class C13017 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC7514 f36622 = new C9643(206, "Partial Content");

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC7514 f36623 = new C9643(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m29834(C17571 c17571) {
        C4299 c4299M8733;
        int iIndexOf;
        EnumC6173 enumC6173M39993 = c17571.m39993();
        if (!EnumC6173.GET.equals(enumC6173M39993) && !EnumC6173.HEAD.equals(enumC6173M39993)) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        String strM42479 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
        if (TextUtils.isEmpty(strM42479)) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        String strM424710 = C18658.m42479(c17571, "disposition");
        if (!"inline".equals(strM424710) && !"attachment".equals(strM424710)) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "disposition"));
        }
        C11450 c11450M20791 = C8993.m20791(strM42479);
        if (c11450M20791 == null || !c11450M20791.mo26445().mo25094()) {
            return C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        if (c11450M20791.isDirectory()) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        long jMax = Math.max(c11450M20791.getSize(), 0L);
        String strM42476 = C18658.m42476(c17571, "range");
        if (TextUtils.isEmpty(strM42476)) {
            c4299M8733 = C4299.m8734(jMax);
        } else {
            String strTrim = strM42476.trim();
            if (strTrim.startsWith("bytes=")) {
                String strTrim2 = strTrim.substring(6).trim();
                if (TextUtils.isEmpty(strTrim2) || strTrim2.contains(",") || (iIndexOf = strTrim2.indexOf(45)) < 0) {
                    c4299M8733 = C4299.m8733();
                } else {
                    String strTrim3 = strTrim2.substring(0, iIndexOf).trim();
                    String strTrim4 = strTrim2.substring(iIndexOf + 1).trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        try {
                            long j = Long.parseLong(strTrim3);
                            if (j < 0 || j >= jMax) {
                                c4299M8733 = C4299.m8733();
                            } else {
                                long j2 = jMax - 1;
                                if (TextUtils.isEmpty(strTrim4)) {
                                    c4299M8733 = C4299.m8735(j, j2);
                                } else {
                                    try {
                                        long j3 = Long.parseLong(strTrim4);
                                        if (j3 < j) {
                                            c4299M8733 = C4299.m8733();
                                        } else {
                                            if (j3 < jMax) {
                                                j2 = j3;
                                            }
                                            c4299M8733 = C4299.m8735(j, j2);
                                        }
                                    } catch (NumberFormatException unused) {
                                        c4299M8733 = C4299.m8733();
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            c4299M8733 = C4299.m8733();
                        }
                    } else if (TextUtils.isEmpty(strTrim4)) {
                        c4299M8733 = C4299.m8733();
                    } else {
                        try {
                            long j4 = Long.parseLong(strTrim4);
                            c4299M8733 = (j4 <= 0 || jMax <= 0) ? C4299.m8733() : C4299.m8735(Math.max(jMax - j4, 0L), jMax - 1);
                        } catch (NumberFormatException unused3) {
                            c4299M8733 = C4299.m8733();
                        }
                    }
                }
            } else {
                c4299M8733 = C4299.m8733();
            }
        }
        boolean z = c4299M8733.f9553;
        long j5 = c4299M8733.f9552;
        long j6 = c4299M8733.f9554;
        if (!c4299M8733.f9555) {
            C10196 c10196M15660 = AbstractC6843.m15660(f36623, "text/plain", "");
            c10196M15660.m23774("Accept-Ranges", "bytes");
            c10196M15660.m23774("Content-Range", "bytes */" + jMax);
            c10196M15660.m23775(enumC6173M39993);
            return c10196M15660;
        }
        long j7 = (j5 - j6) + 1;
        try {
            EnumC6173 enumC6173 = EnumC6173.HEAD;
            InputStream byteArrayInputStream = enumC6173.equals(enumC6173M39993) ? new ByteArrayInputStream(new byte[0]) : new C15677(j7, m29832(c11450M20791, j6));
            String strMo39137 = TextUtils.isEmpty(c11450M20791.mo39137()) ? "application/octet-stream" : c11450M20791.mo39137();
            C10196 c10196M15659 = AbstractC6843.m15659(z ? f36622 : EnumC3490.OK, strMo39137, byteArrayInputStream, j7);
            c10196M15659.m23775(enumC6173M39993);
            c10196M15659.m23774("Accept-Ranges", "bytes");
            c10196M15659.m23774("Referrer-Policy", "no-referrer");
            c10196M15659.m23774("Content-Disposition", m29833(c11450M20791.getName(), strM424710));
            if (enumC6173.equals(enumC6173M39993) && strMo39137.startsWith("image/")) {
                long time = c11450M20791.getTime();
                try {
                    InputStream inputStreamMo9707 = C4744.f10749.mo9707((AbstractActivityC5549) null, c11450M20791);
                    if (inputStreamMo9707 != null) {
                        try {
                            Long lM42896 = C18833.m42896(new C9596(inputStreamMo9707, 0));
                            if (lM42896 != null) {
                                time = lM42896.longValue();
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo9707.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (inputStreamMo9707 != null) {
                        inputStreamMo9707.close();
                    }
                } catch (IOException | RuntimeException unused4) {
                }
                c10196M15659.m23774("X-MT-Preview-Time", C18794.m42827(time));
            }
            if (z) {
                StringBuilder sbM33191 = C14536.m33191("bytes ", "-", j6);
                sbM33191.append(j5);
                sbM33191.append("/");
                sbM33191.append(jMax);
                c10196M15659.m23774("Content-Range", sbM33191.toString());
            }
            return c10196M15659;
        } catch (IOException unused5) {
            return C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m29832(C11450 c11450, long j) throws IOException {
        InputStream inputStreamMo9707 = C4744.f10749.mo9707((AbstractActivityC5549) null, c11450);
        if (inputStreamMo9707 == null) {
            throw new IOException("file stream is not available");
        }
        try {
            byte[] bArr = new byte[8192];
            while (j > 0) {
                long jSkip = inputStreamMo9707.skip(j);
                if (jSkip > 0) {
                    j -= jSkip;
                } else {
                    int i = inputStreamMo9707.read(bArr, 0, (int) Math.min(8192, j));
                    if (i == -1) {
                        throw new IOException("unexpected eof");
                    }
                    j -= (long) i;
                }
            }
            return inputStreamMo9707;
        } catch (IOException e) {
            try {
                inputStreamMo9707.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m29833(String str, String str2) {
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
            string = C14523.encode(str, StandardCharsets.UTF_8.name()).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        } catch (Exception unused) {
            string = sb.toString();
        }
        return str2 + "; filename=\"" + ((Object) sb) + "\"; filename*=UTF-8''" + string;
    }
}
