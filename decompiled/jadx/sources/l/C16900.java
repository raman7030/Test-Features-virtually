package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes4.dex */
public class C16900 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f51885;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f51886;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f51887;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f51888;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f51889;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f51890;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51891;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f51892;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f51893;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public float f51894;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f51895;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f51896;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f51897;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f51898;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f51899;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f51900;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f51901;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public C15094 f51902;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51903;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f51904;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f51905;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f51906;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f51907;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f51908;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f51909;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f51910;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f51911;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f51912;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public float f51913;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51914;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f51915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f51916;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f51917;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f51918;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f51919;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f51920;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f51921;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f51922;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f51923;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f51924;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f51925;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51926;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f51927;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51928;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f51929;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51930;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f51931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f51932;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f51933;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f51934;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public float f51935;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f51936;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f51937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f51938;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f51939;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f51940;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f51941;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f51942;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f51943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51944;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f51945;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f51946;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51947;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f51948;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15094 m39759() {
        return this.f51902;
    }

    public C16900(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f51942 = -1;
        this.f51944 = -1;
        this.f51938 = -1.0f;
        this.f51946 = -1;
        this.f51921 = -1;
        this.f51907 = -1;
        this.f51925 = -1;
        this.f51898 = -1;
        this.f51939 = -1;
        this.f51928 = -1;
        this.f51914 = -1;
        this.f51889 = -1;
        this.f51930 = -1;
        this.f51922 = 0;
        this.f51932 = 0.0f;
        this.f51943 = -1;
        this.f51945 = -1;
        this.f51934 = -1;
        this.f51895 = -1;
        this.f51899 = -1;
        this.f51924 = -1;
        this.f51887 = -1;
        this.f51936 = -1;
        this.f51906 = -1;
        this.f51885 = -1;
        this.f51897 = 0.5f;
        this.f51894 = 0.5f;
        this.f51910 = null;
        this.f51908 = 1;
        this.f51917 = -1.0f;
        this.f51913 = -1.0f;
        this.f51893 = 0;
        this.f51920 = 0;
        this.f51890 = 0;
        this.f51905 = 0;
        this.f51931 = 0;
        this.f51933 = 0;
        this.f51929 = 0;
        this.f51915 = 0;
        this.f51948 = 1.0f;
        this.f51923 = 1.0f;
        this.f51926 = -1;
        this.f51891 = -1;
        this.f51941 = -1;
        this.f51903 = false;
        this.f51947 = false;
        this.f51940 = null;
        this.f51919 = true;
        this.f51918 = true;
        this.f51904 = false;
        this.f51912 = false;
        this.f51901 = false;
        this.f51916 = false;
        this.f51937 = -1;
        this.f51886 = -1;
        this.f51900 = -1;
        this.f51888 = -1;
        this.f51911 = -1;
        this.f51909 = -1;
        this.f51935 = 0.5f;
        this.f51902 = new C15094();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69980);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = C11257.f33736.get(index);
            switch (i3) {
                case 1:
                    this.f51941 = typedArrayObtainStyledAttributes.getInt(index, this.f51941);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f51930);
                    this.f51930 = resourceId;
                    if (resourceId == -1) {
                        this.f51930 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.f51922 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51922);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f51932) % 360.0f;
                    this.f51932 = f;
                    if (f < 0.0f) {
                        this.f51932 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.f51942 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f51942);
                    break;
                case 6:
                    this.f51944 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f51944);
                    break;
                case 7:
                    this.f51938 = typedArrayObtainStyledAttributes.getFloat(index, this.f51938);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51946);
                    this.f51946 = resourceId2;
                    if (resourceId2 == -1) {
                        this.f51946 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51921);
                    this.f51921 = resourceId3;
                    if (resourceId3 == -1) {
                        this.f51921 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51907);
                    this.f51907 = resourceId4;
                    if (resourceId4 == -1) {
                        this.f51907 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51925);
                    this.f51925 = resourceId5;
                    if (resourceId5 == -1) {
                        this.f51925 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51898);
                    this.f51898 = resourceId6;
                    if (resourceId6 == -1) {
                        this.f51898 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51939);
                    this.f51939 = resourceId7;
                    if (resourceId7 == -1) {
                        this.f51939 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51928);
                    this.f51928 = resourceId8;
                    if (resourceId8 == -1) {
                        this.f51928 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51914);
                    this.f51914 = resourceId9;
                    if (resourceId9 == -1) {
                        this.f51914 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51889);
                    this.f51889 = resourceId10;
                    if (resourceId10 == -1) {
                        this.f51889 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51943);
                    this.f51943 = resourceId11;
                    if (resourceId11 == -1) {
                        this.f51943 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51945);
                    this.f51945 = resourceId12;
                    if (resourceId12 == -1) {
                        this.f51945 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51934);
                    this.f51934 = resourceId13;
                    if (resourceId13 == -1) {
                        this.f51934 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f51895);
                    this.f51895 = resourceId14;
                    if (resourceId14 == -1) {
                        this.f51895 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.f51899 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51899);
                    break;
                case 22:
                    this.f51924 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51924);
                    break;
                case 23:
                    this.f51887 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51887);
                    break;
                case 24:
                    this.f51936 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51936);
                    break;
                case 25:
                    this.f51906 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51906);
                    break;
                case 26:
                    this.f51885 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51885);
                    break;
                case 27:
                    this.f51903 = typedArrayObtainStyledAttributes.getBoolean(index, this.f51903);
                    break;
                case 28:
                    this.f51947 = typedArrayObtainStyledAttributes.getBoolean(index, this.f51947);
                    break;
                case 29:
                    this.f51897 = typedArrayObtainStyledAttributes.getFloat(index, this.f51897);
                    break;
                case 30:
                    this.f51894 = typedArrayObtainStyledAttributes.getFloat(index, this.f51894);
                    break;
                case 31:
                    this.f51890 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.f51905 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        this.f51931 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51931);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f51931) == -2) {
                            this.f51931 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.f51929 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51929);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f51929) == -2) {
                            this.f51929 = -2;
                        }
                    }
                    break;
                case 35:
                    this.f51948 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f51948));
                    this.f51890 = 2;
                    break;
                case 36:
                    try {
                        this.f51933 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51933);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f51933) == -2) {
                            this.f51933 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.f51915 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f51915);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.f51915) == -2) {
                            this.f51915 = -2;
                        }
                    }
                    break;
                case 38:
                    this.f51923 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f51923));
                    this.f51905 = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f51910 = string;
                            this.f51908 = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = this.f51910.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = this.f51910.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        this.f51908 = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        this.f51908 = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = this.f51910.indexOf(58);
                                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                    String strSubstring2 = this.f51910.substring(i, iIndexOf2);
                                    String strSubstring3 = this.f51910.substring(iIndexOf2 + 1);
                                    if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring2);
                                            float f3 = Float.parseFloat(strSubstring3);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (this.f51908 == 1) {
                                                    Math.abs(f3 / f2);
                                                } else {
                                                    Math.abs(f2 / f3);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                } else {
                                    String strSubstring4 = this.f51910.substring(i);
                                    if (strSubstring4.length() > 0) {
                                        Float.parseFloat(strSubstring4);
                                    }
                                }
                            }
                            break;
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            this.f51917 = typedArrayObtainStyledAttributes.getFloat(index, this.f51917);
                            break;
                        case 46:
                            this.f51913 = typedArrayObtainStyledAttributes.getFloat(index, this.f51913);
                            break;
                        case 47:
                            this.f51893 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f51920 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.f51926 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f51926);
                            break;
                        case 50:
                            this.f51891 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f51891);
                            break;
                        case 51:
                            this.f51940 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m39760();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39760() {
        this.f51912 = false;
        this.f51919 = true;
        this.f51918 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f51903) {
            this.f51919 = false;
            if (this.f51890 == 0) {
                this.f51890 = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f51947) {
            this.f51918 = false;
            if (this.f51905 == 0) {
                this.f51905 = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f51919 = false;
            if (i == 0 && this.f51890 == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f51903 = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f51918 = false;
            if (i2 == 0 && this.f51905 == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f51947 = true;
            }
        }
        if (this.f51938 == -1.0f && this.f51942 == -1 && this.f51944 == -1) {
            return;
        }
        this.f51912 = true;
        this.f51919 = true;
        this.f51918 = true;
        if (!(this.f51902 instanceof C3101)) {
            this.f51902 = new C3101();
        }
        ((C3101) this.f51902).m9462(this.f51941);
    }

    public C16900(int i) {
        super(i, -2);
        this.f51942 = -1;
        this.f51944 = -1;
        this.f51938 = -1.0f;
        this.f51946 = -1;
        this.f51921 = -1;
        this.f51907 = -1;
        this.f51925 = -1;
        this.f51898 = -1;
        this.f51939 = -1;
        this.f51928 = -1;
        this.f51914 = -1;
        this.f51889 = -1;
        this.f51930 = -1;
        this.f51922 = 0;
        this.f51932 = 0.0f;
        this.f51943 = -1;
        this.f51945 = -1;
        this.f51934 = -1;
        this.f51895 = -1;
        this.f51899 = -1;
        this.f51924 = -1;
        this.f51887 = -1;
        this.f51936 = -1;
        this.f51906 = -1;
        this.f51885 = -1;
        this.f51897 = 0.5f;
        this.f51894 = 0.5f;
        this.f51910 = null;
        this.f51908 = 1;
        this.f51917 = -1.0f;
        this.f51913 = -1.0f;
        this.f51893 = 0;
        this.f51920 = 0;
        this.f51890 = 0;
        this.f51905 = 0;
        this.f51931 = 0;
        this.f51933 = 0;
        this.f51929 = 0;
        this.f51915 = 0;
        this.f51948 = 1.0f;
        this.f51923 = 1.0f;
        this.f51926 = -1;
        this.f51891 = -1;
        this.f51941 = -1;
        this.f51903 = false;
        this.f51947 = false;
        this.f51940 = null;
        this.f51919 = true;
        this.f51918 = true;
        this.f51904 = false;
        this.f51912 = false;
        this.f51901 = false;
        this.f51916 = false;
        this.f51937 = -1;
        this.f51886 = -1;
        this.f51900 = -1;
        this.f51888 = -1;
        this.f51911 = -1;
        this.f51909 = -1;
        this.f51935 = 0.5f;
        this.f51902 = new C15094();
    }

    public C16900(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f51942 = -1;
        this.f51944 = -1;
        this.f51938 = -1.0f;
        this.f51946 = -1;
        this.f51921 = -1;
        this.f51907 = -1;
        this.f51925 = -1;
        this.f51898 = -1;
        this.f51939 = -1;
        this.f51928 = -1;
        this.f51914 = -1;
        this.f51889 = -1;
        this.f51930 = -1;
        this.f51922 = 0;
        this.f51932 = 0.0f;
        this.f51943 = -1;
        this.f51945 = -1;
        this.f51934 = -1;
        this.f51895 = -1;
        this.f51899 = -1;
        this.f51924 = -1;
        this.f51887 = -1;
        this.f51936 = -1;
        this.f51906 = -1;
        this.f51885 = -1;
        this.f51897 = 0.5f;
        this.f51894 = 0.5f;
        this.f51910 = null;
        this.f51908 = 1;
        this.f51917 = -1.0f;
        this.f51913 = -1.0f;
        this.f51893 = 0;
        this.f51920 = 0;
        this.f51890 = 0;
        this.f51905 = 0;
        this.f51931 = 0;
        this.f51933 = 0;
        this.f51929 = 0;
        this.f51915 = 0;
        this.f51948 = 1.0f;
        this.f51923 = 1.0f;
        this.f51926 = -1;
        this.f51891 = -1;
        this.f51941 = -1;
        this.f51903 = false;
        this.f51947 = false;
        this.f51940 = null;
        this.f51919 = true;
        this.f51918 = true;
        this.f51904 = false;
        this.f51912 = false;
        this.f51901 = false;
        this.f51916 = false;
        this.f51937 = -1;
        this.f51886 = -1;
        this.f51900 = -1;
        this.f51888 = -1;
        this.f51911 = -1;
        this.f51909 = -1;
        this.f51935 = 0.5f;
        this.f51902 = new C15094();
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
        this.f51900 = -1;
        this.f51888 = -1;
        this.f51937 = -1;
        this.f51886 = -1;
        this.f51911 = this.f51899;
        this.f51909 = this.f51887;
        float f = this.f51897;
        this.f51935 = f;
        int i8 = this.f51942;
        this.f51927 = i8;
        int i9 = this.f51944;
        this.f51892 = i9;
        float f2 = this.f51938;
        this.f51896 = f2;
        if (z2) {
            int i10 = this.f51943;
            if (i10 != -1) {
                this.f51900 = i10;
            } else {
                int i11 = this.f51945;
                if (i11 != -1) {
                    this.f51888 = i11;
                } else {
                    i2 = this.f51934;
                    if (i2 != -1) {
                        this.f51886 = i2;
                        z = true;
                    }
                    i3 = this.f51895;
                    if (i3 != -1) {
                        this.f51937 = i3;
                        z = true;
                    }
                    i4 = this.f51906;
                    if (i4 != -1) {
                        this.f51909 = i4;
                    }
                    i5 = this.f51885;
                    if (i5 != -1) {
                        this.f51911 = i5;
                    }
                    if (z) {
                        this.f51935 = 1.0f - f;
                    }
                    if (this.f51912 && this.f51941 == 1) {
                        if (f2 != -1.0f) {
                            this.f51896 = 1.0f - f2;
                            this.f51927 = -1;
                            this.f51892 = -1;
                        } else if (i8 != -1) {
                            this.f51892 = i8;
                            this.f51927 = -1;
                            this.f51896 = -1.0f;
                        } else if (i9 != -1) {
                            this.f51927 = i9;
                            this.f51892 = -1;
                            this.f51896 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f51934;
            if (i2 != -1) {
                this.f51886 = i2;
                z = true;
            }
            i3 = this.f51895;
            if (i3 != -1) {
                this.f51937 = i3;
                z = true;
            }
            i4 = this.f51906;
            if (i4 != -1) {
                this.f51909 = i4;
            }
            i5 = this.f51885;
            if (i5 != -1) {
                this.f51911 = i5;
            }
            if (z) {
                this.f51935 = 1.0f - f;
            }
            if (this.f51912) {
                if (f2 != -1.0f) {
                    this.f51896 = 1.0f - f2;
                    this.f51927 = -1;
                    this.f51892 = -1;
                } else if (i8 != -1) {
                    this.f51892 = i8;
                    this.f51927 = -1;
                    this.f51896 = -1.0f;
                } else if (i9 != -1) {
                    this.f51927 = i9;
                    this.f51892 = -1;
                    this.f51896 = -1.0f;
                }
            }
        } else {
            int i12 = this.f51943;
            if (i12 != -1) {
                this.f51886 = i12;
            }
            int i13 = this.f51945;
            if (i13 != -1) {
                this.f51937 = i13;
            }
            int i14 = this.f51934;
            if (i14 != -1) {
                this.f51900 = i14;
            }
            int i15 = this.f51895;
            if (i15 != -1) {
                this.f51888 = i15;
            }
            int i16 = this.f51906;
            if (i16 != -1) {
                this.f51911 = i16;
            }
            int i17 = this.f51885;
            if (i17 != -1) {
                this.f51909 = i17;
            }
        }
        if (this.f51934 == -1 && this.f51895 == -1 && this.f51945 == -1 && this.f51943 == -1) {
            int i18 = this.f51907;
            if (i18 != -1) {
                this.f51900 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f51925;
                if (i19 != -1) {
                    this.f51888 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f51946;
            if (i20 != -1) {
                this.f51937 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f51921;
            if (i21 != -1) {
                this.f51886 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
