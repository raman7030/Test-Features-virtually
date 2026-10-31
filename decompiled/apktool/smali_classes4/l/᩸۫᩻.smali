.class public final synthetic Ll/᩸۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۡۤۡ;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۤۡ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۫᩻;->᩸:Ll/ۡۤۡ;

    iput-object p2, p0, Ll/᩸۫᩻;->᩹:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 144
    iget-object p1, p0, Ll/᩸۫᩻;->᩸:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 145
    new-instance p1, Ll/ۗ۫᩻;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Ll/᩸۫᩻;->᩹:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Runnable;)V

    .line 146
    invoke-static {v0}, Ll/ۧ᩹ۡ;->ۧ(Landroid/content/Context;)V

    .line 250
    invoke-static {}, Ll/ܿۤ᩻;->ܿ()V

    .line 251
    new-instance p1, Ll/ۘ۫᩻;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll/ۘ۫᩻;-><init>(I)V

    const-wide/16 v0, 0x3e8

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 252
    new-instance p1, Ll/ۘ۫᩻;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll/ۘ۫᩻;-><init>(I)V

    const-wide/16 v0, 0xbb8

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method
