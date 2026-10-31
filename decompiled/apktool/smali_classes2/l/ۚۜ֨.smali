.class public abstract Ll/ۚۜ֨;
.super Ljava/lang/Object;
.source "542M"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I


# direct methods
.method public static ֫(I)Ll/ۚۜ֨;
    .locals 2

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-ne p0, v0, :cond_0

    .line 43
    :try_start_0
    new-instance v0, Ll/۠ۜ֨;

    invoke-direct {v0}, Ll/۠ۜ֨;-><init>()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 49
    :catch_0
    :cond_0
    new-instance v0, Ll/ۢۜ֨;

    const-string v1, "Unsupported Check ID "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 49
    throw v0

    .line 39
    :cond_1
    new-instance p0, Ll/֡ۜ֨;

    invoke-direct {p0}, Ll/֡ۜ֨;-><init>()V

    return-object p0

    .line 36
    :cond_2
    new-instance p0, Ll/᩵ۜ֨;

    invoke-direct {p0}, Ll/᩵ۜ֨;-><init>()V

    return-object p0

    .line 33
    :cond_3
    new-instance p0, Ll/֨ۜ֨;

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Ll/ۚۜ֨;->ۧ:I

    const-string v0, "None"

    .line 10
    iput-object v0, p0, Ll/ۚۜ֨;->֫:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public abstract ֫([BII)V
.end method

.method public abstract ֫()[B
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۚۜ֨;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 22
    iget v0, p0, Ll/ۚۜ֨;->ۧ:I

    return v0
.end method
