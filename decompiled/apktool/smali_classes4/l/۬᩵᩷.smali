.class public final Ll/۬᩵᩷;
.super Ll/ܶ᩵᩷;
.source "6AY4"


# direct methods
.method public static ֫(Ll/۬᩵᩷;ILandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 7

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    const-string p5, "extra"

    .line 0
    invoke-static {p2, p5}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    move-object v0, p0

    move v2, p1

    move-object v3, p3

    move-object v4, p4

    move-object v6, p2

    .line 1730
    invoke-virtual/range {v0 .. v6}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "extra"

    .line 0
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0x30

    move-object v1, p0

    move v2, p2

    move-object v3, p4

    move-object v4, p1

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Ll/۬᩵᩷;->֫(Ll/۬᩵᩷;ILandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    return-void
.end method
