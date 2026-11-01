package p067l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8T8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6184 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public C5318 f15561;

    /* JADX INFO: renamed from: ۢ */
    public boolean f15562;

    /* JADX INFO: renamed from: ܳ */
    public AssetFileDescriptor f15563;

    /* JADX INFO: renamed from: ܿ */
    public final Context f15564;

    /* JADX INFO: renamed from: ᩷ */
    public FileInputStream f15565;

    /* JADX INFO: renamed from: ᩻ */
    public long f15566;

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public C6184(Context context) {
        super(false);
        this.f15564 = context.getApplicationContext();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C4843 {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f15561 = c5318;
        m9837(c5318);
        Uri uri = c5318.f12514;
        long j = c5318.f12516;
        long j2 = c5318.f12521;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f15564;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C4843("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C4843("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C4843("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C4843("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C4843("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(C24104.m53357(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new C4843("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C4843("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f15563 = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f15563.getFileDescriptor());
            this.f15565 = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new C4843(null, null, 2008);
                }
                long startOffset = this.f15563.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C4843(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                        this.f15566 = -1L;
                    } else {
                        long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.f15566 = size;
                        if (size < 0) {
                            throw new C4843(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f15566 = j3;
                    if (j3 < 0) {
                        throw new C23423(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f15566;
                    this.f15566 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f15562 = true;
                m9839(c5318);
                return j != -1 ? j : this.f15566;
            } catch (C4843 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C4843(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C4843(null, e4, 2005);
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C4843 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f15566;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C4843(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f15565;
            String str = C5792.f14228;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f15566;
                if (j2 != -1) {
                    this.f15566 = j2 - ((long) i3);
                }
                m9840(i3);
                return i3;
            }
            if (this.f15566 != -1) {
                throw new C4843("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        C5318 c5318 = this.f15561;
        if (c5318 != null) {
            return c5318.f12514;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // p067l.InterfaceC22753
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f15561 = null;
        try {
            FileInputStream fileInputStream = this.f15565;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f15565 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f15563;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f15563 = null;
                    if (this.f15562) {
                        this.f15562 = false;
                        m9838();
                    }
                } catch (IOException e) {
                    throw new C4843(null, e, 2000);
                }
            } catch (Throwable th) {
                this.f15563 = null;
                if (this.f15562) {
                    this.f15562 = false;
                    m9838();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C4843(null, e2, 2000);
        }
    }
}
