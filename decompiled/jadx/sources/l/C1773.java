package l;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C1773 {

    /* JADX INFO: renamed from: ۙ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f6144;

    /* JADX INFO: renamed from: ۖۡܺ, reason: not valid java name and contains not printable characters */
    public static C3059 m5902(Object obj, Object obj2) {
        return C3059.m9363((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۗܿۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m5903(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ۙܶ۟, reason: not valid java name and contains not printable characters */
    public static void m5904(Object obj, boolean z) {
        ((C19258) obj).m44428(z);
    }

    /* JADX INFO: renamed from: ۠ᩴۤ, reason: not valid java name and contains not printable characters */
    public static EditText m5905(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m5906(Object obj, Object obj2) {
        return ((C19697) obj).m45390((String) obj2);
    }

    /* JADX INFO: renamed from: ۢܰۤ, reason: not valid java name and contains not printable characters */
    public static void m5907(Object obj, Object obj2) {
        ((C18237) obj).m42491((String) obj2);
    }

    /* JADX INFO: renamed from: ۢܺ᩸, reason: not valid java name and contains not printable characters */
    public static int m5908() {
        return 1695001721;
    }

    /* JADX INFO: renamed from: ۫ܶܺ, reason: not valid java name and contains not printable characters */
    public static boolean m5910(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ܰۗۘ, reason: not valid java name and contains not printable characters */
    public static int m5911(int i, Object obj) {
        return C15972.m37744(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܳܳۗ, reason: not valid java name and contains not printable characters */
    public static C19258 m5912(Object obj) {
        return ((InterfaceC13223) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ܶۜܰ, reason: not valid java name and contains not printable characters */
    public static boolean m5913(Object obj) {
        return ((DialogInterfaceC0206) obj).m1442();
    }

    /* JADX INFO: renamed from: ܿ᩺᩹, reason: not valid java name and contains not printable characters */
    public static String m5914(Object obj) {
        return ((C16709) obj).m39295();
    }

    /* JADX INFO: renamed from: ᩳ᩻᩹, reason: not valid java name and contains not printable characters */
    public static void m5915(Object obj) {
        ((AbstractActivityC3346) obj).m10232();
    }

    /* JADX INFO: renamed from: ᩵ܳۘ, reason: not valid java name and contains not printable characters */
    public static boolean m5916(Object obj) {
        return ((C23881) obj).m52607();
    }

    /* JADX INFO: renamed from: ᩷ᩳ᩺, reason: not valid java name and contains not printable characters */
    public static String m5917(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩺ۧܿ, reason: not valid java name and contains not printable characters */
    public static String m5918(Object obj) {
        return ((InterfaceC5471) obj).getName();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MediaSession.QueueItem m5901(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MediaDescription m5900(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m5909(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
