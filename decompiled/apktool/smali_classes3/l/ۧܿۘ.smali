.class public final Ll/ۧܿۘ;
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

    .line 551
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 552
    iput-object p1, p0, Ll/ۧܿۘ;->ۧ:Ll/ۜܳۘ;

    .line 553
    iput-object p2, p0, Ll/ۧܿۘ;->ܽ:Ljava/lang/CharSequence;

    .line 554
    iput-object p3, p0, Ll/ۧܿۘ;->ᩳ:Ljava/lang/CharSequence;

    .line 556
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۧܿۘ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫ܳۘ;
    .locals 14

    .line 561
    iget-object v0, p0, Ll/ۧܿۘ;->ۧ:Ll/ۜܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ۧܿۘ;->֫:Ljava/util/ArrayList;

    iget-object v4, p0, Ll/ۧܿۘ;->ᩳ:Ljava/lang/CharSequence;

    iget-object v3, p0, Ll/ۧܿۘ;->ܽ:Ljava/lang/CharSequence;

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    .line 562
    iget v5, v1, Ll/᩹ܳۘ;->ܽ:I

    iget v9, v1, Ll/᩹ܳۘ;->ᩳ:I

    iget v6, v1, Ll/᩹ܳۘ;->ۧ:I

    iget v7, v1, Ll/᩹ܳۘ;->֫:I

    move v10, v6

    move v8, v7

    :goto_1
    if-ge v5, v8, :cond_2

    if-ge v9, v10, :cond_2

    add-int/lit8 v11, v8, -0x1

    add-int/lit8 v12, v10, -0x1

    .line 112
    invoke-interface {v3, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    invoke-interface {v4, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-ne v13, v12, :cond_2

    .line 113
    invoke-interface {v3, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, -0x1

    add-int/lit8 v10, v10, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    sub-int v5, v7, v8

    .line 565
    iget v8, v1, Ll/᩹ܳۘ;->ܽ:I

    iget v10, v1, Ll/᩹ܳۘ;->ᩳ:I

    sub-int v11, v7, v5

    sub-int v12, v6, v5

    move v5, v8

    move v6, v10

    move v7, v11

    move v8, v12

    invoke-static/range {v3 .. v8}, Ll/ۗܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIII)I

    move-result v3

    .line 569
    new-instance v4, Ll/᩹ܳۘ;

    iget v1, v1, Ll/᩹ܳۘ;->ܽ:I

    add-int/2addr v1, v3

    add-int/2addr v9, v3

    invoke-direct {v4, v1, v11, v9, v12}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 571
    invoke-virtual {v4}, Ll/᩹ܳۘ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    .line 572
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 576
    :cond_3
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v2, v0, v1}, Ll/᩻ܳۘ;->֫(Ljava/util/ArrayList;II)Ll/֫ܳۘ;

    move-result-object v0

    return-object v0
.end method
