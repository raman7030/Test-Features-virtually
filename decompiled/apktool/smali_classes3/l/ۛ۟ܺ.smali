.class public final Ll/ۛ۟ܺ;
.super Ll/᩺۟ܺ;
.source "A7QO"


# instance fields
.field public final ᩳ:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ll/᩺۟ܺ;-><init>()V

    .line 145
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ۟ܺ;->ᩳ:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܽ۫ᩴ;
    .locals 3

    .line 150
    iget-object v0, p0, Ll/ۛ۟ܺ;->ᩳ:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 150
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟۟ܺ;

    .line 44
    iget-object v1, v1, Ll/۟۟ܺ;->֫:Ll/ܽ۫ᩴ;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 152
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v0

    return-object v0

    .line 155
    :cond_1
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩺۟ܺ;)Ll/᩺۟ܺ;
    .locals 2

    .line 160
    instance-of v0, p1, Ll/ۛ۟ܺ;

    if-nez v0, :cond_0

    return-object p1

    .line 163
    :cond_0
    new-instance v0, Ll/ۛ۟ܺ;

    check-cast p1, Ll/ۛ۟ܺ;

    iget-object p1, p1, Ll/ۛ۟ܺ;->ᩳ:Ll/ܳ۬ܺ;

    .line 164
    iget-object v1, p0, Ll/ۛ۟ܺ;->ᩳ:Ll/ܳ۬ܺ;

    invoke-static {v1, p1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۛ۟ܺ;-><init>(Ljava/lang/Iterable;)V

    return-object v0
.end method
