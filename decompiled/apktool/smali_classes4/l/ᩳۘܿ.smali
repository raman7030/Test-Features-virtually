.class public final Ll/ᩳۘܿ;
.super Ljava/lang/Object;
.source "26NV"


# instance fields
.field public final ֫:Ll/ܶۘܿ;

.field public final ۧ:Ll/ۨۖܿ;

.field public final ܽ:Ll/ܽۘܿ;


# direct methods
.method public constructor <init>(Ll/ܽۘܿ;Ll/ۨۖܿ;Ll/ܶۘܿ;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-virtual {p1}, Ll/ܽۘܿ;->֫()Ll/᩺ܺܿ;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۨۖܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ll/ܽۘܿ;->ۧ()I

    move-result v0

    invoke-virtual {p2}, Ll/ۨۖܿ;->ܽ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 14
    invoke-virtual {p3}, Ll/ܶۘܿ;->ܿ()I

    move-result v0

    invoke-virtual {p1}, Ll/ܽۘܿ;->ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 17
    iput-object p1, p0, Ll/ᩳۘܿ;->ܽ:Ll/ܽۘܿ;

    .line 18
    iput-object p2, p0, Ll/ᩳۘܿ;->ۧ:Ll/ۨۖܿ;

    .line 19
    iput-object p3, p0, Ll/ᩳۘܿ;->֫:Ll/ܶۘܿ;

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window reuse metadata identity differs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ܶۘܿ;)Ll/ᩳۘܿ;
    .locals 7

    .line 24
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܿ()I

    move-result v0

    iget-object v1, p0, Ll/ᩳۘܿ;->֫:Ll/ܶۘܿ;

    invoke-virtual {v1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 28
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 29
    new-instance v2, Ll/۠ۘܿ;

    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v3

    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v4

    .line 30
    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ۧ(I)I

    move-result v5

    invoke-virtual {p1, v0}, Ll/ܶۘܿ;->ܽ(I)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-direct {v2, v3, v4, v5}, Ll/۠ۘܿ;-><init>(III)V

    .line 29
    invoke-virtual {v1, v2}, Ll/ܶۘܿ;->֫(Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v1

    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Ll/ᩳۘܿ;

    iget-object v0, p0, Ll/ᩳۘܿ;->ܽ:Ll/ܽۘܿ;

    iget-object v2, p0, Ll/ᩳۘܿ;->ۧ:Ll/ۨۖܿ;

    invoke-direct {p1, v0, v2, v1}, Ll/ᩳۘܿ;-><init>(Ll/ܽۘܿ;Ll/ۨۖܿ;Ll/ܶۘܿ;)V

    return-object p1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Window reuse edit chain differs"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
