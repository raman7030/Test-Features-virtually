.class public final Ll/ܺ۫ۢ;
.super Ljava/lang/Object;
.source "F6OD"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Ll/֡۫ۢ;

.field public final ۡ:Ljava/lang/String;

.field public final ۢ:Ll/ᩴ᩷ܿ;

.field public ۧ:I

.field public final ܳ:Z

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public final ᩷:Ljava/lang/String;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/֡۫ۢ;Ll/ۗ᩶ۢ;Ll/᩵ۙۢ;ZLl/ᩴ᩷ܿ;)V
    .locals 5

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 19
    iput v0, p0, Ll/ܺ۫ۢ;->ܿ:I

    .line 20
    iput v0, p0, Ll/ܺ۫ۢ;->ᩳ:I

    .line 25
    iput-object p1, p0, Ll/ܺ۫ۢ;->ۜ:Ll/֡۫ۢ;

    .line 26
    iput-boolean p4, p0, Ll/ܺ۫ۢ;->ܳ:Z

    .line 27
    invoke-virtual {p2}, Ll/ۗ᩶ۢ;->ۧ()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string p2, "\t"

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ll/ۗ᩶ۢ;->֫()I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-ltz p2, :cond_b

    if-eqz p2, :cond_4

    const-string v0, " "

    if-ne p2, v1, :cond_1

    move-object p2, v0

    goto :goto_1

    :cond_1
    const v3, 0x7fffffff

    .line 0
    div-int/2addr v3, p2

    if-gt v1, v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p2, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    const-string p3, "Repeating 1 bytes String "

    const-string p4, " times will produce a String exceeding maximum size."

    invoke-static {p2, p3, p4}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p2, ""

    .line 27
    :goto_1
    iput-object p2, p0, Ll/ܺ۫ۢ;->ۡ:Ljava/lang/String;

    .line 28
    invoke-virtual {p3}, Ll/᩵ۙۢ;->֫()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ܺ۫ۢ;->֫:Ljava/lang/String;

    const-string p2, "\n"

    if-eqz p4, :cond_5

    goto :goto_3

    .line 29
    :cond_5
    invoke-virtual {p3}, Ll/᩵ۙۢ;->ۧ()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_9

    .line 30
    iget-object p1, p1, Ll/֡۫ۢ;->ۢ:Ljava/lang/CharSequence;

    .line 178
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge v2, p3, :cond_a

    .line 179
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    const/16 p4, 0xa

    if-ne p3, p4, :cond_6

    goto :goto_3

    :cond_6
    const/16 v0, 0xd

    if-ne p3, v0, :cond_8

    add-int/2addr v2, v1

    .line 181
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ge v2, p2, :cond_7

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    if-ne p1, p4, :cond_7

    const-string p2, "\r\n"

    goto :goto_3

    :cond_7
    const-string p2, "\r"

    goto :goto_3

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 30
    :cond_9
    invoke-virtual {p3}, Ll/᩵ۙۢ;->ۧ()Ljava/lang/String;

    move-result-object p2

    :cond_a
    :goto_3
    iput-object p2, p0, Ll/ܺ۫ۢ;->᩷:Ljava/lang/String;

    .line 31
    iput-object p5, p0, Ll/ܺ۫ۢ;->ۢ:Ll/ᩴ᩷ܿ;

    return-void

    .line 0
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "count is negative: "

    invoke-static {p2, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(I)V
    .locals 6

    .line 191
    iget-object v0, p0, Ll/ܺ۫ۢ;->᩷:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺ۫ۢ;->ۢ:Ll/ᩴ᩷ܿ;

    invoke-virtual {v1, v0}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 192
    iget-boolean v0, p0, Ll/ܺ۫ۢ;->ܳ:Z

    if-nez v0, :cond_6

    .line 193
    iget-object v0, p0, Ll/ܺ۫ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    const/4 v0, 0x0

    .line 194
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    if-ltz p1, :cond_5

    .line 0
    iget-object v2, p0, Ll/ܺ۫ۢ;->ۡ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz p1, :cond_4

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    if-ne p1, v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const v5, 0x7fffffff

    div-int/2addr v5, p1

    if-gt v4, v5, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    mul-int v3, v3, p1

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    if-ge v0, p1, :cond_2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/OutOfMemoryError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Repeating "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes String "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " times will produce a String exceeding maximum size."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    const-string v2, ""

    .line 194
    :goto_2
    invoke-virtual {v1, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    .line 0
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "count is negative: "

    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    return-void
.end method

.method private ۧ()V
    .locals 4

    .line 171
    iget-object v0, p0, Ll/ܺ۫ۢ;->ۢ:Ll/ᩴ᩷ܿ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 172
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_0

    const/16 v3, 0x9

    if-eq v1, v3, :cond_0

    const/16 v3, 0xa

    if-eq v1, v3, :cond_0

    const/16 v3, 0xd

    if-eq v1, v3, :cond_0

    .line 173
    invoke-virtual {v0, v2}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 24

    move-object/from16 v0, p0

    .line 35
    iget-object v1, v0, Ll/ܺ۫ۢ;->ۜ:Ll/֡۫ۢ;

    iget-object v2, v1, Ll/֡۫ۢ;->ۢ:Ljava/lang/CharSequence;

    iget-object v3, v1, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 38
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v5, v8, :cond_52

    .line 39
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 40
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ܳ֡;

    .line 41
    iget v9, v0, Ll/ܺ۫ۢ;->᩻:I

    iget-object v10, v1, Ll/֡۫ۢ;->ܿ:[I

    aget v10, v10, v5

    add-int/2addr v9, v10

    iput v9, v0, Ll/ܺ۫ۢ;->᩻:I

    .line 42
    invoke-interface {v8}, Ll/֡ܳ֡;->getType()I

    move-result v9

    const/16 v10, 0x8d

    if-ne v9, v10, :cond_0

    goto/16 :goto_5

    .line 44
    :cond_0
    invoke-interface {v8}, Ll/֡ܳ֡;->ᩳ()I

    move-result v10

    .line 45
    invoke-static {v6, v10, v2}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    const/4 v11, -0x1

    const/16 v12, 0x10

    .line 46
    iget-object v13, v0, Ll/ܺ۫ۢ;->ۢ:Ll/ᩴ᩷ܿ;

    if-ne v9, v11, :cond_1

    .line 47
    invoke-virtual {v1, v5, v12}, Ll/֡۫ۢ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_52

    invoke-virtual {v13, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    :cond_1
    const/16 v11, 0x8

    .line 50
    iget-boolean v12, v0, Ll/ܺ۫ۢ;->ܳ:Z

    const/4 v14, 0x1

    if-eqz v12, :cond_2

    invoke-virtual {v1, v5, v11}, Ll/֡۫ۢ;->֫(II)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 51
    invoke-static {v6}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result v6

    or-int/2addr v7, v6

    .line 52
    invoke-interface {v8}, Ll/֡ܳ֡;->ܿ()I

    move-result v6

    add-int/2addr v6, v14

    goto/16 :goto_5

    :cond_2
    const/4 v11, 0x3

    const/4 v15, 0x4

    if-eq v9, v11, :cond_4

    if-eq v9, v15, :cond_4

    if-eq v9, v14, :cond_4

    const/4 v11, 0x2

    if-ne v9, v11, :cond_3

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v11, 0x1

    :goto_2
    if-eqz v12, :cond_9

    if-eqz v11, :cond_9

    const/16 v14, 0x10

    .line 57
    invoke-virtual {v1, v5, v14}, Ll/֡۫ۢ;->֫(II)Z

    move-result v14

    if-nez v14, :cond_9

    invoke-interface {v8}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v14

    const-string v15, "#!"

    .line 164
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "/*!"

    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "///"

    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "@license"

    .line 165
    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "@preserve"

    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "@copyright"

    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "@ts-"

    .line 166
    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "#__PURE__"

    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "@__PURE__"

    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "sourceURL="

    .line 167
    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_5

    goto :goto_6

    :cond_5
    const/16 v9, 0x20

    .line 58
    invoke-virtual {v1, v5, v9}, Ll/֡۫ۢ;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 187
    iget v9, v0, Ll/ܺ۫ۢ;->᩻:I

    invoke-direct {v0, v9}, Ll/ܺ۫ۢ;->֫(I)V

    .line 59
    :cond_6
    invoke-static {v6}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 60
    invoke-interface {v8}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v6, 0x1

    :goto_4
    or-int/2addr v7, v6

    .line 61
    invoke-interface {v8}, Ll/֡ܳ֡;->ܿ()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    :goto_5
    move-object/from16 v21, v3

    move-object v3, v1

    goto/16 :goto_1e

    :cond_9
    :goto_6
    if-nez v4, :cond_b

    const/16 v4, 0x10

    .line 65
    invoke-virtual {v1, v5, v4}, Ll/֡۫ۢ;->֫(II)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v13, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_d

    :cond_a
    if-nez v12, :cond_1a

    .line 66
    iget-object v4, v0, Ll/ܺ۫ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v13, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_d

    :cond_b
    const/16 v14, 0x10

    .line 67
    invoke-virtual {v1, v5, v14}, Ll/֡۫ۢ;->֫(II)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 68
    invoke-virtual {v13, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_d

    :cond_c
    const/16 v14, 0x40

    .line 69
    invoke-virtual {v1, v5, v14}, Ll/֡۫ۢ;->֫(II)Z

    move-result v14

    if-eqz v14, :cond_d

    .line 70
    invoke-virtual {v13, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_d

    :cond_d
    if-nez v7, :cond_f

    .line 72
    invoke-static {v6}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_7

    :cond_e
    const/4 v6, 0x0

    goto :goto_8

    :cond_f
    :goto_7
    const/4 v6, 0x1

    .line 73
    :goto_8
    invoke-interface {v4}, Ll/֡ܳ֡;->getType()I

    move-result v7

    const/4 v14, 0x3

    if-eq v7, v14, :cond_4e

    const/4 v14, 0x1

    if-eq v7, v14, :cond_4e

    const/4 v14, 0x2

    if-ne v7, v14, :cond_10

    goto/16 :goto_1b

    :cond_10
    if-nez v12, :cond_19

    if-eqz v11, :cond_19

    const/4 v4, 0x4

    if-ne v9, v4, :cond_17

    .line 98
    iget v4, v0, Ll/ܺ۫ۢ;->ܿ:I

    if-lt v5, v4, :cond_12

    .line 99
    invoke-virtual {v1, v5}, Ll/֡۫ۢ;->ܽ(I)I

    move-result v4

    iput v4, v0, Ll/ܺ۫ۢ;->ᩳ:I

    .line 100
    invoke-virtual {v1, v5}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v4

    iput v4, v0, Ll/ܺ۫ۢ;->ܿ:I

    .line 101
    iget v4, v0, Ll/ܺ۫ۢ;->᩻:I

    add-int/lit8 v7, v5, 0x1

    .line 102
    :goto_9
    iget v11, v0, Ll/ܺ۫ۢ;->ܿ:I

    if-gt v7, v11, :cond_11

    iget-object v11, v1, Ll/֡۫ۢ;->ܿ:[I

    aget v11, v11, v7

    add-int/2addr v4, v11

    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    .line 104
    :cond_11
    iget v7, v0, Ll/ܺ۫ۢ;->ᩳ:I

    invoke-virtual {v1, v7, v11}, Ll/֡۫ۢ;->ۧ(II)Z

    move-result v7

    iput-boolean v7, v0, Ll/ܺ۫ۢ;->ܽ:Z

    .line 106
    iget v7, v0, Ll/ܺ۫ۢ;->᩻:I

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v0, Ll/ܺ۫ۢ;->ۧ:I

    .line 108
    :cond_12
    iget-boolean v4, v0, Ll/ܺ۫ۢ;->ܽ:Z

    if-nez v4, :cond_17

    iget v4, v0, Ll/ܺ۫ۢ;->ܿ:I

    const/16 v7, 0x50

    invoke-virtual {v1, v4, v7}, Ll/֡۫ۢ;->֫(II)Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_b

    .line 109
    :cond_13
    invoke-interface {v8}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v4

    .line 110
    invoke-static {v4}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_16

    iget v4, v0, Ll/ܺ۫ۢ;->ܿ:I

    invoke-virtual {v1, v4}, Ll/֡۫ۢ;->֫(I)I

    move-result v4

    const/4 v7, 0x2

    if-ne v4, v7, :cond_14

    goto :goto_a

    .line 111
    :cond_14
    iget v4, v0, Ll/ܺ۫ۢ;->ᩳ:I

    if-gez v4, :cond_15

    goto :goto_a

    .line 113
    :cond_15
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳ֡;

    invoke-interface {v4}, Ll/֡ܳ֡;->getType()I

    move-result v4

    const/16 v7, 0x57

    if-eq v4, v7, :cond_16

    const/16 v7, 0x59

    if-eq v4, v7, :cond_16

    const/16 v7, 0x5b

    if-eq v4, v7, :cond_16

    const/16 v7, 0x63

    if-eq v4, v7, :cond_16

    const/16 v7, 0x87

    if-eq v4, v7, :cond_16

    packed-switch v4, :pswitch_data_0

    goto :goto_b

    .line 77
    :cond_16
    :goto_a
    :pswitch_0
    iget v4, v0, Ll/ܺ۫ۢ;->ۧ:I

    invoke-direct {v0, v4}, Ll/ܺ۫ۢ;->֫(I)V

    goto :goto_d

    :cond_17
    :goto_b
    if-eqz v6, :cond_18

    goto :goto_c

    .line 78
    :cond_18
    invoke-direct/range {p0 .. p0}, Ll/ܺ۫ۢ;->ۧ()V

    goto :goto_d

    :cond_19
    if-nez v12, :cond_1b

    .line 79
    invoke-virtual {v1, v5}, Ll/֡۫ۢ;->֫(I)I

    move-result v7

    const/4 v11, 0x2

    if-ne v7, v11, :cond_1b

    .line 187
    :goto_c
    iget v4, v0, Ll/ܺ۫ۢ;->᩻:I

    invoke-direct {v0, v4}, Ll/ܺ۫ۢ;->֫(I)V

    :cond_1a
    :goto_d
    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move/from16 v20, v5

    move/from16 v17, v9

    move/from16 v22, v10

    move/from16 v16, v12

    goto/16 :goto_1c

    :cond_1b
    const-string v7, "throw"

    const-string v11, "return"

    const-string v14, "yield"

    if-eqz v12, :cond_24

    if-eqz v6, :cond_22

    .line 121
    invoke-interface {v4}, Ll/֡ܳ֡;->ܽ()I

    move-result v6

    const/4 v15, 0x4

    invoke-virtual {v1, v6, v15}, Ll/֡۫ۢ;->֫(II)Z

    move-result v6

    if-nez v6, :cond_22

    .line 122
    invoke-interface {v8}, Ll/֡ܳ֡;->getType()I

    move-result v6

    const/16 v15, 0x5c

    if-ne v6, v15, :cond_1c

    goto/16 :goto_f

    .line 124
    :cond_1c
    invoke-interface {v4}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v6

    .line 125
    invoke-interface {v4}, Ll/֡ܳ֡;->ܽ()I

    move-result v15

    invoke-virtual {v1, v15}, Ll/֡۫ۢ;->ܽ(I)I

    move-result v15

    if-ltz v15, :cond_1e

    .line 126
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/֡ܳ֡;

    move/from16 v17, v9

    invoke-interface/range {v16 .. v16}, Ll/֡ܳ֡;->getType()I

    move-result v9

    move/from16 v16, v12

    const/16 v12, 0x62

    if-eq v9, v12, :cond_1d

    .line 127
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֡ܳ֡;

    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v9

    const/16 v12, 0x61

    if-ne v9, v12, :cond_1f

    :cond_1d
    const/4 v9, 0x1

    goto :goto_e

    :cond_1e
    move/from16 v17, v9

    move/from16 v16, v12

    :cond_1f
    const/4 v9, 0x0

    .line 128
    :goto_e
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_20

    iget-object v12, v1, Ll/֡۫ۢ;->ܳ:Ll/ᩳ۫ۢ;

    if-eqz v12, :cond_20

    .line 129
    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v15

    invoke-virtual {v12, v15}, Ll/ᩳ۫ۢ;->ܽ(I)Z

    move-result v12

    if-nez v12, :cond_20

    goto :goto_10

    :cond_20
    if-nez v9, :cond_23

    .line 130
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_21

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    const-string v7, "break"

    .line 131
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    const-string v7, "continue"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    const-string v7, "async"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    .line 187
    :cond_21
    iget v4, v0, Ll/ܺ۫ۢ;->᩻:I

    invoke-direct {v0, v4}, Ll/ܺ۫ۢ;->֫(I)V

    goto/16 :goto_1a

    :cond_22
    :goto_f
    move/from16 v17, v9

    move/from16 v16, v12

    .line 83
    :cond_23
    :goto_10
    invoke-interface {v4}, Ll/֡ܳ֡;->ܽ()I

    move-result v6

    const/4 v7, 0x4

    invoke-virtual {v1, v6, v7}, Ll/֡۫ۢ;->֫(II)Z

    move-result v6

    if-nez v6, :cond_4d

    invoke-virtual {v1, v5}, Ll/֡۫ۢ;->֫(I)I

    move-result v6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_4d

    .line 84
    invoke-static {v4, v8}, Ll/۠۫ۢ;->֫(Ll/֡ܳ֡;Ll/֡ܳ֡;)Z

    move-result v4

    if-eqz v4, :cond_4d

    invoke-direct/range {p0 .. p0}, Ll/ܺ۫ۢ;->ۧ()V

    goto/16 :goto_1a

    :cond_24
    move/from16 v17, v9

    move/from16 v16, v12

    .line 85
    invoke-virtual {v1, v5}, Ll/֡۫ۢ;->֫(I)I

    move-result v6

    const/4 v9, 0x1

    if-ne v6, v9, :cond_25

    invoke-direct/range {p0 .. p0}, Ll/ܺ۫ۢ;->ۧ()V

    goto/16 :goto_1a

    .line 86
    :cond_25
    invoke-virtual {v1, v5}, Ll/֡۫ۢ;->֫(I)I

    move-result v6

    const/4 v9, 0x3

    if-eq v6, v9, :cond_4d

    .line 135
    invoke-interface {v4}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v9

    .line 136
    invoke-interface {v4}, Ll/֡ܳ֡;->ܽ()I

    move-result v12

    invoke-virtual {v1, v12}, Ll/֡۫ۢ;->ܽ(I)I

    move-result v12

    const-string v15, "("

    move-object/from16 v18, v1

    const-string v1, "["

    if-ltz v12, :cond_27

    .line 137
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ll/֡ܳ֡;

    move/from16 v20, v5

    invoke-interface/range {v19 .. v19}, Ll/֡ܳ֡;->getType()I

    move-result v5

    move-object/from16 v19, v2

    const/16 v2, 0x62

    if-eq v5, v2, :cond_26

    .line 138
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܳ֡;

    invoke-interface {v2}, Ll/֡ܳ֡;->getType()I

    move-result v2

    const/16 v5, 0x61

    if-ne v2, v5, :cond_28

    .line 139
    :cond_26
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_48

    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    goto/16 :goto_15

    :cond_27
    move-object/from16 v19, v2

    move/from16 v20, v5

    :cond_28
    const-string v2, "*"

    .line 140
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    if-ltz v12, :cond_29

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܳ֡;

    invoke-interface {v2}, Ll/֡ܳ֡;->getType()I

    move-result v2

    const/16 v5, 0x17

    if-ne v2, v5, :cond_29

    goto/16 :goto_17

    .line 141
    :cond_29
    invoke-static {v4, v8}, Ll/۠۫ۢ;->֫(Ll/֡ܳ֡;Ll/֡ܳ֡;)Z

    move-result v2

    if-eqz v2, :cond_2a

    goto/16 :goto_17

    :cond_2a
    const-string v2, "="

    .line 142
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4b

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    goto/16 :goto_17

    .line 143
    :cond_2b
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_11

    :sswitch_0
    const-string v4, "from"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2c

    goto/16 :goto_11

    :cond_2c
    const/16 v4, 0x8

    goto/16 :goto_12

    :sswitch_1
    const-string v4, "case"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2d

    goto :goto_11

    :cond_2d
    const/4 v4, 0x7

    goto :goto_12

    :sswitch_2
    const-string v4, "of"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2e

    goto :goto_11

    :cond_2e
    const/4 v4, 0x6

    goto :goto_12

    :sswitch_3
    const-string v4, "in"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2f

    goto :goto_11

    :cond_2f
    const/4 v4, 0x5

    goto :goto_12

    :sswitch_4
    const-string v4, "as"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_30

    goto :goto_11

    :cond_30
    const/4 v4, 0x4

    goto :goto_12

    :sswitch_5
    const-string v4, "module"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_31

    goto :goto_11

    :cond_31
    const/4 v4, 0x3

    goto :goto_12

    :sswitch_6
    const-string v4, "import"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_32

    goto :goto_11

    :cond_32
    const/4 v4, 0x2

    goto :goto_12

    :sswitch_7
    const-string v4, "extends"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_33

    goto :goto_11

    :cond_33
    const/4 v4, 0x1

    goto :goto_12

    :sswitch_8
    const-string v4, "satisfies"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_34

    goto :goto_11

    :cond_34
    const/4 v4, 0x0

    goto :goto_12

    :goto_11
    const/4 v4, -0x1

    :goto_12
    packed-switch v4, :pswitch_data_1

    const-string v4, "}"

    .line 144
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_35

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ll/۠۫ۢ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_35

    goto/16 :goto_17

    :cond_35
    const-string v5, ","

    .line 145
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_48

    const-string v12, ";"

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_48

    move-object/from16 v21, v3

    const-string v3, ")"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_49

    const-string v3, "]"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_49

    const-string v3, "."

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_49

    move/from16 v22, v10

    const-string v10, "?."

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_36

    goto/16 :goto_16

    .line 146
    :cond_36
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4a

    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4a

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4a

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_37

    goto/16 :goto_16

    :cond_37
    const-string v3, ":"

    .line 147
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_38

    goto/16 :goto_16

    .line 148
    :cond_38
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    goto/16 :goto_16

    .line 149
    :cond_39
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    const-string v1, "=>"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4c

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3a

    goto/16 :goto_18

    .line 150
    :cond_3a
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "catch"

    if-eqz v1, :cond_42

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    goto :goto_13

    :sswitch_9
    const-string v1, "function"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    goto :goto_13

    :cond_3b
    const/4 v1, 0x6

    goto :goto_14

    :sswitch_a
    const-string v1, "while"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    goto :goto_13

    :cond_3c
    const/4 v1, 0x5

    goto :goto_14

    :sswitch_b
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3d

    goto :goto_13

    :cond_3d
    const/4 v1, 0x4

    goto :goto_14

    :sswitch_c
    const-string v1, "with"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    goto :goto_13

    :cond_3e
    const/4 v1, 0x3

    goto :goto_14

    :sswitch_d
    const-string v1, "for"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    goto :goto_13

    :cond_3f
    const/4 v1, 0x2

    goto :goto_14

    :sswitch_e
    const-string v1, "if"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    goto :goto_13

    :cond_40
    const/4 v1, 0x1

    goto :goto_14

    :sswitch_f
    const-string v1, "switch"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    goto :goto_13

    :cond_41
    const/4 v1, 0x0

    goto :goto_14

    :goto_13
    const/4 v1, -0x1

    :goto_14
    packed-switch v1, :pswitch_data_2

    goto/16 :goto_16

    :cond_42
    const-string v1, "{"

    .line 154
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    const-string v1, "${"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    goto/16 :goto_19

    .line 155
    :cond_43
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_44

    const-string v1, "else"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    const-string v1, "finally"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_44

    goto :goto_18

    .line 156
    :cond_44
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    goto :goto_18

    :cond_45
    const-string v1, "?"

    .line 157
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4c

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_46

    goto :goto_18

    :cond_46
    const-string v1, "|"

    .line 158
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4c

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    const-string v1, "&"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4c

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_47

    goto :goto_18

    .line 159
    :cond_47
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    const-string v1, "new"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4a

    goto :goto_18

    :cond_48
    :goto_15
    move-object/from16 v21, v3

    :cond_49
    move/from16 v22, v10

    :cond_4a
    :goto_16
    const/4 v1, 0x0

    goto :goto_19

    :cond_4b
    :goto_17
    :pswitch_1
    move-object/from16 v21, v3

    move/from16 v22, v10

    :cond_4c
    :goto_18
    :pswitch_2
    const/4 v1, 0x1

    :goto_19
    if-eqz v1, :cond_4f

    .line 86
    invoke-direct/range {p0 .. p0}, Ll/ܺ۫ۢ;->ۧ()V

    goto :goto_1c

    :cond_4d
    :goto_1a
    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move/from16 v20, v5

    move/from16 v22, v10

    goto :goto_1c

    :cond_4e
    :goto_1b
    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move/from16 v20, v5

    move/from16 v17, v9

    move/from16 v22, v10

    move/from16 v16, v12

    .line 187
    iget v1, v0, Ll/ܺ۫ۢ;->᩻:I

    invoke-direct {v0, v1}, Ll/ܺ۫ۢ;->֫(I)V

    .line 88
    :cond_4f
    :goto_1c
    invoke-interface {v8}, Ll/֡ܳ֡;->ܿ()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v2, v19

    move/from16 v3, v22

    invoke-virtual {v13, v3, v1, v2}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    if-eqz v16, :cond_50

    const/4 v1, 0x4

    move-object/from16 v3, v18

    move/from16 v5, v20

    .line 89
    invoke-virtual {v3, v5, v1}, Ll/֡۫ۢ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_51

    const/16 v1, 0x5d

    move/from16 v4, v17

    if-eq v4, v1, :cond_51

    const/16 v1, 0x3b

    invoke-virtual {v13, v1}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    goto :goto_1d

    :cond_50
    move-object/from16 v3, v18

    move/from16 v5, v20

    .line 90
    :cond_51
    :goto_1d
    invoke-interface {v8}, Ll/֡ܳ֡;->ܿ()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v4, 0x0

    move v6, v1

    move-object v4, v8

    const/4 v7, 0x0

    :goto_1e
    add-int/lit8 v5, v5, 0x1

    move-object v1, v3

    move-object/from16 v3, v21

    goto/16 :goto_0

    :cond_52
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x56ebebbf -> :sswitch_8
        -0x4dd2db67 -> :sswitch_7
        -0x469e8c5b -> :sswitch_6
        -0x3fb45994 -> :sswitch_5
        0xc32 -> :sswitch_4
        0xd25 -> :sswitch_3
        0xdd7 -> :sswitch_2
        0x2e7b30 -> :sswitch_1
        0x3017aa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x350448cc -> :sswitch_f
        0xd1d -> :sswitch_e
        0x18cc9 -> :sswitch_d
        0x37b0c6 -> :sswitch_c
        0x5a0eebb -> :sswitch_b
        0x6bdcb31 -> :sswitch_a
        0x524f73d8 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
