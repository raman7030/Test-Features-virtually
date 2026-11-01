package p067l;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۧ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C0930 {

    /* JADX INFO: renamed from: ۙ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f81879;

    /* JADX INFO: renamed from: ۖۡܺ, reason: not valid java name and contains not printable characters */
    public static C5276 m55879(Object obj, Object obj2) {
        return C5276.m11405((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۗܿۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m55880(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ۙܶ۟, reason: not valid java name and contains not printable characters */
    public static void m55881(Object obj, boolean z) {
        ((C20671) obj).m46722(z);
    }

    /* JADX INFO: renamed from: ۠ᩴۤ, reason: not valid java name and contains not printable characters */
    public static EditText m55882(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static InputStream m55883(Object obj, Object obj2) {
        return ((C21089) obj).m47687((String) obj2);
    }

    /* JADX INFO: renamed from: ۢܰۤ, reason: not valid java name and contains not printable characters */
    public static void m55884(Object obj, Object obj2) {
        ((C19701) obj).m44750((String) obj2);
    }

    /* JADX INFO: renamed from: ۢܺ᩸, reason: not valid java name and contains not printable characters */
    public static int m55885() {
        return 1695001721;
    }

    /* JADX INFO: renamed from: ۫ܶܺ, reason: not valid java name and contains not printable characters */
    public static boolean m55886(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ܰۗۘ, reason: not valid java name and contains not printable characters */
    public static int m55887(int i, Object obj) {
        return C17548.m39928(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܳܳۗ, reason: not valid java name and contains not printable characters */
    public static C20671 m55888(Object obj) {
        return ((InterfaceC14936) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ܶۜܰ, reason: not valid java name and contains not printable characters */
    public static boolean m55889(Object obj) {
        return ((DialogInterfaceC2564) obj).m3855();
    }

    /* JADX INFO: renamed from: ܿ᩺᩹, reason: not valid java name and contains not printable characters */
    public static String m55890(Object obj) {
        return ((C18249) obj).m41531();
    }

    /* JADX INFO: renamed from: ᩳ᩻᩹, reason: not valid java name and contains not printable characters */
    public static void m55891(Object obj) {
        ((AbstractActivityC5549) obj).m12268();
    }

    /* JADX INFO: renamed from: ᩵ܳۘ, reason: not valid java name and contains not printable characters */
    public static boolean m55892(Object obj) {
        return ((C25065) obj).m55016();
    }

    /* JADX INFO: renamed from: ᩷ᩳ᩺, reason: not valid java name and contains not printable characters */
    public static String m55893(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩺ۧܿ, reason: not valid java name and contains not printable characters */
    public static String m55894(Object obj) {
        return ((InterfaceC7568) obj).getName();
    }

    /* JADX INFO: renamed from: ֫ */
    public static MediaSession.QueueItem m8112(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static MediaDescription m8111(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m8113(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
