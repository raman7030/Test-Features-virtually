package l;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAYS */
/* JADX INFO: loaded from: classes.dex */
public class C23525 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f75520 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f75521 = new String[128];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f75522;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f75523;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21697 f75524;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f75525;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f75526;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC16093 f75527;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75528;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Writer f75529;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f75530;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f75531;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f75532;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f75533;

    static {
        for (int i = 0; i <= 31; i++) {
            f75521[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f75521;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f75522 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C23525(Writer writer) {
        int[] iArr = new int[32];
        this.f75526 = iArr;
        this.f75525 = 0;
        if (iArr.length == 0) {
            this.f75526 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f75526;
        int i = this.f75525;
        this.f75525 = i + 1;
        iArr2[i] = 6;
        this.f75527 = EnumC16093.LEGACY_STRICT;
        this.f75528 = true;
        C11003.requireNonNull(writer, "out == null");
        this.f75529 = writer;
        m51978(C21697.f69584);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51978(C21697 c21697) {
        C11003.requireNonNull(c21697);
        this.f75524 = c21697;
        this.f75530 = ",";
        if (c21697.m48974()) {
            this.f75532 = ": ";
            if (this.f75524.m48973().isEmpty()) {
                this.f75530 = ", ";
            }
        } else {
            this.f75532 = ":";
        }
        this.f75533 = this.f75524.m48973().isEmpty() && this.f75524.m48971().isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51977(EnumC16093 enumC16093) {
        C11003.requireNonNull(enumC16093);
        this.f75527 = enumC16093;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC16093 m51982() {
        return this.f75527;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51979(boolean z) {
        this.f75523 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m51980() {
        return this.f75523;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51985(boolean z) {
        this.f75528 = z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51990() {
        return this.f75528;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51972() throws IOException {
        m51968();
        m51970();
        int i = this.f75525;
        int[] iArr = this.f75526;
        if (i == iArr.length) {
            this.f75526 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f75526;
        int i2 = this.f75525;
        this.f75525 = i2 + 1;
        iArr2[i2] = 1;
        this.f75529.write(91);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m51989() throws IOException {
        m51967(']', 1, 2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m51987() throws IOException {
        m51968();
        m51970();
        int i = this.f75525;
        int[] iArr = this.f75526;
        if (i == iArr.length) {
            this.f75526 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f75526;
        int i2 = this.f75525;
        this.f75525 = i2 + 1;
        iArr2[i2] = 3;
        this.f75529.write(123);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m51986() throws IOException {
        m51967('}', 3, 5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51967(char c, int i, int i2) throws IOException {
        int iM51966 = m51966();
        if (iM51966 != i2 && iM51966 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f75531 != null) {
            throw new IllegalStateException("Dangling name: " + this.f75531);
        }
        this.f75525--;
        if (iM51966 == i2) {
            m51971();
        }
        this.f75529.write(c);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private int m51966() {
        int i = this.f75525;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f75526[i - 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51976(String str) {
        C11003.requireNonNull(str, "name == null");
        if (this.f75531 != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM51966 = m51966();
        if (iM51966 != 3 && iM51966 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f75531 = str;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m51968() throws IOException {
        if (this.f75531 != null) {
            int iM51966 = m51966();
            if (iM51966 == 5) {
                this.f75529.write(this.f75530);
            } else if (iM51966 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m51971();
            this.f75526[this.f75525 - 1] = 4;
            m51969(this.f75531);
            this.f75531 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51984(String str) throws IOException {
        if (str == null) {
            m51981();
            return;
        }
        m51968();
        m51970();
        m51969(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m51988(boolean z) throws IOException {
        m51968();
        m51970();
        this.f75529.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51974(Boolean bool) throws IOException {
        if (bool == null) {
            m51981();
            return;
        }
        m51968();
        m51970();
        this.f75529.write(bool.booleanValue() ? "true" : "false");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51973(double d) throws IOException {
        m51968();
        if (this.f75527 != EnumC16093.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m51970();
        this.f75529.append((CharSequence) Double.toString(d));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51983(long j) throws IOException {
        m51968();
        m51970();
        this.f75529.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51975(Number number) throws IOException {
        if (number == null) {
            m51981();
            return;
        }
        m51968();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f75527 != EnumC16093.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f75520.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m51970();
        this.f75529.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23525 m51981() {
        if (this.f75531 != null) {
            if (this.f75528) {
                m51968();
            } else {
                this.f75531 = null;
                return this;
            }
        }
        m51970();
        this.f75529.write("null");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f75525 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f75529.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f75529.close();
        int i = this.f75525;
        if (i > 1 || (i == 1 && this.f75526[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f75525 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51969(String str) throws IOException {
        String str2;
        String[] strArr = this.f75523 ? f75522 : f75521;
        Writer writer = this.f75529;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m51971() throws IOException {
        if (this.f75533) {
            return;
        }
        String strM48973 = this.f75524.m48973();
        Writer writer = this.f75529;
        writer.write(strM48973);
        int i = this.f75525;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f75524.m48971());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m51970() throws IOException {
        int iM51966 = m51966();
        if (iM51966 == 1) {
            this.f75526[this.f75525 - 1] = 2;
            m51971();
            return;
        }
        Writer writer = this.f75529;
        if (iM51966 == 2) {
            writer.append((CharSequence) this.f75530);
            m51971();
        } else {
            if (iM51966 != 4) {
                if (iM51966 != 6) {
                    if (iM51966 == 7) {
                        if (this.f75527 != EnumC16093.LENIENT) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                this.f75526[this.f75525 - 1] = 7;
                return;
            }
            writer.append((CharSequence) this.f75532);
            this.f75526[this.f75525 - 1] = 5;
        }
    }
}
