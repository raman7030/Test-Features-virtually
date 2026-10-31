.class public final synthetic Ll/۬ۛܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ۗۘ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/ۗۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۛܽ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/۬ۛܽ;->᩹:Ll/ۗۘ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 418
    new-instance p1, Ll/ܿۨܽ;

    iget-object v0, p0, Ll/۬ۛܽ;->᩸:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/۬ۛܽ;->᩹:Ll/ۗۘ;

    invoke-direct {p1, v0, v1}, Ll/ܿۨܽ;-><init>(Ll/ۗܺ᩷;Ll/ۗۘ;)V

    const v0, 0x7f1202dd

    .line 428
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۡ(I)V

    const v0, 0x7f120221

    .line 429
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۜ(I)V

    .line 430
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 431
    invoke-virtual {p1}, Ll/۬ۗܿ;->᩵()V

    const/4 v0, 0x6

    .line 432
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 v0, 0x1

    .line 205
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
