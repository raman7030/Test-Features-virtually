.class public final Ll/᩸۟֨;
.super Ll/ۗ۟֨;
.source "57L9"


# instance fields
.field public final synthetic ۬:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 440
    iput-object p1, p0, Ll/᩸۟֨;->۬:Ll/ۤ۟֨;

    .line 441
    invoke-direct {p0, p1, p2}, Ll/ۗ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 438
    check-cast p1, Ll/ۙ֨֨;

    .line 446
    iget-object v0, p0, Ll/᩸۟֨;->۬:Ll/ۤ۟֨;

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->᩶(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    sget-object v0, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/֨֡֨;
    .locals 1

    .line 451
    iget-object p1, p0, Ll/᩸۟֨;->۬:Ll/ۤ۟֨;

    invoke-static {p1}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 322
    new-instance v0, Ll/ۙ۟֨;

    invoke-direct {v0, p0, p1}, Ll/ۙ۟֨;-><init>(Ll/ۗ۟֨;Ll/ۙ֨֨;)V

    invoke-virtual {p0, v0}, Ll/ܺ۟֨;->֫(Ljava/util/function/Predicate;)Ll/֨֡֨;

    move-result-object p1

    return-object p1
.end method
