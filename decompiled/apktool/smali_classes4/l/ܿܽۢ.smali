.class public final synthetic Ll/ܿܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ll/ۖ᩵;

.field public final synthetic ۛ:Ljava/lang/String;

.field public final synthetic ۤ:Ljava/lang/String;

.field public final synthetic ۨ:Ll/᩹ۛ᩷;

.field public final synthetic ۫:Ll/ۖ᩵;

.field public final synthetic ۬:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ۨۘܽ;

.field public final synthetic ᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final synthetic ᩹:Ll/᩵ۛۡ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ll/᩵ۛۡ;Ll/ۨۘܽ;Ll/ۖ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۖ᩵;Ljava/lang/String;Ljava/lang/String;Ll/᩹ۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܽۢ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-object p2, p0, Ll/ܿܽۢ;->᩹:Ll/᩵ۛۡ;

    iput-object p3, p0, Ll/ܿܽۢ;->᩶:Ll/ۨۘܽ;

    iput-object p4, p0, Ll/ܿܽۢ;->ۙ:Ll/ۖ᩵;

    iput-object p5, p0, Ll/ܿܽۢ;->ۗ:Ljava/lang/String;

    iput-object p6, p0, Ll/ܿܽۢ;->۬:Ljava/lang/String;

    iput-object p7, p0, Ll/ܿܽۢ;->۫:Ll/ۖ᩵;

    iput-object p8, p0, Ll/ܿܽۢ;->ۤ:Ljava/lang/String;

    iput-object p9, p0, Ll/ܿܽۢ;->ۛ:Ljava/lang/String;

    iput-object p10, p0, Ll/ܿܽۢ;->ۨ:Ll/᩹ۛ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1019
    new-instance v0, Ll/᩺ۖܽ;

    invoke-direct {v0}, Ll/᩺ۖܽ;-><init>()V

    .line 1020
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/ܿܽۢ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    .line 1022
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ֫ۢ;

    if-nez v1, :cond_1

    goto/16 :goto_3

    .line 41
    :cond_1
    iget-object v2, p0, Ll/ܿܽۢ;->᩹:Ll/᩵ۛۡ;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/᩵ۛۡ;->֫(I)Z

    .line 1029
    invoke-interface {v1}, Ll/ܰ֫ۢ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    iget-object v4, p0, Ll/ܿܽۢ;->᩶:Ll/ۨۘܽ;

    invoke-virtual {v4, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v4

    .line 1033
    invoke-virtual {v0}, Ll/᩺ۖܽ;->ܽ()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 1034
    :cond_2
    :goto_1
    invoke-virtual {v4}, Ll/۫ۘܽ;->find()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    .line 1035
    invoke-virtual {v4}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xa

    .line 1036
    invoke-virtual {v4}, Ll/۫ۘܽ;->start()I

    move-result v11

    invoke-virtual {v2, v10, v11}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v10

    add-int/2addr v10, v3

    const-string v11, "const-string"

    .line 1037
    invoke-virtual {v4}, Ll/۫ۘܽ;->start()I

    move-result v12

    invoke-static {v2, v11, v10, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_3

    goto :goto_1

    .line 369
    :cond_3
    iget-object v10, p0, Ll/ܿܽۢ;->ۙ:Ll/ۖ᩵;

    invoke-virtual {v10, v8, v9}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 1040
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_4

    .line 1041
    iget-object v10, p0, Ll/ܿܽۢ;->ۗ:Ljava/lang/String;

    if-eqz v10, :cond_4

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 0
    iget-object v9, p0, Ll/ܿܽۢ;->۬:Ljava/lang/String;

    invoke-static {v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 1042
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    :cond_4
    if-eqz v9, :cond_2

    .line 1045
    invoke-virtual {v4}, Ll/۫ۘܽ;->start()I

    move-result v8

    invoke-virtual {v2, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1046
    invoke-virtual {v0, v9}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1047
    invoke-virtual {v4}, Ll/۫ۘܽ;->end()I

    move-result v6

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    if-eqz v6, :cond_6

    .line 1052
    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1053
    invoke-virtual {v0}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1056
    :cond_6
    invoke-virtual {v0}, Ll/᩺ۖܽ;->ܽ()V

    .line 1058
    new-instance v3, Ll/۫ᩳۢ;

    invoke-direct {v3, v2}, Ll/۫ᩳۢ;-><init>(Ljava/lang/String;)V

    .line 1059
    :cond_7
    :goto_2
    invoke-virtual {v3}, Ll/۫ᩳۢ;->֫()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 1060
    iget-object v4, v3, Ll/۫ᩳۢ;->ܳ:Ljava/lang/String;

    .line 369
    iget-object v6, p0, Ll/ܿܽۢ;->۫:Ll/ۖ᩵;

    invoke-virtual {v6, v4, v9}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1060
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_8

    .line 1061
    iget-object v6, p0, Ll/ܿܽۢ;->ۤ:Ljava/lang/String;

    if-eqz v6, :cond_8

    iget-object v8, v3, Ll/۫ᩳۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v8, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 0
    iget-object v4, p0, Ll/ܿܽۢ;->ۛ:Ljava/lang/String;

    invoke-static {v4}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1062
    iget-object v8, v3, Ll/۫ᩳۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v8, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_8
    if-eqz v4, :cond_7

    .line 1065
    iget v6, v3, Ll/۫ᩳۢ;->ܿ:I

    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1067
    :try_start_0
    invoke-static {v0, v4}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1071
    :catch_0
    iget v5, v3, Ll/۫ᩳۢ;->֫:I

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_9
    if-eqz v5, :cond_a

    .line 1076
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1077
    invoke-virtual {v0}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_a
    if-lez v7, :cond_0

    .line 1080
    invoke-interface {v1, v2}, Ll/ܰ֫ۢ;->֫(Ljava/lang/String;)V

    .line 1081
    iget-object v1, p0, Ll/ܿܽۢ;->ۨ:Ll/᩹ۛ᩷;

    invoke-virtual {v1, v7}, Ll/᩹ۛ᩷;->֫(I)V

    goto/16 :goto_0

    :cond_b
    :goto_3
    return-void
.end method
