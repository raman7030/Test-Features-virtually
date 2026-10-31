.class public final Ll/ۨ᩵ᩴ;
.super Ll/ۨۘᩴ;
.source "DD2"


# instance fields
.field public final synthetic ᩸:Ll/ۢ֡ᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ֡ᩴ;)V
    .locals 0

    .line 1213
    iput-object p1, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1245
    iget-object v0, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    invoke-virtual {v0}, Ll/ۢ֡ᩴ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1240
    iget-object v0, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    invoke-virtual {v0, p1}, Ll/ۢ֡ᩴ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 1227
    iget-object v0, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    iget-object v1, v0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1228
    iget-object v2, v0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    .line 1229
    iget-boolean v3, v0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v3, :cond_0

    iget v3, v0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object v3, v2, v3

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 1230
    :cond_0
    iget v0, v0, Ll/ۢ֡ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_2

    aget-object v0, v1, v3

    if-eqz v0, :cond_1

    aget-object v0, v2, v3

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    move v0, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 2

    .line 1216
    new-instance v0, Ll/ۜ֡ᩴ;

    iget-object v1, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    invoke-direct {v0, v1}, Ll/ۜ֡ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1235
    iget-object v0, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    iget v0, v0, Ll/ۢ֡ᩴ;->ۨ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۨ᩵ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 2

    .line 1221
    new-instance v0, Ll/᩷֡ᩴ;

    iget-object v1, p0, Ll/ۨ᩵ᩴ;->᩸:Ll/ۢ֡ᩴ;

    invoke-direct {v0, v1}, Ll/᩷֡ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 1213
    invoke-virtual {p0}, Ll/ۨ᩵ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method
