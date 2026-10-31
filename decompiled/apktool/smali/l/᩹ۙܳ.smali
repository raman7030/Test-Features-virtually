.class public final synthetic Ll/᩹ۙܳ;
.super Ljava/lang/Object;
.source "J95B"


# direct methods
.method public static ֫(Ll/᩶ۙܳ;Ll/ܽۢܳ;Ll/ܽۙܳ;Ll/ᩳۙܳ;)V
    .locals 1

    .line 14
    check-cast p3, Ll/֫ۙܳ;

    invoke-virtual {p3}, Ll/֫ۙܳ;->ۧ()V

    .line 15
    new-instance v0, Ll/ܳۙܳ;

    invoke-direct {v0, p1, p0}, Ll/ܳۙܳ;-><init>(Ll/ܽۢܳ;Ll/᩶ۙܳ;)V

    iget-object p0, p2, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    new-instance p1, Ll/᩸ۙܳ;

    invoke-direct {p1, p3}, Ll/᩸ۙܳ;-><init>(Ll/ᩳۙܳ;)V

    invoke-virtual {v0, p0, p1}, Ll/ܳۙܳ;->֫(Ljava/util/ArrayList;Ljava/lang/Runnable;)V

    return-void
.end method
