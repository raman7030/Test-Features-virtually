.class public Ll/ܰ۠᩵;
.super Ljava/lang/Object;
.source "M962"


# direct methods
.method public static final ֫(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    .line 5
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    .line 10
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    sub-int/2addr p2, p1

    .line 925
    invoke-static {p3, p1, p4, p0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
