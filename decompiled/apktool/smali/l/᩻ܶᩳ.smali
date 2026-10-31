.class public final Ll/᩻ܶᩳ;
.super Ll/۟ܶۡ;
.source "3B3L"


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ֨:Ljava/lang/String;

.field public final synthetic ۖ:Ljava/lang/CharSequence;

.field public final synthetic ۘ:Z

.field public final synthetic ۚ:Ljava/lang/String;

.field public ۜ:Ll/ܶ᩵ܿ;

.field public final synthetic ۠:Ljava/lang/String;

.field public final synthetic ۡ:Ll/ܽ֨ᩳ;

.field public final synthetic ۢ:Ll/᩹ܶᩳ;

.field public ܳ:Ll/ܳ᩸ᩳ;

.field public final synthetic ܺ:I

.field public final synthetic ᩴ:Z

.field public final synthetic ᩵:Z

.field public ᩷:I

.field public final ᩻:Ll/ۡ᩹ۡ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;ILl/۟᩺ᩳ;Ljava/lang/String;Ll/ܽ֨ᩳ;ZZILjava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 981
    iput-object p1, p0, Ll/᩻ܶᩳ;->ۢ:Ll/᩹ܶᩳ;

    iput p2, p0, Ll/᩻ܶᩳ;->ܺ:I

    iput-object p3, p0, Ll/᩻ܶᩳ;->ۖ:Ljava/lang/CharSequence;

    iput-object p4, p0, Ll/᩻ܶᩳ;->ۚ:Ljava/lang/String;

    iput-object p5, p0, Ll/᩻ܶᩳ;->ۡ:Ll/ܽ֨ᩳ;

    iput-boolean p6, p0, Ll/᩻ܶᩳ;->᩵:Z

    iput-boolean p7, p0, Ll/᩻ܶᩳ;->ᩴ:Z

    iput p8, p0, Ll/᩻ܶᩳ;->֡:I

    iput-object p9, p0, Ll/᩻ܶᩳ;->۠:Ljava/lang/String;

    iput-boolean p10, p0, Ll/᩻ܶᩳ;->ۘ:Z

    iput-object p11, p0, Ll/᩻ܶᩳ;->֨:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 982
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p1

    invoke-static {p1}, Ll/ۡ᩹ۡ;->֫(Ll/᩻ۡ֫;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ܶᩳ;->᩻:Ll/ۡ᩹ۡ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 1015
    iget-object v0, p0, Ll/᩻ܶᩳ;->᩻:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1016
    :cond_0
    iget-boolean v0, p0, Ll/᩻ܶᩳ;->ᩴ:Z

    iget-object v1, p0, Ll/᩻ܶᩳ;->۠:Ljava/lang/String;

    iget-object v2, p0, Ll/᩻ܶᩳ;->֨:Ljava/lang/String;

    iget-object v3, p0, Ll/᩻ܶᩳ;->ۡ:Ll/ܽ֨ᩳ;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    iget v4, p0, Ll/᩻ܶᩳ;->᩷:I

    invoke-static {v3, v2, v1, v0, v4}, Ll/֨ۚ᩷;->֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;I)V

    goto :goto_0

    .line 1017
    :cond_1
    iget-boolean v0, p0, Ll/᩻ܶᩳ;->᩵:Z

    iget-object v4, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-static {v3, v2, v1, v0, v4}, Ll/֨ۚ᩷;->֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLl/ܶ᩵ܿ;)V

    :goto_0
    const/4 v0, 0x0

    .line 1018
    iput-object v0, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1023
    iget-object v0, p0, Ll/᩻ܶᩳ;->᩻:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1024
    :cond_0
    instance-of v0, p1, Ll/֫ܳܳ;

    if-eqz v0, :cond_1

    const p1, 0x7f12054c

    .line 1025
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 1026
    :cond_1
    iget-object v0, p0, Ll/᩻ܶᩳ;->ۢ:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/᩻ܶᩳ;->ۡ:Ll/ܽ֨ᩳ;

    invoke-static {v0, p1, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ljava/lang/Exception;Ll/ܽ֨ᩳ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 9

    .line 989
    new-instance v8, Ll/᩺ܶᩳ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    iget v2, p0, Ll/᩻ܶᩳ;->ܺ:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/᩺ܶᩳ;-><init>(IIZILl/ܶ᩵ܿ;Ll/۫ܽܽ;Ljava/util/Map;)V

    .line 990
    iget-object v0, p0, Ll/᩻ܶᩳ;->ۢ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩴ(Ll/᩹ܶᩳ;)Ll/ۨ᩵ᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/᩻ܶᩳ;->ۚ:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 37
    iget-object v3, p0, Ll/᩻ܶᩳ;->ۖ:Ljava/lang/CharSequence;

    invoke-static {v3, v2, v8, v0, v1}, Ll/ܳ᩸ᩳ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;Ll/᩺ܶᩳ;ILjava/util/ArrayList;)Ll/ܳ᩸ᩳ;

    move-result-object v0

    goto :goto_0

    .line 991
    :cond_0
    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩴ(Ll/᩹ܶᩳ;)Ll/ۨ᩵ᩳ;

    move-result-object v0

    invoke-static {v0, v2, v8}, Ll/ܳ᩸ᩳ;->֫(Ll/ۨ᩵ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;)Ll/ܳ᩸ᩳ;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/᩻ܶᩳ;->ܳ:Ll/ܳ᩸ᩳ;

    .line 992
    iget-object v0, p0, Ll/᩻ܶᩳ;->ۡ:Ll/ܽ֨ᩳ;

    const v1, 0x7f120528

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 997
    sget-object v0, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    .line 998
    iget-boolean v1, p0, Ll/᩻ܶᩳ;->᩵:Z

    if-eqz v1, :cond_0

    const-string v1, ".mhtml"

    goto :goto_0

    :cond_0
    const-string v1, ".html"

    .line 997
    :goto_0
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    .line 999
    iget-object v0, p0, Ll/᩻ܶᩳ;->ۢ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ۡ(Ll/᩹ܶᩳ;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 1000
    :try_start_0
    iget-object v1, p0, Ll/᩻ܶᩳ;->ܳ:Ll/ܳ᩸ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 1001
    :try_start_1
    iget-boolean v2, p0, Ll/᩻ܶᩳ;->ᩴ:Z

    if-eqz v2, :cond_1

    .line 1002
    iget v2, p0, Ll/᩻ܶᩳ;->֡:I

    invoke-virtual {v1, v2}, Ll/ܳ᩸ᩳ;->֫(I)Ll/ܰܿܳ;

    move-result-object v3

    .line 1003
    invoke-virtual {v3}, Ll/ܰܿܳ;->֫()I

    move-result v2

    iput v2, p0, Ll/᩻ܶᩳ;->᩷:I

    .line 1004
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/OutputStreamWriter;

    iget-object v5, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    const/4 v6, 0x0

    .line 446
    invoke-virtual {v5, v6}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v5

    .line 1005
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v5, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1006
    :try_start_2
    iget-object v4, p0, Ll/᩻ܶᩳ;->۠:Ljava/lang/String;

    iget-boolean v5, p0, Ll/᩻ܶᩳ;->ۘ:Z

    iget-object v6, p0, Ll/᩻ܶᩳ;->ۡ:Ll/ܽ֨ᩳ;

    invoke-virtual {v6}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    iget-object v7, p0, Ll/᩻ܶᩳ;->ۡ:Ll/ܽ֨ᩳ;

    const v8, 0x7f12054d

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    move-object v7, v2

    invoke-static/range {v3 .. v8}, Ll/ۧܳܳ;->֫(Ll/ܰܿܳ;Ljava/lang/String;ZLandroid/content/res/AssetManager;Ljava/io/BufferedWriter;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1007
    :try_start_3
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_0
    move-exception v3

    .line 1004
    :try_start_4
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v3

    .line 1008
    :cond_1
    iget-object v2, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v2}, Ll/ܳ᩸ᩳ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_2
    if-eqz v1, :cond_2

    .line 1009
    :try_start_6
    invoke-virtual {v1}, Ll/ܳ᩸ᩳ;->close()V

    .line 1010
    :cond_2
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    return-void

    :catchall_2
    move-exception v2

    if-eqz v1, :cond_3

    .line 1000
    :try_start_7
    invoke-virtual {v1}, Ll/ܳ᩸ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    :try_start_8
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw v2

    :catchall_4
    move-exception v1

    .line 1010
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    throw v1
.end method

.method public final ᩳ()V
    .locals 1

    .line 1031
    iget-object v0, p0, Ll/᩻ܶᩳ;->ܳ:Ll/ܳ᩸ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ᩸ᩳ;->close()V

    .line 1032
    :cond_0
    iget-object v0, p0, Ll/᩻ܶᩳ;->ۜ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_1

    .line 1033
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 1035
    :cond_1
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
