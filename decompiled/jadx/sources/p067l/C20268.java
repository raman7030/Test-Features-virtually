package p067l;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20268 extends C5045 {

    /* JADX INFO: renamed from: ֫ */
    public String f62641;

    /* JADX INFO: renamed from: ۧ */
    public String f62642;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC6386 f62643;

    public C20268(Context context, String str, InterfaceC6386 interfaceC6386) {
        new WeakReference(context);
        this.f62642 = "";
        this.f62641 = str;
        this.f62643 = interfaceC6386;
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5758(JSONObject jSONObject) {
        C19777 c19777M44948 = C19777.m44948();
        String strM25286 = C10965.m25286(new StringBuilder(), this.f62642, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c19777M44948.getClass();
        C19777.m44947(strM25286, jElapsedRealtime, 0L, 0L, iOptInt, this.f62641);
        InterfaceC6386 interfaceC6386 = this.f62643;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5758(jSONObject);
            this.f62643 = null;
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5757(C21139 c21139) {
        String str = c21139.f66433;
        String strM40053 = this.f62641;
        if (str != null) {
            strM40053 = C17588.m40053(str, strM40053);
        }
        C19777 c19777M44948 = C19777.m44948();
        String strM25286 = C10965.m25286(new StringBuilder(), this.f62642, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c21139.f66431;
        c19777M44948.getClass();
        C19777.m44947(strM25286, jElapsedRealtime, 0L, 0L, i, strM40053);
        InterfaceC6386 interfaceC6386 = this.f62643;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5757(c21139);
            this.f62643 = null;
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5756() {
        InterfaceC6386 interfaceC6386 = this.f62643;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5756();
            this.f62643 = null;
        }
    }
}
