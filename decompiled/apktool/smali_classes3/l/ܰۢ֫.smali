.class public final enum Ll/ܰۢ֫;
.super Ljava/lang/Enum;
.source "Y5SN"


# static fields
.field public static final enum ۗ:Ll/ܰۢ֫;

.field public static final enum ۙ:Ll/ܰۢ֫;

.field public static final enum ۬:Ll/ܰۢ֫;

.field public static final enum ᩶:Ll/ܰۢ֫;

.field public static final synthetic ᩸:[Ll/ܰۢ֫;

.field public static final enum ᩹:Ll/ܰۢ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 236
    new-instance v0, Ll/ܰۢ֫;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܰۢ֫;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    .line 243
    new-instance v0, Ll/ܰۢ֫;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ܰۢ֫;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    .line 253
    new-instance v0, Ll/ܰۢ֫;

    const-string v1, "CREATED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ܰۢ֫;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    .line 263
    new-instance v0, Ll/ܰۢ֫;

    const-string v1, "STARTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ܰۢ֫;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    .line 269
    new-instance v0, Ll/ܰۢ֫;

    const-string v1, "RESUMED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ll/ܰۢ֫;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-static {}, Ll/ܰۢ֫;->֫()[Ll/ܰۢ֫;

    move-result-object v0

    sput-object v0, Ll/ܰۢ֫;->᩸:[Ll/ܰۢ֫;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 230
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܰۢ֫;
    .locals 1

    .line 0
    const-class v0, Ll/ܰۢ֫;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܰۢ֫;

    return-object p0
.end method

.method public static values()[Ll/ܰۢ֫;
    .locals 1

    .line 0
    sget-object v0, Ll/ܰۢ֫;->᩸:[Ll/ܰۢ֫;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܰۢ֫;

    return-object v0
.end method

.method public static final synthetic ֫()[Ll/ܰۢ֫;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ll/ܰۢ֫;

    .line 0
    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܰۢ֫;)Z
    .locals 1

    const-string v0, "state"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
