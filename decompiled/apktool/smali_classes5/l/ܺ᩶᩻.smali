.class public final Ll/ܺ᩶᩻;
.super Ljava/lang/Object;
.source "V8BV"

# interfaces
.implements Ll/֨᩸ܿ;


# instance fields
.field public final synthetic ᩸:Ll/ۖ᩶᩻;


# direct methods
.method public constructor <init>(Ll/ۖ᩶᩻;)V
    .locals 0

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩶᩻;->᩸:Ll/ۖ᩶᩻;

    return-void
.end method


# virtual methods
.method public final ֫(JJJ)V
    .locals 0

    .line 201
    iget-object p1, p0, Ll/ܺ᩶᩻;->᩸:Ll/ۖ᩶᩻;

    iget-object p1, p1, Ll/ۖ᩶᩻;->᩸:Ll/ᩴ᩶᩻;

    invoke-static {p1}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object p2

    invoke-static {p3, p4, p5, p6}, Ll/᩵ۛۡ;->֫(JJ)I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    invoke-static {p1}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object p2

    invoke-static {p1}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object p5

    invoke-virtual {p5}, Ll/᩷۫ܳ;->ܿ()J

    move-result-wide p5

    add-long/2addr p5, p3

    invoke-static {p1}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷۫ܳ;->ۜ()J

    move-result-wide p3

    invoke-static {p5, p6, p3, p4}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p1

    invoke-interface {p2, p1}, Ll/ۘ᩶᩻;->setProgress(I)V

    return-void
.end method

.method public final synthetic ᩷֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 207
    iget-object v0, p0, Ll/ܺ᩶᩻;->᩸:Ll/ۖ᩶᩻;

    iget-object v0, v0, Ll/ۖ᩶᩻;->᩸:Ll/ᩴ᩶᩻;

    invoke-static {v0}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object v0

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method
