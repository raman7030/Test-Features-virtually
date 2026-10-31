.class public final Ll/ۨۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/۟ۧܳ;

.field public final ۙ:Ll/ܺܽܳ;

.field public final ᩶:Ll/ᩳܽܳ;

.field public final ᩸:J

.field public volatile ᩹:Z


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;JLl/۟ۧܳ;Ll/ܺܽܳ;)V
    .locals 0

    .line 3648
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3649
    iput-object p1, p0, Ll/ۨۧܳ;->᩶:Ll/ᩳܽܳ;

    .line 3650
    iput-wide p2, p0, Ll/ۨۧܳ;->᩸:J

    .line 3651
    iput-object p4, p0, Ll/ۨۧܳ;->ۗ:Ll/۟ۧܳ;

    .line 3652
    iput-object p5, p0, Ll/ۨۧܳ;->ۙ:Ll/ܺܽܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨۧܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۨۧܳ;->᩸:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۨۧܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۨۧܳ;->᩹:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۨۧܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۨۧܳ;->᩹:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۨۧܳ;)Ll/ᩳܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۧܳ;->᩶:Ll/ᩳܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۨۧܳ;)Ll/۟ۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۧܳ;->ۗ:Ll/۟ۧܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۨۧܳ;)Ll/ܺܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۧܳ;->ۙ:Ll/ܺܽܳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 3667
    iget-object v0, p0, Ll/ۨۧܳ;->᩶:Ll/ᩳܽܳ;

    invoke-virtual {v0, p0}, Ll/ᩳܽܳ;->֫(Ll/ۨۧܳ;)V

    return-void
.end method

.method public final ֫()Ll/ܺܽܳ;
    .locals 2

    .line 3659
    iget-boolean v0, p0, Ll/ۨۧܳ;->᩹:Z

    if-nez v0, :cond_0

    .line 3662
    iget-object v0, p0, Ll/ۨۧܳ;->ۙ:Ll/ܺܽܳ;

    return-object v0

    .line 3660
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SaveHandle is not active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
