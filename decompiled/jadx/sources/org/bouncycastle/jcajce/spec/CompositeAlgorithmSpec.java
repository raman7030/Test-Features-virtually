package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public class CompositeAlgorithmSpec implements AlgorithmParameterSpec {
    public final List algorithmNames;
    public final List parameterSpecs;

    public class Builder {
        public List algorithmNames = new ArrayList();
        public List parameterSpecs = new ArrayList();

        public Builder add(String str) {
            return add(str, null);
        }

        public Builder add(String str, AlgorithmParameterSpec algorithmParameterSpec) {
            if (this.algorithmNames.contains(str)) {
                throw new IllegalStateException("cannot build with the same algorithm name added");
            }
            this.algorithmNames.add(str);
            this.parameterSpecs.add(algorithmParameterSpec);
            return this;
        }

        public CompositeAlgorithmSpec build() {
            if (this.algorithmNames.isEmpty()) {
                throw new IllegalStateException("cannot call build with no algorithm names added");
            }
            return new CompositeAlgorithmSpec(this);
        }
    }

    public CompositeAlgorithmSpec(Builder builder) {
        this.algorithmNames = C20195.unmodifiableList(new ArrayList(builder.algorithmNames));
        this.parameterSpecs = C20195.unmodifiableList(new ArrayList(builder.parameterSpecs));
    }

    public List getAlgorithmNames() {
        return this.algorithmNames;
    }

    public List getParameterSpecs() {
        return this.parameterSpecs;
    }
}
