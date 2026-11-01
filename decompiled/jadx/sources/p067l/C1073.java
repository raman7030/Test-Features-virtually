package p067l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙ۬ */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1073 extends AbstractC21834 {

    /* JADX INFO: renamed from: ۡ */
    public static final /* synthetic */ int f17597 = 0;

    /* JADX INFO: renamed from: ܺ */
    public static final PorterDuff.Mode f17598 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f17599;

    /* JADX INFO: renamed from: ۜ */
    public PorterDuff.Mode f17600;

    /* JADX INFO: renamed from: ۢ */
    public int f17601;

    /* JADX INFO: renamed from: ۧ */
    public int f17602;

    /* JADX INFO: renamed from: ܳ */
    public String f17603;

    /* JADX INFO: renamed from: ܽ */
    public int f17604;

    /* JADX INFO: renamed from: ܿ */
    public Parcelable f17605;

    /* JADX INFO: renamed from: ᩳ */
    public Object f17606;

    /* JADX INFO: renamed from: ᩷ */
    public String f17607;

    /* JADX INFO: renamed from: ᩻ */
    public ColorStateList f17608;

    /* JADX INFO: renamed from: ֫ */
    public static C1073 m15500(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        C1073 c1073 = new C1073(2);
        c1073.f17602 = i;
        if (resources != null) {
            try {
                c1073.f17606 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            c1073.f17606 = str;
        }
        c1073.f17603 = str;
        return c1073;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1073 m15503(Bitmap bitmap) {
        bitmap.getClass();
        C1073 c1073 = new C1073(1);
        c1073.f17606 = bitmap;
        return c1073;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1073 m15502(Icon icon) {
        icon.getClass();
        int iM38209 = C1598.m38209(icon);
        if (iM38209 == 2) {
            return m15500((Resources) null, C1598.m38208(icon), C1598.m38205(icon));
        }
        if (iM38209 == 4) {
            Uri uriM38210 = C1598.m38210(icon);
            uriM38210.getClass();
            String string = uriM38210.toString();
            string.getClass();
            C1073 c1073 = new C1073(4);
            c1073.f17606 = string;
            return c1073;
        }
        if (iM38209 != 6) {
            C1073 c1074 = new C1073(-1);
            c1074.f17606 = icon;
            return c1074;
        }
        Uri uriM38211 = C1598.m38210(icon);
        uriM38211.getClass();
        String string2 = uriM38211.toString();
        string2.getClass();
        C1073 c1075 = new C1073(6);
        c1075.f17606 = string2;
        return c1075;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1073 m15501(Bitmap bitmap) {
        C1073 c1073 = new C1073(5);
        c1073.f17606 = bitmap;
        return c1073;
    }

    public C1073() {
        this.f17601 = -1;
        this.f17599 = null;
        this.f17605 = null;
        this.f17602 = 0;
        this.f17604 = 0;
        this.f17608 = null;
        this.f17600 = f17598;
        this.f17607 = null;
    }

    public C1073(int i) {
        this.f17599 = null;
        this.f17605 = null;
        this.f17602 = 0;
        this.f17604 = 0;
        this.f17608 = null;
        this.f17600 = f17598;
        this.f17607 = null;
        this.f17601 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m15511() {
        int i = this.f17601;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C1598.m38209(this.f17606);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m15509() {
        int i = this.f17601;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1598.m38208(this.f17606);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        String str = this.f17603;
        if (str == null || TextUtils.isEmpty(str)) {
            return ((String) this.f17606).split(":", -1)[0];
        }
        return this.f17603;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m15507() {
        int i = this.f17601;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1598.m38205(this.f17606);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.f17602;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m15504() {
        int i = this.f17601;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f17606;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f17606;
        }
        if (i == 5) {
            return m15499((Bitmap) this.f17606, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Uri m15510() {
        int i = this.f17601;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1598.m38210(this.f17606);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f17606);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Icon m15508(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1598.m38207(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15506(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmapCopy;
        Object obj;
        Resources resourcesForApplication;
        if (this.f17601 == 2 && (obj = this.f17606) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strM15509 = m15509();
                    if ("android".equals(strM15509)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strM15509, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException unused) {
                            StringBuilder sb = new StringBuilder("Unable to find pkg=");
                            sb.append(strM15509);
                            sb.append(" for icon");
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (this.f17602 != identifier) {
                        this.f17602 = identifier;
                    }
                }
            }
        }
        int i = this.f17601;
        if (i == 1) {
            bitmapCopy = (Bitmap) this.f17606;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(m15509(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f17602));
                    return;
                }
                Drawable drawableM5548 = C0886.m5548(contextCreatePackageContext, this.f17602);
                if (drawableM5548.getIntrinsicWidth() <= 0 || drawableM5548.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM5548.getIntrinsicWidth(), drawableM5548.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM5548.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM5548.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f17606, e);
            }
        } else if (i == 5) {
            bitmapCopy = m15499((Bitmap) this.f17606, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m15505(Context context) {
        Uri uriM15510 = m15510();
        String scheme = uriM15510.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM15510);
            } catch (Exception unused) {
                uriM15510.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f17606));
        } catch (FileNotFoundException unused2) {
            uriM15510.toString();
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f17601 == -1) {
            return String.valueOf(this.f17606);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f17601) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f17601) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f17606).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f17606).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f17603);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m15507())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f17602);
                if (this.f17604 != 0) {
                    sb.append(" off=");
                    sb.append(this.f17604);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f17606);
                break;
        }
        if (this.f17608 != null) {
            sb.append(" tint=");
            sb.append(this.f17608);
        }
        if (this.f17600 != f17598) {
            sb.append(" mode=");
            sb.append(this.f17600);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m15499(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
