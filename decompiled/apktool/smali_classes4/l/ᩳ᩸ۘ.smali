.class public final Ll/ᩳ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ᩻:Ll/ᩳ᩸ۘ;


# instance fields
.field public ֫:Ljava/security/SecureRandom;

.field public ۧ:Ljava/util/List;

.field public ܳ:Ljava/util/concurrent/Executor;

.field public ܽ:Ljava/util/List;

.field public ܿ:Ljava/util/concurrent/Executor;

.field public ᩳ:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩸ۘ;->֫:Ljava/security/SecureRandom;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 121
    iput-object v0, p0, Ll/ᩳ᩸ۘ;->ܽ:Ljava/util/List;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 122
    iput-object v0, p0, Ll/ᩳ᩸ۘ;->ۧ:Ljava/util/List;

    .line 124
    invoke-static {}, Ll/ܽ᩹ۘ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩸ۘ;->ܿ:Ljava/util/concurrent/Executor;

    .line 125
    invoke-static {}, Ll/ܽ᩹ۘ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩸ۘ;->ܳ:Ljava/util/concurrent/Executor;

    .line 128
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "opensdk.report.handlerthread"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 130
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 132
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 133
    new-instance v1, Ll/֫᩸ۘ;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/֫᩸ۘ;-><init>(Ll/ᩳ᩸ۘ;Landroid/os/Looper;)V

    iput-object v1, p0, Ll/ᩳ᩸ۘ;->ᩳ:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;JJJI)V
    .locals 9

    const-string v8, ""

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move/from16 v7, p7

    .line 260
    invoke-static/range {v0 .. v8}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJILjava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;JJJILjava/lang/String;)V
    .locals 2

    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->reportCgi, command: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " | startTime: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " | reqSize:"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " | rspSize: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " | responseCode: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " | detail: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "openSDK_LOG.ReportManager"

    invoke-static {p1, p0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized ۧ()Ll/ᩳ᩸ۘ;
    .locals 2

    const-class v0, Ll/ᩳ᩸ۘ;

    monitor-enter v0

    .line 112
    :try_start_0
    sget-object v1, Ll/ᩳ᩸ۘ;->᩻:Ll/ᩳ᩸ۘ;

    if-nez v1, :cond_0

    .line 113
    new-instance v1, Ll/ᩳ᩸ۘ;

    invoke-direct {v1}, Ll/ᩳ᩸ۘ;-><init>()V

    sput-object v1, Ll/ᩳ᩸ۘ;->᩻:Ll/ᩳ᩸ۘ;

    .line 116
    :cond_0
    sget-object v1, Ll/ᩳ᩸ۘ;->᩻:Ll/ᩳ᩸ۘ;
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


# virtual methods
.method public final ֫()Ljava/util/HashMap;
    .locals 11

    const-string v0, "data"

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v1

    .line 581
    iget-object v2, p0, Ll/ᩳ᩸ۘ;->ܽ:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 582
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 584
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "-->prepareViaData, mViaList size: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "openSDK_LOG.ReportManager"

    invoke-static {v3, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x0

    if-nez v1, :cond_1

    return-object v4

    .line 588
    :cond_1
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 589
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "-->prepareViaData, put bundle to json array exception"

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/Serializable;

    .line 590
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 592
    check-cast v5, Ll/᩺ܶۘ;

    .line 593
    iget-object v8, v5, Ll/᩺ܶۘ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 595
    :try_start_0
    iget-object v10, v5, Ll/᩺ܶۘ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_2

    const-string v10, ""

    .line 599
    :cond_2
    invoke-virtual {v7, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v9

    .line 601
    invoke-static {v3, v6, v9}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 605
    :cond_3
    invoke-virtual {v1, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 607
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "-->prepareViaData, JSONArray array: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 611
    :try_start_1
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 616
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 617
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :catch_1
    move-exception v0

    .line 613
    invoke-static {v3, v6, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v4
.end method

.method public final ֫(Landroid/os/Bundle;Ljava/lang/String;Z)V
    .locals 4

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->reportVia, bundle: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.ReportManager"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "-->availableFrequency, report: report_via | ext: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "report_via"

    .line 428
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 96
    :cond_0
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v0

    const/16 v3, 0x64

    if-nez v0, :cond_1

    goto :goto_0

    .line 99
    :cond_1
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Ll/᩺᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/᩺᩸ۘ;

    move-result-object p2

    const-string v0, "Common_BusinessReportFrequency"

    .line 100
    invoke-virtual {p2, v0}, Ll/᩺᩸ۘ;->֫(Ljava/lang/String;)I

    move-result p2

    if-nez p2, :cond_2

    :goto_0
    const/16 p2, 0x64

    .line 449
    :cond_2
    iget-object v0, p0, Ll/ᩳ᩸ۘ;->֫:Ljava/security/SecureRandom;

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-ge v0, p2, :cond_3

    const/4 v0, 0x1

    const/4 v2, 0x1

    .line 456
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "-->availableFrequency, result: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " | frequency: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    if-nez v2, :cond_4

    if-nez p3, :cond_4

    return-void

    .line 171
    :cond_4
    new-instance p2, Ll/ۧ᩸ۘ;

    invoke-direct {p2, p0, p1, p3}, Ll/ۧ᩸ۘ;-><init>(Ll/ᩳ᩸ۘ;Landroid/os/Bundle;Z)V

    iget-object p1, p0, Ll/ᩳ᩸ۘ;->ܿ:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
