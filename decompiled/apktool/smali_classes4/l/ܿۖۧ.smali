.class public final Ll/ܿۖۧ;
.super Ljava/lang/Object;
.source "58Q9"

# interfaces
.implements Ll/֨᩷ۧ;


# static fields
.field public static final ᩸:Ll/۟ۖᩴ;


# instance fields
.field public ֡:J

.field public final ֨:Ll/᩵᩷ۧ;

.field public ֫:J

.field public ۖ:Ll/᩵ۢۧ;

.field public ۘ:I

.field public ۚ:Ll/᩻ۖۧ;

.field public final ۜ:J

.field public final ۠:Ll/ܿۢۧ;

.field public ۡ:Z

.field public final ۢ:Ll/ܽۢۧ;

.field public ۧ:Ll/᩵ۢۧ;

.field public ܳ:J

.field public ܶ:I

.field public ܺ:Ll/᩻᩵֫;

.field public ܽ:Z

.field public ܿ:Ll/᩸᩷ۧ;

.field public ᩳ:J

.field public ᩴ:J

.field public final ᩵:Ll/ᩳ֨֫;

.field public final ᩷:Ll/۟᩷ۧ;

.field public final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 133
    new-instance v0, Ll/۟ۖᩴ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿۖۧ;->᩸:Ll/۟ۖᩴ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 197
    invoke-direct {p0, p1, v0, v1}, Ll/ܿۖۧ;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    .line 209
    :cond_0
    iput p1, p0, Ll/ܿۖۧ;->᩻:I

    .line 210
    iput-wide p2, p0, Ll/ܿۖۧ;->ۜ:J

    .line 211
    new-instance p1, Ll/ᩳ֨֫;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܿۖۧ;->᩵:Ll/ᩳ֨֫;

    .line 212
    new-instance p1, Ll/ܿۢۧ;

    .line 52
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p1, p0, Ll/ܿۖۧ;->۠:Ll/ܿۢۧ;

    .line 213
    new-instance p1, Ll/۟᩷ۧ;

    invoke-direct {p1}, Ll/۟᩷ۧ;-><init>()V

    iput-object p1, p0, Ll/ܿۖۧ;->᩷:Ll/۟᩷ۧ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 214
    iput-wide p1, p0, Ll/ܿۖۧ;->֫:J

    .line 215
    new-instance p1, Ll/ܽۢۧ;

    invoke-direct {p1}, Ll/ܽۢۧ;-><init>()V

    iput-object p1, p0, Ll/ܿۖۧ;->ۢ:Ll/ܽۢۧ;

    .line 216
    new-instance p1, Ll/᩵᩷ۧ;

    invoke-direct {p1}, Ll/᩵᩷ۧ;-><init>()V

    iput-object p1, p0, Ll/ܿۖۧ;->֨:Ll/᩵᩷ۧ;

    .line 217
    iput-object p1, p0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    const-wide/16 p1, -0x1

    .line 218
    iput-wide p1, p0, Ll/ܿۖۧ;->ᩳ:J

    return-void
.end method

.method public static ֫(Ll/᩻᩵֫;)J
    .locals 6

    if-eqz p0, :cond_1

    .line 753
    invoke-virtual {p0}, Ll/᩻᩵֫;->֫()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 755
    invoke-virtual {p0, v2}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v3

    .line 756
    instance-of v4, v3, Ll/ۡܺۧ;

    if-eqz v4, :cond_0

    check-cast v3, Ll/ۡܺۧ;

    iget-object v4, v3, Ll/ܳܺۧ;->֫:Ljava/lang/String;

    const-string v5, "TLEN"

    .line 757
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 758
    iget-object p0, v3, Ll/ۡܺۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method private ֫(Ll/۠᩷ۧ;Z)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz p2, :cond_0

    const v2, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v2, 0x80000

    .line 382
    :goto_0
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 383
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    cmp-long v8, v3, v5

    if-nez v8, :cond_4

    .line 386
    iget v3, v0, Ll/ܿۖۧ;->᩻:I

    and-int/lit8 v3, v3, 0x8

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    .line 388
    :cond_1
    sget-object v3, Ll/ܿۖۧ;->᩸:Ll/۟ۖᩴ;

    .line 389
    :goto_1
    iget-object v4, v0, Ll/ܿۖۧ;->ۢ:Ll/ܽۢۧ;

    invoke-virtual {v4, v1, v3}, Ll/ܽۢۧ;->֫(Ll/۠᩷ۧ;Ll/ܽܺۧ;)Ll/᩻᩵֫;

    move-result-object v3

    iput-object v3, v0, Ll/ܿۖۧ;->ܺ:Ll/᩻᩵֫;

    if-eqz v3, :cond_2

    .line 391
    iget-object v4, v0, Ll/ܿۖۧ;->᩷:Ll/۟᩷ۧ;

    invoke-virtual {v4, v3}, Ll/۟᩷ۧ;->֫(Ll/᩻᩵֫;)V

    .line 393
    :cond_2
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v3

    long-to-int v4, v3

    if-nez p2, :cond_3

    .line 395
    invoke-interface {v1, v4}, Ll/۠᩷ۧ;->ܽ(I)V

    :cond_3
    const/4 v3, 0x0

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 399
    :goto_3
    invoke-direct/range {p0 .. p1}, Ll/ܿۖۧ;->ۧ(Ll/۠᩷ۧ;)Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_6

    if-lez v5, :cond_5

    goto :goto_5

    .line 404
    :cond_5
    invoke-direct/range {p0 .. p0}, Ll/ܿۖۧ;->ᩳ()V

    .line 405
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    .line 407
    :cond_6
    iget-object v8, v0, Ll/ܿۖۧ;->᩵:Ll/ᩳ֨֫;

    invoke-virtual {v8, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 408
    invoke-virtual {v8}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    if-eqz v3, :cond_7

    int-to-long v10, v3

    const v12, -0x1f400

    and-int/2addr v12, v8

    int-to-long v12, v12

    const-wide/32 v14, -0x1f400

    and-long/2addr v10, v14

    cmp-long v14, v12, v10

    if-nez v14, :cond_8

    .line 412
    :cond_7
    invoke-static {v8}, Ll/ܳۢۧ;->֫(I)I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_c

    :cond_8
    add-int/lit8 v3, v6, 0x1

    if-ne v6, v2, :cond_a

    if-eqz p2, :cond_9

    return v7

    .line 416
    :cond_9
    invoke-direct/range {p0 .. p0}, Ll/ܿۖۧ;->ᩳ()V

    .line 417
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_a
    if-eqz p2, :cond_b

    .line 424
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    add-int v5, v4, v3

    .line 425
    invoke-interface {v1, v5}, Ll/۠᩷ۧ;->֫(I)V

    goto :goto_4

    .line 427
    :cond_b
    invoke-interface {v1, v9}, Ll/۠᩷ۧ;->ܽ(I)V

    :goto_4
    const/4 v5, 0x0

    const/4 v6, 0x0

    move v6, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    goto :goto_3

    :cond_c
    add-int/lit8 v5, v5, 0x1

    if-ne v5, v9, :cond_d

    .line 433
    iget-object v3, v0, Ll/ܿۖۧ;->۠:Ll/ܿۢۧ;

    invoke-virtual {v3, v8}, Ll/ܿۢۧ;->֫(I)Z

    move v3, v8

    goto :goto_7

    :cond_d
    const/4 v8, 0x4

    if-ne v5, v8, :cond_f

    :goto_5
    if-eqz p2, :cond_e

    add-int/2addr v4, v6

    .line 443
    invoke-interface {v1, v4}, Ll/۠᩷ۧ;->ܽ(I)V

    goto :goto_6

    .line 445
    :cond_e
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 447
    :goto_6
    iput v3, v0, Ll/ܿۖۧ;->ܶ:I

    return v9

    :cond_f
    :goto_7
    add-int/lit8 v10, v10, -0x4

    .line 438
    invoke-interface {v1, v10}, Ll/۠᩷ۧ;->֫(I)V

    goto :goto_3
.end method

.method private ۧ(Ll/۠᩷ۧ;)Z
    .locals 8

    .line 456
    iget-object v0, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 457
    invoke-interface {v0}, Ll/᩻ۖۧ;->ᩳ()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    .line 459
    invoke-interface {p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    goto :goto_0

    .line 464
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ܿۖۧ;->᩵:Ll/ᩳ֨֫;

    .line 465
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    .line 464
    invoke-interface {p1, v1, v2, v3, v0}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    :goto_0
    return v1
.end method

.method private ᩳ()V
    .locals 5

    .line 692
    iget-object v0, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    instance-of v1, v0, Ll/ۧۖۧ;

    if-eqz v1, :cond_0

    .line 693
    check-cast v0, Ll/ۡ᩷ۧ;

    invoke-virtual {v0}, Ll/ۡ᩷ۧ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ܿۖۧ;->ᩳ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v2, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    .line 695
    invoke-interface {v2}, Ll/᩻ۖۧ;->ᩳ()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 696
    iget-object v0, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    check-cast v0, Ll/ۧۖۧ;

    iget-wide v1, p0, Ll/ܿۖۧ;->ᩳ:J

    .line 697
    invoke-virtual {v0, v1, v2}, Ll/ۧۖۧ;->ᩳ(J)Ll/ۧۖۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    .line 698
    iget-object v0, p0, Ll/ܿۖۧ;->ܿ:Ll/᩸᩷ۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    iget-object v1, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v0, v1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 699
    iget-object v0, p0, Ll/ܿۖۧ;->ۖ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    iget-object v1, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ll/᩵ۢۧ;->֫(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 705
    iget-object v2, v0, Ll/ܿۖۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 706
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 283
    iget v2, v0, Ll/ܿۖۧ;->ܶ:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    iget-object v5, v0, Ll/ܿۖۧ;->۠:Ll/ܿۢۧ;

    if-nez v2, :cond_0

    .line 285
    :try_start_0
    invoke-direct {v0, v1, v4}, Ll/ܿۖۧ;->֫(Ll/۠᩷ۧ;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, -0x1

    const/4 v2, -0x1

    const-wide/32 v3, 0xf4240

    goto/16 :goto_1b

    .line 290
    :cond_0
    :goto_0
    iget-object v2, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    iget-object v6, v0, Ll/ܿۖۧ;->᩵:Ll/ᩳ֨֫;

    const/4 v7, 0x1

    if-nez v2, :cond_22

    .line 565
    new-instance v13, Ll/ᩳ֨֫;

    iget v2, v5, Ll/ܿۢۧ;->ܽ:I

    invoke-direct {v13, v2}, Ll/ᩳ֨֫;-><init>(I)V

    .line 566
    invoke-virtual {v13}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    iget v8, v5, Ll/ܿۢۧ;->ܽ:I

    invoke-interface {v1, v4, v8, v2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 568
    iget v2, v5, Ll/ܿۢۧ;->᩻:I

    and-int/2addr v2, v7

    const/16 v4, 0x15

    const/16 v8, 0x24

    if-eqz v2, :cond_1

    .line 569
    iget v2, v5, Ll/ܿۢۧ;->ۧ:I

    if-eq v2, v7, :cond_3

    const/16 v4, 0x24

    goto :goto_1

    .line 570
    :cond_1
    iget v2, v5, Ll/ܿۢۧ;->ۧ:I

    if-eq v2, v7, :cond_2

    goto :goto_1

    :cond_2
    const/16 v4, 0xd

    .line 720
    :cond_3
    :goto_1
    invoke-virtual {v13}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    add-int/lit8 v7, v4, 0x4

    const v9, 0x496e666f

    const-wide/16 v16, 0x0

    const v10, 0x56425249

    const v11, 0x58696e67

    if-lt v2, v7, :cond_4

    .line 721
    invoke-virtual {v13, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 722
    invoke-virtual {v13}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    if-eq v2, v11, :cond_6

    if-ne v2, v9, :cond_4

    goto :goto_2

    .line 727
    :cond_4
    invoke-virtual {v13}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    const/16 v4, 0x28

    if-lt v2, v4, :cond_5

    .line 728
    invoke-virtual {v13, v8}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 729
    invoke-virtual {v13}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    if-ne v2, v10, :cond_5

    const v2, 0x56425249

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    .line 573
    :cond_6
    :goto_2
    iget-object v4, v0, Ll/ܿۖۧ;->᩷:Ll/۟᩷ۧ;

    const-wide/16 v18, -0x1

    if-eq v2, v9, :cond_8

    if-eq v2, v10, :cond_7

    if-eq v2, v11, :cond_8

    .line 615
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    const/4 v2, 0x0

    goto :goto_3

    .line 608
    :cond_7
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v8

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    iget-object v12, v0, Ll/ܿۖۧ;->۠:Ll/ܿۢۧ;

    invoke-static/range {v8 .. v13}, Ll/ۜۖۧ;->֫(JJLl/ܿۢۧ;Ll/ᩳ֨֫;)Ll/ۜۖۧ;

    move-result-object v2

    .line 609
    iget v3, v5, Ll/ܿۢۧ;->ܽ:I

    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    :goto_3
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_a

    .line 576
    :cond_8
    invoke-static {v5, v13}, Ll/᩷ۖۧ;->֫(Ll/ܿۢۧ;Ll/ᩳ֨֫;)Ll/᩷ۖۧ;

    move-result-object v7

    iget-wide v8, v7, Ll/᩷ۖۧ;->֫:J

    .line 109
    iget v10, v4, Ll/۟᩷ۧ;->֫:I

    if-eq v10, v3, :cond_9

    iget v10, v4, Ll/۟᩷ۧ;->ۧ:I

    if-eq v10, v3, :cond_9

    goto :goto_4

    .line 577
    :cond_9
    iget v10, v7, Ll/᩷ۖۧ;->ۧ:I

    if-eq v10, v3, :cond_a

    iget v11, v7, Ll/᩷ۖۧ;->ܽ:I

    if-eq v11, v3, :cond_a

    .line 580
    iput v10, v4, Ll/۟᩷ۧ;->֫:I

    .line 581
    iput v11, v4, Ll/۟᩷ۧ;->ۧ:I

    .line 583
    :cond_a
    :goto_4
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    .line 584
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v12

    cmp-long v3, v12, v18

    if-eqz v3, :cond_b

    cmp-long v3, v8, v18

    if-eqz v3, :cond_b

    .line 586
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v12

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    add-long v14, v10, v8

    cmp-long v3, v12, v14

    if-eqz v3, :cond_c

    .line 587
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v12, "Data size mismatch between stream ("

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 590
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v12

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, ") and Xing frame ("

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, "), using Xing value."

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 587
    invoke-static {v3}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v20, v12

    .line 595
    :cond_c
    :goto_5
    iget v3, v5, Ll/ܿۢۧ;->ܽ:I

    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    const v3, 0x58696e67

    if-ne v2, v3, :cond_d

    .line 601
    invoke-static {v7, v10, v11}, Ll/ۢۖۧ;->֫(Ll/᩷ۖۧ;J)Ll/ۢۖۧ;

    move-result-object v2

    :goto_6
    move-wide/from16 v7, v20

    goto :goto_a

    .line 603
    :cond_d
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v2

    .line 643
    invoke-virtual {v7}, Ll/᩷ۖۧ;->֫()J

    move-result-wide v26

    iget-object v12, v7, Ll/᩷ۖۧ;->ܿ:Ll/ܿۢۧ;

    cmp-long v13, v26, v20

    if-nez v13, :cond_e

    goto :goto_9

    :cond_e
    cmp-long v13, v8, v18

    if-eqz v13, :cond_f

    add-long v2, v10, v8

    .line 654
    iget v13, v12, Ll/ܿۢۧ;->ܽ:I

    :goto_7
    int-to-long v13, v13

    sub-long/2addr v8, v13

    move-wide/from16 v31, v2

    goto :goto_8

    :cond_f
    cmp-long v8, v2, v18

    if-eqz v8, :cond_10

    sub-long v8, v2, v10

    .line 657
    iget v13, v12, Ll/ܿۢۧ;->ܽ:I

    goto :goto_7

    .line 666
    :goto_8
    sget-object v2, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const-wide/32 v24, 0x7a1200

    move-wide/from16 v22, v8

    move-object/from16 v28, v2

    .line 668
    invoke-static/range {v22 .. v28}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v13

    .line 667
    invoke-static {v13, v14}, Ll/۬᩺ܺ;->֫(J)I

    move-result v29

    .line 673
    iget-wide v13, v7, Ll/᩷ۖۧ;->ᩳ:J

    .line 674
    invoke-static {v8, v9, v13, v14, v2}, Ll/۠᩺ܺ;->֫(JJLjava/math/RoundingMode;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/۬᩺ܺ;->֫(J)I

    move-result v30

    .line 678
    new-instance v2, Ll/ۧۖۧ;

    iget v3, v12, Ll/ܿۢۧ;->ܽ:I

    int-to-long v7, v3

    add-long v33, v10, v7

    const/16 v35, 0x0

    move-object/from16 v28, v2

    invoke-direct/range {v28 .. v35}, Ll/ۧۖۧ;-><init>(IIJJZ)V

    goto :goto_6

    :cond_10
    :goto_9
    const/4 v2, 0x0

    goto :goto_6

    .line 476
    :goto_a
    iget-object v3, v0, Ll/ܿۖۧ;->ܺ:Ll/᩻᩵֫;

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v9

    if-eqz v3, :cond_12

    .line 740
    invoke-virtual {v3}, Ll/᩻᩵֫;->֫()I

    move-result v11

    const/4 v12, 0x0

    :goto_b
    if-ge v12, v11, :cond_12

    .line 742
    invoke-virtual {v3, v12}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v13

    .line 743
    instance-of v14, v13, Ll/᩷ܺۧ;

    if-eqz v14, :cond_11

    .line 744
    check-cast v13, Ll/᩷ܺۧ;

    invoke-static {v3}, Ll/ܿۖۧ;->֫(Ll/᩻᩵֫;)J

    move-result-wide v11

    invoke-static {v9, v10, v13, v11, v12}, Ll/ᩳۖۧ;->֫(JLl/᩷ܺۧ;J)Ll/ᩳۖۧ;

    move-result-object v3

    goto :goto_c

    :cond_11
    add-int/lit8 v12, v12, 0x1

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    .line 478
    :goto_c
    iget-boolean v9, v0, Ll/ܿۖۧ;->ܽ:Z

    iget v10, v0, Ll/ܿۖۧ;->᩻:I

    if-eqz v9, :cond_13

    .line 479
    new-instance v2, Ll/ܳۖۧ;

    .line 58
    invoke-direct {v2, v7, v8}, Ll/᩷ۢۧ;-><init>(J)V

    goto/16 :goto_14

    :cond_13
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_16

    if-eqz v3, :cond_14

    .line 487
    invoke-virtual {v3}, Ll/ᩳۖۧ;->ۜ()J

    move-result-wide v2

    goto :goto_d

    :cond_14
    if-eqz v2, :cond_15

    .line 490
    invoke-interface {v2}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v7

    .line 491
    invoke-interface {v2}, Ll/᩻ۖۧ;->ᩳ()J

    move-result-wide v2

    move-wide/from16 v27, v2

    move-wide/from16 v23, v7

    goto :goto_e

    .line 493
    :cond_15
    iget-object v2, v0, Ll/ܿۖۧ;->ܺ:Ll/᩻᩵֫;

    invoke-static {v2}, Ll/ܿۖۧ;->֫(Ll/᩻᩵֫;)J

    move-result-wide v2

    :goto_d
    move-wide/from16 v23, v2

    move-wide/from16 v27, v18

    .line 495
    :goto_e
    new-instance v2, Ll/ܽۖۧ;

    .line 497
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v25

    move-object/from16 v22, v2

    invoke-direct/range {v22 .. v28}, Ll/ܽۖۧ;-><init>(JJJ)V

    goto :goto_f

    :cond_16
    if-eqz v3, :cond_17

    move-object v2, v3

    goto :goto_f

    :cond_17
    if-eqz v2, :cond_18

    goto :goto_f

    :cond_18
    const/4 v2, 0x0

    :goto_f
    if-eqz v2, :cond_1c

    .line 550
    invoke-interface {v2}, Ll/ۢۢۧ;->ܿ()Z

    move-result v3

    if-nez v3, :cond_1c

    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_1c

    .line 506
    invoke-interface {v2}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v7

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v7, v11

    if-eqz v3, :cond_1c

    .line 507
    invoke-interface {v2}, Ll/᩻ۖۧ;->ᩳ()J

    move-result-wide v7

    cmp-long v3, v7, v18

    if-nez v3, :cond_19

    .line 508
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v7

    cmp-long v3, v7, v18

    if-eqz v3, :cond_1c

    .line 512
    :cond_19
    invoke-interface {v2}, Ll/᩻ۖۧ;->ۧ()J

    move-result-wide v7

    cmp-long v3, v7, v18

    if-eqz v3, :cond_1a

    .line 513
    invoke-interface {v2}, Ll/᩻ۖۧ;->ۧ()J

    move-result-wide v7

    move-wide/from16 v27, v7

    goto :goto_10

    :cond_1a
    move-wide/from16 v27, v16

    .line 516
    :goto_10
    invoke-interface {v2}, Ll/᩻ۖۧ;->ᩳ()J

    move-result-wide v7

    cmp-long v3, v7, v18

    if-eqz v3, :cond_1b

    .line 517
    invoke-interface {v2}, Ll/᩻ۖۧ;->ᩳ()J

    move-result-wide v7

    goto :goto_11

    .line 518
    :cond_1b
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v7

    :goto_11
    move-wide/from16 v25, v7

    sub-long v29, v25, v27

    .line 525
    invoke-interface {v2}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v33

    sget-object v35, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const-wide/32 v31, 0x7a1200

    .line 522
    invoke-static/range {v29 .. v35}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    .line 521
    invoke-static {v2, v3}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v23

    .line 529
    new-instance v2, Ll/ۧۖۧ;

    const/16 v24, -0x1

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-direct/range {v22 .. v29}, Ll/ۧۖۧ;-><init>(IIJJZ)V

    goto :goto_13

    :cond_1c
    if-eqz v2, :cond_1d

    .line 550
    invoke-interface {v2}, Ll/ۢۢۧ;->ܿ()Z

    move-result v3

    if-nez v3, :cond_1f

    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_1f

    :cond_1d
    and-int/lit8 v2, v10, 0x2

    if-eqz v2, :cond_1e

    const/4 v2, 0x1

    const/16 v29, 0x1

    goto :goto_12

    :cond_1e
    const/4 v2, 0x0

    const/16 v29, 0x0

    .line 623
    :goto_12
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    const/4 v3, 0x4

    const/4 v7, 0x0

    invoke-interface {v1, v7, v3, v2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 624
    invoke-virtual {v6, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 625
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    invoke-virtual {v5, v2}, Ll/ܿۢۧ;->֫(I)Z

    .line 626
    new-instance v2, Ll/ۧۖۧ;

    .line 627
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v25

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v27

    .line 50
    iget v3, v5, Ll/ܿۢۧ;->֫:I

    iget v7, v5, Ll/ܿۢۧ;->ܽ:I

    move-object/from16 v22, v2

    move/from16 v23, v3

    move/from16 v24, v7

    invoke-direct/range {v22 .. v29}, Ll/ۧۖۧ;-><init>(IIJJZ)V

    .line 545
    :cond_1f
    :goto_13
    iget-object v3, v0, Ll/ܿۖۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-interface {v2}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v7

    invoke-interface {v3, v7, v8}, Ll/᩵ۢۧ;->֫(J)V

    .line 291
    :goto_14
    iput-object v2, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    .line 292
    iget-object v3, v0, Ll/ܿۖۧ;->ܿ:Ll/᩸᩷ۧ;

    invoke-interface {v3, v2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 293
    new-instance v2, Ll/֨ᩴ֫;

    invoke-direct {v2}, Ll/֨ᩴ֫;-><init>()V

    const-string v3, "audio/mpeg"

    .line 295
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    iget-object v3, v5, Ll/ܿۢۧ;->ᩳ:Ljava/lang/String;

    .line 296
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    const/16 v3, 0x1000

    .line 297
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ۖ(I)V

    iget v3, v5, Ll/ܿۢۧ;->ۧ:I

    .line 298
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v3, v5, Ll/ܿۢۧ;->ܿ:I

    .line 299
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->۠(I)V

    iget v3, v4, Ll/۟᩷ۧ;->֫:I

    .line 300
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->᩷(I)V

    iget v3, v4, Ll/۟᩷ۧ;->ۧ:I

    .line 301
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ۢ(I)V

    and-int/lit8 v3, v10, 0x8

    if-eqz v3, :cond_20

    const/4 v3, 0x0

    goto :goto_15

    .line 302
    :cond_20
    iget-object v3, v0, Ll/ܿۖۧ;->ܺ:Ll/᩻᩵֫;

    :goto_15
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 303
    iget-object v3, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v3}, Ll/᩻ۖۧ;->᩻()I

    move-result v3

    const v4, -0x7fffffff

    if-eq v3, v4, :cond_21

    .line 304
    iget-object v3, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v3}, Ll/᩻ۖۧ;->᩻()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 306
    :cond_21
    iget-object v3, v0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    invoke-virtual {v2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v2

    invoke-interface {v3, v2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 307
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    iput-wide v2, v0, Ll/ܿۖۧ;->ܳ:J

    move-wide/from16 v7, v16

    const-wide/32 v3, 0xf4240

    goto :goto_16

    :cond_22
    const-wide/32 v2, 0xf4240

    const-wide/16 v16, 0x0

    .line 308
    iget-wide v7, v0, Ll/ܿۖۧ;->ܳ:J

    cmp-long v4, v7, v16

    if-eqz v4, :cond_23

    .line 309
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    .line 310
    iget-wide v9, v0, Ll/ܿۖۧ;->ܳ:J

    cmp-long v4, v7, v9

    if-gez v4, :cond_23

    sub-long/2addr v9, v7

    long-to-int v4, v9

    .line 312
    invoke-interface {v1, v4}, Ll/۠᩷ۧ;->ܽ(I)V

    :cond_23
    move-wide v3, v2

    move-wide/from16 v7, v16

    .line 320
    :goto_16
    iget v2, v0, Ll/ܿۖۧ;->ۘ:I

    if-nez v2, :cond_28

    .line 321
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 322
    invoke-direct/range {p0 .. p1}, Ll/ܿۖۧ;->ۧ(Ll/۠᩷ۧ;)Z

    move-result v2

    if-eqz v2, :cond_24

    goto/16 :goto_19

    :cond_24
    const/4 v2, 0x0

    .line 325
    invoke-virtual {v6, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 326
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    .line 327
    iget v6, v0, Ll/ܿۖۧ;->ܶ:I

    int-to-long v9, v6

    const v6, -0x1f400

    and-int/2addr v6, v2

    int-to-long v11, v6

    const-wide/32 v13, -0x1f400

    and-long/2addr v9, v13

    cmp-long v6, v11, v9

    if-nez v6, :cond_27

    .line 328
    invoke-static {v2}, Ll/ܳۢۧ;->֫(I)I

    move-result v6

    const/4 v9, -0x1

    if-ne v6, v9, :cond_25

    const/4 v2, 0x1

    const/4 v6, 0x0

    goto :goto_17

    .line 334
    :cond_25
    invoke-virtual {v5, v2}, Ll/ܿۢۧ;->֫(I)Z

    .line 335
    iget-wide v9, v0, Ll/ܿۖۧ;->֫:J

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v9, v11

    if-nez v2, :cond_26

    .line 336
    iget-object v2, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v9

    invoke-interface {v2, v9, v10}, Ll/᩻ۖۧ;->ۧ(J)J

    move-result-wide v9

    iput-wide v9, v0, Ll/ܿۖۧ;->֫:J

    .line 337
    iget-wide v9, v0, Ll/ܿۖۧ;->ۜ:J

    cmp-long v2, v9, v11

    if-eqz v2, :cond_26

    .line 338
    iget-object v2, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v2, v7, v8}, Ll/᩻ۖۧ;->ۧ(J)J

    move-result-wide v6

    .line 339
    iget-wide v11, v0, Ll/ܿۖۧ;->֫:J

    sub-long/2addr v9, v6

    add-long/2addr v9, v11

    iput-wide v9, v0, Ll/ܿۖۧ;->֫:J

    .line 342
    :cond_26
    iget v2, v5, Ll/ܿۢۧ;->ܽ:I

    iput v2, v0, Ll/ܿۖۧ;->ۘ:I

    .line 343
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v6

    iget v2, v5, Ll/ܿۢۧ;->ܽ:I

    int-to-long v8, v2

    add-long/2addr v6, v8

    iput-wide v6, v0, Ll/ܿۖۧ;->ᩳ:J

    .line 344
    iget-object v2, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    instance-of v8, v2, Ll/ܽۖۧ;

    if-eqz v8, :cond_28

    .line 345
    check-cast v2, Ll/ܽۖۧ;

    .line 348
    iget-wide v8, v0, Ll/ܿۖۧ;->ᩴ:J

    iget v10, v5, Ll/ܿۢۧ;->ܳ:I

    int-to-long v10, v10

    add-long/2addr v8, v10

    .line 373
    iget-wide v10, v0, Ll/ܿۖۧ;->֫:J

    mul-long v8, v8, v3

    iget v12, v5, Ll/ܿۢۧ;->ܿ:I

    int-to-long v12, v12

    div-long/2addr v8, v12

    add-long/2addr v8, v10

    .line 348
    invoke-virtual {v2, v8, v9, v6, v7}, Ll/ܽۖۧ;->֫(JJ)V

    .line 351
    iget-boolean v6, v0, Ll/ܿۖۧ;->ۡ:Z

    if-eqz v6, :cond_28

    iget-wide v6, v0, Ll/ܿۖۧ;->֡:J

    invoke-virtual {v2, v6, v7}, Ll/ܽۖۧ;->ܽ(J)Z

    move-result v2

    if-eqz v2, :cond_28

    const/4 v2, 0x0

    .line 352
    iput-boolean v2, v0, Ll/ܿۖۧ;->ۡ:Z

    .line 353
    iget-object v2, v0, Ll/ܿۖۧ;->ۖ:Ll/᩵ۢۧ;

    iput-object v2, v0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    goto :goto_18

    :cond_27
    const/4 v6, 0x0

    const/4 v2, 0x1

    .line 330
    :goto_17
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 331
    iput v6, v0, Ll/ܿۖۧ;->ܶ:I

    goto :goto_1a

    :cond_28
    :goto_18
    const/4 v2, 0x1

    .line 357
    iget-object v6, v0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    iget v7, v0, Ll/ܿۖۧ;->ۘ:I

    invoke-interface {v6, v1, v7, v2}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_29

    :goto_19
    const/4 v1, -0x1

    const/4 v2, -0x1

    goto :goto_1b

    .line 361
    :cond_29
    iget v2, v0, Ll/ܿۖۧ;->ۘ:I

    sub-int/2addr v2, v1

    iput v2, v0, Ll/ܿۖۧ;->ۘ:I

    if-lez v2, :cond_2a

    goto :goto_1a

    .line 365
    :cond_2a
    iget-object v6, v0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    iget-wide v1, v0, Ll/ܿۖۧ;->ᩴ:J

    .line 373
    iget-wide v7, v0, Ll/ܿۖۧ;->֫:J

    mul-long v1, v1, v3

    iget v9, v5, Ll/ܿۢۧ;->ܿ:I

    int-to-long v9, v9

    div-long/2addr v1, v9

    add-long/2addr v7, v1

    .line 366
    iget v10, v5, Ll/ܿۢۧ;->ܽ:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x1

    .line 365
    invoke-interface/range {v6 .. v12}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 367
    iget-wide v1, v0, Ll/ܿۖۧ;->ᩴ:J

    iget v6, v5, Ll/ܿۢۧ;->ܳ:I

    int-to-long v6, v6

    add-long/2addr v1, v6

    iput-wide v1, v0, Ll/ܿۖۧ;->ᩴ:J

    const/4 v1, 0x0

    .line 368
    iput v1, v0, Ll/ܿۖۧ;->ۘ:I

    :goto_1a
    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_1b
    if-ne v2, v1, :cond_2b

    .line 258
    iget-object v1, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    instance-of v6, v1, Ll/ܽۖۧ;

    if-eqz v6, :cond_2b

    .line 260
    iget-wide v6, v0, Ll/ܿۖۧ;->ᩴ:J

    .line 373
    iget-wide v8, v0, Ll/ܿۖۧ;->֫:J

    mul-long v6, v6, v3

    iget v3, v5, Ll/ܿۢۧ;->ܿ:I

    int-to-long v3, v3

    div-long/2addr v6, v3

    add-long/2addr v6, v8

    .line 261
    invoke-interface {v1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v3

    cmp-long v1, v3, v6

    if-eqz v1, :cond_2b

    .line 262
    iget-object v1, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    check-cast v1, Ll/ܽۖۧ;

    invoke-virtual {v1, v6, v7}, Ll/ܽۖۧ;->ᩳ(J)V

    .line 263
    iget-object v1, v0, Ll/ܿۖۧ;->ܿ:Ll/᩸᩷ۧ;

    iget-object v3, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v1, v3}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 264
    iget-object v1, v0, Ll/ܿۖۧ;->ۖ:Ll/᩵ۢۧ;

    iget-object v3, v0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    invoke-interface {v3}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Ll/᩵ۢۧ;->֫(J)V

    :cond_2b
    return v2
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 2

    const/4 p1, 0x0

    .line 238
    iput p1, p0, Ll/ܿۖۧ;->ܶ:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 239
    iput-wide v0, p0, Ll/ܿۖۧ;->֫:J

    const-wide/16 v0, 0x0

    .line 240
    iput-wide v0, p0, Ll/ܿۖۧ;->ᩴ:J

    .line 241
    iput p1, p0, Ll/ܿۖۧ;->ۘ:I

    .line 242
    iput-wide p3, p0, Ll/ܿۖۧ;->֡:J

    .line 243
    iget-object p1, p0, Ll/ܿۖۧ;->ۚ:Ll/᩻ۖۧ;

    instance-of p2, p1, Ll/ܽۖۧ;

    if-eqz p2, :cond_0

    check-cast p1, Ll/ܽۖۧ;

    invoke-virtual {p1, p3, p4}, Ll/ܽۖۧ;->ܽ(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 244
    iput-boolean p1, p0, Ll/ܿۖۧ;->ۡ:Z

    .line 245
    iget-object p1, p0, Ll/ܿۖۧ;->֨:Ll/᩵᩷ۧ;

    iput-object p1, p0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 230
    iput-object p1, p0, Ll/ܿۖۧ;->ܿ:Ll/᩸᩷ۧ;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 231
    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۖۧ;->ۖ:Ll/᩵ۢۧ;

    .line 232
    iput-object p1, p0, Ll/ܿۖۧ;->ۧ:Ll/᩵ۢۧ;

    .line 233
    iget-object p1, p0, Ll/ܿۖۧ;->ܿ:Ll/᩸᩷ۧ;

    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 1

    const/4 v0, 0x1

    .line 225
    invoke-direct {p0, p1, v0}, Ll/ܿۖۧ;->֫(Ll/۠᩷ۧ;Z)Z

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 276
    iput-boolean v0, p0, Ll/ܿۖۧ;->ܽ:Z

    return-void
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
