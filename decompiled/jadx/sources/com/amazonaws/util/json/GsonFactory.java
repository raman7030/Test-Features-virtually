package com.amazonaws.util.json;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import p067l.C18691;
import p067l.EnumC16008;

/* JADX INFO: loaded from: classes.dex */
public final class GsonFactory implements AwsJsonFactory {

    public final class GsonReader {

        /* JADX INFO: renamed from: ֫ */
        public final C18691 f2026;

        public GsonReader(StringReader stringReader) {
            this.f2026 = new C18691(stringReader);
        }

        /* JADX INFO: renamed from: ֫ */
        public final void m1967() throws IOException {
            this.f2026.m42647();
        }

        /* JADX INFO: renamed from: ܽ */
        public final void m1971() throws IOException {
            this.f2026.m42655();
        }

        /* JADX INFO: renamed from: ܿ */
        public final boolean m1972() throws IOException {
            EnumC16008 enumC16008M42643 = this.f2026.m42643();
            return EnumC16008.BEGIN_ARRAY.equals(enumC16008M42643) || EnumC16008.BEGIN_OBJECT.equals(enumC16008M42643);
        }

        /* JADX INFO: renamed from: ᩳ */
        public final boolean m1973() {
            return this.f2026.m42649();
        }

        /* JADX INFO: renamed from: ܳ */
        public final String m1970() {
            return this.f2026.m42641();
        }

        /* JADX INFO: renamed from: ᩻ */
        public final String m1975() throws IOException {
            C18691 c18691 = this.f2026;
            EnumC16008 enumC16008M42643 = c18691.m42643();
            if (EnumC16008.NULL.equals(enumC16008M42643)) {
                c18691.m42639();
                return null;
            }
            if (EnumC16008.BOOLEAN.equals(enumC16008M42643)) {
                return c18691.m42646() ? "true" : "false";
            }
            return c18691.m42644();
        }

        /* JADX INFO: renamed from: ᩷ */
        public final void m1974() throws IOException {
            this.f2026.m42654();
        }

        /* JADX INFO: renamed from: ۜ */
        public final AwsJsonToken m1968() throws IOException {
            try {
                EnumC16008 enumC16008M42643 = this.f2026.m42643();
                if (enumC16008M42643 == null) {
                    return null;
                }
                switch (C02791.f2025[enumC16008M42643.ordinal()]) {
                    case 1:
                        return AwsJsonToken.BEGIN_ARRAY;
                    case 2:
                        return AwsJsonToken.END_ARRAY;
                    case 3:
                        return AwsJsonToken.BEGIN_OBJECT;
                    case 4:
                        return AwsJsonToken.END_OBJECT;
                    case 5:
                        return AwsJsonToken.FIELD_NAME;
                    case 6:
                        return AwsJsonToken.VALUE_BOOLEAN;
                    case 7:
                        return AwsJsonToken.VALUE_NUMBER;
                    case 8:
                        return AwsJsonToken.VALUE_NULL;
                    case 9:
                        return AwsJsonToken.VALUE_STRING;
                    case 10:
                        return null;
                    default:
                        return AwsJsonToken.UNKNOWN;
                }
            } catch (EOFException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: ۧ */
        public final void m1969() throws IOException {
            this.f2026.close();
        }
    }

    /* JADX INFO: renamed from: com.amazonaws.util.json.GsonFactory$1 */
    public /* synthetic */ class C02791 {

        /* JADX INFO: renamed from: ֫ */
        public static final /* synthetic */ int[] f2025;

        static {
            int[] iArr = new int[EnumC16008.values().length];
            f2025 = iArr;
            try {
                iArr[EnumC16008.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2025[EnumC16008.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2025[EnumC16008.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2025[EnumC16008.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2025[EnumC16008.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2025[EnumC16008.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2025[EnumC16008.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2025[EnumC16008.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2025[EnumC16008.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2025[EnumC16008.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
