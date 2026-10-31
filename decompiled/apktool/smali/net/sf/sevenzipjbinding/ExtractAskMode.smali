.class public final enum Lnet/sf/sevenzipjbinding/ExtractAskMode;
.super Ljava/lang/Enum;
.source "ExtractAskMode.java"


# static fields
.field public static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum SKIP:Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum TEST:Lnet/sf/sevenzipjbinding/ExtractAskMode;

.field public static final enum UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;


# direct methods
.method public static synthetic $values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 9
    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->TEST:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->SKIP:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v1, "EXTRACT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 19
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v1, "TEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->TEST:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 24
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v1, "SKIP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->SKIP:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 29
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    const-string v1, "UNKNOWN_ASK_MODE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractAskMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    .line 9
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractAskMode;->$values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    move-result-object v0

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getExtractAskModeByIndex(I)Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 1

    if-ltz p0, :cond_0

    .line 38
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractAskMode;->values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    move-result-object v0

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 39
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractAskMode;->values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0

    .line 42
    :cond_0
    sget-object p0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->UNKNOWN_ASK_MODE:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 1

    .line 9
    const-class v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/ExtractAskMode;
    .locals 1

    .line 9
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractAskMode;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractAskMode;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/ExtractAskMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/ExtractAskMode;

    return-object v0
.end method
