package p067l;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۛ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAVA */
/* JADX INFO: loaded from: classes2.dex */
public final class C7834 {

    /* JADX INFO: renamed from: ۜ */
    public final C8760 f20541;

    /* JADX INFO: renamed from: ܳ */
    public Locale f20545;

    /* JADX INFO: renamed from: ܺ */
    public TimeZone f20546;

    /* JADX INFO: renamed from: ܽ */
    public final C24853 f20547;

    /* JADX INFO: renamed from: ᩳ */
    public C16135 f20549;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f20544 = null;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f20539 = null;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f20550 = null;

    /* JADX INFO: renamed from: ۖ */
    public ArrayList f20540 = null;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f20551 = null;

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f20543 = null;

    /* JADX INFO: renamed from: ܿ */
    public int f20548 = 0;

    /* JADX INFO: renamed from: ۡ */
    public IdentityHashMap f20542 = null;

    /* JADX INFO: renamed from: ۧ */
    public final DateFormat m18110() {
        return null;
    }

    public C7834(C8760 c8760, C24853 c24853) {
        TimeZone timeZone = AbstractC7316.f19149;
        this.f20546 = timeZone;
        this.f20545 = AbstractC7316.f19150;
        this.f20541 = c8760;
        this.f20547 = c24853;
        this.f20546 = timeZone;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18109(C16135 c16135, Object obj, Object obj2) {
        if ((this.f20541.f23752 & EnumC22172.DisableCircularReferenceDetect.f70155) == 0) {
            this.f20549 = new C16135(c16135, obj, obj2, 0);
            if (this.f20542 == null) {
                this.f20542 = new IdentityHashMap();
            }
            this.f20542.put(obj, this.f20549);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18111(Object obj) {
        C16135 c16135 = this.f20549;
        Object obj2 = c16135.f47479;
        C8760 c8760 = this.f20541;
        if (obj == obj2) {
            c8760.write("{\"$ref\":\"@\"}");
            return;
        }
        C16135 c16136 = c16135.f47480;
        if (c16136 != null && obj == c16136.f47479) {
            c8760.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            C16135 c16137 = c16135.f47480;
            if (c16137 == null) {
                break;
            } else {
                c16135 = c16137;
            }
        }
        if (obj == c16135.f47479) {
            c8760.write("{\"$ref\":\"$\"}");
            return;
        }
        String string = ((C16135) this.f20542.get(obj)).toString();
        c8760.write("{\"$ref\":\"");
        c8760.write(string);
        c8760.write("\"}");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18112() {
        this.f20548++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18106() {
        this.f20548--;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m18113() {
        C8760 c8760 = this.f20541;
        c8760.write(10);
        for (int i = 0; i < this.f20548; i++) {
            c8760.write(9);
        }
    }

    public final String toString() {
        return this.f20541.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18107(Object obj) {
        if (obj == null) {
            this.f20541.m20244();
            return;
        }
        try {
            this.f20547.m54590(obj.getClass()).mo5359(this, obj, null, null);
        } catch (IOException e) {
            throw new C16702(e.getMessage(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18108(String str) {
        C8760 c8760 = this.f20541;
        if (str == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullStringAsEmpty.f70155) != 0) {
                c8760.m20245("");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        if ((c8760.f23752 & EnumC22172.UseSingleQuotes.f70155) != 0) {
            c8760.m20250(str);
        } else {
            c8760.m20246(str, (char) 0, true);
        }
    }
}
