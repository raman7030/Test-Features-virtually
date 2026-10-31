package l;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۛ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAVA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5751 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6725 f17696;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Locale f17700;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TimeZone f17701;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23658 f17702;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14485 f17704;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f17699 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f17694 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f17705 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f17695 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f17706 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f17698 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17703 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f17697 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DateFormat m16191() {
        return null;
    }

    public C5751(C6725 c6725, C23658 c23658) {
        TimeZone timeZone = AbstractC5206.f16308;
        this.f17701 = timeZone;
        this.f17700 = AbstractC5206.f16309;
        this.f17696 = c6725;
        this.f17702 = c23658;
        this.f17701 = timeZone;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16190(C14485 c14485, Object obj, Object obj2) {
        if ((this.f17696.f20878 & EnumC20837.DisableCircularReferenceDetect.f67472) == 0) {
            this.f17704 = new C14485(c14485, obj, obj2, 0);
            if (this.f17697 == null) {
                this.f17697 = new IdentityHashMap();
            }
            this.f17697.put(obj, this.f17704);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16192(Object obj) {
        C14485 c14485 = this.f17704;
        Object obj2 = c14485.f44378;
        C6725 c6725 = this.f17696;
        if (obj == obj2) {
            c6725.write("{\"$ref\":\"@\"}");
            return;
        }
        C14485 c14486 = c14485.f44379;
        if (c14486 != null && obj == c14486.f44378) {
            c6725.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            C14485 c14487 = c14485.f44379;
            if (c14487 == null) {
                break;
            } else {
                c14485 = c14487;
            }
        }
        if (obj == c14485.f44378) {
            c6725.write("{\"$ref\":\"$\"}");
            return;
        }
        String string = ((C14485) this.f17697.get(obj)).toString();
        c6725.write("{\"$ref\":\"");
        c6725.write(string);
        c6725.write("\"}");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16193() {
        this.f17703++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16187() {
        this.f17703--;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16194() {
        C6725 c6725 = this.f17696;
        c6725.write(10);
        for (int i = 0; i < this.f17703; i++) {
            c6725.write(9);
        }
    }

    public final String toString() {
        return this.f17696.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16188(Object obj) {
        if (obj == null) {
            this.f17696.m18296();
            return;
        }
        try {
            this.f17702.m52187(obj.getClass()).mo3046(this, obj, null, null);
        } catch (IOException e) {
            throw new C15082(e.getMessage(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16189(String str) {
        C6725 c6725 = this.f17696;
        if (str == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullStringAsEmpty.f67472) != 0) {
                c6725.m18297("");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
            c6725.m18302(str);
        } else {
            c6725.m18298(str, (char) 0, true);
        }
    }
}
