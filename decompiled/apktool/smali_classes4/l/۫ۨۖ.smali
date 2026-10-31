.class public final Ll/۫ۨۖ;
.super Ll/ܽۨۖ;
.source "B9H2"


# instance fields
.field public ܿ:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۜ()[B
    .locals 1

    .line 63
    iget-object v0, p0, Ll/۫ۨۖ;->ܿ:[B

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 5

    const/4 v0, 0x2

    .line 38
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 39
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 40
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 293
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    new-array v1, v0, [B

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 43
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v0

    .line 44
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v1

    .line 45
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v2

    .line 46
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v3

    const/4 v4, 0x4

    .line 47
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->ܿ(I)V

    .line 48
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->ܿ(I)V

    if-lez v1, :cond_0

    .line 51
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 52
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ܽ(I)[B

    :cond_0
    if-lez v3, :cond_1

    .line 56
    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 280
    new-array v0, v3, [B

    .line 293
    invoke-virtual {p1, v3, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 57
    iput-object v0, p0, Ll/۫ۨۖ;->ܿ:[B

    :cond_1
    return-void
.end method
