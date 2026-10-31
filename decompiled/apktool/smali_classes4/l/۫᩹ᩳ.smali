.class public final Ll/۫᩹ᩳ;
.super Ll/۬᩹ᩳ;
.source "06UJ"


# instance fields
.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/ۨ᩹ᩳ;J)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Ll/۬᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;)V

    .line 13
    iput-wide p2, p0, Ll/۫᩹ᩳ;->᩹:J

    return-void
.end method


# virtual methods
.method public final ۧ(J)Ll/ۚ۬ᩳ;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 19
    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    .line 145
    invoke-virtual {v0, p1, p2}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩻()J
    .locals 2

    .line 23
    iget-wide v0, p0, Ll/۫᩹ᩳ;->᩹:J

    return-wide v0
.end method
