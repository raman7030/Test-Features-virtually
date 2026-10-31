.class public final synthetic Ll/֡֨ۢ;
.super Ljava/lang/Object;
.source "19AV"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡֨ۢ;->᩸:I

    iput-object p2, p0, Ll/֡֨ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/֡֨ۢ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/֡֨ۢ;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, [I

    .line 11
    sget p1, Ll/֡ܳܿ;->֨ۧ:I

    const/4 p1, 0x0

    .line 421
    aput p2, v0, p1

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ll/֨֫ᩳ;

    sget p1, Ll/֨֫ᩳ;->ܺۧ:I

    .line 332
    invoke-virtual {v0}, Ll/֨֫ᩳ;->finish()V

    return-void

    .line 0
    :pswitch_1
    check-cast v0, Lbin/mt/plus/Main;

    .line 261
    new-instance p1, Ll/۬۬ܿ;

    const p2, 0x7f120528

    invoke-direct {p1, v0, p2}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {p1}, Ll/۬۬ܿ;->ܳ()V

    .line 262
    sget-object p2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/᩻᩷ᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Ll/᩻᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
