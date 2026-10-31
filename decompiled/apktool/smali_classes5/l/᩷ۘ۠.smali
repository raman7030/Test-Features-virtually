.class public final Ll/᩷ۘ۠;
.super Ll/ۙۖ۠;
.source "E7PU"


# instance fields
.field public final ۙ:Ll/ۘۘ۠;


# direct methods
.method public constructor <init>(Ll/ۘۘ۠;Ljava/nio/CharBuffer;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2}, Ll/ۙۖ۠;-><init>(Ll/ۘۘ۠;Ljava/nio/CharBuffer;)V

    .line 63
    iput-object p1, p0, Ll/᩷ۘ۠;->ۙ:Ll/ۘۘ۠;

    return-void
.end method

.method public constructor <init>(Ll/ۘۘ۠;[CI)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Ll/ۙۖ۠;-><init>(Ll/ۘۘ۠;[CI)V

    .line 77
    iput-object p1, p0, Ll/᩷ۘ۠;->ۙ:Ll/ۘۘ۠;

    return-void
.end method


# virtual methods
.method public final ֫(IILl/֡ۘ۠;)Ll/ۚۘ۠;
    .locals 2

    .line 82
    invoke-virtual {p0, p1, p2}, Ll/۫ۘ۠;->֫(II)[C

    move-result-object p2

    .line 83
    new-instance v0, Ll/᩻ۘ۠;

    iget-object v1, p0, Ll/᩷ۘ۠;->ۙ:Ll/ۘۘ۠;

    invoke-direct {v0, p3, v1, p2, p1}, Ll/᩻ۘ۠;-><init>(Ll/֡ۘ۠;Ll/ۘۘ۠;[CI)V

    return-object v0
.end method

.method public final ۡ()Ll/ܰܶ۠;
    .locals 3

    .line 284
    invoke-virtual {p0}, Ll/۫ۘ۠;->ܽ()[C

    move-result-object v0

    .line 285
    array-length v1, v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Ll/ۧ᩸۠;->֫([CIZ)Ll/ܰܶ۠;

    move-result-object v0

    return-object v0
.end method
