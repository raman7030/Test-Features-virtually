.class public Lcom/umeng/commonsdk/statistics/b;
.super Ljava/lang/Object;
.source "V45U"


# static fields
.field public static a:Ljava/lang/String; = null

.field public static b:Ljava/lang/String; = ""

.field public static final c:Ljava/lang/String; = "EnvelopeManager"

.field public static final d:Ljava/lang/String; = "debug.umeng.umTaskId"

.field public static final e:Ljava/lang/String; = "debug.umeng.umCaseId"

.field public static final f:Ljava/lang/String; = "empty"

.field public static g:Ljava/lang/String; = ""

.field public static h:Ljava/lang/String; = ""

.field public static i:Ljava/lang/String;

.field public static j:Ljava/util/Map;

.field public static l:Z


# instance fields
.field public k:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 82
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "header"

    const-string v2, "#h"

    .line 85
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "sdk_type"

    const-string v2, "#sdt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "access"

    const-string v2, "#ac"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_model"

    const-string v2, "#dm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "umid"

    const-string v2, "#umid"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "os"

    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "language"

    const-string v2, "#lang"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_type"

    const-string v2, "#dt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "resolution"

    const-string v2, "#rl"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_manufacturer"

    const-string v2, "#dmf"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_name"

    const-string v2, "#dn"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "platform_version"

    const-string v2, "#pv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "font_size_setting"

    const-string v2, "#fss"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "os_version"

    const-string v2, "#ov"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_manuid"

    const-string v2, "#did"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "platform_sdk_version"

    const-string v2, "#psv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_brand"

    const-string v2, "#db"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "appkey"

    const-string v2, "#ak"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "id_tracking"

    const-string v2, "#itr"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "id_type"

    const-string v2, "#it"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "uuid"

    const-string v2, "#ud"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_id"

    const-string v2, "#dd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "imprint"

    const-string v2, "#imp"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "sdk_version"

    const-string v2, "#sv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "st"

    const-string v2, "#st"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "analytics"

    const-string v2, "#a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "package_name"

    const-string v2, "#pkg"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "app_signature"

    const-string v2, "#sig"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "app_sig_sha1"

    const-string v2, "#sis1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "app_sig_sha"

    const-string v2, "#sis"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "app_version"

    const-string v2, "#av"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "version_code"

    const-string v2, "#vc"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "idmd5"

    const-string v2, "#imd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "mccmnc"

    const-string v2, "#mnc"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_board"

    const-string v2, "#boa"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "device_manutime"

    const-string v2, "#mant"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "timezone"

    const-string v2, "#tz"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "country"

    const-string v2, "#ct"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "carrier"

    const-string v2, "#car"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "display_name"

    const-string v2, "#disn"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "network_type"

    const-string v2, "#nt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "com_ver"

    const-string v2, "#cv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "mini_ver"

    const-string v2, "#mv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "com_type"

    const-string v2, "#cot"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "module"

    const-string v2, "#mod"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "api_level"

    const-string v2, "#al"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "session_id"

    const-string v2, "#sid"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "local_ip"

    const-string v2, "#ip"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "successful_requests"

    const-string v2, "#sre"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "failed_requests"

    const-string v2, "#fre"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "req_time"

    const-string v2, "#ret"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "channel"

    const-string v2, "#chn"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "wrapper_type"

    const-string v2, "#wt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "wrapper_version"

    const-string v2, "#wv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "targetSdkVer"

    const-string v2, "#tsv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "rps_pr"

    const-string v2, "#rps"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "module_ver"

    const-string v2, "#mov"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "vertical_type"

    const-string v2, "#vt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "secret"

    const-string v2, "#sec"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "pro_ver"

    const-string v2, "#prv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "$pr_ve"

    const-string v2, "#$prv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "$ud_da"

    const-string v2, "#uda"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "devicetoken"

    const-string v2, "#tok"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "i_sdk_v"

    const-string v2, "#iv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "access_subtype"

    const-string v2, "#ast"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "backstate"

    const-string v2, "#bst"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "zdata_ver"

    const-string v2, "#zv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "zdata_req_ts"

    const-string v2, "#zrt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "app_b_v"

    const-string v2, "#bv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "zdata"

    const-string v2, "#zta"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "module_tag"

    const-string v2, "#mt"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "zid_sdk_version"

    const-string v2, "#zsv"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    const-string v1, "others_OS"

    const-string v2, "#oos"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1026
    iput v0, p0, Lcom/umeng/commonsdk/statistics/b;->k:I

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/umeng/commonsdk/statistics/idtracking/Envelope;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    .line 1112
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 1115
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1116
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p4

    .line 1120
    :cond_1
    invoke-static {p5}, Lcom/umeng/commonsdk/stateless/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    .line 1121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1122
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&&"

    .line 1123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1124
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "_"

    .line 1125
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1127
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ".log"

    .line 1129
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1131
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->toBinary()[B

    move-result-object p2

    .line 1133
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    move-result p4

    const/16 p5, 0x7a

    const-string v1, "h"

    if-eqz p4, :cond_3

    .line 1134
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 1135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3, p2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->saveEnvelopeFile(Landroid/content/Context;Ljava/lang/String;[B)I

    move-result p1

    return p1

    :cond_2
    return p5

    .line 1140
    :cond_3
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_4

    return p5

    :cond_4
    const-string p4, "z"

    .line 1143
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_6

    const-string p4, "i"

    .line 1144
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_6

    const-string p4, "a"

    .line 1145
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_6

    const-string p4, "t"

    .line 1146
    invoke-virtual {p3, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_0

    :cond_5
    const-string p3, ".emitter"

    .line 1150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p3, p4, p2}, Lcom/umeng/commonsdk/stateless/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[B)I

    move-result p1

    return p1

    .line 1147
    :cond_6
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3, p2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->saveEnvelopeFile(Landroid/content/Context;Ljava/lang/String;[B)I

    move-result p1

    return p1

    :cond_7
    :goto_1
    const/16 p1, 0x65

    return p1
.end method

.method public static a(Landroid/content/Context;)J
    .locals 4

    .line 187
    sget-wide v0, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_ENTITY_RAW_LENGTH_MAX:J

    sget-wide v2, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_EXTRA_LENGTH:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private a(Landroid/content/Context;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;
    .locals 3

    const-string v0, "codex"

    const/4 v1, 0x0

    .line 1071
    invoke-static {p1, v0, v1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    .line 1074
    :try_start_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1075
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1079
    invoke-static {p1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    if-nez v1, :cond_1

    .line 1083
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genEnvelope(Landroid/content/Context;Ljava/lang/String;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    if-ne v1, v0, :cond_2

    .line 1085
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genEncryptEnvelope(Landroid/content/Context;Ljava/lang/String;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object p1

    goto :goto_1

    .line 1087
    :cond_2
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/b;->l:Z

    if-eqz v0, :cond_3

    .line 1088
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genEncryptEnvelope(Landroid/content/Context;Ljava/lang/String;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object p1

    goto :goto_1

    .line 1090
    :cond_3
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->genEnvelope(Landroid/content/Context;Ljava/lang/String;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 172
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->j:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method private a(ILorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    const-string v0, "exception"

    if-eqz p2, :cond_0

    .line 197
    :try_start_0
    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p2

    .line 201
    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 203
    :try_start_1
    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-object p2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)Lorg/json/JSONObject;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "umid"

    const-string v0, "failed_requests"

    const-string v4, "2G/3G"

    const-string v5, "Android"

    const/4 v6, 0x0

    .line 672
    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 675
    sget-object v8, Lcom/umeng/commonsdk/statistics/b;->i:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v8, :cond_0

    .line 677
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    sget-object v5, Lcom/umeng/commonsdk/statistics/b;->i:Ljava/lang/String;

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    goto/16 :goto_3

    :catch_0
    move-object v4, v6

    goto/16 :goto_3

    .line 680
    :cond_0
    :try_start_2
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->saveSDKComponent()V

    .line 681
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    const-string v11, "app_signature"

    .line 689
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppMD5Signature(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "app_sig_sha1"

    .line 690
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppSHA1Key(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "app_sig_sha"

    .line 691
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppHashKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "app_version"

    .line 692
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "version_code"

    .line 693
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v11, "idmd5"

    .line 694
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getDeviceIdUmengMD5(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "cpu"

    .line 695
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getCPU()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 696
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getMCCMNC(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 697
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    const-string v13, ""

    const-string v14, "mccmnc"

    if-nez v12, :cond_1

    .line 698
    :try_start_3
    invoke-static {v14}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 699
    sput-object v11, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    goto :goto_0

    .line 701
    :cond_1
    invoke-static {v14}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_0
    const-string v11, "header_sub_os_info"

    .line 703
    invoke-static {v11}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 704
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getSubOSName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 705
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_2

    const-string v12, "sub_os_name"

    .line 706
    invoke-static {v12}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 709
    :cond_2
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getSubOSVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 710
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_3

    const-string v12, "sub_os_version"

    .line 711
    invoke-static {v12}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 714
    :cond_3
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getDeviceType(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 715
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "device_type"

    .line 716
    invoke-static {v12}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    const-string v11, "package_name"

    .line 718
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "sdk_type"

    .line 719
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_id"

    .line 720
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_model"

    .line 722
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_board"

    .line 723
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_brand"

    .line 724
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_manutime"

    .line 725
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-wide v14, Landroid/os/Build;->TIME:J

    invoke-virtual {v8, v11, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v11, "device_manufacturer"

    .line 726
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_manuid"

    .line 727
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "device_name"

    .line 728
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "os_version"

    .line 729
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "os"

    .line 731
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 732
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getResolutionArray(Landroid/content/Context;)[I

    move-result-object v11

    if-eqz v11, :cond_5

    const-string v12, "resolution"

    .line 734
    invoke-static {v12}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    aget v15, v11, v9

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, "*"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v11, v11, v10

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    const-string v11, "mc"

    .line 736
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getMac(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "timezone"

    .line 737
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getTimeZone(Landroid/content/Context;)I

    move-result v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 738
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getLocaleInfo(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v11

    const-string v12, "country"

    .line 739
    invoke-static {v12}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    aget-object v14, v11, v10

    invoke-virtual {v8, v12, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "language"

    .line 740
    invoke-static {v12}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    aget-object v11, v11, v9

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "carrier"

    .line 742
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkOperatorName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "display_name"

    .line 743
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 744
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v11

    const-string v12, "Wi-Fi"

    .line 745
    aget-object v14, v11, v10

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    const-string v14, "access"

    if-eqz v12, :cond_6

    .line 746
    :try_start_4
    invoke-static {v14}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v12, "wifi"

    invoke-virtual {v8, v4, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 748
    :cond_6
    aget-object v12, v11, v10

    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 749
    invoke-static {v14}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 752
    :cond_7
    invoke-static {v14}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v12, "unknow"

    invoke-virtual {v8, v4, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 755
    :goto_1
    aget-object v4, v11, v9

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "access_subtype"

    .line 756
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aget-object v11, v11, v9

    invoke-virtual {v8, v4, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 760
    :cond_8
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->isHarmony(Landroid/content/Context;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    const-string v11, "others_OS"

    if-eqz v4, :cond_9

    .line 761
    :try_start_5
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "harmony"

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 763
    :cond_9
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_2
    const-string v4, "network_type"

    .line 771
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkType(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "com_ver"

    .line 773
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "9.5.2"

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "com_type"

    .line 775
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "mini_ver"

    .line 777
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "1"

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 782
    sget-object v4, Lcom/umeng/commonsdk/statistics/b;->a:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_a

    const-string v4, "module"

    .line 783
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/umeng/commonsdk/statistics/b;->a:Ljava/lang/String;

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_a
    const-string v4, "api_level"

    .line 785
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 788
    sget-object v4, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_REC_VERSION_NAME:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "urec_ver"

    .line 789
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_REC_VERSION_NAME:Ljava/lang/String;

    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    .line 794
    :cond_b
    :try_start_6
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getUUIDForZid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 795
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 796
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->setUUIDForZid(Landroid/content/Context;)V

    .line 797
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getUUIDForZid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    :cond_c
    const-string v5, "session_id"

    .line 799
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 804
    :catchall_0
    :try_start_7
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    sput-object v4, Lcom/umeng/commonsdk/statistics/b;->i:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    move-object v4, v8

    :goto_3
    if-nez v4, :cond_d

    return-object v6

    :cond_d
    :try_start_8
    const-string v5, "oaid_required_time"

    .line 812
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getOaidRequiredTime(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    :catch_1
    :try_start_9
    const-string v5, "successful_requests"

    .line 817
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "successful_request"

    invoke-interface {v7, v8, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 818
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v0, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "req_time"

    .line 819
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "last_request_spent_ms"

    invoke-interface {v7, v5, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 821
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getZid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 822
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_e

    const-string v5, "zid"

    .line 823
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 825
    :cond_e
    sget-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ASMS_VERSION:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "zid_sdk_version"

    .line 826
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v5, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ASMS_VERSION:Ljava/lang/String;

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    :catch_2
    :cond_f
    :try_start_a
    const-string v0, "channel"

    .line 833
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "appkey"

    .line 834
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 837
    :try_start_b
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getDeviceToken(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 838
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_10

    const-string v5, "devicetoken"

    .line 839
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto :goto_4

    :catch_3
    move-exception v0

    .line 842
    :try_start_c
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 846
    :cond_10
    :goto_4
    :try_start_d
    invoke-static {v1, v3, v6}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 847
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_11

    .line 848
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_5

    :catch_4
    move-exception v0

    .line 851
    :try_start_e
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :cond_11
    :goto_5
    :try_start_f
    const-string v0, "wrapper_type"

    .line 858
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "wrapper_version"

    .line 859
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/umeng/commonsdk/statistics/a;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 868
    :catch_5
    :try_start_10
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getTargetSdkVersion(Landroid/content/Context;)I

    move-result v0

    const-string v3, "android.permission.READ_PHONE_STATE"

    .line 869
    invoke-static {v1, v3}, Lcom/umeng/commonsdk/utils/UMUtils;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    const-string v5, "targetSdkVer"

    .line 872
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    const-string v0, "rps_pr"

    if-eqz v3, :cond_12

    .line 874
    :try_start_11
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "yes"

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_6

    .line 876
    :cond_12
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "no"

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 895
    :catchall_1
    :goto_6
    :try_start_12
    invoke-static {}, Lcom/umeng/commonsdk/statistics/b;->b()Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "umTaskId"

    .line 896
    sget-object v3, Lcom/umeng/commonsdk/statistics/b;->g:Ljava/lang/String;

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "umCaseId"

    .line 897
    sget-object v3, Lcom/umeng/commonsdk/statistics/b;->h:Ljava/lang/String;

    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :catchall_2
    :cond_13
    :try_start_13
    const-string v0, "t"

    .line 904
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    const-string v0, "a"

    .line 905
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    if-eqz v0, :cond_15

    :cond_14
    if-eqz p2, :cond_15

    .line 908
    :try_start_14
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/b;->b(Landroid/content/Context;)[I

    move-result-object v0

    .line 909
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget v3, v0, v10

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v3, v0, v9

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x2

    aget v0, v0, v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "policy"

    .line 911
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 922
    :catchall_3
    :cond_15
    :try_start_15
    invoke-static {}, Lcom/umeng/commonsdk/statistics/TagHelper;->getModuleTags()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 923
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    if-lez v2, :cond_17

    .line 924
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 925
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 926
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    :cond_16
    const-string v0, "module_tag"

    .line 928
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 938
    :catchall_4
    :cond_17
    :try_start_16
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->getRealTimeDebugKey()Ljava/lang/String;

    move-result-object v0

    .line 939
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_18

    const-string v2, "dk"

    .line 940
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    .line 950
    :catchall_5
    :cond_18
    :try_start_17
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "i_ver"

    .line 951
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "1.2.0"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 952
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ANALYTICS_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_19

    const-string v2, "a_ver"

    .line 953
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ANALYTICS_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 955
    :cond_19
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_GAME_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1a

    const-string v2, "g_ver"

    .line 956
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_GAME_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 958
    :cond_1a
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_PUSH_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1b

    const-string v2, "p_ver"

    .line 959
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_PUSH_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 961
    :cond_1b
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SHARE_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1c

    const-string v2, "s_ver"

    .line 962
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SHARE_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 964
    :cond_1c
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_APM_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1d

    const-string v2, "c_ver"

    .line 965
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_APM_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 967
    :cond_1d
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VERIFY_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1e

    const-string v2, "n_ver"

    .line 968
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VERIFY_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 970
    :cond_1e
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SMS_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1f

    const-string v2, "m_ver"

    .line 971
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SMS_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 973
    :cond_1f
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_REC_VERSION_NAME:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_20

    const-string v2, "u_ver"

    .line 974
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_REC_VERSION_NAME:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 976
    :cond_20
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VISUAL_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_21

    const-string v2, "v_ver"

    .line 977
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VISUAL_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 979
    :cond_21
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ASMS_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_22

    const-string v2, "z_ver"

    .line 980
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ASMS_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 982
    :cond_22
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_LINK_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_23

    const-string v2, "l_ver"

    .line 983
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_LINK_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 985
    :cond_23
    sget-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ABTEST_VERSION:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_24

    const-string v2, "t_ver"

    .line 986
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ABTEST_VERSION:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_24
    const-string v2, "module_ver"

    .line 988
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 994
    :catchall_6
    :try_start_18
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->getApmFlag()Ljava/lang/String;

    move-result-object v0

    .line 995
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_25

    const-string v2, "_$apmflag"

    .line 996
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    .line 1005
    :catchall_7
    :cond_25
    :try_start_19
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a()[B

    move-result-object v0

    if-eqz v0, :cond_26

    .line 1006
    array-length v2, v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    if-lez v2, :cond_26

    :try_start_1a
    const-string v2, "imprint"

    .line 1008
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1a
    .catch Lorg/json/JSONException; {:try_start_1a .. :try_end_1a} :catch_6
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    goto :goto_8

    :catch_6
    move-exception v0

    .line 1010
    :try_start_1b
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 1015
    :cond_26
    :goto_8
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_27

    .line 1016
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "header"

    .line 1017
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    return-object v0

    :catchall_8
    move-exception v0

    .line 1020
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_27
    return-object v6
.end method

.method private a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const-string v0, "header"

    .line 1031
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lorg/json/JSONObject;

    if-eqz v1, :cond_1

    .line 1032
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 1033
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 1034
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1035
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1036
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 1037
    check-cast v2, Ljava/lang/String;

    .line 1038
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1040
    :try_start_0
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "vertical_type"

    .line 1041
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Ljava/lang/Integer;

    if-eqz v3, :cond_0

    .line 1042
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, p0, Lcom/umeng/commonsdk/statistics/b;->k:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public static a()V
    .locals 1

    .line 180
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 181
    sput-object v0, Lcom/umeng/commonsdk/statistics/b;->i:Ljava/lang/String;

    .line 182
    invoke-static {}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a()V

    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 1160
    sput-boolean p0, Lcom/umeng/commonsdk/statistics/b;->l:Z

    return-void
.end method

.method public static b()Z
    .locals 5

    const-string v0, "debug.umeng.umTaskId"

    const-string v1, ""

    .line 212
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/b;->g:Ljava/lang/String;

    const-string v0, "debug.umeng.umCaseId"

    .line 213
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/b;->h:Ljava/lang/String;

    .line 214
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "empty"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 217
    :goto_0
    sget-object v4, Lcom/umeng/commonsdk/statistics/b;->h:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v4, Lcom/umeng/commonsdk/statistics/b;->h:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    return v2

    :cond_2
    return v3
.end method

.method public static b(Landroid/content/Context;)[I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 657
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "um_policy_grant"

    const/4 v2, 0x0

    .line 658
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "preInitInvokedFlag"

    .line 660
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    aput v1, v0, v2

    const-string v1, "policyGrantInvokedFlag"

    .line 661
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v3, 0x1

    aput v1, v0, v3

    const-string v1, "policyGrantResult"

    .line 662
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v1, 0x2

    aput p0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 8

    const-string v0, "serial"

    .line 458
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "header"

    .line 460
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    .line 467
    invoke-direct {p0, v1, p2}, Lcom/umeng/commonsdk/statistics/b;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_2

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    if-eqz p3, :cond_2

    .line 474
    invoke-virtual {p3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p2

    .line 475
    :catch_0
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 476
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 477
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 478
    check-cast v2, Ljava/lang/String;

    .line 479
    invoke-virtual {p3, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    .line 481
    :try_start_1
    invoke-virtual {p3, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_2
    :try_start_2
    const-string v5, "h==1.2.0"

    if-eqz v1, :cond_4

    .line 498
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    array-length p2, p2

    int-to-long p2, p2

    sget-wide v2, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_ENTITY_RAW_LENGTH_MAX:J

    invoke-static {p2, p3, v2, v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->largeThanMaxSize(JJ)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 500
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    if-eqz p2, :cond_3

    const/4 p3, 0x1

    .line 502
    invoke-interface {p2, v0, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p4

    .line 503
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    add-int/2addr p4, p3

    invoke-interface {p2, v0, p4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_3
    const/16 p2, 0x71

    .line 505
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_4
    if-eqz v1, :cond_5

    .line 513
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object p2

    if-nez p2, :cond_6

    const/16 p2, 0x6f

    .line 515
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_5
    const/4 p2, 0x0

    :cond_6
    move-object v4, p2

    if-eqz v4, :cond_7

    .line 522
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->toBinary()[B

    move-result-object p2

    array-length p2, p2

    int-to-long p2, p2

    sget-wide v2, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_LENGTH_MAX:J

    invoke-static {p2, p3, v2, v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->largeThanMaxSize(JJ)Z

    move-result p2

    if-eqz p2, :cond_7

    const/16 p2, 0x72

    .line 524
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_7
    const-string v6, ""

    move-object v2, p0

    move-object v3, p1

    move-object v7, p4

    .line 530
    invoke-direct/range {v2 .. v7}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;Lcom/umeng/commonsdk/statistics/idtracking/Envelope;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_8

    .line 532
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 534
    :cond_8
    sget-boolean p2, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz p2, :cond_9

    .line 535
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    array-length p1, p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    return-object v1

    .line 541
    :goto_2
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 544
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const/16 p2, 0x6e

    invoke-direct {p0, p2, p1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    const-string v0, "serial"

    const-string v1, "&="

    const-string v2, "analytics"

    const-string v11, "header"

    .line 239
    sget-boolean v3, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v3, :cond_0

    if-eqz v9, :cond_0

    if-eqz v10, :cond_0

    .line 241
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    .line 242
    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v3, v3

    :cond_0
    const/16 v12, 0x6e

    if-eqz v8, :cond_1a

    if-nez v10, :cond_1

    goto/16 :goto_9

    .line 255
    :cond_1
    :try_start_0
    invoke-virtual {v10, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    .line 256
    invoke-virtual {v10, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "sessions"

    .line 257
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    move-object/from16 v3, p5

    .line 261
    invoke-static {v8, v3, v2}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    if-eqz v9, :cond_3

    .line 267
    invoke-direct {p0, v2, v9}, Lcom/umeng/commonsdk/statistics/b;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    :cond_3
    move-object v13, v2

    if-eqz v13, :cond_5

    .line 274
    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 275
    :catch_0
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 276
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 277
    instance-of v14, v6, Ljava/lang/String;

    if-eqz v14, :cond_4

    .line 278
    check-cast v6, Ljava/lang/String;

    .line 279
    invoke-virtual {v10, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v14, :cond_4

    .line 281
    :try_start_1
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v13, v14, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_5
    :try_start_2
    const-string v2, "u"

    const-string v6, "1.0.0"

    .line 297
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_6

    move-object v2, v3

    .line 300
    :cond_6
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    move-object/from16 v6, p6

    :cond_7
    if-eqz v13, :cond_9

    .line 306
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "=="

    .line 309
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 314
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v0, 0x65

    .line 315
    invoke-direct {p0, v0, v13}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 319
    :cond_8
    invoke-virtual {v2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 320
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v2, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :cond_9
    const/4 v2, 0x0

    :cond_a
    :goto_2
    move-object v14, v2

    if-eqz v13, :cond_b

    .line 329
    :try_start_3
    invoke-static/range {p1 .. p1}, Lcom/umeng/commonsdk/statistics/idtracking/e;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/e;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 331
    invoke-virtual {v1}, Lcom/umeng/commonsdk/statistics/idtracking/e;->b()V

    .line 332
    invoke-virtual {v1}, Lcom/umeng/commonsdk/statistics/idtracking/e;->c()Lcom/umeng/commonsdk/statistics/proto/c;

    move-result-object v1

    .line 333
    new-instance v2, Lcom/umeng/analytics/pro/be;

    invoke-direct {v2}, Lcom/umeng/analytics/pro/be;-><init>()V

    invoke-virtual {v2, v1}, Lcom/umeng/analytics/pro/be;->a(Lcom/umeng/analytics/pro/av;)[B

    move-result-object v1

    .line 334
    invoke-static {v1, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 335
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 336
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "id_tracking"

    .line 337
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 338
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_1
    nop

    :cond_b
    :goto_3
    if-eqz v13, :cond_d

    .line 349
    :try_start_4
    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    int-to-long v1, v1

    sget-wide v5, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_ENTITY_RAW_LENGTH_MAX:J

    invoke-static {v1, v2, v5, v6}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->largeThanMaxSize(JJ)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 351
    invoke-static/range {p1 .. p1}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 353
    invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 354
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    add-int/2addr v2, v4

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_c
    const/16 v0, 0x71

    .line 356
    invoke-direct {p0, v0, v13}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_d
    if-eqz v13, :cond_e

    .line 364
    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-direct {p0, v8, v0}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object v0

    if-nez v0, :cond_f

    const/16 v0, 0x6f

    .line 366
    invoke-direct {p0, v0, v13}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_e
    const/4 v0, 0x0

    :cond_f
    move-object v3, v0

    if-eqz v3, :cond_10

    .line 373
    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->toBinary()[B

    move-result-object v0

    array-length v0, v0

    int-to-long v0, v0

    sget-wide v4, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_LENGTH_MAX:J

    invoke-static {v0, v1, v4, v5}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->largeThanMaxSize(JJ)Z

    move-result v0

    if-eqz v0, :cond_10

    const/16 v0, 0x72

    .line 375
    invoke-direct {p0, v0, v13}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_10
    if-eqz v13, :cond_11

    .line 380
    invoke-static {v11}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "app_version"

    .line 381
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_11
    const/4 v0, 0x0

    :goto_4
    move-object v5, v0

    move-object v1, p0

    move-object/from16 v2, p1

    move-object v4, v14

    move-object/from16 v6, p4

    .line 385
    invoke-direct/range {v1 .. v6}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;Lcom/umeng/commonsdk/statistics/idtracking/Envelope;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_12

    .line 387
    invoke-direct {p0, v0, v13}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 389
    :cond_12
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz v0, :cond_13

    .line 390
    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    :cond_13
    const-string v0, "z"

    .line 392
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    const-string v0, "i"

    .line 393
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    const-string v0, "t"

    .line 394
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    const-string v0, "a"

    .line 395
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_5

    .line 398
    :cond_14
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->a()Z

    move-result v0

    if-nez v0, :cond_15

    .line 399
    new-instance v0, Lcom/umeng/commonsdk/stateless/b;

    invoke-direct {v0, v8}, Lcom/umeng/commonsdk/stateless/b;-><init>(Landroid/content/Context;)V

    .line 400
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->b()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_15
    :goto_5
    return-object v13

    :catchall_0
    move-exception v0

    .line 407
    invoke-static {v8, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    if-eqz v9, :cond_16

    .line 417
    :try_start_5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 420
    :try_start_6
    invoke-virtual {v1, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_8

    :catch_3
    nop

    goto :goto_6

    :catch_4
    move-exception v0

    const/4 v1, 0x0

    goto :goto_8

    :cond_16
    const/4 v1, 0x0

    :goto_6
    if-nez v1, :cond_17

    .line 427
    :try_start_7
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    move-object v1, v0

    .line 430
    :cond_17
    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 431
    :catch_5
    :cond_18
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    .line 432
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_18

    .line 433
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_18

    .line 434
    check-cast v2, Ljava/lang/String;

    .line 435
    invoke-virtual {v10, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    if-eqz v3, :cond_18

    .line 437
    :try_start_8
    invoke-virtual {v10, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_7

    .line 447
    :goto_8
    invoke-static {v8, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 449
    :cond_19
    invoke-direct {p0, v12, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_1a
    :goto_9
    const/4 v0, 0x0

    .line 247
    invoke-direct {p0, v12, v0}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 8

    const-string v0, "serial"

    .line 553
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "header"

    .line 555
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 561
    :try_start_1
    invoke-static {}, Lcom/umeng/commonsdk/statistics/b;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "umTaskId"

    .line 562
    sget-object v3, Lcom/umeng/commonsdk/statistics/b;->g:Ljava/lang/String;

    invoke-virtual {p2, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "umCaseId"

    .line 563
    sget-object v3, Lcom/umeng/commonsdk/statistics/b;->h:Ljava/lang/String;

    invoke-virtual {p2, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 573
    :try_start_2
    invoke-direct {p0, v1, p2}, Lcom/umeng/commonsdk/statistics/b;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_1

    :catchall_1
    move-exception p2

    goto/16 :goto_3

    :cond_1
    :goto_1
    if-eqz v1, :cond_3

    if-eqz p3, :cond_3

    .line 580
    invoke-virtual {p3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p2

    .line 581
    :catch_0
    :cond_2
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 582
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 583
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 584
    check-cast v2, Ljava/lang/String;

    .line 585
    invoke-virtual {p3, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v3, :cond_2

    .line 587
    :try_start_3
    invoke-virtual {p3, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :cond_3
    :try_start_4
    const-string v5, "z==1.2.0"

    if-eqz v1, :cond_5

    .line 604
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    array-length p2, p2

    int-to-long p2, p2

    sget-wide v2, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_ENTITY_RAW_LENGTH_MAX:J

    invoke-static {p2, p3, v2, v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->largeThanMaxSize(JJ)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 606
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    if-eqz p2, :cond_4

    const/4 p3, 0x1

    .line 608
    invoke-interface {p2, v0, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p4

    .line 609
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    add-int/2addr p4, p3

    invoke-interface {p2, v0, p4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_4
    const/16 p2, 0x71

    .line 611
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_5
    if-eqz v1, :cond_6

    .line 619
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;[B)Lcom/umeng/commonsdk/statistics/idtracking/Envelope;

    move-result-object p2

    if-nez p2, :cond_7

    const/16 p2, 0x6f

    .line 621
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_6
    const/4 p2, 0x0

    :cond_7
    move-object v4, p2

    if-eqz v4, :cond_8

    .line 628
    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/idtracking/Envelope;->toBinary()[B

    move-result-object p2

    array-length p2, p2

    int-to-long p2, p2

    sget-wide v2, Lcom/umeng/commonsdk/statistics/common/DataHelper;->ENVELOPE_LENGTH_MAX:J

    invoke-static {p2, p3, v2, v3}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->largeThanMaxSize(JJ)Z

    move-result p2

    if-eqz p2, :cond_8

    const/16 p2, 0x72

    .line 630
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 633
    :cond_8
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    move-object v2, p0

    move-object v3, p1

    move-object v7, p4

    .line 637
    invoke-direct/range {v2 .. v7}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;Lcom/umeng/commonsdk/statistics/idtracking/Envelope;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_9

    .line 639
    invoke-direct {p0, p2, v1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 641
    :cond_9
    sget-boolean p2, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    if-eqz p2, :cond_a

    .line 642
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    array-length p1, p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_a
    return-object v1

    .line 648
    :goto_3
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 651
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const/16 p2, 0x6e

    invoke-direct {p0, p2, p1}, Lcom/umeng/commonsdk/statistics/b;->a(ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
