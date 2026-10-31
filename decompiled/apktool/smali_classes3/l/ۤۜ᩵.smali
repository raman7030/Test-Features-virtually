.class public abstract Ll/ۤۜ᩵;
.super Ljava/lang/Object;
.source "M9Z3"

# interfaces
.implements Ljava/lang/Cloneable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 33
    invoke-virtual {p0}, Ll/ۤۜ᩵;->clone()Ll/ۤۜ᩵;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/ۤۜ᩵;
    .locals 1

    .line 624
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۜ᩵;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract ֡()Ljava/lang/String;
.end method

.method public abstract ֨()Ljava/lang/String;
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ֫(Ll/ۤۜ᩵;)Z
.end method

.method public abstract ۖ()Ljava/lang/String;
.end method

.method public abstract ۘ()Ljava/lang/String;
.end method

.method public abstract ۚ()[B
.end method

.method public abstract ۜ()[Ljava/net/Inet6Address;
.end method

.method public abstract ۠()I
.end method

.method public abstract ۡ()I
.end method

.method public abstract ۢ()Ljava/lang/String;
.end method

.method public abstract ܳ()Ljava/net/Inet6Address;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract ܶ()Z
.end method

.method public abstract ܺ()I
.end method

.method public abstract ܽ()Ljava/lang/String;
.end method

.method public abstract ܿ()[Ljava/net/Inet4Address;
.end method

.method public abstract ᩳ()Ljava/net/Inet4Address;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract ᩵()Ljava/lang/String;
.end method

.method public abstract ᩷()[Ljava/net/InetAddress;
.end method

.method public abstract ᩹()Z
.end method
