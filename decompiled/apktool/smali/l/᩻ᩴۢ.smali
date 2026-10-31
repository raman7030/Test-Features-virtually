.class public final Ll/᩻ᩴۢ;
.super Ljava/lang/Object;
.source "S78W"


# instance fields
.field public final ֫:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩻ᩴۢ;-><init>(Landroid/app/Application;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "remote_auth"

    const/4 v1, 0x0

    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ᩴۢ;->֫:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONArray;I)Ll/ܳᩴۢ;
    .locals 2

    .line 145
    :try_start_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 146
    new-instance p1, Ll/ܳᩴۢ;

    invoke-direct {p1}, Ll/ܳᩴۢ;-><init>()V

    const-string v0, "deviceId"

    .line 147
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    .line 148
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "deviceName"

    .line 152
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܳᩴۢ;->ۧ:Ljava/lang/String;

    const-string v0, "publicKey"

    .line 153
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܳᩴۢ;->ܳ:Ljava/lang/String;

    const-string v0, "firstAccessAt"

    .line 154
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Ll/ܳᩴۢ;->ܽ:J

    const-string v0, "lastAccessAt"

    .line 155
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Ll/ܳᩴۢ;->ᩳ:J

    const-string v0, "lastIp"

    .line 156
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    const-string v0, "userAgent"

    .line 157
    invoke-static {p0, v0}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    const/4 p0, 0x0

    .line 158
    iput-boolean p0, p1, Ll/ܳᩴۢ;->᩻:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ܳᩴۢ;)Ll/ܽᩴۢ;
    .locals 11

    .line 184
    new-instance v10, Ll/ܽᩴۢ;

    iget-object v1, p0, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/ܳᩴۢ;->ۧ:Ljava/lang/String;

    iget-wide v3, p0, Ll/ܳᩴۢ;->ܽ:J

    iget-wide v5, p0, Ll/ܳᩴۢ;->ᩳ:J

    iget-object v7, p0, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    iget-object v8, p0, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    iget-boolean v9, p0, Ll/ܳᩴۢ;->᩻:Z

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Ll/ܽᩴۢ;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Z)V

    return-object v10
.end method

.method private ۧ()V
    .locals 3

    .line 92
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "version"

    const/4 v2, 0x2

    .line 93
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1}, Lbin/mt/json/JSONArray;-><init>()V

    const-string v2, "devices"

    .line 94
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 95
    iget-object v1, p0, Ll/᩻ᩴۢ;->֫:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "trusted_devices_json"

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public static ۧ(Ljava/util/ArrayList;)V
    .locals 1

    .line 136
    new-instance v0, Ll/ᩳᩴۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ۬ᩴ;->reversed(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 6

    const-string v0, "trusted_devices_json"

    const-string v1, ""

    .line 45
    iget-object v2, p0, Ll/᩻ᩴۢ;->֫:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 50
    :cond_0
    :try_start_0
    invoke-static {v0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "version"

    .line 51
    invoke-static {v0, v1}, Ll/ۜ֡ۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, 0x2

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    .line 53
    invoke-direct {p0}, Ll/᩻ᩴۢ;->ۧ()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :cond_1
    const-string v1, "devices"
    :try_end_0
    .catch Ll/᩻֡ۢ; {:try_start_0 .. :try_end_0} :catch_1

    .line 175
    :try_start_1
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v0, :cond_2

    .line 58
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 60
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    .line 61
    :goto_0
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 62
    invoke-static {v0, v2}, Ll/᩻ᩴۢ;->֫(Lbin/mt/json/JSONArray;I)Ll/ܳᩴۢ;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 64
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v1

    :catch_0
    move-exception v0

    .line 177
    invoke-static {v0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object v0

    throw v0
    :try_end_2
    .catch Ll/᩻֡ۢ; {:try_start_2 .. :try_end_2} :catch_1

    .line 69
    :catch_1
    invoke-direct {p0}, Ll/᩻ᩴۢ;->ۧ()V

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 7

    .line 78
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    .line 79
    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1}, Lbin/mt/json/JSONArray;-><init>()V

    .line 80
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳᩴۢ;

    .line 169
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v4, "deviceId"

    iget-object v5, v2, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    .line 170
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "deviceName"

    iget-object v5, v2, Ll/ܳᩴۢ;->ۧ:Ljava/lang/String;

    .line 171
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "publicKey"

    iget-object v5, v2, Ll/ܳᩴۢ;->ܳ:Ljava/lang/String;

    .line 172
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "firstAccessAt"

    iget-wide v5, v2, Ll/ܳᩴۢ;->ܽ:J

    .line 173
    invoke-virtual {v3, v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "lastAccessAt"

    iget-wide v5, v2, Ll/ܳᩴۢ;->ᩳ:J

    .line 174
    invoke-virtual {v3, v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "lastIp"

    iget-object v5, v2, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    .line 175
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "userAgent"

    iget-object v5, v2, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    .line 176
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "temporary"

    iget-boolean v2, v2, Ll/ܳᩴۢ;->᩻:Z

    .line 177
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    const-string p1, "version"

    const/4 v2, 0x2

    .line 83
    invoke-virtual {v0, p1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string p1, "devices"

    .line 84
    invoke-virtual {v0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 85
    iget-object p1, p0, Ll/᩻ᩴۢ;->֫:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "trusted_devices_json"

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    .line 102
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 105
    :cond_0
    invoke-virtual {p0}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 106
    new-instance v1, Ll/ܿᩴۢ;

    invoke-direct {v1, p1}, Ll/ܿᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 108
    invoke-virtual {p0, v0}, Ll/᩻ᩴۢ;->֫(Ljava/util/ArrayList;)V

    :cond_1
    return p1
.end method
