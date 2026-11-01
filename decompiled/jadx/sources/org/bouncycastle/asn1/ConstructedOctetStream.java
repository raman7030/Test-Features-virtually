package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p067l.C3123;
import p067l.InterfaceC16534;

/* JADX INFO: loaded from: classes.dex */
public class ConstructedOctetStream extends InputStream implements InterfaceC16534 {
    public InputStream _currentStream;
    public boolean _first = true;
    public final ASN1StreamParser _parser;

    public ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    private ASN1OctetStringParser getNextParser() throws IOException {
        ASN1Encodable object = this._parser.readObject();
        if (object == null) {
            return null;
        }
        if (object instanceof ASN1OctetStringParser) {
            return (ASN1OctetStringParser) object;
        }
        throw new IOException("unknown object encountered: " + object.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x002b -> B:20:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.io.InputStream
    public int read() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4._currentStream
            r1 = -1
            if (r0 != 0) goto L17
            boolean r0 = r4._first
            if (r0 != 0) goto La
            return r1
        La:
            org.bouncycastle.asn1.ASN1OctetStringParser r0 = r4.getNextParser()
            if (r0 != 0) goto L11
            return r1
        L11:
            r2 = 0
            r4._first = r2
            r2 = -1
            r1 = r4
            goto L2f
        L17:
            r0 = r4
        L18:
            java.io.InputStream r2 = r0._currentStream
            int r2 = r2.read()
            if (r2 < 0) goto L21
            return r2
        L21:
            org.bouncycastle.asn1.ASN1OctetStringParser r2 = r0.getNextParser()
            if (r2 != 0) goto L2b
            r2 = 0
            r0._currentStream = r2
            return r1
        L2b:
            r3 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        L2f:
            java.io.InputStream r0 = r0.getOctetStream()
            r1._currentStream = r0
            r0 = r1
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedOctetStream.read():int");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0037 -> B:24:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0019
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.io.InputStream
    public int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            java.io.InputStream r0 = r7._currentStream
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L18
            boolean r0 = r7._first
            if (r0 != 0) goto Lb
            return r2
        Lb:
            org.bouncycastle.asn1.ASN1OctetStringParser r0 = r7.getNextParser()
            if (r0 != 0) goto L12
            return r2
        L12:
            r7._first = r1
            r2 = 0
            r3 = -1
            r1 = r7
            goto L3c
        L18:
            r0 = r7
        L19:
            java.io.InputStream r3 = r0._currentStream
            int r4 = r9 + r1
            int r5 = r10 - r1
            int r3 = r3.read(r8, r4, r5)
            if (r3 < 0) goto L29
            int r1 = r1 + r3
            if (r1 != r10) goto L19
            return r1
        L29:
            org.bouncycastle.asn1.ASN1OctetStringParser r3 = r0.getNextParser()
            if (r3 != 0) goto L37
            r8 = 0
            r0._currentStream = r8
            r8 = 1
            if (r1 >= r8) goto L36
            return r2
        L36:
            return r1
        L37:
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r2 = r6
        L3c:
            java.io.InputStream r0 = r0.getOctetStream()
            r1._currentStream = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedOctetStream.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }
}
