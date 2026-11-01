package com.umeng.analytics.filter;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.umeng.analytics.filter.d */
/* JADX INFO: compiled from: RBLA */
/* JADX INFO: loaded from: classes.dex */
public class C0641d {

    /* JADX INFO: renamed from: b */
    public static final String f2203b = "Ă";

    /* JADX INFO: renamed from: c */
    public MessageDigest f2205c;

    /* JADX INFO: renamed from: e */
    public boolean f2207e;

    /* JADX INFO: renamed from: a */
    public final String f2204a = "MD5";

    /* JADX INFO: renamed from: d */
    public Set f2206d = new HashSet();

    public C0641d(boolean z, String str) {
        this.f2207e = z;
        try {
            this.f2205c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        }
        if (str != null) {
            int i = 0;
            if (z) {
                try {
                    byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                    while (i < bArrDecode.length / 4) {
                        int i2 = i * 4;
                        this.f2206d.add(Integer.valueOf(((bArrDecode[i2] & 255) << 24) + ((bArrDecode[i2 + 1] & 255) << 16) + ((bArrDecode[i2 + 2] & 255) << 8) + (bArrDecode[i2 + 3] & 255)));
                        i++;
                    }
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            }
            String[] strArrSplit = str.split(f2203b);
            int length = strArrSplit.length;
            while (i < length) {
                this.f2206d.add(strArrSplit[i]);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private Integer m2108c(String str) {
        try {
            this.f2205c.update(str.getBytes());
            byte[] bArrDigest = this.f2205c.digest();
            return Integer.valueOf(((bArrDigest[0] & 255) << 24) + ((bArrDigest[1] & 255) << 16) + ((bArrDigest[2] & 255) << 8) + (bArrDigest[3] & 255));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m2110a(String str) {
        if (this.f2207e) {
            return this.f2206d.contains(m2108c(str));
        }
        return this.f2206d.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public void m2111b(String str) {
        if (this.f2207e) {
            this.f2206d.add(m2108c(str));
        } else {
            this.f2206d.add(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2109a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f2206d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (sb.length() > 0) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }

    public String toString() {
        if (this.f2207e) {
            byte[] bArr = new byte[this.f2206d.size() * 4];
            Iterator it = this.f2206d.iterator();
            int i = 0;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                bArr[i] = (byte) (((-16777216) & iIntValue) >> 24);
                bArr[i + 1] = (byte) ((16711680 & iIntValue) >> 16);
                int i2 = i + 3;
                bArr[i + 2] = (byte) ((65280 & iIntValue) >> 8);
                i += 4;
                bArr[i2] = (byte) (iIntValue & 255);
            }
            return new String(Base64.encode(bArr, 0));
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.f2206d) {
            if (sb.length() > 0) {
                sb.append(f2203b);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
