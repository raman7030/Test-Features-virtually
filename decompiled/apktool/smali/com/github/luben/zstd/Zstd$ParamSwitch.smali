.class public final enum Lcom/github/luben/zstd/Zstd$ParamSwitch;
.super Ljava/lang/Enum;
.source "Zstd.java"


# static fields
.field public static final synthetic $VALUES:[Lcom/github/luben/zstd/Zstd$ParamSwitch;

.field public static final enum AUTO:Lcom/github/luben/zstd/Zstd$ParamSwitch;

.field public static final enum DISABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;

.field public static final enum ENABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;


# instance fields
.field public val:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 24
    new-instance v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/github/luben/zstd/Zstd$ParamSwitch;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->AUTO:Lcom/github/luben/zstd/Zstd$ParamSwitch;

    .line 28
    new-instance v1, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const-string v3, "ENABLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/github/luben/zstd/Zstd$ParamSwitch;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/github/luben/zstd/Zstd$ParamSwitch;->ENABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;

    .line 32
    new-instance v3, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const-string v5, "DISABLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/github/luben/zstd/Zstd$ParamSwitch;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/github/luben/zstd/Zstd$ParamSwitch;->DISABLE:Lcom/github/luben/zstd/Zstd$ParamSwitch;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/github/luben/zstd/Zstd$ParamSwitch;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 20
    sput-object v5, Lcom/github/luben/zstd/Zstd$ParamSwitch;->$VALUES:[Lcom/github/luben/zstd/Zstd$ParamSwitch;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 36
    iput p3, p0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->val:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/luben/zstd/Zstd$ParamSwitch;
    .locals 1

    .line 20
    const-class v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/github/luben/zstd/Zstd$ParamSwitch;

    return-object p0
.end method

.method public static values()[Lcom/github/luben/zstd/Zstd$ParamSwitch;
    .locals 1

    .line 20
    sget-object v0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->$VALUES:[Lcom/github/luben/zstd/Zstd$ParamSwitch;

    invoke-virtual {v0}, [Lcom/github/luben/zstd/Zstd$ParamSwitch;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/github/luben/zstd/Zstd$ParamSwitch;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/github/luben/zstd/Zstd$ParamSwitch;->val:I

    return v0
.end method
