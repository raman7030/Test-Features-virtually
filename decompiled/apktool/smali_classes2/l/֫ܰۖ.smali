.class public final Ll/֫ܰۖ;
.super Ll/۬᩺ۖ;
.source "N9DO"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    sget-object v0, Ll/ۗ᩺ۖ;->۟:Ll/ۗ᩺ۖ;

    invoke-direct {p0, v0}, Ll/۬᩺ۖ;-><init>(Ll/ۗ᩺ۖ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܰۖ;)V
    .locals 2

    .line 31
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    invoke-virtual {v0}, Ll/ۗ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    const/16 v0, 0x8

    .line 32
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 33
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/᩺۫ۖ;

    invoke-static {v0, p1}, Ll/ܰ۫ۖ;->֫(Ll/᩺۫ۖ;Ll/ۤܰۖ;)V

    return-void
.end method
