.class public final Ll/ۨۜ֡;
.super Ljava/lang/Object;
.source "6ASH"


# instance fields
.field public final ֫:Ll/ۛۜ֡;

.field public final ۧ:Ll/۠ܳ֡;


# direct methods
.method public constructor <init>(Ll/ۛۜ֡;Ll/۠ܳ֡;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ۨۜ֡;->֫:Ll/ۛۜ֡;

    .line 32
    iput-object p2, p0, Ll/ۨۜ֡;->ۧ:Ll/۠ܳ֡;

    return-void
.end method

.method public static ֫(Ll/ܰۜ֡;)Ljava/lang/String;
    .locals 4

    .line 65
    iget v0, p0, Ll/ܰۜ֡;->ۜ:I

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v2, p0, Ll/ܰۜ֡;->ܽ:Z

    const-string v3, ""

    if-eqz v2, :cond_0

    const-string v2, ":"

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ܰۜ֡;->᩻:Z

    if-eqz v0, :cond_1

    const-string v3, "^"

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 67
    iget-boolean v1, p0, Ll/ܰۜ֡;->ܽ:Z

    if-eqz v1, :cond_3

    .line 68
    iget-object v1, p0, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    const-string v2, "=>"

    if-eqz v1, :cond_2

    .line 0
    invoke-static {v0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 69
    iget-object p0, p0, Ll/ܰۜ֡;->ܿ:[Ll/᩺ۜ֡;

    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 0
    :cond_2
    invoke-static {v0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 72
    iget p0, p0, Ll/ܰۜ֡;->ܳ:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 37
    iget-object v0, p0, Ll/ۨۜ֡;->֫:Ll/ۛۜ֡;

    iget-object v0, v0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    iget-object v1, p0, Ll/ۨۜ֡;->֫:Ll/ۛۜ֡;

    .line 162
    new-instance v2, Ljava/util/ArrayList;

    iget-object v1, v1, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 163
    new-instance v1, Ll/ۤۜ֡;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۜ֡;

    .line 42
    iget-object v3, v2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    array-length v3, v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 44
    iget-object v5, v2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    aget-object v5, v5, v4

    if-eqz v5, :cond_3

    .line 45
    iget v6, v5, Ll/ܰۜ֡;->ۜ:I

    const v7, 0x7fffffff

    if-eq v6, v7, :cond_3

    .line 46
    invoke-static {v2}, Ll/ۨۜ֡;->֫(Ll/ܰۜ֡;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    iget-object v6, p0, Ll/ۨۜ֡;->ۧ:Ll/۠ܳ֡;

    add-int/lit8 v7, v4, -0x1

    check-cast v6, Ll/ܶܳ֡;

    invoke-virtual {v6, v7}, Ll/ܶܳ֡;->֫(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "-"

    .line 48
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "->"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/ۨۜ֡;->֫(Ll/ܰۜ֡;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0xa

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 53
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_5

    :goto_1
    const/4 v0, 0x0

    :cond_5
    return-object v0
.end method
