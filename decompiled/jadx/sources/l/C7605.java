package l;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.datepicker.UtcDates;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۟ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7605 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C11839[] f23497;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f23499;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Charset f23501;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23503;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String[] f23504;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C11839[][] f23507;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f23508;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f23509;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f23510;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23513;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f23514;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f23518;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final Set f23519;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final C11839 f23520;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f23525;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f23528;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f23530;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6194 f23531;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f23532;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f23533;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f23534;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AssetManager.AssetInputStream f23535;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f23536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public FileDescriptor f23537;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap[] f23538;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ByteOrder f23539;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashSet f23540;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23541;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23542;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final boolean f23496 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final List f23521 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final List f23517 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[] f23523 = {8, 8, 8};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f23522 = {8};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23512 = {-1, -40, -1};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23500 = {102, 116, 121, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23502 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f23524 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f23526 = {97, 118, 105, 102};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f23527 = {97, 118, 105, 115};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23515 = {79, 76, 89, 77, UTF8.S_P4A, 0};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f23506 = {79, 76, 89, 77, UTF8.S_P4A, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23511 = {-119, UTF8.S_P4A, 78, 71, cb.k, 10, 26, 10};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23498 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23529 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23505 = {87, 69, 66, UTF8.S_P4A};

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23516 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f23504 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f23510 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f23503 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C11839[] c11839Arr = {new C11839("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C11839("SubfileType", 255, 4), new C11839("ImageWidth", 256, 3, 4), new C11839("ImageLength", 257, 3, 4), new C11839("BitsPerSample", 258, 3), new C11839("Compression", 259, 3), new C11839("PhotometricInterpretation", 262, 3), new C11839("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C11839("Make", 271, 2), new C11839("Model", 272, 2), new C11839("StripOffsets", 273, 3, 4), new C11839("Orientation", 274, 3), new C11839("SamplesPerPixel", 277, 3), new C11839("RowsPerStrip", 278, 3, 4), new C11839("StripByteCounts", 279, 3, 4), new C11839("XResolution", 282, 5), new C11839("YResolution", 283, 5), new C11839("PlanarConfiguration", 284, 3), new C11839("ResolutionUnit", 296, 3), new C11839("TransferFunction", 301, 3), new C11839("Software", 305, 2), new C11839("DateTime", 306, 2), new C11839("Artist", 315, 2), new C11839("WhitePoint", 318, 5), new C11839("PrimaryChromaticities", 319, 5), new C11839("SubIFDPointer", 330, 4), new C11839("JPEGInterchangeFormat", 513, 4), new C11839("JPEGInterchangeFormatLength", 514, 4), new C11839("YCbCrCoefficients", 529, 5), new C11839("YCbCrSubSampling", 530, 3), new C11839("YCbCrPositioning", 531, 3), new C11839("ReferenceBlackWhite", 532, 5), new C11839("Copyright", 33432, 2), new C11839("ExifIFDPointer", 34665, 4), new C11839("GPSInfoIFDPointer", 34853, 4), new C11839("SensorTopBorder", 4, 4), new C11839("SensorLeftBorder", 5, 4), new C11839("SensorBottomBorder", 6, 4), new C11839("SensorRightBorder", 7, 4), new C11839("ISO", 23, 3), new C11839("JpgFromRaw", 46, 7), new C11839("Xmp", 700, 1)};
        C11839[] c11839Arr2 = {new C11839("ExposureTime", 33434, 5), new C11839("FNumber", 33437, 5), new C11839("ExposureProgram", 34850, 3), new C11839("SpectralSensitivity", 34852, 2), new C11839("PhotographicSensitivity", 34855, 3), new C11839("OECF", 34856, 7), new C11839("SensitivityType", 34864, 3), new C11839("StandardOutputSensitivity", 34865, 4), new C11839("RecommendedExposureIndex", 34866, 4), new C11839("ISOSpeed", 34867, 4), new C11839("ISOSpeedLatitudeyyy", 34868, 4), new C11839("ISOSpeedLatitudezzz", 34869, 4), new C11839("ExifVersion", UMModuleRegister.INNER_EVENT_VALUE_HIGH, 2), new C11839("DateTimeOriginal", 36867, 2), new C11839("DateTimeDigitized", 36868, 2), new C11839("OffsetTime", 36880, 2), new C11839("OffsetTimeOriginal", 36881, 2), new C11839("OffsetTimeDigitized", 36882, 2), new C11839("ComponentsConfiguration", UMModuleRegister.APPSTATUS_SWITCH_LOW, 7), new C11839("CompressedBitsPerPixel", 37122, 5), new C11839("ShutterSpeedValue", 37377, 10), new C11839("ApertureValue", 37378, 5), new C11839("BrightnessValue", 37379, 10), new C11839("ExposureBiasValue", 37380, 10), new C11839("MaxApertureValue", 37381, 5), new C11839("SubjectDistance", 37382, 5), new C11839("MeteringMode", 37383, 3), new C11839("LightSource", 37384, 3), new C11839("Flash", 37385, 3), new C11839("FocalLength", 37386, 5), new C11839("SubjectArea", 37396, 3), new C11839("MakerNote", 37500, 7), new C11839("UserComment", 37510, 7), new C11839("SubSecTime", 37520, 2), new C11839("SubSecTimeOriginal", 37521, 2), new C11839("SubSecTimeDigitized", 37522, 2), new C11839("FlashpixVersion", 40960, 7), new C11839("ColorSpace", 40961, 3), new C11839("PixelXDimension", 40962, 3, 4), new C11839("PixelYDimension", 40963, 3, 4), new C11839("RelatedSoundFile", 40964, 2), new C11839("InteroperabilityIFDPointer", 40965, 4), new C11839("FlashEnergy", 41483, 5), new C11839("SpatialFrequencyResponse", 41484, 7), new C11839("FocalPlaneXResolution", 41486, 5), new C11839("FocalPlaneYResolution", 41487, 5), new C11839("FocalPlaneResolutionUnit", 41488, 3), new C11839("SubjectLocation", 41492, 3), new C11839("ExposureIndex", 41493, 5), new C11839("SensingMethod", 41495, 3), new C11839("FileSource", 41728, 7), new C11839("SceneType", 41729, 7), new C11839("CFAPattern", 41730, 7), new C11839("CustomRendered", 41985, 3), new C11839("ExposureMode", 41986, 3), new C11839("WhiteBalance", 41987, 3), new C11839("DigitalZoomRatio", 41988, 5), new C11839("FocalLengthIn35mmFilm", 41989, 3), new C11839("SceneCaptureType", 41990, 3), new C11839("GainControl", 41991, 3), new C11839("Contrast", 41992, 3), new C11839("Saturation", 41993, 3), new C11839("Sharpness", 41994, 3), new C11839("DeviceSettingDescription", 41995, 7), new C11839("SubjectDistanceRange", 41996, 3), new C11839("ImageUniqueID", 42016, 2), new C11839("CameraOwnerName", 42032, 2), new C11839("BodySerialNumber", 42033, 2), new C11839("LensSpecification", 42034, 5), new C11839("LensMake", 42035, 2), new C11839("LensModel", 42036, 2), new C11839("Gamma", 42240, 5), new C11839("DNGVersion", 50706, 1), new C11839("DefaultCropSize", 50720, 3, 4)};
        C11839[] c11839Arr3 = {new C11839("GPSVersionID", 0, 1), new C11839("GPSLatitudeRef", 1, 2), new C11839("GPSLatitude", 2, 5, 10), new C11839("GPSLongitudeRef", 3, 2), new C11839("GPSLongitude", 4, 5, 10), new C11839("GPSAltitudeRef", 5, 1), new C11839("GPSAltitude", 6, 5), new C11839("GPSTimeStamp", 7, 5), new C11839("GPSSatellites", 8, 2), new C11839("GPSStatus", 9, 2), new C11839("GPSMeasureMode", 10, 2), new C11839("GPSDOP", 11, 5), new C11839("GPSSpeedRef", 12, 2), new C11839("GPSSpeed", 13, 5), new C11839("GPSTrackRef", 14, 2), new C11839("GPSTrack", 15, 5), new C11839("GPSImgDirectionRef", 16, 2), new C11839("GPSImgDirection", 17, 5), new C11839("GPSMapDatum", 18, 2), new C11839("GPSDestLatitudeRef", 19, 2), new C11839("GPSDestLatitude", 20, 5), new C11839("GPSDestLongitudeRef", 21, 2), new C11839("GPSDestLongitude", 22, 5), new C11839("GPSDestBearingRef", 23, 2), new C11839("GPSDestBearing", 24, 5), new C11839("GPSDestDistanceRef", 25, 2), new C11839("GPSDestDistance", 26, 5), new C11839("GPSProcessingMethod", 27, 7), new C11839("GPSAreaInformation", 28, 7), new C11839("GPSDateStamp", 29, 2), new C11839("GPSDifferential", 30, 3), new C11839("GPSHPositioningError", 31, 5)};
        C11839[] c11839Arr4 = {new C11839("InteroperabilityIndex", 1, 2)};
        C11839[] c11839Arr5 = {new C11839("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C11839("SubfileType", 255, 4), new C11839("ThumbnailImageWidth", 256, 3, 4), new C11839("ThumbnailImageLength", 257, 3, 4), new C11839("BitsPerSample", 258, 3), new C11839("Compression", 259, 3), new C11839("PhotometricInterpretation", 262, 3), new C11839("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C11839("Make", 271, 2), new C11839("Model", 272, 2), new C11839("StripOffsets", 273, 3, 4), new C11839("ThumbnailOrientation", 274, 3), new C11839("SamplesPerPixel", 277, 3), new C11839("RowsPerStrip", 278, 3, 4), new C11839("StripByteCounts", 279, 3, 4), new C11839("XResolution", 282, 5), new C11839("YResolution", 283, 5), new C11839("PlanarConfiguration", 284, 3), new C11839("ResolutionUnit", 296, 3), new C11839("TransferFunction", 301, 3), new C11839("Software", 305, 2), new C11839("DateTime", 306, 2), new C11839("Artist", 315, 2), new C11839("WhitePoint", 318, 5), new C11839("PrimaryChromaticities", 319, 5), new C11839("SubIFDPointer", 330, 4), new C11839("JPEGInterchangeFormat", 513, 4), new C11839("JPEGInterchangeFormatLength", 514, 4), new C11839("YCbCrCoefficients", 529, 5), new C11839("YCbCrSubSampling", 530, 3), new C11839("YCbCrPositioning", 531, 3), new C11839("ReferenceBlackWhite", 532, 5), new C11839("Copyright", 33432, 2), new C11839("ExifIFDPointer", 34665, 4), new C11839("GPSInfoIFDPointer", 34853, 4), new C11839("DNGVersion", 50706, 1), new C11839("DefaultCropSize", 50720, 3, 4)};
        f23520 = new C11839("StripOffsets", 273, 3);
        f23507 = new C11839[][]{c11839Arr, c11839Arr2, c11839Arr3, c11839Arr4, c11839Arr5, c11839Arr, new C11839[]{new C11839("ThumbnailImage", 256, 7), new C11839("CameraSettingsIFDPointer", 8224, 4), new C11839("ImageProcessingIFDPointer", 8256, 4)}, new C11839[]{new C11839("PreviewImageStart", 257, 4), new C11839("PreviewImageLength", 258, 4)}, new C11839[]{new C11839("AspectFrame", 4371, 3)}, new C11839[]{new C11839("ColorSpace", 55, 3)}};
        f23497 = new C11839[]{new C11839("SubIFDPointer", 330, 4), new C11839("ExifIFDPointer", 34665, 4), new C11839("GPSInfoIFDPointer", 34853, 4), new C11839("InteroperabilityIFDPointer", 40965, 4), new C11839("CameraSettingsIFDPointer", 8224, 1), new C11839("ImageProcessingIFDPointer", 8256, 1)};
        f23509 = new HashMap[10];
        f23508 = new HashMap[10];
        f23519 = C20195.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f23525 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f23501 = charsetForName;
        f23514 = "Exif\u0000\u0000".getBytes(charsetForName);
        f23513 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f23518 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f23499 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        int i = 0;
        while (true) {
            C11839[][] c11839Arr6 = f23507;
            if (i < c11839Arr6.length) {
                f23509[i] = new HashMap();
                f23508[i] = new HashMap();
                for (C11839 c11839 : c11839Arr6[i]) {
                    f23509[i].put(Integer.valueOf(c11839.f35320), c11839);
                    f23508[i].put(c11839.f35319, c11839);
                }
                i++;
            } else {
                HashMap map = f23525;
                C11839[] c11839Arr7 = f23497;
                map.put(Integer.valueOf(c11839Arr7[0].f35320), 5);
                map.put(Integer.valueOf(c11839Arr7[1].f35320), 1);
                map.put(Integer.valueOf(c11839Arr7[2].f35320), 2);
                map.put(Integer.valueOf(c11839Arr7[3].f35320), 3);
                map.put(Integer.valueOf(c11839Arr7[4].f35320), 7);
                map.put(Integer.valueOf(c11839Arr7[5].f35320), 8);
                f23528 = Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C7605(InputStream inputStream, int i) {
        C11839[][] c11839Arr = f23507;
        this.f23538 = new HashMap[c11839Arr.length];
        this.f23540 = new HashSet(c11839Arr.length);
        this.f23539 = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z = i == 1;
        this.f23536 = z;
        if (z) {
            this.f23535 = null;
            this.f23537 = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f23535 = (AssetManager.AssetInputStream) inputStream;
            this.f23537 = null;
        } else if (!(inputStream instanceof FileInputStream)) {
            this.f23535 = null;
            this.f23537 = null;
        } else {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f23535 = null;
                this.f23537 = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f23535 = null;
                this.f23537 = null;
            }
        }
        boolean z2 = this.f23536;
        boolean z3 = f23496;
        for (int i2 = 0; i2 < c11839Arr.length; i2++) {
            try {
                try {
                    this.f23538[i2] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused2) {
                    m20368();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m20368();
                if (z3) {
                    m20367();
                }
                throw th;
            }
        }
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, OpenAuthTask.Duplex);
            this.f23542 = m20355(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i3 = this.f23542;
        if (i3 != 4 && i3 != 9 && i3 != 13 && i3 != 14) {
            C13954 c13954 = new C13954(inputStream);
            if (z2) {
                if (!m20381(c13954)) {
                    m20368();
                    if (!z3) {
                        return;
                    }
                }
                m20367();
            }
            int i4 = this.f23542;
            if (i4 == 12 || i4 == 15) {
                m20364(c13954, i4);
            } else if (i4 == 7) {
                m20363(c13954);
            } else if (i4 == 10) {
                m20376(c13954);
            } else {
                m20371(c13954);
            }
            c13954.seek(this.f23532);
            m20378((C10428) c13954);
        } else {
            C10428 c10428 = new C10428(inputStream);
            int i5 = this.f23542;
            if (i5 == 4) {
                m20361(c10428, 0, 0);
            } else if (i5 == 13) {
                m20360(c10428);
            } else if (i5 == 9) {
                m20370(c10428);
            } else if (i5 == 14) {
                m20375(c10428);
            }
        }
        m20368();
        if (!z3) {
            return;
        }
        m20367();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C6194 m20369(String str) {
        C6194 c6194;
        int i;
        C6194 c6195;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f23542) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c6195 = this.f23531) != null)) {
            return c6195;
        }
        for (int i2 = 0; i2 < f23507.length; i2++) {
            C6194 c6196 = (C6194) this.f23538[i2].get(str);
            if (c6196 != null) {
                return c6196;
            }
        }
        if (!"Xmp".equals(str) || (c6194 = this.f23531) == null) {
            return null;
        }
        return c6194;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m20385(String str) {
        C6194 c6194M20369 = m20369(str);
        if (c6194M20369 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = c6194M20369.f19002;
                if (i == 5 || i == 10) {
                    C23127[] c23127Arr = (C23127[]) c6194M20369.m17121(this.f23539);
                    if (c23127Arr == null || c23127Arr.length != 3) {
                        Arrays.toString(c23127Arr);
                        return null;
                    }
                    C23127 c23127 = c23127Arr[0];
                    Integer numValueOf = Integer.valueOf((int) (c23127.f74374 / c23127.f74373));
                    C23127 c23128 = c23127Arr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (c23128.f74374 / c23128.f74373));
                    C23127 c23129 = c23127Arr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c23129.f74374 / c23129.f74373)));
                }
            } else if (f23519.contains(str)) {
                try {
                    return Double.toString(c6194M20369.m17118(this.f23539));
                } catch (NumberFormatException unused) {
                }
            } else {
                return c6194M20369.m17120(this.f23539);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20384() {
        C6194 c6194M20369 = m20369("Orientation");
        if (c6194M20369 == null) {
            return 1;
        }
        try {
            return c6194M20369.m17119(this.f23539);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m20367() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f23538;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C6194 c6194 = (C6194) entry.getValue();
                c6194.toString();
                c6194.m17120(this.f23539);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Long m20386() {
        return m20356(m20385("DateTime"), m20385("SubSecTime"), m20385("OffsetTime"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Long m20387() {
        return m20356(m20385("DateTimeDigitized"), m20385("SubSecTimeDigitized"), m20385("OffsetTimeDigitized"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Long m20389() {
        return m20356(m20385("DateTimeOriginal"), m20385("SubSecTimeOriginal"), m20385("OffsetTimeOriginal"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Long m20356(String str, String str2, String str3) {
        long j;
        if (str != null && f23528.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f23518.parse(str, parsePosition);
                if (date == null && (date = f23499.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i = Integer.parseInt(str3.substring(1, 3));
                    int i2 = Integer.parseInt(str3.substring(4, 6));
                    if ((BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i <= 14) {
                        time += (long) (C4153.m12551(i, 60, i2, 60000) * ("-".equals(strSubstring) ? 1 : -1));
                    }
                }
                if (str2 != null) {
                    try {
                        int iMin = Math.min(str2.length(), 3);
                        j = Long.parseLong(str2.substring(0, iMin));
                        while (iMin < 3) {
                            j *= 10;
                            iMin++;
                        }
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    time += j;
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Long m20388() {
        String strM20385 = m20385("GPSDateStamp");
        String strM20386 = m20385("GPSTimeStamp");
        if (strM20385 == null || strM20386 == null) {
            return null;
        }
        Pattern pattern = f23528;
        if (!pattern.matcher(strM20385).matches() && !pattern.matcher(strM20386).matches()) {
            return null;
        }
        String str = strM20385 + ' ' + strM20386;
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            Date date = f23518.parse(str, parsePosition);
            if (date == null && (date = f23499.parse(str, parsePosition)) == null) {
                return null;
            }
            return Long.valueOf(date.getTime());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x0149  */
    /* JADX WARN: Code duplicated, block: B:120:0x0151 A[LOOP:2: B:115:0x0144->B:120:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x015a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0160  */
    /* JADX WARN: Code duplicated, block: B:131:0x0167 A[LOOP:3: B:126:0x015b->B:131:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0170  */
    /* JADX WARN: Code duplicated, block: B:138:0x017b A[LOOP:4: B:133:0x016b->B:138:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0181 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0179 A[EDGE_INSN: B:168:0x0179->B:137:0x0179 BREAK  A[LOOP:3: B:126:0x015b->B:131:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0179 A[EDGE_INSN: B:171:0x0179->B:137:0x0179 BREAK  A[LOOP:3: B:126:0x015b->B:131:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m20355(BufferedInputStream bufferedInputStream) throws Throwable {
        C10428 c10428;
        int i;
        C10428 c10429;
        boolean z;
        C10428 c104210;
        boolean z2;
        int i2;
        byte[] bArr;
        boolean z3;
        int i3;
        byte[] bArr2;
        int i4;
        byte[] bArr3;
        boolean z4;
        short s;
        long j;
        bufferedInputStream.mark(OpenAuthTask.Duplex);
        byte[] bArr4 = new byte[OpenAuthTask.Duplex];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr5 = f23512;
            if (i5 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i5] != bArr5[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr4[i6] != bytes[i6]) {
                        try {
                            c10428 = new C10428(bArr4);
                            try {
                                long j2 = c10428.readInt();
                                byte[] bArr6 = new byte[4];
                                c10428.readFully(bArr6);
                                if (Arrays.equals(bArr6, f23500)) {
                                    if (j2 == 1) {
                                        j2 = c10428.readLong();
                                        j = 16;
                                        if (j2 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j3 = OpenAuthTask.Duplex;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    long j4 = j2 - j;
                                    if (j4 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        long j5 = 0;
                                        boolean z5 = false;
                                        boolean z6 = false;
                                        boolean z7 = false;
                                        while (true) {
                                            if (j5 < j4 / 4) {
                                                try {
                                                    c10428.readFully(bArr7);
                                                    if (j5 != 1) {
                                                        if (Arrays.equals(bArr7, f23502)) {
                                                            z5 = true;
                                                        } else if (Arrays.equals(bArr7, f23524)) {
                                                            z6 = true;
                                                        } else if (Arrays.equals(bArr7, f23526) || Arrays.equals(bArr7, f23527)) {
                                                            z7 = true;
                                                        }
                                                        if (z5) {
                                                            if (z6) {
                                                                c10428.close();
                                                                i = 12;
                                                            } else if (z7) {
                                                                c10428.close();
                                                                i = 15;
                                                            }
                                                            if (i != 0) {
                                                                return i;
                                                            }
                                                            try {
                                                                c10429 = new C10428(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM20380 = m20380(c10429);
                                                                    this.f23539 = byteOrderM20380;
                                                                    c10429.m26272(byteOrderM20380);
                                                                    s = c10429.readShort();
                                                                    if (s != 20306 || s == 21330) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    c10429.close();
                                                                } catch (Exception unused) {
                                                                    if (c10429 != null) {
                                                                        c10429.close();
                                                                    }
                                                                    z = false;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (c10429 != null) {
                                                                        c10429.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                                c10429 = null;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                c10429 = null;
                                                            }
                                                            if (z) {
                                                                return 7;
                                                            }
                                                            try {
                                                                c104210 = new C10428(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM20381 = m20380(c104210);
                                                                    this.f23539 = byteOrderM20381;
                                                                    c104210.m26272(byteOrderM20381);
                                                                    if (c104210.readShort() == 85) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c104210.close();
                                                                } catch (Exception unused3) {
                                                                    if (c104210 != null) {
                                                                        c104210.close();
                                                                    }
                                                                    z2 = false;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    if (c104210 != null) {
                                                                        c104210.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused4) {
                                                                c104210 = null;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                c104210 = null;
                                                            }
                                                            if (z2) {
                                                                return 10;
                                                            }
                                                            i2 = 0;
                                                            while (true) {
                                                                bArr = f23511;
                                                                if (i2 >= bArr.length) {
                                                                    z3 = true;
                                                                    break;
                                                                }
                                                                if (bArr4[i2] != bArr[i2]) {
                                                                    z3 = false;
                                                                    break;
                                                                }
                                                                i2++;
                                                            }
                                                            if (z3) {
                                                                return 13;
                                                            }
                                                            i3 = 0;
                                                            while (true) {
                                                                bArr2 = f23529;
                                                                if (i3 >= bArr2.length) {
                                                                    i4 = 0;
                                                                    while (true) {
                                                                        bArr3 = f23505;
                                                                        if (i4 >= bArr3.length) {
                                                                            z4 = true;
                                                                            break;
                                                                        }
                                                                        if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                                                            break;
                                                                        }
                                                                        i4++;
                                                                    }
                                                                    if (z4) {
                                                                        return 14;
                                                                    }
                                                                    return 0;
                                                                }
                                                                if (bArr4[i3] != bArr2[i3]) {
                                                                    break;
                                                                }
                                                                i3++;
                                                            }
                                                            z4 = false;
                                                            if (z4) {
                                                                return 14;
                                                            }
                                                            return 0;
                                                        }
                                                        continue;
                                                    }
                                                    j5++;
                                                } catch (EOFException unused5) {
                                                    c10428.close();
                                                    i = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused6) {
                                if (c10428 != null) {
                                }
                                i = 0;
                                if (i != 0) {
                                    return i;
                                }
                                c10429 = new C10428(bArr4);
                                ByteOrder byteOrderM20382 = m20380(c10429);
                                this.f23539 = byteOrderM20382;
                                c10429.m26272(byteOrderM20382);
                                s = c10429.readShort();
                                if (s != 20306) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                c10429.close();
                                if (z) {
                                    return 7;
                                }
                                c104210 = new C10428(bArr4);
                                ByteOrder byteOrderM20383 = m20380(c104210);
                                this.f23539 = byteOrderM20383;
                                c104210.m26272(byteOrderM20383);
                                if (c104210.readShort() == 85) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c104210.close();
                                if (z2) {
                                    return 10;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr = f23511;
                                    if (i2 >= bArr.length) {
                                        z3 = true;
                                        break;
                                    }
                                    if (bArr4[i2] != bArr[i2]) {
                                        z3 = false;
                                        break;
                                    }
                                    i2++;
                                }
                                if (z3) {
                                    return 13;
                                }
                                i3 = 0;
                                while (true) {
                                    bArr2 = f23529;
                                    if (i3 >= bArr2.length) {
                                        i4 = 0;
                                        while (true) {
                                            bArr3 = f23505;
                                            if (i4 >= bArr3.length) {
                                                z4 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                                break;
                                                break;
                                            }
                                            i4++;
                                        }
                                        if (z4) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i3] != bArr2[i3]) {
                                        break;
                                        break;
                                    }
                                    i3++;
                                }
                                z4 = false;
                                if (z4) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th5) {
                                th = th5;
                                if (c10428 != null) {
                                    c10428.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            c10428 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c10428 = null;
                        }
                        c10428.close();
                        i = 0;
                        if (i != 0) {
                            return i;
                        }
                        c10429 = new C10428(bArr4);
                        ByteOrder byteOrderM20384 = m20380(c10429);
                        this.f23539 = byteOrderM20384;
                        c10429.m26272(byteOrderM20384);
                        s = c10429.readShort();
                        if (s != 20306) {
                            z = true;
                        } else {
                            z = true;
                        }
                        c10429.close();
                        if (z) {
                            return 7;
                        }
                        c104210 = new C10428(bArr4);
                        ByteOrder byteOrderM20385 = m20380(c104210);
                        this.f23539 = byteOrderM20385;
                        c104210.m26272(byteOrderM20385);
                        if (c104210.readShort() == 85) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c104210.close();
                        if (z2) {
                            return 10;
                        }
                        i2 = 0;
                        while (true) {
                            bArr = f23511;
                            if (i2 >= bArr.length) {
                                z3 = true;
                                break;
                            }
                            if (bArr4[i2] != bArr[i2]) {
                                z3 = false;
                                break;
                            }
                            i2++;
                        }
                        if (z3) {
                            return 13;
                        }
                        i3 = 0;
                        while (true) {
                            bArr2 = f23529;
                            if (i3 >= bArr2.length) {
                                i4 = 0;
                                while (true) {
                                    bArr3 = f23505;
                                    if (i4 >= bArr3.length) {
                                        z4 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                        break;
                                        break;
                                    }
                                    i4++;
                                }
                                if (z4) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i3] != bArr2[i3]) {
                                break;
                                break;
                            }
                            i3++;
                        }
                        z4 = false;
                        if (z4) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[LOOP:0: B:10:0x0024->B:56:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x010d A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20361(l.C10428 r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7605.m20361(l.ۤܿ֫, int, int):void");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20371(C13954 c13954) throws IOException {
        m20379(c13954);
        m20372(c13954, 0);
        m20377(c13954, 0);
        m20377(c13954, 5);
        m20377(c13954, 4);
        m20374();
        if (this.f23542 == 8) {
            HashMap[] mapArr = this.f23538;
            C6194 c6194 = (C6194) mapArr[1].get("MakerNote");
            if (c6194 != null) {
                C13954 c13955 = new C13954(c6194.f19000);
                c13955.m26272(this.f23539);
                c13955.m26271(6);
                m20372(c13955, 9);
                C6194 c6195 = (C6194) mapArr[9].get("ColorSpace");
                if (c6195 != null) {
                    mapArr[1].put("ColorSpace", c6195);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20370(C10428 c10428) throws IOException {
        if (f23496) {
            C11003.toString(c10428);
        }
        c10428.m26271(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c10428.readFully(bArr);
        c10428.readFully(bArr2);
        c10428.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c10428.m26271(i - c10428.f31330);
        c10428.readFully(bArr4);
        m20361(new C10428(bArr4), i, 5);
        c10428.m26271(i3 - c10428.f31330);
        c10428.m26272(ByteOrder.BIG_ENDIAN);
        int i4 = c10428.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c10428.readUnsignedShort();
            int unsignedShort2 = c10428.readUnsignedShort();
            if (unsignedShort == f23520.f35320) {
                short s = c10428.readShort();
                short s2 = c10428.readShort();
                C6194 c6194M17114 = C6194.m17114((int) s, this.f23539);
                C6194 c6194M17115 = C6194.m17114((int) s2, this.f23539);
                HashMap[] mapArr = this.f23538;
                mapArr[0].put("ImageLength", c6194M17114);
                mapArr[0].put("ImageWidth", c6194M17115);
                return;
            }
            c10428.m26271(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20364(C13954 c13954, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i3 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C1877.m6214(mediaMetadataRetriever, new C12544(c13954));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f23538;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C6194.m17114(Integer.parseInt(strExtractMetadata), this.f23539));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", C6194.m17114(Integer.parseInt(strExtractMetadata3), this.f23539));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", C6194.m17114(i2, this.f23539));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c13954.seek(i5);
                    byte[] bArr = new byte[6];
                    c13954.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f23514)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    c13954.readFully(bArr2);
                    this.f23532 = i7;
                    m20359(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    c13954.seek(j);
                    byte[] bArr3 = new byte[i10];
                    c13954.readFully(bArr3);
                    this.f23531 = new C6194(j, bArr3, 1, i10);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m20381(C13954 c13954) throws IOException {
        byte[] bArr = f23514;
        byte[] bArr2 = new byte[bArr.length];
        c13954.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = c13954.f31333.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 != -1) {
                i += i2;
                c13954.f31330 += i2;
            } else {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.f23532 = bArr.length;
                m20359(0, bArrCopyOf2);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20363(C13954 c13954) throws IOException {
        int i;
        int i2;
        m20371(c13954);
        HashMap[] mapArr = this.f23538;
        C6194 c6194 = (C6194) mapArr[1].get("MakerNote");
        if (c6194 != null) {
            C13954 c13955 = new C13954(c6194.f19000);
            c13955.m26272(this.f23539);
            byte[] bArr = f23515;
            byte[] bArr2 = new byte[bArr.length];
            c13955.readFully(bArr2);
            c13955.seek(0L);
            byte[] bArr3 = f23506;
            byte[] bArr4 = new byte[bArr3.length];
            c13955.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c13955.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c13955.seek(12L);
            }
            m20372(c13955, 6);
            C6194 c6195 = (C6194) mapArr[7].get("PreviewImageStart");
            C6194 c6196 = (C6194) mapArr[7].get("PreviewImageLength");
            if (c6195 != null && c6196 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c6195);
                mapArr[5].put("JPEGInterchangeFormatLength", c6196);
            }
            C6194 c6197 = (C6194) mapArr[8].get("AspectFrame");
            if (c6197 != null) {
                int[] iArr = (int[]) c6197.m17121(this.f23539);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C6194 c6194M17114 = C6194.m17114(i5, this.f23539);
                C6194 c6194M17115 = C6194.m17114(i6, this.f23539);
                mapArr[0].put("ImageWidth", c6194M17114);
                mapArr[0].put("ImageLength", c6194M17115);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20376(C13954 c13954) throws IOException {
        if (f23496) {
            C11003.toString(c13954);
        }
        m20371(c13954);
        HashMap[] mapArr = this.f23538;
        C6194 c6194 = (C6194) mapArr[0].get("JpgFromRaw");
        if (c6194 != null) {
            m20361(new C10428(c6194.f19000), (int) c6194.f19001, 5);
        }
        C6194 c6195 = (C6194) mapArr[0].get("ISO");
        C6194 c6196 = (C6194) mapArr[1].get("PhotographicSensitivity");
        if (c6195 == null || c6196 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c6195);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20360(C10428 c10428) throws IOException {
        if (f23496) {
            C11003.toString(c10428);
        }
        c10428.m26272(ByteOrder.BIG_ENDIAN);
        int i = c10428.f31330;
        c10428.m26271(f23511.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int i2 = c10428.readInt();
                int i3 = c10428.readInt();
                int i4 = c10428.f31330;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z) {
                    this.f23532 = i6;
                    byte[] bArr = new byte[i2];
                    c10428.readFully(bArr);
                    int i7 = c10428.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m20359(0, bArr);
                    m20374();
                    m20378(new C10428(bArr));
                    z = true;
                } else if (i3 == 1767135348 && !z2) {
                    byte[] bArr2 = f23498;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c10428.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = c10428.f31330 - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            c10428.readFully(bArr4);
                            this.f23531 = new C6194(i8, bArr4, 1, i9);
                            z2 = true;
                        }
                    }
                }
                c10428.m26271(i5 - c10428.f31330);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20375(C10428 c10428) throws IOException {
        if (f23496) {
            C11003.toString(c10428);
        }
        c10428.m26272(ByteOrder.LITTLE_ENDIAN);
        c10428.m26271(f23529.length);
        int i = c10428.readInt() + 8;
        byte[] bArr = f23505;
        c10428.m26271(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c10428.readFully(bArr2);
                int i2 = c10428.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f23516, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    c10428.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f23514;
                    if (C11050.m27435(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.f23532 = i3;
                    m20359(0, bArrCopyOfRange);
                    m20378(new C10428(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c10428.m26271(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20359(int i, byte[] bArr) throws IOException {
        C13954 c13954 = new C13954(bArr);
        m20379(c13954);
        m20372(c13954, i);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m20368() {
        String strM20385 = m20385("DateTimeOriginal");
        HashMap[] mapArr = this.f23538;
        if (strM20385 != null && m20385("DateTime") == null) {
            mapArr[0].put("DateTime", C6194.m17116(strM20385));
        }
        if (m20385("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C6194.m17115(0L, this.f23539));
        }
        if (m20385("ImageLength") == null) {
            mapArr[0].put("ImageLength", C6194.m17115(0L, this.f23539));
        }
        if (m20385("Orientation") == null) {
            mapArr[0].put("Orientation", C6194.m17115(0L, this.f23539));
        }
        if (m20385("LightSource") == null) {
            mapArr[1].put("LightSource", C6194.m17115(0L, this.f23539));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ByteOrder m20380(C10428 c10428) throws IOException {
        short s = c10428.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(C13540.m32584(new StringBuilder("Invalid byte order: "), s));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20379(C13954 c13954) throws IOException {
        ByteOrder byteOrderM20380 = m20380((C10428) c13954);
        this.f23539 = byteOrderM20380;
        c13954.m26272(byteOrderM20380);
        int unsignedShort = c13954.readUnsignedShort();
        int i = this.f23542;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException(C13540.m32584(new StringBuilder("Invalid start code: "), unsignedShort));
        }
        int i2 = c13954.readInt();
        if (i2 < 8) {
            throw new IOException(C19370.m44628(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c13954.m26271(i3);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20378(C10428 c10428) throws IOException {
        C6194 c6194;
        HashMap map = this.f23538[4];
        C6194 c6195 = (C6194) map.get("Compression");
        if (c6195 != null) {
            int iM17119 = c6195.m17119(this.f23539);
            if (iM17119 != 1) {
                if (iM17119 == 6) {
                    m20362(c10428, map);
                    return;
                } else if (iM17119 != 7) {
                    return;
                }
            }
            C6194 c6196 = (C6194) map.get("BitsPerSample");
            if (c6196 != null) {
                int[] iArr = (int[]) c6196.m17121(this.f23539);
                int[] iArr2 = f23523;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f23542 != 3 || (c6194 = (C6194) map.get("PhotometricInterpretation")) == null) {
                        return;
                    }
                    int iM171110 = c6194.m17119(this.f23539);
                    if ((iM171110 != 1 || !Arrays.equals(iArr, f23522)) && (iM171110 != 6 || !Arrays.equals(iArr, iArr2))) {
                        return;
                    }
                }
                C6194 c6197 = (C6194) map.get("StripOffsets");
                C6194 c6198 = (C6194) map.get("StripByteCounts");
                if (c6197 == null || c6198 == null) {
                    return;
                }
                long[] jArrM27436 = C11050.m27436(c6197.m17121(this.f23539));
                long[] jArrM27437 = C11050.m27436(c6198.m17121(this.f23539));
                if (jArrM27436 == null || jArrM27436.length == 0 || jArrM27437 == null || jArrM27437.length == 0 || jArrM27436.length != jArrM27437.length) {
                    return;
                }
                long j = 0;
                for (long j2 : jArrM27437) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f23530 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM27436.length; i3++) {
                    int i4 = (int) jArrM27436[i3];
                    int i5 = (int) jArrM27437[i3];
                    if (i3 < jArrM27436.length - 1 && i4 + i5 != jArrM27436[i3 + 1]) {
                        this.f23530 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        return;
                    }
                    try {
                        c10428.m26271(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        c10428.readFully(bArr2);
                        i = i7 + i5;
                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                        i2 += i5;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                if (this.f23530) {
                    long j3 = jArrM27436[0];
                    return;
                }
                return;
            }
            return;
        }
        m20362(c10428, map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20362(C10428 c10428, HashMap map) throws IOException {
        C6194 c6194 = (C6194) map.get("JPEGInterchangeFormat");
        C6194 c6195 = (C6194) map.get("JPEGInterchangeFormatLength");
        if (c6194 == null || c6195 == null) {
            return;
        }
        int iM17119 = c6194.m17119(this.f23539);
        int iM171110 = c6195.m17119(this.f23539);
        if (this.f23542 == 7) {
            iM17119 += this.f23541;
        }
        if (iM17119 <= 0 || iM171110 <= 0 || this.f23535 != null || this.f23537 != null) {
            return;
        }
        c10428.m26271(iM17119);
        c10428.readFully(new byte[iM171110]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20365(HashMap map) {
        C6194 c6194 = (C6194) map.get("ImageLength");
        C6194 c6195 = (C6194) map.get("ImageWidth");
        if (c6194 == null || c6195 == null) {
            return false;
        }
        return c6194.m17119(this.f23539) <= 512 && c6195.m17119(this.f23539) <= 512;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m20374() {
        m20357(0, 5);
        m20357(0, 4);
        m20357(5, 4);
        HashMap[] mapArr = this.f23538;
        C6194 c6194 = (C6194) mapArr[1].get("PixelXDimension");
        C6194 c6195 = (C6194) mapArr[1].get("PixelYDimension");
        if (c6194 != null && c6195 != null) {
            mapArr[0].put("ImageWidth", c6194);
            mapArr[0].put("ImageLength", c6195);
        }
        if (mapArr[4].isEmpty() && m20365(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m20365(mapArr[4]);
        m20358(0, "ThumbnailOrientation", "Orientation");
        m20358(0, "ThumbnailImageLength", "ImageLength");
        m20358(0, "ThumbnailImageWidth", "ImageWidth");
        m20358(5, "ThumbnailOrientation", "Orientation");
        m20358(5, "ThumbnailImageLength", "ImageLength");
        m20358(5, "ThumbnailImageWidth", "ImageWidth");
        m20358(4, "Orientation", "ThumbnailOrientation");
        m20358(4, "ImageLength", "ThumbnailImageLength");
        m20358(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20377(C13954 c13954, int i) throws IOException {
        C6194 c6194M17114;
        C6194 c6194M17115;
        HashMap[] mapArr = this.f23538;
        C6194 c6194 = (C6194) mapArr[i].get("DefaultCropSize");
        C6194 c6195 = (C6194) mapArr[i].get("SensorTopBorder");
        C6194 c6196 = (C6194) mapArr[i].get("SensorLeftBorder");
        C6194 c6197 = (C6194) mapArr[i].get("SensorBottomBorder");
        C6194 c6198 = (C6194) mapArr[i].get("SensorRightBorder");
        if (c6194 != null) {
            if (c6194.f19002 == 5) {
                C23127[] c23127Arr = (C23127[]) c6194.m17121(this.f23539);
                if (c23127Arr == null || c23127Arr.length != 2) {
                    Arrays.toString(c23127Arr);
                    return;
                } else {
                    c6194M17114 = C6194.m17117(c23127Arr[0], this.f23539);
                    c6194M17115 = C6194.m17117(c23127Arr[1], this.f23539);
                }
            } else {
                int[] iArr = (int[]) c6194.m17121(this.f23539);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c6194M17114 = C6194.m17114(iArr[0], this.f23539);
                    c6194M17115 = C6194.m17114(iArr[1], this.f23539);
                }
            }
            mapArr[i].put("ImageWidth", c6194M17114);
            mapArr[i].put("ImageLength", c6194M17115);
            return;
        }
        if (c6195 == null || c6196 == null || c6197 == null || c6198 == null) {
            C6194 c6199 = (C6194) mapArr[i].get("ImageLength");
            C6194 c61910 = (C6194) mapArr[i].get("ImageWidth");
            if (c6199 == null || c61910 == null) {
                C6194 c61911 = (C6194) mapArr[i].get("JPEGInterchangeFormat");
                C6194 c61912 = (C6194) mapArr[i].get("JPEGInterchangeFormatLength");
                if (c61911 == null || c61912 == null) {
                    return;
                }
                int iM17119 = c61911.m17119(this.f23539);
                int iM171110 = c61911.m17119(this.f23539);
                c13954.seek(iM17119);
                byte[] bArr = new byte[iM171110];
                c13954.readFully(bArr);
                m20361(new C10428(bArr), iM17119, i);
                return;
            }
            return;
        }
        int iM171111 = c6195.m17119(this.f23539);
        int iM171112 = c6197.m17119(this.f23539);
        int iM171113 = c6198.m17119(this.f23539);
        int iM171114 = c6196.m17119(this.f23539);
        if (iM171112 <= iM171111 || iM171113 <= iM171114) {
            return;
        }
        C6194 c6194M17116 = C6194.m17114(iM171112 - iM171111, this.f23539);
        C6194 c6194M17117 = C6194.m17114(iM171113 - iM171114, this.f23539);
        mapArr[i].put("ImageLength", c6194M17116);
        mapArr[i].put("ImageWidth", c6194M17117);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20372(C13954 c13954, int i) throws IOException {
        boolean z;
        HashMap[] mapArr;
        short s;
        short s2;
        long j;
        int i2;
        boolean z2;
        HashSet hashSet;
        int unsignedShort;
        long j2;
        Integer numValueOf = Integer.valueOf(c13954.f31330);
        HashSet hashSet2 = this.f23540;
        hashSet2.add(numValueOf);
        short s3 = c13954.readShort();
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            z = f23496;
            mapArr = this.f23538;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c13954.readUnsignedShort();
            int unsignedShort3 = c13954.readUnsignedShort();
            int i3 = c13954.readInt();
            long j3 = ((long) c13954.f31330) + 4;
            C11839 c11839 = (C11839) f23509[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c11839 != null ? c11839.f35319 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            }
            if (c11839 != null && unsignedShort3 > 0) {
                int[] iArr = f23510;
                if (unsignedShort3 >= iArr.length) {
                    s = s3;
                    s2 = s4;
                } else {
                    int i4 = c11839.f35321;
                    s = s3;
                    if (i4 == 7 || unsignedShort3 == 7 || i4 == unsignedShort3 || (i2 = c11839.f35322) == unsignedShort3) {
                        s2 = s4;
                    } else {
                        s2 = s4;
                        if (((i4 != 4 && i2 != 4) || unsignedShort3 != 3) && (((i4 != 9 && i2 != 9) || unsignedShort3 != 8) && ((i4 != 12 && i2 != 12) || unsignedShort3 != 11))) {
                            if (z) {
                                String str = f23504[unsignedShort3];
                            }
                        }
                    }
                    HashSet hashSet3 = hashSet2;
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = i4;
                    }
                    hashSet2 = hashSet3;
                    j = ((long) iArr[unsignedShort3]) * ((long) i3);
                    z2 = j >= 0 && j <= 2147483647L;
                }
                j = 0;
            } else {
                s = s3;
                s2 = s4;
                j = 0;
            }
            if (z2) {
                if (j > 4) {
                    int i5 = c13954.readInt();
                    if (this.f23542 == 7) {
                        if ("MakerNote".equals(c11839.f35319)) {
                            this.f23541 = i5;
                        } else if (i == 6 && "ThumbnailImage".equals(c11839.f35319)) {
                            this.f23533 = i5;
                            this.f23534 = i3;
                            C6194 c6194M17114 = C6194.m17114(6, this.f23539);
                            C6194 c6194M17115 = C6194.m17115(this.f23533, this.f23539);
                            C6194 c6194M17116 = C6194.m17115(this.f23534, this.f23539);
                            mapArr[4].put("Compression", c6194M17114);
                            mapArr[4].put("JPEGInterchangeFormat", c6194M17115);
                            mapArr[4].put("JPEGInterchangeFormatLength", c6194M17116);
                        }
                    }
                    c13954.seek(i5);
                } else {
                    j3 = j3;
                }
                Integer num = (Integer) f23525.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) c13954.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c13954.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c13954.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c11839.f35319);
                        }
                        if (j2 > 0 || (c13954.length() != -1 && j2 >= c13954.length())) {
                            hashSet = hashSet2;
                        } else {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                c13954.seek(j2);
                                m20372(c13954, num.intValue());
                            }
                        }
                        c13954.seek(j3);
                    } else {
                        unsignedShort = c13954.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c11839.f35319);
                    }
                    if (j2 > 0) {
                        hashSet = hashSet2;
                    } else {
                        hashSet = hashSet2;
                    }
                    c13954.seek(j3);
                } else {
                    hashSet = hashSet2;
                    int i6 = c13954.f31330 + this.f23532;
                    byte[] bArr = new byte[(int) j];
                    c13954.readFully(bArr);
                    long j4 = j3;
                    C6194 c6194 = new C6194(i6, bArr, unsignedShort3, i3);
                    HashMap map = mapArr[i];
                    String str2 = c11839.f35319;
                    map.put(str2, c6194);
                    if ("DNGVersion".equals(str2)) {
                        this.f23542 = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && c6194.m17120(this.f23539).contains("PENTAX")) || ("Compression".equals(str2) && c6194.m17119(this.f23539) == 65535)) {
                        this.f23542 = 8;
                    }
                    if (c13954.f31330 != j4) {
                        c13954.seek(j4);
                    }
                }
            } else {
                c13954.seek(j3);
                hashSet = hashSet2;
            }
            s4 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s3 = s;
        }
        HashSet hashSet4 = hashSet2;
        int i7 = c13954.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j5 = i7;
        if (j5 <= 0 || hashSet4.contains(Integer.valueOf(i7))) {
            return;
        }
        c13954.seek(j5);
        if (mapArr[4].isEmpty()) {
            m20372(c13954, 4);
        } else if (mapArr[5].isEmpty()) {
            m20372(c13954, 5);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20357(int i, int i2) {
        HashMap[] mapArr = this.f23538;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C6194 c6194 = (C6194) mapArr[i].get("ImageLength");
        C6194 c6195 = (C6194) mapArr[i].get("ImageWidth");
        C6194 c6196 = (C6194) mapArr[i2].get("ImageLength");
        C6194 c6197 = (C6194) mapArr[i2].get("ImageWidth");
        if (c6194 == null || c6195 == null || c6196 == null || c6197 == null) {
            return;
        }
        int iM17119 = c6194.m17119(this.f23539);
        int iM171110 = c6195.m17119(this.f23539);
        int iM171111 = c6196.m17119(this.f23539);
        int iM171112 = c6197.m17119(this.f23539);
        if (iM17119 >= iM171111 || iM171110 >= iM171112) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20358(int i, String str, String str2) {
        HashMap[] mapArr = this.f23538;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (C6194) map.get(str));
        mapArr[i].remove(str);
    }
}
