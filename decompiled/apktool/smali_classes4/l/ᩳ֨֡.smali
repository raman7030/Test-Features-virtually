.class public final Ll/ᩳ֨֡;
.super Ljava/lang/Object;
.source "D7S4"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)Ll/ᩳ֨֡;
    .locals 2

    .line 27
    new-instance v0, Ll/ᩳ֨֡;

    invoke-direct {v0}, Ll/ᩳ֨֡;-><init>()V

    .line 28
    iget-object v1, v0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 46
    :goto_0
    iget-object v2, p0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    if-eqz v1, :cond_0

    const/16 v3, 0xa

    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ֨֡;

    invoke-virtual {v2}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܽ֨֡;)V
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 3

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    iget-object v1, p0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ֨֡;

    .line 58
    invoke-virtual {v2}, Ll/ܽ֨֡;->ۧ()Ll/᩶ۚ֡;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 60
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳ֨֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method
