package l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩵ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15HS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19444 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"UnknownNullness"})
    public View f62890;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f62889 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f62888 = new ArrayList();

    @Deprecated
    public C19444() {
    }

    public C19444(View view) {
        this.f62890 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19444)) {
            return false;
        }
        C19444 c19444 = (C19444) obj;
        return this.f62890 == c19444.f62890 && this.f62889.equals(c19444.f62889);
    }

    public final int hashCode() {
        return this.f62889.hashCode() + (this.f62890.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM19190 = C7166.m19190("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM19190.append(this.f62890);
        sbM19190.append("\n");
        String strM37867 = C16014.m37867(sbM19190.toString(), "    values:");
        HashMap map = this.f62889;
        for (String str : map.keySet()) {
            strM37867 = strM37867 + ASN1Dump.TAB + str + ": " + map.get(str) + "\n";
        }
        return strM37867;
    }
}
