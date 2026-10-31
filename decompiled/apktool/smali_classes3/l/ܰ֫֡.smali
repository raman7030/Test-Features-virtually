.class public final enum Ll/ܰ֫֡;
.super Ljava/lang/Enum;
.source "B4FX"


# static fields
.field public static final enum ۗ:Ll/ܰ֫֡;

.field public static final enum ۙ:Ll/ܰ֫֡;

.field public static final enum ۛ:Ll/ܰ֫֡;

.field public static final enum ۟:Ll/ܰ֫֡;

.field public static final enum ۤ:Ll/ܰ֫֡;

.field public static final enum ۨ:Ll/ܰ֫֡;

.field public static final enum ۫:Ll/ܰ֫֡;

.field public static final enum ۬:Ll/ܰ֫֡;

.field public static final enum ܰ:Ll/ܰ֫֡;

.field public static final enum ᩶:Ll/ܰ֫֡;

.field public static final synthetic ᩹:[Ll/ܰ֫֡;

.field public static final enum ᩺:Ll/ܰ֫֡;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 19

    .line 21
    new-instance v0, Ll/ܰ֫֡;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ܰ֫֡;->᩺:Ll/ܰ֫֡;

    .line 23
    new-instance v1, Ll/ܰ֫֡;

    const-string v2, "PROTOCOL_ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    .line 25
    new-instance v2, Ll/ܰ֫֡;

    const-string v3, "INTERNAL_ERROR"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v2, Ll/ܰ֫֡;->ۨ:Ll/ܰ֫֡;

    .line 27
    new-instance v3, Ll/ܰ֫֡;

    const-string v4, "FLOW_CONTROL_ERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ll/ܰ֫֡;->۫:Ll/ܰ֫֡;

    .line 29
    new-instance v4, Ll/ܰ֫֡;

    const-string v5, "REFUSED_STREAM"

    const/4 v6, 0x4

    const/4 v7, 0x7

    invoke-direct {v4, v5, v6, v7}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v4, Ll/ܰ֫֡;->۟:Ll/ܰ֫֡;

    .line 31
    new-instance v5, Ll/ܰ֫֡;

    const-string v6, "CANCEL"

    const/4 v8, 0x5

    const/16 v9, 0x8

    invoke-direct {v5, v6, v8, v9}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;

    .line 33
    new-instance v6, Ll/ܰ֫֡;

    const-string v8, "COMPRESSION_ERROR"

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/16 v13, 0x9

    invoke-direct {v6, v8, v11, v13}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v6, Ll/ܰ֫֡;->ۙ:Ll/ܰ֫֡;

    .line 35
    new-instance v8, Ll/ܰ֫֡;

    const-string v14, "CONNECT_ERROR"

    const/16 v11, 0xa

    invoke-direct {v8, v14, v7, v11}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v8, Ll/ܰ֫֡;->ۗ:Ll/ܰ֫֡;

    .line 37
    new-instance v7, Ll/ܰ֫֡;

    const-string v14, "ENHANCE_YOUR_CALM"

    const/16 v16, 0x4

    const/16 v15, 0xb

    invoke-direct {v7, v14, v9, v15}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v7, Ll/ܰ֫֡;->۬:Ll/ܰ֫֡;

    .line 39
    new-instance v14, Ll/ܰ֫֡;

    const/16 v17, 0x7

    const-string v9, "INADEQUATE_SECURITY"

    const/16 v18, 0x5

    const/16 v12, 0xc

    invoke-direct {v14, v9, v13, v12}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v14, Ll/ܰ֫֡;->ۛ:Ll/ܰ֫֡;

    .line 41
    new-instance v9, Ll/ܰ֫֡;

    const-string v12, "HTTP_1_1_REQUIRED"

    const/16 v13, 0xd

    invoke-direct {v9, v12, v11, v13}, Ll/ܰ֫֡;-><init>(Ljava/lang/String;II)V

    sput-object v9, Ll/ܰ֫֡;->ۤ:Ll/ܰ֫֡;

    new-array v12, v15, [Ll/ܰ֫֡;

    aput-object v0, v12, v10

    const/4 v0, 0x1

    aput-object v1, v12, v0

    const/4 v0, 0x2

    aput-object v2, v12, v0

    const/4 v0, 0x3

    aput-object v3, v12, v0

    aput-object v4, v12, v16

    aput-object v5, v12, v18

    const/4 v0, 0x6

    aput-object v6, v12, v0

    aput-object v8, v12, v17

    const/16 v0, 0x8

    aput-object v7, v12, v0

    const/16 v0, 0x9

    aput-object v14, v12, v0

    aput-object v9, v12, v11

    .line 19
    sput-object v12, Ll/ܰ֫֡;->᩹:[Ll/ܰ֫֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    iput p3, p0, Ll/ܰ֫֡;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܰ֫֡;
    .locals 1

    .line 19
    const-class v0, Ll/ܰ֫֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܰ֫֡;

    return-object p0
.end method

.method public static values()[Ll/ܰ֫֡;
    .locals 1

    .line 19
    sget-object v0, Ll/ܰ֫֡;->᩹:[Ll/ܰ֫֡;

    invoke-virtual {v0}, [Ll/ܰ֫֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܰ֫֡;

    return-object v0
.end method

.method public static ֫(I)Ll/ܰ֫֡;
    .locals 5

    .line 50
    invoke-static {}, Ll/ܰ֫֡;->values()[Ll/ܰ֫֡;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 51
    iget v4, v3, Ll/ܰ֫֡;->᩸:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
