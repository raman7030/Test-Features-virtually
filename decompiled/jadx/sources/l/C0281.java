package l;

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
public final class C0281 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f1616;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Uri f1617;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f1618;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AssetFileDescriptor f1619;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ContentResolver f1620;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FileInputStream f1621;

    public C0281(Context context) {
        super(false);
        this.f1620 = context.getContentResolver();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo1620(C3104 c3104) throws C19333 {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c3104.f9711;
                long j = c3104.f9713;
                long j2 = c3104.f9718;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f1617 = uriNormalizeScheme;
                m7774(c3104);
                boolean zEquals = C11003.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f1620;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f1619 = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C19333(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new C19333(i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f1621 = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C19333(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C19333(2008, null);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
                    if (size == 0) {
                        this.f1618 = -1L;
                    } else {
                        long jPosition = size - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.f1618 = jPosition;
                        if (jPosition < 0) {
                            throw new C19333(2008, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f1618 = j3;
                    if (j3 < 0) {
                        throw new C19333(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.f1618;
                    this.f1618 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f1616 = true;
                m7776(c3104);
                return j != -1 ? j : this.f1618;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (C19333 e3) {
            throw e3;
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws C19333 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f1618;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C19333(2000, e);
                }
            }
            FileInputStream fileInputStream = this.f1621;
            String str = C3603.f11424;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f1618;
                if (j2 != -1) {
                    this.f1618 = j2 - ((long) i3);
                }
                m7777(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri mo1621() {
        return this.f1617;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // l.InterfaceC21449
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f1617 = null;
        try {
            FileInputStream fileInputStream = this.f1621;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f1621 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f1619;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f1619 = null;
                    if (this.f1616) {
                        this.f1616 = false;
                        m7775();
                    }
                } catch (IOException e) {
                    throw new C19333(2000, e);
                }
            } catch (Throwable th) {
                this.f1619 = null;
                if (this.f1616) {
                    this.f1616 = false;
                    m7775();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C19333(2000, e2);
        }
    }
}
