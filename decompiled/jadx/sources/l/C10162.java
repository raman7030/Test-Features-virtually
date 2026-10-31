package l;

import android.os.SystemClock;
import com.tencent.connect.auth.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10162 extends C2816 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f30563;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f30564;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f30565;

    public C10162(a aVar, String str, InterfaceC4227 interfaceC4227) {
        this.f30564 = aVar;
        this.f30563 = str;
        this.f30565 = interfaceC4227;
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3455(JSONObject jSONObject) {
        C18317 c18317M42686 = C18317.m42686();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c18317M42686.getClass();
        C18317.m42685("action_login_H5", jElapsedRealtime, 0L, 0L, iOptInt, this.f30563);
        InterfaceC4227 interfaceC4227 = this.f30565;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3455(jSONObject);
            this.f30565 = null;
        }
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3454(C19750 c19750) {
        String str = c19750.f63798;
        String strM37867 = this.f30563;
        if (str != null) {
            strM37867 = C16014.m37867(str, strM37867);
        }
        C18317 c18317M42686 = C18317.m42686();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c19750.f63796;
        c18317M42686.getClass();
        C18317.m42685("action_login_H5", jElapsedRealtime, 0L, 0L, i, strM37867);
        a.m897(this.f30564, strM37867);
        InterfaceC4227 interfaceC4227 = this.f30565;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3454(c19750);
            this.f30565 = null;
        }
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3453() {
        InterfaceC4227 interfaceC4227 = this.f30565;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3453();
            this.f30565 = null;
        }
    }
}
