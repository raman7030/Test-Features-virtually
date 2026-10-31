package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩷ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21017 implements InterfaceC11223 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Set f67841 = EnumC0121.m1154();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f67842;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22364 f67846;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f67847;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11781 f67849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f67850;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Charset f67852;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f67853;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f67845 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f67848 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f67843 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23838 f67851 = new C23838();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22343 f67844 = new C22343();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47835() {
        if (this.f67848 > 0) {
            this.f67845 = System.currentTimeMillis();
        }
    }

    public AbstractC21017(Charset charset) {
        this.f67852 = charset;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28935(C2903 c2903) {
        this.f67846 = C22364.m50099(c2903);
        C11781 c11781M28823 = C11781.m28823(c2903);
        this.f67849 = c11781M28823;
        this.f67850 = c11781M28823.m28824("procloader");
        C11781 c11781 = this.f67849;
        c11781.getClass();
        EnumC0121 enumC0121 = EnumC0121.f1177;
        boolean z = c11781.m28829(enumC0121, MotionUtils.EASING_TYPE_PATH) || ((c11781.m28832(EnumC0121.f1188) || c11781.m28829(enumC0121, ProviderConfigurationPermission.ALL_STR)) && c11781.m28833(enumC0121, "-path"));
        C22364 c22364 = this.f67846;
        C2672 c2672 = (C2672) c2903.m8837(C2672.class);
        if (c2672 == null) {
            c2672 = new C2672();
        }
        this.f67844.m50089(c22364, z, c2672);
        String strM28824 = this.f67849.m28824("fileManager.deferClose");
        if (strM28824 != null) {
            try {
                this.f67848 = (int) (Float.parseFloat(strM28824) * 1000.0f);
            } catch (NumberFormatException unused) {
                this.f67848 = 60000L;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47836() {
        C22343 c22343 = this.f67844;
        c22343.getClass();
        return ((C7610) c22343.m50085(EnumC21101.PLATFORM_CLASS_PATH)).m20403();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m47837() {
        C22343 c22343 = this.f67844;
        c22343.getClass();
        return !((C21638) c22343.m50085(EnumC21101.SYSTEM_MODULES)).f41660;
    }

    @Override // l.InterfaceC11223
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1709(Iterator it, String str) {
        C17488 c17488 = new C17488(this, this.f67846);
        EnumC0121 enumC0121M1159 = EnumC0121.m1159(str, f67841);
        if (enumC0121M1159 == null) {
            return false;
        }
        try {
            enumC0121M1159.m1180(c17488, str, it);
            return true;
        } catch (C2239 e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ֫ */
    public final int mo1701(String str) {
        EnumC0121 enumC0121M1159 = EnumC0121.m1159(str, f67841);
        if (enumC0121M1159 == null) {
            return -1;
        }
        return enumC0121M1159.mo1187() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28937(EnumC0121 enumC0121, String str) {
        int i = C14665.f44817[enumC0121.ordinal()];
        if (i == 1) {
            this.f67847 = str;
            return true;
        }
        C22343 c22343 = this.f67844;
        if (i == 2) {
            this.f67853 = str;
            c22343.m50088(str);
            return true;
        }
        AbstractC11055 abstractC11055 = (AbstractC11055) c22343.f72406.get(enumC0121);
        if (abstractC11055 == null) {
            return false;
        }
        return abstractC11055.mo20401(enumC0121, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47831() {
        String str = this.f67847;
        if (str != null) {
            return str;
        }
        if (this.f67842 == null) {
            this.f67842 = Charset.defaultCharset().name();
        }
        return this.f67842;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharBuffer m47833(ByteBuffer byteBuffer, boolean z) {
        Charset charsetForName;
        CodingErrorAction codingErrorAction;
        String strM47831 = m47831();
        Charset charset = this.f67852;
        if (charset == null) {
            try {
                charsetForName = Charset.forName(strM47831);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                C22364 c22364 = this.f67846;
                C12281 c12281 = C6241.f19132;
                c22364.m7276(new C12281("compiler", "unsupported.encoding", strM47831));
                return (CharBuffer) CharBuffer.allocate(1).flip();
            }
        } else {
            charsetForName = charset;
        }
        CharsetDecoder charsetDecoderNewDecoder = charsetForName.newDecoder();
        if (z) {
            codingErrorAction = CodingErrorAction.REPLACE;
        } else {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(((int) (byteBuffer.remaining() * ((charsetDecoderOnUnmappableCharacter.maxCharsPerByte() * 0.2f) + (charsetDecoderOnUnmappableCharacter.averageCharsPerByte() * 0.8f)))) + 10);
        while (true) {
            CoderResult coderResultDecode = charsetDecoderOnUnmappableCharacter.decode(byteBuffer, charBufferAllocate, true);
            charBufferAllocate.flip();
            if (coderResultDecode.isUnderflow()) {
                if (charBufferAllocate.limit() != charBufferAllocate.capacity()) {
                    return charBufferAllocate;
                }
                CharBuffer charBufferPut = CharBuffer.allocate(charBufferAllocate.capacity() + 1).put(charBufferAllocate);
                charBufferPut.flip();
                return charBufferPut;
            }
            if (coderResultDecode.isOverflow()) {
                charBufferAllocate = CharBuffer.allocate(charBufferAllocate.capacity() + 10 + ((int) (charsetDecoderOnUnmappableCharacter.maxCharsPerByte() * byteBuffer.remaining()))).put(charBufferAllocate);
            } else if (coderResultDecode.isMalformed() || coderResultDecode.isUnmappable()) {
                StringBuilder sb = new StringBuilder();
                int length = coderResultDecode.length();
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X", Byte.valueOf(byteBuffer.get())));
                }
                String strName = charset == null ? strM47831 : charset.name();
                C22364 c22365 = this.f67846;
                int iLimit = charBufferAllocate.limit();
                String string = sb.toString();
                C12281 c12282 = C6241.f19132;
                c22365.m7269(iLimit, new C12281("compiler", "illegal.char.for.encoding", string, strName));
                charBufferAllocate.position(charBufferAllocate.limit());
                charBufferAllocate.limit(charBufferAllocate.capacity());
                charBufferAllocate.put((char) 65533);
            } else {
                throw new AssertionError(coderResultDecode);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m47832(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 1024) {
            iAvailable = 1024;
        }
        ByteBuffer byteBufferM52535 = this.f67851.m52535(iAvailable);
        int i = 0;
        while (inputStream.available() != 0) {
            if (i >= iAvailable) {
                iAvailable <<= 1;
                byteBufferM52535 = ByteBuffer.allocate(iAvailable).put((ByteBuffer) byteBufferM52535.flip());
            }
            int i2 = inputStream.read(byteBufferM52535.array(), i, iAvailable - i);
            if (i2 < 0) {
                break;
            }
            i += i2;
            byteBufferM52535.position(i);
        }
        return (ByteBuffer) byteBufferM52535.flip();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47834(ByteBuffer byteBuffer) {
        this.f67851.m52536(byteBuffer);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC16866 m47830(String str) {
        EnumC16866 enumC16866 = EnumC16866.CLASS;
        if (str.endsWith(enumC16866.f51754)) {
            return enumC16866;
        }
        EnumC16866 enumC16867 = EnumC16866.SOURCE;
        if (str.endsWith(enumC16867.f51754)) {
            return enumC16867;
        }
        EnumC16866 enumC16868 = EnumC16866.HTML;
        return str.endsWith(enumC16868.f51754) ? enumC16868 : EnumC16866.OTHER;
    }
}
