package l;

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
public class C11914 extends ContentProvider {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Set f35615 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f35616 = C4925.m14337().concat(".fp");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String[] f35617 = {"_display_name", "_size"};

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29048(ArrayList arrayList) {
        Set hashSet;
        if (arrayList == null || arrayList.isEmpty()) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(arrayList);
        }
        f35615 = hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m29045(String str) {
        if (!f35615.isEmpty()) {
            m29048((ArrayList) null);
        }
        return new Uri.Builder().scheme("content").authority(f35616).path(str).build();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m29046(AbstractC15440 abstractC15440) {
        if (C4925.f15523.getBoolean("apk_installation_prevents_deletion", false)) {
            String strEncodeToString = Base64.encodeToString(abstractC15440.m36511().getBytes(StandardCharsets.UTF_8), 11);
            long jCurrentTimeMillis = System.currentTimeMillis();
            return m29045(String.format("%s%08X/%s/%s", "/NOT_DELETE/", Long.valueOf(((long) ((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32)))) & 4294967295L), strEncodeToString, abstractC15440.getName()));
        }
        return m29045(abstractC15440.mo23554());
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
        if (!providerInfo.authority.equals(f35616)) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m29047(Uri uri) {
        String strSubstring;
        String path = uri.getPath();
        C11003.requireNonNull(path);
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
        return C16999.m39866(path, new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        C11003.toString(uri);
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        AbstractC15440 abstractC15440M29047 = m29047(uri);
        if (strArr == null) {
            strArr = f35617;
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
                        objArr[i3] = abstractC15440M29047.getName();
                        break;
                    case "_data":
                        String path = uri.getPath();
                        C11003.requireNonNull(path);
                        if (!path.startsWith("/NOT_DELETE/") && !f35615.contains(uri)) {
                            strArr3[i3] = "_data";
                            i = i3 + 1;
                            objArr[i3] = abstractC15440M29047.mo23554();
                            break;
                        }
                        i2++;
                        break;
                    case "_size":
                        strArr3[i3] = "_size";
                        i = i3 + 1;
                        objArr[i3] = Long.valueOf(abstractC15440M29047.mo23127());
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
        C11003.toString(uri);
        AbstractC15440 abstractC15440M29047 = m29047(uri);
        int iLastIndexOf = abstractC15440M29047.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(abstractC15440M29047.getName().substring(iLastIndexOf + 1));
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
        C11003.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            return 1;
        }
        return C16999.m39866(path, new String[0]).mo23552() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m29049(AbstractC15440 abstractC15440) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Object systemService = C4925.m14335().getSystemService("storage");
        if (!(systemService instanceof StorageManager)) {
            return null;
        }
        StorageManager storageManager = (StorageManager) systemService;
        long jMo23127 = abstractC15440.mo23127();
        C23411 c23411M36513 = abstractC15440.m36513("r");
        try {
            return storageManager.openProxyFileDescriptor(268435456, new ProxyFileDescriptorCallbackC6269(jMo23127, c23411M36513), C1802.m5993());
        } catch (IOException unused) {
            C0349.m1793(c23411M36513);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        C11003.toString(uri);
        try {
            AbstractC15440 abstractC15440M29047 = m29047(uri);
            ParcelFileDescriptor parcelFileDescriptorMo27921 = abstractC15440M29047.mo27921(str);
            if (parcelFileDescriptorMo27921 != null) {
                return parcelFileDescriptorMo27921;
            }
            ParcelFileDescriptor parcelFileDescriptorM29049 = m29049(abstractC15440M29047);
            if (parcelFileDescriptorM29049 != null) {
                return parcelFileDescriptorM29049;
            }
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            C1802.f6208.execute(new RunnableC9960(3, abstractC15440M29047.mo27926(), new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1])));
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
