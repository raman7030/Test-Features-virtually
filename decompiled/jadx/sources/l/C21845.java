package l;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.alipay.sdk.m.n.a;
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
public final class C21845 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49233(C21451 c21451, Activity activity, Bundle bundle) {
        String str;
        int i;
        long j;
        long jB;
        int i2;
        C9145.m23518("openSDK_LOG.HttpUtils", "OpenApi request");
        if (!C18338.m42739(activity)) {
            throw new C15493("network unavailable");
        }
        String str2 = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
        if ("https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi".toLowerCase().startsWith(a.s)) {
            str = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
        } else {
            str = C14082.m33692().m33693(activity, "https://openmobile.qq.com/") + "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
            str2 = C14082.m33692().m33693(activity, "https://openmobile.qq.com/") + "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c21451.getClass();
        int iM51575 = C23255.m51569(activity, "101492915").m51575("Common_HttpRetryCount");
        C9145.m23520("OpenConfig_test", "config 1:Common_HttpRetryCount            config_value:" + iM51575 + "   appid:101492915     url:" + str2);
        int i3 = iM51575 == 0 ? 3 : iM51575;
        C9145.m23520("OpenConfig_test", "config 1:Common_HttpRetryCount            result_value:" + i3 + "   appid:101492915     url:" + str2);
        int i4 = 0;
        long jElapsedRealtime2 = jElapsedRealtime;
        while (true) {
            int i5 = i4 + 1;
            try {
                try {
                    InterfaceC4722 interfaceC4722M49232 = m49232(bundle, str);
                    int iD = interfaceC4722M49232.d();
                    C9145.m23518("openSDK_LOG.HttpUtils", "request statusCode " + iD);
                    if (iD != 200) {
                        C18317.m42686().getClass();
                        C18317.m42684(str2, jElapsedRealtime2, 0L, 0L, iD);
                        throw new C8439(C19370.m44628(iD, "http status code error:"));
                    }
                    try {
                        i2 = C18338.m42748(interfaceC4722M49232.a()).getInt("ret");
                    } catch (JSONException unused) {
                        i2 = -4;
                    }
                    long jC = interfaceC4722M49232.c();
                    jB = interfaceC4722M49232.b();
                    i = i2;
                    j = jC;
                    C18317.m42686().getClass();
                    C18317.m42684(str2, jElapsedRealtime2, j, jB, i);
                    return;
                } catch (JSONException e) {
                    C18317.m42686().getClass();
                    C18317.m42684(str2, jElapsedRealtime2, 0L, 0L, -4);
                    throw e;
                }
            } catch (MalformedURLException e2) {
                C18317.m42686().getClass();
                C18317.m42684(str2, jElapsedRealtime2, 0L, 0L, -3);
                throw e2;
            } catch (SocketTimeoutException e3) {
                i = -8;
                j = 0;
                jB = 0;
                if (i5 >= i3) {
                    C18317.m42686().getClass();
                    C18317.m42684(str2, jElapsedRealtime2, 0L, 0L, -8);
                    throw e3;
                }
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (i5 < i3) {
                    i4 = i5;
                }
            } catch (IOException e4) {
                int iM49230 = m49230(e4);
                C18317.m42686().getClass();
                C18317.m42684(str2, jElapsedRealtime2, 0L, 0L, iM49230);
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49235(C21451 c21451, Activity activity, Bundle bundle) {
        C9145.m23518("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
        try {
            C16926.f51987.execute(new RunnableC1383(c21451, activity, bundle));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49230(IOException iOException) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4722 m49232(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle(bundle);
        HashMap mapM49231 = m49231(bundle2);
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
            return C20245.m46489().m46494(mapM49231, str);
        }
        C9145.m23519("openSDK_LOG.HttpUtils", "openUrl: has binary " + map.size());
        return C20245.m46489().m46491(str, mapM49231, map);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m49234(Bundle bundle) {
        HashMap mapM49231 = m49231(bundle);
        if (mapM49231.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : mapM49231.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(com.alipay.sdk.m.w.a.p);
            }
            sb.append(C12789.encode(str));
            sb.append("=");
            sb.append(C12789.encode((String) mapM49231.get(str)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m49231(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (!(obj instanceof String) && !(obj instanceof String[])) {
                    C9145.m23519("openSDK_LOG.HttpUtils", "parseBundleToMap: the type " + obj.getClass() + " is unsupported");
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
