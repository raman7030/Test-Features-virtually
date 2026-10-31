.class public final Ll/ۢ᩻ۢ;
.super Ll/۬ۗܿ;
.source "K14B"


# instance fields
.field public final synthetic ֫֫:I

.field public final synthetic ۟:Ll/ܺ᩻ۢ;

.field public final synthetic ۧ֫:I


# direct methods
.method public constructor <init>(Ll/ܺ᩻ۢ;Ll/ܿۛ᩷;II)V
    .locals 0

    .line 421
    iput-object p1, p0, Ll/ۢ᩻ۢ;->۟:Ll/ܺ᩻ۢ;

    iput p3, p0, Ll/ۢ᩻ۢ;->֫֫:I

    iput p4, p0, Ll/ۢ᩻ۢ;->ۧ֫:I

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 4

    .line 427
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 432
    iget v1, p0, Ll/ۢ᩻ۢ;->֫֫:I

    const v2, 0x7f12030d

    if-lt v0, v1, :cond_2

    iget v1, p0, Ll/ۢ᩻ۢ;->ۧ֫:I

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 436
    :cond_0
    iget-object v1, p0, Ll/ۢ᩻ۢ;->۟:Ll/ܺ᩻ۢ;

    invoke-static {v1}, Ll/ܺ᩻ۢ;->ܿ(Ll/ܺ᩻ۢ;)Ll/ۜۗܿ;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3, v3}, Ll/ۜۗܿ;->֫(IZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 437
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 439
    :cond_1
    invoke-virtual {p0, v2}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 433
    :cond_2
    :goto_0
    invoke-virtual {p0, v2}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    :catch_0
    const v0, 0x7f120b48

    .line 429
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
