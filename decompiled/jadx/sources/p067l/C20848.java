package p067l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩵ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15HS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20848 {

    /* JADX INFO: renamed from: ܽ */
    @SuppressLint({"UnknownNullness"})
    public View f65506;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f65505 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f65504 = new ArrayList();

    @Deprecated
    public C20848() {
    }

    public C20848(View view) {
        this.f65506 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20848)) {
            return false;
        }
        C20848 c20848 = (C20848) obj;
        return this.f65506 == c20848.f65506 && this.f65505.equals(c20848.f65505);
    }

    public final int hashCode() {
        return this.f65505.hashCode() + (this.f65506.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM21133 = C9179.m21133("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM21133.append(this.f65506);
        sbM21133.append("\n");
        String strM40053 = C17588.m40053(sbM21133.toString(), "    values:");
        HashMap map = this.f65505;
        for (String str : map.keySet()) {
            strM40053 = strM40053 + ASN1Dump.TAB + str + ": " + map.get(str) + "\n";
        }
        return strM40053;
    }
}
