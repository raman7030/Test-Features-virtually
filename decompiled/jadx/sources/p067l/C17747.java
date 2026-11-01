package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17747 {

    /* JADX INFO: renamed from: ֫ */
    public List f53004 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final char f53005;

    /* JADX INFO: renamed from: ܽ */
    public final C13818 f53006;

    public C17747(C13818 c13818) {
        this.f53006 = c13818;
        this.f53005 = (char) c13818.f39049;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11043 m40331() {
        if (this.f53004.isEmpty()) {
            return null;
        }
        return (C11043) C9179.m21131(1, this.f53004);
    }

    public final String toString() {
        if (this.f53004 == null) {
            return "empty local var";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53006);
        sb.append(" in register ");
        sb.append((int) this.f53005);
        sb.append(" \n");
        for (C11043 c11043 : this.f53004) {
            sb.append(" starts at pc=");
            sb.append(Integer.toString(c11043.f30588));
            sb.append(" length=");
            sb.append(Integer.toString(c11043.f30587));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40330() {
        return (this.f53004.isEmpty() || m40331().f30588 == 65535) ? false : true;
    }
}
