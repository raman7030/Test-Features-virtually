package l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۚ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97EN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5368 implements InterfaceC7961, InterfaceC21423, InterfaceC1702 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m15336(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15337(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m15339(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m15340(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15341(int i, int i2, int i3, int i4, int i5) {
        C3603.m11056(i);
        C3603.m11056(i2);
        C3603.m11056(i3);
        C3603.m11056(i4);
        C3603.m11056(i5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15342(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            C12397.m30566((ExecutorService) autoCloseable);
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

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        return null;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15338(Throwable th) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream((OutputStream) byteArrayOutputStream, true, a.D));
            return byteArrayOutputStream.toString(a.D);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        textView.setText("0");
    }
}
