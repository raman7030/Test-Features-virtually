.class public final Ll/֨ۖۘ;
.super Ljava/lang/Object;
.source "KAYQ"

# interfaces
.implements Ll/᩹ۢۘ;


# instance fields
.field public ֫:Ljava/security/SecureRandom;

.field public ۧ:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 32
    iput-object v0, p0, Ll/֨ۖۘ;->ۧ:[B

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Ll/֨ۖۘ;->֫:Ljava/security/SecureRandom;

    .line 46
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Ll/֨ۖۘ;->֫:Ljava/security/SecureRandom;

    return-void
.end method


# virtual methods
.method public final ֫(II[B)V
    .locals 2

    .line 64
    iget-object v0, p0, Ll/֨ۖۘ;->ۧ:[B

    array-length v0, v0

    if-le p2, v0, :cond_0

    .line 65
    new-array v0, p2, [B

    iput-object v0, p0, Ll/֨ۖۘ;->ۧ:[B

    .line 67
    :cond_0
    iget-object v0, p0, Ll/֨ۖۘ;->֫:Ljava/security/SecureRandom;

    iget-object v1, p0, Ll/֨ۖۘ;->ۧ:[B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 68
    iget-object v0, p0, Ll/֨ۖۘ;->ۧ:[B

    const/4 v1, 0x0

    invoke-static {v0, v1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
