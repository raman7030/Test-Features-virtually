.class public final synthetic Ll/ܳᩴۧ;
.super Ljava/lang/Object;
.source "58LM"


# direct methods
.method public static ֫(Ll/ۢᩴۧ;[BI)Ll/ܰۘۧ;
    .locals 7

    .line 203
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 204
    invoke-static {}, Ll/᩷ᩴۧ;->֫()Ll/᩷ᩴۧ;

    move-result-object v5

    new-instance v6, Ll/᩻ۡܳ;

    invoke-direct {v6, v0}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    invoke-interface/range {v1 .. v6}, Ll/ۢᩴۧ;->֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V

    .line 205
    new-instance p0, Ll/۫ۘۧ;

    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/۫ۘۧ;-><init>(Ljava/util/List;)V

    return-object p0
.end method
