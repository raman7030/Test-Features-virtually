.class public final Ll/ۡۚ᩻;
.super Ll/ܿۜ᩻;
.source "LA8U"


# direct methods
.method public constructor <init>(Ll/۠᩹ۘ;Ljava/lang/String;)V
    .locals 9

    .line 13
    invoke-virtual {p1}, Ll/۠᩹ۘ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {p1}, Ll/۠᩹ۘ;->֫()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v2, -0x1

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_0
    move-wide v4, v2

    .line 23
    invoke-virtual {p1}, Ll/۠᩹ۘ;->ۧ()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_1

    const-wide/16 v2, 0x0

    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    :goto_1
    move-wide v6, v2

    .line 13
    invoke-virtual {p1}, Ll/۠᩹ۘ;->ᩳ()Z

    move-result p1

    xor-int/lit8 v8, p1, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p2

    .line 10
    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method
