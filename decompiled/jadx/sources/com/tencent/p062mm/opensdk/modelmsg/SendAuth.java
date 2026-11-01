package com.tencent.p062mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.utils.C0623a;
import com.tencent.p062mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes.dex */
public final class SendAuth {

    public class Options {
        public static final int INVALID_FLAGS = -1;
        public String callbackClassName;
        public int callbackFlags = -1;

        public void fromBundle(Bundle bundle) {
            this.callbackClassName = C0623a.m2026b(bundle, "_wxapi_sendauth_options_callback_classname");
            this.callbackFlags = C0623a.m2025a(bundle, "_wxapi_sendauth_options_callback_flags");
        }

        public void toBundle(Bundle bundle) {
            bundle.putString("_wxapi_sendauth_options_callback_classname", this.callbackClassName);
            bundle.putInt("_wxapi_sendauth_options_callback_flags", this.callbackFlags);
        }
    }

    public class Req extends BaseReq {
        public static final int LENGTH_LIMIT = 1024;
        public static final String TAG = "MicroMsg.SDK.SendAuth.Req";
        public String extData;
        public boolean isOption1;
        public boolean nonAutomatic = false;
        public Options options;
        public String scope;
        public String state;

        public Req() {
        }

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            String str2 = this.scope;
            if (str2 == null || str2.length() == 0 || this.scope.length() > 1024) {
                str = "checkArgs fail, scope is invalid";
            } else {
                String str3 = this.state;
                if (str3 == null || str3.length() <= 1024) {
                    return true;
                }
                str = "checkArgs fail, state is invalid";
            }
            Log.m2021e(TAG, str);
            return false;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.scope = bundle.getString("_wxapi_sendauth_req_scope");
            this.state = bundle.getString("_wxapi_sendauth_req_state");
            this.extData = bundle.getString("_wxapi_sendauth_req_ext_data");
            this.isOption1 = bundle.getBoolean("_wxapi_sendauth_req_isoption1");
            this.nonAutomatic = bundle.getBoolean("_wxapi_sendauth_req_non_automatic");
            Options options = new Options();
            this.options = options;
            options.fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 1;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_sendauth_req_scope", this.scope);
            bundle.putString("_wxapi_sendauth_req_state", this.state);
            bundle.putString("_wxapi_sendauth_req_ext_data", this.extData);
            bundle.putBoolean("_wxapi_sendauth_req_isoption1", this.isOption1);
            bundle.putBoolean("_wxapi_sendauth_req_non_automatic", this.nonAutomatic);
            Options options = this.options;
            if (options != null) {
                options.toBundle(bundle);
            }
        }
    }

    public class Resp extends BaseResp {
        public static final int ERR_SCOPE_SNSAPI_WXAAPP_INFO_CAN_ONLY_AUTHORIZED_SEPARATELY = -1000;
        public static final int LENGTH_LIMIT = 1024;
        public static final String TAG = "MicroMsg.SDK.SendAuth.Resp";
        public boolean authResult = false;
        public String code;
        public String country;
        public String lang;
        public String state;
        public String url;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            String str = this.state;
            if (str == null || str.length() <= 1024) {
                return true;
            }
            Log.m2021e(TAG, "checkArgs fail, state is invalid");
            return false;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.code = bundle.getString("_wxapi_sendauth_resp_token");
            this.state = bundle.getString("_wxapi_sendauth_resp_state");
            this.url = bundle.getString("_wxapi_sendauth_resp_url");
            this.lang = bundle.getString("_wxapi_sendauth_resp_lang");
            this.country = bundle.getString("_wxapi_sendauth_resp_country");
            this.authResult = bundle.getBoolean("_wxapi_sendauth_resp_auth_result");
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 1;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_sendauth_resp_token", this.code);
            bundle.putString("_wxapi_sendauth_resp_state", this.state);
            bundle.putString("_wxapi_sendauth_resp_url", this.url);
            bundle.putString("_wxapi_sendauth_resp_lang", this.lang);
            bundle.putString("_wxapi_sendauth_resp_country", this.country);
            bundle.putBoolean("_wxapi_sendauth_resp_auth_result", this.authResult);
        }
    }
}
