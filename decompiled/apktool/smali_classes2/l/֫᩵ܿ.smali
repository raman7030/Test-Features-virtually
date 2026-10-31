.class public Ll/֫᩵ܿ;
.super Ljava/lang/Object;
.source "W142"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final ۙ:Ll/ۙ֡ܿ;

.field public ᩶:Z

.field public final ᩸:Ll/᩹᩸ܿ;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ll/֨᩸ܿ;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ll/ܰᩴܿ;

    invoke-direct {v0, p1}, Ll/ܰᩴܿ;-><init>(Ll/֨᩸ܿ;)V

    iput-object v0, p0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    const/4 p1, 0x0

    .line 63
    iput-boolean p1, p0, Ll/֫᩵ܿ;->᩹:Z

    const/4 p1, 0x0

    .line 64
    iput-object p1, p0, Ll/֫᩵ܿ;->ۙ:Ll/ۙ֡ܿ;

    return-void
.end method

.method public constructor <init>(Ll/ۚ᩸ܿ;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ll/᩺ᩴܿ;

    invoke-direct {v0, p1}, Ll/᩺ᩴܿ;-><init>(Ll/ۚ᩸ܿ;)V

    iput-object v0, p0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, Ll/֫᩵ܿ;->᩹:Z

    const/4 p1, 0x0

    .line 43
    iput-object p1, p0, Ll/֫᩵ܿ;->ۙ:Ll/ۙ֡ܿ;

    return-void
.end method

.method public constructor <init>(Ll/᩹᩸ܿ;)V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Ll/֫᩵ܿ;->᩹:Z

    .line 70
    invoke-interface {p1}, Ll/᩹᩸ܿ;->ܺ֫()Ll/ۙ֡ܿ;

    move-result-object p1

    if-nez p1, :cond_0

    .line 72
    new-instance p1, Ll/ۙ֡ܿ;

    invoke-direct {p1}, Ll/ۙ֡ܿ;-><init>()V

    invoke-virtual {p1}, Ll/ۙ֡ܿ;->ۧ()V

    .line 73
    iput-boolean v0, p0, Ll/֫᩵ܿ;->᩶:Z

    .line 75
    :cond_0
    iput-object p1, p0, Ll/֫᩵ܿ;->ۙ:Ll/ۙ֡ܿ;

    return-void
.end method

.method public static ֫(Ll/ۚ᩸ܿ;)Ll/֫᩵ܿ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 17
    :cond_0
    instance-of v0, p0, Ll/֨᩸ܿ;

    if-eqz v0, :cond_1

    .line 18
    new-instance v0, Ll/֫᩵ܿ;

    check-cast p0, Ll/֨᩸ܿ;

    invoke-direct {v0, p0}, Ll/֫᩵ܿ;-><init>(Ll/֨᩸ܿ;)V

    return-object v0

    .line 20
    :cond_1
    instance-of v0, p0, Ll/᩹᩸ܿ;

    if-eqz v0, :cond_2

    .line 21
    new-instance v0, Ll/֫᩵ܿ;

    check-cast p0, Ll/᩹᩸ܿ;

    invoke-direct {v0, p0}, Ll/֫᩵ܿ;-><init>(Ll/᩹᩸ܿ;)V

    return-object v0

    .line 23
    :cond_2
    new-instance v0, Ll/֫᩵ܿ;

    invoke-direct {v0, p0}, Ll/֫᩵ܿ;-><init>(Ll/ۚ᩸ܿ;)V

    return-object v0
.end method


# virtual methods
.method public ֫(JJJ)V
    .locals 10

    move-object v0, p0

    move-wide v2, p1

    .line 84
    iget-boolean v1, v0, Ll/֫᩵ܿ;->᩹:Z

    if-eqz v1, :cond_1

    const-wide/16 v4, 0x0

    .line 85
    iget-object v1, v0, Ll/֫᩵ܿ;->ۙ:Ll/ۙ֡ܿ;

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 86
    invoke-virtual {v1, p1, p2}, Ll/ۙ֡ܿ;->֫(J)V

    .line 88
    :cond_0
    iget-object v4, v0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    invoke-virtual {v1}, Ll/ۙ֡ܿ;->֫()J

    move-result-wide v8

    move-object v1, v4

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-interface/range {v1 .. v9}, Ll/᩹᩸ܿ;->֫(JJJJ)V

    return-void

    .line 90
    :cond_1
    iget-object v1, v0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    const-wide/16 v8, 0x0

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-interface/range {v1 .. v9}, Ll/᩹᩸ܿ;->֫(JJJJ)V

    return-void
.end method

.method public ۧ()V
    .locals 1

    .line 99
    iget-boolean v0, p0, Ll/֫᩵ܿ;->᩶:Z

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Ll/֫᩵ܿ;->ۙ:Ll/ۙ֡ܿ;

    invoke-virtual {v0}, Ll/ۙ֡ܿ;->ܽ()V

    :cond_0
    return-void
.end method

.method public ᩷֫()V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    invoke-interface {v0}, Ll/ۚ᩸ܿ;->᩷֫()V

    return-void
.end method

.method public ᩻()Z
    .locals 1

    .line 80
    iget-object v0, p0, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method
