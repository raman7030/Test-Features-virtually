.class public final Ll/᩷ۢܿ;
.super Ljava/lang/Object;
.source "K6VB"


# instance fields
.field public final ֫:Ll/᩺᩷ܿ;

.field public final ۧ:I

.field public final ܽ:Ll/᩺ܺܿ;

.field public final ܿ:I

.field public final ᩳ:Ll/᩶᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;III)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩷ۢܿ;->ܽ:Ll/᩺ܺܿ;

    .line 18
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/᩷ۢܿ;->ᩳ:Ll/᩶᩸ᩳ;

    .line 19
    iput p3, p0, Ll/᩷ۢܿ;->ۧ:I

    .line 20
    iput p4, p0, Ll/᩷ۢܿ;->ܿ:I

    .line 21
    new-instance p1, Ll/᩺᩷ܿ;

    invoke-direct {p1, p4, p5}, Ll/᩺᩷ܿ;-><init>(II)V

    iput-object p1, p0, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 4

    .line 32
    iget-object v0, p0, Ll/᩷ۢܿ;->ᩳ:Ll/᩶᩸ᩳ;

    :try_start_0
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iget v2, p0, Ll/᩷ۢܿ;->ۧ:I

    if-ne v1, v2, :cond_0

    :try_start_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget v3, p0, Ll/᩷ۢܿ;->ܿ:I

    if-ne v1, v3, :cond_0

    .line 33
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
