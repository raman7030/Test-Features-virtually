.class public final enum Ll/ۚ᩹ܺ;
.super Ll/֨᩹ܺ;
.source "E3QI"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 415
    invoke-direct {p0, p1, p2, v0}, Ll/֨᩹ܺ;-><init>(Ljava/lang/String;ILl/ۚ᩸ܺ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۘ᩹ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;I)Ll/ۗ᩹ܺ;
    .locals 1

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 420
    new-instance p4, Ll/ۨ᩹ܺ;

    iget-object p1, p1, Ll/ۘ᩹ܺ;->۟:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p4, p1, p3, p2}, Ll/ۨ᩹ܺ;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Ll/᩻᩶ܺ;)V

    return-object p4

    .line 421
    :cond_0
    new-instance v0, Ll/֫᩶ܺ;

    iget-object p1, p1, Ll/ۘ᩹ܺ;->۟:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p4, p2, p3, p1}, Ll/֫᩶ܺ;-><init>(ILl/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    return-object v0
.end method

.method public ֫()Ll/ۧܶܺ;
    .locals 1

    .line 427
    invoke-static {}, Ll/ۧܶܺ;->ۧ()Ll/ۧܶܺ;

    move-result-object v0

    return-object v0
.end method
