.class public final Ll/ۙ᩵᩻;
.super Ljava/lang/Object;
.source "R8AK"

# interfaces
.implements Ll/ۖ֡᩻;
.implements Ll/ܽ᩻᩻;


# static fields
.field public static final ۬:Ljava/util/Set;


# instance fields
.field public final ۗ:Ll/۫֡᩻;

.field public ۙ:Z

.field public final ᩶:Ll/᩸֡᩻;

.field public ᩸:Ll/ۤ᩵᩻;

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 62
    sget-object v0, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    sget-object v1, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    sget-object v2, Ll/ۜۨۖ;->ۙ:Ll/ۜۨۖ;

    .line 63
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    .line 62
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ۙ᩵᩻;->۬:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/۫֡᩻;Ll/ۤ᩵᩻;Ll/᩸֡᩻;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Ll/ۙ᩵᩻;->ۗ:Ll/۫֡᩻;

    .line 79
    iput-object p3, p0, Ll/ۙ᩵᩻;->᩶:Ll/᩸֡᩻;

    .line 882
    iput-object p2, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    const/4 p1, 0x0

    .line 883
    iput-boolean p1, p0, Ll/ۙ᩵᩻;->ۙ:Z

    .line 884
    iput-boolean p1, p0, Ll/ۙ᩵᩻;->᩹:Z

    return-void
.end method

.method public static ֫(II)I
    .locals 3

    const/4 v0, 0x1

    if-gtz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    const/high16 v2, 0x400000

    .line 821
    div-int/2addr v2, p0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    if-lez p0, :cond_2

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    sub-int/2addr p0, v0

    const/high16 v2, 0x10000

    .line 811
    div-int/2addr p0, v2

    add-int/2addr p0, v0

    .line 812
    div-int/2addr p1, p0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 813
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    :cond_2
    :goto_1
    return v0
.end method

.method public static ֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-ne p0, p1, :cond_1

    return-object p0

    .line 604
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۙ᩵᩻;Ll/۟ܽۘ;)Ljava/io/IOException;
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->֫(Ll/۟ܽۘ;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/۟ܽۘ;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    if-nez p1, :cond_0

    return-object p2

    .line 585
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 589
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 587
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private ֫(Ll/ۧۧۘ;)Ljava/io/IOException;
    .locals 2

    .line 463
    invoke-direct {p0}, Ll/ۙ᩵᩻;->֫()V

    .line 464
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method private ֫(Ljava/lang/String;JJLjava/util/function/LongSupplier;Z)Ljava/io/InputStream;
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    .line 635
    new-instance v1, Ll/ۙᩴ᩻;

    invoke-direct {v1, v8, v0}, Ll/ۙᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    .line 558
    :try_start_0
    invoke-direct {v8, v1}, Ll/ۙ᩵᩻;->֫(Ll/᩹᩵᩻;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/۟ܽۘ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, p0

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v7, p7

    .line 635
    invoke-direct/range {v1 .. v7}, Ll/ۙ᩵᩻;->֫(Ll/۟ܽۘ;JJZ)Ll/ܶ᩵᩻;

    move-result-object v10

    if-eqz p7, :cond_0

    .line 276
    new-instance v1, Ll/֨᩵᩻;

    new-instance v14, Ll/֫᩵᩻;

    invoke-direct {v14, v8}, Ll/֫᩵᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v15, Ll/ۧ᩵᩻;

    invoke-direct {v15, v8}, Ll/ۧ᩵᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v2, Ll/ܽ᩵᩻;

    invoke-direct {v2, v8, v0}, Ll/ܽ᩵᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    new-instance v0, Ll/ܰᩴ᩻;

    invoke-direct {v0, v8}, Ll/ܰᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v3, Ll/۟ᩴ᩻;

    invoke-direct {v3, v8}, Ll/۟ᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    const/16 v19, 0x1

    move-object v9, v1

    move-wide/from16 v11, p2

    move-object/from16 v13, p6

    move-object/from16 v16, v2

    move-object/from16 v17, v0

    move-object/from16 v18, v3

    invoke-direct/range {v9 .. v19}, Ll/֨᩵᩻;-><init>(Ll/ܶ᩵᩻;JLjava/util/function/LongSupplier;Ll/۠᩵᩻;Ll/ۢ᩵᩻;Ll/ۖ᩵᩻;Ll/ۡ᩵᩻;Ll/ۡ᩵᩻;Z)V

    return-object v1

    .line 290
    :cond_0
    new-instance v1, Ll/֨᩵᩻;

    new-instance v13, Ll/᩹ᩴ᩻;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    new-instance v14, Ll/֫᩵᩻;

    invoke-direct {v14, v8}, Ll/֫᩵᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v15, Ll/ۧ᩵᩻;

    invoke-direct {v15, v8}, Ll/ۧ᩵᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v2, Ll/ᩳ᩵᩻;

    invoke-direct {v2, v8, v0}, Ll/ᩳ᩵᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    new-instance v0, Ll/ܰᩴ᩻;

    invoke-direct {v0, v8}, Ll/ܰᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v3, Ll/ܰᩴ᩻;

    invoke-direct {v3, v8}, Ll/ܰᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    const/16 v19, 0x0

    move-object v9, v1

    move-wide/from16 v11, p2

    move-object/from16 v16, v2

    move-object/from16 v17, v0

    move-object/from16 v18, v3

    invoke-direct/range {v9 .. v19}, Ll/֨᩵᩻;-><init>(Ll/ܶ᩵᩻;JLjava/util/function/LongSupplier;Ll/۠᩵᩻;Ll/ۢ᩵᩻;Ll/ۖ᩵᩻;Ll/ۡ᩵᩻;Ll/ۡ᩵᩻;Z)V

    return-object v1

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 569
    :try_start_1
    invoke-direct/range {p0 .. p0}, Ll/ۙ᩵᩻;->ܽ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 571
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 573
    :goto_0
    throw v1
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ljava/io/IOException;Ll/ۚ᩵᩻;)Ljava/lang/Object;
    .locals 1

    .line 528
    invoke-static {p1}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 538
    invoke-direct {p0}, Ll/ۙ᩵᩻;->֫()V

    .line 541
    :try_start_0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    .line 542
    invoke-virtual {p2}, Ll/ۚ᩵᩻;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p2

    .line 549
    invoke-direct {p0}, Ll/ۙ᩵᩻;->֫()V

    .line 550
    invoke-static {p1, p2}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p2

    .line 547
    invoke-direct {p0, p2}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p0

    .line 545
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1, p2}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    .line 532
    :cond_0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->֫()V

    .line 533
    throw p1
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ll/ۧۧۘ;Ll/ܺ᩵᩻;)Ljava/lang/Object;
    .locals 1

    .line 504
    invoke-static {p1}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    .line 512
    :try_start_0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    .line 513
    invoke-interface {p2}, Ll/ܺ᩵᩻;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 520
    invoke-static {p1, p0}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p2

    .line 518
    invoke-direct {p0, p2}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p0

    .line 516
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1, p2}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    .line 505
    :cond_0
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method private ֫(Ll/᩹᩵᩻;)Ljava/lang/Object;
    .locals 3

    .line 472
    :try_start_0
    invoke-interface {p1}, Ll/᩹᩵᩻;->call()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 481
    invoke-static {v0}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 487
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object v0

    .line 489
    :try_start_1
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    .line 490
    invoke-interface {p1}, Ll/᩹᩵᩻;->call()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ll/֨ۨۖ; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ll/ۧۧۘ; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    .line 496
    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 494
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p1

    .line 492
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 482
    :cond_0
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p1

    .line 474
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "/"

    .line 90
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 91
    new-instance p1, Ll/ۗۚۘ;

    sget-object v1, Ll/ۖ֨ۘ;->ۤ:Ll/ۖ֨ۘ;

    iget-object v2, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    iget-object v2, v2, Ll/ۤ᩵᩻;->ᩳ:Ll/ܶܽۘ;

    invoke-virtual {v1, v2}, Ll/ۖ֨ۘ;->֫(Ll/ܶܽۘ;)Ll/ۢ֨ۘ;

    move-result-object v1

    invoke-direct {p1, v1}, Ll/ۗۚۘ;-><init>(Ll/ۢ֨ۘ;)V

    iget-object p0, p0, Ll/ۙ᩵᩻;->ۗ:Ll/۫֡᩻;

    iget-object p0, p0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ll/ۗۚۘ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۚۘ;

    .line 129
    invoke-virtual {p1}, Ll/۬ۚۘ;->ۧ()I

    move-result v1

    const v2, 0x3fffffff    # 1.9999999f

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/high16 v2, 0x2000000

    if-eq v1, v2, :cond_1

    const/high16 v2, 0x4000000

    if-eq v1, v2, :cond_1

    const/high16 v2, 0x8000000

    if-ne v1, v2, :cond_0

    :cond_1
    invoke-virtual {p1}, Ll/۬ۚۘ;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 94
    new-instance v1, Ll/ۗ᩵᩻;

    invoke-direct {v1, p1}, Ll/ۗ᩵᩻;-><init>(Ll/۬ۚۘ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    .line 98
    invoke-direct {p0, p1, v1}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object p0

    .line 99
    invoke-static {p0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object p1

    invoke-static {p0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ܰܽۘ;->ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۤۖ;

    .line 100
    invoke-virtual {p1}, Ll/᩷ۤۖ;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, ".."

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 102
    new-instance v1, Ll/ۗ᩵᩻;

    invoke-direct {v1, p1}, Ll/ۗ᩵᩻;-><init>(Ll/ۖۤۖ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 106
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    return-object v0
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ljava/lang/String;J)Ll/ܶ᩵᩻;
    .locals 7

    .line 651
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ܿ(Ljava/lang/String;)Ll/۟ܽۘ;

    move-result-object v1

    const-wide/16 v4, -0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v6}, Ll/ۙ᩵᩻;->֫(Ll/۟ܽۘ;JJZ)Ll/ܶ᩵᩻;

    move-result-object p0
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 653
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ljava/lang/String;JJ)Ll/ܶ᩵᩻;
    .locals 7

    .line 651
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ܿ(Ljava/lang/String;)Ll/۟ܽۘ;

    move-result-object v1

    const/4 v6, 0x1

    move-object v0, p0

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v6}, Ll/ۙ᩵᩻;->֫(Ll/۟ܽۘ;JJZ)Ll/ܶ᩵᩻;

    move-result-object p0
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 653
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private ֫(Ll/۟ܽۘ;JJZ)Ll/ܶ᩵᩻;
    .locals 8

    .line 662
    invoke-virtual {p1}, Ll/۟ܽۘ;->ܽ()I

    move-result v0

    const/4 v1, 0x1

    if-eqz p6, :cond_1

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    const/high16 v3, 0x100000

    .line 821
    div-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v5, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-eqz p6, :cond_2

    move-object v2, p1

    move-wide v3, p2

    move-wide v6, p4

    .line 665
    invoke-virtual/range {v2 .. v7}, Ll/۟ܽۘ;->֫(JIJ)Ljava/io/InputStream;

    move-result-object p2

    goto :goto_2

    .line 666
    :cond_2
    invoke-virtual {p1, p2, p3}, Ll/۟ܽۘ;->ᩳ(J)Ljava/io/InputStream;

    move-result-object p2

    .line 677
    :goto_2
    new-instance p3, Ll/ܶ᩵᩻;

    new-instance p4, Ll/۫ᩴ᩻;

    invoke-direct {p4, p0, p1, p2}, Ll/۫ᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ll/۟ܽۘ;Ljava/io/InputStream;)V

    invoke-direct {p3, p2, p4}, Ll/ܶ᩵᩻;-><init>(Ljava/io/InputStream;Ll/۫ᩴ᩻;)V

    return-object p3
.end method

.method private declared-synchronized ֫()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 420
    :try_start_0
    iget-boolean v1, p0, Ll/ۙ᩵᩻;->ۙ:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/ۙ᩵᩻;->᩹:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 423
    iput-boolean v1, p0, Ll/ۙ᩵᩻;->᩹:Z

    .line 424
    iget-object v1, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    .line 425
    iget-object v2, p0, Ll/ۙ᩵᩻;->᩶:Ll/᩸֡᩻;

    .line 595
    iget-object v2, v2, Ll/᩸֡᩻;->ۧ:Ll/᩶֡᩻;

    iget-object v3, v2, Ll/᩶֡᩻;->ܽ:Ll/۫֡᩻;

    invoke-static {v1}, Ll/֫֡᩻;->֫(Ll/ۤ᩵᩻;)V

    .line 596
    invoke-virtual {v1}, Ll/ۤ᩵᩻;->֫()Z

    move-result v1

    sget v3, Ll/۬֡᩻;->֫֫:I

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 521
    iput-boolean v1, v2, Ll/᩶֡᩻;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 426
    :cond_1
    monitor-exit v0

    return-void

    .line 421
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 984
    iget-object v0, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    iget-object v0, v0, Ll/ۤ᩵᩻;->ᩳ:Ll/ܶܽۘ;

    invoke-virtual {v0, p1}, Ll/ܶܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ll/ܰܽۘ;

    .line 921
    sget-object p1, Ll/ۨ۫ۖ;->ۨ:Ll/ۨ۫ۖ;

    sget-object v1, Ll/ۨ۫ۖ;->ۘ֫:Ll/ۨ۫ۖ;

    sget-object v2, Ll/ۨ۫ۖ;->ۖ֫:Ll/ۨ۫ۖ;

    .line 922
    invoke-static {p1, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    sget-object p1, Ll/ۜۨۖ;->ۙ:Ll/ۜۨۖ;

    sget-object v1, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    sget-object v3, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    .line 924
    invoke-static {p1, v1, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    sget-object v5, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    .line 921
    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p1

    .line 131
    :try_start_0
    new-instance p2, Ll/ۢۛۖ;

    invoke-direct {p2, p3}, Ll/ۢۛۖ;-><init>(Ljava/lang/String;)V

    .line 132
    invoke-virtual {p1, p2}, Ll/ۗܽۘ;->֫(Ll/ۡۛۖ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 928
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V

    return-void

    :catchall_0
    move-exception p2

    .line 921
    :try_start_1
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
.end method

.method public static synthetic ֫(Ll/ۙ᩵᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->֫()V

    return-void
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ljava/lang/String;Z)V
    .locals 3

    const/4 v0, 0x0

    .line 972
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object v1

    .line 964
    invoke-static {v1}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v2

    invoke-static {v1}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-virtual {v2, v1}, Ll/ܰܽۘ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v1}, Ll/ܰܽۘ;->֫(Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    .line 972
    :cond_1
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object p0

    if-eqz p2, :cond_2

    .line 913
    invoke-static {p0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object p1

    invoke-static {p0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object p0

    const/4 p2, 0x1

    invoke-virtual {p1, p0, p2}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Z)V

    goto :goto_1

    .line 915
    :cond_2
    invoke-static {p0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object p1

    invoke-static {p0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ܰܽۘ;->ܿ(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static ֫(Ll/ۙ᩵᩻;Ll/۟ܽۘ;Ljava/io/InputStream;)V
    .locals 0

    .line 751
    :try_start_0
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p2, 0x0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 756
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/ۙ᩵᩻;->֫(Ll/۟ܽۘ;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 680
    :cond_0
    throw p0
.end method

.method public static synthetic ֫(Ll/ۙ᩵᩻;Ll/᩷᩵᩻;)V
    .locals 1

    .line 385
    invoke-static {p1}, Ll/᩷᩵᩻;->֫(Ll/᩷᩵᩻;)Ll/۟ܽۘ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->֫(Ll/۟ܽۘ;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 387
    :cond_0
    throw p0
.end method

.method public static ֫(Ll/ۙ᩵᩻;[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    .line 185
    aget-object v1, p1, v0

    const/4 v2, 0x1

    aget-object v3, p1, v2

    aget-object v4, p2, v2

    .line 984
    iget-object v5, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    iget-object v5, v5, Ll/ۤ᩵᩻;->ᩳ:Ll/ܶܽۘ;

    invoke-virtual {v5, v1}, Ll/ܶܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object v1

    check-cast v1, Ll/ܰܽۘ;

    .line 968
    invoke-virtual {v1, v3}, Ll/ܰܽۘ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v1, v3}, Ll/ܰܽۘ;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v4}, Ll/ܰܽۘ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v4}, Ll/ܰܽۘ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 188
    :cond_1
    :goto_0
    aget-object v0, p1, v0

    aget-object p1, p1, v2

    aget-object p2, p2, v2

    invoke-direct {p0, v0, p1, p2}, Ll/ۙ᩵᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic ֫(Ljava/io/IOException;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/Exception;)Z
    .locals 1

    :goto_0
    if-eqz p0, :cond_1

    .line 902
    instance-of v0, p0, Ljava/io/EOFException;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 905
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙ᩵᩻;Ljava/lang/String;Z)Ll/۟ܽۘ;
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۙ᩵᩻;->ܽ(Ljava/lang/String;Z)Ll/۟ܽۘ;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;
    .locals 3

    .line 976
    invoke-static {p1}, Ll/ۙ᩵᩻;->ܳ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 977
    aget-object p2, p1, v0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 978
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Operation not supported!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 980
    :cond_1
    :goto_0
    new-instance p2, Ll/᩸᩵᩻;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    .line 984
    iget-object v2, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    iget-object v2, v2, Ll/ۤ᩵᩻;->ᩳ:Ll/ܶܽۘ;

    invoke-virtual {v2, v1}, Ll/ܶܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object v1

    check-cast v1, Ll/ܰܽۘ;

    .line 980
    aget-object p1, p1, v0

    invoke-direct {p2, v1, p1}, Ll/᩸᩵᩻;-><init>(Ll/ܰܽۘ;Ljava/lang/String;)V

    return-object p2
.end method

.method private declared-synchronized ۧ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 436
    :try_start_0
    iget-object v1, p0, Ll/ۙ᩵᩻;->᩶:Ll/᩸֡᩻;

    .line 579
    iget-object v2, v1, Ll/᩸֡᩻;->֫:Ll/۬֡᩻;

    iget-object v3, v1, Ll/᩸֡᩻;->ۧ:Ll/᩶֡᩻;

    iget-object v1, v1, Ll/᩸֡᩻;->ܽ:Ll/ܺ֡᩻;

    invoke-static {v2, v3, v1}, Ll/۬֡᩻;->֫(Ll/۬֡᩻;Ll/᩶֡᩻;Ll/ܺ֡᩻;)Ll/ۤ᩵᩻;

    move-result-object v1

    .line 882
    iput-object v1, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    const/4 v1, 0x0

    .line 883
    iput-boolean v1, p0, Ll/ۙ᩵᩻;->ۙ:Z

    .line 884
    iput-boolean v1, p0, Ll/ۙ᩵᩻;->᩹:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 454
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 452
    :try_start_1
    throw v1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic ۧ(Ll/ۙ᩵᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-void
.end method

.method public static ۧ(Ll/ۙ᩵᩻;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 972
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object v0

    .line 964
    invoke-static {v0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v1

    invoke-static {v0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܰܽۘ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 209
    :cond_0
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ᩳ(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static ۧ(Ll/ۙ᩵᩻;Ljava/lang/String;J)V
    .locals 12

    const/4 v0, 0x0

    .line 972
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object p0

    .line 42
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 46
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p2, p3, p1}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p1

    .line 47
    new-instance v4, Ll/᩺۫ۖ;

    const-wide/16 v0, 0x64

    div-long/2addr p1, v0

    const-wide v0, 0x19db1ded53e8000L

    add-long/2addr p1, v0

    invoke-direct {v4, p1, p2}, Ll/᩺۫ۖ;-><init>(J)V

    .line 138
    invoke-static {p0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object p1

    invoke-static {p0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ll/ܳۤۖ;

    sget-object v2, Ll/ܳۤۖ;->۬:Ll/᩺۫ۖ;

    const-wide/16 v5, 0x0

    move-object v0, p2

    move-object v1, v2

    move-object v3, v4

    invoke-direct/range {v0 .. v6}, Ll/ܳۤۖ;-><init>(Ll/᩺۫ۖ;Ll/᩺۫ۖ;Ll/᩺۫ۖ;Ll/᩺۫ۖ;J)V

    .line 376
    sget-object p3, Ll/ۨ۫ۖ;->ۜ֫:Ll/ۨ۫ۖ;

    sget-object v0, Ll/ۨ۫ۖ;->ۢ֫:Ll/ۨ۫ۖ;

    invoke-static {p3, v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v7

    sget-object v9, Ll/ۜۨۖ;->᩶:Ljava/util/Set;

    sget-object v10, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v5, p1

    move-object v6, p0

    invoke-virtual/range {v5 .. v11}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p0

    .line 377
    :try_start_0
    invoke-virtual {p0, p2}, Ll/ۗܽۘ;->֫(Ll/ۡۛۖ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 378
    invoke-virtual {p0}, Ll/ۗܽۘ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 376
    :try_start_1
    invoke-virtual {p0}, Ll/ۗܽۘ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public static ܳ(Ll/ۙ᩵᩻;Ljava/lang/String;)Ll/ܳ᩵᩻;
    .locals 1

    .line 697
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ܿ(Ljava/lang/String;)Ll/۟ܽۘ;

    move-result-object p1

    .line 707
    new-instance v0, Ll/ܳ᩵᩻;

    invoke-direct {v0, p0, p1}, Ll/ܳ᩵᩻;-><init>(Ll/ۙ᩵᩻;Ll/۟ܽۘ;)V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 699
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ܳ(Ljava/lang/String;)[Ljava/lang/String;
    .locals 5

    const-string v0, "/"

    .line 988
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 989
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 991
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 0
    invoke-static {v2, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    const/16 v0, 0x2f

    .line 994
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    const-string v0, ""

    .line 996
    filled-new-array {p0, v0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 998
    :cond_2
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/2addr v3, v2

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x5c

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ܽ(Ljava/lang/String;Z)Ll/۟ܽۘ;
    .locals 7

    const/4 v0, 0x0

    .line 972
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object p1

    .line 949
    invoke-static {p1}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v0

    invoke-static {p1}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v1

    sget-object p1, Ll/ۨ۫ۖ;->ۘ֫:Ll/ۨ۫ۖ;

    .line 950
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    sget-object p1, Ll/֫ۤۖ;->ۛ:Ll/֫ۤۖ;

    .line 951
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object p1, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    .line 952
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    if-eqz p2, :cond_0

    .line 953
    sget-object p1, Ll/۠ۛۖ;->۫:Ll/۠ۛۖ;

    goto :goto_0

    :cond_0
    sget-object p1, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    :goto_0
    move-object v5, p1

    const-class p1, Ll/ܶۛۖ;

    .line 954
    invoke-static {p1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v6

    .line 949
    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->ۧ(Ljava/lang/String;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/۟ܽۘ;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic ܽ(Ll/ۙ᩵᩻;Ljava/lang/String;)Ll/۟ܽۘ;
    .locals 0

    .line 635
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ܿ(Ljava/lang/String;)Ll/۟ܽۘ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۙ᩵᩻;)Ll/ۤ᩵᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    return-object p0
.end method

.method private declared-synchronized ܽ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 408
    :try_start_0
    iget-boolean v1, p0, Ll/ۙ᩵᩻;->ۙ:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ۙ᩵᩻;->᩹:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 411
    iput-boolean v1, p0, Ll/ۙ᩵᩻;->ۙ:Z

    .line 412
    iget-object v1, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    .line 413
    iget-object v2, p0, Ll/ۙ᩵᩻;->᩶:Ll/᩸֡᩻;

    invoke-virtual {v2, v1}, Ll/᩸֡᩻;->֫(Ll/ۤ᩵᩻;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    monitor-exit v0

    return-void

    .line 409
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private ܿ(Ljava/lang/String;)Ll/۟ܽۘ;
    .locals 7

    const/4 v0, 0x0

    .line 972
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object p1

    .line 939
    invoke-static {p1}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v0

    invoke-static {p1}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v1

    sget-object p1, Ll/ۨ۫ۖ;->ۖ֫:Ll/ۨ۫ۖ;

    .line 940
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    sget-object p1, Ll/֫ۤۖ;->ۛ:Ll/֫ۤۖ;

    .line 941
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object v5, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    const-class p1, Ll/ܶۛۖ;

    .line 944
    invoke-static {p1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v6

    .line 939
    sget-object v4, Ll/ۙ᩵᩻;->۬:Ljava/util/Set;

    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->ۧ(Ljava/lang/String;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/۟ܽۘ;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic ܿ(Ll/ۙ᩵᩻;Ljava/lang/String;)Ll/۟ܽۘ;
    .locals 1

    const/4 v0, 0x1

    .line 325
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ܽ(Ljava/lang/String;Z)Ll/۟ܽۘ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۙ᩵᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    return-void
.end method

.method public static synthetic ᩳ(Ll/ۙ᩵᩻;Ljava/lang/String;)Ll/۟ܽۘ;
    .locals 0

    .line 689
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ܿ(Ljava/lang/String;)Ll/۟ܽۘ;

    move-result-object p0

    return-object p0
.end method

.method private ᩳ(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    .line 972
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object p1

    .line 933
    invoke-static {p1}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v0

    invoke-static {p1}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v1

    .line 307
    sget-object p1, Ll/ۨ۫ۖ;->ܽ֫:Ll/ۨ۫ۖ;

    sget-object v2, Ll/ۨ۫ۖ;->ܰ:Ll/ۨ۫ۖ;

    .line 309
    invoke-static {p1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    sget-object p1, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    .line 310
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object v4, Ll/ۜۨۖ;->᩶:Ljava/util/Set;

    sget-object v5, Ll/۠ۛۖ;->᩶:Ll/۠ۛۖ;

    sget-object p1, Ll/ܶۛۖ;->ۗ:Ll/ܶۛۖ;

    .line 313
    invoke-static {p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v6

    .line 307
    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۙܽۘ;

    move-result-object p1

    .line 314
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۙ᩵᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;JJ)Ljava/io/InputStream;
    .locals 8

    const-wide/16 v0, 0x0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, p4, v0

    if-ltz v4, :cond_1

    sub-long v0, v2, p2

    cmp-long v4, v0, p4

    if-gez v4, :cond_0

    goto :goto_0

    :cond_0
    add-long v2, p2, p4

    .line 248
    :cond_1
    :goto_0
    new-instance v6, Ll/۬ᩴ᩻;

    invoke-direct {v6, v2, v3}, Ll/۬ᩴ᩻;-><init>(J)V

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v7}, Ll/ۙ᩵᩻;->֫(Ljava/lang/String;JJLjava/util/function/LongSupplier;Z)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;JJLl/ۢ᩻᩻;)Ljava/io/InputStream;
    .locals 8

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    .line 258
    invoke-direct/range {v0 .. v7}, Ll/ۙ᩵᩻;->֫(Ljava/lang/String;JJLjava/util/function/LongSupplier;Z)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(JLjava/lang/String;)Ljava/io/OutputStream;
    .locals 8

    .line 325
    new-instance p1, Ll/᩷᩵᩻;

    new-instance p2, Ll/ۨᩴ᩻;

    invoke-direct {p2, p0, p3}, Ll/ۨᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    .line 558
    :try_start_0
    invoke-direct {p0, p2}, Ll/ۙ᩵᩻;->֫(Ll/᩹᩵᩻;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۟ܽۘ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 325
    invoke-direct {p1, p2}, Ll/᩷᩵᩻;-><init>(Ll/۟ܽۘ;)V

    .line 326
    invoke-static {p1}, Ll/᩷᩵᩻;->֫(Ll/᩷᩵᩻;)Ll/۟ܽۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܽۘ;->ᩳ()I

    move-result v1

    .line 327
    iget-object p2, p0, Ll/ۙ᩵᩻;->᩸:Ll/ۤ᩵᩻;

    iget-object p2, p2, Ll/ۤ᩵᩻;->ۧ:Ll/᩻ۧۘ;

    invoke-virtual {p2}, Ll/᩻ۧۘ;->ᩳ()I

    move-result p2

    .line 328
    invoke-static {v1, p2}, Ll/ۙ᩵᩻;->֫(II)I

    move-result v2

    .line 339
    new-instance p2, Ll/ۜ᩵᩻;

    new-instance v3, Ll/ܿ᩵᩻;

    invoke-direct {v3, p0, p1, p3, v1}, Ll/ܿ᩵᩻;-><init>(Ll/ۙ᩵᩻;Ll/᩷᩵᩻;Ljava/lang/String;I)V

    new-instance v4, Ll/᩺ᩴ᩻;

    invoke-direct {v4, p0, p1}, Ll/᩺ᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ll/᩷᩵᩻;)V

    new-instance v5, Ll/ܰᩴ᩻;

    invoke-direct {v5, p0}, Ll/ܰᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v6, Ll/۟ᩴ᩻;

    invoke-direct {v6, p0}, Ll/۟ᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v7, Ll/᩶۫᩷;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Ll/ۜ᩵᩻;-><init>(IILl/ܿ᩵᩻;Ll/᩺ᩴ᩻;Ll/ܰᩴ᩻;Ll/۟ᩴ᩻;Ll/᩶۫᩷;)V

    return-object p2

    :catch_0
    move-exception p1

    .line 569
    :try_start_1
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p2

    .line 571
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 573
    :goto_0
    throw p1
.end method

.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 88
    :try_start_0
    new-instance v0, Ll/᩶ᩴ᩻;

    invoke-direct {v0, p0, p1}, Ll/᩶ᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/᩹᩵᩻;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    .line 111
    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 170
    invoke-static {p1}, Ll/ۙ᩵᩻;->ܳ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 171
    invoke-static {p2}, Ll/ۙ᩵᩻;->ܳ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 173
    :try_start_0
    aget-object v1, p1, v0

    aget-object v2, p2, v0

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    .line 176
    aget-object v2, p1, v1

    aget-object v3, p2, v1

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 193
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-void

    .line 180
    :cond_0
    :try_start_1
    aget-object v0, p1, v0

    aget-object v2, p1, v1

    aget-object v1, p2, v1

    invoke-direct {p0, v0, v2, v1}, Ll/ۙ᩵᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ll/֨ۨۖ; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ll/ۧۧۘ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 481
    :try_start_2
    invoke-static {v0}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 487
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 489
    :try_start_3
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    .line 490
    invoke-static {p0, p1, p2}, Ll/ۙ᩵᩻;->֫(Ll/ۙ᩵᩻;[Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_3
    .catch Ll/֨ۨۖ; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ll/ۧۧۘ; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 193
    :goto_0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-void

    :catch_1
    move-exception p1

    .line 496
    :try_start_4
    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 494
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p1

    .line 492
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, p2}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 482
    :cond_1
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p1

    .line 182
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 174
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Cannot rename between different shares"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    .line 193
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    .line 194
    throw p1
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 3

    const/4 v0, 0x0

    .line 972
    :try_start_0
    invoke-direct {p0, p1, v0}, Ll/ۙ᩵᩻;->ۧ(Ljava/lang/String;Z)Ll/᩸᩵᩻;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 913
    invoke-static {v0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v1

    invoke-static {v0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Z)V

    goto :goto_0

    .line 915
    :cond_0
    invoke-static {v0}, Ll/᩸᩵᩻;->ۧ(Ll/᩸᩵᩻;)Ll/ܰܽۘ;

    move-result-object v1

    invoke-static {v0}, Ll/᩸᩵᩻;->֫(Ll/᩸᩵᩻;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܰܽۘ;->ܿ(Ljava/lang/String;)V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 481
    :try_start_1
    invoke-static {v0}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 487
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 489
    :try_start_2
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    .line 490
    invoke-static {p0, p1, p2}, Ll/ۙ᩵᩻;->֫(Ll/ۙ᩵᩻;Ljava/lang/String;Z)V
    :try_end_2
    .catch Ll/֨ۨۖ; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/ۧۧۘ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    :goto_0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-void

    :catch_1
    move-exception p1

    .line 496
    :try_start_3
    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 494
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p1

    .line 492
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, p2}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 482
    :cond_1
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p1

    .line 153
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 164
    :goto_1
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    .line 165
    throw p1
.end method

.method public final ۧ(JLjava/lang/String;)Ljava/io/InputStream;
    .locals 8

    .line 238
    new-instance v6, Ll/᩹ᩴ᩻;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p3

    move-wide v2, p1

    invoke-direct/range {v0 .. v7}, Ll/ۙ᩵᩻;->֫(Ljava/lang/String;JJLjava/util/function/LongSupplier;Z)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/֨᩷᩻;
    .locals 4

    .line 224
    new-instance v0, Ll/֡᩵᩻;

    .line 689
    new-instance v1, Ll/ۤᩴ᩻;

    invoke-direct {v1, p0, p1}, Ll/ۤᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    .line 558
    :try_start_0
    invoke-direct {p0, v1}, Ll/ۙ᩵᩻;->֫(Ll/᩹᩵᩻;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܽۘ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 707
    new-instance v2, Ll/ܳ᩵᩻;

    invoke-direct {v2, p0, v1}, Ll/ܳ᩵᩻;-><init>(Ll/ۙ᩵᩻;Ll/۟ܽۘ;)V

    .line 225
    new-instance v1, Ll/֫᩵᩻;

    invoke-direct {v1, p0}, Ll/֫᩵᩻;-><init>(Ll/ۙ᩵᩻;)V

    new-instance v3, Ll/ۗᩴ᩻;

    invoke-direct {v3, p0, p1}, Ll/ۗᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;)V

    new-instance p1, Ll/ܰᩴ᩻;

    invoke-direct {p1, p0}, Ll/ܰᩴ᩻;-><init>(Ll/ۙ᩵᩻;)V

    invoke-direct {v0, v2, v1, v3, p1}, Ll/֡᩵᩻;-><init>(Ll/ܳ᩵᩻;Ll/֫᩵᩻;Ll/ۗᩴ᩻;Ll/ܰᩴ᩻;)V

    return-object v0

    :catch_0
    move-exception p1

    .line 569
    :try_start_1
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 571
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 573
    :goto_0
    throw p1
.end method

.method public final ܽ(JLjava/lang/String;)V
    .locals 1

    .line 135
    :try_start_0
    new-instance v0, Ll/ۛᩴ᩻;

    invoke-direct {v0, p0, p3, p1, p2}, Ll/ۛᩴ᩻;-><init>(Ll/ۙ᩵᩻;Ljava/lang/String;J)V

    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/᩹᩵᩻;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    .line 144
    throw p1
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 3

    .line 201
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->ᩳ(Ljava/lang/String;)V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 481
    :try_start_1
    invoke-static {v0}, Ll/ۙ᩵᩻;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 487
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 489
    :try_start_2
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ۧ()V

    .line 490
    invoke-static {p0, p1}, Ll/ۙ᩵᩻;->ۧ(Ll/ۙ᩵᩻;Ljava/lang/String;)V
    :try_end_2
    .catch Ll/֨ۨۖ; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ll/ۧۧۘ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    :goto_0
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    return-void

    :catch_1
    move-exception p1

    .line 496
    :try_start_3
    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 494
    invoke-direct {p0, p1}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p1

    .line 492
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 482
    :cond_0
    invoke-direct {p0, v0}, Ll/ۙ᩵᩻;->֫(Ll/ۧۧۘ;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p1

    .line 203
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    :goto_1
    invoke-direct {p0}, Ll/ۙ᩵᩻;->ܽ()V

    .line 215
    throw p1
.end method
