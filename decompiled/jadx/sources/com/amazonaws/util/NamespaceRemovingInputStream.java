package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f2001;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f2002;

    public NamespaceRemovingInputStream(ByteArrayInputStream byteArrayInputStream) {
        super(new BufferedInputStream(byteArrayInputStream));
        this.f2002 = new byte[200];
        this.f2001 = false;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m1447();
        int i = ((FilterInputStream) this).in.read();
        if (i != 120 || this.f2001) {
            return i;
        }
        this.f2002[0] = (byte) i;
        ((FilterInputStream) this).in.mark(this.f2002.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f2002;
        int i2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        String str = new String(this.f2002, 0, i2 + 1, StringUtils.f2004);
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        int length = -1;
        if (stringPrefixSlicer.m1951("xmlns")) {
            stringPrefixSlicer.m1953();
            if (stringPrefixSlicer.m1951("=")) {
                stringPrefixSlicer.m1953();
                if (stringPrefixSlicer.m1951("\"") && stringPrefixSlicer.m1952()) {
                    length = str.length() - stringPrefixSlicer.m1950().length();
                }
            }
        }
        if (length <= 0) {
            return i;
        }
        for (int i3 = 0; i3 < length - 1; i3++) {
            ((FilterInputStream) this).in.read();
        }
        int i4 = ((FilterInputStream) this).in.read();
        this.f2001 = true;
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = read();
            if (i4 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) i4;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final class StringPrefixSlicer {

        /* JADX INFO: renamed from: ֫ */
        public String f2003;

        public StringPrefixSlicer(String str) {
            this.f2003 = str;
        }

        /* JADX INFO: renamed from: ֫ */
        public final String m1950() {
            return this.f2003;
        }

        /* JADX INFO: renamed from: ֫ */
        public final boolean m1951(String str) {
            if (!this.f2003.startsWith(str)) {
                return false;
            }
            this.f2003 = this.f2003.substring(str.length());
            return true;
        }

        /* JADX INFO: renamed from: ܽ */
        public final void m1953() {
            if (this.f2003.startsWith(" ")) {
                while (this.f2003.startsWith(" ")) {
                    this.f2003 = this.f2003.substring(1);
                }
            }
        }

        /* JADX INFO: renamed from: ۧ */
        public final boolean m1952() {
            int iIndexOf = this.f2003.indexOf("\"");
            if (iIndexOf < 0) {
                return false;
            }
            this.f2003 = this.f2003.substring(iIndexOf + 1);
            return true;
        }
    }
}
