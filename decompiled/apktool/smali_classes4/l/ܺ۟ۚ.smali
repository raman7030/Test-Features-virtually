.class public final synthetic Ll/ܺ۟ۚ;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/᩵۟ۚ;


# direct methods
.method public synthetic constructor <init>(Ll/᩵۟ۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۟ۚ;->᩸:Ll/᩵۟ۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ܺ۟ۚ;->᩸:Ll/᩵۟ۚ;

    .line 97
    iget-object v0, v0, Ll/᩵۟ۚ;->᩹:Ll/ۘۨۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    check-cast v0, Ll/ۚۗۚ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "String stackFrameType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Fatal Error: Object reference \"{0}\" is null"

    invoke-static {v0, v1}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
