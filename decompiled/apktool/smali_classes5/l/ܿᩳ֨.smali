.class public final Ll/ܿᩳ֨;
.super Ll/ۨܽ֨;
.source "I7DX"


# static fields
.field public static final synthetic ᩵ۧ:I


# instance fields
.field public ۖۧ:I

.field public ۘۧ:Ll/ᩳᩳ֨;

.field public ۜۧ:Ll/ۢ֫֨;

.field public ۡۧ:Ll/ܽܿ֨;

.field public ۢۧ:Ll/ܿܽ֨;

.field public ܺۧ:Ljava/util/ArrayList;

.field public ᩴۧ:Ll/ܽܿ֨;

.field public ᩷ۧ:I

.field public ᩻ۧ:Ll/ۖۧ֨;


# direct methods
.method public constructor <init>(Ll/᩷ۧ֨;)V
    .locals 2

    .line 77
    invoke-direct {p0, p1}, Ll/ۨܽ֨;-><init>(Ll/ۨܽ֨;)V

    const/4 v0, 0x0

    .line 160
    iput-object v0, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    .line 78
    sget-object v1, Ll/֨۟ۚ;->ܽ֫:Ll/֨۟ۚ;

    iput-object v1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    const-string v1, "MethodData"

    .line 79
    iput-object v1, p0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    .line 80
    iget-object p1, p1, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    .line 394
    iget p1, p1, Ll/ۢܽ֨;->᩶:I

    .line 398
    iput p1, p0, Ll/ۢܽ֨;->᩶:I

    .line 81
    iput-object v0, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 237
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ֫֨;

    .line 238
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩵()V

    const-string v1, ""

    const/4 v2, 0x3

    .line 387
    invoke-virtual {p0, v2, v1}, Ll/ۢܽ֨;->ᩳ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 238
    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 239
    sget-object v1, Ll/ۛܽ֨;->ۗ:Ll/ۛܽ֨;

    invoke-virtual {v0, v1}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->᩻(I)V

    invoke-virtual {v0}, Ll/ۜ֫֨;->ۧ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ۙ()Z
    .locals 4

    .line 163
    iget-object v0, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 164
    new-instance v0, Ll/ᩳᩳ֨;

    .line 165
    iget-object v2, p0, Ll/ܿᩳ֨;->ᩴۧ:Ll/ܽܿ֨;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ll/ܽܿ֨;->᩹()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 166
    :goto_0
    iget-object v3, p0, Ll/ܿᩳ֨;->ۡۧ:Ll/ܽܿ֨;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ll/ܽܿ֨;->᩹()I

    move-result v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-direct {v0, v2, v3}, Ll/ᩳᩳ֨;-><init>(II)V

    iput-object v0, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    .line 168
    :cond_2
    iget-object v0, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    .line 172
    invoke-virtual {v0}, Ll/ᩳᩳ֨;->֫()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 173
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_2

    :cond_3
    return v1

    :cond_4
    :goto_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final ֫(Ljava/io/DataInputStream;Ll/ۙ۬ۚ;I)Z
    .locals 12

    .line 89
    sget-object v0, Ll/ۧᩳ֨;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    return v2

    .line 112
    :pswitch_0
    iget-object p2, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast p2, Ll/᩷ۧ֨;

    invoke-static {p1, p2, v2}, Ll/۠֫֨;->֫(Ljava/io/DataInputStream;Ll/ۨܽ֨;Z)Ll/ۢ֫֨;

    move-result-object p1

    iput-object p1, p0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    return v3

    .line 103
    :pswitch_1
    sget-object p3, Ll/ۙ۬ۚ;->ᩴ֫:Ll/ۙ۬ۚ;

    if-ne p2, p3, :cond_0

    const/4 v2, 0x1

    .line 104
    :cond_0
    new-instance p2, Ll/ܽܿ֨;

    invoke-direct {p2, p0, v2}, Ll/ܽܿ֨;-><init>(Ll/ܿᩳ֨;Z)V

    .line 105
    invoke-virtual {p2, p1}, Ll/ܽܿ֨;->ۧ(Ljava/io/DataInputStream;)V

    if-eqz v2, :cond_1

    .line 107
    iput-object p2, p0, Ll/ܿᩳ֨;->ۡۧ:Ll/ܽܿ֨;

    return v3

    .line 109
    :cond_1
    iput-object p2, p0, Ll/ܿᩳ֨;->ᩴۧ:Ll/ܽܿ֨;

    return v3

    .line 139
    :pswitch_2
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result p2

    .line 140
    iget-object p3, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    new-instance v0, Ll/۟ܽ֨;

    invoke-direct {v0, p2, v2}, Ll/۟ܽ֨;-><init>(II)V

    invoke-virtual {p3, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 141
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p3, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_2

    .line 143
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    int-to-short v0, v0

    .line 144
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 145
    iget-object v5, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    .line 146
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    iget-object v8, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    new-instance v9, Ll/ۖۘܽ;

    const/16 v10, 0x8

    invoke-direct {v9, v10}, Ll/ۖۘܽ;-><init>(I)V

    .line 147
    invoke-virtual {v8, v0, v9}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v8

    .line 148
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    sget-object v10, Ll/᩶۬ۚ;->ۛ:Ll/᩶۬ۚ;

    invoke-static {v4, v10}, Ll/ۛ۬ۚ;->ۧ(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x5

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v6, v11, v2

    aput-object v7, v11, v3

    aput-object v8, v11, v1

    const/4 v6, 0x3

    aput-object v9, v11, v6

    const/4 v6, 0x4

    aput-object v10, v11, v6

    const-string v6, "()->MethodParameter[%d] = { name[%d]: \"%s\" modifiers[%d]: %s}"

    .line 19
    invoke-static {v6, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    .line 145
    invoke-virtual {v5, v6, v7}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v5, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    new-instance v6, Ll/ܽᩳ֨;

    .line 441
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 442
    iput v4, v6, Ll/ܽᩳ֨;->֫:I

    .line 443
    iput v0, v6, Ll/ܽᩳ֨;->ۧ:I

    .line 149
    invoke-virtual {v5, p3, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    return v3

    .line 100
    :pswitch_3
    new-instance p2, Ll/ܿܽ֨;

    iget-object v0, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v0, Ll/᩷ۧ֨;

    invoke-direct {p2, v0}, Ll/ܿܽ֨;-><init>(Ll/᩷ۧ֨;)V

    .line 26
    invoke-virtual {p2, p3, p1}, Ll/۟֫֨;->֫(ILjava/io/DataInputStream;)V

    .line 100
    iput-object p2, p0, Ll/ܿᩳ֨;->ۢۧ:Ll/ܿܽ֨;

    return v3

    .line 95
    :pswitch_4
    iget-object p2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    if-eqz p2, :cond_3

    .line 96
    iget-object p2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "Signature"

    aput-object v1, v0, v2

    const-string v1, "method_info"

    aput-object v1, v0, v3

    const-string v1, "There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used."

    invoke-virtual {p2, v1, v0}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :cond_3
    new-instance p2, Ll/ۜܿ֨;

    iget-object v0, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v0, Ll/᩷ۧ֨;

    invoke-direct {p2, v0}, Ll/ۜܿ֨;-><init>(Ll/᩷ۧ֨;)V

    invoke-virtual {p2, p3, p1}, Ll/ۜܿ֨;->֫(ILjava/io/DataInputStream;)V

    .line 121
    iput-object p2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    return v3

    .line 91
    :pswitch_5
    new-instance p2, Ll/ۖۧ֨;

    invoke-direct {p2, p0}, Ll/ۖۧ֨;-><init>(Ll/ܿᩳ֨;)V

    iput-object p2, p0, Ll/ܿᩳ֨;->᩻ۧ:Ll/ۖۧ֨;

    .line 92
    invoke-virtual {p2, p3, p1}, Ll/ۖۧ֨;->֫(ILjava/io/DataInputStream;)V

    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(II)V
    .locals 16

    move-object/from16 v0, p0

    .line 293
    iget-object v1, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    if-eqz v1, :cond_0

    .line 68
    iget-boolean v2, v1, Ll/ۢܽ֨;->۬:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 294
    invoke-virtual {v1}, Ll/ۢܽ֨;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 295
    :goto_1
    iget-object v3, v0, Ll/ܿᩳ֨;->ۢۧ:Ll/ܿܽ֨;

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 296
    :goto_2
    iget-object v4, v0, Ll/ܿᩳ֨;->᩻ۧ:Ll/ۖۧ֨;

    if-eqz v4, :cond_3

    goto :goto_3

    .line 298
    :cond_3
    invoke-direct/range {p0 .. p0}, Ll/ܿᩳ֨;->ۙ()Z

    move-result v4

    if-nez v4, :cond_5

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v4, 0x1

    :goto_4
    if-nez v4, :cond_6

    if-nez v1, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    if-lez p1, :cond_7

    .line 302
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    .line 396
    :cond_7
    iget-boolean v6, v0, Ll/ۢܽ֨;->ۘ֫:Z

    if-eqz v6, :cond_c

    .line 397
    iget v6, v0, Ll/ۨܽ֨;->ۙ֫:I

    invoke-static {v6}, Ll/ۛ۬ۚ;->۠(I)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    .line 398
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ۜ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " *  "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 276
    iget v8, v0, Ll/ۨܽ֨;->ۙ֫:I

    sget-object v9, Ll/᩶۬ۚ;->ۛ:Ll/᩶۬ۚ;

    invoke-static {v8, v9}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v8

    .line 278
    invoke-virtual/range {p0 .. p0}, Ll/ۨܽ֨;->᩸()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 400
    iget-object v10, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ll/ۜܿ֨;->۫()Ll/ۡܳ֨;

    move-result-object v10

    goto :goto_6

    .line 401
    :cond_8
    new-instance v10, Ll/ۧܳ֨;

    iget-object v11, v0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v11, v0, Ll/ܿᩳ֨;->᩷ۧ:I

    .line 47
    invoke-direct {v10, v11}, Ll/֫ܳ֨;-><init>(I)V

    .line 401
    iget-object v11, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v10, v11}, Ll/ۧܳ֨;->֫(Ll/ۤۧ֨;)Ll/ۡܳ֨;

    move-result-object v10

    .line 402
    :goto_6
    iget-object v11, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v11, Ll/᩷ۧ֨;

    iget-object v11, v11, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v12, v0, Ll/ܿᩳ֨;->ۖۧ:I

    sget-object v14, Ll/ۤۧ֨;->۟֫:Ll/ۛۚۢ;

    invoke-virtual {v11, v12, v14}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "<init>"

    .line 403
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    .line 404
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    .line 405
    instance-of v13, v10, Ll/ܳܳ֨;

    if-eqz v13, :cond_9

    check-cast v10, Ll/ܳܳ֨;

    .line 406
    iget-object v10, v10, Ll/ܳܳ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/2addr v6, v10

    :cond_9
    if-eqz v12, :cond_a

    .line 410
    iget-object v10, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v10, Ll/᩷ۧ֨;

    .line 376
    iget-object v11, v10, Ll/᩷ۧ֨;->ܺۧ:Ljava/lang/String;

    const-string v10, "("

    .line 411
    invoke-virtual {v15, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v15, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v15

    const/4 v10, 0x0

    goto :goto_7

    :cond_a
    const/16 v10, 0x28

    .line 413
    invoke-virtual {v15, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    :goto_7
    const/4 v12, 0x0

    .line 415
    invoke-virtual {v15, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 416
    invoke-virtual {v15, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "/"

    const-string v12, "."

    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 417
    iget-object v11, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v11, Ll/᩷ۧ֨;

    iget-object v11, v11, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v12, v0, Ll/ܿᩳ֨;->᩷ۧ:I

    invoke-virtual {v11, v12, v14}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "/**"

    .line 419
    invoke-virtual {v0, v12}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    .line 420
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 421
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ۜ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 422
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "descriptor: "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 423
    iget-object v8, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    if-eqz v8, :cond_b

    const-string v8, "signature:  "

    .line 0
    invoke-static {v7, v8}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 424
    iget-object v10, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v10, Ll/᩷ۧ֨;

    iget-object v10, v10, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget-object v11, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {v11}, Ll/ۜܿ֨;->ۙ()I

    move-result v11

    invoke-virtual {v10, v11, v14}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 0
    :cond_b
    invoke-static {v7}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 426
    iget v10, v0, Ll/ۨܽ֨;->ۙ֫:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget v11, v0, Ll/ۨܽ֨;->ۙ֫:I

    invoke-static {v11, v9}, Ll/ۛ۬ۚ;->ۧ(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v10, v11, v12

    const/4 v10, 0x1

    aput-object v9, v11, v10

    const-string v9, "flags: (0x%04x) %s"

    .line 19
    invoke-static {v9, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 426
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 427
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Ll/ܿᩳ֨;->᩻ۧ:Ll/ۖۧ֨;

    iget v7, v7, Ll/ۖۧ֨;->ۚۧ:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v9, v0, Ll/ܿᩳ֨;->᩻ۧ:Ll/ۖۧ֨;

    iget v9, v9, Ll/ۖۧ֨;->֡ۧ:I

    .line 428
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v10, 0x3

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v7, v10, v11

    const/4 v7, 0x1

    aput-object v9, v10, v7

    const/4 v9, 0x2

    aput-object v6, v10, v9

    const-string v6, "stack: %d, locals: %d, args_size: %d"

    .line 19
    invoke-static {v6, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 427
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    const-string v6, " */"

    .line 429
    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_c
    const/4 v13, 0x1

    .line 305
    iget-object v6, v0, Ll/ۨܽ֨;->ܿۧ:Ljava/util/ArrayList;

    iget-object v7, v0, Ll/ۨܽ֨;->ۨ֫:Ljava/util/ArrayList;

    const/4 v8, 0x2

    new-array v9, v8, [Ljava/util/List;

    const/4 v10, 0x0

    aput-object v6, v9, v10

    aput-object v7, v9, v13

    invoke-virtual {v0, v9}, Ll/ۨܽ֨;->֫([Ljava/util/List;)V

    .line 306
    iget-object v6, v0, Ll/ۨܽ֨;->ܳۧ:Ljava/util/ArrayList;

    iget-object v7, v0, Ll/ۨܽ֨;->᩺֫:Ljava/util/ArrayList;

    new-array v8, v8, [Ljava/util/List;

    aput-object v6, v8, v10

    aput-object v7, v8, v13

    invoke-virtual {v0, v8}, Ll/ۨܽ֨;->֫([Ljava/util/List;)V

    .line 276
    iget v6, v0, Ll/ۨܽ֨;->ۙ֫:I

    sget-object v7, Ll/᩶۬ۚ;->ۛ:Ll/᩶۬ۚ;

    invoke-static {v6, v7}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v6

    .line 278
    invoke-virtual/range {p0 .. p0}, Ll/ۨܽ֨;->᩸()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 308
    sget-object v7, Ll/ܶۨۚ;->᩵ᩳ:Ll/ܶۨۚ;

    invoke-virtual {v7}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 309
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    sget-object v8, Ll/֨۟ۚ;->ۜ֫:Ll/֨۟ۚ;

    invoke-virtual {v8}, Ll/֨۟ۚ;->᩻()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    add-int/2addr v9, v8

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v0, v7, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 310
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v8

    sub-int/2addr v7, v8

    if-eqz v2, :cond_d

    .line 313
    iget-object v2, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    new-instance v8, Ll/᩺ܽ֨;

    invoke-direct {v8, v0}, Ll/᩺ܽ֨;-><init>(Ll/ܿᩳ֨;)V

    invoke-virtual {v2, v8}, Ll/ۜܿ֨;->֫(Ljava/util/function/Function;)Ll/ۜۗۚ;

    move-result-object v2

    goto :goto_8

    .line 314
    :cond_d
    new-instance v2, Ll/ۜۗۚ;

    const-string v8, ""

    invoke-direct {v2, v8, v8}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    :goto_8
    iget-boolean v8, v0, Ll/ۢܽ֨;->֫֫:Z

    const-string v9, ":"

    const-string v10, ";"

    if-eqz v8, :cond_14

    .line 318
    iget v8, v0, Ll/ܿᩳ֨;->ۖۧ:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v11, v0, Ll/ܿᩳ֨;->᩷ۧ:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v8, v12, v14

    aput-object v11, v12, v13

    const-string v8, "#%d:#%d"

    .line 19
    invoke-static {v8, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 318
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v8, v2, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v5, :cond_f

    .line 177
    iget-object v5, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    if-eqz v5, :cond_e

    goto :goto_9

    .line 320
    :cond_e
    invoke-virtual {v6, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 322
    :cond_f
    :goto_9
    iget-boolean v5, v0, Ll/ۢܽ֨;->ܺ֫:Z

    if-eqz v5, :cond_11

    .line 323
    iget-object v2, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    if-eqz v2, :cond_10

    .line 394
    iget v2, v0, Ll/ۢܽ֨;->᩶:I

    .line 324
    invoke-virtual {v0, v2, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    goto/16 :goto_d

    .line 326
    :cond_10
    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    goto/16 :goto_d

    .line 394
    :cond_11
    iget v5, v0, Ll/ۢܽ֨;->᩶:I

    .line 329
    invoke-virtual {v0, v5, v6}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    .line 330
    iget-object v5, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    if-eqz v5, :cond_12

    const-string v5, " /* "

    goto :goto_a

    :cond_12
    const-string v5, " // "

    :goto_a
    iget-object v6, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v6, Ll/᩷ۧ֨;

    iget-object v6, v6, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v8, v0, Ll/ܿᩳ֨;->ۖۧ:I

    .line 331
    invoke-virtual {v6, v8}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v6

    iget-object v8, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v8, Ll/᩷ۧ֨;

    iget-object v8, v8, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v11, v0, Ll/ܿᩳ֨;->᩷ۧ:I

    invoke-virtual {v8, v11}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v8

    .line 19
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 331
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v2, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .line 332
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 333
    iget-object v5, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    if-eqz v5, :cond_13

    const-string v5, " */ "

    goto :goto_b

    :cond_13
    const-string v5, " "

    :goto_b
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 334
    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    goto :goto_d

    .line 337
    :cond_14
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v11, Ll/᩷ۧ֨;

    iget-object v11, v11, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v12, v0, Ll/ܿᩳ֨;->ۖۧ:I

    invoke-virtual {v11, v12}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v8, v0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v8, Ll/᩷ۧ֨;

    iget-object v8, v8, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v9, v0, Ll/ܿᩳ֨;->᩷ۧ:I

    .line 338
    invoke-virtual {v8, v9}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v2, v2, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .line 339
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v5, :cond_16

    .line 177
    iget-object v5, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    if-eqz v5, :cond_15

    goto :goto_c

    .line 341
    :cond_15
    invoke-virtual {v2, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 343
    :cond_16
    :goto_c
    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    .line 177
    :goto_d
    iget-object v2, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    if-eqz v2, :cond_18

    const/4 v5, 0x1

    .line 260
    invoke-virtual {v2, v5}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 350
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v6

    sub-int/2addr v5, v6

    .line 398
    iput v5, v2, Ll/ۢܽ֨;->᩶:I

    .line 351
    iget-object v2, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    sget-object v5, Ll/ۛܽ֨;->᩶:Ll/ۛܽ֨;

    invoke-virtual {v2, v5}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    .line 352
    iget-object v2, v0, Ll/ܿᩳ֨;->ۜۧ:Ll/ۢ֫֨;

    invoke-virtual {v2}, Ll/ۢ֫֨;->ۧ()V

    if-nez v4, :cond_18

    if-nez v1, :cond_17

    goto :goto_e

    :cond_17
    const-string v10, ","

    .line 355
    :goto_e
    invoke-virtual {v0, v10}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    :cond_18
    if-eqz v1, :cond_19

    .line 361
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    .line 362
    iget-object v1, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {v1}, Ll/ۜܿ֨;->᩹()V

    invoke-virtual {v1, v7}, Ll/ۜܿ֨;->ۡ(I)V

    const/4 v2, 0x1

    .line 260
    invoke-virtual {v1, v2}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 394
    iget v4, v0, Ll/ۢܽ֨;->᩶:I

    .line 363
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v5

    sub-int/2addr v4, v5

    .line 398
    iput v4, v1, Ll/ۢܽ֨;->᩶:I

    .line 364
    iget-object v1, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Ll/ۜܿ֨;->֫(Z)V

    .line 365
    iget-object v1, v0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {v1}, Ll/ۢܽ֨;->ۧ()V

    goto :goto_f

    :cond_19
    const/4 v2, 0x1

    .line 369
    :goto_f
    iget-object v1, v0, Ll/ܿᩳ֨;->ۢۧ:Ll/ܿܽ֨;

    if-eqz v1, :cond_1a

    .line 370
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    .line 371
    iget-object v1, v0, Ll/ܿᩳ֨;->ۢۧ:Ll/ܿܽ֨;

    invoke-virtual {v1, v7}, Ll/ܿܽ֨;->ۡ(I)V

    .line 260
    invoke-virtual {v1, v2}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 394
    iget v2, v0, Ll/ۢܽ֨;->᩶:I

    .line 371
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v3

    sub-int/2addr v2, v3

    .line 398
    iput v2, v1, Ll/ۢܽ֨;->᩶:I

    .line 372
    iget-object v1, v0, Ll/ܿᩳ֨;->ۢۧ:Ll/ܿܽ֨;

    invoke-virtual {v1}, Ll/ۢܽ֨;->ۧ()V

    goto :goto_10

    .line 374
    :cond_1a
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    .line 377
    :goto_10
    iget-object v1, v0, Ll/ܿᩳ֨;->᩻ۧ:Ll/ۖۧ֨;

    if-eqz v1, :cond_1b

    .line 394
    iget v2, v0, Ll/ۢܽ֨;->᩶:I

    .line 398
    iput v2, v1, Ll/ۢܽ֨;->᩶:I

    .line 379
    invoke-virtual {v1}, Ll/ۖۧ֨;->ۧ()V

    return-void

    .line 381
    :cond_1b
    invoke-direct/range {p0 .. p0}, Ll/ܿᩳ֨;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 382
    invoke-virtual/range {p0 .. p0}, Ll/ܿᩳ֨;->᩹()V

    :cond_1c
    return-void
.end method

.method public final ᩳ(II)V
    .locals 0

    .line 390
    invoke-virtual {p0, p1, p2}, Ll/ܿᩳ֨;->ۧ(II)V

    return-void
.end method

.method public final ᩹()V
    .locals 12

    .line 186
    invoke-direct {p0}, Ll/ܿᩳ֨;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    .line 260
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 188
    iget-boolean v1, p0, Ll/ۢܽ֨;->ۢ֫:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x7

    goto :goto_0

    :cond_0
    const/4 v1, 0x5

    .line 189
    :goto_0
    iget-object v2, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 190
    :goto_1
    iget-object v4, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    invoke-virtual {v4}, Ll/ᩳᩳ֨;->ܽ()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 191
    iget-object v4, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    invoke-virtual {v4}, Ll/ᩳᩳ֨;->ᩳ()I

    move-result v4

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 245
    new-array v4, v2, [Ljava/lang/String;

    .line 246
    iget-object v5, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v2, :cond_6

    .line 248
    iget-object v6, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽᩳ֨;

    .line 250
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Ll/ܶۨۚ;->ܿܿ:Ll/ܶۨۚ;

    const-string v9, "{ "

    .line 0
    invoke-static {v8, v7, v9}, Ll/᩸ܳۡ;->֫(Ll/ܶۨۚ;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 250
    aput-object v7, v4, v5

    .line 251
    iget-boolean v7, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v7, :cond_3

    .line 252
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v8, v4, v5

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, v6, Ll/ܽᩳ֨;->ۧ:I

    iget v6, v6, Ll/ܽᩳ֨;->֫:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v10, v0, [Ljava/lang/Object;

    aput-object v9, v10, v3

    const-string v9, "#%d "

    .line 19
    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 252
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    .line 253
    iget-boolean v7, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-nez v7, :cond_2

    if-eqz v8, :cond_2

    .line 254
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v9, v4, v5

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v9, Ll/᩷ۧ֨;

    iget-object v9, v9, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    new-instance v10, Ll/ۗۛܽ;

    const/4 v11, 0x6

    invoke-direct {v10, v11}, Ll/ۗۛܽ;-><init>(I)V

    invoke-virtual {v9, v8, v10}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v8

    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "/* "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " */ "

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 254
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    :cond_2
    if-eqz v6, :cond_5

    .line 257
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v8, v4, v5

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v8, Ll/᩶۬ۚ;->ۨ:Ll/᩶۬ۚ;

    invoke-static {v6, v8}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    goto :goto_4

    .line 260
    :cond_3
    iget v7, v6, Ll/ܽᩳ֨;->ۧ:I

    iget v8, v6, Ll/ܽᩳ֨;->֫:I

    if-eqz v7, :cond_4

    .line 261
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v9, v4, v5

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v9, Ll/᩷ۧ֨;

    iget-object v9, v9, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v6, v6, Ll/ܽᩳ֨;->ۧ:I

    new-instance v10, Ll/֫ᩳ֨;

    invoke-direct {v10, v3}, Ll/֫ᩳ֨;-><init>(I)V

    invoke-virtual {v9, v6, v10}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    goto :goto_3

    .line 263
    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v7, v4, v5

    const-string v9, "#0 "

    .line 0
    invoke-static {v6, v7, v9}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 263
    aput-object v6, v4, v5

    :goto_3
    if-eqz v8, :cond_5

    .line 266
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v7, v4, v5

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Ll/᩶۬ۚ;->ۨ:Ll/᩶۬ۚ;

    invoke-static {v8, v7}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    .line 269
    :cond_5
    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v7, v4, v5

    const-string v8, "}"

    .line 0
    invoke-static {v6, v7, v8}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 269
    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    :cond_6
    const/4 v5, 0x0

    :goto_5
    if-ge v5, v2, :cond_f

    .line 197
    iget-object v6, p0, Ll/ܿᩳ֨;->ᩴۧ:Ll/ܽܿ֨;

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    iget-object v6, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    invoke-virtual {v6}, Ll/ᩳᩳ֨;->ᩳ()I

    move-result v6

    if-ge v5, v6, :cond_7

    .line 198
    iget-object v6, p0, Ll/ܿᩳ֨;->ᩴۧ:Ll/ܽܿ֨;

    invoke-virtual {v6, v5}, Ll/ܽܿ֨;->get(I)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_6

    :cond_7
    move-object v6, v7

    .line 201
    :goto_6
    iget-object v8, p0, Ll/ܿᩳ֨;->ۡۧ:Ll/ܽܿ֨;

    if-eqz v8, :cond_8

    iget-object v8, p0, Ll/ܿᩳ֨;->ۘۧ:Ll/ᩳᩳ֨;

    invoke-virtual {v8}, Ll/ᩳᩳ֨;->ܽ()I

    move-result v8

    if-ge v5, v8, :cond_8

    .line 202
    iget-object v8, p0, Ll/ܿᩳ֨;->ۡۧ:Ll/ܽܿ֨;

    invoke-virtual {v8, v5}, Ll/ܽܿ֨;->get(I)Ljava/util/ArrayList;

    move-result-object v8

    goto :goto_7

    :cond_8
    move-object v8, v7

    .line 204
    :goto_7
    iget-object v9, p0, Ll/ܿᩳ֨;->ܺۧ:Ljava/util/ArrayList;

    if-eqz v9, :cond_9

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽᩳ֨;

    :cond_9
    if-nez v6, :cond_b

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_a
    const/4 v9, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    const/4 v9, 0x1

    :goto_9
    if-nez v7, :cond_c

    if-eqz v9, :cond_e

    .line 210
    :cond_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v10, v0, [Ljava/lang/Object;

    aput-object v9, v10, v3

    const-string v9, "%2d: "

    .line 19
    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 210
    invoke-virtual {p0, v1, v9}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    if-eqz v7, :cond_d

    .line 214
    aget-object v7, v4, v5

    const/4 v9, 0x3

    invoke-virtual {p0, v9, v7}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    .line 218
    :cond_d
    invoke-direct {p0, v6}, Ll/ܿᩳ֨;->֫(Ljava/util/ArrayList;)V

    .line 221
    invoke-direct {p0, v8}, Ll/ܿᩳ֨;->֫(Ljava/util/ArrayList;)V

    .line 224
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩵()V

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 264
    :cond_f
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(I)V

    :cond_10
    return-void
.end method
