.class public final enum Ll/᩵᩹ܺ;
.super Ll/֨᩹ܺ;
.source "E3QI"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 386
    invoke-direct {p0, p1, p2, v0}, Ll/֨᩹ܺ;-><init>(Ljava/lang/String;ILl/ۚ᩸ܺ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۘ᩹ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;I)Ll/ۗ᩹ܺ;
    .locals 0

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    .line 391
    new-instance p1, Ll/᩹᩹ܺ;

    invoke-direct {p1, p3}, Ll/᩹᩹ܺ;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 392
    :cond_0
    new-instance p1, Ll/۟᩹ܺ;

    invoke-direct {p1, p4, p3}, Ll/۟᩹ܺ;-><init>(ILjava/lang/Object;)V

    return-object p1
.end method

.method public ֫()Ll/ۧܶܺ;
    .locals 1

    .line 397
    invoke-static {}, Ll/ۧܶܺ;->֫()Ll/ۧܶܺ;

    move-result-object v0

    return-object v0
.end method
