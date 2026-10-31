.class public final synthetic Ll/ۧۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۤ᩷;->᩸:I

    iput-object p2, p0, Ll/ۧۤ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/ۧۤ᩷;->᩸:I

    .line 4
    iget-object p2, p0, Ll/ۧۤ᩷;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast p2, Ll/ۗܺ᩷;

    .line 137
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_0
    check-cast p2, Ll/ۘܶܿ;

    .line 74
    iget-object p1, p2, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ll/ᩴܶܿ;->֫(Ljava/util/Set;)V

    .line 75
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void

    .line 0
    :pswitch_1
    check-cast p2, Ll/۫۟ܽ;

    sget p1, Ll/۫۟ܽ;->᩸ۧ:I

    .line 579
    invoke-virtual {p2}, Ll/۫۟ܽ;->۟()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ۟ܽ;

    const/4 v1, 0x0

    .line 580
    invoke-virtual {v0, v1}, Ll/ۡ۟ܽ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 582
    :cond_0
    invoke-virtual {p2}, Ll/۫۟ܽ;->ᩳ֫()V

    .line 583
    invoke-virtual {p2}, Ll/۫۟ܽ;->ۜ֫()V

    return-void

    .line 0
    :pswitch_2
    check-cast p2, Ll/ܿۛ᩷;

    invoke-static {p2}, Ll/ܿۛ᩷;->᩻(Ll/ܿۛ᩷;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
