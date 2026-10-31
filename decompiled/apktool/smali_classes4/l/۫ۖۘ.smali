.class public final Ll/۫ۖۘ;
.super Ll/ۤۖۘ;
.source "I7UY"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final update([B)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۤۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    return-void
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ecdsa-sha2-nistp521"

    return-object v0
.end method
