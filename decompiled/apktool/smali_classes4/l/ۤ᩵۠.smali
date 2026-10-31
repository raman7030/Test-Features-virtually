.class public final Ll/ۤ᩵۠;
.super Ll/ۨ֡۠;
.source "H44W"

# interfaces
.implements Ll/᩹ۡ֨;


# instance fields
.field public ۗ:Ll/۫᩵۠;


# virtual methods
.method public final getExpression()Ll/۫᩵۠;
    .locals 1

    .line 1596
    iget-object v0, p0, Ll/ۤ᩵۠;->ۗ:Ll/۫᩵۠;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1609
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 1611
    :try_start_0
    new-instance v1, Ll/᩸ۚ۠;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ll/᩸ۚ۠;-><init>(Ljava/io/Writer;Z)V

    const/4 v2, -0x1

    .line 215
    invoke-virtual {v1, p0, v2}, Ll/᩸ۚ۠;->֫(Ll/ۚۚ۠;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1618
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 1616
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1599
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ۤ᩵۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 1594
    sget-object v0, Ll/ۗܺ֨;->᩶֫:Ll/ۗܺ֨;

    return-object v0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 1591
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ۤ᩵۠;)V

    return-void
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 1603
    sget-object v0, Ll/ᩴۚ۠;->֡֫:Ll/ᩴۚ۠;

    return-object v0
.end method
