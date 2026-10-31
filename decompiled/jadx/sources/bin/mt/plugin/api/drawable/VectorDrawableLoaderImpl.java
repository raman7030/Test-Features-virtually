package bin.mt.plugin.api.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import l.C10130;
import l.C11266;
import l.C12534;
import l.C15206;
import l.C15518;
import l.C16312;
import l.C2134;
import l.C22194;
import l.C4925;
import l.InterfaceC13181;

/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableLoaderImpl implements InterfaceC13181 {
    public static void register() {
        ServiceLoader.register(InterfaceC13181.class, new VectorDrawableLoaderImpl());
    }

    @Override // l.InterfaceC13181
    public Drawable fromVectorXml(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(Integer.MAX_VALUE);
            if ((inputStream.read() & 255) == 3 && (inputStream.read() & 255) == 0) {
                inputStream.reset();
                return C15518.m36587(C15206.m35970(inputStream).m35994(), new C12534(), false);
            }
            inputStream.reset();
            C10130 c10130 = new C10130();
            C2134 c2134 = new C2134(new C12534());
            c2134.m7056(Collections.EMPTY_MAP);
            c2134.m7058(true);
            c2134.m7055(C22194.m49848(inputStream, StandardCharsets.UTF_8));
            c2134.m7057(c10130);
            return C15518.m36587(C15206.m35970(new ByteArrayInputStream(c10130.m25438(), 0, c10130.size())).m35994(), new C12534(), false);
        } catch (VectorParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new VectorParseException(e2);
        }
    }

    @Override // l.InterfaceC13181
    public Drawable fromSvg(InputStream inputStream) {
        try {
            C16312 c16312M38391 = C16312.m38391(inputStream);
            RectF rectFM38408 = c16312M38391.m38408();
            int iM38410 = (int) c16312M38391.m38410();
            int iM38405 = (int) c16312M38391.m38405();
            if (iM38410 == -1 && iM38405 == -1) {
                iM38410 = (int) (rectFM38408.right - rectFM38408.left);
                iM38405 = (int) (rectFM38408.bottom - rectFM38408.top);
            }
            int iM27878 = C11266.m27878(iM38410);
            int iM27879 = C11266.m27878(iM38405);
            c16312M38391.m38406(iM27878);
            c16312M38391.m38399(iM27879);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM27878, iM27879, Bitmap.Config.ARGB_8888);
            c16312M38391.m38401(new Canvas(bitmapCreateBitmap));
            return new BitmapDrawable(C4925.m14338(), bitmapCreateBitmap);
        } catch (Exception e) {
            throw new VectorParseException(e);
        }
    }
}
