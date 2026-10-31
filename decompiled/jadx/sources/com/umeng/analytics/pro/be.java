package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import l.C20094;

/* JADX INFO: compiled from: G4R6 */
/* JADX INFO: loaded from: classes.dex */
public class be {
    public final ByteArrayOutputStream a;
    public final cg b;
    public bu c;

    public be() {
        this(new bo.a());
    }

    public be(bw bwVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        cg cgVar = new cg(byteArrayOutputStream);
        this.b = cgVar;
        this.c = bwVar.a(cgVar);
    }

    public byte[] a(av avVar) {
        this.a.reset();
        avVar.write(this.c);
        return this.a.toByteArray();
    }

    public String a(av avVar, String str) throws bb {
        try {
            return new String(a(avVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new bb(C20094.m46315("JVM DOES NOT SUPPORT ENCODING: ", str));
        }
    }

    public String b(av avVar) {
        return new String(a(avVar));
    }
}
