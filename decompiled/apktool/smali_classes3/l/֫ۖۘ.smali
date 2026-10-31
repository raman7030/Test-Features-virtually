.class public Ll/֫ۖۘ;
.super Ll/ܽۖۘ;
.source "Q7WJ"


# instance fields
.field public final ܳ:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ll/ܽۖۘ;-><init>()V

    const/16 v0, 0x14

    new-array v0, v0, [B

    .line 40
    iput-object v0, p0, Ll/֫ۖۘ;->ܳ:[B

    return-void
.end method


# virtual methods
.method public final getBlockSize()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final ۧ(I[B)V
    .locals 3

    const/4 v0, 0x0

    .line 44
    iget-object v1, p0, Ll/֫ۖۘ;->ܳ:[B

    invoke-super {p0, v0, v1}, Ll/ۛܺۘ;->ۧ(I[B)V

    const/16 v2, 0xc

    .line 45
    invoke-static {v1, v0, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
