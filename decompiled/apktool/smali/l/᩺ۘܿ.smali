.class public final Ll/᩺ۘܿ;
.super Ljava/lang/Object;
.source "YAOM"

# interfaces
.implements Ll/۬ᩴܿ;


# instance fields
.field public final synthetic ֫:Ll/᩶֫ᩳ;

.field public final synthetic ۧ:Z


# direct methods
.method public constructor <init>(Ll/᩶֫ᩳ;Z)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۘܿ;->֫:Ll/᩶֫ᩳ;

    iput-boolean p2, p0, Ll/᩺ۘܿ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final afterFinish()V
    .locals 0

    return-void
.end method

.method public final beforeStart()V
    .locals 0

    return-void
.end method

.method public final getId()Ljava/lang/String;
    .locals 3

    .line 134
    iget-boolean v0, p0, Ll/᩺ۘܿ;->ۧ:Z

    iget-object v1, p0, Ll/᩺ۘܿ;->֫:Ll/᩶֫ᩳ;

    if-nez v1, :cond_0

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ":null:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 137
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/᩶֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onError(Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onFinish()V
    .locals 0

    return-void
.end method

.method public final onStart()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 89
    iget-object v0, p0, Ll/᩺ۘܿ;->֫:Ll/᩶֫ᩳ;

    if-eqz v0, :cond_4

    .line 90
    invoke-virtual {v0}, Ll/᩶֫ᩳ;->ܿ()V

    .line 92
    invoke-virtual {v0}, Ll/᩶֫ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ֫ᩳ;

    .line 94
    iget-boolean v3, p0, Ll/᩺ۘܿ;->ۧ:Z

    if-eqz v3, :cond_1

    .line 95
    invoke-virtual {v2}, Ll/ۗ֫ᩳ;->ۧ()Ljava/lang/String;

    move-result-object v3

    .line 96
    invoke-virtual {v2}, Ll/ۗ֫ᩳ;->֫()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v2}, Ll/ۗ֫ᩳ;->֫()Ljava/lang/String;

    move-result-object v3

    .line 99
    invoke-virtual {v2}, Ll/ۗ֫ᩳ;->ۧ()Ljava/lang/String;

    move-result-object v2

    .line 101
    :goto_0
    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-nez v1, :cond_2

    move-object v1, v2

    .line 105
    :cond_2
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_3
    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    const-string p1, "???"

    return-object p1
.end method
