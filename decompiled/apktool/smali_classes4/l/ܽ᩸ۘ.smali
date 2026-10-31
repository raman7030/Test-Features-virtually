.class public final Ll/ܽ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ᩸ۘ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩸ۘ;)V
    .locals 0

    .line 629
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩸ۘ;->᩸:Ll/ᩳ᩸ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v1, p0

    .line 634
    iget-object v2, v1, Ll/ܽ᩸ۘ;->᩸:Ll/ᩳ᩸ۘ;

    const-string v3, "openSDK_LOG.ReportManager"

    const-string v0, "-->doReportVia, params: "

    :try_start_0
    invoke-virtual {v2}, Ll/ᩳ᩸ۘ;->֫()Ljava/util/HashMap;

    move-result-object v4

    if-nez v4, :cond_0

    goto/16 :goto_d

    .line 638
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v5}, Ll/᩺᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/᩺᩸ۘ;

    move-result-object v0

    const-string v5, "Common_HttpRetryCount"

    invoke-virtual {v0, v5}, Ll/᩺᩸ۘ;->֫(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    const/4 v5, 0x2

    goto :goto_0

    :cond_1
    move v5, v0

    .line 645
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_1
    add-int/lit8 v9, v0, 0x1

    .line 653
    :try_start_1
    invoke-static {}, Ll/᩶ܶۘ;->֫()Ll/᩶ܶۘ;

    move-result-object v0

    const-string v10, "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report"

    invoke-virtual {v0, v4, v10}, Ll/᩶ܶۘ;->ۧ(Ljava/util/HashMap;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object v0

    .line 655
    invoke-interface {v0}, Ll/ۙܶۘ;->d()I

    move-result v10

    .line 656
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "-->reportVia: statusCode "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    invoke-interface {v0}, Ll/ۙܶۘ;->a()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    .line 659
    invoke-interface {v0}, Ll/ۙܶۘ;->c()I

    move-result v11

    int-to-long v11, v11

    .line 660
    invoke-interface {v0}, Ll/ۙܶۘ;->b()I

    move-result v13
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v14, v13

    .line 662
    :try_start_2
    invoke-interface {v0}, Ll/ۙܶۘ;->d()I

    move-result v13

    const/16 v1, 0xc8

    if-eq v13, v1, :cond_2

    .line 663
    invoke-interface {v0}, Ll/ۙܶۘ;->d()I

    move-result v0
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v8, v0

    goto :goto_b

    :cond_2
    :try_start_3
    const-string v0, "ret"

    .line 669
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_0
    const/4 v0, -0x4

    :goto_2
    if-eqz v0, :cond_4

    const-wide/16 v16, 0x0

    cmp-long v0, v14, v16

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v0, v9

    goto :goto_a

    :cond_4
    :goto_3
    const/4 v0, 0x1

    goto :goto_c

    :catch_1
    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    goto :goto_4

    :catch_2
    move-exception v0

    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    goto :goto_6

    :catch_3
    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    goto :goto_7

    :catch_4
    const-wide/16 v16, 0x0

    move-wide/from16 v14, v16

    goto :goto_8

    :catch_5
    move-exception v0

    goto :goto_5

    :catch_6
    const-wide/16 v14, 0x0

    :goto_4
    const/4 v0, -0x6

    move v9, v5

    goto :goto_9

    :goto_5
    const-wide/16 v14, 0x0

    .line 691
    :goto_6
    :try_start_4
    invoke-static {v0}, Ll/᩸᩸ۘ;->֫(Ljava/io/IOException;)I

    move-result v0

    goto :goto_9

    :catch_7
    const-wide/16 v14, 0x0

    :goto_7
    const/4 v0, -0x4

    move v0, v9

    move-wide v11, v14

    const/4 v8, -0x4

    goto :goto_a

    :catch_8
    const-wide/16 v14, 0x0

    .line 680
    :goto_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const/4 v0, -0x8

    :goto_9
    move v8, v0

    move v0, v9

    move-wide v11, v14

    :goto_a
    if-lt v0, v5, :cond_5

    :goto_b
    const/4 v0, 0x0

    :goto_c
    move-wide v5, v6

    move v1, v8

    move-wide v7, v11

    move-wide v9, v14

    const-string v4, "mapp_apptrace_sdk"

    const/4 v12, 0x0

    move v11, v1

    .line 700
    invoke-static/range {v4 .. v12}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJILjava/lang/String;)V

    .line 708
    iget-object v2, v2, Ll/ᩳ᩸ۘ;->ܽ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 709
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "-->doReportVia, uploadSuccess: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " resultCode: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_d

    :cond_5
    move-object/from16 v1, p0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    const-string v1, "-->doReportVia, exception in serial executor."

    .line 711
    invoke-static {v3, v1, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_d
    return-void
.end method
