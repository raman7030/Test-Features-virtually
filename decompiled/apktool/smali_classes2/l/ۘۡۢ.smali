.class public final synthetic Ll/ۘۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/۟ۡۢ;

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/᩵ۡۢ;

.field public final synthetic ᩹:[I


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۡۢ;[ILjava/util/ArrayList;Ll/۟ۡۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۡۢ;->᩸:Ll/᩵ۡۢ;

    iput-object p2, p0, Ll/ۘۡۢ;->᩹:[I

    iput-object p3, p0, Ll/ۘۡۢ;->᩶:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/ۘۡۢ;->ۙ:Ll/۟ۡۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 2
    iget-object v0, p0, Ll/ۘۡۢ;->᩹:[I

    .line 4
    iget-object v1, p0, Ll/ۘۡۢ;->᩶:Ljava/util/ArrayList;

    .line 6
    iget-object v2, p0, Ll/ۘۡۢ;->ۙ:Ll/۟ۡۢ;

    .line 1208
    :try_start_0
    invoke-static {v0}, Ll/֫ܺۢ;->֫([I)[I

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 1210
    :goto_0
    array-length v6, v0

    if-ge v3, v6, :cond_3

    .line 1211
    aget v6, v0, v3

    const/4 v7, -0x1

    const/4 v8, 0x1

    if-eq v6, v7, :cond_1

    .line 1212
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽܺۢ;

    iget v6, v6, Ll/ܽܺۢ;->۫:I

    aget v7, v0, v3

    if-eq v6, v7, :cond_0

    .line 1213
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽܺۢ;

    aget v6, v0, v3

    iput v6, v4, Ll/ܽܺۢ;->۫:I

    const/4 v4, 0x1

    .line 1216
    :cond_0
    aget v6, v0, v3

    if-eqz v6, :cond_1

    if-ne v6, v8, :cond_2

    :cond_1
    const/4 v5, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    .line 1224
    new-instance v0, Ll/ᩴۡۢ;

    invoke-direct {v0, v2}, Ll/ᩴۡۢ;-><init>(Ll/۟ۡۢ;)V

    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    if-nez v5, :cond_5

    return-void

    :catch_0
    :cond_5
    const-wide/16 v0, 0x1388

    .line 1231
    iget-object v2, p0, Ll/ۘۡۢ;->᩸:Ll/᩵ۡۢ;

    invoke-static {v2, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method
