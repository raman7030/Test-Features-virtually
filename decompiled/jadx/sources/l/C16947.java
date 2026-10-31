package l;

import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܽ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16947 extends AbstractC13087 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52025 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16947 m39777() {
        return new C16947();
    }

    public C16947() {
        if (!AbstractC18359.m42790()) {
            throw new IllegalStateException("`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder");
        }
    }

    @Override // l.AbstractC13087
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo15264(InputStream inputStream) {
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
                C1734 c1734 = new C1734(byteArrayOutputStream.toByteArray());
                if (!this.f52025) {
                    c1734.stop();
                }
                return c1734;
            } catch (IOException e) {
                throw new IllegalStateException("Exception creating GifDrawable", e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Cannot read GIF input-stream", e2);
        }
    }
}
