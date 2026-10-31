package l;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩻ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D9R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23467 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f75301;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m51904(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i2 + i10;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51906(String str) {
        IBinder iBinderM34080 = C14294.m34080("activity");
        IBinder iBinder = null;
        if (iBinderM34080 != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.app.IActivityManager");
                parcelObtain.writeInt(2);
                iBinderM34080.transact(1599296841, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                IBinder strongBinder = parcelObtain2.readStrongBinder();
                if (strongBinder != null) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    iBinder = strongBinder;
                } else {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            } catch (Throwable unused) {
            }
        }
        if (iBinder != null) {
            C23216.m51524(iBinder, str);
            f75301 = true;
        } else {
            f75301 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51907() {
        return f75301;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51905(int i) {
        switch (i) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case 12:
                return "if-gt";
            case 13:
                return "switch";
            case 14:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case 17:
                return "div";
            case 18:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case 21:
                return "or";
            case 22:
                return "xor";
            case 23:
                return "shl";
            case 24:
                return "shr";
            case 25:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return "get-field";
            case 46:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case 50:
                return "invoke-virtual";
            case 51:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case 53:
                return "invoke-interface";
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            default:
                return "unknown-".concat(C14712.m35005(i));
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return "move-result";
            case 56:
                return "move-result-pseudo";
            case 57:
                return "fill-array-data";
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return "invoke-polymorphic";
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return "invoke-custom";
        }
    }
}
