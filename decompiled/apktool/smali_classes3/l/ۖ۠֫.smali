.class public abstract Ll/ۖ۠֫;
.super Ljava/lang/Object;
.source "C8V1"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:Ll/ۗ۠֫;

.field public final ۧ:Z

.field public ܽ:I

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-boolean p1, p0, Ll/ۖ۠֫;->ۧ:Z

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۖ۠֫;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public ֫()Ljava/util/Map;
    .locals 1

    .line 99
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    iget-object v0, p0, Ll/ۖ۠֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 56
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    iget p1, p0, Ll/ۖ۠֫;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۖ۠֫;->ܽ:I

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۗ۠֫;)V
    .locals 1

    const/4 p1, 0x0

    .line 67
    :goto_0
    iget v0, p0, Ll/ۖ۠֫;->ܽ:I

    if-ge p1, v0, :cond_0

    .line 68
    iget-object v0, p0, Ll/ۖ۠֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܶ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 4

    .line 101
    iget-object v0, p0, Ll/ۖ۠֫;->֫:Ll/ۗ۠֫;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 102
    :goto_0
    iget v2, p0, Ll/ۖ۠֫;->ܽ:I

    if-ge v1, v2, :cond_0

    .line 103
    iget-object v2, p0, Ll/ۖ۠֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܶ֫;

    iget-boolean v3, p0, Ll/ۖ۠֫;->ۧ:Z

    invoke-interface {v2, v0, v3}, Ll/֡ܶ֫;->֫(Ll/ۗ۠֫;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 105
    iput-object v0, p0, Ll/ۖ۠֫;->֫:Ll/ۗ۠֫;

    return-void
.end method

.method public final ܽ(Ll/ۗ۠֫;)V
    .locals 3

    .line 78
    iput-object p1, p0, Ll/ۖ۠֫;->֫:Ll/ۗ۠֫;

    const/4 v0, 0x0

    .line 79
    :goto_0
    iget v1, p0, Ll/ۖ۠֫;->ܽ:I

    if-ge v0, v1, :cond_0

    .line 80
    iget-object v1, p0, Ll/ۖ۠֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܶ֫;

    iget-boolean v2, p0, Ll/ۖ۠֫;->ۧ:Z

    invoke-interface {v1, p1, v2}, Ll/֡ܶ֫;->ۧ(Ll/ۗ۠֫;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ(I)V
    .locals 4

    .line 91
    iget-object v0, p0, Ll/ۖ۠֫;->֫:Ll/ۗ۠֫;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 92
    :goto_0
    iget v2, p0, Ll/ۖ۠֫;->ܽ:I

    if-ge v1, v2, :cond_0

    .line 93
    iget-object v2, p0, Ll/ۖ۠֫;->ᩳ:Ljava/util/ArrayList;

    .line 94
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܶ֫;

    iget-boolean v3, p0, Ll/ۖ۠֫;->ۧ:Z

    .line 95
    invoke-interface {v2, v0, v3, p1}, Ll/֡ܶ֫;->֫(Ll/ۗ۠֫;ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
