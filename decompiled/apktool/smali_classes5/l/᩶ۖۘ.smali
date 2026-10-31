.class public final Ll/᩶ۖۘ;
.super Ljava/lang/Object;
.source "67V1"

# interfaces
.implements Ll/ۖ᩷ۘ;


# instance fields
.field public ֫:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBlockSize()I
    .locals 1

    const/16 v0, 0x40

    return v0
.end method

.method public final init()V
    .locals 1

    const-string v0, "SHA-512"

    .line 42
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۖۘ;->֫:Ljava/security/MessageDigest;

    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    const-string v0, "SHA512"

    return-object v0
.end method

.method public final ֫(I[B)V
    .locals 2

    const/4 v0, 0x0

    .line 47
    iget-object v1, p0, Ll/᩶ۖۘ;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v1, p2, v0, p1}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 52
    iget-object v0, p0, Ll/᩶ۖۘ;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    return-object v0
.end method
