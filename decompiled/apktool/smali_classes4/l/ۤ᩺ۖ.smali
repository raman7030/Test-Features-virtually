.class public final Ll/ۤ᩺ۖ;
.super Ll/۬᩺ۖ;
.source "K9E3"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    sget-object v0, Ll/ۗ᩺ۖ;->۫:Ll/ۗ᩺ۖ;

    invoke-direct {p0, v0}, Ll/۬᩺ۖ;-><init>(Ll/ۗ᩺ۖ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܰۖ;)V
    .locals 2

    .line 29
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    invoke-virtual {v0}, Ll/ۗ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    return-void
.end method
