package p067l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.storage.StorageManager;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes3.dex */
public class C13692 extends ContentProvider {

    /* JADX INFO: renamed from: ᩶ */
    public static Set f38624 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩸ */
    public static final String f38625 = C7050.m16234().concat(".fp");

    /* JADX INFO: renamed from: ᩹ */
    public static final String[] f38626 = {"_display_name", "_size"};

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31100(ArrayList arrayList) {
        Set hashSet;
        if (arrayList == null || arrayList.isEmpty()) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(arrayList);
        }
        f38624 = hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m31097(String str) {
        if (!f38624.isEmpty()) {
            m31100((ArrayList) null);
        }
        return new Uri.Builder().scheme("content").authority(f38625).path(str).build();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m31098(AbstractC17043 abstractC17043) {
        if (C7050.f18355.getBoolean("apk_installation_prevents_deletion", false)) {
            String strEncodeToString = Base64.encodeToString(abstractC17043.m38669().getBytes(StandardCharsets.UTF_8), 11);
            long jCurrentTimeMillis = System.currentTimeMillis();
            return m31097(String.format("%s%08X/%s/%s", "/NOT_DELETE/", Long.valueOf(((long) ((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32)))) & 4294967295L), strEncodeToString, abstractC17043.getName()));
        }
        return m31097(abstractC17043.mo25505());
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (!providerInfo.authority.equals(f38625)) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m31099(Uri uri) {
        String strSubstring;
        String path = uri.getPath();
        C12826.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            path = path.substring(21);
            int iLastIndexOf = path.lastIndexOf(47);
            if (iLastIndexOf > 0) {
                strSubstring = path.substring(iLastIndexOf);
                path = path.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
            }
            try {
                path = new String(Base64.decode(path, 11), StandardCharsets.UTF_8) + strSubstring;
            } catch (Throwable unused) {
            }
        }
        return C18524.m42109(path, new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        C12826.toString(uri);
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        AbstractC17043 abstractC17043M31099 = m31099(uri);
        if (strArr == null) {
            strArr = f38626;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                String str3 = strArr[i2];
                str3.getClass();
                switch (str3) {
                    case "_display_name":
                        strArr3[i3] = "_display_name";
                        i = i3 + 1;
                        objArr[i3] = abstractC17043M31099.getName();
                        break;
                    case "_data":
                        String path = uri.getPath();
                        C12826.requireNonNull(path);
                        if (!path.startsWith("/NOT_DELETE/") && !f38624.contains(uri)) {
                            strArr3[i3] = "_data";
                            i = i3 + 1;
                            objArr[i3] = abstractC17043M31099.mo25505();
                            break;
                        }
                        i2++;
                        break;
                    case "_size":
                        strArr3[i3] = "_size";
                        i = i3 + 1;
                        objArr[i3] = Long.valueOf(abstractC17043M31099.mo25101());
                        break;
                    default:
                        continue;
                        i2++;
                        break;
                }
                i3 = i;
                i2++;
            } else {
                String[] strArr4 = new String[i3];
                System.arraycopy(strArr3, 0, strArr4, 0, i3);
                Object[] objArr2 = new Object[i3];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
                matrixCursor.addRow(objArr2);
                return matrixCursor;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        C12826.toString(uri);
        AbstractC17043 abstractC17043M31099 = m31099(uri);
        int iLastIndexOf = abstractC17043M31099.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(abstractC17043M31099.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        C12826.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            return 1;
        }
        return C18524.m42109(path, new String[0]).mo25503() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static ParcelFileDescriptor m31101(AbstractC17043 abstractC17043) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Object systemService = C7050.m16232().getSystemService("storage");
        if (!(systemService instanceof StorageManager)) {
            return null;
        }
        StorageManager storageManager = (StorageManager) systemService;
        long jMo25101 = abstractC17043.mo25101();
        C24618 c24618M38671 = abstractC17043.m38671("r");
        try {
            return storageManager.openProxyFileDescriptor(268435456, new ProxyFileDescriptorCallbackC8327(jMo25101, c24618M38671), C4081.m8190());
        } catch (IOException unused) {
            C2700.m4192(c24618M38671);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        C12826.toString(uri);
        try {
            AbstractC17043 abstractC17043M31099 = m31099(uri);
            ParcelFileDescriptor parcelFileDescriptorMo29982 = abstractC17043M31099.mo29982(str);
            if (parcelFileDescriptorMo29982 != null) {
                return parcelFileDescriptorMo29982;
            }
            ParcelFileDescriptor parcelFileDescriptorM31101 = m31101(abstractC17043M31099);
            if (parcelFileDescriptorM31101 != null) {
                return parcelFileDescriptorM31101;
            }
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            C4081.f8987.execute(new RunnableC11834(3, abstractC17043M31099.mo29987(), new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1])));
            return parcelFileDescriptorArrCreatePipe[0];
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(e2.getMessage());
            fileNotFoundException.initCause(e2);
            throw fileNotFoundException;
        }
    }
}
