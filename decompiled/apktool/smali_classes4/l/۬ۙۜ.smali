.class public final Ll/۬ۙۜ;
.super Ljava/lang/Object;
.source "N74D"

# interfaces
.implements Ll/۟᩺֫;


# instance fields
.field public final ᩸:Ll/᩵֨ۜ;

.field public final ᩹:Ll/ܶ֨ۜ;


# direct methods
.method public constructor <init>(Ll/᩵֨ۜ;Ll/ܶ֨ۜ;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/۬ۙۜ;->᩸:Ll/᩵֨ۜ;

    .line 32
    iput-object p2, p0, Ll/۬ۙۜ;->᩹:Ll/ܶ֨ۜ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۙۜ;)Ll/᩵֨ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۙۜ;->᩸:Ll/᩵֨ۜ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬ۙۜ;)Ll/ܶ֨ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۙۜ;->᩹:Ll/ܶ֨ۜ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/᩸ۨ֫;Ll/ۧܳۧ;Ll/ܰ᩺֫;)Ll/ܿܰ֫;
    .locals 1

    .line 41
    new-instance v0, Ll/ᩴ᩺֫;

    invoke-direct {v0, p1, p2, p3}, Ll/ᩴ᩺֫;-><init>(Ll/᩸ۨ֫;Ll/ۧܳۧ;Ll/ܰ᩺֫;)V

    .line 43
    new-instance p1, Ll/ۗۙۜ;

    invoke-direct {p1, p0, v0}, Ll/ۗۙۜ;-><init>(Ll/۬ۙۜ;Ll/ᩴ᩺֫;)V

    .line 45
    iget-object p2, p0, Ll/۬ۙۜ;->᩸:Ll/᩵֨ۜ;

    invoke-virtual {p2, v0}, Ll/᩵֨ۜ;->֫(Ll/ᩴ᩺֫;)V

    return-object p1
.end method
