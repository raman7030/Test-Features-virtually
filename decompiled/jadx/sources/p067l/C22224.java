package p067l;

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
public final class C22224 {

    /* JADX INFO: renamed from: ܽ */
    public static C17762 f70281;

    /* JADX INFO: renamed from: ۧ */
    public static final Object f70280 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public static final C13291 f70279 = new C13291();

    /* JADX INFO: renamed from: ᩳ */
    public static EnumC8812 f70282 = EnumC8812.UNINITIALIZED;

    /* JADX INFO: renamed from: ֫ */
    public static void m50057(ContextWrapper contextWrapper) {
        synchronized (f70280) {
            if (f70282 != EnumC8812.UNINITIALIZED) {
                return;
            }
            f70282 = EnumC8812.INITIALIZING;
            final Context applicationContext = contextWrapper.getApplicationContext();
            C4081.f8987.execute(new Runnable() { // from class: l.ܿ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C22224.m50056(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50056(Context context) {
        C17762 c17762;
        try {
            c17762 = new C17762(new File(context.getCacheDir(), "video_media_cache"), new C22458(), new C22083(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
            try {
                Object obj = f70280;
                synchronized (obj) {
                    f70281 = c17762;
                    f70282 = EnumC8812.READY;
                    obj.notifyAll();
                }
            } catch (Throwable unused) {
                if (c17762 != null) {
                    c17762.m40358();
                }
                Object obj2 = f70280;
                synchronized (obj2) {
                    f70281 = null;
                    f70282 = EnumC8812.DISABLED;
                    obj2.notifyAll();
                }
                f70279.close();
            }
        } catch (Throwable unused2) {
            c17762 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C24905 m50060(ContextWrapper contextWrapper) {
        C17762 c17762;
        boolean z;
        synchronized (f70280) {
            c17762 = f70282 == EnumC8812.READY ? f70281 : null;
            z = f70282 == EnumC8812.UNINITIALIZED || f70282 == EnumC8812.INITIALIZING;
        }
        if (z) {
            m50057(contextWrapper);
        }
        return new C24905(c17762, z, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ܿ */
    public static C13291 m50062() {
        return f70279;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50054(Uri uri, InterfaceC16716 interfaceC16716) {
        if (interfaceC16716 instanceof C17964) {
            C17964 c17964 = (C17964) interfaceC16716;
            if (!c17964.m40887().isEmpty()) {
                String str = uri.buildUpon().fragment(null).build() + "\n" + c17964.m40887();
                MessageDigest messageDigestM36668 = C16111.m36668();
                m50058(messageDigestM36668, str);
                return "http:".concat(C16111.m36665(messageDigestM36668.digest()));
            }
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        MessageDigest messageDigestM36669 = C16111.m36668();
        m50058(messageDigestM36669, string);
        return "http:".concat(C16111.m36665(messageDigestM36669.digest()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50055(AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370, String str) {
        MessageDigest messageDigestM36668 = C16111.m36668();
        abstractC15599.mo9710(messageDigestM36668);
        m50058(messageDigestM36668, interfaceC19370.getPath());
        long size = interfaceC19370.getSize();
        long time = interfaceC19370.getTime();
        m50058(messageDigestM36668, Long.toString(size));
        m50058(messageDigestM36668, Long.toString(time));
        if (size < 0 || time <= 0) {
            m50058(messageDigestM36668, str);
        }
        return "visitor:".concat(C16111.m36665(messageDigestM36668.digest()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50058(MessageDigest messageDigest, String str) {
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m50063() {
        Object obj = f70280;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
