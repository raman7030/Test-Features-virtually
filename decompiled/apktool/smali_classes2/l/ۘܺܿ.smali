.class public final Ll/ۘܺܿ;
.super Ljava/lang/Object;
.source "U6N4"


# instance fields
.field public final ֫:Ll/۬ۢܿ;

.field public final ۧ:I

.field public final ܳ:Ll/۟᩺ᩳ;

.field public final ܽ:Ll/۬ۢܿ;

.field public final ܿ:I

.field public final ᩳ:Ll/᩺ܺܿ;


# direct methods
.method public constructor <init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;IILl/۬ۢܿ;Ll/۬ۢܿ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۘܺܿ;->ܳ:Ll/۟᩺ᩳ;

    .line 18
    iput-object p2, p0, Ll/ۘܺܿ;->ᩳ:Ll/᩺ܺܿ;

    .line 19
    iput p3, p0, Ll/ۘܺܿ;->ۧ:I

    .line 20
    iput p4, p0, Ll/ۘܺܿ;->ܿ:I

    .line 21
    iput-object p5, p0, Ll/ۘܺܿ;->ܽ:Ll/۬ۢܿ;

    .line 22
    iput-object p6, p0, Ll/ۘܺܿ;->֫:Ll/۬ۢܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ۖܿ;)Ll/ۘܺܿ;
    .locals 18

    move-object/from16 v0, p0

    if-eqz p1, :cond_4

    .line 52
    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 53
    :cond_0
    iget-object v1, v0, Ll/ۘܺܿ;->ܽ:Ll/۬ۢܿ;

    iget v2, v1, Ll/۬ۢܿ;->ܽ:I

    iget v3, v1, Ll/۬ۢܿ;->ܽ:I

    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->ۧ()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 54
    iget v4, v1, Ll/۬ۢܿ;->ۧ:I

    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->֫()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-lt v2, v4, :cond_1

    goto/16 :goto_1

    .line 56
    :cond_1
    new-instance v5, Ll/ܽۖܿ;

    invoke-direct {v5}, Ll/ܽۖܿ;-><init>()V

    .line 57
    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->ܿ()Ll/ۢۖܿ;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->ۧ()I

    move-result v7

    sub-int v7, v2, v7

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    new-instance v8, Ll/ᩳۖܿ;

    invoke-direct {v8}, Ll/ᩳۖܿ;-><init>()V

    .line 279
    invoke-virtual {v8, v6}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 280
    invoke-virtual {v8, v7}, Ll/ᩳۖܿ;->֫(I)Z

    .line 59
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->ۧ()I

    move-result v6

    invoke-virtual {v8}, Ll/ᩳۖܿ;->ۧ()I

    move-result v7

    add-int/2addr v7, v6

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 60
    invoke-virtual/range {p1 .. p1}, Ll/۟ۖܿ;->ۧ()I

    move-result v7

    invoke-virtual {v8}, Ll/ᩳۖܿ;->֫()I

    move-result v9

    add-int/2addr v9, v7

    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 61
    invoke-virtual {v8}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v9

    sub-int v6, v7, v6

    .line 62
    new-instance v15, Ll/᩸᩷ܿ;

    invoke-virtual {v9}, Ll/᩸᩷ܿ;->ᩳ()I

    move-result v12

    invoke-virtual {v9}, Ll/᩸᩷ܿ;->᩵()I

    move-result v14

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    move-object v10, v15

    move-object/from16 v17, v15

    move v15, v9

    invoke-direct/range {v10 .. v16}, Ll/᩸᩷ܿ;-><init>(Ljava/lang/String;IIIII)V

    move-object/from16 v10, v17

    invoke-virtual {v5, v6, v10, v9}, Ll/ܽۖܿ;->֫(ILl/᩸᩷ܿ;Z)V

    if-ne v7, v4, :cond_3

    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {v8}, Ll/ᩳۖܿ;->ܿ()Z

    move-result v6

    if-nez v6, :cond_2

    .line 65
    :goto_0
    iget-object v1, v1, Ll/۬ۢܿ;->֫:Ll/ۢۖܿ;

    sub-int/2addr v2, v3

    sub-int/2addr v4, v3

    invoke-virtual {v5}, Ll/ܽۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object v5

    invoke-virtual {v1, v2, v4, v5}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v1

    .line 66
    new-instance v2, Ll/ۘܺܿ;

    new-instance v9, Ll/۬ۢܿ;

    invoke-direct {v9, v3, v1}, Ll/۬ۢܿ;-><init>(ILl/ۢۖܿ;)V

    iget-object v10, v0, Ll/ۘܺܿ;->֫:Ll/۬ۢܿ;

    iget-object v5, v0, Ll/ۘܺܿ;->ܳ:Ll/۟᩺ᩳ;

    iget-object v6, v0, Ll/ۘܺܿ;->ᩳ:Ll/᩺ܺܿ;

    iget v7, v0, Ll/ۘܺܿ;->ۧ:I

    iget v8, v0, Ll/ۘܺܿ;->ܿ:I

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Ll/ۘܺܿ;-><init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;IILl/۬ۢܿ;Ll/۬ۢܿ;)V

    return-object v2

    :cond_4
    :goto_1
    return-object v0
.end method

.method public final ֫(Ll/۬ۢܿ;)Ll/ۘܺܿ;
    .locals 10

    .line 33
    iget v0, p1, Ll/۬ۢܿ;->ܽ:I

    iget v1, p1, Ll/۬ۢܿ;->ۧ:I

    iget-object v2, p0, Ll/ۘܺܿ;->ܽ:Ll/۬ۢܿ;

    iget v3, v2, Ll/۬ۢܿ;->ۧ:I

    iget-object v4, v2, Ll/۬ۢܿ;->֫:Ll/ۢۖܿ;

    iget v5, v2, Ll/۬ۢܿ;->ܽ:I

    if-gt v0, v3, :cond_2

    if-gt v5, v1, :cond_2

    .line 34
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/high16 v3, 0x10000

    sub-int v3, v1, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 35
    iget v2, v2, Ll/۬ۢܿ;->ۧ:I

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    int-to-long v6, v0

    const-wide/32 v8, 0x10000

    add-long/2addr v6, v8

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    .line 37
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v2

    .line 38
    iget v6, p1, Ll/۬ۢܿ;->ܽ:I

    if-ge v0, v6, :cond_0

    sub-int v2, v0, v5

    sub-int/2addr v6, v5

    .line 39
    invoke-virtual {v4, v2, v6}, Ll/ۢۖܿ;->ۧ(II)Ll/ۢۖܿ;

    move-result-object v2

    .line 41
    :cond_0
    iget-object v6, p1, Ll/۬ۢܿ;->֫:Ll/ۢۖܿ;

    invoke-virtual {v2, v6}, Ll/ۢۖܿ;->֫(Ll/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v2

    if-le v3, v1, :cond_1

    sub-int/2addr v1, v5

    sub-int/2addr v3, v5

    .line 43
    invoke-virtual {v4, v1, v3}, Ll/ۢۖܿ;->ۧ(II)Ll/ۢۖܿ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۢۖܿ;->֫(Ll/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v2

    .line 45
    :cond_1
    new-instance v1, Ll/۬ۢܿ;

    invoke-direct {v1, v0, v2}, Ll/۬ۢܿ;-><init>(ILl/ۢۖܿ;)V

    move-object v8, v1

    goto :goto_0

    :cond_2
    move-object v8, p1

    .line 47
    :goto_0
    new-instance v0, Ll/ۘܺܿ;

    iget v6, p0, Ll/ۘܺܿ;->ۧ:I

    iget v7, p0, Ll/ۘܺܿ;->ܿ:I

    iget-object v4, p0, Ll/ۘܺܿ;->ܳ:Ll/۟᩺ᩳ;

    iget-object v5, p0, Ll/ۘܺܿ;->ᩳ:Ll/᩺ܺܿ;

    move-object v3, v0

    move-object v9, p1

    invoke-direct/range {v3 .. v9}, Ll/ۘܺܿ;-><init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;IILl/۬ۢܿ;Ll/۬ۢܿ;)V

    return-object v0
.end method

.method public final ֫(Ll/᩶᩸ᩳ;Ll/᩺ܺܿ;IIIIILl/᩸᩷ܿ;)Ll/ۘܺܿ;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p5

    move/from16 v2, p6

    move/from16 v3, p7

    add-int/lit8 v4, p3, -0x1

    sub-int v5, p4, v3

    add-int/2addr v5, v2

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    .line 73
    invoke-virtual {v0, v6, v7, v4, v5}, Ll/ۘܺܿ;->֫(Ljava/lang/Object;Ll/᩺ܺܿ;II)Z

    move-result v4

    if-eqz v4, :cond_6

    if-ltz v1, :cond_6

    if-ltz v2, :cond_6

    if-ltz v3, :cond_6

    int-to-long v4, v1

    int-to-long v6, v2

    add-long/2addr v4, v6

    iget v6, v0, Ll/ۘܺܿ;->ܿ:I

    int-to-long v6, v6

    cmp-long v8, v4, v6

    if-lez v8, :cond_0

    goto/16 :goto_3

    :cond_0
    add-int v4, v1, v2

    sub-int v2, v3, v2

    .line 78
    iget-object v5, v0, Ll/ۘܺܿ;->ܽ:Ll/۬ۢܿ;

    iget v6, v5, Ll/۬ۢܿ;->ܽ:I

    .line 79
    iget-object v7, v5, Ll/۬ۢܿ;->֫:Ll/ۢۖܿ;

    if-ge v1, v6, :cond_1

    if-gt v4, v6, :cond_1

    add-int/2addr v6, v2

    goto :goto_2

    .line 82
    :cond_1
    iget v2, v5, Ll/۬ۢܿ;->ۧ:I

    if-ge v1, v2, :cond_5

    sub-int v2, v1, v6

    const/4 v5, 0x0

    .line 83
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 84
    invoke-virtual {v7}, Ll/ۢۖܿ;->֫()I

    move-result v8

    sub-int/2addr v4, v6

    invoke-static {v8, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-le v1, v6, :cond_2

    add-int/lit8 v8, v2, -0x1

    .line 85
    invoke-virtual {v7, v8}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v8

    goto :goto_0

    :cond_2
    move-object/from16 v8, p8

    :goto_0
    if-nez v3, :cond_3

    .line 86
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v3

    goto :goto_1

    .line 87
    :cond_3
    new-instance v15, Ll/᩸᩷ܿ;

    .line 88
    invoke-virtual {v8}, Ll/᩸᩷ܿ;->ᩳ()I

    move-result v10

    invoke-virtual {v8}, Ll/᩸᩷ܿ;->᩵()I

    move-result v12

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v8, v15

    invoke-direct/range {v8 .. v14}, Ll/᩸᩷ܿ;-><init>(Ljava/lang/String;IIIII)V

    .line 87
    invoke-static {v3, v15, v5}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object v3

    .line 89
    :goto_1
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v7, v2, v4, v3}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v7

    .line 90
    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 91
    invoke-virtual {v7}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    .line 92
    :cond_4
    invoke-virtual {v7}, Ll/ۢۖܿ;->֫()I

    move-result v1

    const/high16 v2, 0x10000

    if-le v1, v2, :cond_5

    .line 93
    invoke-virtual {v7, v5, v2}, Ll/ۢۖܿ;->ۧ(II)Ll/ۢۖܿ;

    move-result-object v7

    .line 96
    :cond_5
    :goto_2
    new-instance v8, Ll/ۘܺܿ;

    new-instance v9, Ll/۬ۢܿ;

    invoke-direct {v9, v6, v7}, Ll/۬ۢܿ;-><init>(ILl/ۢۖܿ;)V

    const/4 v7, 0x0

    iget-object v2, v0, Ll/ۘܺܿ;->ܳ:Ll/۟᩺ᩳ;

    iget-object v3, v0, Ll/ۘܺܿ;->ᩳ:Ll/᩺ܺܿ;

    move-object v1, v8

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v9

    invoke-direct/range {v1 .. v7}, Ll/ۘܺܿ;-><init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;IILl/۬ۢܿ;Ll/۬ۢܿ;)V

    return-object v8

    :cond_6
    :goto_3
    const/4 v1, 0x0

    return-object v1
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩺ܺܿ;II)Z
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۘܺܿ;->ܳ:Ll/۟᩺ᩳ;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/ۘܺܿ;->ᩳ:Ll/᩺ܺܿ;

    if-ne p1, p2, :cond_0

    iget p1, p0, Ll/ۘܺܿ;->ۧ:I

    if-ne p1, p3, :cond_0

    iget p1, p0, Ll/ۘܺܿ;->ܿ:I

    if-ne p1, p4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
