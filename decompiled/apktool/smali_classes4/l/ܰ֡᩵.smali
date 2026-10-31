.class public final Ll/ܰ֡᩵;
.super Ljava/lang/Object;
.source "CA02"

# interfaces
.implements Ll/ܶۡ᩵;


# static fields
.field public static final ۜ:Ll/֫᩻֨;

.field public static final ᩻:Ll/ۡۖ᩵;


# instance fields
.field public ֫:Ll/ۨ֡᩵;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܳ:Ljava/lang/Object;

.field public final ܽ:Ljava/lang/Object;

.field public ܿ:Ll/ۨ֡᩵;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ll/ۡۖ᩵;

    invoke-direct {v0}, Ll/ۡۖ᩵;-><init>()V

    sput-object v0, Ll/ܰ֡᩵;->᩻:Ll/ۡۖ᩵;

    .line 73
    const-class v0, Ll/ܰ֡᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    .line 79
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ܰ֡᩵;->ᩳ:Ljava/lang/Object;

    .line 81
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܰ֡᩵;->ۧ:Ljava/util/HashMap;

    .line 82
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ܰ֡᩵;->ܽ:Ljava/lang/Object;

    .line 84
    iput-object v0, p0, Ll/ܰ֡᩵;->ܿ:Ll/ۨ֡᩵;

    .line 85
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܰ֡᩵;->ܳ:Ljava/lang/Object;

    return-void
.end method

.method private ֫(Ll/ᩴۡ᩵;)Ll/ۧۤᩴ;
    .locals 12

    .line 96
    sget-object v0, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ۛ֡᩵;->᩶֫()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ۛ֡᩵;->᩶֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 100
    :cond_0
    iget-object v1, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    iget-wide v5, v1, Ll/ۨ֡᩵;->֫:J

    cmp-long v1, v3, v5

    if-lez v1, :cond_1

    .line 101
    iput-object v2, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    .line 103
    :cond_1
    iget-object v1, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    if-eqz v1, :cond_2

    .line 104
    iget-object p1, v1, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    return-object p1

    :cond_2
    const-wide/16 v3, 0xa

    .line 106
    :try_start_0
    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ۛ֡᩵;->᩶֫()Ljava/lang/String;

    move-result-object v9

    .line 112
    invoke-virtual {p0, v9, p1}, Ll/ܰ֡᩵;->֫(Ljava/lang/String;Ll/ᩴۡ᩵;)Ll/ۢ֨᩵;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :try_start_1
    new-instance v11, Ll/ۨ֡᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    check-cast v5, Ll/ܰۡ᩵;

    invoke-virtual {v5}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v5

    mul-long v5, v5, v3

    invoke-direct {v11, v5, v6}, Ll/ۨ֡᩵;-><init>(J)V

    if-eqz v1, :cond_3

    .line 116
    const-class v5, Ll/ۢ֨᩵;

    move-object v6, v1

    check-cast v6, Ll/᩷֨᩵;

    invoke-virtual {v6, v5}, Ll/᩷֨᩵;->֫(Ljava/lang/Class;)Ll/ۢ֨᩵;

    move-object v5, v6

    goto :goto_0

    :cond_3
    move-object v5, v2

    :goto_0
    if-eqz v5, :cond_4

    .line 119
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ۧ()Ll/ᩴۡ᩵;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v5}, Ll/᩷֨᩵;->ۗ()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual/range {v5 .. v10}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ۡۖ᩵;

    move-result-object v5

    goto :goto_1

    :cond_4
    move-object v5, v2

    :goto_1
    if-eqz v5, :cond_8

    .line 122
    invoke-virtual {v5}, Ll/ۡۖ᩵;->ۧ()Ll/ۡۖ᩵;

    move-object v2, v5

    .line 125
    :cond_5
    invoke-interface {v2}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    .line 126
    iget-object v7, v11, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v7, v6, v8}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 128
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Inserting cache entry for domain "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ": "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 130
    :cond_6
    invoke-interface {v2}, Ll/ܺۖ᩵;->᩻()Ll/ۡۖ᩵;

    move-result-object v2

    if-ne v2, v5, :cond_5

    .line 133
    iput-object v11, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    .line 134
    iget-object v2, v11, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_7

    .line 136
    :try_start_2
    check-cast v1, Ll/۟֨᩵;

    .line 122
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V

    :cond_7
    return-object v2

    :cond_8
    if-eqz v1, :cond_b

    .line 136
    check-cast v1, Ll/۟֨᩵;

    .line 122
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_9

    .line 112
    :try_start_3
    check-cast v1, Ll/۟֨᩵;

    .line 122
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    .line 112
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_2
    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v1

    .line 138
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 139
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "getting trusted domains failed: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v5

    invoke-interface {v5}, Ll/ۛ֡᩵;->᩶֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 141
    :cond_a
    new-instance v0, Ll/ۨ֡᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v1

    mul-long v1, v1, v3

    invoke-direct {v0, v1, v2}, Ll/ۨ֡᩵;-><init>(J)V

    .line 142
    iput-object v0, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    .line 143
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    iget-object p1, p0, Ll/ܰ֡᩵;->֫:Ll/ۨ֡᩵;

    iget-object p1, p1, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    return-object p1

    :cond_b
    :goto_3
    return-object v2
.end method

.method private ֫(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;
    .locals 5

    .line 709
    sget-object v0, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 710
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No match for domain based root, checking standalone "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 718
    :cond_0
    iget-object v0, p0, Ll/ܰ֡᩵;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 719
    :try_start_0
    iget-object v1, p0, Ll/ܰ֡᩵;->ܿ:Ll/ۨ֡᩵;

    if-eqz v1, :cond_1

    .line 720
    iget-wide v2, v1, Ll/ۨ֡᩵;->֫:J

    cmp-long v4, p1, v2

    if-lez v4, :cond_2

    .line 721
    :cond_1
    new-instance v1, Ll/ۨ֡᩵;

    const-wide/16 p1, 0x0

    invoke-direct {v1, p1, p2}, Ll/ۨ֡᩵;-><init>(J)V

    .line 723
    :cond_2
    iput-object v1, p0, Ll/ܰ֡᩵;->ܿ:Ll/ۨ֡᩵;

    .line 724
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "\\"

    const-string p2, "\\"

    .line 0
    invoke-static {p1, p3, p2, p4}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\"

    .line 726
    invoke-virtual {p5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 0
    invoke-static {p1, p5}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 730
    :cond_3
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 732
    iget-object p2, v1, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p2}, Ll/ۧۤᩴ;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 733
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    .line 734
    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_9

    .line 735
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 736
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p5

    if-ne p5, p3, :cond_5

    .line 740
    invoke-virtual {p4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    goto :goto_0

    :cond_5
    if-ge p5, p3, :cond_6

    .line 742
    invoke-virtual {p1, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p5

    goto :goto_0

    .line 743
    :cond_6
    sget-object p5, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {p5}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 744
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " vs. "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p5, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_7
    const/4 p5, 0x0

    :goto_0
    if-eqz p5, :cond_4

    .line 748
    sget-object p1, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->֫()Z

    move-result p2

    if-eqz p2, :cond_8

    const-string p2, "Matched "

    .line 749
    invoke-virtual {p2, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 751
    :cond_8
    iget-object p1, v1, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p1, p4}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۖ᩵;

    return-object p1

    .line 754
    :cond_9
    sget-object p2, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {p2}, Ll/֫᩻֨;->ܽ()Z

    move-result p3

    if-eqz p3, :cond_a

    const-string p3, "No match for "

    .line 755
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_a
    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    .line 724
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ܺۖ᩵;
    .locals 16

    move-object/from16 v0, p3

    move-object/from16 v8, p4

    .line 324
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x0

    if-eqz v0, :cond_10

    const-string v1, "IPC$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    if-gtz p5, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p2, :cond_1

    goto/16 :goto_6

    .line 332
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    .line 334
    sget-object v1, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v8, :cond_2

    move-object v2, v8

    goto :goto_0

    :cond_2
    const-string v2, ""

    :goto_0
    const-string v3, "Resolving \\"

    const-string v4, "\\"

    .line 0
    invoke-static {v3, v10, v4, v0, v2}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 335
    invoke-interface {v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 339
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    move-object/from16 v13, p0

    .line 340
    iget-object v2, v13, Ll/ܰ֡᩵;->ᩳ:Ljava/lang/Object;

    move-object v15, v2

    monitor-enter v15

    .line 344
    :try_start_0
    invoke-direct/range {p0 .. p1}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;)Ll/ۧۤᩴ;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 346
    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 347
    invoke-static {v2}, Ll/ܰ֡᩵;->֫(Ll/ۧۤᩴ;)V

    .line 350
    :cond_4
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v14

    .line 354
    invoke-virtual {v2, v10}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    if-eqz v7, :cond_5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object v3, v14

    move-object/from16 v4, p4

    move-wide v5, v11

    .line 356
    invoke-direct/range {v0 .. v7}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)Ll/ܺۖ᩵;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v0, v9

    .line 359
    :goto_1
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v4, v14

    goto :goto_2

    :cond_6
    move-object v4, v0

    move-object v0, v9

    .line 363
    :goto_2
    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_7

    if-eqz v8, :cond_7

    move-object/from16 v0, p0

    move-wide v1, v11

    move-object v3, v10

    move-object/from16 v5, p4

    .line 366
    invoke-direct/range {v0 .. v5}, Ll/ܰ֡᩵;->֫(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;

    move-result-object v0

    :cond_7
    if-eqz v0, :cond_f

    .line 369
    invoke-interface {v0}, Ll/ܺۖ᩵;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_f

    const-string v1, ""

    .line 392
    :cond_8
    invoke-interface {v0}, Ll/ܺۖ᩵;->᩻()Ll/ۡۖ᩵;

    move-result-object v10

    .line 393
    invoke-interface {v0}, Ll/ܺۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\\"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ll/ܺۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_9
    move-object v2, v1

    .line 0
    :goto_3
    invoke-static {v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v8, :cond_a

    .line 394
    invoke-virtual {v10}, Ll/ۡۖ᩵;->ۡ()I

    move-result v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_a
    move-object v3, v1

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 395
    sget-object v11, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v11}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 399
    invoke-virtual {v10}, Ll/ۡۖ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    .line 400
    invoke-virtual {v10}, Ll/ۡۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v3

    .line 401
    invoke-virtual {v10}, Ll/ۡۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Intermediate referral, server "

    const-string v7, " share "

    const-string v12, " refPath "

    .line 0
    invoke-static {v5, v2, v7, v3, v12}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " origPath "

    const-string v5, " nextPath "

    invoke-static {v2, v4, v3, v8, v5}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 396
    invoke-interface {v11, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 405
    :cond_b
    invoke-virtual {v10}, Ll/ۡۖ᩵;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10}, Ll/ۡۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v7, p5, -0x1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ܺۖ᩵;

    move-result-object v2

    if-eqz v2, :cond_e

    .line 410
    invoke-interface {v11}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 411
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Next referral is "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v11, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_c
    if-nez v9, :cond_d

    .line 414
    invoke-virtual {v10, v2}, Ll/ۡۖ᩵;->ۧ(Ll/ܺۖ᩵;)Ll/ۡۖ᩵;

    move-result-object v2

    move-object v9, v2

    goto :goto_5

    .line 416
    :cond_d
    invoke-virtual {v10, v2}, Ll/ۡۖ᩵;->ۧ(Ll/ܺۖ᩵;)Ll/ۡۖ᩵;

    move-result-object v2

    invoke-virtual {v9, v2}, Ll/ۡۖ᩵;->֫(Ll/ܺۖ᩵;)V

    :cond_e
    :goto_5
    if-ne v10, v0, :cond_8

    if-eqz v9, :cond_f

    return-object v9

    :cond_f
    return-object v0

    :catchall_0
    move-exception v0

    .line 363
    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_10
    :goto_6
    move-object/from16 v13, p0

    return-object v9
.end method

.method private ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)Ll/ܺۖ᩵;
    .locals 18

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p7

    .line 469
    sget-object v0, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 470
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Is a domain referral for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 473
    :cond_0
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 474
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Resolving root "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 480
    :cond_1
    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ֡᩵;

    const/4 v13, 0x0

    if-eqz v1, :cond_3

    .line 481
    iget-wide v2, v1, Ll/ۨ֡᩵;->֫:J

    cmp-long v4, p5, v2

    if-lez v4, :cond_3

    .line 482
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 483
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Removing expired "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 485
    :cond_2
    invoke-interface {v12, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v14, v13

    goto :goto_0

    :cond_3
    move-object v14, v1

    :goto_0
    if-nez v14, :cond_d

    const-string v1, "Loadings roots"

    .line 490
    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    const-string v1, "Failed to get domain controller for "

    move-object/from16 v15, p0

    .line 558
    invoke-virtual {v15, v9, v8}, Ll/ܰ֡᩵;->֫(Ljava/lang/String;Ll/ᩴۡ᩵;)Ll/ۢ֨᩵;

    move-result-object v17

    if-nez v17, :cond_5

    .line 560
    :try_start_0
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 561
    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_4
    if-eqz v17, :cond_7

    .line 581
    check-cast v17, Ll/۟֨᩵;

    .line 122
    invoke-virtual/range {v17 .. v17}, Ll/۟֨᩵;->ۘ()V

    goto/16 :goto_2

    .line 567
    :cond_5
    :try_start_1
    const-class v0, Ll/ۢ֨᩵;

    move-object/from16 v2, v17

    check-cast v2, Ll/᩷֨᩵;

    invoke-virtual {v2, v0}, Ll/᩷֨᩵;->֫(Ljava/lang/Class;)Ll/ۢ֨᩵;

    move-object/from16 v16, v2

    .line 571
    monitor-enter v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 574
    :try_start_2
    invoke-virtual {v2}, Ll/᩷֨᩵;->ᩴ()Z

    .line 575
    invoke-virtual {v2}, Ll/᩷֨᩵;->ۗ()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v5, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    .line 577
    :try_start_3
    sget-object v1, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    const-string v3, "Failed to connect to domain controller"

    invoke-interface {v1, v3, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v5, v9

    :goto_1
    const/4 v7, 0x0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p2

    move-object/from16 v6, p3

    .line 579
    invoke-static/range {v1 .. v7}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ll/ۢ֨᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;

    move-result-object v0

    .line 580
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 581
    check-cast v17, Ll/۟֨᩵;

    .line 122
    invoke-virtual/range {v17 .. v17}, Ll/۟֨᩵;->ۘ()V

    .line 583
    sget-object v1, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 584
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Have DC referral "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_6
    if-eqz v0, :cond_8

    .line 587
    move-object v2, v0

    check-cast v2, Ll/ۡۖ᩵;

    invoke-virtual {v2}, Ll/ۡۖ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Ll/ۡۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 590
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dropping self-referential referral "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    :cond_7
    :goto_2
    move-object v0, v13

    :cond_8
    const-string v1, "\\"

    if-eqz v0, :cond_b

    .line 519
    new-instance v2, Ll/ۨ֡᩵;

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ll/ۨ֡᩵;-><init>(J)V

    .line 520
    iget-object v3, v2, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v3, v1, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 530
    :cond_9
    iget-object v3, v2, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    check-cast v1, Ll/ۡۖ᩵;

    invoke-virtual {v1, v3}, Ll/ۡۖ᩵;->֫(Ljava/util/Map;)V

    .line 531
    invoke-interface {v1}, Ll/ܺۖ᩵;->ۜ()V

    .line 532
    invoke-interface {v1}, Ll/ܺۖ᩵;->᩻()Ll/ۡۖ᩵;

    move-result-object v1

    if-ne v1, v0, :cond_9

    .line 536
    sget-object v1, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 537
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Have referral "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 540
    :cond_a
    invoke-interface {v12, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v14, v2

    goto :goto_5

    .line 542
    :cond_b
    new-instance v1, Ll/᩺֡᩵;

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v2

    .line 68
    invoke-direct {v1, v2, v3}, Ll/ۨ֡᩵;-><init>(J)V

    .line 542
    invoke-interface {v12, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 580
    :goto_3
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    if-eqz v17, :cond_c

    .line 558
    :try_start_6
    check-cast v17, Ll/۟֨᩵;

    .line 122
    invoke-virtual/range {v17 .. v17}, Ll/۟֨᩵;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    .line 558
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_c
    :goto_4
    throw v1

    :cond_d
    move-object/from16 v15, p0

    .line 494
    instance-of v0, v14, Ll/᩺֡᩵;

    if-eqz v0, :cond_e

    move-object v0, v13

    move-object v14, v0

    goto :goto_5

    .line 497
    :cond_e
    iget-object v0, v14, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    const-string v1, "\\"

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۖ᩵;

    :goto_5
    if-eqz v14, :cond_23

    const-string v12, "\\"

    .line 613
    sget-object v7, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    const/16 v1, 0x5c

    const/4 v6, 0x0

    if-eqz v11, :cond_11

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_f

    goto :goto_6

    .line 0
    :cond_f
    invoke-static {v3, v11}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v2

    if-ne v2, v1, :cond_10

    invoke-static {v3, v6, v11}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_10
    move-object v2, v11

    goto :goto_7

    :cond_11
    :goto_6
    move-object v2, v12

    .line 626
    :goto_7
    invoke-interface {v7}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_12

    .line 627
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Initial link is "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_12
    if-eqz v0, :cond_14

    .line 630
    invoke-interface {v0}, Ll/ܺۖ᩵;->ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto :goto_8

    :cond_13
    move-object v3, v0

    goto :goto_9

    .line 632
    :cond_14
    :goto_8
    iget-object v3, v14, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v3, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۖ᩵;

    if-eqz v3, :cond_15

    .line 635
    invoke-interface {v7}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 636
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Found at "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_9

    .line 642
    :cond_15
    invoke-virtual {v2, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    if-lez v4, :cond_16

    .line 644
    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    .line 646
    :cond_16
    invoke-interface {v7}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_17

    const-string v1, "Not found "

    .line 647
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_17
    :goto_9
    move-object v5, v2

    if-eqz v3, :cond_19

    .line 654
    invoke-interface {v3}, Ll/ܺۖ᩵;->ᩳ()J

    move-result-wide v1

    cmp-long v4, p5, v1

    if-lez v4, :cond_19

    .line 655
    invoke-interface {v7}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 656
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expiring links "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 658
    :cond_18
    iget-object v1, v14, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v5}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v13

    :cond_19
    if-nez v3, :cond_20

    .line 663
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    invoke-static {v8, v0}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ll/ܺۖ᩵;)Ll/᩷֨᩵;

    move-result-object v16

    if-nez v16, :cond_1a

    if-eqz v16, :cond_22

    goto/16 :goto_c

    .line 671
    :cond_1a
    :try_start_7
    invoke-virtual/range {v16 .. v16}, Ll/᩷֨᩵;->ۗ()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    move-object/from16 v3, p2

    move-object/from16 v4, p2

    move-object v13, v5

    move-object v5, v0

    const/4 v0, 0x0

    move-object/from16 v6, p3

    move-object v0, v7

    move-object/from16 v7, p4

    invoke-static/range {v1 .. v7}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ll/ۢ֨᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;

    move-result-object v1

    if-eqz v1, :cond_1f

    .line 674
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    move-object v3, v1

    check-cast v3, Ll/ۡۖ᩵;

    invoke-virtual {v3, v2}, Ll/ۡۖ᩵;->֫(I)V

    .line 680
    invoke-virtual {v3}, Ll/ۡۖ᩵;->ۡ()I

    move-result v2

    if-eqz v11, :cond_1b

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_a

    :cond_1b
    const/4 v4, 0x0

    :goto_a
    if-le v2, v4, :cond_1c

    const-string v2, "Consumed more than we provided"

    .line 681
    invoke-interface {v0, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    :cond_1c
    if-eqz v11, :cond_1d

    .line 684
    invoke-virtual {v3}, Ll/ۡۖ᩵;->ۡ()I

    move-result v2

    if-lez v2, :cond_1d

    invoke-virtual {v3}, Ll/ۡۖ᩵;->ۡ()I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v11, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 685
    :cond_1d
    invoke-virtual {v3, v12}, Ll/ۡۖ᩵;->ۧ(Ljava/lang/String;)V

    .line 686
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 687
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Have referral "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 689
    :cond_1e
    iget-object v0, v14, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, v12, v1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    .line 691
    :cond_1f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No referral found for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_b
    move-object v13, v1

    .line 122
    :goto_c
    invoke-virtual/range {v16 .. v16}, Ll/۟֨᩵;->ۘ()V

    goto :goto_e

    :catchall_3
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-virtual/range {v16 .. v16}, Ll/۟֨᩵;->ۘ()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_d

    :catchall_4
    move-exception v0

    move-object v2, v0

    .line 667
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1

    :cond_20
    move-object v0, v7

    .line 694
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_21

    .line 695
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Have cached referral for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ll/ܺۖ᩵;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_21
    move-object v13, v3

    :cond_22
    :goto_e
    return-object v13

    :cond_23
    return-object v0
.end method

.method public static ֫(Ll/ᩴۡ᩵;Ll/ۢ֨᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;
    .locals 9

    const-string v0, "Referral for "

    .line 279
    sget-object v1, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    const-string v2, "Fetching referral for "

    invoke-interface {p0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\\"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p6, :cond_0

    .line 0
    invoke-static {p2, p6}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 287
    :cond_0
    :try_start_0
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result p5

    if-eqz p5, :cond_1

    .line 288
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-interface {v1, p5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 290
    :cond_1
    :goto_0
    move-object v3, p1

    check-cast v3, Ll/᩷֨᩵;

    const/4 v8, 0x0

    move-object v4, p0

    move-object v5, p2

    move-object v6, p4

    move-object v7, p3

    invoke-virtual/range {v3 .. v8}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ۡۖ᩵;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 293
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 294
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v1, p3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 297
    :cond_2
    invoke-virtual {p1}, Ll/ۡۖ᩵;->ۧ()Ll/ۡۖ᩵;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 300
    :goto_1
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result p3

    if-eqz p3, :cond_3

    .line 301
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Getting referral for "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " failed"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, p2, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 303
    :cond_3
    invoke-interface {p0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ᩴۡ᩵;Ll/ܺۖ᩵;)Ll/᩷֨᩵;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    move-object v1, p1

    .line 243
    :goto_0
    :try_start_0
    invoke-interface {v1}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    sget-object v3, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    if-eqz v2, :cond_2

    :try_start_1
    invoke-interface {v1}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v2, :cond_2

    .line 245
    :try_start_2
    invoke-interface {p0}, Ll/ᩴۡ᩵;->ܳ()Ll/ۨۡ᩵;

    move-result-object v2

    .line 247
    invoke-interface {v1}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v6

    .line 250
    invoke-interface {p0}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v4

    invoke-interface {v4}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {p0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    :cond_0
    move-object v4, v2

    check-cast v4, Ll/ܺ֨᩵;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    invoke-virtual/range {v4 .. v9}, Ll/ܺ֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;IZZ)Ll/ۢ֨᩵;

    move-result-object v2

    const-class v4, Ll/᩷֨᩵;

    .line 251
    check-cast v2, Ll/᩷֨᩵;

    invoke-virtual {v2, v4}, Ll/᩷֨᩵;->֫(Ljava/lang/Class;)Ll/ۢ֨᩵;

    .line 252
    invoke-virtual {v2}, Ll/᩷֨᩵;->ᩴ()Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    .line 255
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Connection failed "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 257
    invoke-interface {v1}, Ll/ܺۖ᩵;->next()Ll/ۡۖ᩵;

    move-result-object v1

    if-eq v1, p1, :cond_1

    goto :goto_0

    .line 266
    :cond_1
    throw v2

    :cond_2
    const-string p1, "No server name in referral"

    .line 262
    invoke-interface {v3, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    .line 269
    :catch_1
    invoke-interface {p0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    :goto_1
    return-object v0
.end method

.method public static ֫(Ll/ۧۤᩴ;)V
    .locals 8

    .line 436
    invoke-virtual {p0}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 437
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Domain "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v2, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 438
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 439
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "  Root "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 440
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ֡᩵;

    iget-object v3, v3, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    if-eqz v3, :cond_1

    .line 441
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ֡᩵;

    iget-object v1, v1, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 442
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۖ᩵;

    move-object v5, v4

    .line 445
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "    "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " => "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 446
    invoke-interface {v5}, Ll/ܺۖ᩵;->᩻()Ll/ۡۖ᩵;

    move-result-object v5

    if-ne v5, v4, :cond_2

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ᩴۡ᩵;)Ll/ۢ֨᩵;
    .locals 16

    move-object/from16 v1, p0

    .line 227
    invoke-interface/range {p2 .. p2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Got DC referral "

    const-string v2, "\\"

    .line 170
    invoke-interface/range {p2 .. p2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v10, p1

    invoke-virtual {v10, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 173
    iget-object v4, v1, Ll/ܰ֡᩵;->ܽ:Ljava/lang/Object;

    move-object v14, v4

    monitor-enter v14

    .line 174
    :try_start_0
    iget-object v4, v1, Ll/ܰ֡᩵;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨ֡᩵;

    const/4 v11, 0x0

    if-eqz v4, :cond_0

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, v4, Ll/ۨ֡᩵;->֫:J

    cmp-long v9, v5, v7

    if-lez v9, :cond_0

    move-object v4, v11

    :cond_0
    if-eqz v4, :cond_2

    .line 179
    iget-object v0, v4, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    const-string v2, "dc"

    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۖ᩵;

    .line 180
    sget-object v2, Ll/ܰ֡᩵;->᩻:Ll/ۡۖ᩵;

    if-ne v0, v2, :cond_1

    .line 181
    monitor-exit v14

    :goto_0
    move-object/from16 v2, p2

    goto/16 :goto_7

    .line 183
    :cond_1
    monitor-exit v14

    move-object/from16 v2, p2

    goto/16 :goto_8

    .line 185
    :cond_2
    new-instance v12, Ll/ۨ֡᩵;

    invoke-interface/range {p2 .. p2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v4

    invoke-direct {v12, v4, v5}, Ll/ۨ֡᩵;-><init>(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 187
    :try_start_1
    invoke-interface/range {p2 .. p2}, Ll/ᩴۡ᩵;->ܳ()Ll/ۨۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܺ֨᩵;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v5, p2

    move-object/from16 v6, p1

    invoke-virtual/range {v4 .. v9}, Ll/ܺ֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;IZZ)Ll/ۢ֨᩵;

    move-result-object v4

    const-class v5, Ll/ۢ֨᩵;

    .line 188
    move-object v13, v4

    check-cast v13, Ll/᩷֨᩵;

    invoke-virtual {v13, v5}, Ll/᩷֨᩵;->֫(Ljava/lang/Class;)Ll/ۢ֨᩵;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    move-object v15, v13

    .line 189
    :try_start_2
    monitor-enter v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 190
    :try_start_3
    invoke-interface/range {p2 .. p2}, Ll/ᩴۡ᩵;->ۧ()Ll/ᩴۡ᩵;

    move-result-object v5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x1

    move-object v4, v13

    move-object/from16 v7, p1

    move-object v8, v3

    invoke-virtual/range {v4 .. v9}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ۡۖ᩵;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 193
    sget-object v4, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->֫()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 194
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 196
    :cond_3
    invoke-virtual {v2}, Ll/ۡۖ᩵;->ۧ()Ll/ۡۖ᩵;

    .line 197
    iget-object v0, v12, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    const-string v4, "dc"

    invoke-virtual {v0, v4, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    iget-object v0, v1, Ll/ܰ֡᩵;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, v3, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    monitor-exit v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    :try_start_4
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 202
    :try_start_5
    monitor-exit v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object v11, v2

    goto :goto_0

    .line 201
    :cond_4
    :try_start_6
    monitor-exit v15
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 122
    :try_start_7
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object/from16 v2, p2

    move-object v4, v1

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object/from16 v2, p2

    move-object v4, v1

    .line 201
    :goto_1
    :try_start_8
    monitor-exit v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception v0

    move-object v5, v0

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object/from16 v2, p2

    move-object v5, v0

    move-object v4, v1

    .line 122
    :goto_2
    :try_start_a
    invoke-virtual {v13}, Ll/۟֨᩵;->ۘ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v0

    move-object v6, v0

    .line 187
    :try_start_b
    invoke-virtual {v5, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v5
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catch_1
    move-exception v0

    goto :goto_5

    :goto_4
    move-object/from16 v2, p2

    move-object v4, v1

    .line 204
    :goto_5
    :try_start_c
    sget-object v5, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v5}, Ll/֫᩻֨;->֫()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 205
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Getting domain controller for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " failed"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 207
    :cond_5
    iget-object v0, v12, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    const-string v5, "dc"

    sget-object v6, Ll/ܰ֡᩵;->᩻:Ll/ۡۖ᩵;

    invoke-virtual {v0, v5, v6}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    invoke-interface {v2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    :goto_6
    iget-object v0, v12, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    const-string v5, "dc"

    sget-object v6, Ll/ܰ֡᩵;->᩻:Ll/ۡۖ᩵;

    invoke-virtual {v0, v5, v6}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    iget-object v0, v4, Ll/ܰ֡᩵;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, v3, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    monitor-exit v14
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :goto_7
    move-object v0, v11

    .line 229
    :goto_8
    invoke-static {v2, v0}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ll/ܺۖ᩵;)Ll/᩷֨᩵;

    move-result-object v0

    if-nez v0, :cond_6

    .line 230
    sget-object v2, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "Failed to connect to domain controller for "

    .line 231
    invoke-virtual {v3, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_6
    return-object v0

    :catchall_5
    move-exception v0

    .line 215
    :try_start_d
    monitor-exit v14
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    throw v0
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;
    .locals 6

    const/4 v5, 0x5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 318
    invoke-direct/range {v0 .. v5}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ܺۖ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ll/ۡۖ᩵;)V
    .locals 12

    const-string v1, "Invalid UNC path "

    const-string v2, "Key is "

    const-string v3, "\\"

    const-string v4, "Adding key "

    const-string v5, "Inserting referral for "

    move-object v0, p0

    .line 11
    monitor-enter v0

    .line 763
    :try_start_0
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    sget-object v6, Ll/ܰ֡᩵;->ۜ:Ll/֫᩻֨;

    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 768
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_0
    const/16 v5, 0x5c

    const/4 v7, 0x1

    .line 771
    invoke-virtual {p2, v5, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    add-int/lit8 v9, v8, 0x1

    .line 772
    invoke-virtual {p2, v5, v9}, Ljava/lang/String;->indexOf(II)I

    move-result v10

    if-ltz v8, :cond_7

    if-gez v10, :cond_1

    goto/16 :goto_0

    .line 779
    :cond_1
    invoke-virtual {p2, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 780
    invoke-virtual {p2, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 781
    invoke-virtual {p3}, Ll/ۡۖ᩵;->ۡ()I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {p2, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    .line 785
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 790
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " to "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 798
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v1, v4

    invoke-interface {p3, v1}, Ll/ܺۖ᩵;->֫(I)V

    .line 800
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v7

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v1, v5, :cond_3

    .line 801
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 804
    :cond_3
    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 805
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 808
    :cond_4
    iget-object v2, p0, Ll/ܰ֡᩵;->ܿ:Ll/ۨ֡᩵;

    .line 809
    iget-object v1, p0, Ll/ܰ֡᩵;->ܳ:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_5

    .line 810
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x2710

    add-long/2addr v3, v5

    iget-wide v5, v2, Ll/ۨ֡᩵;->֫:J

    cmp-long v7, v3, v5

    if-lez v7, :cond_6

    .line 811
    :cond_5
    new-instance v2, Ll/ۨ֡᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ll/ۨ֡᩵;-><init>(J)V

    .line 813
    :cond_6
    iput-object v2, p0, Ll/ܰ֡᩵;->ܿ:Ll/ۨ֡᩵;

    .line 814
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 815
    :try_start_2
    iget-object p1, v2, Ll/ۨ֡᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p1, p2, p3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 816
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 814
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    .line 775
    :cond_7
    :goto_0
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v6, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 776
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    .line 764
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;Ll/ᩴۡ᩵;)Z
    .locals 3

    .line 159
    iget-object v0, p0, Ll/ܰ֡᩵;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 160
    :try_start_0
    invoke-direct {p0, p2}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;)Ll/ۧۤᩴ;

    move-result-object p2

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 162
    monitor-exit v0

    return v1

    .line 163
    :cond_0
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 164
    invoke-virtual {p2, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 165
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
