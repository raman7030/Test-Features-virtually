package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f841;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f842;

    public NamespaceRemovingInputStream(ByteArrayInputStream byteArrayInputStream) {
        super(new BufferedInputStream(byteArrayInputStream));
        this.f842 = new byte[200];
        this.f841 = false;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m281();
        int i = ((FilterInputStream) this).in.read();
        if (i != 120 || this.f841) {
            return i;
        }
        this.f842[0] = (byte) i;
        ((FilterInputStream) this).in.mark(this.f842.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f842;
        int i2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        String str = new String(this.f842, 0, i2 + 1, StringUtils.f844);
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        int length = -1;
        if (stringPrefixSlicer.m786("xmlns")) {
            stringPrefixSlicer.m788();
            if (stringPrefixSlicer.m786("=")) {
                stringPrefixSlicer.m788();
                if (stringPrefixSlicer.m786("\"") && stringPrefixSlicer.m787()) {
                    length = str.length() - stringPrefixSlicer.m785().length();
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
        this.f841 = true;
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

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public String f843;

        public StringPrefixSlicer(String str) {
            this.f843 = str;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String m785() {
            return this.f843;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean m786(String str) {
            if (!this.f843.startsWith(str)) {
                return false;
            }
            this.f843 = this.f843.substring(str.length());
            return true;
        }

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final void m788() {
            if (this.f843.startsWith(" ")) {
                while (this.f843.startsWith(" ")) {
                    this.f843 = this.f843.substring(1);
                }
            }
        }

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final boolean m787() {
            int iIndexOf = this.f843.indexOf("\"");
            if (iIndexOf < 0) {
                return false;
            }
            this.f843 = this.f843.substring(iIndexOf + 1);
            return true;
        }
    }
}
