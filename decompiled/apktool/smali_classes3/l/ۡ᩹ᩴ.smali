.class public abstract Ll/ۡ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 386
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ll/۠᩹ᩴ;
    .locals 2

    .line 183
    new-instance v0, Ll/۠᩹ᩴ;

    invoke-static {}, Ll/ۚ᩹ᩴ;->systemDefault()Ll/ۚ᩹ᩴ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۠᩹ᩴ;-><init>(Ll/ۚ᩹ᩴ;)V

    return-object v0
.end method

.method public static systemUTC()Ll/ۡ᩹ᩴ;
    .locals 1

    .line 160
    sget-object v0, Ll/۠᩹ᩴ;->b:Ll/۠᩹ᩴ;

    return-object v0
.end method


# virtual methods
.method public abstract instant()Ll/ۘ᩹ᩴ;
.end method
