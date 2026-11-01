package p067l;

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
public abstract class AbstractC22343 implements InterfaceC13035 {

    /* JADX INFO: renamed from: ۟ */
    public static final Set f70526 = EnumC2483.m3555();

    /* JADX INFO: renamed from: ۗ */
    public String f70527;

    /* JADX INFO: renamed from: ۨ */
    public C23623 f70531;

    /* JADX INFO: renamed from: ۫ */
    public String f70532;

    /* JADX INFO: renamed from: ܰ */
    public C13565 f70534;

    /* JADX INFO: renamed from: ᩶ */
    public String f70535;

    /* JADX INFO: renamed from: ᩹ */
    public Charset f70537;

    /* JADX INFO: renamed from: ᩺ */
    public String f70538;

    /* JADX INFO: renamed from: ۤ */
    public long f70530 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ۬ */
    public long f70533 = 0;

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f70528 = new HashMap();

    /* JADX INFO: renamed from: ᩸ */
    public final C25024 f70536 = new C25024();

    /* JADX INFO: renamed from: ۛ */
    public final C23603 f70529 = new C23603();

    /* JADX INFO: renamed from: ܳ */
    public final synchronized void m50165() {
        if (this.f70533 > 0) {
            this.f70530 = System.currentTimeMillis();
        }
    }

    public AbstractC22343(Charset charset) {
        this.f70537 = charset;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo30985(C5127 c5127) {
        this.f70531 = C23623.m52439(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f70534 = c13565M30871;
        this.f70535 = c13565M30871.m30872("procloader");
        C13565 c13565 = this.f70534;
        c13565.getClass();
        EnumC2483 enumC2483 = EnumC2483.f3953;
        boolean z = c13565.m30877(enumC2483, MotionUtils.EASING_TYPE_PATH) || ((c13565.m30880(EnumC2483.f3964) || c13565.m30877(enumC2483, ProviderConfigurationPermission.ALL_STR)) && c13565.m30881(enumC2483, "-path"));
        C23623 c23623 = this.f70531;
        C4908 c4908 = (C4908) c5127.m10904(C4908.class);
        if (c4908 == null) {
            c4908 = new C4908();
        }
        this.f70529.m52428(c23623, z, c4908);
        String strM30872 = this.f70534.m30872("fileManager.deferClose");
        if (strM30872 != null) {
            try {
                this.f70533 = (int) (Float.parseFloat(strM30872) * 1000.0f);
            } catch (NumberFormatException unused) {
                this.f70533 = 60000L;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m50166() {
        C23603 c23603 = this.f70529;
        c23603.getClass();
        return ((C9601) c23603.m52424(EnumC22423.PLATFORM_CLASS_PATH)).m22382();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m50167() {
        C23603 c23603 = this.f70529;
        c23603.getClass();
        return !((C22933) c23603.m52424(EnumC22423.SYSTEM_MODULES)).f44740;
    }

    @Override // p067l.InterfaceC13035
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4107(Iterator it, String str) {
        C18989 c18989 = new C18989(this, this.f70531);
        EnumC2483 enumC2483M3560 = EnumC2483.m3560(str, f70526);
        if (enumC2483M3560 == null) {
            return false;
        }
        try {
            enumC2483M3560.m3581(c18989, str, it);
            return true;
        } catch (C4496 e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC19069
    /* JADX INFO: renamed from: ֫ */
    public final int mo4099(String str) {
        EnumC2483 enumC2483M3560 = EnumC2483.m3560(str, f70526);
        if (enumC2483M3560 == null) {
            return -1;
        }
        return enumC2483M3560.mo3588() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo30987(EnumC2483 enumC2483, String str) {
        int i = C16306.f47927[enumC2483.ordinal()];
        if (i == 1) {
            this.f70532 = str;
            return true;
        }
        C23603 c23603 = this.f70529;
        if (i == 2) {
            this.f70538 = str;
            c23603.m52427(str);
            return true;
        }
        AbstractC12875 abstractC12875 = (AbstractC12875) c23603.f75132.get(enumC2483);
        if (abstractC12875 == null) {
            return false;
        }
        return abstractC12875.mo22380(enumC2483, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50161() {
        String str = this.f70532;
        if (str != null) {
            return str;
        }
        if (this.f70527 == null) {
            this.f70527 = Charset.defaultCharset().name();
        }
        return this.f70527;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharBuffer m50163(ByteBuffer byteBuffer, boolean z) {
        Charset charsetForName;
        CodingErrorAction codingErrorAction;
        String strM50161 = m50161();
        Charset charset = this.f70537;
        if (charset == null) {
            try {
                charsetForName = Charset.forName(strM50161);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                C23623 c23623 = this.f70531;
                C14040 c14040 = C8300.f21997;
                c23623.m9355(new C14040("compiler", "unsupported.encoding", strM50161));
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
                String strName = charset == null ? strM50161 : charset.name();
                C23623 c23624 = this.f70531;
                int iLimit = charBufferAllocate.limit();
                String string = sb.toString();
                C14040 c14041 = C8300.f21997;
                c23624.m9348(iLimit, new C14040("compiler", "illegal.char.for.encoding", string, strName));
                charBufferAllocate.position(charBufferAllocate.limit());
                charBufferAllocate.limit(charBufferAllocate.capacity());
                charBufferAllocate.put((char) 65533);
            } else {
                throw new AssertionError(coderResultDecode);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer m50162(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 1024) {
            iAvailable = 1024;
        }
        ByteBuffer byteBufferM54944 = this.f70536.m54944(iAvailable);
        int i = 0;
        while (inputStream.available() != 0) {
            if (i >= iAvailable) {
                iAvailable <<= 1;
                byteBufferM54944 = ByteBuffer.allocate(iAvailable).put((ByteBuffer) byteBufferM54944.flip());
            }
            int i2 = inputStream.read(byteBufferM54944.array(), i, iAvailable - i);
            if (i2 < 0) {
                break;
            }
            i += i2;
            byteBufferM54944.position(i);
        }
        return (ByteBuffer) byteBufferM54944.flip();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50164(ByteBuffer byteBuffer) {
        this.f70536.m54945(byteBuffer);
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC18398 m50160(String str) {
        EnumC18398 enumC18398 = EnumC18398.CLASS;
        if (str.endsWith(enumC18398.f54934)) {
            return enumC18398;
        }
        EnumC18398 enumC18399 = EnumC18398.SOURCE;
        if (str.endsWith(enumC18399.f54934)) {
            return enumC18399;
        }
        EnumC18398 enumC183910 = EnumC18398.HTML;
        return str.endsWith(enumC183910.f54934) ? enumC183910 : EnumC18398.OTHER;
    }
}
