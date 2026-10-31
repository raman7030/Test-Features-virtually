package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.֡ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BLU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0464 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5404 f2028 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f2029 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f2030 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f2032 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ServiceConnectionC18810 f2031 = new ServiceConnectionC18810(this);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6.versionCode >= 1) goto L14;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2055(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                if (packageInfo != null && packageInfo.getLongVersionCode() >= 1) {
                    return true;
                }
            } else if (packageInfo != null) {
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m2056(Context context) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f2029)) {
            this.f2029 = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f2030)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f2029, 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
            this.f2030 = string;
        }
        InterfaceC5404 interfaceC5404 = this.f2028;
        String str = this.f2029;
        String str2 = this.f2030;
        C15986 c15986 = (C15986) interfaceC5404;
        c15986.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            c15986.f49331.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string2 = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return TextUtils.isEmpty(string2) ? "" : string2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
