.class public final Ll/᩸᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"

# interfaces
.implements Ll/ۚ᩵ܺ;


# instance fields
.field public ֫:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1667
    iput-object p1, p0, Ll/᩸᩵ܺ;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1696
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "not("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸᩵ܺ;->֫:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 3

    .line 1686
    iget-object v0, p0, Ll/᩸᩵ܺ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/high16 v1, -0x80000000

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ᩵ܺ;

    .line 1687
    iget v2, v2, Ll/ۤ᩵ܺ;->ۧ:I

    if-le v2, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final ֫(Ll/᩵ۚܺ;)Z
    .locals 2

    .line 1675
    iget-object v0, p0, Ll/᩸᩵ܺ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩵ܺ;

    .line 1676
    invoke-static {v1, p1}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;Ll/᩵ۚܺ;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
