.class public final enum Lcom/amazonaws/ServiceNameFactory;
.super Ljava/lang/Enum;
.source "ServiceNameFactory.java"


# static fields
.field public static final synthetic ᩸:[Lcom/amazonaws/ServiceNameFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/amazonaws/ServiceNameFactory;

    .line 24
    sput-object v0, Lcom/amazonaws/ServiceNameFactory;->᩸:[Lcom/amazonaws/ServiceNameFactory;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/ServiceNameFactory;
    .locals 1

    .line 24
    const-class v0, Lcom/amazonaws/ServiceNameFactory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/ServiceNameFactory;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/ServiceNameFactory;
    .locals 1

    .line 24
    sget-object v0, Lcom/amazonaws/ServiceNameFactory;->᩸:[Lcom/amazonaws/ServiceNameFactory;

    invoke-virtual {v0}, [Lcom/amazonaws/ServiceNameFactory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/ServiceNameFactory;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-static {}, Lcom/amazonaws/internal/config/InternalConfig$Factory;->֫()Lcom/amazonaws/internal/config/InternalConfig;

    move-result-object v0

    .line 36
    invoke-virtual {v0, p0}, Lcom/amazonaws/internal/config/InternalConfig;->֫(Ljava/lang/String;)Lcom/amazonaws/internal/config/HttpClientConfig;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/config/HttpClientConfig;->֫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
