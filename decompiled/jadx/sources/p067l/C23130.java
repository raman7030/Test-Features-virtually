package p067l;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.ZipException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONException;

/* JADX INFO: renamed from: l.᩸᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23130 {
    /* JADX INFO: renamed from: ֫ */
    public static void m51584(C22755 c22755, Activity activity, Bundle bundle) {
        String str;
        int i;
        long j;
        long jMo15699b;
        int i2;
        C11060.m25469("openSDK_LOG.HttpUtils", "OpenApi request");
        if (!C19797.m45001(activity)) {
            throw new C17093("network unavailable");
        }
        String str2 = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
        if ("https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi".toLowerCase().startsWith(C0170a.f680s)) {
            str = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
        } else {
            str = C15752.m35817().m35818(activity, "https://openmobile.qq.com/") + "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
            str2 = C15752.m35817().m35818(activity, "https://openmobile.qq.com/") + "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c22755.getClass();
        int iM53971 = C24470.m53965(activity, "101492915").m53971("Common_HttpRetryCount");
        C11060.m25471("OpenConfig_test", "config 1:Common_HttpRetryCount            config_value:" + iM53971 + "   appid:101492915     url:" + str2);
        int i3 = iM53971 == 0 ? 3 : iM53971;
        C11060.m25471("OpenConfig_test", "config 1:Common_HttpRetryCount            result_value:" + i3 + "   appid:101492915     url:" + str2);
        int i4 = 0;
        long jElapsedRealtime2 = jElapsedRealtime;
        while (true) {
            int i5 = i4 + 1;
            try {
                try {
                    InterfaceC6856 interfaceC6856M51583 = m51583(bundle, str);
                    int iMo15701d = interfaceC6856M51583.mo15701d();
                    C11060.m25469("openSDK_LOG.HttpUtils", "request statusCode " + iMo15701d);
                    if (iMo15701d != 200) {
                        C19777.m44948().getClass();
                        C19777.m44946(str2, jElapsedRealtime2, 0L, 0L, iMo15701d);
                        throw new C10389(C20778.m46922(iMo15701d, "http status code error:"));
                    }
                    try {
                        i2 = C19797.m45010(interfaceC6856M51583.mo15698a()).getInt("ret");
                    } catch (JSONException unused) {
                        i2 = -4;
                    }
                    long jMo15700c = interfaceC6856M51583.mo15700c();
                    jMo15699b = interfaceC6856M51583.mo15699b();
                    i = i2;
                    j = jMo15700c;
                    C19777.m44948().getClass();
                    C19777.m44946(str2, jElapsedRealtime2, j, jMo15699b, i);
                    return;
                } catch (JSONException e) {
                    C19777.m44948().getClass();
                    C19777.m44946(str2, jElapsedRealtime2, 0L, 0L, -4);
                    throw e;
                }
            } catch (MalformedURLException e2) {
                C19777.m44948().getClass();
                C19777.m44946(str2, jElapsedRealtime2, 0L, 0L, -3);
                throw e2;
            } catch (SocketTimeoutException e3) {
                i = -8;
                j = 0;
                jMo15699b = 0;
                if (i5 >= i3) {
                    C19777.m44948().getClass();
                    C19777.m44946(str2, jElapsedRealtime2, 0L, 0L, -8);
                    throw e3;
                }
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (i5 < i3) {
                    i4 = i5;
                }
            } catch (IOException e4) {
                int iM51581 = m51581(e4);
                C19777.m44948().getClass();
                C19777.m44946(str2, jElapsedRealtime2, 0L, 0L, iM51581);
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m51586(C22755 c22755, Activity activity, Bundle bundle) {
        C11060.m25469("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
        try {
            C18455.f55168.execute(new RunnableC3683(c22755, activity, bundle));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m51581(IOException iOException) {
        if (iOException instanceof CharConversionException) {
            return -20;
        }
        if (iOException instanceof MalformedInputException) {
            return -21;
        }
        if (iOException instanceof UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof EOFException) {
            return -26;
        }
        if (iOException instanceof FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof HttpRetryException) {
            return -29;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof MalformedURLException) {
            return -3;
        }
        if (iOException instanceof InvalidClassException) {
            return -33;
        }
        if (iOException instanceof InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof NotActiveException) {
            return -35;
        }
        if (iOException instanceof NotSerializableException) {
            return -36;
        }
        if (iOException instanceof OptionalDataException) {
            return -37;
        }
        if (iOException instanceof StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof ProtocolException) {
            return -40;
        }
        if (iOException instanceof SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof SSLKeyException) {
            return -42;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof BindException) {
            return -45;
        }
        if (iOException instanceof ConnectException) {
            return -46;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof SyncFailedException) {
            return -49;
        }
        if (iOException instanceof UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof UnknownHostException) {
            return -51;
        }
        if (iOException instanceof UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof UnsupportedEncodingException) {
            return -53;
        }
        return iOException instanceof ZipException ? -54 : -2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6856 m51583(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle(bundle);
        HashMap mapM51582 = m51582(bundle2);
        HashMap map = new HashMap(0);
        if (bundle2.size() != 0) {
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj instanceof byte[]) {
                    map.put(str2, (byte[]) obj);
                }
            }
        }
        if (map.size() == 0) {
            return C21609.m48810().m48815(mapM51582, str);
        }
        C11060.m25470("openSDK_LOG.HttpUtils", "openUrl: has binary " + map.size());
        return C21609.m48810().m48812(str, mapM51582, map);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m51585(Bundle bundle) {
        HashMap mapM51582 = m51582(bundle);
        if (mapM51582.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : mapM51582.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(C0233a.f1084p);
            }
            sb.append(C14523.encode(str));
            sb.append("=");
            sb.append(C14523.encode((String) mapM51582.get(str)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m51582(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (!(obj instanceof String) && !(obj instanceof String[])) {
                    C11060.m25470("openSDK_LOG.HttpUtils", "parseBundleToMap: the type " + obj.getClass() + " is unsupported");
                } else if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strArr.length; i++) {
                        if (i != 0) {
                            sb.append(",");
                        }
                        sb.append(strArr[i]);
                    }
                    map.put(str, sb.toString());
                } else {
                    map.put(str, (String) obj);
                }
            }
        }
        return map;
    }
}
