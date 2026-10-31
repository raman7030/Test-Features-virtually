.class public final enum Lnet/sf/sevenzipjbinding/ExtractOperationResult;
.super Ljava/lang/Enum;
.source "ExtractOperationResult.java"


# static fields
.field public static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum CRCERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum DATAERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum DATA_AFTER_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum HEADERS_ERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum IS_NOT_ARC:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNAVAILABLE:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNEXPECTED_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum UNSUPPORTEDMETHOD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field public static final enum WRONG_PASSWORD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;


# direct methods
.method public static synthetic $values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 9
    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNSUPPORTEDMETHOD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATAERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->CRCERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNAVAILABLE:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNEXPECTED_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATA_AFTER_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->IS_NOT_ARC:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->HEADERS_ERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->WRONG_PASSWORD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 13
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 18
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "UNSUPPORTEDMETHOD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNSUPPORTEDMETHOD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 23
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "DATAERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATAERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 28
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "CRCERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->CRCERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 33
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "UNAVAILABLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNAVAILABLE:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 38
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "UNEXPECTED_END"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNEXPECTED_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 43
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "DATA_AFTER_END"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->DATA_AFTER_END:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 48
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "IS_NOT_ARC"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->IS_NOT_ARC:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 53
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "HEADERS_ERROR"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->HEADERS_ERROR:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 58
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "WRONG_PASSWORD"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->WRONG_PASSWORD:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 63
    new-instance v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    const-string v1, "UNKNOWN_OPERATION_RESULT"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    .line 9
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->$values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v0

    sput-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getOperationResult(I)Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    if-ltz p0, :cond_0

    .line 72
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v0

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 73
    invoke-static {}, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0

    .line 76
    :cond_0
    sget-object p0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->UNKNOWN_OPERATION_RESULT:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    .line 9
    const-class v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    .line 9
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->$VALUES:[Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/ExtractOperationResult;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object v0
.end method
