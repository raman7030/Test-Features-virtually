package com.thegrizzlylabs.sardineandroid.model;

import java.math.BigInteger;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Limit {
    public BigInteger nresults;

    public BigInteger getNresults() {
        return this.nresults;
    }

    public void setNresults(BigInteger bigInteger) {
        this.nresults = bigInteger;
    }
}
