package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩷۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes4.dex */
public final class C20892 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C16197 f67595;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f67594 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11493 f67593 = new C11493();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static EnumC6780 f67596 = EnumC6780.UNINITIALIZED;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47727(ContextWrapper contextWrapper) {
        synchronized (f67594) {
            if (f67596 != EnumC6780.UNINITIALIZED) {
                return;
            }
            f67596 = EnumC6780.INITIALIZING;
            final Context applicationContext = contextWrapper.getApplicationContext();
            C1802.f6208.execute(new Runnable() { // from class: l.ܿ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C20892.m47726(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47726(Context context) {
        C16197 c16197;
        try {
            c16197 = new C16197(new File(context.getCacheDir(), "video_media_cache"), new C21138(), new C20744(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
            try {
                Object obj = f67594;
                synchronized (obj) {
                    f67595 = c16197;
                    f67596 = EnumC6780.READY;
                    obj.notifyAll();
                }
            } catch (Throwable unused) {
                if (c16197 != null) {
                    c16197.m38146();
                }
                Object obj2 = f67594;
                synchronized (obj2) {
                    f67595 = null;
                    f67596 = EnumC6780.DISABLED;
                    obj2.notifyAll();
                }
                f67593.close();
            }
        } catch (Throwable unused2) {
            c16197 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23713 m47730(ContextWrapper contextWrapper) {
        C16197 c16197;
        boolean z;
        synchronized (f67594) {
            c16197 = f67596 == EnumC6780.READY ? f67595 : null;
            z = f67596 == EnumC6780.UNINITIALIZED || f67596 == EnumC6780.INITIALIZING;
        }
        if (z) {
            m47727(contextWrapper);
        }
        return new C23713(c16197, z, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C11493 m47732() {
        return f67593;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47724(Uri uri, InterfaceC15097 interfaceC15097) {
        if (interfaceC15097 instanceof C16410) {
            C16410 c16410 = (C16410) interfaceC15097;
            if (!c16410.m38671().isEmpty()) {
                String str = uri.buildUpon().fragment(null).build() + "\n" + c16410.m38671();
                MessageDigest messageDigestM34534 = C14460.m34534();
                m47728(messageDigestM34534, str);
                return "http:".concat(C14460.m34531(messageDigestM34534.digest()));
            }
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        MessageDigest messageDigestM34535 = C14460.m34534();
        m47728(messageDigestM34535, string);
        return "http:".concat(C14460.m34531(messageDigestM34535.digest()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47725(AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, String str) {
        MessageDigest messageDigestM34534 = C14460.m34534();
        abstractC13921.mo7639(messageDigestM34534);
        m47728(messageDigestM34534, interfaceC17889.getPath());
        long size = interfaceC17889.getSize();
        long time = interfaceC17889.getTime();
        m47728(messageDigestM34534, Long.toString(size));
        m47728(messageDigestM34534, Long.toString(time));
        if (size < 0 || time <= 0) {
            m47728(messageDigestM34534, str);
        }
        return "visitor:".concat(C14460.m34531(messageDigestM34534.digest()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47728(MessageDigest messageDigest, String str) {
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m47733() {
        Object obj = f67594;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
