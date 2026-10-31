.class public final enum Ll/᩷ۙᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum FULL:Ll/᩷ۙᩴ;

.field public static final enum FULL_STANDALONE:Ll/᩷ۙᩴ;

.field public static final enum NARROW:Ll/᩷ۙᩴ;

.field public static final enum NARROW_STANDALONE:Ll/᩷ۙᩴ;

.field public static final enum SHORT:Ll/᩷ۙᩴ;

.field public static final enum SHORT_STANDALONE:Ll/᩷ۙᩴ;

.field public static final synthetic b:[Ll/᩷ۙᩴ;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 96
    new-instance v0, Ll/᩷ۙᩴ;

    const-string v1, "FULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/᩷ۙᩴ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    .line 101
    new-instance v1, Ll/᩷ۙᩴ;

    const-string v3, "FULL_STANDALONE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Ll/᩷ۙᩴ;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ll/᩷ۙᩴ;->FULL_STANDALONE:Ll/᩷ۙᩴ;

    .line 106
    new-instance v3, Ll/᩷ۙᩴ;

    const-string v5, "SHORT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Ll/᩷ۙᩴ;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    .line 111
    new-instance v5, Ll/᩷ۙᩴ;

    const-string v7, "SHORT_STANDALONE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v4}, Ll/᩷ۙᩴ;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ll/᩷ۙᩴ;->SHORT_STANDALONE:Ll/᩷ۙᩴ;

    .line 116
    new-instance v7, Ll/᩷ۙᩴ;

    const-string v9, "NARROW"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v4}, Ll/᩷ۙᩴ;-><init>(Ljava/lang/String;II)V

    sput-object v7, Ll/᩷ۙᩴ;->NARROW:Ll/᩷ۙᩴ;

    .line 121
    new-instance v9, Ll/᩷ۙᩴ;

    const-string v11, "NARROW_STANDALONE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v4}, Ll/᩷ۙᩴ;-><init>(Ljava/lang/String;II)V

    sput-object v9, Ll/᩷ۙᩴ;->NARROW_STANDALONE:Ll/᩷ۙᩴ;

    const/4 v11, 0x6

    new-array v11, v11, [Ll/᩷ۙᩴ;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 88
    sput-object v11, Ll/᩷ۙᩴ;->b:[Ll/᩷ۙᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 126
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 128
    iput p3, p0, Ll/᩷ۙᩴ;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩷ۙᩴ;
    .locals 1

    .line 88
    const-class v0, Ll/᩷ۙᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩷ۙᩴ;

    return-object p0
.end method

.method public static values()[Ll/᩷ۙᩴ;
    .locals 1

    .line 88
    sget-object v0, Ll/᩷ۙᩴ;->b:[Ll/᩷ۙᩴ;

    invoke-virtual {v0}, [Ll/᩷ۙᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷ۙᩴ;

    return-object v0
.end method
