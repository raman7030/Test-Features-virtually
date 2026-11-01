package p067l;

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
public final class C5025 extends AbstractC17764 implements Handler.Callback {

    /* JADX INFO: renamed from: ֫֫ */
    public Handler f11510;

    /* JADX INFO: renamed from: ۗ */
    public FileWriter f11511;

    /* JADX INFO: renamed from: ۙ */
    public C6366 f11512;

    /* JADX INFO: renamed from: ۛ */
    public volatile C3012 f11513;

    /* JADX INFO: renamed from: ۟ */
    public HandlerThread f11514;

    /* JADX INFO: renamed from: ۤ */
    public volatile C3012 f11515;

    /* JADX INFO: renamed from: ۨ */
    public volatile C3012 f11516;

    /* JADX INFO: renamed from: ۫ */
    public char[] f11517;

    /* JADX INFO: renamed from: ۬ */
    public File f11518;

    /* JADX INFO: renamed from: ܰ */
    public volatile boolean f11519;

    /* JADX INFO: renamed from: ᩺ */
    public volatile C3012 f11520;

    public C5025(C6366 c6366) {
        String str = C20448.f63161;
        this.f11519 = false;
        this.f11512 = c6366;
        this.f11515 = new C3012();
        this.f11513 = new C3012();
        this.f11516 = this.f11515;
        this.f11520 = this.f11513;
        this.f11517 = new char[c6366.m14576()];
        HandlerThread handlerThread = new HandlerThread("OpenSDK.Client.File.Tracer", 10);
        this.f11514 = handlerThread;
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f11510 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10694() {
        Handler handler = this.f11510;
        if (handler.hasMessages(1024)) {
            handler.removeMessages(1024);
        }
        handler.sendEmptyMessage(1024);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m10696() {
        m10692();
        this.f11514.quit();
    }

    @Override // p067l.AbstractC17764
    /* JADX INFO: renamed from: ۧ */
    public final void mo10695(int i, Thread thread, long j, String str, String str2, Throwable th) {
        String str3;
        m40366().getClass();
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
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, "][", str, "] ", str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        this.f11516.m5089(sb.toString());
        if (this.f11516.m5090() >= this.f11512.m14576()) {
            m10694();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024 && Thread.currentThread() == this.f11514 && !this.f11519) {
            this.f11519 = true;
            synchronized (this) {
                if (this.f11516 == this.f11515) {
                    this.f11516 = this.f11513;
                    this.f11520 = this.f11515;
                } else {
                    this.f11516 = this.f11515;
                    this.f11520 = this.f11513;
                }
            }
            try {
                try {
                    this.f11520.m5088(m10693(), this.f11517);
                } catch (IOException e) {
                    C11060.m25465("FileTracer", "flushBuffer exception", e);
                }
                this.f11520.m5091();
                this.f11519 = false;
            } catch (Throwable th) {
                this.f11520.m5091();
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m10692() {
        try {
            FileWriter fileWriter = this.f11511;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f11511.close();
            }
        } catch (IOException e) {
            C11060.m25465("openSDK_LOG", "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private FileWriter m10693() {
        String string;
        File file;
        File[] fileArrListFiles;
        this.f11512.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        String strM16053 = C6988.m16053("com.tencent.mobileqq_connectSdk.", new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime()), ".log");
        File fileM53422 = C24158.m53422();
        if (fileM53422 != null) {
            if (!fileM53422.exists()) {
                fileM53422.mkdirs();
            }
            string = fileM53422.toString();
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string) && string == null) {
            file = null;
        } else {
            try {
                File file2 = new File(string, C20448.f63163);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, strM16053);
            } catch (Exception e) {
                C11060.m25465("openSDK_LOG", "getWorkFile,get app specific file exception:", e);
                file = null;
            }
        }
        if (file != null && (!file.equals(this.f11518) || this.f11511 == null)) {
            this.f11518 = file;
            m10692();
            try {
                this.f11511 = new FileWriter(this.f11518, true);
            } catch (IOException unused) {
                this.f11511 = null;
                C11060.m25467("openSDK_LOG", "-->obtainFileWriter() app specific file permission denied");
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory() && (fileArrListFiles = parentFile.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3 != null) {
                        String name = file3.getName();
                        C11060.m25464("FileTracer", "name=" + name);
                        if (!TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log")) {
                            String name2 = file3.getName();
                            String strSubstring = name2.substring(32, 43);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - 259200000;
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(jCurrentTimeMillis2);
                            if (new SimpleDateFormat("yy.MM.dd.HH").format(calendar2.getTime()).compareTo(strSubstring) > 0) {
                                C11060.m25464("FileTracer", "delete name=" + name2 + ", success=" + file3.delete());
                            }
                        }
                    }
                }
            }
        }
        return this.f11511;
    }
}
