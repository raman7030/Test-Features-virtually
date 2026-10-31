.class public final synthetic Ll/ۚ֨ۢ;
.super Ljava/lang/Object;
.source "19AV"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚ֨ۢ;->᩸:I

    iput-object p2, p0, Ll/ۚ֨ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۚ֨ۢ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۚ֨ۢ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Lcom/google/android/material/datepicker/MaterialDatePicker;

    .line 12
    invoke-static {v1, p1}, Lcom/google/android/material/datepicker/MaterialDatePicker;->$r8$lambda$_7eg0aLhI4_FyxsSORjppBhoKm4(Lcom/google/android/material/datepicker/MaterialDatePicker;Landroid/view/View;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/֨֫ᩳ;

    .line 18
    invoke-static {v1}, Ll/֨֫ᩳ;->֫(Ll/֨֫ᩳ;)V

    return-void

    .line 21
    :pswitch_1
    check-cast v1, Ll/ۛ᩺ܽ;

    .line 23
    sget p1, Ll/ۛ᩺ܽ;->᩷ۧ:I

    .line 58
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_2
    check-cast v1, Lbin/mt/plus/Main;

    .line 396
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "moe.shizuku.privileged.api"

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 398
    invoke-virtual {v1, p1}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 546
    invoke-virtual {v1, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
