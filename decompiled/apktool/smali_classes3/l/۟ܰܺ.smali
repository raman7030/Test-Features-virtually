.class public final enum Ll/۟ܰܺ;
.super Ljava/lang/Enum;
.source "L7NW"

# interfaces
.implements Ll/۫۟ܺ;


# static fields
.field public static final synthetic ᩸:[Ll/۟ܰܺ;

.field public static final enum ᩹:Ll/۟ܰܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 25
    new-instance v0, Ll/۟ܰܺ;

    const-string v1, "CLOSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۟ܰܺ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۟ܰܺ;->᩹:Ll/۟ܰܺ;

    .line 24
    invoke-static {}, Ll/۟ܰܺ;->֫()[Ll/۟ܰܺ;

    move-result-object v0

    sput-object v0, Ll/۟ܰܺ;->᩸:[Ll/۟ܰܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۟ܰܺ;
    .locals 1

    .line 24
    const-class v0, Ll/۟ܰܺ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۟ܰܺ;

    return-object p0
.end method

.method public static values()[Ll/۟ܰܺ;
    .locals 1

    .line 24
    sget-object v0, Ll/۟ܰܺ;->᩸:[Ll/۟ܰܺ;

    invoke-virtual {v0}, [Ll/۟ܰܺ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۟ܰܺ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/۟ܰܺ;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/۟ܰܺ;

    .line 24
    sget-object v1, Ll/۟ܰܺ;->᩹:Ll/۟ܰܺ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static ۧ()Ll/۫۟ܺ;
    .locals 1

    .line 33
    sget-object v0, Ll/۟ܰܺ;->᩹:Ll/۟ܰܺ;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 43
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/ᩴ۟ܺ;)V
    .locals 0

    .line 38
    invoke-virtual {p1}, Ll/ᩴ۟ܺ;->ۧ()V

    return-void
.end method
