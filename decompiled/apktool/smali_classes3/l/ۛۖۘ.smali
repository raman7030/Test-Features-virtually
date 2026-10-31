.class public final Ll/ۛۖۘ;
.super Ll/ۨۖۘ;
.source "X7Z6"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final sign()[B
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۨۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ssh-rsa"

    return-object v0
.end method
