.class public final Ll/۫ᩴܺ;
.super Ll/ۜ᩺ۘ;
.source "9B7W"


# instance fields
.field public final ֫:Ll/ۜ۬ܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩴܺ;->֫:Ll/ۜ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۤᩴܺ;
    .locals 2

    .line 59
    new-instance v0, Ll/ۤᩴܺ;

    iget-object v1, p0, Ll/۫ᩴܺ;->֫:Ll/ۜ۬ܺ;

    .line 616
    invoke-virtual {v1}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object v1

    .line 59
    invoke-direct {v0, v1}, Ll/ۤᩴܺ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩺ᩴܺ;
    .locals 1

    .line 181
    new-instance v0, Ll/᩺ᩴܺ;

    invoke-direct {v0, p1, p2}, Ll/᩺ᩴܺ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "R8$$REMOVED$$CLASS$$"

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 52
    iget-object p2, p0, Ll/۫ᩴܺ;->֫:Ll/ۜ۬ܺ;

    invoke-virtual {p2, p1, v0}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    :cond_0
    return-object v0
.end method
