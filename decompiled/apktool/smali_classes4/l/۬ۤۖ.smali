.class public final Ll/۬ۤۖ;
.super Ljava/lang/Object;
.source "19KT"

# interfaces
.implements Ll/ᩴۤۖ;


# virtual methods
.method public final ֫(Ll/ۤܰۖ;)Ll/֡ۤۖ;
    .locals 5

    .line 692
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    .line 693
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    .line 694
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v2

    .line 695
    sget-object v4, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    long-to-int v3, v2

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {p1, v3, v4}, Ll/ۤܰۖ;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    .line 696
    new-instance v2, Ll/᩷ۛۖ;

    .line 20
    invoke-direct {v2, v0, v1, p1}, Ll/᩷ۤۖ;-><init>(JLjava/lang/String;)V

    return-object v2
.end method

.method public final ֫()Ll/ۧۤۖ;
    .locals 1

    .line 292
    sget-object v0, Ll/ۧۤۖ;->۬֫:Ll/ۧۤۖ;

    return-object v0
.end method
