package p067l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6659 {

    /* JADX INFO: renamed from: ֫ */
    public int f17175;

    /* JADX INFO: renamed from: ۜ */
    public Uri f17176;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f17177;

    /* JADX INFO: renamed from: ܳ */
    public long f17178;

    /* JADX INFO: renamed from: ܽ */
    public int f17179;

    /* JADX INFO: renamed from: ܿ */
    public String f17180;

    /* JADX INFO: renamed from: ᩳ */
    public Map f17181;

    /* JADX INFO: renamed from: ᩷ */
    public long f17182;

    /* JADX INFO: renamed from: ᩻ */
    public long f17183;

    public C6659() {
        this.f17179 = 1;
        this.f17181 = Collections.EMPTY_MAP;
        this.f17178 = -1L;
    }

    public C6659(C5318 c5318) {
        this.f17176 = c5318.f12514;
        this.f17182 = c5318.f12520;
        this.f17179 = c5318.f12517;
        this.f17177 = c5318.f12515;
        this.f17181 = c5318.f12519;
        this.f17183 = c5318.f12521;
        this.f17178 = c5318.f12516;
        this.f17180 = c5318.f12518;
        this.f17175 = c5318.f12513;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15170(String str) {
        this.f17176 = Uri.parse(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15164(Uri uri) {
        this.f17176 = uri;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m15171(long j) {
        this.f17182 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15168(int i) {
        this.f17179 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15167(byte[] bArr) {
        this.f17177 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15166(Map map) {
        this.f17181 = map;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15169(long j) {
        this.f17183 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15163(long j) {
        this.f17178 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15165(String str) {
        this.f17180 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15162(int i) {
        this.f17175 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5318 m15161() {
        if (this.f17176 == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C5318(this.f17176, this.f17182, this.f17179, this.f17177, this.f17181, this.f17183, this.f17178, this.f17180, this.f17175, 0);
    }
}
