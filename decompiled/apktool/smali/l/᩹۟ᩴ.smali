.class public final enum Ll/᩹۟ᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum OP:Ll/᩹۟ᩴ;

.field public static final enum SPLITERATOR:Ll/᩹۟ᩴ;

.field public static final enum STREAM:Ll/᩹۟ᩴ;

.field public static final enum TERMINAL_OP:Ll/᩹۟ᩴ;

.field public static final enum UPSTREAM_TERMINAL_OP:Ll/᩹۟ᩴ;

.field public static final synthetic a:[Ll/᩹۟ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 344
    new-instance v0, Ll/᩹۟ᩴ;

    const-string v1, "SPLITERATOR"

    const/4 v2, 0x0

    .line 340
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 344
    sput-object v0, Ll/᩹۟ᩴ;->SPLITERATOR:Ll/᩹۟ᩴ;

    .line 349
    new-instance v1, Ll/᩹۟ᩴ;

    const-string v3, "STREAM"

    const/4 v4, 0x1

    .line 340
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 349
    sput-object v1, Ll/᩹۟ᩴ;->STREAM:Ll/᩹۟ᩴ;

    .line 354
    new-instance v3, Ll/᩹۟ᩴ;

    const-string v5, "OP"

    const/4 v6, 0x2

    .line 340
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 354
    sput-object v3, Ll/᩹۟ᩴ;->OP:Ll/᩹۟ᩴ;

    .line 359
    new-instance v5, Ll/᩹۟ᩴ;

    const-string v7, "TERMINAL_OP"

    const/4 v8, 0x3

    .line 340
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 359
    sput-object v5, Ll/᩹۟ᩴ;->TERMINAL_OP:Ll/᩹۟ᩴ;

    .line 365
    new-instance v7, Ll/᩹۟ᩴ;

    const-string v9, "UPSTREAM_TERMINAL_OP"

    const/4 v10, 0x4

    .line 340
    invoke-direct {v7, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 365
    sput-object v7, Ll/᩹۟ᩴ;->UPSTREAM_TERMINAL_OP:Ll/᩹۟ᩴ;

    const/4 v9, 0x5

    new-array v9, v9, [Ll/᩹۟ᩴ;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 340
    sput-object v9, Ll/᩹۟ᩴ;->a:[Ll/᩹۟ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩹۟ᩴ;
    .locals 1

    .line 340
    const-class v0, Ll/᩹۟ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩹۟ᩴ;

    return-object p0
.end method

.method public static values()[Ll/᩹۟ᩴ;
    .locals 1

    .line 340
    sget-object v0, Ll/᩹۟ᩴ;->a:[Ll/᩹۟ᩴ;

    invoke-virtual {v0}, [Ll/᩹۟ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩹۟ᩴ;

    return-object v0
.end method
