.class public final enum Lcom/amazonaws/Protocol;
.super Ljava/lang/Enum;
.source "Protocol.java"


# static fields
.field public static final enum ۙ:Lcom/amazonaws/Protocol;

.field public static final enum ᩶:Lcom/amazonaws/Protocol;

.field public static final synthetic ᩹:[Lcom/amazonaws/Protocol;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 33
    new-instance v0, Lcom/amazonaws/Protocol;

    const-string v1, "http"

    const-string v2, "HTTP"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/amazonaws/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/amazonaws/Protocol;->᩶:Lcom/amazonaws/Protocol;

    .line 40
    new-instance v1, Lcom/amazonaws/Protocol;

    const-string v2, "https"

    const-string v4, "HTTPS"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/amazonaws/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/amazonaws/Protocol;->ۙ:Lcom/amazonaws/Protocol;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/amazonaws/Protocol;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    .line 26
    sput-object v2, Lcom/amazonaws/Protocol;->᩹:[Lcom/amazonaws/Protocol;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 45
    iput-object p3, p0, Lcom/amazonaws/Protocol;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/Protocol;
    .locals 1

    .line 26
    const-class v0, Lcom/amazonaws/Protocol;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/Protocol;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/Protocol;
    .locals 1

    .line 26
    sget-object v0, Lcom/amazonaws/Protocol;->᩹:[Lcom/amazonaws/Protocol;

    invoke-virtual {v0}, [Lcom/amazonaws/Protocol;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/Protocol;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/amazonaws/Protocol;->᩸:Ljava/lang/String;

    return-object v0
.end method
