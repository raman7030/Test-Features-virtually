.class public final enum Ll/ۨ֨ᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum EXECUTE:Ll/ۨ֨ᩴ;

.field public static final enum READ:Ll/ۨ֨ᩴ;

.field public static final enum WRITE:Ll/ۨ֨ᩴ;

.field public static final synthetic a:[Ll/ۨ֨ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 38
    new-instance v0, Ll/ۨ֨ᩴ;

    const-string v1, "READ"

    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 38
    sput-object v0, Ll/ۨ֨ᩴ;->READ:Ll/ۨ֨ᩴ;

    .line 42
    new-instance v1, Ll/ۨ֨ᩴ;

    const-string v3, "WRITE"

    const/4 v4, 0x1

    .line 34
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 42
    sput-object v1, Ll/ۨ֨ᩴ;->WRITE:Ll/ۨ֨ᩴ;

    .line 46
    new-instance v3, Ll/ۨ֨ᩴ;

    const-string v5, "EXECUTE"

    const/4 v6, 0x2

    .line 34
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    sput-object v3, Ll/ۨ֨ᩴ;->EXECUTE:Ll/ۨ֨ᩴ;

    const/4 v5, 0x3

    new-array v5, v5, [Ll/ۨ֨ᩴ;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 34
    sput-object v5, Ll/ۨ֨ᩴ;->a:[Ll/ۨ֨ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۨ֨ᩴ;
    .locals 1

    .line 34
    const-class v0, Ll/ۨ֨ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۨ֨ᩴ;

    return-object p0
.end method

.method public static values()[Ll/ۨ֨ᩴ;
    .locals 1

    .line 34
    sget-object v0, Ll/ۨ֨ᩴ;->a:[Ll/ۨ֨ᩴ;

    invoke-virtual {v0}, [Ll/ۨ֨ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۨ֨ᩴ;

    return-object v0
.end method
