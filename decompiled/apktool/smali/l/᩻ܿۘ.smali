.class public final Ll/᩻ܿۘ;
.super Ljava/lang/Object;
.source "M1ME"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/֫ܳۘ;

.field public final ܽ:Ljava/lang/CharSequence;

.field public final ᩳ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ll/֫ܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 636
    iput-object p1, p0, Ll/᩻ܿۘ;->ۧ:Ll/֫ܳۘ;

    .line 637
    iput-object p2, p0, Ll/᩻ܿۘ;->ܽ:Ljava/lang/CharSequence;

    .line 638
    iput-object p3, p0, Ll/᩻ܿۘ;->ᩳ:Ljava/lang/CharSequence;

    .line 640
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩻ܿۘ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫ܳۘ;
    .locals 10

    .line 645
    iget-object v0, p0, Ll/᩻ܿۘ;->ۧ:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/᩻ܿۘ;->֫:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩻ܿۘ;->ᩳ:Ljava/lang/CharSequence;

    iget-object v4, p0, Ll/᩻ܿۘ;->ܽ:Ljava/lang/CharSequence;

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    .line 646
    iget v5, v1, Ll/᩹ܳۘ;->ܽ:I

    .line 647
    iget v6, v1, Ll/᩹ܳۘ;->ᩳ:I

    .line 648
    iget v7, v1, Ll/᩹ܳۘ;->֫:I

    .line 649
    iget v1, v1, Ll/᩹ܳۘ;->ۧ:I

    .line 651
    invoke-static {v5, v4}, Ll/᩷ܿۘ;->֫(ILjava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 652
    invoke-static {v5, v7, v4}, Ll/ۗܿۘ;->ۧ(IILjava/lang/CharSequence;)I

    move-result v5

    :cond_1
    add-int/lit8 v8, v7, -0x1

    .line 654
    invoke-static {v8, v4}, Ll/᩷ܿۘ;->֫(ILjava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 655
    invoke-static {v5, v7, v4}, Ll/ۗܿۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v7

    .line 657
    :cond_2
    invoke-static {v6, v3}, Ll/᩷ܿۘ;->֫(ILjava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 658
    invoke-static {v6, v1, v3}, Ll/ۗܿۘ;->ۧ(IILjava/lang/CharSequence;)I

    move-result v6

    :cond_3
    add-int/lit8 v8, v1, -0x1

    .line 660
    invoke-static {v8, v3}, Ll/᩷ܿۘ;->֫(ILjava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 661
    invoke-static {v6, v1, v3}, Ll/ۗܿۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v1

    .line 664
    :cond_4
    new-instance v8, Ll/᩹ܳۘ;

    invoke-direct {v8, v5, v7, v6, v1}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 666
    invoke-virtual {v8}, Ll/᩹ܳۘ;->֫()Z

    move-result v9

    if-nez v9, :cond_0

    .line 148
    invoke-interface {v4, v5, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 149
    invoke-interface {v3, v6, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 150
    sget-object v3, Ll/ۚܿۘ;->᩹:Ll/ۚܿۘ;

    invoke-static {v4, v1, v3}, Ll/۠ܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 668
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 672
    :cond_5
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v2, v0, v1}, Ll/᩻ܳۘ;->֫(Ljava/util/ArrayList;II)Ll/֫ܳۘ;

    move-result-object v0

    return-object v0
.end method
