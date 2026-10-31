.class public Ll/᩺ۙ᩵;
.super Ll/ۨۙ᩵;
.source "FANX"


# direct methods
.method public static final ֫(IIILjava/lang/String;Ljava/lang/String;Z)Z
    .locals 6

    const-string v0, "<this>"

    .line 5
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    .line 10
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p5, :cond_0

    .line 726
    invoke-virtual {p3, p0, p4, p1, p2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p0

    return p0

    :cond_0
    move-object v0, p3

    move v1, p5

    move v2, p0

    move-object v3, p4

    move v4, p1

    move v5, p2

    .line 728
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    return p0
.end method
