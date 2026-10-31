.class public final Ll/᩷ܶܳ;
.super Ljava/lang/Object;
.source "E142"


# static fields
.field public static ֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 19
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "show_bookmarks_tip"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/᩷ܶܳ;->֫:Z

    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 22
    sget-boolean v0, Ll/᩷ܶܳ;->֫:Z

    return v0
.end method

.method public static ۧ()V
    .locals 3

    .line 26
    sget-boolean v0, Ll/᩷ܶܳ;->֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 27
    sput-boolean v0, Ll/᩷ܶܳ;->֫:Z

    .line 28
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "show_bookmarks_tip"

    invoke-interface {v1, v2, v0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 29
    invoke-static {}, Ll/ܽ᩶ܳ;->᩷()V

    :cond_0
    return-void
.end method
