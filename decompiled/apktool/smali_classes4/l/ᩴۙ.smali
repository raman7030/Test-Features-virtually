.class public final Ll/ᩴۙ;
.super Ljava/lang/Object;
.source "J4M5"


# direct methods
.method public static ֫(Landroid/content/Context;I)I
    .locals 0

    .line 1071
    invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1076
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/String;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemServiceName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
