package bin.p000mt.plugin.api.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.util.ServiceLoader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import p067l.C11996;
import p067l.C13076;
import p067l.C14281;
import p067l.C16820;
import p067l.C17117;
import p067l.C17871;
import p067l.C23461;
import p067l.C4397;
import p067l.C7050;
import p067l.InterfaceC14896;

/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableLoaderImpl implements InterfaceC14896 {
    public static void register() {
        ServiceLoader.register(InterfaceC14896.class, new VectorDrawableLoaderImpl());
    }

    @Override // p067l.InterfaceC14896
    public Drawable fromVectorXml(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(Integer.MAX_VALUE);
            if ((inputStream.read() & 255) == 3 && (inputStream.read() & 255) == 0) {
                inputStream.reset();
                return C17117.m38746(C16820.m38130(inputStream).m38154(), new C14281(), false);
            }
            inputStream.reset();
            C11996 c11996 = new C11996();
            C4397 c4397 = new C4397(new C14281());
            c4397.m9151(Collections.EMPTY_MAP);
            c4397.m9153(true);
            c4397.m9150(C23461.m52175(inputStream, StandardCharsets.UTF_8));
            c4397.m9152(c11996);
            return C17117.m38746(C16820.m38130(new ByteArrayInputStream(c11996.m27458(), 0, c11996.size())).m38154(), new C14281(), false);
        } catch (VectorParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new VectorParseException(e2);
        }
    }

    @Override // p067l.InterfaceC14896
    public Drawable fromSvg(InputStream inputStream) {
        try {
            C17871 c17871M40606 = C17871.m40606(inputStream);
            RectF rectFM40623 = c17871M40606.m40623();
            int iM40625 = (int) c17871M40606.m40625();
            int iM40620 = (int) c17871M40606.m40620();
            if (iM40625 == -1 && iM40620 == -1) {
                iM40625 = (int) (rectFM40623.right - rectFM40623.left);
                iM40620 = (int) (rectFM40623.bottom - rectFM40623.top);
            }
            int iM29939 = C13076.m29939(iM40625);
            int iM299310 = C13076.m29939(iM40620);
            c17871M40606.m40621(iM29939);
            c17871M40606.m40614(iM299310);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM29939, iM299310, Bitmap.Config.ARGB_8888);
            c17871M40606.m40616(new Canvas(bitmapCreateBitmap));
            return new BitmapDrawable(C7050.m16235(), bitmapCreateBitmap);
        } catch (Exception e) {
            throw new VectorParseException(e);
        }
    }
}
