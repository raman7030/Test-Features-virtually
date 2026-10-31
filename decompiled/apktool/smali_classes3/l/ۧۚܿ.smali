.class public final synthetic Ll/ۧۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۧ֨ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ֨ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۚܿ;->᩸:Ll/ۧ֨ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 277
    iget-object p1, p0, Ll/ۧۚܿ;->᩸:Ll/ۧ֨ܿ;

    invoke-static {p1}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object p2

    invoke-static {p1}, Ll/ۧ֨ܿ;->ۧ(Ll/ۧ֨ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {p1}, Ll/ۧ֨ܿ;->ܳ(Ll/ۧ֨ܿ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ll/ۗܺ᩷;->֫(Ll/ܶ᩵ܿ;Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    .line 281
    :cond_0
    new-instance p2, Ll/ۢۚܿ;

    invoke-direct {p2, p1}, Ll/ۢۚܿ;-><init>(Ll/ۧ֨ܿ;)V

    .line 455
    invoke-virtual {p2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
