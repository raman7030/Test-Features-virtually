.class public final Ll/᩺᩺ۖ;
.super Ll/۬᩺ۖ;
.source "L9DF"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    sget-object v0, Ll/ۗ᩺ۖ;->ۤ:Ll/ۗ᩺ۖ;

    invoke-direct {p0, v0}, Ll/۬᩺ۖ;-><init>(Ll/ۗ᩺ۖ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܰۖ;)V
    .locals 2

    .line 33
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    invoke-virtual {v0}, Ll/ۗ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v0, 0x4

    .line 34
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 35
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    return-void
.end method
