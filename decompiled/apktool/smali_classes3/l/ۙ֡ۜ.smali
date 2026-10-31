.class public final Ll/ۙ֡ۜ;
.super Ljava/lang/Object;
.source "Q8FL"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ᩸:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 1261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "r"

    .line 1262
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ֡ۜ;->᩸:Ll/᩻ۖܽ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1278
    iget-object v0, p0, Ll/ۙ֡ۜ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    return-void
.end method

.method public final length()J
    .locals 2

    .line 1267
    iget-object v0, p0, Ll/ۙ֡ۜ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(J[BII)V
    .locals 1

    .line 1272
    iget-object v0, p0, Ll/ۙ֡ۜ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    .line 1273
    invoke-virtual {v0, p3, p4, p5}, Ll/᩻ۖܽ;->֫([BII)V

    return-void
.end method
