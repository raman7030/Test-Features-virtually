.class public final Ll/ܶܶܳ;
.super Ljava/lang/Object;
.source "C1ZO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ܽܶܳ;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۗܶܳ;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ۗܶܳ;Ll/ܽܶܳ;II)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܶܳ;->᩸:Ll/ۗܶܳ;

    iput-object p2, p0, Ll/ܶܶܳ;->ۙ:Ll/ܽܶܳ;

    iput p3, p0, Ll/ܶܶܳ;->᩶:I

    iput p4, p0, Ll/ܶܶܳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 152
    iget-object v0, p0, Ll/ܶܶܳ;->᩸:Ll/ۗܶܳ;

    invoke-static {v0}, Ll/ۗܶܳ;->ܳ(Ll/ۗܶܳ;)Ljava/lang/Runnable;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    invoke-static {v0}, Ll/ۗܶܳ;->ۢ(Ll/ۗܶܳ;)V

    .line 156
    invoke-static {v0}, Ll/ۗܶܳ;->ܿ(Ll/ۗܶܳ;)Ll/᩸ܶܳ;

    move-result-object v1

    iget v2, p0, Ll/ܶܶܳ;->᩶:I

    iget-object v3, p0, Ll/ܶܶܳ;->ۙ:Ll/ܽܶܳ;

    invoke-virtual {v1, v2, v3}, Ll/᩸ܶܳ;->֫(ILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    return-void

    .line 159
    :cond_1
    iget v1, p0, Ll/ܶܶܳ;->᩹:I

    invoke-static {v0, v3, v1}, Ll/ۗܶܳ;->֫(Ll/ۗܶܳ;Ll/ܽܶܳ;I)V

    return-void
.end method
