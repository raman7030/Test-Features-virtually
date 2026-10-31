.class public final Ll/֨۫ۢ;
.super Ljava/lang/Object;
.source "Z6RB"

# interfaces
.implements Ll/ۚܳ֡;


# instance fields
.field public final ֫:Ll/ᩴ۫ۢ;

.field public final ۧ:Ll/֡ۙۢ;

.field public ܽ:[I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/֡ۙۢ;Ll/ᩴ۫ۢ;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/֨۫ۢ;->ۧ:Ll/֡ۙۢ;

    .line 22
    iput-object p2, p0, Ll/֨۫ۢ;->֫:Ll/ᩴ۫ۢ;

    return-void
.end method

.method public static ֫(Ll/֨۫ۢ;I)I
    .locals 7

    .line 47
    iget-object v0, p0, Ll/֨۫ۢ;->֫:Ll/ᩴ۫ۢ;

    iget-object v1, p0, Ll/֨۫ۢ;->ܽ:[I

    if-nez v1, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 50
    :goto_0
    invoke-virtual {v0}, Ll/ᩴ۫ۢ;->size()I

    move-result v5

    const/16 v6, 0xa

    if-ge v3, v5, :cond_2

    and-int/lit16 v5, v3, 0x3ff

    if-nez v5, :cond_0

    .line 51
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 52
    :cond_0
    invoke-virtual {v0, v3}, Ll/ᩴ۫ۢ;->ᩳ(I)C

    move-result v5

    if-ne v5, v6, :cond_1

    add-int/lit8 v4, v4, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 54
    :cond_2
    new-array v3, v4, [I

    .line 56
    :goto_1
    invoke-virtual {v0}, Ll/ᩴ۫ۢ;->size()I

    move-result v4

    if-ge v1, v4, :cond_5

    and-int/lit16 v4, v1, 0x3ff

    if-nez v4, :cond_3

    .line 57
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 58
    :cond_3
    invoke-virtual {v0, v1}, Ll/ᩴ۫ۢ;->ᩳ(I)C

    move-result v4

    if-ne v4, v6, :cond_4

    add-int/lit8 v4, v2, 0x1

    add-int/lit8 v5, v1, 0x1

    aput v5, v3, v2

    move v2, v4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 60
    :cond_5
    iput-object v3, p0, Ll/֨۫ۢ;->ܽ:[I

    .line 62
    :cond_6
    iget-object p0, p0, Ll/֨۫ۢ;->ܽ:[I

    invoke-static {p0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p0

    if-ltz p0, :cond_7

    return p0

    :cond_7
    neg-int p0, p0

    add-int/lit8 p0, p0, -0x2

    return p0
.end method

.method public static bridge synthetic ֫(Ll/֨۫ۢ;)Ll/ᩴ۫ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨۫ۢ;->֫:Ll/ᩴ۫ۢ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֨۫ۢ;)Ll/֨ܳ֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨۫ۢ;->ۧ:Ll/֡ۙۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֨۫ۢ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨۫ۢ;->ܽ:[I

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p4

    .line 29
    iget-object v3, v0, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    iget-object v4, v6, Ll/֨۫ۢ;->ۧ:Ll/֡ۙۢ;

    sget-object v7, Ll/۟ܿ֡;->֫:Ll/۟ܿ֡;

    if-ne v3, v4, :cond_3

    iget-object v3, v0, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    iget-object v4, v6, Ll/֨۫ۢ;->֫:Ll/ᩴ۫ۢ;

    if-ne v3, v4, :cond_3

    if-gez p5, :cond_0

    goto :goto_1

    .line 32
    :cond_0
    iget v4, v6, Ll/֨۫ۢ;->ᩳ:I

    add-int/lit8 v3, v4, 0x1

    iput v3, v6, Ll/֨۫ۢ;->ᩳ:I

    if-nez p3, :cond_2

    if-ltz v2, :cond_2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_2

    const/4 v3, -0x1

    if-lt v1, v3, :cond_2

    const v3, 0x3fffffff    # 1.9999999f

    if-le v1, v3, :cond_1

    goto :goto_0

    .line 38
    :cond_1
    new-instance v7, Ll/ۚ۫ۢ;

    shl-int/lit8 v0, v1, 0x1

    or-int v5, v0, v2

    move-object v0, v7

    move-object/from16 v1, p0

    move/from16 v2, p5

    move/from16 v3, p6

    invoke-direct/range {v0 .. v5}, Ll/ۚ۫ۢ;-><init>(Ll/֨۫ۢ;IIII)V

    return-object v7

    :cond_2
    :goto_0
    move-object/from16 v8, p1

    move/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    move/from16 v13, p6

    move/from16 v14, p7

    move/from16 v15, p8

    .line 34
    invoke-virtual/range {v7 .. v15}, Ll/۟ܿ֡;->֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;

    move-result-object v0

    .line 35
    move-object v1, v0

    check-cast v1, Ll/ܰܿ֡;

    invoke-virtual {v1, v4}, Ll/ܰܿ֡;->ܳ(I)V

    return-object v0

    :cond_3
    :goto_1
    move-object/from16 v8, p1

    move/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    move/from16 v13, p6

    move/from16 v14, p7

    move/from16 v15, p8

    .line 30
    invoke-virtual/range {v7 .. v15}, Ll/۟ܿ֡;->֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;

    move-result-object v0

    return-object v0
.end method
