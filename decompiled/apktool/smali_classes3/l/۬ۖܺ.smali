.class public final Ll/۬ۖܺ;
.super Ljava/lang/Object;
.source "JBI9"


# instance fields
.field public final ֫:Ll/᩷ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/۬ۖܺ;->֫:Ll/᩷ۘܺ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۖܺ;)Ll/᩷ۘܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۖܺ;->֫:Ll/᩷ۘܺ;

    return-object p0
.end method

.method public static ֫(Ll/᩷ۘܺ;)V
    .locals 4

    .line 45
    new-instance v0, Ll/۬ۖܺ;

    invoke-direct {v0, p0}, Ll/۬ۖܺ;-><init>(Ll/᩷ۘܺ;)V

    .line 58
    invoke-virtual {p0}, Ll/᩷ۘܺ;->᩻()I

    move-result v1

    new-array v1, v1, [Ll/᩸ۡܺ;

    .line 61
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 63
    new-instance v3, Ll/ۗۖܺ;

    invoke-direct {v3, v0, v1, v2}, Ll/ۗۖܺ;-><init>(Ll/۬ۖܺ;[Ll/᩸ۡܺ;Ljava/util/HashSet;)V

    invoke-virtual {p0, v3}, Ll/᩷ۘܺ;->֫(Ll/ܿۘܺ;)V

    .line 147
    invoke-virtual {p0, v2}, Ll/᩷ۘܺ;->֫(Ljava/util/HashSet;)V

    return-void
.end method
