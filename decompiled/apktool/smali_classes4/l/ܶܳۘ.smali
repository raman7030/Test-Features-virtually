.class public final Ll/ܶܳۘ;
.super Ljava/lang/Object;
.source "E1N7"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;)Ll/֨ܳۘ;
    .locals 3

    .line 30
    new-instance v0, Ll/ܺۢᩴ;

    invoke-direct {v0}, Ll/ܺۢᩴ;-><init>()V

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xa

    .line 13
    invoke-static {p0, v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 36
    invoke-virtual {v0, v1}, Ll/ܺۢᩴ;->add(I)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܺۢᩴ;->add(I)Z

    .line 44
    new-instance v1, Ll/۠ܳۘ;

    invoke-virtual {v0}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    invoke-direct {v1, v0}, Ll/۠ܳۘ;-><init>([I)V

    return-object v1
.end method
