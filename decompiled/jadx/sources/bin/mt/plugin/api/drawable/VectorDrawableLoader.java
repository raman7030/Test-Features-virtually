package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.util.ServiceLoader;
import java.io.InputStream;
import l.InterfaceC13181;

/* JADX INFO: loaded from: classes.dex */
public abstract class VectorDrawableLoader {
    public static Drawable fromVectorXml(InputStream inputStream) {
        return ((InterfaceC13181) ServiceLoader.get(InterfaceC13181.class)).fromVectorXml(inputStream);
    }

    public static Drawable fromVectorXml(PluginContext pluginContext, String str) {
        try {
            InputStream assetsAsStream = pluginContext.getAssetsAsStream(str);
            try {
                Drawable drawableFromVectorXml = fromVectorXml(assetsAsStream);
                if (assetsAsStream != null) {
                    assetsAsStream.close();
                }
                return drawableFromVectorXml;
            } catch (Throwable th) {
                if (assetsAsStream != null) {
                    try {
                        assetsAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (VectorParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new VectorParseException(e2);
        }
    }

    public static Drawable fromSvg(InputStream inputStream) {
        return ((InterfaceC13181) ServiceLoader.get(InterfaceC13181.class)).fromSvg(inputStream);
    }

    public static Drawable fromSvg(PluginContext pluginContext, String str) {
        try {
            InputStream assetsAsStream = pluginContext.getAssetsAsStream(str);
            try {
                Drawable drawableFromSvg = fromSvg(assetsAsStream);
                if (assetsAsStream != null) {
                    assetsAsStream.close();
                }
                return drawableFromSvg;
            } catch (Throwable th) {
                if (assetsAsStream != null) {
                    try {
                        assetsAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (VectorParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new VectorParseException(e2);
        }
    }
}
