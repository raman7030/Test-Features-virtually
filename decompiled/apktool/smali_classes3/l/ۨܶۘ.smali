.class public final Ll/ۨܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ܺ:Ll/ۨܶۘ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:Ljava/util/List;

.field public ۡ:Z

.field public ۢ:Ljava/util/concurrent/Executor;

.field public ۧ:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;

.field public ᩷:Ljava/util/List;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 29
    iput-object v0, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    .line 30
    iput-object v0, p0, Ll/ۨܶۘ;->ۧ:Ljava/lang/String;

    .line 31
    iput-object v0, p0, Ll/ۨܶۘ;->ܽ:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Ll/ۨܶۘ;->ᩳ:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Ll/ۨܶۘ;->ܿ:Ljava/lang/String;

    .line 34
    iput-object v0, p0, Ll/ۨܶۘ;->ܳ:Ljava/lang/String;

    .line 35
    iput-object v0, p0, Ll/ۨܶۘ;->᩻:Ljava/lang/String;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 38
    iput-object v0, p0, Ll/ۨܶۘ;->ۜ:Ljava/util/List;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 40
    iput-object v0, p0, Ll/ۨܶۘ;->᩷:Ljava/util/List;

    .line 55
    invoke-static {}, Ll/ܽ᩹ۘ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܶۘ;->ۢ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic ֫(Ll/ۨܶۘ;)Ljava/util/List;
    .locals 0

    .line 22
    iget-object p0, p0, Ll/ۨܶۘ;->ۜ:Ljava/util/List;

    return-object p0
.end method

.method public static declared-synchronized ֫()Ll/ۨܶۘ;
    .locals 2

    const-class v0, Ll/ۨܶۘ;

    monitor-enter v0

    .line 47
    :try_start_0
    sget-object v1, Ll/ۨܶۘ;->ܺ:Ll/ۨܶۘ;

    if-nez v1, :cond_0

    .line 48
    new-instance v1, Ll/ۨܶۘ;

    invoke-direct {v1}, Ll/ۨܶۘ;-><init>()V

    sput-object v1, Ll/ۨܶۘ;->ܺ:Ll/ۨܶۘ;

    .line 51
    :cond_0
    sget-object v1, Ll/ۨܶۘ;->ܺ:Ll/ۨܶۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 1

    .line 242
    invoke-static {}, Ll/ۨܶۘ;->֫()Ll/ۨܶۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ۧ(Ll/ۨܶۘ;)V
    .locals 9

    .line 188
    iget-object v0, p0, Ll/ۨܶۘ;->ۜ:Ljava/util/List;

    const-string v1, "attaReportAtSubThread"

    const-string v2, "AttaReporter"

    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    iget-boolean v1, p0, Ll/ۨܶۘ;->ۡ:Z

    if-nez v1, :cond_0

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v1

    .line 193
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    iput-boolean v3, p0, Ll/ۨܶۘ;->ۡ:Z

    .line 194
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 196
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/Serializable;

    .line 197
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "attaReportAtSubThread from db = "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 201
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 202
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_3

    .line 203
    invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ܶۘ;

    :cond_1
    add-int/2addr v5, v4

    .line 230
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "doAttaReportItem post "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    invoke-static {}, Ll/᩶ܶۘ;->֫()Ll/᩶ܶۘ;

    move-result-object v6

    const-string v7, "https://h.trace.qq.com/kv"

    iget-object v8, v3, Ll/᩺ܶۘ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v6, v8, v7}, Ll/᩶ܶۘ;->ۧ(Ljava/util/HashMap;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object v6

    .line 232
    invoke-interface {v6}, Ll/ۙܶۘ;->d()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v5, 0xc8

    if-ne v4, v5, :cond_2

    goto :goto_1

    :catch_0
    move-exception v6

    const-string v7, "Exception"

    .line 234
    invoke-static {v2, v7, v6}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v6, 0x2

    if-lt v5, v6, :cond_1

    .line 206
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 210
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "attaReportAtSubThread fail size="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Serializable;

    .line 213
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "attaReportAtSubThread fail cache to db, "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v1, Ll/᩺ܶۘ;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 217
    :cond_4
    iput-boolean v5, p0, Ll/ۨܶۘ;->ۡ:Z

    goto :goto_3

    .line 218
    :cond_5
    iget-boolean v0, p0, Ll/ۨܶۘ;->ۡ:Z

    if-nez v0, :cond_6

    const-string v0, "attaReportAtSubThread clear db"

    .line 219
    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    iput-boolean v4, p0, Ll/ۨܶۘ;->ۡ:Z

    :cond_6
    :goto_3
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)V
    .locals 5

    const-string v0, "init"

    const-string v1, "AttaReporter"

    .line 59
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "101492915"

    .line 61
    iput-object v0, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    .line 63
    invoke-static {p1}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܶۘ;->ۧ:Ljava/lang/String;

    .line 64
    invoke-static {}, Ll/᩺ۤۡ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ᩳ᩹ۘ;->ܽ(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܶۘ;->ᩳ:Ljava/lang/String;

    .line 65
    invoke-static {}, Ll/᩺ۤۡ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܶۘ;->ܿ:Ljava/lang/String;

    .line 66
    invoke-static {p1}, Ll/۟᩸ۘ;->ۧ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1"

    goto :goto_0

    :cond_0
    const-string v0, "0"

    :goto_0
    iput-object v0, p0, Ll/ۨܶۘ;->ܳ:Ljava/lang/String;

    .line 67
    invoke-static {p1}, Ll/ᩳ᩹ۘ;->ۧ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨܶۘ;->᩻:Ljava/lang/String;

    .line 76
    :goto_1
    iget-object p1, p0, Ll/ۨܶۘ;->᩷:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 77
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܶۘ;

    .line 78
    iget-object v0, p1, Ll/᩺ܶۘ;->᩸:Ljava/util/HashMap;

    const-string v2, "appid"

    iget-object v3, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "app_name"

    .line 79
    iget-object v3, p0, Ll/ۨܶۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "app_ver"

    .line 80
    iget-object v3, p0, Ll/ۨܶۘ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "pkg_name"

    .line 81
    iget-object v3, p0, Ll/ۨܶۘ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "qq_install"

    .line 82
    iget-object v3, p0, Ll/ۨܶۘ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "qq_ver"

    .line 83
    iget-object v3, p0, Ll/ۨܶۘ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "openid"

    .line 84
    iget-object v3, p0, Ll/ۨܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "time"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/ۨܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "time_appid_openid"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "fixDirtyData--------------------------"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Ll/ۨܶۘ;->ۜ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 29
    :cond_1
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    const-string v0, "sdk_report.db"

    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "AttaReporter"

    const-string v1, "updateOpenId"

    .line 94
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const-string p1, ""

    .line 95
    :cond_0
    iput-object p1, p0, Ll/ۨܶۘ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    .line 148
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 150
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "attaid"

    const-string v4, "09400051119"

    .line 151
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "token"

    const-string v4, "9389887874"

    .line 152
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll/ۨܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "time_appid_openid"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "time"

    .line 154
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "openid"

    .line 155
    iget-object v1, p0, Ll/ۨܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "appid"

    .line 156
    iget-object v1, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "app_name"

    .line 157
    iget-object v1, p0, Ll/ۨܶۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "app_ver"

    .line 158
    iget-object v1, p0, Ll/ۨܶۘ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "pkg_name"

    .line 159
    iget-object v1, p0, Ll/ۨܶۘ;->ܿ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "os"

    const-string v1, "AND"

    .line 160
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "os_ver"

    .line 161
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sdk_ver"

    const-string v1, "3.5.18.lite"

    .line 162
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩸ۘ;->ܽ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mn"

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "interface_name"

    .line 164
    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "interface_data"

    .line 165
    invoke-virtual {v2, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p3, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string p2, "interface_result"

    invoke-virtual {v2, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "qq_install"

    .line 167
    iget-object p2, p0, Ll/ۨܶۘ;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "qq_ver"

    .line 168
    iget-object p2, p0, Ll/ۨܶۘ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    new-instance p1, Ll/᩺ܶۘ;

    invoke-direct {p1, v2}, Ll/᩺ܶۘ;-><init>(Ljava/util/HashMap;)V

    .line 114
    iget-object p2, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Ll/ۨܶۘ;->ۧ:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    .line 124
    :cond_1
    new-instance p2, Ll/ۛܶۘ;

    invoke-direct {p2, p0, p1}, Ll/ۛܶۘ;-><init>(Ll/ۨܶۘ;Ll/᩺ܶۘ;)V

    iget-object p1, p0, Ll/ۨܶۘ;->ۢ:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 115
    :cond_2
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "attaReport cancel appid="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Ll/ۨܶۘ;->֫:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", mAppName="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ll/ۨܶۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", context="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "AttaReporter"

    invoke-static {p3, p2}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object p2, p0, Ll/ۨܶۘ;->᩷:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
