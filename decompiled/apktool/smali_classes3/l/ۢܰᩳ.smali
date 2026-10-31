.class public final synthetic Ll/ۢܰᩳ;
.super Ljava/lang/Object;
.source "Q5YY"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۢܰᩳ;->᩸:I

    iput-object p2, p0, Ll/ۢܰᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۢܰᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۢܰᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۘۨᩳ;

    .line 3463
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ᩴ(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v1

    if-ne v1, v0, :cond_0

    iget-boolean v1, v0, Ll/ۘۨᩳ;->ۘ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۢܰᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺܰᩳ;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/ܺܰᩳ;->֫(Ll/ܺܰᩳ;Z)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
