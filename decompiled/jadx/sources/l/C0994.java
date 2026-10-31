package l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.Main;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.֨۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0994 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle f3705 = new Bundle();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f3706;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class f3707;

    public C0994(Class cls) {
        this.f3707 = cls;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3474(String str, String str2) {
        this.f3705.putString(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3478(List list) {
        m3477("ARG_PATHS", (String[]) C5378.stream(list).map(new C1775(1)).toArray(new C19340()));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3485(List list) {
        m3477("ARG_PATHS", (String[]) C5378.stream(list).map(new C10985(3)).toArray(new C0288(0)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3483(List list) {
        m3477("ARG_PATHS", (String[]) C5378.stream(list).map(new C18554(4)).toArray(new C5228(0)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3472(Main main, C11667 c11667) {
        if (c11667 == null) {
            return;
        }
        try {
            try {
                m3476("ARG_SIGNATURE_OPTIONS", c11667.m28554());
            } catch (IOException e) {
                main.m10223(e, (DialogInterface.OnDismissListener) null);
                this.f3706 = true;
            }
        } finally {
            c11667.m28557().mo14000();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3481(AbstractC16891 abstractC16891) {
        m3476("ARG_STATELESS_VISITOR", abstractC16891.mo6020().m33350());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3486(C2450 c2450) {
        Bundle bundle = this.f3705;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c2450.m7921().m39064());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c2450.m7921().m39022());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3480(C16560 c16560) {
        Bundle bundle = this.f3705;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c16560.m39064());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c16560.m39022());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3479(C2450 c2450) {
        Bundle bundle = this.f3705;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c2450.m7921().m39064());
        }
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c2450.m7919().m39022());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3484(C2450 c2450) {
        Bundle bundle = this.f3705;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c2450.m7921().m39064());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c2450.m7921().m39022());
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c2450.m7919().m39022());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3477(String str, String[] strArr) {
        C10130 c10130 = new C10130();
        c10130.writeInt(strArr.length);
        for (String str2 : strArr) {
            c10130.m25423((CharSequence) str2);
        }
        m3476(str, c10130.m25427());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3470(int i, String str) {
        this.f3705.putInt(str, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3471(long j, String str) {
        this.f3705.putLong(str, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3475(String str, boolean z) {
        this.f3705.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3476(String str, byte[] bArr) {
        int length = bArr.length;
        Bundle bundle = this.f3705;
        if (length > 51200) {
            AbstractC15440 abstractC15440M36527 = C16293.f50113.m36527();
            try {
                abstractC15440M36527.m36503(bArr, 0, bArr.length);
                bundle.putString(str, abstractC15440M36527.mo23554());
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        bundle.putByteArray(str, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3473(String str, Serializable serializable) {
        this.f3705.putSerializable(str, serializable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m3469() {
        if (this.f3706) {
            return -1;
        }
        int iIncrementAndGet = AbstractC3817.f12033.incrementAndGet();
        Application applicationM14335 = C4925.m14335();
        Intent intent = new Intent(applicationM14335, (Class<?>) ServiceC8961.class);
        intent.putExtra("TaskClass", this.f3707);
        intent.putExtra("TaskId", iIncrementAndGet);
        intent.putExtra("TaskArgument", this.f3705);
        C0881.m3232(applicationM14335, intent);
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3482() {
        if (this.f3706) {
            return -1;
        }
        Bundle bundle = this.f3705;
        Class cls = this.f3707;
        int iIncrementAndGet = AbstractC3817.f12033.incrementAndGet();
        try {
            AbstractC3817 abstractC3817 = (AbstractC3817) cls.newInstance();
            Intent intent = new Intent();
            intent.putExtra("TaskId", iIncrementAndGet);
            intent.putExtra("TaskArgument", bundle);
            abstractC3817.mo11519(intent);
            C1802.f6208.submit(new RunnableC8050(null, abstractC3817, 0));
            return iIncrementAndGet;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
