.class public final Ll/ۛۢۚ;
.super Ll/ܽ᩷ۚ;
.source "L5RS"

# interfaces
.implements Ll/ܰۜۚ;


# instance fields
.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Ll/ܽ᩷ۚ;-><init>(Ll/᩵ۡۚ;)V

    .line 368
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ۛۢۚ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ۛۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 2

    .line 108
    new-instance v0, Ll/ۤۢۚ;

    iget-object v1, p0, Ll/ۛۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۢۚ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/֡ܽۚ;)Ll/֫ۡۚ;
    .locals 0

    .line 49
    check-cast p1, Ll/۬ۢۚ;

    .line 97
    iget-object p1, p1, Ll/۬ۢۚ;->᩹:Ll/֫ۡۚ;

    return-object p1
.end method

.method public final ۧ(Ll/֡ܽۚ;)Ll/᩻ۡۚ;
    .locals 0

    .line 49
    check-cast p1, Ll/۬ۢۚ;

    .line 91
    iget-object p1, p1, Ll/۬ۢۚ;->᩶:Ll/᩻ۡۚ;

    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)I
    .locals 0

    .line 49
    check-cast p1, Ll/۬ۢۚ;

    .line 73
    iget p1, p1, Ll/۬ۢۚ;->᩸:I

    return p1
.end method

.method public final ܽ(Ll/֡ܽۚ;)Ll/۟ۢۚ;
    .locals 0

    .line 49
    check-cast p1, Ll/۬ۢۚ;

    .line 85
    iget-object p1, p1, Ll/۬ۢۚ;->ۙ:Ll/۟ۢۚ;

    return-object p1
.end method

.method public final ᩳ(Ll/֡ܽۚ;)Ll/۬ۢۚ;
    .locals 11

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 62
    iget-object v1, p0, Ll/ۛۢۚ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۢۚ;

    if-eqz v2, :cond_0

    return-object v2

    .line 67
    :cond_0
    new-instance v2, Ll/۬ۢۚ;

    iget-object v3, p0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    iget-object v4, v3, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v4, Ll/ܰۢۚ;

    .line 69
    invoke-interface {p1}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v5

    invoke-interface {p1}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v6

    .line 68
    sget-object v7, Ll/ܿۜۚ;->֫:Ll/ᩴܶܺ;

    .line 118
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v9, 0x1

    add-int/2addr v8, v9

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 111
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v10, 0x0

    if-le v8, v9, :cond_1

    const/16 v6, 0x4c

    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual {v6, v10}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 119
    :goto_0
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    .line 111
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-le v8, v9, :cond_2

    const/16 v6, 0x4c

    goto :goto_2

    .line 114
    :cond_2
    invoke-interface {v6, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    .line 121
    :goto_2
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 68
    invoke-virtual {v4, v5}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v4

    iget-object v5, v3, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    check-cast v5, Ll/ᩳۡۚ;

    .line 70
    invoke-interface {p1}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/ᩳۡۚ;->֫(Ljava/util/List;)Ll/֫ۡۚ;

    move-result-object v5

    iget-object v3, v3, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 71
    invoke-interface {p1}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object p1

    invoke-direct {v2, v4, v5, p1}, Ll/۬ۢۚ;-><init>(Ll/۟ۢۚ;Ll/֫ۡۚ;Ll/᩻ۡۚ;)V

    .line 72
    invoke-virtual {v1, v0, v2}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۢۚ;

    if-nez p1, :cond_4

    return-object v2

    :cond_4
    return-object p1
.end method
