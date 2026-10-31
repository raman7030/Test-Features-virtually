package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoServicesConstraints;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServicesConstraint implements CryptoServicesConstraints {
    public static final Logger LOG = Logger.getLogger(ServicesConstraint.class.getName());
    public final Set exceptions;

    public ServicesConstraint(Set set) {
        if (set.isEmpty()) {
            this.exceptions = Collections.EMPTY_SET;
            return;
        }
        this.exceptions = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.exceptions.add(Strings.toUpperCase(it.next().toString()));
        }
        Utils.addAliases(this.exceptions);
    }

    public boolean isException(String str) {
        if (this.exceptions.isEmpty()) {
            return false;
        }
        return this.exceptions.contains(Strings.toUpperCase(str));
    }
}
