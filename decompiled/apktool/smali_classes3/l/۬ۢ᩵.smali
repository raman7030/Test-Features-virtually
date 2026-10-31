.class public final Ll/۬ۢ᩵;
.super Ljava/lang/Object;
.source "29YC"


# static fields
.field public static final ֫:I

.field public static final ۧ:I

.field public static final ܽ:Ljava/lang/String;

.field public static final ܿ:I

.field public static final ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "net.mdns.ipv4"

    const-string v1, "224.0.0.251"

    .line 16
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۬ۢ᩵;->ܽ:Ljava/lang/String;

    const-string v0, "net.mdns.ipv6"

    const-string v1, "FF02::FB"

    .line 17
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۬ۢ᩵;->ᩳ:Ljava/lang/String;

    const-string v0, "net.mdns.port"

    const/16 v1, 0x14e9

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Ll/۬ۢ᩵;->ܿ:I

    const-string v0, "net.dns.ttl"

    const/16 v1, 0xe10

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Ll/۬ۢ᩵;->ۧ:I

    mul-int/lit16 v0, v0, 0x1f4

    .line 55
    sput v0, Ll/۬ۢ᩵;->֫:I

    return-void
.end method
