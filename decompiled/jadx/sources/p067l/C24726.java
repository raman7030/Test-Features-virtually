package p067l;

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
public class C24726 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ֫֫ */
    public static final Pattern f78266 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: ۟ */
    public static final String[] f78267 = new String[128];

    /* JADX INFO: renamed from: ܰ */
    public static final String[] f78268;

    /* JADX INFO: renamed from: ۗ */
    public boolean f78269;

    /* JADX INFO: renamed from: ۙ */
    public C22989 f78270;

    /* JADX INFO: renamed from: ۛ */
    public int f78271;

    /* JADX INFO: renamed from: ۤ */
    public int[] f78272;

    /* JADX INFO: renamed from: ۨ */
    public EnumC17663 f78273;

    /* JADX INFO: renamed from: ۫ */
    public boolean f78274;

    /* JADX INFO: renamed from: ۬ */
    public final Writer f78275;

    /* JADX INFO: renamed from: ᩶ */
    public String f78276;

    /* JADX INFO: renamed from: ᩸ */
    public String f78277;

    /* JADX INFO: renamed from: ᩹ */
    public String f78278;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f78279;

    static {
        for (int i = 0; i <= 31; i++) {
            f78267[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f78267;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f78268 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C24726(Writer writer) {
        int[] iArr = new int[32];
        this.f78272 = iArr;
        this.f78271 = 0;
        if (iArr.length == 0) {
            this.f78272 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f78272;
        int i = this.f78271;
        this.f78271 = i + 1;
        iArr2[i] = 6;
        this.f78273 = EnumC17663.LEGACY_STRICT;
        this.f78274 = true;
        C12826.requireNonNull(writer, "out == null");
        this.f78275 = writer;
        m54380(C22989.f72289);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54380(C22989 c22989) {
        C12826.requireNonNull(c22989);
        this.f78270 = c22989;
        this.f78276 = ",";
        if (c22989.m51323()) {
            this.f78278 = ": ";
            if (this.f78270.m51322().isEmpty()) {
                this.f78276 = ", ";
            }
        } else {
            this.f78278 = ":";
        }
        this.f78279 = this.f78270.m51322().isEmpty() && this.f78270.m51320().isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54379(EnumC17663 enumC17663) {
        C12826.requireNonNull(enumC17663);
        this.f78273 = enumC17663;
    }

    /* JADX INFO: renamed from: ۜ */
    public final EnumC17663 m54384() {
        return this.f78273;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54381(boolean z) {
        this.f78269 = z;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m54382() {
        return this.f78269;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54387(boolean z) {
        this.f78274 = z;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m54392() {
        return this.f78274;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m54374() throws IOException {
        m54370();
        m54372();
        int i = this.f78271;
        int[] iArr = this.f78272;
        if (i == iArr.length) {
            this.f78272 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f78272;
        int i2 = this.f78271;
        this.f78271 = i2 + 1;
        iArr2[i2] = 1;
        this.f78275.write(91);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void m54391() throws IOException {
        m54369(']', 1, 2);
    }

    /* JADX INFO: renamed from: ܽ */
    public void m54389() throws IOException {
        m54370();
        m54372();
        int i = this.f78271;
        int[] iArr = this.f78272;
        if (i == iArr.length) {
            this.f78272 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f78272;
        int i2 = this.f78271;
        this.f78271 = i2 + 1;
        iArr2[i2] = 3;
        this.f78275.write(123);
    }

    /* JADX INFO: renamed from: ܳ */
    public void m54388() throws IOException {
        m54369('}', 3, 5);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54369(char c, int i, int i2) throws IOException {
        int iM54368 = m54368();
        if (iM54368 != i2 && iM54368 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f78277 != null) {
            throw new IllegalStateException("Dangling name: " + this.f78277);
        }
        this.f78271--;
        if (iM54368 == i2) {
            m54373();
        }
        this.f78275.write(c);
    }

    /* JADX INFO: renamed from: ֡ */
    private int m54368() {
        int i = this.f78271;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f78272[i - 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public void m54378(String str) {
        C12826.requireNonNull(str, "name == null");
        if (this.f78277 != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM54368 = m54368();
        if (iM54368 != 3 && iM54368 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f78277 = str;
    }

    /* JADX INFO: renamed from: ܶ */
    private void m54370() throws IOException {
        if (this.f78277 != null) {
            int iM54368 = m54368();
            if (iM54368 == 5) {
                this.f78275.write(this.f78276);
            } else if (iM54368 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m54373();
            this.f78272[this.f78271 - 1] = 4;
            m54371(this.f78277);
            this.f78277 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void m54386(String str) throws IOException {
        if (str == null) {
            m54383();
            return;
        }
        m54370();
        m54372();
        m54371(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public void m54390(boolean z) throws IOException {
        m54370();
        m54372();
        this.f78275.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: ֫ */
    public void m54376(Boolean bool) throws IOException {
        if (bool == null) {
            m54383();
            return;
        }
        m54370();
        m54372();
        this.f78275.write(bool.booleanValue() ? "true" : "false");
    }

    /* JADX INFO: renamed from: ֫ */
    public void m54375(double d) throws IOException {
        m54370();
        if (this.f78273 != EnumC17663.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m54372();
        this.f78275.append((CharSequence) Double.toString(d));
    }

    /* JADX INFO: renamed from: ۧ */
    public void m54385(long j) throws IOException {
        m54370();
        m54372();
        this.f78275.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public void m54377(Number number) throws IOException {
        if (number == null) {
            m54383();
            return;
        }
        m54370();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f78273 != EnumC17663.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f78266.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m54372();
        this.f78275.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: ۘ */
    public C24726 m54383() {
        if (this.f78277 != null) {
            if (this.f78274) {
                m54370();
            } else {
                this.f78277 = null;
                return this;
            }
        }
        m54372();
        this.f78275.write("null");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f78271 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f78275.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f78275.close();
        int i = this.f78271;
        if (i > 1 || (i == 1 && this.f78272[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f78271 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: ᩳ */
    private void m54371(String str) throws IOException {
        String str2;
        String[] strArr = this.f78269 ? f78268 : f78267;
        Writer writer = this.f78275;
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

    /* JADX INFO: renamed from: ᩵ */
    private void m54373() throws IOException {
        if (this.f78279) {
            return;
        }
        String strM51322 = this.f78270.m51322();
        Writer writer = this.f78275;
        writer.write(strM51322);
        int i = this.f78271;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f78270.m51320());
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m54372() throws IOException {
        int iM54368 = m54368();
        if (iM54368 == 1) {
            this.f78272[this.f78271 - 1] = 2;
            m54373();
            return;
        }
        Writer writer = this.f78275;
        if (iM54368 == 2) {
            writer.append((CharSequence) this.f78276);
            m54373();
        } else {
            if (iM54368 != 4) {
                if (iM54368 != 6) {
                    if (iM54368 == 7) {
                        if (this.f78273 != EnumC17663.LENIENT) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                this.f78272[this.f78271 - 1] = 7;
                return;
            }
            writer.append((CharSequence) this.f78278);
            this.f78272[this.f78271 - 1] = 5;
        }
    }
}
