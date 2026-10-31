.class public final Ll/ۤ᩵ۢ;
.super Ljava/lang/Object;
.source "I7BH"


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public final ۧ:Z

.field public final ܽ:Z

.field public final ܿ:Ll/ܶ᩵ܿ;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(ZLl/ܶ᩵ܿ;Ll/ܶ᩵ܿ;ZZ)V
    .locals 0

    .line 1486
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1487
    iput-boolean p1, p0, Ll/ۤ᩵ۢ;->ܽ:Z

    .line 1488
    iput-object p2, p0, Ll/ۤ᩵ۢ;->֫:Ll/ܶ᩵ܿ;

    .line 1489
    iput-object p3, p0, Ll/ۤ᩵ۢ;->ܿ:Ll/ܶ᩵ܿ;

    .line 1490
    iput-boolean p4, p0, Ll/ۤ᩵ۢ;->ۧ:Z

    .line 1491
    iput-boolean p5, p0, Ll/ۤ᩵ۢ;->ᩳ:Z

    return-void
.end method

.method public static ֫()Ll/ۤ᩵ۢ;
    .locals 7

    .line 1498
    new-instance v6, Ll/ۤ᩵ۢ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤ᩵ۢ;-><init>(ZLl/ܶ᩵ܿ;Ll/ܶ᩵ܿ;ZZ)V

    return-object v6
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;ZZ)Ll/ۤ᩵ۢ;
    .locals 7

    .line 1506
    new-instance v6, Ll/ۤ᩵ۢ;

    const/4 v1, 0x1

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Ll/ۤ᩵ۢ;-><init>(ZLl/ܶ᩵ܿ;Ll/ܶ᩵ܿ;ZZ)V

    return-object v6
.end method

.method public static bridge synthetic ֫(Ll/ۤ᩵ۢ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩵ۢ;->֫:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۤ᩵ۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۤ᩵ۢ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۤ᩵ۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۤ᩵ۢ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۤ᩵ۢ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩵ۢ;->ܿ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۤ᩵ۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۤ᩵ۢ;->ᩳ:Z

    return p0
.end method
