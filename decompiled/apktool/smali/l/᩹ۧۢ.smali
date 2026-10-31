.class public final synthetic Ll/᩹ۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Ll/ۖۛۡ;
.implements Ll/ᩴܺܳ;
.implements Ll/۟ܶۧ;
.implements Ll/᩺ܳۡ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹ۧۢ;->᩸:I

    iput-object p2, p0, Ll/᩹ۧۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/String;Z)I
    .locals 0

    .line 2
    iget-object p2, p0, Ll/᩹ۧۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast p2, Ljava/util/HashSet;

    .line 575
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object p1, p0, Ll/᩹ۧۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/ۜ۬᩷;

    .line 41
    invoke-virtual {p1}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    .line 46
    invoke-virtual {p1}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0xa

    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f12052a

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/᩹ۧۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/᩹ۧۢ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۫ۗܽ;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/᩹ۧۢ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۧۧۢ;

    invoke-interface {v0, p1}, Ll/ۧۧۢ;->᩻(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩹ۧۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 1276
    invoke-static {v0, p1}, Ll/ܽۛܽ;->֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method
