.class public final Ll/ۘܰۢ;
.super Ljava/lang/Object;
.source "N6PY"

# interfaces
.implements Ll/᩺ܿ֡;


# instance fields
.field public final ֫:Ll/ۖܰۢ;

.field public ۧ:I

.field public final ܽ:Ll/ۨܿ֡;


# direct methods
.method public constructor <init>(Ll/ۨܿ֡;Ll/ۖܰۢ;)V
    .locals 0

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    iput-object p1, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    .line 267
    iput-object p2, p0, Ll/ۘܰۢ;->֫:Ll/ۖܰۢ;

    return-void
.end method


# virtual methods
.method public final index()I
    .locals 1

    .line 287
    iget-object v0, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    invoke-virtual {v0}, Ll/ۨܿ֡;->index()I

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    .line 291
    iget-object v0, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    invoke-virtual {v0}, Ll/ۨܿ֡;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(Ll/ܳ᩷֡;)Ljava/lang/String;
    .locals 1

    .line 295
    iget-object v0, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    invoke-virtual {v0, p1}, Ll/ۨܿ֡;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    invoke-virtual {v0, p1}, Ll/ۨܿ֡;->֫(I)V

    return-void
.end method

.method public final ۧ(I)I
    .locals 1

    .line 278
    iget v0, p0, Ll/ۘܰۢ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۘܰۢ;->ۧ:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘܰۢ;->֫:Ll/ۖܰۢ;

    invoke-virtual {v0}, Ll/ۖܰۢ;->֫()V

    .line 279
    :cond_0
    iget-object v0, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    invoke-virtual {v0, p1}, Ll/ۨܿ֡;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    .line 272
    iget v0, p0, Ll/ۘܰۢ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۘܰۢ;->ۧ:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘܰۢ;->֫:Ll/ۖܰۢ;

    invoke-virtual {v0}, Ll/ۖܰۢ;->֫()V

    .line 273
    :cond_0
    iget-object v0, p0, Ll/ۘܰۢ;->ܽ:Ll/ۨܿ֡;

    invoke-virtual {v0}, Ll/ۨܿ֡;->ۧ()V

    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    return-void
.end method
