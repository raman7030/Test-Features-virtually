package l;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8XX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5327 extends AbstractC13087 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Resources f16614;

    public C5327(Resources resources) {
        this.f16614 = resources;
    }

    @Override // l.AbstractC13087
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable mo15264(InputStream inputStream) {
        try {
            return new BitmapDrawable(this.f16614, BitmapFactory.decodeStream(inputStream));
        } catch (Throwable th) {
            throw new IllegalStateException("Exception decoding input-stream", th);
        }
    }
}
