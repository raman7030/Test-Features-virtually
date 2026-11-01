package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;
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
public final class C18658 {
    /* JADX INFO: renamed from: ۧ */
    public static String m42479(InterfaceC4832 interfaceC4832, String str) {
        List list = (List) ((HashMap) ((C17571) interfaceC4832).m39999()).get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42476(InterfaceC4832 interfaceC4832, String str) {
        Map mapM39997 = ((C17571) interfaceC4832).m39997();
        if (mapM39997 == null) {
            return null;
        }
        HashMap map = (HashMap) mapM39997;
        if (map.isEmpty()) {
            return null;
        }
        String str2 = (String) map.get(str);
        return str2 != null ? str2 : (String) map.get(str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m42482(C17571 c17571) {
        EnumC6173 enumC6173M39993 = c17571.m39993();
        if (EnumC6173.POST.equals(enumC6173M39993) || EnumC6173.PUT.equals(enumC6173M39993)) {
            return true;
        }
        return m42478(c17571);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42478(C17571 c17571) {
        if (!m42480(c17571)) {
            String strM42476 = m42476(c17571, "content-length");
            if (strM42476 != null) {
                String strTrim = strM42476.trim();
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42480(C17571 c17571) {
        String strM42476 = m42476(c17571, "transfer-encoding");
        return (TextUtils.isEmpty(strM42476) || TextUtils.isEmpty(strM42476.trim())) ? false : true;
    }

    /* JADX INFO: renamed from: ܳ */
    public static long m42481(C17571 c17571) throws C12624 {
        String strM42476 = m42476(c17571, "content-length");
        if (TextUtils.isEmpty(strM42476)) {
            throw new C12624(R.string.MT_Protector, new Object[0]);
        }
        String strTrim = strM42476.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C12624(R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C12624(R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C12624(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m42483(C17571 c17571) throws IOException {
        int i;
        String strM42476 = m42476(c17571, "content-length");
        if (TextUtils.isEmpty(strM42476)) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(strM42476);
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, 0));
        byte[] bArr = new byte[1024];
        InputStream inputStreamM39996 = c17571.m39996();
        if (inputStreamM39996 == null) {
            return "";
        }
        while (i != 0) {
            int i2 = inputStreamM39996.read(bArr, 0, i > 0 ? Math.min(1024, i) : 1024);
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

    /* JADX INFO: renamed from: ᩳ */
    public static String m42484(C17571 c17571) {
        if (c17571.m39994()) {
            return c17571.m39995();
        }
        try {
            String strM42483 = m42483(c17571);
            if (!strM42483.isEmpty() || !TextUtils.isEmpty(m42476(c17571, "content-length"))) {
                c17571.m39987(strM42483);
                return strM42483;
            }
        } catch (IOException | RuntimeException unused) {
        }
        HashMap map = new HashMap();
        c17571.m39988(map);
        String str = (String) map.get("postData");
        if (str == null) {
            str = (String) map.get("content");
        }
        if (str == null) {
            str = "";
        }
        c17571.m39987(str);
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19329 m42477(C17571 c17571, long j) throws C17987 {
        CoderResult coderResultDecode;
        CoderResult coderResultFlush;
        CoderResult coderResultDecode2;
        if (j < 0) {
            throw new C17987();
        }
        InputStream inputStreamM39996 = c17571.m39996();
        if (inputStreamM39996 == null && j > 0) {
            throw new C17987();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C0719o.a.f2914t);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            long j2 = j;
            while (j2 > 0) {
                try {
                    int i = inputStreamM39996.read(bArr, 0, (int) Math.min(8192, j2));
                    if (i < 0) {
                        throw new C17987();
                    }
                    if (i == 0) {
                        throw new C17987();
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
                    throw new C17987(e);
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
            c17571.m39987(string);
            return new C19329(string, messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
