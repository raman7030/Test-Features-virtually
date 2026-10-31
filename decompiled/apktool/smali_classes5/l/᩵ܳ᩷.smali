.class public final synthetic Ll/᩵ܳ᩷;
.super Ljava/lang/Object;
.source "I7RA"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܳ᩷;->᩸:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2ab84458

    sget v2, Ll/֡֡;->֫ۤܳ:I

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v4, "\u06da\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2e57

    const v6, -0x16744ef8

    xor-int/2addr v5, v6

    const v6, 0x26ebc4a8

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x5717

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_4

    goto/16 :goto_1

    .line 80
    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_4

    .line 6
    :sswitch_1
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u073a\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x247f

    const v6, 0x48200f19

    xor-int/2addr v5, v6

    const v6, 0x5d29e4b9

    goto :goto_0

    .line 100
    :sswitch_2
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-gez v4, :cond_b

    goto :goto_1

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto :goto_1

    .line 37
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 p1, 0x0

    return p1

    .line 110
    :sswitch_5
    invoke-static {v0}, Ll/ۘۗ;->᩵ۜۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩵ܳ᩷;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/۠ۛ֡;

    .line 107
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06eb\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7927

    const v6, -0x6589815d

    xor-int/2addr v5, v6

    const v6, -0x4c4341b5

    goto :goto_0

    .line 76
    :sswitch_7
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u0733\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7ac7

    const v6, 0x63cad317

    xor-int/2addr v5, v6

    const v6, 0x43e9cfb0

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a76\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3b43

    const v6, -0x35f9f4d

    xor-int/2addr v5, v6

    const v6, -0x77f859b0

    goto/16 :goto_0

    :goto_1
    const-string v4, "\u05a8\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4f8d

    const v6, 0x49c96d20    # 1650084.0f

    xor-int/2addr v5, v6

    const v6, -0x1b67cfef

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d9\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3785

    const v6, 0x591c7945

    xor-int/2addr v5, v6

    const v6, 0x5beb644

    goto/16 :goto_0

    .line 53
    :sswitch_9
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u1a7a\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2353

    const v6, -0x571017bb

    xor-int/2addr v5, v6

    const v6, -0x4570c383

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06da\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5403

    const v6, 0x7456fac4

    xor-int/2addr v5, v6

    const v6, 0x68d64a6a

    goto/16 :goto_0

    .line 77
    :sswitch_b
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_7

    :goto_2
    const-string v4, "\u05a8\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5fe5

    const v6, -0x47b89cc3

    xor-int/2addr v5, v6

    const v6, -0x6dee0b5b

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x57af

    const v6, -0x24769522

    xor-int/2addr v5, v6

    const v6, 0x6193f5db

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u1a79\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x500f

    const v6, 0x2eed8aea

    xor-int/2addr v5, v6

    const v6, 0x5fe69811

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06da\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3927

    const v6, -0x6a276cae

    xor-int/2addr v5, v6

    const v6, -0x55ebffc2

    goto/16 :goto_0

    .line 50
    :sswitch_d
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7c71

    const v6, 0x6bccec64

    xor-int/2addr v5, v6

    const v6, -0x68817de7

    goto/16 :goto_0

    .line 32
    :sswitch_e
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e8\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2b2b

    const v6, -0x50e320e4

    xor-int/2addr v5, v6

    const v6, 0x3baf6f76

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a76\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3007

    const v6, 0x40ef8681

    xor-int/2addr v5, v6

    const v6, 0x739da3f3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c57d417 -> :sswitch_8
        -0x729b2587 -> :sswitch_a
        -0x685ad761 -> :sswitch_3
        -0x5333d761 -> :sswitch_5
        -0x4d999d35 -> :sswitch_9
        -0x4cedddbf -> :sswitch_1
        -0x43d3c05a -> :sswitch_2
        -0x429dc3be -> :sswitch_b
        -0x41904ce2 -> :sswitch_a
        -0x3f504ee5 -> :sswitch_0
        -0x39e3395a -> :sswitch_c
        -0x27b96014 -> :sswitch_0
        -0x25b1c8fd -> :sswitch_e
        -0x1e33e3c4 -> :sswitch_b
        -0x13ad5fa0 -> :sswitch_6
        -0xda095b0 -> :sswitch_2
        -0x8a356f2 -> :sswitch_4
        -0x6e48fd2 -> :sswitch_8
        0x835c12b -> :sswitch_d
        0x1b016dc0 -> :sswitch_1
        0x2102e7c0 -> :sswitch_5
        0x40dabace -> :sswitch_3
        0x469b9814 -> :sswitch_7
        0x4fd9c3d0 -> :sswitch_4
        0x58d6e232 -> :sswitch_d
        0x5e3f0e4d -> :sswitch_9
        0x5e82ec85 -> :sswitch_6
        0x64f368a4 -> :sswitch_7
        0x7ade2866 -> :sswitch_e
        0x7b8a4c43 -> :sswitch_c
    .end sparse-switch
.end method
