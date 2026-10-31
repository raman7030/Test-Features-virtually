.class public final Ll/ۢ۫ۚ;
.super Ll/ۜۨۚ;
.source "37EB"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩶:Ll/ܺۤۚ;

.field public ᩹:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ܺۤۚ;Ljava/util/List;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ll/ۜۨۚ;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    .line 39
    iput-object p2, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 89
    :cond_0
    instance-of v1, p1, Ll/ۢ۫ۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 90
    :cond_1
    check-cast p1, Ll/ۢ۫ۚ;

    .line 91
    iget-object v1, p0, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    iget-object v3, p1, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 93
    :cond_2
    iget v1, p0, Ll/ۜۨۚ;->᩸:I

    iget v2, p1, Ll/ۜۨۚ;->᩸:I

    if-ne v1, v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    iget-object p1, p1, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    and-int/2addr p1, v0

    return p1
.end method

.method public final getLength()I
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 98
    iget-object v0, p0, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܺۤۚ;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit16 v0, v0, 0x3c1

    .line 99
    iget-object v2, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 80
    iget-object v0, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    .line 81
    iget-object v1, p0, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    if-eqz v1, :cond_1

    iget v2, v1, Ll/ۜۨۚ;->᩸:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " #"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    const-string v1, " n/a"

    :goto_1
    if-eqz v0, :cond_3

    .line 82
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 83
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{ "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/᩷۫ۚ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    const-string v3, ", "

    invoke-static {v3}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v3

    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, " }"

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    :goto_2
    const-string v0, "{}"

    :goto_3
    const-string v2, " Arguments:"

    const-string v3, "}"

    const-string v4, "{MethodHandle:"

    invoke-static {v4, v1, v2, v0, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 70
    iget-object v0, p0, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 71
    iget-object v0, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 73
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۤۚ;

    .line 74
    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 5

    .line 104
    iget-object v0, p0, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    if-ne p0, p1, :cond_0

    goto :goto_1

    .line 105
    :cond_0
    invoke-static {p1}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_2

    .line 106
    :cond_1
    check-cast p1, Ll/ۢ۫ۚ;

    iget-object v1, p1, Ll/ۢ۫ۚ;->᩹:Ljava/util/List;

    .line 107
    iget-object v3, p0, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    iget-object p1, p1, Ll/ۢ۫ۚ;->᩶:Ll/ܺۤۚ;

    invoke-static {v3, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_6

    .line 110
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne p1, v3, :cond_6

    const/4 p1, 0x0

    .line 111
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge p1, v3, :cond_5

    .line 112
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۤۚ;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ܺۤۚ;->֫(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v2
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
