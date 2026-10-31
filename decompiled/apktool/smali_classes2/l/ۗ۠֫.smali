.class public final Ll/ۗ۠֫;
.super Ljava/lang/Object;
.source "L8KW"


# static fields
.field public static final synthetic ۢ:I


# instance fields
.field public final ֫:I

.field public final ۜ:Landroid/net/Uri;

.field public final ۧ:[B

.field public final ܳ:J

.field public final ܽ:I

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/util/Map;

.field public final ᩷:J

.field public final ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.datasource"

    .line 42
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V
    .locals 14

    move-object v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p5

    move-wide/from16 v4, p7

    move-wide/from16 v6, p9

    .line 471
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    add-long v8, v1, v4

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    cmp-long v13, v8, v11

    if-ltz v13, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 474
    :goto_0
    invoke-static {v8}, Ll/᩺֡֫;->֫(Z)V

    cmp-long v8, v4, v11

    if-ltz v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .line 475
    :goto_1
    invoke-static {v8}, Ll/᩺֡֫;->֫(Z)V

    cmp-long v8, v6, v11

    if-gtz v8, :cond_2

    const-wide/16 v8, -0x1

    cmp-long v11, v6, v8

    if-nez v11, :cond_3

    :cond_2
    const/4 v10, 0x1

    .line 476
    :cond_3
    invoke-static {v10}, Ll/᩺֡֫;->֫(Z)V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, p1

    .line 477
    iput-object v8, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    .line 478
    iput-wide v1, v0, Ll/ۗ۠֫;->᩷:J

    move/from16 v1, p4

    .line 479
    iput v1, v0, Ll/ۗ۠֫;->ܽ:I

    if-eqz v3, :cond_4

    .line 480
    array-length v1, v3

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    move-object v3, v1

    :goto_2
    iput-object v3, v0, Ll/ۗ۠֫;->ۧ:[B

    .line 481
    new-instance v1, Ljava/util/HashMap;

    move-object/from16 v2, p6

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ۠֫;->ᩳ:Ljava/util/Map;

    .line 482
    iput-wide v4, v0, Ll/ۗ۠֫;->᩻:J

    .line 484
    iput-wide v6, v0, Ll/ۗ۠֫;->ܳ:J

    move-object/from16 v1, p11

    .line 485
    iput-object v1, v0, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    move/from16 v1, p12

    .line 486
    iput v1, v0, Ll/ۗ۠֫;->֫:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;II)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p12}, Ll/ۗ۠֫;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 615
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DataSpec["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 318
    iget v2, p0, Ll/ۗ۠֫;->ܽ:I

    if-eq v2, v1, :cond_2

    const/4 v1, 0x2

    if-eq v2, v1, :cond_1

    const/4 v1, 0x3

    if-ne v2, v1, :cond_0

    const-string v1, "HEAD"

    goto :goto_0

    .line 327
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    const-string v1, "POST"

    goto :goto_0

    :cond_2
    const-string v1, "GET"

    .line 616
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۗ۠֫;->᩻:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۗ۠֫;->ܳ:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗ۠֫;->֫:I

    const-string v2, "]"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(JJ)Ll/ۗ۠֫;
    .locals 16

    move-object/from16 v0, p0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 531
    iget-wide v1, v0, Ll/ۗ۠֫;->ܳ:J

    cmp-long v3, v1, p3

    if-nez v3, :cond_0

    return-object v0

    .line 534
    :cond_0
    new-instance v1, Ll/ۗ۠֫;

    iget-wide v2, v0, Ll/ۗ۠֫;->᩻:J

    add-long v10, v2, p1

    iget-object v14, v0, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    iget v15, v0, Ll/ۗ۠֫;->֫:I

    iget-object v4, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v5, v0, Ll/ۗ۠֫;->᩷:J

    iget v7, v0, Ll/ۗ۠֫;->ܽ:I

    iget-object v8, v0, Ll/ۗ۠֫;->ۧ:[B

    iget-object v9, v0, Ll/ۗ۠֫;->ᩳ:Ljava/util/Map;

    move-object v3, v1

    move-wide/from16 v12, p3

    invoke-direct/range {v3 .. v15}, Ll/ۗ۠֫;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    return-object v1
.end method

.method public final ֫()Ll/ۙ۠֫;
    .locals 1

    .line 509
    new-instance v0, Ll/ۙ۠֫;

    invoke-direct {v0, p0}, Ll/ۙ۠֫;-><init>(Ll/ۗ۠֫;)V

    return-object v0
.end method
