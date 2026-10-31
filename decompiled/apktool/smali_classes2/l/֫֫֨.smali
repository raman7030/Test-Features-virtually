.class public final Ll/֫֫֨;
.super Ljava/lang/Object;
.source "47F8"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫֫֨;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    .line 60
    iget-object v0, p0, Ll/֫֫֨;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 65
    iget-object v0, p0, Ll/֫֫֨;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{ "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/۟۟ۚ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/۟۟ۚ;-><init>(I)V

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    const-string v2, ", "

    invoke-static {v2}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, " }"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 3

    .line 51
    iget-object v0, p0, Ll/֫֫֨;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->֫(I)V

    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֫֨;

    .line 53
    invoke-virtual {v1}, Ll/ܿ֫֨;->ۧ()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->֫(I)V

    .line 54
    invoke-virtual {v1}, Ll/ܿ֫֨;->֫()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->֫(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܿ֫֨;)V
    .locals 1

    .line 46
    iget-object v0, p0, Ll/֫֫֨;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
