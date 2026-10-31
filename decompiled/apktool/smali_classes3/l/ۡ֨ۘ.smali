.class public final Ll/ۡ֨ۘ;
.super Ll/ۢ֨ۘ;
.source "A88Y"


# instance fields
.field public final ܽ:Ll/ۚ֨ۘ;


# direct methods
.method public constructor <init>(Ll/ۚ֨ۘ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ۢ֨ۘ;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ۡ֨ۘ;->ܽ:Ll/ۚ֨ۘ;

    return-void
.end method


# virtual methods
.method public final ֫([B)I
    .locals 3

    .line 46
    iget-object v0, p0, Ll/ۡ֨ۘ;->ܽ:Ll/ۚ֨ۘ;

    invoke-virtual {v0}, Ll/ۚ֨ۘ;->read()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 47
    array-length v2, v0

    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    array-length p1, v0

    return p1
.end method

.method public final ֫([B[B)I
    .locals 2

    .line 34
    iget-object v0, p0, Ll/ۡ֨ۘ;->ܽ:Ll/ۚ֨ۘ;

    invoke-virtual {v0, p1}, Ll/ۚ֨ۘ;->ۧ([B)[B

    move-result-object p1

    const/4 v0, 0x0

    .line 35
    array-length v1, p1

    invoke-static {p1, v0, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    array-length p1, p1

    return p1
.end method

.method public final ۧ([B)V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۡ֨ۘ;->ܽ:Ll/ۚ֨ۘ;

    invoke-virtual {v0, p1}, Ll/ۚ֨ۘ;->write([B)V

    return-void
.end method
