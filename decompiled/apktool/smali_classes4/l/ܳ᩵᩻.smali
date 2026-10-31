.class public final Ll/ܳ᩵᩻;
.super Ljava/lang/Object;
.source "R8AK"

# interfaces
.implements Ll/ᩴ᩵᩻;


# instance fields
.field public final synthetic ֫:Ll/ۙ᩵᩻;

.field public final synthetic ۧ:Ll/۟ܽۘ;


# direct methods
.method public constructor <init>(Ll/ۙ᩵᩻;Ll/۟ܽۘ;)V
    .locals 0

    .line 707
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩵᩻;->֫:Ll/ۙ᩵᩻;

    iput-object p2, p0, Ll/ܳ᩵᩻;->ۧ:Ll/۟ܽۘ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 724
    iget-object v0, p0, Ll/ܳ᩵᩻;->֫:Ll/ۙ᩵᩻;

    iget-object v1, p0, Ll/ܳ᩵᩻;->ۧ:Ll/۟ܽۘ;

    invoke-static {v0, v1}, Ll/ۙ᩵᩻;->֫(Ll/ۙ᩵᩻;Ll/۟ܽۘ;)Ljava/io/IOException;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 726
    :cond_0
    throw v0
.end method

.method public final ֫(J[BII)I
    .locals 6

    .line 710
    iget-object v0, p0, Ll/ܳ᩵᩻;->ۧ:Ll/۟ܽۘ;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 620
    invoke-virtual/range {v0 .. v5}, Ll/۟ܽۘ;->֫(J[BII)I

    move-result p1

    if-nez p5, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, -0x1

    :cond_1
    return p1
.end method
