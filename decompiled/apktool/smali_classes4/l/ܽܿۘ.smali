.class public final Ll/ܽܿۘ;
.super Ljava/lang/Object;
.source "M1ME"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/ۜܳۘ;

.field public final ܽ:Ljava/lang/CharSequence;

.field public final ᩳ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 593
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 594
    iput-object p1, p0, Ll/ܽܿۘ;->ۧ:Ll/ۜܳۘ;

    .line 595
    iput-object p2, p0, Ll/ܽܿۘ;->ܽ:Ljava/lang/CharSequence;

    .line 596
    iput-object p3, p0, Ll/ܽܿۘ;->ᩳ:Ljava/lang/CharSequence;

    .line 598
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܽܿۘ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫ܳۘ;
    .locals 13

    .line 603
    iget-object v0, p0, Ll/ܽܿۘ;->ۧ:Ll/ۜܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ܽܿۘ;->֫:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ܽܿۘ;->ᩳ:Ljava/lang/CharSequence;

    iget-object v4, p0, Ll/ܽܿۘ;->ܽ:Ljava/lang/CharSequence;

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    .line 143
    iget v5, v1, Ll/᩹ܳۘ;->ܽ:I

    iget v6, v1, Ll/᩹ܳۘ;->ᩳ:I

    iget v7, v1, Ll/᩹ܳۘ;->֫:I

    iget v1, v1, Ll/᩹ܳۘ;->ۧ:I

    move v8, v5

    move v9, v6

    :goto_1
    if-ge v8, v7, :cond_2

    if-ge v9, v1, :cond_2

    .line 98
    invoke-interface {v4, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-interface {v3, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-ne v10, v11, :cond_2

    .line 99
    invoke-interface {v4, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    sub-int/2addr v8, v5

    add-int/2addr v5, v8

    add-int/2addr v6, v8

    move v9, v1

    move v8, v7

    :goto_3
    if-ge v5, v8, :cond_4

    if-ge v6, v9, :cond_4

    add-int/lit8 v10, v8, -0x1

    add-int/lit8 v11, v9, -0x1

    .line 98
    invoke-interface {v4, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    invoke-interface {v3, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-ne v12, v11, :cond_4

    .line 99
    invoke-interface {v4, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v8, v8, -0x1

    add-int/lit8 v9, v9, -0x1

    goto :goto_3

    :cond_4
    :goto_4
    sub-int v8, v7, v8

    sub-int/2addr v7, v8

    sub-int/2addr v1, v8

    :goto_5
    if-ge v5, v7, :cond_6

    .line 73
    invoke-interface {v4, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_6
    :goto_6
    if-ge v5, v7, :cond_8

    add-int/lit8 v8, v7, -0x1

    invoke-interface {v4, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v7, v7, -0x1

    goto :goto_6

    :cond_8
    :goto_7
    if-ge v6, v1, :cond_a

    .line 74
    invoke-interface {v3, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_a
    :goto_8
    if-ge v6, v1, :cond_c

    add-int/lit8 v8, v1, -0x1

    invoke-interface {v3, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_9

    :cond_b
    add-int/lit8 v1, v1, -0x1

    goto :goto_8

    .line 171
    :cond_c
    :goto_9
    new-instance v8, Ll/᩹ܳۘ;

    invoke-direct {v8, v5, v7, v6, v1}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 608
    invoke-virtual {v8}, Ll/᩹ܳۘ;->֫()Z

    move-result v9

    if-nez v9, :cond_0

    .line 155
    invoke-interface {v4, v5, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 156
    invoke-interface {v3, v6, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 157
    sget-object v3, Ll/ۚܿۘ;->᩶:Ll/ۚܿۘ;

    invoke-static {v4, v1, v3}, Ll/۠ܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 610
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 614
    :cond_d
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v2, v0, v1}, Ll/᩻ܳۘ;->֫(Ljava/util/ArrayList;II)Ll/֫ܳۘ;

    move-result-object v0

    return-object v0
.end method
