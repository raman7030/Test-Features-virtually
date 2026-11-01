package com.tencent.p062mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;

/* JADX INFO: loaded from: classes.dex */
public class WXPreloadMiniProgramEnvironment {

    public final class Req extends BaseReq {
        public static final String TAG = "MicroMsg.SDK.WXPreloadMiniProgramEnvironment.Req";
        public String extData = "";

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 32;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_preload_wxminiprogram_environment_extData", this.extData);
        }
    }

    public final class Resp extends BaseResp {
        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 32;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }
}
