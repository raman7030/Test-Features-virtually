.class public final enum Ll/ܽ۠ᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum CONTINUE:Ll/ܽ۠ᩴ;

.field public static final enum SKIP_SIBLINGS:Ll/ܽ۠ᩴ;

.field public static final enum SKIP_SUBTREE:Ll/ܽ۠ᩴ;

.field public static final enum TERMINATE:Ll/ܽ۠ᩴ;

.field public static final synthetic a:[Ll/ܽ۠ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 42
    new-instance v0, Ll/ܽ۠ᩴ;

    const-string v1, "CONTINUE"

    const/4 v2, 0x0

    .line 36
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 42
    sput-object v0, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    .line 46
    new-instance v1, Ll/ܽ۠ᩴ;

    const-string v3, "TERMINATE"

    const/4 v4, 0x1

    .line 36
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    sput-object v1, Ll/ܽ۠ᩴ;->TERMINATE:Ll/ܽ۠ᩴ;

    .line 53
    new-instance v3, Ll/ܽ۠ᩴ;

    const-string v5, "SKIP_SUBTREE"

    const/4 v6, 0x2

    .line 36
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 53
    sput-object v3, Ll/ܽ۠ᩴ;->SKIP_SUBTREE:Ll/ܽ۠ᩴ;

    .line 61
    new-instance v5, Ll/ܽ۠ᩴ;

    const-string v7, "SKIP_SIBLINGS"

    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 61
    sput-object v5, Ll/ܽ۠ᩴ;->SKIP_SIBLINGS:Ll/ܽ۠ᩴ;

    const/4 v7, 0x4

    new-array v7, v7, [Ll/ܽ۠ᩴ;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 36
    sput-object v7, Ll/ܽ۠ᩴ;->a:[Ll/ܽ۠ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܽ۠ᩴ;
    .locals 1

    .line 36
    const-class v0, Ll/ܽ۠ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܽ۠ᩴ;

    return-object p0
.end method

.method public static values()[Ll/ܽ۠ᩴ;
    .locals 1

    .line 36
    sget-object v0, Ll/ܽ۠ᩴ;->a:[Ll/ܽ۠ᩴ;

    invoke-virtual {v0}, [Ll/ܽ۠ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܽ۠ᩴ;

    return-object v0
.end method
