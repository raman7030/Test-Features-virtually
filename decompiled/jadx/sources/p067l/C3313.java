package p067l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.p000mt.plus.Main;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.֨۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3313 {

    /* JADX INFO: renamed from: ֫ */
    public final Bundle f6480 = new Bundle();

    /* JADX INFO: renamed from: ۧ */
    public boolean f6481;

    /* JADX INFO: renamed from: ܽ */
    public final Class f6482;

    public C3313(Class cls) {
        this.f6482 = cls;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5777(String str, String str2) {
        this.f6480.putString(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5781(List list) {
        m5780("ARG_PATHS", (String[]) C7480.stream(list).map(new C4055(1)).toArray(new C20749()));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5788(List list) {
        m5780("ARG_PATHS", (String[]) C7480.stream(list).map(new C12809(3)).toArray(new C2642(0)));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5786(List list) {
        m5780("ARG_PATHS", (String[]) C7480.stream(list).map(new C20002(4)).toArray(new C7337(0)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5775(Main main, C13457 c13457) {
        if (c13457 == null) {
            return;
        }
        try {
            try {
                m5779("ARG_SIGNATURE_OPTIONS", c13457.m30602());
            } catch (IOException e) {
                main.m12259(e, (DialogInterface.OnDismissListener) null);
                this.f6481 = true;
            }
        } finally {
            c13457.m30605().mo15880();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5784(AbstractC18422 abstractC18422) {
        m5779("ARG_STATELESS_VISITOR", abstractC18422.mo8217().m35469());
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5789(C4697 c4697) {
        Bundle bundle = this.f6480;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c4697.m9969().m41290());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c4697.m9969().m41248());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5783(C18107 c18107) {
        Bundle bundle = this.f6480;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c18107.m41290());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c18107.m41248());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5782(C4697 c4697) {
        Bundle bundle = this.f6480;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c4697.m9969().m41290());
        }
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c4697.m9967().m41248());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5787(C4697 c4697) {
        Bundle bundle = this.f6480;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c4697.m9969().m41290());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c4697.m9969().m41248());
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c4697.m9967().m41248());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5780(String str, String[] strArr) {
        C11996 c11996 = new C11996();
        c11996.writeInt(strArr.length);
        for (String str2 : strArr) {
            c11996.m27443((CharSequence) str2);
        }
        m5779(str, c11996.m27447());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5773(int i, String str) {
        this.f6480.putInt(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5774(long j, String str) {
        this.f6480.putLong(str, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5778(String str, boolean z) {
        this.f6480.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5779(String str, byte[] bArr) {
        int length = bArr.length;
        Bundle bundle = this.f6480;
        if (length > 51200) {
            AbstractC17043 abstractC17043M38685 = C17853.f53280.m38685();
            try {
                abstractC17043M38685.m38661(bArr, 0, bArr.length);
                bundle.putString(str, abstractC17043M38685.mo25505());
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        bundle.putByteArray(str, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5776(String str, Serializable serializable) {
        this.f6480.putSerializable(str, serializable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5772() {
        if (this.f6481) {
            return -1;
        }
        int iIncrementAndGet = AbstractC5996.f14840.incrementAndGet();
        Application applicationM16232 = C7050.m16232();
        Intent intent = new Intent(applicationM16232, (Class<?>) ServiceC10885.class);
        intent.putExtra("TaskClass", this.f6482);
        intent.putExtra("TaskId", iIncrementAndGet);
        intent.putExtra("TaskArgument", this.f6480);
        C0886.m5546(applicationM16232, intent);
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5785() {
        if (this.f6481) {
            return -1;
        }
        Bundle bundle = this.f6480;
        Class cls = this.f6482;
        int iIncrementAndGet = AbstractC5996.f14840.incrementAndGet();
        try {
            AbstractC5996 abstractC5996 = (AbstractC5996) cls.newInstance();
            Intent intent = new Intent();
            intent.putExtra("TaskId", iIncrementAndGet);
            intent.putExtra("TaskArgument", bundle);
            abstractC5996.mo13455(intent);
            C4081.f8987.submit(new RunnableC10019(null, abstractC5996, 0));
            return iIncrementAndGet;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
