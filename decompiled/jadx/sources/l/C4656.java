package l;

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

/* JADX INFO: renamed from: l.ۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4656 extends AbstractC20481 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f14767 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f14768 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f14769;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f14770;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f14771;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14772;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f14773;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Parcelable f14775;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f14776;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f14777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ColorStateList f14778;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4656 m13625(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        C4656 c4656 = new C4656(2);
        c4656.f14772 = i;
        if (resources != null) {
            try {
                c4656.f14776 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            c4656.f14776 = str;
        }
        c4656.f14773 = str;
        return c4656;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4656 m13628(Bitmap bitmap) {
        bitmap.getClass();
        C4656 c4656 = new C4656(1);
        c4656.f14776 = bitmap;
        return c4656;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4656 m13627(Icon icon) {
        icon.getClass();
        int iM36048 = C15238.m36048(icon);
        if (iM36048 == 2) {
            return m13625((Resources) null, C15238.m36047(icon), C15238.m36044(icon));
        }
        if (iM36048 == 4) {
            Uri uriM36049 = C15238.m36049(icon);
            uriM36049.getClass();
            String string = uriM36049.toString();
            string.getClass();
            C4656 c4656 = new C4656(4);
            c4656.f14776 = string;
            return c4656;
        }
        if (iM36048 != 6) {
            C4656 c4657 = new C4656(-1);
            c4657.f14776 = icon;
            return c4657;
        }
        Uri uriM360410 = C15238.m36049(icon);
        uriM360410.getClass();
        String string2 = uriM360410.toString();
        string2.getClass();
        C4656 c4658 = new C4656(6);
        c4658.f14776 = string2;
        return c4658;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4656 m13626(Bitmap bitmap) {
        C4656 c4656 = new C4656(5);
        c4656.f14776 = bitmap;
        return c4656;
    }

    public C4656() {
        this.f14771 = -1;
        this.f14769 = null;
        this.f14775 = null;
        this.f14772 = 0;
        this.f14774 = 0;
        this.f14778 = null;
        this.f14770 = f14768;
        this.f14777 = null;
    }

    public C4656(int i) {
        this.f14769 = null;
        this.f14775 = null;
        this.f14772 = 0;
        this.f14774 = 0;
        this.f14778 = null;
        this.f14770 = f14768;
        this.f14777 = null;
        this.f14771 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13636() {
        int i = this.f14771;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C15238.m36048(this.f14776);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m13634() {
        int i = this.f14771;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C15238.m36047(this.f14776);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        String str = this.f14773;
        if (str == null || TextUtils.isEmpty(str)) {
            return ((String) this.f14776).split(":", -1)[0];
        }
        return this.f14773;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m13632() {
        int i = this.f14771;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C15238.m36044(this.f14776);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.f14772;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m13629() {
        int i = this.f14771;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f14776;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f14776;
        }
        if (i == 5) {
            return m13624((Bitmap) this.f14776, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri m13635() {
        int i = this.f14771;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C15238.m36049(this.f14776);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f14776);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Icon m13633(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C15238.m36046(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13631(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmapCopy;
        Object obj;
        Resources resourcesForApplication;
        if (this.f14771 == 2 && (obj = this.f14776) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strM13634 = m13634();
                    if ("android".equals(strM13634)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strM13634, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException unused) {
                            StringBuilder sb = new StringBuilder("Unable to find pkg=");
                            sb.append(strM13634);
                            sb.append(" for icon");
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (this.f14772 != identifier) {
                        this.f14772 = identifier;
                    }
                }
            }
        }
        int i = this.f14771;
        if (i == 1) {
            bitmapCopy = (Bitmap) this.f14776;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(m13634(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f14772));
                    return;
                }
                Drawable drawableM3234 = C0881.m3234(contextCreatePackageContext, this.f14772);
                if (drawableM3234.getIntrinsicWidth() <= 0 || drawableM3234.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM3234.getIntrinsicWidth(), drawableM3234.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM3234.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM3234.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f14776, e);
            }
        } else if (i == 5) {
            bitmapCopy = m13624((Bitmap) this.f14776, true);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m13630(Context context) {
        Uri uriM13635 = m13635();
        String scheme = uriM13635.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM13635);
            } catch (Exception unused) {
                uriM13635.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f14776));
        } catch (FileNotFoundException unused2) {
            uriM13635.toString();
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f14771 == -1) {
            return String.valueOf(this.f14776);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f14771) {
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
        switch (this.f14771) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f14776).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f14776).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f14773);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m13632())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f14772);
                if (this.f14774 != 0) {
                    sb.append(" off=");
                    sb.append(this.f14774);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f14776);
                break;
        }
        if (this.f14778 != null) {
            sb.append(" tint=");
            sb.append(this.f14778);
        }
        if (this.f14770 != f14768) {
            sb.append(" mode=");
            sb.append(this.f14770);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13624(Bitmap bitmap, boolean z) {
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
