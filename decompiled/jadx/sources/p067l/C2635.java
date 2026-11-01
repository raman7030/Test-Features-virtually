package p067l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.֡۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2635 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f4394;

    /* JADX INFO: renamed from: ۢ */
    public Uri f4395;

    /* JADX INFO: renamed from: ܳ */
    public long f4396;

    /* JADX INFO: renamed from: ܿ */
    public AssetFileDescriptor f4397;

    /* JADX INFO: renamed from: ᩷ */
    public final ContentResolver f4398;

    /* JADX INFO: renamed from: ᩻ */
    public FileInputStream f4399;

    public C2635(Context context) {
        super(false);
        this.f4398 = context.getContentResolver();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C20742 {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c5318.f12514;
                long j = c5318.f12516;
                long j2 = c5318.f12521;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f4395 = uriNormalizeScheme;
                m9837(c5318);
                boolean zEquals = C12826.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f4398;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f4397 = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C20742(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new C20742(i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f4399 = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C20742(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C20742(2008, null);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
                    if (size == 0) {
                        this.f4396 = -1L;
                    } else {
                        long jPosition = size - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.f4396 = jPosition;
                        if (jPosition < 0) {
                            throw new C20742(2008, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f4396 = j3;
                    if (j3 < 0) {
                        throw new C20742(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.f4396;
                    this.f4396 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f4394 = true;
                m9839(c5318);
                return j != -1 ? j : this.f4396;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (C20742 e3) {
            throw e3;
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C20742 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4396;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C20742(2000, e);
                }
            }
            FileInputStream fileInputStream = this.f4399;
            String str = C5792.f14228;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f4396;
                if (j2 != -1) {
                    this.f4396 = j2 - ((long) i3);
                }
                m9840(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f4395;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // p067l.InterfaceC22753
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f4395 = null;
        try {
            FileInputStream fileInputStream = this.f4399;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f4399 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f4397;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f4397 = null;
                    if (this.f4394) {
                        this.f4394 = false;
                        m9838();
                    }
                } catch (IOException e) {
                    throw new C20742(2000, e);
                }
            } catch (Throwable th) {
                this.f4397 = null;
                if (this.f4394) {
                    this.f4394 = false;
                    m9838();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C20742(2000, e2);
        }
    }
}
