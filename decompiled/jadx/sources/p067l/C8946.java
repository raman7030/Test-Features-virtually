package p067l;

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
public final class C8946 {

    /* JADX INFO: renamed from: ۡ */
    public static volatile C8946 f24244;

    /* JADX INFO: renamed from: ۢ */
    public static final Object f24245 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12970 f24246;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC19004 f24247;

    /* JADX INFO: renamed from: ۧ */
    public final C24328 f24248;

    /* JADX INFO: renamed from: ܳ */
    public final Handler f24249;

    /* JADX INFO: renamed from: ܽ */
    public final C1782 f24250;

    /* JADX INFO: renamed from: ܿ */
    public volatile int f24251;

    /* JADX INFO: renamed from: ᩳ */
    public final ReentrantReadWriteLock f24252;

    /* JADX INFO: renamed from: ᩷ */
    public final C4252 f24253;

    /* JADX INFO: renamed from: ᩻ */
    public final int f24254;

    public C8946(AbstractC9576 abstractC9576) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f24252 = reentrantReadWriteLock;
        this.f24251 = 3;
        InterfaceC19004 interfaceC19004 = abstractC9576.f26369;
        this.f24247 = interfaceC19004;
        int i = abstractC9576.f26368;
        this.f24254 = i;
        this.f24246 = abstractC9576.f26367;
        this.f24249 = new Handler(Looper.getMainLooper());
        this.f24250 = new C1782();
        this.f24253 = new C4252();
        C24328 c24328 = new C24328(this);
        this.f24248 = c24328;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f24251 = 0;
            } catch (Throwable th) {
                this.f24252.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m20667() == 0) {
            try {
                interfaceC19004.mo10453(new C13600(c24328));
            } catch (Throwable th2) {
                m20670(th2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20663(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
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
                AbstractC23698[] abstractC23698Arr = (AbstractC23698[]) editable.getSpans(selectionStart, iMin, AbstractC23698.class);
                if (abstractC23698Arr != null && abstractC23698Arr.length > 0) {
                    for (AbstractC23698 abstractC23698 : abstractC23698Arr) {
                        int spanStart = editable.getSpanStart(abstractC23698);
                        int spanEnd = editable.getSpanEnd(abstractC23698);
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

    /* JADX INFO: renamed from: ֫ */
    public static void m20661(AbstractC9576 abstractC9576) {
        if (f24244 == null) {
            synchronized (f24245) {
                if (f24244 == null) {
                    f24244 = new C8946(abstractC9576);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m20665() {
        return f24244 != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C8946 m20666() {
        C8946 c8946;
        synchronized (f24245) {
            c8946 = f24244;
            if (!(c8946 != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c8946;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20672() {
        if (!(this.f24254 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m20667() == 1) {
            return;
        }
        this.f24252.writeLock().lock();
        try {
            if (this.f24251 != 0) {
                this.f24251 = 0;
                this.f24252.writeLock().unlock();
                C24328 c24328 = this.f24248;
                C8946 c8946 = c24328.f44690;
                try {
                    c8946.f24247.mo10453(new C13600(c24328));
                    return;
                } catch (Throwable th) {
                    c8946.m20670(th);
                    return;
                }
            }
            this.f24252.writeLock().unlock();
        } catch (Throwable th2) {
            this.f24252.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20674() {
        ArrayList arrayList = new ArrayList();
        this.f24252.writeLock().lock();
        try {
            this.f24251 = 1;
            arrayList.addAll(this.f24250);
            this.f24250.clear();
            this.f24252.writeLock().unlock();
            this.f24249.post(new RunnableC19675(arrayList, this.f24251, null));
        } catch (Throwable th) {
            this.f24252.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20670(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f24252.writeLock().lock();
        try {
            this.f24251 = 2;
            arrayList.addAll(this.f24250);
            this.f24250.clear();
            this.f24252.writeLock().unlock();
            this.f24249.post(new RunnableC19675(arrayList, this.f24251, th));
        } catch (Throwable th2) {
            this.f24252.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20671(AbstractC18333 abstractC18333) {
        C1524.m35169(abstractC18333, "initCallback cannot be null");
        this.f24252.writeLock().lock();
        try {
            if (this.f24251 == 1 || this.f24251 == 2) {
                this.f24249.post(new RunnableC19675(Arrays.asList(abstractC18333), this.f24251, null));
            } else {
                this.f24250.add(abstractC18333);
            }
        } finally {
            this.f24252.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20673(AbstractC18333 abstractC18333) {
        C1524.m35169(abstractC18333, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f24252;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f24250.remove(abstractC18333);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20667() {
        this.f24252.readLock().lock();
        try {
            return this.f24251;
        } finally {
            this.f24252.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m20668(int i, int i2, CharSequence charSequence) {
        if (!(m20667() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C1524.m35170("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        C1524.m35170("start should be < than charSequence length", i <= charSequence.length());
        C1524.m35170("end should be < than charSequence length", i2 <= charSequence.length());
        return (charSequence.length() == 0 || i == i2) ? charSequence : this.f24248.m53686(charSequence, i, i2, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20669(EditorInfo editorInfo) {
        if (m20667() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f24248.m53687(editorInfo);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20662(Editable editable, int i, KeyEvent keyEvent) {
        return C23028.m51411(editable, i, keyEvent);
    }
}
