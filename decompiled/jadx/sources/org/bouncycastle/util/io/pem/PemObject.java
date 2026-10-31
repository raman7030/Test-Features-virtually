package org.bouncycastle.util.io.pem;

import java.util.ArrayList;
import java.util.List;
import l.C20195;

/* JADX INFO: loaded from: classes2.dex */
public class PemObject implements PemObjectGenerator {
    public static final List EMPTY_LIST = C20195.unmodifiableList(new ArrayList());
    public byte[] content;
    public List headers;
    public String type;

    public PemObject(String str, List list, byte[] bArr) {
        this.type = str;
        this.headers = C20195.unmodifiableList(list);
        this.content = bArr;
    }

    public PemObject(String str, byte[] bArr) {
        this(str, EMPTY_LIST, bArr);
    }

    @Override // org.bouncycastle.util.io.pem.PemObjectGenerator
    public PemObject generate() {
        return this;
    }

    public byte[] getContent() {
        return this.content;
    }

    public List getHeaders() {
        return this.headers;
    }

    public String getType() {
        return this.type;
    }
}
