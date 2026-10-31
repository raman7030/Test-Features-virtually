package l;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18834 extends C2816 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f59413;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f59414;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f59415;

    public C18834(Context context, String str, InterfaceC4227 interfaceC4227) {
        new WeakReference(context);
        this.f59414 = "";
        this.f59413 = str;
        this.f59415 = interfaceC4227;
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3455(JSONObject jSONObject) {
        C18317 c18317M42686 = C18317.m42686();
        String strM23341 = C9045.m23341(new StringBuilder(), this.f59414, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c18317M42686.getClass();
        C18317.m42685(strM23341, jElapsedRealtime, 0L, 0L, iOptInt, this.f59413);
        InterfaceC4227 interfaceC4227 = this.f59415;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3455(jSONObject);
            this.f59415 = null;
        }
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3454(C19750 c19750) {
        String str = c19750.f63798;
        String strM37867 = this.f59413;
        if (str != null) {
            strM37867 = C16014.m37867(str, strM37867);
        }
        C18317 c18317M42686 = C18317.m42686();
        String strM23341 = C9045.m23341(new StringBuilder(), this.f59414, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c19750.f63796;
        c18317M42686.getClass();
        C18317.m42685(strM23341, jElapsedRealtime, 0L, 0L, i, strM37867);
        InterfaceC4227 interfaceC4227 = this.f59415;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3454(c19750);
            this.f59415 = null;
        }
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3453() {
        InterfaceC4227 interfaceC4227 = this.f59415;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3453();
            this.f59415 = null;
        }
    }
}
