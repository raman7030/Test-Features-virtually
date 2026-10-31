.class public final Ll/ܰ᩸ۜ;
.super Ll/۬ۗܿ;
.source "O8UQ"


# instance fields
.field public final synthetic ۟:Ll/֫᩹ۜ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/֫᩹ۜ;)V
    .locals 0

    .line 343
    iput-object p2, p0, Ll/ܰ᩸ۜ;->۟:Ll/֫᩹ۜ;

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 372
    iget-object p1, p0, Ll/ܰ᩸ۜ;->۟:Ll/֫᩹ۜ;

    invoke-static {p1}, Ll/֫᩹ۜ;->֫(Ll/֫᩹ۜ;)Ll/۬ۗܿ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 373
    invoke-static {p1, v0}, Ll/֫᩹ۜ;->֫(Ll/֫᩹ۜ;Ll/۬ۗܿ;)V

    :cond_0
    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 349
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1206a7

    .line 352
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 355
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-lt v0, v2, :cond_1

    const/16 v2, 0x3e7

    if-le v0, v2, :cond_0

    goto :goto_0

    .line 364
    :cond_0
    invoke-static {v0}, Ll/᩸᩶ۜ;->֫(I)V

    .line 365
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 361
    :cond_1
    :goto_0
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 353
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0}, Ljava/lang/NumberFormatException;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 357
    :catch_0
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method
