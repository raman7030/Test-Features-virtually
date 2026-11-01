package p067l;

import android.os.SystemClock;
import com.tencent.connect.auth.DialogC0602a;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12026 extends C5045 {

    /* JADX INFO: renamed from: ֫ */
    public String f33525;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ DialogC0602a f33526;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC6386 f33527;

    public C12026(DialogC0602a dialogC0602a, String str, InterfaceC6386 interfaceC6386) {
        this.f33526 = dialogC0602a;
        this.f33525 = str;
        this.f33527 = interfaceC6386;
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5758(JSONObject jSONObject) {
        C19777 c19777M44948 = C19777.m44948();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c19777M44948.getClass();
        C19777.m44947("action_login_H5", jElapsedRealtime, 0L, 0L, iOptInt, this.f33525);
        InterfaceC6386 interfaceC6386 = this.f33527;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5758(jSONObject);
            this.f33527 = null;
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5757(C21139 c21139) {
        String str = c21139.f66433;
        String strM40053 = this.f33525;
        if (str != null) {
            strM40053 = C17588.m40053(str, strM40053);
        }
        C19777 c19777M44948 = C19777.m44948();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c21139.f66431;
        c19777M44948.getClass();
        C19777.m44947("action_login_H5", jElapsedRealtime, 0L, 0L, i, strM40053);
        DialogC0602a.m1983(this.f33526, strM40053);
        InterfaceC6386 interfaceC6386 = this.f33527;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5757(c21139);
            this.f33527 = null;
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5756() {
        InterfaceC6386 interfaceC6386 = this.f33527;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5756();
            this.f33527 = null;
        }
    }
}
