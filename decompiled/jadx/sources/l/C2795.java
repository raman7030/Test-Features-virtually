package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2795 extends AbstractC16199 implements Handler.Callback {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Handler f8716;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FileWriter f8717;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4206 f8718;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8719;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HandlerThread f8720;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8721;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8722;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public char[] f8723;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public File f8724;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f8725;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile C0677 f8726;

    public C2795(C4206 c4206) {
        String str = C19023.f59932;
        this.f8725 = false;
        this.f8718 = c4206;
        this.f8721 = new C0677();
        this.f8719 = new C0677();
        this.f8722 = this.f8721;
        this.f8726 = this.f8719;
        this.f8723 = new char[c4206.m12700()];
        HandlerThread handlerThread = new HandlerThread("OpenSDK.Client.File.Tracer", 10);
        this.f8720 = handlerThread;
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f8716 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8634() {
        Handler handler = this.f8716;
        if (handler.hasMessages(1024)) {
            handler.removeMessages(1024);
        }
        handler.sendEmptyMessage(1024);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8636() {
        m8632();
        this.f8720.quit();
    }

    @Override // l.AbstractC16199
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8635(int i, Thread thread, long j, String str, String str2, Throwable th) {
        String str3;
        m38154().getClass();
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            str3 = "V";
        } else if (i == 2) {
            str3 = "D";
        } else if (i == 4) {
            str3 = "I";
        } else if (i == 8) {
            str3 = "W";
        } else if (i != 16) {
            str3 = i != 32 ? "-" : "A";
        } else {
            str3 = "E";
        }
        sb.append(str3);
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j2 < 10) {
            sb.append(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT);
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2);
        sb.append(" [");
        sb.append(Process.myPid());
        sb.append("][");
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, "][", str, "] ", str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        this.f8722.m2750(sb.toString());
        if (this.f8722.m2751() >= this.f8718.m12700()) {
            m8634();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024 && Thread.currentThread() == this.f8720 && !this.f8725) {
            this.f8725 = true;
            synchronized (this) {
                if (this.f8722 == this.f8721) {
                    this.f8722 = this.f8719;
                    this.f8726 = this.f8721;
                } else {
                    this.f8722 = this.f8721;
                    this.f8726 = this.f8719;
                }
            }
            try {
                try {
                    this.f8726.m2749(m8633(), this.f8723);
                } catch (IOException e) {
                    C9145.m23514("FileTracer", "flushBuffer exception", e);
                }
                this.f8726.m2752();
                this.f8725 = false;
            } catch (Throwable th) {
                this.f8726.m2752();
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m8632() {
        try {
            FileWriter fileWriter = this.f8717;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f8717.close();
            }
        } catch (IOException e) {
            C9145.m23514("openSDK_LOG", "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private FileWriter m8633() {
        String string;
        File file;
        File[] fileArrListFiles;
        this.f8718.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        String strM14172 = C4860.m14172("com.tencent.mobileqq_connectSdk.", new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime()), ".log");
        File fileM51031 = C22927.m51031();
        if (fileM51031 != null) {
            if (!fileM51031.exists()) {
                fileM51031.mkdirs();
            }
            string = fileM51031.toString();
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string) && string == null) {
            file = null;
        } else {
            try {
                File file2 = new File(string, C19023.f59934);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, strM14172);
            } catch (Exception e) {
                C9145.m23514("openSDK_LOG", "getWorkFile,get app specific file exception:", e);
                file = null;
            }
        }
        if (file != null && (!file.equals(this.f8724) || this.f8717 == null)) {
            this.f8724 = file;
            m8632();
            try {
                this.f8717 = new FileWriter(this.f8724, true);
            } catch (IOException unused) {
                this.f8717 = null;
                C9145.m23516("openSDK_LOG", "-->obtainFileWriter() app specific file permission denied");
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory() && (fileArrListFiles = parentFile.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3 != null) {
                        String name = file3.getName();
                        C9145.m23513("FileTracer", "name=" + name);
                        if (!TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log")) {
                            String name2 = file3.getName();
                            String strSubstring = name2.substring(32, 43);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - 259200000;
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(jCurrentTimeMillis2);
                            if (new SimpleDateFormat("yy.MM.dd.HH").format(calendar2.getTime()).compareTo(strSubstring) > 0) {
                                C9145.m23513("FileTracer", "delete name=" + name2 + ", success=" + file3.delete());
                            }
                        }
                    }
                }
            }
        }
        return this.f8717;
    }
}
