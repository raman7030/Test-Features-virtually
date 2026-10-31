.class public final enum Ll/ܳ۠ᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/᩻۠ᩴ;
.implements Ll/᩺֨ᩴ;


# static fields
.field public static final enum NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

.field public static final synthetic a:[Ll/ܳ۠ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 42
    new-instance v0, Ll/ܳ۠ᩴ;

    const-string v1, "NOFOLLOW_LINKS"

    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 42
    sput-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    aput-object v0, v1, v2

    .line 34
    sput-object v1, Ll/ܳ۠ᩴ;->a:[Ll/ܳ۠ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܳ۠ᩴ;
    .locals 1

    .line 34
    const-class v0, Ll/ܳ۠ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܳ۠ᩴ;

    return-object p0
.end method

.method public static values()[Ll/ܳ۠ᩴ;
    .locals 1

    .line 34
    sget-object v0, Ll/ܳ۠ᩴ;->a:[Ll/ܳ۠ᩴ;

    invoke-virtual {v0}, [Ll/ܳ۠ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܳ۠ᩴ;

    return-object v0
.end method
