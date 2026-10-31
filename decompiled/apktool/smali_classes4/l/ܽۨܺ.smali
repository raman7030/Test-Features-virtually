.class public final synthetic Ll/ܽۨܺ;
.super Ljava/lang/Object;
.source "TUG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽۨܺ;->᩸:I

    iput-object p2, p0, Ll/ܽۨܺ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/ܽۨܺ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܽۨܺ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Lcom/google/android/material/timepicker/MaterialTimePicker;

    .line 12
    invoke-static {v0}, Lcom/google/android/material/timepicker/MaterialTimePicker;->$r8$lambda$LokL4-5Te3dObsZLP0tg9jf7Yfk(Lcom/google/android/material/timepicker/MaterialTimePicker;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/ܽۨܺ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/֨᩶᩷;

    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Ll/ܽۨܺ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast v0, Ll/ۘܶܿ;

    .line 28
    invoke-virtual {v0}, Ll/ۘܶܿ;->ܽ()V

    return-void

    .line 31
    :pswitch_2
    iget-object v0, p0, Ll/ܽۨܺ;->᩹:Ljava/lang/Object;

    .line 33
    check-cast v0, Ll/᩵ᩴܿ;

    .line 202
    invoke-virtual {v0}, Ll/ۗᩴܿ;->ᩳ()V

    return-void

    .line 0
    :pswitch_3
    iget-object v0, p0, Ll/ܽۨܺ;->᩹:Ljava/lang/Object;

    check-cast v0, [Ll/ܿ᩺ᩴ;

    .line 164
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 166
    :try_start_0
    invoke-interface {v4}, Ll/۫ۨᩴ;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_1

    .line 171
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return-void

    .line 52
    :cond_2
    throw v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
