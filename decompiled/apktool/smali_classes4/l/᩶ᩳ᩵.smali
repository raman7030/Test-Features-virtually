.class public final enum Ll/᩶ᩳ᩵;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum ALL:Ll/᩶ᩳ᩵;

.field public static final enum ANY:Ll/᩶ᩳ᩵;

.field public static final enum NONE:Ll/᩶ᩳ᩵;

.field public static final synthetic c:[Ll/᩶ᩳ᩵;


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 52
    new-instance v0, Ll/᩶ᩳ᩵;

    const-string v1, "ANY"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Ll/᩶ᩳ᩵;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Ll/᩶ᩳ᩵;->ANY:Ll/᩶ᩳ᩵;

    .line 55
    new-instance v1, Ll/᩶ᩳ᩵;

    const-string v4, "ALL"

    invoke-direct {v1, v4, v3, v2, v2}, Ll/᩶ᩳ᩵;-><init>(Ljava/lang/String;IZZ)V

    sput-object v1, Ll/᩶ᩳ᩵;->ALL:Ll/᩶ᩳ᩵;

    .line 58
    new-instance v4, Ll/᩶ᩳ᩵;

    const-string v5, "NONE"

    const/4 v6, 0x2

    invoke-direct {v4, v5, v6, v3, v2}, Ll/᩶ᩳ᩵;-><init>(Ljava/lang/String;IZZ)V

    sput-object v4, Ll/᩶ᩳ᩵;->NONE:Ll/᩶ᩳ᩵;

    const/4 v5, 0x3

    new-array v5, v5, [Ll/᩶ᩳ᩵;

    aput-object v0, v5, v2

    aput-object v1, v5, v3

    aput-object v4, v5, v6

    .line 50
    sput-object v5, Ll/᩶ᩳ᩵;->c:[Ll/᩶ᩳ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    iput-boolean p3, p0, Ll/᩶ᩳ᩵;->a:Z

    .line 66
    iput-boolean p4, p0, Ll/᩶ᩳ᩵;->b:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶ᩳ᩵;
    .locals 1

    .line 50
    const-class v0, Ll/᩶ᩳ᩵;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶ᩳ᩵;

    return-object p0
.end method

.method public static values()[Ll/᩶ᩳ᩵;
    .locals 1

    .line 50
    sget-object v0, Ll/᩶ᩳ᩵;->c:[Ll/᩶ᩳ᩵;

    invoke-virtual {v0}, [Ll/᩶ᩳ᩵;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ᩳ᩵;

    return-object v0
.end method
