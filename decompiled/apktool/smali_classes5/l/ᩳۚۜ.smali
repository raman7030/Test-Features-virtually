.class public Ll/ᩳۚۜ;
.super Ljava/util/ArrayList;
.source "28FF"

# interfaces
.implements Ll/ۢ۬ۜ;


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public final ۙ:Ll/ܺۢᩴ;

.field public final ᩶:Ljava/util/HashMap;

.field public ᩸:I

.field public ᩹:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 4

    .line 26
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩳۚۜ;->᩶:Ljava/util/HashMap;

    .line 21
    new-instance v0, Ll/ܺۢᩴ;

    invoke-direct {v0}, Ll/ܺۢᩴ;-><init>()V

    iput-object v0, p0, Ll/ᩳۚۜ;->ۙ:Ll/ܺۢᩴ;

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    .line 27
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 30
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 31
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 32
    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    const-string v3, "mt_media"

    .line 33
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 34
    invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    .line 36
    new-instance v3, Ll/᩹ᩴ֫;

    invoke-direct {v3}, Ll/᩹ᩴ֫;-><init>()V

    .line 37
    invoke-virtual {v3, v2}, Ll/᩹ᩴ֫;->֫(Landroid/net/Uri;)V

    .line 38
    invoke-virtual {v3, v0}, Ll/᩹ᩴ֫;->֫(Ljava/lang/Object;)V

    .line 39
    invoke-interface {v0}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/᩹ᩴ֫;->֫(Ljava/lang/String;)V

    .line 40
    invoke-virtual {v3}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v0

    .line 41
    iget-object v2, p0, Ll/ᩳۚۜ;->᩶:Ljava/util/HashMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_0
    iput p1, p0, Ll/ᩳۚۜ;->᩸:I

    return-void

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static ֫(Ll/ۧ᩵֫;)Ll/ᩳۜܳ;
    .locals 0

    .line 238
    iget-object p0, p0, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    iget-object p0, p0, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ll/ᩳۜܳ;

    return-object p0
.end method

.method private ۡ()V
    .locals 2

    .line 141
    invoke-virtual {p0}, Ll/ᩳۚۜ;->ۢ()Z

    move-result v0

    .line 142
    iget-object v1, p0, Ll/ᩳۚۜ;->᩹:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 143
    iput-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    .line 144
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۚۜ;->᩹:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۧ᩵֫;
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ᩳۚۜ;->᩶:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧ᩵֫;

    return-object p1
.end method

.method public final ֫(I)V
    .locals 4

    .line 109
    invoke-direct {p0}, Ll/ᩳۚۜ;->ۡ()V

    .line 157
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    if-eq p1, v0, :cond_2

    .line 112
    iget-object v1, p0, Ll/ᩳۚۜ;->ۙ:Ll/ܺۢᩴ;

    invoke-virtual {v1}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 471
    invoke-virtual {v1}, Ll/ܺۢᩴ;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v2

    if-eq v2, v0, :cond_1

    .line 454
    :cond_0
    invoke-virtual {v1, v0}, Ll/ܺۢᩴ;->add(I)Z

    .line 114
    invoke-virtual {v1}, Ll/ܺۢᩴ;->size()I

    move-result v2

    const/16 v3, 0x64

    if-le v2, v3, :cond_1

    const/4 v2, 0x0

    .line 115
    invoke-virtual {v1, v2}, Ll/ܺۢᩴ;->ۘ(I)I

    :cond_1
    const/4 v1, 0x0

    .line 119
    iput-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    .line 120
    invoke-virtual {p0, p1}, Ll/ᩳۚۜ;->ᩳ(I)V

    .line 121
    invoke-virtual {p0, v0, p1}, Ll/ᩳۚۜ;->ۧ(II)V

    :cond_2
    return-void
.end method

.method public final ۜ()V
    .locals 6

    .line 63
    invoke-direct {p0}, Ll/ᩳۚۜ;->ۡ()V

    .line 64
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 157
    :cond_0
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    .line 68
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    .line 69
    iget-object v3, p0, Ll/ᩳۚۜ;->ۙ:Ll/ܺۢᩴ;

    invoke-virtual {v3}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    .line 471
    invoke-virtual {v3}, Ll/ܺۢᩴ;->size()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-virtual {v3, v4}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v1

    if-eq v1, v0, :cond_2

    .line 454
    :cond_1
    invoke-virtual {v3, v0}, Ll/ܺۢᩴ;->add(I)Z

    .line 71
    invoke-virtual {v3}, Ll/ܺۢᩴ;->size()I

    move-result v1

    const/16 v4, 0x64

    if-le v1, v4, :cond_2

    .line 72
    invoke-virtual {v3, v5}, Ll/ܺۢᩴ;->ۘ(I)I

    .line 76
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۚۜ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 77
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    if-nez v1, :cond_5

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    add-int/lit8 v3, v2, -0x1

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_4

    if-eq v1, v0, :cond_3

    .line 82
    iget-object v3, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 85
    :cond_4
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    goto :goto_2

    .line 86
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_6

    .line 89
    iget-object v3, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 91
    :cond_6
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 92
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_7

    .line 93
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 94
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_7
    :goto_2
    iget-object v1, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 98
    iget-object v2, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    add-int/lit8 v1, v0, 0x1

    if-lt v1, v2, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    move v5, v1

    .line 104
    :goto_4
    invoke-virtual {p0, v5}, Ll/ᩳۚۜ;->ᩳ(I)V

    .line 105
    invoke-virtual {p0, v0, v5}, Ll/ᩳۚۜ;->ۧ(II)V

    return-void
.end method

.method public ۢ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۧ(II)V
    .locals 0

    return-void
.end method

.method public final ܳ()Ll/ۧ᩵֫;
    .locals 1

    .line 157
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    .line 168
    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩵֫;

    return-object v0
.end method

.method public final ܽ()Ll/ᩳۜܳ;
    .locals 1

    .line 157
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    .line 204
    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩵֫;

    invoke-static {v0}, Ll/ᩳۚۜ;->֫(Ll/ۧ᩵֫;)Ll/ᩳۜܳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 3

    .line 129
    invoke-direct {p0}, Ll/ᩳۚۜ;->ۡ()V

    .line 130
    invoke-virtual {p0}, Ll/ᩳۚۜ;->ۢ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Ll/ᩳۚۜ;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 157
    :cond_0
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    .line 133
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    sub-int/2addr v2, v1

    if-ne v0, v2, :cond_1

    :goto_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 157
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    return v0
.end method

.method public final ᩳ(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 161
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 164
    iput p1, p0, Ll/ᩳۚۜ;->᩸:I

    return-void

    .line 162
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ᩷()V
    .locals 3

    .line 48
    invoke-direct {p0}, Ll/ᩳۚۜ;->ۡ()V

    .line 157
    iget v0, p0, Ll/ᩳۚۜ;->᩸:I

    .line 51
    iget-object v1, p0, Ll/ᩳۚۜ;->ۙ:Ll/ܺۢᩴ;

    invoke-virtual {v1}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v0, -0x1

    if-gez v1, :cond_1

    .line 53
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1}, Ll/ۤܿᩴ;->ܿ()I

    move-result v1

    .line 58
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Ll/ᩳۚۜ;->ᩳ(I)V

    .line 59
    invoke-virtual {p0, v0, v1}, Ll/ᩳۚۜ;->ۧ(II)V

    return-void
.end method
