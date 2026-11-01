package p067l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ܽ᩸ */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes4.dex */
public class C1680 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֡ */
    public int f55065;

    /* JADX INFO: renamed from: ֡֫ */
    public int f55066;

    /* JADX INFO: renamed from: ֨ */
    public int f55067;

    /* JADX INFO: renamed from: ֨֫ */
    public int f55068;

    /* JADX INFO: renamed from: ֫ */
    public int f55069;

    /* JADX INFO: renamed from: ֫֫ */
    public int f55070;

    /* JADX INFO: renamed from: ۖ */
    public int f55071;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f55072;

    /* JADX INFO: renamed from: ۗ */
    public int f55073;

    /* JADX INFO: renamed from: ۗ֫ */
    public float f55074;

    /* JADX INFO: renamed from: ۘ */
    public int f55075;

    /* JADX INFO: renamed from: ۘ֫ */
    public float f55076;

    /* JADX INFO: renamed from: ۙ */
    public float f55077;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f55078;

    /* JADX INFO: renamed from: ۚ */
    public int f55079;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f55080;

    /* JADX INFO: renamed from: ۛ */
    public boolean f55081;

    /* JADX INFO: renamed from: ۛ֫ */
    public C1591 f55082;

    /* JADX INFO: renamed from: ۜ */
    public boolean f55083;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f55084;

    /* JADX INFO: renamed from: ۟ */
    public int f55085;

    /* JADX INFO: renamed from: ۠ */
    public int f55086;

    /* JADX INFO: renamed from: ۠֫ */
    public int f55087;

    /* JADX INFO: renamed from: ۡ */
    public int f55088;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f55089;

    /* JADX INFO: renamed from: ۢ */
    public String f55090;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f55091;

    /* JADX INFO: renamed from: ۤ */
    public boolean f55092;

    /* JADX INFO: renamed from: ۤ֫ */
    public float f55093;

    /* JADX INFO: renamed from: ۧ */
    public int f55094;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f55095;

    /* JADX INFO: renamed from: ۨ */
    public boolean f55096;

    /* JADX INFO: renamed from: ۫ */
    public float f55097;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f55098;

    /* JADX INFO: renamed from: ۬ */
    public boolean f55099;

    /* JADX INFO: renamed from: ۬֫ */
    public int f55100;

    /* JADX INFO: renamed from: ܰ */
    public int f55101;

    /* JADX INFO: renamed from: ܳ */
    public int f55102;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f55103;

    /* JADX INFO: renamed from: ܶ */
    public int f55104;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f55105;

    /* JADX INFO: renamed from: ܺ */
    public int f55106;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f55107;

    /* JADX INFO: renamed from: ܽ */
    public int f55108;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f55109;

    /* JADX INFO: renamed from: ܿ */
    public int f55110;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f55111;

    /* JADX INFO: renamed from: ᩳ */
    public float f55112;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f55113;

    /* JADX INFO: renamed from: ᩴ */
    public int f55114;

    /* JADX INFO: renamed from: ᩴ֫ */
    public float f55115;

    /* JADX INFO: renamed from: ᩵ */
    public int f55116;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f55117;

    /* JADX INFO: renamed from: ᩶ */
    public float f55118;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f55119;

    /* JADX INFO: renamed from: ᩷ */
    public String f55120;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f55121;

    /* JADX INFO: renamed from: ᩸ */
    public int f55122;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f55123;

    /* JADX INFO: renamed from: ᩹ */
    public int f55124;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f55125;

    /* JADX INFO: renamed from: ᩺ */
    public int f55126;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f55127;

    /* JADX INFO: renamed from: ᩻֫ */
    public float f55128;

    /* JADX INFO: renamed from: ֫ */
    public final C1591 m42000() {
        return this.f55082;
    }

    public C1680(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f55122 = -1;
        this.f55124 = -1;
        this.f55118 = -1.0f;
        this.f55126 = -1;
        this.f55101 = -1;
        this.f55087 = -1;
        this.f55105 = -1;
        this.f55078 = -1;
        this.f55119 = -1;
        this.f55108 = -1;
        this.f55094 = -1;
        this.f55069 = -1;
        this.f55110 = -1;
        this.f55102 = 0;
        this.f55112 = 0.0f;
        this.f55123 = -1;
        this.f55125 = -1;
        this.f55114 = -1;
        this.f55075 = -1;
        this.f55079 = -1;
        this.f55104 = -1;
        this.f55067 = -1;
        this.f55116 = -1;
        this.f55086 = -1;
        this.f55065 = -1;
        this.f55077 = 0.5f;
        this.f55074 = 0.5f;
        this.f55090 = null;
        this.f55088 = 1;
        this.f55097 = -1.0f;
        this.f55093 = -1.0f;
        this.f55073 = 0;
        this.f55100 = 0;
        this.f55070 = 0;
        this.f55085 = 0;
        this.f55111 = 0;
        this.f55113 = 0;
        this.f55109 = 0;
        this.f55095 = 0;
        this.f55128 = 1.0f;
        this.f55103 = 1.0f;
        this.f55106 = -1;
        this.f55071 = -1;
        this.f55121 = -1;
        this.f55083 = false;
        this.f55127 = false;
        this.f55120 = null;
        this.f55099 = true;
        this.f55098 = true;
        this.f55084 = false;
        this.f55092 = false;
        this.f55081 = false;
        this.f55096 = false;
        this.f55117 = -1;
        this.f55066 = -1;
        this.f55080 = -1;
        this.f55068 = -1;
        this.f55091 = -1;
        this.f55089 = -1;
        this.f55115 = 0.5f;
        this.f55082 = new C1591();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72689);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = C1400.f36736.get(index);
            switch (i3) {
                case 1:
                    this.f55121 = typedArrayObtainStyledAttributes.getInt(index, this.f55121);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f55110);
                    this.f55110 = resourceId;
                    if (resourceId == -1) {
                        this.f55110 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.f55102 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55102);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f55112) % 360.0f;
                    this.f55112 = f;
                    if (f < 0.0f) {
                        this.f55112 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.f55122 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f55122);
                    break;
                case 6:
                    this.f55124 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f55124);
                    break;
                case 7:
                    this.f55118 = typedArrayObtainStyledAttributes.getFloat(index, this.f55118);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55126);
                    this.f55126 = resourceId2;
                    if (resourceId2 == -1) {
                        this.f55126 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55101);
                    this.f55101 = resourceId3;
                    if (resourceId3 == -1) {
                        this.f55101 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55087);
                    this.f55087 = resourceId4;
                    if (resourceId4 == -1) {
                        this.f55087 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55105);
                    this.f55105 = resourceId5;
                    if (resourceId5 == -1) {
                        this.f55105 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55078);
                    this.f55078 = resourceId6;
                    if (resourceId6 == -1) {
                        this.f55078 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55119);
                    this.f55119 = resourceId7;
                    if (resourceId7 == -1) {
                        this.f55119 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55108);
                    this.f55108 = resourceId8;
                    if (resourceId8 == -1) {
                        this.f55108 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55094);
                    this.f55094 = resourceId9;
                    if (resourceId9 == -1) {
                        this.f55094 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55069);
                    this.f55069 = resourceId10;
                    if (resourceId10 == -1) {
                        this.f55069 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55123);
                    this.f55123 = resourceId11;
                    if (resourceId11 == -1) {
                        this.f55123 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55125);
                    this.f55125 = resourceId12;
                    if (resourceId12 == -1) {
                        this.f55125 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55114);
                    this.f55114 = resourceId13;
                    if (resourceId13 == -1) {
                        this.f55114 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f55075);
                    this.f55075 = resourceId14;
                    if (resourceId14 == -1) {
                        this.f55075 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.f55079 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55079);
                    break;
                case 22:
                    this.f55104 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55104);
                    break;
                case 23:
                    this.f55067 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55067);
                    break;
                case 24:
                    this.f55116 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55116);
                    break;
                case 25:
                    this.f55086 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55086);
                    break;
                case 26:
                    this.f55065 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55065);
                    break;
                case 27:
                    this.f55083 = typedArrayObtainStyledAttributes.getBoolean(index, this.f55083);
                    break;
                case 28:
                    this.f55127 = typedArrayObtainStyledAttributes.getBoolean(index, this.f55127);
                    break;
                case 29:
                    this.f55077 = typedArrayObtainStyledAttributes.getFloat(index, this.f55077);
                    break;
                case 30:
                    this.f55074 = typedArrayObtainStyledAttributes.getFloat(index, this.f55074);
                    break;
                case 31:
                    this.f55070 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.f55085 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.f55111 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55111);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f55111) == -2) {
                            this.f55111 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.f55109 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55109);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f55109) == -2) {
                            this.f55109 = -2;
                        }
                    }
                    break;
                case 35:
                    this.f55128 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f55128));
                    this.f55070 = 2;
                    break;
                case 36:
                    try {
                        this.f55113 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55113);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f55113) == -2) {
                            this.f55113 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.f55095 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55095);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f55095) == -2) {
                            this.f55095 = -2;
                        }
                    }
                    break;
                case 38:
                    this.f55103 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f55103));
                    this.f55085 = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f55090 = string;
                            this.f55088 = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = this.f55090.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = this.f55090.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        this.f55088 = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        this.f55088 = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = this.f55090.indexOf(58);
                                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                    String strSubstring2 = this.f55090.substring(i, iIndexOf2);
                                    String strSubstring3 = this.f55090.substring(iIndexOf2 + 1);
                                    if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring2);
                                            float f3 = Float.parseFloat(strSubstring3);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (this.f55088 == 1) {
                                                    Math.abs(f3 / f2);
                                                } else {
                                                    Math.abs(f2 / f3);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                } else {
                                    String strSubstring4 = this.f55090.substring(i);
                                    if (strSubstring4.length() > 0) {
                                        Float.parseFloat(strSubstring4);
                                    }
                                }
                            }
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            this.f55097 = typedArrayObtainStyledAttributes.getFloat(index, this.f55097);
                            break;
                        case 46:
                            this.f55093 = typedArrayObtainStyledAttributes.getFloat(index, this.f55093);
                            break;
                        case 47:
                            this.f55073 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f55100 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f55106 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f55106);
                            break;
                        case 50:
                            this.f55071 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f55071);
                            break;
                        case 51:
                            this.f55120 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m42001();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42001() {
        this.f55092 = false;
        this.f55099 = true;
        this.f55098 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f55083) {
            this.f55099 = false;
            if (this.f55070 == 0) {
                this.f55070 = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f55127) {
            this.f55098 = false;
            if (this.f55085 == 0) {
                this.f55085 = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f55099 = false;
            if (i == 0 && this.f55070 == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f55083 = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f55098 = false;
            if (i2 == 0 && this.f55085 == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f55127 = true;
            }
        }
        if (this.f55118 == -1.0f && this.f55122 == -1 && this.f55124 == -1) {
            return;
        }
        this.f55092 = true;
        this.f55099 = true;
        this.f55098 = true;
        if (!(this.f55082 instanceof C0996)) {
            this.f55082 = new C0996();
        }
        ((C0996) this.f55082).m11505(this.f55121);
    }

    public C1680(int i) {
        super(i, -2);
        this.f55122 = -1;
        this.f55124 = -1;
        this.f55118 = -1.0f;
        this.f55126 = -1;
        this.f55101 = -1;
        this.f55087 = -1;
        this.f55105 = -1;
        this.f55078 = -1;
        this.f55119 = -1;
        this.f55108 = -1;
        this.f55094 = -1;
        this.f55069 = -1;
        this.f55110 = -1;
        this.f55102 = 0;
        this.f55112 = 0.0f;
        this.f55123 = -1;
        this.f55125 = -1;
        this.f55114 = -1;
        this.f55075 = -1;
        this.f55079 = -1;
        this.f55104 = -1;
        this.f55067 = -1;
        this.f55116 = -1;
        this.f55086 = -1;
        this.f55065 = -1;
        this.f55077 = 0.5f;
        this.f55074 = 0.5f;
        this.f55090 = null;
        this.f55088 = 1;
        this.f55097 = -1.0f;
        this.f55093 = -1.0f;
        this.f55073 = 0;
        this.f55100 = 0;
        this.f55070 = 0;
        this.f55085 = 0;
        this.f55111 = 0;
        this.f55113 = 0;
        this.f55109 = 0;
        this.f55095 = 0;
        this.f55128 = 1.0f;
        this.f55103 = 1.0f;
        this.f55106 = -1;
        this.f55071 = -1;
        this.f55121 = -1;
        this.f55083 = false;
        this.f55127 = false;
        this.f55120 = null;
        this.f55099 = true;
        this.f55098 = true;
        this.f55084 = false;
        this.f55092 = false;
        this.f55081 = false;
        this.f55096 = false;
        this.f55117 = -1;
        this.f55066 = -1;
        this.f55080 = -1;
        this.f55068 = -1;
        this.f55091 = -1;
        this.f55089 = -1;
        this.f55115 = 0.5f;
        this.f55082 = new C1591();
    }

    public C1680(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f55122 = -1;
        this.f55124 = -1;
        this.f55118 = -1.0f;
        this.f55126 = -1;
        this.f55101 = -1;
        this.f55087 = -1;
        this.f55105 = -1;
        this.f55078 = -1;
        this.f55119 = -1;
        this.f55108 = -1;
        this.f55094 = -1;
        this.f55069 = -1;
        this.f55110 = -1;
        this.f55102 = 0;
        this.f55112 = 0.0f;
        this.f55123 = -1;
        this.f55125 = -1;
        this.f55114 = -1;
        this.f55075 = -1;
        this.f55079 = -1;
        this.f55104 = -1;
        this.f55067 = -1;
        this.f55116 = -1;
        this.f55086 = -1;
        this.f55065 = -1;
        this.f55077 = 0.5f;
        this.f55074 = 0.5f;
        this.f55090 = null;
        this.f55088 = 1;
        this.f55097 = -1.0f;
        this.f55093 = -1.0f;
        this.f55073 = 0;
        this.f55100 = 0;
        this.f55070 = 0;
        this.f55085 = 0;
        this.f55111 = 0;
        this.f55113 = 0;
        this.f55109 = 0;
        this.f55095 = 0;
        this.f55128 = 1.0f;
        this.f55103 = 1.0f;
        this.f55106 = -1;
        this.f55071 = -1;
        this.f55121 = -1;
        this.f55083 = false;
        this.f55127 = false;
        this.f55120 = null;
        this.f55099 = true;
        this.f55098 = true;
        this.f55084 = false;
        this.f55092 = false;
        this.f55081 = false;
        this.f55096 = false;
        this.f55117 = -1;
        this.f55066 = -1;
        this.f55080 = -1;
        this.f55068 = -1;
        this.f55091 = -1;
        this.f55089 = -1;
        this.f55115 = 0.5f;
        this.f55082 = new C1591();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    @TargetApi(17)
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f55080 = -1;
        this.f55068 = -1;
        this.f55117 = -1;
        this.f55066 = -1;
        this.f55091 = this.f55079;
        this.f55089 = this.f55067;
        float f = this.f55077;
        this.f55115 = f;
        int i8 = this.f55122;
        this.f55107 = i8;
        int i9 = this.f55124;
        this.f55072 = i9;
        float f2 = this.f55118;
        this.f55076 = f2;
        if (z2) {
            int i10 = this.f55123;
            if (i10 != -1) {
                this.f55080 = i10;
            } else {
                int i11 = this.f55125;
                if (i11 != -1) {
                    this.f55068 = i11;
                } else {
                    i2 = this.f55114;
                    if (i2 != -1) {
                        this.f55066 = i2;
                        z = true;
                    }
                    i3 = this.f55075;
                    if (i3 != -1) {
                        this.f55117 = i3;
                        z = true;
                    }
                    i4 = this.f55086;
                    if (i4 != -1) {
                        this.f55089 = i4;
                    }
                    i5 = this.f55065;
                    if (i5 != -1) {
                        this.f55091 = i5;
                    }
                    if (z) {
                        this.f55115 = 1.0f - f;
                    }
                    if (this.f55092 && this.f55121 == 1) {
                        if (f2 != -1.0f) {
                            this.f55076 = 1.0f - f2;
                            this.f55107 = -1;
                            this.f55072 = -1;
                        } else if (i8 != -1) {
                            this.f55072 = i8;
                            this.f55107 = -1;
                            this.f55076 = -1.0f;
                        } else if (i9 != -1) {
                            this.f55107 = i9;
                            this.f55072 = -1;
                            this.f55076 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f55114;
            if (i2 != -1) {
                this.f55066 = i2;
                z = true;
            }
            i3 = this.f55075;
            if (i3 != -1) {
                this.f55117 = i3;
                z = true;
            }
            i4 = this.f55086;
            if (i4 != -1) {
                this.f55089 = i4;
            }
            i5 = this.f55065;
            if (i5 != -1) {
                this.f55091 = i5;
            }
            if (z) {
                this.f55115 = 1.0f - f;
            }
            if (this.f55092) {
                if (f2 != -1.0f) {
                    this.f55076 = 1.0f - f2;
                    this.f55107 = -1;
                    this.f55072 = -1;
                } else if (i8 != -1) {
                    this.f55072 = i8;
                    this.f55107 = -1;
                    this.f55076 = -1.0f;
                } else if (i9 != -1) {
                    this.f55107 = i9;
                    this.f55072 = -1;
                    this.f55076 = -1.0f;
                }
            }
        } else {
            int i12 = this.f55123;
            if (i12 != -1) {
                this.f55066 = i12;
            }
            int i13 = this.f55125;
            if (i13 != -1) {
                this.f55117 = i13;
            }
            int i14 = this.f55114;
            if (i14 != -1) {
                this.f55080 = i14;
            }
            int i15 = this.f55075;
            if (i15 != -1) {
                this.f55068 = i15;
            }
            int i16 = this.f55086;
            if (i16 != -1) {
                this.f55091 = i16;
            }
            int i17 = this.f55065;
            if (i17 != -1) {
                this.f55089 = i17;
            }
        }
        if (this.f55114 == -1 && this.f55075 == -1 && this.f55125 == -1 && this.f55123 == -1) {
            int i18 = this.f55087;
            if (i18 != -1) {
                this.f55080 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f55105;
                if (i19 != -1) {
                    this.f55068 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f55126;
            if (i20 != -1) {
                this.f55117 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f55101;
            if (i21 != -1) {
                this.f55066 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
