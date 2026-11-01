package p067l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۚ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97EN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7470 implements InterfaceC9934, InterfaceC22729, InterfaceC3986 {
    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m17245(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m17246(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m17248(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m17249(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17250(int i, int i2, int i3, int i4, int i5) {
        C5792.m13032(i);
        C5792.m13032(i2);
        C5792.m13032(i3);
        C5792.m13032(i4);
        C5792.m13032(i5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17251(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            C1457.m32630((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        return null;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m17247(Throwable th) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream((OutputStream) byteArrayOutputStream, true, C0233a.f1077D));
            return byteArrayOutputStream.toString(C0233a.f1077D);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        textView.setText("0");
    }
}
