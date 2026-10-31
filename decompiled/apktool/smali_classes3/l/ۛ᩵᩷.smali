.class public final Ll/ۛ᩵᩷;
.super Ll/ܶ᩵᩷;
.source "6AY4"


# direct methods
.method public static ֫(Ll/ۛ᩵᩷;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 7

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v5, p4

    const/4 v1, 0x2

    const/4 v6, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 1651
    invoke-virtual/range {v0 .. v6}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static ֫(Ll/ۛ᩵᩷;ILjava/lang/String;[Ljava/lang/String;I)V
    .locals 9

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p2

    :goto_0
    and-int/lit8 p2, p4, 0x4

    if-eqz p2, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p3

    :goto_1
    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x1

    move-object v2, p0

    move v4, p1

    .line 1640
    invoke-virtual/range {v2 .. v8}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
