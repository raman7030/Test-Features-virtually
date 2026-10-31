.class public final Ll/᩸۬ۘ;
.super Ll/᩶۬ۘ;
.source "A8XS"

# interfaces
.implements Ll/֨۬ۘ;


# instance fields
.field public final ܳ:Ll/᩸۬ۘ;

.field public ܿ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ll/᩸۬ۘ;)V
    .locals 0

    .line 129
    invoke-direct {p0, p3, p2, p1}, Ll/᩶۬ۘ;-><init>(Ljava/util/Map;ILjava/lang/String;)V

    .line 130
    iput-object p4, p0, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    return-void
.end method


# virtual methods
.method public final attributes()Ljava/util/Map;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/᩶۬ۘ;->֫:Ljava/util/Map;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BlockImpl{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶۬ۘ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶۬ۘ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", attributes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶۬ۘ;->֫:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    iget-object v1, p0, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", children="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸۬ۘ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֨۬ۘ;
    .locals 0

    return-object p0
.end method

.method public final ֫(I)V
    .locals 2

    .line 135
    invoke-virtual {p0}, Ll/᩶۬ۘ;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    iput p1, p0, Ll/᩶۬ۘ;->ۧ:I

    .line 137
    iget-object v0, p0, Ll/᩸۬ۘ;->ܿ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸۬ۘ;

    .line 139
    invoke-virtual {v1, p1}, Ll/᩸۬ۘ;->֫(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/֨۬ۘ;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/List;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/᩸۬ۘ;->ܿ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 161
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 163
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
