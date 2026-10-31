.class public final Ll/᩵ۤۜ;
.super Ljava/lang/Object;
.source "D8GL"


# instance fields
.field public ֫:Ljava/lang/Object;

.field public ۧ:Ljava/lang/Object;


# direct methods
.method public static ֫(Ll/᩵ۤۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 2789
    iput-object v0, p0, Ll/᩵ۤۜ;->ۧ:Ljava/lang/Object;

    .line 2790
    iput-object v0, p0, Ll/᩵ۤۜ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/᩵ۤۜ;Ljava/lang/Object;)V
    .locals 0

    .line 2746
    iput-object p1, p0, Ll/᩵ۤۜ;->ۧ:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2747
    iput-object p1, p0, Ll/᩵ۤۜ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/᩵ۤۜ;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2754
    iput-object v0, p0, Ll/᩵ۤۜ;->ۧ:Ljava/lang/Object;

    .line 2755
    iput-object p1, p0, Ll/᩵ۤۜ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/᩵ۤۜ;Ljava/lang/String;Ll/֡ۤۜ;)V
    .locals 2

    .line 2763
    iget-object v0, p0, Ll/᩵ۤۜ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2767
    :cond_0
    invoke-interface {p2, v0}, Ll/֡ۤۜ;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 2768
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 2769
    invoke-static {p2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 2772
    :cond_1
    iput-object v0, p0, Ll/᩵ۤۜ;->֫:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2773
    iput-object p1, p0, Ll/᩵ۤۜ;->ۧ:Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۧ(Ll/᩵ۤۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 2785
    iput-object v0, p0, Ll/᩵ۤۜ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ܽ(Ll/᩵ۤۜ;)Ljava/lang/Object;
    .locals 0

    .line 2778
    iget-object p0, p0, Ll/᩵ۤۜ;->֫:Ljava/lang/Object;

    return-object p0
.end method
