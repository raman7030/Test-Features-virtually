package p067l;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8XX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7431 extends AbstractC14806 {

    /* JADX INFO: renamed from: ֫ */
    public final Resources f19453;

    public C7431(Resources resources) {
        this.f19453 = resources;
    }

    @Override // p067l.AbstractC14806
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo17170(InputStream inputStream) {
        try {
            return new BitmapDrawable(this.f19453, BitmapFactory.decodeStream(inputStream));
        } catch (Throwable th) {
            throw new IllegalStateException("Exception decoding input-stream", th);
        }
    }
}
