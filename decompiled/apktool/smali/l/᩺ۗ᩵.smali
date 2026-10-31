.class public final Ll/᩺ۗ᩵;
.super Ljava/lang/Object;
.source "AAKK"


# direct methods
.method public static final ֫(Ll/᩸۬᩵;)Ll/֫ۛ᩵;
    .locals 2

    .line 277
    new-instance v0, Ll/֫ۛ᩵;

    sget-object v1, Ll/ۤ۬᩵;->֨:Ll/۫۬᩵;

    sget-object v1, Ll/۫۬᩵;->᩸:Ll/۫۬᩵;

    .line 31
    invoke-static {p0, v1}, Ll/᩺ܶ᩵;->֫(Ll/ۗۗ᩵;Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 379
    :cond_0
    new-instance v1, Ll/᩺۬᩵;

    invoke-direct {v1}, Ll/᩺۬᩵;-><init>()V

    .line 16
    invoke-static {p0, v1}, Ll/ܽ᩸᩵;->֫(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p0

    .line 277
    :goto_0
    invoke-direct {v0, p0}, Ll/֫ۛ᩵;-><init>(Ll/ܳ᩸᩵;)V

    return-object v0
.end method
