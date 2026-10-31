package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۜᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6921 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static volatile C6921 f21363;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Object f21364 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11155 f21365;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17504 f21366;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23106 f21367;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f21368;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18955 f21369;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f21370;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f21371;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1982 f21372;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f21373;

    public C6921(AbstractC7584 abstractC7584) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f21371 = reentrantReadWriteLock;
        this.f21370 = 3;
        InterfaceC17504 interfaceC17504 = abstractC7584.f23458;
        this.f21366 = interfaceC17504;
        int i = abstractC7584.f23457;
        this.f21373 = i;
        this.f21365 = abstractC7584.f23456;
        this.f21368 = new Handler(Looper.getMainLooper());
        this.f21369 = new C18955();
        this.f21372 = new C1982();
        C23106 c23106 = new C23106(this);
        this.f21367 = c23106;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f21370 = 0;
            } catch (Throwable th) {
                this.f21371.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m18718() == 0) {
            try {
                interfaceC17504.mo8407(new C11818(c23106));
            } catch (Throwable th2) {
                m18721(th2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18714(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                AbstractC22443[] abstractC22443Arr = (AbstractC22443[]) editable.getSpans(selectionStart, iMin, AbstractC22443.class);
                if (abstractC22443Arr != null && abstractC22443Arr.length > 0) {
                    for (AbstractC22443 abstractC22443 : abstractC22443Arr) {
                        int spanStart = editable.getSpanStart(abstractC22443);
                        int spanEnd = editable.getSpanEnd(abstractC22443);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18712(AbstractC7584 abstractC7584) {
        if (f21363 == null) {
            synchronized (f21364) {
                if (f21363 == null) {
                    f21363 = new C6921(abstractC7584);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m18716() {
        return f21363 != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C6921 m18717() {
        C6921 c6921;
        synchronized (f21364) {
            c6921 = f21363;
            if (!(c6921 != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c6921;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18723() {
        if (!(this.f21373 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m18718() == 1) {
            return;
        }
        this.f21371.writeLock().lock();
        try {
            if (this.f21370 != 0) {
                this.f21370 = 0;
                this.f21371.writeLock().unlock();
                C23106 c23106 = this.f21367;
                C6921 c6921 = c23106.f41609;
                try {
                    c6921.f21366.mo8407(new C11818(c23106));
                    return;
                } catch (Throwable th) {
                    c6921.m18721(th);
                    return;
                }
            }
            this.f21371.writeLock().unlock();
        } catch (Throwable th2) {
            this.f21371.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18725() {
        ArrayList arrayList = new ArrayList();
        this.f21371.writeLock().lock();
        try {
            this.f21370 = 1;
            arrayList.addAll(this.f21369);
            this.f21369.clear();
            this.f21371.writeLock().unlock();
            this.f21368.post(new RunnableC18210(arrayList, this.f21370, null));
        } catch (Throwable th) {
            this.f21371.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18721(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f21371.writeLock().lock();
        try {
            this.f21370 = 2;
            arrayList.addAll(this.f21369);
            this.f21369.clear();
            this.f21371.writeLock().unlock();
            this.f21368.post(new RunnableC18210(arrayList, this.f21370, th));
        } catch (Throwable th2) {
            this.f21371.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18722(AbstractC16798 abstractC16798) {
        C13746.m33055(abstractC16798, "initCallback cannot be null");
        this.f21371.writeLock().lock();
        try {
            if (this.f21370 == 1 || this.f21370 == 2) {
                this.f21368.post(new RunnableC18210(Arrays.asList(abstractC16798), this.f21370, null));
            } else {
                this.f21369.add(abstractC16798);
            }
        } finally {
            this.f21371.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18724(AbstractC16798 abstractC16798) {
        C13746.m33055(abstractC16798, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f21371;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f21369.remove(abstractC16798);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18718() {
        this.f21371.readLock().lock();
        try {
            return this.f21370;
        } finally {
            this.f21371.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m18719(int i, int i2, CharSequence charSequence) {
        if (!(m18718() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C13746.m33056("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        C13746.m33056("start should be < than charSequence length", i <= charSequence.length());
        C13746.m33056("end should be < than charSequence length", i2 <= charSequence.length());
        return (charSequence.length() == 0 || i == i2) ? charSequence : this.f21367.m51292(charSequence, i, i2, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18720(EditorInfo editorInfo) {
        if (m18718() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f21367.m51293(editorInfo);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18713(Editable editable, int i, KeyEvent keyEvent) {
        return C21738.m49062(editable, i, keyEvent);
    }
}
