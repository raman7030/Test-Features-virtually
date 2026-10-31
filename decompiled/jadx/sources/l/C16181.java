package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16181 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f49838 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char f49839;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12048 f49840;

    public C16181(C12048 c12048) {
        this.f49840 = c12048;
        this.f49839 = (char) c12048.f36038;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9127 m38119() {
        if (this.f49838.isEmpty()) {
            return null;
        }
        return (C9127) C7166.m19188(1, this.f49838);
    }

    public final String toString() {
        if (this.f49838 == null) {
            return "empty local var";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f49840);
        sb.append(" in register ");
        sb.append((int) this.f49839);
        sb.append(" \n");
        for (C9127 c9127 : this.f49838) {
            sb.append(" starts at pc=");
            sb.append(Integer.toString(c9127.f27648));
            sb.append(" length=");
            sb.append(Integer.toString(c9127.f27647));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38118() {
        return (this.f49838.isEmpty() || m38119().f27648 == 65535) ? false : true;
    }
}
