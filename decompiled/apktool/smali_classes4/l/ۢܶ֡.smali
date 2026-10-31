.class public final Ll/ۢܶ֡;
.super Ll/ۧܶ֡;
.source "R69D"


# instance fields
.field public ۗ:Z

.field public final ۫:Ljava/util/ArrayList;

.field public final ۬:I


# direct methods
.method public constructor <init>(Ll/֨ܶ֡;ILl/ۡܽۚ;)V
    .locals 10

    .line 51
    invoke-direct {p0, p1, p2, p3}, Ll/ۧܶ֡;-><init>(Ll/֨ܶ֡;ILl/᩺֫ۚ;)V

    .line 53
    invoke-virtual {p1, p2}, Ll/֨ܶ֡;->֫(I)I

    move-result p2

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢܶ֡;->۫:Ljava/util/ArrayList;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p2, :cond_2

    .line 60
    invoke-interface {p3}, Ll/ܿۧۚ;->ۙ()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۧۚ;

    if-eqz v3, :cond_0

    .line 62
    invoke-interface {v4}, Ll/ᩳۧۚ;->getKey()I

    move-result v2

    const/4 v3, 0x0

    .line 65
    :cond_0
    invoke-virtual {p1}, Ll/֨ܶ֡;->֫()Ll/ۚܶ֡;

    move-result-object v5

    new-instance v6, Ll/᩵ܶ֡;

    iget-object v7, p1, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    .line 66
    invoke-interface {v4}, Ll/ᩳۧۚ;->֫()I

    move-result v8

    add-int/2addr v8, p2

    const-string v9, "pswitch_"

    invoke-direct {v6, v7, v8, v9}, Ll/᩵ܶ֡;-><init>(Ll/᩹ܶ֡;ILjava/lang/String;)V

    .line 65
    invoke-virtual {v5, v6}, Ll/ۚܶ֡;->֫(Ll/᩵ܶ֡;)Ll/᩵ܶ֡;

    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ll/᩵ܶ֡;->ۡ()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 69
    invoke-virtual {v5}, Ll/᩵ܶ֡;->᩻()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4}, Ll/ᩳۧۚ;->getKey()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v1

    aput-object v4, v7, v0

    const-string v4, "%s, 0x%x"

    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/᩵ܶ֡;->֫(Ljava/lang/String;)V

    goto :goto_1

    .line 71
    :cond_1
    invoke-interface {v4}, Ll/ᩳۧۚ;->getKey()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v6, v0, [Ljava/lang/Object;

    aput-object v4, v6, v1

    const-string v4, "0x%x"

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/᩵ܶ֡;->֫(Ljava/lang/String;)V

    .line 72
    :goto_1
    iget-object v4, p0, Ll/ۢܶ֡;->۫:Ljava/util/ArrayList;

    new-instance v6, Ll/᩻ܶ֡;

    invoke-direct {v6, v5}, Ll/᩻ܶ֡;-><init>(Ll/᩵ܶ֡;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 75
    :cond_2
    iput-boolean v0, p0, Ll/ۢܶ֡;->ۗ:Z

    .line 76
    invoke-interface {p3}, Ll/ܿۧۚ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۧۚ;

    if-eqz v0, :cond_3

    .line 78
    invoke-interface {p2}, Ll/ᩳۧۚ;->getKey()I

    move-result v2

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 81
    :cond_3
    iget-object p3, p0, Ll/ۢܶ֡;->۫:Ljava/util/ArrayList;

    new-instance v1, Ll/ۜܶ֡;

    invoke-interface {p2}, Ll/ᩳۧۚ;->֫()I

    move-result p2

    invoke-direct {v1, p2}, Ll/ۜܶ֡;-><init>(I)V

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 84
    :cond_4
    iput v2, p0, Ll/ۢܶ֡;->۬:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;)Z
    .locals 8

    .line 89
    iget-boolean v0, p0, Ll/ۢܶ֡;->ۗ:Z

    if-eqz v0, :cond_0

    .line 90
    new-instance v0, Ll/۠۠֡;

    .line 41
    invoke-direct {v0, p1}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    move-object p1, v0

    .line 92
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xf

    const-string v1, ".packed-switch "

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p1, v1, v2, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 93
    iget v0, p0, Ll/ۢܶ֡;->۬:I

    invoke-static {p1, v0}, Ll/᩶ܶ֡;->֫(Ll/ۗ᩵ۚ;I)V

    .line 94
    invoke-virtual {p1}, Ll/ۗ᩵ۚ;->ܽ()V

    const/16 v1, 0xa

    .line 95
    invoke-virtual {p1, v1}, Ll/ۗ᩵ۚ;->write(I)V

    .line 97
    iget-object v3, p0, Ll/ۧܶ֡;->᩶:Ll/֨ܶ֡;

    iget-object v3, v3, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    iget-boolean v3, v3, Ll/᩹ܶ֡;->ܳ:Z

    .line 98
    iget-object v4, p0, Ll/ۢܶ֡;->۫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ܶ֡;

    .line 99
    instance-of v7, v5, Ll/᩻ܶ֡;

    if-eqz v7, :cond_1

    .line 100
    check-cast v5, Ll/᩻ܶ֡;

    invoke-static {v5}, Ll/᩻ܶ֡;->֫(Ll/᩻ܶ֡;)Ll/᩵ܶ֡;

    move-result-object v5

    invoke-virtual {v5, p1}, Ll/᩵ܶ֡;->ۧ(Ll/ۗ᩵ۚ;)V

    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v5, p1}, Ll/᩷ܶ֡;->֫(Ll/ۗ᩵ۚ;)V

    .line 103
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v2

    const-string v5, "  #%08x"

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 116
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {p1, v5, v2, v6}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    if-eqz v3, :cond_2

    .line 105
    invoke-virtual {p0, p1, v0}, Ll/ۧܶ֡;->֫(Ll/ۗ᩵ۚ;I)Z

    .line 107
    :cond_2
    invoke-virtual {p1, v1}, Ll/ۗ᩵ۚ;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {p1}, Ll/ۗ᩵ۚ;->֫()V

    const-string v0, ".end packed-switch"

    const/16 v1, 0x12

    .line 116
    invoke-virtual {p1, v0, v2, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return v6
.end method

.method public final ܿ()V
    .locals 0

    return-void
.end method
