.class public final synthetic Ll/᩶۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶۫᩻;->᩸:I

    iput-object p2, p0, Ll/᩶۫᩻;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩶۫᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/᩶۫᩻;->᩸:I

    .line 4
    iget-object v0, p0, Ll/᩶۫᩻;->᩶:Ljava/lang/Object;

    .line 6
    iget-object v1, p0, Ll/᩶۫᩻;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 11
    check-cast v1, Landroid/content/ClipboardManager;

    .line 13
    check-cast v0, Ll/ܳ֡᩷;

    .line 15
    sget p1, Ll/᩵֡᩷;->۟ۧ:I

    .line 1321
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1323
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1324
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v1, Ll/ۡۤۡ;

    check-cast v0, Ll/ۗܺ᩷;

    .line 160
    invoke-virtual {v1}, Ll/ۡۤۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 161
    invoke-static {}, Ll/᩻᩹ۡ;->ܺ()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    .line 91
    invoke-static {v0, p1, v1}, Ll/ۧۖ᩷;->֫(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_0
    return-void

    :cond_1
    :goto_0
    const-string p1, ""

    .line 1324
    :cond_2
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Ll/۬ۗܿ;->֡()V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
