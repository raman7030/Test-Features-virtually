.class public final enum Ll/ᩳ᩻֨;
.super Ljava/lang/Enum;
.source "P9JT"


# static fields
.field public static final enum ۗ:Ll/ᩳ᩻֨;

.field public static final enum ۙ:Ll/ᩳ᩻֨;

.field public static final enum ۤ:Ll/ᩳ᩻֨;

.field public static final enum ۫:Ll/ᩳ᩻֨;

.field public static final enum ۬:Ll/ᩳ᩻֨;

.field public static final synthetic ᩶:[Ll/ᩳ᩻֨;


# instance fields
.field public ᩸:I

.field public ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 16
    new-instance v0, Ll/ᩳ᩻֨;

    const/16 v1, 0x28

    const-string v2, "ERROR"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v2}, Ll/ᩳ᩻֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Ll/ᩳ᩻֨;->ۗ:Ll/ᩳ᩻֨;

    new-instance v1, Ll/ᩳ᩻֨;

    const/16 v2, 0x1e

    const-string v4, "WARN"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v4}, Ll/ᩳ᩻֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v1, Ll/ᩳ᩻֨;->ۤ:Ll/ᩳ᩻֨;

    new-instance v2, Ll/ᩳ᩻֨;

    const/16 v4, 0x14

    const-string v6, "INFO"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4, v6}, Ll/ᩳ᩻֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v2, Ll/ᩳ᩻֨;->۬:Ll/ᩳ᩻֨;

    new-instance v4, Ll/ᩳ᩻֨;

    const/16 v6, 0xa

    const-string v8, "DEBUG"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6, v8}, Ll/ᩳ᩻֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Ll/ᩳ᩻֨;->ۙ:Ll/ᩳ᩻֨;

    new-instance v6, Ll/ᩳ᩻֨;

    const-string v8, "TRACE"

    const/4 v10, 0x4

    invoke-direct {v6, v8, v10, v3, v8}, Ll/ᩳ᩻֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v6, Ll/ᩳ᩻֨;->۫:Ll/ᩳ᩻֨;

    const/4 v8, 0x5

    new-array v8, v8, [Ll/ᩳ᩻֨;

    aput-object v0, v8, v3

    aput-object v1, v8, v5

    aput-object v2, v8, v7

    aput-object v4, v8, v9

    aput-object v6, v8, v10

    .line 14
    sput-object v8, Ll/ᩳ᩻֨;->᩶:[Ll/ᩳ᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 22
    iput p3, p0, Ll/ᩳ᩻֨;->᩸:I

    .line 23
    iput-object p4, p0, Ll/ᩳ᩻֨;->᩹:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩳ᩻֨;
    .locals 1

    .line 14
    const-class v0, Ll/ᩳ᩻֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩳ᩻֨;

    return-object p0
.end method

.method public static values()[Ll/ᩳ᩻֨;
    .locals 1

    .line 14
    sget-object v0, Ll/ᩳ᩻֨;->᩶:[Ll/ᩳ᩻֨;

    invoke-virtual {v0}, [Ll/ᩳ᩻֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩳ᩻֨;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ᩳ᩻֨;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public ֫()I
    .locals 1

    .line 27
    iget v0, p0, Ll/ᩳ᩻֨;->᩸:I

    return v0
.end method
