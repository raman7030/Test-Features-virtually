package p067l;

import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܽ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18475 extends AbstractC14806 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f55206 = true;

    /* JADX INFO: renamed from: ֫ */
    public static C18475 m42018() {
        return new C18475();
    }

    public C18475() {
        if (!AbstractC19817.m45062()) {
            throw new IllegalStateException("`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder");
        }
    }

    @Override // p067l.AbstractC14806
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo17170(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            try {
                C4016 c4016 = new C4016(byteArrayOutputStream.toByteArray());
                if (!this.f55206) {
                    c4016.stop();
                }
                return c4016;
            } catch (IOException e) {
                throw new IllegalStateException("Exception creating GifDrawable", e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Cannot read GIF input-stream", e2);
        }
    }
}
