package p067l;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10209 implements InterfaceC6856 {

    /* JADX INFO: renamed from: ֫ */
    public String f28298;

    /* JADX INFO: renamed from: ۧ */
    public int f28299;

    /* JADX INFO: renamed from: ܽ */
    public int f28300;

    /* JADX INFO: renamed from: ܿ */
    public String f28301;

    /* JADX INFO: renamed from: ᩳ */
    public int f28302;

    public C10209(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        this.f28298 = str;
        this.f28299 = i;
        this.f28300 = i2;
        this.f28302 = i3;
        this.f28301 = str2;
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            map.putAll(headerFields);
        }
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: a */
    public final String mo15698a() {
        return this.f28298;
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: b */
    public final int mo15699b() {
        return this.f28299;
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: c */
    public final int mo15700c() {
        return this.f28300;
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: d */
    public final int mo15701d() {
        return this.f28302;
    }

    public final String toString() {
        return "c@" + hashCode() + "\ncontent = [" + this.f28298 + "]\nresponseSize = " + this.f28299 + "\nrequestSize = " + this.f28300 + "\nresultCode = " + this.f28302 + "\nerrorMsg = " + this.f28301;
    }
}
