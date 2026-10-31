package com.alipay.sdk.app.debug;

import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AlipayDebugOptions {
    public AlipayPayLifeCycle mAlipayPayLifeCycle;

    /* JADX INFO: compiled from: N673 */
    public interface AlipayPayLifeCycle {
        void onPayEnd(JSONObject jSONObject);
    }

    /* JADX INFO: compiled from: N673 */
    public class Builder {
        public AlipayDebugOptions alipayDebugOptions;

        public Builder() {
            this.alipayDebugOptions = null;
            this.alipayDebugOptions = new AlipayDebugOptions();
        }

        public AlipayDebugOptions build() {
            return this.alipayDebugOptions;
        }

        public Builder setAlipayPayLifeCycle(AlipayPayLifeCycle alipayPayLifeCycle) {
            this.alipayDebugOptions.mAlipayPayLifeCycle = alipayPayLifeCycle;
            return this;
        }
    }

    public AlipayPayLifeCycle getAlipayPayLifeCycle() {
        return this.mAlipayPayLifeCycle;
    }

    public AlipayDebugOptions() {
        this.mAlipayPayLifeCycle = null;
    }
}
