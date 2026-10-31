.class public final Ll/᩻ᩴ᩵;
.super Ll/ܿᩴ᩵;
.source "NA1Q"


# instance fields
.field public final ᩳۧ:[B


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;[B)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Ll/ܿᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 40
    iput-object p2, p0, Ll/᩻ᩴ᩵;->ᩳۧ:[B

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 86
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TransCallNamedPipeResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ܿᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֡֫()I
    .locals 1

    .line 84
    iget v0, p0, Ll/ܿᩴ᩵;->ۚ֫:I

    return v0
.end method

.method public final ۧ(II[B)I
    .locals 2

    .line 76
    iget-object v0, p0, Ll/᩻ᩴ᩵;->ᩳۧ:[B

    array-length v1, v0

    if-gt p2, v1, :cond_0

    const/4 v1, 0x0

    .line 79
    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return p2

    .line 77
    :cond_0
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Payload exceeds buffer size"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 77
    throw p1
.end method

.method public final ۧ([B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
