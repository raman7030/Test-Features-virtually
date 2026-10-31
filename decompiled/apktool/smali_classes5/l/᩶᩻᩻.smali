.class public final synthetic Ll/᩶᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Ll/ۛۢᩴ;


# instance fields
.field public final synthetic ᩸:Ll/֡᩻᩻;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩻᩻;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩻᩻;->᩸:Ll/֡᩻᩻;

    iput-object p2, p0, Ll/᩶᩻᩻;->᩹:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 3

    .line 238
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/᩶᩻᩻;->᩸:Ll/֡᩻᩻;

    iput-object v0, v1, Ll/֡᩻᩻;->֫:Ljava/lang/Object;

    .line 239
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    iget-object p1, p0, Ll/᩶᩻᩻;->᩹:Ll/ۗܺ᩷;

    const v2, 0x7f12052a

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 300
    iget-object v0, v1, Ll/֡᩻᩻;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤۢᩴ;->֫(Ll/ۛۢᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 102
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 35
    invoke-static {p0, p1}, Ll/ۤۢᩴ;->֫(Ll/ۛۢᩴ;Ljava/util/function/IntConsumer;)Ll/۫ۢᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ܽ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤۢᩴ;->֫(Ll/ۛۢᩴ;Ljava/lang/Integer;)V

    return-void
.end method
