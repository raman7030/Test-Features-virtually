.class public final Ll/۟۠ܿ;
.super Ljava/lang/Object;
.source "TA2U"


# static fields
.field public static final ֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 36
    invoke-static {}, Ll/ۗᩴܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "999"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/۟۠ܿ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/۟۠ܿ;->֫:Z

    return v0
.end method
