package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܿۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7BH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17140 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m40234(InterfaceC2592 interfaceC2592, String str) {
        List list = (List) ((HashMap) ((C15996) interfaceC2592).m37813()).get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40231(InterfaceC2592 interfaceC2592, String str) {
        Map mapM37811 = ((C15996) interfaceC2592).m37811();
        if (mapM37811 == null) {
            return null;
        }
        HashMap map = (HashMap) mapM37811;
        if (map.isEmpty()) {
            return null;
        }
        String str2 = (String) map.get(str);
        return str2 != null ? str2 : (String) map.get(str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m40237(C15996 c15996) {
        EnumC4003 enumC4003M37807 = c15996.m37807();
        if (EnumC4003.POST.equals(enumC4003M37807) || EnumC4003.PUT.equals(enumC4003M37807)) {
            return true;
        }
        return m40233(c15996);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40233(C15996 c15996) {
        if (!m40235(c15996)) {
            String strM40231 = m40231(c15996, "content-length");
            if (strM40231 != null) {
                String strTrim = strM40231.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    for (int i = 0; i < strTrim.length(); i++) {
                        char cCharAt = strTrim.charAt(i);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                        }
                    }
                    try {
                        if (Long.parseLong(strTrim) > 0) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m40235(C15996 c15996) {
        String strM40231 = m40231(c15996, "transfer-encoding");
        return (TextUtils.isEmpty(strM40231) || TextUtils.isEmpty(strM40231.trim())) ? false : true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m40236(C15996 c15996) throws C10791 {
        String strM40231 = m40231(c15996, "content-length");
        if (TextUtils.isEmpty(strM40231)) {
            throw new C10791(R.string.MT_Protector, new Object[0]);
        }
        String strTrim = strM40231.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C10791(R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C10791(R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C10791(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m40238(C15996 c15996) throws IOException {
        int i;
        String strM40231 = m40231(c15996, "content-length");
        if (TextUtils.isEmpty(strM40231)) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(strM40231);
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, 0));
        byte[] bArr = new byte[1024];
        InputStream inputStreamM37810 = c15996.m37810();
        if (inputStreamM37810 == null) {
            return "";
        }
        while (i != 0) {
            int i2 = inputStreamM37810.read(bArr, 0, i > 0 ? Math.min(1024, i) : 1024);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            if (i > 0) {
                i -= i2;
            }
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m40239(C15996 c15996) {
        if (c15996.m37808()) {
            return c15996.m37809();
        }
        try {
            String strM40238 = m40238(c15996);
            if (!strM40238.isEmpty() || !TextUtils.isEmpty(m40231(c15996, "content-length"))) {
                c15996.m37801(strM40238);
                return strM40238;
            }
        } catch (IOException | RuntimeException unused) {
        }
        HashMap map = new HashMap();
        c15996.m37802(map);
        String str = (String) map.get("postData");
        if (str == null) {
            str = (String) map.get("content");
        }
        if (str == null) {
            str = "";
        }
        c15996.m37801(str);
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17846 m40232(C15996 c15996, long j) throws C16434 {
        CoderResult coderResultDecode;
        CoderResult coderResultFlush;
        CoderResult coderResultDecode2;
        if (j < 0) {
            throw new C16434();
        }
        InputStream inputStreamM37810 = c15996.m37810();
        if (inputStreamM37810 == null && j > 0) {
            throw new C16434();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(o.a.t);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            long j2 = j;
            while (j2 > 0) {
                try {
                    int i = inputStreamM37810.read(bArr, 0, (int) Math.min(8192, j2));
                    if (i < 0) {
                        throw new C16434();
                    }
                    if (i == 0) {
                        throw new C16434();
                    }
                    messageDigest.update(bArr, 0, i);
                    byteBufferAllocate.put(bArr, 0, i);
                    byteBufferAllocate.flip();
                    do {
                        coderResultDecode2 = charsetDecoderOnUnmappableCharacter.decode(byteBufferAllocate, charBufferAllocate, false);
                        charBufferAllocate.flip();
                        sb.append((CharSequence) charBufferAllocate);
                        charBufferAllocate.clear();
                    } while (coderResultDecode2.isOverflow());
                    if (coderResultDecode2.isError()) {
                        coderResultDecode2.throwException();
                    }
                    byteBufferAllocate.compact();
                    j2 -= (long) i;
                } catch (IOException e) {
                    throw new C16434(e);
                }
            }
            byteBufferAllocate.flip();
            do {
                coderResultDecode = charsetDecoderOnUnmappableCharacter.decode(byteBufferAllocate, charBufferAllocate, true);
                charBufferAllocate.flip();
                sb.append((CharSequence) charBufferAllocate);
                charBufferAllocate.clear();
            } while (coderResultDecode.isOverflow());
            if (coderResultDecode.isError()) {
                coderResultDecode.throwException();
            }
            do {
                coderResultFlush = charsetDecoderOnUnmappableCharacter.flush(charBufferAllocate);
                charBufferAllocate.flip();
                sb.append((CharSequence) charBufferAllocate);
                charBufferAllocate.clear();
            } while (coderResultFlush.isOverflow());
            if (coderResultFlush.isError()) {
                coderResultFlush.throwException();
            }
            String string = sb.toString();
            c15996.m37801(string);
            return new C17846(string, messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
