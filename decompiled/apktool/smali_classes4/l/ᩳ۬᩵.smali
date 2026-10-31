.class public final Ll/ᩳ۬᩵;
.super Ljava/lang/Object;
.source "8AY8"


# static fields
.field public static final ֫:Ll/ܿ۬᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    .line 21
    invoke-static {v0}, Ll/᩸ۛ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 17
    sget-object v0, Ll/ܽ۬᩵;->ۤ:Ll/ܽ۬᩵;

    goto :goto_1

    .line 18
    :cond_1
    sget v0, Ll/ۢ۬᩵;->֫:I

    .line 57
    sget-object v0, Ll/ۘۛ᩵;->֫:Ll/᩸۫᩵;

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    instance-of v1, v0, Ll/ܿ۬᩵;

    if-nez v1, :cond_2

    sget-object v0, Ll/ܽ۬᩵;->ۤ:Ll/ܽ۬᩵;

    goto :goto_1

    :cond_2
    check-cast v0, Ll/ܿ۬᩵;

    .line 13
    :goto_1
    sput-object v0, Ll/ᩳ۬᩵;->֫:Ll/ܿ۬᩵;

    return-void
.end method

.method public static final ֫()Ll/ܿ۬᩵;
    .locals 1

    .line 13
    sget-object v0, Ll/ᩳ۬᩵;->֫:Ll/ܿ۬᩵;

    return-object v0
.end method
