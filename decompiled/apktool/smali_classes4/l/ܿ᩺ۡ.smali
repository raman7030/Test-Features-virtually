.class public final Ll/ܿ᩺ۡ;
.super Ljava/lang/Object;
.source "UAO5"


# instance fields
.field public ֫:[I

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩺ۡ;->ܽ:Ljava/util/HashMap;

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩺ۡ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Z)Ll/۬ܿܽ;
    .locals 4

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    new-instance v1, Ll/ܺۢᩴ;

    iget-object v2, p0, Ll/ܿ᩺ۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ll/ܺۢᩴ;-><init>(I)V

    .line 42
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->sorted()Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/ۧ᩺ۡ;

    invoke-direct {v3, v0, v1}, Ll/ۧ᩺ۡ;-><init>(Ljava/util/ArrayList;Ll/ܺۢᩴ;)V

    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 46
    invoke-virtual {v1}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v1

    iput-object v1, p0, Ll/ܿ᩺ۡ;->֫:[I

    .line 47
    iget-object v1, p0, Ll/ܿ᩺ۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܿ᩺ᩴ;->sorted()Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ܽ᩺ۡ;

    invoke-direct {v2, v0}, Ll/ܽ᩺ۡ;-><init>(Ljava/util/ArrayList;)V

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 48
    new-instance v1, Ll/۬ܿܽ;

    invoke-direct {v1}, Ll/۬ܿܽ;-><init>()V

    .line 49
    invoke-virtual {v1, p1}, Ll/۬ܿܽ;->֫(Z)V

    const/4 p1, 0x0

    .line 50
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩺ۡ;

    .line 52
    invoke-static {v2, p1}, Ll/ᩳ᩺ۡ;->֫(Ll/ᩳ᩺ۡ;I)V

    .line 53
    invoke-static {v2}, Ll/ᩳ᩺ۡ;->ۧ(Ll/ᩳ᩺ۡ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ֫(ILjava/lang/String;)Ll/ᩳ᩺ۡ;
    .locals 3

    if-nez p1, :cond_0

    .line 28
    invoke-virtual {p0, p2}, Ll/ܿ᩺ۡ;->֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;

    move-result-object p1

    return-object p1

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 31
    iget-object v1, p0, Ll/ܿ᩺ۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩺ۡ;

    if-nez v2, :cond_1

    .line 33
    new-instance v2, Ll/ᩳ᩺ۡ;

    invoke-direct {v2, p2, p1}, Ll/ᩳ᩺ۡ;-><init>(Ljava/lang/String;I)V

    .line 34
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v2
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳ᩺ۡ;
    .locals 3

    .line 18
    iget-object v0, p0, Ll/ܿ᩺ۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩺ۡ;

    if-nez v1, :cond_0

    .line 20
    new-instance v1, Ll/ᩳ᩺ۡ;

    const/4 v2, -0x1

    invoke-direct {v1, p1, v2}, Ll/ᩳ᩺ۡ;-><init>(Ljava/lang/String;I)V

    .line 21
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public final ֫()[I
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ܿ᩺ۡ;->֫:[I

    if-eqz v0, :cond_0

    return-object v0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
