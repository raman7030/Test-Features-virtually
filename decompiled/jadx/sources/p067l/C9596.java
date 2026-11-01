package p067l;

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
import com.umeng.analytics.pro.C0698cb;
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
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۟ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C9596 {

    /* JADX INFO: renamed from: ֨ */
    public static final C13620[] f26410;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final SimpleDateFormat f26412;

    /* JADX INFO: renamed from: ۘ */
    public static final Charset f26414;

    /* JADX INFO: renamed from: ۚ */
    public static final byte[] f26416;

    /* JADX INFO: renamed from: ۛ */
    public static final String[] f26417;

    /* JADX INFO: renamed from: ۠ */
    public static final C13620[][] f26420;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final HashMap[] f26421;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final HashMap[] f26422;

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f26423;

    /* JADX INFO: renamed from: ۫ */
    public static final byte[] f26426;

    /* JADX INFO: renamed from: ۬ */
    public static final byte[] f26427;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final SimpleDateFormat f26431;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final Set f26432;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final C13620 f26433;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final HashMap f26438;

    /* JADX INFO: renamed from: ᩺ */
    public static final Pattern f26441;

    /* JADX INFO: renamed from: ֫ */
    public boolean f26443;

    /* JADX INFO: renamed from: ۖ */
    public C8255 f26444;

    /* JADX INFO: renamed from: ۜ */
    public int f26445;

    /* JADX INFO: renamed from: ۡ */
    public int f26446;

    /* JADX INFO: renamed from: ۢ */
    public int f26447;

    /* JADX INFO: renamed from: ۧ */
    public AssetManager.AssetInputStream f26448;

    /* JADX INFO: renamed from: ܳ */
    public boolean f26449;

    /* JADX INFO: renamed from: ܺ */
    public FileDescriptor f26450;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap[] f26451;

    /* JADX INFO: renamed from: ܿ */
    public ByteOrder f26452;

    /* JADX INFO: renamed from: ᩳ */
    public HashSet f26453;

    /* JADX INFO: renamed from: ᩷ */
    public int f26454;

    /* JADX INFO: renamed from: ᩻ */
    public int f26455;

    /* JADX INFO: renamed from: ֡ */
    public static final boolean f26409 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final List f26434 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: ܶ */
    public static final List f26430 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: ᩵ */
    public static final int[] f26436 = {8, 8, 8};

    /* JADX INFO: renamed from: ᩴ */
    public static final int[] f26435 = {8};

    /* JADX INFO: renamed from: ۨ */
    public static final byte[] f26425 = {-1, -40, -1};

    /* JADX INFO: renamed from: ۗ */
    public static final byte[] f26413 = {102, 116, 121, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ۙ */
    public static final byte[] f26415 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: ᩶ */
    public static final byte[] f26437 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: ᩸ */
    public static final byte[] f26439 = {97, 118, 105, 102};

    /* JADX INFO: renamed from: ᩹ */
    public static final byte[] f26440 = {97, 118, 105, 115};

    /* JADX INFO: renamed from: ܰ */
    public static final byte[] f26428 = {79, 76, 89, 77, UTF8.S_P4A, 0};

    /* JADX INFO: renamed from: ۟ */
    public static final byte[] f26419 = {79, 76, 89, 77, UTF8.S_P4A, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: ۧ֫ */
    public static final byte[] f26424 = {-119, UTF8.S_P4A, 78, 71, C0698cb.f2569k, 10, 26, 10};

    /* JADX INFO: renamed from: ֫֫ */
    public static final byte[] f26411 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩻֫ */
    public static final byte[] f26442 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: ۜ֫ */
    public static final byte[] f26418 = {87, 69, 66, UTF8.S_P4A};

    /* JADX INFO: renamed from: ܳ֫ */
    public static final byte[] f26429 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f26417 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f26423 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f26416 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C13620[] c13620Arr = {new C13620("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C13620("SubfileType", 255, 4), new C13620("ImageWidth", 256, 3, 4), new C13620("ImageLength", 257, 3, 4), new C13620("BitsPerSample", 258, 3), new C13620("Compression", 259, 3), new C13620("PhotometricInterpretation", 262, 3), new C13620("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C13620("Make", 271, 2), new C13620("Model", 272, 2), new C13620("StripOffsets", 273, 3, 4), new C13620("Orientation", 274, 3), new C13620("SamplesPerPixel", 277, 3), new C13620("RowsPerStrip", 278, 3, 4), new C13620("StripByteCounts", 279, 3, 4), new C13620("XResolution", 282, 5), new C13620("YResolution", 283, 5), new C13620("PlanarConfiguration", 284, 3), new C13620("ResolutionUnit", 296, 3), new C13620("TransferFunction", 301, 3), new C13620("Software", 305, 2), new C13620("DateTime", 306, 2), new C13620("Artist", 315, 2), new C13620("WhitePoint", 318, 5), new C13620("PrimaryChromaticities", 319, 5), new C13620("SubIFDPointer", 330, 4), new C13620("JPEGInterchangeFormat", 513, 4), new C13620("JPEGInterchangeFormatLength", 514, 4), new C13620("YCbCrCoefficients", 529, 5), new C13620("YCbCrSubSampling", 530, 3), new C13620("YCbCrPositioning", 531, 3), new C13620("ReferenceBlackWhite", 532, 5), new C13620("Copyright", 33432, 2), new C13620("ExifIFDPointer", 34665, 4), new C13620("GPSInfoIFDPointer", 34853, 4), new C13620("SensorTopBorder", 4, 4), new C13620("SensorLeftBorder", 5, 4), new C13620("SensorBottomBorder", 6, 4), new C13620("SensorRightBorder", 7, 4), new C13620("ISO", 23, 3), new C13620("JpgFromRaw", 46, 7), new C13620("Xmp", 700, 1)};
        C13620[] c13620Arr2 = {new C13620("ExposureTime", 33434, 5), new C13620("FNumber", 33437, 5), new C13620("ExposureProgram", 34850, 3), new C13620("SpectralSensitivity", 34852, 2), new C13620("PhotographicSensitivity", 34855, 3), new C13620("OECF", 34856, 7), new C13620("SensitivityType", 34864, 3), new C13620("StandardOutputSensitivity", 34865, 4), new C13620("RecommendedExposureIndex", 34866, 4), new C13620("ISOSpeed", 34867, 4), new C13620("ISOSpeedLatitudeyyy", 34868, 4), new C13620("ISOSpeedLatitudezzz", 34869, 4), new C13620("ExifVersion", UMModuleRegister.INNER_EVENT_VALUE_HIGH, 2), new C13620("DateTimeOriginal", 36867, 2), new C13620("DateTimeDigitized", 36868, 2), new C13620("OffsetTime", 36880, 2), new C13620("OffsetTimeOriginal", 36881, 2), new C13620("OffsetTimeDigitized", 36882, 2), new C13620("ComponentsConfiguration", UMModuleRegister.APPSTATUS_SWITCH_LOW, 7), new C13620("CompressedBitsPerPixel", 37122, 5), new C13620("ShutterSpeedValue", 37377, 10), new C13620("ApertureValue", 37378, 5), new C13620("BrightnessValue", 37379, 10), new C13620("ExposureBiasValue", 37380, 10), new C13620("MaxApertureValue", 37381, 5), new C13620("SubjectDistance", 37382, 5), new C13620("MeteringMode", 37383, 3), new C13620("LightSource", 37384, 3), new C13620("Flash", 37385, 3), new C13620("FocalLength", 37386, 5), new C13620("SubjectArea", 37396, 3), new C13620("MakerNote", 37500, 7), new C13620("UserComment", 37510, 7), new C13620("SubSecTime", 37520, 2), new C13620("SubSecTimeOriginal", 37521, 2), new C13620("SubSecTimeDigitized", 37522, 2), new C13620("FlashpixVersion", 40960, 7), new C13620("ColorSpace", 40961, 3), new C13620("PixelXDimension", 40962, 3, 4), new C13620("PixelYDimension", 40963, 3, 4), new C13620("RelatedSoundFile", 40964, 2), new C13620("InteroperabilityIFDPointer", 40965, 4), new C13620("FlashEnergy", 41483, 5), new C13620("SpatialFrequencyResponse", 41484, 7), new C13620("FocalPlaneXResolution", 41486, 5), new C13620("FocalPlaneYResolution", 41487, 5), new C13620("FocalPlaneResolutionUnit", 41488, 3), new C13620("SubjectLocation", 41492, 3), new C13620("ExposureIndex", 41493, 5), new C13620("SensingMethod", 41495, 3), new C13620("FileSource", 41728, 7), new C13620("SceneType", 41729, 7), new C13620("CFAPattern", 41730, 7), new C13620("CustomRendered", 41985, 3), new C13620("ExposureMode", 41986, 3), new C13620("WhiteBalance", 41987, 3), new C13620("DigitalZoomRatio", 41988, 5), new C13620("FocalLengthIn35mmFilm", 41989, 3), new C13620("SceneCaptureType", 41990, 3), new C13620("GainControl", 41991, 3), new C13620("Contrast", 41992, 3), new C13620("Saturation", 41993, 3), new C13620("Sharpness", 41994, 3), new C13620("DeviceSettingDescription", 41995, 7), new C13620("SubjectDistanceRange", 41996, 3), new C13620("ImageUniqueID", 42016, 2), new C13620("CameraOwnerName", 42032, 2), new C13620("BodySerialNumber", 42033, 2), new C13620("LensSpecification", 42034, 5), new C13620("LensMake", 42035, 2), new C13620("LensModel", 42036, 2), new C13620("Gamma", 42240, 5), new C13620("DNGVersion", 50706, 1), new C13620("DefaultCropSize", 50720, 3, 4)};
        C13620[] c13620Arr3 = {new C13620("GPSVersionID", 0, 1), new C13620("GPSLatitudeRef", 1, 2), new C13620("GPSLatitude", 2, 5, 10), new C13620("GPSLongitudeRef", 3, 2), new C13620("GPSLongitude", 4, 5, 10), new C13620("GPSAltitudeRef", 5, 1), new C13620("GPSAltitude", 6, 5), new C13620("GPSTimeStamp", 7, 5), new C13620("GPSSatellites", 8, 2), new C13620("GPSStatus", 9, 2), new C13620("GPSMeasureMode", 10, 2), new C13620("GPSDOP", 11, 5), new C13620("GPSSpeedRef", 12, 2), new C13620("GPSSpeed", 13, 5), new C13620("GPSTrackRef", 14, 2), new C13620("GPSTrack", 15, 5), new C13620("GPSImgDirectionRef", 16, 2), new C13620("GPSImgDirection", 17, 5), new C13620("GPSMapDatum", 18, 2), new C13620("GPSDestLatitudeRef", 19, 2), new C13620("GPSDestLatitude", 20, 5), new C13620("GPSDestLongitudeRef", 21, 2), new C13620("GPSDestLongitude", 22, 5), new C13620("GPSDestBearingRef", 23, 2), new C13620("GPSDestBearing", 24, 5), new C13620("GPSDestDistanceRef", 25, 2), new C13620("GPSDestDistance", 26, 5), new C13620("GPSProcessingMethod", 27, 7), new C13620("GPSAreaInformation", 28, 7), new C13620("GPSDateStamp", 29, 2), new C13620("GPSDifferential", 30, 3), new C13620("GPSHPositioningError", 31, 5)};
        C13620[] c13620Arr4 = {new C13620("InteroperabilityIndex", 1, 2)};
        C13620[] c13620Arr5 = {new C13620("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C13620("SubfileType", 255, 4), new C13620("ThumbnailImageWidth", 256, 3, 4), new C13620("ThumbnailImageLength", 257, 3, 4), new C13620("BitsPerSample", 258, 3), new C13620("Compression", 259, 3), new C13620("PhotometricInterpretation", 262, 3), new C13620("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C13620("Make", 271, 2), new C13620("Model", 272, 2), new C13620("StripOffsets", 273, 3, 4), new C13620("ThumbnailOrientation", 274, 3), new C13620("SamplesPerPixel", 277, 3), new C13620("RowsPerStrip", 278, 3, 4), new C13620("StripByteCounts", 279, 3, 4), new C13620("XResolution", 282, 5), new C13620("YResolution", 283, 5), new C13620("PlanarConfiguration", 284, 3), new C13620("ResolutionUnit", 296, 3), new C13620("TransferFunction", 301, 3), new C13620("Software", 305, 2), new C13620("DateTime", 306, 2), new C13620("Artist", 315, 2), new C13620("WhitePoint", 318, 5), new C13620("PrimaryChromaticities", 319, 5), new C13620("SubIFDPointer", 330, 4), new C13620("JPEGInterchangeFormat", 513, 4), new C13620("JPEGInterchangeFormatLength", 514, 4), new C13620("YCbCrCoefficients", 529, 5), new C13620("YCbCrSubSampling", 530, 3), new C13620("YCbCrPositioning", 531, 3), new C13620("ReferenceBlackWhite", 532, 5), new C13620("Copyright", 33432, 2), new C13620("ExifIFDPointer", 34665, 4), new C13620("GPSInfoIFDPointer", 34853, 4), new C13620("DNGVersion", 50706, 1), new C13620("DefaultCropSize", 50720, 3, 4)};
        f26433 = new C13620("StripOffsets", 273, 3);
        f26420 = new C13620[][]{c13620Arr, c13620Arr2, c13620Arr3, c13620Arr4, c13620Arr5, c13620Arr, new C13620[]{new C13620("ThumbnailImage", 256, 7), new C13620("CameraSettingsIFDPointer", 8224, 4), new C13620("ImageProcessingIFDPointer", 8256, 4)}, new C13620[]{new C13620("PreviewImageStart", 257, 4), new C13620("PreviewImageLength", 258, 4)}, new C13620[]{new C13620("AspectFrame", 4371, 3)}, new C13620[]{new C13620("ColorSpace", 55, 3)}};
        f26410 = new C13620[]{new C13620("SubIFDPointer", 330, 4), new C13620("ExifIFDPointer", 34665, 4), new C13620("GPSInfoIFDPointer", 34853, 4), new C13620("InteroperabilityIFDPointer", 40965, 4), new C13620("CameraSettingsIFDPointer", 8224, 1), new C13620("ImageProcessingIFDPointer", 8256, 1)};
        f26422 = new HashMap[10];
        f26421 = new HashMap[10];
        f26432 = C21562.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f26438 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f26414 = charsetForName;
        f26427 = "Exif\u0000\u0000".getBytes(charsetForName);
        f26426 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f26431 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C5468.getTimeZone(UtcDates.UTC));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f26412 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(C5468.getTimeZone(UtcDates.UTC));
        int i = 0;
        while (true) {
            C13620[][] c13620Arr6 = f26420;
            if (i < c13620Arr6.length) {
                f26422[i] = new HashMap();
                f26421[i] = new HashMap();
                for (C13620 c13620 : c13620Arr6[i]) {
                    f26422[i].put(Integer.valueOf(c13620.f38325), c13620);
                    f26421[i].put(c13620.f38324, c13620);
                }
                i++;
            } else {
                HashMap map = f26438;
                C13620[] c13620Arr7 = f26410;
                map.put(Integer.valueOf(c13620Arr7[0].f38325), 5);
                map.put(Integer.valueOf(c13620Arr7[1].f38325), 1);
                map.put(Integer.valueOf(c13620Arr7[2].f38325), 2);
                map.put(Integer.valueOf(c13620Arr7[3].f38325), 3);
                map.put(Integer.valueOf(c13620Arr7[4].f38325), 7);
                map.put(Integer.valueOf(c13620Arr7[5].f38325), 8);
                f26441 = Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C9596(InputStream inputStream, int i) {
        C13620[][] c13620Arr = f26420;
        this.f26451 = new HashMap[c13620Arr.length];
        this.f26453 = new HashSet(c13620Arr.length);
        this.f26452 = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z = i == 1;
        this.f26449 = z;
        if (z) {
            this.f26448 = null;
            this.f26450 = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f26448 = (AssetManager.AssetInputStream) inputStream;
            this.f26450 = null;
        } else if (!(inputStream instanceof FileInputStream)) {
            this.f26448 = null;
            this.f26450 = null;
        } else {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f26448 = null;
                this.f26450 = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f26448 = null;
                this.f26450 = null;
            }
        }
        boolean z2 = this.f26449;
        boolean z3 = f26409;
        for (int i2 = 0; i2 < c13620Arr.length; i2++) {
            try {
                try {
                    this.f26451[i2] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused2) {
                    m22347();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m22347();
                if (z3) {
                    m22346();
                }
                throw th;
            }
        }
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, OpenAuthTask.Duplex);
            this.f26455 = m22334(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i3 = this.f26455;
        if (i3 != 4 && i3 != 9 && i3 != 13 && i3 != 14) {
            C15630 c15630 = new C15630(inputStream);
            if (z2) {
                if (!m22360(c15630)) {
                    m22347();
                    if (!z3) {
                        return;
                    }
                }
                m22346();
            }
            int i4 = this.f26455;
            if (i4 == 12 || i4 == 15) {
                m22343(c15630, i4);
            } else if (i4 == 7) {
                m22342(c15630);
            } else if (i4 == 10) {
                m22355(c15630);
            } else {
                m22350(c15630);
            }
            c15630.seek(this.f26445);
            m22357((C12279) c15630);
        } else {
            C12279 c12279 = new C12279(inputStream);
            int i5 = this.f26455;
            if (i5 == 4) {
                m22340(c12279, 0, 0);
            } else if (i5 == 13) {
                m22339(c12279);
            } else if (i5 == 9) {
                m22349(c12279);
            } else if (i5 == 14) {
                m22354(c12279);
            }
        }
        m22347();
        if (!z3) {
            return;
        }
        m22346();
    }

    /* JADX INFO: renamed from: ۧ */
    private C8255 m22348(String str) {
        C8255 c8255;
        int i;
        C8255 c8256;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f26455) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c8256 = this.f26444) != null)) {
            return c8256;
        }
        for (int i2 = 0; i2 < f26420.length; i2++) {
            C8255 c8257 = (C8255) this.f26451[i2].get(str);
            if (c8257 != null) {
                return c8257;
            }
        }
        if (!"Xmp".equals(str) || (c8255 = this.f26444) == null) {
            return null;
        }
        return c8255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m22364(String str) {
        C8255 c8255M22348 = m22348(str);
        if (c8255M22348 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = c8255M22348.f21863;
                if (i == 5 || i == 10) {
                    C24348[] c24348Arr = (C24348[]) c8255M22348.m19053(this.f26452);
                    if (c24348Arr == null || c24348Arr.length != 3) {
                        Arrays.toString(c24348Arr);
                        return null;
                    }
                    C24348 c24348 = c24348Arr[0];
                    Integer numValueOf = Integer.valueOf((int) (c24348.f77120 / c24348.f77119));
                    C24348 c24349 = c24348Arr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (c24349.f77120 / c24349.f77119));
                    C24348 c243410 = c24348Arr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c243410.f77120 / c243410.f77119)));
                }
            } else if (f26432.contains(str)) {
                try {
                    return Double.toString(c8255M22348.m19050(this.f26452));
                } catch (NumberFormatException unused) {
                }
            } else {
                return c8255M22348.m19052(this.f26452);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m22363() {
        C8255 c8255M22348 = m22348("Orientation");
        if (c8255M22348 == null) {
            return 1;
        }
        try {
            return c8255M22348.m19051(this.f26452);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m22346() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f26451;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C8255 c8255 = (C8255) entry.getValue();
                c8255.toString();
                c8255.m19052(this.f26452);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Long m22365() {
        return m22335(m22364("DateTime"), m22364("SubSecTime"), m22364("OffsetTime"));
    }

    /* JADX INFO: renamed from: ܽ */
    public final Long m22366() {
        return m22335(m22364("DateTimeDigitized"), m22364("SubSecTimeDigitized"), m22364("OffsetTimeDigitized"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Long m22368() {
        return m22335(m22364("DateTimeOriginal"), m22364("SubSecTimeOriginal"), m22364("OffsetTimeOriginal"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Long m22335(String str, String str2, String str3) {
        long j;
        if (str != null && f26441.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f26431.parse(str, parsePosition);
                if (date == null && (date = f26412.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i = Integer.parseInt(str3.substring(1, 3));
                    int i2 = Integer.parseInt(str3.substring(4, 6));
                    if ((BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i <= 14) {
                        time += (long) (C6316.m14441(i, 60, i2, 60000) * ("-".equals(strSubstring) ? 1 : -1));
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

    /* JADX INFO: renamed from: ܿ */
    public final Long m22367() {
        String strM22364 = m22364("GPSDateStamp");
        String strM22365 = m22364("GPSTimeStamp");
        if (strM22364 == null || strM22365 == null) {
            return null;
        }
        Pattern pattern = f26441;
        if (!pattern.matcher(strM22364).matches() && !pattern.matcher(strM22365).matches()) {
            return null;
        }
        String str = strM22364 + ' ' + strM22365;
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            Date date = f26431.parse(str, parsePosition);
            if (date == null && (date = f26412.parse(str, parsePosition)) == null) {
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
    /* JADX INFO: renamed from: ֫ */
    private int m22334(BufferedInputStream bufferedInputStream) throws Throwable {
        C12279 c12279;
        int i;
        C12279 c122710;
        boolean z;
        C12279 c122711;
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
            byte[] bArr5 = f26425;
            if (i5 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i5] != bArr5[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr4[i6] != bytes[i6]) {
                        try {
                            c12279 = new C12279(bArr4);
                            try {
                                long j2 = c12279.readInt();
                                byte[] bArr6 = new byte[4];
                                c12279.readFully(bArr6);
                                if (Arrays.equals(bArr6, f26413)) {
                                    if (j2 == 1) {
                                        j2 = c12279.readLong();
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
                                                    c12279.readFully(bArr7);
                                                    if (j5 != 1) {
                                                        if (Arrays.equals(bArr7, f26415)) {
                                                            z5 = true;
                                                        } else if (Arrays.equals(bArr7, f26437)) {
                                                            z6 = true;
                                                        } else if (Arrays.equals(bArr7, f26439) || Arrays.equals(bArr7, f26440)) {
                                                            z7 = true;
                                                        }
                                                        if (z5) {
                                                            if (z6) {
                                                                c12279.close();
                                                                i = 12;
                                                            } else if (z7) {
                                                                c12279.close();
                                                                i = 15;
                                                            }
                                                            if (i != 0) {
                                                                return i;
                                                            }
                                                            try {
                                                                c122710 = new C12279(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM22359 = m22359(c122710);
                                                                    this.f26452 = byteOrderM22359;
                                                                    c122710.m28301(byteOrderM22359);
                                                                    s = c122710.readShort();
                                                                    if (s != 20306 || s == 21330) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    c122710.close();
                                                                } catch (Exception unused) {
                                                                    if (c122710 != null) {
                                                                        c122710.close();
                                                                    }
                                                                    z = false;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (c122710 != null) {
                                                                        c122710.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                                c122710 = null;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                c122710 = null;
                                                            }
                                                            if (z) {
                                                                return 7;
                                                            }
                                                            try {
                                                                c122711 = new C12279(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM223510 = m22359(c122711);
                                                                    this.f26452 = byteOrderM223510;
                                                                    c122711.m28301(byteOrderM223510);
                                                                    if (c122711.readShort() == 85) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c122711.close();
                                                                } catch (Exception unused3) {
                                                                    if (c122711 != null) {
                                                                        c122711.close();
                                                                    }
                                                                    z2 = false;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    if (c122711 != null) {
                                                                        c122711.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused4) {
                                                                c122711 = null;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                c122711 = null;
                                                            }
                                                            if (z2) {
                                                                return 10;
                                                            }
                                                            i2 = 0;
                                                            while (true) {
                                                                bArr = f26424;
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
                                                                bArr2 = f26442;
                                                                if (i3 >= bArr2.length) {
                                                                    i4 = 0;
                                                                    while (true) {
                                                                        bArr3 = f26418;
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
                                                    c12279.close();
                                                    i = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused6) {
                                if (c12279 != null) {
                                }
                                i = 0;
                                if (i != 0) {
                                    return i;
                                }
                                c122710 = new C12279(bArr4);
                                ByteOrder byteOrderM223511 = m22359(c122710);
                                this.f26452 = byteOrderM223511;
                                c122710.m28301(byteOrderM223511);
                                s = c122710.readShort();
                                if (s != 20306) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                c122710.close();
                                if (z) {
                                    return 7;
                                }
                                c122711 = new C12279(bArr4);
                                ByteOrder byteOrderM223512 = m22359(c122711);
                                this.f26452 = byteOrderM223512;
                                c122711.m28301(byteOrderM223512);
                                if (c122711.readShort() == 85) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c122711.close();
                                if (z2) {
                                    return 10;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr = f26424;
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
                                    bArr2 = f26442;
                                    if (i3 >= bArr2.length) {
                                        i4 = 0;
                                        while (true) {
                                            bArr3 = f26418;
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
                                if (c12279 != null) {
                                    c12279.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            c12279 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c12279 = null;
                        }
                        c12279.close();
                        i = 0;
                        if (i != 0) {
                            return i;
                        }
                        c122710 = new C12279(bArr4);
                        ByteOrder byteOrderM223513 = m22359(c122710);
                        this.f26452 = byteOrderM223513;
                        c122710.m28301(byteOrderM223513);
                        s = c122710.readShort();
                        if (s != 20306) {
                            z = true;
                        } else {
                            z = true;
                        }
                        c122710.close();
                        if (z) {
                            return 7;
                        }
                        c122711 = new C12279(bArr4);
                        ByteOrder byteOrderM223514 = m22359(c122711);
                        this.f26452 = byteOrderM223514;
                        c122711.m28301(byteOrderM223514);
                        if (c122711.readShort() == 85) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c122711.close();
                        if (z2) {
                            return 10;
                        }
                        i2 = 0;
                        while (true) {
                            bArr = f26424;
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
                            bArr2 = f26442;
                            if (i3 >= bArr2.length) {
                                i4 = 0;
                                while (true) {
                                    bArr3 = f26418;
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
    /* JADX INFO: renamed from: ֫ */
    private void m22340(p067l.C12279 r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C9596.m22340(l.ۤܿ֫, int, int):void");
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22350(C15630 c15630) throws IOException {
        m22358(c15630);
        m22351(c15630, 0);
        m22356(c15630, 0);
        m22356(c15630, 5);
        m22356(c15630, 4);
        m22353();
        if (this.f26455 == 8) {
            HashMap[] mapArr = this.f26451;
            C8255 c8255 = (C8255) mapArr[1].get("MakerNote");
            if (c8255 != null) {
                C15630 c15631 = new C15630(c8255.f21861);
                c15631.m28301(this.f26452);
                c15631.m28300(6);
                m22351(c15631, 9);
                C8255 c8256 = (C8255) mapArr[9].get("ColorSpace");
                if (c8256 != null) {
                    mapArr[1].put("ColorSpace", c8256);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22349(C12279 c12279) throws IOException {
        if (f26409) {
            C12826.toString(c12279);
        }
        c12279.m28300(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c12279.readFully(bArr);
        c12279.readFully(bArr2);
        c12279.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c12279.m28300(i - c12279.f34294);
        c12279.readFully(bArr4);
        m22340(new C12279(bArr4), i, 5);
        c12279.m28300(i3 - c12279.f34294);
        c12279.m28301(ByteOrder.BIG_ENDIAN);
        int i4 = c12279.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c12279.readUnsignedShort();
            int unsignedShort2 = c12279.readUnsignedShort();
            if (unsignedShort == f26433.f38325) {
                short s = c12279.readShort();
                short s2 = c12279.readShort();
                C8255 c8255M19046 = C8255.m19046((int) s, this.f26452);
                C8255 c8255M19047 = C8255.m19046((int) s2, this.f26452);
                HashMap[] mapArr = this.f26451;
                mapArr[0].put("ImageLength", c8255M19046);
                mapArr[0].put("ImageWidth", c8255M19047);
                return;
            }
            c12279.m28300(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22343(C15630 c15630, int i) {
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
                C4152.m8416(mediaMetadataRetriever, new C14290(c15630));
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
                HashMap[] mapArr = this.f26451;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C8255.m19046(Integer.parseInt(strExtractMetadata), this.f26452));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", C8255.m19046(Integer.parseInt(strExtractMetadata3), this.f26452));
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
                    mapArr[0].put("Orientation", C8255.m19046(i2, this.f26452));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c15630.seek(i5);
                    byte[] bArr = new byte[6];
                    c15630.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f26427)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    c15630.readFully(bArr2);
                    this.f26445 = i7;
                    m22338(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    c15630.seek(j);
                    byte[] bArr3 = new byte[i10];
                    c15630.readFully(bArr3);
                    this.f26444 = new C8255(j, bArr3, 1, i10);
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

    /* JADX INFO: renamed from: ᩳ */
    private boolean m22360(C15630 c15630) throws IOException {
        byte[] bArr = f26427;
        byte[] bArr2 = new byte[bArr.length];
        c15630.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = c15630.f34297.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 != -1) {
                i += i2;
                c15630.f34294 += i2;
            } else {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.f26445 = bArr.length;
                m22338(0, bArrCopyOf2);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22342(C15630 c15630) throws IOException {
        int i;
        int i2;
        m22350(c15630);
        HashMap[] mapArr = this.f26451;
        C8255 c8255 = (C8255) mapArr[1].get("MakerNote");
        if (c8255 != null) {
            C15630 c15631 = new C15630(c8255.f21861);
            c15631.m28301(this.f26452);
            byte[] bArr = f26428;
            byte[] bArr2 = new byte[bArr.length];
            c15631.readFully(bArr2);
            c15631.seek(0L);
            byte[] bArr3 = f26419;
            byte[] bArr4 = new byte[bArr3.length];
            c15631.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c15631.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c15631.seek(12L);
            }
            m22351(c15631, 6);
            C8255 c8256 = (C8255) mapArr[7].get("PreviewImageStart");
            C8255 c8257 = (C8255) mapArr[7].get("PreviewImageLength");
            if (c8256 != null && c8257 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c8256);
                mapArr[5].put("JPEGInterchangeFormatLength", c8257);
            }
            C8255 c8258 = (C8255) mapArr[8].get("AspectFrame");
            if (c8258 != null) {
                int[] iArr = (int[]) c8258.m19053(this.f26452);
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
                C8255 c8255M19046 = C8255.m19046(i5, this.f26452);
                C8255 c8255M19047 = C8255.m19046(i6, this.f26452);
                mapArr[0].put("ImageWidth", c8255M19046);
                mapArr[0].put("ImageLength", c8255M19047);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22355(C15630 c15630) throws IOException {
        if (f26409) {
            C12826.toString(c15630);
        }
        m22350(c15630);
        HashMap[] mapArr = this.f26451;
        C8255 c8255 = (C8255) mapArr[0].get("JpgFromRaw");
        if (c8255 != null) {
            m22340(new C12279(c8255.f21861), (int) c8255.f21862, 5);
        }
        C8255 c8256 = (C8255) mapArr[0].get("ISO");
        C8255 c8257 = (C8255) mapArr[1].get("PhotographicSensitivity");
        if (c8256 == null || c8257 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c8256);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22339(C12279 c12279) throws IOException {
        if (f26409) {
            C12826.toString(c12279);
        }
        c12279.m28301(ByteOrder.BIG_ENDIAN);
        int i = c12279.f34294;
        c12279.m28300(f26424.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int i2 = c12279.readInt();
                int i3 = c12279.readInt();
                int i4 = c12279.f34294;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z) {
                    this.f26445 = i6;
                    byte[] bArr = new byte[i2];
                    c12279.readFully(bArr);
                    int i7 = c12279.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m22338(0, bArr);
                    m22353();
                    m22357(new C12279(bArr));
                    z = true;
                } else if (i3 == 1767135348 && !z2) {
                    byte[] bArr2 = f26411;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c12279.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = c12279.f34294 - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            c12279.readFully(bArr4);
                            this.f26444 = new C8255(i8, bArr4, 1, i9);
                            z2 = true;
                        }
                    }
                }
                c12279.m28300(i5 - c12279.f34294);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22354(C12279 c12279) throws IOException {
        if (f26409) {
            C12826.toString(c12279);
        }
        c12279.m28301(ByteOrder.LITTLE_ENDIAN);
        c12279.m28300(f26442.length);
        int i = c12279.readInt() + 8;
        byte[] bArr = f26418;
        c12279.m28300(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c12279.readFully(bArr2);
                int i2 = c12279.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f26429, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    c12279.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f26427;
                    if (C12870.m29497(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.f26445 = i3;
                    m22338(0, bArrCopyOfRange);
                    m22357(new C12279(bArrCopyOfRange));
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
                c12279.m28300(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22338(int i, byte[] bArr) throws IOException {
        C15630 c15630 = new C15630(bArr);
        m22358(c15630);
        m22351(c15630, i);
    }

    /* JADX INFO: renamed from: ۢ */
    private void m22347() {
        String strM22364 = m22364("DateTimeOriginal");
        HashMap[] mapArr = this.f26451;
        if (strM22364 != null && m22364("DateTime") == null) {
            mapArr[0].put("DateTime", C8255.m19048(strM22364));
        }
        if (m22364("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C8255.m19047(0L, this.f26452));
        }
        if (m22364("ImageLength") == null) {
            mapArr[0].put("ImageLength", C8255.m19047(0L, this.f26452));
        }
        if (m22364("Orientation") == null) {
            mapArr[0].put("Orientation", C8255.m19047(0L, this.f26452));
        }
        if (m22364("LightSource") == null) {
            mapArr[1].put("LightSource", C8255.m19047(0L, this.f26452));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ByteOrder m22359(C12279 c12279) throws IOException {
        short s = c12279.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(C1514.m34687(new StringBuilder("Invalid byte order: "), s));
    }

    /* JADX INFO: renamed from: ܿ */
    private void m22358(C15630 c15630) throws IOException {
        ByteOrder byteOrderM22359 = m22359((C12279) c15630);
        this.f26452 = byteOrderM22359;
        c15630.m28301(byteOrderM22359);
        int unsignedShort = c15630.readUnsignedShort();
        int i = this.f26455;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException(C1514.m34687(new StringBuilder("Invalid start code: "), unsignedShort));
        }
        int i2 = c15630.readInt();
        if (i2 < 8) {
            throw new IOException(C20778.m46922(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c15630.m28300(i3);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m22357(C12279 c12279) throws IOException {
        C8255 c8255;
        HashMap map = this.f26451[4];
        C8255 c8256 = (C8255) map.get("Compression");
        if (c8256 != null) {
            int iM19051 = c8256.m19051(this.f26452);
            if (iM19051 != 1) {
                if (iM19051 == 6) {
                    m22341(c12279, map);
                    return;
                } else if (iM19051 != 7) {
                    return;
                }
            }
            C8255 c8257 = (C8255) map.get("BitsPerSample");
            if (c8257 != null) {
                int[] iArr = (int[]) c8257.m19053(this.f26452);
                int[] iArr2 = f26436;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f26455 != 3 || (c8255 = (C8255) map.get("PhotometricInterpretation")) == null) {
                        return;
                    }
                    int iM19052 = c8255.m19051(this.f26452);
                    if ((iM19052 != 1 || !Arrays.equals(iArr, f26435)) && (iM19052 != 6 || !Arrays.equals(iArr, iArr2))) {
                        return;
                    }
                }
                C8255 c8258 = (C8255) map.get("StripOffsets");
                C8255 c8259 = (C8255) map.get("StripByteCounts");
                if (c8258 == null || c8259 == null) {
                    return;
                }
                long[] jArrM29498 = C12870.m29498(c8258.m19053(this.f26452));
                long[] jArrM29499 = C12870.m29498(c8259.m19053(this.f26452));
                if (jArrM29498 == null || jArrM29498.length == 0 || jArrM29499 == null || jArrM29499.length == 0 || jArrM29498.length != jArrM29499.length) {
                    return;
                }
                long j = 0;
                for (long j2 : jArrM29499) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f26443 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM29498.length; i3++) {
                    int i4 = (int) jArrM29498[i3];
                    int i5 = (int) jArrM29499[i3];
                    if (i3 < jArrM29498.length - 1 && i4 + i5 != jArrM29498[i3 + 1]) {
                        this.f26443 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        return;
                    }
                    try {
                        c12279.m28300(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        c12279.readFully(bArr2);
                        i = i7 + i5;
                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                        i2 += i5;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                if (this.f26443) {
                    long j3 = jArrM29498[0];
                    return;
                }
                return;
            }
            return;
        }
        m22341(c12279, map);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22341(C12279 c12279, HashMap map) throws IOException {
        C8255 c8255 = (C8255) map.get("JPEGInterchangeFormat");
        C8255 c8256 = (C8255) map.get("JPEGInterchangeFormatLength");
        if (c8255 == null || c8256 == null) {
            return;
        }
        int iM19051 = c8255.m19051(this.f26452);
        int iM19052 = c8256.m19051(this.f26452);
        if (this.f26455 == 7) {
            iM19051 += this.f26454;
        }
        if (iM19051 <= 0 || iM19052 <= 0 || this.f26448 != null || this.f26450 != null) {
            return;
        }
        c12279.m28300(iM19051);
        c12279.readFully(new byte[iM19052]);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22344(HashMap map) {
        C8255 c8255 = (C8255) map.get("ImageLength");
        C8255 c8256 = (C8255) map.get("ImageWidth");
        if (c8255 == null || c8256 == null) {
            return false;
        }
        return c8255.m19051(this.f26452) <= 512 && c8256.m19051(this.f26452) <= 512;
    }

    /* JADX INFO: renamed from: ܺ */
    private void m22353() {
        m22336(0, 5);
        m22336(0, 4);
        m22336(5, 4);
        HashMap[] mapArr = this.f26451;
        C8255 c8255 = (C8255) mapArr[1].get("PixelXDimension");
        C8255 c8256 = (C8255) mapArr[1].get("PixelYDimension");
        if (c8255 != null && c8256 != null) {
            mapArr[0].put("ImageWidth", c8255);
            mapArr[0].put("ImageLength", c8256);
        }
        if (mapArr[4].isEmpty() && m22344(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m22344(mapArr[4]);
        m22337(0, "ThumbnailOrientation", "Orientation");
        m22337(0, "ThumbnailImageLength", "ImageLength");
        m22337(0, "ThumbnailImageWidth", "ImageWidth");
        m22337(5, "ThumbnailOrientation", "Orientation");
        m22337(5, "ThumbnailImageLength", "ImageLength");
        m22337(5, "ThumbnailImageWidth", "ImageWidth");
        m22337(4, "Orientation", "ThumbnailOrientation");
        m22337(4, "ImageLength", "ThumbnailImageLength");
        m22337(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22356(C15630 c15630, int i) throws IOException {
        C8255 c8255M19046;
        C8255 c8255M19047;
        HashMap[] mapArr = this.f26451;
        C8255 c8255 = (C8255) mapArr[i].get("DefaultCropSize");
        C8255 c8256 = (C8255) mapArr[i].get("SensorTopBorder");
        C8255 c8257 = (C8255) mapArr[i].get("SensorLeftBorder");
        C8255 c8258 = (C8255) mapArr[i].get("SensorBottomBorder");
        C8255 c8259 = (C8255) mapArr[i].get("SensorRightBorder");
        if (c8255 != null) {
            if (c8255.f21863 == 5) {
                C24348[] c24348Arr = (C24348[]) c8255.m19053(this.f26452);
                if (c24348Arr == null || c24348Arr.length != 2) {
                    Arrays.toString(c24348Arr);
                    return;
                } else {
                    c8255M19046 = C8255.m19049(c24348Arr[0], this.f26452);
                    c8255M19047 = C8255.m19049(c24348Arr[1], this.f26452);
                }
            } else {
                int[] iArr = (int[]) c8255.m19053(this.f26452);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c8255M19046 = C8255.m19046(iArr[0], this.f26452);
                    c8255M19047 = C8255.m19046(iArr[1], this.f26452);
                }
            }
            mapArr[i].put("ImageWidth", c8255M19046);
            mapArr[i].put("ImageLength", c8255M19047);
            return;
        }
        if (c8256 == null || c8257 == null || c8258 == null || c8259 == null) {
            C8255 c82510 = (C8255) mapArr[i].get("ImageLength");
            C8255 c82511 = (C8255) mapArr[i].get("ImageWidth");
            if (c82510 == null || c82511 == null) {
                C8255 c82512 = (C8255) mapArr[i].get("JPEGInterchangeFormat");
                C8255 c82513 = (C8255) mapArr[i].get("JPEGInterchangeFormatLength");
                if (c82512 == null || c82513 == null) {
                    return;
                }
                int iM19051 = c82512.m19051(this.f26452);
                int iM19052 = c82512.m19051(this.f26452);
                c15630.seek(iM19051);
                byte[] bArr = new byte[iM19052];
                c15630.readFully(bArr);
                m22340(new C12279(bArr), iM19051, i);
                return;
            }
            return;
        }
        int iM19053 = c8256.m19051(this.f26452);
        int iM19054 = c8258.m19051(this.f26452);
        int iM19055 = c8259.m19051(this.f26452);
        int iM19056 = c8257.m19051(this.f26452);
        if (iM19054 <= iM19053 || iM19055 <= iM19056) {
            return;
        }
        C8255 c8255M19048 = C8255.m19046(iM19054 - iM19053, this.f26452);
        C8255 c8255M19049 = C8255.m19046(iM19055 - iM19056, this.f26452);
        mapArr[i].put("ImageLength", c8255M19048);
        mapArr[i].put("ImageWidth", c8255M19049);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX INFO: renamed from: ۧ */
    private void m22351(C15630 c15630, int i) throws IOException {
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
        Integer numValueOf = Integer.valueOf(c15630.f34294);
        HashSet hashSet2 = this.f26453;
        hashSet2.add(numValueOf);
        short s3 = c15630.readShort();
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            z = f26409;
            mapArr = this.f26451;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c15630.readUnsignedShort();
            int unsignedShort3 = c15630.readUnsignedShort();
            int i3 = c15630.readInt();
            long j3 = ((long) c15630.f34294) + 4;
            C13620 c13620 = (C13620) f26422[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c13620 != null ? c13620.f38324 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            }
            if (c13620 != null && unsignedShort3 > 0) {
                int[] iArr = f26423;
                if (unsignedShort3 >= iArr.length) {
                    s = s3;
                    s2 = s4;
                } else {
                    int i4 = c13620.f38326;
                    s = s3;
                    if (i4 == 7 || unsignedShort3 == 7 || i4 == unsignedShort3 || (i2 = c13620.f38327) == unsignedShort3) {
                        s2 = s4;
                    } else {
                        s2 = s4;
                        if (((i4 != 4 && i2 != 4) || unsignedShort3 != 3) && (((i4 != 9 && i2 != 9) || unsignedShort3 != 8) && ((i4 != 12 && i2 != 12) || unsignedShort3 != 11))) {
                            if (z) {
                                String str = f26417[unsignedShort3];
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
                    int i5 = c15630.readInt();
                    if (this.f26455 == 7) {
                        if ("MakerNote".equals(c13620.f38324)) {
                            this.f26454 = i5;
                        } else if (i == 6 && "ThumbnailImage".equals(c13620.f38324)) {
                            this.f26446 = i5;
                            this.f26447 = i3;
                            C8255 c8255M19046 = C8255.m19046(6, this.f26452);
                            C8255 c8255M19047 = C8255.m19047(this.f26446, this.f26452);
                            C8255 c8255M19048 = C8255.m19047(this.f26447, this.f26452);
                            mapArr[4].put("Compression", c8255M19046);
                            mapArr[4].put("JPEGInterchangeFormat", c8255M19047);
                            mapArr[4].put("JPEGInterchangeFormatLength", c8255M19048);
                        }
                    }
                    c15630.seek(i5);
                } else {
                    j3 = j3;
                }
                Integer num = (Integer) f26438.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) c15630.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c15630.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c15630.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c13620.f38324);
                        }
                        if (j2 > 0 || (c15630.length() != -1 && j2 >= c15630.length())) {
                            hashSet = hashSet2;
                        } else {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                c15630.seek(j2);
                                m22351(c15630, num.intValue());
                            }
                        }
                        c15630.seek(j3);
                    } else {
                        unsignedShort = c15630.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c13620.f38324);
                    }
                    if (j2 > 0) {
                        hashSet = hashSet2;
                    } else {
                        hashSet = hashSet2;
                    }
                    c15630.seek(j3);
                } else {
                    hashSet = hashSet2;
                    int i6 = c15630.f34294 + this.f26445;
                    byte[] bArr = new byte[(int) j];
                    c15630.readFully(bArr);
                    long j4 = j3;
                    C8255 c8255 = new C8255(i6, bArr, unsignedShort3, i3);
                    HashMap map = mapArr[i];
                    String str2 = c13620.f38324;
                    map.put(str2, c8255);
                    if ("DNGVersion".equals(str2)) {
                        this.f26455 = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && c8255.m19052(this.f26452).contains("PENTAX")) || ("Compression".equals(str2) && c8255.m19051(this.f26452) == 65535)) {
                        this.f26455 = 8;
                    }
                    if (c15630.f34294 != j4) {
                        c15630.seek(j4);
                    }
                }
            } else {
                c15630.seek(j3);
                hashSet = hashSet2;
            }
            s4 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s3 = s;
        }
        HashSet hashSet4 = hashSet2;
        int i7 = c15630.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j5 = i7;
        if (j5 <= 0 || hashSet4.contains(Integer.valueOf(i7))) {
            return;
        }
        c15630.seek(j5);
        if (mapArr[4].isEmpty()) {
            m22351(c15630, 4);
        } else if (mapArr[5].isEmpty()) {
            m22351(c15630, 5);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22336(int i, int i2) {
        HashMap[] mapArr = this.f26451;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C8255 c8255 = (C8255) mapArr[i].get("ImageLength");
        C8255 c8256 = (C8255) mapArr[i].get("ImageWidth");
        C8255 c8257 = (C8255) mapArr[i2].get("ImageLength");
        C8255 c8258 = (C8255) mapArr[i2].get("ImageWidth");
        if (c8255 == null || c8256 == null || c8257 == null || c8258 == null) {
            return;
        }
        int iM19051 = c8255.m19051(this.f26452);
        int iM19052 = c8256.m19051(this.f26452);
        int iM19053 = c8257.m19051(this.f26452);
        int iM19054 = c8258.m19051(this.f26452);
        if (iM19051 >= iM19053 || iM19052 >= iM19054) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22337(int i, String str, String str2) {
        HashMap[] mapArr = this.f26451;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (C8255) map.get(str));
        mapArr[i].remove(str);
    }
}
