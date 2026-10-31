.class public Ll/ۜᩴۘ;
.super Ljava/lang/Object;
.source "18DH"

# interfaces
.implements Ll/ᩳᩴۘ;


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ll/ܺᩴۘ;

.field public ܽ:[D


# direct methods
.method public constructor <init>(Ll/ܺᩴۘ;D)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [D

    .line 33
    iput-object v0, p0, Ll/ۜᩴۘ;->ܽ:[D

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    .line 38
    iput-object p1, p0, Ll/ۜᩴۘ;->ۧ:Ll/ܺᩴۘ;

    .line 39
    invoke-virtual {p0, p2, p3}, Ll/ۜᩴۘ;->֫(D)V

    return-void
.end method

.method public static ֫(Ll/ۜᩴۘ;Ll/ۜᩴۘ;)V
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 66
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_0
    iget-object p1, p1, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 66
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public static ۧ(Ll/ۜᩴۘ;)V
    .locals 3

    .line 85
    iget-object v0, p0, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜᩴۘ;

    .line 71
    iget-object v2, v2, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۜᩴۘ;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜᩴۘ;

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 157
    new-instance v0, Ll/᩻ᩴۘ;

    invoke-direct {v0, p0}, Ll/᩻ᩴۘ;-><init>(Ll/ۜᩴۘ;)V

    iget-object v1, p0, Ll/ۜᩴۘ;->ۧ:Ll/ܺᩴۘ;

    invoke-virtual {v1, v0}, Ll/᩸ᩴۘ;->֫(Ll/۠֨ۘ;)V

    return-void
.end method

.method public ֫(D)V
    .locals 3

    const/4 v0, 0x0

    .line 55
    :goto_0
    iget-object v1, p0, Ll/ۜᩴۘ;->ܽ:[D

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 56
    aput-wide p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 2

    const/4 v0, 0x0

    .line 96
    :goto_0
    iget-object v1, p0, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 194
    invoke-virtual {p0, v0}, Ll/ۜᩴۘ;->֫(I)Ll/ۜᩴۘ;

    move-result-object v1

    .line 108
    iget-object v1, v1, Ll/ۜᩴۘ;->ۧ:Ll/ܺᩴۘ;

    .line 195
    invoke-virtual {v1}, Ll/᩸ᩴۘ;->ܽ()Ll/᩻᩵ۘ;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ll/᩻᩵ۘ;->֫(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۜᩴۘ;)V
    .locals 3

    .line 112
    iget-object v0, p0, Ll/ۜᩴۘ;->ۧ:Ll/ܺᩴۘ;

    invoke-virtual {v0}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v1

    .line 113
    iget-object v2, p1, Ll/ۜᩴۘ;->ۧ:Ll/ܺᩴۘ;

    invoke-virtual {v2}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v2

    if-eq v1, v2, :cond_1

    if-eqz v1, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    .line 115
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Connection between units on different synths."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 121
    :cond_1
    :goto_0
    new-instance v1, Ll/ܳᩴۘ;

    invoke-direct {v1, p0, p1}, Ll/ܳᩴۘ;-><init>(Ll/ۜᩴۘ;Ll/ۜᩴۘ;)V

    invoke-virtual {v0, v1}, Ll/᩸ᩴۘ;->֫(Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 101
    iget-object v0, p0, Ll/ۜᩴۘ;->ܽ:[D

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-wide v1, v0, v1

    const/4 v3, 0x0

    .line 102
    :goto_0
    array-length v4, v0

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_0

    .line 103
    aput-wide v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۜᩴۘ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public ܿ()[D
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۜᩴۘ;->ܽ:[D

    return-object v0
.end method

.method public ᩳ()D
    .locals 3

    .line 47
    iget-object v0, p0, Ll/ۜᩴۘ;->ܽ:[D

    const/4 v1, 0x0

    aget-wide v1, v0, v1

    return-wide v1
.end method
