.class public final Ll/֫᩺ۖ;
.super Ll/ܽۨۖ;
.source "E9H5"


# instance fields
.field public ܿ:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۜ()[B
    .locals 1

    .line 41
    iget-object v0, p0, Ll/֫᩺ۖ;->ܿ:[B

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 2

    const/4 v0, 0x2

    .line 31
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 32
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    .line 33
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v1

    if-lez v0, :cond_0

    .line 35
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 280
    new-array v0, v1, [B

    .line 293
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 36
    iput-object v0, p0, Ll/֫᩺ۖ;->ܿ:[B

    :cond_0
    return-void
.end method
