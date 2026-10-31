.class public final Ll/ۙ֫ۢ;
.super Ljava/lang/Object;
.source "06PO"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Ll/ܿۖ᩷;


# instance fields
.field public final synthetic ۗ:Ll/ۗ֫ۢ;

.field public final ۙ:Ljava/lang/CharSequence;

.field public final ᩶:Ll/۟᩸ᩳ;

.field public final ᩸:J

.field public final ᩹:Ll/᩶֫ۢ;


# direct methods
.method public constructor <init>(Ll/ۗ֫ۢ;JLjava/lang/CharSequence;Ll/۟᩸ᩳ;Ll/᩶֫ۢ;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ֫ۢ;->ۗ:Ll/ۗ֫ۢ;

    .line 124
    iput-wide p2, p0, Ll/ۙ֫ۢ;->᩸:J

    .line 125
    iput-object p4, p0, Ll/ۙ֫ۢ;->ۙ:Ljava/lang/CharSequence;

    .line 126
    iput-object p5, p0, Ll/ۙ֫ۢ;->᩶:Ll/۟᩸ᩳ;

    .line 127
    iput-object p6, p0, Ll/ۙ֫ۢ;->᩹:Ll/᩶֫ۢ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ۙ֫ۢ;->᩶:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final ᩻()Z
    .locals 5

    .line 131
    iget-object v0, p0, Ll/ۙ֫ۢ;->ۗ:Ll/ۗ֫ۢ;

    invoke-static {v0}, Ll/ۗ֫ۢ;->ۧ(Ll/ۗ֫ۢ;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-wide v1, p0, Ll/ۙ֫ۢ;->᩸:J

    invoke-static {v0}, Ll/ۗ֫ۢ;->ܽ(Ll/ۗ֫ۢ;)J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
