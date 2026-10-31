package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W88T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9250 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f28026 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28027 = 16384;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo22244(byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo22245(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo22246(byte[] bArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23748(EnumC14312 enumC14312, EnumC14312 enumC14313) throws IOException {
        C19253 c19253 = new C19253(enumC14312, enumC14313);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2319 c2319 = new C2319(byteArrayOutputStream);
        c19253.m40164(this.f28026.getAndIncrement());
        c19253.m40160(EnumSet.of(EnumC20664.FIRST_FRAGMENT, EnumC20664.LAST_FRAGMENT));
        c19253.mo3260(c2319);
        byte[] bArr = new byte[this.f28027];
        mo22246(byteArrayOutputStream.toByteArray());
        C15723 c15723 = new C15723(new ByteArrayInputStream(bArr, 0, mo22244(bArr)));
        C5141 c5141 = new C5141();
        c5141.mo14701(c15723);
        if (!EnumC6552.BIND_ACK.equals(c5141.m40165())) {
            throw new IOException(C20087.m46306("BIND ", enumC14312.getName(), " (", enumC14312.m34179(), ") failed."));
        }
        this.f28027 = c5141.m14702();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11491 m23747(C10080 c10080) throws IOException {
        int iM37111;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2319 c2319 = new C2319(byteArrayOutputStream);
        C0907 c0907 = new C0907();
        c0907.m40161(EnumC6552.REQUEST);
        c0907.m40164(this.f28026.getAndIncrement());
        c0907.m40160(EnumSet.of(EnumC20664.FIRST_FRAGMENT, EnumC20664.LAST_FRAGMENT));
        c0907.m3262(c10080.m21269());
        C11590 c11590 = new C11590();
        c10080.m16372(new C2319(c11590));
        c0907.m3261(c11590.mo16671());
        c0907.mo3260(c2319);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[this.f28027];
        C8973 c8973 = new C8973();
        c8973.m23181(mo22245(byteArray, bArr));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        C21369 c21369 = new C21369();
        c21369.m40161(EnumC6552.RESPONSE);
        while (true) {
            c21369.mo14701(new C15723(new ByteArrayInputStream(bArr, 0, c8973.getValue().intValue())));
            byteArrayOutputStream2.write(c21369.m48431());
            if (c21369.m40166().contains(EnumC20664.LAST_FRAGMENT)) {
                break;
            }
            c8973.m23181(mo22244(bArr));
        }
        C15723 c15723 = new C15723(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
        EnumC6552 enumC6552M40165 = c21369.m40165();
        EnumC6552 enumC6552 = EnumC6552.RESPONSE;
        if (enumC6552M40165 == enumC6552) {
            C11491 c11491 = new C11491();
            c11491.m35553(c15723);
            return c11491;
        }
        if (c21369.m40165() == EnumC6552.FAULT || c21369.m40165() == EnumC6552.REJECT) {
            int i = C3605.f11428;
            try {
                iM37111 = c15723.m37111();
            } catch (EOFException unused) {
                iM37111 = -1;
            }
            throw new C3605(iM37111);
        }
        throw new IOException("Expected PDU " + enumC6552 + " but got: " + c21369.m40165());
    }
}
