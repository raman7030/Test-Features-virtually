.class public final Ll/ۙᩴ۠;
.super Ljava/lang/Object;
.source "Y43E"

# interfaces
.implements Ll/ᩳ᩹۠;


# instance fields
.field public final ֫:Ljava/io/PrintWriter;


# direct methods
.method public constructor <init>(Ljava/io/PrintWriter;)V
    .locals 0

    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    iput-object p1, p0, Ll/ۙᩴ۠;->֫:Ljava/io/PrintWriter;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢᩴ֨;)V
    .locals 3

    const-string v0, "requires "

    .line 392
    iget-object v1, p0, Ll/ۙᩴ۠;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 302
    iget-object v0, p1, Ll/ۢᩴ֨;->֫:Ljava/util/Set;

    sget-object v2, Ll/ۡᩴ֨;->ۗ:Ll/ۡᩴ֨;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "static "

    .line 394
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 307
    :cond_0
    sget-object v2, Ll/ۡᩴ֨;->۫:Ll/ۡᩴ֨;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "transitive "

    .line 396
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 312
    :cond_1
    iget-object p1, p1, Ll/ۢᩴ֨;->ۧ:Ll/֡֡֨;

    .line 471
    iget-object p1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 397
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ܺᩴ֨;)V
    .locals 2

    const-string v0, "uses "

    .line 404
    iget-object v1, p0, Ll/ۙᩴ۠;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 344
    iget-object p1, p1, Ll/ܺᩴ֨;->֫:Ll/ܳ֡֨;

    .line 1370
    iget-object p1, p1, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 405
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ܿᩴ֨;)V
    .locals 3

    const-string v0, "exports "

    .line 364
    iget-object v1, p0, Ll/ۙᩴ۠;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 130
    iget-object v0, p1, Ll/ܿᩴ֨;->ܽ:Ll/۠֡֨;

    .line 1167
    iget-object v0, v0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    .line 365
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 135
    iget-object p1, p1, Ll/ܿᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 137
    :cond_0
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const-string v0, " to "

    .line 411
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 417
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۜ۬ۚ;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Ll/ۜ۬ۚ;-><init>(I)V

    .line 418
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    const-string v0, ", "

    .line 419
    invoke-static {v0}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 417
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩷ᩴ֨;)V
    .locals 3

    const-string v0, "provides "

    .line 382
    iget-object v1, p0, Ll/ۙᩴ۠;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    iget-object v0, p1, Ll/᩷ᩴ֨;->ۧ:Ll/ܳ֡֨;

    .line 1370
    iget-object v0, v0, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 383
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " with "

    .line 384
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 250
    iget-object p1, p1, Ll/᩷ᩴ֨;->֫:Ll/ۖܶ۠;

    .line 417
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۜ۬ۚ;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Ll/ۜ۬ۚ;-><init>(I)V

    .line 418
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    const-string v0, ", "

    .line 419
    invoke-static {v0}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 417
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/᩻ᩴ֨;)V
    .locals 3

    const-string v0, "opens "

    .line 373
    iget-object v1, p0, Ll/ۙᩴ۠;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 201
    iget-object v0, p1, Ll/᩻ᩴ֨;->ܽ:Ll/۠֡֨;

    .line 1167
    iget-object v0, v0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    .line 374
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 206
    iget-object p1, p1, Ll/᩻ᩴ֨;->ۧ:Ll/ۖܶ۠;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 208
    :cond_0
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const-string v0, " to "

    .line 411
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 417
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۜ۬ۚ;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Ll/ۜ۬ۚ;-><init>(I)V

    .line 418
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    const-string v0, ", "

    .line 419
    invoke-static {v0}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 417
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
