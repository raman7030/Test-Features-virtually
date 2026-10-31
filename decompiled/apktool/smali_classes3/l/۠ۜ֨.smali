.class public final Ll/۠ۜ֨;
.super Ll/ۚۜ֨;
.source "M1SL"


# instance fields
.field public final ܽ:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    .line 11
    iput v0, p0, Ll/ۚۜ֨;->ۧ:I

    const-string v0, "SHA-256"

    .line 12
    iput-object v0, p0, Ll/ۚۜ֨;->֫:Ljava/lang/String;

    .line 13
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۜ֨;->ܽ:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public final ֫([BII)V
    .locals 1

    .line 18
    iget-object v0, p0, Ll/۠ۜ֨;->ܽ:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method

.method public final ֫()[B
    .locals 2

    .line 23
    iget-object v0, p0, Ll/۠ۜ֨;->ܽ:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 24
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    return-object v1
.end method
