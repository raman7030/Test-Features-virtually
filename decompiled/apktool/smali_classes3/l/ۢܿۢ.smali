.class public final synthetic Ll/ۢܿۢ;
.super Ljava/lang/Object;
.source "SBMC"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۨܽۢ;

.field public final synthetic ᩹:Ll/᩷ܿۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܽۢ;Ll/᩷ܿۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܿۢ;->᩸:Ll/ۨܽۢ;

    iput-object p2, p0, Ll/ۢܿۢ;->᩹:Ll/᩷ܿۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const/4 p1, 0x1

    .line 735
    iget-object p2, p0, Ll/ۢܿۢ;->᩸:Ll/ۨܽۢ;

    iput-boolean p1, p2, Ll/ۨܽۢ;->ܽ:Z

    .line 736
    iget-object p1, p0, Ll/ۢܿۢ;->᩹:Ll/᩷ܿۢ;

    invoke-virtual {p1}, Ll/᩷ܿۢ;->run()V

    return-void
.end method
